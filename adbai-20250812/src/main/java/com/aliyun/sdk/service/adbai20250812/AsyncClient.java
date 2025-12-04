// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.adbai20250812.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of CreateEmbodiedAIPlatform  CreateEmbodiedAIPlatformRequest
     * @return CreateEmbodiedAIPlatformResponse
     */
    CompletableFuture<CreateEmbodiedAIPlatformResponse> createEmbodiedAIPlatform(CreateEmbodiedAIPlatformRequest request);

    /**
     * @param request the request parameters of DescribeEmbodiedAIPlatforms  DescribeEmbodiedAIPlatformsRequest
     * @return DescribeEmbodiedAIPlatformsResponse
     */
    CompletableFuture<DescribeEmbodiedAIPlatformsResponse> describeEmbodiedAIPlatforms(DescribeEmbodiedAIPlatformsRequest request);

}
