package gg.kappatracker.controller;

import gg.kappatracker.model.Item;
import gg.kappatracker.model.Quest;
import gg.kappatracker.service.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestController {

    @Autowired
    private QuestService questService;

    @PostMapping("/quests")
    public Quest addQuest(@RequestBody Quest quest) {
        return questService.addQuest(quest);
    }
}
