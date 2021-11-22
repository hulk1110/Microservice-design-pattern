package com.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {
@GetMapping("/userServiceFallBack")
    public String userServiceFallBackMethod(){
        return "USER SERVICE IS TAKING LONGER THAN EXPECTED." + "PLEASE TRY AGAIN";
    }
    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod(){
        return "DEPARTMENT SERVICE IS TAKING LONGER THAN EXPECTED." + "PLEASE TRY AGAIN";
    }
}
