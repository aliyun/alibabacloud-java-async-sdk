// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nbf20211110_21312586;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.nbf20211110_21312586.models.*;
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

    CompletableFuture<ApiTestResponse> apiTest(ApiTestRequest request);

    CompletableFuture<BuildSdkResponse> buildSdk(BuildSdkRequest request);

    CompletableFuture<CreateAndReleaseApiResponse> createAndReleaseApi(CreateAndReleaseApiRequest request);

    CompletableFuture<CreateSdkVersionResponse> createSdkVersion(CreateSdkVersionRequest request);

    CompletableFuture<DeleteApiResponse> deleteApi(DeleteApiRequest request);

    CompletableFuture<GetResultResponse> getResult(GetResultRequest request);

    CompletableFuture<OpenApiGenericProxyResponse> openApiGenericProxy(OpenApiGenericProxyRequest request);

    CompletableFuture<PreCheckResponse> preCheck(PreCheckRequest request);

    CompletableFuture<PublishSdkResponse> publishSdk(PublishSdkRequest request);

    CompletableFuture<SerializeApiResponse> serializeApi(SerializeApiRequest request);

    CompletableFuture<UpdateAndReleaseApiResponse> updateAndReleaseApi(UpdateAndReleaseApiRequest request);

}
