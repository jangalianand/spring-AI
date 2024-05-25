package com.ai.spring.AI.service.impl;

import com.ai.spring.AI.repsonse.LlamaResponse;
import com.ai.spring.AI.service.LlamaAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LlamaAiServiceImpl implements LlamaAiService {

    @Autowired
    private  OllamaChatClient chatClient;


    @Override
    public LlamaResponse generateMessage(String promptMessage) {
        final String llamaMessage = chatClient.generate(promptMessage);
        return new LlamaResponse().setMessage(llamaMessage);
    }

    @Override
    public LlamaResponse generateJoke(String topic) {
        final String llamaMessage = chatClient.generate(String.format("Tell me a joke about %s", topic));
        return new LlamaResponse().setMessage(llamaMessage);
    }
}