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

    /**
     * @param request the request parameters of CheckInstanceWebTerminal  CheckInstanceWebTerminalRequest
     * @return CheckInstanceWebTerminalResponse
     */
    CompletableFuture<CheckInstanceWebTerminalResponse> checkInstanceWebTerminal(CheckInstanceWebTerminalRequest request);

    /**
     * @param request the request parameters of CreateAlgorithm  CreateAlgorithmRequest
     * @return CreateAlgorithmResponse
     */
    CompletableFuture<CreateAlgorithmResponse> createAlgorithm(CreateAlgorithmRequest request);

    /**
     * @param request the request parameters of CreateAlgorithmVersion  CreateAlgorithmVersionRequest
     * @return CreateAlgorithmVersionResponse
     */
    CompletableFuture<CreateAlgorithmVersionResponse> createAlgorithmVersion(CreateAlgorithmVersionRequest request);

    /**
     * @param request the request parameters of CreateInstanceWebTerminal  CreateInstanceWebTerminalRequest
     * @return CreateInstanceWebTerminalResponse
     */
    CompletableFuture<CreateInstanceWebTerminalResponse> createInstanceWebTerminal(CreateInstanceWebTerminalRequest request);

    /**
     * @param request the request parameters of CreateQuota  CreateQuotaRequest
     * @return CreateQuotaResponse
     */
    CompletableFuture<CreateQuotaResponse> createQuota(CreateQuotaRequest request);

    /**
     * @param request the request parameters of CreateResourceGroup  CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateTrainingJob  CreateTrainingJobRequest
     * @return CreateTrainingJobResponse
     */
    CompletableFuture<CreateTrainingJobResponse> createTrainingJob(CreateTrainingJobRequest request);

    /**
     * @param request the request parameters of DeleteAlgorithm  DeleteAlgorithmRequest
     * @return DeleteAlgorithmResponse
     */
    CompletableFuture<DeleteAlgorithmResponse> deleteAlgorithm(DeleteAlgorithmRequest request);

    /**
     * @param request the request parameters of DeleteAlgorithmVersion  DeleteAlgorithmVersionRequest
     * @return DeleteAlgorithmVersionResponse
     */
    CompletableFuture<DeleteAlgorithmVersionResponse> deleteAlgorithmVersion(DeleteAlgorithmVersionRequest request);

    /**
     * @deprecated OpenAPI DeleteMachineGroup is deprecated, please use PaiStudio::2022-01-12::DeleteMachineGroup instead.  * @param request  the request parameters of DeleteMachineGroup  DeleteMachineGroupRequest
     * @return DeleteMachineGroupResponse
     */
    @Deprecated
    CompletableFuture<DeleteMachineGroupResponse> deleteMachineGroup(DeleteMachineGroupRequest request);

    /**
     * @param request the request parameters of DeleteQuota  DeleteQuotaRequest
     * @return DeleteQuotaResponse
     */
    CompletableFuture<DeleteQuotaResponse> deleteQuota(DeleteQuotaRequest request);

    /**
     * @param request the request parameters of DeleteResourceGroup  DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request);

    /**
     * @deprecated OpenAPI DeleteResourceGroupMachineGroup is deprecated, please use PaiStudio::2022-01-12::DeleteResourceGroupMachineGroup instead.  * @param request  the request parameters of DeleteResourceGroupMachineGroup  DeleteResourceGroupMachineGroupRequest
     * @return DeleteResourceGroupMachineGroupResponse
     */
    @Deprecated
    CompletableFuture<DeleteResourceGroupMachineGroupResponse> deleteResourceGroupMachineGroup(DeleteResourceGroupMachineGroupRequest request);

    /**
     * @param request the request parameters of DeleteTrainingJob  DeleteTrainingJobRequest
     * @return DeleteTrainingJobResponse
     */
    CompletableFuture<DeleteTrainingJobResponse> deleteTrainingJob(DeleteTrainingJobRequest request);

    /**
     * @param request the request parameters of DeleteTrainingJobLabels  DeleteTrainingJobLabelsRequest
     * @return DeleteTrainingJobLabelsResponse
     */
    CompletableFuture<DeleteTrainingJobLabelsResponse> deleteTrainingJobLabels(DeleteTrainingJobLabelsRequest request);

    /**
     * @param request the request parameters of GetAlgorithm  GetAlgorithmRequest
     * @return GetAlgorithmResponse
     */
    CompletableFuture<GetAlgorithmResponse> getAlgorithm(GetAlgorithmRequest request);

    /**
     * @param request the request parameters of GetAlgorithmVersion  GetAlgorithmVersionRequest
     * @return GetAlgorithmVersionResponse
     */
    CompletableFuture<GetAlgorithmVersionResponse> getAlgorithmVersion(GetAlgorithmVersionRequest request);

    /**
     * @deprecated OpenAPI GetMachineGroup is deprecated, please use PaiStudio::2022-01-12::GetMachineGroup instead.  * @param request  the request parameters of GetMachineGroup  GetMachineGroupRequest
     * @return GetMachineGroupResponse
     */
    @Deprecated
    CompletableFuture<GetMachineGroupResponse> getMachineGroup(GetMachineGroupRequest request);

    /**
     * @deprecated OpenAPI GetNodeMetrics is deprecated, please use Cms::2019-01-01::DescribeMetricList instead.  * @param request  the request parameters of GetNodeMetrics  GetNodeMetricsRequest
     * @return GetNodeMetricsResponse
     */
    @Deprecated
    CompletableFuture<GetNodeMetricsResponse> getNodeMetrics(GetNodeMetricsRequest request);

    /**
     * @param request the request parameters of GetQuota  GetQuotaRequest
     * @return GetQuotaResponse
     */
    CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request);

    /**
     * @param request the request parameters of GetResourceGroup  GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request);

    /**
     * @param request the request parameters of GetResourceGroupMachineGroup  GetResourceGroupMachineGroupRequest
     * @return GetResourceGroupMachineGroupResponse
     */
    CompletableFuture<GetResourceGroupMachineGroupResponse> getResourceGroupMachineGroup(GetResourceGroupMachineGroupRequest request);

    /**
     * @deprecated OpenAPI GetResourceGroupRequest is deprecated  * @param request  the request parameters of GetResourceGroupRequest  GetResourceGroupRequestRequest
     * @return GetResourceGroupRequestResponse
     */
    @Deprecated
    CompletableFuture<GetResourceGroupRequestResponse> getResourceGroupRequest(GetResourceGroupRequestRequest request);

    /**
     * @param request the request parameters of GetResourceGroupTotal  GetResourceGroupTotalRequest
     * @return GetResourceGroupTotalResponse
     */
    CompletableFuture<GetResourceGroupTotalResponse> getResourceGroupTotal(GetResourceGroupTotalRequest request);

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    /**
     * @param request the request parameters of GetTrainingJob  GetTrainingJobRequest
     * @return GetTrainingJobResponse
     */
    CompletableFuture<GetTrainingJobResponse> getTrainingJob(GetTrainingJobRequest request);

    /**
     * @param request the request parameters of GetTrainingJobErrorInfo  GetTrainingJobErrorInfoRequest
     * @return GetTrainingJobErrorInfoResponse
     */
    CompletableFuture<GetTrainingJobErrorInfoResponse> getTrainingJobErrorInfo(GetTrainingJobErrorInfoRequest request);

    /**
     * @param request the request parameters of GetTrainingJobLatestMetrics  GetTrainingJobLatestMetricsRequest
     * @return GetTrainingJobLatestMetricsResponse
     */
    CompletableFuture<GetTrainingJobLatestMetricsResponse> getTrainingJobLatestMetrics(GetTrainingJobLatestMetricsRequest request);

    /**
     * @deprecated OpenAPI GetUserViewMetrics is deprecated, please use PaiStudio::2022-01-12::GetQuotaUserViewMetrics instead.  * @param request  the request parameters of GetUserViewMetrics  GetUserViewMetricsRequest
     * @return GetUserViewMetricsResponse
     */
    @Deprecated
    CompletableFuture<GetUserViewMetricsResponse> getUserViewMetrics(GetUserViewMetricsRequest request);

    /**
     * @param request the request parameters of ListAlgorithmVersions  ListAlgorithmVersionsRequest
     * @return ListAlgorithmVersionsResponse
     */
    CompletableFuture<ListAlgorithmVersionsResponse> listAlgorithmVersions(ListAlgorithmVersionsRequest request);

    /**
     * @param request the request parameters of ListAlgorithms  ListAlgorithmsRequest
     * @return ListAlgorithmsResponse
     */
    CompletableFuture<ListAlgorithmsResponse> listAlgorithms(ListAlgorithmsRequest request);

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request);

    /**
     * @param request the request parameters of ListQuotaWorkloads  ListQuotaWorkloadsRequest
     * @return ListQuotaWorkloadsResponse
     */
    CompletableFuture<ListQuotaWorkloadsResponse> listQuotaWorkloads(ListQuotaWorkloadsRequest request);

    /**
     * @param request the request parameters of ListQuotas  ListQuotasRequest
     * @return ListQuotasResponse
     */
    CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request);

    /**
     * @param request the request parameters of ListResourceGroupMachineGroups  ListResourceGroupMachineGroupsRequest
     * @return ListResourceGroupMachineGroupsResponse
     */
    CompletableFuture<ListResourceGroupMachineGroupsResponse> listResourceGroupMachineGroups(ListResourceGroupMachineGroupsRequest request);

    /**
     * @param request the request parameters of ListResourceGroups  ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    /**
     * @param request the request parameters of ListTrainingJobEvents  ListTrainingJobEventsRequest
     * @return ListTrainingJobEventsResponse
     */
    CompletableFuture<ListTrainingJobEventsResponse> listTrainingJobEvents(ListTrainingJobEventsRequest request);

    /**
     * @param request the request parameters of ListTrainingJobInstanceEvents  ListTrainingJobInstanceEventsRequest
     * @return ListTrainingJobInstanceEventsResponse
     */
    CompletableFuture<ListTrainingJobInstanceEventsResponse> listTrainingJobInstanceEvents(ListTrainingJobInstanceEventsRequest request);

    /**
     * @param request the request parameters of ListTrainingJobInstanceMetrics  ListTrainingJobInstanceMetricsRequest
     * @return ListTrainingJobInstanceMetricsResponse
     */
    CompletableFuture<ListTrainingJobInstanceMetricsResponse> listTrainingJobInstanceMetrics(ListTrainingJobInstanceMetricsRequest request);

    /**
     * @param request the request parameters of ListTrainingJobLogs  ListTrainingJobLogsRequest
     * @return ListTrainingJobLogsResponse
     */
    CompletableFuture<ListTrainingJobLogsResponse> listTrainingJobLogs(ListTrainingJobLogsRequest request);

    /**
     * @param request the request parameters of ListTrainingJobMetrics  ListTrainingJobMetricsRequest
     * @return ListTrainingJobMetricsResponse
     */
    CompletableFuture<ListTrainingJobMetricsResponse> listTrainingJobMetrics(ListTrainingJobMetricsRequest request);

    /**
     * @param request the request parameters of ListTrainingJobOutputModels  ListTrainingJobOutputModelsRequest
     * @return ListTrainingJobOutputModelsResponse
     */
    CompletableFuture<ListTrainingJobOutputModelsResponse> listTrainingJobOutputModels(ListTrainingJobOutputModelsRequest request);

    /**
     * @param request the request parameters of ListTrainingJobs  ListTrainingJobsRequest
     * @return ListTrainingJobsResponse
     */
    CompletableFuture<ListTrainingJobsResponse> listTrainingJobs(ListTrainingJobsRequest request);

    /**
     * @param request the request parameters of ScaleQuota  ScaleQuotaRequest
     * @return ScaleQuotaResponse
     */
    CompletableFuture<ScaleQuotaResponse> scaleQuota(ScaleQuotaRequest request);

    /**
     * @param request the request parameters of StopTrainingJob  StopTrainingJobRequest
     * @return StopTrainingJobResponse
     */
    CompletableFuture<StopTrainingJobResponse> stopTrainingJob(StopTrainingJobRequest request);

    /**
     * @param request the request parameters of UpdateAlgorithm  UpdateAlgorithmRequest
     * @return UpdateAlgorithmResponse
     */
    CompletableFuture<UpdateAlgorithmResponse> updateAlgorithm(UpdateAlgorithmRequest request);

    /**
     * @param request the request parameters of UpdateAlgorithmVersion  UpdateAlgorithmVersionRequest
     * @return UpdateAlgorithmVersionResponse
     */
    CompletableFuture<UpdateAlgorithmVersionResponse> updateAlgorithmVersion(UpdateAlgorithmVersionRequest request);

    /**
     * @param request the request parameters of UpdateQuota  UpdateQuotaRequest
     * @return UpdateQuotaResponse
     */
    CompletableFuture<UpdateQuotaResponse> updateQuota(UpdateQuotaRequest request);

    /**
     * @param request the request parameters of UpdateResourceGroup  UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     */
    CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request);

    /**
     * @param request the request parameters of UpdateTrainingJobLabels  UpdateTrainingJobLabelsRequest
     * @return UpdateTrainingJobLabelsResponse
     */
    CompletableFuture<UpdateTrainingJobLabelsResponse> updateTrainingJobLabels(UpdateTrainingJobLabelsRequest request);

}
