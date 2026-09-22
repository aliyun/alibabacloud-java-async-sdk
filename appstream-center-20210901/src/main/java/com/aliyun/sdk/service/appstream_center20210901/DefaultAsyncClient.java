// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.appstream_center20210901.models.*;
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
        this.product = "appstream-center";
        this.version = "2021-09-01";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ApproveOtaTask  ApproveOtaTaskRequest
     * @return ApproveOtaTaskResponse
     */
    @Override
    public CompletableFuture<ApproveOtaTaskResponse> approveOtaTask(ApproveOtaTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApproveOtaTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApproveOtaTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApproveOtaTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssignWuyingServerPrivateAddresses  AssignWuyingServerPrivateAddressesRequest
     * @return AssignWuyingServerPrivateAddressesResponse
     */
    @Override
    public CompletableFuture<AssignWuyingServerPrivateAddressesResponse> assignWuyingServerPrivateAddresses(AssignWuyingServerPrivateAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignWuyingServerPrivateAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignWuyingServerPrivateAddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignWuyingServerPrivateAddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you change assigned users, the selected users receive notification emails. Changes typically take about 2 minutes to take effect on the client.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AuthorizeInstanceGroup  AuthorizeInstanceGroupRequest
     * @return AuthorizeInstanceGroupResponse
     */
    @Override
    public CompletableFuture<AuthorizeInstanceGroupResponse> authorizeInstanceGroup(AuthorizeInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation manages user authorization for a delivery group at the application level. The authorization result applies only to the application specified by AppId and does not affect the authorization of other applications in the delivery group. To authorize users for an entire delivery group, call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The delivery group is created, and <strong>the application specified by AppId is deployed in the image used by the delivery group</strong>. Otherwise, the error code <code>InvalidAppId.NotFound</code> is returned.</li>
     * <li>The delivery group <strong>has not been added to a delivery group set that is in effect</strong>. A delivery group that has been added to a set cannot be authorized individually. You must authorize it through the set. Otherwise, the error code <code>InvalidAppInstanceGroup.AuthorizeBlockedBySet</code> is returned.</li>
     * <li>If the workspace to which the delivery group belongs is an Active Directory (AD) workspace, <strong>you must specify UserMeta</strong>, with <code>UserMeta.Type</code> set to <code>ad</code> and <code>UserMeta.AdDomain</code> matching the AD domain bound to the workspace.</li>
     * <li>If the delivery group has been authorized through user groups and mixed authorization of users and user groups is not supported, you cannot authorize by user. Otherwise, the error code <code>AuthAppInstanceGroup.MixNotSupported</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>At least one of AuthorizeUserIds and UnAuthorizeUserIds must be specified.</strong> You can also specify both. If both are empty, this invocation does not change any authorization.</li>
     * <li>When adding authorizations, the sum of the currently authorized users for the application and the users to be added cannot exceed the authorized user quota for the application. If the quota is exceeded, the error code <code>ExceedAppAuthUserQuota</code> is returned. Removing authorizations is not subject to quota limits.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId) and the application IDs of deployed applications in the delivery group (AppId in the Apps list).</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the usernames of the users to be authorized or unauthorized.</li>
     * <li>Call this operation to complete the authorization change.<blockquote>
     * <p>After the authorization is changed, the selected users receive a notification email. It typically takes about 2 minutes for the change to take effect on the client.</p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of AuthorizeUsersForApp  AuthorizeUsersForAppRequest
     * @return AuthorizeUsersForAppResponse
     */
    @Override
    public CompletableFuture<AuthorizeUsersForAppResponse> authorizeUsersForApp(AuthorizeUsersForAppRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeUsersForApp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeUsersForAppResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeUsersForAppResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can batch create model templates under a model provider template in the Wuying Agent Management Center. Multiple models can be added at a time, and one of them can be specified as the default model. Existing models are automatically skipped and not created again.
     * Before using this operation, make sure you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of BatchCreateLlmTemplates  BatchCreateLlmTemplatesRequest
     * @return BatchCreateLlmTemplatesResponse
     */
    @Override
    public CompletableFuture<BatchCreateLlmTemplatesResponse> batchCreateLlmTemplates(BatchCreateLlmTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCreateLlmTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateLlmTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateLlmTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can assign a model group to the resources that belong to agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. The model group serves as the inference engine for agents within the resource group to execute tasks.
     * When an agent runtime has its own model group configured and the resource group it belongs to also has a model group configured, the model group bound to the resource group takes effect. The resource group setting has a higher priority than the agent runtime setting.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before calling this operation.</p>
     * 
     * @param request the request parameters of ConfigResourceGroupModelTemplate  ConfigResourceGroupModelTemplateRequest
     * @return ConfigResourceGroupModelTemplateResponse
     */
    @Override
    public CompletableFuture<ConfigResourceGroupModelTemplateResponse> configResourceGroupModelTemplate(ConfigResourceGroupModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigResourceGroupModelTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigResourceGroupModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigResourceGroupModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can configure third-party channels for Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. These channels serve as extended Agent communication methods beyond the AgentIM channel.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of ConfigRuntimeChannel  ConfigRuntimeChannelRequest
     * @return ConfigRuntimeChannelResponse
     */
    @Override
    public CompletableFuture<ConfigRuntimeChannelResponse> configRuntimeChannel(ConfigRuntimeChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigRuntimeChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigRuntimeChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigRuntimeChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. The model groups serve as inference engines for Agent task execution.
     * Make sure that you are familiar with the operations and usage of the Wuying Agent Management Center before calling this operation.</p>
     * 
     * @param request the request parameters of ConfigRuntimeModelTemplate  ConfigRuntimeModelTemplateRequest
     * @return ConfigRuntimeModelTemplateResponse
     */
    @Override
    public CompletableFuture<ConfigRuntimeModelTemplateResponse> configRuntimeModelTemplate(ConfigRuntimeModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigRuntimeModelTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigRuntimeModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigRuntimeModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing and pricing</a> of WUYING CloudApp.
     * A delivery group is a logical grouping for delivering cloud applications to end users. It includes the underlying cloud application resources, images that contain cloud applications, resource management policies, and user allocation settings. For details, see <a href="https://help.aliyun.com/document_detail/426046.html">Publish a delivery group</a>.</p>
     * 
     * @param request the request parameters of CreateAppInstanceGroup  CreateAppInstanceGroupRequest
     * @return CreateAppInstanceGroupResponse
     */
    @Override
    public CompletableFuture<CreateAppInstanceGroupResponse> createAppInstanceGroup(CreateAppInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAppInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAppInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAppInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Prepare an available office network, image, and instance type in the target business region. Make sure that the account has the required browser configurations and resource quotas.</li>
     * <li>Specify <code>CloudBrowserName</code> and <code>BizRegionId</code>. Set <code>OsType</code> to <code>Windows</code>.</li>
     * <li>Authorized users must be created in advance and must match the account type. Authorized user groups must belong to the current account and match the account type of the office network.</li>
     * <li><strong><code>Users</code> and <code>UserGroupIds</code> cannot both be non-empty.</strong></li>
     * </ul>
     * <h2>MAU billing parameters</h2>
     * <ul>
     * <li>Set <code>ChargeType</code> to <code>PostPaid</code>.</li>
     * <li><strong>Set <code>SubPayType</code> to <code>mau</code> explicitly. Omitting this field does not enable MAU billing.</strong></li>
     * <li>Set <code>ChargeResourceMode</code> to <code>AppInstance</code>.</li>
     * <li>Do not specify <code>Period</code>, <code>PeriodUnit</code>, <code>AppPackageType</code>, <code>AutoPay</code>, <code>AutoRenew</code>, or <code>NodePool</code>.</li>
     * </ul>
     * <h2>Post-call processing</h2>
     * <p><strong>A successful response does not indicate that the browser resources are ready.</strong> After creation, query the browser group status and confirm that the group is connectable before use.
     * This operation creates a new cloud browser group. You do not need to create a delivery group in advance.</p>
     * <h2>Example description</h2>
     * <p>The example values of fields are provided to demonstrate how to specify the fields. Replace resource identifiers with actual values under your account. Capacity examples do not represent default values or upper limits.
     * An example value of <code>-</code> indicates that the field does not need to be specified. Omit the corresponding parameter when you call the operation. Do not pass the character <code>-</code>.</p>
     * 
     * @param request the request parameters of CreateBrowserInstanceGroup  CreateBrowserInstanceGroupRequest
     * @return CreateBrowserInstanceGroupResponse
     */
    @Override
    public CompletableFuture<CreateBrowserInstanceGroupResponse> createBrowserInstanceGroup(CreateBrowserInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBrowserInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBrowserInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBrowserInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateImageByInstance  CreateImageByInstanceRequest
     * @return CreateImageByInstanceResponse
     */
    @Override
    public CompletableFuture<CreateImageByInstanceResponse> createImageByInstance(CreateImageByInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageByInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageByInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageByInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateImageFromAppInstanceGroup  CreateImageFromAppInstanceGroupRequest
     * @return CreateImageFromAppInstanceGroupResponse
     */
    @Override
    public CompletableFuture<CreateImageFromAppInstanceGroupResponse> createImageFromAppInstanceGroup(CreateImageFromAppInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageFromAppInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageFromAppInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageFromAppInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can create a model provider template under Model Templates in the WUYING Agent Management Center. This template is used to configure connection information and keys for model services (such as Alibaba Cloud Bailian, Token Plan, and Moonshot) that an Agent can invoke. After model creation, the model provider template is automatically associated with the specified model template.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before you invoke this operation.</p>
     * 
     * @param request the request parameters of CreateModelProviderTemplate  CreateModelProviderTemplateRequest
     * @return CreateModelProviderTemplateResponse
     */
    @Override
    public CompletableFuture<CreateModelProviderTemplateResponse> createModelProviderTemplate(CreateModelProviderTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateModelProviderTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelProviderTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelProviderTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can create a model group in the Wuying Agent Management Center to manage the model providers and model scope that an Agent can invoke. After model creation, you can attach the model group to a cloud computer as the inference engine configuration for Agent task execution.
     * Make sure that you are familiar with the operations and usage of the Wuying Agent Management Center before invoking this operation.</p>
     * 
     * @param request the request parameters of CreateModelTemplate  CreateModelTemplateRequest
     * @return CreateModelTemplateResponse
     */
    @Override
    public CompletableFuture<CreateModelTemplateResponse> createModelTemplate(CreateModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateModelTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>A project corresponds to the resource configuration module in the CloudFlow console.</li>
     * <li>When the ContentId input parameter has multiple versions, this API <notice>uses the default version</notice> and bindss it at the same time.</li>
     * <li>This operation succeeds only when the default version of the Content is in an available state.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateWuyingServer  CreateWuyingServerRequest
     * @return CreateWuyingServerResponse
     */
    @Override
    public CompletableFuture<CreateWuyingServerResponse> createWuyingServer(CreateWuyingServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWuyingServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWuyingServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWuyingServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation does not support deleting delivery groups that use subscription resources.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteAppInstanceGroup  DeleteAppInstanceGroupRequest
     * @return DeleteAppInstanceGroupResponse
     */
    @Override
    public CompletableFuture<DeleteAppInstanceGroupResponse> deleteAppInstanceGroup(DeleteAppInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAppInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only instances in the initializing or idle state can be deleted. This operation is available only to specific customers.</p>
     * 
     * @param request the request parameters of DeleteAppInstances  DeleteAppInstancesRequest
     * @return DeleteAppInstancesResponse
     */
    @Override
    public CompletableFuture<DeleteAppInstancesResponse> deleteAppInstances(DeleteAppInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAppInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can delete only custom images that belong to your account.</li>
     * <li>For images associated with WUYING Cloud Computer Pool, WUYING Cloud Application, or WUYING Workspace product lines, ensure that no WUYING instances are using the image before you delete it.</li>
     * <li>If a WUYING Cloud Desktop template references an image, the template is also deleted when the image is deleted.</li>
     * <li>For images that span multiple regions, deleting the image removes the image from all regions.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    @Override
    public CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can delete a model template that has been created under a model service provider template in the WUYING Agent Management Center. Before deletion, ensure that the model is not the default model of an associated model group. Otherwise, the deletion fails. After deletion, the model configurations of associated cloud computers are automatically refreshed.
     * Before using this operation, make sure you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of DeleteLlmTemplate  DeleteLlmTemplateRequest
     * @return DeleteLlmTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteLlmTemplateResponse> deleteLlmTemplate(DeleteLlmTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLlmTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLlmTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLlmTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can delete a model provider template that has been created under model templates in the WUYING Agent Management Center. Before deletion, ensure that the model provider is not the provider of the default model and is not a system preset type provider (such as WUYING credit package). After deletion, the associated models and key configurations are also removed.
     * Before using this operation, make sure you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of DeleteModelProviderTemplate  DeleteModelProviderTemplateRequest
     * @return DeleteModelProviderTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteModelProviderTemplateResponse> deleteModelProviderTemplate(DeleteModelProviderTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteModelProviderTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelProviderTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelProviderTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can delete a model group that has been created in the WUYING Agent Management Center. Before deletion, ensure that the template has not been authorized to any resource. Otherwise, the deletion fails. After deletion, the model providers and models under the model group are also removed.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of DeleteModelTemplate  DeleteModelTemplateRequest
     * @return DeleteModelTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteModelTemplateResponse> deleteModelTemplate(DeleteModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteModelTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a cloud graphics workstation.</p>
     * 
     * @param request the request parameters of DeleteWuyingServer  DeleteWuyingServerRequest
     * @return DeleteWuyingServerResponse
     */
    @Override
    public CompletableFuture<DeleteWuyingServerResponse> deleteWuyingServer(DeleteWuyingServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWuyingServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWuyingServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWuyingServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeliverToUserSls  DeliverToUserSlsRequest
     * @return DeliverToUserSlsResponse
     */
    @Override
    public CompletableFuture<DeliverToUserSlsResponse> deliverToUserSls(DeliverToUserSlsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeliverToUserSls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeliverToUserSlsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeliverToUserSlsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWuyingServer  DescribeWuyingServerRequest
     * @return DescribeWuyingServerResponse
     */
    @Override
    public CompletableFuture<DescribeWuyingServerResponse> describeWuyingServer(DescribeWuyingServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWuyingServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWuyingServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWuyingServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeWuyingServerEipInfo  DescribeWuyingServerEipInfoRequest
     * @return DescribeWuyingServerEipInfoResponse
     */
    @Override
    public CompletableFuture<DescribeWuyingServerEipInfoResponse> describeWuyingServerEipInfo(DescribeWuyingServerEipInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeWuyingServerEipInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeWuyingServerEipInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeWuyingServerEipInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAppInstanceGroup  GetAppInstanceGroupRequest
     * @return GetAppInstanceGroupResponse
     */
    @Override
    public CompletableFuture<GetAppInstanceGroupResponse> getAppInstanceGroup(GetAppInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAppInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAppInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAppInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic describes the query usage for the monthly active user (MAU) billing scenario.</p>
     * <h2>Before you begin</h2>
     * <p>Obtain the cloud browser group ID under the current account. Call <code>ListBrowserInstanceGroup</code> to retrieve the ID.</p>
     * <h2>Response</h2>
     * <p>The response includes the current configuration, status, and authorization statistics of the browser group. The details return up to 20 bookmarks and 20 website access entries. To retrieve the complete lists, call <code>ListBrowserBookmarks</code> and <code>ListBrowserRestrictedURLs</code>.</p>
     * <h2>What to do next</h2>
     * <p>This operation only queries configurations and does not modify resources. After you read the returned status, perform the connection or management operation that corresponds to the status.</p>
     * <h2>Example description</h2>
     * <p>The <code>-</code> value in the examples indicates that the field is not applicable or not returned in the current scenario. It is not an actual string returned by the operation. Sample resource IDs are masked. Use the actual query results when you call this operation.</p>
     * 
     * @param request the request parameters of GetBrowserInstanceGroup  GetBrowserInstanceGroupRequest
     * @return GetBrowserInstanceGroupResponse
     */
    @Override
    public CompletableFuture<GetBrowserInstanceGroupResponse> getBrowserInstanceGroup(GetBrowserInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBrowserInstanceGroup").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBrowserInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBrowserInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call protocol description: operation_type: polling, required_steps: 1.
     * This operation may require multiple calls (at least one) to obtain the connection credential.
     * On the first call, an application instance is allocated to the specified convenience account and the application is started. If a Ticket is returned, the result is obtained synchronously. If a startup task ID (<code>TaskId</code>) is returned, subsequent calls are required.
     * On subsequent calls, include the <code>TaskId</code> request parameter to invoke the operation and query whether the node is complete. When the returned node status (<code>TaskStatus</code>) is completed (<code>Finished</code>), the connection credential (<code>Ticket</code>) is also returned.</p>
     * <blockquote>
     * <p>Prerequisites</p>
     * <ul>
     * <li>Before calling this operation, make sure that you have created a delivery group and authorized users for the delivery group:</li>
     * <li><ol>
     * <li>The API for creating a delivery group is CreateAppInstanceGroup. For more information about the parameters, see the corresponding API documentation.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>You can call the ListAppInstanceGroup operation to query the list of delivery groups. If the corresponding delivery group is not found, verify that the delivery group has been created and that the authentication credentials belong to the correct tenant.</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>The API for authorizing users for a delivery group is AuthorizeInstanceGroup. For more information about the parameters, see the corresponding API documentation.</li>
     * </ol>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of GetConnectionTicket  GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    @Override
    public CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetConnectionTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConnectionTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConnectionTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDebugAppInstance  GetDebugAppInstanceRequest
     * @return GetDebugAppInstanceResponse
     */
    @Override
    public CompletableFuture<GetDebugAppInstanceResponse> getDebugAppInstance(GetDebugAppInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDebugAppInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDebugAppInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDebugAppInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Visitor information is filled in on the lead capture page when visitors execute a cloud flow. Therefore, the usage mode of cloud applications does not generate visitor information.</p>
     * 
     * @param request the request parameters of GetFileUploadInfo  GetFileUploadInfoRequest
     * @return GetFileUploadInfoResponse
     */
    @Override
    public CompletableFuture<GetFileUploadInfoResponse> getFileUploadInfo(GetFileUploadInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileUploadInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileUploadInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileUploadInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the details of a specified model provider template in the WUYING Agent Management Center, including the provider name, description, and connection configuration list.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of GetModelProviderTemplate  GetModelProviderTemplateRequest
     * @return GetModelProviderTemplateResponse
     */
    @Override
    public CompletableFuture<GetModelProviderTemplateResponse> getModelProviderTemplate(GetModelProviderTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetModelProviderTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetModelProviderTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetModelProviderTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOtaTaskByTaskId  GetOtaTaskByTaskIdRequest
     * @return GetOtaTaskByTaskIdResponse
     */
    @Override
    public CompletableFuture<GetOtaTaskByTaskIdResponse> getOtaTaskByTaskId(GetOtaTaskByTaskIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOtaTaskByTaskId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOtaTaskByTaskIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOtaTaskByTaskIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourcePrice  GetResourcePriceRequest
     * @return GetResourcePriceResponse
     */
    @Override
    public CompletableFuture<GetResourcePriceResponse> getResourcePrice(GetResourcePriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourcePrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourcePriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourcePriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResourceRenewPrice  GetResourceRenewPriceRequest
     * @return GetResourceRenewPriceResponse
     */
    @Override
    public CompletableFuture<GetResourceRenewPriceResponse> getResourceRenewPrice(GetResourceRenewPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceRenewPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceRenewPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceRenewPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the third-party channel configuration status of Agents such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of GetRuntimeChannel  GetRuntimeChannelRequest
     * @return GetRuntimeChannelResponse
     */
    @Override
    public CompletableFuture<GetRuntimeChannelResponse> getRuntimeChannel(GetRuntimeChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRuntimeChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRuntimeChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRuntimeChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the model configuration details currently bound to a specified cloud computer in the Wuying Agent Management Center, including model groups, model provider lists, and associated model information. After you enable the risk information mode, you can also identify differences between the end user\&quot;s actual configuration and the configuration delivered by the administrator.</p>
     * 
     * @param request the request parameters of GetRuntimeModelConfig  GetRuntimeModelConfigRequest
     * @return GetRuntimeModelConfigResponse
     */
    @Override
    public CompletableFuture<GetRuntimeModelConfigResponse> getRuntimeModelConfig(GetRuntimeModelConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRuntimeModelConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRuntimeModelConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRuntimeModelConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAppInstanceGroup  ListAppInstanceGroupRequest
     * @return ListAppInstanceGroupResponse
     */
    @Override
    public CompletableFuture<ListAppInstanceGroupResponse> listAppInstanceGroup(ListAppInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAppInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAppInstances  ListAppInstancesRequest
     * @return ListAppInstancesResponse
     */
    @Override
    public CompletableFuture<ListAppInstancesResponse> listAppInstances(ListAppInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAppInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation returns the list of deployed applications in the application image used by a specified delivery group, including the application ID, name, version, icon, and the number of users currently <strong>authorized by application</strong> for each application (AuthorizedUserCount).
     * The returned AppId is the input for per-application authorization: when you call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to add or remove authorized users for a specified application in a delivery group, pass in the AppId returned by this operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The delivery group is created, and <strong>ProductType matches the product type of the delivery group</strong>. If the delivery group does not exist or the product type does not match, the error code <code>InvalidAppInstanceGroup.NotFound</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>AppInstanceGroupId is required</strong>. This parameter is marked as optional in the parameter table, but the error code <code>InvalidParameter.AppInstanceGroupId</code> is returned if it is not specified.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100. If the values are invalid, the error codes <code>InvalidParameter.PageNumber</code> and <code>InvalidParameter.PageSize</code> are returned respectively.</li>
     * <li>If no applications are deployed in the delivery group image, the operation returns normally: Apps is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId).</li>
     * <li>Call this operation to obtain the list of deployed applications in the delivery group and the AppId of each application.</li>
     * <li>To authorize by application, call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation with the returned AppId.</li>
     * </ol>
     * 
     * @param request the request parameters of ListAppsByAppInstanceGroupId  ListAppsByAppInstanceGroupIdRequest
     * @return ListAppsByAppInstanceGroupIdResponse
     */
    @Override
    public CompletableFuture<ListAppsByAppInstanceGroupIdResponse> listAppsByAppInstanceGroupId(ListAppsByAppInstanceGroupIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAppsByAppInstanceGroupId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppsByAppInstanceGroupIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppsByAppInstanceGroupIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the list of delivery groups for which a specified user (EndUserId) has been granted <strong>delivery group-level authorization</strong>. The response includes basic information about each delivery group (ID, name, status, region, creation time, expiration time, and more) and the list of applications deployed in the delivery group.
     * Scope of returned results:</p>
     * <ul>
     * <li>Only delivery groups that are authorized to the user as a whole through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation are returned. Records authorized on a per-application basis through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation are not included.</li>
     * <li>Only delivery groups whose product type matches the ProductType parameter and that have not been deleted are returned. A delivery group is not returned if its image contains no deployed applications.</li>
     * <li>Results are sorted in reverse chronological order by the update time of the authorization record. The most recently authorized or modified delivery groups appear first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the delivery group to the user.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType and EndUserId are required</strong>. If ProductType is not specified, the error code <code>InvalidParameter.ProductType</code> is returned. If EndUserId is not specified, the error code <code>InvalidParameter.UserId</code> is returned.</li>
     * <li>EndUserId performs an <strong>exact match</strong> on the username. AppInstanceGroupId, AppInstanceGroupName, AppId, and AppName all perform <strong>fuzzy matching</strong> (a hit occurs if the value is contained). When multiple filter conditions are specified, all conditions must be met simultaneously.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100.</li>
     * <li>If the user has no authorized delivery groups that match the conditions, the operation returns normally: AppInstanceGroupModels is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID, and then call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the delivery group to the user.</li>
     * <li>Call this operation to query the delivery groups authorized to the user and the applications deployed in each delivery group.</li>
     * <li>To obtain an application connection ticket for the user, call the <a href="~~GetConnectionTicket~~">GetConnectionTicket</a> operation with the AppInstanceGroupId and the AppId from the Apps list in the response.</li>
     * </ol>
     * 
     * @param request the request parameters of ListAuthorizedAppInstanceGroupByUser  ListAuthorizedAppInstanceGroupByUserRequest
     * @return ListAuthorizedAppInstanceGroupByUserResponse
     */
    @Override
    public CompletableFuture<ListAuthorizedAppInstanceGroupByUserResponse> listAuthorizedAppInstanceGroupByUser(ListAuthorizedAppInstanceGroupByUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAuthorizedAppInstanceGroupByUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuthorizedAppInstanceGroupByUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuthorizedAppInstanceGroupByUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the applications that a specified user is authorized to access at the application granularity. <strong>Only records authorized at the application level are returned</strong> (for example, authorizations completed through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation). Authorizations granted to an entire delivery group through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation are not included in the response.
     * The results are deduplicated by the combination of delivery group and application. Each record corresponds to one application within one delivery group.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The user must already exist under the current account. If the user does not exist, the error code <code>User.NotFound</code> is returned. Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the username.</li>
     * <li>The delivery group that contains the application must already be created, and the application must have been authorized to the user at the application level. If no per-application authorization has been performed, an empty application list is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong><code>EndUserId</code> and <code>ProductType</code> are required.</strong> Set <code>ProductType</code> to <code>CloudApp</code>, which indicates WUYING Cloud Application.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppId</code>, <code>AppInstanceGroupName</code>, and <code>AppName</code> are optional filter conditions. All of them use fuzzy match and can be combined in any way. If all are omitted, all per-application authorization records for the user are returned.</li>
     * <li>Use <code>PageNumber</code> and <code>PageSize</code> for paging. <code>PageNumber</code> starts from 1, and <code>PageSize</code> ranges from 1 to 100. Use the returned <code>TotalCount</code> to determine whether to continue querying.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId) and the application IDs of deployed applications within the delivery group (AppId in the Apps list).</li>
     * <li>Call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize the application to the target user.</li>
     * <li>Call this operation to query the applications that the user is authorized to access.</li>
     * </ol>
     * 
     * @param request the request parameters of ListAuthorizedAppsByUser  ListAuthorizedAppsByUserRequest
     * @return ListAuthorizedAppsByUserResponse
     */
    @Override
    public CompletableFuture<ListAuthorizedAppsByUserResponse> listAuthorizedAppsByUser(ListAuthorizedAppsByUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAuthorizedAppsByUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuthorizedAppsByUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuthorizedAppsByUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAuthorizedUserGroups  ListAuthorizedUserGroupsRequest
     * @return ListAuthorizedUserGroupsResponse
     */
    @Override
    public CompletableFuture<ListAuthorizedUserGroupsResponse> listAuthorizedUserGroups(ListAuthorizedUserGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAuthorizedUserGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuthorizedUserGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuthorizedUserGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the currently authorized users of a specified delivery group (AppInstanceGroupId) or delivery group set (AppInstanceGroupSetId). It returns each user\&quot;s username, account type, email address, phone number, and the authorization mode of the associated delivery group.</p>
     * <ul>
     * <li>This operation returns <strong>authorization relationships</strong> and does not indicate whether users are currently online or have established connections.</li>
     * <li>In the Cloud Browser product, a delivery group corresponds to a cloud browser group, and a delivery group ID corresponds to a browser group ID.
     * The scope of results depends on the authorization mode of the delivery group (response parameter AuthMode):</li>
     * <li>When the authorization mode is <code>App</code> (application-level authorization) or <code>AppInstanceGroup</code> (delivery group-level authorization): Returns users authorized through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation at the delivery group level, as well as users authorized through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation at the application level. If AppId is specified, only users <strong>authorized for that specific application</strong> are returned.</li>
     * <li>When the authorization mode is <code>Session</code> (session-level authorization): Returns users who have been granted persistent sessions. The AppInstancePersistentIds field lists all persistent session IDs granted to each user. If AppInstancePersistentId is specified, only users granted that session are returned.</li>
     * <li>When querying by delivery group set: Returns users authorized for the set. The response parameter AppInstanceGroupId is the primary delivery group ID of the set, and AppInstanceGroupSetId is the queried set ID.
     * When querying by delivery group, results are sorted in descending order by authorization time, with the most recently authorized users listed first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The target delivery group or delivery group set must be created, belong to the current account, and match the specified ProductType. Otherwise, a resource-not-found error code is returned.</li>
     * <li>Users must have been authorized through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> or <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation. If no users have been authorized, the operation returns normally with an empty Users list and TotalCount of 0.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType, PageNumber, and PageSize are required</strong>. If ProductType has an invalid value, the error code <code>ProductTypeInvalid</code> is returned.</li>
     * <li><strong>Exactly one of AppInstanceGroupId and AppInstanceGroupSetId must be specified</strong>. If both or neither are specified, the error code <code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code> is returned.</li>
     * <li><strong>AppId and AppInstancePersistentId are not supported when querying by delivery group set</strong>. If specified, the error codes <code>InvalidParameter.AppId</code> and <code>InvalidParameter.AppInstancePersistentId</code> are returned respectively.</li>
     * <li>EndUserId performs <strong>exact matching</strong> by username. UserIdFuzzy performs <strong>fuzzy matching</strong> by username (a hit occurs if the username contains the keyword). Both can be specified simultaneously, in which case both conditions must be met.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100.</li>
     * <li>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, TotalCount is the number of <strong>authorization records</strong> that match the conditions. If the same user has multiple authorization records (for example, authorized for multiple applications), the records are merged into a single user entry in Users. Therefore, the number of users returned on the current page may be less than PageSize. Use TotalCount to determine whether to continue paging. When the authorization mode is <code>Session</code>, TotalCount is the deduplicated user count.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID. For cloud browser groups, call the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation.</li>
     * <li>Call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize at the delivery group level, or call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize at the application level.</li>
     * <li>Call this operation to query authorized users. To remove authorization, pass the returned EndUserId values to the UnAuthorizeUserIds parameter of the authorization operations mentioned above.</li>
     * </ol>
     * <h2>Error codes</h2>
     * <ul>
     * <li><code>ProductTypeInvalid</code>: The value of ProductType is invalid.</li>
     * <li><code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code>: Both AppInstanceGroupId and AppInstanceGroupSetId are specified, or neither is specified.</li>
     * <li><code>InvalidParameter.AppId</code>: AppId is specified when querying by delivery group set.</li>
     * <li><code>InvalidParameter.AppInstancePersistentId</code>: AppInstancePersistentId is specified when querying by delivery group set.</li>
     * <li><code>InvalidAppInstanceGroupSpecItem.NotFound</code>: The delivery group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidBrowserInstanceGroup.NotFound</code>: When ProductType is <code>CloudBrowser</code>, the cloud browser group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidAppInstanceGroupSet.NotFound</code>: The delivery group set does not exist, does not belong to the current account, the product type does not match, or the set does not have an available primary delivery group.</li>
     * <li><code>InvalidAppInstanceGroupSet.ActivationFailed</code>: The delivery group set is not in an available state.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAuthorizedUsers  ListAuthorizedUsersRequest
     * @return ListAuthorizedUsersResponse
     */
    @Override
    public CompletableFuture<ListAuthorizedUsersResponse> listAuthorizedUsers(ListAuthorizedUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAuthorizedUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuthorizedUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuthorizedUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBindInfo  ListBindInfoRequest
     * @return ListBindInfoResponse
     */
    @Override
    public CompletableFuture<ListBindInfoResponse> listBindInfo(ListBindInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBindInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBindInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBindInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to use this operation in the monthly active user (MAU) billing scenario.</p>
     * <h2>Query conditions</h2>
     * <p>You can filter by browser group identity, name, business region, office network, set, authorized user group, and status. Only one status value can be specified at a time.</p>
     * <h2>Paging</h2>
     * <p>Use <code>PageNumber</code> and <code>PageSize</code> for paging. Use the returned <code>TotalCount</code> to determine whether to continue querying the next page.</p>
     * <h2>What to do next</h2>
     * <p>To view the detailed configuration of a single browser group, invoke <code>GetBrowserInstanceGroup</code> with the returned identity.</p>
     * <h2>Example notes</h2>
     * <p>The <code>-</code> in the examples indicates that the field is not applicable or not returned in the current scenario. It is not an actual character string returned by the operation. Resource identities in the examples are masked. Use the actual query results in your environment.</p>
     * 
     * @param request the request parameters of ListBrowserInstanceGroup  ListBrowserInstanceGroupRequest
     * @return ListBrowserInstanceGroupResponse
     */
    @Override
    public CompletableFuture<ListBrowserInstanceGroupResponse> listBrowserInstanceGroup(ListBrowserInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBrowserInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBrowserInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBrowserInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDesktopAgentRuntime  ListDesktopAgentRuntimeRequest
     * @return ListDesktopAgentRuntimeResponse
     */
    @Override
    public CompletableFuture<ListDesktopAgentRuntimeResponse> listDesktopAgentRuntime(ListDesktopAgentRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDesktopAgentRuntime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDesktopAgentRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDesktopAgentRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListImage  ListImageRequest
     * @return ListImageResponse
     */
    @Override
    public CompletableFuture<ListImageResponse> listImage(ListImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the list of model templates under a model provider template in the WUYING Agent Management Center with paging. Filtering by model group ID, model provider template ID, model template ID, and model encoding is supported. When querying by model group dimension, the default model is automatically pinned to the top.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of ListLlmTemplates  ListLlmTemplatesRequest
     * @return ListLlmTemplatesResponse
     */
    @Override
    public CompletableFuture<ListLlmTemplatesResponse> listLlmTemplates(ListLlmTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLlmTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLlmTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLlmTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListModelProviderEndpoints  ListModelProviderEndpointsRequest
     * @return ListModelProviderEndpointsResponse
     */
    @Override
    public CompletableFuture<ListModelProviderEndpointsResponse> listModelProviderEndpoints(ListModelProviderEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListModelProviderEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelProviderEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelProviderEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can perform a paged query to retrieve the list of model provider templates under a specified model group in the WUYING Agent Management Center. You can filter results by provider name, model group ID, and provider template ID. Paging is supported.
     * Before you call this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of ListModelProviderTemplates  ListModelProviderTemplatesRequest
     * @return ListModelProviderTemplatesResponse
     */
    @Override
    public CompletableFuture<ListModelProviderTemplatesResponse> listModelProviderTemplates(ListModelProviderTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListModelProviderTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelProviderTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelProviderTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the list of resource groups authorized by a model group in the WUYING Agent Management Center.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of ListModelTemplateResourceGroup  ListModelTemplateResourceGroupRequest
     * @return ListModelTemplateResourceGroupResponse
     */
    @Override
    public CompletableFuture<ListModelTemplateResourceGroupResponse> listModelTemplateResourceGroup(ListModelTemplateResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListModelTemplateResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelTemplateResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelTemplateResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use paged query to retrieve the list of model groups created in the Wuying Agent Management Center. You can filter results by Agent provider, Agent platform, template group ID, and whether models have been configured. Paging is supported.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of ListModelTemplates  ListModelTemplatesRequest
     * @return ListModelTemplatesResponse
     */
    @Override
    public CompletableFuture<ListModelTemplatesResponse> listModelTemplates(ListModelTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListModelTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListModelTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListModelTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodeInstanceType  ListNodeInstanceTypeRequest
     * @return ListNodeInstanceTypeResponse
     */
    @Override
    public CompletableFuture<ListNodeInstanceTypeResponse> listNodeInstanceType(ListNodeInstanceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodeInstanceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodeInstanceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodeInstanceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodes  ListNodesRequest
     * @return ListNodesResponse
     */
    @Override
    public CompletableFuture<ListNodesResponse> listNodes(ListNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOtaTask  ListOtaTaskRequest
     * @return ListOtaTaskResponse
     */
    @Override
    public CompletableFuture<ListOtaTaskResponse> listOtaTask(ListOtaTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOtaTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOtaTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOtaTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPersistentAppInstances  ListPersistentAppInstancesRequest
     * @return ListPersistentAppInstancesResponse
     */
    @Override
    public CompletableFuture<ListPersistentAppInstancesResponse> listPersistentAppInstances(ListPersistentAppInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPersistentAppInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPersistentAppInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPersistentAppInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When calling this operation with a RAM user or STS credential, the <code>appstreaming:ListPublishedAppInstanceGroup</code> permission is required.
     * A delivery group must be in the published state and have deployed applications in its image to appear in the query results. This operation only queries information. It does not create delivery groups, assign users, or grant application access permissions.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly pass in <code>ProductType</code>, <code>PageNumber</code>, and <code>PageSize</code>.</strong> Page numbers start from <code>1</code>, and the page size ranges from <code>1</code> to <code>100</code>.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppInstanceGroupName</code>, <code>AppId</code>, and <code>AppName</code> all support substring matching. You can pass them individually or in combination. When multiple conditions are specified, all conditions must be met simultaneously. When both <code>AppId</code> and <code>AppName</code> are specified, the same application must satisfy both conditions.</li>
     * <li>If an optional filter parameter is not specified or is set to an empty string, that condition is not applied. Query results are sorted by delivery group creation time from newest to oldest. A delivery group is not returned multiple times even if it contains multiple matching applications.</li>
     * <li><code>ExcludeUserId</code> excludes delivery groups in which all applications have been directly authorized to the specified user. It cannot be used to determine whether the user has no access permissions at all.</li>
     * <li><code>AppId</code> and <code>AppName</code> only filter delivery groups. <strong>They do not restrict the returned <code>Apps</code> list to only the matched applications.</strong></li>
     * </ul>
     * <h2>Invoke sequence</h2>
     * <ol>
     * <li>Invoke a query with <code>PageNumber=1</code> and the desired <code>PageSize</code>. For WUYING Cloud Application common scenarios, use <code>ProductType=CloudApp</code>.</li>
     * <li>Read <code>AppInstanceGroupModels</code>. To retrieve the next page, keep the product type and filter conditions unchanged and increment <code>PageNumber</code>. If no delivery groups match, the total count is <code>0</code> and the list is empty. If the page number exceeds the result range, the list may also be empty, but the total count still represents the total number of matching delivery groups.</li>
     * <li>To retrieve details of a single delivery group, pass the full <code>AppInstanceGroupId</code> from the response and the same <code>ProductType</code> to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The masked identifiers in the examples are for format demonstration purposes. Replace them with your actual identifiers when invoking the operation.</li>
     * </ol>
     * 
     * @param request the request parameters of ListPublishedAppInstanceGroup  ListPublishedAppInstanceGroupRequest
     * @return ListPublishedAppInstanceGroupResponse
     */
    @Override
    public CompletableFuture<ListPublishedAppInstanceGroupResponse> listPublishedAppInstanceGroup(ListPublishedAppInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPublishedAppInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublishedAppInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublishedAppInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When you call this operation by using a RAM user or Security Token Service (STS) credential, you must have the <code>appstreaming:ListPublishedApps</code> permission.
     * Only delivery groups in the published state whose images contain deployed applications are included in the query results. This operation only queries information. It does not create delivery groups or grant or revoke application access permissions.</p>
     * <h2>Response granularity</h2>
     * <p>Results are returned on a per-delivery-group-plus-application basis. If the same application is deployed in multiple published delivery groups, a separate record is returned for each combination. <code>TotalCount</code> also reflects the number of such combinations. The list is sorted by the creation time of the delivery group in descending order.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly specify <code>ProductType</code>, <code>PageNumber</code>, and <code>PageSize</code>.</strong> Page numbers start from <code>1</code>, and the page size ranges from <code>1</code> to <code>100</code>. Invalid values return error codes <code>InvalidParameter.PageNumber</code> and <code>InvalidParameter.PageSize</code>, respectively.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppInstanceGroupName</code>, <code>AppId</code>, and <code>AppName</code> all support substring matching. You can specify them individually or in combination. When multiple conditions are specified, all conditions must be met.</li>
     * <li>If an optional filter parameter is not specified or is set to an empty string, filtering is not applied for that condition.</li>
     * <li><code>ExcludeUserId</code> excludes applications that have been authorized to the specified user by application, which helps you find applications that can still be authorized to that user. <strong>Access permissions granted through delivery-group-level authorization or user groups are not evaluated by this condition.</strong></li>
     * </ul>
     * <h2>Invocation sequence</h2>
     * <ol>
     * <li>Initiate a query with <code>PageNumber=1</code> and the desired <code>PageSize</code>. For WUYING Cloud Application common scenarios, use <code>ProductType=CloudApp</code>.</li>
     * <li>Read <code>Apps</code>. To retrieve the next page, increment <code>PageNumber</code> while keeping the product type and filter conditions unchanged. If no results match, <code>TotalCount</code> is <code>0</code> and <code>Apps</code> is an empty list. If the page number exceeds the result range, <code>Apps</code> may also be empty, but <code>TotalCount</code> still indicates the total number of matching records.</li>
     * <li>To authorize users for a specific application by application, pass the returned <code>AppInstanceGroupId</code>, <code>AppId</code>, and the same <code>ProductType</code> to <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a>. To view delivery group details, pass <code>AppInstanceGroupId</code> and <code>ProductType</code> to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The masked identities in the examples are for format demonstration purposes. Replace them with your actual identities when you invoke the operation.</li>
     * </ol>
     * 
     * @param request the request parameters of ListPublishedApps  ListPublishedAppsRequest
     * @return ListPublishedAppsResponse
     */
    @Override
    public CompletableFuture<ListPublishedAppsResponse> listPublishedApps(ListPublishedAppsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPublishedApps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublishedAppsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublishedAppsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The regions returned by this operation are not all available regions. For information about available regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    @Override
    public CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagCloudResources  ListTagCloudResourcesRequest
     * @return ListTagCloudResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagCloudResourcesResponse> listTagCloudResources(ListTagCloudResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagCloudResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagCloudResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagCloudResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation complies with the Alibaba Cloud tagging standard and is used to query tags bound to Elastic Cloud Application (China) delivery groups. You can query tags bound to resources by resource ID, or filter resources that have specific tags bound by tag key-value pairs.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>A delivery group is created. You can call the ListAppInstanceGroup operation to obtain the delivery group ID.</li>
     * <li>Tags are bound to the delivery group. You can bind tags by calling the TagResources operation, or by using the console or the Tag service.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ResourceType is required</strong>. Only <code>APPINSTANCEGROUP</code> (delivery group) is supported. If you specify other values, the error code <code>InvalidResourceType.Invalid</code> is returned.</li>
     * <li><strong>Specify at least one of ResourceId.N and Tag.N</strong>. If neither is specified, the error code <code>MissingParameter.ResourceIdsOrTags</code> is returned.<ul>
     * <li>If only ResourceId.N is specified: all tags attached to the specified resources are returned.</li>
     * <li>If only Tag.N is specified: all resources that have the specified tags attached and their matching tags are returned.</li>
     * <li>If both are specified: only records of the specified resources that have the specified tags attached are returned.</li>
     * </ul>
     * </li>
     * <li>Tag.N.Key is required. If it is empty, the error code <code>InvalidTagPolicy.KeyInvalid</code> is returned. Tag.N.Value is optional. If it is not specified, the value of the tag key is not restricted, which means any tag value under the key is matched.</li>
     * <li>Multiple Tag.N conditions have an AND relationship. A resource is returned only if it has all specified tags attached.</li>
     * </ul>
     * <h2>Response description</h2>
     * <ul>
     * <li>Each record in the response corresponds to a resource-tag key-value pair. If a resource has multiple tags bound, multiple records are returned.</li>
     * <li>TotalCount indicates the number of records returned.</li>
     * <li>This operation returns all matching results at a time. An empty NextToken value indicates that no more data is available.</li>
     * </ul>
     * <h2>Invocation sequence</h2>
     * <ol>
     * <li>Invoke the ListAppInstanceGroup operation to obtain the delivery group ID.</li>
     * <li>Invoke the TagResources operation to attach tags to the delivery group.</li>
     * <li>Invoke this operation to query tag bindings by resource ID or tag conditions.</li>
     * </ol>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTenantConfig  ListTenantConfigRequest
     * @return ListTenantConfigResponse
     */
    @Override
    public CompletableFuture<ListTenantConfigResponse> listTenantConfig(ListTenantConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTenantConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTenantConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTenantConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of WUYING workstations.</p>
     * 
     * @param request the request parameters of ListWuyingServer  ListWuyingServerRequest
     * @return ListWuyingServerResponse
     */
    @Override
    public CompletableFuture<ListWuyingServerResponse> listWuyingServer(ListWuyingServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWuyingServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWuyingServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWuyingServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation returns the list of available zone IDs for the current Alibaba Cloud account based on the specified region, product type, and operating system type. A typical use case is to check which zones are available before creating a resource that requires a vSwitch, and then select a vSwitch in one of those zones.
     * This operation only queries information. It does not create resources or incur fees.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>When calling this operation with a RAM user or STS credential, the <code>appstreaming:ListAppInstanceType</code> permission is required. If the permission is insufficient, the error code <code>Forbidden.NoPermission</code> is returned.</li>
     * <li><strong><code>ProductType</code>, <code>BizRegionId</code>, and <code>OsType</code> are all required.</strong> If any of these parameters is missing, empty, or set to an unrecognized value, the error code <code>InvalidParameter.ValueInvalid</code> is returned.</li>
     * <li><code>BizRegionId</code> must be a region ID supported by WUYING Cloud Application. Call <a href="~~ListRegions~~">ListRegions</a> first to obtain the supported region IDs.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListRegions~~">ListRegions</a> to obtain the supported region IDs.</li>
     * <li>Call this operation with the region ID, target product type, and operating system type, and read the returned <code>ListZonesModel.Zones</code>.</li>
     * <li>When creating a resource that requires a vSwitch, select a vSwitch in one of the returned zones. For example, pass the corresponding vSwitch ID when calling <a href="~~CreateAppInstanceGroup~~">CreateAppInstanceGroup</a> or <a href="~~CreateWuyingServer~~">CreateWuyingServer</a>.
     * The returned zone list is determined by the available resources in the current region and may change over time. Query the list in real time before creating resources instead of caching it for extended periods.</li>
     * </ol>
     * 
     * @param request the request parameters of ListZones  ListZonesRequest
     * @return ListZonesResponse
     */
    @Override
    public CompletableFuture<ListZonesResponse> listZones(ListZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to pay-as-you-go resource delivery groups that have scheduled auto scaling enabled. The operation can be called only outside the scaling time periods specified in the scheduled auto scaling policy.</p>
     * </blockquote>
     * 
     * @param request the request parameters of LogOffAllSessionsInAppInstanceGroup  LogOffAllSessionsInAppInstanceGroupRequest
     * @return LogOffAllSessionsInAppInstanceGroupResponse
     */
    @Override
    public CompletableFuture<LogOffAllSessionsInAppInstanceGroupResponse> logOffAllSessionsInAppInstanceGroup(LogOffAllSessionsInAppInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LogOffAllSessionsInAppInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LogOffAllSessionsInAppInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LogOffAllSessionsInAppInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAppInstanceGroupAttribute  ModifyAppInstanceGroupAttributeRequest
     * @return ModifyAppInstanceGroupAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyAppInstanceGroupAttributeResponse> modifyAppInstanceGroupAttribute(ModifyAppInstanceGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAppInstanceGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAppInstanceGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAppInstanceGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyAppPolicy  ModifyAppPolicyRequest
     * @return ModifyAppPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyAppPolicyResponse> modifyAppPolicy(ModifyAppPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAppPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAppPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAppPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Modifies the attributes of a Wuying Cloud Browser.</p>
     * 
     * @param request the request parameters of ModifyBrowserInstanceGroup  ModifyBrowserInstanceGroupRequest
     * @return ModifyBrowserInstanceGroupResponse
     */
    @Override
    public CompletableFuture<ModifyBrowserInstanceGroupResponse> modifyBrowserInstanceGroup(ModifyBrowserInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBrowserInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBrowserInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBrowserInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyNodePoolAmount  ModifyNodePoolAmountRequest
     * @return ModifyNodePoolAmountResponse
     */
    @Override
    public CompletableFuture<ModifyNodePoolAmountResponse> modifyNodePoolAmount(ModifyNodePoolAmountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNodePoolAmount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNodePoolAmountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNodePoolAmountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can configure the elastic pattern for WUYING Cloud Application resources in Settings:</p>
     * <ul>
     * <li>Fixed quantity: Elastic scaling is not used.</li>
     * <li>Automatic scaling: Automatically scales resources based on the number of connected sessions and the duration without session connections.</li>
     * <li>Scheduled scaling: Executes resource scaling during specified time periods on specified dates.
     * Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing method and pricing</a> of WUYING Cloud Application.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyNodePoolAttribute  ModifyNodePoolAttributeRequest
     * @return ModifyNodePoolAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyNodePoolAttributeResponse> modifyNodePoolAttribute(ModifyNodePoolAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNodePoolAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNodePoolAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNodePoolAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTenantConfig  ModifyTenantConfigRequest
     * @return ModifyTenantConfigResponse
     */
    @Override
    public CompletableFuture<ModifyTenantConfigResponse> modifyTenantConfig(ModifyTenantConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTenantConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTenantConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTenantConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyWuyingServerAttribute  ModifyWuyingServerAttributeRequest
     * @return ModifyWuyingServerAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyWuyingServerAttributeResponse> modifyWuyingServerAttribute(ModifyWuyingServerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyWuyingServerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyWuyingServerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyWuyingServerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PageListAppInstanceGroupUser  PageListAppInstanceGroupUserRequest
     * @return PageListAppInstanceGroupUserResponse
     */
    @Override
    public CompletableFuture<PageListAppInstanceGroupUserResponse> pageListAppInstanceGroupUser(PageListAppInstanceGroupUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PageListAppInstanceGroupUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PageListAppInstanceGroupUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PageListAppInstanceGroupUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for resources that belong to Agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. These model groups serve as inference engines for Agents to execute tasks within the resource group.
     * When an Agent runtime has its own model group configured and the resource group it belongs to also has a model group configured, the model group bound to the resource group takes effect. The resource group setting has a higher priority than the Agent runtime setting.
     * When you remove the model group from the resource group to which an Agent runtime belongs, the model group configured on the Agent runtime itself automatically takes effect.
     * Before calling this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of RemoveResourceGroupModelTemplate  RemoveResourceGroupModelTemplateRequest
     * @return RemoveResourceGroupModelTemplateResponse
     */
    @Override
    public CompletableFuture<RemoveResourceGroupModelTemplateResponse> removeResourceGroupModelTemplate(RemoveResourceGroupModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveResourceGroupModelTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveResourceGroupModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveResourceGroupModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove a specific third-party channel configuration from Agents such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. After the removal, the Agent cannot use the third-party channel for conversations.
     * Before calling this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of RemoveRuntimeChannel  RemoveRuntimeChannelRequest
     * @return RemoveRuntimeChannelResponse
     */
    @Override
    public CompletableFuture<RemoveRuntimeChannelResponse> removeRuntimeChannel(RemoveRuntimeChannelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveRuntimeChannel").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveRuntimeChannelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveRuntimeChannelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can remove model groups from Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. When an Agent runtime resource needs to switch to a different model group, call this operation first to remove the authorization relationship between the Agent runtime resource and the existing model group.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before calling this operation.</p>
     * 
     * @param request the request parameters of RemoveRuntimeModelTemplate  RemoveRuntimeModelTemplateRequest
     * @return RemoveRuntimeModelTemplateResponse
     */
    @Override
    public CompletableFuture<RemoveRuntimeModelTemplateResponse> removeRuntimeModelTemplate(RemoveRuntimeModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveRuntimeModelTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveRuntimeModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveRuntimeModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing and pricing</a> of WUYING Workspace.</p>
     * <blockquote>
     * <p>Prerequisites:</p>
     * <ul>
     * <li>The delivery group must be in the PUBLISHED state, and ChargeType must be set to PrePaid.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of RenewAppInstanceGroup  RenewAppInstanceGroupRequest
     * @return RenewAppInstanceGroupResponse
     */
    @Override
    public CompletableFuture<RenewAppInstanceGroupResponse> renewAppInstanceGroup(RenewAppInstanceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewAppInstanceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewAppInstanceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewAppInstanceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenewWuyingServer  RenewWuyingServerRequest
     * @return RenewWuyingServerResponse
     */
    @Override
    public CompletableFuture<RenewWuyingServerResponse> renewWuyingServer(RenewWuyingServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewWuyingServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewWuyingServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewWuyingServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartWuyingServer  RestartWuyingServerRequest
     * @return RestartWuyingServerResponse
     */
    @Override
    public CompletableFuture<RestartWuyingServerResponse> restartWuyingServer(RestartWuyingServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartWuyingServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartWuyingServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartWuyingServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartTaskForDistributeImage  StartTaskForDistributeImageRequest
     * @return StartTaskForDistributeImageResponse
     */
    @Override
    public CompletableFuture<StartTaskForDistributeImageResponse> startTaskForDistributeImage(StartTaskForDistributeImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartTaskForDistributeImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTaskForDistributeImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTaskForDistributeImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartWuyingServer  StartWuyingServerRequest
     * @return StartWuyingServerResponse
     */
    @Override
    public CompletableFuture<StartWuyingServerResponse> startWuyingServer(StartWuyingServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartWuyingServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartWuyingServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartWuyingServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopWuyingServer  StopWuyingServerRequest
     * @return StopWuyingServerResponse
     */
    @Override
    public CompletableFuture<StopWuyingServerResponse> stopWuyingServer(StopWuyingServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopWuyingServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopWuyingServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopWuyingServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TagCloudResources  TagCloudResourcesRequest
     * @return TagCloudResourcesResponse
     */
    @Override
    public CompletableFuture<TagCloudResourcesResponse> tagCloudResources(TagCloudResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagCloudResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagCloudResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagCloudResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When you use a RAM user or Security Token Service (STS) credential to call this operation, you must have the <code>appstreaming:TagResources</code> permission.
     * The resources to which you want to bind tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only delivery group resources.</strong> You can set <code>ResourceType</code> only to <code>APPINSTANCEGROUP</code>. You can call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain delivery group IDs.</p>
     * <h2>Tag rules</h2>
     * <ul>
     * <li>In a single request, you can bind up to <strong>20 tags</strong> to up to <strong>50 resources</strong>. Duplicate resource IDs are automatically deduplicated.</li>
     * <li>A tag key must be 1 to 128 characters in length. A tag value must be 0 to 256 characters in length. Both are case-sensitive.</li>
     * <li>A tag key cannot start with <code>aliyun</code> or <code>acs:</code> (case-insensitive). Neither tag keys nor tag values can contain <code>http://</code> or <code>https://</code>.</li>
     * <li>Tag keys in the same request must be unique. Otherwise, the error code <code>InvalidTag.Duplicated</code> is returned.</li>
     * <li>Each tag key on a resource can correspond to only one tag value. If the tag key already exists on the resource, the tag value is updated to the new value.</li>
     * <li>A maximum of 20 custom tags can be bound to a single resource. If this limit is exceeded, the error code <code>ResourceTag.CustomTagCountExceed</code> is returned.</li>
     * </ul>
     * <h2>Results</h2>
     * <ul>
     * <li><strong>If any specified delivery group does not exist or does not belong to the current account, the entire request fails.</strong> The error code <code>InvalidAppInstanceGroup.NotFound</code> is returned, and no tags are bound to any resource.</li>
     * <li>If the binding succeeds, the response contains only <code>RequestId</code> and does not return tag details.</li>
     * <li>If multiple resources are specified and only some of them fail to be bound, the operation still returns a success response without failure details. Call <code>ListTagResources</code> to verify the binding results. If only one resource is specified and the binding fails, the operation returns the corresponding error code.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the IDs of the delivery groups to which you want to add tags.</li>
     * <li>Call this operation with <code>ResourceType=APPINSTANCEGROUP</code>, <code>ResourceId.N</code>, and <code>Tag.N.Key</code>/<code>Tag.N.Value</code>.</li>
     * <li>To view the tags bound to resources, call <code>ListTagResources</code>. To unbind tags, call <code>UntagResources</code>.
     * The masked identifiers in the examples are used to demonstrate the format. Replace them with your actual identifiers when you call the operation.</li>
     * </ol>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnassignWuyingServerPrivateAddresses  UnassignWuyingServerPrivateAddressesRequest
     * @return UnassignWuyingServerPrivateAddressesResponse
     */
    @Override
    public CompletableFuture<UnassignWuyingServerPrivateAddressesResponse> unassignWuyingServerPrivateAddresses(UnassignWuyingServerPrivateAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassignWuyingServerPrivateAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassignWuyingServerPrivateAddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassignWuyingServerPrivateAddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Unbind  UnbindRequest
     * @return UnbindResponse
     */
    @Override
    public CompletableFuture<UnbindResponse> unbind(UnbindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Unbind").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UntagCloudResources  UntagCloudResourcesRequest
     * @return UntagCloudResourcesResponse
     */
    @Override
    public CompletableFuture<UntagCloudResourcesResponse> untagCloudResources(UntagCloudResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagCloudResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagCloudResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagCloudResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When calling this operation with a RAM user or STS credential, the <code>appstreaming:UntagResources</code> permission is required.
     * The resources from which you want to unbind tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only delivery group resources.</strong> You can set <code>ResourceType</code> only to <code>APPINSTANCEGROUP</code>. You can obtain delivery group IDs by calling <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a>, and query tags that are bound to a resource by calling <a href="~~ListTagResources~~">ListTagResources</a>.</p>
     * <h2>Parameter description</h2>
     * <ul>
     * <li>You can unbind tags from up to <strong>50 resources</strong> in a single request. Duplicate resource IDs are automatically deduplicated.</li>
     * <li><strong>Specify at least one of <code>TagKey.N</code> and <code>All</code>.</strong> If neither is specified, or if <code>TagKey.N</code> is not specified and <code>All</code> is set to <code>false</code>, the error code <code>InvalidParameter.TagKeyListOrAll</code> is returned.<ul>
     * <li>If <code>TagKey.N</code> is specified: only the tags that correspond to the specified tag keys are unbound. You can specify up to 20 tag keys at a time. The <code>All</code> parameter is ignored.</li>
     * <li>If <code>TagKey.N</code> is not specified and <code>All=true</code>: all custom tags on the resource are unbound, including Wuying system tags that start with <code>System/</code> and were attached by calling <a href="~~TagResources~~">TagResources</a>.</li>
     * </ul>
     * </li>
     * <li>If a specified tag key does not exist on the resource, the tag key is skipped and no error is returned.</li>
     * <li>Tag keys that start with <code>System/</code> are Wuying system tags. Only <code>System/Scheduler/GRAYSCALE</code> and <code>System/Scheduler/STOP_NEW_USER_CONNECTION</code> are supported. If you specify other tag keys that start with <code>System/</code>, the error code <code>InvalidTagPolicy.KeyInvalid</code> or <code>InvalidTag.SystemKeyNotAllow</code> is returned.</li>
     * </ul>
     * <h2>Execution results</h2>
     * <ul>
     * <li><strong>If any specified delivery group does not exist or does not belong to the current account, the entire request fails</strong> with the error code <code>InvalidAppInstanceGroup.NotFound</code>, and no tags are unbound from any resource.</li>
     * <li>On success, the response contains only <code>RequestId</code> and does not return tag details.</li>
     * <li>When multiple resources are specified and only some fail to have tags unbound, the operation still returns success and the response does not contain failure details. Call <a href="~~ListTagResources~~">ListTagResources</a> to verify the unbinding results. When only one resource is specified and the unbinding fails, the operation returns the corresponding error code directly.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain delivery group IDs. To check which tag keys are bound to a resource, call <a href="~~ListTagResources~~">ListTagResources</a>.</li>
     * <li>Call this operation with <code>ResourceType=APPINSTANCEGROUP</code> and <code>ResourceId.N</code>, and specify <code>TagKey.N</code> or <code>All=true</code> to indicate the tags to unbind.</li>
     * <li>To rebind tags, call <a href="~~TagResources~~">TagResources</a>.
     * The masked identifiers in the examples are for format demonstration purposes only. Replace them with your actual identifiers when making calls.</li>
     * </ol>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: After the image update starts, sessions of end users who are accessing cloud applications will be disconnected. Proceed with caution to avoid data loss for end users.
     * Before calling this API, the delivery group must be in the PUBLISHED, DEPLOYED, or MAINTAIN_FAILED state. You can call GetAppInstanceGroup to query the current state of the delivery group.
     * After the update is published, you typically need to wait about 2 minutes for the changes to take effect on the client.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateAppInstanceGroupImage  UpdateAppInstanceGroupImageRequest
     * @return UpdateAppInstanceGroupImageResponse
     */
    @Override
    public CompletableFuture<UpdateAppInstanceGroupImageResponse> updateAppInstanceGroupImage(UpdateAppInstanceGroupImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAppInstanceGroupImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAppInstanceGroupImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAppInstanceGroupImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can update a model provider template that has been created in the WUYING Agent Management Center, including the template name, description, model service connection configuration, and WUYING security proxy switch. Partial field updates are supported. You only need to pass in the fields that you want to modify.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * @param request the request parameters of UpdateModelProviderTemplate  UpdateModelProviderTemplateRequest
     * @return UpdateModelProviderTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateModelProviderTemplateResponse> updateModelProviderTemplate(UpdateModelProviderTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateModelProviderTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelProviderTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelProviderTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can update a model group that has been created in the Wuying Agent Management Center, including the group name, description, and model configuration information. You can modify the default model of a model group by updating the Config field. The updated configuration automatically takes effect on associated cloud desktops.
     * Before you call this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * @param request the request parameters of UpdateModelTemplate  UpdateModelTemplateRequest
     * @return UpdateModelTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateModelTemplateResponse> updateModelTemplate(UpdateModelTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateModelTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateModelTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateModelTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateWuyingServerImage  UpdateWuyingServerImageRequest
     * @return UpdateWuyingServerImageResponse
     */
    @Override
    public CompletableFuture<UpdateWuyingServerImageResponse> updateWuyingServerImage(UpdateWuyingServerImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWuyingServerImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWuyingServerImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWuyingServerImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
