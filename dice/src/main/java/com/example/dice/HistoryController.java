package com.example.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HistoryController {
    @Autowired
    DiceRollLogService diceRollLogService;
    @GetMapping("/diceLogs")
    public List<DiceRollLog> getHistory() {
       return diceRollLogService.getAllLogs();
    }
}
