// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.es_serverless20220822.models.*;
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

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateDataStreamResponse> createDataStream(CreateDataStreamRequest request);

    CompletableFuture<DeleteAccessTokenResponse> deleteAccessToken(DeleteAccessTokenRequest request);

    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    CompletableFuture<DeleteDataStreamResponse> deleteDataStream(DeleteDataStreamRequest request);

    CompletableFuture<DescibeRegionsResponse> descibeRegions(DescibeRegionsRequest request);

    CompletableFuture<DisableAccessTokenResponse> disableAccessToken(DisableAccessTokenRequest request);

    CompletableFuture<EnableAccessTokenResponse> enableAccessToken(EnableAccessTokenRequest request);

    CompletableFuture<GenerateAcccessTokenResponse> generateAcccessToken(GenerateAcccessTokenRequest request);

    CompletableFuture<GetAppResponse> getApp(GetAppRequest request);

    CompletableFuture<GetDataStreamResponse> getDataStream(GetDataStreamRequest request);

    CompletableFuture<GetRegionInfoResponse> getRegionInfo(GetRegionInfoRequest request);

    CompletableFuture<ListAccessTokensResponse> listAccessTokens(ListAccessTokensRequest request);

    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    CompletableFuture<ListDataStreamsResponse> listDataStreams(ListDataStreamsRequest request);

    CompletableFuture<UpdateAppResponse> updateApp(UpdateAppRequest request);

    CompletableFuture<UpdateDataStreamResponse> updateDataStream(UpdateDataStreamRequest request);

}
