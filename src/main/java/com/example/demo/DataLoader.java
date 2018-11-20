package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import sun.plugin2.message.Message;

import javax.management.relation.Role;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.lang.reflect.Executable;
import java.util.Arrays;

    @Component
    public class DataLoader implements CommandLineRunner {
        @Autowired
        UserRepository userRepository;

        @Autowired
        ReposRepository reposRepository;

        @Override
        public void run(String... strings) throws Exception{


           // boolean rundataloader= false;
//            Repos userRepos= reposRepository.findByOwner("MelakMinlargilih");
//            Repos userRepos1= reposRepository.findByName("Week9ChallengebetterBullhornMessagingApp");


           // if (rundataloader){

                User user = new User("MelakMinlargilih","2","2");
                //user.setRepos_url(Arrays.asList(userRepos1));
                userRepository.save(user);

                Repos repos = new Repos("Week9ChallengebetterBullhornMessagingApp","MelakMinlargilih/Week9ChallengebetterBullhornMessagingApp","JAVA","1","0"/*,"MelakMinlargilih"*/);
                //Repos.setOwner(user);
                reposRepository.save(repos);

            //}
        }
    }


