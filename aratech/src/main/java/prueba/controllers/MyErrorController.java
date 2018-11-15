package prueba.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyErrorController implements ErrorController {

    @Override
    @RequestMapping("/error")
    public String getErrorPath() {
        return "Se ha producido un error";
    }
}
