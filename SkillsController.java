package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {


    @GetMapping
    @ResponseBody

    public String programLanguages() {
        return "<html>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<body>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";


    }

//    @GetMapping("form")
//    @ResponseBody

//    public String writeName() {
//        return "<html>" +
//                "<form>" +
//                "<label for='name' id='name'>Name</label>" +
//                "<br/> " +
//                "<input name='name' id='name'> " +
//                "</form>" +
//                "</html>";
//    }

        @GetMapping("form")
        @ResponseBody
        //@PostMapping
        public String languages(){
            return "<html>" +
                    "<form action='/action_page.php' method='get'>" +
                    "<label for='name' id='name'>Name</label>" +
                    "<br/> " +
                    "<input name='name' id='name'> " +
                    "<br/>" +
                    "<label for='lang'>First Language</label>" +
                    "<select name='language' id='language'>" +
                    "<option value='javascript' disabled>JavaScript</option>" +
                    "<option value='python'>Python</option>" +
                    "<option value='c++'>C++</option>" +
                    "<option value='java' selected>Java</option>" +
                    "</select>" +
                    "<br/> " +
                    "<label for='secondlang'>Second Language</label>" +
                    "<select name='language' id='language'>" +
                    "<option value='javascript' disabled>JavaScript</option>" +
                    "<option value='python'>Python</option>" +
                    "<option value='c++'>C++</option>" +
                    "<option value='java' selected>Java</option>" +
                    "</select>" +
                    "<br/> " +
                    "<label for='thirdlang'>Third Language</label>" +
                    "<select name='language' id='language'>" +
                    "<option value='javascript' disabled>JavaScript</option>" +
                    "<option value='python'>Python</option>" +
                    "<option value='c++'>C++</option>" +
                    "<option value='java' selected>Java</option>" +
                    "</select>" +
                    "<br/> " +
                    "<input type='submit' value='Submit'/>" +
                    "<form>" +
                    "</html>" ;



        }
}
