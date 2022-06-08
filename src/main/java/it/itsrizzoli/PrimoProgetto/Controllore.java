package it.itsrizzoli.PrimoProgetto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllore {
        @GetMapping("/somma")
        public String Somma(@RequestParam ("val") int val1, @RequestParam ("val2") int val2, Model model) {
            int somma=val1+val2;
            model.addAttribute("result", somma);
            return "result";
        }

}
