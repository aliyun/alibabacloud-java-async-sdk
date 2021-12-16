// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309;

import com.aliyun.pop.BaseClientBuilder;

public final class DefaultAsyncClientBuilder extends BaseClientBuilder<DefaultAsyncClientBuilder, AsyncClient> {

    @Override
    protected String serviceName() {
        return "eipanycast";
    }

    @Override
    protected final AsyncClient buildClient() {
        return new DefaultAsyncClient(super.applyClientConfiguration());
    }

}
