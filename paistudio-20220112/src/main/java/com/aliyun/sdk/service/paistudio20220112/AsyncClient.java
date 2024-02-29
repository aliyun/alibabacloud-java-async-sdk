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

    CompletableFuture<CreateAlgorithmResponse> createAlgorithm(CreateAlgorithmRequest request);

    CompletableFuture<CreateAlgorithmVersionResponse> createAlgorithmVersion(CreateAlgorithmVersionRequest request);

    CompletableFuture<CreateQuotaResponse> createQuota(CreateQuotaRequest request);

    CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request);

    CompletableFuture<CreateTrainingJobResponse> createTrainingJob(CreateTrainingJobRequest request);

    CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request);

    CompletableFuture<DeleteQuotaResponse> deleteQuota(DeleteQuotaRequest request);

    CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request);

    CompletableFuture<DeleteResourceGroupMachineGroupResponse> deleteResourceGroupMachineGroup(DeleteResourceGroupMachineGroupRequest request);

    CompletableFuture<GetAlgorithmResponse> getAlgorithm(GetAlgorithmRequest request);

    CompletableFuture<GetAlgorithmVersionResponse> getAlgorithmVersion(GetAlgorithmVersionRequest request);

    CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request);

    CompletableFuture<GetNodeMetricsResponse> getNodeMetrics(GetNodeMetricsRequest request);

    CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request);

    CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request);

    CompletableFuture<GetResourceGroupMachineGroupResponse> getResourceGroupMachineGroup(GetResourceGroupMachineGroupRequest request);

    CompletableFuture<GetResourceGroupRequestResponse> getResourceGroupRequest(GetResourceGroupRequestRequest request);

    CompletableFuture<GetResourceGroupTotalResponse> getResourceGroupTotal(GetResourceGroupTotalRequest request);

    CompletableFuture<GetTrainingJobResponse> getTrainingJob(GetTrainingJobRequest request);

    CompletableFuture<GetUserViewMetricsResponse> getUserViewMetrics(GetUserViewMetricsRequest request);

    CompletableFuture<ListAlgorithmVersionsResponse> listAlgorithmVersions(ListAlgorithmVersionsRequest request);

    CompletableFuture<ListAlgorithmsResponse> listAlgorithms(ListAlgorithmsRequest request);

    CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request);

    CompletableFuture<ListResourceGroupMachineGroupsResponse> listResourceGroupMachineGroups(ListResourceGroupMachineGroupsRequest request);

    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    CompletableFuture<ListTrainingJobLogsResponse> listTrainingJobLogs(ListTrainingJobLogsRequest request);

    CompletableFuture<ListTrainingJobMetricsResponse> listTrainingJobMetrics(ListTrainingJobMetricsRequest request);

    CompletableFuture<ListTrainingJobsResponse> listTrainingJobs(ListTrainingJobsRequest request);

    CompletableFuture<ScaleQuotaResponse> scaleQuota(ScaleQuotaRequest request);

    CompletableFuture<StopTrainingJobResponse> stopTrainingJob(StopTrainingJobRequest request);

    CompletableFuture<UpdateAlgorithmResponse> updateAlgorithm(UpdateAlgorithmRequest request);

    CompletableFuture<UpdateAlgorithmVersionResponse> updateAlgorithmVersion(UpdateAlgorithmVersionRequest request);

    CompletableFuture<UpdateQuotaResponse> updateQuota(UpdateQuotaRequest request);

    CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request);

    CompletableFuture<UpdateTrainingJobLabelsResponse> updateTrainingJobLabels(UpdateTrainingJobLabelsRequest request);

}
