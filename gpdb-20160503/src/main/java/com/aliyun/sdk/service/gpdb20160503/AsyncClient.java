// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.gpdb20160503.models.*;
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
      * You can call this operation to apply for a public endpoint for an AnalyticDB for PostgreSQL instance. Both the primary and instance endpoints of an AnalyticDB for PostgreSQL instance can be public endpoints. For more information, see [Endpoints of an instance and its primary coordinator node](~~204879~~).
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    CompletableFuture<CancelUploadDocumentJobResponse> cancelUploadDocumentJob(CancelUploadDocumentJobRequest request);

    CompletableFuture<CancelUpsertCollectionDataJobResponse> cancelUpsertCollectionDataJob(CancelUpsertCollectionDataJobRequest request);

    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
      * *   Before you can use an AnalyticDB for PostgreSQL instance, you must create a privileged account for the instance.
      * *   You can call this operation to create only privileged accounts. For information about how to create other types of accounts, see [Create a database account](~~50206~~).
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateCollectionResponse> createCollection(CreateCollectionRequest request);

    /**
      * You can call this operation when you need to create AnalyticDB for PostgreSQL instances to meet the requirements of new applications or services.
      * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL instances. For more information, see [Billing methods](~~35406~~) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
      * *   The plan management feature is supported only for pay-as-you-go instances.
      * *   When you change the compute node specifications or change the number of compute nodes, transient connections may occur. We recommend that you perform these operations during off-peak hours.
      * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see [Billing methods](~~35406~~) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
      *
     */
    CompletableFuture<CreateDBInstancePlanResponse> createDBInstancePlan(CreateDBInstancePlanRequest request);

    CompletableFuture<CreateDocumentCollectionResponse> createDocumentCollection(CreateDocumentCollectionRequest request);

    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    /**
      * You can call this operation to load a sample dataset to an AnalyticDB for PostgreSQL instance. Then, you can execute query statements on the sample dataset to experience or test your instance. For more information about query statements, see [Dataset information and query examples](~~452277~~).
      * ## Precautions
      * - If your instance is in elastic storage mode, the sample dataset is supported only for V6.3.10.3 or later. If your instance is in Serverless mode, the sample dataset is supported only for V1.0.4.0 or later. For more information about how to update the minor engine version of an instance, see [Update the minor engine version](/help/en/analyticdb-for-postgresql/latest/upgrade-the-engine-version).
      * - The sample dataset is about 10 GB in size. Make sure that your instance has sufficient storage space.
      * - The sample dataset contains a database named `ADB_SampleData_TPCH`. Make sure that your instance does not have a database with the same name. Otherwise, the dataset may fail to be loaded.
      * - It may take 6 to 8 minutes to load the sample dataset. During this period, operations on your instance such as adding nodes or changing node specifications may be affected.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateSampleDataResponse> createSampleData(CreateSampleDataRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<CreateVectorIndexResponse> createVectorIndex(CreateVectorIndexRequest request);

    CompletableFuture<DeleteCollectionResponse> deleteCollection(DeleteCollectionRequest request);

    CompletableFuture<DeleteCollectionDataResponse> deleteCollectionData(DeleteCollectionDataRequest request);

    /**
      * *   Subscription instances cannot be manually released. They are automatically released when they expire.
      * *   You can call this operation to release pay-as-you-go instances only when they are in the **Running** state.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
      * If you no longer need a plan, you can call this operation to delete the plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteDBInstancePlanResponse> deleteDBInstancePlan(DeleteDBInstancePlanRequest request);

    CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request);

    CompletableFuture<DeleteDocumentCollectionResponse> deleteDocumentCollection(DeleteDocumentCollectionRequest request);

    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    CompletableFuture<DeleteVectorIndexResponse> deleteVectorIndex(DeleteVectorIndexRequest request);

    /**
      * This operation is called to query the information of the privileged account in an AnalyticDB for PostgreSQL instance, such as its state, description, and the instance.
      * ## Limit
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeActiveSQLRecordsResponse> describeActiveSQLRecords(DescribeActiveSQLRecordsRequest request);

    /**
      * When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available resources within a zone.
      *
     */
    CompletableFuture<DescribeAvailableResourcesResponse> describeAvailableResources(DescribeAvailableResourcesRequest request);

    /**
      * You can call this operation to query the backup settings of an AnalyticDB for PostgreSQL instance in elastic storage mode. Periodically backing data can prevent data loss. For more information about how to modify backup policies, see [ModifyBackupPolicy](~~210095~~).
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeCollectionResponse> describeCollection(DescribeCollectionRequest request);

    /**
      * ##
      * You can call this operation to query the information about coordinator and compute nodes in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDBClusterNodeResponse> describeDBClusterNode(DescribeDBClusterNodeRequest request);

    /**
      * You can query monitoring information only within the last 30 days.
      *
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    /**
      * ##
      * You can call this operation to query the information about an AnalyticDB for PostgreSQL instance, such as the instance type, network type, and instance state.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
      * You can call this operation to query the details of data bloat on an AnalyticDB for PostgreSQL instance in elastic storage mode. The minor version of the instance must be V6.3.10.1 or later. For more information about how to view and update the minor version of an instance, see [View the minor engine version](~~277424~~) and [Update the minor engine version](~~139271~~).
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDBInstanceDataBloatResponse> describeDBInstanceDataBloat(DescribeDBInstanceDataBloatRequest request);

    /**
      * To prevent data skew from affecting your database service, you can call this operation to query the details about data skew on an AnalyticDB for PostgreSQL instance.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDBInstanceDataSkewResponse> describeDBInstanceDataSkew(DescribeDBInstanceDataSkewRequest request);

    /**
      * You can call this operation to query the distribution and states of coordinator and compute nodes in an AnalyticDB for PostgreSQL instance.
      *
     */
    CompletableFuture<DescribeDBInstanceDiagnosisSummaryResponse> describeDBInstanceDiagnosisSummary(DescribeDBInstanceDiagnosisSummaryRequest request);

    /**
      * You can call this operation to query the error logs of an AnalyticDB for PostgreSQL instance.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDBInstanceErrorLogResponse> describeDBInstanceErrorLog(DescribeDBInstanceErrorLogRequest request);

    /**
      * You can call this operation to query the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDBInstanceIPArrayListResponse> describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request);

    /**
      * Appropriate indexes can accelerate database queries. You can call this operation to query the index usage of an AnalyticDB for PostgreSQL instance.
      * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see [View the minor engine version](~~277424~~) and [Update the minor engine version](~~139271~~).
      *
     */
    CompletableFuture<DescribeDBInstanceIndexUsageResponse> describeDBInstanceIndexUsage(DescribeDBInstanceIndexUsageRequest request);

    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    /**
      * You can call this operation to query the details of plans for an AnalyticDB for PostgreSQL instance in Serverless mode.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDBInstancePlansResponse> describeDBInstancePlans(DescribeDBInstancePlansRequest request);

    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    CompletableFuture<DescribeDBInstanceSupportMaxPerformanceResponse> describeDBInstanceSupportMaxPerformance(DescribeDBInstanceSupportMaxPerformanceRequest request);

    /**
      * ##
      * You can call this operation to query the instance types, network types, and states of AnalyticDB for PostgreSQL instances within a region.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    CompletableFuture<DescribeDBResourceManagementModeResponse> describeDBResourceManagementMode(DescribeDBResourceManagementModeRequest request);

    CompletableFuture<DescribeDBVersionInfosResponse> describeDBVersionInfos(DescribeDBVersionInfosRequest request);

    /**
      * You can call this operation to query a list of backup sets and backup details only for instances in elastic storage mode.
      *
     */
    CompletableFuture<DescribeDataBackupsResponse> describeDataBackups(DescribeDataBackupsRequest request);

    CompletableFuture<DescribeDataReDistributeInfoResponse> describeDataReDistributeInfo(DescribeDataReDistributeInfoRequest request);

    /**
      * Data sharing is supported only for instances in Serverless mode.
      *
     */
    CompletableFuture<DescribeDataShareInstancesResponse> describeDataShareInstances(DescribeDataShareInstancesRequest request);

    /**
      * You can call this operation to query the details of data sharing performance metrics for an AnalyticDB for PostgreSQL instance in Serverless mode, such as the number of shared topics and the amount of data shared.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDataSharePerformanceResponse> describeDataSharePerformance(DescribeDataSharePerformanceRequest request);

    /**
      * To facilitate management, you can call this operation to query all databases and database accounts on an AnalyticDB for PostgreSQL instance.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDiagnosisDimensionsResponse> describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request);

    /**
      * You can call this operation to query the details of query execution on an AnalyticDB for PostgreSQL instance in elastic storage mode within a specified time range.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDiagnosisMonitorPerformanceResponse> describeDiagnosisMonitorPerformance(DescribeDiagnosisMonitorPerformanceRequest request);

    /**
      * You can call this operation to query the details of SQL queries on an AnalyticDB for PostgreSQL instance within a specified time range.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeDiagnosisRecordsResponse> describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request);

    /**
      * You can call this operation to query the information about a query for an AnalyticDB for PostgreSQL instance, including the SQL statement, execution plan text, and execution plan tree.
      * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see [View the minor engine version](~~277424~~) and [Update the minor engine version](~~139271~~).
      *
     */
    CompletableFuture<DescribeDiagnosisSQLInfoResponse> describeDiagnosisSQLInfo(DescribeDiagnosisSQLInfoRequest request);

    CompletableFuture<DescribeDocumentResponse> describeDocument(DescribeDocumentRequest request);

    /**
      * You must call the [DownloadDiagnosisRecords](~~447700~~) operation to download the query diagnostic information before you can call this operation to query the download records and download URLs.
      * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see [View the minor engine version](~~277424~~) and [Update the minor engine version](~~139271~~).
      *
     */
    CompletableFuture<DescribeDownloadRecordsResponse> describeDownloadRecords(DescribeDownloadRecordsRequest request);

    CompletableFuture<DescribeDownloadSQLLogsResponse> describeDownloadSQLLogs(DescribeDownloadSQLLogsRequest request);

    /**
      * This operation is called to query the health status of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode and its coordinator and compute nodes.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeHealthStatusResponse> describeHealthStatus(DescribeHealthStatusRequest request);

    CompletableFuture<DescribeIMVInfosResponse> describeIMVInfos(DescribeIMVInfosRequest request);

    CompletableFuture<DescribeLogBackupsResponse> describeLogBackups(DescribeLogBackupsRequest request);

    CompletableFuture<DescribeModifyParameterLogResponse> describeModifyParameterLog(DescribeModifyParameterLogRequest request);

    CompletableFuture<DescribeNamespaceResponse> describeNamespace(DescribeNamespaceRequest request);

    /**
      * This operation can be called to query the details of parameters in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    /**
      * When you create AnalyticDB for PostgreSQL instances, you can call this operation to query the details of vSwitches within a specified region or zone.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeRdsVSwitchsResponse> describeRdsVSwitchs(DescribeRdsVSwitchsRequest request);

    /**
      * When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available VPCs within a specified region or zone.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeRdsVpcsResponse> describeRdsVpcs(DescribeRdsVpcsRequest request);

    /**
      * Before you create an AnalyticDB for PostgreSQL instance, you must call this operation to query available regions and zones.
      * ## Limit
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * This operation is not available for instances in reserved storage mode.
      *
     */
    CompletableFuture<DescribeSQLLogCountResponse> describeSQLLogCount(DescribeSQLLogCountRequest request);

    /**
      * > This operation is no longer used. To query SQL execution logs, call the [DescribeSQLLogsV2](~~453722~~) operation.
      *
     */
    CompletableFuture<DescribeSQLLogsResponse> describeSQLLogs(DescribeSQLLogsRequest request);

    /**
      * You can call this operation to query SQL logs of an AnalyticDB for PostgreSQL instance within a specific time range.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeSQLLogsV2Response> describeSQLLogsV2(DescribeSQLLogsV2Request request);

    /**
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeSampleDataResponse> describeSampleData(DescribeSampleDataRequest request);

    CompletableFuture<DescribeSupportFeaturesResponse> describeSupportFeatures(DescribeSupportFeaturesRequest request);

    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    /**
      * You can call this operation to query the details of a lock-waiting query only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeWaitingSQLInfoResponse> describeWaitingSQLInfo(DescribeWaitingSQLInfoRequest request);

    /**
      * You can call this operation to query the lock diagnostics records only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeWaitingSQLRecordsResponse> describeWaitingSQLRecords(DescribeWaitingSQLRecordsRequest request);

    /**
      * You can call this operation to download the query diagnostic information of an AnalyticDB for PostgreSQL instance. After the download is complete, you can call the [DescribeDownloadRecords](~~447712~~) operation to query download records and download URLs.
      * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For more information about how to view and update the minor engine version of an instance, see [View the minor engine version](~~277424~~) and [Update the minor engine version](~~139271~~).
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DownloadDiagnosisRecordsResponse> downloadDiagnosisRecords(DownloadDiagnosisRecordsRequest request);

    CompletableFuture<DownloadSQLLogsRecordsResponse> downloadSQLLogsRecords(DownloadSQLLogsRecordsRequest request);

    CompletableFuture<GetUploadDocumentJobResponse> getUploadDocumentJob(GetUploadDocumentJobRequest request);

    CompletableFuture<GetUpsertCollectionDataJobResponse> getUpsertCollectionDataJob(GetUpsertCollectionDataJobRequest request);

    CompletableFuture<GrantCollectionResponse> grantCollection(GrantCollectionRequest request);

    CompletableFuture<HandleActiveSQLRecordResponse> handleActiveSQLRecord(HandleActiveSQLRecordRequest request);

    CompletableFuture<InitVectorDatabaseResponse> initVectorDatabase(InitVectorDatabaseRequest request);

    CompletableFuture<ListCollectionsResponse> listCollections(ListCollectionsRequest request);

    CompletableFuture<ListDocumentCollectionsResponse> listDocumentCollections(ListDocumentCollectionsRequest request);

    CompletableFuture<ListDocumentsResponse> listDocuments(ListDocumentsRequest request);

    CompletableFuture<ListNamespacesResponse> listNamespaces(ListNamespacesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request);

    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    /**
      * To make it easy to identify AnalyticDB for PostgreSQL instances, you can call this operation to modify the description of instances.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    /**
      * The system maintains AnalyticDB for PostgreSQL instances during the maintenance window that you specify. We recommend that you set the maintenance window to off-peak hours to minimize the impact on your business.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
      * Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see [What is Resource Management?](~~94475~~)
      *
     */
    CompletableFuture<ModifyDBInstanceResourceGroupResponse> modifyDBInstanceResourceGroup(ModifyDBInstanceResourceGroupRequest request);

    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    CompletableFuture<ModifyMasterSpecResponse> modifyMasterSpec(ModifyMasterSpecRequest request);

    /**
      * This operation can be called to modify parameters of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyParametersResponse> modifyParameters(ModifyParametersRequest request);

    CompletableFuture<ModifySQLCollectorPolicyResponse> modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request);

    /**
      * To ensure the security and stability of AnalyticDB for PostgreSQL instances, the system denies all external IP addresses to access AnalyticDB for PostgreSQL instances by default. Before you can use an AnalyticDB for PostgreSQL instance, you must add the IP address or CIDR block of your client to the IP address whitelist of the instance.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    CompletableFuture<ModifyVectorConfigurationResponse> modifyVectorConfiguration(ModifyVectorConfigurationRequest request);

    /**
      * You can call this operation to pause an AnalyticDB for PostgreSQL instance that is in the **Running** state.
      * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see [View the minor engine version](~~277424~~) and [Update the minor engine version](~~139271~~).
      * >  Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see [Billing methods](~~35406~~) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PauseInstanceResponse> pauseInstance(PauseInstanceRequest request);

    CompletableFuture<QueryCollectionDataResponse> queryCollectionData(QueryCollectionDataRequest request);

    CompletableFuture<RebalanceDBInstanceResponse> rebalanceDBInstance(RebalanceDBInstanceRequest request);

    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<ResetIMVMonitorDataResponse> resetIMVMonitorData(ResetIMVMonitorDataRequest request);

    /**
      * A restart takes about 3 to 30 minutes. During the restart, services are unavailable. We recommend that you restart the instance during off-peak hours. After the instance is restarted and enters the running state, you can access the instance.
      * ## Limit
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    /**
      * You can call this operation to resume an AnalyticDB for PostgreSQL instance that is in the **Paused** state.
      * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see [View the minor engine version](~~277424~~) and [Update the minor engine version](~~139271~~).
      * >  Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see [Billing methods](~~35406~~) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    /**
      * You can call this operation to enable or disable a specified plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<SetDBInstancePlanStatusResponse> setDBInstancePlanStatus(SetDBInstancePlanStatusRequest request);

    /**
      * This operation is called to enable or disable data sharing for an AnalyticDB for PostgreSQL instance in Serverless mode.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.
      *
     */
    CompletableFuture<SetDataShareInstanceResponse> setDataShareInstance(SetDataShareInstanceRequest request);

    CompletableFuture<SwitchDBInstanceNetTypeResponse> switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * You can call this operation to release a sample dataset from an AnalyticDB for PostgreSQL instance. You must have already loaded the sample dataset.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<UnloadSampleDataResponse> unloadSampleData(UnloadSampleDataRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateCollectionDataMetadataResponse> updateCollectionDataMetadata(UpdateCollectionDataMetadataRequest request);

    /**
      * You can call this operation to modify a plan for an AnalyticDB for PostgreSQL instance in Serverless mode. For example, you can modify a plan for periodically pausing and resuming an instance or scaling an instance.
      * ## Limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<UpdateDBInstancePlanResponse> updateDBInstancePlan(UpdateDBInstancePlanRequest request);

    /**
      * This operation is not available for instances in reserved storage mode.
      * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see [Billing methods](~~35406~~) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
      *
     */
    CompletableFuture<UpgradeDBInstanceResponse> upgradeDBInstance(UpgradeDBInstanceRequest request);

    CompletableFuture<UpgradeDBVersionResponse> upgradeDBVersion(UpgradeDBVersionRequest request);

    CompletableFuture<UpsertChunksResponse> upsertChunks(UpsertChunksRequest request);

    CompletableFuture<UpsertCollectionDataResponse> upsertCollectionData(UpsertCollectionDataRequest request);

}
