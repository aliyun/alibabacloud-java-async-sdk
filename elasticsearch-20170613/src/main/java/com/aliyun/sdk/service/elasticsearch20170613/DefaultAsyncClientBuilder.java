// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613;

import com.aliyun.sdk.gateway.pop.BaseClientBuilder;

public final class DefaultAsyncClientBuilder extends BaseClientBuilder<DefaultAsyncClientBuilder, AsyncClient> {

    @Override
    protected String serviceName() {
        return "elasticsearch20170613";
    }

    @Override
    protected final AsyncClient buildClient() {
        return new DefaultAsyncClient(super.applyClientConfiguration());
    }

}
