// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.rdsai20250507.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "RdsAi";
        this.version = "2025-05-07";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-wulanchabu", "rdsai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "rdsai.aliyuncs.com"),
            new TeaPair("cn-beijing", "rdsai.aliyuncs.com"),
            new TeaPair("cn-shanghai", "rdsai.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "rdsai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "rdsai.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Adds a job exclusion item.</p>
     * 
     * @param request the request parameters of AddContextDatabaseSyncJobExclusion  AddContextDatabaseSyncJobExclusionRequest
     * @return AddContextDatabaseSyncJobExclusionResponse
     */
    @Override
    public CompletableFuture<AddContextDatabaseSyncJobExclusionResponse> addContextDatabaseSyncJobExclusion(AddContextDatabaseSyncJobExclusionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddContextDatabaseSyncJobExclusion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddContextDatabaseSyncJobExclusionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddContextDatabaseSyncJobExclusionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can specify a ClientToken to ensure idempotence for write operations. If you do not specify this parameter, the backend automatically generates one.</p>
     * 
     * @param request the request parameters of CancelContextDatabaseSyncDiscovery  CancelContextDatabaseSyncDiscoveryRequest
     * @return CancelContextDatabaseSyncDiscoveryResponse
     */
    @Override
    public CompletableFuture<CancelContextDatabaseSyncDiscoveryResponse> cancelContextDatabaseSyncDiscovery(CancelContextDatabaseSyncDiscoveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelContextDatabaseSyncDiscovery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelContextDatabaseSyncDiscoveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelContextDatabaseSyncDiscoveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence through ClientToken. If ClientToken is not provided, the backend generates one automatically. Cancellation is best-effort. Completed RunItems are not affected.</p>
     * 
     * @param request the request parameters of CancelContextDatabaseSyncRun  CancelContextDatabaseSyncRunRequest
     * @return CancelContextDatabaseSyncRunResponse
     */
    @Override
    public CompletableFuture<CancelContextDatabaseSyncRunResponse> cancelContextDatabaseSyncRun(CancelContextDatabaseSyncRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelContextDatabaseSyncRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelContextDatabaseSyncRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelContextDatabaseSyncRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChatMessages  ChatMessagesRequest
     * @return ChatMessagesResponse
     */
    @Override
    public CompletableFuture<ChatMessagesResponse> chatMessages(ChatMessagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatMessages").setMethod(HttpMethod.POST).setPathRegex("/v1/chat-messages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatMessagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatMessagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<ChatMessagesResponseBody> chatMessagesWithResponseIterable(ChatMessagesRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("ChatMessages").setMethod(HttpMethod.POST).setPathRegex("/v1/chat-messages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        ChatMessagesResponseBodyIterator iterator = ChatMessagesResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of ChatMessagesTaskStop  ChatMessagesTaskStopRequest
     * @return ChatMessagesTaskStopResponse
     */
    @Override
    public CompletableFuture<ChatMessagesTaskStopResponse> chatMessagesTaskStop(ChatMessagesTaskStopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChatMessagesTaskStop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChatMessagesTaskStopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChatMessagesTaskStopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of CreateApiKey  CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    @Override
    public CompletableFuture<CreateApiKeyResponse> createApiKey(CreateApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApiKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateAppInstanceResponse> createAppInstance(CreateAppInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAppInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAppInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAppInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an API key and returns the plaintext apiKey.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseApiKey  CreateContextDatabaseApiKeyRequest
     * @return CreateContextDatabaseApiKeyResponse
     */
    @Override
    public CompletableFuture<CreateContextDatabaseApiKeyResponse> createContextDatabaseApiKey(CreateContextDatabaseApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContextDatabaseApiKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContextDatabaseApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContextDatabaseApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a member. If GenerateInitialKey is set to true, the first API key is also issued, and the plaintext ApiKey is returned in the response. This is a sensitive field and is returned only once. Store it securely. After the member is created, you can call the List or Get operation to query the member and the metadata of the API keys under the member.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseMember  CreateContextDatabaseMemberRequest
     * @return CreateContextDatabaseMemberResponse
     */
    @Override
    public CompletableFuture<CreateContextDatabaseMemberResponse> createContextDatabaseMember(CreateContextDatabaseMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContextDatabaseMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContextDatabaseMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContextDatabaseMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For write operations, you can specify a ClientToken to ensure idempotency. If no ClientToken is provided, the backend automatically generates one. Upon successful creation, the complete information of the created object is returned, including the ID that can be used for subsequent queries or updates.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseSyncConnection  CreateContextDatabaseSyncConnectionRequest
     * @return CreateContextDatabaseSyncConnectionResponse
     */
    @Override
    public CompletableFuture<CreateContextDatabaseSyncConnectionResponse> createContextDatabaseSyncConnection(CreateContextDatabaseSyncConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContextDatabaseSyncConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContextDatabaseSyncConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContextDatabaseSyncConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence via ClientToken. If ClientToken is not provided, the backend generates one automatically. Target is an implicit concept — you only need to provide KnowledgeBaseId, and the backend automatically creates or matches the Target.
     * On success, the response returns the complete information of the created object. The Id field is active and can be used for subsequent queries or updates.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseSyncJob  CreateContextDatabaseSyncJobRequest
     * @return CreateContextDatabaseSyncJobResponse
     */
    @Override
    public CompletableFuture<CreateContextDatabaseSyncJobResponse> createContextDatabaseSyncJob(CreateContextDatabaseSyncJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContextDatabaseSyncJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContextDatabaseSyncJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContextDatabaseSyncJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no token is provided, the backend generates one automatically. After creating a data selection scope, you typically need to call StartContextDatabaseSyncSourceDiscovery to discover available nodes.
     * On success, the response returns the complete information of the created object. The Id field can be used for subsequent queries or updates.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseSyncSource  CreateContextDatabaseSyncSourceRequest
     * @return CreateContextDatabaseSyncSourceResponse
     */
    @Override
    public CompletableFuture<CreateContextDatabaseSyncSourceResponse> createContextDatabaseSyncSource(CreateContextDatabaseSyncSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContextDatabaseSyncSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContextDatabaseSyncSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContextDatabaseSyncSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a workspace along with the first member and the first API key in a one-time onboarding process. The plaintext API key is returned in the response.</p>
     * 
     * @param request the request parameters of CreateContextDatabaseWorkspace  CreateContextDatabaseWorkspaceRequest
     * @return CreateContextDatabaseWorkspaceResponse
     */
    @Override
    public CompletableFuture<CreateContextDatabaseWorkspaceResponse> createContextDatabaseWorkspace(CreateContextDatabaseWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContextDatabaseWorkspace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContextDatabaseWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContextDatabaseWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomAgent  CreateCustomAgentRequest
     * @return CreateCustomAgentResponse
     */
    @Override
    public CompletableFuture<CreateCustomAgentResponse> createCustomAgent(CreateCustomAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInspectionTask  CreateInspectionTaskRequest
     * @return CreateInspectionTaskResponse
     */
    @Override
    public CompletableFuture<CreateInspectionTaskResponse> createInspectionTask(CreateInspectionTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInspectionTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInspectionTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInspectionTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of CreateMOUsageDetailExport  CreateMOUsageDetailExportRequest
     * @return CreateMOUsageDetailExportResponse
     */
    @Override
    public CompletableFuture<CreateMOUsageDetailExportResponse> createMOUsageDetailExport(CreateMOUsageDetailExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMOUsageDetailExport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMOUsageDetailExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMOUsageDetailExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateSandboxTemplateResponse> createSandboxTemplate(CreateSandboxTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSandboxTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSandboxTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSandboxTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateScheduledTaskResponse> createScheduledTask(CreateScheduledTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateScheduledTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateScheduledTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateScheduledTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSkill  CreateSkillRequest
     * @return CreateSkillResponse
     */
    @Override
    public CompletableFuture<CreateSkillResponse> createSkill(CreateSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DeleteApiKey  DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    @Override
    public CompletableFuture<DeleteApiKeyResponse> deleteApiKey(DeleteApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApiKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteAppInstanceResponse> deleteAppInstance(DeleteAppInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAppInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a member. This is a hard delete and cannot be undone.</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseMember  DeleteContextDatabaseMemberRequest
     * @return DeleteContextDatabaseMemberResponse
     */
    @Override
    public CompletableFuture<DeleteContextDatabaseMemberResponse> deleteContextDatabaseMember(DeleteContextDatabaseMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContextDatabaseMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContextDatabaseMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContextDatabaseMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For write operations, you can specify a ClientToken to ensure idempotency. If you do not specify a ClientToken, the backend automatically generates one.</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseSyncConnection  DeleteContextDatabaseSyncConnectionRequest
     * @return DeleteContextDatabaseSyncConnectionResponse
     */
    @Override
    public CompletableFuture<DeleteContextDatabaseSyncConnectionResponse> deleteContextDatabaseSyncConnection(DeleteContextDatabaseSyncConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContextDatabaseSyncConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContextDatabaseSyncConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContextDatabaseSyncConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can provide a ClientToken to ensure idempotency for write operations. If not provided, the backend automatically generates one.</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseSyncJob  DeleteContextDatabaseSyncJobRequest
     * @return DeleteContextDatabaseSyncJobResponse
     */
    @Override
    public CompletableFuture<DeleteContextDatabaseSyncJobResponse> deleteContextDatabaseSyncJob(DeleteContextDatabaseSyncJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContextDatabaseSyncJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContextDatabaseSyncJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContextDatabaseSyncJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence through ClientToken. If ClientToken is not provided, the backend generates one automatically.</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseSyncSource  DeleteContextDatabaseSyncSourceRequest
     * @return DeleteContextDatabaseSyncSourceResponse
     */
    @Override
    public CompletableFuture<DeleteContextDatabaseSyncSourceResponse> deleteContextDatabaseSyncSource(DeleteContextDatabaseSyncSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContextDatabaseSyncSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContextDatabaseSyncSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContextDatabaseSyncSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a workspace. This is a hard delete and cannot be recovered. After the workspace is deleted, the local metadata is soft-deleted synchronously. Deleted workspaces no longer count toward the quota.</p>
     * 
     * @param request the request parameters of DeleteContextDatabaseWorkspace  DeleteContextDatabaseWorkspaceRequest
     * @return DeleteContextDatabaseWorkspaceResponse
     */
    @Override
    public CompletableFuture<DeleteContextDatabaseWorkspaceResponse> deleteContextDatabaseWorkspace(DeleteContextDatabaseWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContextDatabaseWorkspace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContextDatabaseWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContextDatabaseWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomAgent  DeleteCustomAgentRequest
     * @return DeleteCustomAgentResponse
     */
    @Override
    public CompletableFuture<DeleteCustomAgentResponse> deleteCustomAgent(DeleteCustomAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteSandboxTemplateResponse> deleteSandboxTemplate(DeleteSandboxTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSandboxTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSandboxTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSandboxTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteScheduledTask  DeleteScheduledTaskRequest
     * @return DeleteScheduledTaskResponse
     */
    @Override
    public CompletableFuture<DeleteScheduledTaskResponse> deleteScheduledTask(DeleteScheduledTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteScheduledTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteScheduledTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteScheduledTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSkill  DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    @Override
    public CompletableFuture<DeleteSkillResponse> deleteSkill(DeleteSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeAppInstanceAttributeResponse> describeAppInstanceAttribute(DescribeAppInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAppInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeAppInstancesResponse> describeAppInstances(DescribeAppInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAppInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeCommonSandboxTemplatesResponse> describeCommonSandboxTemplates(DescribeCommonSandboxTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommonSandboxTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommonSandboxTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommonSandboxTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEventsList  DescribeEventsListRequest
     * @return DescribeEventsListResponse
     */
    @Override
    public CompletableFuture<DescribeEventsListResponse> describeEventsList(DescribeEventsListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEventsList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEventsListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEventsListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeInstanceAuthInfoResponse> describeInstanceAuthInfo(DescribeInstanceAuthInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAuthInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAuthInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAuthInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeInstanceEndpointsResponse> describeInstanceEndpoints(DescribeInstanceEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeInstanceIpWhitelistResponse> describeInstanceIpWhitelist(DescribeInstanceIpWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceIpWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceIpWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceIpWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceRAGConfig  DescribeInstanceRAGConfigRequest
     * @return DescribeInstanceRAGConfigResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceRAGConfigResponse> describeInstanceRAGConfig(DescribeInstanceRAGConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceRAGConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceRAGConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceRAGConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeInstanceSSLResponse> describeInstanceSSL(DescribeInstanceSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeInstanceStorageConfigResponse> describeInstanceStorageConfig(DescribeInstanceStorageConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceStorageConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceStorageConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceStorageConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeMOTokenUsageDetail  DescribeMOTokenUsageDetailRequest
     * @return DescribeMOTokenUsageDetailResponse
     */
    @Override
    public CompletableFuture<DescribeMOTokenUsageDetailResponse> describeMOTokenUsageDetail(DescribeMOTokenUsageDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMOTokenUsageDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMOTokenUsageDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMOTokenUsageDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeMOTokenUsageSummary  DescribeMOTokenUsageSummaryRequest
     * @return DescribeMOTokenUsageSummaryResponse
     */
    @Override
    public CompletableFuture<DescribeMOTokenUsageSummaryResponse> describeMOTokenUsageSummary(DescribeMOTokenUsageSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMOTokenUsageSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMOTokenUsageSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMOTokenUsageSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeMOUsageDetailExport  DescribeMOUsageDetailExportRequest
     * @return DescribeMOUsageDetailExportResponse
     */
    @Override
    public CompletableFuture<DescribeMOUsageDetailExportResponse> describeMOUsageDetailExport(DescribeMOUsageDetailExportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMOUsageDetailExport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMOUsageDetailExportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMOUsageDetailExportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeModelOperator  DescribeModelOperatorRequest
     * @return DescribeModelOperatorResponse
     */
    @Override
    public CompletableFuture<DescribeModelOperatorResponse> describeModelOperator(DescribeModelOperatorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeModelOperator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeModelOperatorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeModelOperatorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeMonitorData  DescribeMonitorDataRequest
     * @return DescribeMonitorDataResponse
     */
    @Override
    public CompletableFuture<DescribeMonitorDataResponse> describeMonitorData(DescribeMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeSandboxTemplatesResponse> describeSandboxTemplates(DescribeSandboxTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSandboxTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSandboxTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSandboxTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of DescribeWhitelistIps  DescribeWhitelistIpsRequest
     * @return DescribeWhitelistIpsResponse
     */
    @Override
    public CompletableFuture<DescribeWhitelistIpsResponse> describeWhitelistIps(DescribeWhitelistIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWhitelistIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWhitelistIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWhitelistIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DisableAgentRuntimeResponse> disableAgentRuntime(DisableAgentRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableAgentRuntime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableAgentRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableAgentRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>During the public preview, the sandbox and Edge Routine features are free of charge.</p>
     * <h3>Before you begin</h3>
     * <p>Before you use this feature, <a href="https://api.aliyun.com/api/ResourceManager/2020-03-31/CreateServiceLinkedRole?spm=api-workbench.API%20Document.0.0.4ea75094rJgPzK&RegionId=cn-beijing&tab=DEBUG&params=%7B%2522ServiceName%2522:%2522supabase.rdsai.aliyuncs.com%2522%7D&sdkStyle=old">authorize the service-linked role</a>. The service-linked role used is <a href="https://www.alibabacloud.com/help/en/ram/product-overview/services-that-work-with-service-linked-roles">AliyunServiceRoleForRDSAISupabase</a>.</p>
     * 
     * @param request the request parameters of EnableAgentRuntime  EnableAgentRuntimeRequest
     * @return EnableAgentRuntimeResponse
     */
    @Override
    public CompletableFuture<EnableAgentRuntimeResponse> enableAgentRuntime(EnableAgentRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableAgentRuntime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableAgentRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableAgentRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase.</p>
     * 
     * @param request the request parameters of GetAvailableLLMModels  GetAvailableLLMModelsRequest
     * @return GetAvailableLLMModelsResponse
     */
    @Override
    public CompletableFuture<GetAvailableLLMModelsResponse> getAvailableLLMModels(GetAvailableLLMModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAvailableLLMModels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAvailableLLMModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAvailableLLMModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetChatModel  GetChatModelRequest
     * @return GetChatModelResponse
     */
    @Override
    public CompletableFuture<GetChatModelResponse> getChatModel(GetChatModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetChatModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChatModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChatModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a connection.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncConnection  GetContextDatabaseSyncConnectionRequest
     * @return GetContextDatabaseSyncConnectionResponse
     */
    @Override
    public CompletableFuture<GetContextDatabaseSyncConnectionResponse> getContextDatabaseSyncConnection(GetContextDatabaseSyncConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContextDatabaseSyncConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextDatabaseSyncConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextDatabaseSyncConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the authorization scope of a connection.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncConnectionAuthorization  GetContextDatabaseSyncConnectionAuthorizationRequest
     * @return GetContextDatabaseSyncConnectionAuthorizationResponse
     */
    @Override
    public CompletableFuture<GetContextDatabaseSyncConnectionAuthorizationResponse> getContextDatabaseSyncConnectionAuthorization(GetContextDatabaseSyncConnectionAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContextDatabaseSyncConnectionAuthorization").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextDatabaseSyncConnectionAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextDatabaseSyncConnectionAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the status of a discovery task by task ID.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncDiscoveryTask  GetContextDatabaseSyncDiscoveryTaskRequest
     * @return GetContextDatabaseSyncDiscoveryTaskResponse
     */
    @Override
    public CompletableFuture<GetContextDatabaseSyncDiscoveryTaskResponse> getContextDatabaseSyncDiscoveryTask(GetContextDatabaseSyncDiscoveryTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContextDatabaseSyncDiscoveryTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextDatabaseSyncDiscoveryTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextDatabaseSyncDiscoveryTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a job.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncJob  GetContextDatabaseSyncJobRequest
     * @return GetContextDatabaseSyncJobResponse
     */
    @Override
    public CompletableFuture<GetContextDatabaseSyncJobResponse> getContextDatabaseSyncJob(GetContextDatabaseSyncJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContextDatabaseSyncJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextDatabaseSyncJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextDatabaseSyncJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries whether a job can be started.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncJobReadiness  GetContextDatabaseSyncJobReadinessRequest
     * @return GetContextDatabaseSyncJobReadinessResponse
     */
    @Override
    public CompletableFuture<GetContextDatabaseSyncJobReadinessResponse> getContextDatabaseSyncJobReadiness(GetContextDatabaseSyncJobReadinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContextDatabaseSyncJobReadiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextDatabaseSyncJobReadinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextDatabaseSyncJobReadinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the scheduling configuration of a job.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncJobSchedule  GetContextDatabaseSyncJobScheduleRequest
     * @return GetContextDatabaseSyncJobScheduleResponse
     */
    @Override
    public CompletableFuture<GetContextDatabaseSyncJobScheduleResponse> getContextDatabaseSyncJobSchedule(GetContextDatabaseSyncJobScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContextDatabaseSyncJobSchedule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextDatabaseSyncJobScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextDatabaseSyncJobScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a run.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncRun  GetContextDatabaseSyncRunRequest
     * @return GetContextDatabaseSyncRunResponse
     */
    @Override
    public CompletableFuture<GetContextDatabaseSyncRunResponse> getContextDatabaseSyncRun(GetContextDatabaseSyncRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContextDatabaseSyncRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextDatabaseSyncRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextDatabaseSyncRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a source.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncSource  GetContextDatabaseSyncSourceRequest
     * @return GetContextDatabaseSyncSourceResponse
     */
    @Override
    public CompletableFuture<GetContextDatabaseSyncSourceResponse> getContextDatabaseSyncSource(GetContextDatabaseSyncSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContextDatabaseSyncSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextDatabaseSyncSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextDatabaseSyncSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the current node selection of the source.</p>
     * 
     * @param request the request parameters of GetContextDatabaseSyncSourceSelection  GetContextDatabaseSyncSourceSelectionRequest
     * @return GetContextDatabaseSyncSourceSelectionResponse
     */
    @Override
    public CompletableFuture<GetContextDatabaseSyncSourceSelectionResponse> getContextDatabaseSyncSourceSelection(GetContextDatabaseSyncSourceSelectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetContextDatabaseSyncSourceSelection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextDatabaseSyncSourceSelectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextDatabaseSyncSourceSelectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConversations  GetConversationsRequest
     * @return GetConversationsResponse
     */
    @Override
    public CompletableFuture<GetConversationsResponse> getConversations(GetConversationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConversations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConversationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConversationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomAgent  GetCustomAgentRequest
     * @return GetCustomAgentResponse
     */
    @Override
    public CompletableFuture<GetCustomAgentResponse> getCustomAgent(GetCustomAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInspectionReport  GetInspectionReportRequest
     * @return GetInspectionReportResponse
     */
    @Override
    public CompletableFuture<GetInspectionReportResponse> getInspectionReport(GetInspectionReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInspectionReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInspectionReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInspectionReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMessages  GetMessagesRequest
     * @return GetMessagesResponse
     */
    @Override
    public CompletableFuture<GetMessagesResponse> getMessages(GetMessagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMessages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMessagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMessagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of GetModelOperatorOrder  GetModelOperatorOrderRequest
     * @return GetModelOperatorOrderResponse
     */
    @Override
    public CompletableFuture<GetModelOperatorOrderResponse> getModelOperatorOrder(GetModelOperatorOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetModelOperatorOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelOperatorOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelOperatorOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetScheduledInstances  GetScheduledInstancesRequest
     * @return GetScheduledInstancesResponse
     */
    @Override
    public CompletableFuture<GetScheduledInstancesResponse> getScheduledInstances(GetScheduledInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetScheduledInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScheduledInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScheduledInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetScheduledReports  GetScheduledReportsRequest
     * @return GetScheduledReportsResponse
     */
    @Override
    public CompletableFuture<GetScheduledReportsResponse> getScheduledReports(GetScheduledReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetScheduledReports").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScheduledReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScheduledReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSkill  GetSkillRequest
     * @return GetSkillResponse
     */
    @Override
    public CompletableFuture<GetSkillResponse> getSkill(GetSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStandAloneReports  GetStandAloneReportsRequest
     * @return GetStandAloneReportsResponse
     */
    @Override
    public CompletableFuture<GetStandAloneReportsResponse> getStandAloneReports(GetStandAloneReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetStandAloneReports").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStandAloneReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStandAloneReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of ListApiKeys  ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    @Override
    public CompletableFuture<ListApiKeysResponse> listApiKeys(ListApiKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApiKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApiKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApiKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Lists the API keys under a specified member. The plaintext key values are not returned.</p>
     * 
     * @param request the request parameters of ListContextDatabaseApiKeys  ListContextDatabaseApiKeysRequest
     * @return ListContextDatabaseApiKeysResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseApiKeysResponse> listContextDatabaseApiKeys(ListContextDatabaseApiKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseApiKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseApiKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseApiKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Lists all members in a specified workspace. Each member includes a list of API keys (plaintext values are not returned).</p>
     * 
     * @param request the request parameters of ListContextDatabaseMembers  ListContextDatabaseMembersRequest
     * @return ListContextDatabaseMembersResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseMembersResponse> listContextDatabaseMembers(ListContextDatabaseMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseMembers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The list operation returns paginated results by default. Page and PageSize are optional parameters.
     * The Data list field in the response is returned as an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncConnections  ListContextDatabaseSyncConnectionsRequest
     * @return ListContextDatabaseSyncConnectionsResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseSyncConnectionsResponse> listContextDatabaseSyncConnections(ListContextDatabaseSyncConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseSyncConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseSyncConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseSyncConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>By default, this operation returns paginated results. The Page and PageSize parameters are optional. The Data field in the response is returned as an array, and the Total field indicates the total number of matching entries.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncJobDocuments  ListContextDatabaseSyncJobDocumentsRequest
     * @return ListContextDatabaseSyncJobDocumentsResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseSyncJobDocumentsResponse> listContextDatabaseSyncJobDocuments(ListContextDatabaseSyncJobDocumentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseSyncJobDocuments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseSyncJobDocumentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseSyncJobDocumentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation uses pagination by default. Page and PageSize are optional parameters.
     * The Data field in the response returns an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncJobExclusions  ListContextDatabaseSyncJobExclusionsRequest
     * @return ListContextDatabaseSyncJobExclusionsResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseSyncJobExclusionsResponse> listContextDatabaseSyncJobExclusions(ListContextDatabaseSyncJobExclusionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseSyncJobExclusions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseSyncJobExclusionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseSyncJobExclusionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The list operation returns paginated results by default. Page and PageSize are optional parameters.
     * The Data list field in the response is returned as an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncJobs  ListContextDatabaseSyncJobsRequest
     * @return ListContextDatabaseSyncJobsResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseSyncJobsResponse> listContextDatabaseSyncJobs(ListContextDatabaseSyncJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseSyncJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseSyncJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseSyncJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation returns a fixed-length array of available plugins in the workspace and does not support pagination.
     * The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncPlugins  ListContextDatabaseSyncPluginsRequest
     * @return ListContextDatabaseSyncPluginsResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseSyncPluginsResponse> listContextDatabaseSyncPlugins(ListContextDatabaseSyncPluginsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseSyncPlugins").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseSyncPluginsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseSyncPluginsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The list API returns paginated results by default. The Page and PageSize parameters are optional. Run records are a list of RunItems that show the processing results of each document in each import run.
     * The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncRunItems  ListContextDatabaseSyncRunItemsRequest
     * @return ListContextDatabaseSyncRunItemsResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseSyncRunItemsResponse> listContextDatabaseSyncRunItems(ListContextDatabaseSyncRunItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseSyncRunItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseSyncRunItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseSyncRunItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>列表接口默认分页返回，Page 与 PageSize 为可选参数。
     * 响应中的 Data 列表字段使用数组返回，Total 表示符合条件的总条数。</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncRunLogs  ListContextDatabaseSyncRunLogsRequest
     * @return ListContextDatabaseSyncRunLogsResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseSyncRunLogsResponse> listContextDatabaseSyncRunLogs(ListContextDatabaseSyncRunLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseSyncRunLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseSyncRunLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseSyncRunLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>By default, this operation returns paginated results. The Page and PageSize parameters are optional.
     * The Data field in the response is returned as an array, and the Total field indicates the total number of items that meet the query conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncRuns  ListContextDatabaseSyncRunsRequest
     * @return ListContextDatabaseSyncRunsResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseSyncRunsResponse> listContextDatabaseSyncRuns(ListContextDatabaseSyncRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseSyncRuns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseSyncRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseSyncRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>List operations return paginated results by default. Page and PageSize are optional parameters. The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncSourceTreeNodes  ListContextDatabaseSyncSourceTreeNodesRequest
     * @return ListContextDatabaseSyncSourceTreeNodesResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseSyncSourceTreeNodesResponse> listContextDatabaseSyncSourceTreeNodes(ListContextDatabaseSyncSourceTreeNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseSyncSourceTreeNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseSyncSourceTreeNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseSyncSourceTreeNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>By default, the list operation returns paginated results. Page and PageSize are optional parameters. The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * @param request the request parameters of ListContextDatabaseSyncSources  ListContextDatabaseSyncSourcesRequest
     * @return ListContextDatabaseSyncSourcesResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseSyncSourcesResponse> listContextDatabaseSyncSources(ListContextDatabaseSyncSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseSyncSources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseSyncSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseSyncSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Lists ContextDB workspaces.</p>
     * 
     * @param request the request parameters of ListContextDatabaseWorkspaces  ListContextDatabaseWorkspacesRequest
     * @return ListContextDatabaseWorkspacesResponse
     */
    @Override
    public CompletableFuture<ListContextDatabaseWorkspacesResponse> listContextDatabaseWorkspaces(ListContextDatabaseWorkspacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListContextDatabaseWorkspaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextDatabaseWorkspacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextDatabaseWorkspacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomAgent  ListCustomAgentRequest
     * @return ListCustomAgentResponse
     */
    @Override
    public CompletableFuture<ListCustomAgentResponse> listCustomAgent(ListCustomAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomAgentTools  ListCustomAgentToolsRequest
     * @return ListCustomAgentToolsResponse
     */
    @Override
    public CompletableFuture<ListCustomAgentToolsResponse> listCustomAgentTools(ListCustomAgentToolsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomAgentTools").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomAgentToolsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomAgentToolsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase.</p>
     * 
     * @param request the request parameters of ListLLMTokenUsage  ListLLMTokenUsageRequest
     * @return ListLLMTokenUsageResponse
     */
    @Override
    public CompletableFuture<ListLLMTokenUsageResponse> listLLMTokenUsage(ListLLMTokenUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLLMTokenUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLLMTokenUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLLMTokenUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListScheduledTasks  ListScheduledTasksRequest
     * @return ListScheduledTasksResponse
     */
    @Override
    public CompletableFuture<ListScheduledTasksResponse> listScheduledTasks(ListScheduledTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListScheduledTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListScheduledTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListScheduledTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSkill  ListSkillRequest
     * @return ListSkillResponse
     */
    @Override
    public CompletableFuture<ListSkillResponse> listSkill(ListSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyAppInstanceResponse> modifyAppInstance(ModifyAppInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAppInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAppInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAppInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyInstanceAuthConfigResponse> modifyInstanceAuthConfig(ModifyInstanceAuthConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAuthConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAuthConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAuthConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstanceConfig  ModifyInstanceConfigRequest
     * @return ModifyInstanceConfigResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceConfigResponse> modifyInstanceConfig(ModifyInstanceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyInstanceIpWhitelistResponse> modifyInstanceIpWhitelist(ModifyInstanceIpWhitelistRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceIpWhitelist").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceIpWhitelistResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceIpWhitelistResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyInstanceRAGConfig  ModifyInstanceRAGConfigRequest
     * @return ModifyInstanceRAGConfigResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceRAGConfigResponse> modifyInstanceRAGConfig(ModifyInstanceRAGConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceRAGConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceRAGConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceRAGConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyInstanceSSLResponse> modifyInstanceSSL(ModifyInstanceSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyInstanceStorageConfigResponse> modifyInstanceStorageConfig(ModifyInstanceStorageConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceStorageConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceStorageConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceStorageConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyInstancesSSLResponse> modifyInstancesSSL(ModifyInstancesSSLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstancesSSL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstancesSSLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstancesSSLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyMessagesFeedbacks  ModifyMessagesFeedbacksRequest
     * @return ModifyMessagesFeedbacksResponse
     */
    @Override
    public CompletableFuture<ModifyMessagesFeedbacksResponse> modifyMessagesFeedbacks(ModifyMessagesFeedbacksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyMessagesFeedbacks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyMessagesFeedbacksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyMessagesFeedbacksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifySandboxTemplateResponse> modifySandboxTemplate(ModifySandboxTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySandboxTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySandboxTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySandboxTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyScheduledTask  ModifyScheduledTaskRequest
     * @return ModifyScheduledTaskResponse
     */
    @Override
    public CompletableFuture<ModifyScheduledTaskResponse> modifyScheduledTask(ModifyScheduledTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyScheduledTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyScheduledTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyScheduledTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of ModifyWhitelistIps  ModifyWhitelistIpsRequest
     * @return ModifyWhitelistIpsResponse
     */
    @Override
    public CompletableFuture<ModifyWhitelistIpsResponse> modifyWhitelistIps(ModifyWhitelistIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWhitelistIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWhitelistIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWhitelistIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes an exclusion item for a job.</p>
     * 
     * @param request the request parameters of RemoveContextDatabaseSyncJobExclusion  RemoveContextDatabaseSyncJobExclusionRequest
     * @return RemoveContextDatabaseSyncJobExclusionResponse
     */
    @Override
    public CompletableFuture<RemoveContextDatabaseSyncJobExclusionResponse> removeContextDatabaseSyncJobExclusion(RemoveContextDatabaseSyncJobExclusionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveContextDatabaseSyncJobExclusion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveContextDatabaseSyncJobExclusionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveContextDatabaseSyncJobExclusionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of RenameApiKey  RenameApiKeyRequest
     * @return RenameApiKeyResponse
     */
    @Override
    public CompletableFuture<RenameApiKeyResponse> renameApiKey(RenameApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenameApiKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of ResetApiKey  ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    @Override
    public CompletableFuture<ResetApiKeyResponse> resetApiKey(ResetApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetApiKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ResetInstanceKeysResponse> resetInstanceKeys(ResetInstanceKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetInstanceKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetInstanceKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetInstanceKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ResetInstancePasswordResponse> resetInstancePassword(ResetInstancePasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetInstancePassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetInstancePasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetInstancePasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。 重试会基于失败项生成新的 Run，原 Run 状态保持不变。</p>
     * 
     * @param request the request parameters of RetryFailedContextDatabaseSyncRun  RetryFailedContextDatabaseSyncRunRequest
     * @return RetryFailedContextDatabaseSyncRunResponse
     */
    @Override
    public CompletableFuture<RetryFailedContextDatabaseSyncRunResponse> retryFailedContextDatabaseSyncRun(RetryFailedContextDatabaseSyncRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetryFailedContextDatabaseSyncRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryFailedContextDatabaseSyncRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryFailedContextDatabaseSyncRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Revokes an API key.</p>
     * 
     * @param request the request parameters of RevokeContextDatabaseApiKey  RevokeContextDatabaseApiKeyRequest
     * @return RevokeContextDatabaseApiKeyResponse
     */
    @Override
    public CompletableFuture<RevokeContextDatabaseApiKeyResponse> revokeContextDatabaseApiKey(RevokeContextDatabaseApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeContextDatabaseApiKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeContextDatabaseApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeContextDatabaseApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no ClientToken is provided, the backend generates one automatically.</p>
     * 
     * @param request the request parameters of StartContextDatabaseSyncRun  StartContextDatabaseSyncRunRequest
     * @return StartContextDatabaseSyncRunResponse
     */
    @Override
    public CompletableFuture<StartContextDatabaseSyncRunResponse> startContextDatabaseSyncRun(StartContextDatabaseSyncRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartContextDatabaseSyncRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartContextDatabaseSyncRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartContextDatabaseSyncRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no ClientToken is provided, the backend generates one automatically. Discovery is an asynchronous operation. The operation returns a discovery task identifier. Poll for results to retrieve SelectedNodeKeys.</p>
     * 
     * @param request the request parameters of StartContextDatabaseSyncSourceDiscovery  StartContextDatabaseSyncSourceDiscoveryRequest
     * @return StartContextDatabaseSyncSourceDiscoveryResponse
     */
    @Override
    public CompletableFuture<StartContextDatabaseSyncSourceDiscoveryResponse> startContextDatabaseSyncSourceDiscovery(StartContextDatabaseSyncSourceDiscoveryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartContextDatabaseSyncSourceDiscovery").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartContextDatabaseSyncSourceDiscoveryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartContextDatabaseSyncSourceDiscoveryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of UpdateApiKeyQuota  UpdateApiKeyQuotaRequest
     * @return UpdateApiKeyQuotaResponse
     */
    @Override
    public CompletableFuture<UpdateApiKeyQuotaResponse> updateApiKeyQuota(UpdateApiKeyQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateApiKeyQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApiKeyQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApiKeyQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the display metadata of an API key. At least one of Name or Description must be specified. The plaintext key is not reissued.</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseApiKey  UpdateContextDatabaseApiKeyRequest
     * @return UpdateContextDatabaseApiKeyResponse
     */
    @Override
    public CompletableFuture<UpdateContextDatabaseApiKeyResponse> updateContextDatabaseApiKey(UpdateContextDatabaseApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContextDatabaseApiKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContextDatabaseApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContextDatabaseApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the role or status of a member.</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseMember  UpdateContextDatabaseMemberRequest
     * @return UpdateContextDatabaseMemberResponse
     */
    @Override
    public CompletableFuture<UpdateContextDatabaseMemberResponse> updateContextDatabaseMember(UpdateContextDatabaseMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContextDatabaseMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContextDatabaseMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContextDatabaseMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncConnection  UpdateContextDatabaseSyncConnectionRequest
     * @return UpdateContextDatabaseSyncConnectionResponse
     */
    @Override
    public CompletableFuture<UpdateContextDatabaseSyncConnectionResponse> updateContextDatabaseSyncConnection(UpdateContextDatabaseSyncConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContextDatabaseSyncConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContextDatabaseSyncConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContextDatabaseSyncConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncConnectionCredential  UpdateContextDatabaseSyncConnectionCredentialRequest
     * @return UpdateContextDatabaseSyncConnectionCredentialResponse
     */
    @Override
    public CompletableFuture<UpdateContextDatabaseSyncConnectionCredentialResponse> updateContextDatabaseSyncConnectionCredential(UpdateContextDatabaseSyncConnectionCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContextDatabaseSyncConnectionCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContextDatabaseSyncConnectionCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContextDatabaseSyncConnectionCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。 Target 为隐含概念，调用方只需传入 KnowledgeBaseId，后端自动创建/匹配 Target。</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncJob  UpdateContextDatabaseSyncJobRequest
     * @return UpdateContextDatabaseSyncJobResponse
     */
    @Override
    public CompletableFuture<UpdateContextDatabaseSyncJobResponse> updateContextDatabaseSyncJob(UpdateContextDatabaseSyncJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContextDatabaseSyncJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContextDatabaseSyncJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContextDatabaseSyncJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncJobSchedule  UpdateContextDatabaseSyncJobScheduleRequest
     * @return UpdateContextDatabaseSyncJobScheduleResponse
     */
    @Override
    public CompletableFuture<UpdateContextDatabaseSyncJobScheduleResponse> updateContextDatabaseSyncJobSchedule(UpdateContextDatabaseSyncJobScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContextDatabaseSyncJobSchedule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContextDatabaseSyncJobScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContextDatabaseSyncJobScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence via ClientToken. If ClientToken is not provided, the backend generates one automatically.</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncSource  UpdateContextDatabaseSyncSourceRequest
     * @return UpdateContextDatabaseSyncSourceResponse
     */
    @Override
    public CompletableFuture<UpdateContextDatabaseSyncSourceResponse> updateContextDatabaseSyncSource(UpdateContextDatabaseSyncSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContextDatabaseSyncSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContextDatabaseSyncSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContextDatabaseSyncSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For write operations, you can pass the ClientToken parameter to ensure idempotency. If this parameter is not provided, the backend automatically generates one.</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseSyncSourceSelection  UpdateContextDatabaseSyncSourceSelectionRequest
     * @return UpdateContextDatabaseSyncSourceSelectionResponse
     */
    @Override
    public CompletableFuture<UpdateContextDatabaseSyncSourceSelectionResponse> updateContextDatabaseSyncSourceSelection(UpdateContextDatabaseSyncSourceSelectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContextDatabaseSyncSourceSelection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContextDatabaseSyncSourceSelectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContextDatabaseSyncSourceSelectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Modifies the name of a workspace.</p>
     * 
     * @param request the request parameters of UpdateContextDatabaseWorkspace  UpdateContextDatabaseWorkspaceRequest
     * @return UpdateContextDatabaseWorkspaceResponse
     */
    @Override
    public CompletableFuture<UpdateContextDatabaseWorkspaceResponse> updateContextDatabaseWorkspace(UpdateContextDatabaseWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContextDatabaseWorkspace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContextDatabaseWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContextDatabaseWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCustomAgent  UpdateCustomAgentRequest
     * @return UpdateCustomAgentResponse
     */
    @Override
    public CompletableFuture<UpdateCustomAgentResponse> updateCustomAgent(UpdateCustomAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * @param request the request parameters of UpdateMOQuotaAlertThreshold  UpdateMOQuotaAlertThresholdRequest
     * @return UpdateMOQuotaAlertThresholdResponse
     */
    @Override
    public CompletableFuture<UpdateMOQuotaAlertThresholdResponse> updateMOQuotaAlertThreshold(UpdateMOQuotaAlertThresholdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMOQuotaAlertThreshold").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMOQuotaAlertThresholdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMOQuotaAlertThresholdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSkill  UpdateSkillRequest
     * @return UpdateSkillResponse
     */
    @Override
    public CompletableFuture<UpdateSkillResponse> updateSkill(UpdateSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Validates the connection credentials and authorization.</p>
     * 
     * @param request the request parameters of VerifyContextDatabaseSyncConnection  VerifyContextDatabaseSyncConnectionRequest
     * @return VerifyContextDatabaseSyncConnectionResponse
     */
    @Override
    public CompletableFuture<VerifyContextDatabaseSyncConnectionResponse> verifyContextDatabaseSyncConnection(VerifyContextDatabaseSyncConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyContextDatabaseSyncConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyContextDatabaseSyncConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyContextDatabaseSyncConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
