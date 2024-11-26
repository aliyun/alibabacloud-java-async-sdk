// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yuqing20220301.models.*;
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
     * @param request the request parameters of CloseProduct  CloseProductRequest
     * @return CloseProductResponse
     */
    CompletableFuture<CloseProductResponse> closeProduct(CloseProductRequest request);

    /**
     * @param request the request parameters of ConsoleApiProxy  ConsoleApiProxyRequest
     * @return ConsoleApiProxyResponse
     */
    CompletableFuture<ConsoleApiProxyResponse> consoleApiProxy(ConsoleApiProxyRequest request);

    /**
     * @deprecated OpenAPI ConsoleProxy is deprecated  * @param request  the request parameters of ConsoleProxy  ConsoleProxyRequest
     * @return ConsoleProxyResponse
     */
    @Deprecated
    CompletableFuture<ConsoleProxyResponse> consoleProxy(ConsoleProxyRequest request);

    /**
     * @param request the request parameters of GetAnalysisTaskResult  GetAnalysisTaskResultRequest
     * @return GetAnalysisTaskResultResponse
     */
    CompletableFuture<GetAnalysisTaskResultResponse> getAnalysisTaskResult(GetAnalysisTaskResultRequest request);

    /**
     * @param request the request parameters of OpenProduct  OpenProductRequest
     * @return OpenProductResponse
     */
    CompletableFuture<OpenProductResponse> openProduct(OpenProductRequest request);

    /**
     * @param request the request parameters of QueryProductInstanceList  QueryProductInstanceListRequest
     * @return QueryProductInstanceListResponse
     */
    CompletableFuture<QueryProductInstanceListResponse> queryProductInstanceList(QueryProductInstanceListRequest request);

    /**
     * @param request the request parameters of QueryYuqingMessage  QueryYuqingMessageRequest
     * @return QueryYuqingMessageResponse
     */
    CompletableFuture<QueryYuqingMessageResponse> queryYuqingMessage(QueryYuqingMessageRequest request);

    /**
     * @param request the request parameters of SubmitAnalysisTask  SubmitAnalysisTaskRequest
     * @return SubmitAnalysisTaskResponse
     */
    CompletableFuture<SubmitAnalysisTaskResponse> submitAnalysisTask(SubmitAnalysisTaskRequest request);

}
