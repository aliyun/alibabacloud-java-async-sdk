// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ada20260701.models.*;
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
        this.product = "Ada";
        this.version = "2026-07-01";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>If Params._meta.promptId is provided, only that turn is canceled. If omitted, the current execution of the session is canceled. To avoid affecting other turns, use the actual promptId obtained from the response stream instead of the request Id.
     * A cancellation receipt does not mean the turn has ended, nor does it revoke external operations that have already occurred. After calling this operation, continue reading the original response stream or resume reading through LoadAgentSession to confirm the desired state of the target turn. Disconnecting the stream connection cannot replace a cancellation request.</p>
     * 
     * @param request the request parameters of CancelAgentSession  CancelAgentSessionRequest
     * @return CancelAgentSessionResponse
     */
    @Override
    public CompletableFuture<CancelAgentSessionResponse> cancelAgentSession(CancelAgentSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelAgentSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelAgentSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><code>Name</code> is the unique identifier of the agent within the current tenant. It can contain only letters, digits, underscores (_), and hyphens (-), and must be 1 to 128 characters in length. It cannot be modified after creation.</li>
     * <li>Each agent can be bound to only one knowledge base.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAgent  CreateAgentRequest
     * @return CreateAgentResponse
     */
    @Override
    public CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, obtain the name of an agent accessible to the current identity. After the session is created, save <code>JsonRpcResponse.result.sessionId</code> and use it as <code>Params.sessionId</code> for subsequent operations such as <code>PromptAgentSession</code> and <code>LoadAgentSession</code>.
     * You can set the approval mode during creation. If omitted, the default value is <code>default</code>. The availability of <code>yolo</code> depends on the target agent. If it is not supported, an error is returned. This mode does not change the caller\&quot;s permissions or replace business Q&amp;A. To retry the same creation request, reuse the same <code>clientToken</code> and the same business parameters.</p>
     * 
     * @param request the request parameters of CreateAgentSession  CreateAgentSessionRequest
     * @return CreateAgentSessionResponse
     */
    @Override
    public CompletableFuture<CreateAgentSessionResponse> createAgentSession(CreateAgentSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Creation rules:<ul>
     * <li>Name must be unique within the current tenant and cannot be the same as an official skill.</li>
     * <li>Description and Metadata are required. Metadata must and can only contain one valid content source. Different sources cannot be mixed.</li>
     * <li>After the skill is created, you can modify it by calling UpdateSkill.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li>skillMd: Directly enter the Markdown body. No YAML front matter is required. Use Name and Description for the name and description respectively.</li>
     * <li>transitId: Upload and confirm a ZIP file through Transit. The call sequence is as follows:<ol>
     * <li>Call CreateTransitUploadPolicy and pass in FileShowName to obtain TransitId, FilePath, and PolicyInfo.</li>
     * <li>Use PolicyInfo and FilePath to upload the ZIP file to Object Storage Service (OSS).</li>
     * <li>Call ConfirmTransitUpload and pass in TransitId. Proceed with creation only if Confirmed=true is returned.</li>
     * <li>Call CreateSkill and pass the confirmed TransitId in Metadata.transitId.</li>
     * </ol>
     * </li>
     * <li>bundleUrl: Pass in a public HTTPS ZIP direct link. The platform downloads and saves it as an artifact. The original URL is not saved or echoed.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateSkill  CreateSkillRequest
     * @return CreateSkillResponse
     */
    @Override
    public CompletableFuture<CreateSkillResponse> createSkill(CreateSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <ul>
     * <li><code>Network</code> can be set to <code>public</code> or <code>internal</code> to generate a public network or same-region internal network upload address, respectively. The default value is <code>public</code>.</li>
     * <li>The maximum size of a single file is 50 MiB.</li>
     * <li><code>PolicyInfo</code> contains short-term upload authorization information and is only used for the current file upload. Do not log, permanently store, or forward it to other users.</li>
     * <li><code>ExpireMs</code> specifies the validity period of the current upload policy and Transit record in milliseconds, not an absolute timestamp. Both the default and maximum values are <code>604800000</code> (7 days), and the minimum value is <code>1000</code> (1 second). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>You can call <code>GetTransitMeta</code> to read <code>ExpireAt</code> and obtain the expiration time of the Transit record. Confirming the upload and querying do not extend the validity period of the record.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitUploadPolicy  CreateTransitUploadPolicyRequest
     * @return CreateTransitUploadPolicyResponse
     */
    @Override
    public CompletableFuture<CreateTransitUploadPolicyResponse> createTransitUploadPolicy(CreateTransitUploadPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitUploadPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitUploadPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitUploadPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Creators can delete the agents they created.</li>
     * <li>After deletion, the agent can no longer be queried, updated, or executed.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    @Override
    public CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A session cannot be directly deleted while it is being executed or waiting for interaction. You must first call <code>CancelAgentSession</code> and continue reading the original response stream, or resume reading through <code>LoadAgentSession</code>. Delete the session only after confirming that the target turn has ended.
     * A successful deletion indicates that the session deletion operation is complete, but it does not mean that external operations that have already occurred are rolled back. Deleting a session does not delete the associated agent or assistant.</p>
     * 
     * @param request the request parameters of DeleteAgentSession  DeleteAgentSessionRequest
     * @return DeleteAgentSessionResponse
     */
    @Override
    public CompletableFuture<DeleteAgentSessionResponse> deleteAgentSession(DeleteAgentSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deletion permissions:<ul>
     * <li>Only custom skills that the caller has permission to modify can be deleted.</li>
     * <li>The caller must be the creator of the skill or the root account of the tenant that has permission to manage the tenant-level skill. Official skills cannot be deleted.</li>
     * </ul>
     * </li>
     * <li>Deletion results:<ul>
     * <li>Deletion is performed as a soft delete. After a successful deletion, <code>GetSkill</code> and <code>ListSkills</code> no longer return the skill, and you can create a new skill with the same name.</li>
     * <li>Recovery is not supported. You cannot repeatedly delete a skill or delete a non-existent skill.</li>
     * </ul>
     * </li>
     * </ul>
     * 
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
     * <ul>
     * <li>You can retrieve agents created by yourself, agents visible within the current tenant, and official agents provided by the platform.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    @Override
    public CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>For <code>Params.sessionId</code>, use the session ID returned by <code>CreateAgentSession</code> or <code>ListAgentSessions</code>. The business result is located in <code>JsonRpcResponse.result</code>, which is of type <code>any</code>. The fields within the object retain their actual casing.
     * This operation provides a session summary and does not return the complete message history, pending interactions, or the final state of real-time turns. For history and disconnection recovery, use <code>LoadAgentSession</code>. For approvals and Q&amp;A, read from the streaming notifications of <code>PromptAgentSession</code> or <code>LoadAgentSession</code>.</p>
     * 
     * @param request the request parameters of GetAgentSession  GetAgentSessionRequest
     * @return GetAgentSessionResponse
     */
    @Override
    public CompletableFuture<GetAgentSessionResponse> getAgentSession(GetAgentSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use the <code>sessionId</code> returned by CreateAgentSession to query the configuration. This operation does not send messages or replay session history.</li>
     * <li>Read the current model from <code>JsonRpcResponse.result.modelId</code>. To modify it, call SetAgentSessionModel.</li>
     * <li>The thinking level is an optional advanced configuration. The supported levels and current values are subject to the actual return values of this operation, which may vary across different agents, models, and sessions.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentSessionModel  GetAgentSessionModelRequest
     * @return GetAgentSessionModelResponse
     */
    @Override
    public CompletableFuture<GetAgentSessionModelResponse> getAgentSessionModel(GetAgentSessionModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentSessionModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSessionModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSessionModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Query target:<ul>
     * <li>Queries by <code>Name</code>. Querying by <code>SkillId</code> is not supported.</li>
     * <li>Prioritizes returning skills with the same name that are visible to the caller under the current tenant. If no visible records are found, queries official skills with the same name.</li>
     * <li>If <code>SkillVersion</code> is omitted, the current skill is returned. This parameter is omitted by default.</li>
     * </ul>
     * </li>
     * <li>Download URL:<ul>
     * <li><code>Network</code> supports <code>public</code> and <code>internal</code>. If omitted, no download URL is generated.</li>
     * <li>If the skill has an accessible artifact, a temporary <code>DownloadUrl</code> and the corresponding <code>DownloadUrlNetwork</code> are returned.</li>
     * <li>If the artifact does not exist, access is denied, or URL generation fails, the skill query can still succeed, but the download URL-related fields may not be returned.</li>
     * <li>The original <code>bundleUrl</code> used during creation is not saved and is not returned by this API.</li>
     * </ul>
     * </li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>Specify at least one of TransitId and FilePath. If both are provided, TransitId takes precedence.</li>
     * <li>Use the TransitId returned by CreateTransitUploadPolicy for queries. TransitId is a temporary capability identifier in the file upload process. Do not forward it to irrelevant users.</li>
     * <li>FilePath is the opaque object path returned by CreateTransitUploadPolicy. Callers must use it as is and must not parse, modify, or concatenate it.</li>
     * <li>When querying by FilePath, an error is returned if the record does not exist or is inaccessible to the current caller.</li>
     * <li>ExpireMs specifies the validity period of the download URL in milliseconds. The default value is 900000 (15 minutes). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>ExpireAt indicates the expiration time of the transit record, not the expiration time of the download URL. Querying, generating a download URL, and confirming an upload do not extend the validity period of the record.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTransitMeta  GetTransitMetaRequest
     * @return GetTransitMetaResponse
     */
    @Override
    public CompletableFuture<GetTransitMetaResponse> getTransitMeta(GetTransitMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTransitMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTransitMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTransitMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can filter sessions by agent name. Omit Params.NextToken on the first page. For subsequent queries, keep the filter conditions and page size unchanged, and pass the JsonRpcResponse.Result.NextToken returned from the previous page as is to Params.NextToken. Pagination ends when the token is not returned or is empty.
     * The list returns session summaries such as session ID, title, and time, but does not provide the final state of the turn execution. After selecting a session, you can use GetAgentSession to query details or LoadAgentSession to load history.
     * Params in the request, and JsonRpcResponse and Result in the response are explicit objects. The pagination field MaxResults is of type integer<int32>, and NextToken is of type string. SessionList retains the any type. For session summary fields, see the supplementary description.</p>
     * 
     * @param request the request parameters of ListAgentSessions  ListAgentSessionsRequest
     * @return ListAgentSessionsResponse
     */
    @Override
    public CompletableFuture<ListAgentSessionsResponse> listAgentSessions(ListAgentSessionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentSessions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentSessionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentSessionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>By default, the official agents provided by the platform and the tenant agents visible to the current identity are returned.</li>
     * <li>If <code>Scope</code> is set to <code>SYSTEM</code>, only official agents are queried. If <code>Scope</code> is set to <code>CUSTOM</code>, only custom agents are queried.</li>
     * <li>Both cursor-based pagination and page number-based pagination are supported. When using cursor-based pagination, pass the <code>NextToken</code> value returned in the previous response to the next request as is, and keep the calling identity, filter conditions, and <code>MaxResults</code> unchanged.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    @Override
    public CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For text sessions, pass <code>ModelType=text</code> and use <code>MaxResults</code> and <code>NextToken</code> for paging. The model identity is obtained from <code>Models[].Id</code> and passed as the <code>Params.modelId</code> for SetAgentSessionModel.</li>
     * <li>The visibility of a model in the model catalog does not guarantee that the target session supports the model. After configuration, refer to the SetAgentSessionModel response or the GetAgentSessionModel query result.</li>
     * <li><code>ThinkingLevels</code> and <code>ThinkingLevel</code> are used for optional thinking level configurations and do not affect the integration flow when you only select a model.</li>
     * </ul>
     * 
     * @param request the request parameters of ListModels  ListModelsRequest
     * @return ListModelsResponse
     */
    @Override
    public CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListModels").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Query and filter: <ul>
     * <li><code>Scope=SYSTEM</code> queries only official skills, and <code>Scope=CUSTOM</code> queries only custom skills. If omitted, both are queried.</li>
     * <li>Custom skills with <code>user</code> visibility are visible only to the creator, while skills with <code>tenant</code> visibility are visible to the current tenant.</li>
     * <li>You can filter by <code>CreatorId</code>, <code>Q</code>, and <code>Visibility</code>. <code>Q</code> performs a fuzzy match on the skill name or description.</li>
     * <li>Results are sorted by update time in descending order by default.</li>
     * </ul>
     * </li>
     * <li>Pagination: <ul>
     * <li>Cursor-based pagination uses <code>MaxResults</code> and <code>NextToken</code>. Do not pass <code>NextToken</code> for the first query. For subsequent pages, use the token from the previous response. When using <code>NextToken</code> for subsequent pages, <code>CreatorId</code>, <code>Q</code>, <code>Visibility</code>, <code>Scope</code>, and <code>MaxResults</code> must remain the same as the previous page. If you modify the query conditions, you must query from the first page again.</li>
     * <li>Page number-based pagination uses <code>PageNumber</code> and <code>PageSize</code>. If <code>MaxResults</code> is explicitly passed, cursor-based pagination takes precedence. If <code>NextToken</code> is passed, <code>PageNumber</code> is ignored.</li>
     * </ul>
     * </li>
     * <li>Response content: <ul>
     * <li>This operation returns only skill summaries and does not generate bundle download URLs. To obtain a download URL, call <code>GetSkill</code> and specify <code>Network</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    @Override
    public CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkills").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A normal load requires only the session ID. It returns the configuration, history, and output to be continuously received. The response is SSE, not a standard JSON message list.</li>
     * <li>When resuming from a disconnection, pass back the actually received cursor, event epoch, and turn ID. History and increments may be returned simultaneously. Existing pages should be rebuilt or deduplicated based on the confirmed cursor. Do not directly append all returned data.</li>
     * <li>During the load process, you may receive pending approvals or questions again. Use the interaction notification that is still valid for this session to call ReplyAgentSession.</li>
     * <li>For an idle session, <code>stopReason=end_turn</code> may only indicate the end of the current load. It cannot be used to determine the success of a previously interrupted turn. You must associate it with the actual desired state of the target turn. If it cannot be determined, keep the result for verification.</li>
     * </ul>
     * 
     * @param request the request parameters of LoadAgentSession  LoadAgentSessionRequest
     * @return LoadAgentSessionResponse
     */
    @Override
    public CompletableFuture<LoadAgentSessionResponse> loadAgentSession(LoadAgentSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LoadAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LoadAgentSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LoadAgentSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<LoadAgentSessionResponseBody> loadAgentSessionWithResponseIterable(LoadAgentSessionRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("LoadAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        LoadAgentSessionResponseBodyIterator iterator = LoadAgentSessionResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Pass the session ID returned by CreateAgentSession to <code>Params.sessionId</code> and place the user text in <code>Params.prompt</code>.</li>
     * <li>When an execution or pending interaction is already in progress, the default call path rejects new prompts. After receiving an approval or Q&amp;A notification, submit the selection or answer through ReplyAgentSession before continuing to read the original stream.</li>
     * <li>A connection interruption does not cancel the execution. If the result is unknown, call LoadAgentSession to resume reading. Submitting duplicate prompts may generate new messages, and duplicate <code>Id</code> values are not deduplicated.</li>
     * </ul>
     * 
     * @param request the request parameters of PromptAgentSession  PromptAgentSessionRequest
     * @return PromptAgentSessionResponse
     */
    @Override
    public CompletableFuture<PromptAgentSessionResponse> promptAgentSession(PromptAgentSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PromptAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PromptAgentSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PromptAgentSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<PromptAgentSessionResponseBody> promptAgentSessionWithResponseIterable(PromptAgentSessionRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("PromptAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        PromptAgentSessionResponseBodyIterator iterator = PromptAgentSessionResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Read <code>data.sessionId</code>, <code>data.requestId</code>, and <code>data.options</code> from the <code>permission_request</code> notification of PromptAgentSession or LoadAgentSession. This operation uses the interaction ID, not the tool invoke ID or the server-side RequestId.</li>
     * <li>When selecting an action, use the <code>optionId</code> actually provided in the notification. For Q&amp;A scenarios, you must also write the question key and answer text into <code>answers</code>. Do not pass this field for common tool approvals.</li>
     * <li><code>accepted=true</code> only indicates that the reply has been accepted. Subsequent output must still be read through Prompt or Load. <code>false</code> indicates that the reply was not adopted this time. You should reload the current interaction and must not automatically change it to approve other requests.</li>
     * </ul>
     * 
     * @param request the request parameters of ReplyAgentSession  ReplyAgentSessionRequest
     * @return ReplyAgentSessionResponse
     */
    @Override
    public CompletableFuture<ReplyAgentSessionResponse> replyAgentSession(ReplyAgentSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReplyAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplyAgentSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplyAgentSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Pass the <code>sessionId</code> returned by CreateAgentSession and the <code>Models[].Id</code> returned by ListModels as <code>Params.sessionId</code> and <code>Params.modelId</code>, respectively. The visibility of a model in the model catalog does not guarantee that the target session supports the model. The final validation is performed by the target session.</li>
     * <li><code>modelId</code> is required. When only modifying the model, you can omit <code>thinkingLevel</code>. For details about how to configure the thinking level, see the supplementary description of request parameters.</li>
     * <li>This operation only modifies the target session and does not modify the global default model of the agent or account. The session may deny configuration modifications during execution, and switching models during runtime is not guaranteed to be supported.</li>
     * <li>The model and thinking level Settings are applied in steps. If the call fails, the model may have already been changed, and a full rollback is not guaranteed. You should call GetAgentSessionModel to query the current configuration before deciding what to do next. After a successful call, you can read the actual effective values from the returned result.</li>
     * </ul>
     * 
     * @param request the request parameters of SetAgentSessionModel  SetAgentSessionModelRequest
     * @return SetAgentSessionModelResponse
     */
    @Override
    public CompletableFuture<SetAgentSessionModelResponse> setAgentSessionModel(SetAgentSessionModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAgentSessionModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAgentSessionModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAgentSessionModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><code>Name</code> is used only to locate the agent and cannot be modified after creation.</li>
     * <li>Each agent can be bound to only one knowledge base.</li>
     * <li><code>Tools</code> is updated according to the rules below. If <code>Skills</code> or <code>KnowledgeBases</code> is not passed, the original values are retained. If a non-empty array is passed, the entire list is replaced. If an empty array is passed, the corresponding bindings are removed. Other optional fields retain their original values if not passed.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAgent  UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    @Override
    public CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Update rules:<ul>
     * <li>Name is only used to locate the skill and cannot be modified.</li>
     * <li>The caller must be the creator of the skill, or the root account of the tenant that has the permission to manage the tenant-level skill.</li>
     * </ul>
     * </li>
     * <li>Replacement rules:<ul>
     * <li>If Description and Visibility are omitted, their original values are retained. Passing <code>null</code> is also treated as omission and cannot be used to clear the original values.</li>
     * <li>Metadata is replaced as a whole, not merged incrementally. If Metadata is omitted, the original content is retained. If it is passed, old fields not included in the new object are deleted.</li>
     * <li>When modifying only Description or Visibility, do not pass Metadata, and do not pass an empty object <code>{}</code>. An empty object replaces the original metadata with an empty object as a whole.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li>When replacing the body or bundle, you must and can only choose one of skillMd, transitId, or bundleUrl.</li>
     * <li>For the field formats of the three sources, the Transit upload confirmation process, and the bundleUrl restrictions, refer to CreateSkill. Finally, pass the selected source in UpdateSkill.Metadata.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSkill  UpdateSkillRequest
     * @return UpdateSkillResponse
     */
    @Override
    public CompletableFuture<UpdateSkillResponse> updateSkill(UpdateSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
