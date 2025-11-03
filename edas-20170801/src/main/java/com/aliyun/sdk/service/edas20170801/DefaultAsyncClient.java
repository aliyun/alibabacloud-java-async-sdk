// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.edas20170801.models.*;
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
        this.product = "Edas";
        this.version = "2017-08-01";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "edas.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "edas.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "edas.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-chengdu", "edas.aliyuncs.com"),
            new TeaPair("cn-edge-1", "edas.aliyuncs.com"),
            new TeaPair("cn-fujian", "edas.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "edas.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "edas.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "edas.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "edas.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "edas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "edas.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "edas.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "edas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "edas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "edas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "edas.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-wuhan", "edas.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "edas.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "edas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "edas.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "edas.aliyuncs.com"),
            new TeaPair("eu-west-1", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "edas.ap-northeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "edas.ap-northeast-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AbortAndRollbackChangeOrder  AbortAndRollbackChangeOrderRequest
     * @return AbortAndRollbackChangeOrderResponse
     */
    @Override
    public CompletableFuture<AbortAndRollbackChangeOrderResponse> abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AbortAndRollbackChangeOrder").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/changeorder/change_order_abort_and_rollback").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AbortAndRollbackChangeOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AbortAndRollbackChangeOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AbortChangeOrder  AbortChangeOrderRequest
     * @return AbortChangeOrderResponse
     */
    @Override
    public CompletableFuture<AbortChangeOrderResponse> abortChangeOrder(AbortChangeOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AbortChangeOrder").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/changeorder/change_order_abort").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AbortChangeOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AbortChangeOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddLogPath  AddLogPathRequest
     * @return AddLogPathResponse
     */
    @Override
    public CompletableFuture<AddLogPathResponse> addLogPath(AddLogPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddLogPath").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/log/popListLogDirs").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddLogPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddLogPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthorizeApplication  AuthorizeApplicationRequest
     * @return AuthorizeApplicationResponse
     */
    @Override
    public CompletableFuture<AuthorizeApplicationResponse> authorizeApplication(AuthorizeApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuthorizeApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/account/authorize_app").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthorizeResourceGroup  AuthorizeResourceGroupRequest
     * @return AuthorizeResourceGroupResponse
     */
    @Override
    public CompletableFuture<AuthorizeResourceGroupResponse> authorizeResourceGroup(AuthorizeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuthorizeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/account/authorize_res_group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthorizeRole  AuthorizeRoleRequest
     * @return AuthorizeRoleResponse
     */
    @Override
    public CompletableFuture<AuthorizeRoleResponse> authorizeRole(AuthorizeRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuthorizeRole").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/account/authorize_role").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindEcsSlb  BindEcsSlbRequest
     * @return BindEcsSlbResponse
     */
    @Override
    public CompletableFuture<BindEcsSlbResponse> bindEcsSlb(BindEcsSlbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BindEcsSlb").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/app/slb/bind_slb").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindEcsSlbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindEcsSlbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindK8sSlb  BindK8sSlbRequest
     * @return BindK8sSlbResponse
     */
    @Override
    public CompletableFuture<BindK8sSlbResponse> bindK8sSlb(BindK8sSlbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BindK8sSlb").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/acs/k8s_slb_binding").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindK8sSlbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindK8sSlbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindSlb  BindSlbRequest
     * @return BindSlbResponse
     */
    @Override
    public CompletableFuture<BindSlbResponse> bindSlb(BindSlbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BindSlb").setMethod(HttpMethod.POST).setPathRegex("/pop/app/bind_slb_json").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindSlbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindSlbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeDeployGroup  ChangeDeployGroupRequest
     * @return ChangeDeployGroupResponse
     */
    @Override
    public CompletableFuture<ChangeDeployGroupResponse> changeDeployGroup(ChangeDeployGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChangeDeployGroup").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_change_group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeDeployGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeDeployGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ContinuePipeline  ContinuePipelineRequest
     * @return ContinuePipelineResponse
     */
    @Override
    public CompletableFuture<ContinuePipelineResponse> continuePipeline(ContinuePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ContinuePipeline").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/changeorder/pipeline_batch_confirm").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ContinuePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ContinuePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ConvertK8sResource  ConvertK8sResourceRequest
     * @return ConvertK8sResourceResponse
     */
    @Override
    public CompletableFuture<ConvertK8sResourceResponse> convertK8sResource(ConvertK8sResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ConvertK8sResource").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/oam/k8s_resource_convert").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConvertK8sResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConvertK8sResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateApplicationScalingRule  CreateApplicationScalingRuleRequest
     * @return CreateApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<CreateApplicationScalingRuleResponse> createApplicationScalingRule(CreateApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateApplicationScalingRule").setMethod(HttpMethod.POST).setPathRegex("/pop/v1/eam/scale/application_scaling_rule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateConfigTemplate  CreateConfigTemplateRequest
     * @return CreateConfigTemplateResponse
     */
    @Override
    public CompletableFuture<CreateConfigTemplateResponse> createConfigTemplate(CreateConfigTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateConfigTemplate").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/config_template").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateConfigTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateConfigTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>You must call the CreateIDCImportCommand operation first to generate a command used to import hybrid cloud ECS instances to a hybrid cloud ECS cluster. Then, run this command on the instances to import the instances to the cluster.</p>
     * 
     * @param request the request parameters of CreateIDCImportCommand  CreateIDCImportCommandRequest
     * @return CreateIDCImportCommandResponse
     */
    @Override
    public CompletableFuture<CreateIDCImportCommandResponse> createIDCImportCommand(CreateIDCImportCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateIDCImportCommand").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/create_idc_import_command").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIDCImportCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIDCImportCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateK8sConfigMap  CreateK8sConfigMapRequest
     * @return CreateK8sConfigMapResponse
     */
    @Override
    public CompletableFuture<CreateK8sConfigMapResponse> createK8sConfigMap(CreateK8sConfigMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateK8sConfigMap").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/acs/k8s_config_map").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateK8sConfigMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateK8sConfigMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateK8sIngressRule  CreateK8sIngressRuleRequest
     * @return CreateK8sIngressRuleResponse
     */
    @Override
    public CompletableFuture<CreateK8sIngressRuleResponse> createK8sIngressRule(CreateK8sIngressRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateK8sIngressRule").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/acs/k8s_ingress").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateK8sIngressRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateK8sIngressRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateK8sSecret  CreateK8sSecretRequest
     * @return CreateK8sSecretResponse
     */
    @Override
    public CompletableFuture<CreateK8sSecretResponse> createK8sSecret(CreateK8sSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateK8sSecret").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/acs/k8s_secret").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateK8sSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateK8sSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateK8sService  CreateK8sServiceRequest
     * @return CreateK8sServiceResponse
     */
    @Override
    public CompletableFuture<CreateK8sServiceResponse> createK8sService(CreateK8sServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateK8sService").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/acs/k8s_service").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateK8sServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateK8sServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    @Override
    public CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteApplication").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/changeorder/co_delete_app").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteApplicationScalingRule  DeleteApplicationScalingRuleRequest
     * @return DeleteApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<DeleteApplicationScalingRuleResponse> deleteApplicationScalingRule(DeleteApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteApplicationScalingRule").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v1/eam/scale/application_scaling_rule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    @Override
    public CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCluster").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/resource/cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteClusterMember  DeleteClusterMemberRequest
     * @return DeleteClusterMemberResponse
     */
    @Override
    public CompletableFuture<DeleteClusterMemberResponse> deleteClusterMember(DeleteClusterMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteClusterMember").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/resource/cluster_member").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClusterMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClusterMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteConfigTemplate  DeleteConfigTemplateRequest
     * @return DeleteConfigTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteConfigTemplateResponse> deleteConfigTemplate(DeleteConfigTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteConfigTemplate").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/config_template").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteConfigTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteConfigTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDeployGroup  DeleteDeployGroupRequest
     * @return DeleteDeployGroupResponse
     */
    @Override
    public CompletableFuture<DeleteDeployGroupResponse> deleteDeployGroup(DeleteDeployGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDeployGroup").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/deploy_group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeployGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeployGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEcu  DeleteEcuRequest
     * @return DeleteEcuResponse
     */
    @Override
    public CompletableFuture<DeleteEcuResponse> deleteEcu(DeleteEcuRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteEcu").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/resource/delete_ecu").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEcuResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEcuResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteK8sApplication  DeleteK8sApplicationRequest
     * @return DeleteK8sApplicationResponse
     */
    @Override
    public CompletableFuture<DeleteK8sApplicationResponse> deleteK8sApplication(DeleteK8sApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteK8sApplication").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/k8s/acs/k8s_apps").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteK8sApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteK8sApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteK8sConfigMap  DeleteK8sConfigMapRequest
     * @return DeleteK8sConfigMapResponse
     */
    @Override
    public CompletableFuture<DeleteK8sConfigMapResponse> deleteK8sConfigMap(DeleteK8sConfigMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteK8sConfigMap").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/k8s/acs/k8s_config_map").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteK8sConfigMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteK8sConfigMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteK8sIngressRule  DeleteK8sIngressRuleRequest
     * @return DeleteK8sIngressRuleResponse
     */
    @Override
    public CompletableFuture<DeleteK8sIngressRuleResponse> deleteK8sIngressRule(DeleteK8sIngressRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteK8sIngressRule").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/k8s/acs/k8s_ingress").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteK8sIngressRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteK8sIngressRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteK8sSecret  DeleteK8sSecretRequest
     * @return DeleteK8sSecretResponse
     */
    @Override
    public CompletableFuture<DeleteK8sSecretResponse> deleteK8sSecret(DeleteK8sSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteK8sSecret").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/k8s/acs/k8s_secret").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteK8sSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteK8sSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteK8sService  DeleteK8sServiceRequest
     * @return DeleteK8sServiceResponse
     */
    @Override
    public CompletableFuture<DeleteK8sServiceResponse> deleteK8sService(DeleteK8sServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteK8sService").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/k8s/acs/k8s_service").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteK8sServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteK8sServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLogPath  DeleteLogPathRequest
     * @return DeleteLogPathResponse
     */
    @Override
    public CompletableFuture<DeleteLogPathResponse> deleteLogPath(DeleteLogPathRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLogPath").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/log/popListLogDirs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLogPathResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLogPathResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRole  DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    @Override
    public CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRole").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/account/delete_role").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteServiceGroup  DeleteServiceGroupRequest
     * @return DeleteServiceGroupResponse
     */
    @Override
    public CompletableFuture<DeleteServiceGroupResponse> deleteServiceGroup(DeleteServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteServiceGroup").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/service/serviceGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSwimmingLane  DeleteSwimmingLaneRequest
     * @return DeleteSwimmingLaneResponse
     */
    @Override
    public CompletableFuture<DeleteSwimmingLaneResponse> deleteSwimmingLane(DeleteSwimmingLaneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSwimmingLane").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/trafficmgnt/swimming_lanes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSwimmingLaneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSwimmingLaneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUserDefineRegion  DeleteUserDefineRegionRequest
     * @return DeleteUserDefineRegionResponse
     */
    @Override
    public CompletableFuture<DeleteUserDefineRegionResponse> deleteUserDefineRegion(DeleteUserDefineRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteUserDefineRegion").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/user_region_def").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserDefineRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserDefineRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To deploy an application in a Container Service for Kubernetes (ACK) cluster that is imported into Enterprise Distributed Application Service (EDAS), call the DeployK8sApplication operation provided by EDAS. For more information, see <a href="~~149420~~"></a>DeployK8sApplication.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeployApplication  DeployApplicationRequest
     * @return DeployApplicationResponse
     */
    @Override
    public CompletableFuture<DeployApplicationResponse> deployApplication(DeployApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeployApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_deploy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployK8sApplication  DeployK8sApplicationRequest
     * @return DeployK8sApplicationResponse
     */
    @Override
    public CompletableFuture<DeployK8sApplicationResponse> deployK8sApplication(DeployK8sApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeployK8sApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/acs/k8s_apps").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployK8sApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployK8sApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAppInstanceList  DescribeAppInstanceListRequest
     * @return DescribeAppInstanceListResponse
     */
    @Override
    public CompletableFuture<DescribeAppInstanceListResponse> describeAppInstanceList(DescribeAppInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeAppInstanceList").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/oam/app_instance_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAppInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAppInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApplicationScalingRules  DescribeApplicationScalingRulesRequest
     * @return DescribeApplicationScalingRulesResponse
     */
    @Override
    public CompletableFuture<DescribeApplicationScalingRulesResponse> describeApplicationScalingRules(DescribeApplicationScalingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeApplicationScalingRules").setMethod(HttpMethod.GET).setPathRegex("/pop/v1/eam/scale/application_scaling_rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationScalingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationScalingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeLocalitySetting  DescribeLocalitySettingRequest
     * @return DescribeLocalitySettingResponse
     */
    @Override
    public CompletableFuture<DescribeLocalitySettingResponse> describeLocalitySetting(DescribeLocalitySettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeLocalitySetting").setMethod(HttpMethod.GET).setPathRegex("/pop/sp/applications/locality/setting").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLocalitySettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLocalitySettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableApplicationScalingRule  DisableApplicationScalingRuleRequest
     * @return DisableApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<DisableApplicationScalingRuleResponse> disableApplicationScalingRule(DisableApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableApplicationScalingRule").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/eam/scale/disable_application_scaling_rule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableApplicationScalingRule  EnableApplicationScalingRuleRequest
     * @return EnableApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<EnableApplicationScalingRuleResponse> enableApplicationScalingRule(EnableApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableApplicationScalingRule").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/eam/scale/enable_application_scaling_rule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAppDeployment  GetAppDeploymentRequest
     * @return GetAppDeploymentResponse
     */
    @Override
    public CompletableFuture<GetAppDeploymentResponse> getAppDeployment(GetAppDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAppDeployment").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/oam/app_deployment").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAppDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAppDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    @Override
    public CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/app/app_info").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetChangeOrderInfo  GetChangeOrderInfoRequest
     * @return GetChangeOrderInfoResponse
     */
    @Override
    public CompletableFuture<GetChangeOrderInfoResponse> getChangeOrderInfo(GetChangeOrderInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetChangeOrderInfo").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/change_order_info").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetChangeOrderInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetChangeOrderInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCluster  GetClusterRequest
     * @return GetClusterResponse
     */
    @Override
    public CompletableFuture<GetClusterResponse> getCluster(GetClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCluster").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/resource/cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetContainerConfiguration  GetContainerConfigurationRequest
     * @return GetContainerConfigurationResponse
     */
    @Override
    public CompletableFuture<GetContainerConfigurationResponse> getContainerConfiguration(GetContainerConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetContainerConfiguration").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/app/container_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContainerConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContainerConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJavaStartUpConfig  GetJavaStartUpConfigRequest
     * @return GetJavaStartUpConfigResponse
     */
    @Override
    public CompletableFuture<GetJavaStartUpConfigResponse> getJavaStartUpConfig(GetJavaStartUpConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJavaStartUpConfig").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/oam/java_start_up_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJavaStartUpConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJavaStartUpConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJvmConfiguration  GetJvmConfigurationRequest
     * @return GetJvmConfigurationResponse
     */
    @Override
    public CompletableFuture<GetJvmConfigurationResponse> getJvmConfiguration(GetJvmConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJvmConfiguration").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/app/app_jvm_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJvmConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJvmConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetK8sAppPrecheckResult  GetK8sAppPrecheckResultRequest
     * @return GetK8sAppPrecheckResultResponse
     */
    @Override
    public CompletableFuture<GetK8sAppPrecheckResultResponse> getK8sAppPrecheckResult(GetK8sAppPrecheckResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetK8sAppPrecheckResult").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/k8s/app_precheck").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetK8sAppPrecheckResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetK8sAppPrecheckResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetK8sApplication  GetK8sApplicationRequest
     * @return GetK8sApplicationResponse
     */
    @Override
    public CompletableFuture<GetK8sApplicationResponse> getK8sApplication(GetK8sApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetK8sApplication").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/changeorder/co_application").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetK8sApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetK8sApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetK8sCluster  GetK8sClusterRequest
     * @return GetK8sClusterResponse
     */
    @Override
    public CompletableFuture<GetK8sClusterResponse> getK8sCluster(GetK8sClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetK8sCluster").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s_clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetK8sClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetK8sClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetK8sServices  GetK8sServicesRequest
     * @return GetK8sServicesResponse
     */
    @Override
    public CompletableFuture<GetK8sServicesResponse> getK8sServices(GetK8sServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetK8sServices").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/k8s/acs/k8s_service").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetK8sServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetK8sServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPackageStorageCredential  GetPackageStorageCredentialRequest
     * @return GetPackageStorageCredentialResponse
     */
    @Override
    public CompletableFuture<GetPackageStorageCredentialResponse> getPackageStorageCredential(GetPackageStorageCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPackageStorageCredential").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/package_storage_credential").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPackageStorageCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPackageStorageCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetScalingRules  GetScalingRulesRequest
     * @return GetScalingRulesResponse
     */
    @Override
    public CompletableFuture<GetScalingRulesResponse> getScalingRules(GetScalingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetScalingRules").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/app/scalingRules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetScalingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetScalingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSecureToken  GetSecureTokenRequest
     * @return GetSecureTokenResponse
     */
    @Override
    public CompletableFuture<GetSecureTokenResponse> getSecureToken(GetSecureTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSecureToken").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/secure_token").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSecureTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSecureTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceConsumersPage  GetServiceConsumersPageRequest
     * @return GetServiceConsumersPageResponse
     */
    @Override
    public CompletableFuture<GetServiceConsumersPageResponse> getServiceConsumersPage(GetServiceConsumersPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceConsumersPage").setMethod(HttpMethod.POST).setPathRegex("/pop/sp/api/mseForOam/getServiceConsumersPage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceConsumersPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceConsumersPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceDetail  GetServiceDetailRequest
     * @return GetServiceDetailResponse
     */
    @Override
    public CompletableFuture<GetServiceDetailResponse> getServiceDetail(GetServiceDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceDetail").setMethod(HttpMethod.POST).setPathRegex("/pop/sp/api/mseForOam/getServiceDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceListPage  GetServiceListPageRequest
     * @return GetServiceListPageResponse
     */
    @Override
    public CompletableFuture<GetServiceListPageResponse> getServiceListPage(GetServiceListPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceListPage").setMethod(HttpMethod.POST).setPathRegex("/pop/sp/api/mseForOam/getServiceListPage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceListPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceListPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceMethodPage  GetServiceMethodPageRequest
     * @return GetServiceMethodPageResponse
     */
    @Override
    public CompletableFuture<GetServiceMethodPageResponse> getServiceMethodPage(GetServiceMethodPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceMethodPage").setMethod(HttpMethod.POST).setPathRegex("/pop/sp/api/mseForOam/getServiceMethodPage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceMethodPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceMethodPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceProvidersPage  GetServiceProvidersPageRequest
     * @return GetServiceProvidersPageResponse
     */
    @Override
    public CompletableFuture<GetServiceProvidersPageResponse> getServiceProvidersPage(GetServiceProvidersPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceProvidersPage").setMethod(HttpMethod.POST).setPathRegex("/pop/sp/api/mseForOam/getServiceProvidersPage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceProvidersPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceProvidersPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>**</p>
     * 
     * @param request the request parameters of GetWebContainerConfig  GetWebContainerConfigRequest
     * @return GetWebContainerConfigResponse
     */
    @Override
    public CompletableFuture<GetWebContainerConfigResponse> getWebContainerConfig(GetWebContainerConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetWebContainerConfig").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/oam/web_container_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWebContainerConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWebContainerConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportK8sCluster  ImportK8sClusterRequest
     * @return ImportK8sClusterResponse
     */
    @Override
    public CompletableFuture<ImportK8sClusterResponse> importK8sCluster(ImportK8sClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ImportK8sCluster").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/import_k8s_cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportK8sClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportK8sClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To create an application in a Kubernetes cluster, call the InsertK8sApplication operation provided by Enterprise Distributed Application Service (EDAS).</p>
     * </blockquote>
     * 
     * @param request the request parameters of InsertApplication  InsertApplicationRequest
     * @return InsertApplicationResponse
     */
    @Override
    public CompletableFuture<InsertApplicationResponse> insertApplication(InsertApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_create_app").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertCluster  InsertClusterRequest
     * @return InsertClusterResponse
     */
    @Override
    public CompletableFuture<InsertClusterResponse> insertCluster(InsertClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertCluster").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/resource/cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>If you call this operation to import an ECS instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all original data of the ECS instance is deleted. In addition, you must set a logon password for the ECS instance. Make sure that no important data exists on the ECS instance that you want to import or data has been backed up for the ECS instance.</p>
     * <blockquote>
     * <p>We recommend that you call the InstallAgent operation instead of this operation. For more information, see <a href="https://help.aliyun.com/document_detail/127023.html">InstallAgent</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of InsertClusterMember  InsertClusterMemberRequest
     * @return InsertClusterMemberResponse
     */
    @Override
    public CompletableFuture<InsertClusterMemberResponse> insertClusterMember(InsertClusterMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertClusterMember").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/resource/cluster_member").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertClusterMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertClusterMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertDeployGroup  InsertDeployGroupRequest
     * @return InsertDeployGroupResponse
     */
    @Override
    public CompletableFuture<InsertDeployGroupResponse> insertDeployGroup(InsertDeployGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertDeployGroup").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/deploy_group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertDeployGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertDeployGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertK8sApplication  InsertK8sApplicationRequest
     * @return InsertK8sApplicationResponse
     */
    @Override
    public CompletableFuture<InsertK8sApplicationResponse> insertK8sApplication(InsertK8sApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertK8sApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/acs/create_k8s_app").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertK8sApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertK8sApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertOrUpdateRegion  InsertOrUpdateRegionRequest
     * @return InsertOrUpdateRegionResponse
     */
    @Override
    public CompletableFuture<InsertOrUpdateRegionResponse> insertOrUpdateRegion(InsertOrUpdateRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertOrUpdateRegion").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/user_region_def").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertOrUpdateRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertOrUpdateRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertRole  InsertRoleRequest
     * @return InsertRoleResponse
     */
    @Override
    public CompletableFuture<InsertRoleResponse> insertRole(InsertRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertRole").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/account/create_role").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertServiceGroup  InsertServiceGroupRequest
     * @return InsertServiceGroupResponse
     */
    @Override
    public CompletableFuture<InsertServiceGroupResponse> insertServiceGroup(InsertServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertServiceGroup").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/service/serviceGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertSwimmingLane  InsertSwimmingLaneRequest
     * @return InsertSwimmingLaneResponse
     */
    @Override
    public CompletableFuture<InsertSwimmingLaneResponse> insertSwimmingLane(InsertSwimmingLaneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertSwimmingLane").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/trafficmgnt/swimming_lanes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertSwimmingLaneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertSwimmingLaneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsertSwimmingLaneGroup  InsertSwimmingLaneGroupRequest
     * @return InsertSwimmingLaneGroupResponse
     */
    @Override
    public CompletableFuture<InsertSwimmingLaneGroupResponse> insertSwimmingLaneGroup(InsertSwimmingLaneGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsertSwimmingLaneGroup").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/trafficmgnt/swimming_lane_groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsertSwimmingLaneGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsertSwimmingLaneGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation to import an ECS instance into EDAS, the operating system of the ECS instance is not reinstalled. We recommend that you call this operation to import ECS instances into EDAS.</p>
     * 
     * @param request the request parameters of InstallAgent  InstallAgentRequest
     * @return InstallAgentResponse
     */
    @Override
    public CompletableFuture<InstallAgentResponse> installAgent(InstallAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallAgent").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/ecss/install_agent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAliyunRegion  ListAliyunRegionRequest
     * @return ListAliyunRegionResponse
     */
    @Override
    public CompletableFuture<ListAliyunRegionResponse> listAliyunRegion(ListAliyunRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAliyunRegion").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/resource/region_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAliyunRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAliyunRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplication  ListApplicationRequest
     * @return ListApplicationResponse
     */
    @Override
    public CompletableFuture<ListApplicationResponse> listApplication(ListApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/app/app_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplicationEcu  ListApplicationEcuRequest
     * @return ListApplicationEcuResponse
     */
    @Override
    public CompletableFuture<ListApplicationEcuResponse> listApplicationEcu(ListApplicationEcuRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApplicationEcu").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/resource/ecu_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationEcuResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationEcuResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAuthority  ListAuthorityRequest
     * @return ListAuthorityResponse
     */
    @Override
    public CompletableFuture<ListAuthorityResponse> listAuthority(ListAuthorityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAuthority").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/account/authority_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuthorityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuthorityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBuildPack  ListBuildPackRequest
     * @return ListBuildPackResponse
     */
    @Override
    public CompletableFuture<ListBuildPackResponse> listBuildPack(ListBuildPackRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListBuildPack").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/app/build_pack_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBuildPackResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBuildPackResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListCluster  ListClusterRequest
     * @return ListClusterResponse
     */
    @Override
    public CompletableFuture<ListClusterResponse> listCluster(ListClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCluster").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/resource/cluster_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterMembers  ListClusterMembersRequest
     * @return ListClusterMembersResponse
     */
    @Override
    public CompletableFuture<ListClusterMembersResponse> listClusterMembers(ListClusterMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusterMembers").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/resource/cluster_member_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListComponents  ListComponentsRequest
     * @return ListComponentsResponse
     */
    @Override
    public CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListComponents").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/resource/components").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComponentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComponentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConfigTemplates  ListConfigTemplatesRequest
     * @return ListConfigTemplatesResponse
     */
    @Override
    public CompletableFuture<ListConfigTemplatesResponse> listConfigTemplates(ListConfigTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConfigTemplates").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/config_template").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConfigTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConfigTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConsumedServices  ListConsumedServicesRequest
     * @return ListConsumedServicesResponse
     */
    @Override
    public CompletableFuture<ListConsumedServicesResponse> listConsumedServices(ListConsumedServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConsumedServices").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/service/listConsumedServices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConsumedServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConsumedServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConvertableEcu  ListConvertableEcuRequest
     * @return ListConvertableEcuResponse
     */
    @Override
    public CompletableFuture<ListConvertableEcuResponse> listConvertableEcu(ListConvertableEcuRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListConvertableEcu").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/resource/convertable_ecu_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConvertableEcuResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConvertableEcuResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeployGroup  ListDeployGroupRequest
     * @return ListDeployGroupResponse
     */
    @Override
    public CompletableFuture<ListDeployGroupResponse> listDeployGroup(ListDeployGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDeployGroup").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/app/deploy_group_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeployGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeployGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEcsNotInCluster  ListEcsNotInClusterRequest
     * @return ListEcsNotInClusterResponse
     */
    @Override
    public CompletableFuture<ListEcsNotInClusterResponse> listEcsNotInCluster(ListEcsNotInClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEcsNotInCluster").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/resource/ecs_not_in_cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEcsNotInClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEcsNotInClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Terms</h2>
     * <ul>
     * <li><strong>Namespace</strong>: the logical concept that is used to isolate resources such as clusters, ECS instances, and applications, and microservices published in EDAS. This concept involves the default namespace and custom namespaces. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources and microservices.</li>
     * <li><strong>Elastic compute unit (ECU)</strong>: After an ECS instance is imported to a cluster, the instance becomes an ECU.</li>
     * <li><strong>Elastic compute container (ECC)</strong>: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.</li>
     * </ul>
     * 
     * @param request the request parameters of ListEcuByRegion  ListEcuByRegionRequest
     * @return ListEcuByRegionResponse
     */
    @Override
    public CompletableFuture<ListEcuByRegionResponse> listEcuByRegion(ListEcuByRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEcuByRegion").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/resource/ecu_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEcuByRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEcuByRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHistoryDeployVersion  ListHistoryDeployVersionRequest
     * @return ListHistoryDeployVersionResponse
     */
    @Override
    public CompletableFuture<ListHistoryDeployVersionResponse> listHistoryDeployVersion(ListHistoryDeployVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListHistoryDeployVersion").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/app/deploy_history_version_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHistoryDeployVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHistoryDeployVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListK8sConfigMaps  ListK8sConfigMapsRequest
     * @return ListK8sConfigMapsResponse
     */
    @Override
    public CompletableFuture<ListK8sConfigMapsResponse> listK8sConfigMaps(ListK8sConfigMapsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListK8sConfigMaps").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/k8s/acs/k8s_config_map").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListK8sConfigMapsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListK8sConfigMapsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListK8sIngressRules  ListK8sIngressRulesRequest
     * @return ListK8sIngressRulesResponse
     */
    @Override
    public CompletableFuture<ListK8sIngressRulesResponse> listK8sIngressRules(ListK8sIngressRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListK8sIngressRules").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/k8s/acs/k8s_ingress").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListK8sIngressRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListK8sIngressRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListK8sNamespaces  ListK8sNamespacesRequest
     * @return ListK8sNamespacesResponse
     */
    @Override
    public CompletableFuture<ListK8sNamespacesResponse> listK8sNamespaces(ListK8sNamespacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListK8sNamespaces").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/k8s/acs/k8s_namespace").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListK8sNamespacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListK8sNamespacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListK8sSecrets  ListK8sSecretsRequest
     * @return ListK8sSecretsResponse
     */
    @Override
    public CompletableFuture<ListK8sSecretsResponse> listK8sSecrets(ListK8sSecretsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListK8sSecrets").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/k8s/acs/k8s_secret").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListK8sSecretsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListK8sSecretsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMethods  ListMethodsRequest
     * @return ListMethodsResponse
     */
    @Override
    public CompletableFuture<ListMethodsResponse> listMethods(ListMethodsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMethods").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/service/list_methods").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMethodsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMethodsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPublishedServices  ListPublishedServicesRequest
     * @return ListPublishedServicesResponse
     */
    @Override
    public CompletableFuture<ListPublishedServicesResponse> listPublishedServices(ListPublishedServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPublishedServices").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/service/listPublishedServices").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublishedServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublishedServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRecentChangeOrder  ListRecentChangeOrderRequest
     * @return ListRecentChangeOrderResponse
     */
    @Override
    public CompletableFuture<ListRecentChangeOrderResponse> listRecentChangeOrder(ListRecentChangeOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRecentChangeOrder").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/change_order_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRecentChangeOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRecentChangeOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListResourceGroup  ListResourceGroupRequest
     * @return ListResourceGroupResponse
     */
    @Override
    public CompletableFuture<ListResourceGroupResponse> listResourceGroup(ListResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/resource/reg_group_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRole  ListRoleRequest
     * @return ListRoleResponse
     */
    @Override
    public CompletableFuture<ListRoleResponse> listRole(ListRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRole").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/account/role_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Terms</h2>
     * <ul>
     * <li><strong>Namespace</strong>: the logical concept that is used to isolate resources such as clusters, ECS instances, and applications, and microservices published in EDAS. This concept involves the default namespace and custom namespaces. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources and microservices.</li>
     * <li><strong>Elastic compute unit (ECU)</strong>: After an ECS instance is imported to a cluster, the instance becomes an ECU.</li>
     * <li><strong>Elastic compute container (ECC)</strong>: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.</li>
     * </ul>
     * 
     * @param request the request parameters of ListScaleOutEcu  ListScaleOutEcuRequest
     * @return ListScaleOutEcuResponse
     */
    @Override
    public CompletableFuture<ListScaleOutEcuResponse> listScaleOutEcu(ListScaleOutEcuRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListScaleOutEcu").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/resource/scale_out_ecu_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListScaleOutEcuResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListScaleOutEcuResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceGroups  ListServiceGroupsRequest
     * @return ListServiceGroupsResponse
     */
    @Override
    public CompletableFuture<ListServiceGroupsResponse> listServiceGroups(ListServiceGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServiceGroups").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/service/serviceGroups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSlb  ListSlbRequest
     * @return ListSlbResponse
     */
    @Override
    public CompletableFuture<ListSlbResponse> listSlb(ListSlbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSlb").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/slb_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSlbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSlbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubAccount  ListSubAccountRequest
     * @return ListSubAccountResponse
     */
    @Override
    public CompletableFuture<ListSubAccountResponse> listSubAccount(ListSubAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSubAccount").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/account/sub_account_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSwimmingLane  ListSwimmingLaneRequest
     * @return ListSwimmingLaneResponse
     */
    @Override
    public CompletableFuture<ListSwimmingLaneResponse> listSwimmingLane(ListSwimmingLaneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSwimmingLane").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/trafficmgnt/swimming_lanes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSwimmingLaneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSwimmingLaneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSwimmingLaneGroup  ListSwimmingLaneGroupRequest
     * @return ListSwimmingLaneGroupResponse
     */
    @Override
    public CompletableFuture<ListSwimmingLaneGroupResponse> listSwimmingLaneGroup(ListSwimmingLaneGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSwimmingLaneGroup").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/trafficmgnt/swimming_lane_groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSwimmingLaneGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSwimmingLaneGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTagResources").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/tag/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserDefineRegion  ListUserDefineRegionRequest
     * @return ListUserDefineRegionResponse
     */
    @Override
    public CompletableFuture<ListUserDefineRegionResponse> listUserDefineRegion(ListUserDefineRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserDefineRegion").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/user_region_defs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserDefineRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserDefineRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpc  ListVpcRequest
     * @return ListVpcResponse
     */
    @Override
    public CompletableFuture<ListVpcResponse> listVpc(ListVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVpc").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/vpc_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>We recommend that you do not call this operation. Instead, we recommend that you call the TransformClusterMember operation. For more information, see <a href="https://help.aliyun.com/document_detail/71514.html">TransformClusterMember</a>.
     * When you call this operation to import an Elastic Compute Service (ECS) instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all data of the ECS instance is deleted. You must set a logon password for the ECS instance. Make sure that no important data exists on or data has been backed up for the ECS instance that you want to import.</p>
     * <h2>Terms</h2>
     * <ul>
     * <li><strong>Namespace</strong>: the logical concept that is used to isolate resources and microservices in Enterprise Distributed Application Service (EDAS). The resources include clusters, ECS instances, and applications. You can use a default or custom namespace. Each region has a default namespace and supports multiple custom namespaces. By default, only the default namespace is available. You do not need to create a custom namespace if you do not want to isolate resources or microservices.</li>
     * <li><strong>ECU</strong>: After an ECS instance is imported to a cluster, the instance becomes an ECU.</li>
     * <li><strong>Elastic compute container (ECC)</strong>: After you deploy an application to an ECU in a cluster, the ECU becomes an ECC.</li>
     * </ul>
     * 
     * @param request the request parameters of MigrateEcu  MigrateEcuRequest
     * @return MigrateEcuResponse
     */
    @Override
    public CompletableFuture<MigrateEcuResponse> migrateEcu(MigrateEcuRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MigrateEcu").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/resource/migrate_ecu").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateEcuResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateEcuResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyScalingRule  ModifyScalingRuleRequest
     * @return ModifyScalingRuleResponse
     */
    @Override
    public CompletableFuture<ModifyScalingRuleResponse> modifyScalingRule(ModifyScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyScalingRule").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/app/scaling_rules").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryApplicationStatus  QueryApplicationStatusRequest
     * @return QueryApplicationStatusResponse
     */
    @Override
    public CompletableFuture<QueryApplicationStatusResponse> queryApplicationStatus(QueryApplicationStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryApplicationStatus").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/app/app_status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryApplicationStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryApplicationStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEccInfo  QueryEccInfoRequest
     * @return QueryEccInfoResponse
     */
    @Override
    public CompletableFuture<QueryEccInfoResponse> queryEccInfo(QueryEccInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryEccInfo").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/ecc").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEccInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEccInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMigrateEcuList  QueryMigrateEcuListRequest
     * @return QueryMigrateEcuListResponse
     */
    @Override
    public CompletableFuture<QueryMigrateEcuListResponse> queryMigrateEcuList(QueryMigrateEcuListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryMigrateEcuList").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/resource/migrate_ecu_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMigrateEcuListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMigrateEcuListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryMigrateRegionList  QueryMigrateRegionListRequest
     * @return QueryMigrateRegionListResponse
     */
    @Override
    public CompletableFuture<QueryMigrateRegionListResponse> queryMigrateRegionList(QueryMigrateRegionListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryMigrateRegionList").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/resource/migrate_region_select").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMigrateRegionListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMigrateRegionListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryRegionConfig  QueryRegionConfigRequest
     * @return QueryRegionConfigResponse
     */
    @Override
    public CompletableFuture<QueryRegionConfigResponse> queryRegionConfig(QueryRegionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryRegionConfig").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/region_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryRegionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryRegionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySlsLogStoreList  QuerySlsLogStoreListRequest
     * @return QuerySlsLogStoreListResponse
     */
    @Override
    public CompletableFuture<QuerySlsLogStoreListResponse> querySlsLogStoreList(QuerySlsLogStoreListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QuerySlsLogStoreList").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/k8s/sls/query_sls_log_store_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySlsLogStoreListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySlsLogStoreListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetApplication  ResetApplicationRequest
     * @return ResetApplicationResponse
     */
    @Override
    public CompletableFuture<ResetApplicationResponse> resetApplication(ResetApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResetApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_reset").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartApplication  RestartApplicationRequest
     * @return RestartApplicationResponse
     */
    @Override
    public CompletableFuture<RestartApplicationResponse> restartApplication(RestartApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_restart").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RestartK8sApplication  RestartK8sApplicationRequest
     * @return RestartK8sApplicationResponse
     */
    @Override
    public CompletableFuture<RestartK8sApplicationResponse> restartK8sApplication(RestartK8sApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RestartK8sApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/acs/restart_k8s_app").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartK8sApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartK8sApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetryChangeOrderTask  RetryChangeOrderTaskRequest
     * @return RetryChangeOrderTaskResponse
     */
    @Override
    public CompletableFuture<RetryChangeOrderTaskResponse> retryChangeOrderTask(RetryChangeOrderTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetryChangeOrderTask").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/changeorder/task_retry").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryChangeOrderTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryChangeOrderTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RollbackApplication  RollbackApplicationRequest
     * @return RollbackApplicationResponse
     */
    @Override
    public CompletableFuture<RollbackApplicationResponse> rollbackApplication(RollbackApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RollbackApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_rollback").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RollbackChangeOrder  RollbackChangeOrderRequest
     * @return RollbackChangeOrderResponse
     */
    @Override
    public CompletableFuture<RollbackChangeOrderResponse> rollbackChangeOrder(RollbackChangeOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RollbackChangeOrder").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/oam/changeorder/rollback").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackChangeOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackChangeOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ScaleInApplication  ScaleInApplicationRequest
     * @return ScaleInApplicationResponse
     */
    @Override
    public CompletableFuture<ScaleInApplicationResponse> scaleInApplication(ScaleInApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScaleInApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_scale_in").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleInApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleInApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ScaleK8sApplication  ScaleK8sApplicationRequest
     * @return ScaleK8sApplicationResponse
     */
    @Override
    public CompletableFuture<ScaleK8sApplicationResponse> scaleK8sApplication(ScaleK8sApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScaleK8sApplication").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/k8s/acs/k8s_apps").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleK8sApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleK8sApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ScaleOutApplication  ScaleOutApplicationRequest
     * @return ScaleOutApplicationResponse
     */
    @Override
    public CompletableFuture<ScaleOutApplicationResponse> scaleOutApplication(ScaleOutApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScaleOutApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_scale_out").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleOutApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleOutApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>Assume that the auto scaling feature is configured and enabled for an application. When an auto scale-in is triggered for the application, the ECS instances that are purchased by calling this operation are removed first.</p>
     * 
     * @param request the request parameters of ScaleoutApplicationWithNewInstances  ScaleoutApplicationWithNewInstancesRequest
     * @return ScaleoutApplicationWithNewInstancesResponse
     */
    @Override
    public CompletableFuture<ScaleoutApplicationWithNewInstancesResponse> scaleoutApplicationWithNewInstances(ScaleoutApplicationWithNewInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScaleoutApplicationWithNewInstances").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/scaling/scale_out").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleoutApplicationWithNewInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleoutApplicationWithNewInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartApplication  StartApplicationRequest
     * @return StartApplicationResponse
     */
    @Override
    public CompletableFuture<StartApplicationResponse> startApplication(StartApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartK8sAppPrecheck  StartK8sAppPrecheckRequest
     * @return StartK8sAppPrecheckResponse
     */
    @Override
    public CompletableFuture<StartK8sAppPrecheckResponse> startK8sAppPrecheck(StartK8sAppPrecheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartK8sAppPrecheck").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/app_precheck").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartK8sAppPrecheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartK8sAppPrecheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartK8sApplication  StartK8sApplicationRequest
     * @return StartK8sApplicationResponse
     */
    @Override
    public CompletableFuture<StartK8sApplicationResponse> startK8sApplication(StartK8sApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartK8sApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/acs/start_k8s_app").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartK8sApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartK8sApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopApplication  StopApplicationRequest
     * @return StopApplicationResponse
     */
    @Override
    public CompletableFuture<StopApplicationResponse> stopApplication(StopApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopK8sApplication  StopK8sApplicationRequest
     * @return StopK8sApplicationResponse
     */
    @Override
    public CompletableFuture<StopK8sApplicationResponse> stopK8sApplication(StopK8sApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopK8sApplication").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/acs/stop_k8s_app").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopK8sApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopK8sApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To call the SwitchAdvancedMonitoring operation, you must make sure that the version of Enterprise Distributed Application Service (EDAS) SDK for Java or Python is 3.15.2 or later.</p>
     * 
     * @param request the request parameters of SwitchAdvancedMonitoring  SwitchAdvancedMonitoringRequest
     * @return SwitchAdvancedMonitoringResponse
     */
    @Override
    public CompletableFuture<SwitchAdvancedMonitoringResponse> switchAdvancedMonitoring(SwitchAdvancedMonitoringRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SwitchAdvancedMonitoring").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/monitor/advancedMonitorInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchAdvancedMonitoringResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchAdvancedMonitoringResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation to synchronize ECS resource information, all instance data is synchronized from ECS. If you have more than 100 ECS instances, we recommend that you do not frequently call this operation.</p>
     * 
     * @param request the request parameters of SynchronizeResource  SynchronizeResourceRequest
     * @return SynchronizeResourceResponse
     */
    @Override
    public CompletableFuture<SynchronizeResourceResponse> synchronizeResource(SynchronizeResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SynchronizeResource").setMethod(HttpMethod.GET).setPathRegex("/pop/v5/resource/pop_sync_resource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SynchronizeResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SynchronizeResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/tag/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>When you call this operation to import an ECS instance, the operating system of the ECS instance is reinstalled. After the operating system is reinstalled, all data of the ECS instance is deleted. You must set a logon password for the ECS instance. Make sure that no important data exists on or data has been backed up for the ECS instance that you want to import.</p>
     * 
     * @param request the request parameters of TransformClusterMember  TransformClusterMemberRequest
     * @return TransformClusterMemberResponse
     */
    @Override
    public CompletableFuture<TransformClusterMemberResponse> transformClusterMember(TransformClusterMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TransformClusterMember").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/resource/transform_cluster_member").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransformClusterMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransformClusterMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindK8sSlb  UnbindK8sSlbRequest
     * @return UnbindK8sSlbResponse
     */
    @Override
    public CompletableFuture<UnbindK8sSlbResponse> unbindK8sSlb(UnbindK8sSlbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnbindK8sSlb").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/k8s/acs/k8s_slb_binding").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindK8sSlbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindK8sSlbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindSlb  UnbindSlbRequest
     * @return UnbindSlbResponse
     */
    @Override
    public CompletableFuture<UnbindSlbResponse> unbindSlb(UnbindSlbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnbindSlb").setMethod(HttpMethod.POST).setPathRegex("/pop/app/unbind_slb_json").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindSlbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindSlbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UntagResources").setMethod(HttpMethod.DELETE).setPathRegex("/pop/v5/tag/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAccountInfo  UpdateAccountInfoRequest
     * @return UpdateAccountInfoResponse
     */
    @Override
    public CompletableFuture<UpdateAccountInfoResponse> updateAccountInfo(UpdateAccountInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAccountInfo").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/account/edit_account_info").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAccountInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAccountInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApplicationBaseInfo  UpdateApplicationBaseInfoRequest
     * @return UpdateApplicationBaseInfoResponse
     */
    @Override
    public CompletableFuture<UpdateApplicationBaseInfoResponse> updateApplicationBaseInfo(UpdateApplicationBaseInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateApplicationBaseInfo").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/app/update_app_info").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationBaseInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationBaseInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApplicationScalingRule  UpdateApplicationScalingRuleRequest
     * @return UpdateApplicationScalingRuleResponse
     */
    @Override
    public CompletableFuture<UpdateApplicationScalingRuleResponse> updateApplicationScalingRule(UpdateApplicationScalingRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateApplicationScalingRule").setMethod(HttpMethod.PUT).setPathRegex("/pop/v1/eam/scale/application_scaling_rule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationScalingRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationScalingRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateConfigTemplate  UpdateConfigTemplateRequest
     * @return UpdateConfigTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateConfigTemplateResponse> updateConfigTemplate(UpdateConfigTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateConfigTemplate").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/config_template").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateConfigTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateConfigTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateContainer  UpdateContainerRequest
     * @return UpdateContainerResponse
     */
    @Override
    public CompletableFuture<UpdateContainerResponse> updateContainer(UpdateContainerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateContainer").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/changeorder/co_update_container").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContainerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContainerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateContainerConfiguration  UpdateContainerConfigurationRequest
     * @return UpdateContainerConfigurationResponse
     */
    @Override
    public CompletableFuture<UpdateContainerConfigurationResponse> updateContainerConfiguration(UpdateContainerConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateContainerConfiguration").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/app/container_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContainerConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContainerConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHealthCheckUrl  UpdateHealthCheckUrlRequest
     * @return UpdateHealthCheckUrlResponse
     */
    @Override
    public CompletableFuture<UpdateHealthCheckUrlResponse> updateHealthCheckUrl(UpdateHealthCheckUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHealthCheckUrl").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/app/modify_hc_url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHealthCheckUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHealthCheckUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHookConfiguration  UpdateHookConfigurationRequest
     * @return UpdateHookConfigurationResponse
     */
    @Override
    public CompletableFuture<UpdateHookConfigurationResponse> updateHookConfiguration(UpdateHookConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateHookConfiguration").setMethod(HttpMethod.POST).setPathRegex("/pop/app/config_app_hook_json").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHookConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHookConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateJvmConfiguration  UpdateJvmConfigurationRequest
     * @return UpdateJvmConfigurationResponse
     */
    @Override
    public CompletableFuture<UpdateJvmConfigurationResponse> updateJvmConfiguration(UpdateJvmConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateJvmConfiguration").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/app/app_jvm_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateJvmConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateJvmConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateK8sApplicationBaseInfo  UpdateK8sApplicationBaseInfoRequest
     * @return UpdateK8sApplicationBaseInfoResponse
     */
    @Override
    public CompletableFuture<UpdateK8sApplicationBaseInfoResponse> updateK8sApplicationBaseInfo(UpdateK8sApplicationBaseInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateK8sApplicationBaseInfo").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/oam/update_app_basic_info").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateK8sApplicationBaseInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateK8sApplicationBaseInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateK8sApplicationConfig  UpdateK8sApplicationConfigRequest
     * @return UpdateK8sApplicationConfigResponse
     */
    @Override
    public CompletableFuture<UpdateK8sApplicationConfigResponse> updateK8sApplicationConfig(UpdateK8sApplicationConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateK8sApplicationConfig").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/k8s/acs/k8s_app_configuration").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateK8sApplicationConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateK8sApplicationConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateK8sConfigMap  UpdateK8sConfigMapRequest
     * @return UpdateK8sConfigMapResponse
     */
    @Override
    public CompletableFuture<UpdateK8sConfigMapResponse> updateK8sConfigMap(UpdateK8sConfigMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateK8sConfigMap").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/k8s/acs/k8s_config_map").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateK8sConfigMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateK8sConfigMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateK8sIngressRule  UpdateK8sIngressRuleRequest
     * @return UpdateK8sIngressRuleResponse
     */
    @Override
    public CompletableFuture<UpdateK8sIngressRuleResponse> updateK8sIngressRule(UpdateK8sIngressRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateK8sIngressRule").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/k8s/acs/k8s_ingress").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateK8sIngressRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateK8sIngressRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can update only Deployments.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateK8sResource  UpdateK8sResourceRequest
     * @return UpdateK8sResourceResponse
     */
    @Override
    public CompletableFuture<UpdateK8sResourceResponse> updateK8sResource(UpdateK8sResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateK8sResource").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/oam/update_k8s_resource_config").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateK8sResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateK8sResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateK8sSecret  UpdateK8sSecretRequest
     * @return UpdateK8sSecretResponse
     */
    @Override
    public CompletableFuture<UpdateK8sSecretResponse> updateK8sSecret(UpdateK8sSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateK8sSecret").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/k8s/acs/k8s_secret").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateK8sSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateK8sSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateK8sService  UpdateK8sServiceRequest
     * @return UpdateK8sServiceResponse
     */
    @Override
    public CompletableFuture<UpdateK8sServiceResponse> updateK8sService(UpdateK8sServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateK8sService").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/k8s/acs/k8s_service").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateK8sServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateK8sServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateK8sSlb  UpdateK8sSlbRequest
     * @return UpdateK8sSlbResponse
     */
    @Override
    public CompletableFuture<UpdateK8sSlbResponse> updateK8sSlb(UpdateK8sSlbRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateK8sSlb").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/k8s/acs/k8s_slb_binding").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateK8sSlbResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateK8sSlbResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLocalitySetting  UpdateLocalitySettingRequest
     * @return UpdateLocalitySettingResponse
     */
    @Override
    public CompletableFuture<UpdateLocalitySettingResponse> updateLocalitySetting(UpdateLocalitySettingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLocalitySetting").setMethod(HttpMethod.POST).setPathRegex("/pop/sp/applications/locality/setting").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLocalitySettingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLocalitySettingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRole  UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    @Override
    public CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRole").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/account/edit_role").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSlsLogStore  UpdateSlsLogStoreRequest
     * @return UpdateSlsLogStoreResponse
     */
    @Override
    public CompletableFuture<UpdateSlsLogStoreResponse> updateSlsLogStore(UpdateSlsLogStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSlsLogStore").setMethod(HttpMethod.POST).setPathRegex("/pop/v5/k8s/sls/update_sls_log_store").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSlsLogStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSlsLogStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSwimmingLane  UpdateSwimmingLaneRequest
     * @return UpdateSwimmingLaneResponse
     */
    @Override
    public CompletableFuture<UpdateSwimmingLaneResponse> updateSwimmingLane(UpdateSwimmingLaneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSwimmingLane").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/trafficmgnt/swimming_lanes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSwimmingLaneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSwimmingLaneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSwimmingLaneGroup  UpdateSwimmingLaneGroupRequest
     * @return UpdateSwimmingLaneGroupResponse
     */
    @Override
    public CompletableFuture<UpdateSwimmingLaneGroupResponse> updateSwimmingLaneGroup(UpdateSwimmingLaneGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSwimmingLaneGroup").setMethod(HttpMethod.PUT).setPathRegex("/pop/v5/trafficmgnt/swimming_lane_groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSwimmingLaneGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSwimmingLaneGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
