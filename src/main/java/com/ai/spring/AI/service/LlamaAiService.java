package com.ai.spring.AI.service;

import com.ai.spring.AI.repsonse.LlamaResponse;

public interface LlamaAiService {

    LlamaResponse generateMessage(String prompt);
    LlamaResponse generateJoke(String topic);
}