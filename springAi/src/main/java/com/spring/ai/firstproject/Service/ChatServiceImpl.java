package com.spring.ai.firstproject.Service;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SafeGuardAdvisor;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChatServiceImpl implements ChatService {


    @Value("classpath:/Prompts/system-prompts.st")
    private Resource systemMesssage;

    @Value("classpath:/Prompts/user-prompts.st")
    private Resource userMessage;

    private ChatClient chatClient;

    public ChatServiceImpl(ChatClient chatClient) {
        this.chatClient = chatClient;
    }
    @Override
     public String chat(String query) {
        return this.chatClient
                .prompt()
                .advisors(new SimpleLoggerAdvisor(),new SafeGuardAdvisor(List.of("games","numbers")))
                .system(system->system.text(this.systemMesssage))
                .user(user->user.text(this.userMessage)
                        .param("concept",query))
                .call()
                .content();
    }
}
