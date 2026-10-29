// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.saf20190521;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.saf20190521.models.*;
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
     * @param request the request parameters of ExecuteRequest  ExecuteRequestRequest
     * @return ExecuteRequestResponse
     */
    CompletableFuture<ExecuteRequestResponse> executeRequest(ExecuteRequestRequest request);

    /**
     * @param request the request parameters of ExecuteRequestML  ExecuteRequestMLRequest
     * @return ExecuteRequestMLResponse
     */
    CompletableFuture<ExecuteRequestMLResponse> executeRequestML(ExecuteRequestMLRequest request);

    /**
     * @param request the request parameters of ExecuteRequestSG  ExecuteRequestSGRequest
     * @return ExecuteRequestSGResponse
     */
    CompletableFuture<ExecuteRequestSGResponse> executeRequestSG(ExecuteRequestSGRequest request);

    /**
     * @param request the request parameters of RequestDecision  RequestDecisionRequest
     * @return RequestDecisionResponse
     */
    CompletableFuture<RequestDecisionResponse> requestDecision(RequestDecisionRequest request);

}
