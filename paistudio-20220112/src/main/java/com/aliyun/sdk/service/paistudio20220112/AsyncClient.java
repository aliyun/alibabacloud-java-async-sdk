// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paistudio20220112.models.*;
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

    CompletableFuture<CheckInstanceWebTerminalResponse> checkInstanceWebTerminal(CheckInstanceWebTerminalRequest request);

    CompletableFuture<CreateAlgorithmResponse> createAlgorithm(CreateAlgorithmRequest request);

    CompletableFuture<CreateAlgorithmVersionResponse> createAlgorithmVersion(CreateAlgorithmVersionRequest request);

    CompletableFuture<CreateInstanceWebTerminalResponse> createInstanceWebTerminal(CreateInstanceWebTerminalRequest request);

    CompletableFuture<CreateQuotaResponse> createQuota(CreateQuotaRequest request);

    CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request);

    CompletableFuture<CreateTrainingJobResponse> createTrainingJob(CreateTrainingJobRequest request);

    CompletableFuture<DeleteAlgorithmResponse> deleteAlgorithm(DeleteAlgorithmRequest request);

    CompletableFuture<DeleteAlgorithmVersionResponse> deleteAlgorithmVersion(DeleteAlgorithmVersionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request);

    CompletableFuture<DeleteQuotaResponse> deleteQuota(DeleteQuotaRequest request);

    CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteResourceGroupMachineGroupResponse> deleteResourceGroupMachineGroup(DeleteResourceGroupMachineGroupRequest request);

    CompletableFuture<DeleteTrainingJobResponse> deleteTrainingJob(DeleteTrainingJobRequest request);

    CompletableFuture<DeleteTrainingJobLabelsResponse> deleteTrainingJobLabels(DeleteTrainingJobLabelsRequest request);

    CompletableFuture<GetAlgorithmResponse> getAlgorithm(GetAlgorithmRequest request);

    CompletableFuture<GetAlgorithmVersionResponse> getAlgorithmVersion(GetAlgorithmVersionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request);

    CompletableFuture<GetNodeMetricsResponse> getNodeMetrics(GetNodeMetricsRequest request);

    CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request);

    CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request);

    CompletableFuture<GetResourceGroupMachineGroupResponse> getResourceGroupMachineGroup(GetResourceGroupMachineGroupRequest request);

    CompletableFuture<GetResourceGroupRequestResponse> getResourceGroupRequest(GetResourceGroupRequestRequest request);

    CompletableFuture<GetResourceGroupTotalResponse> getResourceGroupTotal(GetResourceGroupTotalRequest request);

    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    CompletableFuture<GetTrainingJobResponse> getTrainingJob(GetTrainingJobRequest request);

    CompletableFuture<GetTrainingJobErrorInfoResponse> getTrainingJobErrorInfo(GetTrainingJobErrorInfoRequest request);

    CompletableFuture<GetTrainingJobLatestMetricsResponse> getTrainingJobLatestMetrics(GetTrainingJobLatestMetricsRequest request);

    CompletableFuture<GetUserViewMetricsResponse> getUserViewMetrics(GetUserViewMetricsRequest request);

    CompletableFuture<ListAlgorithmVersionsResponse> listAlgorithmVersions(ListAlgorithmVersionsRequest request);

    CompletableFuture<ListAlgorithmsResponse> listAlgorithms(ListAlgorithmsRequest request);

    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request);

    CompletableFuture<ListResourceGroupMachineGroupsResponse> listResourceGroupMachineGroups(ListResourceGroupMachineGroupsRequest request);

    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    CompletableFuture<ListTrainingJobEventsResponse> listTrainingJobEvents(ListTrainingJobEventsRequest request);

    CompletableFuture<ListTrainingJobInstanceEventsResponse> listTrainingJobInstanceEvents(ListTrainingJobInstanceEventsRequest request);

    CompletableFuture<ListTrainingJobInstanceMetricsResponse> listTrainingJobInstanceMetrics(ListTrainingJobInstanceMetricsRequest request);

    CompletableFuture<ListTrainingJobLogsResponse> listTrainingJobLogs(ListTrainingJobLogsRequest request);

    CompletableFuture<ListTrainingJobMetricsResponse> listTrainingJobMetrics(ListTrainingJobMetricsRequest request);

    CompletableFuture<ListTrainingJobOutputModelsResponse> listTrainingJobOutputModels(ListTrainingJobOutputModelsRequest request);

    CompletableFuture<ListTrainingJobsResponse> listTrainingJobs(ListTrainingJobsRequest request);

    CompletableFuture<ScaleQuotaResponse> scaleQuota(ScaleQuotaRequest request);

    CompletableFuture<StopTrainingJobResponse> stopTrainingJob(StopTrainingJobRequest request);

    CompletableFuture<UpdateAlgorithmResponse> updateAlgorithm(UpdateAlgorithmRequest request);

    CompletableFuture<UpdateAlgorithmVersionResponse> updateAlgorithmVersion(UpdateAlgorithmVersionRequest request);

    CompletableFuture<UpdateQuotaResponse> updateQuota(UpdateQuotaRequest request);

    CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request);

    CompletableFuture<UpdateTrainingJobLabelsResponse> updateTrainingJobLabels(UpdateTrainingJobLabelsRequest request);

}
