package application;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frutas")
public class TesteControler {

    private  String[] f = {"Maçã", "Banana", "Morango"};

    @GetMapping
    public Iterable<String> get () {
       return Arrays.asList(f);
    }

    @GetMapping("/{id}")
    public String get(@PathVariable int id) {
        return f[id];
    }
    
}
