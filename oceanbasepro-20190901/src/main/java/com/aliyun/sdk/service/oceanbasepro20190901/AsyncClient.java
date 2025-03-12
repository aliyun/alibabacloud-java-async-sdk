// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.oceanbasepro20190901.models.*;
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
     * @param request the request parameters of BatchKillProcessList  BatchKillProcessListRequest
     * @return BatchKillProcessListResponse
     */
    CompletableFuture<BatchKillProcessListResponse> batchKillProcessList(BatchKillProcessListRequest request);

    /**
     * @param request the request parameters of BatchKillSessionList  BatchKillSessionListRequest
     * @return BatchKillSessionListResponse
     */
    CompletableFuture<BatchKillSessionListResponse> batchKillSessionList(BatchKillSessionListRequest request);

    /**
     * @param request the request parameters of CancelProjectModifyRecord  CancelProjectModifyRecordRequest
     * @return CancelProjectModifyRecordResponse
     */
    CompletableFuture<CancelProjectModifyRecordResponse> cancelProjectModifyRecord(CancelProjectModifyRecordRequest request);

    /**
     * @param request the request parameters of CreateBackupSetDownloadLink  CreateBackupSetDownloadLinkRequest
     * @return CreateBackupSetDownloadLinkResponse
     */
    CompletableFuture<CreateBackupSetDownloadLinkResponse> createBackupSetDownloadLink(CreateBackupSetDownloadLinkRequest request);

    /**
     * @param request the request parameters of CreateDatabase  CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateLabel  CreateLabelRequest
     * @return CreateLabelResponse
     */
    CompletableFuture<CreateLabelResponse> createLabel(CreateLabelRequest request);

    /**
     * @param request the request parameters of CreateMySqlDataSource  CreateMySqlDataSourceRequest
     * @return CreateMySqlDataSourceResponse
     */
    CompletableFuture<CreateMySqlDataSourceResponse> createMySqlDataSource(CreateMySqlDataSourceRequest request);

    /**
     * @param request the request parameters of CreateOceanBaseDataSource  CreateOceanBaseDataSourceRequest
     * @return CreateOceanBaseDataSourceResponse
     */
    CompletableFuture<CreateOceanBaseDataSourceResponse> createOceanBaseDataSource(CreateOceanBaseDataSourceRequest request);

    /**
     * <b>description</b> :
     * <p>To call this operation, you must add the IP address of the OceanBase Migration Service (OMS) server to the whitelist of the Alibaba Cloud database instance, the security rules of the ECS instance, or the security settings of your self-managed database (usually the firewall of your self-managed database) to ensure that OMS can successfully access your database instance. To obtain the IP address of the OMS server, go to the OMS data source management page in the OMS console.</p>
     * 
     * @param request the request parameters of CreateOmsMysqlDataSource  CreateOmsMysqlDataSourceRequest
     * @return CreateOmsMysqlDataSourceResponse
     */
    CompletableFuture<CreateOmsMysqlDataSourceResponse> createOmsMysqlDataSource(CreateOmsMysqlDataSourceRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of CreateProjectModifyRecords  CreateProjectModifyRecordsRequest
     * @return CreateProjectModifyRecordsResponse
     */
    CompletableFuture<CreateProjectModifyRecordsResponse> createProjectModifyRecords(CreateProjectModifyRecordsRequest request);

    /**
     * @param request the request parameters of CreateRdsPostgreSQLDataSource  CreateRdsPostgreSQLDataSourceRequest
     * @return CreateRdsPostgreSQLDataSourceResponse
     */
    CompletableFuture<CreateRdsPostgreSQLDataSourceResponse> createRdsPostgreSQLDataSource(CreateRdsPostgreSQLDataSourceRequest request);

    /**
     * @param request the request parameters of CreateSecurityIpGroup  CreateSecurityIpGroupRequest
     * @return CreateSecurityIpGroupResponse
     */
    CompletableFuture<CreateSecurityIpGroupResponse> createSecurityIpGroup(CreateSecurityIpGroupRequest request);

    /**
     * @param request the request parameters of CreateTag  CreateTagRequest
     * @return CreateTagResponse
     */
    CompletableFuture<CreateTagResponse> createTag(CreateTagRequest request);

    /**
     * @param request the request parameters of CreateTagValue  CreateTagValueRequest
     * @return CreateTagValueResponse
     */
    CompletableFuture<CreateTagValueResponse> createTagValue(CreateTagValueRequest request);

    /**
     * @param request the request parameters of CreateTenant  CreateTenantRequest
     * @return CreateTenantResponse
     */
    CompletableFuture<CreateTenantResponse> createTenant(CreateTenantRequest request);

    /**
     * @param request the request parameters of CreateTenantReadOnlyConnection  CreateTenantReadOnlyConnectionRequest
     * @return CreateTenantReadOnlyConnectionResponse
     */
    CompletableFuture<CreateTenantReadOnlyConnectionResponse> createTenantReadOnlyConnection(CreateTenantReadOnlyConnectionRequest request);

    /**
     * @param request the request parameters of CreateTenantSecurityIpGroup  CreateTenantSecurityIpGroupRequest
     * @return CreateTenantSecurityIpGroupResponse
     */
    CompletableFuture<CreateTenantSecurityIpGroupResponse> createTenantSecurityIpGroup(CreateTenantSecurityIpGroupRequest request);

    /**
     * @param request the request parameters of CreateTenantUser  CreateTenantUserRequest
     * @return CreateTenantUserResponse
     */
    CompletableFuture<CreateTenantUserResponse> createTenantUser(CreateTenantUserRequest request);

    /**
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteDatabases  DeleteDatabasesRequest
     * @return DeleteDatabasesResponse
     */
    CompletableFuture<DeleteDatabasesResponse> deleteDatabases(DeleteDatabasesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that the following requirements are met:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The cluster is a primary cluster and the billing method is pay-as-you-go.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstances  DeleteInstancesRequest
     * @return DeleteInstancesResponse
     */
    CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request);

    /**
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    /**
     * @param request the request parameters of DeleteSecurityIpGroup  DeleteSecurityIpGroupRequest
     * @return DeleteSecurityIpGroupResponse
     */
    CompletableFuture<DeleteSecurityIpGroupResponse> deleteSecurityIpGroup(DeleteSecurityIpGroupRequest request);

    /**
     * @param request the request parameters of DeleteTag  DeleteTagRequest
     * @return DeleteTagResponse
     */
    CompletableFuture<DeleteTagResponse> deleteTag(DeleteTagRequest request);

    /**
     * @param request the request parameters of DeleteTagValue  DeleteTagValueRequest
     * @return DeleteTagValueResponse
     */
    CompletableFuture<DeleteTagValueResponse> deleteTagValue(DeleteTagValueRequest request);

    /**
     * @param request the request parameters of DeleteTenantSecurityIpGroup  DeleteTenantSecurityIpGroupRequest
     * @return DeleteTenantSecurityIpGroupResponse
     */
    CompletableFuture<DeleteTenantSecurityIpGroupResponse> deleteTenantSecurityIpGroup(DeleteTenantSecurityIpGroupRequest request);

    /**
     * @param request the request parameters of DeleteTenantUsers  DeleteTenantUsersRequest
     * @return DeleteTenantUsersResponse
     */
    CompletableFuture<DeleteTenantUsersResponse> deleteTenantUsers(DeleteTenantUsersRequest request);

    /**
     * @param request the request parameters of DeleteTenants  DeleteTenantsRequest
     * @return DeleteTenantsResponse
     */
    CompletableFuture<DeleteTenantsResponse> deleteTenants(DeleteTenantsRequest request);

    /**
     * @param request the request parameters of DescribeAnomalySQLList  DescribeAnomalySQLListRequest
     * @return DescribeAnomalySQLListResponse
     */
    CompletableFuture<DescribeAnomalySQLListResponse> describeAnomalySQLList(DescribeAnomalySQLListRequest request);

    /**
     * @param request the request parameters of DescribeAvailableCpuResource  DescribeAvailableCpuResourceRequest
     * @return DescribeAvailableCpuResourceResponse
     */
    CompletableFuture<DescribeAvailableCpuResourceResponse> describeAvailableCpuResource(DescribeAvailableCpuResourceRequest request);

    /**
     * @param request the request parameters of DescribeAvailableMemResource  DescribeAvailableMemResourceRequest
     * @return DescribeAvailableMemResourceResponse
     */
    CompletableFuture<DescribeAvailableMemResourceResponse> describeAvailableMemResource(DescribeAvailableMemResourceRequest request);

    /**
     * @param request the request parameters of DescribeAvailableSpec  DescribeAvailableSpecRequest
     * @return DescribeAvailableSpecResponse
     */
    CompletableFuture<DescribeAvailableSpecResponse> describeAvailableSpec(DescribeAvailableSpecRequest request);

    /**
     * @param request the request parameters of DescribeAvailableZone  DescribeAvailableZoneRequest
     * @return DescribeAvailableZoneResponse
     */
    CompletableFuture<DescribeAvailableZoneResponse> describeAvailableZone(DescribeAvailableZoneRequest request);

    /**
     * @param request the request parameters of DescribeBackupEncryptedString  DescribeBackupEncryptedStringRequest
     * @return DescribeBackupEncryptedStringResponse
     */
    CompletableFuture<DescribeBackupEncryptedStringResponse> describeBackupEncryptedString(DescribeBackupEncryptedStringRequest request);

    /**
     * @param request the request parameters of DescribeBackupSetDownloadLink  DescribeBackupSetDownloadLinkRequest
     * @return DescribeBackupSetDownloadLinkResponse
     */
    CompletableFuture<DescribeBackupSetDownloadLinkResponse> describeBackupSetDownloadLink(DescribeBackupSetDownloadLinkRequest request);

    /**
     * @param request the request parameters of DescribeCharset  DescribeCharsetRequest
     * @return DescribeCharsetResponse
     */
    CompletableFuture<DescribeCharsetResponse> describeCharset(DescribeCharsetRequest request);

    /**
     * @param request the request parameters of DescribeDataBackupSet  DescribeDataBackupSetRequest
     * @return DescribeDataBackupSetResponse
     */
    CompletableFuture<DescribeDataBackupSetResponse> describeDataBackupSet(DescribeDataBackupSetRequest request);

    /**
     * @param request the request parameters of DescribeDatabases  DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     */
    CompletableFuture<DescribeDatabasesResponse> describeDatabases(DescribeDatabasesRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeInstanceCreatableZone  DescribeInstanceCreatableZoneRequest
     * @return DescribeInstanceCreatableZoneResponse
     */
    CompletableFuture<DescribeInstanceCreatableZoneResponse> describeInstanceCreatableZone(DescribeInstanceCreatableZoneRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSSL  DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     */
    CompletableFuture<DescribeInstanceSSLResponse> describeInstanceSSL(DescribeInstanceSSLRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSecurityConfigs  DescribeInstanceSecurityConfigsRequest
     * @return DescribeInstanceSecurityConfigsResponse
     */
    CompletableFuture<DescribeInstanceSecurityConfigsResponse> describeInstanceSecurityConfigs(DescribeInstanceSecurityConfigsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSummary  DescribeInstanceSummaryRequest
     * @return DescribeInstanceSummaryResponse
     */
    CompletableFuture<DescribeInstanceSummaryResponse> describeInstanceSummary(DescribeInstanceSummaryRequest request);

    /**
     * @param request the request parameters of DescribeInstanceTags  DescribeInstanceTagsRequest
     * @return DescribeInstanceTagsResponse
     */
    CompletableFuture<DescribeInstanceTagsResponse> describeInstanceTags(DescribeInstanceTagsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceTenantModes  DescribeInstanceTenantModesRequest
     * @return DescribeInstanceTenantModesResponse
     */
    CompletableFuture<DescribeInstanceTenantModesResponse> describeInstanceTenantModes(DescribeInstanceTenantModesRequest request);

    /**
     * @param request the request parameters of DescribeInstanceTopology  DescribeInstanceTopologyRequest
     * @return DescribeInstanceTopologyResponse
     */
    CompletableFuture<DescribeInstanceTopologyResponse> describeInstanceTopology(DescribeInstanceTopologyRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeMetricsData  DescribeMetricsDataRequest
     * @return DescribeMetricsDataResponse
     */
    CompletableFuture<DescribeMetricsDataResponse> describeMetricsData(DescribeMetricsDataRequest request);

    /**
     * @param request the request parameters of DescribeNodeMetrics  DescribeNodeMetricsRequest
     * @return DescribeNodeMetricsResponse
     */
    CompletableFuture<DescribeNodeMetricsResponse> describeNodeMetrics(DescribeNodeMetricsRequest request);

    /**
     * @param request the request parameters of DescribeOasAnomalySQLList  DescribeOasAnomalySQLListRequest
     * @return DescribeOasAnomalySQLListResponse
     */
    CompletableFuture<DescribeOasAnomalySQLListResponse> describeOasAnomalySQLList(DescribeOasAnomalySQLListRequest request);

    /**
     * @param request the request parameters of DescribeOasSQLDetails  DescribeOasSQLDetailsRequest
     * @return DescribeOasSQLDetailsResponse
     */
    CompletableFuture<DescribeOasSQLDetailsResponse> describeOasSQLDetails(DescribeOasSQLDetailsRequest request);

    /**
     * @param request the request parameters of DescribeOasSQLHistoryList  DescribeOasSQLHistoryListRequest
     * @return DescribeOasSQLHistoryListResponse
     */
    CompletableFuture<DescribeOasSQLHistoryListResponse> describeOasSQLHistoryList(DescribeOasSQLHistoryListRequest request);

    /**
     * @param request the request parameters of DescribeOasSQLPlans  DescribeOasSQLPlansRequest
     * @return DescribeOasSQLPlansResponse
     */
    CompletableFuture<DescribeOasSQLPlansResponse> describeOasSQLPlans(DescribeOasSQLPlansRequest request);

    /**
     * @param request the request parameters of DescribeOasSlowSQLList  DescribeOasSlowSQLListRequest
     * @return DescribeOasSlowSQLListResponse
     */
    CompletableFuture<DescribeOasSlowSQLListResponse> describeOasSlowSQLList(DescribeOasSlowSQLListRequest request);

    /**
     * @param request the request parameters of DescribeOasTopSQLList  DescribeOasTopSQLListRequest
     * @return DescribeOasTopSQLListResponse
     */
    CompletableFuture<DescribeOasTopSQLListResponse> describeOasTopSQLList(DescribeOasTopSQLListRequest request);

    /**
     * @param request the request parameters of DescribeOutlineBinding  DescribeOutlineBindingRequest
     * @return DescribeOutlineBindingResponse
     */
    CompletableFuture<DescribeOutlineBindingResponse> describeOutlineBinding(DescribeOutlineBindingRequest request);

    /**
     * @param request the request parameters of DescribeParameters  DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    /**
     * @param request the request parameters of DescribeParametersHistory  DescribeParametersHistoryRequest
     * @return DescribeParametersHistoryResponse
     */
    CompletableFuture<DescribeParametersHistoryResponse> describeParametersHistory(DescribeParametersHistoryRequest request);

    /**
     * @param request the request parameters of DescribeProcessStatsComposition  DescribeProcessStatsCompositionRequest
     * @return DescribeProcessStatsCompositionResponse
     */
    CompletableFuture<DescribeProcessStatsCompositionResponse> describeProcessStatsComposition(DescribeProcessStatsCompositionRequest request);

    /**
     * @param request the request parameters of DescribeProject  DescribeProjectRequest
     * @return DescribeProjectResponse
     */
    CompletableFuture<DescribeProjectResponse> describeProject(DescribeProjectRequest request);

    /**
     * @param request the request parameters of DescribeProjectComponents  DescribeProjectComponentsRequest
     * @return DescribeProjectComponentsResponse
     */
    CompletableFuture<DescribeProjectComponentsResponse> describeProjectComponents(DescribeProjectComponentsRequest request);

    /**
     * @param request the request parameters of DescribeProjectProgress  DescribeProjectProgressRequest
     * @return DescribeProjectProgressResponse
     */
    CompletableFuture<DescribeProjectProgressResponse> describeProjectProgress(DescribeProjectProgressRequest request);

    /**
     * @param request the request parameters of DescribeProjectStepMetric  DescribeProjectStepMetricRequest
     * @return DescribeProjectStepMetricResponse
     */
    CompletableFuture<DescribeProjectStepMetricResponse> describeProjectStepMetric(DescribeProjectStepMetricRequest request);

    /**
     * @param request the request parameters of DescribeProjectSteps  DescribeProjectStepsRequest
     * @return DescribeProjectStepsResponse
     */
    CompletableFuture<DescribeProjectStepsResponse> describeProjectSteps(DescribeProjectStepsRequest request);

    /**
     * @param request the request parameters of DescribeProxyService  DescribeProxyServiceRequest
     * @return DescribeProxyServiceResponse
     */
    CompletableFuture<DescribeProxyServiceResponse> describeProxyService(DescribeProxyServiceRequest request);

    /**
     * @param request the request parameters of DescribeRecommendIndex  DescribeRecommendIndexRequest
     * @return DescribeRecommendIndexResponse
     */
    CompletableFuture<DescribeRecommendIndexResponse> describeRecommendIndex(DescribeRecommendIndexRequest request);

    /**
     * @param request the request parameters of DescribeRestorableTenants  DescribeRestorableTenantsRequest
     * @return DescribeRestorableTenantsResponse
     */
    CompletableFuture<DescribeRestorableTenantsResponse> describeRestorableTenants(DescribeRestorableTenantsRequest request);

    /**
     * @param request the request parameters of DescribeSQLDetails  DescribeSQLDetailsRequest
     * @return DescribeSQLDetailsResponse
     */
    CompletableFuture<DescribeSQLDetailsResponse> describeSQLDetails(DescribeSQLDetailsRequest request);

    /**
     * @param request the request parameters of DescribeSQLHistoryList  DescribeSQLHistoryListRequest
     * @return DescribeSQLHistoryListResponse
     */
    CompletableFuture<DescribeSQLHistoryListResponse> describeSQLHistoryList(DescribeSQLHistoryListRequest request);

    /**
     * @param request the request parameters of DescribeSQLPlans  DescribeSQLPlansRequest
     * @return DescribeSQLPlansResponse
     */
    CompletableFuture<DescribeSQLPlansResponse> describeSQLPlans(DescribeSQLPlansRequest request);

    /**
     * @param request the request parameters of DescribeSQLSamples  DescribeSQLSamplesRequest
     * @return DescribeSQLSamplesResponse
     */
    CompletableFuture<DescribeSQLSamplesResponse> describeSQLSamples(DescribeSQLSamplesRequest request);

    /**
     * @param request the request parameters of DescribeSQLTuningAdvices  DescribeSQLTuningAdvicesRequest
     * @return DescribeSQLTuningAdvicesResponse
     */
    CompletableFuture<DescribeSQLTuningAdvicesResponse> describeSQLTuningAdvices(DescribeSQLTuningAdvicesRequest request);

    /**
     * @param request the request parameters of DescribeSampleSqlRawTexts  DescribeSampleSqlRawTextsRequest
     * @return DescribeSampleSqlRawTextsResponse
     */
    CompletableFuture<DescribeSampleSqlRawTextsResponse> describeSampleSqlRawTexts(DescribeSampleSqlRawTextsRequest request);

    /**
     * @param request the request parameters of DescribeSecurityIpGroups  DescribeSecurityIpGroupsRequest
     * @return DescribeSecurityIpGroupsResponse
     */
    CompletableFuture<DescribeSecurityIpGroupsResponse> describeSecurityIpGroups(DescribeSecurityIpGroupsRequest request);

    /**
     * @param request the request parameters of DescribeSessionList  DescribeSessionListRequest
     * @return DescribeSessionListResponse
     */
    CompletableFuture<DescribeSessionListResponse> describeSessionList(DescribeSessionListRequest request);

    /**
     * @param request the request parameters of DescribeSlowSQLHistoryList  DescribeSlowSQLHistoryListRequest
     * @return DescribeSlowSQLHistoryListResponse
     */
    CompletableFuture<DescribeSlowSQLHistoryListResponse> describeSlowSQLHistoryList(DescribeSlowSQLHistoryListRequest request);

    /**
     * @param request the request parameters of DescribeSlowSQLList  DescribeSlowSQLListRequest
     * @return DescribeSlowSQLListResponse
     */
    CompletableFuture<DescribeSlowSQLListResponse> describeSlowSQLList(DescribeSlowSQLListRequest request);

    /**
     * @param request the request parameters of DescribeStandbyCreateMode  DescribeStandbyCreateModeRequest
     * @return DescribeStandbyCreateModeResponse
     */
    CompletableFuture<DescribeStandbyCreateModeResponse> describeStandbyCreateMode(DescribeStandbyCreateModeRequest request);

    /**
     * @param request the request parameters of DescribeTagValues  DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     */
    CompletableFuture<DescribeTagValuesResponse> describeTagValues(DescribeTagValuesRequest request);

    /**
     * @param request the request parameters of DescribeTenant  DescribeTenantRequest
     * @return DescribeTenantResponse
     */
    CompletableFuture<DescribeTenantResponse> describeTenant(DescribeTenantRequest request);

    /**
     * @param request the request parameters of DescribeTenantEncryption  DescribeTenantEncryptionRequest
     * @return DescribeTenantEncryptionResponse
     */
    CompletableFuture<DescribeTenantEncryptionResponse> describeTenantEncryption(DescribeTenantEncryptionRequest request);

    /**
     * @param request the request parameters of DescribeTenantMetrics  DescribeTenantMetricsRequest
     * @return DescribeTenantMetricsResponse
     */
    CompletableFuture<DescribeTenantMetricsResponse> describeTenantMetrics(DescribeTenantMetricsRequest request);

    /**
     * @param request the request parameters of DescribeTenantReadableScn  DescribeTenantReadableScnRequest
     * @return DescribeTenantReadableScnResponse
     */
    CompletableFuture<DescribeTenantReadableScnResponse> describeTenantReadableScn(DescribeTenantReadableScnRequest request);

    /**
     * @param request the request parameters of DescribeTenantSecurityConfigs  DescribeTenantSecurityConfigsRequest
     * @return DescribeTenantSecurityConfigsResponse
     */
    CompletableFuture<DescribeTenantSecurityConfigsResponse> describeTenantSecurityConfigs(DescribeTenantSecurityConfigsRequest request);

    /**
     * @param request the request parameters of DescribeTenantSecurityIpGroups  DescribeTenantSecurityIpGroupsRequest
     * @return DescribeTenantSecurityIpGroupsResponse
     */
    CompletableFuture<DescribeTenantSecurityIpGroupsResponse> describeTenantSecurityIpGroups(DescribeTenantSecurityIpGroupsRequest request);

    /**
     * @param request the request parameters of DescribeTenantTags  DescribeTenantTagsRequest
     * @return DescribeTenantTagsResponse
     */
    CompletableFuture<DescribeTenantTagsResponse> describeTenantTags(DescribeTenantTagsRequest request);

    /**
     * @param request the request parameters of DescribeTenantUserRoles  DescribeTenantUserRolesRequest
     * @return DescribeTenantUserRolesResponse
     */
    CompletableFuture<DescribeTenantUserRolesResponse> describeTenantUserRoles(DescribeTenantUserRolesRequest request);

    /**
     * @param request the request parameters of DescribeTenantUsers  DescribeTenantUsersRequest
     * @return DescribeTenantUsersResponse
     */
    CompletableFuture<DescribeTenantUsersResponse> describeTenantUsers(DescribeTenantUsersRequest request);

    /**
     * @param request the request parameters of DescribeTenantZonesRead  DescribeTenantZonesReadRequest
     * @return DescribeTenantZonesReadResponse
     */
    CompletableFuture<DescribeTenantZonesReadResponse> describeTenantZonesRead(DescribeTenantZonesReadRequest request);

    /**
     * @param request the request parameters of DescribeTenants  DescribeTenantsRequest
     * @return DescribeTenantsResponse
     */
    CompletableFuture<DescribeTenantsResponse> describeTenants(DescribeTenantsRequest request);

    /**
     * @param request the request parameters of DescribeTimeZones  DescribeTimeZonesRequest
     * @return DescribeTimeZonesResponse
     */
    CompletableFuture<DescribeTimeZonesResponse> describeTimeZones(DescribeTimeZonesRequest request);

    /**
     * @param request the request parameters of DescribeTopSQLList  DescribeTopSQLListRequest
     * @return DescribeTopSQLListResponse
     */
    CompletableFuture<DescribeTopSQLListResponse> describeTopSQLList(DescribeTopSQLListRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * @param request the request parameters of GetUploadOssUrl  GetUploadOssUrlRequest
     * @return GetUploadOssUrlResponse
     */
    CompletableFuture<GetUploadOssUrlResponse> getUploadOssUrl(GetUploadOssUrlRequest request);

    /**
     * @param request the request parameters of KillProcessList  KillProcessListRequest
     * @return KillProcessListResponse
     */
    CompletableFuture<KillProcessListResponse> killProcessList(KillProcessListRequest request);

    /**
     * @param request the request parameters of ListAllLabels  ListAllLabelsRequest
     * @return ListAllLabelsResponse
     */
    CompletableFuture<ListAllLabelsResponse> listAllLabels(ListAllLabelsRequest request);

    /**
     * @param request the request parameters of ListDataSource  ListDataSourceRequest
     * @return ListDataSourceResponse
     */
    CompletableFuture<ListDataSourceResponse> listDataSource(ListDataSourceRequest request);

    /**
     * @param request the request parameters of ListProjectFullVerifyResult  ListProjectFullVerifyResultRequest
     * @return ListProjectFullVerifyResultResponse
     */
    CompletableFuture<ListProjectFullVerifyResultResponse> listProjectFullVerifyResult(ListProjectFullVerifyResultRequest request);

    /**
     * @param request the request parameters of ListProjectModifyRecords  ListProjectModifyRecordsRequest
     * @return ListProjectModifyRecordsResponse
     */
    CompletableFuture<ListProjectModifyRecordsResponse> listProjectModifyRecords(ListProjectModifyRecordsRequest request);

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    /**
     * @param request the request parameters of ListWorkerInstances  ListWorkerInstancesRequest
     * @return ListWorkerInstancesResponse
     */
    CompletableFuture<ListWorkerInstancesResponse> listWorkerInstances(ListWorkerInstancesRequest request);

    /**
     * @param request the request parameters of ModifyDatabaseDescription  ModifyDatabaseDescriptionRequest
     * @return ModifyDatabaseDescriptionResponse
     */
    CompletableFuture<ModifyDatabaseDescriptionResponse> modifyDatabaseDescription(ModifyDatabaseDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyDatabaseUserRoles  ModifyDatabaseUserRolesRequest
     * @return ModifyDatabaseUserRolesResponse
     */
    CompletableFuture<ModifyDatabaseUserRolesResponse> modifyDatabaseUserRoles(ModifyDatabaseUserRolesRequest request);

    /**
     * @param request the request parameters of ModifyInstanceName  ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     */
    CompletableFuture<ModifyInstanceNameResponse> modifyInstanceName(ModifyInstanceNameRequest request);

    /**
     * @param request the request parameters of ModifyInstanceNodeNum  ModifyInstanceNodeNumRequest
     * @return ModifyInstanceNodeNumResponse
     */
    CompletableFuture<ModifyInstanceNodeNumResponse> modifyInstanceNodeNum(ModifyInstanceNodeNumRequest request);

    /**
     * <b>description</b> :
     * <p>There is currently no authorization information disclosed in the API.</p>
     * 
     * @param request the request parameters of ModifyInstanceSSL  ModifyInstanceSSLRequest
     * @return ModifyInstanceSSLResponse
     */
    CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request);

    /**
     * @param request the request parameters of ModifyInstanceSpec  ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
     * @param request the request parameters of ModifyInstanceTags  ModifyInstanceTagsRequest
     * @return ModifyInstanceTagsResponse
     */
    CompletableFuture<ModifyInstanceTagsResponse> modifyInstanceTags(ModifyInstanceTagsRequest request);

    /**
     * @param request the request parameters of ModifyInstanceTemporaryCapacity  ModifyInstanceTemporaryCapacityRequest
     * @return ModifyInstanceTemporaryCapacityResponse
     */
    CompletableFuture<ModifyInstanceTemporaryCapacityResponse> modifyInstanceTemporaryCapacity(ModifyInstanceTemporaryCapacityRequest request);

    /**
     * @param request the request parameters of ModifyParameters  ModifyParametersRequest
     * @return ModifyParametersResponse
     */
    CompletableFuture<ModifyParametersResponse> modifyParameters(ModifyParametersRequest request);

    /**
     * @param request the request parameters of ModifySecurityIps  ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
     * @param request the request parameters of ModifyTagName  ModifyTagNameRequest
     * @return ModifyTagNameResponse
     */
    CompletableFuture<ModifyTagNameResponse> modifyTagName(ModifyTagNameRequest request);

    /**
     * @param request the request parameters of ModifyTagValueName  ModifyTagValueNameRequest
     * @return ModifyTagValueNameResponse
     */
    CompletableFuture<ModifyTagValueNameResponse> modifyTagValueName(ModifyTagValueNameRequest request);

    /**
     * @param request the request parameters of ModifyTenantEncryption  ModifyTenantEncryptionRequest
     * @return ModifyTenantEncryptionResponse
     */
    CompletableFuture<ModifyTenantEncryptionResponse> modifyTenantEncryption(ModifyTenantEncryptionRequest request);

    /**
     * @param request the request parameters of ModifyTenantPrimaryZone  ModifyTenantPrimaryZoneRequest
     * @return ModifyTenantPrimaryZoneResponse
     */
    CompletableFuture<ModifyTenantPrimaryZoneResponse> modifyTenantPrimaryZone(ModifyTenantPrimaryZoneRequest request);

    /**
     * @param request the request parameters of ModifyTenantResource  ModifyTenantResourceRequest
     * @return ModifyTenantResourceResponse
     */
    CompletableFuture<ModifyTenantResourceResponse> modifyTenantResource(ModifyTenantResourceRequest request);

    /**
     * @param request the request parameters of ModifyTenantSecurityIpGroup  ModifyTenantSecurityIpGroupRequest
     * @return ModifyTenantSecurityIpGroupResponse
     */
    CompletableFuture<ModifyTenantSecurityIpGroupResponse> modifyTenantSecurityIpGroup(ModifyTenantSecurityIpGroupRequest request);

    /**
     * @param request the request parameters of ModifyTenantTags  ModifyTenantTagsRequest
     * @return ModifyTenantTagsResponse
     */
    CompletableFuture<ModifyTenantTagsResponse> modifyTenantTags(ModifyTenantTagsRequest request);

    /**
     * @param request the request parameters of ModifyTenantUserDescription  ModifyTenantUserDescriptionRequest
     * @return ModifyTenantUserDescriptionResponse
     */
    CompletableFuture<ModifyTenantUserDescriptionResponse> modifyTenantUserDescription(ModifyTenantUserDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyTenantUserPassword  ModifyTenantUserPasswordRequest
     * @return ModifyTenantUserPasswordResponse
     */
    CompletableFuture<ModifyTenantUserPasswordResponse> modifyTenantUserPassword(ModifyTenantUserPasswordRequest request);

    /**
     * @param request the request parameters of ModifyTenantUserRoles  ModifyTenantUserRolesRequest
     * @return ModifyTenantUserRolesResponse
     */
    CompletableFuture<ModifyTenantUserRolesResponse> modifyTenantUserRoles(ModifyTenantUserRolesRequest request);

    /**
     * @param request the request parameters of ModifyTenantUserStatus  ModifyTenantUserStatusRequest
     * @return ModifyTenantUserStatusResponse
     */
    CompletableFuture<ModifyTenantUserStatusResponse> modifyTenantUserStatus(ModifyTenantUserStatusRequest request);

    /**
     * @param request the request parameters of ReleaseProject  ReleaseProjectRequest
     * @return ReleaseProjectResponse
     */
    CompletableFuture<ReleaseProjectResponse> releaseProject(ReleaseProjectRequest request);

    /**
     * @param request the request parameters of ReleaseWorkerInstance  ReleaseWorkerInstanceRequest
     * @return ReleaseWorkerInstanceResponse
     */
    CompletableFuture<ReleaseWorkerInstanceResponse> releaseWorkerInstance(ReleaseWorkerInstanceRequest request);

    /**
     * @param request the request parameters of RemoveStandbyInstance  RemoveStandbyInstanceRequest
     * @return RemoveStandbyInstanceResponse
     */
    CompletableFuture<RemoveStandbyInstanceResponse> removeStandbyInstance(RemoveStandbyInstanceRequest request);

    /**
     * @param request the request parameters of ResumeProject  ResumeProjectRequest
     * @return ResumeProjectResponse
     */
    CompletableFuture<ResumeProjectResponse> resumeProject(ResumeProjectRequest request);

    /**
     * @param request the request parameters of RetryProjectModifyRecords  RetryProjectModifyRecordsRequest
     * @return RetryProjectModifyRecordsResponse
     */
    CompletableFuture<RetryProjectModifyRecordsResponse> retryProjectModifyRecords(RetryProjectModifyRecordsRequest request);

    /**
     * @param request the request parameters of StartProject  StartProjectRequest
     * @return StartProjectResponse
     */
    CompletableFuture<StartProjectResponse> startProject(StartProjectRequest request);

    /**
     * @param request the request parameters of StartProjectsByLabel  StartProjectsByLabelRequest
     * @return StartProjectsByLabelResponse
     */
    CompletableFuture<StartProjectsByLabelResponse> startProjectsByLabel(StartProjectsByLabelRequest request);

    /**
     * @param request the request parameters of StopProject  StopProjectRequest
     * @return StopProjectResponse
     */
    CompletableFuture<StopProjectResponse> stopProject(StopProjectRequest request);

    /**
     * @param request the request parameters of StopProjectModifyRecords  StopProjectModifyRecordsRequest
     * @return StopProjectModifyRecordsResponse
     */
    CompletableFuture<StopProjectModifyRecordsResponse> stopProjectModifyRecords(StopProjectModifyRecordsRequest request);

    /**
     * @param request the request parameters of StopProjectsByLabel  StopProjectsByLabelRequest
     * @return StopProjectsByLabelResponse
     */
    CompletableFuture<StopProjectsByLabelResponse> stopProjectsByLabel(StopProjectsByLabelRequest request);

    /**
     * @param request the request parameters of SwitchoverInstance  SwitchoverInstanceRequest
     * @return SwitchoverInstanceResponse
     */
    CompletableFuture<SwitchoverInstanceResponse> switchoverInstance(SwitchoverInstanceRequest request);

    /**
     * @param request the request parameters of UpdateProjectConfig  UpdateProjectConfigRequest
     * @return UpdateProjectConfigResponse
     */
    CompletableFuture<UpdateProjectConfigResponse> updateProjectConfig(UpdateProjectConfigRequest request);

}
