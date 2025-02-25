// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115;

import com.aliyun.sdk.gateway.pop.BaseClientBuilder;

public final class DefaultAsyncClientBuilder extends BaseClientBuilder<DefaultAsyncClientBuilder, AsyncClient> {

    @Override
    protected String serviceName() {
        return "hbase20170115";
    }

    @Override
    protected final AsyncClient buildClient() {
        return new DefaultAsyncClient(super.applyClientConfiguration());
    }

}
