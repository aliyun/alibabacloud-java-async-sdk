// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101;

import com.aliyun.sdk.gateway.pop.BaseClientBuilder;

public final class DefaultAsyncClientBuilder extends BaseClientBuilder<DefaultAsyncClientBuilder, AsyncClient> {

    @Override
    protected String serviceName() {
        return "cassandra20190101";
    }

    @Override
    protected final AsyncClient buildClient() {
        return new DefaultAsyncClient(super.applyClientConfiguration());
    }

}
