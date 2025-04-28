package gg.kappatracker.repository;

import gg.kappatracker.model.Trader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraderRepository extends JpaRepository<Trader, Long> {

}
