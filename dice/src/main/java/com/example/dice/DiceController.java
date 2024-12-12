package com.example.dice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiceController {
    @Autowired
    private Dice dice;
    @Autowired
    private DiceRollLogService diceRollLogService;

    @GetMapping("/rollDice")
    public List<Integer>  singleDiceRoll() {
        return diceRollLogService.rollAndSave(1);
        //return new DiceRollLog(1,List.of(dice.lancerDe()));
    }
    @GetMapping("/rollDices/{count}")
    public List<Integer> multipleRolDices(@PathVariable int count){
        return diceRollLogService.rollAndSave(count);
    }

}
