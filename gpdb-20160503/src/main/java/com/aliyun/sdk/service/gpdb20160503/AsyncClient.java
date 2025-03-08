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
     * <p>You can call this operation to apply for a public endpoint for an AnalyticDB for PostgreSQL instance. Both the primary and instance endpoints of an AnalyticDB for PostgreSQL instance can be public endpoints. For more information, see <a href="https://help.aliyun.com/document_detail/204879.html">Endpoints of an instance and its primary coordinator node</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AllocateInstancePublicConnection  AllocateInstancePublicConnectionRequest
     * @return AllocateInstancePublicConnectionResponse
     */
    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    /**
     * @param request the request parameters of BindDBResourceGroupWithRole  BindDBResourceGroupWithRoleRequest
     * @return BindDBResourceGroupWithRoleResponse
     */
    CompletableFuture<BindDBResourceGroupWithRoleResponse> bindDBResourceGroupWithRole(BindDBResourceGroupWithRoleRequest request);

    /**
     * @param request the request parameters of CancelCreateIndexJob  CancelCreateIndexJobRequest
     * @return CancelCreateIndexJobResponse
     */
    CompletableFuture<CancelCreateIndexJobResponse> cancelCreateIndexJob(CancelCreateIndexJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to the UploadDocumentAsync operation. You can call this operation to cancel a document upload job.</p>
     * <blockquote>
     * <p> If the canceling operation is complete, failed, or is canceled, you cannot call the operation again. The canceling operation only interrupts the document upload job. To remove the uploaded data, you must manually remove it or call the DeleteCollectionData operation. You can also call the document upload operation to overwrite the data by using the same FileName parameter.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CancelUploadDocumentJob  CancelUploadDocumentJobRequest
     * @return CancelUploadDocumentJobResponse
     */
    CompletableFuture<CancelUploadDocumentJobResponse> cancelUploadDocumentJob(CancelUploadDocumentJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to the <code>UpsertCollectionDataAsync</code> operation. You can call this operation to cancel an upload job.</p>
     * <blockquote>
     * <p> If the canceling operation is complete, failed, or is canceled, you cannot call the operation again. The canceling operation only interrupts the upload job. To remove the uploaded data, you must manually remove it or call the DeleteCollectionData operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CancelUpsertCollectionDataJob  CancelUpsertCollectionDataJobRequest
     * @return CancelUpsertCollectionDataJobResponse
     */
    CompletableFuture<CancelUpsertCollectionDataJobResponse> cancelUpsertCollectionDataJob(CancelUpsertCollectionDataJobRequest request);

    /**
     * @param request the request parameters of CheckHadoopDataSource  CheckHadoopDataSourceRequest
     * @return CheckHadoopDataSourceResponse
     */
    CompletableFuture<CheckHadoopDataSourceResponse> checkHadoopDataSource(CheckHadoopDataSourceRequest request);

    /**
     * @param request the request parameters of CheckHadoopNetConnection  CheckHadoopNetConnectionRequest
     * @return CheckHadoopNetConnectionResponse
     */
    CompletableFuture<CheckHadoopNetConnectionResponse> checkHadoopNetConnection(CheckHadoopNetConnectionRequest request);

    /**
     * @param request the request parameters of CheckJDBCSourceNetConnection  CheckJDBCSourceNetConnectionRequest
     * @return CheckJDBCSourceNetConnectionResponse
     */
    CompletableFuture<CheckJDBCSourceNetConnectionResponse> checkJDBCSourceNetConnection(CheckJDBCSourceNetConnectionRequest request);

    /**
     * @param request the request parameters of CheckServiceLinkedRole  CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of CloneDBInstance  CloneDBInstanceRequest
     * @return CloneDBInstanceResponse
     */
    CompletableFuture<CloneDBInstanceResponse> cloneDBInstance(CloneDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you can use an AnalyticDB for PostgreSQL instance, you must create an initial account for the instance.</p>
     * <ul>
     * <li>You can call this operation to create only initial accounts. For information about how to create other types of accounts, see <a href="https://help.aliyun.com/document_detail/50206.html">Create a database account</a>.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
     * @param request the request parameters of CreateCollection  CreateCollectionRequest
     * @return CreateCollectionResponse
     */
    CompletableFuture<CreateCollectionResponse> createCollection(CreateCollectionRequest request);

    /**
     * <b>description</b> :
     * <p>Before using this interface, please make sure you have fully understood the <a href="https://help.aliyun.com/document_detail/35406.html">billing method</a> and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/gpdb/detail/GreenplumPost">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">pricing</a> of the AnalyticDB for PostgreSQL product.</p>
     * 
     * @param request the request parameters of CreateDBInstance  CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>  The plan management feature is supported only for pay-as-you-go instances.</p>
     * <ul>
     * <li>When you change the compute node specifications or change the number of compute nodes, transient connections may occur. We recommend that you perform these operations during off-peak hours.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDBInstancePlan  CreateDBInstancePlanRequest
     * @return CreateDBInstancePlanResponse
     */
    CompletableFuture<CreateDBInstancePlanResponse> createDBInstancePlan(CreateDBInstancePlanRequest request);

    /**
     * @param request the request parameters of CreateDBResourceGroup  CreateDBResourceGroupRequest
     * @return CreateDBResourceGroupResponse
     */
    CompletableFuture<CreateDBResourceGroupResponse> createDBResourceGroup(CreateDBResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateDocumentCollection  CreateDocumentCollectionRequest
     * @return CreateDocumentCollectionResponse
     */
    CompletableFuture<CreateDocumentCollectionResponse> createDocumentCollection(CreateDocumentCollectionRequest request);

    /**
     * @param request the request parameters of CreateExtensions  CreateExtensionsRequest
     * @return CreateExtensionsResponse
     */
    CompletableFuture<CreateExtensionsResponse> createExtensions(CreateExtensionsRequest request);

    /**
     * @param request the request parameters of CreateExternalDataService  CreateExternalDataServiceRequest
     * @return CreateExternalDataServiceResponse
     */
    CompletableFuture<CreateExternalDataServiceResponse> createExternalDataService(CreateExternalDataServiceRequest request);

    /**
     * @param request the request parameters of CreateHadoopDataSource  CreateHadoopDataSourceRequest
     * @return CreateHadoopDataSourceResponse
     */
    CompletableFuture<CreateHadoopDataSourceResponse> createHadoopDataSource(CreateHadoopDataSourceRequest request);

    /**
     * @param request the request parameters of CreateIndex  CreateIndexRequest
     * @return CreateIndexResponse
     */
    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    /**
     * @param request the request parameters of CreateJDBCDataSource  CreateJDBCDataSourceRequest
     * @return CreateJDBCDataSourceResponse
     */
    CompletableFuture<CreateJDBCDataSourceResponse> createJDBCDataSource(CreateJDBCDataSourceRequest request);

    /**
     * @param request the request parameters of CreateNamespace  CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    /**
     * @param request the request parameters of CreateRemoteADBDataSource  CreateRemoteADBDataSourceRequest
     * @return CreateRemoteADBDataSourceResponse
     */
    CompletableFuture<CreateRemoteADBDataSourceResponse> createRemoteADBDataSource(CreateRemoteADBDataSourceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create a sample dataset for an AnalyticDB for PostgreSQL instance. Then, you can execute query statements on the sample dataset to use or test your instance. For more information about query statements, see <a href="https://help.aliyun.com/document_detail/452277.html">Dataset information and query examples</a>.</p>
     * <ul>
     * <li>This operation is supported only for AnalyticDB for PostgreSQL V6.3.8.8 and V6.3.10.3 or later, excluding the versions from V6.3.9.0 to V6.3.10.2.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSampleData  CreateSampleDataRequest
     * @return CreateSampleDataResponse
     */
    CompletableFuture<CreateSampleDataResponse> createSampleData(CreateSampleDataRequest request);

    /**
     * @param request the request parameters of CreateSecret  CreateSecretRequest
     * @return CreateSecretResponse
     */
    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    /**
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of CreateStreamingDataService  CreateStreamingDataServiceRequest
     * @return CreateStreamingDataServiceResponse
     */
    CompletableFuture<CreateStreamingDataServiceResponse> createStreamingDataService(CreateStreamingDataServiceRequest request);

    /**
     * @param request the request parameters of CreateStreamingDataSource  CreateStreamingDataSourceRequest
     * @return CreateStreamingDataSourceResponse
     */
    CompletableFuture<CreateStreamingDataSourceResponse> createStreamingDataSource(CreateStreamingDataSourceRequest request);

    /**
     * @param request the request parameters of CreateStreamingJob  CreateStreamingJobRequest
     * @return CreateStreamingJobResponse
     */
    CompletableFuture<CreateStreamingJobResponse> createStreamingJob(CreateStreamingJobRequest request);

    /**
     * @param request the request parameters of CreateVectorIndex  CreateVectorIndexRequest
     * @return CreateVectorIndexResponse
     */
    CompletableFuture<CreateVectorIndexResponse> createVectorIndex(CreateVectorIndexRequest request);

    /**
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
     * @param request the request parameters of DeleteCollection  DeleteCollectionRequest
     * @return DeleteCollectionResponse
     */
    CompletableFuture<DeleteCollectionResponse> deleteCollection(DeleteCollectionRequest request);

    /**
     * @param request the request parameters of DeleteCollectionData  DeleteCollectionDataRequest
     * @return DeleteCollectionDataResponse
     */
    CompletableFuture<DeleteCollectionDataResponse> deleteCollectionData(DeleteCollectionDataRequest request);

    /**
     * <b>description</b> :
     * <p>  Subscription instances cannot be manually released. They are automatically released when they expire.</p>
     * <ul>
     * <li>You can call this operation to release pay-as-you-go instances only when they are in the <strong>Running</strong> state.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteDBInstance  DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>If you no longer need a plan, you can call this operation to delete the plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteDBInstancePlan  DeleteDBInstancePlanRequest
     * @return DeleteDBInstancePlanResponse
     */
    CompletableFuture<DeleteDBInstancePlanResponse> deleteDBInstancePlan(DeleteDBInstancePlanRequest request);

    /**
     * @param request the request parameters of DeleteDBResourceGroup  DeleteDBResourceGroupRequest
     * @return DeleteDBResourceGroupResponse
     */
    CompletableFuture<DeleteDBResourceGroupResponse> deleteDBResourceGroup(DeleteDBResourceGroupRequest request);

    /**
     * @param request the request parameters of DeleteDocument  DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request);

    /**
     * @param request the request parameters of DeleteDocumentCollection  DeleteDocumentCollectionRequest
     * @return DeleteDocumentCollectionResponse
     */
    CompletableFuture<DeleteDocumentCollectionResponse> deleteDocumentCollection(DeleteDocumentCollectionRequest request);

    /**
     * @param request the request parameters of DeleteExtension  DeleteExtensionRequest
     * @return DeleteExtensionResponse
     */
    CompletableFuture<DeleteExtensionResponse> deleteExtension(DeleteExtensionRequest request);

    /**
     * @param request the request parameters of DeleteExternalDataService  DeleteExternalDataServiceRequest
     * @return DeleteExternalDataServiceResponse
     */
    CompletableFuture<DeleteExternalDataServiceResponse> deleteExternalDataService(DeleteExternalDataServiceRequest request);

    /**
     * @param request the request parameters of DeleteHadoopDataSource  DeleteHadoopDataSourceRequest
     * @return DeleteHadoopDataSourceResponse
     */
    CompletableFuture<DeleteHadoopDataSourceResponse> deleteHadoopDataSource(DeleteHadoopDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteIndex  DeleteIndexRequest
     * @return DeleteIndexResponse
     */
    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    /**
     * @param request the request parameters of DeleteJDBCDataSource  DeleteJDBCDataSourceRequest
     * @return DeleteJDBCDataSourceResponse
     */
    CompletableFuture<DeleteJDBCDataSourceResponse> deleteJDBCDataSource(DeleteJDBCDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteNamespace  DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    /**
     * @param request the request parameters of DeleteRemoteADBDataSource  DeleteRemoteADBDataSourceRequest
     * @return DeleteRemoteADBDataSourceResponse
     */
    CompletableFuture<DeleteRemoteADBDataSourceResponse> deleteRemoteADBDataSource(DeleteRemoteADBDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteSecret  DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    /**
     * @param request the request parameters of DeleteStreamingDataService  DeleteStreamingDataServiceRequest
     * @return DeleteStreamingDataServiceResponse
     */
    CompletableFuture<DeleteStreamingDataServiceResponse> deleteStreamingDataService(DeleteStreamingDataServiceRequest request);

    /**
     * @param request the request parameters of DeleteStreamingDataSource  DeleteStreamingDataSourceRequest
     * @return DeleteStreamingDataSourceResponse
     */
    CompletableFuture<DeleteStreamingDataSourceResponse> deleteStreamingDataSource(DeleteStreamingDataSourceRequest request);

    /**
     * @param request the request parameters of DeleteStreamingJob  DeleteStreamingJobRequest
     * @return DeleteStreamingJobResponse
     */
    CompletableFuture<DeleteStreamingJobResponse> deleteStreamingJob(DeleteStreamingJobRequest request);

    /**
     * @param request the request parameters of DeleteVectorIndex  DeleteVectorIndexRequest
     * @return DeleteVectorIndexResponse
     */
    CompletableFuture<DeleteVectorIndexResponse> deleteVectorIndex(DeleteVectorIndexRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is called to query the information of the privileged account in an AnalyticDB for PostgreSQL instance, such as its state, description, and the instance.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeAccounts  DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    /**
     * @param request the request parameters of DescribeActiveSQLRecords  DescribeActiveSQLRecordsRequest
     * @return DescribeActiveSQLRecordsResponse
     */
    CompletableFuture<DescribeActiveSQLRecordsResponse> describeActiveSQLRecords(DescribeActiveSQLRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available resources within a zone.</p>
     * 
     * @param request the request parameters of DescribeAvailableResources  DescribeAvailableResourcesRequest
     * @return DescribeAvailableResourcesResponse
     */
    CompletableFuture<DescribeAvailableResourcesResponse> describeAvailableResources(DescribeAvailableResourcesRequest request);

    /**
     * @param request the request parameters of DescribeBackupJob  DescribeBackupJobRequest
     * @return DescribeBackupJobResponse
     */
    CompletableFuture<DescribeBackupJobResponse> describeBackupJob(DescribeBackupJobRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the backup settings of an AnalyticDB for PostgreSQL instance in elastic storage mode. Periodically backing data can prevent data loss. For more information about how to modify backup policies, see <a href="https://help.aliyun.com/document_detail/210095.html">ModifyBackupPolicy</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * @param request the request parameters of DescribeCollection  DescribeCollectionRequest
     * @return DescribeCollectionResponse
     */
    CompletableFuture<DescribeCollectionResponse> describeCollection(DescribeCollectionRequest request);

    /**
     * @param request the request parameters of DescribeCreateIndexJob  DescribeCreateIndexJobRequest
     * @return DescribeCreateIndexJobResponse
     */
    CompletableFuture<DescribeCreateIndexJobResponse> describeCreateIndexJob(DescribeCreateIndexJobRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the information about coordinator and compute nodes in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDBClusterNode  DescribeDBClusterNodeRequest
     * @return DescribeDBClusterNodeResponse
     */
    CompletableFuture<DescribeDBClusterNodeResponse> describeDBClusterNode(DescribeDBClusterNodeRequest request);

    /**
     * <b>description</b> :
     * <p>You can query monitoring information only within the last 30 days.</p>
     * 
     * @param request the request parameters of DescribeDBClusterPerformance  DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage Instructions</h2>
     * <p>This interface is generally used to view information such as the specifications, network type, and instance status of AnalyticDB for PostgreSQL instances.</p>
     * <h2>QPS Limitation</h2>
     * <p>The default single-user QPS limit for this interface is 1000 times/second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please use it reasonably.
     * &lt;props=&quot;china&quot;&gt;The QPS in this document is only a default reference value. For accurate information, please refer to the <a href="https://quotas.console.aliyun.com/flow-control-products/gpdb/quotas">API Rate Quota List</a>.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceAttribute  DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of data bloat on an AnalyticDB for PostgreSQL instance in elastic storage mode. The minor version of the instance must be V6.3.10.1 or later. For more information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceDataBloat  DescribeDBInstanceDataBloatRequest
     * @return DescribeDBInstanceDataBloatResponse
     */
    CompletableFuture<DescribeDBInstanceDataBloatResponse> describeDBInstanceDataBloat(DescribeDBInstanceDataBloatRequest request);

    /**
     * <b>description</b> :
     * <p>To prevent data skew from affecting your database service, you can call this operation to query the details about data skew on an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceDataSkew  DescribeDBInstanceDataSkewRequest
     * @return DescribeDBInstanceDataSkewResponse
     */
    CompletableFuture<DescribeDBInstanceDataSkewResponse> describeDBInstanceDataSkew(DescribeDBInstanceDataSkewRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the distribution and states of coordinator and compute nodes in an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceDiagnosisSummary  DescribeDBInstanceDiagnosisSummaryRequest
     * @return DescribeDBInstanceDiagnosisSummaryResponse
     */
    CompletableFuture<DescribeDBInstanceDiagnosisSummaryResponse> describeDBInstanceDiagnosisSummary(DescribeDBInstanceDiagnosisSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the error logs of an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceErrorLog  DescribeDBInstanceErrorLogRequest
     * @return DescribeDBInstanceErrorLogResponse
     */
    CompletableFuture<DescribeDBInstanceErrorLogResponse> describeDBInstanceErrorLog(DescribeDBInstanceErrorLogRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceIPArrayList  DescribeDBInstanceIPArrayListRequest
     * @return DescribeDBInstanceIPArrayListResponse
     */
    CompletableFuture<DescribeDBInstanceIPArrayListResponse> describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request);

    /**
     * <b>description</b> :
     * <p>Appropriate indexes can accelerate database queries. You can call this operation to query the index usage of an AnalyticDB for PostgreSQL instance.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceIndexUsage  DescribeDBInstanceIndexUsageRequest
     * @return DescribeDBInstanceIndexUsageResponse
     */
    CompletableFuture<DescribeDBInstanceIndexUsageResponse> describeDBInstanceIndexUsage(DescribeDBInstanceIndexUsageRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceNetInfo  DescribeDBInstanceNetInfoRequest
     * @return DescribeDBInstanceNetInfoResponse
     */
    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    /**
     * @param request the request parameters of DescribeDBInstancePerformance  DescribeDBInstancePerformanceRequest
     * @return DescribeDBInstancePerformanceResponse
     */
    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of plans for an AnalyticDB for PostgreSQL instance in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDBInstancePlans  DescribeDBInstancePlansRequest
     * @return DescribeDBInstancePlansResponse
     */
    CompletableFuture<DescribeDBInstancePlansResponse> describeDBInstancePlans(DescribeDBInstancePlansRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceSSL  DescribeDBInstanceSSLRequest
     * @return DescribeDBInstanceSSLResponse
     */
    CompletableFuture<DescribeDBInstanceSSLResponse> describeDBInstanceSSL(DescribeDBInstanceSSLRequest request);

    /**
     * @param request the request parameters of DescribeDBInstanceSupportMaxPerformance  DescribeDBInstanceSupportMaxPerformanceRequest
     * @return DescribeDBInstanceSupportMaxPerformanceResponse
     */
    CompletableFuture<DescribeDBInstanceSupportMaxPerformanceResponse> describeDBInstanceSupportMaxPerformance(DescribeDBInstanceSupportMaxPerformanceRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the instance types, network types, and states of AnalyticDB for PostgreSQL instances within a region.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDBInstances  DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    /**
     * @param request the request parameters of DescribeDBResourceGroup  DescribeDBResourceGroupRequest
     * @return DescribeDBResourceGroupResponse
     */
    CompletableFuture<DescribeDBResourceGroupResponse> describeDBResourceGroup(DescribeDBResourceGroupRequest request);

    /**
     * @param request the request parameters of DescribeDBResourceManagementMode  DescribeDBResourceManagementModeRequest
     * @return DescribeDBResourceManagementModeResponse
     */
    CompletableFuture<DescribeDBResourceManagementModeResponse> describeDBResourceManagementMode(DescribeDBResourceManagementModeRequest request);

    /**
     * @param request the request parameters of DescribeDBVersionInfos  DescribeDBVersionInfosRequest
     * @return DescribeDBVersionInfosResponse
     */
    CompletableFuture<DescribeDBVersionInfosResponse> describeDBVersionInfos(DescribeDBVersionInfosRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query a list of backup sets and backup details only for instances in elastic storage mode.</p>
     * 
     * @param request the request parameters of DescribeDataBackups  DescribeDataBackupsRequest
     * @return DescribeDataBackupsResponse
     */
    CompletableFuture<DescribeDataBackupsResponse> describeDataBackups(DescribeDataBackupsRequest request);

    /**
     * @param request the request parameters of DescribeDataReDistributeInfo  DescribeDataReDistributeInfoRequest
     * @return DescribeDataReDistributeInfoResponse
     */
    CompletableFuture<DescribeDataReDistributeInfoResponse> describeDataReDistributeInfo(DescribeDataReDistributeInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Data sharing is supported only for instances in Serverless mode.</p>
     * 
     * @param request the request parameters of DescribeDataShareInstances  DescribeDataShareInstancesRequest
     * @return DescribeDataShareInstancesResponse
     */
    CompletableFuture<DescribeDataShareInstancesResponse> describeDataShareInstances(DescribeDataShareInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of data sharing performance metrics for an AnalyticDB for PostgreSQL instance in Serverless mode, such as the number of shared topics and the amount of data shared.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDataSharePerformance  DescribeDataSharePerformanceRequest
     * @return DescribeDataSharePerformanceResponse
     */
    CompletableFuture<DescribeDataSharePerformanceResponse> describeDataSharePerformance(DescribeDataSharePerformanceRequest request);

    /**
     * <b>description</b> :
     * <p>To facilitate management, you can call this operation to query all databases and database accounts on an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDiagnosisDimensions  DescribeDiagnosisDimensionsRequest
     * @return DescribeDiagnosisDimensionsResponse
     */
    CompletableFuture<DescribeDiagnosisDimensionsResponse> describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of query execution on an AnalyticDB for PostgreSQL instance in elastic storage mode within a specified time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDiagnosisMonitorPerformance  DescribeDiagnosisMonitorPerformanceRequest
     * @return DescribeDiagnosisMonitorPerformanceResponse
     */
    CompletableFuture<DescribeDiagnosisMonitorPerformanceResponse> describeDiagnosisMonitorPerformance(DescribeDiagnosisMonitorPerformanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of SQL queries on an AnalyticDB for PostgreSQL instance within a specified time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeDiagnosisRecords  DescribeDiagnosisRecordsRequest
     * @return DescribeDiagnosisRecordsResponse
     */
    CompletableFuture<DescribeDiagnosisRecordsResponse> describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about a query for an AnalyticDB for PostgreSQL instance, including the SQL statement, execution plan text, and execution plan tree.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * 
     * @param request the request parameters of DescribeDiagnosisSQLInfo  DescribeDiagnosisSQLInfoRequest
     * @return DescribeDiagnosisSQLInfoResponse
     */
    CompletableFuture<DescribeDiagnosisSQLInfoResponse> describeDiagnosisSQLInfo(DescribeDiagnosisSQLInfoRequest request);

    /**
     * @param request the request parameters of DescribeDocument  DescribeDocumentRequest
     * @return DescribeDocumentResponse
     */
    CompletableFuture<DescribeDocumentResponse> describeDocument(DescribeDocumentRequest request);

    /**
     * <b>description</b> :
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/447700.html">DownloadDiagnosisRecords</a> operation to download the query diagnostic information before you can call this operation to query the download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * 
     * @param request the request parameters of DescribeDownloadRecords  DescribeDownloadRecordsRequest
     * @return DescribeDownloadRecordsResponse
     */
    CompletableFuture<DescribeDownloadRecordsResponse> describeDownloadRecords(DescribeDownloadRecordsRequest request);

    /**
     * @param request the request parameters of DescribeDownloadSQLLogs  DescribeDownloadSQLLogsRequest
     * @return DescribeDownloadSQLLogsResponse
     */
    CompletableFuture<DescribeDownloadSQLLogsResponse> describeDownloadSQLLogs(DescribeDownloadSQLLogsRequest request);

    /**
     * @param request the request parameters of DescribeExternalDataService  DescribeExternalDataServiceRequest
     * @return DescribeExternalDataServiceResponse
     */
    CompletableFuture<DescribeExternalDataServiceResponse> describeExternalDataService(DescribeExternalDataServiceRequest request);

    /**
     * @param request the request parameters of DescribeHadoopClustersInSameNet  DescribeHadoopClustersInSameNetRequest
     * @return DescribeHadoopClustersInSameNetResponse
     */
    CompletableFuture<DescribeHadoopClustersInSameNetResponse> describeHadoopClustersInSameNet(DescribeHadoopClustersInSameNetRequest request);

    /**
     * @param request the request parameters of DescribeHadoopConfigs  DescribeHadoopConfigsRequest
     * @return DescribeHadoopConfigsResponse
     */
    CompletableFuture<DescribeHadoopConfigsResponse> describeHadoopConfigs(DescribeHadoopConfigsRequest request);

    /**
     * @param request the request parameters of DescribeHadoopDataSource  DescribeHadoopDataSourceRequest
     * @return DescribeHadoopDataSourceResponse
     */
    CompletableFuture<DescribeHadoopDataSourceResponse> describeHadoopDataSource(DescribeHadoopDataSourceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is called to query the health status of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode and its coordinator and compute nodes.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeHealthStatus  DescribeHealthStatusRequest
     * @return DescribeHealthStatusResponse
     */
    CompletableFuture<DescribeHealthStatusResponse> describeHealthStatus(DescribeHealthStatusRequest request);

    /**
     * @param request the request parameters of DescribeIMVInfos  DescribeIMVInfosRequest
     * @return DescribeIMVInfosResponse
     */
    CompletableFuture<DescribeIMVInfosResponse> describeIMVInfos(DescribeIMVInfosRequest request);

    /**
     * @param request the request parameters of DescribeIndex  DescribeIndexRequest
     * @return DescribeIndexResponse
     */
    CompletableFuture<DescribeIndexResponse> describeIndex(DescribeIndexRequest request);

    /**
     * @param request the request parameters of DescribeJDBCDataSource  DescribeJDBCDataSourceRequest
     * @return DescribeJDBCDataSourceResponse
     */
    CompletableFuture<DescribeJDBCDataSourceResponse> describeJDBCDataSource(DescribeJDBCDataSourceRequest request);

    /**
     * @param request the request parameters of DescribeLogBackups  DescribeLogBackupsRequest
     * @return DescribeLogBackupsResponse
     */
    CompletableFuture<DescribeLogBackupsResponse> describeLogBackups(DescribeLogBackupsRequest request);

    /**
     * @param request the request parameters of DescribeModifyParameterLog  DescribeModifyParameterLogRequest
     * @return DescribeModifyParameterLogResponse
     */
    CompletableFuture<DescribeModifyParameterLogResponse> describeModifyParameterLog(DescribeModifyParameterLogRequest request);

    /**
     * @param request the request parameters of DescribeNamespace  DescribeNamespaceRequest
     * @return DescribeNamespaceResponse
     */
    CompletableFuture<DescribeNamespaceResponse> describeNamespace(DescribeNamespaceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be called to query the details of parameters in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeParameters  DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    /**
     * <b>description</b> :
     * <p>When you create AnalyticDB for PostgreSQL instances, you can call this operation to query the details of vSwitches within a specified region or zone.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeRdsVSwitchs  DescribeRdsVSwitchsRequest
     * @return DescribeRdsVSwitchsResponse
     */
    CompletableFuture<DescribeRdsVSwitchsResponse> describeRdsVSwitchs(DescribeRdsVSwitchsRequest request);

    /**
     * <b>description</b> :
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available VPCs within a specified region or zone.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeRdsVpcs  DescribeRdsVpcsRequest
     * @return DescribeRdsVpcsResponse
     */
    CompletableFuture<DescribeRdsVpcsResponse> describeRdsVpcs(DescribeRdsVpcsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you create an AnalyticDB for PostgreSQL instance, you must call this operation to query available regions and zones.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRoles  DescribeRolesRequest
     * @return DescribeRolesResponse
     */
    CompletableFuture<DescribeRolesResponse> describeRoles(DescribeRolesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.</p>
     * 
     * @param request the request parameters of DescribeSQLLogCount  DescribeSQLLogCountRequest
     * @return DescribeSQLLogCountResponse
     */
    CompletableFuture<DescribeSQLLogCountResponse> describeSQLLogCount(DescribeSQLLogCountRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is no longer used. To query SQL execution logs, call the <a href="https://help.aliyun.com/document_detail/453722.html">DescribeSQLLogsV2</a> operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeSQLLogs  DescribeSQLLogsRequest
     * @return DescribeSQLLogsResponse
     */
    CompletableFuture<DescribeSQLLogsResponse> describeSQLLogs(DescribeSQLLogsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query SQL logs of an AnalyticDB for PostgreSQL instance within a specific time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeSQLLogsV2  DescribeSQLLogsV2Request
     * @return DescribeSQLLogsV2Response
     */
    CompletableFuture<DescribeSQLLogsV2Response> describeSQLLogsV2(DescribeSQLLogsV2Request request);

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeSampleData  DescribeSampleDataRequest
     * @return DescribeSampleDataResponse
     */
    CompletableFuture<DescribeSampleDataResponse> describeSampleData(DescribeSampleDataRequest request);

    /**
     * @param request the request parameters of DescribeStreamingDataService  DescribeStreamingDataServiceRequest
     * @return DescribeStreamingDataServiceResponse
     */
    CompletableFuture<DescribeStreamingDataServiceResponse> describeStreamingDataService(DescribeStreamingDataServiceRequest request);

    /**
     * @param request the request parameters of DescribeStreamingDataSource  DescribeStreamingDataSourceRequest
     * @return DescribeStreamingDataSourceResponse
     */
    CompletableFuture<DescribeStreamingDataSourceResponse> describeStreamingDataSource(DescribeStreamingDataSourceRequest request);

    /**
     * @param request the request parameters of DescribeStreamingJob  DescribeStreamingJobRequest
     * @return DescribeStreamingJobResponse
     */
    CompletableFuture<DescribeStreamingJobResponse> describeStreamingJob(DescribeStreamingJobRequest request);

    /**
     * @param request the request parameters of DescribeSupportFeatures  DescribeSupportFeaturesRequest
     * @return DescribeSupportFeaturesResponse
     */
    CompletableFuture<DescribeSupportFeaturesResponse> describeSupportFeatures(DescribeSupportFeaturesRequest request);

    /**
     * @param request the request parameters of DescribeTable  DescribeTableRequest
     * @return DescribeTableResponse
     */
    CompletableFuture<DescribeTableResponse> describeTable(DescribeTableRequest request);

    /**
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
     * @param request the request parameters of DescribeUserEncryptionKeyList  DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    CompletableFuture<DescribeUserEncryptionKeyListResponse> describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of a lock-waiting query only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeWaitingSQLInfo  DescribeWaitingSQLInfoRequest
     * @return DescribeWaitingSQLInfoResponse
     */
    CompletableFuture<DescribeWaitingSQLInfoResponse> describeWaitingSQLInfo(DescribeWaitingSQLInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the lock diagnostics records only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeWaitingSQLRecords  DescribeWaitingSQLRecordsRequest
     * @return DescribeWaitingSQLRecordsResponse
     */
    CompletableFuture<DescribeWaitingSQLRecordsResponse> describeWaitingSQLRecords(DescribeWaitingSQLRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation only for AnalyticDB for PostgreSQL V6.0 instances in elastic storage mode whose minor version is V6.6.1.0 or later.</p>
     * <ul>
     * <li>You can call this operation to disable resource group management only for AnalyticDB for PostgreSQL instances that are in the <strong>Running</strong> state.</li>
     * <li>**Note: When the resource management method is switched, your AnalyticDB for PostgreSQL instance restarts and becomes unavailable for approximately 5 minutes. To prevent your business from being affected, call this operation during off-peak hours.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableDBResourceGroup  DisableDBResourceGroupRequest
     * @return DisableDBResourceGroupResponse
     */
    CompletableFuture<DisableDBResourceGroupResponse> disableDBResourceGroup(DisableDBResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to download the query diagnostic information of an AnalyticDB for PostgreSQL instance. After the download is complete, you can call the <a href="https://help.aliyun.com/document_detail/447712.html">DescribeDownloadRecords</a> operation to query download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For more information about how to view and update the minor engine version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DownloadDiagnosisRecords  DownloadDiagnosisRecordsRequest
     * @return DownloadDiagnosisRecordsResponse
     */
    CompletableFuture<DownloadDiagnosisRecordsResponse> downloadDiagnosisRecords(DownloadDiagnosisRecordsRequest request);

    /**
     * @param request the request parameters of DownloadSQLLogsRecords  DownloadSQLLogsRecordsRequest
     * @return DownloadSQLLogsRecordsResponse
     */
    CompletableFuture<DownloadSQLLogsRecordsResponse> downloadSQLLogsRecords(DownloadSQLLogsRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation only for AnalyticDB for PostgreSQL V6.0 instances in elastic storage mode whose minor version is V6.6.1.0 or later.</p>
     * <ul>
     * <li>You can call this operation to enable resource group management only for AnalyticDB for PostgreSQL instances that are in the <strong>Running</strong> state.</li>
     * <li>**Note: When the resource management mode is changed, your AnalyticDB for PostgreSQL instance is restarted and remains unavailable within 5 minutes. To prevent your business from being affected, call this operation during off-peak hours.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableDBResourceGroup  EnableDBResourceGroupRequest
     * @return EnableDBResourceGroupResponse
     */
    CompletableFuture<EnableDBResourceGroupResponse> enableDBResourceGroup(EnableDBResourceGroupRequest request);

    /**
     * @param request the request parameters of ExecuteStatement  ExecuteStatementRequest
     * @return ExecuteStatementResponse
     */
    CompletableFuture<ExecuteStatementResponse> executeStatement(ExecuteStatementRequest request);

    /**
     * @param request the request parameters of GetAccount  GetAccountRequest
     * @return GetAccountResponse
     */
    CompletableFuture<GetAccountResponse> getAccount(GetAccountRequest request);

    /**
     * @param request the request parameters of GetSecretValue  GetSecretValueRequest
     * @return GetSecretValueResponse
     */
    CompletableFuture<GetSecretValueResponse> getSecretValue(GetSecretValueRequest request);

    /**
     * @param request the request parameters of GetStatementResult  GetStatementResultRequest
     * @return GetStatementResultResponse
     */
    CompletableFuture<GetStatementResultResponse> getStatementResult(GetStatementResultRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to the UploadDocumentAsync operation. You can call the UploadDocumentAsync operation to create an upload job and obtain the job ID, and then call the GetUploadDocumentJob operation to query the execution information of the job.</p>
     * <blockquote>
     * <p> Suggestions:</p>
     * </blockquote>
     * <ul>
     * <li>Determine whether the document upload job times out based on the document complexity and the number of tokens after chunking. In most cases, a job that lasts more than 2 hours is considered timeout.</li>
     * </ul>
     * 
     * @param request the request parameters of GetUploadDocumentJob  GetUploadDocumentJobRequest
     * @return GetUploadDocumentJobResponse
     */
    CompletableFuture<GetUploadDocumentJobResponse> getUploadDocumentJob(GetUploadDocumentJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to the <code>UpsertCollectionDataAsync</code> operation. You can call the <code>UpsertCollectionDataAsync</code> operation to create an upload job and obtain a job ID, and then call the GetUpsertCollectionDataJob operation to query the execution information of the job.</p>
     * <blockquote>
     * <p> We recommend that you evaluate the amount of time required for the upload job based on 1,000 data entries every second, and then query the job progress every 5 seconds. The timeout period can be set to 30 minutes after the evaluated amount of time.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetUpsertCollectionDataJob  GetUpsertCollectionDataJobRequest
     * @return GetUpsertCollectionDataJobResponse
     */
    CompletableFuture<GetUpsertCollectionDataJobResponse> getUpsertCollectionDataJob(GetUpsertCollectionDataJobRequest request);

    /**
     * @param request the request parameters of GrantCollection  GrantCollectionRequest
     * @return GrantCollectionResponse
     */
    CompletableFuture<GrantCollectionResponse> grantCollection(GrantCollectionRequest request);

    /**
     * @param request the request parameters of HandleActiveSQLRecord  HandleActiveSQLRecordRequest
     * @return HandleActiveSQLRecordResponse
     */
    CompletableFuture<HandleActiveSQLRecordResponse> handleActiveSQLRecord(HandleActiveSQLRecordRequest request);

    /**
     * @param request the request parameters of InitVectorDatabase  InitVectorDatabaseRequest
     * @return InitVectorDatabaseResponse
     */
    CompletableFuture<InitVectorDatabaseResponse> initVectorDatabase(InitVectorDatabaseRequest request);

    /**
     * @param request the request parameters of ListBackupJobs  ListBackupJobsRequest
     * @return ListBackupJobsResponse
     */
    CompletableFuture<ListBackupJobsResponse> listBackupJobs(ListBackupJobsRequest request);

    /**
     * @param request the request parameters of ListCollections  ListCollectionsRequest
     * @return ListCollectionsResponse
     */
    CompletableFuture<ListCollectionsResponse> listCollections(ListCollectionsRequest request);

    /**
     * @param request the request parameters of ListDatabases  ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    /**
     * @param request the request parameters of ListDocumentCollections  ListDocumentCollectionsRequest
     * @return ListDocumentCollectionsResponse
     */
    CompletableFuture<ListDocumentCollectionsResponse> listDocumentCollections(ListDocumentCollectionsRequest request);

    /**
     * @param request the request parameters of ListDocuments  ListDocumentsRequest
     * @return ListDocumentsResponse
     */
    CompletableFuture<ListDocumentsResponse> listDocuments(ListDocumentsRequest request);

    /**
     * @param request the request parameters of ListExternalDataServices  ListExternalDataServicesRequest
     * @return ListExternalDataServicesResponse
     */
    CompletableFuture<ListExternalDataServicesResponse> listExternalDataServices(ListExternalDataServicesRequest request);

    /**
     * @param request the request parameters of ListExternalDataSources  ListExternalDataSourcesRequest
     * @return ListExternalDataSourcesResponse
     */
    CompletableFuture<ListExternalDataSourcesResponse> listExternalDataSources(ListExternalDataSourcesRequest request);

    /**
     * @param request the request parameters of ListIndices  ListIndicesRequest
     * @return ListIndicesResponse
     */
    CompletableFuture<ListIndicesResponse> listIndices(ListIndicesRequest request);

    /**
     * @param request the request parameters of ListInstanceExtensions  ListInstanceExtensionsRequest
     * @return ListInstanceExtensionsResponse
     */
    CompletableFuture<ListInstanceExtensionsResponse> listInstanceExtensions(ListInstanceExtensionsRequest request);

    /**
     * @param request the request parameters of ListNamespaces  ListNamespacesRequest
     * @return ListNamespacesResponse
     */
    CompletableFuture<ListNamespacesResponse> listNamespaces(ListNamespacesRequest request);

    /**
     * @param request the request parameters of ListRemoteADBDataSources  ListRemoteADBDataSourcesRequest
     * @return ListRemoteADBDataSourcesResponse
     */
    CompletableFuture<ListRemoteADBDataSourcesResponse> listRemoteADBDataSources(ListRemoteADBDataSourcesRequest request);

    /**
     * @param request the request parameters of ListSchemas  ListSchemasRequest
     * @return ListSchemasResponse
     */
    CompletableFuture<ListSchemasResponse> listSchemas(ListSchemasRequest request);

    /**
     * @param request the request parameters of ListSecrets  ListSecretsRequest
     * @return ListSecretsResponse
     */
    CompletableFuture<ListSecretsResponse> listSecrets(ListSecretsRequest request);

    /**
     * @param request the request parameters of ListStreamingDataServices  ListStreamingDataServicesRequest
     * @return ListStreamingDataServicesResponse
     */
    CompletableFuture<ListStreamingDataServicesResponse> listStreamingDataServices(ListStreamingDataServicesRequest request);

    /**
     * @param request the request parameters of ListStreamingDataSources  ListStreamingDataSourcesRequest
     * @return ListStreamingDataSourcesResponse
     */
    CompletableFuture<ListStreamingDataSourcesResponse> listStreamingDataSources(ListStreamingDataSourcesRequest request);

    /**
     * @param request the request parameters of ListStreamingJobs  ListStreamingJobsRequest
     * @return ListStreamingJobsResponse
     */
    CompletableFuture<ListStreamingJobsResponse> listStreamingJobs(ListStreamingJobsRequest request);

    /**
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ModifyAccountDescription  ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    CompletableFuture<ModifyAccountDescriptionResponse> modifyAccountDescription(ModifyAccountDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyBackupPolicy  ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceConfig  ModifyDBInstanceConfigRequest
     * @return ModifyDBInstanceConfigResponse
     */
    CompletableFuture<ModifyDBInstanceConfigResponse> modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceConnectionString  ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    CompletableFuture<ModifyDBInstanceConnectionStringResponse> modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceDeploymentMode  ModifyDBInstanceDeploymentModeRequest
     * @return ModifyDBInstanceDeploymentModeResponse
     */
    CompletableFuture<ModifyDBInstanceDeploymentModeResponse> modifyDBInstanceDeploymentMode(ModifyDBInstanceDeploymentModeRequest request);

    /**
     * <b>description</b> :
     * <p>To make it easy to identify AnalyticDB for PostgreSQL instances, you can call this operation to modify the description of instances.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceDescription  ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>The system maintains AnalyticDB for PostgreSQL instances during the maintenance window that you specify. We recommend that you set the maintenance window to off-peak hours to minimize the impact on your business.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceMaintainTime  ModifyDBInstanceMaintainTimeRequest
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>This operation is available only for AnalyticDB for PostgreSQL instances in reserved storage mode.</p>
     * <h2>QPS limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyDBInstanceNetworkType  ModifyDBInstanceNetworkTypeRequest
     * @return ModifyDBInstanceNetworkTypeResponse
     */
    CompletableFuture<ModifyDBInstanceNetworkTypeResponse> modifyDBInstanceNetworkType(ModifyDBInstanceNetworkTypeRequest request);

    /**
     * @param request the request parameters of ModifyDBInstancePayType  ModifyDBInstancePayTypeRequest
     * @return ModifyDBInstancePayTypeResponse
     */
    CompletableFuture<ModifyDBInstancePayTypeResponse> modifyDBInstancePayType(ModifyDBInstancePayTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a></p>
     * 
     * @param request the request parameters of ModifyDBInstanceResourceGroup  ModifyDBInstanceResourceGroupRequest
     * @return ModifyDBInstanceResourceGroupResponse
     */
    CompletableFuture<ModifyDBInstanceResourceGroupResponse> modifyDBInstanceResourceGroup(ModifyDBInstanceResourceGroupRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceSSL  ModifyDBInstanceSSLRequest
     * @return ModifyDBInstanceSSLResponse
     */
    CompletableFuture<ModifyDBInstanceSSLResponse> modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request);

    /**
     * @param request the request parameters of ModifyDBResourceGroup  ModifyDBResourceGroupRequest
     * @return ModifyDBResourceGroupResponse
     */
    CompletableFuture<ModifyDBResourceGroupResponse> modifyDBResourceGroup(ModifyDBResourceGroupRequest request);

    /**
     * @param request the request parameters of ModifyExternalDataService  ModifyExternalDataServiceRequest
     * @return ModifyExternalDataServiceResponse
     */
    CompletableFuture<ModifyExternalDataServiceResponse> modifyExternalDataService(ModifyExternalDataServiceRequest request);

    /**
     * @param request the request parameters of ModifyHadoopDataSource  ModifyHadoopDataSourceRequest
     * @return ModifyHadoopDataSourceResponse
     */
    CompletableFuture<ModifyHadoopDataSourceResponse> modifyHadoopDataSource(ModifyHadoopDataSourceRequest request);

    /**
     * @param request the request parameters of ModifyJDBCDataSource  ModifyJDBCDataSourceRequest
     * @return ModifyJDBCDataSourceResponse
     */
    CompletableFuture<ModifyJDBCDataSourceResponse> modifyJDBCDataSource(ModifyJDBCDataSourceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * 
     * @param request the request parameters of ModifyMasterSpec  ModifyMasterSpecRequest
     * @return ModifyMasterSpecResponse
     */
    CompletableFuture<ModifyMasterSpecResponse> modifyMasterSpec(ModifyMasterSpecRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be called to modify parameters of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyParameters  ModifyParametersRequest
     * @return ModifyParametersResponse
     */
    CompletableFuture<ModifyParametersResponse> modifyParameters(ModifyParametersRequest request);

    /**
     * @param request the request parameters of ModifyRemoteADBDataSource  ModifyRemoteADBDataSourceRequest
     * @return ModifyRemoteADBDataSourceResponse
     */
    CompletableFuture<ModifyRemoteADBDataSourceResponse> modifyRemoteADBDataSource(ModifyRemoteADBDataSourceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation only for AnalyticDB for PostgreSQL instances in reserved storage mode.</p>
     * <ul>
     * <li>You can call this operation only for AnalyticDB for PostgreSQL instances in Serverless automatic scheduling mode.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySQLCollectorPolicy  ModifySQLCollectorPolicyRequest
     * @return ModifySQLCollectorPolicyResponse
     */
    CompletableFuture<ModifySQLCollectorPolicyResponse> modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>To ensure the security and stability of AnalyticDB for PostgreSQL instances, the system denies all external IP addresses to access AnalyticDB for PostgreSQL instances by default. Before you can use an AnalyticDB for PostgreSQL instance, you must add the IP address or CIDR block of your client to the IP address whitelist of the instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifySecurityIps  ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    CompletableFuture<ModifySecurityIpsResponse> modifySecurityIps(ModifySecurityIpsRequest request);

    /**
     * @param request the request parameters of ModifyStreamingDataService  ModifyStreamingDataServiceRequest
     * @return ModifyStreamingDataServiceResponse
     */
    CompletableFuture<ModifyStreamingDataServiceResponse> modifyStreamingDataService(ModifyStreamingDataServiceRequest request);

    /**
     * @param request the request parameters of ModifyStreamingDataSource  ModifyStreamingDataSourceRequest
     * @return ModifyStreamingDataSourceResponse
     */
    CompletableFuture<ModifyStreamingDataSourceResponse> modifyStreamingDataSource(ModifyStreamingDataSourceRequest request);

    /**
     * @param request the request parameters of ModifyStreamingJob  ModifyStreamingJobRequest
     * @return ModifyStreamingJobResponse
     */
    CompletableFuture<ModifyStreamingJobResponse> modifyStreamingJob(ModifyStreamingJobRequest request);

    /**
     * @param request the request parameters of ModifyVectorConfiguration  ModifyVectorConfigurationRequest
     * @return ModifyVectorConfigurationResponse
     */
    CompletableFuture<ModifyVectorConfigurationResponse> modifyVectorConfiguration(ModifyVectorConfigurationRequest request);

    /**
     * @param request the request parameters of PauseDataRedistribute  PauseDataRedistributeRequest
     * @return PauseDataRedistributeResponse
     */
    CompletableFuture<PauseDataRedistributeResponse> pauseDataRedistribute(PauseDataRedistributeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to pause an AnalyticDB for PostgreSQL instance that is in the <strong>Running</strong> state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <blockquote>
     * <p> Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PauseInstance  PauseInstanceRequest
     * @return PauseInstanceResponse
     */
    CompletableFuture<PauseInstanceResponse> pauseInstance(PauseInstanceRequest request);

    /**
     * @param request the request parameters of QueryCollectionData  QueryCollectionDataRequest
     * @return QueryCollectionDataResponse
     */
    CompletableFuture<QueryCollectionDataResponse> queryCollectionData(QueryCollectionDataRequest request);

    /**
     * @param request the request parameters of RebalanceDBInstance  RebalanceDBInstanceRequest
     * @return RebalanceDBInstanceResponse
     */
    CompletableFuture<RebalanceDBInstanceResponse> rebalanceDBInstance(RebalanceDBInstanceRequest request);

    /**
     * @param request the request parameters of ReleaseInstancePublicConnection  ReleaseInstancePublicConnectionRequest
     * @return ReleaseInstancePublicConnectionResponse
     */
    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    /**
     * @param request the request parameters of Rerank  RerankRequest
     * @return RerankResponse
     */
    CompletableFuture<RerankResponse> rerank(RerankRequest request);

    /**
     * @param request the request parameters of ResetAccountPassword  ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    /**
     * @param request the request parameters of ResetIMVMonitorData  ResetIMVMonitorDataRequest
     * @return ResetIMVMonitorDataResponse
     */
    CompletableFuture<ResetIMVMonitorDataResponse> resetIMVMonitorData(ResetIMVMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <p>A restart takes about 3 to 30 minutes. During the restart, services are unavailable. We recommend that you restart the instance during off-peak hours. After the instance is restarted and enters the running state, you can access the instance.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of RestartDBInstance  RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    /**
     * @param request the request parameters of ResumeDataRedistribute  ResumeDataRedistributeRequest
     * @return ResumeDataRedistributeResponse
     */
    CompletableFuture<ResumeDataRedistributeResponse> resumeDataRedistribute(ResumeDataRedistributeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to resume an AnalyticDB for PostgreSQL instance that is in the <strong>Paused</strong> state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <blockquote>
     * <p> Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ResumeInstance  ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    CompletableFuture<ResumeInstanceResponse> resumeInstance(ResumeInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable or disable a specified plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetDBInstancePlanStatus  SetDBInstancePlanStatusRequest
     * @return SetDBInstancePlanStatusResponse
     */
    CompletableFuture<SetDBInstancePlanStatusResponse> setDBInstancePlanStatus(SetDBInstancePlanStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is called to enable or disable data sharing for an AnalyticDB for PostgreSQL instance in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of SetDataShareInstance  SetDataShareInstanceRequest
     * @return SetDataShareInstanceResponse
     */
    CompletableFuture<SetDataShareInstanceResponse> setDataShareInstance(SetDataShareInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not supported for AnalyticDB for PostgreSQL instances in elastic storage mode or Serverless mode.</p>
     * 
     * @param request the request parameters of SwitchDBInstanceNetType  SwitchDBInstanceNetTypeRequest
     * @return SwitchDBInstanceNetTypeResponse
     */
    CompletableFuture<SwitchDBInstanceNetTypeResponse> switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of TextEmbedding  TextEmbeddingRequest
     * @return TextEmbeddingResponse
     */
    CompletableFuture<TextEmbeddingResponse> textEmbedding(TextEmbeddingRequest request);

    /**
     * @param request the request parameters of UnbindDBResourceGroupWithRole  UnbindDBResourceGroupWithRoleRequest
     * @return UnbindDBResourceGroupWithRoleResponse
     */
    CompletableFuture<UnbindDBResourceGroupWithRoleResponse> unbindDBResourceGroupWithRole(UnbindDBResourceGroupWithRoleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to release a sample dataset from an AnalyticDB for PostgreSQL instance. You must have already loaded the sample dataset.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UnloadSampleData  UnloadSampleDataRequest
     * @return UnloadSampleDataResponse
     */
    CompletableFuture<UnloadSampleDataResponse> unloadSampleData(UnloadSampleDataRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateCollectionDataMetadata  UpdateCollectionDataMetadataRequest
     * @return UpdateCollectionDataMetadataResponse
     */
    CompletableFuture<UpdateCollectionDataMetadataResponse> updateCollectionDataMetadata(UpdateCollectionDataMetadataRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a plan for an AnalyticDB for PostgreSQL instance in Serverless mode. For example, you can modify a plan for periodically pausing and resuming an instance or scaling an instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateDBInstancePlan  UpdateDBInstancePlanRequest
     * @return UpdateDBInstancePlanResponse
     */
    CompletableFuture<UpdateDBInstancePlanResponse> updateDBInstancePlan(UpdateDBInstancePlanRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * 
     * @param request the request parameters of UpgradeDBInstance  UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     */
    CompletableFuture<UpgradeDBInstanceResponse> upgradeDBInstance(UpgradeDBInstanceRequest request);

    /**
     * @param request the request parameters of UpgradeDBVersion  UpgradeDBVersionRequest
     * @return UpgradeDBVersionResponse
     */
    CompletableFuture<UpgradeDBVersionResponse> upgradeDBVersion(UpgradeDBVersionRequest request);

    /**
     * @param request the request parameters of UpgradeExtensions  UpgradeExtensionsRequest
     * @return UpgradeExtensionsResponse
     */
    CompletableFuture<UpgradeExtensionsResponse> upgradeExtensions(UpgradeExtensionsRequest request);

    /**
     * <b>description</b> :
     * <p>The vectorization algorithm for the document is specified by the CreateDocumentCollection API.</p>
     * 
     * @param request the request parameters of UpsertChunks  UpsertChunksRequest
     * @return UpsertChunksResponse
     */
    CompletableFuture<UpsertChunksResponse> upsertChunks(UpsertChunksRequest request);

    /**
     * @param request the request parameters of UpsertCollectionData  UpsertCollectionDataRequest
     * @return UpsertCollectionDataResponse
     */
    CompletableFuture<UpsertCollectionDataResponse> upsertCollectionData(UpsertCollectionDataRequest request);

}
