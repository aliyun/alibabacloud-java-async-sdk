// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.intelligentcreation20240118.models.*;
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

    CompletableFuture<ActualDeductResourceResponse> actualDeductResource(ActualDeductResourceRequest request);

    CompletableFuture<ActualDeductResourcesResponse> actualDeductResources(ActualDeductResourcesRequest request);

    CompletableFuture<DirectDeductResourceResponse> directDeductResource(DirectDeductResourceRequest request);

    CompletableFuture<DirectDeductResourcesResponse> directDeductResources(DirectDeductResourcesRequest request);

    CompletableFuture<ExpectDeductResourceResponse> expectDeductResource(ExpectDeductResourceRequest request);

    CompletableFuture<ExpectDeductResourcesResponse> expectDeductResources(ExpectDeductResourcesRequest request);

    CompletableFuture<GetRemainResourceResponse> getRemainResource(GetRemainResourceRequest request);

}
