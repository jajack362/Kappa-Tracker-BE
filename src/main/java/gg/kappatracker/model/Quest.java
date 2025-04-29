package gg.kappatracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Quest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long levelRequired;
    private String wikiLink;

    @ManyToOne
    @JoinColumn(name = "trader_id")
    private Trader trader;

    private Long displayOrder;
}
