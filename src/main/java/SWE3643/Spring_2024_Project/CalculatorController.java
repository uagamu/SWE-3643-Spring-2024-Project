package SWE3643.Spring_2024_Project;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    private final CalculatorEngine calculatorEngine;

    @Autowired
    public CalculatorController(CalculatorEngine calculatorEngine) {
        this.calculatorEngine = calculatorEngine;
    }

    @GetMapping("/")
    public String showCalculator(Model model) {
        model.addAttribute("result", "");
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam float A,
            @RequestParam float B,
            @RequestParam String operation,
            Model model) {

        String result = calculatorEngine.performOperation(A, B, operation);
        model.addAttribute("result", result);
        model.addAttribute("A", A);
        model.addAttribute("B", B);
        return "calculator";
    }

    @PostMapping("/clear")
    public String clear(Model model) {
        model.addAttribute("result", "");
        model.addAttribute("A", "");
        model.addAttribute("B", "");
        return "calculator";
    }
}
