// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.rdsai20250507.models.*;
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
     * <p>Adds a job exclusion item.</p>
     * 
     * @param request the request parameters of AddContextDatabaseSyncJobExclusion  AddContextDatabaseSyncJobExclusionRequest
     * @return AddContextDatabaseSyncJobExclusionResponse
     */
    CompletableFuture<AddContextDatabaseSyncJobExclusionResponse> addContextDatabaseSyncJobExclusion(AddContextDatabaseSyncJobExclusionRequest request);

    /**
     * <b>description</b> :
     * <p>You can specify a ClientToken to ensure idempotence for write operations. If you do not specify this parameter, the backend automatically generates one.</p>
     * 
     * @param request the request parameters of CancelContextDatabaseSyncDiscovery  CancelContextDatabaseSyncDiscoveryRequest
     * @return CancelContextDatabaseSyncDiscoveryResponse
     */
    CompletableFuture<CancelContextDatabaseSyncDiscoveryResponse> cancelContextDatabaseSyncDiscovery(CancelContextDatabaseSyncDiscoveryRequest request);

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence through ClientToken. If ClientToken is not provided, the backend generates one automatically. Cancellation is best-effort. Completed RunItems are not affected.</p>
     * 
     * @param request the request parameters of CancelContextDatabaseSyncRun  CancelContextDatabaseSyncRunRequest
     * @return CancelContextDatabaseSyncRunResponse
     */
    CompletableFuture<CancelContextDatabaseSyncRunResponse> cancelContextDatabaseSyncRun(CancelContextDatabaseSyncRunRequest request);

    /**
     * @param request the request parameters of ChatMessages  ChatMessagesRequest
     * @return ChatMessagesResponse
     */
    CompletableFuture<ChatMessagesResponse> chatMessages(ChatMessagesRequest request);

    ResponseIterable<ChatMessagesResponseBody> chatMessagesWithResponseIterable(ChatMessagesRequest request);

    /**
     * @param request the request parameters of ChatMessagesTaskStop  ChatMessagesTaskStopRequest
     * @return ChatMessagesTaskStopResponse
     */
    CompletableFuture<ChatMessagesTaskStopResponse> chatMessagesTaskStop(ChatMessagesTaskStopRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of CreateApiKey  CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    CompletableFuture<CreateApiKeyResponse> createApiKey(CreateApiKeyRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation incurs fees. Read the related documentation carefully before you perform this operation.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAppInstance  CreateAppInstanceRequest
     * @return CreateAppInstanceResponse
     */
    CompletableFuture<CreateAppInstanceResponse> createAppInstance(CreateAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an API key and returns the plaintext apiKey.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseApiKey  CreateContextDatabaseApiKeyRequest
     * @return CreateContextDatabaseApiKeyResponse
     */
    CompletableFuture<CreateContextDatabaseApiKeyResponse> createContextDatabaseApiKey(CreateContextDatabaseApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a member. If GenerateInitialKey is set to true, the first API key is also issued, and the plaintext ApiKey is returned in the response. This is a sensitive field and is returned only once. Store it securely. After the member is created, you can call the List or Get operation to query the member and the metadata of the API keys under the member.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseMember  CreateContextDatabaseMemberRequest
     * @return CreateContextDatabaseMemberResponse
     */
    CompletableFuture<CreateContextDatabaseMemberResponse> createContextDatabaseMember(CreateContextDatabaseMemberRequest request);

    /**
     * <b>description</b> :
     * <p>For write operations, you can specify a ClientToken to ensure idempotency. If no ClientToken is provided, the backend automatically generates one. Upon successful creation, the complete information of the created object is returned, including the ID that can be used for subsequent queries or updates.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseSyncConnection  CreateContextDatabaseSyncConnectionRequest
     * @return CreateContextDatabaseSyncConnectionResponse
     */
    CompletableFuture<CreateContextDatabaseSyncConnectionResponse> createContextDatabaseSyncConnection(CreateContextDatabaseSyncConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence via ClientToken. If ClientToken is not provided, the backend generates one automatically. Target is an implicit concept — you only need to provide KnowledgeBaseId, and the backend automatically creates or matches the Target.
     * On success, the response returns the complete information of the created object. The Id field is active and can be used for subsequent queries or updates.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseSyncJob  CreateContextDatabaseSyncJobRequest
     * @return CreateContextDatabaseSyncJobResponse
     */
    CompletableFuture<CreateContextDatabaseSyncJobResponse> createContextDatabaseSyncJob(CreateContextDatabaseSyncJobRequest request);

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no token is provided, the backend generates one automatically. After creating a data selection scope, you typically need to call StartContextDatabaseSyncSourceDiscovery to discover available nodes.
     * On success, the response returns the complete information of the created object. The Id field can be used for subsequent queries or updates.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseSyncSource  CreateContextDatabaseSyncSourceRequest
     * @return CreateContextDatabaseSyncSourceResponse
     */
    CompletableFuture<CreateContextDatabaseSyncSourceResponse> createContextDatabaseSyncSource(CreateContextDatabaseSyncSourceRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a workspace along with the first member and the first API key in a one-time onboarding process. The plaintext API key is returned in the response.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseWorkspace  CreateContextDatabaseWorkspaceRequest
     * @return CreateContextDatabaseWorkspaceResponse
     */
    CompletableFuture<CreateContextDatabaseWorkspaceResponse> createContextDatabaseWorkspace(CreateContextDatabaseWorkspaceRequest request);

    /**
     * @param request the request parameters of CreateCustomAgent  CreateCustomAgentRequest
     * @return CreateCustomAgentResponse
     */
    CompletableFuture<CreateCustomAgentResponse> createCustomAgent(CreateCustomAgentRequest request);

    /**
     * @param request the request parameters of CreateInspectionTask  CreateInspectionTaskRequest
     * @return CreateInspectionTaskResponse
     */
    CompletableFuture<CreateInspectionTaskResponse> createInspectionTask(CreateInspectionTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of CreateMOUsageDetailExport  CreateMOUsageDetailExportRequest
     * @return CreateMOUsageDetailExportResponse
     */
    CompletableFuture<CreateMOUsageDetailExportResponse> createMOUsageDetailExport(CreateMOUsageDetailExportRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of CreateSandboxTemplate  CreateSandboxTemplateRequest
     * @return CreateSandboxTemplateResponse
     */
    CompletableFuture<CreateSandboxTemplateResponse> createSandboxTemplate(CreateSandboxTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation incurs fees. Read the related feature documentation carefully before you perform this operation.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateScheduledTask  CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request);

    /**
     * @param request the request parameters of CreateSkill  CreateSkillRequest
     * @return CreateSkillResponse
     */
    CompletableFuture<CreateSkillResponse> createSkill(CreateSkillRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DeleteApiKey  DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    CompletableFuture<DeleteApiKeyResponse> deleteApiKey(DeleteApiKeyRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable DPI engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation incurs fees. Read the related feature documentation carefully before you perform this operation.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>
     * Notice: Deleting an RDS Supabase project does not automatically delete the ApsaraDB RDS for PostgreSQL instance or the Internet NAT gateway that were created along with the project. You must <a href="https://help.aliyun.com/document_detail/96749.html">manual release the instance</a> and delete the <a href="https://help.aliyun.com/document_detail/121139.html">Internet NAT gateway</a> and <a href="https://help.aliyun.com/document_detail/121527.html">EIP</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAppInstance  DeleteAppInstanceRequest
     * @return DeleteAppInstanceResponse
     */
    CompletableFuture<DeleteAppInstanceResponse> deleteAppInstance(DeleteAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a member. This is a hard delete and cannot be undone.</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseMember  DeleteContextDatabaseMemberRequest
     * @return DeleteContextDatabaseMemberResponse
     */
    CompletableFuture<DeleteContextDatabaseMemberResponse> deleteContextDatabaseMember(DeleteContextDatabaseMemberRequest request);

    /**
     * <b>description</b> :
     * <p>For write operations, you can specify a ClientToken to ensure idempotency. If you do not specify a ClientToken, the backend automatically generates one.</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseSyncConnection  DeleteContextDatabaseSyncConnectionRequest
     * @return DeleteContextDatabaseSyncConnectionResponse
     */
    CompletableFuture<DeleteContextDatabaseSyncConnectionResponse> deleteContextDatabaseSyncConnection(DeleteContextDatabaseSyncConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>You can provide a ClientToken to ensure idempotency for write operations. If not provided, the backend automatically generates one.</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseSyncJob  DeleteContextDatabaseSyncJobRequest
     * @return DeleteContextDatabaseSyncJobResponse
     */
    CompletableFuture<DeleteContextDatabaseSyncJobResponse> deleteContextDatabaseSyncJob(DeleteContextDatabaseSyncJobRequest request);

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence through ClientToken. If ClientToken is not provided, the backend generates one automatically.</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseSyncSource  DeleteContextDatabaseSyncSourceRequest
     * @return DeleteContextDatabaseSyncSourceResponse
     */
    CompletableFuture<DeleteContextDatabaseSyncSourceResponse> deleteContextDatabaseSyncSource(DeleteContextDatabaseSyncSourceRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a workspace. This is a hard delete and cannot be recovered. After the workspace is deleted, the local metadata is soft-deleted synchronously. Deleted workspaces no longer count toward the quota.</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseWorkspace  DeleteContextDatabaseWorkspaceRequest
     * @return DeleteContextDatabaseWorkspaceResponse
     */
    CompletableFuture<DeleteContextDatabaseWorkspaceResponse> deleteContextDatabaseWorkspace(DeleteContextDatabaseWorkspaceRequest request);

    /**
     * @param request the request parameters of DeleteCustomAgent  DeleteCustomAgentRequest
     * @return DeleteCustomAgentResponse
     */
    CompletableFuture<DeleteCustomAgentResponse> deleteCustomAgent(DeleteCustomAgentRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DeleteSandboxTemplate  DeleteSandboxTemplateRequest
     * @return DeleteSandboxTemplateResponse
     */
    CompletableFuture<DeleteSandboxTemplateResponse> deleteSandboxTemplate(DeleteSandboxTemplateRequest request);

    /**
     * @param request the request parameters of DeleteScheduledTask  DeleteScheduledTaskRequest
     * @return DeleteScheduledTaskResponse
     */
    CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTask(DeleteScheduledTaskRequest request);

    /**
     * @param request the request parameters of DeleteSkill  DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    CompletableFuture<DeleteSkillResponse> deleteSkill(DeleteSkillRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeAppInstanceAttribute  DescribeAppInstanceAttributeRequest
     * @return DescribeAppInstanceAttributeResponse
     */
    CompletableFuture<DescribeAppInstanceAttributeResponse> describeAppInstanceAttribute(DescribeAppInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeAppInstances  DescribeAppInstancesRequest
     * @return DescribeAppInstancesResponse
     */
    CompletableFuture<DescribeAppInstancesResponse> describeAppInstances(DescribeAppInstancesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeCommonSandboxTemplates  DescribeCommonSandboxTemplatesRequest
     * @return DescribeCommonSandboxTemplatesResponse
     */
    CompletableFuture<DescribeCommonSandboxTemplatesResponse> describeCommonSandboxTemplates(DescribeCommonSandboxTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeEventsList  DescribeEventsListRequest
     * @return DescribeEventsListResponse
     */
    CompletableFuture<DescribeEventsListResponse> describeEventsList(DescribeEventsListRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceAuthInfo  DescribeInstanceAuthInfoRequest
     * @return DescribeInstanceAuthInfoResponse
     */
    CompletableFuture<DescribeInstanceAuthInfoResponse> describeInstanceAuthInfo(DescribeInstanceAuthInfoRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceEndpoints  DescribeInstanceEndpointsRequest
     * @return DescribeInstanceEndpointsResponse
     */
    CompletableFuture<DescribeInstanceEndpointsResponse> describeInstanceEndpoints(DescribeInstanceEndpointsRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceIpWhitelist  DescribeInstanceIpWhitelistRequest
     * @return DescribeInstanceIpWhitelistResponse
     */
    CompletableFuture<DescribeInstanceIpWhitelistResponse> describeInstanceIpWhitelist(DescribeInstanceIpWhitelistRequest request);

    /**
     * @param request the request parameters of DescribeInstanceRAGConfig  DescribeInstanceRAGConfigRequest
     * @return DescribeInstanceRAGConfigResponse
     */
    CompletableFuture<DescribeInstanceRAGConfigResponse> describeInstanceRAGConfig(DescribeInstanceRAGConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceSSL  DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     */
    CompletableFuture<DescribeInstanceSSLResponse> describeInstanceSSL(DescribeInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>Currently, only Object Storage Service (OSS) is supported.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstanceStorageConfig  DescribeInstanceStorageConfigRequest
     * @return DescribeInstanceStorageConfigResponse
     */
    CompletableFuture<DescribeInstanceStorageConfigResponse> describeInstanceStorageConfig(DescribeInstanceStorageConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeMOTokenUsageDetail  DescribeMOTokenUsageDetailRequest
     * @return DescribeMOTokenUsageDetailResponse
     */
    CompletableFuture<DescribeMOTokenUsageDetailResponse> describeMOTokenUsageDetail(DescribeMOTokenUsageDetailRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeMOTokenUsageSummary  DescribeMOTokenUsageSummaryRequest
     * @return DescribeMOTokenUsageSummaryResponse
     */
    CompletableFuture<DescribeMOTokenUsageSummaryResponse> describeMOTokenUsageSummary(DescribeMOTokenUsageSummaryRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeMOUsageDetailExport  DescribeMOUsageDetailExportRequest
     * @return DescribeMOUsageDetailExportResponse
     */
    CompletableFuture<DescribeMOUsageDetailExportResponse> describeMOUsageDetailExport(DescribeMOUsageDetailExportRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeModelOperator  DescribeModelOperatorRequest
     * @return DescribeModelOperatorResponse
     */
    CompletableFuture<DescribeModelOperatorResponse> describeModelOperator(DescribeModelOperatorRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeMonitorData  DescribeMonitorDataRequest
     * @return DescribeMonitorDataResponse
     */
    CompletableFuture<DescribeMonitorDataResponse> describeMonitorData(DescribeMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeSandboxTemplates  DescribeSandboxTemplatesRequest
     * @return DescribeSandboxTemplatesResponse
     */
    CompletableFuture<DescribeSandboxTemplatesResponse> describeSandboxTemplates(DescribeSandboxTemplatesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeWhitelistIps  DescribeWhitelistIpsRequest
     * @return DescribeWhitelistIpsResponse
     */
    CompletableFuture<DescribeWhitelistIpsResponse> describeWhitelistIps(DescribeWhitelistIpsRequest request);

    /**
     * <b>description</b> :
     * <p>Disables the sandbox and Edge Routine capabilities of a Supabase instance.</p>
     * <blockquote>
     * <p>Notice: This operation deletes all sandboxes and Edge Routines of the Supabase instance. Fully assess the business risks before performing this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DisableAgentRuntime  DisableAgentRuntimeRequest
     * @return DisableAgentRuntimeResponse
     */
    CompletableFuture<DisableAgentRuntimeResponse> disableAgentRuntime(DisableAgentRuntimeRequest request);

    /**
     * <b>description</b> :
     * <p>During the public preview, the sandbox and Edge Routine features are free of charge.</p>
     * <h3>Before you begin</h3>
     * <p>Before you use this feature, <a href="https://api.aliyun.com/api/ResourceManager/2020-03-31/CreateServiceLinkedRole?spm=api-workbench.API%20Document.0.0.4ea75094rJgPzK&RegionId=cn-beijing&tab=DEBUG&params=%7B%2522ServiceName%2522:%2522supabase.rdsai.aliyuncs.com%2522%7D&sdkStyle=old">authorize the service-linked role</a>. The service-linked role used is <a href="https://www.alibabacloud.com/help/en/ram/product-overview/services-that-work-with-service-linked-roles">AliyunServiceRoleForRDSAISupabase</a>.</p>
     * 
     * @param request the request parameters of EnableAgentRuntime  EnableAgentRuntimeRequest
     * @return EnableAgentRuntimeResponse
     */
    CompletableFuture<EnableAgentRuntimeResponse> enableAgentRuntime(EnableAgentRuntimeRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase.</p>
     * 
     * @param request the request parameters of GetAvailableLLMModels  GetAvailableLLMModelsRequest
     * @return GetAvailableLLMModelsResponse
     */
    CompletableFuture<GetAvailableLLMModelsResponse> getAvailableLLMModels(GetAvailableLLMModelsRequest request);

    /**
     * @param request the request parameters of GetChatModel  GetChatModelRequest
     * @return GetChatModelResponse
     */
    CompletableFuture<GetChatModelResponse> getChatModel(GetChatModelRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a connection.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncConnection  GetContextDatabaseSyncConnectionRequest
     * @return GetContextDatabaseSyncConnectionResponse
     */
    CompletableFuture<GetContextDatabaseSyncConnectionResponse> getContextDatabaseSyncConnection(GetContextDatabaseSyncConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the authorization scope of a connection.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncConnectionAuthorization  GetContextDatabaseSyncConnectionAuthorizationRequest
     * @return GetContextDatabaseSyncConnectionAuthorizationResponse
     */
    CompletableFuture<GetContextDatabaseSyncConnectionAuthorizationResponse> getContextDatabaseSyncConnectionAuthorization(GetContextDatabaseSyncConnectionAuthorizationRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status of a discovery task by task ID.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncDiscoveryTask  GetContextDatabaseSyncDiscoveryTaskRequest
     * @return GetContextDatabaseSyncDiscoveryTaskResponse
     */
    CompletableFuture<GetContextDatabaseSyncDiscoveryTaskResponse> getContextDatabaseSyncDiscoveryTask(GetContextDatabaseSyncDiscoveryTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a job.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncJob  GetContextDatabaseSyncJobRequest
     * @return GetContextDatabaseSyncJobResponse
     */
    CompletableFuture<GetContextDatabaseSyncJobResponse> getContextDatabaseSyncJob(GetContextDatabaseSyncJobRequest request);

    /**
     * <b>description</b> :
     * <p>Queries whether a job can be started.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncJobReadiness  GetContextDatabaseSyncJobReadinessRequest
     * @return GetContextDatabaseSyncJobReadinessResponse
     */
    CompletableFuture<GetContextDatabaseSyncJobReadinessResponse> getContextDatabaseSyncJobReadiness(GetContextDatabaseSyncJobReadinessRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the scheduling configuration of a job.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncJobSchedule  GetContextDatabaseSyncJobScheduleRequest
     * @return GetContextDatabaseSyncJobScheduleResponse
     */
    CompletableFuture<GetContextDatabaseSyncJobScheduleResponse> getContextDatabaseSyncJobSchedule(GetContextDatabaseSyncJobScheduleRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a run.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncRun  GetContextDatabaseSyncRunRequest
     * @return GetContextDatabaseSyncRunResponse
     */
    CompletableFuture<GetContextDatabaseSyncRunResponse> getContextDatabaseSyncRun(GetContextDatabaseSyncRunRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a source.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncSource  GetContextDatabaseSyncSourceRequest
     * @return GetContextDatabaseSyncSourceResponse
     */
    CompletableFuture<GetContextDatabaseSyncSourceResponse> getContextDatabaseSyncSource(GetContextDatabaseSyncSourceRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the current node selection of the source.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncSourceSelection  GetContextDatabaseSyncSourceSelectionRequest
     * @return GetContextDatabaseSyncSourceSelectionResponse
     */
    CompletableFuture<GetContextDatabaseSyncSourceSelectionResponse> getContextDatabaseSyncSourceSelection(GetContextDatabaseSyncSourceSelectionRequest request);

    /**
     * @param request the request parameters of GetConversations  GetConversationsRequest
     * @return GetConversationsResponse
     */
    CompletableFuture<GetConversationsResponse> getConversations(GetConversationsRequest request);

    /**
     * @param request the request parameters of GetCustomAgent  GetCustomAgentRequest
     * @return GetCustomAgentResponse
     */
    CompletableFuture<GetCustomAgentResponse> getCustomAgent(GetCustomAgentRequest request);

    /**
     * @param request the request parameters of GetInspectionReport  GetInspectionReportRequest
     * @return GetInspectionReportResponse
     */
    CompletableFuture<GetInspectionReportResponse> getInspectionReport(GetInspectionReportRequest request);

    /**
     * @param request the request parameters of GetMessages  GetMessagesRequest
     * @return GetMessagesResponse
     */
    CompletableFuture<GetMessagesResponse> getMessages(GetMessagesRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of GetModelOperatorOrder  GetModelOperatorOrderRequest
     * @return GetModelOperatorOrderResponse
     */
    CompletableFuture<GetModelOperatorOrderResponse> getModelOperatorOrder(GetModelOperatorOrderRequest request);

    /**
     * @param request the request parameters of GetScheduledInstances  GetScheduledInstancesRequest
     * @return GetScheduledInstancesResponse
     */
    CompletableFuture<GetScheduledInstancesResponse> getScheduledInstances(GetScheduledInstancesRequest request);

    /**
     * @param request the request parameters of GetScheduledReports  GetScheduledReportsRequest
     * @return GetScheduledReportsResponse
     */
    CompletableFuture<GetScheduledReportsResponse> getScheduledReports(GetScheduledReportsRequest request);

    /**
     * @param request the request parameters of GetSkill  GetSkillRequest
     * @return GetSkillResponse
     */
    CompletableFuture<GetSkillResponse> getSkill(GetSkillRequest request);

    /**
     * @param request the request parameters of GetStandAloneReports  GetStandAloneReportsRequest
     * @return GetStandAloneReportsResponse
     */
    CompletableFuture<GetStandAloneReportsResponse> getStandAloneReports(GetStandAloneReportsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of ListApiKeys  ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    CompletableFuture<ListApiKeysResponse> listApiKeys(ListApiKeysRequest request);

    /**
     * <b>description</b> :
     * <p>Lists the API keys under a specified member. The plaintext key values are not returned.</p>
     * 
     * @param request the request parameters of ListContextDatabaseApiKeys  ListContextDatabaseApiKeysRequest
     * @return ListContextDatabaseApiKeysResponse
     */
    CompletableFuture<ListContextDatabaseApiKeysResponse> listContextDatabaseApiKeys(ListContextDatabaseApiKeysRequest request);

    /**
     * <b>description</b> :
     * <p>Lists all members in a specified workspace. Each member includes a list of API keys (plaintext values are not returned).</p>
     * 
     * @param request the request parameters of ListContextDatabaseMembers  ListContextDatabaseMembersRequest
     * @return ListContextDatabaseMembersResponse
     */
    CompletableFuture<ListContextDatabaseMembersResponse> listContextDatabaseMembers(ListContextDatabaseMembersRequest request);

    /**
     * <b>description</b> :
     * <p>The list operation returns paginated results by default. Page and PageSize are optional parameters.
     * The Data list field in the response is returned as an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncConnections  ListContextDatabaseSyncConnectionsRequest
     * @return ListContextDatabaseSyncConnectionsResponse
     */
    CompletableFuture<ListContextDatabaseSyncConnectionsResponse> listContextDatabaseSyncConnections(ListContextDatabaseSyncConnectionsRequest request);

    /**
     * <b>description</b> :
     * <p>By default, this operation returns paginated results. The Page and PageSize parameters are optional. The Data field in the response is returned as an array, and the Total field indicates the total number of matching entries.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncJobDocuments  ListContextDatabaseSyncJobDocumentsRequest
     * @return ListContextDatabaseSyncJobDocumentsResponse
     */
    CompletableFuture<ListContextDatabaseSyncJobDocumentsResponse> listContextDatabaseSyncJobDocuments(ListContextDatabaseSyncJobDocumentsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation uses pagination by default. Page and PageSize are optional parameters.
     * The Data field in the response returns an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncJobExclusions  ListContextDatabaseSyncJobExclusionsRequest
     * @return ListContextDatabaseSyncJobExclusionsResponse
     */
    CompletableFuture<ListContextDatabaseSyncJobExclusionsResponse> listContextDatabaseSyncJobExclusions(ListContextDatabaseSyncJobExclusionsRequest request);

    /**
     * <b>description</b> :
     * <p>The list operation returns paginated results by default. Page and PageSize are optional parameters.
     * The Data list field in the response is returned as an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncJobs  ListContextDatabaseSyncJobsRequest
     * @return ListContextDatabaseSyncJobsResponse
     */
    CompletableFuture<ListContextDatabaseSyncJobsResponse> listContextDatabaseSyncJobs(ListContextDatabaseSyncJobsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation returns a fixed-length array of available plugins in the workspace and does not support pagination.
     * The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncPlugins  ListContextDatabaseSyncPluginsRequest
     * @return ListContextDatabaseSyncPluginsResponse
     */
    CompletableFuture<ListContextDatabaseSyncPluginsResponse> listContextDatabaseSyncPlugins(ListContextDatabaseSyncPluginsRequest request);

    /**
     * <b>description</b> :
     * <p>The list API returns paginated results by default. The Page and PageSize parameters are optional. Run records are a list of RunItems that show the processing results of each document in each import run.
     * The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncRunItems  ListContextDatabaseSyncRunItemsRequest
     * @return ListContextDatabaseSyncRunItemsResponse
     */
    CompletableFuture<ListContextDatabaseSyncRunItemsResponse> listContextDatabaseSyncRunItems(ListContextDatabaseSyncRunItemsRequest request);

    /**
     * <b>description</b> :
     * <p>列表接口默认分页返回，Page 与 PageSize 为可选参数。
     * 响应中的 Data 列表字段使用数组返回，Total 表示符合条件的总条数。</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncRunLogs  ListContextDatabaseSyncRunLogsRequest
     * @return ListContextDatabaseSyncRunLogsResponse
     */
    CompletableFuture<ListContextDatabaseSyncRunLogsResponse> listContextDatabaseSyncRunLogs(ListContextDatabaseSyncRunLogsRequest request);

    /**
     * <b>description</b> :
     * <p>By default, this operation returns paginated results. The Page and PageSize parameters are optional.
     * The Data field in the response is returned as an array, and the Total field indicates the total number of items that meet the query conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncRuns  ListContextDatabaseSyncRunsRequest
     * @return ListContextDatabaseSyncRunsResponse
     */
    CompletableFuture<ListContextDatabaseSyncRunsResponse> listContextDatabaseSyncRuns(ListContextDatabaseSyncRunsRequest request);

    /**
     * <b>description</b> :
     * <p>List operations return paginated results by default. Page and PageSize are optional parameters. The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncSourceTreeNodes  ListContextDatabaseSyncSourceTreeNodesRequest
     * @return ListContextDatabaseSyncSourceTreeNodesResponse
     */
    CompletableFuture<ListContextDatabaseSyncSourceTreeNodesResponse> listContextDatabaseSyncSourceTreeNodes(ListContextDatabaseSyncSourceTreeNodesRequest request);

    /**
     * <b>description</b> :
     * <p>By default, the list operation returns paginated results. Page and PageSize are optional parameters. The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncSources  ListContextDatabaseSyncSourcesRequest
     * @return ListContextDatabaseSyncSourcesResponse
     */
    CompletableFuture<ListContextDatabaseSyncSourcesResponse> listContextDatabaseSyncSources(ListContextDatabaseSyncSourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Lists ContextDB workspaces.</p>
     * 
     * @param request the request parameters of ListContextDatabaseWorkspaces  ListContextDatabaseWorkspacesRequest
     * @return ListContextDatabaseWorkspacesResponse
     */
    CompletableFuture<ListContextDatabaseWorkspacesResponse> listContextDatabaseWorkspaces(ListContextDatabaseWorkspacesRequest request);

    /**
     * @param request the request parameters of ListCustomAgent  ListCustomAgentRequest
     * @return ListCustomAgentResponse
     */
    CompletableFuture<ListCustomAgentResponse> listCustomAgent(ListCustomAgentRequest request);

    /**
     * @param request the request parameters of ListCustomAgentTools  ListCustomAgentToolsRequest
     * @return ListCustomAgentToolsResponse
     */
    CompletableFuture<ListCustomAgentToolsResponse> listCustomAgentTools(ListCustomAgentToolsRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase.</p>
     * 
     * @param request the request parameters of ListLLMTokenUsage  ListLLMTokenUsageRequest
     * @return ListLLMTokenUsageResponse
     */
    CompletableFuture<ListLLMTokenUsageResponse> listLLMTokenUsage(ListLLMTokenUsageRequest request);

    /**
     * @param request the request parameters of ListScheduledTasks  ListScheduledTasksRequest
     * @return ListScheduledTasksResponse
     */
    CompletableFuture<ListScheduledTasksResponse> listScheduledTasks(ListScheduledTasksRequest request);

    /**
     * @param request the request parameters of ListSkill  ListSkillRequest
     * @return ListSkillResponse
     */
    CompletableFuture<ListSkillResponse> listSkill(ListSkillRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ModifyAppInstance  ModifyAppInstanceRequest
     * @return ModifyAppInstanceResponse
     */
    CompletableFuture<ModifyAppInstanceResponse> modifyAppInstance(ModifyAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ModifyInstanceAuthConfig  ModifyInstanceAuthConfigRequest
     * @return ModifyInstanceAuthConfigResponse
     */
    CompletableFuture<ModifyInstanceAuthConfigResponse> modifyInstanceAuthConfig(ModifyInstanceAuthConfigRequest request);

    /**
     * @param request the request parameters of ModifyInstanceConfig  ModifyInstanceConfigRequest
     * @return ModifyInstanceConfigResponse
     */
    CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ModifyInstanceIpWhitelist  ModifyInstanceIpWhitelistRequest
     * @return ModifyInstanceIpWhitelistResponse
     */
    CompletableFuture<ModifyInstanceIpWhitelistResponse> modifyInstanceIpWhitelist(ModifyInstanceIpWhitelistRequest request);

    /**
     * @param request the request parameters of ModifyInstanceRAGConfig  ModifyInstanceRAGConfigRequest
     * @return ModifyInstanceRAGConfigResponse
     */
    CompletableFuture<ModifyInstanceRAGConfigResponse> modifyInstanceRAGConfig(ModifyInstanceRAGConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ModifyInstanceSSL  ModifyInstanceSSLRequest
     * @return ModifyInstanceSSLResponse
     */
    CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>Currently, only Object Storage Service (OSS) is supported.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceStorageConfig  ModifyInstanceStorageConfigRequest
     * @return ModifyInstanceStorageConfigResponse
     */
    CompletableFuture<ModifyInstanceStorageConfigResponse> modifyInstanceStorageConfig(ModifyInstanceStorageConfigRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ModifyInstancesSSL  ModifyInstancesSSLRequest
     * @return ModifyInstancesSSLResponse
     */
    CompletableFuture<ModifyInstancesSSLResponse> modifyInstancesSSL(ModifyInstancesSSLRequest request);

    /**
     * @param request the request parameters of ModifyMessagesFeedbacks  ModifyMessagesFeedbacksRequest
     * @return ModifyMessagesFeedbacksResponse
     */
    CompletableFuture<ModifyMessagesFeedbacksResponse> modifyMessagesFeedbacks(ModifyMessagesFeedbacksRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ModifySandboxTemplate  ModifySandboxTemplateRequest
     * @return ModifySandboxTemplateResponse
     */
    CompletableFuture<ModifySandboxTemplateResponse> modifySandboxTemplate(ModifySandboxTemplateRequest request);

    /**
     * @param request the request parameters of ModifyScheduledTask  ModifyScheduledTaskRequest
     * @return ModifyScheduledTaskResponse
     */
    CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of ModifyWhitelistIps  ModifyWhitelistIpsRequest
     * @return ModifyWhitelistIpsResponse
     */
    CompletableFuture<ModifyWhitelistIpsResponse> modifyWhitelistIps(ModifyWhitelistIpsRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes an exclusion item for a job.</p>
     * 
     * @param request the request parameters of RemoveContextDatabaseSyncJobExclusion  RemoveContextDatabaseSyncJobExclusionRequest
     * @return RemoveContextDatabaseSyncJobExclusionResponse
     */
    CompletableFuture<RemoveContextDatabaseSyncJobExclusionResponse> removeContextDatabaseSyncJobExclusion(RemoveContextDatabaseSyncJobExclusionRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of RenameApiKey  RenameApiKeyRequest
     * @return RenameApiKeyResponse
     */
    CompletableFuture<RenameApiKeyResponse> renameApiKey(RenameApiKeyRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of ResetApiKey  ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    CompletableFuture<ResetApiKeyResponse> resetApiKey(ResetApiKeyRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ResetInstanceKeys  ResetInstanceKeysRequest
     * @return ResetInstanceKeysResponse
     */
    CompletableFuture<ResetInstanceKeysResponse> resetInstanceKeys(ResetInstanceKeysRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>Currently, only the password of the RDS Supabase Dashboard user can be modified.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetInstancePassword  ResetInstancePasswordRequest
     * @return ResetInstancePasswordResponse
     */
    CompletableFuture<ResetInstancePasswordResponse> resetInstancePassword(ResetInstancePasswordRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。 重试会基于失败项生成新的 Run，原 Run 状态保持不变。</p>
     * 
     * @param request the request parameters of RetryFailedContextDatabaseSyncRun  RetryFailedContextDatabaseSyncRunRequest
     * @return RetryFailedContextDatabaseSyncRunResponse
     */
    CompletableFuture<RetryFailedContextDatabaseSyncRunResponse> retryFailedContextDatabaseSyncRun(RetryFailedContextDatabaseSyncRunRequest request);

    /**
     * <b>description</b> :
     * <p>Revokes an API key.</p>
     * 
     * @param request the request parameters of RevokeContextDatabaseApiKey  RevokeContextDatabaseApiKeyRequest
     * @return RevokeContextDatabaseApiKeyResponse
     */
    CompletableFuture<RevokeContextDatabaseApiKeyResponse> revokeContextDatabaseApiKey(RevokeContextDatabaseApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no ClientToken is provided, the backend generates one automatically.</p>
     * 
     * @param request the request parameters of StartContextDatabaseSyncRun  StartContextDatabaseSyncRunRequest
     * @return StartContextDatabaseSyncRunResponse
     */
    CompletableFuture<StartContextDatabaseSyncRunResponse> startContextDatabaseSyncRun(StartContextDatabaseSyncRunRequest request);

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no ClientToken is provided, the backend generates one automatically. Discovery is an asynchronous operation. The operation returns a discovery task identifier. Poll for results to retrieve SelectedNodeKeys.</p>
     * 
     * @param request the request parameters of StartContextDatabaseSyncSourceDiscovery  StartContextDatabaseSyncSourceDiscoveryRequest
     * @return StartContextDatabaseSyncSourceDiscoveryResponse
     */
    CompletableFuture<StartContextDatabaseSyncSourceDiscoveryResponse> startContextDatabaseSyncSourceDiscovery(StartContextDatabaseSyncSourceDiscoveryRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of UpdateApiKeyQuota  UpdateApiKeyQuotaRequest
     * @return UpdateApiKeyQuotaResponse
     */
    CompletableFuture<UpdateApiKeyQuotaResponse> updateApiKeyQuota(UpdateApiKeyQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the display metadata of an API key. At least one of Name or Description must be specified. The plaintext key is not reissued.</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseApiKey  UpdateContextDatabaseApiKeyRequest
     * @return UpdateContextDatabaseApiKeyResponse
     */
    CompletableFuture<UpdateContextDatabaseApiKeyResponse> updateContextDatabaseApiKey(UpdateContextDatabaseApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the role or status of a member.</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseMember  UpdateContextDatabaseMemberRequest
     * @return UpdateContextDatabaseMemberResponse
     */
    CompletableFuture<UpdateContextDatabaseMemberResponse> updateContextDatabaseMember(UpdateContextDatabaseMemberRequest request);

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncConnection  UpdateContextDatabaseSyncConnectionRequest
     * @return UpdateContextDatabaseSyncConnectionResponse
     */
    CompletableFuture<UpdateContextDatabaseSyncConnectionResponse> updateContextDatabaseSyncConnection(UpdateContextDatabaseSyncConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncConnectionCredential  UpdateContextDatabaseSyncConnectionCredentialRequest
     * @return UpdateContextDatabaseSyncConnectionCredentialResponse
     */
    CompletableFuture<UpdateContextDatabaseSyncConnectionCredentialResponse> updateContextDatabaseSyncConnectionCredential(UpdateContextDatabaseSyncConnectionCredentialRequest request);

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。 Target 为隐含概念，调用方只需传入 KnowledgeBaseId，后端自动创建/匹配 Target。</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncJob  UpdateContextDatabaseSyncJobRequest
     * @return UpdateContextDatabaseSyncJobResponse
     */
    CompletableFuture<UpdateContextDatabaseSyncJobResponse> updateContextDatabaseSyncJob(UpdateContextDatabaseSyncJobRequest request);

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncJobSchedule  UpdateContextDatabaseSyncJobScheduleRequest
     * @return UpdateContextDatabaseSyncJobScheduleResponse
     */
    CompletableFuture<UpdateContextDatabaseSyncJobScheduleResponse> updateContextDatabaseSyncJobSchedule(UpdateContextDatabaseSyncJobScheduleRequest request);

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence via ClientToken. If ClientToken is not provided, the backend generates one automatically.</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncSource  UpdateContextDatabaseSyncSourceRequest
     * @return UpdateContextDatabaseSyncSourceResponse
     */
    CompletableFuture<UpdateContextDatabaseSyncSourceResponse> updateContextDatabaseSyncSource(UpdateContextDatabaseSyncSourceRequest request);

    /**
     * <b>description</b> :
     * <p>For write operations, you can pass the ClientToken parameter to ensure idempotency. If this parameter is not provided, the backend automatically generates one.</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncSourceSelection  UpdateContextDatabaseSyncSourceSelectionRequest
     * @return UpdateContextDatabaseSyncSourceSelectionResponse
     */
    CompletableFuture<UpdateContextDatabaseSyncSourceSelectionResponse> updateContextDatabaseSyncSourceSelection(UpdateContextDatabaseSyncSourceSelectionRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the name of a workspace.</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseWorkspace  UpdateContextDatabaseWorkspaceRequest
     * @return UpdateContextDatabaseWorkspaceResponse
     */
    CompletableFuture<UpdateContextDatabaseWorkspaceResponse> updateContextDatabaseWorkspace(UpdateContextDatabaseWorkspaceRequest request);

    /**
     * @param request the request parameters of UpdateCustomAgent  UpdateCustomAgentRequest
     * @return UpdateCustomAgentResponse
     */
    CompletableFuture<UpdateCustomAgentResponse> updateCustomAgent(UpdateCustomAgentRequest request);

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of UpdateMOQuotaAlertThreshold  UpdateMOQuotaAlertThresholdRequest
     * @return UpdateMOQuotaAlertThresholdResponse
     */
    CompletableFuture<UpdateMOQuotaAlertThresholdResponse> updateMOQuotaAlertThreshold(UpdateMOQuotaAlertThresholdRequest request);

    /**
     * @param request the request parameters of UpdateSkill  UpdateSkillRequest
     * @return UpdateSkillResponse
     */
    CompletableFuture<UpdateSkillResponse> updateSkill(UpdateSkillRequest request);

    /**
     * <b>description</b> :
     * <p>Validates the connection credentials and authorization.</p>
     * 
     * @param request the request parameters of VerifyContextDatabaseSyncConnection  VerifyContextDatabaseSyncConnectionRequest
     * @return VerifyContextDatabaseSyncConnectionResponse
     */
    CompletableFuture<VerifyContextDatabaseSyncConnectionResponse> verifyContextDatabaseSyncConnection(VerifyContextDatabaseSyncConnectionRequest request);

}
