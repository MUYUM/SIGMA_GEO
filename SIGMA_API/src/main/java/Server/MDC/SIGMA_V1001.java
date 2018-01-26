package Server.MDC;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/SIGMA_1.0.0.1")
public class SIGMA_V1001
{
    @RequestMapping("/GetVersion")
    public String GetVersion() { return "SIGMA_1.0.0.1"; }
}
