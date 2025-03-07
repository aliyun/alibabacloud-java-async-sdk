// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.maxcompute20220104.models.*;
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
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * @param request the request parameters of ApplyComputeQuotaPlan  ApplyComputeQuotaPlanRequest
     * @return ApplyComputeQuotaPlanResponse
     */
    CompletableFuture<ApplyComputeQuotaPlanResponse> applyComputeQuotaPlan(ApplyComputeQuotaPlanRequest request);

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * @param request the request parameters of CreateComputeQuotaPlan  CreateComputeQuotaPlanRequest
     * @return CreateComputeQuotaPlanResponse
     */
    CompletableFuture<CreateComputeQuotaPlanResponse> createComputeQuotaPlan(CreateComputeQuotaPlanRequest request);

    /**
     * @param request the request parameters of CreateMmsDataSource  CreateMmsDataSourceRequest
     * @return CreateMmsDataSourceResponse
     */
    CompletableFuture<CreateMmsDataSourceResponse> createMmsDataSource(CreateMmsDataSourceRequest request);

    /**
     * @param request the request parameters of CreateMmsFetchMetadataJob  CreateMmsFetchMetadataJobRequest
     * @return CreateMmsFetchMetadataJobResponse
     */
    CompletableFuture<CreateMmsFetchMetadataJobResponse> createMmsFetchMetadataJob(CreateMmsFetchMetadataJobRequest request);

    /**
     * @param request the request parameters of CreateMmsJob  CreateMmsJobRequest
     * @return CreateMmsJobResponse
     */
    CompletableFuture<CreateMmsJobResponse> createMmsJob(CreateMmsJobRequest request);

    /**
     * @param request the request parameters of CreatePackage  CreatePackageRequest
     * @return CreatePackageResponse
     */
    CompletableFuture<CreatePackageResponse> createPackage(CreatePackageRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of CreateQuotaPlan  CreateQuotaPlanRequest
     * @return CreateQuotaPlanResponse
     */
    CompletableFuture<CreateQuotaPlanResponse> createQuotaPlan(CreateQuotaPlanRequest request);

    /**
     * @param request the request parameters of CreateRole  CreateRoleRequest
     * @return CreateRoleResponse
     */
    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    /**
     * @param request the request parameters of DeleteComputeQuotaPlan  DeleteComputeQuotaPlanRequest
     * @return DeleteComputeQuotaPlanResponse
     */
    CompletableFuture<DeleteComputeQuotaPlanResponse> deleteComputeQuotaPlan(DeleteComputeQuotaPlanRequest request);

    /**
     * @param request the request parameters of DeleteMmsDataSource  DeleteMmsDataSourceRequest
     * @return DeleteMmsDataSourceResponse
     */
    CompletableFuture<DeleteMmsDataSourceResponse> deleteMmsDataSource(DeleteMmsDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteMmsJob  DeleteMmsJobRequest
     * @return DeleteMmsJobResponse
     */
    CompletableFuture<DeleteMmsJobResponse> deleteMmsJob(DeleteMmsJobRequest request);

    /**
     * @param request the request parameters of DeleteQuotaPlan  DeleteQuotaPlanRequest
     * @return DeleteQuotaPlanResponse
     */
    CompletableFuture<DeleteQuotaPlanResponse> deleteQuotaPlan(DeleteQuotaPlanRequest request);

    /**
     * @param request the request parameters of GetComputeEffectivePlan  GetComputeEffectivePlanRequest
     * @return GetComputeEffectivePlanResponse
     */
    CompletableFuture<GetComputeEffectivePlanResponse> getComputeEffectivePlan(GetComputeEffectivePlanRequest request);

    /**
     * @param request the request parameters of GetComputeQuotaPlan  GetComputeQuotaPlanRequest
     * @return GetComputeQuotaPlanResponse
     */
    CompletableFuture<GetComputeQuotaPlanResponse> getComputeQuotaPlan(GetComputeQuotaPlanRequest request);

    /**
     * @param request the request parameters of GetComputeQuotaSchedule  GetComputeQuotaScheduleRequest
     * @return GetComputeQuotaScheduleResponse
     */
    CompletableFuture<GetComputeQuotaScheduleResponse> getComputeQuotaSchedule(GetComputeQuotaScheduleRequest request);

    /**
     * @param request the request parameters of GetJobInfo  GetJobInfoRequest
     * @return GetJobInfoResponse
     */
    CompletableFuture<GetJobInfoResponse> getJobInfo(GetJobInfoRequest request);

    /**
     * @param request the request parameters of GetJobResourceUsage  GetJobResourceUsageRequest
     * @return GetJobResourceUsageResponse
     */
    CompletableFuture<GetJobResourceUsageResponse> getJobResourceUsage(GetJobResourceUsageRequest request);

    /**
     * @param request the request parameters of GetMmsAsyncTask  GetMmsAsyncTaskRequest
     * @return GetMmsAsyncTaskResponse
     */
    CompletableFuture<GetMmsAsyncTaskResponse> getMmsAsyncTask(GetMmsAsyncTaskRequest request);

    /**
     * @param request the request parameters of GetMmsDataSource  GetMmsDataSourceRequest
     * @return GetMmsDataSourceResponse
     */
    CompletableFuture<GetMmsDataSourceResponse> getMmsDataSource(GetMmsDataSourceRequest request);

    /**
     * @param request the request parameters of GetMmsDb  GetMmsDbRequest
     * @return GetMmsDbResponse
     */
    CompletableFuture<GetMmsDbResponse> getMmsDb(GetMmsDbRequest request);

    /**
     * @param request the request parameters of GetMmsFetchMetadataJob  GetMmsFetchMetadataJobRequest
     * @return GetMmsFetchMetadataJobResponse
     */
    CompletableFuture<GetMmsFetchMetadataJobResponse> getMmsFetchMetadataJob(GetMmsFetchMetadataJobRequest request);

    /**
     * @param request the request parameters of GetMmsJob  GetMmsJobRequest
     * @return GetMmsJobResponse
     */
    CompletableFuture<GetMmsJobResponse> getMmsJob(GetMmsJobRequest request);

    /**
     * @param request the request parameters of GetMmsPartition  GetMmsPartitionRequest
     * @return GetMmsPartitionResponse
     */
    CompletableFuture<GetMmsPartitionResponse> getMmsPartition(GetMmsPartitionRequest request);

    /**
     * @param request the request parameters of GetMmsTable  GetMmsTableRequest
     * @return GetMmsTableResponse
     */
    CompletableFuture<GetMmsTableResponse> getMmsTable(GetMmsTableRequest request);

    /**
     * @param request the request parameters of GetMmsTask  GetMmsTaskRequest
     * @return GetMmsTaskResponse
     */
    CompletableFuture<GetMmsTaskResponse> getMmsTask(GetMmsTaskRequest request);

    /**
     * @param request the request parameters of GetPackage  GetPackageRequest
     * @return GetPackageResponse
     */
    CompletableFuture<GetPackageResponse> getPackage(GetPackageRequest request);

    /**
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    /**
     * @param request the request parameters of GetQuota  GetQuotaRequest
     * @return GetQuotaResponse
     */
    CompletableFuture<GetQuotaResponse> getQuota(GetQuotaRequest request);

    /**
     * @param request the request parameters of GetQuotaPlan  GetQuotaPlanRequest
     * @return GetQuotaPlanResponse
     */
    CompletableFuture<GetQuotaPlanResponse> getQuotaPlan(GetQuotaPlanRequest request);

    /**
     * @param request the request parameters of GetQuotaSchedule  GetQuotaScheduleRequest
     * @return GetQuotaScheduleResponse
     */
    CompletableFuture<GetQuotaScheduleResponse> getQuotaSchedule(GetQuotaScheduleRequest request);

    /**
     * @param request the request parameters of GetQuotaUsage  GetQuotaUsageRequest
     * @return GetQuotaUsageResponse
     */
    CompletableFuture<GetQuotaUsageResponse> getQuotaUsage(GetQuotaUsageRequest request);

    /**
     * @param request the request parameters of GetRoleAcl  GetRoleAclRequest
     * @return GetRoleAclResponse
     */
    CompletableFuture<GetRoleAclResponse> getRoleAcl(GetRoleAclRequest request);

    /**
     * @param request the request parameters of GetRoleAclOnObject  GetRoleAclOnObjectRequest
     * @return GetRoleAclOnObjectResponse
     */
    CompletableFuture<GetRoleAclOnObjectResponse> getRoleAclOnObject(GetRoleAclOnObjectRequest request);

    /**
     * @param request the request parameters of GetRolePolicy  GetRolePolicyRequest
     * @return GetRolePolicyResponse
     */
    CompletableFuture<GetRolePolicyResponse> getRolePolicy(GetRolePolicyRequest request);

    /**
     * @param request the request parameters of GetRunningJobs  GetRunningJobsRequest
     * @return GetRunningJobsResponse
     */
    CompletableFuture<GetRunningJobsResponse> getRunningJobs(GetRunningJobsRequest request);

    /**
     * @param request the request parameters of GetTableInfo  GetTableInfoRequest
     * @return GetTableInfoResponse
     */
    CompletableFuture<GetTableInfoResponse> getTableInfo(GetTableInfoRequest request);

    /**
     * @param request the request parameters of GetTrustedProjects  GetTrustedProjectsRequest
     * @return GetTrustedProjectsResponse
     */
    CompletableFuture<GetTrustedProjectsResponse> getTrustedProjects(GetTrustedProjectsRequest request);

    /**
     * @param request the request parameters of KillJobs  KillJobsRequest
     * @return KillJobsResponse
     */
    CompletableFuture<KillJobsResponse> killJobs(KillJobsRequest request);

    /**
     * @param request the request parameters of ListComputeMetricsByInstance  ListComputeMetricsByInstanceRequest
     * @return ListComputeMetricsByInstanceResponse
     */
    CompletableFuture<ListComputeMetricsByInstanceResponse> listComputeMetricsByInstance(ListComputeMetricsByInstanceRequest request);

    /**
     * @param request the request parameters of ListComputeQuotaPlan  ListComputeQuotaPlanRequest
     * @return ListComputeQuotaPlanResponse
     */
    CompletableFuture<ListComputeQuotaPlanResponse> listComputeQuotaPlan(ListComputeQuotaPlanRequest request);

    /**
     * @param request the request parameters of ListFunctions  ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request);

    /**
     * @param request the request parameters of ListJobInfos  ListJobInfosRequest
     * @return ListJobInfosResponse
     */
    CompletableFuture<ListJobInfosResponse> listJobInfos(ListJobInfosRequest request);

    /**
     * @param request the request parameters of ListJobMetric  ListJobMetricRequest
     * @return ListJobMetricResponse
     */
    CompletableFuture<ListJobMetricResponse> listJobMetric(ListJobMetricRequest request);

    /**
     * @param request the request parameters of ListJobSnapshotInfos  ListJobSnapshotInfosRequest
     * @return ListJobSnapshotInfosResponse
     */
    CompletableFuture<ListJobSnapshotInfosResponse> listJobSnapshotInfos(ListJobSnapshotInfosRequest request);

    /**
     * @param request the request parameters of ListMmsDataSources  ListMmsDataSourcesRequest
     * @return ListMmsDataSourcesResponse
     */
    CompletableFuture<ListMmsDataSourcesResponse> listMmsDataSources(ListMmsDataSourcesRequest request);

    /**
     * @param request the request parameters of ListMmsDbs  ListMmsDbsRequest
     * @return ListMmsDbsResponse
     */
    CompletableFuture<ListMmsDbsResponse> listMmsDbs(ListMmsDbsRequest request);

    /**
     * @param request the request parameters of ListMmsJobs  ListMmsJobsRequest
     * @return ListMmsJobsResponse
     */
    CompletableFuture<ListMmsJobsResponse> listMmsJobs(ListMmsJobsRequest request);

    /**
     * @param request the request parameters of ListMmsPartitions  ListMmsPartitionsRequest
     * @return ListMmsPartitionsResponse
     */
    CompletableFuture<ListMmsPartitionsResponse> listMmsPartitions(ListMmsPartitionsRequest request);

    /**
     * @param request the request parameters of ListMmsTables  ListMmsTablesRequest
     * @return ListMmsTablesResponse
     */
    CompletableFuture<ListMmsTablesResponse> listMmsTables(ListMmsTablesRequest request);

    /**
     * @param request the request parameters of ListMmsTaskLogs  ListMmsTaskLogsRequest
     * @return ListMmsTaskLogsResponse
     */
    CompletableFuture<ListMmsTaskLogsResponse> listMmsTaskLogs(ListMmsTaskLogsRequest request);

    /**
     * @param request the request parameters of ListMmsTasks  ListMmsTasksRequest
     * @return ListMmsTasksResponse
     */
    CompletableFuture<ListMmsTasksResponse> listMmsTasks(ListMmsTasksRequest request);

    /**
     * @param request the request parameters of ListPackages  ListPackagesRequest
     * @return ListPackagesResponse
     */
    CompletableFuture<ListPackagesResponse> listPackages(ListPackagesRequest request);

    /**
     * @param request the request parameters of ListProjectUsers  ListProjectUsersRequest
     * @return ListProjectUsersResponse
     */
    CompletableFuture<ListProjectUsersResponse> listProjectUsers(ListProjectUsersRequest request);

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * @param request the request parameters of ListQuotas  ListQuotasRequest
     * @return ListQuotasResponse
     */
    CompletableFuture<ListQuotasResponse> listQuotas(ListQuotasRequest request);

    /**
     * @param request the request parameters of ListQuotasPlans  ListQuotasPlansRequest
     * @return ListQuotasPlansResponse
     */
    CompletableFuture<ListQuotasPlansResponse> listQuotasPlans(ListQuotasPlansRequest request);

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
     * @param request the request parameters of ListStoragePartitionsInfo  ListStoragePartitionsInfoRequest
     * @return ListStoragePartitionsInfoResponse
     */
    CompletableFuture<ListStoragePartitionsInfoResponse> listStoragePartitionsInfo(ListStoragePartitionsInfoRequest request);

    /**
     * @param request the request parameters of ListStorageTablesInfo  ListStorageTablesInfoRequest
     * @return ListStorageTablesInfoResponse
     */
    CompletableFuture<ListStorageTablesInfoResponse> listStorageTablesInfo(ListStorageTablesInfoRequest request);

    /**
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * @param request the request parameters of ListTunnelQuotaTimer  ListTunnelQuotaTimerRequest
     * @return ListTunnelQuotaTimerResponse
     */
    CompletableFuture<ListTunnelQuotaTimerResponse> listTunnelQuotaTimer(ListTunnelQuotaTimerRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListUsersByRole  ListUsersByRoleRequest
     * @return ListUsersByRoleResponse
     */
    CompletableFuture<ListUsersByRoleResponse> listUsersByRole(ListUsersByRoleRequest request);

    /**
     * @param request the request parameters of QueryQuota  QueryQuotaRequest
     * @return QueryQuotaResponse
     */
    CompletableFuture<QueryQuotaResponse> queryQuota(QueryQuotaRequest request);

    /**
     * @param request the request parameters of RetryMmsJob  RetryMmsJobRequest
     * @return RetryMmsJobResponse
     */
    CompletableFuture<RetryMmsJobResponse> retryMmsJob(RetryMmsJobRequest request);

    /**
     * @param request the request parameters of StartMmsJob  StartMmsJobRequest
     * @return StartMmsJobResponse
     */
    CompletableFuture<StartMmsJobResponse> startMmsJob(StartMmsJobRequest request);

    /**
     * @param request the request parameters of StopMmsJob  StopMmsJobRequest
     * @return StopMmsJobResponse
     */
    CompletableFuture<StopMmsJobResponse> stopMmsJob(StopMmsJobRequest request);

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Charges</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * @param request the request parameters of UpdateComputeQuotaPlan  UpdateComputeQuotaPlanRequest
     * @return UpdateComputeQuotaPlanResponse
     */
    CompletableFuture<UpdateComputeQuotaPlanResponse> updateComputeQuotaPlan(UpdateComputeQuotaPlanRequest request);

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the&lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/product-overview/computing-pricing-1">Pricing and Billing</a>
     * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/maxcompute/product-overview/computing-pricing-1">Pricing and Billing</a> of MaxCompute Elastic Reserved CU.</p>
     * 
     * @param request the request parameters of UpdateComputeQuotaSchedule  UpdateComputeQuotaScheduleRequest
     * @return UpdateComputeQuotaScheduleResponse
     */
    CompletableFuture<UpdateComputeQuotaScheduleResponse> updateComputeQuotaSchedule(UpdateComputeQuotaScheduleRequest request);

    /**
     * @param request the request parameters of UpdateComputeSubQuota  UpdateComputeSubQuotaRequest
     * @return UpdateComputeSubQuotaResponse
     */
    CompletableFuture<UpdateComputeSubQuotaResponse> updateComputeSubQuota(UpdateComputeSubQuotaRequest request);

    /**
     * @param request the request parameters of UpdateMmsDataSource  UpdateMmsDataSourceRequest
     * @return UpdateMmsDataSourceResponse
     */
    CompletableFuture<UpdateMmsDataSourceResponse> updateMmsDataSource(UpdateMmsDataSourceRequest request);

    /**
     * @param request the request parameters of UpdatePackage  UpdatePackageRequest
     * @return UpdatePackageResponse
     */
    CompletableFuture<UpdatePackageResponse> updatePackage(UpdatePackageRequest request);

    /**
     * @param request the request parameters of UpdateProjectBasicMeta  UpdateProjectBasicMetaRequest
     * @return UpdateProjectBasicMetaResponse
     */
    CompletableFuture<UpdateProjectBasicMetaResponse> updateProjectBasicMeta(UpdateProjectBasicMetaRequest request);

    /**
     * @param request the request parameters of UpdateProjectDefaultQuota  UpdateProjectDefaultQuotaRequest
     * @return UpdateProjectDefaultQuotaResponse
     */
    CompletableFuture<UpdateProjectDefaultQuotaResponse> updateProjectDefaultQuota(UpdateProjectDefaultQuotaRequest request);

    /**
     * @param request the request parameters of UpdateProjectIpWhiteList  UpdateProjectIpWhiteListRequest
     * @return UpdateProjectIpWhiteListResponse
     */
    CompletableFuture<UpdateProjectIpWhiteListResponse> updateProjectIpWhiteList(UpdateProjectIpWhiteListRequest request);

    /**
     * @param request the request parameters of UpdateQuotaPlan  UpdateQuotaPlanRequest
     * @return UpdateQuotaPlanResponse
     */
    CompletableFuture<UpdateQuotaPlanResponse> updateQuotaPlan(UpdateQuotaPlanRequest request);

    /**
     * @param request the request parameters of UpdateQuotaSchedule  UpdateQuotaScheduleRequest
     * @return UpdateQuotaScheduleResponse
     */
    CompletableFuture<UpdateQuotaScheduleResponse> updateQuotaSchedule(UpdateQuotaScheduleRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://www.alibabacloud.com/help/maxcompute/product-overview/data-transfer-fees-hourly-billing">billing and prices</a> of Tunnel quotas and elastically reserved computing resources.</p>
     * 
     * @param request the request parameters of UpdateTunnelQuotaTimer  UpdateTunnelQuotaTimerRequest
     * @return UpdateTunnelQuotaTimerResponse
     */
    CompletableFuture<UpdateTunnelQuotaTimerResponse> updateTunnelQuotaTimer(UpdateTunnelQuotaTimerRequest request);

}
