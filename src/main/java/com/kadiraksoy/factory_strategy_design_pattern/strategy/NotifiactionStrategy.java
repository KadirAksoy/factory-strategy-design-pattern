package com.kadiraksoy.factory_strategy_design_pattern.strategy;

import com.kadiraksoy.factory_strategy_design_pattern.dto.NotificationDto;

public interface NotifiactionStrategy {
    String sendNotification(NotificationDto notificationDto);
}