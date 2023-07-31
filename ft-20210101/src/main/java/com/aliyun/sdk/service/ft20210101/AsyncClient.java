// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ft20210101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ft20210101.models.*;
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

    CompletableFuture<DataRateLimitTestResponse> dataRateLimitTest(DataRateLimitTestRequest request);

    CompletableFuture<NormalRpcHsfApiResponse> normalRpcHsfApi(NormalRpcHsfApiRequest request);

    CompletableFuture<NormalRpcHttpApiResponse> normalRpcHttpApi(NormalRpcHttpApiRequest request);

    CompletableFuture<RpcDataUploadResponse> rpcDataUpload(RpcDataUploadRequest request);

    CompletableFuture<RpcDataUploadAndDownloadResponse> rpcDataUploadAndDownload(RpcDataUploadAndDownloadRequest request);

    CompletableFuture<RpcDataUploadTestResponse> rpcDataUploadTest(RpcDataUploadTestRequest request);

}
