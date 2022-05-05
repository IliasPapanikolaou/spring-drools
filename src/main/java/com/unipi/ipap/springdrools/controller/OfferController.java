package com.unipi.ipap.springdrools.controller;

import com.unipi.ipap.springdrools.model.Order;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OfferController {

    private final KieSession kieSession;

    @PostMapping("/order")
    public ResponseEntity<Order> orderNow(@RequestBody Order order) {
        kieSession.insert(order);
        kieSession.fireAllRules();
        return ResponseEntity.ok(order);
    }
}
