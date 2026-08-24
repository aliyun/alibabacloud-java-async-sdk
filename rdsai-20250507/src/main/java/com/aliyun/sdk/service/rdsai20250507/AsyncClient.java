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
     * @param request the request parameters of CreateApiKey  CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    CompletableFuture<CreateApiKeyResponse> createApiKey(CreateApiKeyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Fees of an instance are changed if the call is successful. Before you call this operation, carefully read the related topics.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAppInstance  CreateAppInstanceRequest
     * @return CreateAppInstanceResponse
     */
    CompletableFuture<CreateAppInstanceResponse> createAppInstance(CreateAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>创建 API Key（返回明文 apiKey）。</p>
     * 
     * @param request the request parameters of CreateContextDatabaseApiKey  CreateContextDatabaseApiKeyRequest
     * @return CreateContextDatabaseApiKeyResponse
     */
    CompletableFuture<CreateContextDatabaseApiKeyResponse> createContextDatabaseApiKey(CreateContextDatabaseApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>创建成员；当 GenerateInitialKey=true 时同时签发首把 API Key（返回明文 apiKey）。</p>
     * 
     * @param request the request parameters of CreateContextDatabaseMember  CreateContextDatabaseMemberRequest
     * @return CreateContextDatabaseMemberResponse
     */
    CompletableFuture<CreateContextDatabaseMemberResponse> createContextDatabaseMember(CreateContextDatabaseMemberRequest request);

    /**
     * <b>description</b> :
     * <p>创建 workspace + 首位成员 + 首把 API Key 的一次性引导，返回明文 apiKey。</p>
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
     * @param request the request parameters of CreateMOUsageDetailExport  CreateMOUsageDetailExportRequest
     * @return CreateMOUsageDetailExportResponse
     */
    CompletableFuture<CreateMOUsageDetailExportResponse> createMOUsageDetailExport(CreateMOUsageDetailExportRequest request);

    /**
     * @param request the request parameters of CreateSandboxTemplate  CreateSandboxTemplateRequest
     * @return CreateSandboxTemplateResponse
     */
    CompletableFuture<CreateSandboxTemplateResponse> createSandboxTemplate(CreateSandboxTemplateRequest request);

    /**
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
     * @param request the request parameters of DeleteApiKey  DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    CompletableFuture<DeleteApiKeyResponse> deleteApiKey(DeleteApiKeyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <blockquote>
     * <p> Fees of an instance are changed if the call is successful. Before you call this operation, carefully read the related topics.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>
     *  If you delete an RDS Supabase instance, the created RDS for PostgreSQL instance and the created NAT gateway are not automatically deleted. You must manually release the instance and delete the Internet NAT gateway and EIP.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAppInstance  DeleteAppInstanceRequest
     * @return DeleteAppInstanceResponse
     */
    CompletableFuture<DeleteAppInstanceResponse> deleteAppInstance(DeleteAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>删除成员（硬删除，不可恢复）。</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseMember  DeleteContextDatabaseMemberRequest
     * @return DeleteContextDatabaseMemberResponse
     */
    CompletableFuture<DeleteContextDatabaseMemberResponse> deleteContextDatabaseMember(DeleteContextDatabaseMemberRequest request);

    /**
     * <b>description</b> :
     * <p>删除 workspace（硬删除，不可恢复）。</p>
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
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeAppInstanceAttribute  DescribeAppInstanceAttributeRequest
     * @return DescribeAppInstanceAttributeResponse
     */
    CompletableFuture<DescribeAppInstanceAttributeResponse> describeAppInstanceAttribute(DescribeAppInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeAppInstances  DescribeAppInstancesRequest
     * @return DescribeAppInstancesResponse
     */
    CompletableFuture<DescribeAppInstancesResponse> describeAppInstances(DescribeAppInstancesRequest request);

    /**
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
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceAuthInfo  DescribeInstanceAuthInfoRequest
     * @return DescribeInstanceAuthInfoResponse
     */
    CompletableFuture<DescribeInstanceAuthInfoResponse> describeInstanceAuthInfo(DescribeInstanceAuthInfoRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceEndpoints  DescribeInstanceEndpointsRequest
     * @return DescribeInstanceEndpointsResponse
     */
    CompletableFuture<DescribeInstanceEndpointsResponse> describeInstanceEndpoints(DescribeInstanceEndpointsRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
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
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of DescribeInstanceSSL  DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     */
    CompletableFuture<DescribeInstanceSSLResponse> describeInstanceSSL(DescribeInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p> Only Object Storage Service (OSS) is supported for the storage of RDS Supabase.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeInstanceStorageConfig  DescribeInstanceStorageConfigRequest
     * @return DescribeInstanceStorageConfigResponse
     */
    CompletableFuture<DescribeInstanceStorageConfigResponse> describeInstanceStorageConfig(DescribeInstanceStorageConfigRequest request);

    /**
     * @param request the request parameters of DescribeMOTokenUsageDetail  DescribeMOTokenUsageDetailRequest
     * @return DescribeMOTokenUsageDetailResponse
     */
    CompletableFuture<DescribeMOTokenUsageDetailResponse> describeMOTokenUsageDetail(DescribeMOTokenUsageDetailRequest request);

    /**
     * @param request the request parameters of DescribeMOTokenUsageSummary  DescribeMOTokenUsageSummaryRequest
     * @return DescribeMOTokenUsageSummaryResponse
     */
    CompletableFuture<DescribeMOTokenUsageSummaryResponse> describeMOTokenUsageSummary(DescribeMOTokenUsageSummaryRequest request);

    /**
     * @param request the request parameters of DescribeMOUsageDetailExport  DescribeMOUsageDetailExportRequest
     * @return DescribeMOUsageDetailExportResponse
     */
    CompletableFuture<DescribeMOUsageDetailExportResponse> describeMOUsageDetailExport(DescribeMOUsageDetailExportRequest request);

    /**
     * @param request the request parameters of DescribeModelOperator  DescribeModelOperatorRequest
     * @return DescribeModelOperatorResponse
     */
    CompletableFuture<DescribeModelOperatorResponse> describeModelOperator(DescribeModelOperatorRequest request);

    /**
     * @param request the request parameters of DescribeMonitorData  DescribeMonitorDataRequest
     * @return DescribeMonitorDataResponse
     */
    CompletableFuture<DescribeMonitorDataResponse> describeMonitorData(DescribeMonitorDataRequest request);

    /**
     * @param request the request parameters of DescribeSandboxTemplates  DescribeSandboxTemplatesRequest
     * @return DescribeSandboxTemplatesResponse
     */
    CompletableFuture<DescribeSandboxTemplatesResponse> describeSandboxTemplates(DescribeSandboxTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeWhitelistIps  DescribeWhitelistIpsRequest
     * @return DescribeWhitelistIpsResponse
     */
    CompletableFuture<DescribeWhitelistIpsResponse> describeWhitelistIps(DescribeWhitelistIpsRequest request);

    /**
     * @param request the request parameters of DisableAgentRuntime  DisableAgentRuntimeRequest
     * @return DisableAgentRuntimeResponse
     */
    CompletableFuture<DisableAgentRuntimeResponse> disableAgentRuntime(DisableAgentRuntimeRequest request);

    /**
     * @param request the request parameters of EnableAgentRuntime  EnableAgentRuntimeRequest
     * @return EnableAgentRuntimeResponse
     */
    CompletableFuture<EnableAgentRuntimeResponse> enableAgentRuntime(EnableAgentRuntimeRequest request);

    /**
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
     * @param request the request parameters of ListApiKeys  ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    CompletableFuture<ListApiKeysResponse> listApiKeys(ListApiKeysRequest request);

    /**
     * <b>description</b> :
     * <p>列出成员名下的 API Key。</p>
     * 
     * @param request the request parameters of ListContextDatabaseApiKeys  ListContextDatabaseApiKeysRequest
     * @return ListContextDatabaseApiKeysResponse
     */
    CompletableFuture<ListContextDatabaseApiKeysResponse> listContextDatabaseApiKeys(ListContextDatabaseApiKeysRequest request);

    /**
     * <b>description</b> :
     * <p>列出 workspace 下成员。</p>
     * 
     * @param request the request parameters of ListContextDatabaseMembers  ListContextDatabaseMembersRequest
     * @return ListContextDatabaseMembersResponse
     */
    CompletableFuture<ListContextDatabaseMembersResponse> listContextDatabaseMembers(ListContextDatabaseMembersRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取指定条件下的工作区列表。</li>
     * <li><code>workspaceId</code> 和 <code>status</code> 参数均为可选，可以根据需要进行过滤。</li>
     * <li>如果不提供任何过滤参数，则返回调用方账号下的所有工作区。</li>
     * <li>注意：确保在请求中包含必要的认证信息（如callerUid、requestId等），否则将导致请求失败。</li>
     * </ul>
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
     * @param request the request parameters of ModifyAppInstance  ModifyAppInstanceRequest
     * @return ModifyAppInstanceResponse
     */
    CompletableFuture<ModifyAppInstanceResponse> modifyAppInstance(ModifyAppInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
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
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
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
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of ModifyInstanceSSL  ModifyInstanceSSLRequest
     * @return ModifyInstanceSSLResponse
     */
    CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p> Only Object Storage Service (OSS) is supported for the storage of RDS Supabase.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyInstanceStorageConfig  ModifyInstanceStorageConfigRequest
     * @return ModifyInstanceStorageConfigResponse
     */
    CompletableFuture<ModifyInstanceStorageConfigResponse> modifyInstanceStorageConfig(ModifyInstanceStorageConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
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
     * @param request the request parameters of ModifyWhitelistIps  ModifyWhitelistIpsRequest
     * @return ModifyWhitelistIpsResponse
     */
    CompletableFuture<ModifyWhitelistIpsResponse> modifyWhitelistIps(ModifyWhitelistIpsRequest request);

    /**
     * @param request the request parameters of RenameApiKey  RenameApiKeyRequest
     * @return RenameApiKeyResponse
     */
    CompletableFuture<RenameApiKeyResponse> renameApiKey(RenameApiKeyRequest request);

    /**
     * @param request the request parameters of ResetApiKey  ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    CompletableFuture<ResetApiKeyResponse> resetApiKey(ResetApiKeyRequest request);

    /**
     * @param request the request parameters of ResetInstanceKeys  ResetInstanceKeysRequest
     * @return ResetInstanceKeysResponse
     */
    CompletableFuture<ResetInstanceKeysResponse> resetInstanceKeys(ResetInstanceKeysRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p> You can only change the password of a RDS Supabase Dashboard user.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetInstancePassword  ResetInstancePasswordRequest
     * @return ResetInstancePasswordResponse
     */
    CompletableFuture<ResetInstancePasswordResponse> resetInstancePassword(ResetInstancePasswordRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of RestartInstance  RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>吊销 API Key。</p>
     * 
     * @param request the request parameters of RevokeContextDatabaseApiKey  RevokeContextDatabaseApiKeyRequest
     * @return RevokeContextDatabaseApiKeyResponse
     */
    CompletableFuture<RevokeContextDatabaseApiKeyResponse> revokeContextDatabaseApiKey(RevokeContextDatabaseApiKeyRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Supported database engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3><a href="#"></a>References</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * @param request the request parameters of UpdateApiKeyQuota  UpdateApiKeyQuotaRequest
     * @return UpdateApiKeyQuotaResponse
     */
    CompletableFuture<UpdateApiKeyQuotaResponse> updateApiKeyQuota(UpdateApiKeyQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>更新 API Key 的展示元数据；<code>Name</code> 与 <code>Description</code> 至少传其一。明文 Key 不重新签发。</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseApiKey  UpdateContextDatabaseApiKeyRequest
     * @return UpdateContextDatabaseApiKeyResponse
     */
    CompletableFuture<UpdateContextDatabaseApiKeyResponse> updateContextDatabaseApiKey(UpdateContextDatabaseApiKeyRequest request);

    /**
     * <b>description</b> :
     * <p>更新成员的角色 / 状态。</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseMember  UpdateContextDatabaseMemberRequest
     * @return UpdateContextDatabaseMemberResponse
     */
    CompletableFuture<UpdateContextDatabaseMemberResponse> updateContextDatabaseMember(UpdateContextDatabaseMemberRequest request);

    /**
     * <b>description</b> :
     * <p>修改 workspace 名称。</p>
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
     * @param request the request parameters of UpdateMOQuotaAlertThreshold  UpdateMOQuotaAlertThresholdRequest
     * @return UpdateMOQuotaAlertThresholdResponse
     */
    CompletableFuture<UpdateMOQuotaAlertThresholdResponse> updateMOQuotaAlertThreshold(UpdateMOQuotaAlertThresholdRequest request);

    /**
     * @param request the request parameters of UpdateSkill  UpdateSkillRequest
     * @return UpdateSkillResponse
     */
    CompletableFuture<UpdateSkillResponse> updateSkill(UpdateSkillRequest request);

}
