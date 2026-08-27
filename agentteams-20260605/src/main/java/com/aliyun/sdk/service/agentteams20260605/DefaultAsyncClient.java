// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.agentteams20260605.models.*;
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
        this.product = "AgentTeams";
        this.version = "2026-06-05";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-beijing", "agentteams.cn-beijing.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "agentteams.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "agentteams.cn-hangzhou.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of BindIdentityProvider  BindIdentityProviderRequest
     * @return BindIdentityProviderResponse
     */
    @Override
    public CompletableFuture<BindIdentityProviderResponse> bindIdentityProvider(BindIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindIdentityProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindIdentityProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindIdentityProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于为特定的AgentTeams实例创建公网NAT网关，并自动完成EIP申请、绑定以及SNAT规则的设置。</li>
     * <li>接口调用后将返回一个异步任务ID，实际的NAT网关、EIP及SNAT资源ID会在异步任务完成后通过任务结果提供。</li>
     * <li>NAT网关名称由系统自动生成，格式为<code>magic-create-for-vpc-{vpcId}</code>。</li>
     * <li>支持GET和POST方法进行请求。</li>
     * <li><code>eipBandwidth</code>参数指定了自动申请EIP时的带宽大小，默认值为5Mbps，范围在1-200Mbps之间。</li>
     * <li>如果<code>instanceId</code>为空或无效，或者提供的<code>eipBandwidth</code>不在允许范围内，API将返回错误响应。</li>
     * </ul>
     * 
     * @param request the request parameters of ConfigureNatGateway  ConfigureNatGatewayRequest
     * @return ConfigureNatGatewayResponse
     */
    @Override
    public CompletableFuture<ConfigureNatGatewayResponse> configureNatGateway(ConfigureNatGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigureNatGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigureNatGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigureNatGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCredential  CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    @Override
    public CompletableFuture<CreateCredentialResponse> createCredential(CreateCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口支持通过表单参数或 query 参数传递请求信息。</li>
     * <li><code>instanceSpec</code> 和 <code>networkType</code> 等部分参数有默认值，若未指定则使用默认值。</li>
     * <li>必须提供 <code>instanceName</code>, <code>regionId</code>, <code>vpcId</code>, 和 <code>vSwitchId</code> 参数。</li>
     * <li><code>networkType</code> 支持三种选项：<code>PRIVATE_PUBNET</code>, <code>PRIVATE_NET</code>, <code>PUB_NET</code>，默认为 <code>PRIVATE_NET</code>。</li>
     * <li>如果指定了 <code>zoneId</code>，则会尝试在该可用区创建实例；否则将根据系统策略选择合适的可用区。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMcp  CreateMcpRequest
     * @return CreateMcpResponse
     */
    @Override
    public CompletableFuture<CreateMcpResponse> createMcp(CreateMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMcp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateModel  CreateModelRequest
     * @return CreateModelResponse
     */
    @Override
    public CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateModelProvider  CreateModelProviderRequest
     * @return CreateModelProviderResponse
     */
    @Override
    public CompletableFuture<CreateModelProviderResponse> createModelProvider(CreateModelProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateModelProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>当前controller使用的是普通参数绑定，不是<code>@RequestBody</code>，因此参数更适合按query/form方式传递。</li>
     * <li><code>domain</code>字段会在服务端进行<code>trim + lowerCase</code>处理。</li>
     * <li><code>query</code>和<code>headers</code>必须是JSON object字符串格式，不能为数组。</li>
     * <li>创建操作仅将数据保存到数据库；只有在更新时，如果满足<code>ELEMENT/MATRIX + AI_GATEWAY + INTERNET</code>且域名或证书发生变化，才会触发AI Gateway域名同步逻辑。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateServiceEndpoint  CreateServiceEndpointRequest
     * @return CreateServiceEndpointResponse
     */
    @Override
    public CompletableFuture<CreateServiceEndpointResponse> createServiceEndpoint(CreateServiceEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTeam  CreateTeamRequest
     * @return CreateTeamResponse
     */
    @Override
    public CompletableFuture<CreateTeamResponse> createTeam(CreateTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTeam").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    @Override
    public CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorker  CreateWorkerRequest
     * @return CreateWorkerResponse
     */
    @Override
    public CompletableFuture<CreateWorkerResponse> createWorker(CreateWorkerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWorker").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWorkerBootstrapToken  CreateWorkerBootstrapTokenRequest
     * @return CreateWorkerBootstrapTokenResponse
     */
    @Override
    public CompletableFuture<CreateWorkerBootstrapTokenResponse> createWorkerBootstrapToken(CreateWorkerBootstrapTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWorkerBootstrapToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkerBootstrapTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkerBootstrapTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCredential  DeleteCredentialRequest
     * @return DeleteCredentialResponse
     */
    @Override
    public CompletableFuture<DeleteCredentialResponse> deleteCredential(DeleteCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本API支持<code>GET</code>和<code>POST</code>方法，两者语义相同。</li>
     * <li>使用<code>POST</code>方法时，参数通过<code>application/x-www-form-urlencoded</code>格式提交。</li>
     * <li>当前实例状态为<code>CREATING</code>、<code>DELETING</code>或<code>DELETED</code>时，请求将被拒绝。</li>
     * <li>成功调用后，实例状态将首先更改为<code>DELETING</code>，实际的资源清理过程由后台异步执行。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMcp  DeleteMcpRequest
     * @return DeleteMcpResponse
     */
    @Override
    public CompletableFuture<DeleteMcpResponse> deleteMcp(DeleteMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMcp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteModel  DeleteModelRequest
     * @return DeleteModelResponse
     */
    @Override
    public CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteModelProvider  DeleteModelProviderRequest
     * @return DeleteModelProviderResponse
     */
    @Override
    public CompletableFuture<DeleteModelProviderResponse> deleteModelProvider(DeleteModelProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteModelProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持通过GET或POST方法调用。</li>
     * <li>如果目标endpoint是<code>WORKER</code>类型，系统将自动清理与之关联的APIG/AI Gateway云资源及KubeOne worker service配置。</li>
     * <li>请求参数必须包含<code>instanceId</code>和<code>endpointId</code>，且不能为空。</li>
     * <li>成功响应会返回HTTP状态码200以及成功标志；错误响应则根据具体情况返回相应的HTTP状态码（如400、404、409）及错误信息。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteServiceEndpoint  DeleteServiceEndpointRequest
     * @return DeleteServiceEndpointResponse
     */
    @Override
    public CompletableFuture<DeleteServiceEndpointResponse> deleteServiceEndpoint(DeleteServiceEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteServiceEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServiceEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServiceEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTeam  DeleteTeamRequest
     * @return DeleteTeamResponse
     */
    @Override
    public CompletableFuture<DeleteTeamResponse> deleteTeam(DeleteTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTeam").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    @Override
    public CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteWorker  DeleteWorkerRequest
     * @return DeleteWorkerResponse
     */
    @Override
    public CompletableFuture<DeleteWorkerResponse> deleteWorker(DeleteWorkerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWorker").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCredential  GetCredentialRequest
     * @return GetCredentialResponse
     */
    @Override
    public CompletableFuture<GetCredentialResponse> getCredential(GetCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIdentityProvider  GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    @Override
    public CompletableFuture<GetIdentityProviderResponse> getIdentityProvider(GetIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIdentityProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持<code>GET</code>和<code>POST</code>方法。</li>
     * <li>请求时必须在头部包含<code>X-User-Id</code>，用于校验实例归属。</li>
     * <li><code>X-Acs-Request-Id</code>为可选项，如果提供，则响应中的<code>requestId</code>将优先使用此值。</li>
     * <li>必须通过<code>instanceId</code>参数指定要查询的实例。</li>
     * <li>成功响应会返回实例的详细配置信息及状态。</li>
     * <li>如果请求失败，根据错误类型返回相应的HTTP状态码及错误消息。</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    @Override
    public CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于查询特定AgentTeams实例下的异步任务执行状态。</li>
     * <li>目前仅支持查询与实例生命周期相关的创建实例任务。</li>
     * <li>可通过<code>taskCode</code>参数指定要查询的任务类型，默认为创建实例任务。</li>
     * <li>支持使用<code>maxResults</code>和<code>nextToken</code>进行结果分页。</li>
     * <li>当任务处于暂停(<code>PAUSED</code>)状态时，会返回用户需要采取行动的信息(<code>recoveryMessage</code>)。</li>
     * <li>注意：当前不支持通过<code>taskId</code>直接查询任务状态。</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceAsyncTask  GetInstanceAsyncTaskRequest
     * @return GetInstanceAsyncTaskResponse
     */
    @Override
    public CompletableFuture<GetInstanceAsyncTaskResponse> getInstanceAsyncTask(GetInstanceAsyncTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceAsyncTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceAsyncTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceAsyncTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口支持<code>GET</code>和<code>POST</code>方法。</li>
     * <li>请求时必须在头部包含<code>X-User-Id</code>，用于校验实例归属。</li>
     * <li>必须通过<code>instanceId</code>参数指定实例，后端会根据实例信息生成授权链接。</li>
     * <li>成功响应会返回 RAM 控制台授权链接，不会创建 RAM 角色或策略。</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceOssMountRamAuthorizeUrl  GetInstanceOssMountRamAuthorizeUrlRequest
     * @return GetInstanceOssMountRamAuthorizeUrlResponse
     */
    @Override
    public CompletableFuture<GetInstanceOssMountRamAuthorizeUrlResponse> getInstanceOssMountRamAuthorizeUrl(GetInstanceOssMountRamAuthorizeUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceOssMountRamAuthorizeUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceOssMountRamAuthorizeUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceOssMountRamAuthorizeUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of GetMcp  GetMcpRequest
     * @return GetMcpResponse
     */
    @Override
    public CompletableFuture<GetMcpResponse> getMcp(GetMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMcp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMcpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMcpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetModelInvocationSummary  GetModelInvocationSummaryRequest
     * @return GetModelInvocationSummaryResponse
     */
    @Override
    public CompletableFuture<GetModelInvocationSummaryResponse> getModelInvocationSummary(GetModelInvocationSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetModelInvocationSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelInvocationSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelInvocationSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of GetModelProvider  GetModelProviderRequest
     * @return GetModelProviderResponse
     */
    @Override
    public CompletableFuture<GetModelProviderResponse> getModelProvider(GetModelProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetModelProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>通过此API，您可以获取特定实例关联的NAT网关配置详情及SNAT规则的状态。该接口支持GET或POST方法调用，并需要提供<code>instanceId</code>作为请求参数来指定要查询的实例。</p>
     * <h3>注意事项</h3>
     * <ul>
     * <li>确保提供的<code>instanceId</code>是有效的且属于您的账户。</li>
     * <li>根据返回的状态值（如<code>READY</code>, <code>NEED_CONFIGURE_NAT_GATEWAY</code>, <code>NEED_CONFIGURE_SNAT_RULE</code>），采取相应的操作以完成NAT网关或SNAT规则的配置。</li>
     * <li>当状态为<code>NEED_CONFIGURE_NAT_GATEWAY</code>时，表示当前VPC下没有可用的NAT网关；而<code>NEED_CONFIGURE_SNAT_RULE</code>则意味着虽然存在NAT网关但某些子网CIDR未被SNAT规则覆盖。</li>
     * </ul>
     * 
     * @param request the request parameters of GetNatGatewayStatus  GetNatGatewayStatusRequest
     * @return GetNatGatewayStatusResponse
     */
    @Override
    public CompletableFuture<GetNatGatewayStatusResponse> getNatGatewayStatus(GetNatGatewayStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNatGatewayStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNatGatewayStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNatGatewayStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于根据<code>endpointId</code>查询单个Endpoint的具体配置与状态信息。</li>
     * <li>可选参数<code>instanceId</code>用于验证Endpoint是否属于特定实例。</li>
     * <li>请求方式支持<code>GET</code>和<code>POST</code>，其中<code>GET</code>使用query string传递参数，而<code>POST</code>则可以通过form参数提交。</li>
     * <li>如果<code>endpointId</code>缺失或为空，则会返回<code>InvalidParameter</code>错误。</li>
     * <li>当请求的Endpoint不存在、不属于提供的实例或者不属于当前用户时，将收到相应的资源不存在类错误响应。</li>
     * </ul>
     * 
     * @param request the request parameters of GetServiceEndpoint  GetServiceEndpointRequest
     * @return GetServiceEndpointResponse
     */
    @Override
    public CompletableFuture<GetServiceEndpointResponse> getServiceEndpoint(GetServiceEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServiceEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTaskStatsSummary  GetTaskStatsSummaryRequest
     * @return GetTaskStatsSummaryResponse
     */
    @Override
    public CompletableFuture<GetTaskStatsSummaryResponse> getTaskStatsSummary(GetTaskStatsSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTaskStatsSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskStatsSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskStatsSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTeam  GetTeamRequest
     * @return GetTeamResponse
     */
    @Override
    public CompletableFuture<GetTeamResponse> getTeam(GetTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTeam").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTokenTrend  GetTokenTrendRequest
     * @return GetTokenTrendResponse
     */
    @Override
    public CompletableFuture<GetTokenTrendResponse> getTokenTrend(GetTokenTrendRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTokenTrend").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenTrendResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenTrendResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetToolCallDistribution  GetToolCallDistributionRequest
     * @return GetToolCallDistributionResponse
     */
    @Override
    public CompletableFuture<GetToolCallDistributionResponse> getToolCallDistribution(GetToolCallDistributionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetToolCallDistribution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetToolCallDistributionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetToolCallDistributionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    @Override
    public CompletableFuture<GetUserResponse> getUser(GetUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserPassword  GetUserPasswordRequest
     * @return GetUserPasswordResponse
     */
    @Override
    public CompletableFuture<GetUserPasswordResponse> getUserPassword(GetUserPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorker  GetWorkerRequest
     * @return GetWorkerResponse
     */
    @Override
    public CompletableFuture<GetWorkerResponse> getWorker(GetWorkerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWorker").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkerBootstrapOptions  GetWorkerBootstrapOptionsRequest
     * @return GetWorkerBootstrapOptionsResponse
     */
    @Override
    public CompletableFuture<GetWorkerBootstrapOptionsResponse> getWorkerBootstrapOptions(GetWorkerBootstrapOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWorkerBootstrapOptions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkerBootstrapOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkerBootstrapOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkerMaxVersion  GetWorkerMaxVersionRequest
     * @return GetWorkerMaxVersionResponse
     */
    @Override
    public CompletableFuture<GetWorkerMaxVersionResponse> getWorkerMaxVersion(GetWorkerMaxVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWorkerMaxVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkerMaxVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkerMaxVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkerStatsSummary  GetWorkerStatsSummaryRequest
     * @return GetWorkerStatsSummaryResponse
     */
    @Override
    public CompletableFuture<GetWorkerStatsSummaryResponse> getWorkerStatsSummary(GetWorkerStatsSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWorkerStatsSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkerStatsSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkerStatsSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCredentials  ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    @Override
    public CompletableFuture<ListCredentialsResponse> listCredentials(ListCredentialsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCredentials").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCredentialsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCredentialsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIdentityProviders  ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    @Override
    public CompletableFuture<ListIdentityProvidersResponse> listIdentityProviders(ListIdentityProvidersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIdentityProviders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>分页规则</strong>：<ul>
     * <li>如果传了 <code>NextToken</code>，优先按 <code>NextToken</code> 解析 offset。</li>
     * <li>如果没传 <code>NextToken</code>，则使用 <code>skip</code>。</li>
     * <li><code>MaxResults</code> 的取值范围为 1 到 100，非法值会返回 <code>400</code> 错误。</li>
     * <li><code>NextToken</code> 必须是有效的整数，否则会返回 <code>400</code> 错误。</li>
     * <li><code>skip</code> 的值不能小于 0，否则会返回 <code>400</code> 错误。</li>
     * </ul>
     * </li>
     * <li><strong>排序规则</strong>：列表按创建时间倒序返回。</li>
     * <li><strong>请求参数</strong>：<ul>
     * <li><code>instanceName</code>：实例名称，支持模糊匹配。</li>
     * <li><code>status</code>：实例状态。</li>
     * <li><code>MaxResults</code>：分页大小，默认值为 20。</li>
     * <li><code>NextToken</code>：下一页游标。</li>
     * <li><code>skip</code>：跳过的记录数，默认值为 0。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    @Override
    public CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有Magic实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of ListMcpTools  ListMcpToolsRequest
     * @return ListMcpToolsResponse
     */
    @Override
    public CompletableFuture<ListMcpToolsResponse> listMcpTools(ListMcpToolsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMcpTools").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of ListMcps  ListMcpsRequest
     * @return ListMcpsResponse
     */
    @Override
    public CompletableFuture<ListMcpsResponse> listMcps(ListMcpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMcps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of ListModelProviders  ListModelProvidersRequest
     * @return ListModelProvidersResponse
     */
    @Override
    public CompletableFuture<ListModelProvidersResponse> listModelProviders(ListModelProvidersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListModelProviders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelProvidersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelProvidersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>instanceId</code> 是必填参数，用来指定 AgentTeams 实例 ID。</li>
     * <li>可选参数包括 <code>component</code>, <code>serviceName</code>, <code>networkType</code>, 和 <code>domainType</code>，用于进一步筛选返回的端点列表。</li>
     * <li>不支持通过 <code>status</code> 参数进行筛选。</li>
     * </ul>
     * 
     * @param request the request parameters of ListServiceEndpoints  ListServiceEndpointsRequest
     * @return ListServiceEndpointsResponse
     */
    @Override
    public CompletableFuture<ListServiceEndpointsResponse> listServiceEndpoints(ListServiceEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServiceEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取与指定AgentTeams实例相关的SSL证书列表。</li>
     * <li>可通过<code>certNameLike</code>和<code>domainName</code>参数进行模糊搜索或精确匹配证书名称及绑定域名。</li>
     * <li>分页参数<code>pageNumber</code>和<code>pageSize</code>允许客户端控制返回结果的数量和页码，默认每页显示10条记录。</li>
     * <li>成功响应将包含请求ID、是否成功标志、错误代码（如果有的话）、HTTP状态码、本次请求的最大结果数、下一页标记（如果有更多数据的话）、总证书数量以及具体的证书详情列表。</li>
     * </ul>
     * 
     * @param request the request parameters of ListSslCerts  ListSslCertsRequest
     * @return ListSslCertsResponse
     */
    @Override
    public CompletableFuture<ListSslCertsResponse> listSslCerts(ListSslCertsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSslCerts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSslCertsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSslCertsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTeamDetails  ListTeamDetailsRequest
     * @return ListTeamDetailsResponse
     */
    @Override
    public CompletableFuture<ListTeamDetailsResponse> listTeamDetails(ListTeamDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTeamDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTeamDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTeamDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTeamTasks  ListTeamTasksRequest
     * @return ListTeamTasksResponse
     */
    @Override
    public CompletableFuture<ListTeamTasksResponse> listTeamTasks(ListTeamTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTeamTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTeamTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTeamTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTeams  ListTeamsRequest
     * @return ListTeamsResponse
     */
    @Override
    public CompletableFuture<ListTeamsResponse> listTeams(ListTeamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTeams").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTeamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTeamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    @Override
    public CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkerStatsDetails  ListWorkerStatsDetailsRequest
     * @return ListWorkerStatsDetailsResponse
     */
    @Override
    public CompletableFuture<ListWorkerStatsDetailsResponse> listWorkerStatsDetails(ListWorkerStatsDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWorkerStatsDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkerStatsDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkerStatsDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkers  ListWorkersRequest
     * @return ListWorkersResponse
     */
    @Override
    public CompletableFuture<ListWorkersResponse> listWorkers(ListWorkersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWorkers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PutCmsWorkspace  PutCmsWorkspaceRequest
     * @return PutCmsWorkspaceResponse
     */
    @Override
    public CompletableFuture<PutCmsWorkspaceResponse> putCmsWorkspace(PutCmsWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutCmsWorkspace").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutCmsWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutCmsWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询特定<code>instanceId</code>下的不同目标（如<code>INSTANCE</code>、<code>WORKER</code>、<code>TEAM</code>、<code>HUMAN</code>）的功能特性状态。</li>
     * <li><code>targetScope</code>参数定义了查询的目标类型，根据不同的<code>targetScope</code>值，可能需要提供额外的<code>resourceName</code>参数来指定具体的资源名称。</li>
     * <li>如果提供了<code>featureCodes</code>列表，则返回这些特定功能特性的状态；否则，将返回指定<code>targetScope</code>下所有功能特性的状态。</li>
     * <li>当使用<code>WORKER</code>、<code>TEAM</code>或<code>HUMAN</code>作为<code>targetScope</code>时，请确保正确填写对应的<code>resourceName</code>。</li>
     * <li>对于<code>INSTANCE</code>级别的查询，无需提供<code>resourceName</code>。</li>
     * <li>特性支持情况受基础版本、工作器版本等因素影响，并通过<code>unsupportedReasonCode</code>和<code>unsupportedReason</code>字段给出不支持的具体原因。</li>
     * </ul>
     * 
     * @param request the request parameters of QueryFeatures  QueryFeaturesRequest
     * @return QueryFeaturesResponse
     */
    @Override
    public CompletableFuture<QueryFeaturesResponse> queryFeatures(QueryFeaturesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryFeatures").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFeaturesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFeaturesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * 
     * @param request the request parameters of QuerySupportedZones  QuerySupportedZonesRequest
     * @return QuerySupportedZonesResponse
     */
    @Override
    public CompletableFuture<QuerySupportedZonesResponse> querySupportedZones(QuerySupportedZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySupportedZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySupportedZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySupportedZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetUserPassword  ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    @Override
    public CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetUserPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of TestModelProvider  TestModelProviderRequest
     * @return TestModelProviderResponse
     */
    @Override
    public CompletableFuture<TestModelProviderResponse> testModelProvider(TestModelProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestModelProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestModelProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestModelProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindIdentityProvider  UnbindIdentityProviderRequest
     * @return UnbindIdentityProviderResponse
     */
    @Override
    public CompletableFuture<UnbindIdentityProviderResponse> unbindIdentityProvider(UnbindIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindIdentityProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindIdentityProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindIdentityProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于更新 AgentTeams 实例下已有 Credential 的密钥明文。</li>
     * <li>仅更新 Agent Identity TokenVault 中同名 APIKeyCredentialProvider 的密钥值，不修改本地元数据（description、createTime、updateTime、status）。</li>
     * <li>响应不包含 apiKey 明文；如需绑定 Worker 明细请调用 GetCredential。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateCredential  UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    @Override
    public CompletableFuture<UpdateCredentialResponse> updateCredential(UpdateCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateIdentityProvider  UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    @Override
    public CompletableFuture<UpdateIdentityProviderResponse> updateIdentityProvider(UpdateIdentityProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIdentityProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>推荐使用<code>POST</code>方法，并以表单形式提交参数。</li>
     * <li>当前实现不支持JSON格式的请求体，请勿尝试使用<code>@RequestBody</code>方式调用。</li>
     * <li>必须提供有效的<code>instanceId</code>和非空的<code>instanceName</code>作为参数。</li>
     * <li>该接口仅允许修改实例名称(<code>instanceName</code>)，不允许通过此接口变更命名空间(<code>namespace</code>)。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于重新启动一个处于暂停状态的创建实例任务。</li>
     * <li>目前仅支持 <code>agentteams:pay-order:create</code> 类型的任务。</li>
     * <li>确保提供的 <code>instanceId</code>、<code>taskCode</code> 和 <code>taskId</code> 参数准确无误，否则可能导致请求失败。</li>
     * <li>如果任务不是暂停状态（PAUSED），则不允许调用此接口进行更新。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateInstanceAsyncTask  UpdateInstanceAsyncTaskRequest
     * @return UpdateInstanceAsyncTaskResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceAsyncTaskResponse> updateInstanceAsyncTask(UpdateInstanceAsyncTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateInstanceAsyncTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceAsyncTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceAsyncTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateMcp  UpdateMcpRequest
     * @return UpdateMcpResponse
     */
    @Override
    public CompletableFuture<UpdateMcpResponse> updateMcp(UpdateMcpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMcp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateModel  UpdateModelRequest
     * @return UpdateModelResponse
     */
    @Override
    public CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateModel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询当前登录用户所拥有的所有AgentTeams实例。</li>
     * <li>用户身份通过请求头<code>X-User-Id</code>传递，服务端会根据此ID自动过滤只返回属于该用户的实例数据。</li>
     * <li>支持使用<code>instanceName</code>进行模糊匹配以及通过<code>status</code>参数精确匹配实例状态来过滤查询结果。</li>
     * <li>默认情况下，结果将按照创建时间倒序排列，并且可以通过设置<code>limit</code>和<code>offset</code>参数来进行分页控制，默认每页显示20条记录。</li>
     * <li>如果请求中缺少<code>X-User-Id</code>或者其值为空，则会返回400错误；如果指定的实例不存在或不属于当前用户，则返回404错误。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateModelProvider  UpdateModelProviderRequest
     * @return UpdateModelProviderResponse
     */
    @Override
    public CompletableFuture<UpdateModelProviderResponse> updateModelProvider(UpdateModelProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateModelProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>本API支持更新<code>ELEMENT</code>、<code>MATRIX</code>类型的Endpoint。</li>
     * <li>如果尝试更新其他类型的Endpoint，将返回400错误。</li>
     * <li>当<code>endpointId</code>不存在或不属于当前用户实例时，将返回404错误。</li>
     * <li>更新域名时，系统会创建或复用新的HTTPS domain，并将其绑定到原endpoint route上，同时解绑旧domain，但不会删除旧domain。</li>
     * <li>若不提供<code>domain</code>或<code>certIdentifier</code>参数，则保持原有设置不变。</li>
     * <li>其他如<code>component</code>、<code>gatewayType</code>等字段即使传入也不会被更新。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateServiceEndpoint  UpdateServiceEndpointRequest
     * @return UpdateServiceEndpointResponse
     */
    @Override
    public CompletableFuture<UpdateServiceEndpointResponse> updateServiceEndpoint(UpdateServiceEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateServiceEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServiceEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServiceEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTeam  UpdateTeamRequest
     * @return UpdateTeamResponse
     */
    @Override
    public CompletableFuture<UpdateTeamResponse> updateTeam(UpdateTeamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTeam").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTeamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTeamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    @Override
    public CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWorker  UpdateWorkerRequest
     * @return UpdateWorkerResponse
     */
    @Override
    public CompletableFuture<UpdateWorkerResponse> updateWorker(UpdateWorkerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWorker").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
