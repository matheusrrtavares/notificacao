package com.matheus.notificacao.controller;

import com.matheus.notificacao.business.EmailService;
import com.matheus.notificacao.business.dto.TarefaDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
public class NotificacaoController {

    private final EmailService email;

    @PostMapping
    public ResponseEntity<Void> enviarEmail(@RequestBody TarefaDTO dto) {
         email.enviarEmail(dto);
         return ResponseEntity.ok().build();
    }

}
