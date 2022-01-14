// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101;

import com.aliyun.ft20210101.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<CreateRPCPathTestResponse> createRPCPathTest(CreateRPCPathTestRequest request);

    CompletableFuture<CreateRamTestResponse> createRamTest(CreateRamTestRequest request);

    CompletableFuture<DataRateLimitTestResponse> dataRateLimitTest(DataRateLimitTestRequest request);

    CompletableFuture<NormalRpcHsfApiResponse> normalRpcHsfApi(NormalRpcHsfApiRequest request);

    CompletableFuture<NormalRpcHttpApiResponse> normalRpcHttpApi(NormalRpcHttpApiRequest request);

    CompletableFuture<RpcDataUploadResponse> rpcDataUpload(RpcDataUploadRequest request);

    CompletableFuture<RpcDataUploadAndDownloadResponse> rpcDataUploadAndDownload(RpcDataUploadAndDownloadRequest request);

    CompletableFuture<RpcDataUploadTestResponse> rpcDataUploadTest(RpcDataUploadTestRequest request);

    CompletableFuture<RpcUploadDemoResponse> rpcUploadDemo(RpcUploadDemoRequest request);

    CompletableFuture<ServiceRouteTestResponse> serviceRouteTest(ServiceRouteTestRequest request);

    CompletableFuture<UserGcFetchResponse> userGcFetch(UserGcFetchRequest request);

    CompletableFuture<UserGcGrayResponse> userGcGray(UserGcGrayRequest request);

    CompletableFuture<UserGcSerivceGrayResponse> userGcSerivceGray(UserGcSerivceGrayRequest request);

    CompletableFuture<VpcInstanceAccessTestYResponse> vpcInstanceAccessTestY(VpcInstanceAccessTestYRequest request);

}
