package gg.kappatracker.service;

import gg.kappatracker.model.Quest;
import gg.kappatracker.model.QuestItem;
import gg.kappatracker.model.Trader;
import gg.kappatracker.repository.QuestRepository;
import gg.kappatracker.repository.TraderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraderService {

    @Autowired
    private TraderRepository traderRepository;

    public Trader addTrader(Trader trader) {
        return traderRepository.save(trader);
    }

    public List<Trader> getAllTraders() {
        return traderRepository.findAll();
    }
}
