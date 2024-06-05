package com.kadiraksoy.factory_strategy_design_pattern.controller;

import com.kadiraksoy.factory_strategy_design_pattern.dto.NotificationDto;
import com.kadiraksoy.factory_strategy_design_pattern.factory.NotificationFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationFactory notificationFactory;

    @PostMapping("/sendNotification")
    public String sendNotification(@RequestBody NotificationDto notificationDto) {
        return notificationFactory.sendNotification(notificationDto);
    }
}