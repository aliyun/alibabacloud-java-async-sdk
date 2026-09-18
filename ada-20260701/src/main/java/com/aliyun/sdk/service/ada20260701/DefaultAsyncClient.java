// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ada20260701.models.*;
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
     * <ul>
     * <li><code>Name</code> is the unique identifier of the Agent within the current tenant. It can contain only letters, digits, underscores, and hyphens, and must be 1 to 128 characters in length. The name cannot be modified after creation.</li>
     * <li>Each Agent can be associated with only one knowledge base.</li>
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
     * <ul>
     * <li>Creation rules:<ul>
     * <li><code>Name</code> must be unique within the current tenant and cannot share a name with an official Skill.</li>
     * <li><code>Description</code> and <code>Metadata</code> are required. <code>Metadata</code> must contain exactly one valid content source. Different sources cannot be mixed.</li>
     * <li>After the Skill is created, you can modify it by calling <code>UpdateSkill</code>.</li>
     * </ul>
     * </li>
     * <li>Content sources:<ul>
     * <li><code>skillMd</code>: Directly provide the Markdown body without a YAML header. Specify the name and description by using <code>Name</code> and <code>Description</code>.</li>
     * <li><code>transitId</code>: Upload and confirm a ZIP file through Transit. Call the operations in the following order:<ol>
     * <li>Call <code>CreateTransitUploadPolicy</code> with <code>FileShowName</code> to obtain <code>TransitId</code>, <code>FilePath</code>, and <code>PolicyInfo</code>.</li>
     * <li>Upload the ZIP file to object storage by using <code>PolicyInfo</code> and <code>FilePath</code>.</li>
     * <li>Call <code>ConfirmTransitUpload</code> with <code>TransitId</code>. Proceed with creation only when the response returns <code>Confirmed=true</code>.</li>
     * <li>Call <code>CreateSkill</code> and pass the confirmed <code>TransitId</code> in <code>Metadata.transitId</code>.</li>
     * </ol>
     * </li>
     * <li><code>bundleUrl</code>: Provide a public HTTPS direct link to a ZIP file. The platform downloads the file and saves it as an Artifact. The original URL is not persisted or returned in responses.</li>
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
     * <li><code>Network</code> can be set to <code>public</code> or <code>internal</code> to generate a public or same-region internal upload address. Default value: <code>public</code>.</li>
     * <li>The maximum size of a single file is 50 MiB.</li>
     * <li><code>PolicyInfo</code> contains short-term upload authorization information intended only for the current file upload. Do not log it, persist it long-term, or forward it to other users.</li>
     * <li><code>ExpireMs</code> controls the validity period of the upload policy and the Transit record, in milliseconds. It is not an absolute timestamp. The default and maximum value is <code>604800000</code> (7 days), and the minimum value is <code>1000</code> (1 second). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds takes effect as 1 second.</li>
     * <li>Call <code>GetTransitMeta</code> and read <code>ExpireAt</code> to obtain the expiration time of the Transit record. Confirming the upload or querying the record does not extend the validity period.</li>
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
     * <li>Creators can delete Agents that they created.</li>
     * <li>After deletion, the Agent can no longer be queried, updated, or run.</li>
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
     * <ul>
     * <li>Deletion permissions:<ul>
     * <li>You can only delete custom Skills that the current caller has permission to modify.</li>
     * <li>The caller must be the Skill creator or the tenant root account that has permission to manage the tenant-level Skill. Official Skills cannot be deleted.</li>
     * </ul>
     * </li>
     * <li>Deletion results:<ul>
     * <li>Deletion uses soft delete. After successful deletion, <code>GetSkill</code> and <code>ListSkills</code> no longer return the Skill, and you can create a new Skill with the same name.</li>
     * <li>Recovery is not supported. You cannot delete a Skill that has already been deleted or does not exist.</li>
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
     * <li>You can retrieve agents that you created, agents visible within the current tenant, and official agents provided by the platform.</li>
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
     * <ul>
     * <li>Query target:<ul>
     * <li>Queries by <code>Name</code>. Querying by <code>SkillId</code> is not supported.</li>
     * <li>Returns the Skill with the matching name that is visible to the current caller under the current tenant first. If no visible record exists, queries the official Skill with the same name.</li>
     * <li>If <code>SkillVersion</code> is omitted, the current Skill is returned. This parameter is omitted by default.</li>
     * </ul>
     * </li>
     * <li>Download URL:<ul>
     * <li><code>Network</code> supports <code>public</code> and <code>internal</code>. If omitted, no download URL is generated.</li>
     * <li>If the Skill has an accessible Artifact, a temporary <code>DownloadUrl</code> and the corresponding <code>DownloadUrlNetwork</code> are returned.</li>
     * <li>If the Artifact does not exist, is inaccessible, or the URL generation fails, the Skill query still succeeds, but download URL-related fields may not be returned.</li>
     * <li>The original <code>bundleUrl</code> used during creation is not stored and is not returned by this operation.</li>
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
     * <li>Specify at least one of <code>TransitId</code> and <code>FilePath</code>. If both are specified, <code>TransitId</code> takes precedence.</li>
     * <li>Use the <code>TransitId</code> returned by <code>CreateTransitUploadPolicy</code> to query the file. <code>TransitId</code> is a temporary capability identifier used during the file upload process. Do not share it with unauthorized users.</li>
     * <li><code>FilePath</code> is an opaque object path returned by <code>CreateTransitUploadPolicy</code>. Use it as-is. Do not parse, modify, or construct it manually.</li>
     * <li>When you query by <code>FilePath</code>, an error is returned if the record does not exist or is not accessible to the caller.</li>
     * <li><code>ExpireMs</code> specifies the validity period of the download URL in milliseconds. Default value: <code>900000</code> (15 minutes). The validity period is rounded down to the nearest whole second. For example, 1500 milliseconds is rounded down to 1 second.</li>
     * <li><code>ExpireAt</code> is the expiration time of the Transit record, not the expiration time of the download URL. Querying, generating a download URL, and confirming the upload do not extend the record validity period.</li>
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
     * <ul>
     * <li>By default, returns official platform agents and tenant agents visible to the current identity.</li>
     * <li>Set <code>Scope=SYSTEM</code> to query only official agents, or <code>Scope=CUSTOM</code> to query only custom agents.</li>
     * <li>Both cursor-based pagination and page number-based pagination are supported. When using cursor-based pagination, pass the <code>NextToken</code> value from the previous response to the next request, and keep the caller identity, filter conditions, and <code>MaxResults</code> unchanged.</li>
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
     * <li>Query and filtering: <ul>
     * <li>Set <code>Scope=SYSTEM</code> to query only official Skills, or <code>Scope=CUSTOM</code> to query only custom Skills. If omitted, both official and custom Skills are queried.</li>
     * <li>Custom Skills with <code>user</code> visibility are visible only to the creator. Skills with <code>tenant</code> visibility are visible to the current tenant.</li>
     * <li>Filtering by <code>CreatorId</code>, <code>Q</code>, and <code>Visibility</code> is supported. <code>Q</code> performs a fuzzy match on the Skill name or description.</li>
     * <li>Results are sorted by update time in descending order by default.</li>
     * </ul>
     * </li>
     * <li>Pagination: <ul>
     * <li>For cursor-based pagination, use <code>MaxResults</code> and <code>NextToken</code>. Do not pass <code>NextToken</code> for the first query. For subsequent pages, use the token returned in the previous response. When using <code>NextToken</code> for subsequent pages, <code>CreatorId</code>, <code>Q</code>, <code>Visibility</code>, <code>Scope</code>, and <code>MaxResults</code> must remain the same as the previous page. If you change the query conditions, start over from the first page.</li>
     * <li>For page-number-based pagination, use <code>PageNumber</code> and <code>PageSize</code>. If <code>MaxResults</code> is explicitly specified, cursor-based pagination takes precedence. If <code>NextToken</code> is specified, <code>PageNumber</code> is ignored.</li>
     * </ul>
     * </li>
     * <li>Response content: <ul>
     * <li>This operation returns only Skill summaries and does not generate Bundle download URLs. To obtain download URLs, call <code>GetSkill</code> and specify <code>Network</code>.</li>
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
     * <li><code>Name</code> is used only to locate the Agent and cannot be modified after creation.</li>
     * <li>Each Agent can be bindded to only one knowledge base.</li>
     * <li><code>Tools</code> is updated according to the rules below. If <code>Skills</code> or <code>KnowledgeBases</code> is not specified, the existing value is retained. A non-empty array replaces the entire value. An empty array removes the corresponding binddings. Other optional fields retain their existing values if not specified.</li>
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
     * <li><code>Name</code> is used only to locate the Skill and cannot be modified.</li>
     * <li>The caller must be the Skill creator or the tenant root account that has permissions to manage the tenant-level Skill.</li>
     * </ul>
     * </li>
     * <li>Replacement rules:<ul>
     * <li><code>Description</code> and <code>Visibility</code> retain their original values when omitted. Passing <code>null</code> is treated the same as omitting the field and cannot be used to clear the original value.</li>
     * <li><code>Metadata</code> is replaced as a whole, not merged incrementally. Omitting <code>Metadata</code> preserves the original content. When provided, any old fields not included in the new object are deleted.</li>
     * <li>When modifying only <code>Description</code> or <code>Visibility</code>, do not pass <code>Metadata</code> or an empty object <code>{}</code>. An empty object replaces the entire original Metadata with an empty value.</li>
     * </ul>
     * </li>
     * <li>Content source:<ul>
     * <li>When replacing the body or bundle, specify exactly one of <code>skillMd</code>, <code>transitId</code>, or <code>bundleUrl</code>.</li>
     * <li>For field formats, the Transit upload confirmation process, and <code>bundleUrl</code> restrictions of the three sources, refer to CreateSkill. Pass the selected source in <code>UpdateSkill.Metadata</code>.</li>
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
