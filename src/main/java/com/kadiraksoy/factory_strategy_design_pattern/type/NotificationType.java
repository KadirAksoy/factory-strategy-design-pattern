package com.kadiraksoy.factory_strategy_design_pattern.type;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum NotificationType {
    SMS("sms"),
    EMAIL("email");

    private final String type;
}