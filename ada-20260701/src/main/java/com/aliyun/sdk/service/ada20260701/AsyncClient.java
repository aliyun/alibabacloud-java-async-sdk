// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ada20260701.models.*;
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
     * <p>If <code>Params._meta.promptId</code> is provided, only that turn is canceled. If omitted, the current execution of the session is canceled. To avoid affecting other turns, use the actual <code>promptId</code> obtained from the response stream instead of the request <code>Id</code>. A cancellation receipt does not mean the turn has ended, nor does it revoke external operations that have already occurred. After calling this operation, continue reading the original response stream or resume reading through <code>LoadAgentSession</code> to confirm the desired state of the target turn. Disconnecting the stream connection cannot replace a cancellation request.</p>
     * 
     * @param request the request parameters of CancelAgentSession  CancelAgentSessionRequest
     * @return CancelAgentSessionResponse
     */
    CompletableFuture<CancelAgentSessionResponse> cancelAgentSession(CancelAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Name is the unique identifier of the agent within the current tenant. It can contain only letters, digits, underscores, and hyphens, and must be 1 to 128 characters in length. It cannot be modified after creation.</li>
     * <li>Each agent can be bound to only one knowledge base.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAgent  CreateAgentRequest
     * @return CreateAgentResponse
     */
    CompletableFuture<CreateAgentResponse> createAgent(CreateAgentRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, obtain the name of an agent accessible to the current identity. After the session is created, save <code>JsonRpcResponse.result.sessionId</code> and use it as <code>Params.sessionId</code> for subsequent operations such as <code>PromptAgentSession</code> and <code>LoadAgentSession</code>.
     * You can set the approval mode during creation. If omitted, the mode defaults to <code>default</code>. The availability of <code>yolo</code> depends on the target agent. If it is not supported, an error is returned. This mode does not change the caller\&quot;s permissions or replace business Q&amp;A. To retry the same creation request, reuse the same <code>clientToken</code> and the same business parameters.</p>
     * 
     * @param request the request parameters of CreateAgentSession  CreateAgentSessionRequest
     * @return CreateAgentSessionResponse
     */
    CompletableFuture<CreateAgentSessionResponse> createAgentSession(CreateAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Creation rules:<ul>
     * <li><code>Name</code> must be unique within the current tenant and cannot be the same as an official skill.</li>
     * <li><code>Description</code> and <code>Metadata</code> are required. <code>Metadata</code> must contain one and only one valid content source. Different sources cannot be mixed.</li>
     * <li>After the skill is created, you can modify it by calling <code>UpdateSkill</code>.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li><code>skillMd</code>: Directly enter the Markdown body. No YAML front matter is required. Use <code>Name</code> and <code>Description</code> for the name and description.</li>
     * <li><code>transitId</code>: Upload and confirm a ZIP file through Transit. The call sequence is as follows:<ol>
     * <li>Call <code>CreateTransitUploadPolicy</code> and pass in <code>FileShowName</code> to obtain <code>TransitId</code>, <code>FilePath</code>, and <code>PolicyInfo</code>.</li>
     * <li>Use <code>PolicyInfo</code> and <code>FilePath</code> to upload the ZIP file to Object Storage Service (OSS).</li>
     * <li>Call <code>ConfirmTransitUpload</code> and pass in <code>TransitId</code>. Proceed with creation only if <code>Confirmed=true</code> is returned.</li>
     * <li>Call <code>CreateSkill</code> and pass the confirmed <code>TransitId</code> in <code>Metadata.transitId</code>.</li>
     * </ol>
     * </li>
     * <li><code>bundleUrl</code>: Pass in a public HTTPS ZIP direct link. The platform downloads the file and saves it as an artifact. The original URL is not saved or echoed.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateSkill  CreateSkillRequest
     * @return CreateSkillResponse
     */
    CompletableFuture<CreateSkillResponse> createSkill(CreateSkillRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The Network parameter can be set to public or internal to generate a public network or same-region internal network upload address, respectively. The default value is public.</li>
     * <li>The maximum size of a single file is 50 MiB.</li>
     * <li>PolicyInfo contains short-term upload authorization information and is only used for the current file upload. Do not log, permanently store, or forward it to other users.</li>
     * <li>ExpireMs specifies the validity period of the upload policy and the transit record in milliseconds, not an absolute timestamp. The default and maximum values are both 604800000 (7 days), and the minimum value is 1000 (1 second). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>You can call GetTransitMeta to read ExpireAt and obtain the expiration time of the transit record. Confirming the upload and querying the record do not extend its validity period.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitUploadPolicy  CreateTransitUploadPolicyRequest
     * @return CreateTransitUploadPolicyResponse
     */
    CompletableFuture<CreateTransitUploadPolicyResponse> createTransitUploadPolicy(CreateTransitUploadPolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Creators can delete the agents they created.</li>
     * <li>After deletion, the agent can no longer be queried, updated, or run.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request);

    /**
     * <b>description</b> :
     * <p>A session cannot be directly deleted while it is being executed or waiting for interaction. You must first call <code>CancelAgentSession</code> and continue reading the original response stream, or resume reading through <code>LoadAgentSession</code>. Delete the session only after confirming that the target turn has ended.
     * A successful deletion indicates that the session deletion operation is complete, but it does not mean that external operations that have already occurred are rolled back. Deleting a session does not delete the associated agent or assistant.</p>
     * 
     * @param request the request parameters of DeleteAgentSession  DeleteAgentSessionRequest
     * @return DeleteAgentSessionResponse
     */
    CompletableFuture<DeleteAgentSessionResponse> deleteAgentSession(DeleteAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deletion permissions:<ul>
     * <li>You can delete only custom skills that you have permission to modify.</li>
     * <li>You must be the creator of the skill or the root account of the tenant that has permission to manage the tenant-level skill. Official skills cannot be deleted.</li>
     * </ul>
     * </li>
     * <li>Deletion results:<ul>
     * <li>This operation performs a soft delete. After the skill is deleted, the <code>GetSkill</code> and <code>ListSkills</code> operations no longer return the skill, and you can create a new skill with the same name.</li>
     * <li>Recovery is not supported. You cannot delete a skill multiple times or delete a non-existent skill.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSkill  DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    CompletableFuture<DeleteSkillResponse> deleteSkill(DeleteSkillRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can retrieve agents created by yourself, agents visible within the current tenant, and official agents provided by the platform.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request);

    /**
     * <b>description</b> :
     * <p>For <code>Params.sessionId</code>, use the session ID returned by <code>CreateAgentSession</code> or <code>ListAgentSessions</code>. The business result is located in <code>JsonRpcResponse.result</code>, which is of type <code>any</code>. The fields within the object retain their actual casing.
     * This operation provides a session summary and does not return the complete message history, pending interactions, or the final state of real-time turns. For history and disconnection recovery, use <code>LoadAgentSession</code>. For approvals and Q&amp;A, read from the streaming notifications of <code>PromptAgentSession</code> or <code>LoadAgentSession</code>.</p>
     * 
     * @param request the request parameters of GetAgentSession  GetAgentSessionRequest
     * @return GetAgentSessionResponse
     */
    CompletableFuture<GetAgentSessionResponse> getAgentSession(GetAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use the <code>sessionId</code> returned by CreateAgentSession to query the configurations. This operation does not send messages or replay session history.</li>
     * <li>Read the current model from <code>JsonRpcResponse.result.modelId</code>. To modify it, call SetAgentSessionModel.</li>
     * <li>The thinking level is an optional advanced configuration. The supported levels and current values are subject to the actual response of this operation, which may vary across different agents, models, and sessions.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentSessionModel  GetAgentSessionModelRequest
     * @return GetAgentSessionModelResponse
     */
    CompletableFuture<GetAgentSessionModelResponse> getAgentSessionModel(GetAgentSessionModelRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Query target:<ul>
     * <li>Queries by <code>Name</code>. Querying by <code>SkillId</code> is not supported.</li>
     * <li>Prioritizes returning skills with the same name that are visible to the caller under the current tenant. If no visible records are found, it queries official skills with the same name.</li>
     * <li>If <code>SkillVersion</code> is omitted, the current skill is returned. This parameter is omitted by default.</li>
     * </ul>
     * </li>
     * <li>Download URL:<ul>
     * <li><code>Network</code> supports <code>public</code> and <code>internal</code>. If omitted, no download URL is generated.</li>
     * <li>If the skill has an accessible artifact, a temporary <code>DownloadUrl</code> and the corresponding <code>DownloadUrlNetwork</code> are returned.</li>
     * <li>If the artifact does not exist, access is denied, or URL generation fails, the skill query still succeeds, but the download URL-related fields may not be returned.</li>
     * <li>The original <code>bundleUrl</code> used during creation is not saved and will not be echoed back through this API.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetSkill  GetSkillRequest
     * @return GetSkillResponse
     */
    CompletableFuture<GetSkillResponse> getSkill(GetSkillRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Specify at least one of TransitId and FilePath. If both are provided, TransitId takes precedence.</li>
     * <li>Use the TransitId returned by CreateTransitUploadPolicy. TransitId is a temporary capability identifier in the file upload process. Do not forward it to unrelated users.</li>
     * <li>FilePath is the opaque object path returned by CreateTransitUploadPolicy. Callers must use it as is. Do not parse, modify, or concatenate it.</li>
     * <li>When you query by FilePath, an error is returned if the record does not exist or is inaccessible to the current caller.</li>
     * <li>ExpireMs specifies the validity period of the download URL in milliseconds. The default value is 900000, which indicates 15 minutes. The validity period is rounded down to the nearest second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>ExpireAt is the expiration time of the transit record, not the expiration time of the download URL. Querying, generating a download URL, and confirming the upload do not extend the validity period of the record.</li>
     * </ul>
     * 
     * @param request the request parameters of GetTransitMeta  GetTransitMetaRequest
     * @return GetTransitMetaResponse
     */
    CompletableFuture<GetTransitMetaResponse> getTransitMeta(GetTransitMetaRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the global workflow configurations for a tenant and a region. The content is sensitive information. In addition to the permissions required for this operation, the ada:DownloadFile permission is also required.</p>
     * 
     * @param request the request parameters of GetWorkflowGlobalEnv  GetWorkflowGlobalEnvRequest
     * @return GetWorkflowGlobalEnvResponse
     */
    CompletableFuture<GetWorkflowGlobalEnvResponse> getWorkflowGlobalEnv(GetWorkflowGlobalEnvRequest request);

    /**
     * <b>description</b> :
     * <p>You can filter sessions by agent name. Omit Params.NextToken on the first page. When querying subsequent pages, keep the filter conditions and page size unchanged, and pass the JsonRpcResponse.Result.NextToken returned from the previous page as is to Params.NextToken. Pagination ends when the token is not returned or is empty.
     * The list returns session summaries such as session ID, title, and time, but does not provide the final state of turn execution. After selecting a session, you can use GetAgentSession to query details or LoadAgentSession to load history.
     * Params in the request, and JsonRpcResponse and Result in the response are explicit objects. The pagination field MaxResults is of type integer<int32>, and NextToken is of type string. SessionList retains the any type. For session summary fields, see the supplementary description.</p>
     * 
     * @param request the request parameters of ListAgentSessions  ListAgentSessionsRequest
     * @return ListAgentSessionsResponse
     */
    CompletableFuture<ListAgentSessionsResponse> listAgentSessions(ListAgentSessionsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>By default, the API returns the official agents provided by the platform and the tenant agents visible to the current identity.</li>
     * <li>If Scope is set to SYSTEM, only official agents are queried. If Scope is set to CUSTOM, only custom agents are queried.</li>
     * <li>Supports both cursor-based pagination and page number-based pagination. When using cursor-based pagination, pass the NextToken value exactly as returned in the next request, and keep the calling identity, filter conditions, and MaxResults unchanged.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For text sessions, pass <code>ModelType=text</code> and use <code>MaxResults</code> and <code>NextToken</code> for paging. Obtain the model identifier from <code>Models[].Id</code> and pass it as <code>Params.modelId</code> to SetAgentSessionModel.</li>
     * <li>Visibility in the model catalog does not mean the target session supports the model. After setting the model, refer to the return value of SetAgentSessionModel or the query result of GetAgentSessionModel.</li>
     * <li><code>ThinkingLevels</code> and <code>ThinkingLevel</code> are used for optional thinking level configurations and do not affect the integration flow for selecting a model only.</li>
     * </ul>
     * 
     * @param request the request parameters of ListModels  ListModelsRequest
     * @return ListModelsResponse
     */
    CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Query and filter: <ul>
     * <li><code>Scope=SYSTEM</code> queries only official skills, and <code>Scope=CUSTOM</code> queries only custom skills. If omitted, both are queried.</li>
     * <li>Custom skills with <code>user</code> visibility are visible only to the creator, while skills with <code>tenant</code> visibility are visible to the current tenant.</li>
     * <li>Supports filtering by <code>CreatorId</code>, <code>Q</code>, and <code>Visibility</code>. <code>Q</code> performs a fuzzy match on the skill name or description.</li>
     * <li>Results are sorted by update time in descending order by default.</li>
     * </ul>
     * </li>
     * <li>Pagination: <ul>
     * <li>Cursor-based pagination uses <code>MaxResults</code> and <code>NextToken</code>. Do not pass <code>NextToken</code> for the first query. For subsequent pages, use the token from the previous response. When using <code>NextToken</code> for subsequent pages, <code>CreatorId</code>, <code>Q</code>, <code>Visibility</code>, <code>Scope</code>, and <code>MaxResults</code> must remain the same as the previous page. If you modify the query conditions, you must restart the query from the first page.</li>
     * <li>Page number-based pagination uses <code>PageNumber</code> and <code>PageSize</code>. If <code>MaxResults</code> is explicitly passed, cursor-based pagination takes precedence. If <code>NextToken</code> is passed, <code>PageNumber</code> is ignored.</li>
     * </ul>
     * </li>
     * <li>Returned content: <ul>
     * <li>This operation returns only skill summaries and does not generate bundle download URLs. To obtain a download URL, call <code>GetSkill</code> and specify <code>Network</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>A standard load requires only the session ID. It returns the configuration, history, and output to be continuously received. The response is SSE, not a standard JSON message list.</li>
     * <li>When resuming from a stream interruption, pass back the actually received cursor, event epoch, and turn ID. History and incremental data may be returned simultaneously. Existing pages should be rebuilt or deduplicated based on the confirmed cursor. Do not directly append all returned data.</li>
     * <li>During the load process, you may receive pending approvals or questions again. Use the interaction notification that is still valid for this session to call ReplyAgentSession.</li>
     * <li>For an idle session, <code>stopReason=end_turn</code> may only indicate the end of the current load. It cannot be used to determine the success of a previously interrupted turn. You must associate it with the actual desired state of the target turn. If it cannot be determined, keep the result for verification.</li>
     * </ul>
     * 
     * @param request the request parameters of LoadAgentSession  LoadAgentSessionRequest
     * @return LoadAgentSessionResponse
     */
    CompletableFuture<LoadAgentSessionResponse> loadAgentSession(LoadAgentSessionRequest request);

    ResponseIterable<LoadAgentSessionResponseBody> loadAgentSessionWithResponseIterable(LoadAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Pass the session ID returned by CreateAgentSession to Params.sessionId and place the user text in Params.prompt.</li>
     * <li>When an execution or pending interaction is already in progress, the default call path rejects new prompts. After receiving an approval or Q&amp;A notification, submit your choice or answer through ReplyAgentSession before continuing to read the original stream.</li>
     * <li>A connection interruption does not cancel the execution. If the result is unknown, call LoadAgentSession to resume reading. Submitting duplicate prompts may generate new messages, and duplicate Id values are not deduplicated.</li>
     * </ul>
     * 
     * @param request the request parameters of PromptAgentSession  PromptAgentSessionRequest
     * @return PromptAgentSessionResponse
     */
    CompletableFuture<PromptAgentSessionResponse> promptAgentSession(PromptAgentSessionRequest request);

    ResponseIterable<PromptAgentSessionResponseBody> promptAgentSessionWithResponseIterable(PromptAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Read <code>data.sessionId</code>, <code>data.requestId</code>, and <code>data.options</code> from the <code>permission_request</code> notification of PromptAgentSession or LoadAgentSession. This operation uses the interaction ID, not the tool invocation ID or the server-side RequestId.</li>
     * <li>When selecting an action, use the <code>optionId</code> actually provided in the notification. For Q&amp;A scenarios, you must also write the question key and answer text into <code>answers</code>. Do not pass this field for regular tool approvals.</li>
     * <li><code>accepted=true</code> only indicates that the reply has been accepted. Subsequent output is still read through Prompt/Load. <code>false</code> indicates that the reply is not adopted this time. You should reload the current interaction and not automatically change to approve other requests.</li>
     * </ul>
     * 
     * @param request the request parameters of ReplyAgentSession  ReplyAgentSessionRequest
     * @return ReplyAgentSessionResponse
     */
    CompletableFuture<ReplyAgentSessionResponse> replyAgentSession(ReplyAgentSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Saves or queries the global workflow configuration by tenant and region. The content is sensitive information.</p>
     * 
     * @param request the request parameters of SaveWorkflowGlobalEnv  SaveWorkflowGlobalEnvRequest
     * @return SaveWorkflowGlobalEnvResponse
     */
    CompletableFuture<SaveWorkflowGlobalEnvResponse> saveWorkflowGlobalEnv(SaveWorkflowGlobalEnvRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Pass the <code>sessionId</code> returned by CreateAgentSession and the <code>Models[].Id</code> returned by ListModels as <code>Params.sessionId</code> and <code>Params.modelId</code>, respectively. The visibility of a model in the model catalog does not mean that the target session supports the model. The final validation is performed by the target session.</li>
     * <li><code>modelId</code> is required. When you only modify the model, you can omit <code>thinkingLevel</code>. For more information about how to configure the thinking level, see the supplementary description of request parameters.</li>
     * <li>This operation only modifies the target session and does not modify the global default model of the agent or account. The session may deny configuration modifications during execution, and switching during runtime is not guaranteed to be supported.</li>
     * <li>The model and thinking level settings are applied step by step. If the call fails, the model may have already been changed, and an overall rollback is not guaranteed. You should call GetAgentSessionModel to query the current configuration before deciding on subsequent operations. After a successful call, you can read the actual effective values from the returned result.</li>
     * </ul>
     * 
     * @param request the request parameters of SetAgentSessionModel  SetAgentSessionModelRequest
     * @return SetAgentSessionModelResponse
     */
    CompletableFuture<SetAgentSessionModelResponse> setAgentSessionModel(SetAgentSessionModelRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><code>Name</code> is used only to locate the agent and cannot be modified after creation.</li>
     * <li>Each agent can be bound to only one knowledge base.</li>
     * <li><code>Tools</code> is updated according to the rules below. If <code>Skills</code> or <code>KnowledgeBases</code> is not passed, the original value is retained. If a non-empty array is passed, it replaces the original value entirely. If an empty array is passed, the corresponding binding is removed. Other optional fields retain their original values if not passed.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAgent  UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    CompletableFuture<UpdateAgentResponse> updateAgent(UpdateAgentRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Update rules:<ul>
     * <li><code>Name</code> is used only to locate the skill and cannot be modified.</li>
     * <li>The caller must be the creator of the skill or the root account of the tenant that has permissions to manage the tenant-level skill.</li>
     * </ul>
     * </li>
     * <li>Replacement rules:<ul>
     * <li>If <code>Description</code> and <code>Visibility</code> are omitted, their original values are retained. Passing <code>null</code> is treated as omission and cannot be used to clear the original values.</li>
     * <li><code>Metadata</code> is replaced as a whole, not merged incrementally. If <code>Metadata</code> is omitted, the original content is retained. If it is passed, old fields not included in the new object are deleted.</li>
     * <li>When modifying only <code>Description</code> or <code>Visibility</code>, do not pass <code>Metadata</code> or an empty object <code>{}</code>. An empty object replaces the original metadata with an empty object.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li>When replacing the body or bundle, you must choose one and only one of <code>skillMd</code>, <code>transitId</code>, or <code>bundleUrl</code>.</li>
     * <li>For the field formats of the three sources, the Transit upload confirmation process, and the <code>bundleUrl</code> restrictions, refer to CreateSkill. Pass the selected source in <code>UpdateSkill.Metadata</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSkill  UpdateSkillRequest
     * @return UpdateSkillResponse
     */
    CompletableFuture<UpdateSkillResponse> updateSkill(UpdateSkillRequest request);

}
