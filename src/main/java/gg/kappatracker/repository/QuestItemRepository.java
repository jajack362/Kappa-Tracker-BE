package gg.kappatracker.repository;

import gg.kappatracker.model.QuestItem;
import gg.kappatracker.model.QuestItemGroupedDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestItemRepository extends JpaRepository<QuestItem, Long> {
    @Query("SELECT new gg.kappatracker.model.QuestItemGroupedDTO(i.name, SUM(qi.quantity)) FROM QuestItem qi, Item i WHERE qi.item = i GROUP BY i.id")
    List<QuestItemGroupedDTO> countTotalPerItem();

    @Query("SELECT qi FROM QuestItem qi, Quest q, Trader t WHERE qi.quest = q AND q.trader = t AND t.id = :traderId")
    List<QuestItem> findAllByTraderId(@Param("traderId") Long traderId);
}
