// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.openanalytics_open20180619.models.*;
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

    CompletableFuture<CancelSparkStatementResponse> cancelSparkStatement(CancelSparkStatementRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<ExecuteSparkStatementResponse> executeSparkStatement(ExecuteSparkStatementRequest request);

    CompletableFuture<GetJobAttemptLogResponse> getJobAttemptLog(GetJobAttemptLogRequest request);

    CompletableFuture<GetJobDetailResponse> getJobDetail(GetJobDetailRequest request);

    CompletableFuture<GetJobLogResponse> getJobLog(GetJobLogRequest request);

    CompletableFuture<GetJobStatusResponse> getJobStatus(GetJobStatusRequest request);

    CompletableFuture<GetSparkSessionStateResponse> getSparkSessionState(GetSparkSessionStateRequest request);

    CompletableFuture<GetSparkStatementResponse> getSparkStatement(GetSparkStatementRequest request);

    CompletableFuture<KillSparkJobResponse> killSparkJob(KillSparkJobRequest request);

    CompletableFuture<ListSparkJobResponse> listSparkJob(ListSparkJobRequest request);

    CompletableFuture<ListSparkJobAttemptResponse> listSparkJobAttempt(ListSparkJobAttemptRequest request);

    CompletableFuture<ListSparkStatementsResponse> listSparkStatements(ListSparkStatementsRequest request);

    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    CompletableFuture<SubmitSparkJobResponse> submitSparkJob(SubmitSparkJobRequest request);

    CompletableFuture<SubmitSparkSQLResponse> submitSparkSQL(SubmitSparkSQLRequest request);

    CompletableFuture<ValidateVirtualClusterNameResponse> validateVirtualClusterName(ValidateVirtualClusterNameRequest request);

}
