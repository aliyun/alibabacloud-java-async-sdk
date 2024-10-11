// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.openanalytics_open20180619.models.*;
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
     * @param request the request parameters of CancelSparkStatement  CancelSparkStatementRequest
     * @return CancelSparkStatementResponse
     */
    CompletableFuture<CancelSparkStatementResponse> cancelSparkStatement(CancelSparkStatementRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of ExecuteSparkStatement  ExecuteSparkStatementRequest
     * @return ExecuteSparkStatementResponse
     */
    CompletableFuture<ExecuteSparkStatementResponse> executeSparkStatement(ExecuteSparkStatementRequest request);

    /**
     * @param request the request parameters of GetJobAttemptLog  GetJobAttemptLogRequest
     * @return GetJobAttemptLogResponse
     */
    CompletableFuture<GetJobAttemptLogResponse> getJobAttemptLog(GetJobAttemptLogRequest request);

    /**
     * @param request the request parameters of GetJobDetail  GetJobDetailRequest
     * @return GetJobDetailResponse
     */
    CompletableFuture<GetJobDetailResponse> getJobDetail(GetJobDetailRequest request);

    /**
     * @param request the request parameters of GetJobLog  GetJobLogRequest
     * @return GetJobLogResponse
     */
    CompletableFuture<GetJobLogResponse> getJobLog(GetJobLogRequest request);

    /**
     * @param request the request parameters of GetJobStatus  GetJobStatusRequest
     * @return GetJobStatusResponse
     */
    CompletableFuture<GetJobStatusResponse> getJobStatus(GetJobStatusRequest request);

    /**
     * @param request the request parameters of GetSparkSessionState  GetSparkSessionStateRequest
     * @return GetSparkSessionStateResponse
     */
    CompletableFuture<GetSparkSessionStateResponse> getSparkSessionState(GetSparkSessionStateRequest request);

    /**
     * @param request the request parameters of GetSparkStatement  GetSparkStatementRequest
     * @return GetSparkStatementResponse
     */
    CompletableFuture<GetSparkStatementResponse> getSparkStatement(GetSparkStatementRequest request);

    /**
     * @param request the request parameters of KillSparkJob  KillSparkJobRequest
     * @return KillSparkJobResponse
     */
    CompletableFuture<KillSparkJobResponse> killSparkJob(KillSparkJobRequest request);

    /**
     * @param request the request parameters of ListSparkJob  ListSparkJobRequest
     * @return ListSparkJobResponse
     */
    CompletableFuture<ListSparkJobResponse> listSparkJob(ListSparkJobRequest request);

    /**
     * @param request the request parameters of ListSparkJobAttempt  ListSparkJobAttemptRequest
     * @return ListSparkJobAttemptResponse
     */
    CompletableFuture<ListSparkJobAttemptResponse> listSparkJobAttempt(ListSparkJobAttemptRequest request);

    /**
     * @param request the request parameters of ListSparkStatements  ListSparkStatementsRequest
     * @return ListSparkStatementsResponse
     */
    CompletableFuture<ListSparkStatementsResponse> listSparkStatements(ListSparkStatementsRequest request);

    /**
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * @param request the request parameters of SubmitSparkJob  SubmitSparkJobRequest
     * @return SubmitSparkJobResponse
     */
    CompletableFuture<SubmitSparkJobResponse> submitSparkJob(SubmitSparkJobRequest request);

    /**
     * @param request the request parameters of SubmitSparkSQL  SubmitSparkSQLRequest
     * @return SubmitSparkSQLResponse
     */
    CompletableFuture<SubmitSparkSQLResponse> submitSparkSQL(SubmitSparkSQLRequest request);

    /**
     * @param request the request parameters of ValidateVirtualClusterName  ValidateVirtualClusterNameRequest
     * @return ValidateVirtualClusterNameResponse
     */
    CompletableFuture<ValidateVirtualClusterNameResponse> validateVirtualClusterName(ValidateVirtualClusterNameRequest request);

}
