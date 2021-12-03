// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406;

import com.aliyun.pop.BaseClientBuilder;

public final class DefaultAsyncClientBuilder extends BaseClientBuilder<DefaultAsyncClientBuilder, AsyncClient> {

    @Override
    protected String serviceName() {
        return "fc_open";
    }

    @Override
    protected final AsyncClient buildClient() {
        return new DefaultAsyncClient(super.applyClientConfiguration());
    }

}
