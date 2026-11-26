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
     * <h2>Usage notes</h2>
     * <p>You can call this operation to add an AI node.</p>
     * <h2>QPS limits</h2>
     * <p>The default QPS limit per user for this operation is 1,000 calls per second. If this limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.
     * &lt;props=&quot;china&quot;&gt;The QPS limits in this document are for reference only. For accurate information, see <a href="https://quotas.console.aliyun.com/flow-control-products/gpdb/quotas">API rate limits</a>.</p>
     * 
     * @param request the request parameters of AddAINode  AddAINodeRequest
     * @return AddAINodeResponse
     */
    CompletableFuture<AddAINodeResponse> addAINode(AddAINodeRequest request);

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
     * <p>This operation is related to UploadDocumentAsync and is used to cancel an upload task.</p>
     * <blockquote>
     * <p>You cannot call this operation again if the task has already succeeded, failed, or been canceled. Calling this operation only interrupts the upload task. For the data that has already been written, you must manually delete it, call the DeleteCollectionData operation to delete it, or upload a file with the same FileName to overwrite it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CancelUploadDocumentJob  CancelUploadDocumentJobRequest
     * @return CancelUploadDocumentJobResponse
     */
    CompletableFuture<CancelUploadDocumentJobResponse> cancelUploadDocumentJob(CancelUploadDocumentJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to <code>UpsertCollectionDataAsync</code>. It is used to cancel an upload task.</p>
     * <blockquote>
     * <p>You cannot call this operation to cancel a task that has already succeeded, failed, or been canceled. Calling this operation only interrupts the upload task. You must manually delete the data that has already been written or call the DeleteCollectionData operation to delete it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CancelUpsertCollectionDataJob  CancelUpsertCollectionDataJobRequest
     * @return CancelUpsertCollectionDataJobResponse
     */
    CompletableFuture<CancelUpsertCollectionDataJobResponse> cancelUpsertCollectionDataJob(CancelUpsertCollectionDataJobRequest request);

    /**
     * <b>description</b> :
     * <p>This API allows you to interact with large language models through specified knowledge base collections to obtain answers based on knowledge base content. You can configure various parameters to customize requests, including but not limited to the database instance ID, knowledge retrieval parameters, and model inference parameters. In addition, a default system prompt template is provided, and you can customize system prompts.</p>
     * <ul>
     * <li><strong>DBInstanceId</strong>: Required. The ID of the database instance.</li>
     * <li><strong>KnowledgeParams</strong>: Optional. The parameters related to knowledge retrieval, such as retrieval content and merge strategies.</li>
     * <li><strong>ModelParams</strong>: Required. The parameters related to model inference, such as the message list and the model name.</li>
     * <li><strong>PromptTemplate</strong>: Optional. The custom system prompt template.</li>
     * </ul>
     * 
     * @param request the request parameters of ChatWithKnowledgeBase  ChatWithKnowledgeBaseRequest
     * @return ChatWithKnowledgeBaseResponse
     */
    CompletableFuture<ChatWithKnowledgeBaseResponse> chatWithKnowledgeBase(ChatWithKnowledgeBaseRequest request);

    /**
     * <b>description</b> :
     * <p>This API allows you to interact with large language models through specified knowledge base collections to obtain answers based on the knowledge base content. You can configure various parameters to customize requests, including but not limited to the database instance ID, knowledge retrieval parameters, and model inference parameters. Additionally, this API provides a default system prompt template and allows you to customize system prompts.</p>
     * <ul>
     * <li>DBInstanceId: required. Specifies the ID of the database instance.</li>
     * <li>KnowledgeParams: optional. Contains parameters related to knowledge retrieval, such as retrieval content and merge strategies.</li>
     * <li>ModelParams: required. Contains parameters related to model inference, such as the message list and the model name.</li>
     * <li>PromptTemplate: optional. Used to customize the system prompt template.</li>
     * </ul>
     * 
     * @param request the request parameters of ChatWithKnowledgeBaseStream  ChatWithKnowledgeBaseStreamRequest
     * @return ChatWithKnowledgeBaseStreamResponse
     */
    CompletableFuture<ChatWithKnowledgeBaseStreamResponse> chatWithKnowledgeBaseStream(ChatWithKnowledgeBaseStreamRequest request);

    ResponseIterable<ChatWithKnowledgeBaseStreamResponseBody> chatWithKnowledgeBaseStreamWithResponseIterable(ChatWithKnowledgeBaseStreamRequest request);

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
     * <b>description</b> :
     * <p>Checks for available updates for a SaaS service.</p>
     * 
     * @param request the request parameters of CheckSaasServiceVersion  CheckSaasServiceVersionRequest
     * @return CheckSaasServiceVersionResponse
     */
    CompletableFuture<CheckSaasServiceVersionResponse> checkSaasServiceVersion(CheckSaasServiceVersionRequest request);

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
     * @param request the request parameters of CreateAIService  CreateAIServiceRequest
     * @return CreateAIServiceResponse
     */
    CompletableFuture<CreateAIServiceResponse> createAIService(CreateAIServiceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before using an AnalyticDB for PostgreSQL instance, you must create an initial account.</li>
     * <li>This operation only supports creating an initial account. To create other accounts, refer to <a href="https://help.aliyun.com/document_detail/50206.html">Create a database account</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccount  CreateAccountRequest
     * @return CreateAccountResponse
     */
    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an API key.</p>
     * 
     * @param request the request parameters of CreateApiKey  CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    CompletableFuture<CreateApiKeyResponse> createApiKey(CreateApiKeyRequest request);

    /**
     * @param request the request parameters of CreateBackup  CreateBackupRequest
     * @return CreateBackupResponse
     */
    CompletableFuture<CreateBackupResponse> createBackup(CreateBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a new Supabase branch based on a specified parent branch. By default, a child branch inherits resource configurations such as region, network, and storage from the main branch.</p>
     * 
     * @param request the request parameters of CreateBranch  CreateBranchRequest
     * @return CreateBranchResponse
     */
    CompletableFuture<CreateBranchResponse> createBranch(CreateBranchRequest request);

    /**
     * @param request the request parameters of CreateCollection  CreateCollectionRequest
     * @return CreateCollectionResponse
     */
    CompletableFuture<CreateCollectionResponse> createCollection(CreateCollectionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/35406.html">billing methods</a> and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/gpdb/detail/GreenplumPost">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">pricing</a> of AnalyticDB for PostgreSQL.</p>
     * 
     * @param request the request parameters of CreateDBInstance  CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    /**
     * @param request the request parameters of CreateDBInstanceIPArray  CreateDBInstanceIPArrayRequest
     * @return CreateDBInstanceIPArrayResponse
     */
    CompletableFuture<CreateDBInstanceIPArrayResponse> createDBInstanceIPArray(CreateDBInstanceIPArrayRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The billing method of the instance must be pay-as-you-go.</li>
     * <li>When you change the specifications or scale the instance, transient disconnections may occur. Set the execution time to off-peak hours.
     * Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/35406.html">billing methods</a> and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/gpdb/detail/GreenplumPost">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">pricing</a> of AnalyticDB for PostgreSQL before you call this operation.</li>
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
     * @param request the request parameters of CreateDatabase  CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

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
     * @param request the request parameters of CreateModelOperatorApiKey  CreateModelOperatorApiKeyRequest
     * @return CreateModelOperatorApiKeyResponse
     */
    CompletableFuture<CreateModelOperatorApiKeyResponse> createModelOperatorApiKey(CreateModelOperatorApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before invoking this operation, make sure that you fully understand the billing methods and pricing of the model creation operator sub-service, and confirm the prices for the target region and specifications in the console.</em>*
     * This operation creates a model creation operator sub-service and generates a sales order. If the request is successful, a ServiceId and an OrderId are returned. The sub-service is asynchronously activated by a sales callback, which does not mean that the sub-service is immediately active. You can invoke ListModelOperatorServices to query the sub-service status. After the sub-service is activated, you can invoke CreateModelOperatorApiKey to create invocation credentials.
     * Each successful invocation may generate a new order. Do not query the progress by repeatedly creating sub-services. If an invocation timeout occurs or the result is ambiguous, check the original order and sub-service before you decide whether to retry.</p>
     * 
     * @param request the request parameters of CreateModelOperatorService  CreateModelOperatorServiceRequest
     * @return CreateModelOperatorServiceResponse
     */
    CompletableFuture<CreateModelOperatorServiceResponse> createModelOperatorService(CreateModelOperatorServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/35406.html">billing methods</a> and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/gpdb/detail/GreenplumPost">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">pricing</a> of AnalyticDB for PostgreSQL.</p>
     * 
     * @param request the request parameters of CreateModelService  CreateModelServiceRequest
     * @return CreateModelServiceResponse
     */
    CompletableFuture<CreateModelServiceResponse> createModelService(CreateModelServiceRequest request);

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
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/35406.html">billing methods</a> and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/gpdb/detail/GreenplumPost">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">pricing</a> of AnalyticDB for PostgreSQL.</p>
     * 
     * @param request the request parameters of CreateSaasService  CreateSaasServiceRequest
     * @return CreateSaasServiceResponse
     */
    CompletableFuture<CreateSaasServiceResponse> createSaasService(CreateSaasServiceRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create a sample dataset for an AnalyticDB for PostgreSQL instance. Then, you can execute query statements on the sample dataset to experience or test your instance. For more information about query statements, see <a href="https://help.aliyun.com/document_detail/452277.html">Dataset information and query examples</a>.</p>
     * <ul>
     * <li>This operation is supported only for AnalyticDB for PostgreSQL V6.3.8.8 to 6.3.8.x, V6.3.10.3, and later.</li>
     * <li>Versions from V6.3.9.0 to V6.3.10.2 are not supported.</li>
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
     * <b>description</b> :
     * <p>This operation creates a snapshot for a Supabase project based on a specified point in time or log sequence number (LSN). You must specify either SnapshotTimestamp or Lsn. ClientToken ensures request idempotence.</p>
     * 
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

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
     * <b>description</b> :
     * <p>The instance must be in the running state. After a successful call, you can call ListSupabaseBackupJobs to query the progress of the backup job and call ListSupabaseDataBackups to query the backup sets.</p>
     * 
     * @param request the request parameters of CreateSupabaseBackup  CreateSupabaseBackupRequest
     * @return CreateSupabaseBackupResponse
     */
    CompletableFuture<CreateSupabaseBackupResponse> createSupabaseBackup(CreateSupabaseBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a Supabase project in a specified region and active zone. This operation supports the free, pay-as-you-go, and subscription billing methods. You can specify the network, specifications, storage, access whitelist, DPI engine version, and auto-start and auto-stop configurations.</p>
     * 
     * @param request the request parameters of CreateSupabaseProject  CreateSupabaseProjectRequest
     * @return CreateSupabaseProjectResponse
     */
    CompletableFuture<CreateSupabaseProjectResponse> createSupabaseProject(CreateSupabaseProjectRequest request);

    /**
     * @param request the request parameters of CreateVectorIndex  CreateVectorIndexRequest
     * @return CreateVectorIndexResponse
     */
    CompletableFuture<CreateVectorIndexResponse> createVectorIndex(CreateVectorIndexRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a context service workspace.</p>
     * 
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Subscription instances do not support manual release, and automatic release is triggered when the instance expires.</li>
     * <li>Only pay-as-you-go instances in the <strong>Running</strong> state can be released by calling this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAINode  DeleteAINodeRequest
     * @return DeleteAINodeResponse
     */
    CompletableFuture<DeleteAINodeResponse> deleteAINode(DeleteAINodeRequest request);

    /**
     * @param request the request parameters of DeleteAIService  DeleteAIServiceRequest
     * @return DeleteAIServiceResponse
     */
    CompletableFuture<DeleteAIServiceResponse> deleteAIService(DeleteAIServiceRequest request);

    /**
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes an API key.</p>
     * 
     * @param request the request parameters of DeleteApiKey  DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    CompletableFuture<DeleteApiKeyResponse> deleteApiKey(DeleteApiKeyRequest request);

    /**
     * @param request the request parameters of DeleteBackup  DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    CompletableFuture<DeleteBackupResponse> deleteBackup(DeleteBackupRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified Supabase branch. You cannot delete the default branch or a branch that has child branches.</p>
     * 
     * @param request the request parameters of DeleteBranch  DeleteBranchRequest
     * @return DeleteBranchResponse
     */
    CompletableFuture<DeleteBranchResponse> deleteBranch(DeleteBranchRequest request);

    /**
     * @param request the request parameters of DeleteChunks  DeleteChunksRequest
     * @return DeleteChunksResponse
     */
    CompletableFuture<DeleteChunksResponse> deleteChunks(DeleteChunksRequest request);

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
     * <ul>
     * <li>Subscription instances do not support manual release. Automatic release is triggered when the instance expires.</li>
     * <li>Only pay-as-you-go instances in the <strong>Running</strong> state can be released by calling this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDBInstance  DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     */
    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    /**
     * @param request the request parameters of DeleteDBInstanceIPArray  DeleteDBInstanceIPArrayRequest
     * @return DeleteDBInstanceIPArrayResponse
     */
    CompletableFuture<DeleteDBInstanceIPArrayResponse> deleteDBInstanceIPArray(DeleteDBInstanceIPArrayRequest request);

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
     * @param request the request parameters of DeleteDatabase  DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     */
    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

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
     * <b>description</b> :
     * <p>Deletes a specified API key. A successful request indicates that the deletion intent is accepted, and external credentials are asynchronously cleaned up by the system. This does not mean that all underlying resources have been deleted.
     * After the deletion is accepted, the key no longer appears in the ListModelOperatorApiKeys response. During the cleanup process, DescribeModelOperatorApiKey returns Deleting and does not return the plaintext key or the endpoint. After the cleanup is complete, it returns a resource not found error.
     * Use the endpoint of the region to which the target key belongs, and specify an ApiKeyId greater than 0.</p>
     * 
     * @param request the request parameters of DeleteModelOperatorApiKey  DeleteModelOperatorApiKeyRequest
     * @return DeleteModelOperatorApiKeyResponse
     */
    CompletableFuture<DeleteModelOperatorApiKeyResponse> deleteModelOperatorApiKey(DeleteModelOperatorApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>Releases a specified model operator service. Standard deletion supports services in the active or locked state. You cannot initiate a new release for services in processing states such as locking or unlocking.
     * Delete all API keys under the service that have not been marked for deletion. Subscription services must be unsubscribed or refunded through the sales process and cannot be released directly through this operation. Pay-as-you-go services are accepted for deletion after passing ownership, billing type, and associated key checks.
     * A successful request indicates that the deletion intent is accepted and the system asynchronously cleans up associated resources. It does not mean that all underlying resources are deleted. You can call ListModelOperatorServices to query the deleting state. After all keys and gateway resources are physically cleaned up, the service no longer appears in the list.
     * Use the endpoint of the region where the service resides to make the call. The Force parameter is not provided as a user parameter for this operation and cannot be used to bypass the associated key check.</p>
     * 
     * @param request the request parameters of DeleteModelOperatorService  DeleteModelOperatorServiceRequest
     * @return DeleteModelOperatorServiceResponse
     */
    CompletableFuture<DeleteModelOperatorServiceResponse> deleteModelOperatorService(DeleteModelOperatorServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a model service.</p>
     * 
     * @param request the request parameters of DeleteModelService  DeleteModelServiceRequest
     * @return DeleteModelServiceResponse
     */
    CompletableFuture<DeleteModelServiceResponse> deleteModelService(DeleteModelServiceRequest request);

    /**
     * @param request the request parameters of DeleteNamespace  DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    /**
     * @param request the request parameters of DeletePrivateRAGService  DeletePrivateRAGServiceRequest
     * @return DeletePrivateRAGServiceResponse
     */
    CompletableFuture<DeletePrivateRAGServiceResponse> deletePrivateRAGService(DeletePrivateRAGServiceRequest request);

    /**
     * @param request the request parameters of DeleteRemoteADBDataSource  DeleteRemoteADBDataSourceRequest
     * @return DeleteRemoteADBDataSourceResponse
     */
    CompletableFuture<DeleteRemoteADBDataSourceResponse> deleteRemoteADBDataSource(DeleteRemoteADBDataSourceRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a SaaS service.</p>
     * 
     * @param request the request parameters of DeleteSaasService  DeleteSaasServiceRequest
     * @return DeleteSaasServiceResponse
     */
    CompletableFuture<DeleteSaasServiceResponse> deleteSaasService(DeleteSaasServiceRequest request);

    /**
     * @param request the request parameters of DeleteSecret  DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a snapshot in a specified Supabase project by ProjectId and Lsn.</p>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

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
     * <b>description</b> :
     * <p>  You can call this operation to delete a Supabase project.</p>
     * 
     * @param request the request parameters of DeleteSupabaseProject  DeleteSupabaseProjectRequest
     * @return DeleteSupabaseProjectResponse
     */
    CompletableFuture<DeleteSupabaseProjectResponse> deleteSupabaseProject(DeleteSupabaseProjectRequest request);

    /**
     * @param request the request parameters of DeleteVectorIndex  DeleteVectorIndexRequest
     * @return DeleteVectorIndexResponse
     */
    CompletableFuture<DeleteVectorIndexResponse> deleteVectorIndex(DeleteVectorIndexRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a context service workspace.</p>
     * 
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <ol>
     * <li>部署私有RAG服务前，请先创建初始账号。</li>
     * <li>私有RAG服务支持向量接口，调用时请配置CA证书。</li>
     * </ol>
     * 
     * @param request the request parameters of DeployPrivateRAGService  DeployPrivateRAGServiceRequest
     * @return DeployPrivateRAGServiceResponse
     */
    CompletableFuture<DeployPrivateRAGServiceResponse> deployPrivateRAGService(DeployPrivateRAGServiceRequest request);

    /**
     * @param request the request parameters of DescribeAIService  DescribeAIServiceRequest
     * @return DescribeAIServiceResponse
     */
    CompletableFuture<DescribeAIServiceResponse> describeAIService(DescribeAIServiceRequest request);

    /**
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
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available resources in the destination zone.</p>
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
     * <p>Periodic data backups effectively prevent data loss. You can call this operation to query the backup policy of an instance in elastic storage mode. To modify the backup policy, see <a href="https://help.aliyun.com/document_detail/210095.html">ModifyBackupPolicy</a>.</p>
     * 
     * @param request the request parameters of DescribeBackupPolicy  DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the details of a specified Supabase branch and returns the basic attributes, parent branch information, protection status, and connection information of the branch.</p>
     * 
     * @param request the request parameters of DescribeBranch  DescribeBranchRequest
     * @return DescribeBranchResponse
     */
    CompletableFuture<DescribeBranchResponse> describeBranch(DescribeBranchRequest request);

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
     * <p>You can query monitoring information only for the last 30 days.</p>
     * 
     * @param request the request parameters of DescribeDBClusterPerformance  DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    CompletableFuture<DescribeDBClusterPerformanceResponse> describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation is typically used to query the specifications, network type, and instance status of an AnalyticDB for PostgreSQL instance.</p>
     * <h2>QPS limits</h2>
     * <p>The default QPS limit per user for this operation is 1,000. If the limit is exceeded, API invocations are throttled, which may affect your services. Invoke this operation at a reasonable frequency.
     * &lt;props=&quot;china&quot;&gt;The QPS values in this topic are for reference only. For accurate information, see <a href="https://quotas.console.aliyun.com/flow-control-products/gpdb/quotas">API rate limits</a>.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceAttribute  DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the data bloat status of an AnalyticDB for PostgreSQL instance in elastic storage mode. The minor engine version of the instance must be V6.3.10.1 or later. For more information about how to view and upgrade the minor engine version, see <a href="https://help.aliyun.com/document_detail/277424.html">Minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Version upgrade</a>.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceDataBloat  DescribeDBInstanceDataBloatRequest
     * @return DescribeDBInstanceDataBloatResponse
     */
    CompletableFuture<DescribeDBInstanceDataBloatResponse> describeDBInstanceDataBloat(DescribeDBInstanceDataBloatRequest request);

    /**
     * <b>description</b> :
     * <p>Data skew affects database performance. AnalyticDB for PostgreSQL provides the DescribeDBInstanceDataSkew operation to help you query the data skew of an instance so that you can eliminate data skew promptly.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceDataSkew  DescribeDBInstanceDataSkewRequest
     * @return DescribeDBInstanceDataSkewResponse
     */
    CompletableFuture<DescribeDBInstanceDataSkewResponse> describeDBInstanceDataSkew(DescribeDBInstanceDataSkewRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the distribution and status of coordinator and compute nodes in an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request the request parameters of DescribeDBInstanceDiagnosisSummary  DescribeDBInstanceDiagnosisSummaryRequest
     * @return DescribeDBInstanceDiagnosisSummaryResponse
     */
    CompletableFuture<DescribeDBInstanceDiagnosisSummaryResponse> describeDBInstanceDiagnosisSummary(DescribeDBInstanceDiagnosisSummaryRequest request);

    /**
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
     * <p>Proper use of indexes can improve database query speeds. This operation queries the index usage of an AnalyticDB for PostgreSQL instance.
     * Currently, this feature is supported only for instances in elastic storage mode with a minor engine version of V6.3.10.1 or later. For more information about how to view and upgrade the minor engine version, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Upgrade the Milvus version</a>.</p>
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
     * <h2>Usage</h2>
     * <p>This API retrieves details for AnalyticDB for PostgreSQL instances in a specified region, such as instance type, network type, and instance status.</p>
     * <h2>QPS limit</h2>
     * <p>The default QPS limit for this API is 1,000 requests per second per user. Calls exceeding this limit are throttled, which can impact your business. Plan your API calls accordingly.
     * &lt;props=&quot;china&quot;&gt;
     * The QPS limit specified in this document is for reference only. For the latest rate limits, see the <a href="https://quotas.console.aliyun.com/flow-control-products/gpdb/quotas">API rate quota list</a>.</p>
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
     * @param request the request parameters of DescribeDBVersion  DescribeDBVersionRequest
     * @return DescribeDBVersionResponse
     */
    CompletableFuture<DescribeDBVersionResponse> describeDBVersion(DescribeDBVersionRequest request);

    /**
     * @param request the request parameters of DescribeDBVersionInfos  DescribeDBVersionInfosRequest
     * @return DescribeDBVersionInfosResponse
     */
    CompletableFuture<DescribeDBVersionInfosResponse> describeDBVersionInfos(DescribeDBVersionInfosRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, only instances in elastic storage mode support viewing the backup list and backup details.</p>
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
     * <p>Currently, only serverless instances support the data sharing feature.</p>
     * 
     * @param request the request parameters of DescribeDataShareInstances  DescribeDataShareInstancesRequest
     * @return DescribeDataShareInstancesResponse
     */
    CompletableFuture<DescribeDataShareInstancesResponse> describeDataShareInstances(DescribeDataShareInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, only serverless instances support the data sharing feature.</p>
     * 
     * @param request the request parameters of DescribeDataSharePerformance  DescribeDataSharePerformanceRequest
     * @return DescribeDataSharePerformanceResponse
     */
    CompletableFuture<DescribeDataSharePerformanceResponse> describeDataSharePerformance(DescribeDataSharePerformanceRequest request);

    /**
     * @param request the request parameters of DescribeDatabase  DescribeDatabaseRequest
     * @return DescribeDatabaseResponse
     */
    CompletableFuture<DescribeDatabaseResponse> describeDatabase(DescribeDatabaseRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosisDimensions  DescribeDiagnosisDimensionsRequest
     * @return DescribeDiagnosisDimensionsResponse
     */
    CompletableFuture<DescribeDiagnosisDimensionsResponse> describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosisMonitorPerformance  DescribeDiagnosisMonitorPerformanceRequest
     * @return DescribeDiagnosisMonitorPerformanceResponse
     */
    CompletableFuture<DescribeDiagnosisMonitorPerformanceResponse> describeDiagnosisMonitorPerformance(DescribeDiagnosisMonitorPerformanceRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosisRecords  DescribeDiagnosisRecordsRequest
     * @return DescribeDiagnosisRecordsResponse
     */
    CompletableFuture<DescribeDiagnosisRecordsResponse> describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the details of a specified query in an AnalyticDB for PostgreSQL instance, such as the query statement, execution plan text, and execution plan tree. Currently, this feature is supported only for instances in elastic storage mode with a minor engine version of V6.3.10.1 or later. For more information about how to view and upgrade the minor engine version, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Upgrade the Milvus version</a>.</p>
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
     * <p>To view download records, you must first call the <a href="https://help.aliyun.com/document_detail/447700.html">DownloadDiagnosisRecords</a> operation to download the query diagnostic information.
     * This feature is available only for storage-elastic instances that run kernel minor version V6.3.10.1 or later. For more information about how to view and update the kernel minor version, see <a href="https://help.aliyun.com/document_detail/277424.html">View the kernel minor version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Upgrade the kernel version</a>.</p>
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
     * @param request the request parameters of DescribeExtension  DescribeExtensionRequest
     * @return DescribeExtensionResponse
     */
    CompletableFuture<DescribeExtensionResponse> describeExtension(DescribeExtensionRequest request);

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
     * <p>This operation queries the health status of instances, coordinator nodes (also known as master nodes), and compute nodes (also known as segment nodes) in AnalyticDB for PostgreSQL instances of the elastic storage mode and Serverless edition.</p>
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
     * @param request the request parameters of DescribeModelOperatorApiKey  DescribeModelOperatorApiKeyRequest
     * @return DescribeModelOperatorApiKeyResponse
     */
    CompletableFuture<DescribeModelOperatorApiKeyResponse> describeModelOperatorApiKey(DescribeModelOperatorApiKeyRequest request);

    /**
     * @param request the request parameters of DescribeModelOperatorUsage  DescribeModelOperatorUsageRequest
     * @return DescribeModelOperatorUsageResponse
     */
    CompletableFuture<DescribeModelOperatorUsageResponse> describeModelOperatorUsage(DescribeModelOperatorUsageRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can call this operation to query the details of a model service.</p>
     * <h2>Rate limit</h2>
     * <p>The maximum number of queries per second (QPS) per user for this operation is 1,000. If the number of calls exceeds the limit, throttling is triggered. Throttling may affect your business. Call this operation as needed.</p>
     * 
     * @param request the request parameters of DescribeModelService  DescribeModelServiceRequest
     * @return DescribeModelServiceResponse
     */
    CompletableFuture<DescribeModelServiceResponse> describeModelService(DescribeModelServiceRequest request);

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
     * <p>This operation only supports querying the configuration parameters and related information of AnalyticDB for PostgreSQL instances in elastic storage mode and Serverless Edition.</p>
     * 
     * @param request the request parameters of DescribeParameters  DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    CompletableFuture<DescribeParametersResponse> describeParameters(DescribeParametersRequest request);

    /**
     * @param request the request parameters of DescribePrivateRAGService  DescribePrivateRAGServiceRequest
     * @return DescribePrivateRAGServiceResponse
     */
    CompletableFuture<DescribePrivateRAGServiceResponse> describePrivateRAGService(DescribePrivateRAGServiceRequest request);

    /**
     * <b>description</b> :
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query available vSwitches in the specified region and zone.</p>
     * 
     * @param request the request parameters of DescribeRdsVSwitchs  DescribeRdsVSwitchsRequest
     * @return DescribeRdsVSwitchsResponse
     */
    CompletableFuture<DescribeRdsVSwitchsResponse> describeRdsVSwitchs(DescribeRdsVSwitchsRequest request);

    /**
     * <b>description</b> :
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query available VPCs in the specified region and zone.</p>
     * 
     * @param request the request parameters of DescribeRdsVpcs  DescribeRdsVpcsRequest
     * @return DescribeRdsVpcsResponse
     */
    CompletableFuture<DescribeRdsVpcsResponse> describeRdsVpcs(DescribeRdsVpcsRequest request);

    /**
     * @param request the request parameters of DescribeRebalanceStatus  DescribeRebalanceStatusRequest
     * @return DescribeRebalanceStatusResponse
     */
    CompletableFuture<DescribeRebalanceStatusResponse> describeRebalanceStatus(DescribeRebalanceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Before you create an AnalyticDB for PostgreSQL instance, call this operation to query the available regions and zones.</p>
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
     * <p>This operation does not support instances in reserved storage mode.</p>
     * 
     * @param request the request parameters of DescribeSQLLogCount  DescribeSQLLogCountRequest
     * @return DescribeSQLLogCountResponse
     */
    CompletableFuture<DescribeSQLLogCountResponse> describeSQLLogCount(DescribeSQLLogCountRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is deprecated. To query SQL execution records, refer to <a href="https://help.aliyun.com/document_detail/453722.html">DescribeSQLLogsV2</a>.</p>
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
     * <b>description</b> :
     * <p>To modify the policy, call ModifySupabaseBackupPolicy.</p>
     * 
     * @param request the request parameters of DescribeSupabaseBackupPolicy  DescribeSupabaseBackupPolicyRequest
     * @return DescribeSupabaseBackupPolicyResponse
     */
    CompletableFuture<DescribeSupabaseBackupPolicyResponse> describeSupabaseBackupPolicy(DescribeSupabaseBackupPolicyRequest request);

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
     * <p>This operation only supports querying the lock diagnosis list for instances of V6.0 in elastic storage mode.</p>
     * 
     * @param request the request parameters of DescribeWaitingSQLRecords  DescribeWaitingSQLRecordsRequest
     * @return DescribeWaitingSQLRecordsResponse
     */
    CompletableFuture<DescribeWaitingSQLRecordsResponse> describeWaitingSQLRecords(DescribeWaitingSQLRecordsRequest request);

    /**
     * @param request the request parameters of DescribeZonesPrivateRAGService  DescribeZonesPrivateRAGServiceRequest
     * @return DescribeZonesPrivateRAGServiceResponse
     */
    CompletableFuture<DescribeZonesPrivateRAGServiceResponse> describeZonesPrivateRAGService(DescribeZonesPrivateRAGServiceRequest request);

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
     * <p>This operation downloads the query diagnostic records of an AnalyticDB for PostgreSQL instance. After the download is complete, you can call the <a href="https://help.aliyun.com/document_detail/447712.html">DescribeDownloadRecords</a> operation to view download records and obtain the download URL.
     * This feature is supported only for instances in elastic storage mode with a minor engine version of V6.3.10.1 or later. For more information about how to view and upgrade the minor engine version, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Upgrade the Milvus version</a>.</p>
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
     * @param request the request parameters of DownloadSlowSQLRecords  DownloadSlowSQLRecordsRequest
     * @return DownloadSlowSQLRecordsResponse
     */
    CompletableFuture<DownloadSlowSQLRecordsResponse> downloadSlowSQLRecords(DownloadSlowSQLRecordsRequest request);

    /**
     * @param request the request parameters of EnableCollectionGraphRAG  EnableCollectionGraphRAGRequest
     * @return EnableCollectionGraphRAGResponse
     */
    CompletableFuture<EnableCollectionGraphRAGResponse> enableCollectionGraphRAG(EnableCollectionGraphRAGRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is supported only for instances in elastic storage mode V6.0 with a minor version of v6.6.1.0 or later.</li>
     * <li>You can call this operation to enable resource group management only for instances in the <strong>Running</strong> state.</li>
     * <li><strong>Note: The instance is restarted during the switchover process and will be unavailable for about 5 minutes. Plan your business accordingly to avoid impacts.</strong></li>
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
     * <b>description</b> :
     * <p>Queries API access endpoints.</p>
     * 
     * @param request the request parameters of GetApiEndpoints  GetApiEndpointsRequest
     * @return GetApiEndpointsResponse
     */
    CompletableFuture<GetApiEndpointsResponse> getApiEndpoints(GetApiEndpointsRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of an API key.</p>
     * 
     * @param request the request parameters of GetApiKey  GetApiKeyRequest
     * @return GetApiKeyResponse
     */
    CompletableFuture<GetApiKeyResponse> getApiKey(GetApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the schema SQL content of a specified database in a specified branch. System databases such as postgres, template0, and template1 are not supported.</p>
     * 
     * @param request the request parameters of GetBranchSchema  GetBranchSchemaRequest
     * @return GetBranchSchemaResponse
     */
    CompletableFuture<GetBranchSchemaResponse> getBranchSchema(GetBranchSchemaRequest request);

    /**
     * @param request the request parameters of GetGraphRAGJob  GetGraphRAGJobRequest
     * @return GetGraphRAGJobResponse
     */
    CompletableFuture<GetGraphRAGJobResponse> getGraphRAGJob(GetGraphRAGJobRequest request);

    /**
     * <b>description</b> :
     * <p>Summarizes SaaS DataUnit usage by scenario, project, and UTC hour or day. A single query can span up to 7 days, and the start time must be within the last 30 days. The statistics are based on the rules at the time of the query, not the historical actual billing records.</p>
     * 
     * @param request the request parameters of GetSaasDataUnitUsage  GetSaasDataUnitUsageRequest
     * @return GetSaasDataUnitUsageResponse
     */
    CompletableFuture<GetSaasDataUnitUsageResponse> getSaasDataUnitUsage(GetSaasDataUnitUsageRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a model service.</p>
     * 
     * @param request the request parameters of GetSaasService  GetSaasServiceRequest
     * @return GetSaasServiceResponse
     */
    CompletableFuture<GetSaasServiceResponse> getSaasService(GetSaasServiceRequest request);

    /**
     * @param request the request parameters of GetSecretValue  GetSecretValueRequest
     * @return GetSecretValueResponse
     */
    CompletableFuture<GetSecretValueResponse> getSecretValue(GetSecretValueRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation queries information about all model services.</p>
     * <h2>QPS limit</h2>
     * <p>The default queries per second (QPS) limit per user for this operation is 1,000. If you exceed the limit, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * @param request the request parameters of GetServiceAccessInfo  GetServiceAccessInfoRequest
     * @return GetServiceAccessInfoResponse
     */
    CompletableFuture<GetServiceAccessInfoResponse> getServiceAccessInfo(GetServiceAccessInfoRequest request);

    /**
     * @param request the request parameters of GetStatementResult  GetStatementResultRequest
     * @return GetStatementResultResponse
     */
    CompletableFuture<GetStatementResultResponse> getStatementResult(GetStatementResultRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the details of a Supabase instance.</p>
     * 
     * @param request the request parameters of GetSupabaseProject  GetSupabaseProjectRequest
     * @return GetSupabaseProjectResponse
     */
    CompletableFuture<GetSupabaseProjectResponse> getSupabaseProject(GetSupabaseProjectRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the API keys and JWT secrets of a Supabase instance.</p>
     * 
     * @param request the request parameters of GetSupabaseProjectApiKeys  GetSupabaseProjectApiKeysRequest
     * @return GetSupabaseProjectApiKeysResponse
     */
    CompletableFuture<GetSupabaseProjectApiKeysResponse> getSupabaseProjectApiKeys(GetSupabaseProjectApiKeysRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the dashboard account information of a Supabase project.</p>
     * 
     * @param request the request parameters of GetSupabaseProjectDashboardAccount  GetSupabaseProjectDashboardAccountRequest
     * @return GetSupabaseProjectDashboardAccountResponse
     */
    CompletableFuture<GetSupabaseProjectDashboardAccountResponse> getSupabaseProjectDashboardAccount(GetSupabaseProjectDashboardAccountRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the specifications and zones available for creating Supabase projects in a specified region.</p>
     * 
     * @param request the request parameters of GetSupabaseProjectSpec  GetSupabaseProjectSpecRequest
     * @return GetSupabaseProjectSpecResponse
     */
    CompletableFuture<GetSupabaseProjectSpecResponse> getSupabaseProjectSpec(GetSupabaseProjectSpecRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the currently recommended stable version and the latest upgradable version for a specified Supabase project.</p>
     * 
     * @param request the request parameters of GetSupabaseUpdateVersion  GetSupabaseUpdateVersionRequest
     * @return GetSupabaseUpdateVersionResponse
     */
    CompletableFuture<GetSupabaseUpdateVersionResponse> getSupabaseUpdateVersion(GetSupabaseUpdateVersionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to UploadDocumentAsync. You can call UploadDocumentAsync to create an upload task and obtain a job ID, and then call this operation to view the execution information of the job.</p>
     * <blockquote>
     * <p>Usage recommendations</p>
     * <ul>
     * <li>Evaluate the timeout period based on the document complexity and the number of vectors after chunking. Generally, the timeout period does not exceed 2 hours.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of GetUploadDocumentJob  GetUploadDocumentJobRequest
     * @return GetUploadDocumentJobResponse
     */
    CompletableFuture<GetUploadDocumentJobResponse> getUploadDocumentJob(GetUploadDocumentJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is related to <code>UpsertCollectionDataAsync</code>. You can call <code>UpsertCollectionDataAsync</code> to create an upload task and obtain a job ID, and then call this operation to query the execution information of the job.</p>
     * <blockquote>
     * <p>Recommendation: Estimate the duration of the upload task based on 1 second per 1,000 vector data records, and then query the task progress every 5 seconds. Set the timeout period to 30 minutes plus the initially estimated duration.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetUpsertCollectionDataJob  GetUpsertCollectionDataJobRequest
     * @return GetUpsertCollectionDataJobResponse
     */
    CompletableFuture<GetUpsertCollectionDataJobResponse> getUpsertCollectionDataJob(GetUpsertCollectionDataJobRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation is used to query information about a specified workspace.</p>
     * 
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of an API key.</p>
     * 
     * @param request the request parameters of GrantApiKey  GrantApiKeyRequest
     * @return GrantApiKeyResponse
     */
    CompletableFuture<GrantApiKeyResponse> grantApiKey(GrantApiKeyRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>This operation is used to query the list of AI nodes.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAINodePools  ListAINodePoolsRequest
     * @return ListAINodePoolsResponse
     */
    CompletableFuture<ListAINodePoolsResponse> listAINodePools(ListAINodePoolsRequest request);

    /**
     * @param request the request parameters of ListAIServices  ListAIServicesRequest
     * @return ListAIServicesResponse
     */
    CompletableFuture<ListAIServicesResponse> listAIServices(ListAIServicesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of API keys.</p>
     * 
     * @param request the request parameters of ListApiKeys  ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    CompletableFuture<ListApiKeysResponse> listApiKeys(ListApiKeysRequest request);

    /**
     * @param request the request parameters of ListBackupJobs  ListBackupJobsRequest
     * @return ListBackupJobsResponse
     */
    CompletableFuture<ListBackupJobsResponse> listBackupJobs(ListBackupJobsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation performs a paging query for all branches under a specified Supabase project and supports filtering by parent branch, keyword, and sorting conditions.</p>
     * 
     * @param request the request parameters of ListBranches  ListBranchesRequest
     * @return ListBranchesResponse
     */
    CompletableFuture<ListBranchesResponse> listBranches(ListBranchesRequest request);

    /**
     * @param request the request parameters of ListChunks  ListChunksRequest
     * @return ListChunksResponse
     */
    CompletableFuture<ListChunksResponse> listChunks(ListChunksRequest request);

    /**
     * @param request the request parameters of ListCollections  ListCollectionsRequest
     * @return ListCollectionsResponse
     */
    CompletableFuture<ListCollectionsResponse> listCollections(ListCollectionsRequest request);

    /**
     * @param request the request parameters of ListDatabaseExtensions  ListDatabaseExtensionsRequest
     * @return ListDatabaseExtensionsResponse
     */
    CompletableFuture<ListDatabaseExtensionsResponse> listDatabaseExtensions(ListDatabaseExtensionsRequest request);

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
     * @param request the request parameters of ListInstanceDatabases  ListInstanceDatabasesRequest
     * @return ListInstanceDatabasesResponse
     */
    CompletableFuture<ListInstanceDatabasesResponse> listInstanceDatabases(ListInstanceDatabasesRequest request);

    /**
     * @param request the request parameters of ListInstanceExtensions  ListInstanceExtensionsRequest
     * @return ListInstanceExtensionsResponse
     */
    CompletableFuture<ListInstanceExtensionsResponse> listInstanceExtensions(ListInstanceExtensionsRequest request);

    /**
     * @param request the request parameters of ListModelOperatorApiKeys  ListModelOperatorApiKeysRequest
     * @return ListModelOperatorApiKeysResponse
     */
    CompletableFuture<ListModelOperatorApiKeysResponse> listModelOperatorApiKeys(ListModelOperatorApiKeysRequest request);

    /**
     * @param request the request parameters of ListModelOperatorServices  ListModelOperatorServicesRequest
     * @return ListModelOperatorServicesResponse
     */
    CompletableFuture<ListModelOperatorServicesResponse> listModelOperatorServices(ListModelOperatorServicesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>This interface is used to view all model service information.</p>
     * <h2><a href="#qps-"></a>QPS limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. Exceeding the limit will trigger API rate limiting, which may impact your business. Please call the API responsibly.</p>
     * 
     * @param request the request parameters of ListModelServices  ListModelServicesRequest
     * @return ListModelServicesResponse
     */
    CompletableFuture<ListModelServicesResponse> listModelServices(ListModelServicesRequest request);

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
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation is used to query information about all SaaS services.</p>
     * 
     * @param request the request parameters of ListSaasService  ListSaasServiceRequest
     * @return ListSaasServiceResponse
     */
    CompletableFuture<ListSaasServiceResponse> listSaasService(ListSaasServiceRequest request);

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
     * @param request the request parameters of ListSlowSQLRecords  ListSlowSQLRecordsRequest
     * @return ListSlowSQLRecordsResponse
     */
    CompletableFuture<ListSlowSQLRecordsResponse> listSlowSQLRecords(ListSlowSQLRecordsRequest request);

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
     * @param request the request parameters of ListSupabaseBackupJobs  ListSupabaseBackupJobsRequest
     * @return ListSupabaseBackupJobsResponse
     */
    CompletableFuture<ListSupabaseBackupJobsResponse> listSupabaseBackupJobs(ListSupabaseBackupJobsRequest request);

    /**
     * @param request the request parameters of ListSupabaseDataBackups  ListSupabaseDataBackupsRequest
     * @return ListSupabaseDataBackupsResponse
     */
    CompletableFuture<ListSupabaseDataBackupsResponse> listSupabaseDataBackups(ListSupabaseDataBackupsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation queries the list of Supabase instances.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSupabaseProjectTags  ListSupabaseProjectTagsRequest
     * @return ListSupabaseProjectTagsResponse
     */
    CompletableFuture<ListSupabaseProjectTagsResponse> listSupabaseProjectTags(ListSupabaseProjectTagsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation queries the list of Supabase instances.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSupabaseProjects  ListSupabaseProjectsRequest
     * @return ListSupabaseProjectsResponse
     */
    CompletableFuture<ListSupabaseProjectsResponse> listSupabaseProjects(ListSupabaseProjectsRequest request);

    /**
     * <b>description</b> :
     * <p>  This API is used to query the list of supported models.</p>
     * 
     * @param request the request parameters of ListSupportModels  ListSupportModelsRequest
     * @return ListSupportModelsResponse
     */
    CompletableFuture<ListSupportModelsResponse> listSupportModels(ListSupportModelsRequest request);

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
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation queries the information about all workspaces.</p>
     * 
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of ModifyAIServiceSecurityIps  ModifyAIServiceSecurityIpsRequest
     * @return ModifyAIServiceSecurityIpsResponse
     */
    CompletableFuture<ModifyAIServiceSecurityIpsResponse> modifyAIServiceSecurityIps(ModifyAIServiceSecurityIpsRequest request);

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
     * @param request the request parameters of ModifyCollection  ModifyCollectionRequest
     * @return ModifyCollectionResponse
     */
    CompletableFuture<ModifyCollectionResponse> modifyCollection(ModifyCollectionRequest request);

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
     * @param request the request parameters of ModifyDBInstanceDescription  ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    /**
     * @param request the request parameters of ModifyDBInstanceMaintainTime  ModifyDBInstanceMaintainTimeRequest
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This operation only supports changing the network type of AnalyticDB for PostgreSQL instances that use the reserved storage mode.</p>
     * <h2>QPS limits</h2>
     * <p>The default QPS limit per user for this operation is 1,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.
     * &lt;props=&quot;china&quot;&gt;The QPS values in this document are default reference values only. For accurate information, see <a href="https://quotas.console.aliyun.com/flow-control-products/gpdb/quotas">API rate limit quotas</a>.</p>
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
     * <p>Resource Management allows you to build appropriate resource organizational structures based on your business needs. You can use directories, folders, accounts, and resource groups to hierarchically organize and manage your cloud resources. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a>.</p>
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
     * <p>This operation does not support instances in storage reservation mode.
     * Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/35406.html">billing methods</a> and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/gpdb/detail/GreenplumPost">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">pricing</a> of AnalyticDB for PostgreSQL.</p>
     * 
     * @param request the request parameters of ModifyMasterSpec  ModifyMasterSpecRequest
     * @return ModifyMasterSpecResponse
     */
    CompletableFuture<ModifyMasterSpecResponse> modifyMasterSpec(ModifyMasterSpecRequest request);

    /**
     * <b>description</b> :
     * <p>This operation modifies the configuration parameters only for AnalyticDB for PostgreSQL instances in elastic storage mode or Serverless Edition.</p>
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
     * <ul>
     * <li>Only storage-reserved instances are supported.</li>
     * <li>Only the Serverless auto-scheduling edition is supported.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySQLCollectorPolicy  ModifySQLCollectorPolicyRequest
     * @return ModifySQLCollectorPolicyResponse
     */
    CompletableFuture<ModifySQLCollectorPolicyResponse> modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the deletion protection setting for a SaaS service.</p>
     * 
     * @param request the request parameters of ModifySaasServiceDeletionProtection  ModifySaasServiceDeletionProtectionRequest
     * @return ModifySaasServiceDeletionProtectionResponse
     */
    CompletableFuture<ModifySaasServiceDeletionProtectionResponse> modifySaasServiceDeletionProtection(ModifySaasServiceDeletionProtectionRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>Only AnalyticDB for PostgreSQL Supabase instances are supported.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySupabaseAutoScalePolicy  ModifySupabaseAutoScalePolicyRequest
     * @return ModifySupabaseAutoScalePolicyResponse
     */
    CompletableFuture<ModifySupabaseAutoScalePolicyResponse> modifySupabaseAutoScalePolicy(ModifySupabaseAutoScalePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DescribeSupabaseBackupPolicy operation to query the current backup policy, and then call this operation again to confirm the configuration after modification.</p>
     * 
     * @param request the request parameters of ModifySupabaseBackupPolicy  ModifySupabaseBackupPolicyRequest
     * @return ModifySupabaseBackupPolicyResponse
     */
    CompletableFuture<ModifySupabaseBackupPolicyResponse> modifySupabaseBackupPolicy(ModifySupabaseBackupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/analyticdb/analyticdb-for-postgresql/product-overview/pricing-1#9eefcc7b5acz1">pricing</a> of AnalyticDB for PostgreSQL Supabase.</em>*</p>
     * 
     * @param request the request parameters of ModifySupabaseProjectDescription  ModifySupabaseProjectDescriptionRequest
     * @return ModifySupabaseProjectDescriptionResponse
     */
    CompletableFuture<ModifySupabaseProjectDescriptionResponse> modifySupabaseProjectDescription(ModifySupabaseProjectDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/help/en/analyticdb/analyticdb-for-postgresql/product-overview/pricing-1#9eefcc7b5acz1">pricing</a> of AnalyticDB for PostgreSQL Supabase.</em>*</p>
     * 
     * @param request the request parameters of ModifySupabaseProjectResource  ModifySupabaseProjectResourceRequest
     * @return ModifySupabaseProjectResourceResponse
     */
    CompletableFuture<ModifySupabaseProjectResourceResponse> modifySupabaseProjectResource(ModifySupabaseProjectResourceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you use a Supabase instance, you must add the client\&quot;s IP address or IP address segment to the instance\&quot;s whitelist.</p>
     * 
     * @param request the request parameters of ModifySupabaseProjectSecurityIps  ModifySupabaseProjectSecurityIpsRequest
     * @return ModifySupabaseProjectSecurityIpsResponse
     */
    CompletableFuture<ModifySupabaseProjectSecurityIpsResponse> modifySupabaseProjectSecurityIps(ModifySupabaseProjectSecurityIpsRequest request);

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
     * <b>description</b> :
     * <p>Deletes the model service.</p>
     * 
     * @param request the request parameters of PauseSaasService  PauseSaasServiceRequest
     * @return PauseSaasServiceResponse
     */
    CompletableFuture<PauseSaasServiceResponse> pauseSaasService(PauseSaasServiceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation pauses a Supabase instance.</p>
     * 
     * @param request the request parameters of PauseSupabaseProject  PauseSupabaseProjectRequest
     * @return PauseSupabaseProjectResponse
     */
    CompletableFuture<PauseSupabaseProjectResponse> pauseSupabaseProject(PauseSupabaseProjectRequest request);

    /**
     * @param request the request parameters of QueryCollectionData  QueryCollectionDataRequest
     * @return QueryCollectionDataResponse
     */
    CompletableFuture<QueryCollectionDataResponse> queryCollectionData(QueryCollectionDataRequest request);

    /**
     * @param request the request parameters of QueryKnowledgeBasesContent  QueryKnowledgeBasesContentRequest
     * @return QueryKnowledgeBasesContentResponse
     */
    CompletableFuture<QueryKnowledgeBasesContentResponse> queryKnowledgeBasesContent(QueryKnowledgeBasesContentRequest request);

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
     * <b>description</b> :
     * <p>This operation resets a child branch to the latest data of its parent branch. You cannot reset the main branch, branches without a parent branch, branches that have child branches, or protected branches.</p>
     * 
     * @param request the request parameters of ResetBranch  ResetBranchRequest
     * @return ResetBranchResponse
     */
    CompletableFuture<ResetBranchResponse> resetBranch(ResetBranchRequest request);

    /**
     * @param request the request parameters of ResetIMVMonitorData  ResetIMVMonitorDataRequest
     * @return ResetIMVMonitorDataResponse
     */
    CompletableFuture<ResetIMVMonitorDataResponse> resetIMVMonitorData(ResetIMVMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <p>Resets the password of a Supabase database.</p>
     * 
     * @param request the request parameters of ResetSupabaseProjectPassword  ResetSupabaseProjectPasswordRequest
     * @return ResetSupabaseProjectPasswordResponse
     */
    CompletableFuture<ResetSupabaseProjectPasswordResponse> resetSupabaseProjectPassword(ResetSupabaseProjectPasswordRequest request);

    /**
     * <b>description</b> :
     * <p>The restart process typically takes 3 to 30 minutes. During the restart, the instance cannot provide external services. Perform this operation during off-peak hours. After the restart is complete, the instance status changes to Running, and you can access the instance normally.</p>
     * 
     * @param request the request parameters of RestartDBInstance  RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     */
    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Restarts a specified Supabase project. A request ID is returned upon a successful call, and the restart process runs asynchronously in the backend.</p>
     * 
     * @param request the request parameters of RestartSupabaseProject  RestartSupabaseProjectRequest
     * @return RestartSupabaseProjectResponse
     */
    CompletableFuture<RestartSupabaseProjectResponse> restartSupabaseProject(RestartSupabaseProjectRequest request);

    /**
     * <b>description</b> :
     * <p>This operation restores the target branch to a specified point in time or LSN of the source branch. You can specify a backup branch name to preserve the original target branch before the restoration.</p>
     * 
     * @param request the request parameters of RestoreBranch  RestoreBranchRequest
     * @return RestoreBranchResponse
     */
    CompletableFuture<RestoreBranchResponse> restoreBranch(RestoreBranchRequest request);

    /**
     * <b>description</b> :
     * <p>This operation restores a project to a target branch based on a snapshot LSN. You can specify the name of the restored branch and the target branch. The FinalizeRestore parameter specifies whether to complete the restoration immediately.</p>
     * 
     * @param request the request parameters of RestoreSnapshot  RestoreSnapshotRequest
     * @return RestoreSnapshotResponse
     */
    CompletableFuture<RestoreSnapshotResponse> restoreSnapshot(RestoreSnapshotRequest request);

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
     * <p>Deletes a model service.</p>
     * 
     * @param request the request parameters of ResumeSaasService  ResumeSaasServiceRequest
     * @return ResumeSaasServiceResponse
     */
    CompletableFuture<ResumeSaasServiceResponse> resumeSaasService(ResumeSaasServiceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation queries the details of a Supabase instance.</p>
     * 
     * @param request the request parameters of ResumeSupabaseProject  ResumeSupabaseProjectRequest
     * @return ResumeSupabaseProjectResponse
     */
    CompletableFuture<ResumeSupabaseProjectResponse> resumeSupabaseProject(ResumeSupabaseProjectRequest request);

    /**
     * <b>description</b> :
     * <p>Revokes the access permissions of an API key pair to SaaS services.</p>
     * 
     * @param request the request parameters of RevokeApiKey  RevokeApiKeyRequest
     * @return RevokeApiKeyResponse
     */
    CompletableFuture<RevokeApiKeyResponse> revokeApiKey(RevokeApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>Sets the specified branch as the default branch for a Supabase project.</p>
     * 
     * @param request the request parameters of SetAsDefaultBranch  SetAsDefaultBranchRequest
     * @return SetAsDefaultBranchResponse
     */
    CompletableFuture<SetAsDefaultBranchResponse> setAsDefaultBranch(SetAsDefaultBranchRequest request);

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
     * <p>Only Serverless instances support the data sharing feature.</p>
     * 
     * @param request the request parameters of SetDataShareInstance  SetDataShareInstanceRequest
     * @return SetDataShareInstanceResponse
     */
    CompletableFuture<SetDataShareInstanceResponse> setDataShareInstance(SetDataShareInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is not supported for instances in elastic storage mode or serverless instances.</p>
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
     * <b>description</b> :
     * <p>Queries the details of a Supabase instance.</p>
     * 
     * @param request the request parameters of TagSupabaseProject  TagSupabaseProjectRequest
     * @return TagSupabaseProjectResponse
     */
    CompletableFuture<TagSupabaseProjectResponse> tagSupabaseProject(TagSupabaseProjectRequest request);

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
     * <b>description</b> :
     * <p>This operation queries the details of a Supabase instance.</p>
     * 
     * @param request the request parameters of UntagSupabaseProject  UntagSupabaseProjectRequest
     * @return UntagSupabaseProjectResponse
     */
    CompletableFuture<UntagSupabaseProjectResponse> untagSupabaseProject(UntagSupabaseProjectRequest request);

    /**
     * <b>description</b> :
     * <p>This operation modifies the branch name, description, tags, protection status, and automatic deletion time upon expiration.</p>
     * 
     * @param request the request parameters of UpdateBranch  UpdateBranchRequest
     * @return UpdateBranchResponse
     */
    CompletableFuture<UpdateBranchResponse> updateBranch(UpdateBranchRequest request);

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
     * <p>Updates the SaaS service version.</p>
     * 
     * @param request the request parameters of UpdateSaasServiceVersion  UpdateSaasServiceVersionRequest
     * @return UpdateSaasServiceVersionResponse
     */
    CompletableFuture<UpdateSaasServiceVersionResponse> updateSaasServiceVersion(UpdateSaasServiceVersionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation upgrades a specified Supabase project to a target minor version. You can query the supported target versions by calling GetSupabaseUpdateVersion.</p>
     * 
     * @param request the request parameters of UpdateSupabaseVersion  UpdateSupabaseVersionRequest
     * @return UpdateSupabaseVersionResponse
     */
    CompletableFuture<UpdateSupabaseVersionResponse> updateSupabaseVersion(UpdateSupabaseVersionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation does not support instances in storage reservation mode.
     * Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/35406.html">billing methods</a> and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/gpdb/detail/GreenplumPost">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">pricing</a> of AnalyticDB for PostgreSQL.</p>
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
     * <p>The vectorization algorithm used for the documents is the one specified in the CreateDocumentCollection operation when the knowledge base is created.</p>
     * 
     * @param request the request parameters of UpsertChunks  UpsertChunksRequest
     * @return UpsertChunksResponse
     */
    CompletableFuture<UpsertChunksResponse> upsertChunks(UpsertChunksRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * <strong>The SDK was upgraded on November 8, 2023, increasing the maximum data request size from 512 KB to 10 MB.</strong>
     * Use the latest SDK or a version no earlier than the following:</p>
     * </blockquote>
     * <ul>
     * <li>Java: 1.2.1 </li>
     * <li>Go: v3.3.1 </li>
     * <li>Python: 3.3.1</li>
     * </ul>
     * 
     * @param request the request parameters of UpsertCollectionData  UpsertCollectionDataRequest
     * @return UpsertCollectionDataResponse
     */
    CompletableFuture<UpsertCollectionDataResponse> upsertCollectionData(UpsertCollectionDataRequest request);

}
