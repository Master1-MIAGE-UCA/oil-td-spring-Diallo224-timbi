package com.example.dice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class DiceRollLogService {
   @Autowired
    private DiceRollLogRepository repository;

    @Autowired
    private Dice dice;

    public List<Integer> rollAndSave(int diceCount) {
        List<Integer> results = IntStream.range(0, diceCount)
                .mapToObj(i -> dice.lancerDe())
                .collect(Collectors.toList());

        DiceRollLog log = new DiceRollLog(diceCount, results);
        repository.save(log);
        return results;
    }
    public List<DiceRollLog> getAllLogs() {
        return repository.findAll();
    }
}
