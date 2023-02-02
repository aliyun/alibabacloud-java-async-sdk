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

    /**
      * To call this operation, you must add the IP address of the OceanBase Migration Service (OMS) server to the whitelist of the Alibaba Cloud database instance, the security rules of the ECS instance, or the security settings of your self-managed database (usually the firewall of your self-managed database) to ensure that OMS can successfully access your database instance. To obtain the IP address of the OMS server, go to the OMS data source management page in the OMS console.
      *
     */
    CompletableFuture<CreateOmsMysqlDataSourceResponse> createOmsMysqlDataSource(CreateOmsMysqlDataSourceRequest request);

    CompletableFuture<CreateOmsOpenAPIProjectResponse> createOmsOpenAPIProject(CreateOmsOpenAPIProjectRequest request);

    CompletableFuture<CreateSecurityIpGroupResponse> createSecurityIpGroup(CreateSecurityIpGroupRequest request);

    CompletableFuture<CreateTenantResponse> createTenant(CreateTenantRequest request);

    CompletableFuture<CreateTenantReadOnlyConnectionResponse> createTenantReadOnlyConnection(CreateTenantReadOnlyConnectionRequest request);

    CompletableFuture<CreateTenantUserResponse> createTenantUser(CreateTenantUserRequest request);

    CompletableFuture<DeleteDatabasesResponse> deleteDatabases(DeleteDatabasesRequest request);

    /**
      * Before you call this operation, ensure that the following requirements are met:
      * - The cluster is in the Running state.
      * - The cluster is a primary cluster and the billing method is pay-as-you-go.
      *
     */
    CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request);

    CompletableFuture<DeleteOmsOpenAPIProjectResponse> deleteOmsOpenAPIProject(DeleteOmsOpenAPIProjectRequest request);

    CompletableFuture<DeleteSecurityIpGroupResponse> deleteSecurityIpGroup(DeleteSecurityIpGroupRequest request);

    CompletableFuture<DeleteTenantUsersResponse> deleteTenantUsers(DeleteTenantUsersRequest request);

    CompletableFuture<DeleteTenantsResponse> deleteTenants(DeleteTenantsRequest request);

    CompletableFuture<DescribeAnomalySQLListResponse> describeAnomalySQLList(DescribeAnomalySQLListRequest request);

    CompletableFuture<DescribeAvailableCpuResourceResponse> describeAvailableCpuResource(DescribeAvailableCpuResourceRequest request);

    CompletableFuture<DescribeAvailableMemResourceResponse> describeAvailableMemResource(DescribeAvailableMemResourceRequest request);

    CompletableFuture<DescribeCharsetResponse> describeCharset(DescribeCharsetRequest request);

    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeInstanceCreatableZoneResponse> describeInstanceCreatableZone(DescribeInstanceCreatableZoneRequest request);

    CompletableFuture<DescribeInstanceTagsResponse> describeInstanceTags(DescribeInstanceTagsRequest request);

    CompletableFuture<DescribeInstanceTenantModesResponse> describeInstanceTenantModes(DescribeInstanceTenantModesRequest request);

    CompletableFuture<DescribeInstanceTopologyResponse> describeInstanceTopology(DescribeInstanceTopologyRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeNodeMetricsResponse> describeNodeMetrics(DescribeNodeMetricsRequest request);

    CompletableFuture<DescribeOmsOpenAPIProjectResponse> describeOmsOpenAPIProject(DescribeOmsOpenAPIProjectRequest request);

    CompletableFuture<DescribeOmsOpenAPIProjectStepsResponse> describeOmsOpenAPIProjectSteps(DescribeOmsOpenAPIProjectStepsRequest request);

    CompletableFuture<DescribeOutlineBindingResponse> describeOutlineBinding(DescribeOutlineBindingRequest request);

    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    CompletableFuture<DescribeParametersHistoryResponse> describeParametersHistory(DescribeParametersHistoryRequest request);

    CompletableFuture<DescribeRecommendIndexResponse> describeRecommendIndex(DescribeRecommendIndexRequest request);

    CompletableFuture<DescribeSQLDetailsResponse> describeSQLDetails(DescribeSQLDetailsRequest request);

    CompletableFuture<DescribeSQLHistoryListResponse> describeSQLHistoryList(DescribeSQLHistoryListRequest request);

    CompletableFuture<DescribeSQLPlansResponse> describeSQLPlans(DescribeSQLPlansRequest request);

    CompletableFuture<DescribeSecurityIpGroupsResponse> describeSecurityIpGroups(DescribeSecurityIpGroupsRequest request);

    CompletableFuture<DescribeSlowSQLHistoryListResponse> describeSlowSQLHistoryList(DescribeSlowSQLHistoryListRequest request);

    CompletableFuture<DescribeSlowSQLListResponse> describeSlowSQLList(DescribeSlowSQLListRequest request);

    CompletableFuture<DescribeTenantResponse> describeTenant(DescribeTenantRequest request);

    CompletableFuture<DescribeTenantMetricsResponse> describeTenantMetrics(DescribeTenantMetricsRequest request);

    CompletableFuture<DescribeTenantTagsResponse> describeTenantTags(DescribeTenantTagsRequest request);

    CompletableFuture<DescribeTenantUserRolesResponse> describeTenantUserRoles(DescribeTenantUserRolesRequest request);

    CompletableFuture<DescribeTenantUsersResponse> describeTenantUsers(DescribeTenantUsersRequest request);

    CompletableFuture<DescribeTenantZonesReadResponse> describeTenantZonesRead(DescribeTenantZonesReadRequest request);

    CompletableFuture<DescribeTenantsResponse> describeTenants(DescribeTenantsRequest request);

    CompletableFuture<DescribeTimeZonesResponse> describeTimeZones(DescribeTimeZonesRequest request);

    CompletableFuture<DescribeTopSQLListResponse> describeTopSQLList(DescribeTopSQLListRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<ModifyDatabaseDescriptionResponse> modifyDatabaseDescription(ModifyDatabaseDescriptionRequest request);

    CompletableFuture<ModifyDatabaseUserRolesResponse> modifyDatabaseUserRoles(ModifyDatabaseUserRolesRequest request);

    CompletableFuture<ModifyInstanceNameResponse> modifyInstanceName(ModifyInstanceNameRequest request);

    CompletableFuture<ModifyInstanceTagsResponse> modifyInstanceTags(ModifyInstanceTagsRequest request);

    CompletableFuture<ModifyParametersResponse> modifyParameters(ModifyParametersRequest request);

    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    CompletableFuture<ModifyTenantPrimaryZoneResponse> modifyTenantPrimaryZone(ModifyTenantPrimaryZoneRequest request);

    CompletableFuture<ModifyTenantResourceResponse> modifyTenantResource(ModifyTenantResourceRequest request);

    CompletableFuture<ModifyTenantTagsResponse> modifyTenantTags(ModifyTenantTagsRequest request);

    CompletableFuture<ModifyTenantUserDescriptionResponse> modifyTenantUserDescription(ModifyTenantUserDescriptionRequest request);

    CompletableFuture<ModifyTenantUserPasswordResponse> modifyTenantUserPassword(ModifyTenantUserPasswordRequest request);

    CompletableFuture<ModifyTenantUserRolesResponse> modifyTenantUserRoles(ModifyTenantUserRolesRequest request);

    CompletableFuture<ModifyTenantUserStatusResponse> modifyTenantUserStatus(ModifyTenantUserStatusRequest request);

    CompletableFuture<ReleaseOmsOpenAPIProjectResponse> releaseOmsOpenAPIProject(ReleaseOmsOpenAPIProjectRequest request);

    CompletableFuture<ResetOmsOpenAPIProjectResponse> resetOmsOpenAPIProject(ResetOmsOpenAPIProjectRequest request);

    CompletableFuture<ResumeOmsOpenAPIProjectResponse> resumeOmsOpenAPIProject(ResumeOmsOpenAPIProjectRequest request);

    CompletableFuture<SearchOmsOpenAPIMonitorMetricResponse> searchOmsOpenAPIMonitorMetric(SearchOmsOpenAPIMonitorMetricRequest request);

    CompletableFuture<SearchOmsOpenAPIProjectsResponse> searchOmsOpenAPIProjects(SearchOmsOpenAPIProjectsRequest request);

    CompletableFuture<StartOmsOpenAPIProjectResponse> startOmsOpenAPIProject(StartOmsOpenAPIProjectRequest request);

    CompletableFuture<StopOmsOpenAPIProjectResponse> stopOmsOpenAPIProject(StopOmsOpenAPIProjectRequest request);

}
