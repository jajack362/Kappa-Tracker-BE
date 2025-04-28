package gg.kappatracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imageLink;
    private String wikiLink;

    @ManyToOne
    @JoinColumn(name = "hideout_module_id")
    private HideoutModule hideoutModule;
}
