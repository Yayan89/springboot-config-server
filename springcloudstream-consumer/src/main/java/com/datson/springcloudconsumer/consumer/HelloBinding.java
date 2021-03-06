package com.datson.springcloudconsumer.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface HelloBinding {

    String GREETING = "GREETING";

    @Input("GREETING")
    SubscribableChannel greeting();
}
