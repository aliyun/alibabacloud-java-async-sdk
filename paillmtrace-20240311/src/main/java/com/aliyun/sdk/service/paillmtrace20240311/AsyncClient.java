// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paillmtrace20240311.models.*;
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
     * @param request the request parameters of CreateOnlineEvalTask  CreateOnlineEvalTaskRequest
     * @return CreateOnlineEvalTaskResponse
     */
    CompletableFuture<CreateOnlineEvalTaskResponse> createOnlineEvalTask(CreateOnlineEvalTaskRequest request);

    /**
     * @param request the request parameters of CreateServiceIdentityRole  CreateServiceIdentityRoleRequest
     * @return CreateServiceIdentityRoleResponse
     */
    CompletableFuture<CreateServiceIdentityRoleResponse> createServiceIdentityRole(CreateServiceIdentityRoleRequest request);

    /**
     * @param request the request parameters of DeleteOnlineEvalTask  DeleteOnlineEvalTaskRequest
     * @return DeleteOnlineEvalTaskResponse
     */
    CompletableFuture<DeleteOnlineEvalTaskResponse> deleteOnlineEvalTask(DeleteOnlineEvalTaskRequest request);

    /**
     * @param request the request parameters of EvaluateTrace  EvaluateTraceRequest
     * @return EvaluateTraceResponse
     */
    CompletableFuture<EvaluateTraceResponse> evaluateTrace(EvaluateTraceRequest request);

    /**
     * @param request the request parameters of GetEvaluationTemplates  GetEvaluationTemplatesRequest
     * @return GetEvaluationTemplatesResponse
     */
    CompletableFuture<GetEvaluationTemplatesResponse> getEvaluationTemplates(GetEvaluationTemplatesRequest request);

    /**
     * @param request the request parameters of GetOnlineEvalTask  GetOnlineEvalTaskRequest
     * @return GetOnlineEvalTaskResponse
     */
    CompletableFuture<GetOnlineEvalTaskResponse> getOnlineEvalTask(GetOnlineEvalTaskRequest request);

    /**
     * @param request the request parameters of GetServiceIdentityRole  GetServiceIdentityRoleRequest
     * @return GetServiceIdentityRoleResponse
     */
    CompletableFuture<GetServiceIdentityRoleResponse> getServiceIdentityRole(GetServiceIdentityRoleRequest request);

    /**
     * @param request the request parameters of GetXtraceToken  GetXtraceTokenRequest
     * @return GetXtraceTokenResponse
     */
    CompletableFuture<GetXtraceTokenResponse> getXtraceToken(GetXtraceTokenRequest request);

    /**
     * @param request the request parameters of ListOnlineEvalTaskResults  ListOnlineEvalTaskResultsRequest
     * @return ListOnlineEvalTaskResultsResponse
     */
    CompletableFuture<ListOnlineEvalTaskResultsResponse> listOnlineEvalTaskResults(ListOnlineEvalTaskResultsRequest request);

    /**
     * @param request the request parameters of ListOnlineEvalTasks  ListOnlineEvalTasksRequest
     * @return ListOnlineEvalTasksResponse
     */
    CompletableFuture<ListOnlineEvalTasksResponse> listOnlineEvalTasks(ListOnlineEvalTasksRequest request);

    /**
     * @param request the request parameters of ListTracesDatas  ListTracesDatasRequest
     * @return ListTracesDatasResponse
     */
    CompletableFuture<ListTracesDatasResponse> listTracesDatas(ListTracesDatasRequest request);

    /**
     * @param request the request parameters of StopOnlineEvalTask  StopOnlineEvalTaskRequest
     * @return StopOnlineEvalTaskResponse
     */
    CompletableFuture<StopOnlineEvalTaskResponse> stopOnlineEvalTask(StopOnlineEvalTaskRequest request);

    /**
     * @param request the request parameters of UpdateOnlineEvalTask  UpdateOnlineEvalTaskRequest
     * @return UpdateOnlineEvalTaskResponse
     */
    CompletableFuture<UpdateOnlineEvalTaskResponse> updateOnlineEvalTask(UpdateOnlineEvalTaskRequest request);

}
