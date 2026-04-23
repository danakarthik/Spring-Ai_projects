package com.spring.ai.firstproject.Config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.ollama.api.OllamaChatOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AIConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder){
        return builder
                .defaultAdvisors(new SimpleLoggerAdvisor())
                .defaultSystem("you are an  helpful coding assistant. you are expert in coding")
                .defaultOptions(OllamaChatOptions.builder()
                        .model("codellama")
                        .temperature(0.7)

                        .build()
                )
                .build();

    }
}
