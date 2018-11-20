package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FinalProjectApplication {
    private static final Logger log = LoggerFactory.getLogger(FinalProjectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FinalProjectApplication.class, args);
    }

//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//
//
//            User user = restTemplate.getForObject("https://api.github.com/users/MelakMinlargilih", User.class);
//            log.info(user.toString());
//            log.info("----------------------------------------------------");
//
////            ResponseEntity<List<User>> memberResponse =
////                    restTemplate.exchange("https://api.github.com/orgs/github/members",
////                            HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {
////                            });
////            List<User> users = memberResponse.getBody();
////            log.info(users.toString());
//
//            ResponseEntity<List<Repos>> memberResponse =
//                    restTemplate.exchange("https://api.github.com/users/MelakMinlargilih/repos",
//                            HttpMethod.GET, null, new ParameterizedTypeReference<List<Repos>>() {
//                            });
//            List<Repos> repos = memberResponse.getBody();
//            log.info(repos.toString());
//            log.info("----------------------------------------------------");
////            Repos repos = restTemplate.getForObject("https://api.github.com/users/MelakMinlargilih/repos", Repos.class);
////            log.info(repos.toString());
//
//
////            ResponseEntity<List<User>> memberResponse1 =
////                    restTemplate.exchange("https://api.github.com/orgs/JBCSep2018",
////                            HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {
////                            });
////            List<User> users = memberResponse1.getBody();
////            log.info(users.toString());
////            log.info("----------------------------------------------------");
//        };
//            // MelakMinlargilih
////            Object[] MelakArray = Arrays.stream(users).filter(x -> x.getLogin().equalsIgnoreCase("Melak")).toArray();
////            log.info("Name :" + ((User) MelakArray[0]).getLogin());
////
////            log.info(" repositories :" + .valueOf(((Coin) vergeArray[0]).getPrice_usd()));
////
////            log.info("-------------------------------------------------");
//
//        //list of contributors
//        //GET /repos/:owner/:repo/contributors
//        //list of languages
//        //GET /repos/:owner/:repo/languages
//
//        //pulls
//        //GET /repos/:owner/:repo/pulls
//
//    }
}