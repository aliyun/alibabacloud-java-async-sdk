// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910;

import com.aliyun.pop.BaseClientBuilder;

public final class DefaultAsyncClientBuilder extends BaseClientBuilder<DefaultAsyncClientBuilder, AsyncClient> {

    @Override
    protected String serviceName() {
        return "waf_openapi";
    }

    @Override
    protected final AsyncClient buildClient() {
        return new DefaultAsyncClient(super.applyClientConfiguration());
    }

}
