package com.kadiraksoy.factory_strategy_design_pattern.factory.impl;

import com.kadiraksoy.factory_strategy_design_pattern.dto.NotificationDto;
import com.kadiraksoy.factory_strategy_design_pattern.factory.NotificationFactory;
import com.kadiraksoy.factory_strategy_design_pattern.strategy.NotifiactionStrategy;
import com.kadiraksoy.factory_strategy_design_pattern.type.NotificationType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class NotificationFactoryImpl implements NotificationFactory {

    private final Map<String, NotifiactionStrategy> notificationStrategyMap;

    public NotifiactionStrategy getNotificationStrategy(NotificationType notificationType) {
        var notificationStrategy = notificationStrategyMap.get(notificationType.getType());
        if (notificationStrategy == null) {
            throw new IllegalArgumentException("Notification type not found: " + notificationType);
        }
        return notificationStrategy;
    }


    @Override
    public String sendNotification(NotificationDto notificationDto) {
        var notificationStrategy = getNotificationStrategy(notificationDto.getNotificationType());
        return notificationStrategy.sendNotification(notificationDto);
    }
}