// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchagent20260515;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.searchagent20260515.models.*;
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
     * @param request the request parameters of ExecuteAcpCommand  ExecuteAcpCommandRequest
     * @return ExecuteAcpCommandResponse
     */
    CompletableFuture<ExecuteAcpCommandResponse> executeAcpCommand(ExecuteAcpCommandRequest request);

    /**
     * @param request the request parameters of GenerateAcpCompletion  GenerateAcpCompletionRequest
     * @return GenerateAcpCompletionResponse
     */
    CompletableFuture<GenerateAcpCompletionResponse> generateAcpCompletion(GenerateAcpCompletionRequest request);

<ReturnT> CompletableFuture<ReturnT> generateAcpCompletionWithAsyncResponseHandler(GenerateAcpCompletionRequest request, AsyncResponseHandler<GenerateAcpCompletionResponse, ReturnT> responseHandler);

    ResponseIterable<String> generateAcpCompletionWithResponseIterable(GenerateAcpCompletionRequest request);

}
