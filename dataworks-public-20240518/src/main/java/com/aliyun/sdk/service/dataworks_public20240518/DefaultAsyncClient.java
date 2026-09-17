// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dataworks_public20240518.models.*;
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
        this.product = "dataworks-public";
        this.version = "2024-05-18";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "dataworks.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "dataworks.aliyuncs.com"),
            new TeaPair("ap-south-1", "dataworks.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "dataworks.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "dataworks.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "dataworks.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dataworks.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "dataworks.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "dataworks.cn-beijing-finance-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "dataworks.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-chengdu", "dataworks.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-edge-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-fujian", "dataworks.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dataworks.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "dataworks.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dataworks.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "dataworks.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "dataworks.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "dataworks.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("cn-qingdao", "dataworks.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dataworks.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "dataworks.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dataworks.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "dataworks.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-wuhan", "dataworks.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "dataworks.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "dataworks.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "dataworks.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "dataworks.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "dataworks.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "dataworks.aliyuncs.com"),
            new TeaPair("eu-central-1", "dataworks.eu-central-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "dataworks.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "dataworks.aliyuncs.com"),
            new TeaPair("me-east-1", "dataworks.me-east-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "dataworks.aliyuncs.com"),
            new TeaPair("us-east-1", "dataworks.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "dataworks.us-west-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "dataworks.ap-northeast-2.aliyuncs.com"),
            new TeaPair("me-central-1", "dataworks.me-central-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AbolishCrossProjectPipelineRun  AbolishCrossProjectPipelineRunRequest
     * @return AbolishCrossProjectPipelineRunResponse
     */
    @Override
    public CompletableFuture<AbolishCrossProjectPipelineRunResponse> abolishCrossProjectPipelineRun(AbolishCrossProjectPipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AbolishCrossProjectPipelineRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AbolishCrossProjectPipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AbolishCrossProjectPipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation may not be available in earlier versions of the SDK. In this case, use the AbolishDeployment operation. The parameters are the same as those described in this document.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AbolishPipelineRun  AbolishPipelineRunRequest
     * @return AbolishPipelineRunResponse
     */
    @Override
    public CompletableFuture<AbolishPipelineRunResponse> abolishPipelineRun(AbolishPipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AbolishPipelineRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AbolishPipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AbolishPipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Professional Edition or a more advanced edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of AddEntityIntoMetaCollection  AddEntityIntoMetaCollectionRequest
     * @return AddEntityIntoMetaCollectionResponse
     */
    @Override
    public CompletableFuture<AddEntityIntoMetaCollectionResponse> addEntityIntoMetaCollection(AddEntityIntoMetaCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddEntityIntoMetaCollection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddEntityIntoMetaCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddEntityIntoMetaCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Reason</strong>: The reason for the request. This parameter is required.</li>
     * <li><strong>ApplyContents</strong>: Contains multiple resource permission request entries. Each entry includes a resource description (Resource), a grantee description (Grantee), access types (AccessTypes), and a permission expiration time (ExpirationTime). A maximum of 400 entries can be submitted in a single request.</li>
     * <li><strong>Resource</strong>: The resource description. You must specify the ResourceSchema.name and version on which the resource parsing depends, as well as the resource metadata (MetaData).</li>
     * <li><strong>Grantee</strong>: The grantee description. You must specify the principal type (PrincipalType) and principal ID (PrincipalId).</li>
     * <li><strong>AccessTypes</strong>: The list of access types. Multiple access type combinations are supported.</li>
     * <li><strong>ExpirationTime</strong>: The permission expiration time, provided as a millisecond-level timestamp.</li>
     * <li><strong>AuthMethod</strong>: Optional. Specifies the authorization method. The system uses the built-in default authorization method if this parameter is not specified.</li>
     * <li><strong>ClientToken</strong>: The client token used to prevent duplicate requests. This parameter is optional.
     * Make sure that all required fields are correctly specified and meet the corresponding constraints. For example, the DefVersion and MetaData in Resource must match the selected DefSchema.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyResourceAccessPermission  ApplyResourceAccessPermissionRequest
     * @return ApplyResourceAccessPermissionResponse
     */
    @Override
    public CompletableFuture<ApplyResourceAccessPermissionResponse> applyResourceAccessPermission(ApplyResourceAccessPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyResourceAccessPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyResourceAccessPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyResourceAccessPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows you to approve or reject a specified approval process instance by passing in the ProcessInstanceId and approval information (including ApprovalComment and ApprovalAction).</li>
     * <li>ApprovalAction can be <code>Agree</code> or <code>Deny</code>, indicating approval or rejection respectively.</li>
     * <li>ApprovalComment is required and records the specific approval opinion.</li>
     * </ul>
     * 
     * @param request the request parameters of ApproveProcessInstance  ApproveProcessInstanceRequest
     * @return ApproveProcessInstanceResponse
     */
    @Override
    public CompletableFuture<ApproveProcessInstanceResponse> approveProcessInstance(ApproveProcessInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApproveProcessInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApproveProcessInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApproveProcessInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of AssociateProjectToImage  AssociateProjectToImageRequest
     * @return AssociateProjectToImageResponse
     */
    @Override
    public CompletableFuture<AssociateProjectToImageResponse> associateProjectToImage(AssociateProjectToImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateProjectToImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateProjectToImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateProjectToImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must have purchased DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Storage Management Administrator, Project Owner, or O&amp;M Engineer</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateProjectToResourceGroup  AssociateProjectToResourceGroupRequest
     * @return AssociateProjectToResourceGroupResponse
     */
    @Override
    public CompletableFuture<AssociateProjectToResourceGroupResponse> associateProjectToResourceGroup(AssociateProjectToResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateProjectToResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateProjectToResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateProjectToResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI AttachDataQualityRulesToEvaluationTask is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of AttachDataQualityRulesToEvaluationTask  AttachDataQualityRulesToEvaluationTaskRequest
     * @return AttachDataQualityRulesToEvaluationTaskResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<AttachDataQualityRulesToEvaluationTaskResponse> attachDataQualityRulesToEvaluationTask(AttachDataQualityRulesToEvaluationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachDataQualityRulesToEvaluationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachDataQualityRulesToEvaluationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachDataQualityRulesToEvaluationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Professional Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of BatchCreateMetaEntities  BatchCreateMetaEntitiesRequest
     * @return BatchCreateMetaEntitiesResponse
     */
    @Override
    public CompletableFuture<BatchCreateMetaEntitiesResponse> batchCreateMetaEntities(BatchCreateMetaEntitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchCreateMetaEntities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateMetaEntitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateMetaEntitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Requires DataWorks Professional Edition or a higher edition.</p>
     * 
     * @param request the request parameters of BatchDeleteMetaEntities  BatchDeleteMetaEntitiesRequest
     * @return BatchDeleteMetaEntitiesResponse
     */
    @Override
    public CompletableFuture<BatchDeleteMetaEntitiesResponse> batchDeleteMetaEntities(BatchDeleteMetaEntitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchDeleteMetaEntities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteMetaEntitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteMetaEntitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of BatchUpdateTasks  BatchUpdateTasksRequest
     * @return BatchUpdateTasksResponse
     */
    @Override
    public CompletableFuture<BatchUpdateTasksResponse> batchUpdateTasks(BatchUpdateTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchUpdateTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUpdateTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUpdateTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of BuildImage  BuildImageRequest
     * @return BuildImageResponse
     */
    @Override
    public CompletableFuture<BuildImageResponse> buildImage(BuildImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BuildImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BuildImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BuildImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation is mainly used to actively interrupt an ongoing session, especially when the session is in a streaming response state.</li>
     * <li><code>sessionId</code> is a required parameter that identifies the specific session to cancel.</li>
     * </ul>
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
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of CancelImageTest  CancelImageTestRequest
     * @return CancelImageTestResponse
     */
    @Override
    public CompletableFuture<CancelImageTestResponse> cancelImageTest(CancelImageTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelImageTest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelImageTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelImageTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must have purchased DataWorks Basic Edition or a higher edition.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Storage Management Administrator, Project Owner, or O&amp;M Engineer</li>
     * </ul>
     * 
     * @param request the request parameters of CloneDataSource  CloneDataSourceRequest
     * @return CloneDataSourceResponse
     */
    @Override
    public CompletableFuture<CloneDataSourceResponse> cloneDataSource(CloneDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloneDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Agent name</strong>: Must be unique within the current account.</li>
     * <li><strong>Model configuration</strong>: An optional parameter that specifies the model used by the Agent and its related settings.</li>
     * <li><strong>Visibility level</strong>: Defines who can access the Agent. The Agent can be visible within the account, to a specific project, or to specific users.</li>
     * <li><strong>Visibility scope</strong>: When you set the visibility level to <code>PROJECT</code> or <code>USER</code>, you must specify the list of project IDs or user IDs.</li>
     * <li><strong>Other parameters</strong>: Optional parameters such as display name and description. Set them as needed.</li>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation creates a new agent session.</li>
     * <li>Use <code>_meta.agent.agentName</code> to specify the agent name to bind. This parameter is required.<ul>
     * <li>dataworks_data_agent: DataWorks built-in agent — Data Agent. Provides intelligent data development AI capabilities that cover the entire pipeline of data integration, development, O&amp;M, governance, and analytics.</li>
     * <li>dataworks_chatbi_agent: DataWorks built-in agent — ChatBI. Uses natural language processing and intelligent analytics to automate the entire analysis workflow through conversational interaction, from requirement parsing, data extraction, and automatic code generation to visualization report output.</li>
     * <li>dataworks_ai_assistant_agent: DataWorks built-in agent — AI Assistant Service. A DataWorks enterprise-grade dedicated AI assistant built on open source frameworks such as OpenClaw and Hermes Agent.</li>
     * </ul>
     * </li>
     * <li>Use <code>_meta.config.sessionSource</code> to pass through a session source identifier for subsequent retrieval by source.</li>
     * <li>Use <code>_meta.config.sessionTags[].sessionTagCode</code> to pass in session tags.</li>
     * </ul>
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
     * @param request the request parameters of CreateAlertRule  CreateAlertRuleRequest
     * @return CreateAlertRuleResponse
     */
    @Override
    public CompletableFuture<CreateAlertRuleResponse> createAlertRule(CreateAlertRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAlertRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAlertRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAlertRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBusiness  CreateBusinessRequest
     * @return CreateBusinessResponse
     */
    @Override
    public CompletableFuture<CreateBusinessResponse> createBusiness(CreateBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If you specify multiple publish entities in the parameters, all entities except the first one are ignored.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateComponent  CreateComponentRequest
     * @return CreateComponentResponse
     */
    @Override
    public CompletableFuture<CreateComponentResponse> createComponent(CreateComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * You must have at least one of the following roles in the DataWorks workspace:
     * Tenant Owner, Workspace Administrator, Project Owner, or O&amp;M.</p>
     * 
     * @param request the request parameters of CreateComputeResource  CreateComputeResourceRequest
     * @return CreateComputeResourceResponse
     */
    @Override
    public CompletableFuture<CreateComputeResourceResponse> createComputeResource(CreateComputeResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateComputeResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComputeResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComputeResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Creates a metadata crawler for a specified data source and configures the collection scope, resource group, scheduling method, and extended configurations.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Call <code>GetCrawlerTypeCapabilities</code> to query the crawler types and their configuration capabilities supported in the current region.</li>
     * <li>Create a crawler by using a data source that matches the <code>Type</code> value. Before creating a crawler, ensure that the data source and the selected resource group pass the connectivity test by calling the <code>TestDataSourceConnectivity</code> API to avoid creating an invalid crawler.</li>
     * <li>After the crawler is created, call <code>RunCrawler</code> to manually run it, or configure periodic scheduling for automatic execution.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * <h2>Precautions</h2>
     * <p>A successful creation only indicates that the crawler configuration has been generated. Metadata collection is not immediately executed.</p>
     * 
     * @param request the request parameters of CreateCrawler  CreateCrawlerRequest
     * @return CreateCrawlerResponse
     */
    @Override
    public CompletableFuture<CreateCrawlerResponse> createCrawler(CreateCrawlerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCrawler").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCrawlerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCrawlerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates and persists a cross-workspace deployment flow. The ObjectIds parameter must contain exactly one top-level object ID from the source project. Child objects of composite objects such as workflows are automatically included by the system. Passing multiple objects causes parameter validation to fail. You can call ListCrossProjectDeploymentCandidates to query candidate objects, call ExecCrossProjectPipelineRun to execute the deployment after creation, and call GetCrossProjectPipelineRun to query the deployment status.</p>
     * 
     * @param request the request parameters of CreateCrossProjectPipelineRun  CreateCrossProjectPipelineRunRequest
     * @return CreateCrossProjectPipelineRunResponse
     */
    @Override
    public CompletableFuture<CreateCrossProjectPipelineRunResponse> createCrossProjectPipelineRun(CreateCrossProjectPipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCrossProjectPipelineRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCrossProjectPipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCrossProjectPipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomAttribute  CreateCustomAttributeRequest
     * @return CreateCustomAttributeResponse
     */
    @Override
    public CompletableFuture<CreateCustomAttributeResponse> createCustomAttribute(CreateCustomAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of CreateDIAlarmRule  CreateDIAlarmRuleRequest
     * @return CreateDIAlarmRuleResponse
     */
    @Override
    public CompletableFuture<CreateDIAlarmRuleResponse> createDIAlarmRule(CreateDIAlarmRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDIAlarmRule").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDIAlarmRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDIAlarmRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>This operation creates a data integration synchronization task. Parameters include the source configuration SourceDataSourceSettings and the destination configuration DestinationDataSourceSettings, the supported synchronization type MigrationType, transformation rules defined through TransformationRules for mapping operations such as adding columns and renaming tables, specific tables to synchronize and the mapping rules to apply defined in TableMappings, and task-level settings such as column mappings and scheduling configurations defined in JobSettings.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDIJob  CreateDIJobRequest
     * @return CreateDIJobResponse
     */
    @Override
    public CompletableFuture<CreateDIJobResponse> createDIJob(CreateDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDIJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of CreateDataAssetTag  CreateDataAssetTagRequest
     * @return CreateDataAssetTagResponse
     */
    @Override
    public CompletableFuture<CreateDataAssetTagResponse> createDataAssetTag(CreateDataAssetTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataAssetTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataAssetTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataAssetTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of CreateDataQualityAlertRule  CreateDataQualityAlertRuleRequest
     * @return CreateDataQualityAlertRuleResponse
     */
    @Override
    public CompletableFuture<CreateDataQualityAlertRuleResponse> createDataQualityAlertRule(CreateDataQualityAlertRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataQualityAlertRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataQualityAlertRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataQualityAlertRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of CreateDataQualityEvaluationTask  CreateDataQualityEvaluationTaskRequest
     * @return CreateDataQualityEvaluationTaskResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateDataQualityEvaluationTaskResponse> createDataQualityEvaluationTask(CreateDataQualityEvaluationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataQualityEvaluationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataQualityEvaluationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataQualityEvaluationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateDataQualityEvaluationTaskInstance is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScanRun instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of CreateDataQualityEvaluationTaskInstance  CreateDataQualityEvaluationTaskInstanceRequest
     * @return CreateDataQualityEvaluationTaskInstanceResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateDataQualityEvaluationTaskInstanceResponse> createDataQualityEvaluationTaskInstance(CreateDataQualityEvaluationTaskInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataQualityEvaluationTaskInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataQualityEvaluationTaskInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataQualityEvaluationTaskInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateDataQualityRule is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or higher to use this feature.
     * 
     * @param request the request parameters of CreateDataQualityRule  CreateDataQualityRuleRequest
     * @return CreateDataQualityRuleResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateDataQualityRuleResponse> createDataQualityRule(CreateDataQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataQualityRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityTemplate instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of CreateDataQualityRuleTemplate  CreateDataQualityRuleTemplateRequest
     * @return CreateDataQualityRuleTemplateResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateDataQualityRuleTemplateResponse> createDataQualityRuleTemplate(CreateDataQualityRuleTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataQualityRuleTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataQualityRuleTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataQualityRuleTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of CreateDataQualityScan  CreateDataQualityScanRequest
     * @return CreateDataQualityScanResponse
     */
    @Override
    public CompletableFuture<CreateDataQualityScanResponse> createDataQualityScan(CreateDataQualityScanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataQualityScan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataQualityScanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataQualityScanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of CreateDataQualityScanRun  CreateDataQualityScanRunRequest
     * @return CreateDataQualityScanRunResponse
     */
    @Override
    public CompletableFuture<CreateDataQualityScanRunResponse> createDataQualityScanRun(CreateDataQualityScanRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataQualityScanRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataQualityScanRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataQualityScanRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of CreateDataQualityTemplate  CreateDataQualityTemplateRequest
     * @return CreateDataQualityTemplateResponse
     */
    @Override
    public CompletableFuture<CreateDataQualityTemplateResponse> createDataQualityTemplate(CreateDataQualityTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataQualityTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataQualityTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataQualityTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must have purchased DataWorks Basic Edition or a higher edition.</li>
     * <li>You must have at least one of the following roles in the DataWorks project workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Storage Management Administrator, Project Owner, or O&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataSource  CreateDataSourceRequest
     * @return CreateDataSourceResponse
     */
    @Override
    public CompletableFuture<CreateDataSourceResponse> createDataSource(CreateDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation is available for all DataWorks editions.</li>
     * <li>To share a data source from Workspace A to Workspace B, you must have the data source sharing permissions in both workspaces. You must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataSourceSharedRule  CreateDataSourceSharedRuleRequest
     * @return CreateDataSourceSharedRuleResponse
     */
    @Override
    public CompletableFuture<CreateDataSourceSharedRuleResponse> createDataSourceSharedRule(CreateDataSourceSharedRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataSourceSharedRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataSourceSharedRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataSourceSharedRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    @Override
    public CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDatasetVersion  CreateDatasetVersionRequest
     * @return CreateDatasetVersionResponse
     */
    @Override
    public CompletableFuture<CreateDatasetVersionResponse> createDatasetVersion(CreateDatasetVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDatasetVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFile  CreateFileRequest
     * @return CreateFileResponse
     */
    @Override
    public CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateFolder  CreateFolderRequest
     * @return CreateFolderResponse
     */
    @Override
    public CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If more than one UDF function is defined in the FlowSpec, all functions after the first one are ignored.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateFunction  CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    @Override
    public CompletableFuture<CreateFunctionResponse> createFunction(CreateFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFunction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If you specify multiple publish entities in the parameters, all entities except the first one are ignored.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateIdentifyCredential  CreateIdentifyCredentialRequest
     * @return CreateIdentifyCredentialResponse
     */
    @Override
    public CompletableFuture<CreateIdentifyCredentialResponse> createIdentifyCredential(CreateIdentifyCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIdentifyCredential").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIdentifyCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIdentifyCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of CreateImage  CreateImageRequest
     * @return CreateImageResponse
     */
    @Override
    public CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Professional Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateLineageRelationship  CreateLineageRelationshipRequest
     * @return CreateLineageRelationshipResponse
     */
    @Override
    public CompletableFuture<CreateLineageRelationshipResponse> createLineageRelationship(CreateLineageRelationshipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLineageRelationship").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLineageRelationshipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLineageRelationshipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>After submission, the system verifies the availability of the MCP Server based on the provided connection information.</li>
     * <li>If the MCP Server connection is unavailable, the operation returns the corresponding error message.</li>
     * <li>The Name field must start with a lowercase letter and can contain only lowercase letters, digits, underscores (_), and hyphens (-). The name must be unique within the current account.</li>
     * <li>The Visibility field defines the visibility level of the MCP Server. Valid values: <code>TENANT</code> (visible within the account), <code>PROJECT</code> (visible to specified projects), and <code>USER</code> (visible to specified users). Depending on the selected value, provide the corresponding <code>VisibilityScope</code> parameter to further specify the visibility scope.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMcpServer  CreateMcpServerRequest
     * @return CreateMcpServerResponse
     */
    @Override
    public CompletableFuture<CreateMcpServerResponse> createMcpServer(CreateMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMcpServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Professional Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateMetaCollection  CreateMetaCollectionRequest
     * @return CreateMetaCollectionResponse
     */
    @Override
    public CompletableFuture<CreateMetaCollectionResponse> createMetaCollection(CreateMetaCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMetaCollection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMetaCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMetaCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Professional Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of CreateMetaEntityDef  CreateMetaEntityDefRequest
     * @return CreateMetaEntityDefResponse
     */
    @Override
    public CompletableFuture<CreateMetaEntityDefResponse> createMetaEntityDef(CreateMetaEntityDefRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateMetaEntityDef").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMetaEntityDefResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMetaEntityDefResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of CreateNetwork  CreateNetworkRequest
     * @return CreateNetworkResponse
     */
    @Override
    public CompletableFuture<CreateNetworkResponse> createNetwork(CreateNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If more than one node is defined in FlowSpec, all nodes after the first one are ignored.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateNode  CreateNodeRequest
     * @return CreateNodeResponse
     */
    @Override
    public CompletableFuture<CreateNodeResponse> createNode(CreateNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation requires DataWorks Professional Edition or a later edition.</p>
     * 
     * @param request the request parameters of CreateParameter  CreateParameterRequest
     * @return CreateParameterResponse
     */
    @Override
    public CompletableFuture<CreateParameterResponse> createParameter(CreateParameterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateParameter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateParameterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateParameterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If you specify multiple publish entities in the parameters, all entities except the first one are ignored.
     * Notice: This operation may not be available in earlier versions of the SDK. In this case, use the CreateDeployment operation. The parameters are the same as those described in this topic.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePipelineRun  CreatePipelineRunRequest
     * @return CreatePipelineRunResponse
     */
    @Override
    public CompletableFuture<CreatePipelineRunResponse> createPipelineRun(CreatePipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePipelineRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>This API operation allows you to create a new approval process definition, including setting basic information such as the approval policy name, description, type, and subtype.</li>
     * <li>You can define a list of condition rules (RuleConditions) to specify the conditions under which the approval process is triggered.</li>
     * <li>Multiple notification services (NotificationServices) can be configured to send notifications to relevant personnel at different stages of the approval process.</li>
     * <li>The approval node list (ApprovalNodes) defines the nodes that must be traversed during the approval process and the approver information for each node.</li>
     * <li>You can choose whether to immediately enable the newly created approval process definition.</li>
     * <li>Note: Certain fields such as Type have specific value constraints. Refer to the constraint descriptions in the documentation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateProcessDefinition  CreateProcessDefinitionRequest
     * @return CreateProcessDefinitionResponse
     */
    @Override
    public CompletableFuture<CreateProcessDefinitionResponse> createProcessDefinition(CreateProcessDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProcessDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProcessDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProcessDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    @Override
    public CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of CreateProjectMember  CreateProjectMemberRequest
     * @return CreateProjectMemberResponse
     */
    @Override
    public CompletableFuture<CreateProjectMemberResponse> createProjectMember(CreateProjectMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProjectMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProjectRole  CreateProjectRoleRequest
     * @return CreateProjectRoleResponse
     */
    @Override
    public CompletableFuture<CreateProjectRoleResponse> createProjectRole(CreateProjectRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProjectRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProjectRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProjectRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before you call this operation, make sure that you fully understand the billing of DataWorks common resource groups and the <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a>.</strong></li>
     * <li><strong>Before you call this operation, make sure that you have created the service-linked role AliyunServiceRoleForDataWorks.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of CreateResourceGroup  CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    @Override
    public CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of CreateRoute  CreateRouteRequest
     * @return CreateRouteResponse
     */
    @Override
    public CompletableFuture<CreateRouteResponse> createRoute(CreateRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li><strong>SchemaName</strong>: Select a schema that fits your business needs.</li>
     * <li><strong>ControlModule</strong> and <strong>ControlSubModule</strong>: Specify the module and submodule for the policy, ensuring they match the selected schema.</li>
     * <li><strong>ControlDwScope</strong>: Set the policy scope to either the tenant or workspace level.</li>
     * <li><strong>Workspaces</strong>: If <code>ControlDwScope</code> is set to <code>Workspace</code>, provide the corresponding workspace IDs.</li>
     * <li><strong>Content.Controllers</strong>: The controllers must match the definitions in the selected schema.</li>
     * <li>This operation cannot create system default policies.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecurityStrategy  CreateSecurityStrategyRequest
     * @return CreateSecurityStrategyResponse
     */
    @Override
    public CompletableFuture<CreateSecurityStrategyResponse> createSecurityStrategy(CreateSecurityStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSecurityStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSecurityStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSecurityStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Creates and saves a reusable semantic job definition. This operation only saves the data source, resource group, and reference file configurations without immediately executing the job.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>When <code>Source.type=singleTableFile</code>, call <code>UploadSemanticFile</code> first, use the returned <code>Data.UploadUrl</code> to complete the PUT upload, and then specify <code>Data.FileId</code> in <code>ReferenceFileIds</code>. Alternatively, you can provide a single accessible URI.</li>
     * <li>Configure <code>Source</code>, <code>ProjectId</code>, and <code>ResourceGroupId</code>, and then call this operation to save the job.</li>
     * <li>Use <code>Data.Name</code> from the response to call <code>RunSemanticJob</code>. After the job is complete, use <code>DownloadSemanticResults</code> to retrieve the output.</li>
     * </ol>
     * <h2>Before you begin</h2>
     * <p><code>Name</code> must be unique within the current tenant. The reference file quantity rules differ between single-file sources and other sources. For details, refer to the descriptions of the <code>ReferenceFileIds</code> and <code>ReferenceFileUris</code> fields.</p>
     * 
     * @param request the request parameters of CreateSemanticJob  CreateSemanticJobRequest
     * @return CreateSemanticJobResponse
     */
    @Override
    public CompletableFuture<CreateSemanticJobResponse> createSemanticJob(CreateSemanticJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSemanticJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSemanticJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSemanticJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a personal development environment (ServerIDE) instance. After you specify the DataWorks workspace, resource group, image, and specifications, the instance is created and the instance ID is returned.</p>
     * 
     * @param request the request parameters of CreateServerIdeInstance  CreateServerIdeInstanceRequest
     * @return CreateServerIdeInstanceResponse
     */
    @Override
    public CompletableFuture<CreateServerIdeInstanceResponse> createServerIdeInstance(CreateServerIdeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServerIdeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServerIdeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServerIdeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>You must provide either SkillMdOverride or BundleUrl. One of the two parameters is required.</li>
     * <li>Visibility can be set to <code>TENANT</code>, <code>PROJECT</code>, or <code>USER</code>, which indicate visibility within the account, visibility to specified projects, or visibility to specified users, respectively.</li>
     * <li>When Visibility is set to <code>PROJECT</code>, specify the list of visible project IDs by using VisibilityScope.ProjectIds. When Visibility is set to <code>USER</code>, specify the list of visible user IDs by using VisibilityScope.UserIds.</li>
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
     * @param request the request parameters of CreateUdfFile  CreateUdfFileRequest
     * @return CreateUdfFileResponse
     */
    @Override
    public CompletableFuture<CreateUdfFileResponse> createUdfFile(CreateUdfFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUdfFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUdfFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUdfFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation does not support batch operations. If more than one workflow is defined in FlowSpec, all workflows except the first one are ignored. In addition, nodes defined within the workflow are also ignored. Call the CreateNode operation to create internal nodes one by one.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateWorkflowDefinition  CreateWorkflowDefinitionRequest
     * @return CreateWorkflowDefinitionResponse
     */
    @Override
    public CompletableFuture<CreateWorkflowDefinitionResponse> createWorkflowDefinition(CreateWorkflowDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWorkflowDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkflowDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkflowDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of CreateWorkflowInstances  CreateWorkflowInstancesRequest
     * @return CreateWorkflowInstancesResponse
     */
    @Override
    public CompletableFuture<CreateWorkflowInstancesResponse> createWorkflowInstances(CreateWorkflowInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWorkflowInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkflowInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkflowInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation deletes an Agent with the specified name from DataWorks. When calling this operation, you must provide the name of the Agent to delete.</p>
     * 
     * @param request the request parameters of DeleteAgent  DeleteAgentRequest
     * @return DeleteAgentResponse
     */
    @Override
    public CompletableFuture<DeleteAgentResponse> deleteAgent(DeleteAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlertRule  DeleteAlertRuleRequest
     * @return DeleteAlertRuleResponse
     */
    @Override
    public CompletableFuture<DeleteAlertRuleResponse> deleteAlertRule(DeleteAlertRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAlertRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAlertRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAlertRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBusiness  DeleteBusinessRequest
     * @return DeleteBusinessResponse
     */
    @Override
    public CompletableFuture<DeleteBusinessResponse> deleteBusiness(DeleteBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace: tenant owner, storage management administrator, project owner, or O&amp;M engineer.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteCertificate  DeleteCertificateRequest
     * @return DeleteCertificateResponse
     */
    @Override
    public CompletableFuture<DeleteCertificateResponse> deleteCertificate(DeleteCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: After a UDF function is published, it cannot be deleted. You must offline the function before deleting it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteComponent  DeleteComponentRequest
     * @return DeleteComponentResponse
     */
    @Override
    public CompletableFuture<DeleteComponentResponse> deleteComponent(DeleteComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a more advanced edition is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * <li>Tenant Owner, Workspace Administrator, Project Owner, O\&amp;M</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteComputeResource  DeleteComputeResourceRequest
     * @return DeleteComputeResourceResponse
     */
    @Override
    public CompletableFuture<DeleteComputeResourceResponse> deleteComputeResource(DeleteComputeResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteComputeResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteComputeResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteComputeResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Delete metadata crawlers that are no longer in use.</p>
     * <h2>Recommended procedure</h2>
     * <ol>
     * <li>Call <code>ListCrawlers</code> to query the crawler ID.</li>
     * <li>After confirming that the crawler is no longer needed, call this operation.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or higher is required.</p>
     * <h2>Precautions</h2>
     * <p>After the crawler is deleted, it cannot be queried, updated, or run. The collected metadata is cleaned up by the system, and the cleanup result may be delayed.</p>
     * 
     * @param request the request parameters of DeleteCrawler  DeleteCrawlerRequest
     * @return DeleteCrawlerResponse
     */
    @Override
    public CompletableFuture<DeleteCrawlerResponse> deleteCrawler(DeleteCrawlerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCrawler").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCrawlerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCrawlerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomAttribute  DeleteCustomAttributeRequest
     * @return DeleteCustomAttributeResponse
     */
    @Override
    public CompletableFuture<DeleteCustomAttributeResponse> deleteCustomAttribute(DeleteCustomAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDIAlarmRule  DeleteDIAlarmRuleRequest
     * @return DeleteDIAlarmRuleResponse
     */
    @Override
    public CompletableFuture<DeleteDIAlarmRuleResponse> deleteDIAlarmRule(DeleteDIAlarmRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDIAlarmRule").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDIAlarmRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDIAlarmRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of DeleteDIJob  DeleteDIJobRequest
     * @return DeleteDIJobResponse
     */
    @Override
    public CompletableFuture<DeleteDIJobResponse> deleteDIJob(DeleteDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDIJob").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of DeleteDataAssetTag  DeleteDataAssetTagRequest
     * @return DeleteDataAssetTagResponse
     */
    @Override
    public CompletableFuture<DeleteDataAssetTagResponse> deleteDataAssetTag(DeleteDataAssetTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataAssetTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataAssetTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataAssetTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of DeleteDataQualityAlertRule  DeleteDataQualityAlertRuleRequest
     * @return DeleteDataQualityAlertRuleResponse
     */
    @Override
    public CompletableFuture<DeleteDataQualityAlertRuleResponse> deleteDataQualityAlertRule(DeleteDataQualityAlertRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataQualityAlertRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataQualityAlertRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataQualityAlertRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::DeleteDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or higher to use this feature.
     * 
     * @param request the request parameters of DeleteDataQualityEvaluationTask  DeleteDataQualityEvaluationTaskRequest
     * @return DeleteDataQualityEvaluationTaskResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteDataQualityEvaluationTaskResponse> deleteDataQualityEvaluationTask(DeleteDataQualityEvaluationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataQualityEvaluationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataQualityEvaluationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataQualityEvaluationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>需要购买DataWorks基础版及以上版本才能使用</p>
     * 
     * @param request the request parameters of DeleteDataQualityRule  DeleteDataQualityRuleRequest
     * @return DeleteDataQualityRuleResponse
     */
    @Override
    public CompletableFuture<DeleteDataQualityRuleResponse> deleteDataQualityRule(DeleteDataQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataQualityRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::DeleteDataQualityTemplate instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this operation.
     * 
     * @param request the request parameters of DeleteDataQualityRuleTemplate  DeleteDataQualityRuleTemplateRequest
     * @return DeleteDataQualityRuleTemplateResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteDataQualityRuleTemplateResponse> deleteDataQualityRuleTemplate(DeleteDataQualityRuleTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataQualityRuleTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataQualityRuleTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataQualityRuleTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of DeleteDataQualityScan  DeleteDataQualityScanRequest
     * @return DeleteDataQualityScanResponse
     */
    @Override
    public CompletableFuture<DeleteDataQualityScanResponse> deleteDataQualityScan(DeleteDataQualityScanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataQualityScan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataQualityScanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataQualityScanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Id</strong>: The unique identifier of a custom rule template, in the format of <code>USER_DEFINED:&lt;template_id&gt;</code>.</li>
     * <li><strong>ProjectId</strong>: The ID of the DataWorks workspace to which the rule template belongs.
     * This operation removes a data quality rule template that is no longer needed. Make sure that the <code>Id</code> and <code>ProjectId</code> values are correct. Otherwise, the deletion may fail or cause unexpected data loss. Exercise caution when performing this operation and verify the template information before proceeding.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataQualityTemplate  DeleteDataQualityTemplateRequest
     * @return DeleteDataQualityTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteDataQualityTemplateResponse> deleteDataQualityTemplate(DeleteDataQualityTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataQualityTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataQualityTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataQualityTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation is available for all DataWorks editions.</li>
     * <li>To call this operation, you must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Workspace Owner, and O\&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataSource  DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    @Override
    public CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataSource").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation is available for all DataWorks editions.</li>
     * <li>To delete a sharing rule of a data source from Workspace A to Workspace B, you must have the data source sharing permissions in Workspace A or Workspace B. You must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataSourceSharedRule  DeleteDataSourceSharedRuleRequest
     * @return DeleteDataSourceSharedRuleResponse
     */
    @Override
    public CompletableFuture<DeleteDataSourceSharedRuleResponse> deleteDataSourceSharedRule(DeleteDataSourceSharedRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataSourceSharedRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataSourceSharedRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataSourceSharedRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDatasetVersion  DeleteDatasetVersionRequest
     * @return DeleteDatasetVersionResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetVersionResponse> deleteDatasetVersion(DeleteDatasetVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDatasetVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    @Override
    public CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteFolder  DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    @Override
    public CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * After a UDF is published, it cannot be deleted. You must unpublish the UDF before you can delete it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteFunction  DeleteFunctionRequest
     * @return DeleteFunctionResponse
     */
    @Override
    public CompletableFuture<DeleteFunctionResponse> deleteFunction(DeleteFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFunction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
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
     * <ol>
     * <li>You must purchase DataWorks Professional Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteLineageRelationship  DeleteLineageRelationshipRequest
     * @return DeleteLineageRelationshipResponse
     */
    @Override
    public CompletableFuture<DeleteLineageRelationshipResponse> deleteLineageRelationship(DeleteLineageRelationshipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLineageRelationship").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLineageRelationshipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLineageRelationshipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API allows you to delete the corresponding MCP Server instance based on the provided MCP Server name. Make sure you have the appropriate permissions and verify that the MCP Server name to be deleted is correct before calling.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li>The deletion operation is irreversible. Proceed with caution.</li>
     * <li>Ensure that you have sufficient permissions (<code>dataworks:DeleteMcpServer</code>) to perform this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteMcpServer  DeleteMcpServerRequest
     * @return DeleteMcpServerResponse
     */
    @Override
    public CompletableFuture<DeleteMcpServerResponse> deleteMcpServer(DeleteMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMcpServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Professional Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of DeleteMetaCollection  DeleteMetaCollectionRequest
     * @return DeleteMetaCollectionResponse
     */
    @Override
    public CompletableFuture<DeleteMetaCollectionResponse> deleteMetaCollection(DeleteMetaCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMetaCollection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetaCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetaCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Professional Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of DeleteMetaEntityDef  DeleteMetaEntityDefRequest
     * @return DeleteMetaEntityDefResponse
     */
    @Override
    public CompletableFuture<DeleteMetaEntityDefResponse> deleteMetaEntityDef(DeleteMetaEntityDefRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteMetaEntityDef").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMetaEntityDefResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMetaEntityDefResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of DeleteNetwork  DeleteNetworkRequest
     * @return DeleteNetworkResponse
     */
    @Override
    public CompletableFuture<DeleteNetworkResponse> deleteNetwork(DeleteNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: After a node is published, it cannot be deleted. You must offline the node before deleting it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNode  DeleteNodeRequest
     * @return DeleteNodeResponse
     */
    @Override
    public CompletableFuture<DeleteNodeResponse> deleteNode(DeleteNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in DataWorks professional edition and later versions.</p>
     * 
     * @param request the request parameters of DeleteParameter  DeleteParameterRequest
     * @return DeleteParameterResponse
     */
    @Override
    public CompletableFuture<DeleteParameterResponse> deleteParameter(DeleteParameterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteParameter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteParameterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteParameterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This API deletes a process definition by its ID.</li>
     * <li>This operation is irreversible. Proceed with caution.</li>
     * <li>Before calling this API, back up relevant data or confirm that the process definition is no longer required.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProcessDefinition  DeleteProcessDefinitionRequest
     * @return DeleteProcessDefinitionResponse
     */
    @Override
    public CompletableFuture<DeleteProcessDefinitionResponse> deleteProcessDefinition(DeleteProcessDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProcessDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProcessDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProcessDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * <blockquote>
     * <p>Note: After a workspace is deleted, it is moved to the recycle bin on the <strong>Workspaces</strong> page in the console. The workspace is permanently removed after a 14-day cool-down period. During this period, you cannot create a workspace with the same name.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteProject  DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    @Override
    public CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of DeleteProjectMember  DeleteProjectMemberRequest
     * @return DeleteProjectMemberResponse
     */
    @Override
    public CompletableFuture<DeleteProjectMemberResponse> deleteProjectMember(DeleteProjectMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProjectMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProjectRole  DeleteProjectRoleRequest
     * @return DeleteProjectRoleResponse
     */
    @Override
    public CompletableFuture<DeleteProjectRoleResponse> deleteProjectRole(DeleteProjectRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProjectRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProjectRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProjectRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * After a file resource is published, it cannot be deleted. You must unpublish the file resource before you can delete it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteResource  DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    @Override
    public CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation requires DataWorks Basic Edition or a later version.</li>
     * <li><strong>Before you use this operation, ensure you understand the billing method and <a href="https://help.aliyun.com/document_detail/2680173.html">pricing</a> for DataWorks resource groups.</strong></li>
     * <li><strong>Before you use this operation, ensure you have created the Service-Linked Role AliyunServiceRoleForDataWorks.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of DeleteResourceGroup  DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    @Override
    public CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of DeleteRoute  DeleteRouteRequest
     * @return DeleteRouteResponse
     */
    @Override
    public CompletableFuture<DeleteRouteResponse> deleteRoute(DeleteRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You can delete a security strategy by providing its ID.</li>
     * <li>You cannot delete a system strategy.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSecurityStrategy  DeleteSecurityStrategyRequest
     * @return DeleteSecurityStrategyResponse
     */
    @Override
    public CompletableFuture<DeleteSecurityStrategyResponse> deleteSecurityStrategy(DeleteSecurityStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecurityStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecurityStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecurityStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Archives and deletes a saved semantic job definition so that it no longer appears in the list of available jobs.</p>
     * <h2>Call flow</h2>
     * <ol>
     * <li>Obtain the job name from <code>CreateSemanticJob.Data.Name</code> or <code>ListSemanticJobs.Data.SemanticJobs[].Name</code>.</li>
     * <li>To check whether any active runs exist, call <code>ListSemanticJobRuns</code> first. If necessary, stop the execution by calling <code>KillSemanticJob</code>.</li>
     * <li>Call this operation to delete the job definition.</li>
     * </ol>
     * <h2>Result description</h2>
     * <p>A successful response indicates that the deletion request is complete. After deletion, you can no longer use the name to call <code>RunSemanticJob</code>.</p>
     * 
     * @param request the request parameters of DeleteSemanticJob  DeleteSemanticJobRequest
     * @return DeleteSemanticJobResponse
     */
    @Override
    public CompletableFuture<DeleteSemanticJobResponse> deleteSemanticJob(DeleteSemanticJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSemanticJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSemanticJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSemanticJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified personal development environment (ServerIDE) instance and returns the instance ID.</p>
     * 
     * @param request the request parameters of DeleteServerIdeInstance  DeleteServerIdeInstanceRequest
     * @return DeleteServerIdeInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteServerIdeInstanceResponse> deleteServerIdeInstance(DeleteServerIdeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteServerIdeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServerIdeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServerIdeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to delete a Skill with the specified name from DataWorks. The exact name of the Skill to delete must be provided when invoking this API.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li>Ensure that you have sufficient permissions to perform the delete operation.</li>
     * <li>The delete operation is irreversible. Use it with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSkill  DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    @Override
    public CompletableFuture<DeleteSkillResponse> deleteSkill(DeleteSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of DeleteTask  DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    @Override
    public CompletableFuture<DeleteTaskResponse> deleteTask(DeleteTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of DeleteWorkflow  DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     */
    @Override
    public CompletableFuture<DeleteWorkflowResponse> deleteWorkflow(DeleteWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: After a workflow is published, it cannot be deleted. You must offline the workflow before deleting it.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteWorkflowDefinition  DeleteWorkflowDefinitionRequest
     * @return DeleteWorkflowDefinitionResponse
     */
    @Override
    public CompletableFuture<DeleteWorkflowDefinitionResponse> deleteWorkflowDefinition(DeleteWorkflowDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteWorkflowDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteWorkflowDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteWorkflowDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployFile  DeployFileRequest
     * @return DeployFileResponse
     */
    @Override
    public CompletableFuture<DeployFileResponse> deployFile(DeployFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeployFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DetachDataQualityRulesFromEvaluationTask is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of DetachDataQualityRulesFromEvaluationTask  DetachDataQualityRulesFromEvaluationTaskRequest
     * @return DetachDataQualityRulesFromEvaluationTaskResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DetachDataQualityRulesFromEvaluationTaskResponse> detachDataQualityRulesFromEvaluationTask(DetachDataQualityRulesFromEvaluationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachDataQualityRulesFromEvaluationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachDataQualityRulesFromEvaluationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachDataQualityRulesFromEvaluationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before using this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of DisableImage  DisableImageRequest
     * @return DisableImageResponse
     */
    @Override
    public CompletableFuture<DisableImageResponse> disableImage(DisableImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API disables the specified approval process definition.</li>
     * <li>A disabled approval process definition remains inactive until it is re-enabled.</li>
     * <li>You must provide a valid process definition ID as a path parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableProcessDefinition  DisableProcessDefinitionRequest
     * @return DisableProcessDefinitionResponse
     */
    @Override
    public CompletableFuture<DisableProcessDefinitionResponse> disableProcessDefinition(DisableProcessDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableProcessDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableProcessDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableProcessDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation requires DataWorks Basic Edition or a later version.</li>
     * <li><strong>Before calling this operation, ensure you have created the AliyunServiceRoleForDataWorks service-linked role.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of DissociateProjectFromImage  DissociateProjectFromImageRequest
     * @return DissociateProjectFromImageResponse
     */
    @Override
    public CompletableFuture<DissociateProjectFromImageResponse> dissociateProjectFromImage(DissociateProjectFromImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateProjectFromImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateProjectFromImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateProjectFromImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation requires a subscription to DataWorks Basic Edition or a higher edition.</li>
     * <li>You must have one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>tenant owner, workspace administrator, project owner, or operator</li>
     * </ul>
     * 
     * @param request the request parameters of DissociateProjectFromResourceGroup  DissociateProjectFromResourceGroupRequest
     * @return DissociateProjectFromResourceGroupResponse
     */
    @Override
    public CompletableFuture<DissociateProjectFromResourceGroupResponse> dissociateProjectFromResourceGroup(DissociateProjectFromResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateProjectFromResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateProjectFromResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateProjectFromResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Retrieves temporary download URLs for result files of a submitted semantic job run, such as semantic model YAML artifacts. This operation returns download URLs and does not directly return file content.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Use the job name <code>JobName</code> to locate the job.</li>
     * <li>To retrieve artifacts of a specific run, specify the <code>JobRunId</code> from the <code>RunSemanticJob.Data.JobRunId</code> or <code>ListSemanticJobRuns</code> response. If you do not specify this parameter, the artifacts of the most recent run are returned.</li>
     * <li>Download the corresponding files from <code>Data.Results[].DownloadUrl</code>.</li>
     * </ol>
     * <h2>Before you begin</h2>
     * <p>The download URL is a temporary credential. Use it only briefly on the client side. Do not write it to logs or store it for long-term use.</p>
     * 
     * @param request the request parameters of DownloadSemanticResults  DownloadSemanticResultsRequest
     * @return DownloadSemanticResultsResponse
     */
    @Override
    public CompletableFuture<DownloadSemanticResultsResponse> downloadSemanticResults(DownloadSemanticResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DownloadSemanticResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadSemanticResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadSemanticResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of EnableImage  EnableImageRequest
     * @return EnableImageResponse
     */
    @Override
    public CompletableFuture<EnableImageResponse> enableImage(EnableImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API enables an existing process definition. You must provide the process definition ID as a path parameter.</p>
     * 
     * @param request the request parameters of EnableProcessDefinition  EnableProcessDefinitionRequest
     * @return EnableProcessDefinitionResponse
     */
    @Override
    public CompletableFuture<EnableProcessDefinitionResponse> enableProcessDefinition(EnableProcessDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableProcessDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableProcessDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableProcessDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EstablishRelationTableToBusiness  EstablishRelationTableToBusinessRequest
     * @return EstablishRelationTableToBusinessResponse
     */
    @Override
    public CompletableFuture<EstablishRelationTableToBusinessResponse> establishRelationTableToBusiness(EstablishRelationTableToBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EstablishRelationTableToBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EstablishRelationTableToBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EstablishRelationTableToBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecCrossProjectPipelineRun  ExecCrossProjectPipelineRunRequest
     * @return ExecCrossProjectPipelineRunResponse
     */
    @Override
    public CompletableFuture<ExecCrossProjectPipelineRunResponse> execCrossProjectPipelineRun(ExecCrossProjectPipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecCrossProjectPipelineRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecCrossProjectPipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecCrossProjectPipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The stages of a publish flow are sequential. For more information, see the response of GetPipelineRun. You cannot skip or repeat a stage.
     * Notice: The execution is asynchronous. The response only indicates that the stage is triggered, not that the stage is executed. Check the response of GetPipelineRun for the execution result.
     * Notice: This operation may not be available in earlier SDK versions. In this case, use the ExecDeploymentStage operation. The parameters are the same as those described in this document.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ExecPipelineRunStage  ExecPipelineRunStageRequest
     * @return ExecPipelineRunStageResponse
     */
    @Override
    public CompletableFuture<ExecPipelineRunStageResponse> execPipelineRunStage(ExecPipelineRunStageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecPipelineRunStage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecPipelineRunStageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecPipelineRunStageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ExecuteAdhocWorkflowInstance  ExecuteAdhocWorkflowInstanceRequest
     * @return ExecuteAdhocWorkflowInstanceResponse
     */
    @Override
    public CompletableFuture<ExecuteAdhocWorkflowInstanceResponse> executeAdhocWorkflowInstance(ExecuteAdhocWorkflowInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecuteAdhocWorkflowInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteAdhocWorkflowInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteAdhocWorkflowInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to find the most suitable security policy based on the provided control module, sub-module, and workspace ID. If a workspace ID is provided, the policy at the specified workspace level is matched first; otherwise, the tenant-level policy is returned. Note that system policies cannot be deleted or modified.</p>
     * 
     * @param request the request parameters of FindBestMatchSecurityStrategy  FindBestMatchSecurityStrategyRequest
     * @return FindBestMatchSecurityStrategyResponse
     */
    @Override
    public CompletableFuture<FindBestMatchSecurityStrategyResponse> findBestMatchSecurityStrategy(FindBestMatchSecurityStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindBestMatchSecurityStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindBestMatchSecurityStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindBestMatchSecurityStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API uses an agent\&quot;s name, provided as a parameter, to retrieve its detailed configuration, including the model configuration, system prompt, and tool list.</p>
     * 
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    @Override
    public CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <h2>Description</h2>
     * <ul>
     * <li>This operation retrieves the metadata and content of a single artifact based on <code>SessionId</code> and <code>ArtifactPath</code>.</li>
     * <li><code>SessionId</code> and <code>ArtifactPath</code> are required.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentSessionArtifactMeta  GetAgentSessionArtifactMetaRequest
     * @return GetAgentSessionArtifactMetaResponse
     */
    @Override
    public CompletableFuture<GetAgentSessionArtifactMetaResponse> getAgentSessionArtifactMeta(GetAgentSessionArtifactMetaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentSessionArtifactMeta").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSessionArtifactMetaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSessionArtifactMetaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This operation retrieves usage statistics for AI tokens in a specified session. It provides a breakdown of tokens for prompts, completions, and thoughts, as well as the total token count and the number of cache-hit tokens.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAgentSessionTokenUsage  GetAgentSessionTokenUsageRequest
     * @return GetAgentSessionTokenUsageResponse
     */
    @Override
    public CompletableFuture<GetAgentSessionTokenUsageResponse> getAgentSessionTokenUsage(GetAgentSessionTokenUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAgentSessionTokenUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSessionTokenUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSessionTokenUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlertRule  GetAlertRuleRequest
     * @return GetAlertRuleResponse
     */
    @Override
    public CompletableFuture<GetAlertRuleResponse> getAlertRule(GetAlertRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAlertRule").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlertRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlertRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This API is used to query the details of resource permission applications based on the provided <code>ProcessInstanceId</code>.</li>
     * <li>A valid <code>ProcessInstanceId</code> parameter must be provided in the request.</li>
     * <li>The response includes the basic information, status, and the list of specific application contents.</li>
     * <li>Each application content includes detailed resource information, the grantee, the requested operation permissions, and more.</li>
     * </ul>
     * 
     * @param request the request parameters of GetApplicationContents  GetApplicationContentsRequest
     * @return GetApplicationContentsResponse
     */
    @Override
    public CompletableFuture<GetApplicationContentsResponse> getApplicationContents(GetApplicationContentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApplicationContents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationContentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationContentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBatchChangeTableOwnerStatus  GetBatchChangeTableOwnerStatusRequest
     * @return GetBatchChangeTableOwnerStatusResponse
     */
    @Override
    public CompletableFuture<GetBatchChangeTableOwnerStatusResponse> getBatchChangeTableOwnerStatus(GetBatchChangeTableOwnerStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBatchChangeTableOwnerStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBatchChangeTableOwnerStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBatchChangeTableOwnerStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBusiness  GetBusinessRequest
     * @return GetBusinessResponse
     */
    @Override
    public CompletableFuture<GetBusinessResponse> getBusiness(GetBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must have DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of GetCatalog  GetCatalogRequest
     * @return GetCatalogResponse
     */
    @Override
    public CompletableFuture<GetCatalogResponse> getCatalog(GetCatalogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCatalog").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCatalogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCatalogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This feature is available only in DataWorks Basic Edition and later versions.</li>
     * <li>You must have at least one of the following roles in the DataWorks project: Tenant Owner, Space Administrator, Deployment, Developer, Project Owner, or O\&amp;M.</li>
     * </ol>
     * 
     * @param request the request parameters of GetCertificate  GetCertificateRequest
     * @return GetCertificateResponse
     */
    @Override
    public CompletableFuture<GetCertificateResponse> getCertificate(GetCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCertificate").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of GetColumn  GetColumnRequest
     * @return GetColumnResponse
     */
    @Override
    public CompletableFuture<GetColumnResponse> getColumn(GetColumnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetColumn").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetColumnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetColumnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of GetComponent  GetComponentRequest
     * @return GetComponentResponse
     */
    @Override
    public CompletableFuture<GetComponentResponse> getComponent(GetComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a more advanced edition is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deploy, Developer, Project Owner, O\&amp;M</li>
     * </ul>
     * 
     * @param request the request parameters of GetComputeResource  GetComputeResourceRequest
     * @return GetComputeResourceResponse
     */
    @Override
    public CompletableFuture<GetComputeResourceResponse> getComputeResource(GetComputeResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetComputeResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComputeResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComputeResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Storage Management Administrator, Deployment, Developer, Project Owner, or O&amp;M Engineer</li>
     * </ul>
     * 
     * @param request the request parameters of GetComputeResourceAuthUserMappings  GetComputeResourceAuthUserMappingsRequest
     * @return GetComputeResourceAuthUserMappingsResponse
     */
    @Override
    public CompletableFuture<GetComputeResourceAuthUserMappingsResponse> getComputeResourceAuthUserMappings(GetComputeResourceAuthUserMappingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetComputeResourceAuthUserMappings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComputeResourceAuthUserMappingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComputeResourceAuthUserMappingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Queries the configuration, availability status, and latest run information of a specified metadata crawler.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Call <code>ListCrawlers</code> to query crawler IDs.</li>
     * <li>Call this operation to retrieve crawler details.</li>
     * <li>To query the complete run history, call <code>ListCrawlerRuns</code>.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or higher is required.</p>
     * <h2>Precautions</h2>
     * <p>If the crawler has not been run, the latest run status and task instance ID may be empty.</p>
     * 
     * @param request the request parameters of GetCrawler  GetCrawlerRequest
     * @return GetCrawlerResponse
     */
    @Override
    public CompletableFuture<GetCrawlerResponse> getCrawler(GetCrawlerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCrawler").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCrawlerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCrawlerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Queries the crawler types that can be created in the current region, as well as the data sources, collection scope, resource groups, scheduling, AI metadata description, and extension configuration capabilities supported by each type.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Call this operation before creating or updating a crawler.</li>
     * <li>Construct a <code>CreateCrawler</code> or <code>UpdateCrawler</code> request based on the returned capability information.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * <h2>Precautions</h2>
     * <p>Capabilities may vary by region and crawler type. Use the actual response of this operation as the reference.</p>
     * 
     * @param request the request parameters of GetCrawlerTypeCapabilities  GetCrawlerTypeCapabilitiesRequest
     * @return GetCrawlerTypeCapabilitiesResponse
     */
    @Override
    public CompletableFuture<GetCrawlerTypeCapabilitiesResponse> getCrawlerTypeCapabilities(GetCrawlerTypeCapabilitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCrawlerTypeCapabilities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCrawlerTypeCapabilitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCrawlerTypeCapabilitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of GetCreateWorkflowInstancesResult  GetCreateWorkflowInstancesResultRequest
     * @return GetCreateWorkflowInstancesResultResponse
     */
    @Override
    public CompletableFuture<GetCreateWorkflowInstancesResultResponse> getCreateWorkflowInstancesResult(GetCreateWorkflowInstancesResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCreateWorkflowInstancesResult").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCreateWorkflowInstancesResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCreateWorkflowInstancesResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCrossProjectPipelineRun  GetCrossProjectPipelineRunRequest
     * @return GetCrossProjectPipelineRunResponse
     */
    @Override
    public CompletableFuture<GetCrossProjectPipelineRunResponse> getCrossProjectPipelineRun(GetCrossProjectPipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCrossProjectPipelineRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCrossProjectPipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCrossProjectPipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCustomAttribute  GetCustomAttributeRequest
     * @return GetCustomAttributeResponse
     */
    @Override
    public CompletableFuture<GetCustomAttributeResponse> getCustomAttribute(GetCustomAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCustomAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCustomAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCustomAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation requires DataWorks Basic Edition or later.</p>
     * 
     * @param request the request parameters of GetDIJob  GetDIJobRequest
     * @return GetDIJobResponse
     */
    @Override
    public CompletableFuture<GetDIJobResponse> getDIJob(GetDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDIJob").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of GetDIJobLog  GetDIJobLogRequest
     * @return GetDIJobLogResponse
     */
    @Override
    public CompletableFuture<GetDIJobLogResponse> getDIJobLog(GetDIJobLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDIJobLog").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDIJobLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDIJobLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of GetDataQualityAlertRule  GetDataQualityAlertRuleRequest
     * @return GetDataQualityAlertRuleResponse
     */
    @Override
    public CompletableFuture<GetDataQualityAlertRuleResponse> getDataQualityAlertRule(GetDataQualityAlertRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataQualityAlertRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataQualityAlertRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataQualityAlertRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::CreateDataQualityScan instead.  * @description Available only with DataWorks Basic Edition or higher.
     * 
     * @param request the request parameters of GetDataQualityEvaluationTask  GetDataQualityEvaluationTaskRequest
     * @return GetDataQualityEvaluationTaskResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetDataQualityEvaluationTaskResponse> getDataQualityEvaluationTask(GetDataQualityEvaluationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataQualityEvaluationTask").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataQualityEvaluationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataQualityEvaluationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetDataQualityEvaluationTaskInstance is deprecated, please use dataworks-public::2024-05-18::GetDataQualityScanRun instead.  * @description DataWorks Basic Edition or a higher edition is required to use this operation.
     * 
     * @param request the request parameters of GetDataQualityEvaluationTaskInstance  GetDataQualityEvaluationTaskInstanceRequest
     * @return GetDataQualityEvaluationTaskInstanceResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetDataQualityEvaluationTaskInstanceResponse> getDataQualityEvaluationTaskInstance(GetDataQualityEvaluationTaskInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataQualityEvaluationTaskInstance").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataQualityEvaluationTaskInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataQualityEvaluationTaskInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetDataQualityRule is deprecated, please use dataworks-public::2024-05-18::GetDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of GetDataQualityRule  GetDataQualityRuleRequest
     * @return GetDataQualityRuleResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetDataQualityRuleResponse> getDataQualityRule(GetDataQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataQualityRule").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::GetDataQualityTemplate instead.  * @description You can call this operation only if you have purchased DataWorks Basic Edition or a more advanced edition.
     * 
     * @param request the request parameters of GetDataQualityRuleTemplate  GetDataQualityRuleTemplateRequest
     * @return GetDataQualityRuleTemplateResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetDataQualityRuleTemplateResponse> getDataQualityRuleTemplate(GetDataQualityRuleTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataQualityRuleTemplate").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataQualityRuleTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataQualityRuleTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of GetDataQualityScan  GetDataQualityScanRequest
     * @return GetDataQualityScanResponse
     */
    @Override
    public CompletableFuture<GetDataQualityScanResponse> getDataQualityScan(GetDataQualityScanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataQualityScan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataQualityScanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataQualityScanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of GetDataQualityScanRun  GetDataQualityScanRunRequest
     * @return GetDataQualityScanRunResponse
     */
    @Override
    public CompletableFuture<GetDataQualityScanRunResponse> getDataQualityScanRun(GetDataQualityScanRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataQualityScanRun").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataQualityScanRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataQualityScanRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of GetDataQualityScanRunLog  GetDataQualityScanRunLogRequest
     * @return GetDataQualityScanRunLogResponse
     */
    @Override
    public CompletableFuture<GetDataQualityScanRunLogResponse> getDataQualityScanRunLog(GetDataQualityScanRunLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataQualityScanRunLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataQualityScanRunLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataQualityScanRunLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of GetDataQualityTemplate  GetDataQualityTemplateRequest
     * @return GetDataQualityTemplateResponse
     */
    @Override
    public CompletableFuture<GetDataQualityTemplateResponse> getDataQualityTemplate(GetDataQualityTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataQualityTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataQualityTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataQualityTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deployment, Developer, Project Owner, or O&amp;M Engineer</li>
     * </ul>
     * 
     * @param request the request parameters of GetDataSource  GetDataSourceRequest
     * @return GetDataSourceResponse
     */
    @Override
    public CompletableFuture<GetDataSourceResponse> getDataSource(GetDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataSource").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of GetDatabase  GetDatabaseRequest
     * @return GetDatabaseResponse
     */
    @Override
    public CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDatabase").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatabaseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatabaseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataset  GetDatasetRequest
     * @return GetDatasetResponse
     */
    @Override
    public CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDatasetVersion  GetDatasetVersionRequest
     * @return GetDatasetVersionResponse
     */
    @Override
    public CompletableFuture<GetDatasetVersionResponse> getDatasetVersion(GetDatasetVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDatasetVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasetVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasetVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeploymentPackage  GetDeploymentPackageRequest
     * @return GetDeploymentPackageResponse
     */
    @Override
    public CompletableFuture<GetDeploymentPackageResponse> getDeploymentPackage(GetDeploymentPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDeploymentPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeploymentPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeploymentPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFile  GetFileRequest
     * @return GetFileResponse
     */
    @Override
    public CompletableFuture<GetFileResponse> getFile(GetFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFileVersion  GetFileVersionRequest
     * @return GetFileVersionResponse
     */
    @Override
    public CompletableFuture<GetFileVersionResponse> getFileVersion(GetFileVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFileVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFileVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFileVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFolder  GetFolderRequest
     * @return GetFolderResponse
     */
    @Override
    public CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFunction  GetFunctionRequest
     * @return GetFunctionResponse
     */
    @Override
    public CompletableFuture<GetFunctionResponse> getFunction(GetFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFunction").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIDEEventDetail  GetIDEEventDetailRequest
     * @return GetIDEEventDetailResponse
     */
    @Override
    public CompletableFuture<GetIDEEventDetailResponse> getIDEEventDetail(GetIDEEventDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIDEEventDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIDEEventDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIDEEventDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of GetImage  GetImageRequest
     * @return GetImageResponse
     */
    @Override
    public CompletableFuture<GetImageResponse> getImage(GetImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li><strong>Before using this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of GetImageTestResult  GetImageTestResultRequest
     * @return GetImageTestResultResponse
     */
    @Override
    public CompletableFuture<GetImageTestResultResponse> getImageTestResult(GetImageTestResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetImageTestResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetImageTestResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetImageTestResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJobStatus  GetJobStatusRequest
     * @return GetJobStatusResponse
     */
    @Override
    public CompletableFuture<GetJobStatusResponse> getJobStatus(GetJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetJobStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must have DataWorks Standard Edition or a higher edition to use this operation.</li>
     * </ol>
     * 
     * @param request the request parameters of GetLineageRelationship  GetLineageRelationshipRequest
     * @return GetLineageRelationshipResponse
     */
    @Override
    public CompletableFuture<GetLineageRelationshipResponse> getLineageRelationship(GetLineageRelationshipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLineageRelationship").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLineageRelationshipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLineageRelationshipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API returns the detailed configuration of a specific MCP Server by name. The response includes the creator ID, modifier ID, service address, and transport protocol. You must provide the exact name of the MCP Server in the request.</p>
     * <h3>Notes</h3>
     * <ul>
     * <li>Ensure you have the required permissions to call this API.</li>
     * <li>The MCP Server name is case-sensitive.</li>
     * </ul>
     * 
     * @param request the request parameters of GetMcpServer  GetMcpServerRequest
     * @return GetMcpServerResponse
     */
    @Override
    public CompletableFuture<GetMcpServerResponse> getMcpServer(GetMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMcpServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Professional Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of GetMetaCollection  GetMetaCollectionRequest
     * @return GetMetaCollectionResponse
     */
    @Override
    public CompletableFuture<GetMetaCollectionResponse> getMetaCollection(GetMetaCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaCollection").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaEntity  GetMetaEntityRequest
     * @return GetMetaEntityResponse
     */
    @Override
    public CompletableFuture<GetMetaEntityResponse> getMetaEntity(GetMetaEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMetaEntityDef  GetMetaEntityDefRequest
     * @return GetMetaEntityDefResponse
     */
    @Override
    public CompletableFuture<GetMetaEntityDefResponse> getMetaEntityDef(GetMetaEntityDefRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMetaEntityDef").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMetaEntityDefResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMetaEntityDefResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetNetwork  GetNetworkRequest
     * @return GetNetworkResponse
     */
    @Override
    public CompletableFuture<GetNetworkResponse> getNetwork(GetNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNetwork").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNode  GetNodeRequest
     * @return GetNodeResponse
     */
    @Override
    public CompletableFuture<GetNodeResponse> getNode(GetNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNode").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in DataWorks Professional Edition or later.</p>
     * 
     * @param request the request parameters of GetParameter  GetParameterRequest
     * @return GetParameterResponse
     */
    @Override
    public CompletableFuture<GetParameterResponse> getParameter(GetParameterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetParameter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetParameterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetParameterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>Only MaxCompute and HMS (EMR cluster) table types are supported.</li>
     * </ol>
     * 
     * @param request the request parameters of GetPartition  GetPartitionRequest
     * @return GetPartitionResponse
     */
    @Override
    public CompletableFuture<GetPartitionResponse> getPartition(GetPartitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPartition").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPartitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPartitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: This operation may not be available in earlier SDK versions. In this case, use the GetDeployment operation instead. The parameters are the same as those described in this document.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetPipelineRun  GetPipelineRunRequest
     * @return GetPipelineRunResponse
     */
    @Override
    public CompletableFuture<GetPipelineRunResponse> getPipelineRun(GetPipelineRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPipelineRun").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPipelineRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPipelineRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API retrieves the details of a specific approval process definition using the <code>ID</code> parameter.</li>
     * <li>The <code>ID</code> parameter is required and must be a valid process definition ID.</li>
     * <li>The response includes the basic properties of the approval process definition, rule conditions, notification service configurations, and approval nodes.</li>
     * <li>A successful request returns the complete process definition object. A failed request returns an error code and message for troubleshooting.</li>
     * </ul>
     * 
     * @param request the request parameters of GetProcessDefinition  GetProcessDefinitionRequest
     * @return GetProcessDefinitionResponse
     */
    @Override
    public CompletableFuture<GetProcessDefinitionResponse> getProcessDefinition(GetProcessDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProcessDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProcessDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProcessDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This API is used to monitor and manage the status of an approval process. By providing the approval process instance ID, you can query for related information, such as the approval process definition, current approval nodes, and the tasks on each node.</p>
     * 
     * @param request the request parameters of GetProcessInstance  GetProcessInstanceRequest
     * @return GetProcessInstanceResponse
     */
    @Override
    public CompletableFuture<GetProcessInstanceResponse> getProcessInstance(GetProcessInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProcessInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProcessInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProcessInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of GetProject  GetProjectRequest
     * @return GetProjectResponse
     */
    @Override
    public CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProject").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in DataWorks Basic Edition and later.</p>
     * 
     * @param request the request parameters of GetProjectMember  GetProjectMemberRequest
     * @return GetProjectMemberResponse
     */
    @Override
    public CompletableFuture<GetProjectMemberResponse> getProjectMember(GetProjectMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProjectMember").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only if you have purchased DataWorks Basic Edition or a later edition.</p>
     * 
     * @param request the request parameters of GetProjectRole  GetProjectRoleRequest
     * @return GetProjectRoleResponse
     */
    @Override
    public CompletableFuture<GetProjectRoleResponse> getProjectRole(GetProjectRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetProjectRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProjectRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProjectRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRerunWorkflowInstancesResult  GetRerunWorkflowInstancesResultRequest
     * @return GetRerunWorkflowInstancesResultResponse
     */
    @Override
    public CompletableFuture<GetRerunWorkflowInstancesResultResponse> getRerunWorkflowInstancesResult(GetRerunWorkflowInstancesResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRerunWorkflowInstancesResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRerunWorkflowInstancesResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRerunWorkflowInstancesResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResource  GetResourceRequest
     * @return GetResourceResponse
     */
    @Override
    public CompletableFuture<GetResourceResponse> getResource(GetResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResource").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of GetResourceGroup  GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    @Override
    public CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetResourceGroup").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetRoute  GetRouteRequest
     * @return GetRouteResponse
     */
    @Override
    public CompletableFuture<GetRouteResponse> getRoute(GetRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRoute").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>Only MaxCompute and Hologres types are supported.</li>
     * </ol>
     * 
     * @param request the request parameters of GetSchema  GetSchemaRequest
     * @return GetSchemaResponse
     */
    @Override
    public CompletableFuture<GetSchemaResponse> getSchema(GetSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSchema").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API retrieves the complete configuration information for a security policy by its ID.</li>
     * <li>The API returns an error message if the provided <code>Id</code> is invalid or does not exist.</li>
     * <li>The response includes basic policy information, such as its name and description, and policy details, such as control items and their settings.</li>
     * <li>Note: Some fields in a system default policy cannot be modified or deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSecurityStrategy  GetSecurityStrategyRequest
     * @return GetSecurityStrategyResponse
     */
    @Override
    public CompletableFuture<GetSecurityStrategyResponse> getSecurityStrategy(GetSecurityStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSecurityStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSecurityStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSecurityStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Queries the detailed status and runtime information of a semantic job run on the executor side. This is used to poll execution progress or troubleshoot run failures.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Call <code>RunSemanticJob</code> or <code>ListSemanticJobRuns</code> to obtain the <code>ExecutorJobId</code>.</li>
     * <li>Use the <code>ProjectId</code> returned by the job definition as the <code>ProjectId</code> for this operation.</li>
     * <li>Determine the current status based on the executor details in <code>Data</code>. If the job is still running, continue polling this operation.</li>
     * </ol>
     * <h2>Related operations</h2>
     * <p>To retrieve logs, call <code>GetSemanticJobLog</code>. To stop a run, call <code>KillSemanticJob</code>.</p>
     * 
     * @param request the request parameters of GetSemanticJobDetail  GetSemanticJobDetailRequest
     * @return GetSemanticJobDetailResponse
     */
    @Override
    public CompletableFuture<GetSemanticJobDetailResponse> getSemanticJobDetail(GetSemanticJobDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSemanticJobDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSemanticJobDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSemanticJobDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Reads the execution logs of a semantic job run to observe the execution process and identify failure causes.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Specify the run by using <code>RunSemanticJob.Data.ExecutorJobId</code> or <code>ListSemanticJobRuns[].ExecutorJobId</code>.</li>
     * <li>Call this operation with the <code>ProjectId</code> of the corresponding task.</li>
     * <li>Analyze the log segments in <code>Data</code> together with the run status returned by <code>GetSemanticJobDetail</code>.</li>
     * </ol>
     * <h2>Before you begin</h2>
     * <p>Logs are used for diagnostics and do not represent the final result files. Obtain result artifacts by calling <code>DownloadSemanticResults</code>.</p>
     * 
     * @param request the request parameters of GetSemanticJobLog  GetSemanticJobLogRequest
     * @return GetSemanticJobLogResponse
     */
    @Override
    public CompletableFuture<GetSemanticJobLogResponse> getSemanticJobLog(GetSemanticJobLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSemanticJobLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSemanticJobLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSemanticJobLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the basic information, running status, image, network, dataset, and credential configurations of a specified personal development environment (ServerIDE) instance.</p>
     * 
     * @param request the request parameters of GetServerIdeInstance  GetServerIdeInstanceRequest
     * @return GetServerIdeInstanceResponse
     */
    @Override
    public CompletableFuture<GetServerIdeInstanceResponse> getServerIdeInstance(GetServerIdeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetServerIdeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServerIdeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServerIdeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Overview</h2>
     * <ul>
     * <li><strong>request parameters</strong>: The name of the target Skill.</li>
     * <li><strong>response parameters</strong>: The details of the Skill, including its name, description, creator ID, modifier ID, visibility level, visibility scope, the body of the SKILL.md file, a temporary download link for bundle.zip (which requires no authentication and will expire), the creation time, and the last modified time.</li>
     * <li><strong>Note</strong>: The <code>BundleUrl</code> is a temporary download link. Once the link expires, you must call this operation again to get a new one.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSkill  GetSkillRequest
     * @return GetSkillResponse
     */
    @Override
    public CompletableFuture<GetSkillResponse> getSkill(GetSkillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSkill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSkillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSkillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSnapshot  GetSnapshotRequest
     * @return GetSnapshotResponse
     */
    @Override
    public CompletableFuture<GetSnapshotResponse> getSnapshot(GetSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of GetTable  GetTableRequest
     * @return GetTableResponse
     */
    @Override
    public CompletableFuture<GetTableResponse> getTable(GetTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTable").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTask  GetTaskRequest
     * @return GetTaskResponse
     */
    @Override
    public CompletableFuture<GetTaskResponse> getTask(GetTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTask").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of GetTaskInstance  GetTaskInstanceRequest
     * @return GetTaskInstanceResponse
     */
    @Override
    public CompletableFuture<GetTaskInstanceResponse> getTaskInstance(GetTaskInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTaskInstance").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetTaskInstanceLog  GetTaskInstanceLogRequest
     * @return GetTaskInstanceLogResponse
     */
    @Override
    public CompletableFuture<GetTaskInstanceLogResponse> getTaskInstanceLog(GetTaskInstanceLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTaskInstanceLog").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTaskInstanceLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTaskInstanceLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of GetUpdateTaskResult  GetUpdateTaskResultRequest
     * @return GetUpdateTaskResultResponse
     */
    @Override
    public CompletableFuture<GetUpdateTaskResultResponse> getUpdateTaskResult(GetUpdateTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUpdateTaskResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUpdateTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUpdateTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GetWorkflow  GetWorkflowRequest
     * @return GetWorkflowResponse
     */
    @Override
    public CompletableFuture<GetWorkflowResponse> getWorkflow(GetWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWorkflow").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWorkflowDefinition  GetWorkflowDefinitionRequest
     * @return GetWorkflowDefinitionResponse
     */
    @Override
    public CompletableFuture<GetWorkflowDefinitionResponse> getWorkflowDefinition(GetWorkflowDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWorkflowDefinition").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkflowDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkflowDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of GetWorkflowInstance  GetWorkflowInstanceRequest
     * @return GetWorkflowInstanceResponse
     */
    @Override
    public CompletableFuture<GetWorkflowInstanceResponse> getWorkflowInstance(GetWorkflowInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWorkflowInstance").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWorkflowInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWorkflowInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of GrantMemberProjectRoles  GrantMemberProjectRolesRequest
     * @return GrantMemberProjectRolesResponse
     */
    @Override
    public CompletableFuture<GrantMemberProjectRolesResponse> grantMemberProjectRoles(GrantMemberProjectRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GrantMemberProjectRoles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantMemberProjectRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantMemberProjectRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>This operation does not support importing multiple workflows. If more than one workflow is defined in the FlowSpec, all workflows after the first one are ignored.</li>
     * <li>This is an asynchronous operation. Calling this operation returns an asynchronous task object. To query the execution status of the task, call GetJobStatus.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportWorkflowDefinition  ImportWorkflowDefinitionRequest
     * @return ImportWorkflowDefinitionResponse
     */
    @Override
    public CompletableFuture<ImportWorkflowDefinitionResponse> importWorkflowDefinition(ImportWorkflowDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportWorkflowDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportWorkflowDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportWorkflowDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Sends a stop request to the executor for a specified semantic job run. This is applicable to scenarios where a job runs for an extended period, requires manual termination, or needs resource reclamation.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Obtain the <code>ExecutorJobId</code> from <code>RunSemanticJob</code> or <code>ListSemanticJobRuns</code>, and use the <code>ProjectId</code> of the job.</li>
     * <li>Optionally specify <code>RetryTimes</code>.</li>
     * <li>After the call, poll the final status by calling <code>GetSemanticJobDetail</code>. If necessary, call <code>GetSemanticJobLog</code> for diagnostics.</li>
     * </ol>
     * <h2>Precautions</h2>
     * <p>A successful response indicates only that the stop request has been processed. It does not mean that the job has reached a desired state.</p>
     * 
     * @param request the request parameters of KillSemanticJob  KillSemanticJobRequest
     * @return KillSemanticJobResponse
     */
    @Override
    public CompletableFuture<KillSemanticJobResponse> killSemanticJob(KillSemanticJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("KillSemanticJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(KillSemanticJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<KillSemanticJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries all artifact files generated in a specific session. You can use the <code>Params.RequestId</code> parameter to filter files produced by a single request.</li>
     * <li>The <code>NextToken</code> parameter is used to retrieve more results in a paginated manner. You do not need to provide this value for the first call.</li>
     * <li>By default, a maximum of 50 records are returned per page. You can adjust this value by using the <code>MaxResults</code> parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAgentSessionArtifacts  ListAgentSessionArtifactsRequest
     * @return ListAgentSessionArtifactsResponse
     */
    @Override
    public CompletableFuture<ListAgentSessionArtifactsResponse> listAgentSessionArtifacts(ListAgentSessionArtifactsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgentSessionArtifacts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentSessionArtifactsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentSessionArtifactsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>At least one of <code>agentName</code> and <code>sessionSourceList</code> must be provided.</li>
     * <li>Supports combined filtering by <code>tagList</code>, <code>sessionId</code>, and <code>sessionTitle</code>.</li>
     * <li>The response conforms to the Alibaba Cloud OpenAPI paging specification, including <code>totalCount</code>, <code>maxResults</code>, <code>nextToken</code>, and <code>sessionList</code>.</li>
     * <li>If <code>nextToken</code> is an invalid character string, it defaults to 1.</li>
     * <li>By default, 50 records are returned per page. Adjust this by using the <code>maxResults</code> parameter.</li>
     * </ul>
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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries all available agents under the current tenant.</li>
     * <li>Supports exact match filtering by using the <code>agentName</code> parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    @Override
    public CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAgents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlertRules  ListAlertRulesRequest
     * @return ListAlertRulesResponse
     */
    @Override
    public CompletableFuture<ListAlertRulesResponse> listAlertRules(ListAlertRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAlertRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlertRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlertRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBusiness  ListBusinessRequest
     * @return ListBusinessResponse
     */
    @Override
    public CompletableFuture<ListBusinessResponse> listBusiness(ListBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of ListCatalogs  ListCatalogsRequest
     * @return ListCatalogsResponse
     */
    @Override
    public CompletableFuture<ListCatalogsResponse> listCatalogs(ListCatalogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCatalogs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCatalogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCatalogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This API operation is available for all DataWorks editions.</li>
     * <li>You can call this operation only if you are assigned one of the following roles in DataWorks: Tenant Owner, Workspace Administrator, Deploy, Develop, Visitor, Workspace Owner, O\&amp;M, Model Designer, Security Administrator, Data Analyst, OpenPlatform Administrator, and Data Governance Administrator.</li>
     * </ol>
     * 
     * @param request the request parameters of ListCertificates  ListCertificatesRequest
     * @return ListCertificatesResponse
     */
    @Override
    public CompletableFuture<ListCertificatesResponse> listCertificates(ListCertificatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCertificates").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCertificatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCertificatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of ListColumns  ListColumnsRequest
     * @return ListColumnsResponse
     */
    @Override
    public CompletableFuture<ListColumnsResponse> listColumns(ListColumnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListColumns").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListColumnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListColumnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of ListComponents  ListComponentsRequest
     * @return ListComponentsResponse
     */
    @Override
    public CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListComponents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComponentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComponentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a more advanced edition is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * <li>Tenant Owner, Workspace Administrator, Deploy, Developer, Visitor, Project Owner, O\&amp;M, Model Designer, Security Administrator, Data Analyst, Development Platform Administrator, Data Governance Administrator</li>
     * </ol>
     * 
     * @param request the request parameters of ListComputeResources  ListComputeResourcesRequest
     * @return ListComputeResourcesResponse
     */
    @Override
    public CompletableFuture<ListComputeResourcesResponse> listComputeResources(ListComputeResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListComputeResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComputeResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComputeResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Queries the run records of a specified metadata crawler within the last 30 days by paging, with optional filtering by run start time and status.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Invoke <code>ListCrawlers</code> to obtain the crawler ID.</li>
     * <li>Invoke this operation to query run records and node instance IDs.</li>
     * <li>For asynchronous operations such as running or stopping, use the final status returned by this operation as the source of truth.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * <h2>Precautions</h2>
     * <p>If no time range is specified, the system queries records from the last 30 days by default.</p>
     * 
     * @param request the request parameters of ListCrawlerRuns  ListCrawlerRunsRequest
     * @return ListCrawlerRunsResponse
     */
    @Override
    public CompletableFuture<ListCrawlerRunsResponse> listCrawlerRuns(ListCrawlerRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCrawlerRuns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrawlerRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrawlerRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of ListCrawlerTypes  ListCrawlerTypesRequest
     * @return ListCrawlerTypesResponse
     */
    @Override
    public CompletableFuture<ListCrawlerTypesResponse> listCrawlerTypes(ListCrawlerTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCrawlerTypes").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrawlerTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrawlerTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Performs a paged query of metadata crawlers that you have access to. Supports filtering by workspace, data source, crawler type, environment, owner, and name.</p>
     * <h2>Recommended flow</h2>
     * <ol>
     * <li>Combine filter conditions as needed to perform a conditional query of the crawler list.</li>
     * <li>Use the returned crawler IDs to invoke the get details, update, run, stop, run records, or delete operations.</li>
     * </ol>
     * <h2>Version requirements</h2>
     * <p>DataWorks Basic Edition or higher is required.</p>
     * <h2>Precautions</h2>
     * <p>When multiple filter conditions are provided at the same time, they take effect in combination. The name field supports fuzzy match.</p>
     * 
     * @param request the request parameters of ListCrawlers  ListCrawlersRequest
     * @return ListCrawlersResponse
     */
    @Override
    public CompletableFuture<ListCrawlersResponse> listCrawlers(ListCrawlersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCrawlers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrawlersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrawlersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCrossProjectDeploymentCandidates  ListCrossProjectDeploymentCandidatesRequest
     * @return ListCrossProjectDeploymentCandidatesResponse
     */
    @Override
    public CompletableFuture<ListCrossProjectDeploymentCandidatesResponse> listCrossProjectDeploymentCandidates(ListCrossProjectDeploymentCandidatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCrossProjectDeploymentCandidates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrossProjectDeploymentCandidatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrossProjectDeploymentCandidatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCrossProjectDeploymentEnvironments  ListCrossProjectDeploymentEnvironmentsRequest
     * @return ListCrossProjectDeploymentEnvironmentsResponse
     */
    @Override
    public CompletableFuture<ListCrossProjectDeploymentEnvironmentsResponse> listCrossProjectDeploymentEnvironments(ListCrossProjectDeploymentEnvironmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCrossProjectDeploymentEnvironments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrossProjectDeploymentEnvironmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrossProjectDeploymentEnvironmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCrossProjectPipelineRunItems  ListCrossProjectPipelineRunItemsRequest
     * @return ListCrossProjectPipelineRunItemsResponse
     */
    @Override
    public CompletableFuture<ListCrossProjectPipelineRunItemsResponse> listCrossProjectPipelineRunItems(ListCrossProjectPipelineRunItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCrossProjectPipelineRunItems").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrossProjectPipelineRunItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrossProjectPipelineRunItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCrossProjectPipelineRuns  ListCrossProjectPipelineRunsRequest
     * @return ListCrossProjectPipelineRunsResponse
     */
    @Override
    public CompletableFuture<ListCrossProjectPipelineRunsResponse> listCrossProjectPipelineRuns(ListCrossProjectPipelineRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCrossProjectPipelineRuns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCrossProjectPipelineRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCrossProjectPipelineRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li><strong>Search keyword</strong>: Use the <code>Q</code> parameter to perform a fuzzy search by agent name.</li>
     * <li><strong>Visibility level filtering</strong>: Use the <code>Visibility</code> parameter to filter results by visibility level, such as <code>TENANT</code>, <code>PROJECT</code>, or <code>USER</code>.</li>
     * <li><strong>Paging information</strong>: Use the <code>MaxResults</code> and <code>NextToken</code> parameters to implement paginated queries. <code>NextToken</code> retrieves the next page of results.</li>
     * </ul>
     * 
     * @param request the request parameters of ListCustomAgents  ListCustomAgentsRequest
     * @return ListCustomAgentsResponse
     */
    @Override
    public CompletableFuture<ListCustomAgentsResponse> listCustomAgents(ListCustomAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomAgents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCustomAttributes  ListCustomAttributesRequest
     * @return ListCustomAttributesResponse
     */
    @Override
    public CompletableFuture<ListCustomAttributesResponse> listCustomAttributes(ListCustomAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDIAlarmRules  ListDIAlarmRulesRequest
     * @return ListDIAlarmRulesResponse
     */
    @Override
    public CompletableFuture<ListDIAlarmRulesResponse> listDIAlarmRules(ListDIAlarmRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDIAlarmRules").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDIAlarmRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDIAlarmRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListDIJobEvents  ListDIJobEventsRequest
     * @return ListDIJobEventsResponse
     */
    @Override
    public CompletableFuture<ListDIJobEventsResponse> listDIJobEvents(ListDIJobEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDIJobEvents").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDIJobEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDIJobEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListDIJobMetrics  ListDIJobMetricsRequest
     * @return ListDIJobMetricsResponse
     */
    @Override
    public CompletableFuture<ListDIJobMetricsResponse> listDIJobMetrics(ListDIJobMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDIJobMetrics").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDIJobMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDIJobMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListDIJobRunDetails  ListDIJobRunDetailsRequest
     * @return ListDIJobRunDetailsResponse
     */
    @Override
    public CompletableFuture<ListDIJobRunDetailsResponse> listDIJobRunDetails(ListDIJobRunDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDIJobRunDetails").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDIJobRunDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDIJobRunDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation requires DataWorks Basic Edition or a later edition.</p>
     * 
     * @param request the request parameters of ListDIJobs  ListDIJobsRequest
     * @return ListDIJobsResponse
     */
    @Override
    public CompletableFuture<ListDIJobsResponse> listDIJobs(ListDIJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDIJobs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDIJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDIJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of ListDataAssetTags  ListDataAssetTagsRequest
     * @return ListDataAssetTagsResponse
     */
    @Override
    public CompletableFuture<ListDataAssetTagsResponse> listDataAssetTags(ListDataAssetTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataAssetTags").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataAssetTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataAssetTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of ListDataAssets  ListDataAssetsRequest
     * @return ListDataAssetsResponse
     */
    @Override
    public CompletableFuture<ListDataAssetsResponse> listDataAssets(ListDataAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataAssets").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of ListDataQualityAlertRules  ListDataQualityAlertRulesRequest
     * @return ListDataQualityAlertRulesResponse
     */
    @Override
    public CompletableFuture<ListDataQualityAlertRulesResponse> listDataQualityAlertRules(ListDataQualityAlertRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataQualityAlertRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataQualityAlertRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataQualityAlertRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListDataQualityEvaluationTaskInstances is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScanRuns instead.  * @description You must purchase DataWorks Basic Edition or above to use this feature.
     * 
     * @param request the request parameters of ListDataQualityEvaluationTaskInstances  ListDataQualityEvaluationTaskInstancesRequest
     * @return ListDataQualityEvaluationTaskInstancesResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListDataQualityEvaluationTaskInstancesResponse> listDataQualityEvaluationTaskInstances(ListDataQualityEvaluationTaskInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataQualityEvaluationTaskInstances").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataQualityEvaluationTaskInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataQualityEvaluationTaskInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListDataQualityEvaluationTasks is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScans instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of ListDataQualityEvaluationTasks  ListDataQualityEvaluationTasksRequest
     * @return ListDataQualityEvaluationTasksResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListDataQualityEvaluationTasksResponse> listDataQualityEvaluationTasks(ListDataQualityEvaluationTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataQualityEvaluationTasks").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataQualityEvaluationTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataQualityEvaluationTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListDataQualityResults is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScanRuns instead.  * @description 需要购买DataWorks基础版及以上版本才能使用
     * 
     * @param request the request parameters of ListDataQualityResults  ListDataQualityResultsRequest
     * @return ListDataQualityResultsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListDataQualityResultsResponse> listDataQualityResults(ListDataQualityResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataQualityResults").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataQualityResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataQualityResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListDataQualityRuleTemplates is deprecated, please use dataworks-public::2024-05-18::ListDataQualityTemplates instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of ListDataQualityRuleTemplates  ListDataQualityRuleTemplatesRequest
     * @return ListDataQualityRuleTemplatesResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListDataQualityRuleTemplatesResponse> listDataQualityRuleTemplates(ListDataQualityRuleTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataQualityRuleTemplates").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataQualityRuleTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataQualityRuleTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ListDataQualityRules is deprecated, please use dataworks-public::2024-05-18::ListDataQualityScans instead.  * @description You must purchase DataWorks Basic Edition or a higher edition to use this feature.
     * 
     * @param request the request parameters of ListDataQualityRules  ListDataQualityRulesRequest
     * @return ListDataQualityRulesResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ListDataQualityRulesResponse> listDataQualityRules(ListDataQualityRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataQualityRules").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataQualityRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataQualityRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This feature requires DataWorks basic edition or higher.</p>
     * 
     * @param request the request parameters of ListDataQualityScanRuns  ListDataQualityScanRunsRequest
     * @return ListDataQualityScanRunsResponse
     */
    @Override
    public CompletableFuture<ListDataQualityScanRunsResponse> listDataQualityScanRuns(ListDataQualityScanRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataQualityScanRuns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataQualityScanRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataQualityScanRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of ListDataQualityScans  ListDataQualityScansRequest
     * @return ListDataQualityScansResponse
     */
    @Override
    public CompletableFuture<ListDataQualityScansResponse> listDataQualityScans(ListDataQualityScansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataQualityScans").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataQualityScansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataQualityScansResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of ListDataQualityTemplates  ListDataQualityTemplatesRequest
     * @return ListDataQualityTemplatesResponse
     */
    @Override
    public CompletableFuture<ListDataQualityTemplatesResponse> listDataQualityTemplates(ListDataQualityTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataQualityTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataQualityTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataQualityTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation is available for all DataWorks editions.</li>
     * <li>To query the sharing rules of a data source associated with a workspace, you must have the data source sharing permissions in that workspace. You must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Tenant Administrator, Workspace Administrator, and Workspace Owner</li>
     * </ul>
     * 
     * @param request the request parameters of ListDataSourceSharedRules  ListDataSourceSharedRulesRequest
     * @return ListDataSourceSharedRulesResponse
     */
    @Override
    public CompletableFuture<ListDataSourceSharedRulesResponse> listDataSourceSharedRules(ListDataSourceSharedRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSourceSharedRules").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourceSharedRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourceSharedRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation is available for all DataWorks editions.</li>
     * <li>To call this operation, you must have one of the following roles in DataWorks:</li>
     * </ol>
     * <ul>
     * <li>Tenant Owner, Workspace Administrator, Deploy, Develop, Visitor, Workspace Owner, O\&amp;M, Model Designer, Security Administrator, Data Analyst, OpenPlatform Administrator, and Data Governance Administrator</li>
     * </ul>
     * 
     * @param request the request parameters of ListDataSources  ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    @Override
    public CompletableFuture<ListDataSourcesResponse> listDataSources(ListDataSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDataSources").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>For the StarRocks type, only the Internal catalog is supported.</li>
     * </ol>
     * 
     * @param request the request parameters of ListDatabases  ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    @Override
    public CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDatabases").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatabasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatabasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasetVersions  ListDatasetVersionsRequest
     * @return ListDatasetVersionsResponse
     */
    @Override
    public CompletableFuture<ListDatasetVersionsResponse> listDatasetVersions(ListDatasetVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDatasetVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasetVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasetVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasets  ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    @Override
    public CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDatasets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeploymentPackageFiles  ListDeploymentPackageFilesRequest
     * @return ListDeploymentPackageFilesResponse
     */
    @Override
    public CompletableFuture<ListDeploymentPackageFilesResponse> listDeploymentPackageFiles(ListDeploymentPackageFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDeploymentPackageFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeploymentPackageFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeploymentPackageFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeploymentPackages  ListDeploymentPackagesRequest
     * @return ListDeploymentPackagesResponse
     */
    @Override
    public CompletableFuture<ListDeploymentPackagesResponse> listDeploymentPackages(ListDeploymentPackagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDeploymentPackages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeploymentPackagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeploymentPackagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of ListDownstreamTaskInstances  ListDownstreamTaskInstancesRequest
     * @return ListDownstreamTaskInstancesResponse
     */
    @Override
    public CompletableFuture<ListDownstreamTaskInstancesResponse> listDownstreamTaskInstances(ListDownstreamTaskInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDownstreamTaskInstances").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDownstreamTaskInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDownstreamTaskInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDownstreamTasks  ListDownstreamTasksRequest
     * @return ListDownstreamTasksResponse
     */
    @Override
    public CompletableFuture<ListDownstreamTasksResponse> listDownstreamTasks(ListDownstreamTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDownstreamTasks").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDownstreamTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDownstreamTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Professional Edition or a higher edition is required.</li>
     * </ol>
     * 
     * @param request the request parameters of ListEntitiesInMetaCollection  ListEntitiesInMetaCollectionRequest
     * @return ListEntitiesInMetaCollectionResponse
     */
    @Override
    public CompletableFuture<ListEntitiesInMetaCollectionResponse> listEntitiesInMetaCollection(ListEntitiesInMetaCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEntitiesInMetaCollection").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEntitiesInMetaCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEntitiesInMetaCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFileVersions  ListFileVersionsRequest
     * @return ListFileVersionsResponse
     */
    @Override
    public CompletableFuture<ListFileVersionsResponse> listFileVersions(ListFileVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFileVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFileVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFileVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFiles  ListFilesRequest
     * @return ListFilesResponse
     */
    @Override
    public CompletableFuture<ListFilesResponse> listFiles(ListFilesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFiles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFilesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFilesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFolders  ListFoldersRequest
     * @return ListFoldersResponse
     */
    @Override
    public CompletableFuture<ListFoldersResponse> listFolders(ListFoldersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFolders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFoldersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFoldersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListFunctions  ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    @Override
    public CompletableFuture<ListFunctionsResponse> listFunctions(ListFunctionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFunctions").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFunctionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFunctionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or higher to call this operation.</li>
     * <li><strong>Before you call this operation, ensure that the AliyunServiceRoleForDataWorks service-linked role is created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListImageAssociatedProjects  ListImageAssociatedProjectsRequest
     * @return ListImageAssociatedProjectsResponse
     */
    @Override
    public CompletableFuture<ListImageAssociatedProjectsResponse> listImageAssociatedProjects(ListImageAssociatedProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListImageAssociatedProjects").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageAssociatedProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageAssociatedProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before using this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListImageTestResults  ListImageTestResultsRequest
     * @return ListImageTestResultsResponse
     */
    @Override
    public CompletableFuture<ListImageTestResultsResponse> listImageTestResults(ListImageTestResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListImageTestResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageTestResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageTestResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>To use this API, you must purchase DataWorks Basic Edition or a later edition.</li>
     * <li><strong>Ensure you create the service-linked role AliyunServiceRoleForDataWorks before you call this API.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListImageVersions  ListImageVersionsRequest
     * @return ListImageVersionsResponse
     */
    @Override
    public CompletableFuture<ListImageVersionsResponse> listImageVersions(ListImageVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListImageVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImageVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImageVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must have DataWorks Basic Edition or a later version to use this API.</li>
     * <li><strong>Before you use this API, make sure that the service-linked role AliyunServiceRoleForDataWorks is created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    @Override
    public CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListImages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListImagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListImagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Standard Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of ListLineageRelationships  ListLineageRelationshipsRequest
     * @return ListLineageRelationshipsResponse
     */
    @Override
    public CompletableFuture<ListLineageRelationshipsResponse> listLineageRelationships(ListLineageRelationshipsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLineageRelationships").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLineageRelationshipsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLineageRelationshipsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Standard Edition or a higher edition to use this operation.</li>
     * <li>This operation queries the upstream and downstream entities of the current entity, as well as the lineage relationships between entities.</li>
     * </ol>
     * 
     * @param request the request parameters of ListLineages  ListLineagesRequest
     * @return ListLineagesResponse
     */
    @Override
    public CompletableFuture<ListLineagesResponse> listLineages(ListLineagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLineages").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLineagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLineagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This operation retrieves a paginated list of all MCP Servers within your account. You can filter the list by search keyword and visibility level, and control pagination by specifying the maximum number of results and a next page token.</p>
     * <ul>
     * <li><strong>Q</strong>: Optional. The search keyword for a fuzzy search on MCP Server names.</li>
     * <li><strong>Visibility</strong>: Optional. The visibility level for filtering the results.</li>
     * <li><strong>MaxResults</strong>: Optional. The maximum number of results to return per page. By default, no limit is applied.</li>
     * <li><strong>NextToken</strong>: Optional. The next page token from a previous response. Use this parameter to retrieve the next page of results.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMcpServers  ListMcpServersRequest
     * @return ListMcpServersResponse
     */
    @Override
    public CompletableFuture<ListMcpServersResponse> listMcpServers(ListMcpServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMcpServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMcpServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMcpServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Professional Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of ListMetaCollections  ListMetaCollectionsRequest
     * @return ListMetaCollectionsResponse
     */
    @Override
    public CompletableFuture<ListMetaCollectionsResponse> listMetaCollections(ListMetaCollectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMetaCollections").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMetaCollectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMetaCollectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMetaEntities  ListMetaEntitiesRequest
     * @return ListMetaEntitiesResponse
     */
    @Override
    public CompletableFuture<ListMetaEntitiesResponse> listMetaEntities(ListMetaEntitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMetaEntities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMetaEntitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMetaEntitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMetaEntityDefs  ListMetaEntityDefsRequest
     * @return ListMetaEntityDefsResponse
     */
    @Override
    public CompletableFuture<ListMetaEntityDefsResponse> listMetaEntityDefs(ListMetaEntityDefsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMetaEntityDefs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMetaEntityDefsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMetaEntityDefsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API supports paginated queries, controlled by the <code>NextToken</code> and <code>PageSize</code> parameters.</li>
     * <li><code>DefSchema</code> is a required parameter that specifies the resource type.</li>
     * <li>The <code>ResourceType</code> list can contain multiple resource types for more precise filtering of application orders.</li>
     * <li>You can set <code>StartTime</code> and <code>EndTime</code> to limit the time range of the query.</li>
     * <li><code>Statuses</code> allows you to filter application orders by specific statuses, such as pending approval and authorized.</li>
     * <li>If you need to filter by specific resources or authorization targets, you can provide detailed information through the <code>Resource</code> and <code>Grantee</code> fields.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMyApplications  ListMyApplicationsRequest
     * @return ListMyApplicationsResponse
     */
    @Override
    public CompletableFuture<ListMyApplicationsResponse> listMyApplications(ListMyApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMyApplications").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMyApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMyApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <ul>
     * <li>This API is used to retrieve all permission application orders where the current user is an approver, including pending and processed application orders.</li>
     * <li>You can use the <code>Statuses</code> parameter to filter application orders by specific status.</li>
     * <li><code>NextToken</code> is used for paginated requests. It can be omitted or set to <code>null</code> for the first request. For subsequent requests, pass the <code>NextToken</code> value from the previous response.</li>
     * <li><code>PageSize</code> defaults to 10, with a maximum of 200.</li>
     * <li><code>DefSchema</code> and <code>ResourceType</code> are required fields. Other parameters can be filled in as needed.</li>
     * </ul>
     * 
     * @param request the request parameters of ListMyRelatedApprovals  ListMyRelatedApprovalsRequest
     * @return ListMyRelatedApprovalsResponse
     */
    @Override
    public CompletableFuture<ListMyRelatedApprovalsResponse> listMyRelatedApprovals(ListMyRelatedApprovalsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListMyRelatedApprovals").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMyRelatedApprovalsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMyRelatedApprovalsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListNetworks  ListNetworksRequest
     * @return ListNetworksResponse
     */
    @Override
    public CompletableFuture<ListNetworksResponse> listNetworks(ListNetworksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNetworks").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNetworksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNetworksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodeDependencies  ListNodeDependenciesRequest
     * @return ListNodeDependenciesResponse
     */
    @Override
    public CompletableFuture<ListNodeDependenciesResponse> listNodeDependencies(ListNodeDependenciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodeDependencies").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodeDependenciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodeDependenciesResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodes").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This feature is available in DataWorks Professional Edition and higher editions.</p>
     * 
     * @param request the request parameters of ListParameterVersions  ListParameterVersionsRequest
     * @return ListParameterVersionsResponse
     */
    @Override
    public CompletableFuture<ListParameterVersionsResponse> listParameterVersions(ListParameterVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListParameterVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListParameterVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListParameterVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This feature is available in DataWorks Professional Edition or higher.</p>
     * 
     * @param request the request parameters of ListParameters  ListParametersRequest
     * @return ListParametersResponse
     */
    @Override
    public CompletableFuture<ListParametersResponse> listParameters(ListParametersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListParameters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListParametersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListParametersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>Only MaxCompute and HMS (EMR cluster) table types are supported.</li>
     * <li>Before calling this API, call ListCrawlers to obtain the MetaEntityId of the metadata crawler, then call ListDatabases to obtain the database ID. For MaxCompute projects with Schema enabled, call ListSchemas to obtain the schema ID. Then call ListTables to obtain the TableId, and pass the returned table ID to this API.</li>
     * </ol>
     * 
     * @param request the request parameters of ListPartitions  ListPartitionsRequest
     * @return ListPartitionsResponse
     */
    @Override
    public CompletableFuture<ListPartitionsResponse> listPartitions(ListPartitionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPartitions").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPartitionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPartitionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request Description</h2>
     * <p>This API is used to query all pending permission request orders for which the current logged-in user is the approver. It supports filtering by multiple conditions, including resource type, time range, and approval status, to more precisely locate specific request orders.</p>
     * <ul>
     * <li><strong>ResourceType</strong>: Specifies the resource type (such as table), which can have multiple values.</li>
     * <li><strong>Resource</strong>: Provides specific resource search conditions, such as the project, database, or table name.</li>
     * <li><strong>StartTime and EndTime</strong>: Define the time range during which the request was submitted.</li>
     * <li><strong>Statuses</strong>: Allows filtering results by approval status, for example, to view only pending approval requests.</li>
     * <li><strong>Grantee</strong>: Filters request orders based on the authorization principal information.</li>
     * <li><strong>AccessTypes</strong>: Filters based on the specific permission types requested (such as read or update).</li>
     * <li><strong>PageSize and NextToken</strong>: Used for pagination control, specifying the amount of data returned per request and the cursor needed to retrieve the next page of data.
     * Notes:</li>
     * <li>If no filtering conditions are provided, all matching records are returned by default.</li>
     * <li>The <code>NextToken</code> parameter can be empty or omitted for the first call. Subsequent page requests must use the <code>NextToken</code> value provided in the previous response.</li>
     * <li>The default value of <code>PageSize</code> is 10, and the maximum value is 200. If the specified value exceeds the maximum limit, the maximum value is used.</li>
     * <li>When there is no more data to return, the <code>HasMore</code> field is set to <code>false</code>, and <code>NextToken</code> will be empty or absent.</li>
     * </ul>
     * <h2>Response Description</h2>
     * <p>After a successful call to this API, the response body contains paginated results and detailed information for each request order, such as the application time, resource description, authorization principal, requested permissions, and more. Additionally, the approval process status and other related metadata are provided.</p>
     * <ul>
     * <li><strong>Data</strong>: The paginated result set, including page size (<code>PageSize</code>), cursor (<code>NextToken</code>), and whether more data is available (<code>HasMore</code>).</li>
     * <li><strong>ApplicationQueryResponse</strong>: The specific content of each request order, including the reason for the request, submission time, status, and a detailed list of request content.</li>
     * </ul>
     * 
     * @param request the request parameters of ListPendingApprovals  ListPendingApprovalsRequest
     * @return ListPendingApprovalsResponse
     */
    @Override
    public CompletableFuture<ListPendingApprovalsResponse> listPendingApprovals(ListPendingApprovalsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPendingApprovals").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPendingApprovalsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPendingApprovalsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelineRunItems  ListPipelineRunItemsRequest
     * @return ListPipelineRunItemsResponse
     */
    @Override
    public CompletableFuture<ListPipelineRunItemsResponse> listPipelineRunItems(ListPipelineRunItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPipelineRunItems").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelineRunItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelineRunItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * Earlier SDK versions may not include this interface. If so, use the ListDeployments interface. It accepts the same parameters.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListPipelineRuns  ListPipelineRunsRequest
     * @return ListPipelineRunsResponse
     */
    @Override
    public CompletableFuture<ListPipelineRunsResponse> listPipelineRuns(ListPipelineRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPipelineRuns").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelineRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelineRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>Queries process definitions of a specified policy type.</li>
     * <li>This operation supports paginated queries. You can use the<code>PageSize</code> and<code>PageNumber</code> parameters to control the page size and page number.</li>
     * <li>You can also use the<code>NextToken</code> and<code>MaxResults</code> parameters to page through large result sets.</li>
     * <li>The response includes the total count, page size, current page number, and a list of process definitions.</li>
     * <li>Each process definition includes key attributes, such as its ID, enabled status, and priority.</li>
     * </ul>
     * 
     * @param request the request parameters of ListProcessDefinitions  ListProcessDefinitionsRequest
     * @return ListProcessDefinitionsResponse
     */
    @Override
    public CompletableFuture<ListProcessDefinitionsResponse> listProcessDefinitions(ListProcessDefinitionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProcessDefinitions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProcessDefinitionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProcessDefinitionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This feature is available in DataWorks Basic Edition and higher.</p>
     * 
     * @param request the request parameters of ListProjectMembers  ListProjectMembersRequest
     * @return ListProjectMembersResponse
     */
    @Override
    public CompletableFuture<ListProjectMembersResponse> listProjectMembers(ListProjectMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProjectMembers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This feature is available in DataWorks Basic Edition and higher.</p>
     * 
     * @param request the request parameters of ListProjectRoles  ListProjectRolesRequest
     * @return ListProjectRolesResponse
     */
    @Override
    public CompletableFuture<ListProjectRolesResponse> listProjectRoles(ListProjectRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProjectRoles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProjects  ListProjectsRequest
     * @return ListProjectsResponse
     */
    @Override
    public CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProjects").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a more advanced edition is required to use this feature.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks has been created before you call this operation.</strong></li>
     * <li>This operation returns only the workspaces that the current caller has access to. Unauthorized workspaces are not included in the response.</li>
     * </ol>
     * 
     * @param request the request parameters of ListResourceGroupAssociateProjects  ListResourceGroupAssociateProjectsRequest
     * @return ListResourceGroupAssociateProjectsResponse
     */
    @Override
    public CompletableFuture<ListResourceGroupAssociateProjectsResponse> listResourceGroupAssociateProjects(ListResourceGroupAssociateProjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceGroupAssociateProjects").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceGroupAssociateProjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceGroupAssociateProjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a more advanced edition is required to use this feature.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks has been created before you call this operation.</strong></li>
     * <li>This operation applies only to serverless resource groups.</li>
     * </ol>
     * 
     * @param request the request parameters of ListResourceGroupMetricData  ListResourceGroupMetricDataRequest
     * @return ListResourceGroupMetricDataResponse
     */
    @Override
    public CompletableFuture<ListResourceGroupMetricDataResponse> listResourceGroupMetricData(ListResourceGroupMetricDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceGroupMetricData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceGroupMetricDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceGroupMetricDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation requires DataWorks Basic Edition or higher.</li>
     * <li><strong>Before you call this operation, make sure that you have created the service-linked role AliyunServiceRoleForDataWorks.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of ListResourceGroups  ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    @Override
    public CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceGroups").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    @Override
    public CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResources").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of ListRoutes  ListRoutesRequest
     * @return ListRoutesResponse
     */
    @Override
    public CompletableFuture<ListRoutesResponse> listRoutes(ListRoutesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRoutes").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRoutesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRoutesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or higher to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of ListSchemas  ListSchemasRequest
     * @return ListSchemasResponse
     */
    @Override
    public CompletableFuture<ListSchemasResponse> listSchemas(ListSchemasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSchemas").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSchemasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSchemasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This API retrieves a paginated list of configured security policies.</li>
     * <li>The <code>ControlModule</code> and <code>ControlSubModule</code> parameters filter policies by a specific module or submodule.</li>
     * <li>The <code>PageNum</code> and <code>PageSize</code> parameters control pagination. <code>PageNum</code> specifies the page number to retrieve (default: 1), and <code>PageSize</code> specifies the number of policies to return per page (default: 20).</li>
     * <li>Use the <code>MaxResults</code> and <code>NextToken</code> private parameters for advanced pagination.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSecurityStrategies  ListSecurityStrategiesRequest
     * @return ListSecurityStrategiesResponse
     */
    @Override
    public CompletableFuture<ListSecurityStrategiesResponse> listSecurityStrategies(ListSecurityStrategiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSecurityStrategies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSecurityStrategiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSecurityStrategiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>View the historical run records of a semantic job with pagination to obtain the run ID, executor job ID, status, and time information for each submission.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Use the job name from <code>CreateSemanticJob.Data.Name</code> or <code>ListSemanticJobs</code> as the <code>JobName</code>.</li>
     * <li>Use <code>PageNumber</code> and <code>PageSize</code> to read records page by page.</li>
     * <li>Use the <code>JobRunId</code> from a record to call <code>DownloadSemanticResults</code>, and use the <code>ExecutorJobId</code> to call the detail, log, or stop operations.</li>
     * </ol>
     * <h2>Before you begin</h2>
     * <p>Pagination starts from page 1 by default. Each page contains a maximum of 200 records.</p>
     * 
     * @param request the request parameters of ListSemanticJobRuns  ListSemanticJobRunsRequest
     * @return ListSemanticJobRunsResponse
     */
    @Override
    public CompletableFuture<ListSemanticJobRunsResponse> listSemanticJobRuns(ListSemanticJobRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSemanticJobRuns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSemanticJobRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSemanticJobRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Queries the saved semantic node definitions of the current tenant with paging. Use this operation to display the node list, select a node to run, or obtain the workspace to which a node belongs.</p>
     * <h2>Invoke flow</h2>
     * <ol>
     * <li>Use <code>PageNumber</code> and <code>PageSize</code> to read <code>Data.SemanticJobs</code> with paging.</li>
     * <li>Use the <code>Name</code> field of a list item to invoke <code>RunSemanticJob</code>, <code>DeleteSemanticJob</code>, or <code>ListSemanticJobRuns</code>.</li>
     * <li>Use the <code>ProjectId</code> field of a list item together with <code>ExecutorJobId</code> to invoke the details, log, and stop operations.</li>
     * </ol>
     * <h2>Notes</h2>
     * <p>This operation returns node definitions, not real-time run statuses. To query run statuses, invoke <code>ListSemanticJobRuns</code>.</p>
     * 
     * @param request the request parameters of ListSemanticJobs  ListSemanticJobsRequest
     * @return ListSemanticJobsResponse
     */
    @Override
    public CompletableFuture<ListSemanticJobsResponse> listSemanticJobs(ListSemanticJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSemanticJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSemanticJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSemanticJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the ECS instance types available when creating a personal development environment (ServerIDE). You can filter by CPU or GPU type. If no type is specified, both CPU and GPU instance types are returned.</p>
     * 
     * @param request the request parameters of ListServerIdeEcsSpecs  ListServerIdeEcsSpecsRequest
     * @return ListServerIdeEcsSpecsResponse
     */
    @Override
    public CompletableFuture<ListServerIdeEcsSpecsResponse> listServerIdeEcsSpecs(ListServerIdeEcsSpecsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServerIdeEcsSpecs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServerIdeEcsSpecsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServerIdeEcsSpecsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the available images for creating a personal development environment (ServerIDE) by using paging. Supports filtering by image name and labels.</p>
     * 
     * @param request the request parameters of ListServerIdeImages  ListServerIdeImagesRequest
     * @return ListServerIdeImagesResponse
     */
    @Override
    public CompletableFuture<ListServerIdeImagesResponse> listServerIdeImages(ListServerIdeImagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServerIdeImages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServerIdeImagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServerIdeImagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries a paged query list of personal development environment (ServerIDE) instances with paging. You can filter results by workspace, resource group, keyword, owner, and instance child class.</p>
     * 
     * @param request the request parameters of ListServerIdeInstances  ListServerIdeInstancesRequest
     * @return ListServerIdeInstancesResponse
     */
    @Override
    public CompletableFuture<ListServerIdeInstancesResponse> listServerIdeInstances(ListServerIdeInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServerIdeInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServerIdeInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServerIdeInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <p>This operation lists the Skills in your account. You can filter the results by criteria such as a search keyword and visibility level.</p>
     * <ul>
     * <li><strong>Q</strong>: An optional search keyword for a fuzzy match on Skill names.</li>
     * <li><strong>Visibility</strong>: An optional parameter to filter Skills by their visibility level. You can specify multiple values.</li>
     * <li><strong>MaxResults</strong>: An optional parameter that specifies the maximum number of results to return per page.</li>
     * <li><strong>NextToken</strong>: An optional pagination token for retrieving the next page of results. Omit this parameter for the first request. For subsequent requests, pass the <code>NextToken</code> value from the previous response to fetch the next page.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSkills  ListSkillsRequest
     * @return ListSkillsResponse
     */
    @Override
    public CompletableFuture<ListSkillsResponse> listSkills(ListSkillsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSkills").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSkillsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSkillsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    @Override
    public CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of ListTables  ListTablesRequest
     * @return ListTablesResponse
     */
    @Override
    public CompletableFuture<ListTablesResponse> listTables(ListTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTables").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.
     * Only operation logs generated within the previous 31 days can be queried.</p>
     * 
     * @param request the request parameters of ListTaskInstanceOperationLogs  ListTaskInstanceOperationLogsRequest
     * @return ListTaskInstanceOperationLogsResponse
     */
    @Override
    public CompletableFuture<ListTaskInstanceOperationLogsResponse> listTaskInstanceOperationLogs(ListTaskInstanceOperationLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTaskInstanceOperationLogs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTaskInstanceOperationLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTaskInstanceOperationLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this API operation.</p>
     * 
     * @param request the request parameters of ListTaskInstances  ListTaskInstancesRequest
     * @return ListTaskInstancesResponse
     */
    @Override
    public CompletableFuture<ListTaskInstancesResponse> listTaskInstances(ListTaskInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTaskInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTaskInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTaskInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.
     * Only operation logs generated within the previous 31 days can be queried.</p>
     * 
     * @param request the request parameters of ListTaskOperationLogs  ListTaskOperationLogsRequest
     * @return ListTaskOperationLogsResponse
     */
    @Override
    public CompletableFuture<ListTaskOperationLogsResponse> listTaskOperationLogs(ListTaskOperationLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTaskOperationLogs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTaskOperationLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTaskOperationLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or higher is required.</p>
     * 
     * @param request the request parameters of ListTasks  ListTasksRequest
     * @return ListTasksResponse
     */
    @Override
    public CompletableFuture<ListTasksResponse> listTasks(ListTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of ListUpstreamTaskInstances  ListUpstreamTaskInstancesRequest
     * @return ListUpstreamTaskInstancesResponse
     */
    @Override
    public CompletableFuture<ListUpstreamTaskInstancesResponse> listUpstreamTaskInstances(ListUpstreamTaskInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUpstreamTaskInstances").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUpstreamTaskInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUpstreamTaskInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ListUpstreamTasks  ListUpstreamTasksRequest
     * @return ListUpstreamTasksResponse
     */
    @Override
    public CompletableFuture<ListUpstreamTasksResponse> listUpstreamTasks(ListUpstreamTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUpstreamTasks").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUpstreamTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUpstreamTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkflowDefinitions  ListWorkflowDefinitionsRequest
     * @return ListWorkflowDefinitionsResponse
     */
    @Override
    public CompletableFuture<ListWorkflowDefinitionsResponse> listWorkflowDefinitions(ListWorkflowDefinitionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWorkflowDefinitions").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkflowDefinitionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkflowDefinitionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of ListWorkflowInstances  ListWorkflowInstancesRequest
     * @return ListWorkflowInstancesResponse
     */
    @Override
    public CompletableFuture<ListWorkflowInstancesResponse> listWorkflowInstances(ListWorkflowInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWorkflowInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkflowInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkflowInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of ListWorkflows  ListWorkflowsRequest
     * @return ListWorkflowsResponse
     */
    @Override
    public CompletableFuture<ListWorkflowsResponse> listWorkflows(ListWorkflowsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListWorkflows").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkflowsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkflowsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>This operation retrieves session details and streams the Agent response using Server-Sent Events (SSE).</li>
     * <li>If the target session does not exist, the operation returns an error frame with an error code of 400.</li>
     * <li>The response includes information about the Agent\&quot;s request processing, such as message chunks, thought processes, and tool call status updates.</li>
     * <li>The <code>stopReason</code> field indicates why the Agent stops the current turn. Possible values include reaching the maximum turn limit or being canceled.</li>
     * <li>The returned content conforms to the Agent Client Protocol (ACP). For more information, see https\://agentclientprotocol.com.</li>
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
     * @param request the request parameters of MoveFunction  MoveFunctionRequest
     * @return MoveFunctionResponse
     */
    @Override
    public CompletableFuture<MoveFunctionResponse> moveFunction(MoveFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveFunction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MoveNode  MoveNodeRequest
     * @return MoveNodeResponse
     */
    @Override
    public CompletableFuture<MoveNodeResponse> moveNode(MoveNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MoveResource  MoveResourceRequest
     * @return MoveResourceResponse
     */
    @Override
    public CompletableFuture<MoveResourceResponse> moveResource(MoveResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MoveWorkflowDefinition  MoveWorkflowDefinitionRequest
     * @return MoveWorkflowDefinitionResponse
     */
    @Override
    public CompletableFuture<MoveWorkflowDefinitionResponse> moveWorkflowDefinition(MoveWorkflowDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveWorkflowDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveWorkflowDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveWorkflowDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PreviewDatasetVersion  PreviewDatasetVersionRequest
     * @return PreviewDatasetVersionResponse
     */
    @Override
    public CompletableFuture<PreviewDatasetVersionResponse> previewDatasetVersion(PreviewDatasetVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PreviewDatasetVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreviewDatasetVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreviewDatasetVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API sends a user prompt to a specified session ID and accepts the Agent response in SSE (Server-Sent Events) streaming mode.</li>
     * <li>The response may include message fragments, thinking procedures, tool calling status updates, and other information.</li>
     * <li>If the specified session does not exist, a 400 fault is returned through an SSE error frame.</li>
     * <li>The <code>stopReason</code> field indicates why the Agent stopped the current conversation turn.</li>
     * <li>Multiple types of content blocks are supported as prompt input, such as text and OSS file download links.</li>
     * <li>You can optionally provide additional meta information <code>Meta</code> to pass more context to the server.</li>
     * <li>The returned content conforms to the open-source Agent Client Protocol (ACP) specification. For more information, visit: <a href="https://agentclientprotocol.com">https://agentclientprotocol.com</a></li>
     * <li><strong>Before invoking this API, make sure you fully understand the billing methods and pricing of the Data Agent product</strong>: <a href="https://www.alibabacloud.com/help/en/dataworks/dataworks-data-agent-agent-billing">https://www.alibabacloud.com/help/en/dataworks/dataworks-data-agent-agent-billing</a></li>
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
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks has been created before you call this operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of PublishImage  PublishImageRequest
     * @return PublishImageResponse
     */
    @Override
    public CompletableFuture<PublishImageResponse> publishImage(PublishImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Professional Edition or a higher version to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of RemoveEntityFromMetaCollection  RemoveEntityFromMetaCollectionRequest
     * @return RemoveEntityFromMetaCollectionResponse
     */
    @Override
    public CompletableFuture<RemoveEntityFromMetaCollectionResponse> removeEntityFromMetaCollection(RemoveEntityFromMetaCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveEntityFromMetaCollection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveEntityFromMetaCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveEntityFromMetaCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of RemoveTaskInstanceDependencies  RemoveTaskInstanceDependenciesRequest
     * @return RemoveTaskInstanceDependenciesResponse
     */
    @Override
    public CompletableFuture<RemoveTaskInstanceDependenciesResponse> removeTaskInstanceDependencies(RemoveTaskInstanceDependenciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTaskInstanceDependencies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveTaskInstanceDependenciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveTaskInstanceDependenciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenameFunction  RenameFunctionRequest
     * @return RenameFunctionResponse
     */
    @Override
    public CompletableFuture<RenameFunctionResponse> renameFunction(RenameFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenameFunction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenameNode  RenameNodeRequest
     * @return RenameNodeResponse
     */
    @Override
    public CompletableFuture<RenameNodeResponse> renameNode(RenameNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenameNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenameResource  RenameResourceRequest
     * @return RenameResourceResponse
     */
    @Override
    public CompletableFuture<RenameResourceResponse> renameResource(RenameResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenameResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RenameWorkflowDefinition  RenameWorkflowDefinitionRequest
     * @return RenameWorkflowDefinitionResponse
     */
    @Override
    public CompletableFuture<RenameWorkflowDefinitionResponse> renameWorkflowDefinition(RenameWorkflowDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenameWorkflowDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenameWorkflowDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenameWorkflowDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Replies to a permission_request issued by the DataAgent daemon. You can submit an answer to an ask_user_question or cancel the current interaction. The PermissionRequestId must come from the params.data.requestId field in the _qwen/notify event (params.kind=permission_request) of the original PromptAgentSession SSE. The reply only returns whether it was accepted. Subsequent execution events are still returned through the original PromptAgentSession SSE. Do not resubmit the same prompt round.</p>
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
     * <p>You must purchase DataWorks Basic Edition or a more advanced edition to use this operation.</p>
     * 
     * @param request the request parameters of RerunTaskInstances  RerunTaskInstancesRequest
     * @return RerunTaskInstancesResponse
     */
    @Override
    public CompletableFuture<RerunTaskInstancesResponse> rerunTaskInstances(RerunTaskInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RerunTaskInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RerunTaskInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RerunTaskInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RerunWorkflowInstances  RerunWorkflowInstancesRequest
     * @return RerunWorkflowInstancesResponse
     */
    @Override
    public CompletableFuture<RerunWorkflowInstancesResponse> rerunWorkflowInstances(RerunWorkflowInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RerunWorkflowInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RerunWorkflowInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RerunWorkflowInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of ResumeTaskInstances  ResumeTaskInstancesRequest
     * @return ResumeTaskInstancesResponse
     */
    @Override
    public CompletableFuture<ResumeTaskInstancesResponse> resumeTaskInstances(ResumeTaskInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResumeTaskInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeTaskInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeTaskInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required to use this operation.</p>
     * 
     * @param request the request parameters of RevokeMemberProjectRoles  RevokeMemberProjectRolesRequest
     * @return RevokeMemberProjectRolesResponse
     */
    @Override
    public CompletableFuture<RevokeMemberProjectRolesResponse> revokeMemberProjectRoles(RevokeMemberProjectRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeMemberProjectRoles").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeMemberProjectRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeMemberProjectRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of RollbackImage  RollbackImageRequest
     * @return RollbackImageResponse
     */
    @Override
    public CompletableFuture<RollbackImageResponse> rollbackImage(RollbackImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RollbackImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in DataWorks Professional Edition or a later version.</p>
     * 
     * @param request the request parameters of RollbackParameter  RollbackParameterRequest
     * @return RollbackParameterResponse
     */
    @Override
    public CompletableFuture<RollbackParameterResponse> rollbackParameter(RollbackParameterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RollbackParameter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackParameterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackParameterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Submits a run request for a specified metadata crawler.</p>
     * <h2>Recommended process</h2>
     * <ol>
     * <li>Call <code>ListCrawlers</code> to query the IDs of available crawlers.</li>
     * <li>Call this operation to submit a run request.</li>
     * <li>Call <code>ListCrawlerRuns</code> to query the final run status.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or higher is required.</p>
     * <h2>Billing description</h2>
     * <p>Running a collection task consumes compute resources and may incur fees. The actual fees depend on the resource group used and the DataWorks billing rules.
     * If the crawler has the AI metadata description feature enabled (<code>EnableAiComment=true</code>), collecting metadata and generating AI descriptions consumes tokens. For information about the complimentary token quota and billing rules after the quota is exceeded, see <a href="https://www.alibabacloud.com/help/en/dataworks/dataworks-data-agent-agent-billing">Data Agent billing</a>.</p>
     * <h2>Precautions</h2>
     * <p>A successful response only indicates that the run request has been accepted. It does not indicate that the collection task is complete.</p>
     * 
     * @param request the request parameters of RunCrawler  RunCrawlerRequest
     * @return RunCrawlerResponse
     */
    @Override
    public CompletableFuture<RunCrawlerResponse> runCrawler(RunCrawlerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunCrawler").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunCrawlerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunCrawlerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li><strong>Make sure that the service-linked role AliyunServiceRoleForDataWorks is created before you call this operation.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of RunImageTest  RunImageTestRequest
     * @return RunImageTestResponse
     */
    @Override
    public CompletableFuture<RunImageTestResponse> runImageTest(RunImageTestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunImageTest").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunImageTestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunImageTestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>Loads a saved semantic job definition by <code>Name</code> and submits a new analysis run to the executor. This operation does not accept runtime overrides for <code>Source</code>, resource groups, or reference files. The execution always uses the configuration saved by <code>CreateSemanticJob</code>.</p>
     * <h2>Pre-execution validation</h2>
     * <p>The service validates the existence and access permissions of the job, and re-validates whether the associated files still exist. For files associated through <code>ReferenceFileIds</code>, the service resolves them into temporary addresses readable by the current run before submission. If a file is deleted after upload or an invalid file ID is specified, the submission fails.</p>
     * <h2>Response and What to do next</h2>
     * <p><code>Data.JobRunId</code> is the identity of the current semantics job run and is used by <code>DownloadSemanticResults</code> to download the exact output of this run. <code>Data.ExecutorJobId</code> is the identity of the executor job and is used by <code>GetSemanticJobDetail</code>, <code>GetSemanticJobLog</code>, and <code>KillSemanticJob</code>. A successful response indicates that the executor has accepted the submission, not that the model analysis or result files are complete.</p>
     * <h2>Billing</h2>
     * <p><strong>Before using this operation, make sure that you fully understand the billing method and pricing of the <a href="https://www.alibabacloud.com/help/en/dataworks/dataworks-data-agent-agent-billing">model calls</a> used by semantic construction.</strong></p>
     * 
     * @param request the request parameters of RunSemanticJob  RunSemanticJobRequest
     * @return RunSemanticJobResponse
     */
    @Override
    public CompletableFuture<RunSemanticJobResponse> runSemanticJob(RunSemanticJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunSemanticJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunSemanticJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunSemanticJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of SetSuccessTaskInstances  SetSuccessTaskInstancesRequest
     * @return SetSuccessTaskInstancesResponse
     */
    @Override
    public CompletableFuture<SetSuccessTaskInstancesResponse> setSuccessTaskInstances(SetSuccessTaskInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetSuccessTaskInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetSuccessTaskInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetSuccessTaskInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of StartDIJob  StartDIJobRequest
     * @return StartDIJobResponse
     */
    @Override
    public CompletableFuture<StartDIJobResponse> startDIJob(StartDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDIJob").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Starts a specified personal development environment (ServerIDE) instance and returns the instance ID.</p>
     * 
     * @param request the request parameters of StartServerIdeInstance  StartServerIdeInstanceRequest
     * @return StartServerIdeInstanceResponse
     */
    @Override
    public CompletableFuture<StartServerIdeInstanceResponse> startServerIdeInstance(StartServerIdeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartServerIdeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartServerIdeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartServerIdeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of StartWorkflowInstances  StartWorkflowInstancesRequest
     * @return StartWorkflowInstancesResponse
     */
    @Override
    public CompletableFuture<StartWorkflowInstancesResponse> startWorkflowInstances(StartWorkflowInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartWorkflowInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartWorkflowInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartWorkflowInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Stops the currently running task of a specified metadata crawler.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Call <code>ListCrawlerRuns</code> to confirm that the crawler has a running task.</li>
     * <li>Call this operation to submit a stop request.</li>
     * <li>Call <code>ListCrawlerRuns</code> again to confirm the final run status.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * <h2>Precautions</h2>
     * <p>The call fails if the crawler has no running task. A successful response only indicates that the stop request has been accepted.</p>
     * 
     * @param request the request parameters of StopCrawler  StopCrawlerRequest
     * @return StopCrawlerResponse
     */
    @Override
    public CompletableFuture<StopCrawlerResponse> stopCrawler(StopCrawlerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopCrawler").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopCrawlerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopCrawlerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of StopDIJob  StopDIJobRequest
     * @return StopDIJobResponse
     */
    @Override
    public CompletableFuture<StopDIJobResponse> stopDIJob(StopDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDIJob").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>Requesters can use this operation to withdraw an approval process they initiated.</li>
     * <li>Only the initiator of the approval process can call this operation.</li>
     * <li>After a successful call, the operation terminates the approval process and updates its status to withdrawn.</li>
     * </ul>
     * 
     * @param request the request parameters of StopProcessInstance  StopProcessInstanceRequest
     * @return StopProcessInstanceResponse
     */
    @Override
    public CompletableFuture<StopProcessInstanceResponse> stopProcessInstance(StopProcessInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopProcessInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopProcessInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopProcessInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Stops a specified personal development environment (ServerIDE) instance and returns the instance ID.</p>
     * 
     * @param request the request parameters of StopServerIdeInstance  StopServerIdeInstanceRequest
     * @return StopServerIdeInstanceResponse
     */
    @Override
    public CompletableFuture<StopServerIdeInstanceResponse> stopServerIdeInstance(StopServerIdeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopServerIdeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopServerIdeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopServerIdeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of StopTaskInstances  StopTaskInstancesRequest
     * @return StopTaskInstancesResponse
     */
    @Override
    public CompletableFuture<StopTaskInstancesResponse> stopTaskInstances(StopTaskInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopTaskInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopTaskInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopTaskInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of StopWorkflowInstances  StopWorkflowInstancesRequest
     * @return StopWorkflowInstancesResponse
     */
    @Override
    public CompletableFuture<StopWorkflowInstancesResponse> stopWorkflowInstances(StopWorkflowInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopWorkflowInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopWorkflowInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopWorkflowInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitBatchChangeTableOwner  SubmitBatchChangeTableOwnerRequest
     * @return SubmitBatchChangeTableOwnerResponse
     */
    @Override
    public CompletableFuture<SubmitBatchChangeTableOwnerResponse> submitBatchChangeTableOwner(SubmitBatchChangeTableOwnerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitBatchChangeTableOwner").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitBatchChangeTableOwnerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitBatchChangeTableOwnerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitFile  SubmitFileRequest
     * @return SubmitFileResponse
     */
    @Override
    public CompletableFuture<SubmitFileResponse> submitFile(SubmitFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SubmitFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of SuspendTaskInstances  SuspendTaskInstancesRequest
     * @return SuspendTaskInstancesResponse
     */
    @Override
    public CompletableFuture<SuspendTaskInstancesResponse> suspendTaskInstances(SuspendTaskInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SuspendTaskInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SuspendTaskInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SuspendTaskInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of TagDataAssets  TagDataAssetsRequest
     * @return TagDataAssetsResponse
     */
    @Override
    public CompletableFuture<TagDataAssetsResponse> tagDataAssets(TagDataAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagDataAssets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagDataAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagDataAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks project space:
     * Tenant Owner, Space Administrator, Deployment, Developer, Project Owner, or O\&amp;M.</li>
     * </ol>
     * 
     * @param request the request parameters of TestDataSourceConnectivity  TestDataSourceConnectivityRequest
     * @return TestDataSourceConnectivityResponse
     */
    @Override
    public CompletableFuture<TestDataSourceConnectivityResponse> testDataSourceConnectivity(TestDataSourceConnectivityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TestDataSourceConnectivity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TestDataSourceConnectivityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TestDataSourceConnectivityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of TriggerSchedulerTaskInstance  TriggerSchedulerTaskInstanceRequest
     * @return TriggerSchedulerTaskInstanceResponse
     */
    @Override
    public CompletableFuture<TriggerSchedulerTaskInstanceResponse> triggerSchedulerTaskInstance(TriggerSchedulerTaskInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TriggerSchedulerTaskInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerSchedulerTaskInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerSchedulerTaskInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available only for DataWorks Enterprise Edition or a more advanced edition.</p>
     * 
     * @param request the request parameters of UnTagDataAssets  UnTagDataAssetsRequest
     * @return UnTagDataAssetsResponse
     */
    @Override
    public CompletableFuture<UnTagDataAssetsResponse> unTagDataAssets(UnTagDataAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnTagDataAssets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnTagDataAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnTagDataAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlertRule  UpdateAlertRuleRequest
     * @return UpdateAlertRuleResponse
     */
    @Override
    public CompletableFuture<UpdateAlertRuleResponse> updateAlertRule(UpdateAlertRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAlertRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlertRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlertRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateBusiness  UpdateBusinessRequest
     * @return UpdateBusinessResponse
     */
    @Override
    public CompletableFuture<UpdateBusinessResponse> updateBusiness(UpdateBusinessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBusiness").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBusinessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBusinessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>This operation requires DataWorks Basic Edition or a later version.</li>
     * <li>This operation supports only MaxCompute, hms, and dlf tables.</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateColumnBusinessMetadata  UpdateColumnBusinessMetadataRequest
     * @return UpdateColumnBusinessMetadataResponse
     */
    @Override
    public CompletableFuture<UpdateColumnBusinessMetadataResponse> updateColumnBusinessMetadata(UpdateColumnBusinessMetadataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateColumnBusinessMetadata").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateColumnBusinessMetadataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateColumnBusinessMetadataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API is currently in trial. To use this API, submit an application. After the administrator adds you to the trial list, you can call this API.</p>
     * 
     * @param request the request parameters of UpdateComponent  UpdateComponentRequest
     * @return UpdateComponentResponse
     */
    @Override
    public CompletableFuture<UpdateComponentResponse> updateComponent(UpdateComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</li>
     * <li>You must have at least one of the following roles in the DataWorks project space:</li>
     * <li>Tenant Owner, tenant administrator, Space Administrator, Project Owner, or O\&amp;M</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateComputeResource  UpdateComputeResourceRequest
     * @return UpdateComputeResourceResponse
     */
    @Override
    public CompletableFuture<UpdateComputeResourceResponse> updateComputeResource(UpdateComputeResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateComputeResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComputeResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComputeResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>DataWorks Basic Edition or a higher edition is required.</li>
     * <li>You must have at least one of the following roles in the DataWorks workspace:</li>
     * <li>Tenant owner, tenant administrator, storage management administrator, project owner, or O&amp;M engineer.</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateComputeResourceAuthUserMappings  UpdateComputeResourceAuthUserMappingsRequest
     * @return UpdateComputeResourceAuthUserMappingsResponse
     */
    @Override
    public CompletableFuture<UpdateComputeResourceAuthUserMappingsResponse> updateComputeResourceAuthUserMappings(UpdateComputeResourceAuthUserMappingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateComputeResourceAuthUserMappings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComputeResourceAuthUserMappingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComputeResourceAuthUserMappingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Partially updates the resource group, collection scope, scheduling, AI metadata description, or extension configurations of a specified metadata crawler.</p>
     * <h2>Recommended workflow</h2>
     * <ol>
     * <li>Call <code>GetCrawler</code> to query the current configurations.</li>
     * <li>Call <code>GetCrawlerTypeCapabilities</code> to check the configuration capabilities supported by the crawler type.</li>
     * <li>Call this operation with only the fields that you want to update.</li>
     * </ol>
     * <h2>Edition requirements</h2>
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * <h2>Precautions</h2>
     * <p>At least one updatable field must be provided. Fields that are not provided remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateCrawler  UpdateCrawlerRequest
     * @return UpdateCrawlerResponse
     */
    @Override
    public CompletableFuture<UpdateCrawlerResponse> updateCrawler(UpdateCrawlerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCrawler").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCrawlerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCrawlerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCustomAttribute  UpdateCustomAttributeRequest
     * @return UpdateCustomAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateCustomAttributeResponse> updateCustomAttribute(UpdateCustomAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDIAlarmRule  UpdateDIAlarmRuleRequest
     * @return UpdateDIAlarmRuleResponse
     */
    @Override
    public CompletableFuture<UpdateDIAlarmRuleResponse> updateDIAlarmRule(UpdateDIAlarmRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDIAlarmRule").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDIAlarmRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDIAlarmRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This feature requires DataWorks Basic Edition or higher.</p>
     * 
     * @param request the request parameters of UpdateDIJob  UpdateDIJobRequest
     * @return UpdateDIJobResponse
     */
    @Override
    public CompletableFuture<UpdateDIJobResponse> updateDIJob(UpdateDIJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDIJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDIJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDIJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Enterprise Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of UpdateDataAssetTag  UpdateDataAssetTagRequest
     * @return UpdateDataAssetTagResponse
     */
    @Override
    public CompletableFuture<UpdateDataAssetTagResponse> updateDataAssetTag(UpdateDataAssetTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataAssetTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataAssetTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataAssetTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of UpdateDataQualityAlertRule  UpdateDataQualityAlertRuleRequest
     * @return UpdateDataQualityAlertRuleResponse
     */
    @Override
    public CompletableFuture<UpdateDataQualityAlertRuleResponse> updateDataQualityAlertRule(UpdateDataQualityAlertRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataQualityAlertRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataQualityAlertRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataQualityAlertRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UpdateDataQualityEvaluationTask is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description DataWorks Basic Edition or above must be purchased to use this operation.
     * 
     * @param request the request parameters of UpdateDataQualityEvaluationTask  UpdateDataQualityEvaluationTaskRequest
     * @return UpdateDataQualityEvaluationTaskResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UpdateDataQualityEvaluationTaskResponse> updateDataQualityEvaluationTask(UpdateDataQualityEvaluationTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataQualityEvaluationTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataQualityEvaluationTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataQualityEvaluationTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UpdateDataQualityRule is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityScan instead.  * @description You must purchase DataWorks Basic Edition or above to use this feature.
     * 
     * @param request the request parameters of UpdateDataQualityRule  UpdateDataQualityRuleRequest
     * @return UpdateDataQualityRuleResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UpdateDataQualityRuleResponse> updateDataQualityRule(UpdateDataQualityRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataQualityRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataQualityRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataQualityRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI UpdateDataQualityRuleTemplate is deprecated, please use dataworks-public::2024-05-18::UpdateDataQualityTemplate instead.  * @description You can call this operation only after you purchase DataWorks Basic Edition or a higher edition.
     * 
     * @param request the request parameters of UpdateDataQualityRuleTemplate  UpdateDataQualityRuleTemplateRequest
     * @return UpdateDataQualityRuleTemplateResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<UpdateDataQualityRuleTemplateResponse> updateDataQualityRuleTemplate(UpdateDataQualityRuleTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataQualityRuleTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataQualityRuleTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataQualityRuleTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of UpdateDataQualityScan  UpdateDataQualityScanRequest
     * @return UpdateDataQualityScanResponse
     */
    @Override
    public CompletableFuture<UpdateDataQualityScanResponse> updateDataQualityScan(UpdateDataQualityScanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataQualityScan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataQualityScanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataQualityScanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a higher edition is required.</p>
     * 
     * @param request the request parameters of UpdateDataQualityTemplate  UpdateDataQualityTemplateRequest
     * @return UpdateDataQualityTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateDataQualityTemplateResponse> updateDataQualityTemplate(UpdateDataQualityTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataQualityTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataQualityTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataQualityTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDataSource  UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     */
    @Override
    public CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataSource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataSourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataSourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDataset  UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    @Override
    public CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataset").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDatasetVersion  UpdateDatasetVersionRequest
     * @return UpdateDatasetVersionResponse
     */
    @Override
    public CompletableFuture<UpdateDatasetVersionResponse> updateDatasetVersion(UpdateDatasetVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDatasetVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDatasetVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDatasetVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFile  UpdateFileRequest
     * @return UpdateFileResponse
     */
    @Override
    public CompletableFuture<UpdateFileResponse> updateFile(UpdateFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFolder  UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    @Override
    public CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFolder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFolderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFolderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateFunction  UpdateFunctionRequest
     * @return UpdateFunctionResponse
     */
    @Override
    public CompletableFuture<UpdateFunctionResponse> updateFunction(UpdateFunctionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFunction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFunctionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFunctionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateIDEEventResult  UpdateIDEEventResultRequest
     * @return UpdateIDEEventResultResponse
     */
    @Override
    public CompletableFuture<UpdateIDEEventResultResponse> updateIDEEventResult(UpdateIDEEventResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIDEEventResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIDEEventResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIDEEventResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Basic Edition or a higher edition to use this operation.</li>
     * <li><strong>Before calling this operation, make sure that the service-linked role AliyunServiceRoleForDataWorks has been created.</strong></li>
     * </ol>
     * 
     * @param request the request parameters of UpdateImage  UpdateImageRequest
     * @return UpdateImageResponse
     */
    @Override
    public CompletableFuture<UpdateImageResponse> updateImage(UpdateImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation allows you to update the configuration of a specified MCP Server, including the service URL, transport protocol, custom request headers, and visibility settings. Fields that are not provided retain their existing values.
     * <strong>Note</strong>: When you modify the <code>Visibility</code> parameter, selectively provide <code>ProjectIds</code> or <code>UserIds</code> in <code>VisibilityScope</code> based on the visibility setting to ensure that the correct access control scope is applied.</p>
     * 
     * @param request the request parameters of UpdateMcpServer  UpdateMcpServerRequest
     * @return UpdateMcpServerResponse
     */
    @Override
    public CompletableFuture<UpdateMcpServerResponse> updateMcpServer(UpdateMcpServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMcpServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMcpServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMcpServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must purchase DataWorks Professional Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateMetaCollection  UpdateMetaCollectionRequest
     * @return UpdateMetaCollectionResponse
     */
    @Override
    public CompletableFuture<UpdateMetaCollectionResponse> updateMetaCollection(UpdateMetaCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMetaCollection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMetaCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMetaCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Professional Edition or a higher edition to use this operation.</p>
     * 
     * @param request the request parameters of UpdateMetaEntity  UpdateMetaEntityRequest
     * @return UpdateMetaEntityResponse
     */
    @Override
    public CompletableFuture<UpdateMetaEntityResponse> updateMetaEntity(UpdateMetaEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMetaEntity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMetaEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMetaEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Professional Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of UpdateMetaEntityDef  UpdateMetaEntityDefRequest
     * @return UpdateMetaEntityDefResponse
     */
    @Override
    public CompletableFuture<UpdateMetaEntityDefResponse> updateMetaEntityDef(UpdateMetaEntityDefRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateMetaEntityDef").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMetaEntityDefResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMetaEntityDefResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateNode  UpdateNodeRequest
     * @return UpdateNodeResponse
     */
    @Override
    public CompletableFuture<UpdateNodeResponse> updateNode(UpdateNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is available only in DataWorks Professional Edition and later.</p>
     * 
     * @param request the request parameters of UpdateParameter  UpdateParameterRequest
     * @return UpdateParameterResponse
     */
    @Override
    public CompletableFuture<UpdateParameterResponse> updateParameter(UpdateParameterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateParameter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateParameterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateParameterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request</h2>
     * <ul>
     * <li>Use this API to modify an existing approval process definition, including its name, description, rule conditions, notification service, and approval nodes.</li>
     * <li>The required <code>Id</code> parameter identifies the approval process definition to update.</li>
     * <li>To overwrite the existing configuration, set the <code>Overwrite</code> parameter to <code>true</code>.</li>
     * <li>The optional <code>ClientToken</code> parameter ensures request idempotency.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateProcessDefinition  UpdateProcessDefinitionRequest
     * @return UpdateProcessDefinitionResponse
     */
    @Override
    public CompletableFuture<UpdateProcessDefinitionResponse> updateProcessDefinition(UpdateProcessDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateProcessDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProcessDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProcessDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This feature requires DataWorks Basic Edition or a later version.</p>
     * 
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    @Override
    public CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateProject").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProjectRole  UpdateProjectRoleRequest
     * @return UpdateProjectRoleResponse
     */
    @Override
    public CompletableFuture<UpdateProjectRoleResponse> updateProjectRole(UpdateProjectRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateProjectRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProjectRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProjectRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can use this API operation only in DataWorks Basic Edition or an advanced edition.</p>
     * 
     * @param request the request parameters of UpdateResourceGroup  UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     */
    @Override
    public CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API operation is available for all DataWorks editions.</p>
     * 
     * @param request the request parameters of UpdateRoute  UpdateRouteRequest
     * @return UpdateRouteResponse
     */
    @Override
    public CompletableFuture<UpdateRouteResponse> updateRoute(UpdateRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage</h2>
     * <ul>
     * <li>Use this API to update a specified security policy, including its name, description, associated workspace IDs, and policy content.</li>
     * <li>You cannot modify some properties of default system policies, such as the schema name and control module.</li>
     * <li>When <code>ControlDwScope</code> is set to <code>Workspace</code>, use the <code>Workspaces</code> parameter to associate the policy with specific workspaces.</li>
     * <li>When updating the policy content (<code>Content</code>), ensure that the provided controllers (<code>Controllers</code>) conform to the requirements of the selected schema.</li>
     * <li>The optional <code>ClientToken</code> parameter ensures request idempotence.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSecurityStrategy  UpdateSecurityStrategyRequest
     * @return UpdateSecurityStrategyResponse
     */
    @Override
    public CompletableFuture<UpdateSecurityStrategyResponse> updateSecurityStrategy(UpdateSecurityStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSecurityStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSecurityStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSecurityStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the configuration of a specified personal development environment (ServerIDE) instance. You can modify the CU, image, instance name, VPC, dataset, and credential configurations. If the CU and image parameters are not specified, the existing instance configurations are retained.</p>
     * 
     * @param request the request parameters of UpdateServerIdeInstance  UpdateServerIdeInstanceRequest
     * @return UpdateServerIdeInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateServerIdeInstanceResponse> updateServerIdeInstance(UpdateServerIdeInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateServerIdeInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServerIdeInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServerIdeInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API allows you to update an existing Skill and create a new version based on the current highest version or a specified version. Fields not provided in the request retain their original values. You can update the Skill content by providing either <code>SkillMdOverride</code> or <code>BundleUrl</code>. You can also set additional information such as the visibility scope.</p>
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

    /**
     * <b>description</b> :
     * <ol>
     * <li>You must have DataWorks Basic Edition or a higher edition to use this feature.</li>
     * </ol>
     * 
     * @param request the request parameters of UpdateTableBusinessMetadata  UpdateTableBusinessMetadataRequest
     * @return UpdateTableBusinessMetadataResponse
     */
    @Override
    public CompletableFuture<UpdateTableBusinessMetadataResponse> updateTableBusinessMetadata(UpdateTableBusinessMetadataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTableBusinessMetadata").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTableBusinessMetadataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTableBusinessMetadataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTask  UpdateTaskRequest
     * @return UpdateTaskResponse
     */
    @Override
    public CompletableFuture<UpdateTaskResponse> updateTask(UpdateTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation updates the information of a specified node, including but not limited to the node name, description, and owner.</li>
     * <li>The changes are synchronized to DataStudio, and DataStudio creates a new saved version.</li>
     * <li>You can set detailed parameters such as the trigger method, runtime environment configuration, and dependencies of the node.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTaskAsync  UpdateTaskAsyncRequest
     * @return UpdateTaskAsyncResponse
     */
    @Override
    public CompletableFuture<UpdateTaskAsyncResponse> updateTaskAsync(UpdateTaskAsyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTaskAsync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTaskAsyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTaskAsyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You must purchase DataWorks Basic Edition or a higher edition to use this feature.</p>
     * 
     * @param request the request parameters of UpdateTaskInstances  UpdateTaskInstancesRequest
     * @return UpdateTaskInstancesResponse
     */
    @Override
    public CompletableFuture<UpdateTaskInstancesResponse> updateTaskInstances(UpdateTaskInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTaskInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTaskInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTaskInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUdfFile  UpdateUdfFileRequest
     * @return UpdateUdfFileResponse
     */
    @Override
    public CompletableFuture<UpdateUdfFileResponse> updateUdfFile(UpdateUdfFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUdfFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUdfFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUdfFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DataWorks Basic Edition or a more advanced edition is required.</p>
     * 
     * @param request the request parameters of UpdateWorkflow  UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     */
    @Override
    public CompletableFuture<UpdateWorkflowResponse> updateWorkflow(UpdateWorkflowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWorkflow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkflowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkflowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This API does not support batch operations. If you define more than one workflow definition in the FlowSpec, all workflow definitions except the first one are ignored. In addition, nodes defined within the workflow definition are also ignored. Call the UpdateNode API to update internal nodes one by one.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateWorkflowDefinition  UpdateWorkflowDefinitionRequest
     * @return UpdateWorkflowDefinitionResponse
     */
    @Override
    public CompletableFuture<UpdateWorkflowDefinitionResponse> updateWorkflowDefinition(UpdateWorkflowDefinitionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateWorkflowDefinition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateWorkflowDefinitionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateWorkflowDefinitionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Scenarios</h2>
     * <p>Requests an upload slot for a reference file to prepare a file for the <code>singleTableFile</code> source of <code>CreateSemanticJob</code>.</p>
     * <h2>Procedure</h2>
     * <ol>
     * <li>Pass the file name, MIME type, and actual size to this operation to obtain <code>Data.UploadUrl</code> and <code>Data.FileId</code>.</li>
     * <li>Perform an HTTP PUT upload with the same <code>Content-Type</code> before the <code>UploadUrl</code> expires.</li>
     * <li>After the upload is complete, use <code>FileId</code> as the only element of <code>CreateSemanticJob.ReferenceFileIds</code>.</li>
     * </ol>
     * <h2>Security considerations</h2>
     * <p><code>UploadUrl</code> is a short-lived pre-signed PUT URL. The holder can write to the corresponding object. Do not log, share, or persist this URL.</p>
     * 
     * @param request the request parameters of UploadSemanticFile  UploadSemanticFileRequest
     * @return UploadSemanticFileResponse
     */
    @Override
    public CompletableFuture<UploadSemanticFileResponse> uploadSemanticFile(UploadSemanticFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadSemanticFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadSemanticFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadSemanticFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
