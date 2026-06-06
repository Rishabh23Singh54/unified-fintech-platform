package unified.fintech.fraud.detection.platform.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuator")
public class HealthController {
    @GetMapping("/ok")
    public String health() {
        return "OK";
    }
}
