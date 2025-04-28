package gg.kappatracker.controller;

import gg.kappatracker.model.Quest;
import gg.kappatracker.model.QuestItem;
import gg.kappatracker.model.Trader;
import gg.kappatracker.service.QuestService;
import gg.kappatracker.service.TraderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TraderController {

    @Autowired
    private TraderService traderService;

    @PostMapping("/traders")
    public Trader addTrader(@RequestBody Trader trader) {
        return traderService.addTrader(trader);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/traders")
    public List<Trader> getAllTraders() {
        return traderService.getAllTraders();
    }
}
