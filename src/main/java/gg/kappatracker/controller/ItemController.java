package gg.kappatracker.controller;

import gg.kappatracker.model.Item;
import gg.kappatracker.model.QuestItem;
import gg.kappatracker.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/items")
    public Item addUser(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
}
