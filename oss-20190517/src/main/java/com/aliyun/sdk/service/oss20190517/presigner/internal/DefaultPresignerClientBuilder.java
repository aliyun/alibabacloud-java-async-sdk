package com.aliyun.sdk.service.oss20190517.presigner.internal;

import com.aliyun.sdk.gateway.oss.BasePresignerClientBuilder;
import com.aliyun.sdk.service.oss20190517.presigner.PresignerClient;

public class DefaultPresignerClientBuilder extends BasePresignerClientBuilder<DefaultPresignerClientBuilder, PresignerClient> {
    @Override
    protected String serviceName() {
        return "oss20190517";
    }

    @Override
    protected final PresignerClient buildClient() {
        return new DefaultPresignerClient(super.applyClientConfiguration());
    }
}
