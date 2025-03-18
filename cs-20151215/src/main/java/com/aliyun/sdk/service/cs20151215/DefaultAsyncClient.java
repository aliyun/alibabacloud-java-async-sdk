// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cs20151215.models.*;
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
        this.product = "CS";
        this.version = "2015-12-15";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-2-pop", "cs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "cs.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "cs.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-edge-1", "cs.aliyuncs.com"),
            new TeaPair("cn-fujian", "cs.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "cs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "cs.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "cs.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "cs.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "cs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-wuhan", "cs.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "cs.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "cs.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "cs.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "cs.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "cs.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "cs.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "cs.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AttachInstances  AttachInstancesRequest
     * @return AttachInstancesResponse
     */
    @Override
    public CompletableFuture<AttachInstancesResponse> attachInstances(AttachInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AttachInstances").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/attach").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AttachInstancesToNodePool  AttachInstancesToNodePoolRequest
     * @return AttachInstancesToNodePoolResponse
     */
    @Override
    public CompletableFuture<AttachInstancesToNodePoolResponse> attachInstancesToNodePool(AttachInstancesToNodePoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AttachInstancesToNodePool").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/nodepools/{NodepoolId}/attach").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachInstancesToNodePoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachInstancesToNodePoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CancelClusterUpgrade is deprecated, please use CS::2015-12-15::CancelTask instead.  * @param request  the request parameters of CancelClusterUpgrade  CancelClusterUpgradeRequest
     * @return CancelClusterUpgradeResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CancelClusterUpgradeResponse> cancelClusterUpgrade(CancelClusterUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelClusterUpgrade").setMethod(HttpMethod.POST).setPathRegex("/api/v2/clusters/{ClusterId}/upgrade/cancel").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelClusterUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelClusterUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CancelComponentUpgrade is deprecated, please use CS::2015-12-15::CancelTask instead.  * @param request  the request parameters of CancelComponentUpgrade  CancelComponentUpgradeRequest
     * @return CancelComponentUpgradeResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CancelComponentUpgradeResponse> cancelComponentUpgrade(CancelComponentUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelComponentUpgrade").setMethod(HttpMethod.POST).setPathRegex("/clusters/{clusterId}/components/{componentId}/cancel").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelComponentUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelComponentUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelOperationPlan  CancelOperationPlanRequest
     * @return CancelOperationPlanResponse
     */
    @Override
    public CompletableFuture<CancelOperationPlanResponse> cancelOperationPlan(CancelOperationPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelOperationPlan").setMethod(HttpMethod.DELETE).setPathRegex("/operation/plans/{plan_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelOperationPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelOperationPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    @Override
    public CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelTask").setMethod(HttpMethod.POST).setPathRegex("/tasks/{task_id}/cancel").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckControlPlaneLogEnable  CheckControlPlaneLogEnableRequest
     * @return CheckControlPlaneLogEnableResponse
     */
    @Override
    public CompletableFuture<CheckControlPlaneLogEnableResponse> checkControlPlaneLogEnable(CheckControlPlaneLogEnableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckControlPlaneLogEnable").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/controlplanelog").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckControlPlaneLogEnableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckControlPlaneLogEnableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckServiceRole  CheckServiceRoleRequest
     * @return CheckServiceRoleResponse
     */
    @Override
    public CompletableFuture<CheckServiceRoleResponse> checkServiceRole(CheckServiceRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckServiceRole").setMethod(HttpMethod.POST).setPathRegex("/ram/check-service-role").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckServiceRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckServiceRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permission.</li>
     * <li>You cannot revoke the permissions of an Alibaba Cloud account.</li>
     * <li>You cannot revoke the permissions of the account that you use to call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CleanClusterUserPermissions  CleanClusterUserPermissionsRequest
     * @return CleanClusterUserPermissionsResponse
     */
    @Override
    public CompletableFuture<CleanClusterUserPermissionsResponse> cleanClusterUserPermissions(CleanClusterUserPermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CleanClusterUserPermissions").setMethod(HttpMethod.DELETE).setPathRegex("/cluster/{ClusterId}/user/{Uid}/permissions").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CleanClusterUserPermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CleanClusterUserPermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permission.</li>
     * <li>You cannot revoke the permissions of an Alibaba Cloud account.</li>
     * <li>You cannot revoke the permissions of the account that you use to call this operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of CleanUserPermissions  CleanUserPermissionsRequest
     * @return CleanUserPermissionsResponse
     */
    @Override
    public CompletableFuture<CleanUserPermissionsResponse> cleanUserPermissions(CleanUserPermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CleanUserPermissions").setMethod(HttpMethod.DELETE).setPathRegex("/users/{Uid}/permissions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CleanUserPermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CleanUserPermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAutoscalingConfig  CreateAutoscalingConfigRequest
     * @return CreateAutoscalingConfigResponse
     */
    @Override
    public CompletableFuture<CreateAutoscalingConfigResponse> createAutoscalingConfig(CreateAutoscalingConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAutoscalingConfig").setMethod(HttpMethod.POST).setPathRegex("/cluster/{ClusterId}/autoscale/config/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAutoscalingConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAutoscalingConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#-openapi-"></a>Generate API request parameters in the ACK console</h3>
     * <p>When you fail to create an ACK cluster by calling the CreateCluster operation due to invalid parameter settings, you can generate valid API request parameters in the ACK console. Procedure:</p>
     * <ol>
     * <li>Log on to the <a href="https://cs.console.aliyun.com">ACK console</a>. In the left-side navigation pane, click <strong>Clusters</strong>.</li>
     * <li>On the <strong>Cluster</strong> page, click <strong>Cluster Templates</strong>.</li>
     * <li>In the Select Cluster Template dialog box, select the type of cluster that you want to create and click Create. Then, configure the cluster setting parameters.</li>
     * <li>After you configure the cluster parameters, click <strong>Generate API Request Parameters</strong> in the <strong>Confirm Order</strong> step.
     * The API request parameters are displayed in the API Request Parameters dialog box.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateCluster  CreateClusterRequest
     * @return CreateClusterResponse
     */
    @Override
    public CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCluster").setMethod(HttpMethod.POST).setPathRegex("/clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateClusterDiagnosis  CreateClusterDiagnosisRequest
     * @return CreateClusterDiagnosisResponse
     */
    @Override
    public CompletableFuture<CreateClusterDiagnosisResponse> createClusterDiagnosis(CreateClusterDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateClusterDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/clusters/{cluster_id}/diagnosis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClusterDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClusterDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateClusterNodePool  CreateClusterNodePoolRequest
     * @return CreateClusterNodePoolResponse
     */
    @Override
    public CompletableFuture<CreateClusterNodePoolResponse> createClusterNodePool(CreateClusterNodePoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateClusterNodePool").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/nodepools").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClusterNodePoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClusterNodePoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEdgeMachine  CreateEdgeMachineRequest
     * @return CreateEdgeMachineResponse
     */
    @Override
    public CompletableFuture<CreateEdgeMachineResponse> createEdgeMachine(CreateEdgeMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateEdgeMachine").setMethod(HttpMethod.POST).setPathRegex("/edge_machines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEdgeMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEdgeMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI CreateKubernetesTrigger is deprecated, please use CS::2015-12-15::CreateTrigger instead.  * @param request  the request parameters of CreateKubernetesTrigger  CreateKubernetesTriggerRequest
     * @return CreateKubernetesTriggerResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<CreateKubernetesTriggerResponse> createKubernetesTrigger(CreateKubernetesTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateKubernetesTrigger").setMethod(HttpMethod.POST).setPathRegex("/triggers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKubernetesTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKubernetesTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    @Override
    public CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTemplate").setMethod(HttpMethod.POST).setPathRegex("/templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateTrigger  CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    @Override
    public CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateTrigger").setMethod(HttpMethod.POST).setPathRegex("/clusters/{cluster_id}/triggers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlertContact  DeleteAlertContactRequest
     * @return DeleteAlertContactResponse
     */
    @Override
    public CompletableFuture<DeleteAlertContactResponse> deleteAlertContact(DeleteAlertContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlertContact").setMethod(HttpMethod.DELETE).setPathRegex("/alert/contacts").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAlertContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAlertContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlertContactGroup  DeleteAlertContactGroupRequest
     * @return DeleteAlertContactGroupResponse
     */
    @Override
    public CompletableFuture<DeleteAlertContactGroupResponse> deleteAlertContactGroup(DeleteAlertContactGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlertContactGroup").setMethod(HttpMethod.DELETE).setPathRegex("/alert/contact_groups").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAlertContactGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAlertContactGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Warning:</p>
     * <ul>
     * <li>Subscription ECS instances and Lingjun nodes in a cluster cannot be automatically released. To avoid unnecessary costs, we recommend that you manually release the resources. For more information, see \<a href="{0}" target="_blank">Rules for deleting clusters and releasing nodes\</a>.</li>
     * <li>If the SLB instance of the API server uses the subscription billing method, it cannot be automatically released. To avoid unnecessary costs, we recommend that you manually release it.</li>
     * <li>By default, virtual private clouds (VPCs), vSwitches, security groups, and RAM roles are retained if they are used by other resources. To avoid unnecessary costs, we recommend that you manually release the resources.</li>
     * <li>Elastic container instances created on virtual nodes are automatically released.</li>
     * <li>Some resources created together with a cluster are not automatically released when the cluster is deleted. After the cluster is deleted, you are still charged for the resources. Release or retain the resources based on your actual needs. The resources include Simple Log Service projects automatically created by the cluster and dynamically provisioned disks.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCluster  DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    @Override
    public CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCluster").setMethod(HttpMethod.DELETE).setPathRegex("/clusters/{ClusterId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteClusterNodepool  DeleteClusterNodepoolRequest
     * @return DeleteClusterNodepoolResponse
     */
    @Override
    public CompletableFuture<DeleteClusterNodepoolResponse> deleteClusterNodepool(DeleteClusterNodepoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteClusterNodepool").setMethod(HttpMethod.DELETE).setPathRegex("/clusters/{ClusterId}/nodepools/{NodepoolId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClusterNodepoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClusterNodepoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.</p>
     * <ul>
     * <li>The operation may have unexpected risks. Back up the data before you perform this operation.</li>
     * <li>When you remove a node, the system sets the status of the node to Unschedulable.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteClusterNodes  DeleteClusterNodesRequest
     * @return DeleteClusterNodesResponse
     */
    @Override
    public CompletableFuture<DeleteClusterNodesResponse> deleteClusterNodes(DeleteClusterNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteClusterNodes").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/nodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClusterNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClusterNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEdgeMachine  DeleteEdgeMachineRequest
     * @return DeleteEdgeMachineResponse
     */
    @Override
    public CompletableFuture<DeleteEdgeMachineResponse> deleteEdgeMachine(DeleteEdgeMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteEdgeMachine").setMethod(HttpMethod.DELETE).setPathRegex("/edge_machines/[edge_machineid]").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEdgeMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEdgeMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeleteKubernetesTrigger is deprecated, please use CS::2015-12-15::DeleteTrigger instead.  * @param request  the request parameters of DeleteKubernetesTrigger  DeleteKubernetesTriggerRequest
     * @return DeleteKubernetesTriggerResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DeleteKubernetesTriggerResponse> deleteKubernetesTrigger(DeleteKubernetesTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteKubernetesTrigger").setMethod(HttpMethod.DELETE).setPathRegex("/triggers/revoke/{Id}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteKubernetesTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteKubernetesTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePolicyInstance  DeletePolicyInstanceRequest
     * @return DeletePolicyInstanceResponse
     */
    @Override
    public CompletableFuture<DeletePolicyInstanceResponse> deletePolicyInstance(DeletePolicyInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePolicyInstance").setMethod(HttpMethod.DELETE).setPathRegex("/clusters/{cluster_id}/policies/{policy_name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePolicyInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePolicyInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTemplate").setMethod(HttpMethod.DELETE).setPathRegex("/templates/{TemplateId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteTrigger  DeleteTriggerRequest
     * @return DeleteTriggerResponse
     */
    @Override
    public CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteTrigger").setMethod(HttpMethod.DELETE).setPathRegex("/clusters/{cluster_id}/triggers/{Id}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeployPolicyInstance  DeployPolicyInstanceRequest
     * @return DeployPolicyInstanceResponse
     */
    @Override
    public CompletableFuture<DeployPolicyInstanceResponse> deployPolicyInstance(DeployPolicyInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeployPolicyInstance").setMethod(HttpMethod.POST).setPathRegex("/clusters/{cluster_id}/policies/{policy_name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeployPolicyInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeployPolicyInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAddon  DescribeAddonRequest
     * @return DescribeAddonResponse
     */
    @Override
    public CompletableFuture<DescribeAddonResponse> describeAddon(DescribeAddonRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeAddon").setMethod(HttpMethod.GET).setPathRegex("/addons/{addon_name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAddonResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAddonResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeAddons is deprecated, please use CS::2015-12-15::ListAddons instead.  * @param request  the request parameters of DescribeAddons  DescribeAddonsRequest
     * @return DescribeAddonsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeAddonsResponse> describeAddons(DescribeAddonsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeAddons").setMethod(HttpMethod.GET).setPathRegex("/clusters/components/metadata").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAddonsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAddonsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonInstance is deprecated, please use CS::2015-12-15::GetClusterAddonInstance instead.  * @param request  the request parameters of DescribeClusterAddonInstance  DescribeClusterAddonInstanceRequest
     * @return DescribeClusterAddonInstanceResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeClusterAddonInstanceResponse> describeClusterAddonInstance(DescribeClusterAddonInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterAddonInstance").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterID}/components/{AddonName}/instance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterAddonInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterAddonInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonMetadata is deprecated, please use CS::2015-12-15::DescribeAddon instead.  * @param request  the request parameters of DescribeClusterAddonMetadata  DescribeClusterAddonMetadataRequest
     * @return DescribeClusterAddonMetadataResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeClusterAddonMetadataResponse> describeClusterAddonMetadata(DescribeClusterAddonMetadataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterAddonMetadata").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/components/{component_id}/metadata").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterAddonMetadataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterAddonMetadataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonUpgradeStatus is deprecated, please use CS::2015-12-15::GetClusterAddonInstance instead.  * @param request  the request parameters of DescribeClusterAddonUpgradeStatus  DescribeClusterAddonUpgradeStatusRequest
     * @return DescribeClusterAddonUpgradeStatusResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeClusterAddonUpgradeStatusResponse> describeClusterAddonUpgradeStatus(DescribeClusterAddonUpgradeStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterAddonUpgradeStatus").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/components/{ComponentId}/upgradestatus").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterAddonUpgradeStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterAddonUpgradeStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonsUpgradeStatus is deprecated, please use CS::2015-12-15::ListClusterAddonInstances,CS::2015-12-15::GetClusterAddonInstance instead.  * @param request  the request parameters of DescribeClusterAddonsUpgradeStatus  DescribeClusterAddonsUpgradeStatusRequest
     * @return DescribeClusterAddonsUpgradeStatusResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeClusterAddonsUpgradeStatusResponse> describeClusterAddonsUpgradeStatus(DescribeClusterAddonsUpgradeStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterAddonsUpgradeStatus").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/components/upgradestatus").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterAddonsUpgradeStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterAddonsUpgradeStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeClusterAddonsVersion is deprecated, please use CS::2015-12-15::ListClusterAddonInstances,CS::2015-12-15::GetClusterAddonInstance instead.  * @param request  the request parameters of DescribeClusterAddonsVersion  DescribeClusterAddonsVersionRequest
     * @return DescribeClusterAddonsVersionResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeClusterAddonsVersionResponse> describeClusterAddonsVersion(DescribeClusterAddonsVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterAddonsVersion").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/components/version").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterAddonsVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterAddonsVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterAttachScripts  DescribeClusterAttachScriptsRequest
     * @return DescribeClusterAttachScriptsResponse
     */
    @Override
    public CompletableFuture<DescribeClusterAttachScriptsResponse> describeClusterAttachScripts(DescribeClusterAttachScriptsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterAttachScripts").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/attachscript").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterAttachScriptsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterAttachScriptsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterDetail  DescribeClusterDetailRequest
     * @return DescribeClusterDetailResponse
     */
    @Override
    public CompletableFuture<DescribeClusterDetailResponse> describeClusterDetail(DescribeClusterDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterDetail").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterEvents  DescribeClusterEventsRequest
     * @return DescribeClusterEventsResponse
     */
    @Override
    public CompletableFuture<DescribeClusterEventsResponse> describeClusterEvents(DescribeClusterEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterEvents").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterLogs  DescribeClusterLogsRequest
     * @return DescribeClusterLogsResponse
     */
    @Override
    public CompletableFuture<DescribeClusterLogsResponse> describeClusterLogs(DescribeClusterLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterLogs").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/logs").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterNodePoolDetail  DescribeClusterNodePoolDetailRequest
     * @return DescribeClusterNodePoolDetailResponse
     */
    @Override
    public CompletableFuture<DescribeClusterNodePoolDetailResponse> describeClusterNodePoolDetail(DescribeClusterNodePoolDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterNodePoolDetail").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/nodepools/{NodepoolId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterNodePoolDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterNodePoolDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterNodePools  DescribeClusterNodePoolsRequest
     * @return DescribeClusterNodePoolsResponse
     */
    @Override
    public CompletableFuture<DescribeClusterNodePoolsResponse> describeClusterNodePools(DescribeClusterNodePoolsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterNodePools").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/nodepools").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterNodePoolsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterNodePoolsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterNodes  DescribeClusterNodesRequest
     * @return DescribeClusterNodesResponse
     */
    @Override
    public CompletableFuture<DescribeClusterNodesResponse> describeClusterNodes(DescribeClusterNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterNodes").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/nodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterResources  DescribeClusterResourcesRequest
     * @return DescribeClusterResourcesResponse
     */
    @Override
    public CompletableFuture<DescribeClusterResourcesResponse> describeClusterResources(DescribeClusterResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterResources").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/resources").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterTasks  DescribeClusterTasksRequest
     * @return DescribeClusterTasksResponse
     */
    @Override
    public CompletableFuture<DescribeClusterTasksResponse> describeClusterTasks(DescribeClusterTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterTasks").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The default validity period of a kubeconfig file is 3 years. 180 days before a kubeconfig file expires, you can renew it in the Container Service for Kubernetes (ACK) console or by calling API operations. After a kubeconfig file is renewed, the kubeconfig file is valid for 3 years. The previous kubeconfig file still remains valid until expiration. We recommend that you renew your kubeconfig file at the earliest opportunity.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeClusterUserKubeconfig  DescribeClusterUserKubeconfigRequest
     * @return DescribeClusterUserKubeconfigResponse
     */
    @Override
    public CompletableFuture<DescribeClusterUserKubeconfigResponse> describeClusterUserKubeconfig(DescribeClusterUserKubeconfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterUserKubeconfig").setMethod(HttpMethod.GET).setPathRegex("/k8s/{ClusterId}/user_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterUserKubeconfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterUserKubeconfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeClusterV2UserKubeconfig is deprecated, please use CS::2015-12-15::DescribeClusterUserKubeconfig instead.  * @param request  the request parameters of DescribeClusterV2UserKubeconfig  DescribeClusterV2UserKubeconfigRequest
     * @return DescribeClusterV2UserKubeconfigResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeClusterV2UserKubeconfigResponse> describeClusterV2UserKubeconfig(DescribeClusterV2UserKubeconfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterV2UserKubeconfig").setMethod(HttpMethod.GET).setPathRegex("/api/v2/k8s/{ClusterId}/user_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterV2UserKubeconfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterV2UserKubeconfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClusterVuls  DescribeClusterVulsRequest
     * @return DescribeClusterVulsResponse
     */
    @Override
    public CompletableFuture<DescribeClusterVulsResponse> describeClusterVuls(DescribeClusterVulsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusterVuls").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/vuls").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClusterVulsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClusterVulsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeClusters is deprecated, please use CS::2015-12-15::DescribeClustersV1 instead.  * @param request  the request parameters of DescribeClusters  DescribeClustersRequest
     * @return DescribeClustersResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClusters").setMethod(HttpMethod.GET).setPathRegex("/clusters").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClustersForRegion  DescribeClustersForRegionRequest
     * @return DescribeClustersForRegionResponse
     */
    @Override
    public CompletableFuture<DescribeClustersForRegionResponse> describeClustersForRegion(DescribeClustersForRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClustersForRegion").setMethod(HttpMethod.GET).setPathRegex("/regions/{region_id}/clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClustersForRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClustersForRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClustersV1  DescribeClustersV1Request
     * @return DescribeClustersV1Response
     */
    @Override
    public CompletableFuture<DescribeClustersV1Response> describeClustersV1(DescribeClustersV1Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeClustersV1").setMethod(HttpMethod.GET).setPathRegex("/api/v1/clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClustersV1Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClustersV1Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeEdgeMachineActiveProcess is deprecated  * @param request  the request parameters of DescribeEdgeMachineActiveProcess  DescribeEdgeMachineActiveProcessRequest
     * @return DescribeEdgeMachineActiveProcessResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeEdgeMachineActiveProcessResponse> describeEdgeMachineActiveProcess(DescribeEdgeMachineActiveProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeEdgeMachineActiveProcess").setMethod(HttpMethod.GET).setPathRegex("/edge_machines/[edge_machineid]/activeprocess").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEdgeMachineActiveProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEdgeMachineActiveProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEdgeMachineModels  DescribeEdgeMachineModelsRequest
     * @return DescribeEdgeMachineModelsResponse
     */
    @Override
    public CompletableFuture<DescribeEdgeMachineModelsResponse> describeEdgeMachineModels(DescribeEdgeMachineModelsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeEdgeMachineModels").setMethod(HttpMethod.GET).setPathRegex("/edge_machines/models").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEdgeMachineModelsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEdgeMachineModelsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEdgeMachineTunnelConfigDetail  DescribeEdgeMachineTunnelConfigDetailRequest
     * @return DescribeEdgeMachineTunnelConfigDetailResponse
     */
    @Override
    public CompletableFuture<DescribeEdgeMachineTunnelConfigDetailResponse> describeEdgeMachineTunnelConfigDetail(DescribeEdgeMachineTunnelConfigDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeEdgeMachineTunnelConfigDetail").setMethod(HttpMethod.POST).setPathRegex("/edge_machines/[edge_machineid]/tunnelconfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEdgeMachineTunnelConfigDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEdgeMachineTunnelConfigDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEdgeMachines  DescribeEdgeMachinesRequest
     * @return DescribeEdgeMachinesResponse
     */
    @Override
    public CompletableFuture<DescribeEdgeMachinesResponse> describeEdgeMachines(DescribeEdgeMachinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeEdgeMachines").setMethod(HttpMethod.GET).setPathRegex("/edge_machines").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEdgeMachinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEdgeMachinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEvents  DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    @Override
    public CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeEvents").setMethod(HttpMethod.GET).setPathRegex("/events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeEventsForRegion  DescribeEventsForRegionRequest
     * @return DescribeEventsForRegionResponse
     */
    @Override
    public CompletableFuture<DescribeEventsForRegionResponse> describeEventsForRegion(DescribeEventsForRegionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeEventsForRegion").setMethod(HttpMethod.GET).setPathRegex("/regions/{region_id}/events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEventsForRegionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEventsForRegionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeExternalAgent is deprecated  * @description For more information, see [Register an external Kubernetes cluster](https://help.aliyun.com/document_detail/121053.html).
     * 
     * @param request the request parameters of DescribeExternalAgent  DescribeExternalAgentRequest
     * @return DescribeExternalAgentResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribeExternalAgentResponse> describeExternalAgent(DescribeExternalAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeExternalAgent").setMethod(HttpMethod.GET).setPathRegex("/k8s/{ClusterId}/external/agent/deployment").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExternalAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExternalAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeKubernetesVersionMetadata  DescribeKubernetesVersionMetadataRequest
     * @return DescribeKubernetesVersionMetadataResponse
     */
    @Override
    public CompletableFuture<DescribeKubernetesVersionMetadataResponse> describeKubernetesVersionMetadata(DescribeKubernetesVersionMetadataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeKubernetesVersionMetadata").setMethod(HttpMethod.GET).setPathRegex("/api/v1/metadata/versions").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeKubernetesVersionMetadataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeKubernetesVersionMetadataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNodePoolVuls  DescribeNodePoolVulsRequest
     * @return DescribeNodePoolVulsResponse
     */
    @Override
    public CompletableFuture<DescribeNodePoolVulsResponse> describeNodePoolVuls(DescribeNodePoolVulsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeNodePoolVuls").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/nodepools/{nodepool_id}/vuls").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNodePoolVulsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNodePoolVulsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePolicies  DescribePoliciesRequest
     * @return DescribePoliciesResponse
     */
    @Override
    public CompletableFuture<DescribePoliciesResponse> describePolicies(DescribePoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribePolicies").setMethod(HttpMethod.GET).setPathRegex("/policies").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePolicyDetails  DescribePolicyDetailsRequest
     * @return DescribePolicyDetailsResponse
     */
    @Override
    public CompletableFuture<DescribePolicyDetailsResponse> describePolicyDetails(DescribePolicyDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribePolicyDetails").setMethod(HttpMethod.GET).setPathRegex("/policies/{policy_name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePolicyDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePolicyDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePolicyGovernanceInCluster  DescribePolicyGovernanceInClusterRequest
     * @return DescribePolicyGovernanceInClusterResponse
     */
    @Override
    public CompletableFuture<DescribePolicyGovernanceInClusterResponse> describePolicyGovernanceInCluster(DescribePolicyGovernanceInClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribePolicyGovernanceInCluster").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/policygovernance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePolicyGovernanceInClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePolicyGovernanceInClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePolicyInstances  DescribePolicyInstancesRequest
     * @return DescribePolicyInstancesResponse
     */
    @Override
    public CompletableFuture<DescribePolicyInstancesResponse> describePolicyInstances(DescribePolicyInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribePolicyInstances").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/policies").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePolicyInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePolicyInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePolicyInstancesStatus  DescribePolicyInstancesStatusRequest
     * @return DescribePolicyInstancesStatusResponse
     */
    @Override
    public CompletableFuture<DescribePolicyInstancesStatusResponse> describePolicyInstancesStatus(DescribePolicyInstancesStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribePolicyInstancesStatus").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/policies/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePolicyInstancesStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePolicyInstancesStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeResourcesDeleteProtection  DescribeResourcesDeleteProtectionRequest
     * @return DescribeResourcesDeleteProtectionResponse
     */
    @Override
    public CompletableFuture<DescribeResourcesDeleteProtectionResponse> describeResourcesDeleteProtection(DescribeResourcesDeleteProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeResourcesDeleteProtection").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/resources/{ResourceType}/protection").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourcesDeleteProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourcesDeleteProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only by using an Alibaba Cloud account.</p>
     * 
     * @param request the request parameters of DescribeSubaccountK8sClusterUserConfig  DescribeSubaccountK8sClusterUserConfigRequest
     * @return DescribeSubaccountK8sClusterUserConfigResponse
     */
    @Override
    public CompletableFuture<DescribeSubaccountK8sClusterUserConfigResponse> describeSubaccountK8sClusterUserConfig(DescribeSubaccountK8sClusterUserConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeSubaccountK8sClusterUserConfig").setMethod(HttpMethod.GET).setPathRegex("/k8s/{ClusterId}/users/{Uid}/user_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSubaccountK8sClusterUserConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSubaccountK8sClusterUserConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTaskInfo  DescribeTaskInfoRequest
     * @return DescribeTaskInfoResponse
     */
    @Override
    public CompletableFuture<DescribeTaskInfoResponse> describeTaskInfo(DescribeTaskInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeTaskInfo").setMethod(HttpMethod.GET).setPathRegex("/tasks/{task_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTaskInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTaskInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTemplateAttribute  DescribeTemplateAttributeRequest
     * @return DescribeTemplateAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeTemplateAttributeResponse> describeTemplateAttribute(DescribeTemplateAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeTemplateAttribute").setMethod(HttpMethod.GET).setPathRegex("/templates/{TemplateId}").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTemplateAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTemplateAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTemplates  DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     */
    @Override
    public CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeTemplates").setMethod(HttpMethod.GET).setPathRegex("/templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTrigger  DescribeTriggerRequest
     * @return DescribeTriggerResponse
     */
    @Override
    public CompletableFuture<DescribeTriggerResponse> describeTrigger(DescribeTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeTrigger").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/triggers").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserClusterNamespaces  DescribeUserClusterNamespacesRequest
     * @return DescribeUserClusterNamespacesResponse
     */
    @Override
    public CompletableFuture<DescribeUserClusterNamespacesResponse> describeUserClusterNamespaces(DescribeUserClusterNamespacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeUserClusterNamespaces").setMethod(HttpMethod.GET).setPathRegex("/api/v2/k8s/{ClusterId}/namespaces").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserClusterNamespacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserClusterNamespacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Precautions</em>*:</p>
     * <ul>
     * <li>If you call this operation as a Resource Access Management (RAM) user or by assuming a RAM role, only the permissions granted on the clusters on which the current account has the role-based access control (RBAC) administrator permissions are returned. If you want to query the permissions on all clusters, you must use an account that has the RBAC administrator permissions on all clusters.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUserPermission  DescribeUserPermissionRequest
     * @return DescribeUserPermissionResponse
     */
    @Override
    public CompletableFuture<DescribeUserPermissionResponse> describeUserPermission(DescribeUserPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeUserPermission").setMethod(HttpMethod.GET).setPathRegex("/permissions/users/{uid}").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserQuota  DescribeUserQuotaRequest
     * @return DescribeUserQuotaResponse
     */
    @Override
    public CompletableFuture<DescribeUserQuotaResponse> describeUserQuota(DescribeUserQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeUserQuota").setMethod(HttpMethod.GET).setPathRegex("/quota").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI EdgeClusterAddEdgeMachine is deprecated  * @param request  the request parameters of EdgeClusterAddEdgeMachine  EdgeClusterAddEdgeMachineRequest
     * @return EdgeClusterAddEdgeMachineResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<EdgeClusterAddEdgeMachineResponse> edgeClusterAddEdgeMachine(EdgeClusterAddEdgeMachineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EdgeClusterAddEdgeMachine").setMethod(HttpMethod.POST).setPathRegex("/clusters/[clusterid]/attachedgemachine/[edge_machineid]").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EdgeClusterAddEdgeMachineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EdgeClusterAddEdgeMachineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>The Common Vulnerabilities and Exposures (CVE) patching feature is developed based on Security Center. To use this feature, you must purchase the Security Center Ultimate Edition that supports Container Service for Kubernetes (ACK).</li>
     * <li>ACK may need to restart nodes to patch certain vulnerabilities. ACK drains a node before the node restarts. Make sure that the ACK cluster has sufficient idle nodes to host the pods evicted from the trained nodes. For example, you can scale out a node pool before you patch vulnerabilities for the nodes in the node pool.</li>
     * <li>Security Center ensures the compatibility of CVE patches. We recommend that you check the compatibility of a CVE patch with your application before you install the patch. You can pause or cancel a CVE patching task anytime.</li>
     * <li>CVE patching is a progressive task that consists of multiple batches. After you pause or cancel a CVE patching task, ACK continues to process the dispatched batches. Only the batches that have not been dispatched are paused or canceled.</li>
     * </ol>
     * 
     * @param request the request parameters of FixNodePoolVuls  FixNodePoolVulsRequest
     * @return FixNodePoolVulsResponse
     */
    @Override
    public CompletableFuture<FixNodePoolVulsResponse> fixNodePoolVuls(FixNodePoolVulsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FixNodePoolVuls").setMethod(HttpMethod.POST).setPathRegex("/clusters/{cluster_id}/nodepools/{nodepool_id}/vuls/fix").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FixNodePoolVulsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FixNodePoolVulsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterAddonInstance  GetClusterAddonInstanceRequest
     * @return GetClusterAddonInstanceResponse
     */
    @Override
    public CompletableFuture<GetClusterAddonInstanceResponse> getClusterAddonInstance(GetClusterAddonInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetClusterAddonInstance").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/addon_instances/{instance_name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterAddonInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterAddonInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterAuditProject  GetClusterAuditProjectRequest
     * @return GetClusterAuditProjectResponse
     */
    @Override
    public CompletableFuture<GetClusterAuditProjectResponse> getClusterAuditProject(GetClusterAuditProjectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetClusterAuditProject").setMethod(HttpMethod.GET).setPathRegex("/clusters/{clusterid}/audit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterAuditProjectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterAuditProjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterCheck  GetClusterCheckRequest
     * @return GetClusterCheckResponse
     */
    @Override
    public CompletableFuture<GetClusterCheckResponse> getClusterCheck(GetClusterCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetClusterCheck").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/checks/{check_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterDiagnosisCheckItems  GetClusterDiagnosisCheckItemsRequest
     * @return GetClusterDiagnosisCheckItemsResponse
     */
    @Override
    public CompletableFuture<GetClusterDiagnosisCheckItemsResponse> getClusterDiagnosisCheckItems(GetClusterDiagnosisCheckItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetClusterDiagnosisCheckItems").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/diagnosis/{diagnosis_id}/check_items").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterDiagnosisCheckItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterDiagnosisCheckItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClusterDiagnosisResult  GetClusterDiagnosisResultRequest
     * @return GetClusterDiagnosisResultResponse
     */
    @Override
    public CompletableFuture<GetClusterDiagnosisResultResponse> getClusterDiagnosisResult(GetClusterDiagnosisResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetClusterDiagnosisResult").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/diagnosis/{diagnosis_id}/result").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClusterDiagnosisResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClusterDiagnosisResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetKubernetesTrigger is deprecated, please use CS::2015-12-15::DescribeTrigger instead.  * @param request  the request parameters of GetKubernetesTrigger  GetKubernetesTriggerRequest
     * @return GetKubernetesTriggerResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetKubernetesTriggerResponse> getKubernetesTrigger(GetKubernetesTriggerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetKubernetesTrigger").setMethod(HttpMethod.GET).setPathRegex("/triggers/{ClusterId}").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKubernetesTriggerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKubernetesTriggerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI GetUpgradeStatus is deprecated, please use CS::2015-12-15::DescribeTaskInfo instead.  * @param request  the request parameters of GetUpgradeStatus  GetUpgradeStatusRequest
     * @return GetUpgradeStatusResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<GetUpgradeStatusResponse> getUpgradeStatus(GetUpgradeStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUpgradeStatus").setMethod(HttpMethod.GET).setPathRegex("/api/v2/clusters/{ClusterId}/upgrade/status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUpgradeStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUpgradeStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Precautions</em>*:</p>
     * <ul>
     * <li>If you use a Resource Access Management (RAM) user to call the operation, make sure that the RAM user has the permissions to modify the permissions of other RAM users or RAM roles. Otherwise, the <code>StatusForbidden</code> or <code>ForbiddenGrantPermissions</code> error code is returned after you call the operation. For more information, see <a href="https://help.aliyun.com/document_detail/119035.html">Use a RAM user to grant RBAC permissions to other RAM users</a>.</li>
     * <li>If you update full permissions, the existing permissions of the RAM user or RAM role on the cluster are overwritten. You must specify all the permissions that you want to grant to the RAM user or RAM role in the request parameters when you call the operation.</li>
     * </ul>
     * 
     * @param request the request parameters of GrantPermissions  GrantPermissionsRequest
     * @return GrantPermissionsResponse
     */
    @Override
    public CompletableFuture<GrantPermissionsResponse> grantPermissions(GrantPermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GrantPermissions").setMethod(HttpMethod.POST).setPathRegex("/permissions/users/{uid}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantPermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantPermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InstallClusterAddons  InstallClusterAddonsRequest
     * @return InstallClusterAddonsResponse
     */
    @Override
    public CompletableFuture<InstallClusterAddonsResponse> installClusterAddons(InstallClusterAddonsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallClusterAddons").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/components/install").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallClusterAddonsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallClusterAddonsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAddons  ListAddonsRequest
     * @return ListAddonsResponse
     */
    @Override
    public CompletableFuture<ListAddonsResponse> listAddons(ListAddonsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAddons").setMethod(HttpMethod.GET).setPathRegex("/addons").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAddonsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAddonsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterAddonInstances  ListClusterAddonInstancesRequest
     * @return ListClusterAddonInstancesResponse
     */
    @Override
    public CompletableFuture<ListClusterAddonInstancesResponse> listClusterAddonInstances(ListClusterAddonInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusterAddonInstances").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/addon_instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterAddonInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterAddonInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterChecks  ListClusterChecksRequest
     * @return ListClusterChecksResponse
     */
    @Override
    public CompletableFuture<ListClusterChecksResponse> listClusterChecks(ListClusterChecksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusterChecks").setMethod(HttpMethod.GET).setPathRegex("/clusters/{cluster_id}/checks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterChecksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterChecksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To call this operation, make sure that you have ram:ListUsers and ram:ListRoles permissions.</li>
     * <li>To call this operation, make sure that you have the AliyunCSFullAccess permissions.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ListClusterKubeconfigStates  ListClusterKubeconfigStatesRequest
     * @return ListClusterKubeconfigStatesResponse
     */
    @Override
    public CompletableFuture<ListClusterKubeconfigStatesResponse> listClusterKubeconfigStates(ListClusterKubeconfigStatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusterKubeconfigStates").setMethod(HttpMethod.GET).setPathRegex("/clusters/{ClusterId}/kubeconfig/states").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterKubeconfigStatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterKubeconfigStatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOperationPlans  ListOperationPlansRequest
     * @return ListOperationPlansResponse
     */
    @Override
    public CompletableFuture<ListOperationPlansResponse> listOperationPlans(ListOperationPlansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOperationPlans").setMethod(HttpMethod.GET).setPathRegex("/operation/plans").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOperationPlansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOperationPlansResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTagResources").setMethod(HttpMethod.GET).setPathRegex("/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> To call this operation, make sure that you have the AliyunCSFullAccess permissions.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListUserKubeConfigStates  ListUserKubeConfigStatesRequest
     * @return ListUserKubeConfigStatesResponse
     */
    @Override
    public CompletableFuture<ListUserKubeConfigStatesResponse> listUserKubeConfigStates(ListUserKubeConfigStatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUserKubeConfigStates").setMethod(HttpMethod.GET).setPathRegex("/users/{Uid}/kubeconfig/states").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserKubeConfigStatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserKubeConfigStatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MigrateCluster  MigrateClusterRequest
     * @return MigrateClusterResponse
     */
    @Override
    public CompletableFuture<MigrateClusterResponse> migrateCluster(MigrateClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MigrateCluster").setMethod(HttpMethod.POST).setPathRegex("/clusters/{cluster_id}/migrate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MigrateClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MigrateClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCluster  ModifyClusterRequest
     * @return ModifyClusterResponse
     */
    @Override
    public CompletableFuture<ModifyClusterResponse> modifyCluster(ModifyClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyCluster").setMethod(HttpMethod.PUT).setPathRegex("/api/v2/clusters/{ClusterId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this API operation to modify the component parameters of an ACK Basic cluster or the control plane parameters of an ACK Pro cluster:</p>
     * <ul>
     * <li>To view the component parameters of an ACK Basic cluster, call the DescribeClusterAddonMetadata API operation. For more information, see <a href="https://help.aliyun.com/document_detail/2667944.html">Query the metadata of a cluster component</a>.</li>
     * <li>To view the control plane parameters of an ACK Pro cluster, see <a href="https://help.aliyun.com/document_detail/199588.html">Customize the control plane parameters of an ACK Pro cluster</a>.
     * After you call this operation, the component may be redeployed and restarted. We recommend that you assess the impact before you call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyClusterAddon  ModifyClusterAddonRequest
     * @return ModifyClusterAddonResponse
     */
    @Override
    public CompletableFuture<ModifyClusterAddonResponse> modifyClusterAddon(ModifyClusterAddonRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyClusterAddon").setMethod(HttpMethod.POST).setPathRegex("/clusters/{cluster_id}/components/{component_id}/config").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClusterAddonResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClusterAddonResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ModifyClusterConfiguration is deprecated, please use CS::2015-12-15::ModifyClusterAddon instead.  * @param request  the request parameters of ModifyClusterConfiguration  ModifyClusterConfigurationRequest
     * @return ModifyClusterConfigurationResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ModifyClusterConfigurationResponse> modifyClusterConfiguration(ModifyClusterConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyClusterConfiguration").setMethod(HttpMethod.PUT).setPathRegex("/clusters/{ClusterId}/configuration").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClusterConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClusterConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyClusterNodePool  ModifyClusterNodePoolRequest
     * @return ModifyClusterNodePoolResponse
     */
    @Override
    public CompletableFuture<ModifyClusterNodePoolResponse> modifyClusterNodePool(ModifyClusterNodePoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyClusterNodePool").setMethod(HttpMethod.PUT).setPathRegex("/clusters/{ClusterId}/nodepools/{NodepoolId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClusterNodePoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClusterNodePoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyClusterTags  ModifyClusterTagsRequest
     * @return ModifyClusterTagsResponse
     */
    @Override
    public CompletableFuture<ModifyClusterTagsResponse> modifyClusterTags(ModifyClusterTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyClusterTags").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/tags").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClusterTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClusterTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Container Service for Kubernetes (ACK) allows you to modify the kubelet configuration of nodes in a node pool. After you modify the kubelet configuration, the new configuration immediately takes effect on existing nodes in the node pool and is automatically applied to newly added nodes.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyNodePoolNodeConfig  ModifyNodePoolNodeConfigRequest
     * @return ModifyNodePoolNodeConfigResponse
     */
    @Override
    public CompletableFuture<ModifyNodePoolNodeConfigResponse> modifyNodePoolNodeConfig(ModifyNodePoolNodeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyNodePoolNodeConfig").setMethod(HttpMethod.PUT).setPathRegex("/clusters/{ClusterId}/nodepools/{NodepoolId}/node_config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNodePoolNodeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNodePoolNodeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyPolicyInstance  ModifyPolicyInstanceRequest
     * @return ModifyPolicyInstanceResponse
     */
    @Override
    public CompletableFuture<ModifyPolicyInstanceResponse> modifyPolicyInstance(ModifyPolicyInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ModifyPolicyInstance").setMethod(HttpMethod.PUT).setPathRegex("/clusters/{cluster_id}/policies/{policy_name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPolicyInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPolicyInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can activate ACK by using Alibaba Cloud accounts.</p>
     * <ul>
     * <li>To activate ACK by using RAM users, you need to grant the AdministratorAccess permission to the RAM users.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenAckService  OpenAckServiceRequest
     * @return OpenAckServiceResponse
     */
    @Override
    public CompletableFuture<OpenAckServiceResponse> openAckService(OpenAckServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenAckService").setMethod(HttpMethod.POST).setPathRegex("/service/open").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenAckServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenAckServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI PauseClusterUpgrade is deprecated, please use CS::2015-12-15::PauseTask instead.  * @param request  the request parameters of PauseClusterUpgrade  PauseClusterUpgradeRequest
     * @return PauseClusterUpgradeResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<PauseClusterUpgradeResponse> pauseClusterUpgrade(PauseClusterUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PauseClusterUpgrade").setMethod(HttpMethod.POST).setPathRegex("/api/v2/clusters/{ClusterId}/upgrade/pause").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PauseClusterUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PauseClusterUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI PauseComponentUpgrade is deprecated, please use CS::2015-12-15::PauseTask instead.  * @param request  the request parameters of PauseComponentUpgrade  PauseComponentUpgradeRequest
     * @return PauseComponentUpgradeResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<PauseComponentUpgradeResponse> pauseComponentUpgrade(PauseComponentUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PauseComponentUpgrade").setMethod(HttpMethod.POST).setPathRegex("/clusters/{clusterid}/components/{componentid}/pause").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PauseComponentUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PauseComponentUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PauseTask  PauseTaskRequest
     * @return PauseTaskResponse
     */
    @Override
    public CompletableFuture<PauseTaskResponse> pauseTask(PauseTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PauseTask").setMethod(HttpMethod.POST).setPathRegex("/tasks/{task_id}/pause").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PauseTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PauseTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI RemoveClusterNodes is deprecated, please use CS::2015-12-15::RemoveNodePoolNodes instead.  * @description ****
     * *   When you remove a node, the pods that run on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.
     * *   Unknown errors may occur when you remove nodes. Before you remove nodes, back up the data on the nodes.
     * *   Nodes remain in the Unschedulable state when they are being removed.
     * *   You can remove only worker nodes. You cannot remove master nodes.
     * 
     * @param request the request parameters of RemoveClusterNodes  RemoveClusterNodesRequest
     * @return RemoveClusterNodesResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<RemoveClusterNodesResponse> removeClusterNodes(RemoveClusterNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveClusterNodes").setMethod(HttpMethod.POST).setPathRegex("/api/v2/clusters/{ClusterId}/nodes/remove").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveClusterNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveClusterNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  When you remove a node, the pods on the node are migrated to other nodes. This may cause service interruptions. We recommend that you remove nodes during off-peak hours.</p>
     * <ul>
     * <li>The operation may have unexpected risks. Back up the data before you perform this operation.</li>
     * <li>Nodes remain in the Unschedulable state when they are being removed.</li>
     * <li>The system removes only worker nodes. It does not remove master nodes.</li>
     * <li>Even if you set the <code>release_node</code> parameter to <code>true</code>, subscription nodes are not released. You must release the subscription nodes in the <a href="https://ecs.console.aliyun.com/">ECS console</a> after you remove the nodes.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveNodePoolNodes  RemoveNodePoolNodesRequest
     * @return RemoveNodePoolNodesResponse
     */
    @Override
    public CompletableFuture<RemoveNodePoolNodesResponse> removeNodePoolNodes(RemoveNodePoolNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveNodePoolNodes").setMethod(HttpMethod.DELETE).setPathRegex("/clusters/{ClusterId}/nodepools/{NodepoolId}/nodes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveNodePoolNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveNodePoolNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RepairClusterNodePool  RepairClusterNodePoolRequest
     * @return RepairClusterNodePoolResponse
     */
    @Override
    public CompletableFuture<RepairClusterNodePoolResponse> repairClusterNodePool(RepairClusterNodePoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RepairClusterNodePool").setMethod(HttpMethod.POST).setPathRegex("/clusters/{cluster_id}/nodepools/{nodepool_id}/repair").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RepairClusterNodePoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RepairClusterNodePoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ResumeComponentUpgrade is deprecated, please use CS::2015-12-15::ResumeTask instead.  * @param request  the request parameters of ResumeComponentUpgrade  ResumeComponentUpgradeRequest
     * @return ResumeComponentUpgradeResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ResumeComponentUpgradeResponse> resumeComponentUpgrade(ResumeComponentUpgradeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResumeComponentUpgrade").setMethod(HttpMethod.POST).setPathRegex("/clusters/{clusterid}/components/{componentid}/resume").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeComponentUpgradeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeComponentUpgradeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResumeTask  ResumeTaskRequest
     * @return ResumeTaskResponse
     */
    @Override
    public CompletableFuture<ResumeTaskResponse> resumeTask(ResumeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResumeTask").setMethod(HttpMethod.POST).setPathRegex("/tasks/{task_id}/resume").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ResumeUpgradeCluster is deprecated, please use CS::2015-12-15::ResumeTask instead.  * @param request  the request parameters of ResumeUpgradeCluster  ResumeUpgradeClusterRequest
     * @return ResumeUpgradeClusterResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ResumeUpgradeClusterResponse> resumeUpgradeCluster(ResumeUpgradeClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResumeUpgradeCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v2/clusters/{ClusterId}/upgrade/resume").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResumeUpgradeClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResumeUpgradeClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeK8sClusterKubeConfig  RevokeK8sClusterKubeConfigRequest
     * @return RevokeK8sClusterKubeConfigResponse
     */
    @Override
    public CompletableFuture<RevokeK8sClusterKubeConfigResponse> revokeK8sClusterKubeConfig(RevokeK8sClusterKubeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeK8sClusterKubeConfig").setMethod(HttpMethod.DELETE).setPathRegex("/k8s/{ClusterId}/certs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeK8sClusterKubeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeK8sClusterKubeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunClusterCheck  RunClusterCheckRequest
     * @return RunClusterCheckResponse
     */
    @Override
    public CompletableFuture<RunClusterCheckResponse> runClusterCheck(RunClusterCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunClusterCheck").setMethod(HttpMethod.POST).setPathRegex("/clusters/{cluster_id}/checks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunClusterCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunClusterCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ScaleCluster is deprecated, please use CS::2015-12-15::ModifyClusterNodePool instead.  * @param request  the request parameters of ScaleCluster  ScaleClusterRequest
     * @return ScaleClusterResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<ScaleClusterResponse> scaleCluster(ScaleClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScaleCluster").setMethod(HttpMethod.PUT).setPathRegex("/clusters/{ClusterId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ScaleClusterNodePool  ScaleClusterNodePoolRequest
     * @return ScaleClusterNodePoolResponse
     */
    @Override
    public CompletableFuture<ScaleClusterNodePoolResponse> scaleClusterNodePool(ScaleClusterNodePoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScaleClusterNodePool").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/nodepools/{NodepoolId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleClusterNodePoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleClusterNodePoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>****The ScaleOutCluster API operation is phased out. You must call the node pool-related API operations to manage nodes. If you want to add worker nodes to a Container Service for Kubernetes (ACK) cluster, call the ScaleClusterNodePool API operation. For more information, see <a href="https://help.aliyun.com/document_detail/184928.html">ScaleClusterNodePool</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ScaleOutCluster  ScaleOutClusterRequest
     * @return ScaleOutClusterResponse
     */
    @Override
    public CompletableFuture<ScaleOutClusterResponse> scaleOutCluster(ScaleOutClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScaleOutCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v2/clusters/{ClusterId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScaleOutClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScaleOutClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ScanClusterVuls  ScanClusterVulsRequest
     * @return ScanClusterVulsResponse
     */
    @Override
    public CompletableFuture<ScanClusterVulsResponse> scanClusterVuls(ScanClusterVulsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ScanClusterVuls").setMethod(HttpMethod.POST).setPathRegex("/clusters/{cluster_id}/vuls/scan").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScanClusterVulsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScanClusterVulsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartAlert  StartAlertRequest
     * @return StartAlertResponse
     */
    @Override
    public CompletableFuture<StartAlertResponse> startAlert(StartAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartAlert").setMethod(HttpMethod.POST).setPathRegex("/alert/{ClusterId}/alert_rule/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopAlert  StopAlertRequest
     * @return StopAlertResponse
     */
    @Override
    public CompletableFuture<StopAlertResponse> stopAlert(StopAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopAlert").setMethod(HttpMethod.POST).setPathRegex("/alert/{ClusterId}/alert_rule/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncClusterNodePool  SyncClusterNodePoolRequest
     * @return SyncClusterNodePoolResponse
     */
    @Override
    public CompletableFuture<SyncClusterNodePoolResponse> syncClusterNodePool(SyncClusterNodePoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncClusterNodePool").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/sync_nodepools").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncClusterNodePoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncClusterNodePoolResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TagResources").setMethod(HttpMethod.PUT).setPathRegex("/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnInstallClusterAddons  UnInstallClusterAddonsRequest
     * @return UnInstallClusterAddonsResponse
     */
    @Override
    public CompletableFuture<UnInstallClusterAddonsResponse> unInstallClusterAddons(UnInstallClusterAddonsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UnInstallClusterAddons").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/components/uninstall").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnInstallClusterAddonsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnInstallClusterAddonsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UntagResources").setMethod(HttpMethod.DELETE).setPathRegex("/tags").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <p>Before you call this operation, ensure that you understand the billing methods and pricing of <a href="https://www.alibabacloud.com/product/log-service/pricing">Simple Log Service</a>.</p>
     * 
     * @param request the request parameters of UpdateClusterAuditLogConfig  UpdateClusterAuditLogConfigRequest
     * @return UpdateClusterAuditLogConfigResponse
     */
    @Override
    public CompletableFuture<UpdateClusterAuditLogConfigResponse> updateClusterAuditLogConfig(UpdateClusterAuditLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateClusterAuditLogConfig").setMethod(HttpMethod.PUT).setPathRegex("/clusters/{clusterid}/audit_log").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClusterAuditLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClusterAuditLogConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateContactGroupForAlert  UpdateContactGroupForAlertRequest
     * @return UpdateContactGroupForAlertResponse
     */
    @Override
    public CompletableFuture<UpdateContactGroupForAlertResponse> updateContactGroupForAlert(UpdateContactGroupForAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateContactGroupForAlert").setMethod(HttpMethod.POST).setPathRegex("/alert/{ClusterId}/alert_rule/contact_groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContactGroupForAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContactGroupForAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateControlPlaneLog  UpdateControlPlaneLogRequest
     * @return UpdateControlPlaneLogResponse
     */
    @Override
    public CompletableFuture<UpdateControlPlaneLogResponse> updateControlPlaneLog(UpdateControlPlaneLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateControlPlaneLog").setMethod(HttpMethod.PUT).setPathRegex("/clusters/{ClusterId}/controlplanelog").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateControlPlaneLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateControlPlaneLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only with an Alibaba Cloud account.</p>
     * <ul>
     * <li>If the kubeconfig file used by your cluster is revoked, the custom validity period of the kubeconfig file is reset. In this case, you need to call this API operation to reconfigure the validity period of the kubeconfig file.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateK8sClusterUserConfigExpire  UpdateK8sClusterUserConfigExpireRequest
     * @return UpdateK8sClusterUserConfigExpireResponse
     */
    @Override
    public CompletableFuture<UpdateK8sClusterUserConfigExpireResponse> updateK8sClusterUserConfigExpire(UpdateK8sClusterUserConfigExpireRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateK8sClusterUserConfigExpire").setMethod(HttpMethod.POST).setPathRegex("/k8s/{ClusterId}/user_config/expire").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateK8sClusterUserConfigExpireResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateK8sClusterUserConfigExpireResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateResourcesDeleteProtection  UpdateResourcesDeleteProtectionRequest
     * @return UpdateResourcesDeleteProtectionResponse
     */
    @Override
    public CompletableFuture<UpdateResourcesDeleteProtectionResponse> updateResourcesDeleteProtection(UpdateResourcesDeleteProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResourcesDeleteProtection").setMethod(HttpMethod.PUT).setPathRegex("/clusters/{ClusterId}/resources/protection").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourcesDeleteProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourcesDeleteProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTemplate  UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateTemplateResponse> updateTemplate(UpdateTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTemplate").setMethod(HttpMethod.PUT).setPathRegex("/templates/{TemplateId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Precautions</em>*:</p>
     * <ul>
     * <li>You can update the permissions of a RAM user or RAM role on a cluster by using full update or incremental update. If you use full update, the existing permissions of the RAM user or RAM role on the cluster are overwritten. You must specify all the permissions that you want to grant to the RAM user or RAM role in the request parameters when you call the operation. If you use incremental update, you can grant permissions to or revoke permissions from the RAM user or RAM role on the cluster. In this case, only the permissions that you specify in the request parameters when you call the operation are granted or revoked, other permissions of the RAM user or RAM role on the cluster are not affected.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateUserPermissions  UpdateUserPermissionsRequest
     * @return UpdateUserPermissionsResponse
     */
    @Override
    public CompletableFuture<UpdateUserPermissionsResponse> updateUserPermissions(UpdateUserPermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateUserPermissions").setMethod(HttpMethod.POST).setPathRegex("/permissions/users/{uid}/update").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserPermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserPermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After successfully calling the UpgradeCluster interface, this API returns the <code>task_id</code> of the upgrade task. You can manage this operation task by calling the following task APIs:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/2667985.html">Call DescribeTaskInfo to query task details</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2667986.html">Call PauseTask to pause a running task</a> </li>
     * <li><a href="https://help.aliyun.com/document_detail/2667987.html">Call ResumeTask to resume a task that has been paused</a> </li>
     * <li><a href="https://help.aliyun.com/document_detail/2667988.html">Call CancelTask to cancel a running task</a></li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeCluster  UpgradeClusterRequest
     * @return UpgradeClusterResponse
     */
    @Override
    public CompletableFuture<UpgradeClusterResponse> upgradeCluster(UpgradeClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v2/clusters/{ClusterId}/upgrade").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeClusterAddons  UpgradeClusterAddonsRequest
     * @return UpgradeClusterAddonsResponse
     */
    @Override
    public CompletableFuture<UpgradeClusterAddonsResponse> upgradeClusterAddons(UpgradeClusterAddonsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeClusterAddons").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/components/upgrade").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeClusterAddonsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeClusterAddonsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to update the Kubernetes version, OS version, or container runtime version of the nodes in a node pool.</p>
     * 
     * @param request the request parameters of UpgradeClusterNodepool  UpgradeClusterNodepoolRequest
     * @return UpgradeClusterNodepoolResponse
     */
    @Override
    public CompletableFuture<UpgradeClusterNodepoolResponse> upgradeClusterNodepool(UpgradeClusterNodepoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeClusterNodepool").setMethod(HttpMethod.POST).setPathRegex("/clusters/{ClusterId}/nodepools/{NodepoolId}/upgrade").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeClusterNodepoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeClusterNodepoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
