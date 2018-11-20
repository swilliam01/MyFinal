package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

@Controller
public class MainController {



//        @Autowired
//        CloudinaryConfig cloudinaryConfig;
        @Autowired
        UserRepository userRepository;

        @Autowired
       ReposRepository reposRepository;


        @RequestMapping("/")
        public String Home(Model model) {
            model.addAttribute("users",userRepository.findAll());
//
            return "homepage";
        }

    @RequestMapping("/repos")
    public String Repos(Model model) {
        model.addAttribute("repos",reposRepository.findAll());
//
        return "homepage";
    }
        @GetMapping("/repos")
        public String reposForm(Model model) {
            model.addAttribute("repos", new Repos());
            return "reposform";
        }

        @PostMapping("/repos")
        public String processForm(@ModelAttribute("repos") Repos repos){


            reposRepository.save(repos);
            return "redirect:/";
        }

//        @RequestMapping("/detail/{id}")
//        public String showMessage(@PathVariable("id") long id, Model model){
//            model.addAttribute("message",messageRepository.findById(id).get());
//            if(userService.getUser() != null) {
//                model.addAttribute("user_id", userService.getUser().getId());
//            }
//            return "show";
//        }
//
//        @RequestMapping("/update/{id}")
//        public String updateMessage(@PathVariable("id") long id, Model model){
//            model.addAttribute("message",messageRepository.findById(id).get());
////        if(userService.getUser() != null) {
////            model.addAttribute("userUpdate", userService.getUser().getId());
////        }
//            return  "messageform";
//        }
//        @RequestMapping("/delete/{id}")
//        public String delMessage(@PathVariable("id") long id, Model model){
//            model.addAttribute("message",messageRepository.findById(id));
////        if(userService.getUser() != null) {
////            model.addAttribute("userUpdate", userService.getUser().getId());
////        }
//            messageRepository.deleteById(id);
//            return "redirect:/";
//        }
//
//        @RequestMapping("/followers")
//        public String followers(){
//            return "followers";
//        }
//        @RequestMapping("/following")
//        public String following(){
//            return "following";
//
//        }
//        @RequestMapping("/myprofile/{id}")
//        public String myprofile(@PathVariable("id") long id, Model model){
//            model.addAttribute("user",userRepository.findById(id).get());
//
//            return "myprofile";
////        }
//
//        //Gravatar
//        public static String hex(byte[] array) {
//            StringBuffer sb = new StringBuffer();
//            for (int i = 0; i < array.length; ++i) {
//                sb.append(Integer.toHexString((array[i]
//                        & 0xFF) | 0x100).substring(1,3));
//            }
//            return sb.toString();
//        }
//        public static String md5Hex (String message) {
//            try {
//                MessageDigest md = MessageDigest.getInstance("MD5");
//                return hex (md.digest(message.getBytes("CP1252")));
//            } catch (NoSuchAlgorithmException e) {
//            } catch (UnsupportedEncodingException e) {
//            }
//            return null;
//        }
    }


