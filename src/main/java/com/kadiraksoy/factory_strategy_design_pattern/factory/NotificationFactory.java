package com.kadiraksoy.factory_strategy_design_pattern.factory;


import com.kadiraksoy.factory_strategy_design_pattern.dto.NotificationDto;

public interface NotificationFactory {

    String sendNotification(NotificationDto notificationDto);
}