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
     * <b>description</b> :
     * <p>You can call this operation to apply for a public endpoint for an AnalyticDB for PostgreSQL instance. Both the primary and instance endpoints of an AnalyticDB for PostgreSQL instance can be public endpoints. For more information, see <a href="~~204879~~">Endpoints of an instance and its primary coordinator node</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    CompletableFuture<BindDBResourceGroupWithRoleResponse> bindDBResourceGroupWithRole(BindDBResourceGroupWithRoleRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to the UploadDocumentAsync operation. You can call this operation to cancel a document upload job.</p>
     * <blockquote>
     * <p> If the canceling operation is complete, failed, or is canceled, you cannot call the operation again. The canceling operation only interrupts the document upload job. To remove the uploaded data, you must manually remove it or call the DeleteCollectionData operation. You can also call the document upload operation to overwrite the data by using the same FileName parameter.</p>
     * </blockquote>
     */
    CompletableFuture<CancelUploadDocumentJobResponse> cancelUploadDocumentJob(CancelUploadDocumentJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to the <code>UpsertCollectionDataAsync</code> operation. You can call this operation to cancel an upload job.</p>
     * <blockquote>
     * <p> If the canceling operation is complete, failed, or is canceled, you cannot call the operation again. The canceling operation only interrupts the upload job. To remove the uploaded data, you must manually remove it or call the DeleteCollectionData operation.</p>
     * </blockquote>
     */
    CompletableFuture<CancelUpsertCollectionDataJobResponse> cancelUpsertCollectionDataJob(CancelUpsertCollectionDataJobRequest request);

    CompletableFuture<CheckHadoopDataSourceResponse> checkHadoopDataSource(CheckHadoopDataSourceRequest request);

    CompletableFuture<CheckHadoopNetConnectionResponse> checkHadoopNetConnection(CheckHadoopNetConnectionRequest request);

    CompletableFuture<CheckJDBCSourceNetConnectionResponse> checkJDBCSourceNetConnection(CheckJDBCSourceNetConnectionRequest request);

    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you can use an AnalyticDB for PostgreSQL instance, you must create an initial account for the instance.</li>
     * <li>You can call this operation to create only initial accounts. For information about how to create other types of accounts, see <a href="~~50206~~">Create a database account</a>.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateCollectionResponse> createCollection(CreateCollectionRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation when you need to create AnalyticDB for PostgreSQL instances to meet the requirements of new applications or services.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL instances. For more information, see <a href="~~35406~~">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The plan management feature is supported only for pay-as-you-go instances.</li>
     * <li>When you change the compute node specifications or change the number of compute nodes, transient connections may occur. We recommend that you perform these operations during off-peak hours.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="~~35406~~">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</li>
     * </ul>
     */
    CompletableFuture<CreateDBInstancePlanResponse> createDBInstancePlan(CreateDBInstancePlanRequest request);

    CompletableFuture<CreateDBResourceGroupResponse> createDBResourceGroup(CreateDBResourceGroupRequest request);

    CompletableFuture<CreateDocumentCollectionResponse> createDocumentCollection(CreateDocumentCollectionRequest request);

    CompletableFuture<CreateExtensionsResponse> createExtensions(CreateExtensionsRequest request);

    CompletableFuture<CreateExternalDataServiceResponse> createExternalDataService(CreateExternalDataServiceRequest request);

    CompletableFuture<CreateHadoopDataSourceResponse> createHadoopDataSource(CreateHadoopDataSourceRequest request);

    CompletableFuture<CreateJDBCDataSourceResponse> createJDBCDataSource(CreateJDBCDataSourceRequest request);

    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation to create a sample dataset for an AnalyticDB for PostgreSQL instance. Then, you can execute query statements on the sample dataset to use or test your instance. For more information about query statements, see <a href="~~452277~~">Dataset information and query examples</a>.</li>
     * <li>This operation is supported only for AnalyticDB for PostgreSQL V6.3.8.8 and V6.3.10.3 or later, excluding the versions from V6.3.9.0 to V6.3.10.2.</li>
     * </ul>
     */
    CompletableFuture<CreateSampleDataResponse> createSampleData(CreateSampleDataRequest request);

    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<CreateStreamingDataServiceResponse> createStreamingDataService(CreateStreamingDataServiceRequest request);

    CompletableFuture<CreateStreamingDataSourceResponse> createStreamingDataSource(CreateStreamingDataSourceRequest request);

    CompletableFuture<CreateStreamingJobResponse> createStreamingJob(CreateStreamingJobRequest request);

    CompletableFuture<CreateVectorIndexResponse> createVectorIndex(CreateVectorIndexRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    CompletableFuture<DeleteCollectionResponse> deleteCollection(DeleteCollectionRequest request);

    CompletableFuture<DeleteCollectionDataResponse> deleteCollectionData(DeleteCollectionDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Subscription instances cannot be manually released. They are automatically released when they expire.</li>
     * <li>You can call this operation to release pay-as-you-go instances only when they are in the <strong>Running</strong> state.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>If you no longer need a plan, you can call this operation to delete the plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DeleteDBInstancePlanResponse> deleteDBInstancePlan(DeleteDBInstancePlanRequest request);

    CompletableFuture<DeleteDBResourceGroupResponse> deleteDBResourceGroup(DeleteDBResourceGroupRequest request);

    CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request);

    CompletableFuture<DeleteDocumentCollectionResponse> deleteDocumentCollection(DeleteDocumentCollectionRequest request);

    CompletableFuture<DeleteExtensionResponse> deleteExtension(DeleteExtensionRequest request);

    CompletableFuture<DeleteExternalDataServiceResponse> deleteExternalDataService(DeleteExternalDataServiceRequest request);

    CompletableFuture<DeleteHadoopDataSourceResponse> deleteHadoopDataSource(DeleteHadoopDataSourceRequest request);

    CompletableFuture<DeleteJDBCDataSourceResponse> deleteJDBCDataSource(DeleteJDBCDataSourceRequest request);

    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    CompletableFuture<DeleteStreamingDataServiceResponse> deleteStreamingDataService(DeleteStreamingDataServiceRequest request);

    CompletableFuture<DeleteStreamingDataSourceResponse> deleteStreamingDataSource(DeleteStreamingDataSourceRequest request);

    CompletableFuture<DeleteStreamingJobResponse> deleteStreamingJob(DeleteStreamingJobRequest request);

    CompletableFuture<DeleteVectorIndexResponse> deleteVectorIndex(DeleteVectorIndexRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is called to query the information of the privileged account in an AnalyticDB for PostgreSQL instance, such as its state, description, and the instance.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeActiveSQLRecordsResponse> describeActiveSQLRecords(DescribeActiveSQLRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available resources within a zone.</p>
     */
    CompletableFuture<DescribeAvailableResourcesResponse> describeAvailableResources(DescribeAvailableResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the backup settings of an AnalyticDB for PostgreSQL instance in elastic storage mode. Periodically backing data can prevent data loss. For more information about how to modify backup policies, see <a href="~~210095~~">ModifyBackupPolicy</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeCollectionResponse> describeCollection(DescribeCollectionRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the information about coordinator and compute nodes in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDBClusterNodeResponse> describeDBClusterNode(DescribeDBClusterNodeRequest request);

    /**
     * <b>description</b> :
     * <p>You can query monitoring information only within the last 30 days.</p>
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the information about an AnalyticDB for PostgreSQL instance, such as the instance type, network type, and instance state.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of data bloat on an AnalyticDB for PostgreSQL instance in elastic storage mode. The minor version of the instance must be V6.3.10.1 or later. For more information about how to view and update the minor version of an instance, see <a href="~~277424~~">View the minor engine version</a> and <a href="~~139271~~">Update the minor engine version</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDBInstanceDataBloatResponse> describeDBInstanceDataBloat(DescribeDBInstanceDataBloatRequest request);

    /**
     * <b>description</b> :
     * <p>To prevent data skew from affecting your database service, you can call this operation to query the details about data skew on an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDBInstanceDataSkewResponse> describeDBInstanceDataSkew(DescribeDBInstanceDataSkewRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the distribution and states of coordinator and compute nodes in an AnalyticDB for PostgreSQL instance.</p>
     */
    CompletableFuture<DescribeDBInstanceDiagnosisSummaryResponse> describeDBInstanceDiagnosisSummary(DescribeDBInstanceDiagnosisSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the error logs of an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDBInstanceErrorLogResponse> describeDBInstanceErrorLog(DescribeDBInstanceErrorLogRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDBInstanceIPArrayListResponse> describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request);

    /**
     * <b>description</b> :
     * <p>Appropriate indexes can accelerate database queries. You can call this operation to query the index usage of an AnalyticDB for PostgreSQL instance.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="~~277424~~">View the minor engine version</a> and <a href="~~139271~~">Update the minor engine version</a>.</p>
     */
    CompletableFuture<DescribeDBInstanceIndexUsageResponse> describeDBInstanceIndexUsage(DescribeDBInstanceIndexUsageRequest request);

    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of plans for an AnalyticDB for PostgreSQL instance in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDBInstancePlansResponse> describeDBInstancePlans(DescribeDBInstancePlansRequest request);

    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    CompletableFuture<DescribeDBInstanceSupportMaxPerformanceResponse> describeDBInstanceSupportMaxPerformance(DescribeDBInstanceSupportMaxPerformanceRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the instance types, network types, and states of AnalyticDB for PostgreSQL instances within a region.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    CompletableFuture<DescribeDBResourceGroupResponse> describeDBResourceGroup(DescribeDBResourceGroupRequest request);

    CompletableFuture<DescribeDBResourceManagementModeResponse> describeDBResourceManagementMode(DescribeDBResourceManagementModeRequest request);

    CompletableFuture<DescribeDBVersionInfosResponse> describeDBVersionInfos(DescribeDBVersionInfosRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query a list of backup sets and backup details only for instances in elastic storage mode.</p>
     */
    CompletableFuture<DescribeDataBackupsResponse> describeDataBackups(DescribeDataBackupsRequest request);

    CompletableFuture<DescribeDataReDistributeInfoResponse> describeDataReDistributeInfo(DescribeDataReDistributeInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Data sharing is supported only for instances in Serverless mode.</p>
     */
    CompletableFuture<DescribeDataShareInstancesResponse> describeDataShareInstances(DescribeDataShareInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of data sharing performance metrics for an AnalyticDB for PostgreSQL instance in Serverless mode, such as the number of shared topics and the amount of data shared.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDataSharePerformanceResponse> describeDataSharePerformance(DescribeDataSharePerformanceRequest request);

    /**
     * <b>description</b> :
     * <p>To facilitate management, you can call this operation to query all databases and database accounts on an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDiagnosisDimensionsResponse> describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of query execution on an AnalyticDB for PostgreSQL instance in elastic storage mode within a specified time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDiagnosisMonitorPerformanceResponse> describeDiagnosisMonitorPerformance(DescribeDiagnosisMonitorPerformanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of SQL queries on an AnalyticDB for PostgreSQL instance within a specified time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeDiagnosisRecordsResponse> describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about a query for an AnalyticDB for PostgreSQL instance, including the SQL statement, execution plan text, and execution plan tree.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="~~277424~~">View the minor engine version</a> and <a href="~~139271~~">Update the minor engine version</a>.</p>
     */
    CompletableFuture<DescribeDiagnosisSQLInfoResponse> describeDiagnosisSQLInfo(DescribeDiagnosisSQLInfoRequest request);

    CompletableFuture<DescribeDocumentResponse> describeDocument(DescribeDocumentRequest request);

    /**
     * <b>description</b> :
     * <p>You must call the <a href="~~447700~~">DownloadDiagnosisRecords</a> operation to download the query diagnostic information before you can call this operation to query the download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="~~277424~~">View the minor engine version</a> and <a href="~~139271~~">Update the minor engine version</a>.</p>
     */
    CompletableFuture<DescribeDownloadRecordsResponse> describeDownloadRecords(DescribeDownloadRecordsRequest request);

    CompletableFuture<DescribeDownloadSQLLogsResponse> describeDownloadSQLLogs(DescribeDownloadSQLLogsRequest request);

    CompletableFuture<DescribeExternalDataServiceResponse> describeExternalDataService(DescribeExternalDataServiceRequest request);

    CompletableFuture<DescribeHadoopClustersInSameNetResponse> describeHadoopClustersInSameNet(DescribeHadoopClustersInSameNetRequest request);

    CompletableFuture<DescribeHadoopConfigsResponse> describeHadoopConfigs(DescribeHadoopConfigsRequest request);

    CompletableFuture<DescribeHadoopDataSourceResponse> describeHadoopDataSource(DescribeHadoopDataSourceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is called to query the health status of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode and its coordinator and compute nodes.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeHealthStatusResponse> describeHealthStatus(DescribeHealthStatusRequest request);

    CompletableFuture<DescribeIMVInfosResponse> describeIMVInfos(DescribeIMVInfosRequest request);

    CompletableFuture<DescribeJDBCDataSourceResponse> describeJDBCDataSource(DescribeJDBCDataSourceRequest request);

    CompletableFuture<DescribeLogBackupsResponse> describeLogBackups(DescribeLogBackupsRequest request);

    CompletableFuture<DescribeModifyParameterLogResponse> describeModifyParameterLog(DescribeModifyParameterLogRequest request);

    CompletableFuture<DescribeNamespaceResponse> describeNamespace(DescribeNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be called to query the details of parameters in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    /**
     * <b>description</b> :
     * <p>When you create AnalyticDB for PostgreSQL instances, you can call this operation to query the details of vSwitches within a specified region or zone.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeRdsVSwitchsResponse> describeRdsVSwitchs(DescribeRdsVSwitchsRequest request);

    /**
     * <b>description</b> :
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available VPCs within a specified region or zone.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeRdsVpcsResponse> describeRdsVpcs(DescribeRdsVpcsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you create an AnalyticDB for PostgreSQL instance, you must call this operation to query available regions and zones.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRolesResponse> describeRoles(DescribeRolesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.</p>
     */
    CompletableFuture<DescribeSQLLogCountResponse> describeSQLLogCount(DescribeSQLLogCountRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is no longer used. To query SQL execution logs, call the <a href="~~453722~~">DescribeSQLLogsV2</a> operation.</p>
     * </blockquote>
     */
    CompletableFuture<DescribeSQLLogsResponse> describeSQLLogs(DescribeSQLLogsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query SQL logs of an AnalyticDB for PostgreSQL instance within a specific time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeSQLLogsV2Response> describeSQLLogsV2(DescribeSQLLogsV2Request request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeSampleDataResponse> describeSampleData(DescribeSampleDataRequest request);

    CompletableFuture<DescribeStreamingDataServiceResponse> describeStreamingDataService(DescribeStreamingDataServiceRequest request);

    CompletableFuture<DescribeStreamingDataSourceResponse> describeStreamingDataSource(DescribeStreamingDataSourceRequest request);

    CompletableFuture<DescribeStreamingJobResponse> describeStreamingJob(DescribeStreamingJobRequest request);

    CompletableFuture<DescribeSupportFeaturesResponse> describeSupportFeatures(DescribeSupportFeaturesRequest request);

    CompletableFuture<DescribeTableResponse> describeTable(DescribeTableRequest request);

    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of a lock-waiting query only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeWaitingSQLInfoResponse> describeWaitingSQLInfo(DescribeWaitingSQLInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the lock diagnostics records only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DescribeWaitingSQLRecordsResponse> describeWaitingSQLRecords(DescribeWaitingSQLRecordsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation only for AnalyticDB for PostgreSQL V6.0 instances in elastic storage mode whose minor version is V6.6.1.0 or later.</li>
     * <li>You can call this operation to disable resource group management only for AnalyticDB for PostgreSQL instances that are in the <strong>Running</strong> state.</li>
     * <li>**Note: When the resource management method is switched, your AnalyticDB for PostgreSQL instance restarts and becomes unavailable for approximately 5 minutes. To prevent your business from being affected, call this operation during off-peak hours.</li>
     * </ul>
     */
    CompletableFuture<DisableDBResourceGroupResponse> disableDBResourceGroup(DisableDBResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to download the query diagnostic information of an AnalyticDB for PostgreSQL instance. After the download is complete, you can call the <a href="~~447712~~">DescribeDownloadRecords</a> operation to query download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For more information about how to view and update the minor engine version of an instance, see <a href="~~277424~~">View the minor engine version</a> and <a href="~~139271~~">Update the minor engine version</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<DownloadDiagnosisRecordsResponse> downloadDiagnosisRecords(DownloadDiagnosisRecordsRequest request);

    CompletableFuture<DownloadSQLLogsRecordsResponse> downloadSQLLogsRecords(DownloadSQLLogsRecordsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation only for AnalyticDB for PostgreSQL V6.0 instances in elastic storage mode whose minor version is V6.6.1.0 or later.</li>
     * <li>You can call this operation to enable resource group management only for AnalyticDB for PostgreSQL instances that are in the <strong>Running</strong> state.</li>
     * <li>**Note: When the resource management mode is changed, your AnalyticDB for PostgreSQL instance is restarted and remains unavailable within 5 minutes. To prevent your business from being affected, call this operation during off-peak hours.</li>
     * </ul>
     */
    CompletableFuture<EnableDBResourceGroupResponse> enableDBResourceGroup(EnableDBResourceGroupRequest request);

    CompletableFuture<ExecuteStatementResponse> executeStatement(ExecuteStatementRequest request);

    CompletableFuture<GetAccountResponse> getAccount(GetAccountRequest request);

    CompletableFuture<GetSecretValueResponse> getSecretValue(GetSecretValueRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to the UploadDocumentAsync operation. You can call the UploadDocumentAsync operation to create an upload job and obtain the job ID, and then call the GetUploadDocumentJob operation to query the execution information of the job.</p>
     * <blockquote>
     * <p> Suggestions:</p>
     * </blockquote>
     * <ul>
     * <li>Determine whether the document upload job times out based on the document complexity and the number of tokens after chunking. In most cases, a job that lasts more than 2 hours is considered timeout.</li>
     * </ul>
     */
    CompletableFuture<GetUploadDocumentJobResponse> getUploadDocumentJob(GetUploadDocumentJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to the <code>UpsertCollectionDataAsync</code> operation. You can call the <code>UpsertCollectionDataAsync</code> operation to create an upload job and obtain a job ID, and then call the GetUpsertCollectionDataJob operation to query the execution information of the job.</p>
     * <blockquote>
     * <p> We recommend that you evaluate the amount of time required for the upload job based on 1,000 data entries every second, and then query the job progress every 5 seconds. The timeout period can be set to 30 minutes after the evaluated amount of time.</p>
     * </blockquote>
     */
    CompletableFuture<GetUpsertCollectionDataJobResponse> getUpsertCollectionDataJob(GetUpsertCollectionDataJobRequest request);

    CompletableFuture<GrantCollectionResponse> grantCollection(GrantCollectionRequest request);

    CompletableFuture<HandleActiveSQLRecordResponse> handleActiveSQLRecord(HandleActiveSQLRecordRequest request);

    CompletableFuture<InitVectorDatabaseResponse> initVectorDatabase(InitVectorDatabaseRequest request);

    CompletableFuture<ListCollectionsResponse> listCollections(ListCollectionsRequest request);

    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    CompletableFuture<ListDocumentCollectionsResponse> listDocumentCollections(ListDocumentCollectionsRequest request);

    CompletableFuture<ListDocumentsResponse> listDocuments(ListDocumentsRequest request);

    CompletableFuture<ListExternalDataServicesResponse> listExternalDataServices(ListExternalDataServicesRequest request);

    CompletableFuture<ListExternalDataSourcesResponse> listExternalDataSources(ListExternalDataSourcesRequest request);

    CompletableFuture<ListInstanceExtensionsResponse> listInstanceExtensions(ListInstanceExtensionsRequest request);

    CompletableFuture<ListNamespacesResponse> listNamespaces(ListNamespacesRequest request);

    CompletableFuture<ListSchemasResponse> listSchemas(ListSchemasRequest request);

    CompletableFuture<ListSecretsResponse> listSecrets(ListSecretsRequest request);

    CompletableFuture<ListStreamingDataServicesResponse> listStreamingDataServices(ListStreamingDataServicesRequest request);

    CompletableFuture<ListStreamingDataSourcesResponse> listStreamingDataSources(ListStreamingDataSourcesRequest request);

    CompletableFuture<ListStreamingJobsResponse> listStreamingJobs(ListStreamingJobsRequest request);

    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request);

    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    /**
     * <b>description</b> :
     * <p>To make it easy to identify AnalyticDB for PostgreSQL instances, you can call this operation to modify the description of instances.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>The system maintains AnalyticDB for PostgreSQL instances during the maintenance window that you specify. We recommend that you set the maintenance window to off-peak hours to minimize the impact on your business.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>This operation is available only for AnalyticDB for PostgreSQL instances in reserved storage mode.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request);

    CompletableFuture<ModifyDBInstancePayTypeResponse> modifyDBInstancePayType(ModifyDBInstancePayTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see <a href="~~94475~~">What is Resource Management?</a></p>
     */
    CompletableFuture<ModifyDBInstanceResourceGroupResponse> modifyDBInstanceResourceGroup(ModifyDBInstanceResourceGroupRequest request);

    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    CompletableFuture<ModifyDBResourceGroupResponse> modifyDBResourceGroup(ModifyDBResourceGroupRequest request);

    CompletableFuture<ModifyExternalDataServiceResponse> modifyExternalDataService(ModifyExternalDataServiceRequest request);

    CompletableFuture<ModifyHadoopDataSourceResponse> modifyHadoopDataSource(ModifyHadoopDataSourceRequest request);

    CompletableFuture<ModifyJDBCDataSourceResponse> modifyJDBCDataSource(ModifyJDBCDataSourceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="~~35406~~">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     */
    CompletableFuture<ModifyMasterSpecResponse> modifyMasterSpec(ModifyMasterSpecRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be called to modify parameters of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<ModifyParametersResponse> modifyParameters(ModifyParametersRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call this operation only for AnalyticDB for PostgreSQL instances in reserved storage mode.</li>
     * <li>You can call this operation only for AnalyticDB for PostgreSQL instances in Serverless automatic scheduling mode.</li>
     * </ul>
     */
    CompletableFuture<ModifySQLCollectorPolicyResponse> modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>To ensure the security and stability of AnalyticDB for PostgreSQL instances, the system denies all external IP addresses to access AnalyticDB for PostgreSQL instances by default. Before you can use an AnalyticDB for PostgreSQL instance, you must add the IP address or CIDR block of your client to the IP address whitelist of the instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    CompletableFuture<ModifyStreamingDataServiceResponse> modifyStreamingDataService(ModifyStreamingDataServiceRequest request);

    CompletableFuture<ModifyStreamingDataSourceResponse> modifyStreamingDataSource(ModifyStreamingDataSourceRequest request);

    CompletableFuture<ModifyStreamingJobResponse> modifyStreamingJob(ModifyStreamingJobRequest request);

    CompletableFuture<ModifyVectorConfigurationResponse> modifyVectorConfiguration(ModifyVectorConfigurationRequest request);

    CompletableFuture<PauseDataRedistributeResponse> pauseDataRedistribute(PauseDataRedistributeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to pause an AnalyticDB for PostgreSQL instance that is in the <strong>Running</strong> state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see <a href="~~277424~~">View the minor engine version</a> and <a href="~~139271~~">Update the minor engine version</a>.</p>
     * <blockquote>
     * <p> Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see <a href="~~35406~~">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<PauseInstanceResponse> pauseInstance(PauseInstanceRequest request);

    CompletableFuture<QueryCollectionDataResponse> queryCollectionData(QueryCollectionDataRequest request);

    CompletableFuture<RebalanceDBInstanceResponse> rebalanceDBInstance(RebalanceDBInstanceRequest request);

    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    CompletableFuture<RerankResponse> rerank(RerankRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<ResetIMVMonitorDataResponse> resetIMVMonitorData(ResetIMVMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <p>A restart takes about 3 to 30 minutes. During the restart, services are unavailable. We recommend that you restart the instance during off-peak hours. After the instance is restarted and enters the running state, you can access the instance.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    CompletableFuture<ResumeDataRedistributeResponse> resumeDataRedistribute(ResumeDataRedistributeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to resume an AnalyticDB for PostgreSQL instance that is in the <strong>Paused</strong> state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see <a href="~~277424~~">View the minor engine version</a> and <a href="~~139271~~">Update the minor engine version</a>.</p>
     * <blockquote>
     * <p> Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see <a href="~~35406~~">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable or disable a specified plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<SetDBInstancePlanStatusResponse> setDBInstancePlanStatus(SetDBInstancePlanStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is called to enable or disable data sharing for an AnalyticDB for PostgreSQL instance in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     */
    CompletableFuture<SetDataShareInstanceResponse> setDataShareInstance(SetDataShareInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not supported for AnalyticDB for PostgreSQL instances in elastic storage mode or Serverless mode.</p>
     */
    CompletableFuture<SwitchDBInstanceNetTypeResponse> switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnbindDBResourceGroupWithRoleResponse> unbindDBResourceGroupWithRole(UnbindDBResourceGroupWithRoleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to release a sample dataset from an AnalyticDB for PostgreSQL instance. You must have already loaded the sample dataset.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<UnloadSampleDataResponse> unloadSampleData(UnloadSampleDataRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateCollectionDataMetadataResponse> updateCollectionDataMetadata(UpdateCollectionDataMetadataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a plan for an AnalyticDB for PostgreSQL instance in Serverless mode. For example, you can modify a plan for periodically pausing and resuming an instance or scaling an instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     */
    CompletableFuture<UpdateDBInstancePlanResponse> updateDBInstancePlan(UpdateDBInstancePlanRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="~~35406~~">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     */
    CompletableFuture<UpgradeDBInstanceResponse> upgradeDBInstance(UpgradeDBInstanceRequest request);

    CompletableFuture<UpgradeDBVersionResponse> upgradeDBVersion(UpgradeDBVersionRequest request);

    CompletableFuture<UpgradeExtensionsResponse> upgradeExtensions(UpgradeExtensionsRequest request);

    CompletableFuture<UpsertChunksResponse> upsertChunks(UpsertChunksRequest request);

    CompletableFuture<UpsertCollectionDataResponse> upsertCollectionData(UpsertCollectionDataRequest request);

}
