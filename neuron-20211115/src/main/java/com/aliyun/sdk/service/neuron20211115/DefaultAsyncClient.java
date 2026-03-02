// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.neuron20211115.models.*;
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
        this.product = "neuron";
        this.version = "2021-11-15";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-northeast-1", "neuron.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "neuron.aliyuncs.com"),
            new TeaPair("ap-south-1", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "neuron.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-chengdu", "neuron.aliyuncs.com"),
            new TeaPair("cn-edge-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-fujian", "neuron.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "neuron.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "neuron.aliyuncs.com"),
            new TeaPair("cn-hongkong", "neuron.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "neuron.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "neuron.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-qingdao", "neuron.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "neuron.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "neuron.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-wuhan", "neuron.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "neuron.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "neuron.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "neuron.aliyuncs.com"),
            new TeaPair("eu-central-1", "neuron.aliyuncs.com"),
            new TeaPair("eu-west-1", "neuron.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "neuron.aliyuncs.com"),
            new TeaPair("me-east-1", "neuron.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "neuron.aliyuncs.com"),
            new TeaPair("us-east-1", "neuron.aliyuncs.com"),
            new TeaPair("us-west-1", "neuron.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddOrQuitPdpLaneForServiceGroup  AddOrQuitPdpLaneForServiceGroupRequest
     * @return AddOrQuitPdpLaneForServiceGroupResponse
     */
    @Override
    public CompletableFuture<AddOrQuitPdpLaneForServiceGroupResponse> addOrQuitPdpLaneForServiceGroup(AddOrQuitPdpLaneForServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddOrQuitPdpLaneForServiceGroup").setMethod(HttpMethod.PUT).setPathRegex("/pdp-pbc/v1/lanes/commands/add-quit-lane").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddOrQuitPdpLaneForServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddOrQuitPdpLaneForServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuditForkReview  AuditForkReviewRequest
     * @return AuditForkReviewResponse
     */
    @Override
    public CompletableFuture<AuditForkReviewResponse> auditForkReview(AuditForkReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuditForkReview").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/fork-reviews/{reviewId}/commands/audit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuditForkReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuditForkReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuditPbcInvokeReview  AuditPbcInvokeReviewRequest
     * @return AuditPbcInvokeReviewResponse
     */
    @Override
    public CompletableFuture<AuditPbcInvokeReviewResponse> auditPbcInvokeReview(AuditPbcInvokeReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuditPbcInvokeReview").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/pbc-invoke-reviews/{reviewId}/commands/audit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuditPbcInvokeReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuditPbcInvokeReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AuthorizeProducts  AuthorizeProductsRequest
     * @return AuthorizeProductsResponse
     */
    @Override
    public CompletableFuture<AuthorizeProductsResponse> authorizeProducts(AuthorizeProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuthorizeProducts").setMethod(HttpMethod.PUT).setPathRegex("/pdp-pbc/v1/products/commands/authorize").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGrantRolesToDeveloper  BatchGrantRolesToDeveloperRequest
     * @return BatchGrantRolesToDeveloperResponse
     */
    @Override
    public CompletableFuture<BatchGrantRolesToDeveloperResponse> batchGrantRolesToDeveloper(BatchGrantRolesToDeveloperRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchGrantRolesToDeveloper").setMethod(HttpMethod.PUT).setPathRegex("/manager/v1/roles/commands/batch-grant-roles").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGrantRolesToDeveloperResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGrantRolesToDeveloperResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckDeveloperRole  CheckDeveloperRoleRequest
     * @return CheckDeveloperRoleResponse
     */
    @Override
    public CompletableFuture<CheckDeveloperRoleResponse> checkDeveloperRole(CheckDeveloperRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckDeveloperRole").setMethod(HttpMethod.POST).setPathRegex("/manager/v1/roles/commands/check-role").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckDeveloperRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckDeveloperRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CompleteRegisterLibrary  CompleteRegisterLibraryRequest
     * @return CompleteRegisterLibraryResponse
     */
    @Override
    public CompletableFuture<CompleteRegisterLibraryResponse> completeRegisterLibrary(CompleteRegisterLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CompleteRegisterLibrary").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/librarys/{id}/commands/complete-register").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompleteRegisterLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompleteRegisterLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CompleteRegistrationPbcVersion  CompleteRegistrationPbcVersionRequest
     * @return CompleteRegistrationPbcVersionResponse
     */
    @Override
    public CompletableFuture<CompleteRegistrationPbcVersionResponse> completeRegistrationPbcVersion(CompleteRegistrationPbcVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CompleteRegistrationPbcVersion").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/pbc-versions/{id}/commands/complete-register").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompleteRegistrationPbcVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompleteRegistrationPbcVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ContinueDeployment  ContinueDeploymentRequest
     * @return ContinueDeploymentResponse
     */
    @Override
    public CompletableFuture<ContinueDeploymentResponse> continueDeployment(ContinueDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ContinueDeployment").setMethod(HttpMethod.PUT).setPathRegex("/pdp-service/v1/deployments/commands/continue").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ContinueDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ContinueDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAssetWatch  CreateAssetWatchRequest
     * @return CreateAssetWatchResponse
     */
    @Override
    public CompletableFuture<CreateAssetWatchResponse> createAssetWatch(CreateAssetWatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAssetWatch").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/asset-watchs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAssetWatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAssetWatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateComponent  CreateComponentRequest
     * @return CreateComponentResponse
     */
    @Override
    public CompletableFuture<CreateComponentResponse> createComponent(CreateComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateComponent").setMethod(HttpMethod.POST).setPathRegex("/pdp-resource/v1/components").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateComponentTemplate  CreateComponentTemplateRequest
     * @return CreateComponentTemplateResponse
     */
    @Override
    public CompletableFuture<CreateComponentTemplateResponse> createComponentTemplate(CreateComponentTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateComponentTemplate").setMethod(HttpMethod.POST).setPathRegex("/pdp-resource/v1/component-templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComponentTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComponentTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDeveloper  CreateDeveloperRequest
     * @return CreateDeveloperResponse
     */
    @Override
    public CompletableFuture<CreateDeveloperResponse> createDeveloper(CreateDeveloperRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDeveloper").setMethod(HttpMethod.POST).setPathRegex("/manager/v1/developers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeveloperResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeveloperResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEnterprise  CreateEnterpriseRequest
     * @return CreateEnterpriseResponse
     */
    @Override
    public CompletableFuture<CreateEnterpriseResponse> createEnterprise(CreateEnterpriseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateEnterprise").setMethod(HttpMethod.POST).setPathRegex("/manager/v1/enterprises").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEnterpriseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEnterpriseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateForkReview  CreateForkReviewRequest
     * @return CreateForkReviewResponse
     */
    @Override
    public CompletableFuture<CreateForkReviewResponse> createForkReview(CreateForkReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateForkReview").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/fork-reviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateForkReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateForkReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateGreyPdpServiceGroup  CreateGreyPdpServiceGroupRequest
     * @return CreateGreyPdpServiceGroupResponse
     */
    @Override
    public CompletableFuture<CreateGreyPdpServiceGroupResponse> createGreyPdpServiceGroup(CreateGreyPdpServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateGreyPdpServiceGroup").setMethod(HttpMethod.POST).setPathRegex("/pdp-service/v1/groups/grey").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGreyPdpServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGreyPdpServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLibrary  CreateLibraryRequest
     * @return CreateLibraryResponse
     */
    @Override
    public CompletableFuture<CreateLibraryResponse> createLibrary(CreateLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLibrary").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/librarys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLibraryInstruction  CreateLibraryInstructionRequest
     * @return CreateLibraryInstructionResponse
     */
    @Override
    public CompletableFuture<CreateLibraryInstructionResponse> createLibraryInstruction(CreateLibraryInstructionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLibraryInstruction").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/librarys/{libraryId}/instructions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLibraryInstructionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLibraryInstructionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLibraryReview  CreateLibraryReviewRequest
     * @return CreateLibraryReviewResponse
     */
    @Override
    public CompletableFuture<CreateLibraryReviewResponse> createLibraryReview(CreateLibraryReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLibraryReview").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/library-reviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLibraryReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLibraryReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLibrarySchema  CreateLibrarySchemaRequest
     * @return CreateLibrarySchemaResponse
     */
    @Override
    public CompletableFuture<CreateLibrarySchemaResponse> createLibrarySchema(CreateLibrarySchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLibrarySchema").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/librarys/schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLibrarySchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLibrarySchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorArmsAlert  CreateMonitorArmsAlertRequest
     * @return CreateMonitorArmsAlertResponse
     */
    @Override
    public CompletableFuture<CreateMonitorArmsAlertResponse> createMonitorArmsAlert(CreateMonitorArmsAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMonitorArmsAlert").setMethod(HttpMethod.POST).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/createMonitorArmsAlert").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorArmsAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorArmsAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorArmsAlerts  CreateMonitorArmsAlertsRequest
     * @return CreateMonitorArmsAlertsResponse
     */
    @Override
    public CompletableFuture<CreateMonitorArmsAlertsResponse> createMonitorArmsAlerts(CreateMonitorArmsAlertsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMonitorArmsAlerts").setMethod(HttpMethod.POST).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/createMonitorArmsAlerts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorArmsAlertsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorArmsAlertsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorContact  CreateMonitorContactRequest
     * @return CreateMonitorContactResponse
     */
    @Override
    public CompletableFuture<CreateMonitorContactResponse> createMonitorContact(CreateMonitorContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMonitorContact").setMethod(HttpMethod.POST).setPathRegex("/pdp-monitor/v1/monitor/contact").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorContactGroup  CreateMonitorContactGroupRequest
     * @return CreateMonitorContactGroupResponse
     */
    @Override
    public CompletableFuture<CreateMonitorContactGroupResponse> createMonitorContactGroup(CreateMonitorContactGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMonitorContactGroup").setMethod(HttpMethod.POST).setPathRegex("/pdp-monitor/v1/monitor/group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorContactGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorContactGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorGroupMember  CreateMonitorGroupMemberRequest
     * @return CreateMonitorGroupMemberResponse
     */
    @Override
    public CompletableFuture<CreateMonitorGroupMemberResponse> createMonitorGroupMember(CreateMonitorGroupMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMonitorGroupMember").setMethod(HttpMethod.POST).setPathRegex("/pdp-monitor/v1/monitor/group/{groupId}/commands/create-member").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorGroupMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorGroupMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorMqAlert  CreateMonitorMqAlertRequest
     * @return CreateMonitorMqAlertResponse
     */
    @Override
    public CompletableFuture<CreateMonitorMqAlertResponse> createMonitorMqAlert(CreateMonitorMqAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMonitorMqAlert").setMethod(HttpMethod.POST).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/createMonitorMqAlert").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorMqAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorMqAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorMqAlerts  CreateMonitorMqAlertsRequest
     * @return CreateMonitorMqAlertsResponse
     */
    @Override
    public CompletableFuture<CreateMonitorMqAlertsResponse> createMonitorMqAlerts(CreateMonitorMqAlertsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMonitorMqAlerts").setMethod(HttpMethod.POST).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/createMonitorMqAlerts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorMqAlertsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorMqAlertsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorSlsAlert  CreateMonitorSlsAlertRequest
     * @return CreateMonitorSlsAlertResponse
     */
    @Override
    public CompletableFuture<CreateMonitorSlsAlertResponse> createMonitorSlsAlert(CreateMonitorSlsAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMonitorSlsAlert").setMethod(HttpMethod.POST).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/createMonitorSlsAlert").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorSlsAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorSlsAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorSlsAlerts  CreateMonitorSlsAlertsRequest
     * @return CreateMonitorSlsAlertsResponse
     */
    @Override
    public CompletableFuture<CreateMonitorSlsAlertsResponse> createMonitorSlsAlerts(CreateMonitorSlsAlertsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMonitorSlsAlerts").setMethod(HttpMethod.POST).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/createMonitorSlsAlerts").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorSlsAlertsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorSlsAlertsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMonitorWebhook  CreateMonitorWebhookRequest
     * @return CreateMonitorWebhookResponse
     */
    @Override
    public CompletableFuture<CreateMonitorWebhookResponse> createMonitorWebhook(CreateMonitorWebhookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMonitorWebhook").setMethod(HttpMethod.POST).setPathRegex("/pdp-monitor/v1/monitor/webhook").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMonitorWebhookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMonitorWebhookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMqGroup  CreateMqGroupRequest
     * @return CreateMqGroupResponse
     */
    @Override
    public CompletableFuture<CreateMqGroupResponse> createMqGroup(CreateMqGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMqGroup").setMethod(HttpMethod.POST).setPathRegex("/pdp-pbc/v1/mq/group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMqGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMqGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMqTopic  CreateMqTopicRequest
     * @return CreateMqTopicResponse
     */
    @Override
    public CompletableFuture<CreateMqTopicResponse> createMqTopic(CreateMqTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMqTopic").setMethod(HttpMethod.POST).setPathRegex("/pdp-pbc/v1/mq/topic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMqTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMqTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePbc  CreatePbcRequest
     * @return CreatePbcResponse
     */
    @Override
    public CompletableFuture<CreatePbcResponse> createPbc(CreatePbcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePbc").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/pbcs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePbcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePbcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePbcApiSchema  CreatePbcApiSchemaRequest
     * @return CreatePbcApiSchemaResponse
     */
    @Override
    public CompletableFuture<CreatePbcApiSchemaResponse> createPbcApiSchema(CreatePbcApiSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePbcApiSchema").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/pbc-versions/api-schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePbcApiSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePbcApiSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePbcInstruction  CreatePbcInstructionRequest
     * @return CreatePbcInstructionResponse
     */
    @Override
    public CompletableFuture<CreatePbcInstructionResponse> createPbcInstruction(CreatePbcInstructionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePbcInstruction").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/pbc-versions/instructions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePbcInstructionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePbcInstructionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePbcInvoke  CreatePbcInvokeRequest
     * @return CreatePbcInvokeResponse
     */
    @Override
    public CompletableFuture<CreatePbcInvokeResponse> createPbcInvoke(CreatePbcInvokeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePbcInvoke").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/pbc-invokes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePbcInvokeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePbcInvokeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePbcInvokeReview  CreatePbcInvokeReviewRequest
     * @return CreatePbcInvokeReviewResponse
     */
    @Override
    public CompletableFuture<CreatePbcInvokeReviewResponse> createPbcInvokeReview(CreatePbcInvokeReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePbcInvokeReview").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/pbc-invoke-reviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePbcInvokeReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePbcInvokeReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePbcReview  CreatePbcReviewRequest
     * @return CreatePbcReviewResponse
     */
    @Override
    public CompletableFuture<CreatePbcReviewResponse> createPbcReview(CreatePbcReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePbcReview").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/pbc-reviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePbcReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePbcReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePbcSchema  CreatePbcSchemaRequest
     * @return CreatePbcSchemaResponse
     */
    @Override
    public CompletableFuture<CreatePbcSchemaResponse> createPbcSchema(CreatePbcSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePbcSchema").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/pbc-versions/schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePbcSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePbcSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePbcVersion  CreatePbcVersionRequest
     * @return CreatePbcVersionResponse
     */
    @Override
    public CompletableFuture<CreatePbcVersionResponse> createPbcVersion(CreatePbcVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePbcVersion").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/pbc-versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePbcVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePbcVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePdpConfig  CreatePdpConfigRequest
     * @return CreatePdpConfigResponse
     */
    @Override
    public CompletableFuture<CreatePdpConfigResponse> createPdpConfig(CreatePdpConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePdpConfig").setMethod(HttpMethod.POST).setPathRegex("/pdp-service/v1/configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePdpConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePdpConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePdpLane  CreatePdpLaneRequest
     * @return CreatePdpLaneResponse
     */
    @Override
    public CompletableFuture<CreatePdpLaneResponse> createPdpLane(CreatePdpLaneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePdpLane").setMethod(HttpMethod.POST).setPathRegex("/pdp-pbc/v1/lanes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePdpLaneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePdpLaneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePdpPbc  CreatePdpPbcRequest
     * @return CreatePdpPbcResponse
     */
    @Override
    public CompletableFuture<CreatePdpPbcResponse> createPdpPbc(CreatePdpPbcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePdpPbc").setMethod(HttpMethod.POST).setPathRegex("/pdp-pbc/v1/pbcs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePdpPbcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePdpPbcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePdpService  CreatePdpServiceRequest
     * @return CreatePdpServiceResponse
     */
    @Override
    public CompletableFuture<CreatePdpServiceResponse> createPdpService(CreatePdpServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePdpService").setMethod(HttpMethod.POST).setPathRegex("/pdp-service/v1/services").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePdpServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePdpServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePdpServiceGroup  CreatePdpServiceGroupRequest
     * @return CreatePdpServiceGroupResponse
     */
    @Override
    public CompletableFuture<CreatePdpServiceGroupResponse> createPdpServiceGroup(CreatePdpServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePdpServiceGroup").setMethod(HttpMethod.POST).setPathRegex("/pdp-service/v1/groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePdpServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePdpServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePrivilege  CreatePrivilegeRequest
     * @return CreatePrivilegeResponse
     */
    @Override
    public CompletableFuture<CreatePrivilegeResponse> createPrivilege(CreatePrivilegeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePrivilege").setMethod(HttpMethod.POST).setPathRegex("/manager/v1/roles/{roleId}/privileges").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePrivilegeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePrivilegeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePrivilegePop  CreatePrivilegePopRequest
     * @return CreatePrivilegePopResponse
     */
    @Override
    public CompletableFuture<CreatePrivilegePopResponse> createPrivilegePop(CreatePrivilegePopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreatePrivilegePop").setMethod(HttpMethod.POST).setPathRegex("/manager/v1/roles/{roleId}/privileges/pop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePrivilegePopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePrivilegePopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProduct  CreateProductRequest
     * @return CreateProductResponse
     */
    @Override
    public CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProduct").setMethod(HttpMethod.POST).setPathRegex("/pdp-pbc/v1/products").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRepoFork  CreateRepoForkRequest
     * @return CreateRepoForkResponse
     */
    @Override
    public CompletableFuture<CreateRepoForkResponse> createRepoFork(CreateRepoForkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRepoFork").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/repo-forks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRepoForkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRepoForkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateResource  CreateResourceRequest
     * @return CreateResourceResponse
     */
    @Override
    public CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateResource").setMethod(HttpMethod.POST).setPathRegex("/pdp-resource/v1/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRole  CreateRoleRequest
     * @return CreateRoleResponse
     */
    @Override
    public CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateRole").setMethod(HttpMethod.POST).setPathRegex("/manager/v1/roles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSettled  CreateSettledRequest
     * @return CreateSettledResponse
     */
    @Override
    public CompletableFuture<CreateSettledResponse> createSettled(CreateSettledRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSettled").setMethod(HttpMethod.POST).setPathRegex("/manager/v1/settleds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSettledResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSettledResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteComponent  DeleteComponentRequest
     * @return DeleteComponentResponse
     */
    @Override
    public CompletableFuture<DeleteComponentResponse> deleteComponent(DeleteComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteComponent").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-resource/v1/components/{id}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteComponentTemplate  DeleteComponentTemplateRequest
     * @return DeleteComponentTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteComponentTemplateResponse> deleteComponentTemplate(DeleteComponentTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteComponentTemplate").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-resource/v1/component-templates/{id}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteComponentTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteComponentTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDeveloper  DeleteDeveloperRequest
     * @return DeleteDeveloperResponse
     */
    @Override
    public CompletableFuture<DeleteDeveloperResponse> deleteDeveloper(DeleteDeveloperRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDeveloper").setMethod(HttpMethod.DELETE).setPathRegex("/manager/v1/developers/{accountId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeveloperResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeveloperResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEnterprise  DeleteEnterpriseRequest
     * @return DeleteEnterpriseResponse
     */
    @Override
    public CompletableFuture<DeleteEnterpriseResponse> deleteEnterprise(DeleteEnterpriseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteEnterprise").setMethod(HttpMethod.DELETE).setPathRegex("/manager/v1/enterprises/{enterpriseId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEnterpriseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEnterpriseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLibrary  DeleteLibraryRequest
     * @return DeleteLibraryResponse
     */
    @Override
    public CompletableFuture<DeleteLibraryResponse> deleteLibrary(DeleteLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLibrary").setMethod(HttpMethod.DELETE).setPathRegex("/catalog/v1/librarys/{id}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLibraryInstruction  DeleteLibraryInstructionRequest
     * @return DeleteLibraryInstructionResponse
     */
    @Override
    public CompletableFuture<DeleteLibraryInstructionResponse> deleteLibraryInstruction(DeleteLibraryInstructionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLibraryInstruction").setMethod(HttpMethod.DELETE).setPathRegex("/catalog/v1/librarys/{libraryId}/instructions").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLibraryInstructionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLibraryInstructionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLibrarySchema  DeleteLibrarySchemaRequest
     * @return DeleteLibrarySchemaResponse
     */
    @Override
    public CompletableFuture<DeleteLibrarySchemaResponse> deleteLibrarySchema(DeleteLibrarySchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLibrarySchema").setMethod(HttpMethod.DELETE).setPathRegex("/catalog/v1/librarys/{libraryId}/schemas").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLibrarySchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLibrarySchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitorAlert  DeleteMonitorAlertRequest
     * @return DeleteMonitorAlertResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorAlertResponse> deleteMonitorAlert(DeleteMonitorAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMonitorAlert").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-monitor/v1/monitor/alert/{id}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitorContact  DeleteMonitorContactRequest
     * @return DeleteMonitorContactResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorContactResponse> deleteMonitorContact(DeleteMonitorContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMonitorContact").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-monitor/v1/monitor/contact/{contactId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitorContactGroup  DeleteMonitorContactGroupRequest
     * @return DeleteMonitorContactGroupResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorContactGroupResponse> deleteMonitorContactGroup(DeleteMonitorContactGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMonitorContactGroup").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-monitor/v1/monitor/group/{groupId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorContactGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorContactGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitorGroupMember  DeleteMonitorGroupMemberRequest
     * @return DeleteMonitorGroupMemberResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorGroupMemberResponse> deleteMonitorGroupMember(DeleteMonitorGroupMemberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMonitorGroupMember").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-monitor/v1/monitor/group/{groupId}/commands/delete-member").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorGroupMemberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorGroupMemberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMonitorWebhook  DeleteMonitorWebhookRequest
     * @return DeleteMonitorWebhookResponse
     */
    @Override
    public CompletableFuture<DeleteMonitorWebhookResponse> deleteMonitorWebhook(DeleteMonitorWebhookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMonitorWebhook").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-monitor/v1/monitor/webhook/{webhookId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMonitorWebhookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMonitorWebhookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMqGroup  DeleteMqGroupRequest
     * @return DeleteMqGroupResponse
     */
    @Override
    public CompletableFuture<DeleteMqGroupResponse> deleteMqGroup(DeleteMqGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMqGroup").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-pbc/v1/mq/group/{groupId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMqGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMqGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMqTopic  DeleteMqTopicRequest
     * @return DeleteMqTopicResponse
     */
    @Override
    public CompletableFuture<DeleteMqTopicResponse> deleteMqTopic(DeleteMqTopicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMqTopic").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-pbc/v1/mq/topic/{topicId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMqTopicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMqTopicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePbcInvoke  DeletePbcInvokeRequest
     * @return DeletePbcInvokeResponse
     */
    @Override
    public CompletableFuture<DeletePbcInvokeResponse> deletePbcInvoke(DeletePbcInvokeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePbcInvoke").setMethod(HttpMethod.DELETE).setPathRegex("/catalog/v1/pbc-invokes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePbcInvokeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePbcInvokeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePdpConfig  DeletePdpConfigRequest
     * @return DeletePdpConfigResponse
     */
    @Override
    public CompletableFuture<DeletePdpConfigResponse> deletePdpConfig(DeletePdpConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePdpConfig").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-service/v1/configs/{configId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePdpConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePdpConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePdpLane  DeletePdpLaneRequest
     * @return DeletePdpLaneResponse
     */
    @Override
    public CompletableFuture<DeletePdpLaneResponse> deletePdpLane(DeletePdpLaneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePdpLane").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-pbc/v1/lanes/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePdpLaneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePdpLaneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePdpLaneInletService  DeletePdpLaneInletServiceRequest
     * @return DeletePdpLaneInletServiceResponse
     */
    @Override
    public CompletableFuture<DeletePdpLaneInletServiceResponse> deletePdpLaneInletService(DeletePdpLaneInletServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePdpLaneInletService").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-pbc/v1/lanes/{laneId}/commands/deleted-inlet-service/{serviceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePdpLaneInletServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePdpLaneInletServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePdpLaneServiceGroup  DeletePdpLaneServiceGroupRequest
     * @return DeletePdpLaneServiceGroupResponse
     */
    @Override
    public CompletableFuture<DeletePdpLaneServiceGroupResponse> deletePdpLaneServiceGroup(DeletePdpLaneServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePdpLaneServiceGroup").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-pbc/v1/lanes/commands/deleted-service-group/{serviceGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePdpLaneServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePdpLaneServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePdpPbc  DeletePdpPbcRequest
     * @return DeletePdpPbcResponse
     */
    @Override
    public CompletableFuture<DeletePdpPbcResponse> deletePdpPbc(DeletePdpPbcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePdpPbc").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-pbc/v1/pbcs/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePdpPbcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePdpPbcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePdpService  DeletePdpServiceRequest
     * @return DeletePdpServiceResponse
     */
    @Override
    public CompletableFuture<DeletePdpServiceResponse> deletePdpService(DeletePdpServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePdpService").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-service/v1/services/{serviceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePdpServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePdpServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePdpServiceGroup  DeletePdpServiceGroupRequest
     * @return DeletePdpServiceGroupResponse
     */
    @Override
    public CompletableFuture<DeletePdpServiceGroupResponse> deletePdpServiceGroup(DeletePdpServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePdpServiceGroup").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-service/v1/groups/{serviceGroupId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePdpServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePdpServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePrivilege  DeletePrivilegeRequest
     * @return DeletePrivilegeResponse
     */
    @Override
    public CompletableFuture<DeletePrivilegeResponse> deletePrivilege(DeletePrivilegeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePrivilege").setMethod(HttpMethod.DELETE).setPathRegex("/manager/v1/roles/privileges/{privilegeId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePrivilegeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePrivilegeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProduct  DeleteProductRequest
     * @return DeleteProductResponse
     */
    @Override
    public CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProduct").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-pbc/v1/products/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteResource  DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    @Override
    public CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteResource").setMethod(HttpMethod.DELETE).setPathRegex("/pdp-resource/v1/resources/{id}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteResourceResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteRole").setMethod(HttpMethod.DELETE).setPathRegex("/manager/v1/roles/{roleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSettled  DeleteSettledRequest
     * @return DeleteSettledResponse
     */
    @Override
    public CompletableFuture<DeleteSettledResponse> deleteSettled(DeleteSettledRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSettled").setMethod(HttpMethod.DELETE).setPathRegex("/manager/v1/settleds/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSettledResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSettledResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DependLibrary  DependLibraryRequest
     * @return DependLibraryResponse
     */
    @Override
    public CompletableFuture<DependLibraryResponse> dependLibrary(DependLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DependLibrary").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/librarys/{id}/commands/dependency").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DependLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DependLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FeedbackLibraryReview  FeedbackLibraryReviewRequest
     * @return FeedbackLibraryReviewResponse
     */
    @Override
    public CompletableFuture<FeedbackLibraryReviewResponse> feedbackLibraryReview(FeedbackLibraryReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FeedbackLibraryReview").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/library-reviews/{reviewId}/commands/feedback").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FeedbackLibraryReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FeedbackLibraryReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FeedbackPbcReview  FeedbackPbcReviewRequest
     * @return FeedbackPbcReviewResponse
     */
    @Override
    public CompletableFuture<FeedbackPbcReviewResponse> feedbackPbcReview(FeedbackPbcReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FeedbackPbcReview").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/pbc-reviews/{reviewId}/commands/feedback").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FeedbackPbcReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FeedbackPbcReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBucEnterprise  GetBucEnterpriseRequest
     * @return GetBucEnterpriseResponse
     */
    @Override
    public CompletableFuture<GetBucEnterpriseResponse> getBucEnterprise(GetBucEnterpriseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetBucEnterprise").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/bucs/enterprises/{enterpriseId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBucEnterpriseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBucEnterpriseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetComponent  GetComponentRequest
     * @return GetComponentResponse
     */
    @Override
    public CompletableFuture<GetComponentResponse> getComponent(GetComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetComponent").setMethod(HttpMethod.GET).setPathRegex("/pdp-resource/v1/components/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetComponentTemplate  GetComponentTemplateRequest
     * @return GetComponentTemplateResponse
     */
    @Override
    public CompletableFuture<GetComponentTemplateResponse> getComponentTemplate(GetComponentTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetComponentTemplate").setMethod(HttpMethod.GET).setPathRegex("/pdp-resource/v1/component-templates/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComponentTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComponentTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeployment  GetDeploymentRequest
     * @return GetDeploymentResponse
     */
    @Override
    public CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeployment").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/deployments/instance/{deploymentId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeveloper  GetDeveloperRequest
     * @return GetDeveloperResponse
     */
    @Override
    public CompletableFuture<GetDeveloperResponse> getDeveloper(GetDeveloperRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeveloper").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/developers/{accountId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeveloperResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeveloperResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDeveloperEnterprise  GetDeveloperEnterpriseRequest
     * @return GetDeveloperEnterpriseResponse
     */
    @Override
    public CompletableFuture<GetDeveloperEnterpriseResponse> getDeveloperEnterprise(GetDeveloperEnterpriseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDeveloperEnterprise").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/enterprises/developers/{account_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDeveloperEnterpriseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDeveloperEnterpriseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEnterprise  GetEnterpriseRequest
     * @return GetEnterpriseResponse
     */
    @Override
    public CompletableFuture<GetEnterpriseResponse> getEnterprise(GetEnterpriseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEnterprise").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/enterprises/{enterpriseId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEnterpriseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEnterpriseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEnterpriseDeveloper  GetEnterpriseDeveloperRequest
     * @return GetEnterpriseDeveloperResponse
     */
    @Override
    public CompletableFuture<GetEnterpriseDeveloperResponse> getEnterpriseDeveloper(GetEnterpriseDeveloperRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEnterpriseDeveloper").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/developers/{accountId}/enterprises/{enterpriseId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEnterpriseDeveloperResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEnterpriseDeveloperResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetForkReview  GetForkReviewRequest
     * @return GetForkReviewResponse
     */
    @Override
    public CompletableFuture<GetForkReviewResponse> getForkReview(GetForkReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetForkReview").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/fork-reviews/{reviewId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetForkReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetForkReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHistoryDeveloper  GetHistoryDeveloperRequest
     * @return GetHistoryDeveloperResponse
     */
    @Override
    public CompletableFuture<GetHistoryDeveloperResponse> getHistoryDeveloper(GetHistoryDeveloperRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHistoryDeveloper").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/developers/{accountId}/commonds/history").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHistoryDeveloperResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHistoryDeveloperResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLastDeploymentConfig  GetLastDeploymentConfigRequest
     * @return GetLastDeploymentConfigResponse
     */
    @Override
    public CompletableFuture<GetLastDeploymentConfigResponse> getLastDeploymentConfig(GetLastDeploymentConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLastDeploymentConfig").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/deployments/last-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLastDeploymentConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLastDeploymentConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLibrary  GetLibraryRequest
     * @return GetLibraryResponse
     */
    @Override
    public CompletableFuture<GetLibraryResponse> getLibrary(GetLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLibrary").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/librarys/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLibraryDeveloperRepoMetrics  GetLibraryDeveloperRepoMetricsRequest
     * @return GetLibraryDeveloperRepoMetricsResponse
     */
    @Override
    public CompletableFuture<GetLibraryDeveloperRepoMetricsResponse> getLibraryDeveloperRepoMetrics(GetLibraryDeveloperRepoMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLibraryDeveloperRepoMetrics").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/Librarys/{libraryId}/code/commands/get-developer-repo-metrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLibraryDeveloperRepoMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLibraryDeveloperRepoMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLibraryInstruction  GetLibraryInstructionRequest
     * @return GetLibraryInstructionResponse
     */
    @Override
    public CompletableFuture<GetLibraryInstructionResponse> getLibraryInstruction(GetLibraryInstructionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLibraryInstruction").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/librarys/{libraryId}/instructions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLibraryInstructionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLibraryInstructionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLibraryRepoMetrics  GetLibraryRepoMetricsRequest
     * @return GetLibraryRepoMetricsResponse
     */
    @Override
    public CompletableFuture<GetLibraryRepoMetricsResponse> getLibraryRepoMetrics(GetLibraryRepoMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLibraryRepoMetrics").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/Librarys/{libraryId}/code/commands/get-repo-metrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLibraryRepoMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLibraryRepoMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLibraryReview  GetLibraryReviewRequest
     * @return GetLibraryReviewResponse
     */
    @Override
    public CompletableFuture<GetLibraryReviewResponse> getLibraryReview(GetLibraryReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLibraryReview").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/library-reviews/{reviewId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLibraryReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLibraryReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLibrarySchema  GetLibrarySchemaRequest
     * @return GetLibrarySchemaResponse
     */
    @Override
    public CompletableFuture<GetLibrarySchemaResponse> getLibrarySchema(GetLibrarySchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLibrarySchema").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/librarys/{libraryId}/schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLibrarySchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLibrarySchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLogUrl  GetLogUrlRequest
     * @return GetLogUrlResponse
     */
    @Override
    public CompletableFuture<GetLogUrlResponse> getLogUrl(GetLogUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLogUrl").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/pdp-log/url").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLogUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLogUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLoginUserInfo  GetLoginUserInfoRequest
     * @return GetLoginUserInfoResponse
     */
    @Override
    public CompletableFuture<GetLoginUserInfoResponse> getLoginUserInfo(GetLoginUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLoginUserInfo").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/bucs/logins").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLoginUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLoginUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMonitorAlert  GetMonitorAlertRequest
     * @return GetMonitorAlertResponse
     */
    @Override
    public CompletableFuture<GetMonitorAlertResponse> getMonitorAlert(GetMonitorAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMonitorAlert").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/alert/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMonitorAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMonitorAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMonitorAlertHistory  GetMonitorAlertHistoryRequest
     * @return GetMonitorAlertHistoryResponse
     */
    @Override
    public CompletableFuture<GetMonitorAlertHistoryResponse> getMonitorAlertHistory(GetMonitorAlertHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMonitorAlertHistory").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/getMonitorAlertHistory").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMonitorAlertHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMonitorAlertHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMonitorContact  GetMonitorContactRequest
     * @return GetMonitorContactResponse
     */
    @Override
    public CompletableFuture<GetMonitorContactResponse> getMonitorContact(GetMonitorContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMonitorContact").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/contact/{contactId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMonitorContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMonitorContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMonitorContactGroup  GetMonitorContactGroupRequest
     * @return GetMonitorContactGroupResponse
     */
    @Override
    public CompletableFuture<GetMonitorContactGroupResponse> getMonitorContactGroup(GetMonitorContactGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMonitorContactGroup").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/group/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMonitorContactGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMonitorContactGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMonitorWebhook  GetMonitorWebhookRequest
     * @return GetMonitorWebhookResponse
     */
    @Override
    public CompletableFuture<GetMonitorWebhookResponse> getMonitorWebhook(GetMonitorWebhookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMonitorWebhook").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/webhook/{webhookId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMonitorWebhookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMonitorWebhookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPbc  GetPbcRequest
     * @return GetPbcResponse
     */
    @Override
    public CompletableFuture<GetPbcResponse> getPbc(GetPbcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPbc").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbcs/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPbcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPbcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPbcApiSchema  GetPbcApiSchemaRequest
     * @return GetPbcApiSchemaResponse
     */
    @Override
    public CompletableFuture<GetPbcApiSchemaResponse> getPbcApiSchema(GetPbcApiSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPbcApiSchema").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-versions/{pbcVersionId}/api-schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPbcApiSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPbcApiSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPbcDeveloperRepoMetrics  GetPbcDeveloperRepoMetricsRequest
     * @return GetPbcDeveloperRepoMetricsResponse
     */
    @Override
    public CompletableFuture<GetPbcDeveloperRepoMetricsResponse> getPbcDeveloperRepoMetrics(GetPbcDeveloperRepoMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPbcDeveloperRepoMetrics").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbcs/{pbcId}/code/commands/get-developer-repo-metrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPbcDeveloperRepoMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPbcDeveloperRepoMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPbcInstruction  GetPbcInstructionRequest
     * @return GetPbcInstructionResponse
     */
    @Override
    public CompletableFuture<GetPbcInstructionResponse> getPbcInstruction(GetPbcInstructionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPbcInstruction").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-versions/{pbcVersionId}/instructions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPbcInstructionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPbcInstructionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPbcInvokeReview  GetPbcInvokeReviewRequest
     * @return GetPbcInvokeReviewResponse
     */
    @Override
    public CompletableFuture<GetPbcInvokeReviewResponse> getPbcInvokeReview(GetPbcInvokeReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPbcInvokeReview").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-invoke-reviews/{reviewId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPbcInvokeReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPbcInvokeReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPbcRepoMetrics  GetPbcRepoMetricsRequest
     * @return GetPbcRepoMetricsResponse
     */
    @Override
    public CompletableFuture<GetPbcRepoMetricsResponse> getPbcRepoMetrics(GetPbcRepoMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPbcRepoMetrics").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbcs/{pbcId}/code/commands/get-repo-metrics").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPbcRepoMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPbcRepoMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPbcReview  GetPbcReviewRequest
     * @return GetPbcReviewResponse
     */
    @Override
    public CompletableFuture<GetPbcReviewResponse> getPbcReview(GetPbcReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPbcReview").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-reviews/{reviewId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPbcReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPbcReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPbcSchema  GetPbcSchemaRequest
     * @return GetPbcSchemaResponse
     */
    @Override
    public CompletableFuture<GetPbcSchemaResponse> getPbcSchema(GetPbcSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPbcSchema").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-versions/{pbcVersionId}/schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPbcSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPbcSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPbcVersion  GetPbcVersionRequest
     * @return GetPbcVersionResponse
     */
    @Override
    public CompletableFuture<GetPbcVersionResponse> getPbcVersion(GetPbcVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPbcVersion").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-versions/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPbcVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPbcVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPdpConfig  GetPdpConfigRequest
     * @return GetPdpConfigResponse
     */
    @Override
    public CompletableFuture<GetPdpConfigResponse> getPdpConfig(GetPdpConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPdpConfig").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/configs/last/{configId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPdpConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPdpConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPdpHistoryConfig  GetPdpHistoryConfigRequest
     * @return GetPdpHistoryConfigResponse
     */
    @Override
    public CompletableFuture<GetPdpHistoryConfigResponse> getPdpHistoryConfig(GetPdpHistoryConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPdpHistoryConfig").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/configs/history/{historyConfigId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPdpHistoryConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPdpHistoryConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPdpLane  GetPdpLaneRequest
     * @return GetPdpLaneResponse
     */
    @Override
    public CompletableFuture<GetPdpLaneResponse> getPdpLane(GetPdpLaneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPdpLane").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/lanes/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPdpLaneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPdpLaneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPdpPbc  GetPdpPbcRequest
     * @return GetPdpPbcResponse
     */
    @Override
    public CompletableFuture<GetPdpPbcResponse> getPdpPbc(GetPdpPbcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPdpPbc").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/pbcs/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPdpPbcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPdpPbcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPdpService  GetPdpServiceRequest
     * @return GetPdpServiceResponse
     */
    @Override
    public CompletableFuture<GetPdpServiceResponse> getPdpService(GetPdpServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPdpService").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/services/{serviceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPdpServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPdpServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPdpServiceGroup  GetPdpServiceGroupRequest
     * @return GetPdpServiceGroupResponse
     */
    @Override
    public CompletableFuture<GetPdpServiceGroupResponse> getPdpServiceGroup(GetPdpServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPdpServiceGroup").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/groups/{serviceGroupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPdpServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPdpServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProduct  GetProductRequest
     * @return GetProductResponse
     */
    @Override
    public CompletableFuture<GetProductResponse> getProduct(GetProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProduct").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/products/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProductResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResource").setMethod(HttpMethod.GET).setPathRegex("/pdp-resource/v1/resources/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRole  GetRoleRequest
     * @return GetRoleResponse
     */
    @Override
    public CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRole").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/roles/role-id/{roleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetStackDetail  GetStackDetailRequest
     * @return GetStackDetailResponse
     */
    @Override
    public CompletableFuture<GetStackDetailResponse> getStackDetail(GetStackDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetStackDetail").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/traces/{traceId}/commonds/stack").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetStackDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetStackDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    @Override
    public CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetToken").setMethod(HttpMethod.POST).setPathRegex("/pdp-pbc/v1/pbcs/token").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTraceDetail  GetTraceDetailRequest
     * @return GetTraceDetailResponse
     */
    @Override
    public CompletableFuture<GetTraceDetailResponse> getTraceDetail(GetTraceDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTraceDetail").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/traces/{traceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTraceDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTraceDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GrantRole  GrantRoleRequest
     * @return GrantRoleResponse
     */
    @Override
    public CompletableFuture<GrantRoleResponse> grantRole(GrantRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GrantRole").setMethod(HttpMethod.POST).setPathRegex("/manager/v1/roles/{roleId}/commands/grant").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAuthorizeProducts  ListAuthorizeProductsRequest
     * @return ListAuthorizeProductsResponse
     */
    @Override
    public CompletableFuture<ListAuthorizeProductsResponse> listAuthorizeProducts(ListAuthorizeProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAuthorizeProducts").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/products/commands/list-authorize").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuthorizeProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuthorizeProductsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBucUserEnterprise  ListBucUserEnterpriseRequest
     * @return ListBucUserEnterpriseResponse
     */
    @Override
    public CompletableFuture<ListBucUserEnterpriseResponse> listBucUserEnterprise(ListBucUserEnterpriseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListBucUserEnterprise").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/bucs/enterprises").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBucUserEnterpriseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBucUserEnterpriseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListComponentTemplates  ListComponentTemplatesRequest
     * @return ListComponentTemplatesResponse
     */
    @Override
    public CompletableFuture<ListComponentTemplatesResponse> listComponentTemplates(ListComponentTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListComponentTemplates").setMethod(HttpMethod.GET).setPathRegex("/pdp-resource/v1/component-templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComponentTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComponentTemplatesResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListComponents").setMethod(HttpMethod.GET).setPathRegex("/pdp-resource/v1/components").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComponentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComponentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDependLibrarys  ListDependLibrarysRequest
     * @return ListDependLibrarysResponse
     */
    @Override
    public CompletableFuture<ListDependLibrarysResponse> listDependLibrarys(ListDependLibrarysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDependLibrarys").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/librarys/commands/list-dependency").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDependLibrarysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDependLibrarysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeployments  ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    @Override
    public CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDeployments").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/deployments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeploymentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeploymentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeveloperEnterprises  ListDeveloperEnterprisesRequest
     * @return ListDeveloperEnterprisesResponse
     */
    @Override
    public CompletableFuture<ListDeveloperEnterprisesResponse> listDeveloperEnterprises(ListDeveloperEnterprisesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDeveloperEnterprises").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/enterprises/developers/{accountId}/commands/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeveloperEnterprisesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeveloperEnterprisesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDeveloperPbcs  ListDeveloperPbcsRequest
     * @return ListDeveloperPbcsResponse
     */
    @Override
    public CompletableFuture<ListDeveloperPbcsResponse> listDeveloperPbcs(ListDeveloperPbcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDeveloperPbcs").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbcs/commands/allow-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDeveloperPbcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDeveloperPbcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDevelopers  ListDevelopersRequest
     * @return ListDevelopersResponse
     */
    @Override
    public CompletableFuture<ListDevelopersResponse> listDevelopers(ListDevelopersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDevelopers").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/developers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDevelopersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDevelopersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDownstreamPbc  ListDownstreamPbcRequest
     * @return ListDownstreamPbcResponse
     */
    @Override
    public CompletableFuture<ListDownstreamPbcResponse> listDownstreamPbc(ListDownstreamPbcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDownstreamPbc").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-versions/{id}/commands/list-downstream").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDownstreamPbcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDownstreamPbcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnterprises  ListEnterprisesRequest
     * @return ListEnterprisesResponse
     */
    @Override
    public CompletableFuture<ListEnterprisesResponse> listEnterprises(ListEnterprisesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEnterprises").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/enterprises").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnterprisesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnterprisesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnvInfos  ListEnvInfosRequest
     * @return ListEnvInfosResponse
     */
    @Override
    public CompletableFuture<ListEnvInfosResponse> listEnvInfos(ListEnvInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEnvInfos").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/services/env/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnvInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnvInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListForkReviews  ListForkReviewsRequest
     * @return ListForkReviewsResponse
     */
    @Override
    public CompletableFuture<ListForkReviewsResponse> listForkReviews(ListForkReviewsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListForkReviews").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/fork-reviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListForkReviewsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListForkReviewsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGrantedRoles  ListGrantedRolesRequest
     * @return ListGrantedRolesResponse
     */
    @Override
    public CompletableFuture<ListGrantedRolesResponse> listGrantedRoles(ListGrantedRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListGrantedRoles").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/roles/commands/list-granted-roles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGrantedRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGrantedRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInvokePbcs  ListInvokePbcsRequest
     * @return ListInvokePbcsResponse
     */
    @Override
    public CompletableFuture<ListInvokePbcsResponse> listInvokePbcs(ListInvokePbcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInvokePbcs").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbcs/{id}/commands/invoke-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInvokePbcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInvokePbcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLibraryReviews  ListLibraryReviewsRequest
     * @return ListLibraryReviewsResponse
     */
    @Override
    public CompletableFuture<ListLibraryReviewsResponse> listLibraryReviews(ListLibraryReviewsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLibraryReviews").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/library-reviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLibraryReviewsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLibraryReviewsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLibrarys  ListLibrarysRequest
     * @return ListLibrarysResponse
     */
    @Override
    public CompletableFuture<ListLibrarysResponse> listLibrarys(ListLibrarysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLibrarys").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/librarys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLibrarysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLibrarysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMarkets  ListMarketsRequest
     * @return ListMarketsResponse
     */
    @Override
    public CompletableFuture<ListMarketsResponse> listMarkets(ListMarketsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMarkets").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/markets").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMarketsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMarketsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMetadataInfos  ListMetadataInfosRequest
     * @return ListMetadataInfosResponse
     */
    @Override
    public CompletableFuture<ListMetadataInfosResponse> listMetadataInfos(ListMetadataInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMetadataInfos").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/metadata").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMetadataInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMetadataInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMicroService  ListMicroServiceRequest
     * @return ListMicroServiceResponse
     */
    @Override
    public CompletableFuture<ListMicroServiceResponse> listMicroService(ListMicroServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMicroService").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/mq/group/env/{env}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMicroServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMicroServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMonitorContactGroups  ListMonitorContactGroupsRequest
     * @return ListMonitorContactGroupsResponse
     */
    @Override
    public CompletableFuture<ListMonitorContactGroupsResponse> listMonitorContactGroups(ListMonitorContactGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMonitorContactGroups").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMonitorContactGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMonitorContactGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMonitorContacts  ListMonitorContactsRequest
     * @return ListMonitorContactsResponse
     */
    @Override
    public CompletableFuture<ListMonitorContactsResponse> listMonitorContacts(ListMonitorContactsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMonitorContacts").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/contact").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMonitorContactsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMonitorContactsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMonitorNotifyObjects  ListMonitorNotifyObjectsRequest
     * @return ListMonitorNotifyObjectsResponse
     */
    @Override
    public CompletableFuture<ListMonitorNotifyObjectsResponse> listMonitorNotifyObjects(ListMonitorNotifyObjectsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMonitorNotifyObjects").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/listMonitorNotifyObjects").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMonitorNotifyObjectsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMonitorNotifyObjectsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMonitorTasks  ListMonitorTasksRequest
     * @return ListMonitorTasksResponse
     */
    @Override
    public CompletableFuture<ListMonitorTasksResponse> listMonitorTasks(ListMonitorTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMonitorTasks").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/listMonitorTasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMonitorTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMonitorTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMonitorWebhooks  ListMonitorWebhooksRequest
     * @return ListMonitorWebhooksResponse
     */
    @Override
    public CompletableFuture<ListMonitorWebhooksResponse> listMonitorWebhooks(ListMonitorWebhooksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMonitorWebhooks").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/webhook").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMonitorWebhooksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMonitorWebhooksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMqGroupMsgs  ListMqGroupMsgsRequest
     * @return ListMqGroupMsgsResponse
     */
    @Override
    public CompletableFuture<ListMqGroupMsgsResponse> listMqGroupMsgs(ListMqGroupMsgsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMqGroupMsgs").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/mq/group/{groupId}/commands/msgs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMqGroupMsgsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMqGroupMsgsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMqTopicMsgs  ListMqTopicMsgsRequest
     * @return ListMqTopicMsgsResponse
     */
    @Override
    public CompletableFuture<ListMqTopicMsgsResponse> listMqTopicMsgs(ListMqTopicMsgsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMqTopicMsgs").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/mq/topic/{topicId}/commands/msgs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMqTopicMsgsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMqTopicMsgsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMqTopicSubs  ListMqTopicSubsRequest
     * @return ListMqTopicSubsResponse
     */
    @Override
    public CompletableFuture<ListMqTopicSubsResponse> listMqTopicSubs(ListMqTopicSubsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMqTopicSubs").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/mq/topic/{topicId}/commands/subs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMqTopicSubsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMqTopicSubsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMqTopics  ListMqTopicsRequest
     * @return ListMqTopicsResponse
     */
    @Override
    public CompletableFuture<ListMqTopicsResponse> listMqTopics(ListMqTopicsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMqTopics").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/mq/topic/env/{env}/pbcId/{pbcId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMqTopicsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMqTopicsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPbcInvokeReviews  ListPbcInvokeReviewsRequest
     * @return ListPbcInvokeReviewsResponse
     */
    @Override
    public CompletableFuture<ListPbcInvokeReviewsResponse> listPbcInvokeReviews(ListPbcInvokeReviewsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPbcInvokeReviews").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-invoke-reviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPbcInvokeReviewsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPbcInvokeReviewsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPbcInvokes  ListPbcInvokesRequest
     * @return ListPbcInvokesResponse
     */
    @Override
    public CompletableFuture<ListPbcInvokesResponse> listPbcInvokes(ListPbcInvokesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPbcInvokes").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-invokes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPbcInvokesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPbcInvokesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPbcReviews  ListPbcReviewsRequest
     * @return ListPbcReviewsResponse
     */
    @Override
    public CompletableFuture<ListPbcReviewsResponse> listPbcReviews(ListPbcReviewsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPbcReviews").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-reviews").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPbcReviewsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPbcReviewsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPbcSubscribe  ListPbcSubscribeRequest
     * @return ListPbcSubscribeResponse
     */
    @Override
    public CompletableFuture<ListPbcSubscribeResponse> listPbcSubscribe(ListPbcSubscribeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPbcSubscribe").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbcs/commands/list-subscribe").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPbcSubscribeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPbcSubscribeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPbcVersionBuild  ListPbcVersionBuildRequest
     * @return ListPbcVersionBuildResponse
     */
    @Override
    public CompletableFuture<ListPbcVersionBuildResponse> listPbcVersionBuild(ListPbcVersionBuildRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPbcVersionBuild").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-versions/commands/list-build").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPbcVersionBuildResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPbcVersionBuildResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPbcVersionNumbers  ListPbcVersionNumbersRequest
     * @return ListPbcVersionNumbersResponse
     */
    @Override
    public CompletableFuture<ListPbcVersionNumbersResponse> listPbcVersionNumbers(ListPbcVersionNumbersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPbcVersionNumbers").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbcs/{id}/commands/listPbcVersionNumbers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPbcVersionNumbersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPbcVersionNumbersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPbcs  ListPbcsRequest
     * @return ListPbcsResponse
     */
    @Override
    public CompletableFuture<ListPbcsResponse> listPbcs(ListPbcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPbcs").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbcs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPbcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPbcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPdpConfigs  ListPdpConfigsRequest
     * @return ListPdpConfigsResponse
     */
    @Override
    public CompletableFuture<ListPdpConfigsResponse> listPdpConfigs(ListPdpConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPdpConfigs").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPdpConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPdpConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPdpHistoryConfigs  ListPdpHistoryConfigsRequest
     * @return ListPdpHistoryConfigsResponse
     */
    @Override
    public CompletableFuture<ListPdpHistoryConfigsResponse> listPdpHistoryConfigs(ListPdpHistoryConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPdpHistoryConfigs").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/configs/history").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPdpHistoryConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPdpHistoryConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPdpImage  ListPdpImageRequest
     * @return ListPdpImageResponse
     */
    @Override
    public CompletableFuture<ListPdpImageResponse> listPdpImage(ListPdpImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPdpImage").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/services/instance/images").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPdpImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPdpImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPdpLanes  ListPdpLanesRequest
     * @return ListPdpLanesResponse
     */
    @Override
    public CompletableFuture<ListPdpLanesResponse> listPdpLanes(ListPdpLanesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPdpLanes").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/lanes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPdpLanesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPdpLanesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPdpLanesForServiceGroup  ListPdpLanesForServiceGroupRequest
     * @return ListPdpLanesForServiceGroupResponse
     */
    @Override
    public CompletableFuture<ListPdpLanesForServiceGroupResponse> listPdpLanesForServiceGroup(ListPdpLanesForServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPdpLanesForServiceGroup").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/lanes/commands/list-service-group-lane").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPdpLanesForServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPdpLanesForServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPdpLogs  ListPdpLogsRequest
     * @return ListPdpLogsResponse
     */
    @Override
    public CompletableFuture<ListPdpLogsResponse> listPdpLogs(ListPdpLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPdpLogs").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/pdp-log").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPdpLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPdpLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPdpPbcs  ListPdpPbcsRequest
     * @return ListPdpPbcsResponse
     */
    @Override
    public CompletableFuture<ListPdpPbcsResponse> listPdpPbcs(ListPdpPbcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPdpPbcs").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/pbcs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPdpPbcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPdpPbcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPdpServiceGroups  ListPdpServiceGroupsRequest
     * @return ListPdpServiceGroupsResponse
     */
    @Override
    public CompletableFuture<ListPdpServiceGroupsResponse> listPdpServiceGroups(ListPdpServiceGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPdpServiceGroups").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPdpServiceGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPdpServiceGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPdpServices  ListPdpServicesRequest
     * @return ListPdpServicesResponse
     */
    @Override
    public CompletableFuture<ListPdpServicesResponse> listPdpServices(ListPdpServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPdpServices").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/services").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPdpServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPdpServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPermissionResource  ListPermissionResourceRequest
     * @return ListPermissionResourceResponse
     */
    @Override
    public CompletableFuture<ListPermissionResourceResponse> listPermissionResource(ListPermissionResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPermissionResource").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/permissions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPermissionResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPermissionResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPermissionResourceForFront  ListPermissionResourceForFrontRequest
     * @return ListPermissionResourceForFrontResponse
     */
    @Override
    public CompletableFuture<ListPermissionResourceForFrontResponse> listPermissionResourceForFront(ListPermissionResourceForFrontRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPermissionResourceForFront").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/permissions/command/front-permission").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPermissionResourceForFrontResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPermissionResourceForFrontResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPermissionResourcePop  ListPermissionResourcePopRequest
     * @return ListPermissionResourcePopResponse
     */
    @Override
    public CompletableFuture<ListPermissionResourcePopResponse> listPermissionResourcePop(ListPermissionResourcePopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPermissionResourcePop").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/permissions/pop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPermissionResourcePopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPermissionResourcePopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivilegeByRole  ListPrivilegeByRoleRequest
     * @return ListPrivilegeByRoleResponse
     */
    @Override
    public CompletableFuture<ListPrivilegeByRoleResponse> listPrivilegeByRole(ListPrivilegeByRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPrivilegeByRole").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/roles/{roleId}/privileges").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivilegeByRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivilegeByRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProductEnvInfos  ListProductEnvInfosRequest
     * @return ListProductEnvInfosResponse
     */
    @Override
    public CompletableFuture<ListProductEnvInfosResponse> listProductEnvInfos(ListProductEnvInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProductEnvInfos").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/lanes/commands/list-product-env").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductEnvInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductEnvInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProductEnvs  ListProductEnvsRequest
     * @return ListProductEnvsResponse
     */
    @Override
    public CompletableFuture<ListProductEnvsResponse> listProductEnvs(ListProductEnvsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProductEnvs").setMethod(HttpMethod.GET).setPathRegex("/pdp-resource/v1/resources/commands/list-product-env").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductEnvsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductEnvsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProducts  ListProductsRequest
     * @return ListProductsResponse
     */
    @Override
    public CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListProducts").setMethod(HttpMethod.GET).setPathRegex("/pdp-pbc/v1/products").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProductsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProductsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListResources").setMethod(HttpMethod.GET).setPathRegex("/pdp-resource/v1/resources").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListReviewers  ListReviewersRequest
     * @return ListReviewersResponse
     */
    @Override
    public CompletableFuture<ListReviewersResponse> listReviewers(ListReviewersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListReviewers").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-reviews/commands/listReviewers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListReviewersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListReviewersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    @Override
    public CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRoles").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/roles").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRolesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRolesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRuntimeTokens  ListRuntimeTokensRequest
     * @return ListRuntimeTokensResponse
     */
    @Override
    public CompletableFuture<ListRuntimeTokensResponse> listRuntimeTokens(ListRuntimeTokensRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRuntimeTokens").setMethod(HttpMethod.GET).setPathRegex("/pdp-service/v1/services/env/tokens").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRuntimeTokensResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRuntimeTokensResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServerInstances  ListServerInstancesRequest
     * @return ListServerInstancesResponse
     */
    @Override
    public CompletableFuture<ListServerInstancesResponse> listServerInstances(ListServerInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServerInstances").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/services/{serviceGroupId}/env/{env}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServerInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServerInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServiceMetrics  ListServiceMetricsRequest
     * @return ListServiceMetricsResponse
     */
    @Override
    public CompletableFuture<ListServiceMetricsResponse> listServiceMetrics(ListServiceMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListServiceMetrics").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/monitor/services").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServiceMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServiceMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSettleds  ListSettledsRequest
     * @return ListSettledsResponse
     */
    @Override
    public CompletableFuture<ListSettledsResponse> listSettleds(ListSettledsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSettleds").setMethod(HttpMethod.GET).setPathRegex("/manager/v1/settleds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSettledsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSettledsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubscribePbcs  ListSubscribePbcsRequest
     * @return ListSubscribePbcsResponse
     */
    @Override
    public CompletableFuture<ListSubscribePbcsResponse> listSubscribePbcs(ListSubscribePbcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSubscribePbcs").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbcs/{pbc_name}/commands/subscribe-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubscribePbcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubscribePbcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUpstreamPbc  ListUpstreamPbcRequest
     * @return ListUpstreamPbcResponse
     */
    @Override
    public CompletableFuture<ListUpstreamPbcResponse> listUpstreamPbc(ListUpstreamPbcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUpstreamPbc").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/pbc-/versions/{id}/commands/list-upstream").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUpstreamPbcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUpstreamPbcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWatchAssets  ListWatchAssetsRequest
     * @return ListWatchAssetsResponse
     */
    @Override
    public CompletableFuture<ListWatchAssetsResponse> listWatchAssets(ListWatchAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWatchAssets").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/asset-watchs/commands/list-watch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWatchAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWatchAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ObtainMqConsoleLink  ObtainMqConsoleLinkRequest
     * @return ObtainMqConsoleLinkResponse
     */
    @Override
    public CompletableFuture<ObtainMqConsoleLinkResponse> obtainMqConsoleLink(ObtainMqConsoleLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ObtainMqConsoleLink").setMethod(HttpMethod.PUT).setPathRegex("/pdp-pbc/v1/mq/topic/commonds/obtainMqConsoleLink").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ObtainMqConsoleLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ObtainMqConsoleLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenServiceGroupForService  OpenServiceGroupForServiceRequest
     * @return OpenServiceGroupForServiceResponse
     */
    @Override
    public CompletableFuture<OpenServiceGroupForServiceResponse> openServiceGroupForService(OpenServiceGroupForServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("OpenServiceGroupForService").setMethod(HttpMethod.PUT).setPathRegex("/pdp-pbc/v1/lanes/commands/open-group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenServiceGroupForServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenServiceGroupForServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PreviewComponentCrdSchema  PreviewComponentCrdSchemaRequest
     * @return PreviewComponentCrdSchemaResponse
     */
    @Override
    public CompletableFuture<PreviewComponentCrdSchemaResponse> previewComponentCrdSchema(PreviewComponentCrdSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PreviewComponentCrdSchema").setMethod(HttpMethod.PUT).setPathRegex("/pdp-resource/v1/components/commonds/preview-component-schema").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PreviewComponentCrdSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PreviewComponentCrdSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RegisterBucUser  RegisterBucUserRequest
     * @return RegisterBucUserResponse
     */
    @Override
    public CompletableFuture<RegisterBucUserResponse> registerBucUser(RegisterBucUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RegisterBucUser").setMethod(HttpMethod.POST).setPathRegex("/catalog/v1/bucs/logins/register").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterBucUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterBucUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveAssetWatch  RemoveAssetWatchRequest
     * @return RemoveAssetWatchResponse
     */
    @Override
    public CompletableFuture<RemoveAssetWatchResponse> removeAssetWatch(RemoveAssetWatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveAssetWatch").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/asset-watchs/{assetId}/commands/remove-watch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveAssetWatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveAssetWatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveDependLibrary  RemoveDependLibraryRequest
     * @return RemoveDependLibraryResponse
     */
    @Override
    public CompletableFuture<RemoveDependLibraryResponse> removeDependLibrary(RemoveDependLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveDependLibrary").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/librarys/{id}/commands/remove-dependency").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveDependLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveDependLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevertPdpService  RevertPdpServiceRequest
     * @return RevertPdpServiceResponse
     */
    @Override
    public CompletableFuture<RevertPdpServiceResponse> revertPdpService(RevertPdpServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevertPdpService").setMethod(HttpMethod.PUT).setPathRegex("/pdp-service/v1/deployments/commands/revert").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevertPdpServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevertPdpServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeLibraryReview  RevokeLibraryReviewRequest
     * @return RevokeLibraryReviewResponse
     */
    @Override
    public CompletableFuture<RevokeLibraryReviewResponse> revokeLibraryReview(RevokeLibraryReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeLibraryReview").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/library-reviews/commands/revoke-review").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeLibraryReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeLibraryReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokePbcReview  RevokePbcReviewRequest
     * @return RevokePbcReviewResponse
     */
    @Override
    public CompletableFuture<RevokePbcReviewResponse> revokePbcReview(RevokePbcReviewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokePbcReview").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/pbc-reviews/commands/revoke-review").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokePbcReviewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokePbcReviewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeRole  RevokeRoleRequest
     * @return RevokeRoleResponse
     */
    @Override
    public CompletableFuture<RevokeRoleResponse> revokeRole(RevokeRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeRole").setMethod(HttpMethod.POST).setPathRegex("/manager/v1/roles/{roleId}/commands/revoke").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RollbackPdpService  RollbackPdpServiceRequest
     * @return RollbackPdpServiceResponse
     */
    @Override
    public CompletableFuture<RollbackPdpServiceResponse> rollbackPdpService(RollbackPdpServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RollbackPdpService").setMethod(HttpMethod.PUT).setPathRegex("/pdp-service/v1/deployments/commands/rollback").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RollbackPdpServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RollbackPdpServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchAssets  SearchAssetsRequest
     * @return SearchAssetsResponse
     */
    @Override
    public CompletableFuture<SearchAssetsResponse> searchAssets(SearchAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchAssets").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/markets/commands/search-asset").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchPbcAssets  SearchPbcAssetsRequest
     * @return SearchPbcAssetsResponse
     */
    @Override
    public CompletableFuture<SearchPbcAssetsResponse> searchPbcAssets(SearchPbcAssetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchPbcAssets").setMethod(HttpMethod.GET).setPathRegex("/catalog/v1/markets/commands/search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchPbcAssetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchPbcAssetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchTracesByPage  SearchTracesByPageRequest
     * @return SearchTracesByPageResponse
     */
    @Override
    public CompletableFuture<SearchTracesByPageResponse> searchTracesByPage(SearchTracesByPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchTracesByPage").setMethod(HttpMethod.GET).setPathRegex("/pdp-monitor/v1/traces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchTracesByPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchTracesByPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendTTSVerifyLink  SendTTSVerifyLinkRequest
     * @return SendTTSVerifyLinkResponse
     */
    @Override
    public CompletableFuture<SendTTSVerifyLinkResponse> sendTTSVerifyLink(SendTTSVerifyLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendTTSVerifyLink").setMethod(HttpMethod.PUT).setPathRegex("/pdp-monitor/v1/monitor/contact/commands/phoneVerify/{contactId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendTTSVerifyLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendTTSVerifyLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubscribePbc  SubscribePbcRequest
     * @return SubscribePbcResponse
     */
    @Override
    public CompletableFuture<SubscribePbcResponse> subscribePbc(SubscribePbcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubscribePbc").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/pbcs/{pbc_name}/commands/subscribe").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubscribePbcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubscribePbcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncComponentTemplateConfig  SyncComponentTemplateConfigRequest
     * @return SyncComponentTemplateConfigResponse
     */
    @Override
    public CompletableFuture<SyncComponentTemplateConfigResponse> syncComponentTemplateConfig(SyncComponentTemplateConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncComponentTemplateConfig").setMethod(HttpMethod.PUT).setPathRegex("/pdp-resource/v1/components/commonds/sync-template-config").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncComponentTemplateConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncComponentTemplateConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TransferEnterprise  TransferEnterpriseRequest
     * @return TransferEnterpriseResponse
     */
    @Override
    public CompletableFuture<TransferEnterpriseResponse> transferEnterprise(TransferEnterpriseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TransferEnterprise").setMethod(HttpMethod.POST).setPathRegex("/manager/v1/enterprises/{enterpriseId}/commands/transfer").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransferEnterpriseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransferEnterpriseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TriggerDeployment  TriggerDeploymentRequest
     * @return TriggerDeploymentResponse
     */
    @Override
    public CompletableFuture<TriggerDeploymentResponse> triggerDeployment(TriggerDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TriggerDeployment").setMethod(HttpMethod.POST).setPathRegex("/pdp-service/v1/deployments").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TriggerDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TriggerDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpShelfLibrary  UpShelfLibraryRequest
     * @return UpShelfLibraryResponse
     */
    @Override
    public CompletableFuture<UpShelfLibraryResponse> upShelfLibrary(UpShelfLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpShelfLibrary").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/librarys/{id}/commands/up-shelf-library").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpShelfLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpShelfLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpShelfPbcVersion  UpShelfPbcVersionRequest
     * @return UpShelfPbcVersionResponse
     */
    @Override
    public CompletableFuture<UpShelfPbcVersionResponse> upShelfPbcVersion(UpShelfPbcVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpShelfPbcVersion").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/pbc-versions/{id}/commands/upShelf").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpShelfPbcVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpShelfPbcVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateComponent  UpdateComponentRequest
     * @return UpdateComponentResponse
     */
    @Override
    public CompletableFuture<UpdateComponentResponse> updateComponent(UpdateComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateComponent").setMethod(HttpMethod.PUT).setPathRegex("/pdp-resource/v1/components/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateComponentTemplate  UpdateComponentTemplateRequest
     * @return UpdateComponentTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateComponentTemplateResponse> updateComponentTemplate(UpdateComponentTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateComponentTemplate").setMethod(HttpMethod.PUT).setPathRegex("/pdp-resource/v1/component-templates/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateComponentTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateComponentTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDeveloper  UpdateDeveloperRequest
     * @return UpdateDeveloperResponse
     */
    @Override
    public CompletableFuture<UpdateDeveloperResponse> updateDeveloper(UpdateDeveloperRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDeveloper").setMethod(HttpMethod.PUT).setPathRegex("/manager/v1/developers/{accountId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDeveloperResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDeveloperResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEnterprise  UpdateEnterpriseRequest
     * @return UpdateEnterpriseResponse
     */
    @Override
    public CompletableFuture<UpdateEnterpriseResponse> updateEnterprise(UpdateEnterpriseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateEnterprise").setMethod(HttpMethod.PUT).setPathRegex("/manager/v1/enterprises/{enterpriseId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEnterpriseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEnterpriseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLibrary  UpdateLibraryRequest
     * @return UpdateLibraryResponse
     */
    @Override
    public CompletableFuture<UpdateLibraryResponse> updateLibrary(UpdateLibraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLibrary").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/librarys").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLibraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLibraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLibraryInstruction  UpdateLibraryInstructionRequest
     * @return UpdateLibraryInstructionResponse
     */
    @Override
    public CompletableFuture<UpdateLibraryInstructionResponse> updateLibraryInstruction(UpdateLibraryInstructionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLibraryInstruction").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/librarys/{libraryId}/instructions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLibraryInstructionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLibraryInstructionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLibrarySchema  UpdateLibrarySchemaRequest
     * @return UpdateLibrarySchemaResponse
     */
    @Override
    public CompletableFuture<UpdateLibrarySchemaResponse> updateLibrarySchema(UpdateLibrarySchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLibrarySchema").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/librarys/{libraryId}/schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLibrarySchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLibrarySchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMonitorArmsAlert  UpdateMonitorArmsAlertRequest
     * @return UpdateMonitorArmsAlertResponse
     */
    @Override
    public CompletableFuture<UpdateMonitorArmsAlertResponse> updateMonitorArmsAlert(UpdateMonitorArmsAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMonitorArmsAlert").setMethod(HttpMethod.PUT).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/updateMonitorArmsAlert").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMonitorArmsAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMonitorArmsAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMonitorContact  UpdateMonitorContactRequest
     * @return UpdateMonitorContactResponse
     */
    @Override
    public CompletableFuture<UpdateMonitorContactResponse> updateMonitorContact(UpdateMonitorContactRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMonitorContact").setMethod(HttpMethod.PUT).setPathRegex("/pdp-monitor/v1/monitor/contact").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMonitorContactResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMonitorContactResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMonitorContactGroup  UpdateMonitorContactGroupRequest
     * @return UpdateMonitorContactGroupResponse
     */
    @Override
    public CompletableFuture<UpdateMonitorContactGroupResponse> updateMonitorContactGroup(UpdateMonitorContactGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMonitorContactGroup").setMethod(HttpMethod.PUT).setPathRegex("/pdp-monitor/v1/monitor/group").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMonitorContactGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMonitorContactGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMonitorMqAlert  UpdateMonitorMqAlertRequest
     * @return UpdateMonitorMqAlertResponse
     */
    @Override
    public CompletableFuture<UpdateMonitorMqAlertResponse> updateMonitorMqAlert(UpdateMonitorMqAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMonitorMqAlert").setMethod(HttpMethod.PUT).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/updateMonitorMqAlert").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMonitorMqAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMonitorMqAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMonitorSlsAlert  UpdateMonitorSlsAlertRequest
     * @return UpdateMonitorSlsAlertResponse
     */
    @Override
    public CompletableFuture<UpdateMonitorSlsAlertResponse> updateMonitorSlsAlert(UpdateMonitorSlsAlertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMonitorSlsAlert").setMethod(HttpMethod.PUT).setPathRegex("/pdp-monitor/v1/monitor/alert/commands/updateMonitorSlsAlert").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMonitorSlsAlertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMonitorSlsAlertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMonitorWebhook  UpdateMonitorWebhookRequest
     * @return UpdateMonitorWebhookResponse
     */
    @Override
    public CompletableFuture<UpdateMonitorWebhookResponse> updateMonitorWebhook(UpdateMonitorWebhookRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMonitorWebhook").setMethod(HttpMethod.PUT).setPathRegex("/pdp-monitor/v1/monitor/webhook").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMonitorWebhookResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMonitorWebhookResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePbcApiSchema  UpdatePbcApiSchemaRequest
     * @return UpdatePbcApiSchemaResponse
     */
    @Override
    public CompletableFuture<UpdatePbcApiSchemaResponse> updatePbcApiSchema(UpdatePbcApiSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePbcApiSchema").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/pbc-versions/{pbcVersionId}/api-schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePbcApiSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePbcApiSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePbcInstruction  UpdatePbcInstructionRequest
     * @return UpdatePbcInstructionResponse
     */
    @Override
    public CompletableFuture<UpdatePbcInstructionResponse> updatePbcInstruction(UpdatePbcInstructionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePbcInstruction").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/pbc-versions/{pbcVersionId}/instructions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePbcInstructionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePbcInstructionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePbcSchema  UpdatePbcSchemaRequest
     * @return UpdatePbcSchemaResponse
     */
    @Override
    public CompletableFuture<UpdatePbcSchemaResponse> updatePbcSchema(UpdatePbcSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePbcSchema").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/pbc-versions/{pbcVersionId}/schemas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePbcSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePbcSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePbcVersion  UpdatePbcVersionRequest
     * @return UpdatePbcVersionResponse
     */
    @Override
    public CompletableFuture<UpdatePbcVersionResponse> updatePbcVersion(UpdatePbcVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePbcVersion").setMethod(HttpMethod.PUT).setPathRegex("/catalog/v1/pbc-versions/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePbcVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePbcVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePdpConfig  UpdatePdpConfigRequest
     * @return UpdatePdpConfigResponse
     */
    @Override
    public CompletableFuture<UpdatePdpConfigResponse> updatePdpConfig(UpdatePdpConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePdpConfig").setMethod(HttpMethod.PUT).setPathRegex("/pdp-service/v1/configs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePdpConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePdpConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePdpLane  UpdatePdpLaneRequest
     * @return UpdatePdpLaneResponse
     */
    @Override
    public CompletableFuture<UpdatePdpLaneResponse> updatePdpLane(UpdatePdpLaneRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePdpLane").setMethod(HttpMethod.PUT).setPathRegex("/pdp-pbc/v1/lanes/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePdpLaneResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePdpLaneResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePdpPbc  UpdatePdpPbcRequest
     * @return UpdatePdpPbcResponse
     */
    @Override
    public CompletableFuture<UpdatePdpPbcResponse> updatePdpPbc(UpdatePdpPbcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePdpPbc").setMethod(HttpMethod.PUT).setPathRegex("/pdp-pbc/v1/pbcs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePdpPbcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePdpPbcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePdpService  UpdatePdpServiceRequest
     * @return UpdatePdpServiceResponse
     */
    @Override
    public CompletableFuture<UpdatePdpServiceResponse> updatePdpService(UpdatePdpServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePdpService").setMethod(HttpMethod.PUT).setPathRegex("/pdp-service/v1/services").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePdpServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePdpServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePdpServiceGroup  UpdatePdpServiceGroupRequest
     * @return UpdatePdpServiceGroupResponse
     */
    @Override
    public CompletableFuture<UpdatePdpServiceGroupResponse> updatePdpServiceGroup(UpdatePdpServiceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePdpServiceGroup").setMethod(HttpMethod.PUT).setPathRegex("/pdp-service/v1/groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePdpServiceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePdpServiceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProduct  UpdateProductRequest
     * @return UpdateProductResponse
     */
    @Override
    public CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProduct").setMethod(HttpMethod.PUT).setPathRegex("/pdp-pbc/v1/products").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateResource  UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    @Override
    public CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateResource").setMethod(HttpMethod.PUT).setPathRegex("/pdp-resource/v1/resources/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateResourceResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateRole").setMethod(HttpMethod.PUT).setPathRegex("/manager/v1/roles/role-id/{roleId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSettled  UpdateSettledRequest
     * @return UpdateSettledResponse
     */
    @Override
    public CompletableFuture<UpdateSettledResponse> updateSettled(UpdateSettledRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSettled").setMethod(HttpMethod.PUT).setPathRegex("/manager/v1/settleds/{id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSettledResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSettledResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
