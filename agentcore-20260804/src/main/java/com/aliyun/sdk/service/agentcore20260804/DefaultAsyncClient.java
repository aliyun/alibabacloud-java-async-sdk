// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.agentcore20260804.models.*;
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
        this.product = "AgentCore";
        this.version = "2026-08-04";
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
     * <p>Writes messages or text to a memory store to fetch long-term memory to retrieve and use later.</p>
     * <ul>
     * <li>If <code>sync</code> is omitted or set to <code>true</code>: waits for the fetch to complete and returns <code>memories</code>. Returns an empty array if no memories are fetched.</li>
     * <li>If <code>sync</code> is set to <code>false</code>: returns a <code>taskId</code>. You can query the fetch progress and results by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMemoryTask">GetMemoryTask</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AddMemories  AddMemoriesRequest
     * @return AddMemoriesResponse
     */
    @Override
    public CompletableFuture<AddMemoriesResponse> addMemories(AddMemoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddMemories").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}/memories").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMemoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMemoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes multiple models in a specified workspace. If any model is in use, the entire batch request fails.</p>
     * 
     * @param request the request parameters of BatchDeleteModels  BatchDeleteModelsRequest
     * @return BatchDeleteModelsResponse
     */
    @Override
    public CompletableFuture<BatchDeleteModelsResponse> batchDeleteModels(BatchDeleteModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchDeleteModels").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/models/actions/batch-delete").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Imports multiple skill ZIP packages that have been uploaded to OSS into a workspace in batches, and returns the processing result for each skill.
     * OSS is used here to temporarily store the ZIP packages to be imported. First, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetSkillImportFileUrl">GetSkillImportFileUrl</a> to obtain the upload URL and upload the files, and then call this operation. To check the package content and name conflicts in advance, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrecheckSkillUploadViaOss">PrecheckSkillUploadViaOss</a>.</p>
     * 
     * @param request the request parameters of BatchUploadSkillsViaOss  BatchUploadSkillsViaOssRequest
     * @return BatchUploadSkillsViaOssResponse
     */
    @Override
    public CompletableFuture<BatchUploadSkillsViaOssResponse> batchUploadSkillsViaOss(BatchUploadSkillsViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchUploadSkillsViaOss").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skill-actions/batch-upload-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUploadSkillsViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUploadSkillsViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Converts an MCP server installed from a marketplace template to free-edit mode so that you can directly modify the server configuration. After the conversion, the original source and tag information is retained, and the template editing restrictions are removed. The server no longer appears on the use case page associated with the template.</p>
     * 
     * @param request the request parameters of ConvertMcpToFreeEdit  ConvertMcpToFreeEditRequest
     * @return ConvertMcpToFreeEditResponse
     */
    @Override
    public CompletableFuture<ConvertMcpToFreeEditResponse> convertMcpToFreeEdit(ConvertMcpToFreeEditRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ConvertMcpToFreeEdit").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/mcp-servers/{mcpServerId}/convert-to-free-edit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConvertMcpToFreeEditResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConvertMcpToFreeEditResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an IM channel for an agent to route messages from instant messaging platforms to the agent.
     * During creation, a publicly accessible service endpoint (<code>ServiceEndpoint</code>) is bound to the channel. After the channel is created, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentIMChannel">GetAgentIMChannel</a> to query its configuration and status.</p>
     * 
     * @param request the request parameters of CreateAgentIMChannel  CreateAgentIMChannelRequest
     * @return CreateAgentIMChannelResponse
     */
    @Override
    public CompletableFuture<CreateAgentIMChannelResponse> createAgentIMChannel(CreateAgentIMChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentIMChannel").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentIMChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentIMChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an agent template (AgentSpec) and generates the first draft version for editing reusable agent configurations. The creation fails if a template with the same name already exists in the same workspace. After creation, you can query the template and version information by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentSpec">GetAgentSpec</a>.</p>
     * 
     * @param request the request parameters of CreateAgentSpec  CreateAgentSpecRequest
     * @return CreateAgentSpecResponse
     */
    @Override
    public CompletableFuture<CreateAgentSpecResponse> createAgentSpec(CreateAgentSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentSpec").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-specs").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a new draft version for an existing agent template (AgentSpec) to modify and publish the next version of the configuration.
     * The template must already exist and must not have a draft currently being edited.</p>
     * 
     * @param request the request parameters of CreateAgentSpecVersion  CreateAgentSpecVersionRequest
     * @return CreateAgentSpecVersionResponse
     */
    @Override
    public CompletableFuture<CreateAgentSpecVersionResponse> createAgentSpecVersion(CreateAgentSpecVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentSpecVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/versions").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentSpecVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentSpecVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>将指定托管智能体或自定义智能体当前已生效的配置保存为一个不可变的固定版本，并归档版本模板与制品。仅保存版本，不部署实例。其他类型的智能体（如外部智能体）不支持版本，返回 AgentVersionSubtypeUnsupported。Agent 最新发布必须已生效（latestSpecVersion 等于 effectiveSpecVersion）。系统按 Agent 递增生成版本号 agentVersion（v1、v2……），版本号在 Agent 内唯一且已删除版本的序号不复用，查询、删除版本及服务端点引用版本均使用该版本号。每个 Agent 最多保留 50 个未删除的版本，达到上限时返回 AgentVersionQuotaExceeded，删除不再使用的版本后可继续保存。versionName 相同且发布流水号相同的重复提交返回已有版本（不受上限限制）；versionName 相同但发布流水号不同时返回 AgentVersionAlreadyExists。</p>
     * 
     * @param request the request parameters of CreateAgentVersion  CreateAgentVersionRequest
     * @return CreateAgentVersionResponse
     */
    @Override
    public CompletableFuture<CreateAgentVersionResponse> createAgentVersion(CreateAgentVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an apiKey or mcpHeader credential in a workspace for agents or MCP to access external services.</p>
     * <h3>Credential types</h3>
     * <ul>
     * <li><code>apiKey</code>: <code>credentialMetadata</code> is a JSON string that contains only a non-empty <code>apiKey</code>. Do not submit <code>resourceScope</code> and <code>resourceRefs</code>.</li>
     * <li><code>mcpHeader</code>: <code>credentialMetadata</code> is a JSON string that contains a non-empty <code>headers</code> array. Each item contains a non-empty <code>name</code> and <code>value</code> to configure MCP request headers.</li>
     * </ul>
     * <h3>MCP header scope</h3>
     * <p>You must specify <code>resourceScope</code> when creating an <code>mcpHeader</code> credential:</p>
     * <ul>
     * <li><code>ALL</code>: Applies to all MCP services. Omit <code>resourceRefs</code>.</li>
     * <li><code>SPECIFIED</code>: Applies to specified MCP services. <code>resourceRefs</code> must be a non-empty array. For each item, set <code>resourceType=mcpServer</code> and specify <code>resourceId</code>.</li>
     * </ul>
     * <h3>Subsequent queries</h3>
     * <p>Use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCredential">GetCredential</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListCredentials">ListCredentials</a> to query credentials. For <code>apiKey</code>, a masked value is returned. For <code>mcpHeader</code>, only header names are returned, and header values are not returned.</p>
     * 
     * @param request the request parameters of CreateCredential  CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    @Override
    public CompletableFuture<CreateCredentialResponse> createCredential(CreateCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCredential").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/credentials").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deploys a user-provided code package or container image as an agent in a workspace. This corresponds to the &quot;Custom Code / Image&quot; creation method in the console.</p>
     * <h3>Preparations</h3>
     * <p>Prepare a writable workspace and submit name, roleArn, artifact, and runtime. In runtime, specify both compute and sessionPolicy. roleArn is the RAM role used by the agent to access your cloud resources.</p>
     * <h3>Select a deployment method</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Deployment method</th>
     * <th>Required configurations</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>ACR image</td>
     * <td>artifact.port, and type=acr, instanceId, namespace, repo, and tag in artifact.container.</td>
     * </tr>
     * <tr>
     * <td>Custom image</td>
     * <td>artifact.port, artifact.container.type=custom, and the complete customImage. The clientToken query parameter is required.</td>
     * </tr>
     * <tr>
     * <td>Code package</td>
     * <td>artifact.port, and sourceUri, languageRuntime, and entrypoint in artifact.code.</td>
     * </tr>
     * <tr>
     * <td>artifact.code and artifact.container are mutually exclusive. The service listening port ranges from 1 to 65535. You can specify a startup command for a container image by using artifact.container.entrypoint. If this parameter is omitted, the default startup method of the image is used.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Code package</h3>
     * <ul>
     * <li>ZIP and TAR.GZ formats are supported. The compressed package size ranges from 1 to 500,000,000 bytes. Dependencies must be included in the package. The platform does not install dependencies or perform online builds.</li>
     * <li>Invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListAgentCodeRuntimes">ListAgentCodeRuntimes</a> to query the currently active <code>languageRuntime</code>.</li>
     * <li>For local files, first invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageUploadUrl">GetAgentCodePackageUploadUrl</a> and upload the file directly by using the upload method, URL, and request headers returned in the response. Then, commit <code>sourceUri</code>.</li>
     * <li><code>sourceUri</code> supports <code>oss://</code> URLs or HTTPS object URLs of standard OSS public domain names, including signed URLs. Private OSS objects must allow the workspace role to read them. You can first invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageOssRamAuthorizeUrl">GetAgentCodePackageOssRamAuthorizeUrl</a> to complete the authorization.</li>
     * <li>Read permissions, objects, and sizes are checked upon commit, and a fixed copy is saved. If the transfer failed, the agent configuration is not created. Archive integrity and decompression are checked when the instance starts.</li>
     * <li><code>entrypoint</code> is the startup command executed in the <code>/code</code> folder, such as <code>python main.py</code>. The command does not automatically execute shell pipelines or expand environment variables. For complex startup logic, write a script in the package.
     * Sample request body for a code package (the runtime environment is subject to the query result):</li>
     * </ul>
     * <pre><code class="language-json">{
     *   &quot;name&quot;: &quot;code-agent&quot;,
     *   &quot;roleArn&quot;: &quot;acs:ram::1234567890123456:role/AgentRuntimeRole&quot;,
     *   &quot;artifact&quot;: {
     *     &quot;port&quot;: 8000,
     *     &quot;code&quot;: {
     *       &quot;sourceUri&quot;: &quot;oss://example-code-bucket/releases/agent.zip&quot;,
     *       &quot;languageRuntime&quot;: &quot;python3.12&quot;,
     *       &quot;entrypoint&quot;: &quot;python main.py&quot;
     *     }
     *   },
     *   &quot;runtime&quot;: {
     *     &quot;compute&quot;: {
     *       &quot;computeClass&quot;: &quot;STANDARD&quot;
     *     },
     *     &quot;sessionPolicy&quot;: {
     *       &quot;type&quot;: &quot;AFFINITY&quot;
     *     }
     *   }
     * }
     * </code></pre>
     * <h3>Custom image</h3>
     * <p>Specify the complete image address in customImage.image. Tags or digests are supported. Do not include protocols or user information. Configure the image pull network separately in customImage.pullNetwork:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Pull method</th>
     * <th>Configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Internet</td>
     * <td>type=public. Do not specify VPC fields.</td>
     * </tr>
     * <tr>
     * <td>VPC</td>
     * <td>type=vpc. Specify vpcId, vSwitchId, and securityGroupId.</td>
     * </tr>
     * <tr>
     * <td>If repository authentication is required, specify both customImage.username and customImage.password. For anonymous access, omit both. The password is not returned in the response. The image pull network and the agent runtime network are configured separately.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>useImageCache=true applies only to ACR images. For custom images and code packages, set this parameter to false or omit it.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Runtime configurations</h3>
     * <p>Omitted fields in runtime.hpa use the following default values:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Valid values and description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>enabled</td>
     * <td>false</td>
     * <td>Specifies whether to enable elastic scaling.</td>
     * </tr>
     * <tr>
     * <td>minSandboxCount</td>
     * <td>1</td>
     * <td>The minimum number of instances. Valid values: 0 to 100.</td>
     * </tr>
     * <tr>
     * <td>maxSandboxCount</td>
     * <td>10</td>
     * <td>The maximum number of instances. Valid values: 0 to 100. The value cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td>maxConcurrentSessionsPerSandbox</td>
     * <td>20</td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td>sessionTtlSeconds</td>
     * <td>600</td>
     * <td>The maximum idle time of a session, in seconds. Valid values: 60 to 86400.</td>
     * </tr>
     * <tr>
     * <td>If sessionPolicy.type=ISOLATED_HEADER_FIELD, you must provide a valid HTTP request header name in headerName. Do not specify this field for other policies.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>If network is omitted, the default access policy on the agent side is used. Actual access is still restricted by the workspace network. When submitting access items, specify the corresponding enabled field.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The total number of items in ossMounts and agenticFsMounts cannot exceed 10. The mount target mountPath must be an absolute path in the container, such as /data/train. It cannot conflict with platform reserved directories, be duplicated, or form parent-child directory overrides.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>File mounts are used to allow the agent to access persistent data. When using AgenticFS, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAgenticFsMountRamAuthorizeUrl">GetWorkspaceAgenticFsMountRamAuthorizeUrl</a> to complete the access point authorization first.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The path for an OSS mount must be a non-empty directory prefix in the bucket. The server for an AgenticFS mount is the access point domain name, without a protocol, port, or path. The path must be an existing non-empty relative directory in the access point. You cannot mount the root directory of the access point. If readOnly is omitted, the default value is false.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Environment variable names must be non-empty and unique in the list. Values must be strings, and empty strings are allowed. When configuring healthCheck, you must specify port. Omitting the health check means no health check is configured. When configuring logging.sls, specify both non-empty project and logstore.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Query results and retries</h3>
     * <p>A successful response indicates that the request is accepted. Save the agentId and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a>. Check latestVersionStatus, latestExecutionError, status, and sandboxPhaseCounts to confirm the configuration processing and instance status.
     * The clientToken query parameter is required for custom image submissions, and optional for ACR image and code package submissions. The token must be 1 to 128 characters in length and can contain letters, digits, periods, underscores, colons, and hyphens. Reuse the original token to retry the same submission. If the parameters are the same, the existing acceptance result is returned. Use a new token for different submission content.</p>
     * 
     * @param request the request parameters of CreateCustomAgent  CreateCustomAgentRequest
     * @return CreateCustomAgentResponse
     */
    @Override
    public CompletableFuture<CreateCustomAgentResponse> createCustomAgent(CreateCustomAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCustomAgent").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/custom-agents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Registers an agent hosted in the user\&quot;s runtime environment, which corresponds to the &quot;Managed Agent&quot; in the console. After registration, you can continue to obtain the bootstrap information and complete the connection.</p>
     * <h3>Configure a managed agent</h3>
     * <p>Provide name, and select the configuration based on the model source:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>modelSource</th>
     * <th>Model configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>PLATFORM</td>
     * <td>Uses a platform model. Provide model.modelConnectionId and model.modelName.</td>
     * </tr>
     * <tr>
     * <td>RUNTIME</td>
     * <td>The model is managed by the external runtime environment. Do not submit model.</td>
     * </tr>
     * <tr>
     * <td>If modelSource is omitted but model is provided, it is processed as PLATFORM. If both are omitted, the agent cannot be created.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Configure instructions, MCP tools, and skills through instruction, tools, and skills. You can also reference an agent template through template.aiRegistry. The external process is deployed by the caller. This operation does not create a platform runtime instance.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Bootstrap sequence</h3>
     * <p><strong>Step 1:</strong> After creation, save the agentId and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a> to query the configuration processing result.
     * <strong>Step 2:</strong> After the latest configuration takes effect, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgentBootstrapOptions">GetExternalAgentBootstrapOptions</a> to obtain the available bootstrap networks.
     * <strong>Step 3:</strong> Select an available network and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateExternalAgentBootstrapToken">CreateExternalAgentBootstrapToken</a> to obtain the bootstrap token and CMS configuration. The external process then completes the bootstrap.
     * clientToken is a reserved query parameter and currently does not provide idempotency guarantees.</p>
     * 
     * @param request the request parameters of CreateExternalAgent  CreateExternalAgentRequest
     * @return CreateExternalAgentResponse
     */
    @Override
    public CompletableFuture<CreateExternalAgentResponse> createExternalAgent(CreateExternalAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExternalAgent").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/external-agents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExternalAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExternalAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Issues an access token and connection configurations for a registered managed agent whose configurations have taken effect to complete the onboarding in the runtime environment where the agent resides.</p>
     * <h3>Prerequisites and parameters</h3>
     * <p>The managed agent must be in the running state, and its latest configurations must have taken effect. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgentBootstrapOptions">GetExternalAgentBootstrapOptions</a> first to query available networks.
     * The <code>networkType</code> parameter is passed as a query parameter. Valid values: <code>INTRANET</code> (internal network) and <code>INTERNET</code> (Internet). The selected endpoint must be available.</p>
     * <h3>Use the response</h3>
     * <p>Pass the <code>bootstrapToken</code> to the external runtime process to complete the onboarding. The <code>tokenFingerprint</code> is used to identify the token and cannot be used as a substitute for the token. The <code>cms</code> field contains the observability reporting configurations for the corresponding network. Configure the endpoint, workspace, and license key as provided in the response.</p>
     * 
     * @param request the request parameters of CreateExternalAgentBootstrapToken  CreateExternalAgentBootstrapTokenRequest
     * @return CreateExternalAgentBootstrapTokenResponse
     */
    @Override
    public CompletableFuture<CreateExternalAgentBootstrapTokenResponse> createExternalAgentBootstrapToken(CreateExternalAgentBootstrapTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateExternalAgentBootstrapToken").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/external-agents/{agentId}/bootstrap/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExternalAgentBootstrapTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExternalAgentBootstrapTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Integrates an enterprise identity source with a workspace to allow application users to log on with enterprise accounts, or to synchronize users from the enterprise address book to the workspace.
     * DingTalk, Lark, and custom identity sources (CustomSSO) are supported. A workspace can be bound to only one identity source. To change the integration method, you must unbind the current identity source first.</p>
     * <h3>Select an integration method</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Integration method</th>
     * <th>Scenario</th>
     * <th>Task completed by this operation</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>DingTalk or Lark</td>
     * <td>The enterprise already uses DingTalk or Lark and wants to integrate enterprise accounts and the address book.</td>
     * <td>Saves the enterprise application credentials and establishes a binding for subsequent logon and address book synchronization configuration.</td>
     * </tr>
     * <tr>
     * <td>Custom identity source (CustomSSO)</td>
     * <td>The enterprise wants to integrate its own identity authentication and user management system.</td>
     * <td>Creates a shared user pool to prepare for subsequent SAML single sign-on (SSO) and SCIM user synchronization configuration.</td>
     * </tr>
     * <tr>
     * <td>A user pool stores application users and identity integration configurations. SAML handles enterprise account logon. SCIM provisions users from the enterprise identity system to the user pool. You can configure these two capabilities separately.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Bind DingTalk or Lark</h3>
     * <p>Specify the enterprise application credentials in metadata. DingTalk requires appKey, appSecret, and corpId. Lark requires appId and appSecret.
     * Logon is enabled by default. A user synchronization task is executed by default upon the first binding. If you want to select departments before synchronization, set syncOnBind to false.
     * Subsequent address book change synchronization is controlled by syncEnabled, which is disabled by default. When enabled, you must also provide encryptKey and verificationToken.</p>
     * <h3>Bind a custom identity source</h3>
     * <p>When you create a CustomSSO binding, you only need to specify the identity source type:</p>
     * <pre><code class="language-http">POST /workspaces/{workspaceId}/identity-providers
     * {&quot;identityProviderType&quot;:&quot;CustomSSO&quot;}
     * </code></pre>
     * <p>This call only creates a user pool. Logon and user synchronization are disabled by default. Do not specify metadata, loginEnabled, or syncEnabled during creation.
     * After creation, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to query the progress. If WAITING_CONFIGURATION is returned, the user pool is created and you can proceed with the integration configuration:</p>
     * <ul>
     * <li><strong>Integrate enterprise account logon</strong>: Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a> to obtain the SAML integration information of AgentCore and configure it in the enterprise identity system. Then, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a> to save the SAML configuration of the enterprise identity system and enable logon as needed.</li>
     * <li><strong>Integrate user synchronization</strong>: Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to obtain the SCIM receiving endpoint and credentials, and configure them in the enterprise identity system. After the external configuration is complete, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a> to enable AgentCore user synchronization.
     * The two processes are independent. You can select one or both based on your business requirements.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIdentityProvider  CreateIdentityProviderRequest
     * @return CreateIdentityProviderResponse
     */
    @Override
    public CompletableFuture<CreateIdentityProviderResponse> createIdentityProvider(CreateIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIdentityProvider").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/identity-providers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIdentityProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIdentityProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a SCIM access token to authorize an enterprise identity system to send user provisioning requests to AgentCore. For example, when you plan to replace the token used by the enterprise identity system, you can create a new token first and revoke the old token after the switchover is complete.
     * SCIM is a user provisioning protocol through which an enterprise identity system sends user information by using a receiving endpoint and an access token.</p>
     * <h3>Before you begin</h3>
     * <p>A <code>CustomSSO</code> binding is created, and the SCIM receiving endpoint is enabled by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a>.
     * A maximum of two SCIM credentials can be retained in the same user pool. When the limit is reached, query existing credentials by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderSCIMCredentials">ListIdentityProviderSCIMCredentials</a> and revoke the credentials that are no longer in use.</p>
     * <h3>What to do next</h3>
     * <p><strong>Step 1:</strong> Save the plaintext of the <code>token</code> in the response. The token is returned only upon creation. You can only query the credential summary later.
     * <strong>Step 2:</strong> Configure the receiving endpoint and the new token in the enterprise identity system.
     * <strong>Step 3:</strong> After you confirm that the enterprise identity system uses the new token, revoke the old token by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/DeleteIdentityProviderSCIMCredential">DeleteIdentityProviderSCIMCredential</a> as needed.
     * If the creation response is lost, query the credential list to verify the creation result to avoid duplicate creation and occupying the credential quota. The user synchronization switch is configured separately by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</p>
     * 
     * @param request the request parameters of CreateIdentityProviderSCIMCredential  CreateIdentityProviderSCIMCredentialRequest
     * @return CreateIdentityProviderSCIMCredentialResponse
     */
    @Override
    public CompletableFuture<CreateIdentityProviderSCIMCredentialResponse> createIdentityProviderSCIMCredential(CreateIdentityProviderSCIMCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIdentityProviderSCIMCredential").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/scim-provisioning/credentials").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIdentityProviderSCIMCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIdentityProviderSCIMCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Synchronizes users from an enterprise identity provider to a workspace based on the saved department scope. This is suitable for importing users for the first time or manually updating workspace users after adjusting the synchronization scope.</p>
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>The identity provider is configured and its status is <code>READY</code>. If the previous synchronization failed and the status is <code>SYNC_FAILED</code>, you can also re-initiate it.</li>
     * <li>The user pool is ready, and no identity provider operations are in progress.</li>
     * <li>Manual synchronization uses the saved <code>syncScope</code>. You do not need to enable <code>syncEnabled</code>, which is used for subsequent address book change synchronization.</li>
     * </ul>
     * <h3>Steps for synchronizing by department</h3>
     * <p><strong>Step 1:</strong> Query departments by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderDepartments">ListIdentityProviderDepartments</a> and select the scope to synchronize.
     * <strong>Step 2:</strong> Save the <code>syncScope</code> by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a>, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to wait for the configuration processing to complete.
     * <strong>Step 3:</strong> Call this operation to initiate the synchronization and save the returned <code>taskId</code>.
     * <strong>Step 4:</strong> Query the progress by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSyncJob">GetIdentityProviderSyncJob</a>. After the synchronization is complete, view the workspace user list.
     * If you want to select departments before the initial synchronization, set <code>syncOnBind=false</code> when creating the identity provider, and then perform the preceding steps.</p>
     * <h3>Synchronization results and re-execution</h3>
     * <p>Synchronization is subject to the maximum number of users allowed in the workspace. Narrowing the synchronization scope does not actively delete users that have already been synchronized.
     * Each successful initiation creates a new synchronization task. If a request times out or the response is lost, check the identity provider status by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> before deciding whether to resubmit the request.</p>
     * 
     * @param request the request parameters of CreateIdentityProviderSyncJob  CreateIdentityProviderSyncJobRequest
     * @return CreateIdentityProviderSyncJobResponse
     */
    @Override
    public CompletableFuture<CreateIdentityProviderSyncJobResponse> createIdentityProviderSyncJob(CreateIdentityProviderSyncJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIdentityProviderSyncJob").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}/sync-jobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIdentityProviderSyncJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIdentityProviderSyncJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Pre-builds or reuses an ACR Enterprise Edition image cache for custom code or image agents for subsequent deployment and startup.</p>
     * <h3>Request parameters</h3>
     * <p><code>regionId</code>, <code>workspaceId</code>, and <code>clientToken</code> are passed as query parameters. The region must match the entry endpoint and the workspace.
     * Specify <code>acrInstanceId</code>, <code>namespace</code>, <code>repository</code>, and <code>tag</code> in the JSON request body. For <code>repository</code>, specify only the repository name without repeating the namespace. The source repository must have pull authorization for the workspace resource role. You can obtain the authorization URL by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAcrRamAuthorizeUrl">GetWorkspaceAcrRamAuthorizeUrl</a>.</p>
     * <h3>Transfer network</h3>
     * <p>Both <code>accessInternet</code> and <code>accessVpc</code> must be provided, and at least one must be set to <code>true</code>. The server validates this based on the workspace network conditions. These parameters control the source reading and transfer for the current operation and do not modify the runtime network of the agent.</p>
     * <h3>Acceptance and readiness</h3>
     * <p>A successful response returns the current cache snapshot. <code>PENDING</code> indicates that the cache is being prepared, <code>READY</code> indicates that the cache is ready, and <code>FAILED</code> indicates a failure. For failures, check the <code>error</code> field. Save the <code>imageId</code> and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a> to query subsequent results. If the image digest has not been parsed, <code>digest</code> may be empty.
     * Currently, <code>clientToken</code> is only validated to ensure it is not empty. It does not guarantee deduplication by identifier or recovery of the original acceptance result. If the result is not confirmed, query the existing cache first.</p>
     * 
     * @param request the request parameters of CreateImageCache  CreateImageCacheRequest
     * @return CreateImageCacheResponse
     */
    @Override
    public CompletableFuture<CreateImageCacheResponse> createImageCache(CreateImageCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateImageCache").setMethod(HttpMethod.POST).setPathRegex("/image-caches").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an agent by using a platform-managed runtime framework. This corresponds to the &quot;Managed Harness&quot; creation method in the console, where you can configure the model, instructions, and skills.</p>
     * <h3>Required configurations</h3>
     * <p>Submit name, model, and runtime. The runtime parameter must include both compute and sessionPolicy. The agent is deployed and run by the platform, so you do not need to provide a code package or container image.</p>
     * <h3>Harness and model</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Harness</th>
     * <th>Model and connector configurations</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>qwenpaw</td>
     * <td>If you omit harness during creation, this type is used by default. Set model.modelConnectionId to the workspace model connection ID, and set model.modelName to the name of the model created under this connection.</td>
     * </tr>
     * <tr>
     * <td>qodercli</td>
     * <td>The qodercli connector must be enabled in the workspace. Set model.modelConnectionId to the model identifier returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectorModels">ListConnectorModels</a>. You can omit model.modelName.</td>
     * </tr>
     * <tr>
     * <td>harness is an object, such as {&quot;type&quot;:&quot;qwenpaw&quot;}. For qodercli, set harness.configuration.connectorServiceAccountKey to the account key record ID returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectors">ListConnectors</a>, not the original service account key. You can omit this parameter if only one key record exists. If multiple records exist, you must specify this parameter. connectorServiceAccountName is the account name. Do not specify these two binding fields for qwenpaw.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The harness type cannot be changed after creation.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Instructions, templates, and skills</h3>
     * <p>skills uses the skill names in the workspace AI registry. If sourceType=REFERENCE, the version is referenced by versionSelector: use LABEL with a label name, or VERSION with a specific version number. If the selector is omitted, LABEL/latest is used. If sourceType=STATIC, static files bundled with the package are used, and no version selector is provided.
     * For template.aiRegistry, specify the agent template name and an optional version. If you omit the version during creation, the published version is resolved and fixed. When a template is used, instruction, promptVariables, and subAgents are derived from the template, and the corresponding fields in the current request do not take effect. Explicit skills and template skills are recorded separately. You can query the target and effective versions by using configuredSkills and skills.
     * If you do not use a template, you can set instructions by using instruction, declare variables by using promptVariables, and configure up to 20 sub-agents by using subAgents. The name and instruction of a sub-agent cannot be empty. Each sub-agent name must be unique. Tools currently use tools[].type=MCP.</p>
     * <h3>Runtime configurations and mounts</h3>
     * <p>Omitted fields in runtime.hpa use the following default values:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Valid values and description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>enabled</td>
     * <td>false</td>
     * <td>Specifies whether to enable elastic scaling.</td>
     * </tr>
     * <tr>
     * <td>minSandboxCount</td>
     * <td>1</td>
     * <td>The minimum number of instances. Valid values: 0 to 100.</td>
     * </tr>
     * <tr>
     * <td>maxSandboxCount</td>
     * <td>10</td>
     * <td>The maximum number of instances. Valid values: 0 to 100. The value cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td>maxConcurrentSessionsPerSandbox</td>
     * <td>20</td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td>sessionTtlSeconds</td>
     * <td>600</td>
     * <td>The maximum idle time of a session, in seconds. Valid values: 60 to 86400.</td>
     * </tr>
     * <tr>
     * <td>If sessionPolicy.type=ISOLATED_HEADER_FIELD, you must provide headerName. Do not specify this parameter for other policies.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>If you provide network, you must specify both accessInternet.enabled and accessVpc.enabled. Actual access is restricted by the workspace network configurations.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The total number of ossMounts and agenticFsMounts cannot exceed 10. The mount target mountPath uses an absolute path in the container, such as /data/train. The path cannot conflict with platform-reserved directories, and cannot be duplicated or form parent-child directory overwrites.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>File mounts are used to allow the agent to access persistent data. When you use AgenticFS, you can first complete the access point authorization by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAgenticFsMountRamAuthorizeUrl">GetWorkspaceAgenticFsMountRamAuthorizeUrl</a>.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>The path for an OSS mount must be a non-empty directory prefix in the bucket. The server for an AgenticFS mount is the access point domain name, without a protocol, port, or path. The path is an existing non-empty relative directory in the access point. You cannot mount the root directory of the access point. If readOnly is omitted, the default value is false.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>environment.variables configures environment variables, and environment.credentialReferences references workspace credentials. Environment variable names must be non-empty and unique, and values must be strings.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Query deployment results</h3>
     * <p>A successful response indicates that the request is accepted. Save the agentId and use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a> to query latestVersionStatus, status, and sandboxPhaseCounts to confirm the configuration processing and instance status. clientToken is a reserved query parameter and currently does not provide idempotence guarantees.</p>
     * 
     * @param request the request parameters of CreateManagedAgent  CreateManagedAgentRequest
     * @return CreateManagedAgentResponse
     */
    @Override
    public CompletableFuture<CreateManagedAgentResponse> createManagedAgent(CreateManagedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateManagedAgent").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/managed-agents").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateManagedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateManagedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an MCP service in a workspace for agents to use the tools provided by the service.
     * The creation process is executed asynchronously. After you submit the request, call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a> operation to check whether the service is ready.
     * To deploy the service by using a local code package, first call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcpCodePackageUploadUrl">GetMcpCodePackageUploadUrl</a> operation to obtain the upload URL and upload the file. Then, fill in the returned code package token in the deployment configuration.
     * The <code>clientToken</code> parameter does not provide idempotency guarantees. If the request result is not confirmed, query existing services before you decide whether to recreate the service.</p>
     * 
     * @param request the request parameters of CreateMcp  CreateMcpRequest
     * @return CreateMcpResponse
     */
    @Override
    public CompletableFuture<CreateMcpResponse> createMcp(CreateMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMcp").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/mcp-servers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMcpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMcpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a long-term memory store (MemoryStore) in a workspace to organize the long-term memories of an agent and their source sessions.
     * After creation, you can write messages or text by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/AddMemories">AddMemories</a> and retrieve memories by semantics by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/SearchMemories">SearchMemories</a>.</p>
     * 
     * @param request the request parameters of CreateMemoryStore  CreateMemoryStoreRequest
     * @return CreateMemoryStoreResponse
     */
    @Override
    public CompletableFuture<CreateMemoryStoreResponse> createMemoryStore(CreateMemoryStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMemoryStore").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/memorystores").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMemoryStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMemoryStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a model configuration under a model connection in a workspace for model creation, allowing an agent to select and invoke the model.</p>
     * 
     * @param request the request parameters of CreateModel  CreateModelRequest
     * @return CreateModelResponse
     */
    @Override
    public CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModel").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/models").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a model connection in a specified workspace and configures the upstream model service address, invoke protocol, and access credentials for model creation.</p>
     * 
     * @param request the request parameters of CreateModelConnection  CreateModelConnectionRequest
     * @return CreateModelConnectionResponse
     */
    @Override
    public CompletableFuture<CreateModelConnectionResponse> createModelConnection(CreateModelConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateModelConnection").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/model-connections").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates access rules in batches for specified resources in a workspace to define which users or agents can or cannot access the resources.</p>
     * 
     * @param request the request parameters of CreatePermissionRules  CreatePermissionRulesRequest
     * @return CreatePermissionRulesResponse
     */
    @Override
    public CompletableFuture<CreatePermissionRulesResponse> createPermissionRules(CreatePermissionRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePermissionRules").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/permission-rules").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePermissionRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePermissionRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a skill and its draft in a workspace for editing skill instructions and related resources. You can derive the draft from an existing version, or specify a target version and a commit message.</p>
     * 
     * @param request the request parameters of CreateSkillDraft  CreateSkillDraftRequest
     * @return CreateSkillDraftResponse
     */
    @Override
    public CompletableFuture<CreateSkillDraftResponse> createSkillDraft(CreateSkillDraftRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSkillDraft").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSkillDraftResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSkillDraftResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a team in a specified workspace and configures user members and agent members at the same time.</p>
     * 
     * @param request the request parameters of CreateTeam  CreateTeamRequest
     * @return CreateTeamResponse
     */
    @Override
    public CompletableFuture<CreateTeamResponse> createTeam(CreateTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTeam").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/teams").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a user in a workspace for member collaboration and application access, which is used when configuring team members and user logons.</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    @Override
    public CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateUser").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/users").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an AgentCore workspace as a resource scope for organizing agents, models, Model Context Protocol (MCP) services, and collaboration configurations.
     * After the workspace is created, you can use the returned workspace ID to call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspace">GetWorkspace</a> to query the details, and then manage agents and associated resources in the workspace. For network configuration fields and their dependencies, see the request parameters table.</p>
     * 
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    @Override
    public CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkspace").setMethod(HttpMethod.POST).setPathRegex("/workspaces").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Invokes a specified model through a published model connection to verify whether the model invocation pipeline is available.</p>
     * 
     * @param request the request parameters of DebugModel  DebugModelRequest
     * @return DebugModelResponse
     */
    @Override
    public CompletableFuture<DebugModelResponse> debugModel(DebugModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DebugModel").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/models/{modelId}/actions/debug").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DebugModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DebugModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified access application and removes the access configuration of the application from the workspace.</p>
     * 
     * @param request the request parameters of DeleteAccessApplication  DeleteAccessApplicationRequest
     * @return DeleteAccessApplicationResponse
     */
    @Override
    public CompletableFuture<DeleteAccessApplicationResponse> deleteAccessApplication(DeleteAccessApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAccessApplication").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/access-applications/{applicationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccessApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccessApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes the IM channel of a specified agent.</p>
     * 
     * @param request the request parameters of DeleteAgentIMChannel  DeleteAgentIMChannelRequest
     * @return DeleteAgentIMChannelResponse
     */
    @Override
    public CompletableFuture<DeleteAgentIMChannelResponse> deleteAgentIMChannel(DeleteAgentIMChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentIMChannel").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels/{imChannelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentIMChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentIMChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes the specified agent template and all its versions and metadata.
     * This operation is irreversible.</p>
     * 
     * @param request the request parameters of DeleteAgentSpec  DeleteAgentSpecRequest
     * @return DeleteAgentSpecResponse
     */
    @Override
    public CompletableFuture<DeleteAgentSpecResponse> deleteAgentSpec(DeleteAgentSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentSpec").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes the draft version of the agent template (AgentSpec) that is currently being edited.</p>
     * 
     * @param request the request parameters of DeleteAgentSpecVersion  DeleteAgentSpecVersionRequest
     * @return DeleteAgentSpecVersionResponse
     */
    @Override
    public CompletableFuture<DeleteAgentSpecVersionResponse> deleteAgentSpecVersion(DeleteAgentSpecVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentSpecVersion").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/draft").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentSpecVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentSpecVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>删除指定托管智能体或自定义智能体已保存的固定版本。仍被服务端点引用的版本不可删除，系统维护的 latest 版本不可删除。</p>
     * 
     * @param request the request parameters of DeleteAgentVersion  DeleteAgentVersionRequest
     * @return DeleteAgentVersionResponse
     */
    @Override
    public CompletableFuture<DeleteAgentVersionResponse> deleteAgentVersion(DeleteAgentVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentVersion").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/versions/{agentVersion}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes an access credential that is no longer used in a workspace.
     * If the credential is still bound to an MCP service, dissociate it before deletion.</p>
     * 
     * @param request the request parameters of DeleteCredential  DeleteCredentialRequest
     * @return DeleteCredentialResponse
     */
    @Override
    public CompletableFuture<DeleteCredentialResponse> deleteCredential(DeleteCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCredential").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/credentials/{credentialId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a custom code or image agent in a specified workspace and asynchronously cleans up its associated platform resources.</p>
     * <h3>Before you begin</h3>
     * <p>The workspace must be writable. If the agent is still associated with a team, dissociate it from the team first.</p>
     * <h3>Deletion result</h3>
     * <p>A successful response indicates that the deletion request is accepted, and the response summary typically returns <code>status=Deleting</code>. If the agent is already being deleted, a subsequent request returns the current summary.
     * Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a> to query the deletion progress. After the deletion is complete, a detail query returns a resource not found error. Runtime resources are cleaned up in the background.</p>
     * 
     * @param request the request parameters of DeleteCustomAgent  DeleteCustomAgentRequest
     * @return DeleteCustomAgentResponse
     */
    @Override
    public CompletableFuture<DeleteCustomAgentResponse> deleteCustomAgent(DeleteCustomAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCustomAgent").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/custom-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <p>Deletes a managed agent in a specified workspace and asynchronously cleans up its associated platform resources.</p>
     * <h3>Prerequisites</h3>
     * <p>The workspace must be writable. If the agent is still associated with a team, dissociate it from the team first.</p>
     * <h3>Deletion results</h3>
     * <p>A successful response indicates that the deletion request has been accepted, and the response summary is typically <code>status=Deleting</code>. If the agent is already being deleted, a subsequent request returns the current summary.
     * You can query the deletion progress by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a>. After the deletion is complete, a details query returns a resource not found error. The processes and runtime environment of the managed agent are managed by the caller.</p>
     * 
     * @param request the request parameters of DeleteExternalAgent  DeleteExternalAgentRequest
     * @return DeleteExternalAgentResponse
     */
    @Override
    public CompletableFuture<DeleteExternalAgentResponse> deleteExternalAgent(DeleteExternalAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteExternalAgent").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/external-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExternalAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExternalAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Disconnects the association between a workspace and an enterprise identity source. This operation is used to terminate identity federation or clear the current attach configuration before you attach another identity source.
     * Disconnecting clears the AgentCore users and associated configurations imported from the identity source. For <code>CustomSSO</code>, it also clears the shared user pool and SAML and SCIM access resources. Applications created by users in the enterprise identity system must still be managed on the enterprise side.</p>
     * <h3>Preparations before disconnecting</h3>
     * <p>Remove the reference relationships between the related users and collaboration teams first. If teams still reference these users, the API operation rejects the disconnection request.
     * If you only want to temporarily disable a specific capability, you can retain the identity source binding. Use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a> to disable logon, or use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a> to disable SCIM synchronization.</p>
     * <h3>Verify the disconnection result</h3>
     * <p>The disconnection is executed in the background. After the request is accepted, <code>DISCONNECTING</code> is returned. You can query the progress by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a>:</p>
     * <ul>
     * <li>If the query returns <code>IdentityProviderNotFound</code>, the binding has been removed and the disconnection is complete.</li>
     * <li>If <code>DISCONNECT_FAILED</code> is returned, the cleanup failed. Some resources may have already been cleared. You can initiate the disconnection again.
     * You can bind a new identity source to the workspace only after the disconnection is complete.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIdentityProvider  DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    @Override
    public CompletableFuture<DeleteIdentityProviderResponse> deleteIdentityProvider(DeleteIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIdentityProvider").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIdentityProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIdentityProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Revokes a SCIM access token to deactivate an old token or clean up credentials that are no longer in use or have expired.
     * SCIM tokens are used to authorize enterprise identity systems to send user provisioning requests to user pools. After revocation, the enterprise identity system can no longer use the token to access the SCIM endpoint.</p>
     * <h3>Usage</h3>
     * <p><strong>Step 1:</strong> Query the credential list by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderSCIMCredentials">ListIdentityProviderSCIMCredentials</a> to obtain the target credentialId.
     * <strong>Step 2:</strong> If the enterprise identity system is still using the token, configure another valid token for it first.
     * <strong>Step 3:</strong> Call this operation to revoke the target credential, and then refresh the list to confirm the result.
     * This operation only revokes the specified token. Synchronized users, other tokens, logon configurations, and the user synchronization switch are retained. To disable user synchronization, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</p>
     * 
     * @param request the request parameters of DeleteIdentityProviderSCIMCredential  DeleteIdentityProviderSCIMCredentialRequest
     * @return DeleteIdentityProviderSCIMCredentialResponse
     */
    @Override
    public CompletableFuture<DeleteIdentityProviderSCIMCredentialResponse> deleteIdentityProviderSCIMCredential(DeleteIdentityProviderSCIMCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteIdentityProviderSCIMCredential").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/scim-provisioning/credentials/{credentialId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIdentityProviderSCIMCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIdentityProviderSCIMCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes the image cache association in a workspace and checks for agent references and instance usage before submission.</p>
     * <h3>Deletion conditions</h3>
     * <p>The deletion request is rejected if the cache is still referenced by an agent with the cache switch enabled, or if instances are still using it or resources are being released. You can first query <code>agentCount</code>, <code>canDelete</code>, and <code>deleteBlockReason</code> by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a>.</p>
     * <h3>Query results</h3>
     * <p>The <code>imageId</code> in the response corresponds to this request. The current implementation of <code>deletionPending</code> returns <code>false</code>. To confirm whether the cache is still visible, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListImageCaches">ListImageCaches</a>.
     * This operation deletes the cache association in the specified workspace, but does not delete the source ACR repository or the source image.</p>
     * 
     * @param request the request parameters of DeleteImageCache  DeleteImageCacheRequest
     * @return DeleteImageCacheResponse
     */
    @Override
    public CompletableFuture<DeleteImageCacheResponse> deleteImageCache(DeleteImageCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteImageCache").setMethod(HttpMethod.DELETE).setPathRegex("/image-caches/{imageId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a managed Harness agent in a specified workspace and asynchronously cleans up its platform-associated resources.</p>
     * <h3>Prerequisites</h3>
     * <p>The workspace must be writable. If the agent is still associated with a team, dissociate it from the team first.</p>
     * <h3>Deletion results</h3>
     * <p>A successful response indicates that the deletion request has been accepted, and the response summary is typically <code>status=Deleting</code>. If the agent is already being deleted, a subsequent request returns the current summary.
     * You can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a> to query the deletion progress. After the deletion is complete, a details query returns a resource not found error. Runtime resources are cleaned up in the background.</p>
     * 
     * @param request the request parameters of DeleteManagedAgent  DeleteManagedAgentRequest
     * @return DeleteManagedAgentResponse
     */
    @Override
    public CompletableFuture<DeleteManagedAgentResponse> deleteManagedAgent(DeleteManagedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteManagedAgent").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/managed-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteManagedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteManagedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified MCP service.
     * The deletion is an asynchronous process. After the deletion is complete, the MCP service is no longer returned.</p>
     * 
     * @param request the request parameters of DeleteMcp  DeleteMcpRequest
     * @return DeleteMcpResponse
     */
    @Override
    public CompletableFuture<DeleteMcpResponse> deleteMcp(DeleteMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMcp").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/mcp-servers/{mcpServerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMcpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMcpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a long-term memory by memory ID.</p>
     * 
     * @param request the request parameters of DeleteMemory  DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    @Override
    public CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMemory").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Asynchronously deletes a specified long-term memory store (MemoryStore) and all its long-term memories.</p>
     * 
     * @param request the request parameters of DeleteMemoryStore  DeleteMemoryStoreRequest
     * @return DeleteMemoryStoreResponse
     */
    @Override
    public CompletableFuture<DeleteMemoryStoreResponse> deleteMemoryStore(DeleteMemoryStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMemoryStore").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMemoryStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMemoryStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a model in a specified workspace. Models that are in use cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteModel  DeleteModelRequest
     * @return DeleteModelResponse
     */
    @Override
    public CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModel").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/models/{modelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Submits an asynchronous deletion task for a specified model connection. The connection cannot be deleted if it has associated models or runtime references.</p>
     * 
     * @param request the request parameters of DeleteModelConnection  DeleteModelConnectionRequest
     * @return DeleteModelConnectionResponse
     */
    @Override
    public CompletableFuture<DeleteModelConnectionResponse> deleteModelConnection(DeleteModelConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteModelConnection").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/model-connections/{connectionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes an access rule in a workspace and revokes the configuration of the rule. Repeated deletions still return a success response.</p>
     * 
     * @param request the request parameters of DeletePermissionRule  DeletePermissionRuleRequest
     * @return DeletePermissionRuleResponse
     */
    @Override
    public CompletableFuture<DeletePermissionRuleResponse> deletePermissionRule(DeletePermissionRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePermissionRule").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/permission-rules/{permissionRuleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePermissionRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePermissionRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a skill and its related version data from the specified workspace.
     * The deletion operation is irreversible.</p>
     * 
     * @param request the request parameters of DeleteSkill  DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    @Override
    public CompletableFuture<DeleteSkillResponse> deleteSkill(DeleteSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSkill").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <p>Deletes the draft of a skill that is being edited in normal version mode.
     * In <code>HEAD</code> mode, a persistent draft is used, and the delete draft operation is not supported. To modify the content, continue editing the draft. To remove the entire skill, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/DeleteSkill">DeleteSkill</a>.</p>
     * 
     * @param request the request parameters of DeleteSkillDraft  DeleteSkillDraftRequest
     * @return DeleteSkillDraftResponse
     */
    @Override
    public CompletableFuture<DeleteSkillDraftResponse> deleteSkillDraft(DeleteSkillDraftRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSkillDraft").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/draft").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSkillDraftResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSkillDraftResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a team in a specified workspace.</p>
     * 
     * @param request the request parameters of DeleteTeam  DeleteTeamRequest
     * @return DeleteTeamResponse
     */
    @Override
    public CompletableFuture<DeleteTeamResponse> deleteTeam(DeleteTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTeam").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/teams/{teamId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a user from a specified workspace.</p>
     * 
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    @Override
    public CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteUser").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}/users/{agentCoreUserId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a workspace that is no longer in use and ends the management lifecycle of the workspace. The API operation processes repeated deletion requests for the same workspace in the <code>Deleting</code> or <code>Deleted</code> state based on idempotence.</p>
     * 
     * @param request the request parameters of DeleteWorkspace  DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     */
    @Override
    public CompletableFuture<DeleteWorkspaceResponse> deleteWorkspace(DeleteWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteWorkspace").setMethod(HttpMethod.DELETE).setPathRegex("/workspaces/{workspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Disables the QoderCLI connector in a workspace.</p>
     * 
     * @param request the request parameters of DisableConnector  DisableConnectorRequest
     * @return DisableConnectorResponse
     */
    @Override
    public CompletableFuture<DisableConnectorResponse> disableConnector(DisableConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableConnector").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/connectors/{connectorName}/actions/disable").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the OSS presigned download URL for a specified agent template to download the agent template ZIP package.</p>
     * 
     * @param request the request parameters of DownloadAgentSpecViaOss  DownloadAgentSpecViaOssRequest
     * @return DownloadAgentSpecViaOssResponse
     */
    @Override
    public CompletableFuture<DownloadAgentSpecViaOssResponse> downloadAgentSpecViaOss(DownloadAgentSpecViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DownloadAgentSpecViaOss").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/actions/download-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadAgentSpecViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadAgentSpecViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the OSS pre-signed download URL for a specified skill version to download the corresponding skill ZIP package.</p>
     * 
     * @param request the request parameters of DownloadSkillVersionViaOss  DownloadSkillVersionViaOssRequest
     * @return DownloadSkillVersionViaOssResponse
     */
    @Override
    public CompletableFuture<DownloadSkillVersionViaOssResponse> downloadSkillVersionViaOss(DownloadSkillVersionViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DownloadSkillVersionViaOss").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}/actions/download-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadSkillVersionViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadSkillVersionViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Enables the QoderCLI connector in a workspace. Before enabling, verify the credentials by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyConnector">VerifyConnector</a>.</p>
     * 
     * @param request the request parameters of EnableConnector  EnableConnectorRequest
     * @return EnableConnectorResponse
     */
    @Override
    public CompletableFuture<EnableConnectorResponse> enableConnector(EnableConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableConnector").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/connectors/{connectorName}/actions/enable").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Uses the <code>clientToken</code> of a create or update request to retrieve a custom image preparation task, which allows you to continue querying the processing progress after a request response is lost.</p>
     * <h3>Search scope</h3>
     * <p>Pass the <code>clientToken</code> used when submitting <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a> as a query parameter, and use the original workspace.
     * The preparation task can be retrieved only if the submission result includes <code>imagePreparation</code>. If no corresponding preparation task exists, a resource not found error is returned.</p>
     * <h3>Query phases</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>phase</code></th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>QUEUED</code>, <code>CHECKING</code></td>
     * <td>Queued or checking the source.</td>
     * </tr>
     * <tr>
     * <td><code>COPYING</code></td>
     * <td>Copying the image.</td>
     * </tr>
     * <tr>
     * <td><code>STARTING</code></td>
     * <td>Starting the target version.</td>
     * </tr>
     * <tr>
     * <td><code>HEALTH_CHECKING</code></td>
     * <td>Waiting for the target version instance to be ready.</td>
     * </tr>
     * <tr>
     * <td><code>SUCCEEDED</code></td>
     * <td>The target version deployment succeeded.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>The preparation or deployment failed. Check <code>failedPhase</code> and <code>error</code>.</td>
     * </tr>
     * <tr>
     * <td><code>CANCELLED</code></td>
     * <td>The target version has been replaced by a subsequent configuration or canceled.</td>
     * </tr>
     * <tr>
     * <td>After the task is found, you can use the <code>preparationId</code> to call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgentImagePreparation">GetCustomAgentImagePreparation</a> to continuously query the progress.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of FindCustomAgentImagePreparation  FindCustomAgentImagePreparationRequest
     * @return FindCustomAgentImagePreparationResponse
     */
    @Override
    public CompletableFuture<FindCustomAgentImagePreparationResponse> findCustomAgentImagePreparation(FindCustomAgentImagePreparationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FindCustomAgentImagePreparation").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/custom-image-preparations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindCustomAgentImagePreparationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindCustomAgentImagePreparationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Forcibly publishes a specified skill version by bypassing the standard review process.</p>
     * 
     * @param request the request parameters of ForcePublishSkillVersion  ForcePublishSkillVersionRequest
     * @return ForcePublishSkillVersionResponse
     */
    @Override
    public CompletableFuture<ForcePublishSkillVersionResponse> forcePublishSkillVersion(ForcePublishSkillVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ForcePublishSkillVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}/actions/force-publish").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ForcePublishSkillVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ForcePublishSkillVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the configuration of an access application in a workspace to view the application access information and user source settings.
     * The query result does not include the plaintext of the application secret. The secret is returned only when the application is created.</p>
     * 
     * @param request the request parameters of GetAccessApplication  GetAccessApplicationRequest
     * @return GetAccessApplicationResponse
     */
    @Override
    public CompletableFuture<GetAccessApplicationResponse> getAccessApplication(GetAccessApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAccessApplication").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/access-applications/{applicationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccessApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccessApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the download URL for the currently saved code package of a custom code or image agent, which can be used to download, inspect, or reuse the fixed code package.</p>
     * <h3>Download scope</h3>
     * <p>Locates the fixed code package referenced by the currently saved configuration by using <code>workspaceId</code> and <code>agentId</code>. This applies to code packages uploaded locally or imported from OSS. Arbitrary bucket names, object keys, or historical version parameters are not accepted.
     * The current configuration must be deployed as a code package and the fixed package must be available. You do not need to wait for the running instance to be ready. An error is returned if the object has been changed, is missing, or is unreadable.</p>
     * <h3>Use the response</h3>
     * <p>Use <code>downloadUrl</code> to download the file. The <code>fileName</code>, <code>fileSize</code>, <code>format</code>, <code>etag</code>, and <code>crc64</code> fields describe the corresponding fixed package. The unit of <code>fileSize</code> is bytes. The <code>resourceVersionId</code> field identifies the saved configuration version corresponding to this download.
     * The URL is valid for up to 10 minutes and does not exceed the validity period of the underlying credentials, subject to <code>expiresAt</code>. Retrieve the URL again after it expires.</p>
     * 
     * @param request the request parameters of GetAgentCodePackageDownloadUrl  GetAgentCodePackageDownloadUrlRequest
     * @return GetAgentCodePackageDownloadUrlResponse
     */
    @Override
    public CompletableFuture<GetAgentCodePackageDownloadUrlResponse> getAgentCodePackageDownloadUrl(GetAgentCodePackageDownloadUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentCodePackageDownloadUrl").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/custom-agents/{agentId}/code-package/download-url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentCodePackageDownloadUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentCodePackageDownloadUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Generates an authorization link for the workspace resource role to read the code package source bucket, which is used to complete authorization before deploying an existing OSS code package.</p>
     * <h3>Authorization steps</h3>
     * <p><strong>Step 1:</strong> Provide the <code>ossBucketName</code> to obtain the <code>authorizeUrl</code> for the current workspace resource role.
     * <strong>Step 2:</strong> Open the returned link and confirm the authorization.
     * <strong>Step 3:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyAgentCodePackageOssRamAuthorization">VerifyAgentCodePackageOssRamAuthorization</a> to query the policy binding status. To verify a specific code package object, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ValidateAgentCodePackageFromOss">ValidateAgentCodePackageFromOss</a>.</p>
     * <h3>Authorization scope</h3>
     * <p>The role is selected by the server and cannot be overridden by the caller. This authorization reuses the <code>OSSObjectRestoreCustom</code> template, which includes permissions such as reading, writing, and deleting objects, and is not a read-only authorization. Existing authorizations for the same role and bucket can be reused.
     * Obtaining the link itself does not complete the authorization, transfer the code package, or modify the default OSS binding of the workspace.</p>
     * 
     * @param request the request parameters of GetAgentCodePackageOssRamAuthorizeUrl  GetAgentCodePackageOssRamAuthorizeUrlRequest
     * @return GetAgentCodePackageOssRamAuthorizeUrlResponse
     */
    @Override
    public CompletableFuture<GetAgentCodePackageOssRamAuthorizeUrlResponse> getAgentCodePackageOssRamAuthorizeUrl(GetAgentCodePackageOssRamAuthorizeUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentCodePackageOssRamAuthorizeUrl").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-code-packages/oss/authorize").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentCodePackageOssRamAuthorizeUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentCodePackageOssRamAuthorizeUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a time-limited direct upload URL and upload requirements for a local code package. After the upload is complete, use the returned <code>sourceUri</code> to submit the agent deployment.</p>
     * <h3>Request requirements</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Requirement</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>fileName</code></td>
     * <td>The name of the ZIP or TAR.GZ file without the folder. Maximum length: 255 characters.</td>
     * </tr>
     * <tr>
     * <td><code>format</code></td>
     * <td><code>zip</code> or <code>tar.gz</code>. Must match the file name extension.</td>
     * </tr>
     * <tr>
     * <td><code>fileSize</code></td>
     * <td>The size of the compressed package in bytes. Valid values: 1 to 500000000.</td>
     * </tr>
     * </tbody></table>
     * <h3>Upload and deployment</h3>
     * <p><strong>Step 1:</strong> Use the <code>uploadMethod</code>, <code>uploadUrl</code>, and <code>headers</code> from the response to upload the file directly. This operation only generates the URL and does not upload the file content.
     * <strong>Step 2:</strong> After the upload is complete, specify the <code>sourceUri</code> in the <code>artifact.code.sourceUri</code> parameter of the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a> operation. You must also provide the <code>languageRuntime</code>, <code>entrypoint</code>, and service port.
     * <strong>Step 3:</strong> During creation or update, the actual object and its size are verified again. The configuration is saved after the object is transferred to a fixed replica.
     * The upload URL is valid for up to 10 minutes and does not exceed the expiration time of the underlying temporary credentials. The exact expiration time is subject to the <code>expiresAt</code> value. If the URL expires, obtain a new one and use the original link and request headers from the response.</p>
     * 
     * @param request the request parameters of GetAgentCodePackageUploadUrl  GetAgentCodePackageUploadUrlRequest
     * @return GetAgentCodePackageUploadUrlResponse
     */
    @Override
    public CompletableFuture<GetAgentCodePackageUploadUrlResponse> getAgentCodePackageUploadUrl(GetAgentCodePackageUploadUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentCodePackageUploadUrl").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-code-packages/upload-url").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentCodePackageUploadUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentCodePackageUploadUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified agent IM channel.</p>
     * 
     * @param request the request parameters of GetAgentIMChannel  GetAgentIMChannelRequest
     * @return GetAgentIMChannelResponse
     */
    @Override
    public CompletableFuture<GetAgentIMChannelResponse> getAgentIMChannel(GetAgentIMChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentIMChannel").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels/{imChannelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentIMChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentIMChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the basic information, version status, and summaries of all versions of an agent template (AgentSpec) for viewing the template and selecting a version.</p>
     * 
     * @param request the request parameters of GetAgentSpec  GetAgentSpecRequest
     * @return GetAgentSpecResponse
     */
    @Override
    public CompletableFuture<GetAgentSpecResponse> getAgentSpec(GetAgentSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentSpec").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the upload URL for an agent template (AgentSpec) ZIP package to import templates from local files.
     * Files are transferred through Object Storage Service (OSS). First, upload the file by using the returned URL, and then call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UploadAgentSpecViaOss">UploadAgentSpecViaOss</a> API operation to complete the import.</p>
     * 
     * @param request the request parameters of GetAgentSpecImportFileUrl  GetAgentSpecImportFileUrlRequest
     * @return GetAgentSpecImportFileUrlResponse
     */
    @Override
    public CompletableFuture<GetAgentSpecImportFileUrlResponse> getAgentSpecImportFileUrl(GetAgentSpecImportFileUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentSpecImportFileUrl").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-spec-actions/get-import-file-url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSpecImportFileUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSpecImportFileUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the full content of the latest version of an agent template (AgentSpec) for viewing or editing the latest version.</p>
     * 
     * @param request the request parameters of GetAgentSpecLatest  GetAgentSpecLatestRequest
     * @return GetAgentSpecLatestResponse
     */
    @Override
    public CompletableFuture<GetAgentSpecLatestResponse> getAgentSpecLatest(GetAgentSpecLatestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentSpecLatest").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/latest").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSpecLatestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSpecLatestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the full content of a specified agent template version, including the manifest content, resource files, and metadata.</p>
     * 
     * @param request the request parameters of GetAgentSpecVersion  GetAgentSpecVersionRequest
     * @return GetAgentSpecVersionResponse
     */
    @Override
    public CompletableFuture<GetAgentSpecVersionResponse> getAgentSpecVersion(GetAgentSpecVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentSpecVersion").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/versions/{agentSpecVersion}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSpecVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSpecVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>查询指定托管智能体或自定义智能体已保存的固定版本详情，configuration 返回版本保存时的 Agent 配置。</p>
     * 
     * @param request the request parameters of GetAgentVersion  GetAgentVersionRequest
     * @return GetAgentVersionResponse
     */
    @Override
    public CompletableFuture<GetAgentVersionResponse> getAgentVersion(GetAgentVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentVersion").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/versions/{agentVersion}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified credential and returns the list of agents bound to the credential.</p>
     * <h3>Response content</h3>
     * <p>Queries the credential type, description, application scope, and binding information. Supports two types: <code>apiKey</code> and <code>mcpHeader</code>.</p>
     * <ul>
     * <li><code>apiKey</code>: The key value is returned in a masked format.</li>
     * <li><code>mcpHeader</code>: Returns the configured header name without the header value. The <code>resourceType</code> of the applicable resource is <code>mcpServer</code>.
     * To modify the configuration, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCredential">UpdateCredential</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetCredential  GetCredentialRequest
     * @return GetCredentialResponse
     */
    @Override
    public CompletableFuture<GetCredentialResponse> getCredential(GetCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCredential").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/credentials/{credentialId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the configuration, artifacts, and running status of a custom code or image agent to confirm the processing and effective results of creation or updates.</p>
     * <h3>Query configuration processing results</h3>
     * <p>After creation or update, you can poll this operation. The returned configuration belongs to the latest submitted version and may not have taken effect yet.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>latestSpecVersion</code></td>
     * <td>The latest expected configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>effectiveSpecVersion</code></td>
     * <td>The currently effective configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestVersionStatus</code></td>
     * <td>The processing status of the latest expected version.</td>
     * </tr>
     * <tr>
     * <td><code>latestExecutionError</code></td>
     * <td>The reason why the latest version is waiting for a retry or failed to execute, and whether automatic retry is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The overall status of the agent.</td>
     * </tr>
     * <tr>
     * <td><code>sandboxPhaseCounts</code></td>
     * <td>The snapshot of the number of running instances in each phase.</td>
     * </tr>
     * <tr>
     * <td><code>pending</code>, <code>processing</code>, and <code>waiting_retry</code> indicate that processing is continuing. <code>succeeded</code> indicates that the configuration is processed successfully. If the value is <code>failed</code>, troubleshoot the issue based on <code>latestExecutionError</code>. Instance status and configuration processing status are queried separately.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Code packages and images</h3>
     * <p>In code package mode, <code>artifact.code.sourceUri</code> is the saved fixed package address, and <code>codePackageInfo</code> provides the package information. To download the current fixed package, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageDownloadUrl">GetAgentCodePackageDownloadUrl</a>.
     * In image mode, <code>customImage</code> is the most recently saved custom source, and <code>currentImage</code> is the image source of the effective version. The two may be different. You can use <code>imagePreparation.preparationId</code> to call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgentImagePreparation">GetCustomAgentImagePreparation</a> to query the preparation and deployment phases of the current custom image. <code>imageCachePreparation.statusAtAcceptance</code> only indicates the cache status at the time of acceptance.
     * The response does not return the image repository password. If you query an agent that does not exist, has been deleted, or does not belong to the specified workspace, a resource not found error is returned.</p>
     * 
     * @param request the request parameters of GetCustomAgent  GetCustomAgentRequest
     * @return GetCustomAgentResponse
     */
    @Override
    public CompletableFuture<GetCustomAgentResponse> getCustomAgent(GetCustomAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCustomAgent").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/custom-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the processing progress, such as image checking, copying, and starting, by preparation task ID to track the result of the current custom image submission.</p>
     * <h3>Obtain the task identifier</h3>
     * <p>Pass the value of <code>imagePreparation.preparationId</code> from the response of creating or updating a custom code or image agent as the <code>preparationId</code> parameter without modification. It identifies the task for the current submission, not the running instance ID.</p>
     * <h3>Determine completion</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>phase</code></th>
     * <th>Meaning</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>QUEUED</code>, <code>CHECKING</code></td>
     * <td>Queued or checking the source.</td>
     * </tr>
     * <tr>
     * <td><code>COPYING</code></td>
     * <td>Copying the image.</td>
     * </tr>
     * <tr>
     * <td><code>STARTING</code></td>
     * <td>Starting the target version.</td>
     * </tr>
     * <tr>
     * <td><code>HEALTH_CHECKING</code></td>
     * <td>Waiting for the target version instance to be ready.</td>
     * </tr>
     * <tr>
     * <td><code>SUCCEEDED</code></td>
     * <td>The target version is deployed successfully.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>The preparation or deployment failed. Check <code>failedPhase</code> and <code>error</code>.</td>
     * </tr>
     * <tr>
     * <td><code>CANCELLED</code></td>
     * <td>The target version has been replaced by a subsequent configuration or canceled.</td>
     * </tr>
     * <tr>
     * <td>The query only reads the status and does not recreate the copy task. <code>SUCCEEDED</code> applies to the current target version. Seeing only old instances running does not indicate that the current submission is complete. If the configuration version is replaced by a subsequent submission, the current task may return <code>CANCELLED</code>.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>If the create or update response is lost, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/FindCustomAgentImagePreparation">FindCustomAgentImagePreparation</a> with the <code>clientToken</code> used at that time to retrieve the preparation task.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of GetCustomAgentImagePreparation  GetCustomAgentImagePreparationRequest
     * @return GetCustomAgentImagePreparationResponse
     */
    @Override
    public CompletableFuture<GetCustomAgentImagePreparationResponse> getCustomAgentImagePreparation(GetCustomAgentImagePreparationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCustomAgentImagePreparation").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/custom-image-preparations/{preparationId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomAgentImagePreparationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomAgentImagePreparationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the platform configuration, version processing status, and external runtime status of a managed agent to verify access and configuration effectiveness.</p>
     * <h3>Configuration processing and runtime status</h3>
     * <p><code>latestSpecVersion</code> and <code>latestVersionStatus</code> indicate the latest submitted configuration and its processing status. <code>status</code> represents the platform resource status, and <code>externalAgentStatus</code> represents the external runtime status. A successful configuration acceptance does not mean that the external process is connected.
     * If <code>modelSource</code> is <code>PLATFORM</code>, the returned model configuration is used. <code>RUNTIME</code> indicates that the model is managed by the external environment. <code>configuredSkills</code> indicates explicit skill configurations, and <code>skills</code> represents the aggregated skill information.</p>
     * <h3>External access</h3>
     * <p>After the configuration takes effect, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgentBootstrapOptions">GetExternalAgentBootstrapOptions</a> to query available networks, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateExternalAgentBootstrapToken">CreateExternalAgentBootstrapToken</a> to obtain access information. If the agent does not exist, has been deleted, or does not belong to the workspace, a resource not found error is returned.</p>
     * 
     * @param request the request parameters of GetExternalAgent  GetExternalAgentRequest
     * @return GetExternalAgentResponse
     */
    @Override
    public CompletableFuture<GetExternalAgentResponse> getExternalAgent(GetExternalAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExternalAgent").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/external-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExternalAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExternalAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the available public and internal network access methods for a managed agent to select the network used for subsequent connections.</p>
     * <h3>Prerequisites</h3>
     * <p>The managed agent must be in the running state, and the latest desired configuration must be applied. If the configuration is still being created, updated, or not fully applied, query the status first by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a>.</p>
     * <h3>Select an access network</h3>
     * <p>In the response, the <code>networkType</code> in <code>networkOptions</code> is <code>INTRANET</code> or <code>INTERNET</code>, and <code>available</code> indicates whether the corresponding access endpoint is available. Select a network with <code>available=true</code> and call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateExternalAgentBootstrapToken">CreateExternalAgentBootstrapToken</a> to obtain the corresponding access information.</p>
     * 
     * @param request the request parameters of GetExternalAgentBootstrapOptions  GetExternalAgentBootstrapOptionsRequest
     * @return GetExternalAgentBootstrapOptionsResponse
     */
    @Override
    public CompletableFuture<GetExternalAgentBootstrapOptionsResponse> getExternalAgentBootstrapOptions(GetExternalAgentBootstrapOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetExternalAgentBootstrapOptions").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/external-agents/{agentId}/bootstrap/options").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetExternalAgentBootstrapOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetExternalAgentBootstrapOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the enterprise identity providers bound to a workspace to view the access configuration, logon and user synchronization switches, and configuration processing progress.
     * For a custom identity provider (<code>CustomSSO</code>), this API operation also reads the saved SAML logon configuration for viewing or modifying enterprise single sign-on (SSO) settings.</p>
     * <h3>How to interpret the query results</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>identityProviderType</code></td>
     * <td>Indicates whether DingTalk, Lark, or a custom identity provider is currently connected.</td>
     * </tr>
     * <tr>
     * <td><code>loginEnabled</code></td>
     * <td>Indicates whether enterprise account logon is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>saml</code></td>
     * <td>The saved SAML configuration of the enterprise identity system, used for backfilling when editing the configuration.</td>
     * </tr>
     * <tr>
     * <td><code>configuration</code></td>
     * <td>The actual SAML configuration read from the identity service, used to verify whether the logon configuration has taken effect.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The processing progress to attach the identity provider or apply the logon configuration.</td>
     * </tr>
     * <tr>
     * <td>If <code>CustomSSO</code> returns <code>WAITING_CONFIGURATION</code>, it indicates that the user pool is ready and the SAML logon configuration is pending. In this case, you can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a> to obtain the access information of AgentCore and continue configuring enterprise single sign-on.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>After saving the logon configuration, you can query <code>status</code> to track the processing progress. <code>READY</code> indicates that the configuration processing is complete. To check whether logon is enabled, you also need to verify <code>loginEnabled</code> and <code>configuration</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Query user synchronization status</h3>
     * <p>SAML logon and SCIM user synchronization are configured separately. SCIM is used to pre-provision users from the enterprise identity system to the user pool. You can call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a> to query the receiver configuration and synchronization task results.</p>
     * 
     * @param request the request parameters of GetIdentityProvider  GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    @Override
    public CompletableFuture<GetIdentityProviderResponse> getIdentityProvider(GetIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIdentityProvider").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIdentityProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIdentityProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the access configuration and processing progress of SCIM user synchronization to determine whether the receiving end is ready, whether AgentCore user synchronization is enabled, and whether the most recent synchronization operation is completed.
     * SCIM is a user provisioning protocol. The enterprise identity system sends user information to the user pool through the receiving URL and access token. After AgentCore user synchronization is enabled, users in the user pool are imported into the workspace.</p>
     * <h3>How to interpret the query results</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Business meaning</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>configuration</code></td>
     * <td>The actual status and receiving URL of the SCIM receiving endpoint.</td>
     * </tr>
     * <tr>
     * <td><code>syncEnabled</code></td>
     * <td>The expected switch for AgentCore user synchronization.</td>
     * </tr>
     * <tr>
     * <td><code>operationStatus</code></td>
     * <td>The execution result of the most recent operation to enable or disable synchronization. It is an empty string <code>&quot;&quot;</code> if no historical tasks exist.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The SCIM access state derived from the receiving endpoint configuration, credentials, and operation results.</td>
     * </tr>
     * </tbody></table>
     * <h3>Proceed based on the status</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>Current stage</th>
     * <th>Next step</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>UNCONFIGURED</code></td>
     * <td>The receiving end is not ready.</td>
     * <td>Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to prepare for access.</td>
     * </tr>
     * <tr>
     * <td><code>WAITING_CONFIGURATION</code></td>
     * <td>The URL and valid credentials are available. Waiting for the enterprise-side configuration to be completed and synchronization to be enabled.</td>
     * <td>Configure the URL and token in the enterprise identity system, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</td>
     * </tr>
     * <tr>
     * <td><code>UPDATING</code></td>
     * <td>Synchronization is being enabled or disabled.</td>
     * <td>Continue to query this operation and wait for the operation to complete.</td>
     * </tr>
     * <tr>
     * <td><code>READY</code></td>
     * <td>Synchronization is enabled, the current enabling task is successful, and the receiving end and credentials are still available.</td>
     * <td>You can view the synchronized workspace users.</td>
     * </tr>
     * <tr>
     * <td><code>DISABLED</code></td>
     * <td>Synchronization is disabled. Existing configurations, credentials, and users are retained.</td>
     * <td>To re-establish access, check and prepare the receiving end first, and then enable synchronization.</td>
     * </tr>
     * <tr>
     * <td><code>UPDATE_FAILED</code></td>
     * <td>The operation failed, or the configuration and credentials after enabling are no longer available.</td>
     * <td>Check the operation results and access configuration in combination with <code>operationStatus</code>.</td>
     * </tr>
     * <tr>
     * <td>This operation queries the SCIM status. The SAML enterprise account logon configuration is queried through <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a>. <code>READY</code> reflects the result of the current enabling operation. The user assignment and provisioning status in the enterprise identity system must still be verified on the enterprise side.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of GetIdentityProviderSCIM  GetIdentityProviderSCIMRequest
     * @return GetIdentityProviderSCIMResponse
     */
    @Override
    public CompletableFuture<GetIdentityProviderSCIMResponse> getIdentityProviderSCIM(GetIdentityProviderSCIMRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIdentityProviderSCIM").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/scim-provisioning").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIdentityProviderSCIMResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIdentityProviderSCIMResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the SAML service provider (SP) access information of AgentCore to configure single sign-on (SSO) in an enterprise identity provider (IdP).
     * An SP is a service provider that receives logon assertions. An IdP is an enterprise identity provider that verifies user identities and issues logon assertions. This operation returns the SP information on the AgentCore side.</p>
     * <h3>Before you begin</h3>
     * <p>The workspace is bound to CustomSSO, and the shared user pool is initialized. The protocol parameter is required and must be set to SAML.
     * You can call the <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> operation to query the binding information. After the user pool is available, you can obtain the SP information and then complete the SAML configuration.</p>
     * <h3>Request example</h3>
     * <pre><code class="language-http">GET /workspaces/{workspaceId}/identity-providers/CustomSSO/service-provider?protocol=SAML
     * </code></pre>
     * <h3>Response information</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>protocol</td>
     * <td>The access protocol. This operation returns SAML.</td>
     * </tr>
     * <tr>
     * <td>entityId</td>
     * <td>The SP identifier of AgentCore. Configure it as the service provider Entity ID in the enterprise IdP.</td>
     * </tr>
     * <tr>
     * <td>acsUrl</td>
     * <td>The URL where AgentCore receives SAML logon assertions. Configure it as the ACS URL in the enterprise IdP.</td>
     * </tr>
     * <tr>
     * <td>metadataXml</td>
     * <td>The SP metadata XML. Import it to configure the SP in an enterprise IdP that supports metadata import.</td>
     * </tr>
     * </tbody></table>
     * <h3>Configuration flow</h3>
     * <p><strong>Step 1:</strong> Call this operation to obtain the SP information, and configure the SP identifier and the URL to accept assertions of AgentCore in the enterprise IdP.
     * <strong>Step 2:</strong> Export the metadata XML from the enterprise IdP and save it to AgentCore by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a>.
     * <strong>Step 3:</strong> After the configuration is complete, enable single sign-on logon by setting loginEnabled as needed.</p>
     * 
     * @param request the request parameters of GetIdentityProviderServiceProvider  GetIdentityProviderServiceProviderRequest
     * @return GetIdentityProviderServiceProviderResponse
     */
    @Override
    public CompletableFuture<GetIdentityProviderServiceProviderResponse> getIdentityProviderServiceProvider(GetIdentityProviderServiceProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIdentityProviderServiceProvider").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}/service-provider").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIdentityProviderServiceProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIdentityProviderServiceProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the progress, number of processed users, and failure causes of a user synchronization task to track whether manual synchronization is complete.
     * Use the <code>taskId</code> returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a> and keep the same workspace and identity provider.</p>
     * <h3>Determine synchronization results</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>Meaning and what to do next</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>PENDING</code>, <code>RUNNING</code></td>
     * <td>The node is not yet complete. You can continue to query.</td>
     * </tr>
     * <tr>
     * <td><code>PAUSED</code></td>
     * <td>The node is paused and has not ended.</td>
     * </tr>
     * <tr>
     * <td><code>SUCCESS</code></td>
     * <td>The synchronization is complete. You can view the workspace users.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>The synchronization failed. Check <code>failureReason</code>.</td>
     * </tr>
     * <tr>
     * <td><code>CANCELED</code></td>
     * <td>The node is canceled.</td>
     * </tr>
     * <tr>
     * <td><code>syncedUserCount</code> is the number of processed users, including updated existing users. It is not the number of newly added users and cannot be directly used as a completion percentage. <code>null</code> is returned when the count is not yet available.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of GetIdentityProviderSyncJob  GetIdentityProviderSyncJobRequest
     * @return GetIdentityProviderSyncJobResponse
     */
    @Override
    public CompletableFuture<GetIdentityProviderSyncJobResponse> getIdentityProviderSyncJob(GetIdentityProviderSyncJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIdentityProviderSyncJob").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}/sync-jobs/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIdentityProviderSyncJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIdentityProviderSyncJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the saved user synchronization scope, checks whether the selected departments are valid, and views the estimated number of departments and users involved. You can use this operation to verify the scope before initiating a manual synchronization.</p>
     * <h3>View synchronization scope</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>syncScope.mode</code></th>
     * <th>Synchronization scope</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>AllAuthorized</code></td>
     * <td>The address book scope authorized for the enterprise application. The specific scope is determined by the enterprise\&quot;s authorization.</td>
     * </tr>
     * <tr>
     * <td><code>SelectedDepartments</code></td>
     * <td>The saved scope of specified departments. Use <code>selectedDepartments</code> to view the selected departments and their validity.</td>
     * </tr>
     * <tr>
     * <td>This operation reads the saved configuration. After adjusting the department selection, save the changes by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a> before querying the estimated results. To browse the complete department tree, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderDepartments">ListIdentityProviderDepartments</a>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Use user count estimation</h3>
     * <p>You can use <code>expandedDepartmentCount</code> and <code>estimatedUserCount</code> only when <code>estimateStatus=Ready</code> and the counts are not <code>null</code>. Counts that have not been obtained return <code>null</code> and must not be treated as 0.
     * After confirming the scope, initiate the synchronization by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a>.</p>
     * 
     * @param request the request parameters of GetIdentityProviderSyncScope  GetIdentityProviderSyncScopeRequest
     * @return GetIdentityProviderSyncScopeResponse
     */
    @Override
    public CompletableFuture<GetIdentityProviderSyncScopeResponse> getIdentityProviderSyncScope(GetIdentityProviderSyncScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetIdentityProviderSyncScope").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}/sync-scope").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIdentityProviderSyncScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIdentityProviderSyncScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the creation status and usage of an image cache to determine whether the cache is available and meets the deletion conditions.</p>
     * <h3>Cache status</h3>
     * <table>
     * <thead>
     * <tr>
     * <th><code>status</code></th>
     * <th>Meaning</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>PENDING</code></td>
     * <td>Preparing. Continue to query.</td>
     * </tr>
     * <tr>
     * <td><code>READY</code></td>
     * <td>Ready.</td>
     * </tr>
     * <tr>
     * <td><code>FAILED</code></td>
     * <td>Preparation failed. Troubleshoot based on the <code>error</code> field.</td>
     * </tr>
     * <tr>
     * <td><code>DELETING</code></td>
     * <td>Deleting.</td>
     * </tr>
     * <tr>
     * <td><code>DISABLED</code></td>
     * <td>Disabled.</td>
     * </tr>
     * <tr>
     * <td>The <code>digest</code> is provided after the source resolution is completed. The unit of <code>cacheSizeBytes</code> is bytes, and it can be empty when the cache is not yet available.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Usage and deletion</h3>
     * <p><code>agentCount</code> indicates the number of agents that have enabled the cache switch and reference this cache. <code>canDelete</code> and <code>deleteBlockReason</code> indicate whether the cache can be deleted and the reason for blocking deletion. Deletion requests will recheck the usage.
     * The query scope of this operation is determined by <code>regionId</code>, <code>workspaceId</code>, and <code>imageId</code>.</p>
     * 
     * @param request the request parameters of GetImageCache  GetImageCacheRequest
     * @return GetImageCacheResponse
     */
    @Override
    public CompletableFuture<GetImageCacheResponse> getImageCache(GetImageCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetImageCache").setMethod(HttpMethod.GET).setPathRegex("/image-caches/{imageId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the configuration, skill versions, and running status of a managed Harness agent to view the current configuration and its processing results.</p>
     * <h3>Configuration and running status</h3>
     * <p>This operation returns the latest submitted configuration, which may still be processing. Use the following fields to determine the update progress and running status:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>latestSpecVersion</code></td>
     * <td>The latest submitted desired configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestVersionStatus</code></td>
     * <td>The processing status of the desired version.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The overall status of the agent.</td>
     * </tr>
     * <tr>
     * <td><code>sandboxPhaseCounts</code></td>
     * <td>The current snapshot of the number of instances in each phase.</td>
     * </tr>
     * <tr>
     * <td>Successful configuration processing does not mean that all old instances have been replaced. To view specific instances or active sessions, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxes">ListSandboxes</a> and <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxSessions">ListSandboxSessions</a> respectively.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Harness and skill versions</h3>
     * <p><code>harness.type</code> indicates the runtime framework determined at creation. For qodercli, <code>connectorServiceAccountKey</code> returns the ID of the bound account key record and does not return the original key.
     * <code>configuredSkills</code> refers to explicitly configured skills. <code>skills</code> includes the aggregated results of template and explicit configurations. <code>resolvedVersion</code> is the current target version, and <code>appliedVersion</code> is the version currently in effect at runtime. These two may differ during an update. <code>fromTemplate=true</code> indicates that the skill comes from a template.
     * If you query an agent that does not exist, has been deleted, or does not belong to the specified workspace, a resource not found error is returned.</p>
     * 
     * @param request the request parameters of GetManagedAgent  GetManagedAgentRequest
     * @return GetManagedAgentResponse
     */
    @Override
    public CompletableFuture<GetManagedAgentResponse> getManagedAgent(GetManagedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetManagedAgent").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/managed-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetManagedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetManagedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified MCP service, such as the address, type, status, authentication configuration, and protocol.</p>
     * 
     * @param request the request parameters of GetMcp  GetMcpRequest
     * @return GetMcpResponse
     */
    @Override
    public CompletableFuture<GetMcpResponse> getMcp(GetMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMcp").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/mcp-servers/{mcpServerId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMcpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMcpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a temporary upload URL for a local MCP code package to create or update an MCP service of the code deployment type.</p>
     * <h3>Upload and deployment steps</h3>
     * <p><strong>Step 1:</strong> Prepare a ZIP code package, enter the file name in <code>fileName</code>, and call this operation to obtain the upload information.
     * <strong>Step 2:</strong> Use the returned <code>uploadMethod</code>, <code>uploadUrl</code>, and <code>headers</code> to upload the file content. The package size cannot exceed <code>maxSize</code>. The current limit is 50 MiB (52,428,800 bytes).
     * <strong>Step 3:</strong> After the upload is complete, submit the <code>codePackageToken</code> to the code deployment configuration in <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateMcp">CreateMcp</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateMcp">UpdateMcp</a>.
     * <strong>Step 4:</strong> After submitting the deployment, query the service status by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a>.</p>
     * <h3>Validity period</h3>
     * <p>For the expiration time of the upload URL, see <code>expiresAt</code>. For the expiration time of the temporary code package, see <code>artifactExpiresAt</code>. Complete the upload and deployment within the corresponding periods. If the upload URL expires, retrieve it again.</p>
     * 
     * @param request the request parameters of GetMcpCodePackageUploadUrl  GetMcpCodePackageUploadUrlRequest
     * @return GetMcpCodePackageUploadUrlResponse
     */
    @Override
    public CompletableFuture<GetMcpCodePackageUploadUrlResponse> getMcpCodePackageUploadUrl(GetMcpCodePackageUploadUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMcpCodePackageUploadUrl").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/mcp-server-actions/get-code-package-upload-url").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMcpCodePackageUploadUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMcpCodePackageUploadUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the capabilities, parameters, and version information of an MCP marketplace template to help you select a template and prepare for installation and configuration.
     * Returns the current template version and the installation form schema.</p>
     * 
     * @param request the request parameters of GetMcpMarketItem  GetMcpMarketItemRequest
     * @return GetMcpMarketItemResponse
     */
    @Override
    public CompletableFuture<GetMcpMarketItemResponse> getMcpMarketItem(GetMcpMarketItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMcpMarketItem").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/mcp-market/items/{marketItemId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMcpMarketItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMcpMarketItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries a long-term memory by memory ID.</p>
     * 
     * @param request the request parameters of GetMemory  GetMemoryRequest
     * @return GetMemoryResponse
     */
    @Override
    public CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMemory").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the configuration and current status of a long-term memory store (MemoryStore) for viewing memory store information.</p>
     * 
     * @param request the request parameters of GetMemoryStore  GetMemoryStoreRequest
     * @return GetMemoryStoreResponse
     */
    @Override
    public CompletableFuture<GetMemoryStoreResponse> getMemoryStore(GetMemoryStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMemoryStore").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemoryStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemoryStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the progress and results of a memory extraction task by using the <code>taskId</code> returned by the asynchronous <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/AddMemories">AddMemories</a> operation.</p>
     * 
     * @param request the request parameters of GetMemoryTask  GetMemoryTaskRequest
     * @return GetMemoryTaskResponse
     */
    @Override
    public CompletableFuture<GetMemoryTaskResponse> getMemoryTask(GetMemoryTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMemoryTask").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}/memory-tasks/{taskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemoryTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemoryTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the detailed configuration and region of a model in a specified workspace.</p>
     * 
     * @param request the request parameters of GetModel  GetModelRequest
     * @return GetModelResponse
     */
    @Override
    public CompletableFuture<GetModelResponse> getModel(GetModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModel").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/models/{modelId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the detailed configuration, credential configuration status, publish status, and region of a specified model connection.</p>
     * 
     * @param request the request parameters of GetModelConnection  GetModelConnectionRequest
     * @return GetModelConnectionResponse
     */
    @Override
    public CompletableFuture<GetModelConnectionResponse> getModelConnection(GetModelConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetModelConnection").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/model-connections/{connectionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the service endpoint of an agent or collaboration component to obtain stable access addresses, authentication configuration, and current status.
     * A service endpoint associates access addresses with a specified agent version or workspace collaboration component. You can use the target route and address list in the response to verify the access target.</p>
     * 
     * @param request the request parameters of GetServiceEndpoint  GetServiceEndpointRequest
     * @return GetServiceEndpointResponse
     */
    @Override
    public CompletableFuture<GetServiceEndpointResponse> getServiceEndpoint(GetServiceEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceEndpoint").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/service-endpoints/{serviceEndpointId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the active API key and invocation method of a service endpoint for external applications to access the endpoint.
     * The endpoint must have <code>API_KEY</code> authentication enabled and access credentials ready. Securely store the returned API key.</p>
     * 
     * @param request the request parameters of GetServiceEndpointApiKey  GetServiceEndpointApiKeyRequest
     * @return GetServiceEndpointApiKeyResponse
     */
    @Override
    public CompletableFuture<GetServiceEndpointApiKeyResponse> getServiceEndpointApiKey(GetServiceEndpointApiKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceEndpointApiKey").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/service-endpoints/{serviceEndpointId}/api-key/get").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceEndpointApiKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceEndpointApiKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the basic information, version status, tags, visibility scope, and version list of a specified skill.</p>
     * 
     * @param request the request parameters of GetSkillDetail  GetSkillDetailRequest
     * @return GetSkillDetailResponse
     */
    @Override
    public CompletableFuture<GetSkillDetailResponse> getSkillDetail(GetSkillDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSkillDetail").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the upload URL for a skill ZIP package to import a skill from a local file.
     * Files are transferred through OSS. Upload the file by using the returned URL, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UploadSkillViaOss">UploadSkillViaOss</a> to complete the import. To check the package content and conflicts, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrecheckSkillUploadViaOss">PrecheckSkillUploadViaOss</a> first.</p>
     * 
     * @param request the request parameters of GetSkillImportFileUrl  GetSkillImportFileUrlRequest
     * @return GetSkillImportFileUrlResponse
     */
    @Override
    public CompletableFuture<GetSkillImportFileUrlResponse> getSkillImportFileUrl(GetSkillImportFileUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSkillImportFileUrl").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skill-actions/get-import-file-url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillImportFileUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillImportFileUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the complete details of a specified skill version, including version metadata, skill content, and associated resources.</p>
     * 
     * @param request the request parameters of GetSkillVersionDetail  GetSkillVersionDetailRequest
     * @return GetSkillVersionDetailResponse
     */
    @Override
    public CompletableFuture<GetSkillVersionDetailResponse> getSkillVersionDetail(GetSkillVersionDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSkillVersionDetail").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillVersionDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillVersionDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specified team, including the complete attributes and team roles of each user and agent member in the team.</p>
     * 
     * @param request the request parameters of GetTeam  GetTeamRequest
     * @return GetTeamResponse
     */
    @Override
    public CompletableFuture<GetTeamResponse> getTeam(GetTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTeam").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/teams/{teamId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of a specific user in a specified workspace.</p>
     * 
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    @Override
    public CompletableFuture<GetUserResponse> getUser(GetUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUser").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/users/{agentCoreUserId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the basic information, associated resources, and network configurations of a workspace for status viewing or configuration verification.
     * The returned information includes the lifecycle status, associated observability workspace, AI registry namespace, and current network policies.</p>
     * 
     * @param request the request parameters of GetWorkspace  GetWorkspaceRequest
     * @return GetWorkspaceResponse
     */
    @Override
    public CompletableFuture<GetWorkspaceResponse> getWorkspace(GetWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkspace").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Generates an authorization link for the workspace resource role to pull images from a specified ACR Enterprise Edition repository, allowing you to complete access authorization before image deployment.</p>
     * <h3>Request parameters</h3>
     * <p>The <code>workspaceId</code> parameter specifies the workspace. The <code>acrInstanceId</code>, <code>namespace</code>, and <code>repository</code> parameters are passed as query parameters. The <code>repository</code> parameter specifies the repository name without the namespace.</p>
     * <h3>Complete authorization</h3>
     * <p>Open the <code>authorizeUrl</code> in the response and confirm the authorization. Then, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyWorkspaceAcrRamAuthorization">VerifyWorkspaceAcrRamAuthorization</a> to check the binding status. The role is selected by the server. The <code>roleName</code> and <code>roleSource</code> parameters indicate the selected role and its source, but do not indicate that the authorization is complete.
     * This authorization is used for ACR image deployment of custom agents and reading image cache sources. Obtaining the link itself does not pull images or create caches.</p>
     * 
     * @param request the request parameters of GetWorkspaceAcrRamAuthorizeUrl  GetWorkspaceAcrRamAuthorizeUrlRequest
     * @return GetWorkspaceAcrRamAuthorizeUrlResponse
     */
    @Override
    public CompletableFuture<GetWorkspaceAcrRamAuthorizeUrlResponse> getWorkspaceAcrRamAuthorizeUrl(GetWorkspaceAcrRamAuthorizeUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkspaceAcrRamAuthorizeUrl").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/acr/authorize").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkspaceAcrRamAuthorizeUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkspaceAcrRamAuthorizeUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the AgenticFS mount authorization link to enable agents in the workspace to access a specified file space.
     * <a href="https://www.alibabacloud.com/help/en/nas/product-overview/agenticfs-overview">AgenticFS</a> is a storage type of Apsara File Storage NAS designed for AI agents. It can be used to persistently store files used by agents. AgenticSpace is the file space within it, and an access point provides the mount entry.</p>
     * <h3>Authorization and mounting steps</h3>
     * <p><strong>Step 1:</strong> Prepare a file system, an AgenticSpace, and an access point in NAS, and obtain the file system ID, access point ID, and domain name.
     * <strong>Step 2:</strong> Submit <code>fileSystemId</code>, <code>accessPointId</code>, and <code>server</code> as query parameters. For <code>server</code>, enter the access point domain name returned by the NAS <code>ListAccessPoints</code> operation, without the protocol, port, or path.
     * <strong>Step 3:</strong> Open the returned <code>authorizeUrl</code> to complete the authorization for the workspace resource role.
     * <strong>Step 4:</strong> Check the authorization status by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyWorkspaceAgenticFsMountRamAuthorization">VerifyWorkspaceAgenticFsMountRamAuthorization</a>.
     * <strong>Step 5:</strong> When creating or updating a custom code or image agent, or a managed Harness agent, enter the access point domain name, the relative directory <code>path</code>, and the container mount path <code>mountPath</code> in <code>agenticFsMounts</code>.
     * The access point must be located in the VPC associated with the workspace, and VPC access must be enabled for the agent. The mount directory must already exist. Use a non-empty relative directory within the access point for <code>path</code>, and use an absolute path within the container for <code>mountPath</code>.</p>
     * 
     * @param request the request parameters of GetWorkspaceAgenticFsMountRamAuthorizeUrl  GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest
     * @return GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse
     */
    @Override
    public CompletableFuture<GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse> getWorkspaceAgenticFsMountRamAuthorizeUrl(GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkspaceAgenticFsMountRamAuthorizeUrl").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agentic-fs/authorize").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkspaceAgenticFsMountRamAuthorizeUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the status and configuration of the workspace collaboration component to check whether the component is activated and whether the configuration takes effect.
     * Use <code>pluginName=collaboration</code> to specify the collaboration component. To activate the component, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/InstallWorkspacePlugin">InstallWorkspacePlugin</a>.</p>
     * 
     * @param request the request parameters of GetWorkspacePlugin  GetWorkspacePluginRequest
     * @return GetWorkspacePluginResponse
     */
    @Override
    public CompletableFuture<GetWorkspacePluginResponse> getWorkspacePlugin(GetWorkspacePluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWorkspacePlugin").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/plugins/{pluginName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkspacePluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkspacePluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates an MCP service by using a marketplace template to reuse the tool capabilities and configurations provided by the template.
     * First, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcpMarketItem">GetMcpMarketItem</a> to view the template versions and required parameters, and then submit the configuration based on the selected version. After the service is created, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a> to query the service status.</p>
     * 
     * @param request the request parameters of InstallMcpMarketItem  InstallMcpMarketItemRequest
     * @return InstallMcpMarketItemResponse
     */
    @Override
    public CompletableFuture<InstallMcpMarketItemResponse> installMcpMarketItem(InstallMcpMarketItemRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallMcpMarketItem").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/mcp-market/items/{marketItemId}/install").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallMcpMarketItemResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallMcpMarketItemResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Enables the collaboration component for a workspace and configures initial settings such as the network.
     * Set pluginName=collaboration to specify the collaboration component. The enabling process is executed asynchronously. After submission, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspacePlugin">GetWorkspacePlugin</a> to check the component status and processing result.</p>
     * 
     * @param request the request parameters of InstallWorkspacePlugin  InstallWorkspacePluginRequest
     * @return InstallWorkspacePluginResponse
     */
    @Override
    public CompletableFuture<InstallWorkspacePluginResponse> installWorkspacePlugin(InstallWorkspacePluginRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallWorkspacePlugin").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/plugins/{pluginName}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallWorkspacePluginResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallWorkspacePluginResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the available runtime environments for code package deployment of custom code or image agents, which is used to populate artifact.code.languageRuntime.</p>
     * <h3>Select a runtime environment</h3>
     * <p>Copy the languageRuntime value from the response exactly as is into the artifact.code.languageRuntime parameter of <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a>. The catalog is dynamically provided by the current platform version, and internal base image addresses are not returned.</p>
     * <h3>Pagination rules</h3>
     * <p>If maxResults is omitted or set to 0, the default value is 10. If the value is greater than 100, it is processed as 100. The value cannot be negative. Omit nextToken for the first request. For subsequent requests, use the token returned in the previous response and keep the workspace unchanged. An empty token indicates that the query is complete. If the token becomes invalid due to changes in the runtime environment catalog, restart the query from the first page.
     * Regular updates, restarts, and scale-outs of existing agents continue to use their saved runtime images. When you create an agent or switch the language runtime environment, the catalog currently returned by this operation prevails.</p>
     * 
     * @param request the request parameters of ListAgentCodeRuntimes  ListAgentCodeRuntimesRequest
     * @return ListAgentCodeRuntimesResponse
     */
    @Override
    public CompletableFuture<ListAgentCodeRuntimesResponse> listAgentCodeRuntimes(ListAgentCodeRuntimesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentCodeRuntimes").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-code-runtimes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentCodeRuntimesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentCodeRuntimesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the IM channels for a specified agent.</p>
     * 
     * @param request the request parameters of ListAgentIMChannels  ListAgentIMChannelsRequest
     * @return ListAgentIMChannelsResponse
     */
    @Override
    public CompletableFuture<ListAgentIMChannelsResponse> listAgentIMChannels(ListAgentIMChannelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentIMChannels").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentIMChannelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentIMChannelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query of Agent templates in a specified workspace, and supports name search, sorting, and filtering by owner, visibility scope, and business labels.</p>
     * 
     * @param request the request parameters of ListAgentSpecs  ListAgentSpecsRequest
     * @return ListAgentSpecsResponse
     */
    @Override
    public CompletableFuture<ListAgentSpecsResponse> listAgentSpecs(ListAgentSpecsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentSpecs").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agent-specs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentSpecsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentSpecsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the teams to which specified agents belong.</p>
     * 
     * @param request the request parameters of ListAgentTeams  ListAgentTeamsRequest
     * @return ListAgentTeamsResponse
     */
    @Override
    public CompletableFuture<ListAgentTeamsResponse> listAgentTeams(ListAgentTeamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentTeams").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-team-memberships").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentTeamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentTeamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>分页查询指定托管智能体或自定义智能体已保存的固定版本，按创建时间倒序返回，不包含系统维护的 latest 版本。列表项不返回 configuration，需查看配置时调用 GetAgentVersion。</p>
     * 
     * @param request the request parameters of ListAgentVersions  ListAgentVersionsRequest
     * @return ListAgentVersionsResponse
     */
    @Override
    public CompletableFuture<ListAgentVersionsResponse> listAgentVersions(ListAgentVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentVersions").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the official and enterprise models available for the enabled QoderCLI connector.
     * Queries the list of models available for a specified connector. Pagination is supported.</p>
     * 
     * @param request the request parameters of ListConnectorModels  ListConnectorModelsRequest
     * @return ListConnectorModelsResponse
     */
    @Override
    public CompletableFuture<ListConnectorModelsResponse> listConnectorModels(ListConnectorModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConnectorModels").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/connectors/{connectorName}/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConnectorModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConnectorModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the connectors supported by the workspace to view their activation status, configurations, and the number of bound agents.</p>
     * 
     * @param request the request parameters of ListConnectors  ListConnectorsRequest
     * @return ListConnectorsResponse
     */
    @Override
    public CompletableFuture<ListConnectorsResponse> listConnectors(ListConnectorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConnectors").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/connectors").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConnectorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConnectorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query for credentials in a specified workspace.</p>
     * <h3>Query and paging</h3>
     * <p>Filters credentials by <code>apiKey</code> or <code>mcpHeader</code> type by using <code>credentialType</code>, and performs fuzzy filtering by name by using <code>nameLike</code>.
     * Uses <code>maxResults</code> to specify the number of entries per page for paging, and uses <code>nextToken</code> in the response to retrieve the next page. The returned credential content is desensitized. To query the details of a single credential, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCredential">GetCredential</a>.</p>
     * 
     * @param request the request parameters of ListCredentials  ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    @Override
    public CompletableFuture<ListCredentialsResponse> listCredentials(ListCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCredentials").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/credentials").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query to retrieve the identity, deployment method, and status summary of custom code or image agents in a workspace, with paging support.</p>
     * <h3>Paged query</h3>
     * <p>If <code>maxResults</code> is omitted or set to <code>0</code>, the default value is 20 and the maximum value is 100. Omit <code>nextToken</code> in the first request. For subsequent requests, pass the token returned in the previous response as is, and keep the same workspace and filter conditions. An empty token indicates the end of paging.</p>
     * <h3>Response content</h3>
     * <p>This operation returns the summary for the current page. It does not return the complete deployment configurations or errors that occur when you execute the latest configurations. Use <code>items[].agentId</code> to invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a> to query code packages, image sources, results after you execute the version, and running instance statuses.</p>
     * 
     * @param request the request parameters of ListCustomAgents  ListCustomAgentsRequest
     * @return ListCustomAgentsResponse
     */
    @Override
    public CompletableFuture<ListCustomAgentsResponse> listCustomAgents(ListCustomAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCustomAgents").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/custom-agents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query to retrieve the identity, configuration versions, and status summary of managed agents in a workspace.</p>
     * <h3>Paging query</h3>
     * <p>If <code>maxResults</code> is omitted or set to <code>0</code>, the default value is 20, and the maximum value is 100. Omit <code>nextToken</code> in the first request. For subsequent requests, pass the token returned in the previous response as is, and keep the same workspace and filter conditions. An empty token indicates that there are no more pages.</p>
     * <h3>Response content</h3>
     * <p>This operation returns the summary of managed agents. To query the complete models, instructions, tools, skills, and accessed state, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a>.</p>
     * 
     * @param request the request parameters of ListExternalAgents  ListExternalAgentsRequest
     * @return ListExternalAgentsResponse
     */
    @Override
    public CompletableFuture<ListExternalAgentsResponse> listExternalAgents(ListExternalAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListExternalAgents").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/external-agents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExternalAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExternalAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of DingTalk or Lark departments by parent department and paging. This is used when selecting or adjusting the user synchronization scope.</p>
     * <h3>Before you begin</h3>
     * <p>A DingTalk or Lark identity provider is bound to the workspace, and the user pool, application credentials, and authorization to read contacts are prepared.</p>
     * <h3>Query methods</h3>
     * <ul>
     * <li>Omit <code>parentDepartmentId</code> to query the root level. Pass a department ID to query its direct child departments.</li>
     * <li><code>hasChildren</code> indicates whether a department can be expanded. After expansion, use the department ID to query the next level.</li>
     * <li><code>nextToken</code> is used to continue reading the next page under the same parent department. An empty string indicates that there are no more pages.</li>
     * </ul>
     * <h3>Total count and pagination</h3>
     * <p>This operation does not calculate the total number of departments. Currently, <code>totalCount</code> returns JSON <code>null</code>, which does not mean the number of departments is 0. Whether to continue pagination depends on <code>nextToken</code>.</p>
     * <h3>Request examples</h3>
     * <pre><code class="language-http">GET /workspaces/{workspaceId}/identity-providers/{identityProviderType}/departments?maxResults=50
     * </code></pre>
     * <h3>Response examples</h3>
     * <p>The following shows the response structure for an empty directory page. <code>totalCount</code> retains the <code>null</code> value actually returned by the operation.</p>
     * <pre><code class="language-json">{
     *   &quot;requestId&quot;: &quot;01234567-89AB-CDEF-0123-456789ABCDEF&quot;,
     *   &quot;message&quot;: &quot;success&quot;,
     *   &quot;httpStatusCode&quot;: 200,
     *   &quot;code&quot;: &quot;SUCCESS&quot;,
     *   &quot;success&quot;: true,
     *   &quot;maxResults&quot;: 50,
     *   &quot;nextToken&quot;: &quot;&quot;,
     *   &quot;totalCount&quot;: null,
     *   &quot;items&quot;: []
     * }
     * </code></pre>
     * <h3>What to do next</h3>
     * <p>After selecting the departments to synchronize, save the synchronization scope by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProvider">UpdateIdentityProvider</a>, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a> to initiate synchronization as needed.</p>
     * 
     * @param request the request parameters of ListIdentityProviderDepartments  ListIdentityProviderDepartmentsRequest
     * @return ListIdentityProviderDepartmentsResponse
     */
    @Override
    public CompletableFuture<ListIdentityProviderDepartmentsResponse> listIdentityProviderDepartments(ListIdentityProviderDepartmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIdentityProviderDepartments").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}/departments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIdentityProviderDepartmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIdentityProviderDepartmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of SCIM access credentials to check which tokens are still valid, when they expire, and to select credentials for revocation.
     * SCIM tokens are used to authorize enterprise identity systems to send user provisioning requests to the user pool. This operation returns credential summaries, including the credential ID, status, creation time, and expiration time. The plaintext token is returned only upon creation.</p>
     * <h3>How to use the query results</h3>
     * <ul>
     * <li>Credentials with the Enabled status that have not expired can continue to be used.</li>
     * <li>To obtain a new token, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSCIMCredential">CreateIdentityProviderSCIMCredential</a>.</li>
     * <li>To revoke a token, pass the target credentialId to <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/DeleteIdentityProviderSCIMCredential">DeleteIdentityProviderSCIMCredential</a>.
     * A single user pool can retain up to two SCIM credentials. The list may include expired or disabled credentials. Clean up unused credentials before creating a new token.</li>
     * </ul>
     * <h3>Return method</h3>
     * <p>This operation returns the complete array of credentials at once without using pagination parameters. If no credentials exist, the following is returned:</p>
     * <pre><code class="language-json">{&quot;data&quot;:[]}
     * </code></pre>
     * 
     * @param request the request parameters of ListIdentityProviderSCIMCredentials  ListIdentityProviderSCIMCredentialsRequest
     * @return ListIdentityProviderSCIMCredentialsResponse
     */
    @Override
    public CompletableFuture<ListIdentityProviderSCIMCredentialsResponse> listIdentityProviderSCIMCredentials(ListIdentityProviderSCIMCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIdentityProviderSCIMCredentials").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/scim-provisioning/credentials").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIdentityProviderSCIMCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIdentityProviderSCIMCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the enterprise identity providers currently connected to a workspace. This operation is used to display the identity provider list or to check whether a binding already exists before configuring a new connection.
     * A workspace can be bound to at most one external identity provider: DingTalk, Lark, or a custom identity provider (<code>CustomSSO</code>). If no identity provider is bound, the returned <code>items</code> is an empty array.</p>
     * <h3>What you can view in the list</h3>
     * <p>The list returns the identity provider type, binding status, and logon and user synchronization switches. When the status of <code>CustomSSO</code> is <code>WAITING_CONFIGURATION</code>, it indicates that the user pool is ready and you can proceed to complete the integration configuration.
     * This operation returns a binding summary. To view specific integration configurations, use the corresponding operations:</p>
     * <ul>
     * <li><a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a>: Views the identity provider details and SAML logon configuration.</li>
     * <li><a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a>: Retrieves the SAML integration information required to configure AgentCore in the enterprise identity system.</li>
     * <li><a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a>: Views the SCIM endpoint configuration and user synchronization status.</li>
     * </ul>
     * <h3>Pagination</h3>
     * <p>Currently, at most one binding is returned. <code>nextToken</code> should be omitted or passed as an empty string. The default value of <code>maxResults</code> is 10. Valid values: 1 to 100.</p>
     * 
     * @param request the request parameters of ListIdentityProviders  ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    @Override
    public CompletableFuture<ListIdentityProvidersResponse> listIdentityProviders(ListIdentityProvidersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListIdentityProviders").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/identity-providers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIdentityProvidersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIdentityProvidersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query for image caches in a workspace. Supports paging and filtering by image source and cache status.</p>
     * <h3>Filter conditions</h3>
     * <p>Provide regionId and workspaceId in the query parameters. You can filter by ACR instance, registry, namespace, repository, tag, digest, and status. Use imageRefContains to search for image address fragments.</p>
     * <h3>Pagination rules</h3>
     * <p>The default value of maxResults is 20, and the valid values are 1 to 100. Omit nextToken for the first request. For subsequent requests, use the token returned in the response as is, and keep the workspace, region, page size, and all filter conditions unchanged. An empty token indicates that there are no more pages.</p>
     * <h3>Response content</h3>
     * <p>Each item includes imageId, source, digest, status, size, reference count, and deletion conditions. PENDING only indicates that the cache is being prepared. For the cause of failure, see error. You can query a single cache by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a>.</p>
     * 
     * @param request the request parameters of ListImageCaches  ListImageCachesRequest
     * @return ListImageCachesResponse
     */
    @Override
    public CompletableFuture<ListImageCachesResponse> listImageCaches(ListImageCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListImageCaches").setMethod(HttpMethod.GET).setPathRegex("/image-caches").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageCachesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query for the identity, harnesses, configuration versions, and status summary of managed Harness agents in a workspace.</p>
     * <h3>Paging query</h3>
     * <p>If <code>maxResults</code> is omitted or set to <code>0</code>, the default value is 20, and the maximum value is 100. Omit <code>nextToken</code> in the first request. For subsequent requests, pass the token returned in the previous response as is, and keep the same workspace and filter conditions. An empty token indicates that no more pages are available.</p>
     * <h3>Response content</h3>
     * <p>The list returns summary information, where <code>harness.type</code> indicates the runtime framework. You can query the complete configuration, skill targets and effective versions, and instance status statistics by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a>.</p>
     * 
     * @param request the request parameters of ListManagedAgents  ListManagedAgentsRequest
     * @return ListManagedAgentsResponse
     */
    @Override
    public CompletableFuture<ListManagedAgentsResponse> listManagedAgents(ListManagedAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListManagedAgents").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/managed-agents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListManagedAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListManagedAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries official MCP marketplace templates available for installation to help select required tool services. Supports filtering by keyword, usage tag, and MCP type.</p>
     * 
     * @param request the request parameters of ListMcpMarketItems  ListMcpMarketItemsRequest
     * @return ListMcpMarketItemsResponse
     */
    @Override
    public CompletableFuture<ListMcpMarketItemsResponse> listMcpMarketItems(ListMcpMarketItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMcpMarketItems").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/mcp-market/items").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMcpMarketItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMcpMarketItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of tools exposed by a specified MCP service and their input and output schemas.</p>
     * 
     * @param request the request parameters of ListMcpTools  ListMcpToolsRequest
     * @return ListMcpToolsResponse
     */
    @Override
    public CompletableFuture<ListMcpToolsResponse> listMcpTools(ListMcpToolsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMcpTools").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/mcp-servers/{mcpServerId}/tools").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMcpToolsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMcpToolsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query for MCP services and their configurations and status in a specified workspace.</p>
     * 
     * @param request the request parameters of ListMcps  ListMcpsRequest
     * @return ListMcpsResponse
     */
    @Override
    public CompletableFuture<ListMcpsResponse> listMcps(ListMcpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMcps").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/mcp-servers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMcpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMcpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries long-term memory with paging and supports filtering by <code>UserId</code>, <code>AgentId</code>, and <code>SessionId</code>.</p>
     * 
     * @param request the request parameters of ListMemories  ListMemoriesRequest
     * @return ListMemoriesResponse
     */
    @Override
    public CompletableFuture<ListMemoriesResponse> listMemories(ListMemoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemories").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}/memories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries raw messages of a specific session in the memory store with paging to view the session content used for generating long-term memory.
     * <code>SessionId</code> is required, and at least one of <code>UserId</code> and <code>AgentId</code> must be provided to identify the target session.</p>
     * 
     * @param request the request parameters of ListMemorySessionMessages  ListMemorySessionMessagesRequest
     * @return ListMemorySessionMessagesResponse
     */
    @Override
    public CompletableFuture<ListMemorySessionMessagesResponse> listMemorySessionMessages(ListMemorySessionMessagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemorySessionMessages").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}/messages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemorySessionMessagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemorySessionMessagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query for source sessions in a long-term memory store (MemoryStore), supporting paging and filtering by user ID and agent ID respectively.</p>
     * 
     * @param request the request parameters of ListMemorySessions  ListMemorySessionsRequest
     * @return ListMemorySessionsResponse
     */
    @Override
    public CompletableFuture<ListMemorySessionsResponse> listMemorySessions(ListMemorySessionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemorySessions").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}/sessions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemorySessionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemorySessionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query of the long-term memory stores (MemoryStores) in a workspace by using paging for selection or management.</p>
     * 
     * @param request the request parameters of ListMemoryStores  ListMemoryStoresRequest
     * @return ListMemoryStoresResponse
     */
    @Override
    public CompletableFuture<ListMemoryStoresResponse> listMemoryStores(ListMemoryStoresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemoryStores").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/memorystores").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemoryStoresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemoryStoresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries model connections in a workspace by using paging to view configured model services.</p>
     * <ul>
     * <li>Use <code>Name</code> to filter by name, and <code>SearchType</code> to specify exact match or fuzzy match.</li>
     * <li>You can filter by model provider type and invocation protocol.</li>
     * </ul>
     * 
     * @param request the request parameters of ListModelConnections  ListModelConnectionsRequest
     * @return ListModelConnectionsResponse
     */
    @Override
    public CompletableFuture<ListModelConnectionsResponse> listModelConnections(ListModelConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModelConnections").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/model-connections").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query for models in a specified workspace and supports filtering by model connection and model name.</p>
     * 
     * @param request the request parameters of ListModels  ListModelsRequest
     * @return ListModelsResponse
     */
    @Override
    public CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListModels").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <p>Performs a paged query of access rules by resource, supporting paging to check existing rules and their sources.</p>
     * 
     * @param request the request parameters of ListPermissionRules  ListPermissionRulesRequest
     * @return ListPermissionRulesResponse
     */
    @Override
    public CompletableFuture<ListPermissionRulesResponse> listPermissionRules(ListPermissionRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPermissionRules").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/permission-rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPermissionRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPermissionRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the providers supported by the built-in model catalog of AgentCore and their default service configurations.</p>
     * 
     * @param request the request parameters of ListPredefinedModelProviders  ListPredefinedModelProvidersRequest
     * @return ListPredefinedModelProvidersResponse
     */
    @Override
    public CompletableFuture<ListPredefinedModelProvidersResponse> listPredefinedModelProviders(ListPredefinedModelProvidersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPredefinedModelProviders").setMethod(HttpMethod.GET).setPathRegex("/model-catalog/providers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPredefinedModelProvidersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPredefinedModelProvidersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the models and their capabilities for a specified provider in the AgentCore built-in model catalog.</p>
     * 
     * @param request the request parameters of ListPredefinedModels  ListPredefinedModelsRequest
     * @return ListPredefinedModelsResponse
     */
    @Override
    public CompletableFuture<ListPredefinedModelsResponse> listPredefinedModels(ListPredefinedModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPredefinedModels").setMethod(HttpMethod.GET).setPathRegex("/model-catalog/providers/{providerType}/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPredefinedModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPredefinedModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the active sessions in a specified running instance to view the current mapping between sessions and instances.</p>
     * <h3>Query scope</h3>
     * <p>Locate the instance by using <code>workspaceId</code>, <code>agentId</code>, and <code>sandboxId</code>. You can obtain the <code>sandboxId</code> from <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxes">ListSandboxes</a>. This operation queries the current active sessions.</p>
     * <h3>Pagination</h3>
     * <p>The default value of <code>maxResults</code> is 20. Valid values: 1 to 100. Omit <code>nextToken</code> in the first request. For subsequent requests, use the returned token as is, and keep the workspace, agent, instance, and page size unchanged. An empty token indicates that no more pages are available.</p>
     * <h3>Session source</h3>
     * <p>The source can be <code>API</code>, <code>CONSOLE_DEBUG</code>, <code>EXTERNAL_CHANNEL</code>, or <code>UNKNOWN</code>. For external channels, the channel type is additionally returned. If no source information is provided, <code>UNKNOWN</code> is returned.</p>
     * 
     * @param request the request parameters of ListSandboxSessions  ListSandboxSessionsRequest
     * @return ListSandboxSessionsResponse
     */
    @Override
    public CompletableFuture<ListSandboxSessionsResponse> listSandboxSessions(ListSandboxSessionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSandboxSessions").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/managed-agents/{agentId}/sandboxes/{sandboxId}/sessions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSandboxSessionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSandboxSessionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the running instances (sandboxes) of an agent to view the instance distribution and current running status.</p>
     * <h3>Filter instances</h3>
     * <p><code>searchText</code> matches Sandbox ID fragments, and <code>sessionId</code> matches current valid session ID fragments. Both are case-insensitive. If both are submitted at the same time, they are combined for filtering.</p>
     * <h3>Pagination and status</h3>
     * <p>The default value of <code>maxResults</code> is 20, and the valid values are 1 to 100. Omit <code>nextToken</code> for the first request. For subsequent requests, use the response token as is, and keep <code>workspaceId</code>, <code>agentId</code>, filter conditions, and <code>maxResults</code> unchanged. An empty token indicates that the query is complete.
     * <code>phase</code> indicates the instance phase, <code>activeSessionCount</code> indicates the number of current active sessions, and <code>maxConcurrentSessions</code> indicates the configured concurrency limit for a single instance. You can query the active sessions of an instance by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListSandboxSessions">ListSandboxSessions</a>.</p>
     * 
     * @param request the request parameters of ListSandboxes  ListSandboxesRequest
     * @return ListSandboxesResponse
     */
    @Override
    public CompletableFuture<ListSandboxesResponse> listSandboxes(ListSandboxesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSandboxes").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/managed-agents/{agentId}/sandboxes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSandboxesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSandboxesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries service endpoints in a workspace with paging to find the access entries for agents or collaboration components.</p>
     * <ul>
     * <li>Use <code>targetType</code>, <code>agentId</code>, <code>agentVersion</code>, <code>resourceBindingId</code>, <code>collaborationComponent</code>, and <code>status</code> to filter the results.</li>
     * <li>Use <code>maxResults</code> to set the number of entries per page. If omitted, the default value is 20.</li>
     * <li>Use the returned <code>nextToken</code> to query the next page.</li>
     * </ul>
     * 
     * @param request the request parameters of ListServiceEndpoints  ListServiceEndpointsRequest
     * @return ListServiceEndpointsResponse
     */
    @Override
    public CompletableFuture<ListServiceEndpointsResponse> listServiceEndpoints(ListServiceEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServiceEndpoints").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/service-endpoints").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the reference relationships of a specified skill to verify its usage before modifying or cleaning up skill assets.</p>
     * 
     * @param request the request parameters of ListSkillReferences  ListSkillReferencesRequest
     * @return ListSkillReferencesResponse
     */
    @Override
    public CompletableFuture<ListSkillReferencesResponse> listSkillReferences(ListSkillReferencesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSkillReferences").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/references").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillReferencesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillReferencesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query of skills in a specified workspace and returns the basic information, version status, and paging information of the skills.</p>
     * 
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    @Override
    public CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSkills").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/skills").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <p>Performs a paging query of teams in a specified workspace.</p>
     * 
     * @param request the request parameters of ListTeams  ListTeamsRequest
     * @return ListTeamsResponse
     */
    @Override
    public CompletableFuture<ListTeamsResponse> listTeams(ListTeamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTeams").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/teams").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTeamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTeamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the application user directory in a workspace for viewing users and selecting team members.</p>
     * 
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    @Override
    public CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUsers").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query of workspaces accessible to the current account for selecting a workspace or viewing a workspace overview.</p>
     * <ul>
     * <li>Use <code>nameLike</code> to filter by name using fuzzy match.</li>
     * <li>Use <code>maxResults</code> to configure the Settings for the number of entries per page. If this parameter is omitted or set to <code>0</code>, the default value is 20.</li>
     * <li>Use <code>nextToken</code> to query the next page during paging, or use <code>skip</code> to skip a specified number of workspaces.
     * The list is sorted in the order of creation. By default, deleted workspaces (with the <code>Deleted</code> status) are not returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    @Override
    public CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkspaces").setMethod(HttpMethod.GET).setPathRegex("/workspaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkspacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkspacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Takes the online version of a specified skill offline so that it is no longer used as the online version.</p>
     * 
     * @param request the request parameters of OfflineSkill  OfflineSkillRequest
     * @return OfflineSkillResponse
     */
    @Override
    public CompletableFuture<OfflineSkillResponse> offlineSkill(OfflineSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OfflineSkill").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/actions/offline").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OfflineSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OfflineSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Sets the specified skill version as the online version.</p>
     * 
     * @param request the request parameters of OnlineSkill  OnlineSkillRequest
     * @return OnlineSkillResponse
     */
    @Override
    public CompletableFuture<OnlineSkillResponse> onlineSkill(OnlineSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OnlineSkill").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/actions/online").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OnlineSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OnlineSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Checks one or more skill ZIP packages uploaded to OSS for skill names, versions, and import conflicts.
     * After the check passes, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UploadSkillViaOss">UploadSkillViaOss</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/BatchUploadSkillsViaOss">BatchUploadSkillsViaOss</a> to import the skills into the workspace.</p>
     * 
     * @param request the request parameters of PrecheckSkillUploadViaOss  PrecheckSkillUploadViaOssRequest
     * @return PrecheckSkillUploadViaOssResponse
     */
    @Override
    public CompletableFuture<PrecheckSkillUploadViaOssResponse> precheckSkillUploadViaOss(PrecheckSkillUploadViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PrecheckSkillUploadViaOss").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skill-actions/precheck-upload-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PrecheckSkillUploadViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PrecheckSkillUploadViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Prepares the receiving endpoint and access token for integrating an enterprise identity system with SCIM user synchronization. The enterprise identity system uses this information to provision users to the shared user pool of AgentCore.
     * SCIM is a user provisioning protocol. The enterprise identity system first sends users to the receiving endpoint, and then AgentCore synchronizes the users from the user pool to the workspace.</p>
     * <h3>Before you begin</h3>
     * <p>A <code>CustomSSO</code> binding has been created by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProvider">CreateIdentityProvider</a>, and the shared user pool is ready. SCIM integration can be performed independently of SAML logon configuration.</p>
     * <h3>What this operation prepares</h3>
     * <p>This operation enables the SCIM receiving endpoint and returns the receiving URL and credential summary:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Current credential status</th>
     * <th>Returned result</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>An unexpired credential with the status of <code>Enabled</code> already exists</td>
     * <td>Reuses the existing credential. The <code>token</code> field returns an empty string <code>&quot;&quot;</code>. Use the previously saved token.</td>
     * </tr>
     * <tr>
     * <td>No available credentials exist</td>
     * <td>Creates a new credential. The <code>token</code> field returns the plaintext of the new token, which is returned only in this response.</td>
     * </tr>
     * <tr>
     * <td>The plaintext of an existing token cannot be queried again. If the token is lost, you can create a new token by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSCIMCredential">CreateIdentityProviderSCIMCredential</a>. A maximum of two credentials can be retained for the same user pool. When the limit is reached, you must delete unused credentials first.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Subsequent configuration</h3>
     * <ol>
     * <li>Configure the returned receiving URL and valid token in the SCIM user provisioning settings of the enterprise identity system.</li>
     * <li>Complete the connection test and user assignment in the enterprise identity system.</li>
     * <li>Enable AgentCore user synchronization by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>, and then query the synchronization result by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a>.</li>
     * </ol>
     * 
     * @param request the request parameters of PrepareIdentityProviderSCIM  PrepareIdentityProviderSCIMRequest
     * @return PrepareIdentityProviderSCIMResponse
     */
    @Override
    public CompletableFuture<PrepareIdentityProviderSCIMResponse> prepareIdentityProviderSCIM(PrepareIdentityProviderSCIMRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PrepareIdentityProviderSCIM").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/scim-provisioning/prepare").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PrepareIdentityProviderSCIMResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PrepareIdentityProviderSCIMResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Publishes a specified skill version and changes its status to published.</p>
     * 
     * @param request the request parameters of PublishSkillVersion  PublishSkillVersionRequest
     * @return PublishSkillVersionResponse
     */
    @Override
    public CompletableFuture<PublishSkillVersionResponse> publishSkillVersion(PublishSkillVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishSkillVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}/actions/publish").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishSkillVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishSkillVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Reverts a specified skill version to an editable draft for further modification.</p>
     * 
     * @param request the request parameters of RedraftSkillVersion  RedraftSkillVersionRequest
     * @return RedraftSkillVersionResponse
     */
    @Override
    public CompletableFuture<RedraftSkillVersionResponse> redraftSkillVersion(RedraftSkillVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RedraftSkillVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}/actions/redraft").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RedraftSkillVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RedraftSkillVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Resets the logon password of a specified user.</p>
     * 
     * @param request the request parameters of ResetUserPassword  ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    @Override
    public CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResetUserPassword").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/users/actions/reset-password").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetUserPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetUserPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Resubmits the creation request for an existing image cache to recreate a cache that has not been successfully created.</p>
     * <h3>Call scope</h3>
     * <p>Pass <code>regionId</code>, <code>workspaceId</code>, and <code>clientToken</code> as query parameters, and use <code>imageId</code> to locate the cache. This operation applies to ACR source caches and re-verifies the source repository authorization before submission.</p>
     * <h3>Query retry results</h3>
     * <p>A successful response indicates that a retry acceptance snapshot is returned, not that the creation is complete. Query the status through <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetImageCache">GetImageCache</a>. <code>READY</code> indicates that the cache is ready. If the status is <code>FAILED</code>, check the <code>error</code> field.
     * The <code>clientToken</code> parameter currently only verifies that the value is not empty and does not guarantee deduplication or recovery of the original acceptance result based on this identifier.</p>
     * 
     * @param request the request parameters of RetryImageCache  RetryImageCacheRequest
     * @return RetryImageCacheResponse
     */
    @Override
    public CompletableFuture<RetryImageCacheResponse> retryImageCache(RetryImageCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetryImageCache").setMethod(HttpMethod.POST).setPathRegex("/image-caches/{imageId}/retry").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryImageCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryImageCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves relevant memories semantically from the long-term memory store (MemoryStore) to help agents obtain the information required for subsequent tasks.</p>
     * 
     * @param request the request parameters of SearchMemories  SearchMemoriesRequest
     * @return SearchMemoriesResponse
     */
    @Override
    public CompletableFuture<SearchMemoriesResponse> searchMemories(SearchMemoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchMemories").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}/memories/search").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMemoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMemoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Submits a specified draft version of an agent template for review.
     * If no release pipeline is configured, the version is directly published online.</p>
     * 
     * @param request the request parameters of SubmitAgentSpecVersion  SubmitAgentSpecVersionRequest
     * @return SubmitAgentSpecVersionResponse
     */
    @Override
    public CompletableFuture<SubmitAgentSpecVersionResponse> submitAgentSpecVersion(SubmitAgentSpecVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitAgentSpecVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}/versions/{agentSpecVersion}/actions/submit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitAgentSpecVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitAgentSpecVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Submits a specified draft version of a skill for review.</p>
     * 
     * @param request the request parameters of SubmitSkillVersion  SubmitSkillVersionRequest
     * @return SubmitSkillVersionResponse
     */
    @Override
    public CompletableFuture<SubmitSkillVersionResponse> submitSkillVersion(SubmitSkillVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitSkillVersion").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/versions/{skillVersion}/actions/submit").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitSkillVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitSkillVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Modifies the configuration of an access application in a workspace to adjust application integration and identity source settings.</p>
     * 
     * @param request the request parameters of UpdateAccessApplication  UpdateAccessApplicationRequest
     * @return UpdateAccessApplicationResponse
     */
    @Override
    public CompletableFuture<UpdateAccessApplicationResponse> updateAccessApplication(UpdateAccessApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAccessApplication").setMethod(HttpMethod.PATCH).setPathRegex("/workspaces/{workspaceId}/access-applications/{applicationId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAccessApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAccessApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the ServiceEndpoint, enablement status, or channel behavior configuration bound to an IM channel.
     * At least one updatable field must be provided.</p>
     * 
     * @param request the request parameters of UpdateAgentIMChannel  UpdateAgentIMChannelRequest
     * @return UpdateAgentIMChannelResponse
     */
    @Override
    public CompletableFuture<UpdateAgentIMChannelResponse> updateAgentIMChannel(UpdateAgentIMChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentIMChannel").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels/{imChannelId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentIMChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentIMChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Replaces the access credentials for an IM channel to rotate keys or correct authentication configurations.
     * Submit the complete new credentials. The response does not return plaintext secrets.</p>
     * 
     * @param request the request parameters of UpdateAgentIMChannelCredential  UpdateAgentIMChannelCredentialRequest
     * @return UpdateAgentIMChannelCredentialResponse
     */
    @Override
    public CompletableFuture<UpdateAgentIMChannelCredentialResponse> updateAgentIMChannelCredential(UpdateAgentIMChannelCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentIMChannelCredential").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agents/{agentId}/im-channels/{imChannelId}/actions/update-credential").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentIMChannelCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentIMChannelCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the business tags, version tags, and visibility scope of a specified agent template. Fields not provided remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateAgentSpec  UpdateAgentSpecRequest
     * @return UpdateAgentSpecResponse
     */
    @Override
    public CompletableFuture<UpdateAgentSpecResponse> updateAgentSpec(UpdateAgentSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentSpec").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/agent-specs/{agentSpecName}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the API key or service account key collection for an enabled QoderCLI connector.
     * When updating service account keys, existing keys are matched by their record <code>id</code>.</p>
     * 
     * @param request the request parameters of UpdateConnector  UpdateConnectorRequest
     * @return UpdateConnectorResponse
     */
    @Override
    public CompletableFuture<UpdateConnectorResponse> updateConnector(UpdateConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConnector").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/connectors/{connectorName}/actions/update").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the content, description, or MCP header application scope of a specified credential.</p>
     * <h3>Update rules</h3>
     * <p>You must modify at least one of the credential content, description, or application scope. When modifying only the application scope, you do not need to submit credentialMetadata or description.</p>
     * <ul>
     * <li>Omit credentialMetadata: The original credential content is retained. If provided, submit a JSON string according to the original credential type.</li>
     * <li>Omit description: The original description is retained.</li>
     * <li>The credential name and credentialType cannot be modified.</li>
     * </ul>
     * <h3>MCP header application scope</h3>
     * <p>Only mcpHeader supports updating the application scope. For apiKey, do not submit resourceScope or resourceRefs.</p>
     * <ul>
     * <li>Omit both the scope and the resource list: The original configuration is retained.</li>
     * <li>Submit resourceRefs: You must also submit resourceScope.</li>
     * <li>resourceScope=ALL: Omit resourceRefs.</li>
     * <li>resourceScope=SPECIFIED: Submit resourceRefs. An empty array [] is allowed during updates. For each item, specify resourceType=mcpServer and resourceId.</li>
     * </ul>
     * <h3>Query results</h3>
     * <p>After the update, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCredential">GetCredential</a> to query the current configuration and the masked credential content.</p>
     * 
     * @param request the request parameters of UpdateCredential  UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    @Override
    public CompletableFuture<UpdateCredentialResponse> updateCredential(UpdateCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCredential").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/credentials/{credentialId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the deployment artifact or runtime configuration of a custom code or image agent to release new code, images, or configurations.</p>
     * <h3>Update rules</h3>
     * <p>Updates a custom code or image agent in a specified workspace. You must provide at least one top-level field to update. Omitted top-level fields retain their original configurations.
     * The update rules for each configuration are as follows.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Configuration</th>
     * <th>Update method and precautions</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>name</code></td>
     * <td>Omit to retain the original name. The value cannot be <code>null</code> or an empty string.</td>
     * </tr>
     * <tr>
     * <td><code>description</code></td>
     * <td>Omit to retain the original description. Pass <code>null</code> to clear the description.</td>
     * </tr>
     * <tr>
     * <td><code>artifact</code></td>
     * <td>When submitting, specify <code>port</code> and the required fields for the selected source. To retain a custom startup command, also specify <code>entrypoint</code>. <code>code</code> and <code>container</code> are mutually exclusive.</td>
     * </tr>
     * <tr>
     * <td><code>runtime</code></td>
     * <td>When submitting, specify both <code>compute</code> and <code>sessionPolicy</code>. To retain the elastic policy, submit the complete <code>hpa</code>.</td>
     * </tr>
     * <tr>
     * <td><code>environment</code></td>
     * <td>The environment variable list is replaced as a whole. You must include all variables that need to be retained.</td>
     * </tr>
     * <tr>
     * <td><code>network</code></td>
     * <td>When submitting, omitted access items are treated as allowed. To retain access restrictions, specify both <code>accessInternet</code> and <code>accessVpc</code>.</td>
     * </tr>
     * <tr>
     * <td><code>healthCheck</code></td>
     * <td>When submitting, you must specify <code>port</code>. Other unspecified configurations use default values. Pass <code>null</code> to remove the health check.</td>
     * </tr>
     * <tr>
     * <td><code>logging</code></td>
     * <td>When submitting <code>logging.sls</code>, specify non-empty <code>project</code> and <code>logstore</code> at the same time.</td>
     * </tr>
     * <tr>
     * <td><code>protocol</code>, <code>ossMounts</code>, <code>agenticFsMounts</code></td>
     * <td>When submitting, the corresponding list is replaced as a whole. Pass <code>[]</code> to clear the corresponding list. <code>agenticFsMounts</code> does not accept <code>null</code>.</td>
     * </tr>
     * </tbody></table>
     * <h3>Deployment artifacts</h3>
     * <p>Three deployment methods are supported: code packages, ACR images, and custom images. When updating or switching the deployment method, provide the configuration according to the target method.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Deployment method</th>
     * <th>Configuration requirements</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>ACR image</td>
     * <td>When updating the image tag, also provide <code>artifact.port</code>, as well as <code>type=acr</code>, <code>instanceId</code>, <code>namespace</code>, <code>repo</code>, and <code>tag</code> in <code>artifact.container</code>. To retain a custom startup command, also provide <code>entrypoint</code>.</td>
     * </tr>
     * <tr>
     * <td>Custom image</td>
     * <td>Set <code>artifact.container.type=custom</code>, provide the complete <code>customImage</code>, and provide <code>clientToken</code> in the query parameters. When switching to this method, also specify <code>artifact.port</code>. Do not include ACR instance, namespace, repository, and tag fields in <code>container</code>.</td>
     * </tr>
     * <tr>
     * <td>Code package</td>
     * <td>Provide <code>artifact.port</code>, as well as <code>sourceUri</code>, <code>languageRuntime</code>, and <code>entrypoint</code> in <code>artifact.code</code>. Do not commit <code>container</code> at the same time.</td>
     * </tr>
     * <tr>
     * <td><strong>Custom image</strong></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><code>customImage</code> must include the complete image address <code>image</code> and the independent pull network <code>pullNetwork</code>. The image address does not include a protocol or user information, and supports addresses with tags or digests.</li>
     * <li>For public network pulling, set <code>pullNetwork.type=public</code> and do not include VPC fields. For VPC pulling, set <code>type=vpc</code> and provide <code>vpcId</code>, <code>vSwitchId</code>, and <code>securityGroupId</code> at the same time. The image pull network and the agent runtime network are configured separately.</li>
     * <li>When repository authentication is required, provide non-empty <code>username</code> and <code>password</code> at the same time. For anonymous access, omit both. The response does not return the password.</li>
     * <li>Omitting the entire <code>customImage</code> retains the saved image source. Commit the complete object when updating the custom image source. You do not need to resubmit this object when only adjusting the runtime configuration.</li>
     * <li>Custom images and code packages do not support enabling <code>useImageCache</code>. The value in the final configuration must be <code>false</code>. When this field is omitted for a custom image, it is treated as <code>false</code>. When switching to a code package, if the original configuration is <code>true</code>, you must explicitly change it to <code>false</code>. When updating other sources, omitting this field retains the original value.
     * <strong>Code package</strong></li>
     * <li>Supports ZIP or TAR.GZ. The compressed package size cannot exceed <code>500000000</code> bytes. Dependencies are packaged by the invoker. The platform does not execute online builds or install dependencies.</li>
     * <li>Query the active <code>languageRuntime</code> values by invoking <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListAgentCodeRuntimes">ListAgentCodeRuntimes</a>.</li>
     * <li><code>sourceUri</code> supports <code>oss://</code> addresses or HTTPS object addresses of standard OSS public domain name, including signed URLs.</li>
     * <li>For local code packages, first invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageUploadUrl">GetAgentCodePackageUploadUrl</a>, upload the file according to the response information, and then commit the returned <code>sourceUri</code>.</li>
     * <li>The new source is verified for read permissions, objects, and size before acceptance, and is transferred to a fixed copy on the platform. If the transfer failed, the current agent configuration is not saved. Common updates can reuse the saved fixed code package address.</li>
     * </ul>
     * <h3>Runtime configuration and elasticity</h3>
     * <p>Omitting the entire <code>runtime</code> retains the original runtime configuration. When submitting <code>runtime</code>, you must specify both <code>compute</code> and <code>sessionPolicy</code>.
     * If you submit <code>runtime</code> but omit <code>hpa</code>, or omit some fields in <code>hpa</code>, the unspecified items use the following default values. <strong>To retain the existing elastic policy, submit the complete <code>hpa</code>.</strong></p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>enabled</code></td>
     * <td><code>false</code></td>
     * <td>Specifies whether elastic scaling is enabled.</td>
     * </tr>
     * <tr>
     * <td><code>minSandboxCount</code></td>
     * <td><code>1</code></td>
     * <td>The minimum number of instances.</td>
     * </tr>
     * <tr>
     * <td><code>maxSandboxCount</code></td>
     * <td><code>10</code></td>
     * <td>The maximum number of instances, which cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td><code>maxConcurrentSessionsPerSandbox</code></td>
     * <td><code>20</code></td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td><code>sessionTtlSeconds</code></td>
     * <td><code>600</code></td>
     * <td>The maximum idle time of a session, in seconds.</td>
     * </tr>
     * <tr>
     * <td>The upper and lower limits of the number of instances are configuration values. Query the current number of instances through <code>sandboxPhaseCounts</code>.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When <code>sessionPolicy.type=ISOLATED_HEADER_FIELD</code>, you must specify a valid HTTP request header name <code>headerName</code>. Do not specify <code>headerName</code> for other session policies.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Network and mounts</h3>
     * <p>Omitting the entire <code>network</code> retains the original configuration. When submitting this object, omitted access items are treated as allowed on the agent side, and actual access is restricted by the workspace network configuration.
     * To retain the original restrictions, submit both <code>accessInternet.enabled</code> and <code>accessVpc.enabled</code> at the same time. Do not submit only one of them.
     * The total number of <code>ossMounts</code> and <code>agenticFsMounts</code> cannot exceed 10. When updating either list, you must include all mount items that need to be retained in the list. The two lists are updated separately. You can use <code>agenticFsMounts=[]</code> to clear AgenticFS mounts, but you cannot use <code>null</code> to clear them.
     * In this operation, ACR images, custom images, and code packages all use the same user mount target rules: <code>mountPath</code> is the absolute path in the container, such as <code>/data/train</code>, and must not conflict with platform reserved directories. Mount targets must not be duplicated or form parent-child directory overwrites.</p>
     * <h3>Environment variables</h3>
     * <p>Omitting the entire <code>environment</code> retains the original configuration. When submitting <code>environment.variables</code>, the original list is replaced as a whole with the current list. You must include all variables that need to be retained.
     * The following methods all clear the environment variables configured by the user:</p>
     * <ul>
     * <li><code>environment.variables=[]</code>.</li>
     * <li><code>environment=null</code>.</li>
     * <li>Submit <code>environment</code> but omit <code>variables</code>, such as <code>environment={}</code>.
     * Variable names must be non-empty and unique in the list. Variable values must be strings, and empty strings are allowed.</li>
     * </ul>
     * <h3>Health checks and logs</h3>
     * <p>Omitting the entire <code>healthCheck</code> retains the original configuration. Pass <code>null</code> to remove the health check. When submitting this object, you must specify <code>port</code>. Other unspecified items use the following default values.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>path</code></td>
     * <td><code>/healthz</code></td>
     * </tr>
     * <tr>
     * <td><code>intervalSeconds</code></td>
     * <td><code>10</code> seconds</td>
     * </tr>
     * <tr>
     * <td><code>timeoutSeconds</code></td>
     * <td><code>2</code> seconds</td>
     * </tr>
     * <tr>
     * <td><code>unhealthyThreshold</code></td>
     * <td><code>3</code> times</td>
     * </tr>
     * <tr>
     * <td>The health check port ranges from 1 to 65535. Health Check Interval, timeout period, and failure threshold must be positive integers, and the timeout period must be less than Health Check Interval. Do not submit <code>healthyThreshold</code>.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When configuring log delivery, <code>logging.sls.project</code> and <code>logging.sls.logstore</code> must be provided at the same time and cannot be empty.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Asynchronous results and retries</h3>
     * <p><code>success=true</code> indicates that the update request has been accepted. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetCustomAgent">GetCustomAgent</a> to query the configuration processing result.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Purpose</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>latestSpecVersion</code></td>
     * <td>The latest expected configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>effectiveSpecVersion</code></td>
     * <td>The effective configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestVersionStatus</code></td>
     * <td>The processing status of the latest expected configuration version.</td>
     * </tr>
     * <tr>
     * <td><code>latestExecutionError</code></td>
     * <td>The reason why the latest configuration is waiting for a retry or fails to be executed, and whether to automatically retry.</td>
     * </tr>
     * <tr>
     * <td><code>status</code></td>
     * <td>The overall status of the agent.</td>
     * </tr>
     * <tr>
     * <td><code>sandboxPhaseCounts</code></td>
     * <td>A snapshot of the number of instances counted by phase.</td>
     * </tr>
     * <tr>
     * <td>When <code>latestVersionStatus</code> is <code>pending</code>, <code>processing</code>, or <code>waiting_retry</code>, you can continue to query later. <code>succeeded</code> indicates that the configuration is processed successfully. When the value is <code>failed</code>, troubleshoot the configuration based on <code>latestExecutionError</code>.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When explicitly submitting <code>customImage</code> or explicitly setting <code>artifact.container.type=custom</code>, you must provide <code>clientToken</code> in the query parameters. You can also optionally pass this parameter when updating ACR images or code packages to reuse the acceptance result of the same submission. The identifier is 1 to 128 characters in length and can contain letters, digits, periods, underscores, colons, and hyphens.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>When retrying the same submission, reuse the original <code>clientToken</code>. The service returns the existing acceptance result based on the tenant, workspace, and this identifier. Use a new identifier when modifying the submission content.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of UpdateCustomAgent  UpdateCustomAgentRequest
     * @return UpdateCustomAgentResponse
     */
    @Override
    public CompletableFuture<UpdateCustomAgentResponse> updateCustomAgent(UpdateCustomAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCustomAgent").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/custom-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <p>Updates the model, instruction, tool, or skill configurations saved on the platform side for a managed agent to adjust its capability configurations after integration.</p>
     * <h3>Update rules</h3>
     * <p>Provide at least one updatable field. Omitted top-level fields retain their original configurations. You can set description=null to clear the description. The tools and skills fields are replaced as a whole upon submission. You must include the items to be retained, or pass [] to clear the corresponding explicit lists.</p>
     * <h3>Switch model sources</h3>
     * <ul>
     * <li>To switch to PLATFORM, provide modelSource=PLATFORM and a valid model configuration, including the model connection ID and model name.</li>
     * <li>To switch to RUNTIME, change the Settings to modelSource=RUNTIME and do not commit the platform model. The original platform model configuration is removed when the source is switched.
     * When a template is used, configurations belonging to the template such as instructions are read from the template. A successful update indicates that the request is accepted. Invoke <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetExternalAgent">GetExternalAgent</a> to query the configuration version and external accessed state. The clientToken parameter does not provide idempotence guarantees at this time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateExternalAgent  UpdateExternalAgentRequest
     * @return UpdateExternalAgentResponse
     */
    @Override
    public CompletableFuture<UpdateExternalAgentResponse> updateExternalAgent(UpdateExternalAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateExternalAgent").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/external-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExternalAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExternalAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Modifies the logon or directory configuration of a bound enterprise identity provider to update enterprise application credentials, adjust synchronized departments, or configure custom single sign-on.</p>
     * <h3>Select the configuration to modify</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Identity provider</th>
     * <th>Updatable content</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>DingTalk (DingTalk), Feishu (Feishu)</td>
     * <td>Enterprise application credentials metadata, logon switch loginEnabled, directory change synchronization switch syncEnabled, and synchronization scope syncScope. You must submit at least one item.</td>
     * </tr>
     * <tr>
     * <td>Custom identity provider (CustomSSO)</td>
     * <td>SAML protocol protocol, logon configuration saml, and logon switch loginEnabled. SCIM-based user synchronization is configured separately by using <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateIdentityProviderSCIM">UpdateIdentityProviderSCIM</a>.</td>
     * </tr>
     * </tbody></table>
     * <h3>Update DingTalk or Feishu</h3>
     * <p>metadata is updated by field: submit only the fields that need to be modified. Omitted fields and existing keys remain unchanged. Provided values must be non-empty strings. When you enable directory change synchronization, the configuration must include encryptKey and verificationToken.
     * To adjust synchronized departments:
     * <strong>Step 1:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListIdentityProviderDepartments">ListIdentityProviderDepartments</a> to query and select departments.
     * <strong>Step 2:</strong> Save syncScope by using this operation. If you omit this field or pass null, the current scope is retained.
     * <strong>Step 3:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to wait for the configuration processing to complete, and then call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateIdentityProviderSyncJob">CreateIdentityProviderSyncJob</a> to synchronize users based on the new scope.
     * Saving the scope does not automatically trigger a full synchronization. syncEnabled controls subsequent directory change events. The initial synchronization and manual synchronization are executed separately.</p>
     * <h3>Configure custom single sign-on</h3>
     * <p>CustomSSO uses the SAML protocol to allow users to log on through the enterprise identity system. First, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderServiceProvider">GetIdentityProviderServiceProvider</a> to obtain the access information of AgentCore and configure it in the enterprise identity system. Then, fill in the enterprise-side information in saml.
     * Choose one of the following two methods:</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Method</th>
     * <th>Required configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Import metadata</td>
     * <td>metadataXml: a single IdP metadata XML text exported from the enterprise identity provider, with a maximum size of 1 MiB. Enter the XML content instead of a download URL or file path.</td>
     * </tr>
     * <tr>
     * <td>Manual entry</td>
     * <td>Provide entityId, loginUrl, bindingType, and x509Certificates at the same time. Use an HTTPS logon URL and a valid signing certificate. Set bindingType to HTTP-Redirect or HTTP-POST. You can provide up to two certificates.</td>
     * </tr>
     * <tr>
     * <td>The entityId cannot be changed after it is saved. If the XML contains both binding methods, HTTP-POST and its corresponding URL take precedence.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>After saving the configuration, set loginEnabled=true to enable logon. You can also enable it when submitting a valid SAML configuration. Setting it to false disables logon and retains the existing configuration.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Confirm that the configuration takes effect</h3>
     * <p>After the request is accepted, UPDATING is usually returned. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProvider">GetIdentityProvider</a> to query the progress. READY indicates that the configuration processing is complete. If it fails, check the returned status and configuration.
     * If the request times out, query the current configuration and processing status first, and then decide whether to retry. Query the SCIM processing result by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a>.</p>
     * 
     * @param request the request parameters of UpdateIdentityProvider  UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    @Override
    public CompletableFuture<UpdateIdentityProviderResponse> updateIdentityProvider(UpdateIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateIdentityProvider").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/identity-providers/{identityProviderType}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIdentityProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIdentityProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Enables or disables SCIM user synchronization for AgentCore. When enabled, all existing users in the shared user pool are fully imported into the workspace. Users in the user pool are provisioned by the enterprise identity system through SCIM.</p>
     * <h3>Preparations</h3>
     * <p><strong>Step 1:</strong> Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to enable the receiving endpoint and obtain the receiving URL and a valid token.
     * <strong>Step 2:</strong> Complete the SCIM configuration, connection test, and user assignment in the enterprise identity system.
     * <strong>Step 3:</strong> Call this operation and set syncEnabled to true.</p>
     * <pre><code class="language-http">PUT /workspaces/{workspaceId}/scim-provisioning
     * {&quot;syncEnabled&quot;:true}
     * </code></pre>
     * <p>When the enabling task is executed, the system checks whether the receiving endpoint is enabled and whether valid credentials exist. If no users are provisioned in the enterprise identity system, the initial import may succeed but contain no user records.</p>
     * <h3>Impact of disabling</h3>
     * <p>Setting syncEnabled to false disables user synchronization and the upstream SCIM receiving endpoint, but retains the imported users, existing credentials, and SAML logon configuration.
     * To re-enable the feature later, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/PrepareIdentityProviderSCIM">PrepareIdentityProviderSCIM</a> to prepare the receiving endpoint first, and then enable synchronization.</p>
     * <h3>Verify the operation result</h3>
     * <p>After this operation accepts the request, it executes the enabling or disabling task in the background. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetIdentityProviderSCIM">GetIdentityProviderSCIM</a> to query the progress:</p>
     * <ul>
     * <li>syncEnabled indicates whether synchronization is expected to be enabled or disabled.</li>
     * <li>operationStatus indicates the execution result of the most recent operation.</li>
     * <li>The status field in the query operation comprehensively indicates the current stage of SCIM, such as pending configuration, processing, available, or disabled.
     * If the operation fails, the saved syncEnabled value is not automatically rolled back. Verify the configuration based on the operation result before deciding on subsequent actions.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateIdentityProviderSCIM  UpdateIdentityProviderSCIMRequest
     * @return UpdateIdentityProviderSCIMResponse
     */
    @Override
    public CompletableFuture<UpdateIdentityProviderSCIMResponse> updateIdentityProviderSCIM(UpdateIdentityProviderSCIMRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateIdentityProviderSCIM").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/scim-provisioning").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIdentityProviderSCIMResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIdentityProviderSCIMResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the model, instructions, skills, or runtime configuration of a managed Harness agent to adjust the capabilities and runtime behavior of an existing agent.</p>
     * <h3>Update rules</h3>
     * <p>At least one updatable field must be provided. Omitted top-level fields retain their original configuration. You can set description=null to clear the description.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Configuration</th>
     * <th>Update method</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>harness</td>
     * <td>The type cannot be changed. When updating the qodercli account binding, keep the original type and submit the corresponding configuration.</td>
     * </tr>
     * <tr>
     * <td>model</td>
     * <td>Provide a model configuration that matches the current Harness. For qwenpaw, specify the model connection ID and model name. For qodercli, use the available model identifier of the connector.</td>
     * </tr>
     * <tr>
     * <td>runtime</td>
     * <td>Specify both compute and sessionPolicy when submitting. Omitting the entire object retains the original runtime configuration.</td>
     * </tr>
     * <tr>
     * <td>tools, skills, promptVariables, and subAgents</td>
     * <td>The corresponding lists are entirely replaced upon submission. You must include the items to be retained. Pass [] to clear the corresponding explicit list.</td>
     * </tr>
     * <tr>
     * <td>environment</td>
     * <td>The variable list and credential reference list are entirely replaced respectively. Submit the items to be retained together.</td>
     * </tr>
     * <tr>
     * <td>network</td>
     * <td>Specify both accessInternet.enabled and accessVpc.enabled when submitting.</td>
     * </tr>
     * <tr>
     * <td>ossMounts and agenticFsMounts</td>
     * <td>Entirely replaced respectively. Pass [] to clear the corresponding list. agenticFsMounts does not accept null.</td>
     * </tr>
     * </tbody></table>
     * <h3>Harness, templates, and skills</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Harness</th>
     * <th>Model and connector configuration</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>qwenpaw</td>
     * <td>This type is used by default if harness is omitted during creation. Set model.modelConnectionId to the workspace model connection ID, and set model.modelName to the name of the model created under this connection.</td>
     * </tr>
     * <tr>
     * <td>qodercli</td>
     * <td>The qodercli Connector must be enabled in the workspace. Set model.modelConnectionId to the model identifier returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectorModels">ListConnectorModels</a>. model.modelName can be omitted.</td>
     * </tr>
     * <tr>
     * <td>harness is an object, such as {&quot;type&quot;:&quot;qwenpaw&quot;}. For qodercli, set harness.configuration.connectorServiceAccountKey to the account key record ID returned by <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ListConnectors">ListConnectors</a>, not the original Service Account Key. This field can be omitted if there is only one key record, but must be specified if there are multiple records. connectorServiceAccountName is the account name. Do not specify these two binding fields for qwenpaw.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>skills uses the Skill names in the workspace AI Registry. If sourceType=REFERENCE, the version is referenced by versionSelector: use LABEL with a label name, or VERSION with a specific version number. If the selector is omitted, LABEL/latest is used. If sourceType=STATIC, static files bundled with the package are used, and no version selector is provided.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>For template.aiRegistry, specify the agent template name and an optional version. If the version is omitted during creation, the published version is resolved and fixed. When a template is used, instruction, promptVariables, and subAgents are derived from the template, and the corresponding fields in the current request do not take effect. Explicit Skills and template Skills are recorded separately. You can query the target and effective versions through configuredSkills and skills.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Elasticity and instances</h3>
     * <p>If runtime is committed but hpa or some of its fields are omitted, the following default values are used for unspecified items. To retain the existing elastic policy, commit the complete hpa together.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Field</th>
     * <th>Default value</th>
     * <th>Value and description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>enabled</td>
     * <td>false</td>
     * <td>Specifies whether to enable elastic scaling.</td>
     * </tr>
     * <tr>
     * <td>minSandboxCount</td>
     * <td>1</td>
     * <td>The minimum number of instances. Valid values: 0 to 100.</td>
     * </tr>
     * <tr>
     * <td>maxSandboxCount</td>
     * <td>10</td>
     * <td>The maximum number of instances. Valid values: 0 to 100. The value cannot be less than the minimum number.</td>
     * </tr>
     * <tr>
     * <td>maxConcurrentSessionsPerSandbox</td>
     * <td>20</td>
     * <td>The maximum number of concurrent sessions per instance. Valid values: 1 to 20.</td>
     * </tr>
     * <tr>
     * <td>sessionTtlSeconds</td>
     * <td>600</td>
     * <td>The maximum idle time for a session, in seconds. Valid values: 60 to 86400.</td>
     * </tr>
     * <tr>
     * <td>If you only modify instructions, models, or skills, you can omit the entire runtime object, and the original runtime configuration remains unchanged. The minimum and maximum numbers of instances are configuration borders. You can query the actual number through sandboxPhaseCounts.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Environment and mounts</h3>
     * <p>Omitting the entire environment object retains the original configuration. Submitting environment={} or environment=null clears the environment configuration. Environment variable values must be strings, and variable names must be non-empty and unique.
     * The total number of ossMounts and agenticFsMounts cannot exceed 10. The mount target mountPath uses an absolute path in the container, such as /data/train. It cannot conflict with platform reserved directories, and cannot be duplicated or form parent-child directory overwrites.
     * The path for an OSS mount must be a non-empty directory prefix in the bucket. For an AgenticFS mount, server is the AccessPoint domain name, without a protocol, port, or path. path is an existing non-empty relative directory in the AccessPoint. You cannot mount the root directory of the AccessPoint. If readOnly is omitted, the default value is false.</p>
     * <h3>Query update results</h3>
     * <p>A successful response indicates that the update request has been accepted. Call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetManagedAgent">GetManagedAgent</a> to query latestSpecVersion, latestVersionStatus, status, and sandboxPhaseCounts to confirm the configuration processing and instance status. clientToken does not provide idempotency guarantees at this time.</p>
     * 
     * @param request the request parameters of UpdateManagedAgent  UpdateManagedAgentRequest
     * @return UpdateManagedAgentResponse
     */
    @Override
    public CompletableFuture<UpdateManagedAgentResponse> updateManagedAgent(UpdateManagedAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateManagedAgent").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/managed-agents/{agentId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateManagedAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateManagedAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the address, description, authentication, or Swagger configuration of an MCP service. The service type and protocol cannot be modified after creation.
     * The update process is executed asynchronously. After submission, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetMcp">GetMcp</a> to query the processing result. The <code>clientToken</code> parameter does not currently provide idempotency guarantees. If the request result is not confirmed, query the current configuration and status first.</p>
     * 
     * @param request the request parameters of UpdateMcp  UpdateMcpRequest
     * @return UpdateMcpResponse
     */
    @Override
    public CompletableFuture<UpdateMcpResponse> updateMcp(UpdateMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMcp").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/mcp-servers/{mcpServerId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMcpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMcpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates parameters based on the marketplace template bound to the MCP service to adjust the configuration of the templated service.
     * Updates the parameters exposed by the schema using the same template version bound during MCP creation, without upgrading the template version.</p>
     * 
     * @param request the request parameters of UpdateMcpTemplateConfig  UpdateMcpTemplateConfigRequest
     * @return UpdateMcpTemplateConfigResponse
     */
    @Override
    public CompletableFuture<UpdateMcpTemplateConfigResponse> updateMcpTemplateConfig(UpdateMcpTemplateConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMcpTemplateConfig").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/mcp-servers/{mcpServerId}/template-config").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMcpTemplateConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMcpTemplateConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the long-term memory text or metadata based on the memory ID.</p>
     * 
     * @param request the request parameters of UpdateMemory  UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    @Override
    public CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMemory").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the mutable configurations of a long-term memory store to adjust the settings of an existing memory store.</p>
     * 
     * @param request the request parameters of UpdateMemoryStore  UpdateMemoryStoreRequest
     * @return UpdateMemoryStoreResponse
     */
    @Override
    public CompletableFuture<UpdateMemoryStoreResponse> updateMemoryStore(UpdateMemoryStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMemoryStore").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/memorystores/{memoryStoreName}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMemoryStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMemoryStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the description, context length, maximum output length, or capability configuration of a model.</p>
     * <h3>Update rules</h3>
     * <ul>
     * <li>Provide at least one non-null field among description, contextSize, maxTokens, and capabilities.</li>
     * <li>Omitted fields or fields passed as null retain their original values.</li>
     * <li>The capabilities object is replaced as a whole. Unsubmitted capabilities within the object are treated as false.</li>
     * </ul>
     * <h3>Impact on agents</h3>
     * <p>After contextSize, maxTokens, or capabilities actually change, the platform asynchronously refreshes the managed Harness agents that reference this model, as well as the managed agents that use platform models (modelSource=PLATFORM). Modifying only the description or repeatedly submitting the same configuration does not trigger a refresh.
     * A successful response indicates that the model configuration has been saved. Verify the configuration by calling <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetModel">GetModel</a>, and then check whether the configuration takes effect by calling the corresponding agent details API operation.</p>
     * 
     * @param request the request parameters of UpdateModel  UpdateModelRequest
     * @return UpdateModelResponse
     */
    @Override
    public CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModel").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/models/{modelId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the mutable configurations of a specified model connection and resubmits the publishing task. The invocation protocol cannot be modified after creation.</p>
     * 
     * @param request the request parameters of UpdateModelConnection  UpdateModelConnectionRequest
     * @return UpdateModelConnectionResponse
     */
    @Override
    public CompletableFuture<UpdateModelConnectionResponse> updateModelConnection(UpdateModelConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateModelConnection").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/model-connections/{connectionId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the business tags of a specified skill. Other attributes that are not specified remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateSkillBizTags  UpdateSkillBizTagsRequest
     * @return UpdateSkillBizTagsResponse
     */
    @Override
    public CompletableFuture<UpdateSkillBizTagsResponse> updateSkillBizTags(UpdateSkillBizTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSkillBizTags").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/biz-tags").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSkillBizTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSkillBizTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the version labels and their mappings for a specified skill.</p>
     * 
     * @param request the request parameters of UpdateSkillLabels  UpdateSkillLabelsRequest
     * @return UpdateSkillLabelsResponse
     */
    @Override
    public CompletableFuture<UpdateSkillLabelsResponse> updateSkillLabels(UpdateSkillLabelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSkillLabels").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/labels").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSkillLabelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSkillLabelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the visibility scope of a specified skill.</p>
     * 
     * @param request the request parameters of UpdateSkillScope  UpdateSkillScopeRequest
     * @return UpdateSkillScopeResponse
     */
    @Override
    public CompletableFuture<UpdateSkillScopeResponse> updateSkillScope(UpdateSkillScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSkillScope").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/skills/{skillName}/scope").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSkillScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSkillScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the description and members of a specified team.</p>
     * 
     * @param request the request parameters of UpdateTeam  UpdateTeamRequest
     * @return UpdateTeamResponse
     */
    @Override
    public CompletableFuture<UpdateTeamResponse> updateTeam(UpdateTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTeam").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/teams/{teamId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the display name, email address, or note of a specified user.</p>
     * 
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    @Override
    public CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateUser").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}/users/{agentCoreUserId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Modifies the name or network configuration of a workspace to adjust workspace information and the private network access environment for agents.
     * The workspace must be in the <code>Initialized</code> state. To enable VPC networking, set <code>Enabled</code> in the network configuration to <code>true</code>, and provide both <code>VpcId</code> and at least one <code>VSwitchIds</code>.</p>
     * 
     * @param request the request parameters of UpdateWorkspace  UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     */
    @Override
    public CompletableFuture<UpdateWorkspaceResponse> updateWorkspace(UpdateWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateWorkspace").setMethod(HttpMethod.PUT).setPathRegex("/workspaces/{workspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves an uploaded agent template ZIP package from OSS, parses the package, and imports the agent template into the current workspace.</p>
     * 
     * @param request the request parameters of UploadAgentSpecViaOss  UploadAgentSpecViaOssRequest
     * @return UploadAgentSpecViaOssResponse
     */
    @Override
    public CompletableFuture<UploadAgentSpecViaOssResponse> uploadAgentSpecViaOss(UploadAgentSpecViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UploadAgentSpecViaOss").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-spec-actions/upload-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadAgentSpecViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadAgentSpecViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Imports a skill into the current workspace by retrieving and parsing an uploaded skill ZIP package from OSS.</p>
     * 
     * @param request the request parameters of UploadSkillViaOss  UploadSkillViaOssRequest
     * @return UploadSkillViaOssResponse
     */
    @Override
    public CompletableFuture<UploadSkillViaOssResponse> uploadSkillViaOss(UploadSkillViaOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UploadSkillViaOss").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/skill-actions/upload-via-oss").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadSkillViaOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadSkillViaOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Checks the read conditions and package information of a specified OSS object before submitting the code package for deployment, and obtains the source URI for subsequent deployment.</p>
     * <h3>Request and validation scope</h3>
     * <p>In the JSON request body, specify <code>ossBucketName</code> and the complete <code>ossObjectName</code>. Do not specify the HTTPS download URL. The object extension must be ZIP or TAR.GZ, and the compressed size must be between 1 and 500,000,000 bytes.
     * This operation uses the workspace role to check the object metadata and read permissions, and returns the <code>sourceUri</code>, file name, size, and format.</p>
     * <h3>Subsequent deployment</h3>
     * <p>Passing the validation indicates that the object check is successful, but does not mean that the archive content is complete or ready to start. Submit the returned <code>sourceUri</code> to <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/CreateCustomAgent">CreateCustomAgent</a> or <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/UpdateCustomAgent">UpdateCustomAgent</a>. The system will recheck and save a fixed copy upon submission.
     * This operation is an optional precheck and is not a required step for creation or update.</p>
     * 
     * @param request the request parameters of ValidateAgentCodePackageFromOss  ValidateAgentCodePackageFromOssRequest
     * @return ValidateAgentCodePackageFromOssResponse
     */
    @Override
    public CompletableFuture<ValidateAgentCodePackageFromOssResponse> validateAgentCodePackageFromOss(ValidateAgentCodePackageFromOssRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ValidateAgentCodePackageFromOss").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-code-packages/validate-from-oss").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateAgentCodePackageFromOssResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateAgentCodePackageFromOssResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries whether the read authorization for the code package source bucket is bound to the workspace resource role to determine whether supplementary authorization is required.</p>
     * <h3>Query results</h3>
     * <p><code>ossBucketName</code> is passed as a query parameter. <code>authorizationStatus=AUTHORIZED</code> indicates that the policy is bound, and <code>UNAUTHORIZED</code> indicates that it is not bound.
     * A bound policy does not mean that a specific code package object definitely exists or is readable. To check the object, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/ValidateAgentCodePackageFromOss">ValidateAgentCodePackageFromOss</a>. To obtain the authorization link, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetAgentCodePackageOssRamAuthorizeUrl">GetAgentCodePackageOssRamAuthorizeUrl</a>.</p>
     * 
     * @param request the request parameters of VerifyAgentCodePackageOssRamAuthorization  VerifyAgentCodePackageOssRamAuthorizationRequest
     * @return VerifyAgentCodePackageOssRamAuthorizationResponse
     */
    @Override
    public CompletableFuture<VerifyAgentCodePackageOssRamAuthorizationResponse> verifyAgentCodePackageOssRamAuthorization(VerifyAgentCodePackageOssRamAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("VerifyAgentCodePackageOssRamAuthorization").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/agent-code-packages/oss/authorize/verify").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyAgentCodePackageOssRamAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyAgentCodePackageOssRamAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Verifies Qoder service account keys for a specified site to check whether the credentials are available before enabling or updating a connector. You can submit multiple keys at the same time. The response returns a list of invalid service account keys.</p>
     * 
     * @param request the request parameters of VerifyConnector  VerifyConnectorRequest
     * @return VerifyConnectorResponse
     */
    @Override
    public CompletableFuture<VerifyConnectorResponse> verifyConnector(VerifyConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("VerifyConnector").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/connectors/{connectorName}/actions/verify").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the authorization status of a workspace resource role for a specified ACR Enterprise Edition image repository to determine whether to proceed with image preparation or grant additional authorizations.</p>
     * <h3>Request parameters</h3>
     * <p><code>acrInstanceId</code>, <code>namespace</code>, and <code>repository</code> use query parameters and must be consistent with the targets used when obtaining the authorization URL.</p>
     * <h3>Authorization and deployment</h3>
     * <p><code>authorizationStatus=AUTHORIZED</code> indicates that the target authorization for the selected role is satisfied, and <code>UNAUTHORIZED</code> indicates that it is not yet satisfied. If authorization is required, call <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAcrRamAuthorizeUrl">GetWorkspaceAcrRamAuthorizeUrl</a> and confirm on the RAM page.
     * The authorization status is checked separately from whether the specific image tag exists and whether the pull network is reachable.</p>
     * 
     * @param request the request parameters of VerifyWorkspaceAcrRamAuthorization  VerifyWorkspaceAcrRamAuthorizationRequest
     * @return VerifyWorkspaceAcrRamAuthorizationResponse
     */
    @Override
    public CompletableFuture<VerifyWorkspaceAcrRamAuthorizationResponse> verifyWorkspaceAcrRamAuthorization(VerifyWorkspaceAcrRamAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("VerifyWorkspaceAcrRamAuthorization").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/acr/authorize/verify").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyWorkspaceAcrRamAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyWorkspaceAcrRamAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Checks whether the workspace has been granted access to the specified AgenticFS access point for subsequent Agent file mount configurations.
     * <a href="https://www.alibabacloud.com/help/en/nas/product-overview/agenticfs-overview">AgenticFS</a> is a storage type of File Storage NAS designed for AI agents. Access points provide mount entries for file spaces.</p>
     * <h3>Query and what to do next</h3>
     * <p>For the <code>server</code> query parameter, specify the access point domain name without the protocol, port, or path. Keep it consistent with the value used when obtaining the authorization link.</p>
     * <table>
     * <thead>
     * <tr>
     * <th><code>authorizationStatus</code></th>
     * <th>What to do next</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><code>AUTHORIZED</code></td>
     * <td>Authorization is complete. You can continue to configure <code>agenticFsMounts</code> for the agent.</td>
     * </tr>
     * <tr>
     * <td><code>UNAUTHORIZED</code></td>
     * <td>Obtain the link through <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/GetWorkspaceAgenticFsMountRamAuthorizeUrl">GetWorkspaceAgenticFsMountRamAuthorizeUrl</a>, complete the authorization, and then query again.</td>
     * </tr>
     * <tr>
     * <td>After authorization is complete, you must still commit the mount configuration in the agent and check the configuration processing result through the agent details. The mount folder must already exist, the access point must be located in the VPC associated with the workspace, and VPC access must be enabled for the agent.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of VerifyWorkspaceAgenticFsMountRamAuthorization  VerifyWorkspaceAgenticFsMountRamAuthorizationRequest
     * @return VerifyWorkspaceAgenticFsMountRamAuthorizationResponse
     */
    @Override
    public CompletableFuture<VerifyWorkspaceAgenticFsMountRamAuthorizationResponse> verifyWorkspaceAgenticFsMountRamAuthorization(VerifyWorkspaceAgenticFsMountRamAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("VerifyWorkspaceAgenticFsMountRamAuthorization").setMethod(HttpMethod.GET).setPathRegex("/workspaces/{workspaceId}/agentic-fs/authorize/verify").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyWorkspaceAgenticFsMountRamAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyWorkspaceAgenticFsMountRamAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Verifies the OSS mount authorization for a workspace, or checks and updates the authorization status of the default OSS storage for the workspace.</p>
     * <h3>Two query scopes</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Query parameter <code>bucketName</code></th>
     * <th>Behavior</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Bucket name provided</td>
     * <td>Checks the mount authorization of the bucket for the workspace resource role without modifying the default OSS binding.</td>
     * </tr>
     * <tr>
     * <td>Omitted</td>
     * <td>Checks the authorization of the default private OSS storage for the workspace and updates its authorization status.</td>
     * </tr>
     * </tbody></table>
     * <h3>Return statuses</h3>
     * <p><code>AUTHORIZED</code> indicates that authorization is granted, <code>UNAUTHORIZED</code> indicates that authorization is not granted, and <code>NOT_REQUIRED</code> indicates that authorization is not required. The authorization status does not indicate whether a specific mount directory exists or an instance has completed the mount.
     * If the goal is to read from a code package source, use <a href="https://api.aliyun.com/document/AgentCore/2026-08-04/VerifyAgentCodePackageOssRamAuthorization">VerifyAgentCodePackageOssRamAuthorization</a>. Do not mix code package verification with runtime directory mounting.</p>
     * 
     * @param request the request parameters of VerifyWorkspaceOssMountRamAuthorization  VerifyWorkspaceOssMountRamAuthorizationRequest
     * @return VerifyWorkspaceOssMountRamAuthorizationResponse
     */
    @Override
    public CompletableFuture<VerifyWorkspaceOssMountRamAuthorizationResponse> verifyWorkspaceOssMountRamAuthorization(VerifyWorkspaceOssMountRamAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("VerifyWorkspaceOssMountRamAuthorization").setMethod(HttpMethod.POST).setPathRegex("/workspaces/{workspaceId}/oss-mount/authorize/verify").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyWorkspaceOssMountRamAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyWorkspaceOssMountRamAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
