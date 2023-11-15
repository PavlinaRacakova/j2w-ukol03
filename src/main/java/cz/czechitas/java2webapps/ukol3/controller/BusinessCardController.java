package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entities.BusinessCard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class BusinessCardController {

    private final List<BusinessCard> businessCards = List.of(
            new BusinessCard("Jitka Nová", "Oracle", "Na příkopě 17", "Praha 1 110 00", "jitkaN@gmail.com", "196 574 222", "jitka.cz"),
            new BusinessCard("Jiří Srna", "Microsoft", "Velká Hradební 3118/48", "Ústí nad Labem 40001", null, "556337999", null),
            new BusinessCard("Michal Michalů", "JetBrains", "Masarykovo nám. 167/1", "Jeseník 79001", null, null, null),
            new BusinessCard("Alena Kovářová", "Czechitas", "Veveří 31", "Brno 602 00", "alena@gmail.com", null, "alena.cz")
    );

    private final String missingDataMessage = "n/a";

    @GetMapping("/")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("businessCards", businessCards);
        modelAndView.addObject("missingDataMessage", missingDataMessage);
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("businessCard", businessCards.get(id));
        modelAndView.addObject("missingDataMessage", missingDataMessage);
        return modelAndView;
    }
}
