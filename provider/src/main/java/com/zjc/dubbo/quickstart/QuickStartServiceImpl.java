package com.zjc.dubbo.quickstart;

import com.zjc.dubbo.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {

    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message=" + message;
    }
}
