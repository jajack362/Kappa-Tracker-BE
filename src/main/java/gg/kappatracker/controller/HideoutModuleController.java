package gg.kappatracker.controller;

import gg.kappatracker.model.HideoutModule;
import gg.kappatracker.model.Item;
import gg.kappatracker.service.HideoutModuleService;
import gg.kappatracker.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HideoutModuleController {

    @Autowired
    private HideoutModuleService hideoutModuleService;

    @PostMapping("/hideoutmodules")
    public HideoutModule addHideoutModule(@RequestBody HideoutModule hideoutModule) {
        return hideoutModuleService.addHideoutModule(hideoutModule);
    }
}
