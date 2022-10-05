package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Apigateway in servislere yönlendirme yapması için RouteLocatorBuilder ayarları yapılır.
@Configuration
public class ApiGatewayConfiguration {
    @Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/get")
						.filters(f -> f
	
						.addRequestHeader("MyHeader", "MyURI") //tırnak içine istediğini yaz ister parametresine göre eşleştir ister servis methoduna göre 
								.addRequestParameter("Param", "MyValue"))
						.uri("http://httpbin.org:80")) //get isteği ile kullanıcıyı belirli bir uri ye göndermek için bu microservisin urisi olabilir
				// .route(p -> p.path("/currency-exchange/**")
				// 		.uri("lb://currency-exchange")) 
				// .route(p -> p.path("/currency-conversion/**")//servisi çağıracağımız methodu yaz
				// 		.uri("lb://currency-conversion")) //eureka serverdaki servisin isimi buraya yazıyoruz.
				// .route(p -> p.path("/currency-conversion-feign/**")
				// 		.uri("lb://currency-conversion"))
				// .route(p -> p.path("/currency-conversion-new/**")
				// 		.filters(f -> f.rewritePath( 
				// 				"/currency-conversion-new/(?<segment>.*)",  
				// 				"/currency-conversion-feign/${segment}")) 
				// 		.uri("lb://currency-conversion"))

						.route(p -> p.path("/getBooks/**")
						.uri("lb://bookdetail")) 
						.route(p -> p.path("/api/books/getBooks/**")
						.uri("lb://book-service")) 


				.build();
	}

}




// @Autowired
// RouteCreator creator;

// @Bean
// public RouteLocator loadBalancedRoutes(RouteLocatorBuilder builder)
// {
// 	Function<PredicateSpec, Buildable<Route>> user_path;  //bu ilk servise gidecek
// 	Function<PredicateSpec, Buildable<Route>> user_fail_path; // bu failover a gidecek
// 	user_path = creator.createRouterFunctionWithFallbackFilter("/user/**", "lb://ab-userservice", "user-cb", "forward:/user-failover", "user-failover");
// 	user_fail_path = creator.createRouterFunction("/user-failover", "lb://ab-userservice-failover");
// 	Builder routes = builder.routes();
// 	routes.route("user route", user_path);
// 	routes.route("user failover route", user_fail_path);
// 	return routes.build();
// }