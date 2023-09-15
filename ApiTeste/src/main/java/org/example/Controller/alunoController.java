package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/aluno")
public class alunoController {
    @GetMapping("teste")
    public String teste (){
        return "HELLO WORD";
    }
}
