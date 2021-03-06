package de.neuefische.herokudemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greeting")
public class GrettingController {

    @GetMapping("/{name}")
    public String greet(@PathVariable String name) {
        return "Bom dia ! Que saudade de você, " +  name;
    }

}

