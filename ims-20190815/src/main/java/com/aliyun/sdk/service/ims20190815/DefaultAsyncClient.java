// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ims20190815.models.*;
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
        this.product = "Ims";
        this.version = "2019-08-15";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddClientIdToOIDCProvider  AddClientIdToOIDCProviderRequest
     * @return AddClientIdToOIDCProviderResponse
     */
    @Override
    public CompletableFuture<AddClientIdToOIDCProviderResponse> addClientIdToOIDCProvider(AddClientIdToOIDCProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddClientIdToOIDCProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddClientIdToOIDCProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddClientIdToOIDCProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to add the fingerprint <code>902ef2deeb3c5b13ea4c3d5193629309e231****</code> to the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of AddFingerprintToOIDCProvider  AddFingerprintToOIDCProviderRequest
     * @return AddFingerprintToOIDCProviderResponse
     */
    @Override
    public CompletableFuture<AddFingerprintToOIDCProviderResponse> addFingerprintToOIDCProvider(AddFingerprintToOIDCProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddFingerprintToOIDCProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddFingerprintToOIDCProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddFingerprintToOIDCProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddUserToGroup  AddUserToGroupRequest
     * @return AddUserToGroupResponse
     */
    @Override
    public CompletableFuture<AddUserToGroupResponse> addUserToGroup(AddUserToGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddUserToGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddUserToGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddUserToGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindMFADevice  BindMFADeviceRequest
     * @return BindMFADeviceResponse
     */
    @Override
    public CompletableFuture<BindMFADeviceResponse> bindMFADevice(BindMFADeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindMFADevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindMFADeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindMFADeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is available only for RAM users. Before you call this operation, make sure that <code>AllowUserToChangePassword</code> in <a href="https://help.aliyun.com/document_detail/43765.html">SetSecurityPreference</a> is set to <code>True</code>. The value True indicates that RAM users can manage their passwords.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ChangePassword  ChangePasswordRequest
     * @return ChangePasswordResponse
     */
    @Override
    public CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangePassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangePasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangePasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAccessKey  CreateAccessKeyRequest
     * @return CreateAccessKeyResponse
     */
    @Override
    public CompletableFuture<CreateAccessKeyResponse> createAccessKey(CreateAccessKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccessKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAccessKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAccessKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAppSecret  CreateAppSecretRequest
     * @return CreateAppSecretResponse
     */
    @Override
    public CompletableFuture<CreateAppSecretResponse> createAppSecret(CreateAppSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAppSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAppSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAppSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    @Override
    public CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    @Override
    public CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLoginProfile  CreateLoginProfileRequest
     * @return CreateLoginProfileResponse
     */
    @Override
    public CompletableFuture<CreateLoginProfileResponse> createLoginProfile(CreateLoginProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLoginProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoginProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoginProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the information such as the URL of the issuer, the fingerprints of HTTPS certificates, and the client IDs are obtained from an external (IdP, such as Google G Suite or Okta.</p>
     * <h3>Limits</h3>
     * <ul>
     * <li>You can create a maximum of 100 OIDC IdPs in an Alibaba Cloud account.</li>
     * <li>You can add a maximum of 20 client IDs to an OIDC IdP.</li>
     * <li>You can add a maximum of five fingerprints to an OIDC IdP.</li>
     * </ul>
     * <h3></h3>
     * <p>This topic provides an example on how to create an IdP named <code>TestOIDCProvider</code> to configure a trust relationship between the external IdP and Alibaba Cloud.</p>
     * 
     * @param request the request parameters of CreateOIDCProvider  CreateOIDCProviderRequest
     * @return CreateOIDCProviderResponse
     */
    @Override
    public CompletableFuture<CreateOIDCProviderResponse> createOIDCProvider(CreateOIDCProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOIDCProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOIDCProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOIDCProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSAMLProvider  CreateSAMLProviderRequest
     * @return CreateSAMLProviderResponse
     */
    @Override
    public CompletableFuture<CreateSAMLProviderResponse> createSAMLProvider(CreateSAMLProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSAMLProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSAMLProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSAMLProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a RAM user named <code>test</code>.</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    @Override
    public CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVirtualMFADevice  CreateVirtualMFADeviceRequest
     * @return CreateVirtualMFADeviceResponse
     */
    @Override
    public CompletableFuture<CreateVirtualMFADeviceResponse> createVirtualMFADevice(CreateVirtualMFADeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVirtualMFADevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVirtualMFADeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVirtualMFADeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAccessKey  DeleteAccessKeyRequest
     * @return DeleteAccessKeyResponse
     */
    @Override
    public CompletableFuture<DeleteAccessKeyResponse> deleteAccessKey(DeleteAccessKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccessKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAccessKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAccessKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAppSecret  DeleteAppSecretRequest
     * @return DeleteAppSecretResponse
     */
    @Override
    public CompletableFuture<DeleteAppSecretResponse> deleteAppSecret(DeleteAppSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAppSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAppSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAppSecretResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a RAM user group, make sure that no policies are attached to the group and no RAM users are included in the group.</p>
     * 
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    @Override
    public CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLoginProfile  DeleteLoginProfileRequest
     * @return DeleteLoginProfileResponse
     */
    @Override
    public CompletableFuture<DeleteLoginProfileResponse> deleteLoginProfile(DeleteLoginProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLoginProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLoginProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLoginProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of DeleteOIDCProvider  DeleteOIDCProviderRequest
     * @return DeleteOIDCProviderResponse
     */
    @Override
    public CompletableFuture<DeleteOIDCProviderResponse> deleteOIDCProvider(DeleteOIDCProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteOIDCProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOIDCProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOIDCProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePasskey  DeletePasskeyRequest
     * @return DeletePasskeyResponse
     */
    @Override
    public CompletableFuture<DeletePasskeyResponse> deletePasskey(DeletePasskeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePasskey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePasskeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePasskeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSAMLProvider  DeleteSAMLProviderRequest
     * @return DeleteSAMLProviderResponse
     */
    @Override
    public CompletableFuture<DeleteSAMLProviderResponse> deleteSAMLProvider(DeleteSAMLProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSAMLProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSAMLProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSAMLProviderResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DeleteVirtualMFADevice  DeleteVirtualMFADeviceRequest
     * @return DeleteVirtualMFADeviceResponse
     */
    @Override
    public CompletableFuture<DeleteVirtualMFADeviceResponse> deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVirtualMFADevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVirtualMFADeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVirtualMFADeviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableVirtualMFA  DisableVirtualMFARequest
     * @return DisableVirtualMFAResponse
     */
    @Override
    public CompletableFuture<DisableVirtualMFAResponse> disableVirtualMFA(DisableVirtualMFARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableVirtualMFA").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableVirtualMFAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableVirtualMFAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateCredentialReport  GenerateCredentialReportRequest
     * @return GenerateCredentialReportResponse
     */
    @Override
    public CompletableFuture<GenerateCredentialReportResponse> generateCredentialReport(GenerateCredentialReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateCredentialReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateCredentialReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateCredentialReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccessKeyLastUsed  GetAccessKeyLastUsedRequest
     * @return GetAccessKeyLastUsedResponse
     */
    @Override
    public CompletableFuture<GetAccessKeyLastUsedResponse> getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccessKeyLastUsed").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccessKeyLastUsedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccessKeyLastUsedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccountMFAInfo  GetAccountMFAInfoRequest
     * @return GetAccountMFAInfoResponse
     */
    @Override
    public CompletableFuture<GetAccountMFAInfoResponse> getAccountMFAInfo(GetAccountMFAInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccountMFAInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountMFAInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountMFAInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccountSecurityPracticeReport  GetAccountSecurityPracticeReportRequest
     * @return GetAccountSecurityPracticeReportResponse
     */
    @Override
    public CompletableFuture<GetAccountSecurityPracticeReportResponse> getAccountSecurityPracticeReport(GetAccountSecurityPracticeReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccountSecurityPracticeReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountSecurityPracticeReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountSecurityPracticeReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccountSummary  GetAccountSummaryRequest
     * @return GetAccountSummaryResponse
     */
    @Override
    public CompletableFuture<GetAccountSummaryResponse> getAccountSummary(GetAccountSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAccountSummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAppSecret  GetAppSecretRequest
     * @return GetAppSecretResponse
     */
    @Override
    public CompletableFuture<GetAppSecretResponse> getAppSecret(GetAppSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAppSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAppSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAppSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the configurations of an application named <code>472457090344041****</code>.</p>
     * 
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    @Override
    public CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCredentialReport  GetCredentialReportRequest
     * @return GetCredentialReportResponse
     */
    @Override
    public CompletableFuture<GetCredentialReportResponse> getCredentialReport(GetCredentialReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCredentialReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCredentialReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCredentialReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDefaultDomain  GetDefaultDomainRequest
     * @return GetDefaultDomainResponse
     */
    @Override
    public CompletableFuture<GetDefaultDomainResponse> getDefaultDomain(GetDefaultDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDefaultDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDefaultDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDefaultDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetGroup  GetGroupRequest
     * @return GetGroupResponse
     */
    @Override
    public CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLoginProfile  GetLoginProfileRequest
     * @return GetLoginProfileResponse
     */
    @Override
    public CompletableFuture<GetLoginProfileResponse> getLoginProfile(GetLoginProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLoginProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLoginProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLoginProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to query the information about an OpenID Connect (OIDC) identity provider (IdP) named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of GetOIDCProvider  GetOIDCProviderRequest
     * @return GetOIDCProviderResponse
     */
    @Override
    public CompletableFuture<GetOIDCProviderResponse> getOIDCProvider(GetOIDCProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOIDCProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOIDCProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOIDCProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPasswordPolicy  GetPasswordPolicyRequest
     * @return GetPasswordPolicyResponse
     */
    @Override
    public CompletableFuture<GetPasswordPolicyResponse> getPasswordPolicy(GetPasswordPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPasswordPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPasswordPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPasswordPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSAMLProvider  GetSAMLProviderRequest
     * @return GetSAMLProviderResponse
     */
    @Override
    public CompletableFuture<GetSAMLProviderResponse> getSAMLProvider(GetSAMLProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSAMLProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSAMLProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSAMLProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSecurityPreference  GetSecurityPreferenceRequest
     * @return GetSecurityPreferenceResponse
     */
    @Override
    public CompletableFuture<GetSecurityPreferenceResponse> getSecurityPreference(GetSecurityPreferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSecurityPreference").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSecurityPreferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSecurityPreferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the information about a RAM user named <code>test@example.onaliyun.com</code>.</p>
     * 
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
     * @param request the request parameters of GetUserMFAInfo  GetUserMFAInfoRequest
     * @return GetUserMFAInfoResponse
     */
    @Override
    public CompletableFuture<GetUserMFAInfoResponse> getUserMFAInfo(GetUserMFAInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserMFAInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserMFAInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserMFAInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserSsoSettings  GetUserSsoSettingsRequest
     * @return GetUserSsoSettingsResponse
     */
    @Override
    public CompletableFuture<GetUserSsoSettingsResponse> getUserSsoSettings(GetUserSsoSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUserSsoSettings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserSsoSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserSsoSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVerificationInfo  GetVerificationInfoRequest
     * @return GetVerificationInfoResponse
     */
    @Override
    public CompletableFuture<GetVerificationInfoResponse> getVerificationInfo(GetVerificationInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVerificationInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVerificationInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVerificationInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAccessKeys  ListAccessKeysRequest
     * @return ListAccessKeysResponse
     */
    @Override
    public CompletableFuture<ListAccessKeysResponse> listAccessKeys(ListAccessKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccessKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAccessKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAccessKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAppSecretIds  ListAppSecretIdsRequest
     * @return ListAppSecretIdsResponse
     */
    @Override
    public CompletableFuture<ListAppSecretIdsResponse> listAppSecretIds(ListAppSecretIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAppSecretIds").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAppSecretIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAppSecretIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the applications within the current account. The returned result shows that only one application named <code>myapp</code> belongs to the current account.</p>
     * 
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    @Override
    public CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplications").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGroups  ListGroupsRequest
     * @return ListGroupsResponse
     */
    @Override
    public CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListGroupsForUser  ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     */
    @Override
    public CompletableFuture<ListGroupsForUserResponse> listGroupsForUser(ListGroupsForUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGroupsForUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGroupsForUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGroupsForUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to query all OpenID Connect (OIDC) identity providers (IdPs) within your Alibaba Cloud account. The response shows that your Alibaba Cloud account has only one OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of ListOIDCProviders  ListOIDCProvidersRequest
     * @return ListOIDCProvidersResponse
     */
    @Override
    public CompletableFuture<ListOIDCProvidersResponse> listOIDCProviders(ListOIDCProvidersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOIDCProviders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOIDCProvidersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOIDCProvidersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPasskeys  ListPasskeysRequest
     * @return ListPasskeysResponse
     */
    @Override
    public CompletableFuture<ListPasskeysResponse> listPasskeys(ListPasskeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPasskeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPasskeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPasskeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPredefinedScopes  ListPredefinedScopesRequest
     * @return ListPredefinedScopesResponse
     */
    @Override
    public CompletableFuture<ListPredefinedScopesResponse> listPredefinedScopes(ListPredefinedScopesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPredefinedScopes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPredefinedScopesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPredefinedScopesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSAMLProviders  ListSAMLProvidersRequest
     * @return ListSAMLProvidersResponse
     */
    @Override
    public CompletableFuture<ListSAMLProvidersResponse> listSAMLProviders(ListSAMLProvidersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSAMLProviders").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSAMLProvidersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSAMLProvidersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>You must specify at least one of the following parameters or parameter pairs in a request to determine a query object:</p>
     * <ul>
     * <li><code>ResourceId.N</code></li>
     * <li><code>Tag.N.Key</code></li>
     * <li><code>Tag.N.Key</code> and <code>Tag.N.Value</code></li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <p>You can call the following API operations to query the information about all RAM users:</p>
     * <ul>
     * <li>ListUsers: queries the details of all RAM users.</li>
     * <li>ListUserBasicInfos: queries the basic information about all RAM users. The basic information includes only the logon names (<code>UserPrincipalName</code>), display names (<code>DisplayName</code>), and user IDs (<code>UserId</code>).</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserBasicInfos  ListUserBasicInfosRequest
     * @return ListUserBasicInfosResponse
     */
    @Override
    public CompletableFuture<ListUserBasicInfosResponse> listUserBasicInfos(ListUserBasicInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUserBasicInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUserBasicInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUserBasicInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <p>You can call the following API operations to query the details of all RAM users:</p>
     * <ul>
     * <li>ListUsers: queries the details of all RAM users.</li>
     * <li>ListUserBasicInfos: queries the basic information about all RAM users. The basic information includes only the logon names (<code>UserPrincipalName</code>), display names (<code>DisplayName</code>), and user IDs (<code>UserId</code>).</li>
     * </ul>
     * 
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
     * @param request the request parameters of ListUsersForGroup  ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     */
    @Override
    public CompletableFuture<ListUsersForGroupResponse> listUsersForGroup(ListUsersForGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUsersForGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersForGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersForGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVirtualMFADevices  ListVirtualMFADevicesRequest
     * @return ListVirtualMFADevicesResponse
     */
    @Override
    public CompletableFuture<ListVirtualMFADevicesResponse> listVirtualMFADevices(ListVirtualMFADevicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVirtualMFADevices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVirtualMFADevicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVirtualMFADevicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the client ID <code>498469743454717****</code> from the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of RemoveClientIdFromOIDCProvider  RemoveClientIdFromOIDCProviderRequest
     * @return RemoveClientIdFromOIDCProviderResponse
     */
    @Override
    public CompletableFuture<RemoveClientIdFromOIDCProviderResponse> removeClientIdFromOIDCProvider(RemoveClientIdFromOIDCProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveClientIdFromOIDCProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveClientIdFromOIDCProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveClientIdFromOIDCProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the fingerprint <code>6938fd4d98bab03faadb97b34396831e3780****</code> from the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of RemoveFingerprintFromOIDCProvider  RemoveFingerprintFromOIDCProviderRequest
     * @return RemoveFingerprintFromOIDCProviderResponse
     */
    @Override
    public CompletableFuture<RemoveFingerprintFromOIDCProviderResponse> removeFingerprintFromOIDCProvider(RemoveFingerprintFromOIDCProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveFingerprintFromOIDCProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveFingerprintFromOIDCProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveFingerprintFromOIDCProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveUserFromGroup  RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     */
    @Override
    public CompletableFuture<RemoveUserFromGroupResponse> removeUserFromGroup(RemoveUserFromGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveUserFromGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveUserFromGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveUserFromGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetDefaultDomain  SetDefaultDomainRequest
     * @return SetDefaultDomainResponse
     */
    @Override
    public CompletableFuture<SetDefaultDomainResponse> setDefaultDomain(SetDefaultDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDefaultDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDefaultDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDefaultDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetPasswordPolicy  SetPasswordPolicyRequest
     * @return SetPasswordPolicyResponse
     */
    @Override
    public CompletableFuture<SetPasswordPolicyResponse> setPasswordPolicy(SetPasswordPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetPasswordPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetPasswordPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetPasswordPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to enable multi-factor authentication (MFA) only for RAM users who initiated unusual logons.</p>
     * 
     * @param request the request parameters of SetSecurityPreference  SetSecurityPreferenceRequest
     * @return SetSecurityPreferenceResponse
     */
    @Override
    public CompletableFuture<SetSecurityPreferenceResponse> setSecurityPreference(SetSecurityPreferenceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetSecurityPreference").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetSecurityPreferenceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetSecurityPreferenceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetUserSsoSettings  SetUserSsoSettingsRequest
     * @return SetUserSsoSettingsResponse
     */
    @Override
    public CompletableFuture<SetUserSsoSettingsResponse> setUserSsoSettings(SetUserSsoSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetUserSsoSettings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetUserSsoSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetUserSsoSettingsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindMFADevice  UnbindMFADeviceRequest
     * @return UnbindMFADeviceResponse
     */
    @Override
    public CompletableFuture<UnbindMFADeviceResponse> unbindMFADevice(UnbindMFADeviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindMFADevice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindMFADeviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindMFADeviceResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAccessKey  UpdateAccessKeyRequest
     * @return UpdateAccessKeyResponse
     */
    @Override
    public CompletableFuture<UpdateAccessKeyResponse> updateAccessKey(UpdateAccessKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAccessKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAccessKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAccessKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateApplication  UpdateApplicationRequest
     * @return UpdateApplicationResponse
     */
    @Override
    public CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    @Override
    public CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLoginProfile  UpdateLoginProfileRequest
     * @return UpdateLoginProfileResponse
     */
    @Override
    public CompletableFuture<UpdateLoginProfileResponse> updateLoginProfile(UpdateLoginProfileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLoginProfile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoginProfileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoginProfileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to change the description of the OIDC IdP named <code>TestOIDCProvider</code> to <code>This is a new OIDC Provider.</code></p>
     * 
     * @param request the request parameters of UpdateOIDCProvider  UpdateOIDCProviderRequest
     * @return UpdateOIDCProviderResponse
     */
    @Override
    public CompletableFuture<UpdateOIDCProviderResponse> updateOIDCProvider(UpdateOIDCProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateOIDCProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOIDCProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOIDCProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePasskey  UpdatePasskeyRequest
     * @return UpdatePasskeyResponse
     */
    @Override
    public CompletableFuture<UpdatePasskeyResponse> updatePasskey(UpdatePasskeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePasskey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePasskeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePasskeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the description of an IdP named <code>test-provider</code> to <code>This is a new provider.</code></p>
     * 
     * @param request the request parameters of UpdateSAMLProvider  UpdateSAMLProviderRequest
     * @return UpdateSAMLProviderResponse
     */
    @Override
    public CompletableFuture<UpdateSAMLProviderResponse> updateSAMLProvider(UpdateSAMLProviderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSAMLProvider").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSAMLProviderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSAMLProviderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to modify the name of a RAM user from <code>test@example.onaliyun.com</code> to <code>new@example.onaliyun.com</code>.</p>
     * 
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    @Override
    public CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
