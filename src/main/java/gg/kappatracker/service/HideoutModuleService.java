package gg.kappatracker.service;

import gg.kappatracker.model.HideoutModule;
import gg.kappatracker.model.Item;
import gg.kappatracker.repository.HideoutModuleRepository;
import gg.kappatracker.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HideoutModuleService {

    @Autowired
    private HideoutModuleRepository hideoutModuleRepository;

    public HideoutModule addHideoutModule(HideoutModule hideoutModule) {
        return hideoutModuleRepository.save(hideoutModule);
    }
}
