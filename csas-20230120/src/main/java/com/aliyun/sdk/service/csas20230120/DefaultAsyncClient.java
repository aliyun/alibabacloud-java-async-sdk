// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.csas20230120.models.*;
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
        this.product = "csas";
        this.version = "2023-01-20";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AttachApplication2Connector  AttachApplication2ConnectorRequest
     * @return AttachApplication2ConnectorResponse
     */
    @Override
    public CompletableFuture<AttachApplication2ConnectorResponse> attachApplication2Connector(AttachApplication2ConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachApplication2Connector").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachApplication2ConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachApplication2ConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AttachPolicy2ApprovalProcess  AttachPolicy2ApprovalProcessRequest
     * @return AttachPolicy2ApprovalProcessResponse
     */
    @Override
    public CompletableFuture<AttachPolicy2ApprovalProcessResponse> attachPolicy2ApprovalProcess(AttachPolicy2ApprovalProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachPolicy2ApprovalProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachPolicy2ApprovalProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachPolicy2ApprovalProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateApprovalProcess  CreateApprovalProcessRequest
     * @return CreateApprovalProcessResponse
     */
    @Override
    public CompletableFuture<CreateApprovalProcessResponse> createApprovalProcess(CreateApprovalProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApprovalProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApprovalProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApprovalProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateClientUser  CreateClientUserRequest
     * @return CreateClientUserResponse
     */
    @Override
    public CompletableFuture<CreateClientUserResponse> createClientUser(CreateClientUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateClientUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClientUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClientUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDynamicRoute  CreateDynamicRouteRequest
     * @return CreateDynamicRouteResponse
     */
    @Override
    public CompletableFuture<CreateDynamicRouteResponse> createDynamicRoute(CreateDynamicRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDynamicRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDynamicRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDynamicRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEnterpriseAcceleratePolicy  CreateEnterpriseAcceleratePolicyRequest
     * @return CreateEnterpriseAcceleratePolicyResponse
     */
    @Override
    public CompletableFuture<CreateEnterpriseAcceleratePolicyResponse> createEnterpriseAcceleratePolicy(CreateEnterpriseAcceleratePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEnterpriseAcceleratePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEnterpriseAcceleratePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEnterpriseAcceleratePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEnterpriseAccelerateTarget  CreateEnterpriseAccelerateTargetRequest
     * @return CreateEnterpriseAccelerateTargetResponse
     */
    @Override
    public CompletableFuture<CreateEnterpriseAccelerateTargetResponse> createEnterpriseAccelerateTarget(CreateEnterpriseAccelerateTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEnterpriseAccelerateTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEnterpriseAccelerateTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEnterpriseAccelerateTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateIdpDepartment  CreateIdpDepartmentRequest
     * @return CreateIdpDepartmentResponse
     */
    @Override
    public CompletableFuture<CreateIdpDepartmentResponse> createIdpDepartment(CreateIdpDepartmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIdpDepartment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIdpDepartmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIdpDepartmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>By default, you can create a maximum of 500 office applications.</p>
     * 
     * @param request the request parameters of CreatePrivateAccessApplication  CreatePrivateAccessApplicationRequest
     * @return CreatePrivateAccessApplicationResponse
     */
    @Override
    public CompletableFuture<CreatePrivateAccessApplicationResponse> createPrivateAccessApplication(CreatePrivateAccessApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePrivateAccessApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePrivateAccessApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePrivateAccessApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>By default, up to 500 private access policies can be created.</p>
     * 
     * @param request the request parameters of CreatePrivateAccessPolicy  CreatePrivateAccessPolicyRequest
     * @return CreatePrivateAccessPolicyResponse
     */
    @Override
    public CompletableFuture<CreatePrivateAccessPolicyResponse> createPrivateAccessPolicy(CreatePrivateAccessPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePrivateAccessPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePrivateAccessPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePrivateAccessPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePrivateAccessTag  CreatePrivateAccessTagRequest
     * @return CreatePrivateAccessTagResponse
     */
    @Override
    public CompletableFuture<CreatePrivateAccessTagResponse> createPrivateAccessTag(CreatePrivateAccessTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePrivateAccessTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePrivateAccessTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePrivateAccessTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateRegistrationPolicy  CreateRegistrationPolicyRequest
     * @return CreateRegistrationPolicyResponse
     */
    @Override
    public CompletableFuture<CreateRegistrationPolicyResponse> createRegistrationPolicy(CreateRegistrationPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRegistrationPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRegistrationPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRegistrationPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUserGroup  CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    @Override
    public CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUserGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWmBaseImage  CreateWmBaseImageRequest
     * @return CreateWmBaseImageResponse
     */
    @Override
    public CompletableFuture<CreateWmBaseImageResponse> createWmBaseImage(CreateWmBaseImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWmBaseImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWmBaseImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWmBaseImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWmEmbedTask  CreateWmEmbedTaskRequest
     * @return CreateWmEmbedTaskResponse
     */
    @Override
    public CompletableFuture<CreateWmEmbedTaskResponse> createWmEmbedTask(CreateWmEmbedTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWmEmbedTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWmEmbedTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWmEmbedTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWmExtractTask  CreateWmExtractTaskRequest
     * @return CreateWmExtractTaskResponse
     */
    @Override
    public CompletableFuture<CreateWmExtractTaskResponse> createWmExtractTask(CreateWmExtractTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWmExtractTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWmExtractTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWmExtractTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateWmInfoMapping  CreateWmInfoMappingRequest
     * @return CreateWmInfoMappingResponse
     */
    @Override
    public CompletableFuture<CreateWmInfoMappingResponse> createWmInfoMapping(CreateWmInfoMappingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateWmInfoMapping").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWmInfoMappingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWmInfoMappingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteApprovalProcesses  DeleteApprovalProcessesRequest
     * @return DeleteApprovalProcessesResponse
     */
    @Override
    public CompletableFuture<DeleteApprovalProcessesResponse> deleteApprovalProcesses(DeleteApprovalProcessesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApprovalProcesses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApprovalProcessesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApprovalProcessesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteClientUser  DeleteClientUserRequest
     * @return DeleteClientUserResponse
     */
    @Override
    public CompletableFuture<DeleteClientUserResponse> deleteClientUser(DeleteClientUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteClientUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClientUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClientUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDynamicRoute  DeleteDynamicRouteRequest
     * @return DeleteDynamicRouteResponse
     */
    @Override
    public CompletableFuture<DeleteDynamicRouteResponse> deleteDynamicRoute(DeleteDynamicRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDynamicRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDynamicRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDynamicRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEnterpriseAcceleratePolicy  DeleteEnterpriseAcceleratePolicyRequest
     * @return DeleteEnterpriseAcceleratePolicyResponse
     */
    @Override
    public CompletableFuture<DeleteEnterpriseAcceleratePolicyResponse> deleteEnterpriseAcceleratePolicy(DeleteEnterpriseAcceleratePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEnterpriseAcceleratePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEnterpriseAcceleratePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEnterpriseAcceleratePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEnterpriseAccelerateTarget  DeleteEnterpriseAccelerateTargetRequest
     * @return DeleteEnterpriseAccelerateTargetResponse
     */
    @Override
    public CompletableFuture<DeleteEnterpriseAccelerateTargetResponse> deleteEnterpriseAccelerateTarget(DeleteEnterpriseAccelerateTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEnterpriseAccelerateTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEnterpriseAccelerateTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEnterpriseAccelerateTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteIdpDepartment  DeleteIdpDepartmentRequest
     * @return DeleteIdpDepartmentResponse
     */
    @Override
    public CompletableFuture<DeleteIdpDepartmentResponse> deleteIdpDepartment(DeleteIdpDepartmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIdpDepartment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIdpDepartmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIdpDepartmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOtpConfig  DeleteOtpConfigRequest
     * @return DeleteOtpConfigResponse
     */
    @Override
    public CompletableFuture<DeleteOtpConfigResponse> deleteOtpConfig(DeleteOtpConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteOtpConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOtpConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOtpConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePrivateAccessApplication  DeletePrivateAccessApplicationRequest
     * @return DeletePrivateAccessApplicationResponse
     */
    @Override
    public CompletableFuture<DeletePrivateAccessApplicationResponse> deletePrivateAccessApplication(DeletePrivateAccessApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePrivateAccessApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePrivateAccessApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePrivateAccessApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePrivateAccessPolicy  DeletePrivateAccessPolicyRequest
     * @return DeletePrivateAccessPolicyResponse
     */
    @Override
    public CompletableFuture<DeletePrivateAccessPolicyResponse> deletePrivateAccessPolicy(DeletePrivateAccessPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePrivateAccessPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePrivateAccessPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePrivateAccessPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePrivateAccessTag  DeletePrivateAccessTagRequest
     * @return DeletePrivateAccessTagResponse
     */
    @Override
    public CompletableFuture<DeletePrivateAccessTagResponse> deletePrivateAccessTag(DeletePrivateAccessTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePrivateAccessTag").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePrivateAccessTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePrivateAccessTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRegistrationPolicies  DeleteRegistrationPoliciesRequest
     * @return DeleteRegistrationPoliciesResponse
     */
    @Override
    public CompletableFuture<DeleteRegistrationPoliciesResponse> deleteRegistrationPolicies(DeleteRegistrationPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRegistrationPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRegistrationPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRegistrationPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUserDevices  DeleteUserDevicesRequest
     * @return DeleteUserDevicesResponse
     */
    @Override
    public CompletableFuture<DeleteUserDevicesResponse> deleteUserDevices(DeleteUserDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUserDevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteUserGroup  DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     */
    @Override
    public CompletableFuture<DeleteUserGroupResponse> deleteUserGroup(DeleteUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteUserGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DetachApplication2Connector is deprecated, please use csas::2023-01-20::ModifyForwardStrategy instead.  * @param request  the request parameters of DetachApplication2Connector  DetachApplication2ConnectorRequest
     * @return DetachApplication2ConnectorResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DetachApplication2ConnectorResponse> detachApplication2Connector(DetachApplication2ConnectorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachApplication2Connector").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachApplication2ConnectorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachApplication2ConnectorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DetachPolicy2ApprovalProcess  DetachPolicy2ApprovalProcessRequest
     * @return DetachPolicy2ApprovalProcessResponse
     */
    @Override
    public CompletableFuture<DetachPolicy2ApprovalProcessResponse> detachPolicy2ApprovalProcess(DetachPolicy2ApprovalProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachPolicy2ApprovalProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachPolicy2ApprovalProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachPolicy2ApprovalProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableEnterpriseAcceleratePolicy  DisableEnterpriseAcceleratePolicyRequest
     * @return DisableEnterpriseAcceleratePolicyResponse
     */
    @Override
    public CompletableFuture<DisableEnterpriseAcceleratePolicyResponse> disableEnterpriseAcceleratePolicy(DisableEnterpriseAcceleratePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableEnterpriseAcceleratePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableEnterpriseAcceleratePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableEnterpriseAcceleratePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableEnterpriseAcceleratePolicy  EnableEnterpriseAcceleratePolicyRequest
     * @return EnableEnterpriseAcceleratePolicyResponse
     */
    @Override
    public CompletableFuture<EnableEnterpriseAcceleratePolicyResponse> enableEnterpriseAcceleratePolicy(EnableEnterpriseAcceleratePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableEnterpriseAcceleratePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableEnterpriseAcceleratePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableEnterpriseAcceleratePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExportUserDevices  ExportUserDevicesRequest
     * @return ExportUserDevicesResponse
     */
    @Override
    public CompletableFuture<ExportUserDevicesResponse> exportUserDevices(ExportUserDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportUserDevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportUserDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportUserDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetActiveIdpConfig  GetActiveIdpConfigRequest
     * @return GetActiveIdpConfigResponse
     */
    @Override
    public CompletableFuture<GetActiveIdpConfigResponse> getActiveIdpConfig(GetActiveIdpConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetActiveIdpConfig").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetActiveIdpConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetActiveIdpConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApproval  GetApprovalRequest
     * @return GetApprovalResponse
     */
    @Override
    public CompletableFuture<GetApprovalResponse> getApproval(GetApprovalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApproval").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApprovalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApprovalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApprovalProcess  GetApprovalProcessRequest
     * @return GetApprovalProcessResponse
     */
    @Override
    public CompletableFuture<GetApprovalProcessResponse> getApprovalProcess(GetApprovalProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApprovalProcess").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApprovalProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApprovalProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetApprovalSchema  GetApprovalSchemaRequest
     * @return GetApprovalSchemaResponse
     */
    @Override
    public CompletableFuture<GetApprovalSchemaResponse> getApprovalSchema(GetApprovalSchemaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApprovalSchema").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApprovalSchemaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApprovalSchemaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetBootAndAntiUninstallPolicy  GetBootAndAntiUninstallPolicyRequest
     * @return GetBootAndAntiUninstallPolicyResponse
     */
    @Override
    public CompletableFuture<GetBootAndAntiUninstallPolicyResponse> getBootAndAntiUninstallPolicy(GetBootAndAntiUninstallPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBootAndAntiUninstallPolicy").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBootAndAntiUninstallPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBootAndAntiUninstallPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClientUser  GetClientUserRequest
     * @return GetClientUserResponse
     */
    @Override
    public CompletableFuture<GetClientUserResponse> getClientUser(GetClientUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClientUser").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClientUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClientUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDynamicRoute  GetDynamicRouteRequest
     * @return GetDynamicRouteResponse
     */
    @Override
    public CompletableFuture<GetDynamicRouteResponse> getDynamicRoute(GetDynamicRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDynamicRoute").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDynamicRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDynamicRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetIdpConfig  GetIdpConfigRequest
     * @return GetIdpConfigResponse
     */
    @Override
    public CompletableFuture<GetIdpConfigResponse> getIdpConfig(GetIdpConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIdpConfig").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIdpConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIdpConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPrivateAccessApplication  GetPrivateAccessApplicationRequest
     * @return GetPrivateAccessApplicationResponse
     */
    @Override
    public CompletableFuture<GetPrivateAccessApplicationResponse> getPrivateAccessApplication(GetPrivateAccessApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPrivateAccessApplication").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPrivateAccessApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPrivateAccessApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPrivateAccessPolicy  GetPrivateAccessPolicyRequest
     * @return GetPrivateAccessPolicyResponse
     */
    @Override
    public CompletableFuture<GetPrivateAccessPolicyResponse> getPrivateAccessPolicy(GetPrivateAccessPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPrivateAccessPolicy").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPrivateAccessPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPrivateAccessPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRegistrationPolicy  GetRegistrationPolicyRequest
     * @return GetRegistrationPolicyResponse
     */
    @Override
    public CompletableFuture<GetRegistrationPolicyResponse> getRegistrationPolicy(GetRegistrationPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRegistrationPolicy").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRegistrationPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRegistrationPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserDevice  GetUserDeviceRequest
     * @return GetUserDeviceResponse
     */
    @Override
    public CompletableFuture<GetUserDeviceResponse> getUserDevice(GetUserDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserDevice").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserGroup  GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    @Override
    public CompletableFuture<GetUserGroupResponse> getUserGroup(GetUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserGroup").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWmEmbedTask  GetWmEmbedTaskRequest
     * @return GetWmEmbedTaskResponse
     */
    @Override
    public CompletableFuture<GetWmEmbedTaskResponse> getWmEmbedTask(GetWmEmbedTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWmEmbedTask").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWmEmbedTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWmEmbedTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetWmExtractTask  GetWmExtractTaskRequest
     * @return GetWmExtractTaskResponse
     */
    @Override
    public CompletableFuture<GetWmExtractTaskResponse> getWmExtractTask(GetWmExtractTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetWmExtractTask").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetWmExtractTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetWmExtractTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ImportEnterpriseAccelerateTargets  ImportEnterpriseAccelerateTargetsRequest
     * @return ImportEnterpriseAccelerateTargetsResponse
     */
    @Override
    public CompletableFuture<ImportEnterpriseAccelerateTargetsResponse> importEnterpriseAccelerateTargets(ImportEnterpriseAccelerateTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportEnterpriseAccelerateTargets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportEnterpriseAccelerateTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportEnterpriseAccelerateTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplicationsForPrivateAccessPolicy  ListApplicationsForPrivateAccessPolicyRequest
     * @return ListApplicationsForPrivateAccessPolicyResponse
     */
    @Override
    public CompletableFuture<ListApplicationsForPrivateAccessPolicyResponse> listApplicationsForPrivateAccessPolicy(ListApplicationsForPrivateAccessPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplicationsForPrivateAccessPolicy").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationsForPrivateAccessPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationsForPrivateAccessPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplicationsForPrivateAccessTag  ListApplicationsForPrivateAccessTagRequest
     * @return ListApplicationsForPrivateAccessTagResponse
     */
    @Override
    public CompletableFuture<ListApplicationsForPrivateAccessTagResponse> listApplicationsForPrivateAccessTag(ListApplicationsForPrivateAccessTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplicationsForPrivateAccessTag").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationsForPrivateAccessTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationsForPrivateAccessTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApprovalProcesses  ListApprovalProcessesRequest
     * @return ListApprovalProcessesResponse
     */
    @Override
    public CompletableFuture<ListApprovalProcessesResponse> listApprovalProcesses(ListApprovalProcessesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApprovalProcesses").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApprovalProcessesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApprovalProcessesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApprovalProcessesForApprovalSchemas  ListApprovalProcessesForApprovalSchemasRequest
     * @return ListApprovalProcessesForApprovalSchemasResponse
     */
    @Override
    public CompletableFuture<ListApprovalProcessesForApprovalSchemasResponse> listApprovalProcessesForApprovalSchemas(ListApprovalProcessesForApprovalSchemasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApprovalProcessesForApprovalSchemas").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApprovalProcessesForApprovalSchemasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApprovalProcessesForApprovalSchemasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApprovalSchemas  ListApprovalSchemasRequest
     * @return ListApprovalSchemasResponse
     */
    @Override
    public CompletableFuture<ListApprovalSchemasResponse> listApprovalSchemas(ListApprovalSchemasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApprovalSchemas").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApprovalSchemasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApprovalSchemasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApprovalSchemasForApprovalProcesses  ListApprovalSchemasForApprovalProcessesRequest
     * @return ListApprovalSchemasForApprovalProcessesResponse
     */
    @Override
    public CompletableFuture<ListApprovalSchemasForApprovalProcessesResponse> listApprovalSchemasForApprovalProcesses(ListApprovalSchemasForApprovalProcessesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApprovalSchemasForApprovalProcesses").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApprovalSchemasForApprovalProcessesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApprovalSchemasForApprovalProcessesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApprovals  ListApprovalsRequest
     * @return ListApprovalsResponse
     */
    @Override
    public CompletableFuture<ListApprovalsResponse> listApprovals(ListApprovalsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApprovals").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApprovalsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApprovalsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClientUsers  ListClientUsersRequest
     * @return ListClientUsersResponse
     */
    @Override
    public CompletableFuture<ListClientUsersResponse> listClientUsers(ListClientUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClientUsers").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClientUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClientUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListConnectors  ListConnectorsRequest
     * @return ListConnectorsResponse
     */
    @Override
    public CompletableFuture<ListConnectorsResponse> listConnectors(ListConnectorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListConnectors").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListConnectorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListConnectorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDynamicDisposalProcesses  ListDynamicDisposalProcessesRequest
     * @return ListDynamicDisposalProcessesResponse
     */
    @Override
    public CompletableFuture<ListDynamicDisposalProcessesResponse> listDynamicDisposalProcesses(ListDynamicDisposalProcessesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDynamicDisposalProcesses").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDynamicDisposalProcessesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDynamicDisposalProcessesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDynamicRouteRegions  ListDynamicRouteRegionsRequest
     * @return ListDynamicRouteRegionsResponse
     */
    @Override
    public CompletableFuture<ListDynamicRouteRegionsResponse> listDynamicRouteRegions(ListDynamicRouteRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDynamicRouteRegions").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDynamicRouteRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDynamicRouteRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDynamicRoutes  ListDynamicRoutesRequest
     * @return ListDynamicRoutesResponse
     */
    @Override
    public CompletableFuture<ListDynamicRoutesResponse> listDynamicRoutes(ListDynamicRoutesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDynamicRoutes").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDynamicRoutesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDynamicRoutesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnterpriseAccelerateLogs  ListEnterpriseAccelerateLogsRequest
     * @return ListEnterpriseAccelerateLogsResponse
     */
    @Override
    public CompletableFuture<ListEnterpriseAccelerateLogsResponse> listEnterpriseAccelerateLogs(ListEnterpriseAccelerateLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEnterpriseAccelerateLogs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnterpriseAccelerateLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnterpriseAccelerateLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnterpriseAcceleratePolicies  ListEnterpriseAcceleratePoliciesRequest
     * @return ListEnterpriseAcceleratePoliciesResponse
     */
    @Override
    public CompletableFuture<ListEnterpriseAcceleratePoliciesResponse> listEnterpriseAcceleratePolicies(ListEnterpriseAcceleratePoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEnterpriseAcceleratePolicies").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnterpriseAcceleratePoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnterpriseAcceleratePoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnterpriseAccelerateTargets  ListEnterpriseAccelerateTargetsRequest
     * @return ListEnterpriseAccelerateTargetsResponse
     */
    @Override
    public CompletableFuture<ListEnterpriseAccelerateTargetsResponse> listEnterpriseAccelerateTargets(ListEnterpriseAccelerateTargetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEnterpriseAccelerateTargets").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnterpriseAccelerateTargetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnterpriseAccelerateTargetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListExcessiveDeviceRegistrationApplications  ListExcessiveDeviceRegistrationApplicationsRequest
     * @return ListExcessiveDeviceRegistrationApplicationsResponse
     */
    @Override
    public CompletableFuture<ListExcessiveDeviceRegistrationApplicationsResponse> listExcessiveDeviceRegistrationApplications(ListExcessiveDeviceRegistrationApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListExcessiveDeviceRegistrationApplications").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListExcessiveDeviceRegistrationApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListExcessiveDeviceRegistrationApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIdpConfigs  ListIdpConfigsRequest
     * @return ListIdpConfigsResponse
     */
    @Override
    public CompletableFuture<ListIdpConfigsResponse> listIdpConfigs(ListIdpConfigsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIdpConfigs").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIdpConfigsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIdpConfigsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListIdpDepartments  ListIdpDepartmentsRequest
     * @return ListIdpDepartmentsResponse
     */
    @Override
    public CompletableFuture<ListIdpDepartmentsResponse> listIdpDepartments(ListIdpDepartmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIdpDepartments").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIdpDepartmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIdpDepartmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNacUserCert  ListNacUserCertRequest
     * @return ListNacUserCertResponse
     */
    @Override
    public CompletableFuture<ListNacUserCertResponse> listNacUserCert(ListNacUserCertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNacUserCert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNacUserCertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNacUserCertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPolicesForPrivateAccessApplication  ListPolicesForPrivateAccessApplicationRequest
     * @return ListPolicesForPrivateAccessApplicationResponse
     */
    @Override
    public CompletableFuture<ListPolicesForPrivateAccessApplicationResponse> listPolicesForPrivateAccessApplication(ListPolicesForPrivateAccessApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPolicesForPrivateAccessApplication").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPolicesForPrivateAccessApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPolicesForPrivateAccessApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPolicesForPrivateAccessTag  ListPolicesForPrivateAccessTagRequest
     * @return ListPolicesForPrivateAccessTagResponse
     */
    @Override
    public CompletableFuture<ListPolicesForPrivateAccessTagResponse> listPolicesForPrivateAccessTag(ListPolicesForPrivateAccessTagRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPolicesForPrivateAccessTag").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPolicesForPrivateAccessTagResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPolicesForPrivateAccessTagResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPolicesForUserGroup  ListPolicesForUserGroupRequest
     * @return ListPolicesForUserGroupResponse
     */
    @Override
    public CompletableFuture<ListPolicesForUserGroupResponse> listPolicesForUserGroup(ListPolicesForUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPolicesForUserGroup").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPolicesForUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPolicesForUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPopTrafficStatistics  ListPopTrafficStatisticsRequest
     * @return ListPopTrafficStatisticsResponse
     */
    @Override
    public CompletableFuture<ListPopTrafficStatisticsResponse> listPopTrafficStatistics(ListPopTrafficStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPopTrafficStatistics").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPopTrafficStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPopTrafficStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivateAccessApplications  ListPrivateAccessApplicationsRequest
     * @return ListPrivateAccessApplicationsResponse
     */
    @Override
    public CompletableFuture<ListPrivateAccessApplicationsResponse> listPrivateAccessApplications(ListPrivateAccessApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrivateAccessApplications").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivateAccessApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivateAccessApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivateAccessApplicationsForDynamicRoute  ListPrivateAccessApplicationsForDynamicRouteRequest
     * @return ListPrivateAccessApplicationsForDynamicRouteResponse
     */
    @Override
    public CompletableFuture<ListPrivateAccessApplicationsForDynamicRouteResponse> listPrivateAccessApplicationsForDynamicRoute(ListPrivateAccessApplicationsForDynamicRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrivateAccessApplicationsForDynamicRoute").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivateAccessApplicationsForDynamicRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivateAccessApplicationsForDynamicRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivateAccessPolices  ListPrivateAccessPolicesRequest
     * @return ListPrivateAccessPolicesResponse
     */
    @Override
    public CompletableFuture<ListPrivateAccessPolicesResponse> listPrivateAccessPolices(ListPrivateAccessPolicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrivateAccessPolices").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivateAccessPolicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivateAccessPolicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivateAccessTags  ListPrivateAccessTagsRequest
     * @return ListPrivateAccessTagsResponse
     */
    @Override
    public CompletableFuture<ListPrivateAccessTagsResponse> listPrivateAccessTags(ListPrivateAccessTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrivateAccessTags").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivateAccessTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivateAccessTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrivateAccessTagsForDynamicRoute  ListPrivateAccessTagsForDynamicRouteRequest
     * @return ListPrivateAccessTagsForDynamicRouteResponse
     */
    @Override
    public CompletableFuture<ListPrivateAccessTagsForDynamicRouteResponse> listPrivateAccessTagsForDynamicRoute(ListPrivateAccessTagsForDynamicRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrivateAccessTagsForDynamicRoute").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrivateAccessTagsForDynamicRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrivateAccessTagsForDynamicRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRegistrationPolicies  ListRegistrationPoliciesRequest
     * @return ListRegistrationPoliciesResponse
     */
    @Override
    public CompletableFuture<ListRegistrationPoliciesResponse> listRegistrationPolicies(ListRegistrationPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRegistrationPolicies").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegistrationPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegistrationPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRegistrationPoliciesForUserGroup  ListRegistrationPoliciesForUserGroupRequest
     * @return ListRegistrationPoliciesForUserGroupResponse
     */
    @Override
    public CompletableFuture<ListRegistrationPoliciesForUserGroupResponse> listRegistrationPoliciesForUserGroup(ListRegistrationPoliciesForUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRegistrationPoliciesForUserGroup").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegistrationPoliciesForUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegistrationPoliciesForUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSoftwareForUserDevice  ListSoftwareForUserDeviceRequest
     * @return ListSoftwareForUserDeviceResponse
     */
    @Override
    public CompletableFuture<ListSoftwareForUserDeviceResponse> listSoftwareForUserDevice(ListSoftwareForUserDeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSoftwareForUserDevice").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSoftwareForUserDeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSoftwareForUserDeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagsForPrivateAccessApplication  ListTagsForPrivateAccessApplicationRequest
     * @return ListTagsForPrivateAccessApplicationResponse
     */
    @Override
    public CompletableFuture<ListTagsForPrivateAccessApplicationResponse> listTagsForPrivateAccessApplication(ListTagsForPrivateAccessApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagsForPrivateAccessApplication").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagsForPrivateAccessApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagsForPrivateAccessApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagsForPrivateAccessPolicy  ListTagsForPrivateAccessPolicyRequest
     * @return ListTagsForPrivateAccessPolicyResponse
     */
    @Override
    public CompletableFuture<ListTagsForPrivateAccessPolicyResponse> listTagsForPrivateAccessPolicy(ListTagsForPrivateAccessPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagsForPrivateAccessPolicy").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagsForPrivateAccessPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagsForPrivateAccessPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUninstallApplications  ListUninstallApplicationsRequest
     * @return ListUninstallApplicationsResponse
     */
    @Override
    public CompletableFuture<ListUninstallApplicationsResponse> listUninstallApplications(ListUninstallApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUninstallApplications").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUninstallApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUninstallApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserApplications  ListUserApplicationsRequest
     * @return ListUserApplicationsResponse
     */
    @Override
    public CompletableFuture<ListUserApplicationsResponse> listUserApplications(ListUserApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserApplications").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserDevices  ListUserDevicesRequest
     * @return ListUserDevicesResponse
     */
    @Override
    public CompletableFuture<ListUserDevicesResponse> listUserDevices(ListUserDevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserDevices").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserDevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserDevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserGroups  ListUserGroupsRequest
     * @return ListUserGroupsResponse
     */
    @Override
    public CompletableFuture<ListUserGroupsResponse> listUserGroups(ListUserGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserGroups").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserGroupsForPrivateAccessPolicy  ListUserGroupsForPrivateAccessPolicyRequest
     * @return ListUserGroupsForPrivateAccessPolicyResponse
     */
    @Override
    public CompletableFuture<ListUserGroupsForPrivateAccessPolicyResponse> listUserGroupsForPrivateAccessPolicy(ListUserGroupsForPrivateAccessPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserGroupsForPrivateAccessPolicy").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserGroupsForPrivateAccessPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserGroupsForPrivateAccessPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserGroupsForRegistrationPolicy  ListUserGroupsForRegistrationPolicyRequest
     * @return ListUserGroupsForRegistrationPolicyResponse
     */
    @Override
    public CompletableFuture<ListUserGroupsForRegistrationPolicyResponse> listUserGroupsForRegistrationPolicy(ListUserGroupsForRegistrationPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserGroupsForRegistrationPolicy").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserGroupsForRegistrationPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserGroupsForRegistrationPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListUserPrivateAccessPolicies  ListUserPrivateAccessPoliciesRequest
     * @return ListUserPrivateAccessPoliciesResponse
     */
    @Override
    public CompletableFuture<ListUserPrivateAccessPoliciesResponse> listUserPrivateAccessPolicies(ListUserPrivateAccessPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserPrivateAccessPolicies").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserPrivateAccessPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserPrivateAccessPoliciesResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUsers").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of LookupWmInfoMapping  LookupWmInfoMappingRequest
     * @return LookupWmInfoMappingResponse
     */
    @Override
    public CompletableFuture<LookupWmInfoMappingResponse> lookupWmInfoMapping(LookupWmInfoMappingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LookupWmInfoMapping").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LookupWmInfoMappingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LookupWmInfoMappingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyEnterpriseAcceleratePolicy  ModifyEnterpriseAcceleratePolicyRequest
     * @return ModifyEnterpriseAcceleratePolicyResponse
     */
    @Override
    public CompletableFuture<ModifyEnterpriseAcceleratePolicyResponse> modifyEnterpriseAcceleratePolicy(ModifyEnterpriseAcceleratePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyEnterpriseAcceleratePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyEnterpriseAcceleratePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyEnterpriseAcceleratePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI RevokeUserSession is deprecated  * @param request  the request parameters of RevokeUserSession  RevokeUserSessionRequest
     * @return RevokeUserSessionResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<RevokeUserSessionResponse> revokeUserSession(RevokeUserSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeUserSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeUserSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeUserSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApprovalProcess  UpdateApprovalProcessRequest
     * @return UpdateApprovalProcessResponse
     */
    @Override
    public CompletableFuture<UpdateApprovalProcessResponse> updateApprovalProcess(UpdateApprovalProcessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateApprovalProcess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApprovalProcessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApprovalProcessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApprovalStatus  UpdateApprovalStatusRequest
     * @return UpdateApprovalStatusResponse
     */
    @Override
    public CompletableFuture<UpdateApprovalStatusResponse> updateApprovalStatus(UpdateApprovalStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateApprovalStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApprovalStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApprovalStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateBootAndAntiUninstallPolicy  UpdateBootAndAntiUninstallPolicyRequest
     * @return UpdateBootAndAntiUninstallPolicyResponse
     */
    @Override
    public CompletableFuture<UpdateBootAndAntiUninstallPolicyResponse> updateBootAndAntiUninstallPolicy(UpdateBootAndAntiUninstallPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBootAndAntiUninstallPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBootAndAntiUninstallPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBootAndAntiUninstallPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateClientUser  UpdateClientUserRequest
     * @return UpdateClientUserResponse
     */
    @Override
    public CompletableFuture<UpdateClientUserResponse> updateClientUser(UpdateClientUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateClientUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClientUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClientUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateClientUserPassword  UpdateClientUserPasswordRequest
     * @return UpdateClientUserPasswordResponse
     */
    @Override
    public CompletableFuture<UpdateClientUserPasswordResponse> updateClientUserPassword(UpdateClientUserPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateClientUserPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClientUserPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClientUserPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateClientUserStatus  UpdateClientUserStatusRequest
     * @return UpdateClientUserStatusResponse
     */
    @Override
    public CompletableFuture<UpdateClientUserStatusResponse> updateClientUserStatus(UpdateClientUserStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateClientUserStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClientUserStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClientUserStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDynamicRoute  UpdateDynamicRouteRequest
     * @return UpdateDynamicRouteResponse
     */
    @Override
    public CompletableFuture<UpdateDynamicRouteResponse> updateDynamicRoute(UpdateDynamicRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDynamicRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDynamicRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDynamicRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateExcessiveDeviceRegistrationApplicationsStatus  UpdateExcessiveDeviceRegistrationApplicationsStatusRequest
     * @return UpdateExcessiveDeviceRegistrationApplicationsStatusResponse
     */
    @Override
    public CompletableFuture<UpdateExcessiveDeviceRegistrationApplicationsStatusResponse> updateExcessiveDeviceRegistrationApplicationsStatus(UpdateExcessiveDeviceRegistrationApplicationsStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateExcessiveDeviceRegistrationApplicationsStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateExcessiveDeviceRegistrationApplicationsStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateExcessiveDeviceRegistrationApplicationsStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateIdpDepartment  UpdateIdpDepartmentRequest
     * @return UpdateIdpDepartmentResponse
     */
    @Override
    public CompletableFuture<UpdateIdpDepartmentResponse> updateIdpDepartment(UpdateIdpDepartmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIdpDepartment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIdpDepartmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIdpDepartmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateNacUserCertStatus  UpdateNacUserCertStatusRequest
     * @return UpdateNacUserCertStatusResponse
     */
    @Override
    public CompletableFuture<UpdateNacUserCertStatusResponse> updateNacUserCertStatus(UpdateNacUserCertStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNacUserCertStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNacUserCertStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNacUserCertStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePrivateAccessApplication  UpdatePrivateAccessApplicationRequest
     * @return UpdatePrivateAccessApplicationResponse
     */
    @Override
    public CompletableFuture<UpdatePrivateAccessApplicationResponse> updatePrivateAccessApplication(UpdatePrivateAccessApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePrivateAccessApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePrivateAccessApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePrivateAccessApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePrivateAccessPolicy  UpdatePrivateAccessPolicyRequest
     * @return UpdatePrivateAccessPolicyResponse
     */
    @Override
    public CompletableFuture<UpdatePrivateAccessPolicyResponse> updatePrivateAccessPolicy(UpdatePrivateAccessPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePrivateAccessPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePrivateAccessPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePrivateAccessPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateRegistrationPolicy  UpdateRegistrationPolicyRequest
     * @return UpdateRegistrationPolicyResponse
     */
    @Override
    public CompletableFuture<UpdateRegistrationPolicyResponse> updateRegistrationPolicy(UpdateRegistrationPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRegistrationPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRegistrationPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRegistrationPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUninstallApplicationsStatus  UpdateUninstallApplicationsStatusRequest
     * @return UpdateUninstallApplicationsStatusResponse
     */
    @Override
    public CompletableFuture<UpdateUninstallApplicationsStatusResponse> updateUninstallApplicationsStatus(UpdateUninstallApplicationsStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUninstallApplicationsStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUninstallApplicationsStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUninstallApplicationsStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUserDevicesSharingStatus  UpdateUserDevicesSharingStatusRequest
     * @return UpdateUserDevicesSharingStatusResponse
     */
    @Override
    public CompletableFuture<UpdateUserDevicesSharingStatusResponse> updateUserDevicesSharingStatus(UpdateUserDevicesSharingStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUserDevicesSharingStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserDevicesSharingStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserDevicesSharingStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUserDevicesStatus  UpdateUserDevicesStatusRequest
     * @return UpdateUserDevicesStatusResponse
     */
    @Override
    public CompletableFuture<UpdateUserDevicesStatusResponse> updateUserDevicesStatus(UpdateUserDevicesStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUserDevicesStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserDevicesStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserDevicesStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUserGroup  UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     */
    @Override
    public CompletableFuture<UpdateUserGroupResponse> updateUserGroup(UpdateUserGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUserGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUsersStatus  UpdateUsersStatusRequest
     * @return UpdateUsersStatusResponse
     */
    @Override
    public CompletableFuture<UpdateUsersStatusResponse> updateUsersStatus(UpdateUsersStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUsersStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUsersStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUsersStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
