package Server.MDC;import org.springframework.web.bind.annotation.CrossOrigin;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;@CrossOrigin@RestController@RequestMapping("/BasicTest")public class BasicTest{    @RequestMapping("/BasicTestExample")    public String BasicTestExample()    {        return "OK";    }}