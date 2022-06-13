package it.itsrizzoli.PrimoProgetto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllore {
        @GetMapping("/somma")
        public String Somma(@RequestParam ("val") int val1,@RequestParam ("val2") int val2, Model model) {
            int somma=val1+val2;
            model.addAttribute("operazione", "somma");
            model.addAttribute("result", somma);
            return "result";
        }
    @GetMapping("/prodotto")
    public String Prodotto(@RequestParam ("val") int val1,@RequestParam ("val2") int val2, Model model) {
        int pr=val1*val2;
        model.addAttribute("operazione", "prodotto");
        model.addAttribute("result", pr);
        return "result";
    }
    @GetMapping("/divisione")
    public String Divisione(@RequestParam ("val") int val1,@RequestParam ("val2") int val2, Model model) {
        double div=(double)val1/ (double)val2;
        model.addAttribute("operazione", "divisione");
        model.addAttribute("result", div);
        return "result";
    }
    @GetMapping("/differenza")
    public String differenza(@RequestParam ("val") int val1,@RequestParam ("val2") int val2, Model model) {
        int div=val1-val2;
        model.addAttribute("operazione", "differenza");
        model.addAttribute("result", div);
        return "result";
    }
    @GetMapping("/potenza")
    public String Potenza(@RequestParam ("val") int val1,@RequestParam ("val2") int val2, Model model) {
        int a=val1;
        int el=1;
        for (int i = 0; i < val2; i++) {
            el=el*a;
        }
        model.addAttribute("operazione", "potenza");
        model.addAttribute("result", el);
        return "result";
    }



}
