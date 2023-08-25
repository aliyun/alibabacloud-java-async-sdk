// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.oceanbasepro20190901.models.*;
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

    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateLabelResponse> createLabel(CreateLabelRequest request);

    CompletableFuture<CreateMySqlDataSourceResponse> createMySqlDataSource(CreateMySqlDataSourceRequest request);

    CompletableFuture<CreateOceanBaseDataSourceResponse> createOceanBaseDataSource(CreateOceanBaseDataSourceRequest request);

    /**
      * To call this operation, you must add the IP address of the OceanBase Migration Service (OMS) server to the whitelist of the Alibaba Cloud database instance, the security rules of the ECS instance, or the security settings of your self-managed database (usually the firewall of your self-managed database) to ensure that OMS can successfully access your database instance. To obtain the IP address of the OMS server, go to the OMS data source management page in the OMS console.
      *
     */
    CompletableFuture<CreateOmsMysqlDataSourceResponse> createOmsMysqlDataSource(CreateOmsMysqlDataSourceRequest request);

    CompletableFuture<CreateOmsOpenAPIProjectResponse> createOmsOpenAPIProject(CreateOmsOpenAPIProjectRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateSecurityIpGroupResponse> createSecurityIpGroup(CreateSecurityIpGroupRequest request);

    CompletableFuture<CreateTenantResponse> createTenant(CreateTenantRequest request);

    CompletableFuture<CreateTenantReadOnlyConnectionResponse> createTenantReadOnlyConnection(CreateTenantReadOnlyConnectionRequest request);

    CompletableFuture<CreateTenantSecurityIpGroupResponse> createTenantSecurityIpGroup(CreateTenantSecurityIpGroupRequest request);

    CompletableFuture<CreateTenantUserResponse> createTenantUser(CreateTenantUserRequest request);

    CompletableFuture<DeleteDatabasesResponse> deleteDatabases(DeleteDatabasesRequest request);

    /**
      * Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.
      *
     */
    CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request);

    CompletableFuture<DeleteOmsOpenAPIProjectResponse> deleteOmsOpenAPIProject(DeleteOmsOpenAPIProjectRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteSecurityIpGroupResponse> deleteSecurityIpGroup(DeleteSecurityIpGroupRequest request);

    CompletableFuture<DeleteTenantSecurityIpGroupResponse> deleteTenantSecurityIpGroup(DeleteTenantSecurityIpGroupRequest request);

    CompletableFuture<DeleteTenantUsersResponse> deleteTenantUsers(DeleteTenantUsersRequest request);

    CompletableFuture<DeleteTenantsResponse> deleteTenants(DeleteTenantsRequest request);

    CompletableFuture<DescribeAnomalySQLListResponse> describeAnomalySQLList(DescribeAnomalySQLListRequest request);

    CompletableFuture<DescribeAvailableCpuResourceResponse> describeAvailableCpuResource(DescribeAvailableCpuResourceRequest request);

    CompletableFuture<DescribeAvailableMemResourceResponse> describeAvailableMemResource(DescribeAvailableMemResourceRequest request);

    CompletableFuture<DescribeCharsetResponse> describeCharset(DescribeCharsetRequest request);

    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeInstanceCreatableZoneResponse> describeInstanceCreatableZone(DescribeInstanceCreatableZoneRequest request);

    CompletableFuture<DescribeInstanceSecurityConfigsResponse> describeInstanceSecurityConfigs(DescribeInstanceSecurityConfigsRequest request);

    CompletableFuture<DescribeInstanceTagsResponse> describeInstanceTags(DescribeInstanceTagsRequest request);

    CompletableFuture<DescribeInstanceTenantModesResponse> describeInstanceTenantModes(DescribeInstanceTenantModesRequest request);

    CompletableFuture<DescribeInstanceTopologyResponse> describeInstanceTopology(DescribeInstanceTopologyRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeNodeMetricsResponse> describeNodeMetrics(DescribeNodeMetricsRequest request);

    CompletableFuture<DescribeOasAnomalySQLListResponse> describeOasAnomalySQLList(DescribeOasAnomalySQLListRequest request);

    CompletableFuture<DescribeOasSQLDetailsResponse> describeOasSQLDetails(DescribeOasSQLDetailsRequest request);

    CompletableFuture<DescribeOasSQLHistoryListResponse> describeOasSQLHistoryList(DescribeOasSQLHistoryListRequest request);

    CompletableFuture<DescribeOasSQLPlansResponse> describeOasSQLPlans(DescribeOasSQLPlansRequest request);

    CompletableFuture<DescribeOasSlowSQLListResponse> describeOasSlowSQLList(DescribeOasSlowSQLListRequest request);

    CompletableFuture<DescribeOasTopSQLListResponse> describeOasTopSQLList(DescribeOasTopSQLListRequest request);

    CompletableFuture<DescribeOmsOpenAPIProjectResponse> describeOmsOpenAPIProject(DescribeOmsOpenAPIProjectRequest request);

    CompletableFuture<DescribeOmsOpenAPIProjectStepsResponse> describeOmsOpenAPIProjectSteps(DescribeOmsOpenAPIProjectStepsRequest request);

    CompletableFuture<DescribeOutlineBindingResponse> describeOutlineBinding(DescribeOutlineBindingRequest request);

    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    CompletableFuture<DescribeParametersHistoryResponse> describeParametersHistory(DescribeParametersHistoryRequest request);

    CompletableFuture<DescribeProjectResponse> describeProject(DescribeProjectRequest request);

    CompletableFuture<DescribeProjectComponentsResponse> describeProjectComponents(DescribeProjectComponentsRequest request);

    CompletableFuture<DescribeProjectProgressResponse> describeProjectProgress(DescribeProjectProgressRequest request);

    CompletableFuture<DescribeProjectStepMetricResponse> describeProjectStepMetric(DescribeProjectStepMetricRequest request);

    CompletableFuture<DescribeProjectStepsResponse> describeProjectSteps(DescribeProjectStepsRequest request);

    CompletableFuture<DescribeRecommendIndexResponse> describeRecommendIndex(DescribeRecommendIndexRequest request);

    CompletableFuture<DescribeSQLDetailsResponse> describeSQLDetails(DescribeSQLDetailsRequest request);

    CompletableFuture<DescribeSQLHistoryListResponse> describeSQLHistoryList(DescribeSQLHistoryListRequest request);

    CompletableFuture<DescribeSQLPlansResponse> describeSQLPlans(DescribeSQLPlansRequest request);

    CompletableFuture<DescribeSQLSamplesResponse> describeSQLSamples(DescribeSQLSamplesRequest request);

    CompletableFuture<DescribeSecurityIpGroupsResponse> describeSecurityIpGroups(DescribeSecurityIpGroupsRequest request);

    CompletableFuture<DescribeSlowSQLHistoryListResponse> describeSlowSQLHistoryList(DescribeSlowSQLHistoryListRequest request);

    CompletableFuture<DescribeSlowSQLListResponse> describeSlowSQLList(DescribeSlowSQLListRequest request);

    CompletableFuture<DescribeTenantResponse> describeTenant(DescribeTenantRequest request);

    CompletableFuture<DescribeTenantMetricsResponse> describeTenantMetrics(DescribeTenantMetricsRequest request);

    CompletableFuture<DescribeTenantSecurityConfigsResponse> describeTenantSecurityConfigs(DescribeTenantSecurityConfigsRequest request);

    CompletableFuture<DescribeTenantSecurityIpGroupsResponse> describeTenantSecurityIpGroups(DescribeTenantSecurityIpGroupsRequest request);

    CompletableFuture<DescribeTenantTagsResponse> describeTenantTags(DescribeTenantTagsRequest request);

    CompletableFuture<DescribeTenantUserRolesResponse> describeTenantUserRoles(DescribeTenantUserRolesRequest request);

    CompletableFuture<DescribeTenantUsersResponse> describeTenantUsers(DescribeTenantUsersRequest request);

    CompletableFuture<DescribeTenantZonesReadResponse> describeTenantZonesRead(DescribeTenantZonesReadRequest request);

    CompletableFuture<DescribeTenantsResponse> describeTenants(DescribeTenantsRequest request);

    CompletableFuture<DescribeTimeZonesResponse> describeTimeZones(DescribeTimeZonesRequest request);

    CompletableFuture<DescribeTopSQLListResponse> describeTopSQLList(DescribeTopSQLListRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<GetUploadOssUrlResponse> getUploadOssUrl(GetUploadOssUrlRequest request);

    CompletableFuture<KillProcessListResponse> killProcessList(KillProcessListRequest request);

    CompletableFuture<ListAllLabelsResponse> listAllLabels(ListAllLabelsRequest request);

    CompletableFuture<ListDataSourceResponse> listDataSource(ListDataSourceRequest request);

    CompletableFuture<ListProjectFullVerifyResultResponse> listProjectFullVerifyResult(ListProjectFullVerifyResultRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListWorkerInstancesResponse> listWorkerInstances(ListWorkerInstancesRequest request);

    CompletableFuture<ModifyDatabaseDescriptionResponse> modifyDatabaseDescription(ModifyDatabaseDescriptionRequest request);

    CompletableFuture<ModifyDatabaseUserRolesResponse> modifyDatabaseUserRoles(ModifyDatabaseUserRolesRequest request);

    CompletableFuture<ModifyInstanceNameResponse> modifyInstanceName(ModifyInstanceNameRequest request);

    CompletableFuture<ModifyInstanceNodeNumResponse> modifyInstanceNodeNum(ModifyInstanceNodeNumRequest request);

    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    CompletableFuture<ModifyInstanceTagsResponse> modifyInstanceTags(ModifyInstanceTagsRequest request);

    CompletableFuture<ModifyParametersResponse> modifyParameters(ModifyParametersRequest request);

    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    CompletableFuture<ModifyTenantPrimaryZoneResponse> modifyTenantPrimaryZone(ModifyTenantPrimaryZoneRequest request);

    CompletableFuture<ModifyTenantResourceResponse> modifyTenantResource(ModifyTenantResourceRequest request);

    CompletableFuture<ModifyTenantSecurityIpGroupResponse> modifyTenantSecurityIpGroup(ModifyTenantSecurityIpGroupRequest request);

    CompletableFuture<ModifyTenantTagsResponse> modifyTenantTags(ModifyTenantTagsRequest request);

    CompletableFuture<ModifyTenantUserDescriptionResponse> modifyTenantUserDescription(ModifyTenantUserDescriptionRequest request);

    CompletableFuture<ModifyTenantUserPasswordResponse> modifyTenantUserPassword(ModifyTenantUserPasswordRequest request);

    CompletableFuture<ModifyTenantUserRolesResponse> modifyTenantUserRoles(ModifyTenantUserRolesRequest request);

    CompletableFuture<ModifyTenantUserStatusResponse> modifyTenantUserStatus(ModifyTenantUserStatusRequest request);

    CompletableFuture<ReleaseOmsOpenAPIProjectResponse> releaseOmsOpenAPIProject(ReleaseOmsOpenAPIProjectRequest request);

    CompletableFuture<ReleaseProjectResponse> releaseProject(ReleaseProjectRequest request);

    CompletableFuture<ResetOmsOpenAPIProjectResponse> resetOmsOpenAPIProject(ResetOmsOpenAPIProjectRequest request);

    CompletableFuture<ResumeOmsOpenAPIProjectResponse> resumeOmsOpenAPIProject(ResumeOmsOpenAPIProjectRequest request);

    CompletableFuture<ResumeProjectResponse> resumeProject(ResumeProjectRequest request);

    CompletableFuture<SearchOmsOpenAPIMonitorMetricResponse> searchOmsOpenAPIMonitorMetric(SearchOmsOpenAPIMonitorMetricRequest request);

    CompletableFuture<SearchOmsOpenAPIProjectsResponse> searchOmsOpenAPIProjects(SearchOmsOpenAPIProjectsRequest request);

    CompletableFuture<StartOmsOpenAPIProjectResponse> startOmsOpenAPIProject(StartOmsOpenAPIProjectRequest request);

    CompletableFuture<StartProjectResponse> startProject(StartProjectRequest request);

    CompletableFuture<StartProjectsByLabelResponse> startProjectsByLabel(StartProjectsByLabelRequest request);

    CompletableFuture<StopOmsOpenAPIProjectResponse> stopOmsOpenAPIProject(StopOmsOpenAPIProjectRequest request);

    CompletableFuture<StopProjectResponse> stopProject(StopProjectRequest request);

    CompletableFuture<StopProjectsByLabelResponse> stopProjectsByLabel(StopProjectsByLabelRequest request);

    CompletableFuture<SwitchoverInstanceResponse> switchoverInstance(SwitchoverInstanceRequest request);

}
