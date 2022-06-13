package it.itsrizzoli.PrimoProgetto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllore {
        @GetMapping("/operazione")
        public String Operazione(@RequestParam ("val") int val1,@RequestParam ("val2") int val2,@RequestParam("op") String op, Model model) {
            double risultato=0;
            switch (op){
                case "somma":
                    risultato=val1+val2;
                    model.addAttribute("operazione", "somma");
                    break;

                case "differenza":
                    risultato=val1-val2;
                    break;

                case "prodotto":
                    risultato=val1*val2;
                    break;

                case "divisione":
                    risultato=(double)val1/ (double)val2;
                    break;

                case "potenza":
                    int a=val1;
                    int el=1;
                    for (int i = 0; i < val2; i++) {
                        el=el*a;
                    }
                    risultato=el;
                    break;

                default:
                    break;
            }

            model.addAttribute("result", risultato);
            return "result";
        }


}
