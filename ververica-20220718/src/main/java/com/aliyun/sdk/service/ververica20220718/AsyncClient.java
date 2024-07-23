// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ververica20220718.models.*;
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

    CompletableFuture<CreateDeploymentResponse> createDeployment(CreateDeploymentRequest request);

    CompletableFuture<CreateMemberResponse> createMember(CreateMemberRequest request);

    CompletableFuture<CreateSavepointResponse> createSavepoint(CreateSavepointRequest request);

    CompletableFuture<CreateVariableResponse> createVariable(CreateVariableRequest request);

    CompletableFuture<DeleteDeploymentResponse> deleteDeployment(DeleteDeploymentRequest request);

    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    CompletableFuture<DeleteMemberResponse> deleteMember(DeleteMemberRequest request);

    CompletableFuture<DeleteSavepointResponse> deleteSavepoint(DeleteSavepointRequest request);

    CompletableFuture<DeleteVariableResponse> deleteVariable(DeleteVariableRequest request);

    CompletableFuture<FlinkApiProxyResponse> flinkApiProxy(FlinkApiProxyRequest request);

    CompletableFuture<GenerateResourcePlanWithFlinkConfAsyncResponse> generateResourcePlanWithFlinkConfAsync(GenerateResourcePlanWithFlinkConfAsyncRequest request);

    CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request);

    CompletableFuture<GetGenerateResourcePlanResultResponse> getGenerateResourcePlanResult(GetGenerateResourcePlanResultRequest request);

    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    CompletableFuture<GetLatestJobStartLogResponse> getLatestJobStartLog(GetLatestJobStartLogRequest request);

    CompletableFuture<GetMemberResponse> getMember(GetMemberRequest request);

    CompletableFuture<GetSavepointResponse> getSavepoint(GetSavepointRequest request);

    CompletableFuture<ListDeploymentTargetsResponse> listDeploymentTargets(ListDeploymentTargetsRequest request);

    CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request);

    CompletableFuture<ListEditableNamespaceResponse> listEditableNamespace(ListEditableNamespaceRequest request);

    CompletableFuture<ListEngineVersionMetadataResponse> listEngineVersionMetadata(ListEngineVersionMetadataRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListMembersResponse> listMembers(ListMembersRequest request);

    CompletableFuture<ListSavepointsResponse> listSavepoints(ListSavepointsRequest request);

    CompletableFuture<ListVariablesResponse> listVariables(ListVariablesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<StartJobResponse> startJob(StartJobRequest request);

    CompletableFuture<StartJobWithParamsResponse> startJobWithParams(StartJobWithParamsRequest request);

    CompletableFuture<StopJobResponse> stopJob(StopJobRequest request);

    CompletableFuture<UpdateDeploymentResponse> updateDeployment(UpdateDeploymentRequest request);

    CompletableFuture<UpdateMemberResponse> updateMember(UpdateMemberRequest request);

    CompletableFuture<ValidateSqlStatementResponse> validateSqlStatement(ValidateSqlStatementRequest request);

}
