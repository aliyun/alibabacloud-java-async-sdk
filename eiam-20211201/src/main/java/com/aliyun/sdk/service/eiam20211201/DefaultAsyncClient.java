// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.eiam20211201.models.*;
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
        this.product = "Eiam";
        this.version = "2021-12-01";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<AddUserToOrganizationalUnitsResponse> addUserToOrganizationalUnits(AddUserToOrganizationalUnitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddUserToOrganizationalUnits").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddUserToOrganizationalUnitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddUserToOrganizationalUnitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AddUsersToGroupResponse> addUsersToGroup(AddUsersToGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddUsersToGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddUsersToGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddUsersToGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AuthorizeApplicationToGroupsResponse> authorizeApplicationToGroups(AuthorizeApplicationToGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeApplicationToGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeApplicationToGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeApplicationToGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AuthorizeApplicationToOrganizationalUnitsResponse> authorizeApplicationToOrganizationalUnits(AuthorizeApplicationToOrganizationalUnitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeApplicationToOrganizationalUnits").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeApplicationToOrganizationalUnitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeApplicationToOrganizationalUnitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AuthorizeApplicationToUsersResponse> authorizeApplicationToUsers(AuthorizeApplicationToUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeApplicationToUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeApplicationToUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeApplicationToUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * IDaaS EIAM supports the following two standard single sign-on (SSO) protocols for adding applications: SAML 2.0 and OIDC. You can select an SSO protocol based on your business requirements when you add an application. You cannot change the SSO protocol that you selected after the application is added.
      *
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

    @Override
    public CompletableFuture<CreateApplicationClientSecretResponse> createApplicationClientSecret(CreateApplicationClientSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApplicationClientSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApplicationClientSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApplicationClientSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateNetworkAccessEndpointResponse> createNetworkAccessEndpoint(CreateNetworkAccessEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkAccessEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNetworkAccessEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNetworkAccessEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateOrganizationalUnitResponse> createOrganizationalUnit(CreateOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateOrganizationalUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrganizationalUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * Make sure that the EIAM application that you want to delete is not used before you delete the EIAM application. After you delete the EIAM application, all configurations are deleted and cannot be restored.
      *
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

    @Override
    public CompletableFuture<DeleteApplicationClientSecretResponse> deleteApplicationClientSecret(DeleteApplicationClientSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApplicationClientSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApplicationClientSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApplicationClientSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * Make sure that the instance to be deleted is no longer used. If the instance is deleted, all data related to the instance will be deleted.
      *
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

    @Override
    public CompletableFuture<DeleteNetworkAccessEndpointResponse> deleteNetworkAccessEndpoint(DeleteNetworkAccessEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkAccessEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNetworkAccessEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNetworkAccessEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteOrganizationalUnitResponse> deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteOrganizationalUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOrganizationalUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * All features of the EIAM application cannot be used if you disable the EIAM application, such as single sign-on (SSO) and account synchronization. Make sure that you acknowledge the risks of the delete operation.
      *
     */
    @Override
    public CompletableFuture<DisableApplicationResponse> disableApplication(DisableApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableApplicationApiInvokeResponse> disableApplicationApiInvoke(DisableApplicationApiInvokeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableApplicationApiInvoke").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableApplicationApiInvokeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableApplicationApiInvokeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableApplicationClientSecretResponse> disableApplicationClientSecret(DisableApplicationClientSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableApplicationClientSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableApplicationClientSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableApplicationClientSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableApplicationProvisioningResponse> disableApplicationProvisioning(DisableApplicationProvisioningRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableApplicationProvisioning").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableApplicationProvisioningResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableApplicationProvisioningResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableApplicationSsoResponse> disableApplicationSso(DisableApplicationSsoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableApplicationSso").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableApplicationSsoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableApplicationSsoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableApplicationResponse> enableApplication(EnableApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableApplicationApiInvokeResponse> enableApplicationApiInvoke(EnableApplicationApiInvokeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableApplicationApiInvoke").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableApplicationApiInvokeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableApplicationApiInvokeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableApplicationClientSecretResponse> enableApplicationClientSecret(EnableApplicationClientSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableApplicationClientSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableApplicationClientSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableApplicationClientSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableApplicationProvisioningResponse> enableApplicationProvisioning(EnableApplicationProvisioningRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableApplicationProvisioning").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableApplicationProvisioningResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableApplicationProvisioningResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableApplicationSsoResponse> enableApplicationSso(EnableApplicationSsoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableApplicationSso").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableApplicationSsoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableApplicationSsoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<GetApplicationGrantScopeResponse> getApplicationGrantScope(GetApplicationGrantScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApplicationGrantScope").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationGrantScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationGrantScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetApplicationProvisioningConfigResponse> getApplicationProvisioningConfig(GetApplicationProvisioningConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApplicationProvisioningConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationProvisioningConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationProvisioningConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetApplicationProvisioningScopeResponse> getApplicationProvisioningScope(GetApplicationProvisioningScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApplicationProvisioningScope").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationProvisioningScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationProvisioningScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetApplicationSsoConfigResponse> getApplicationSsoConfig(GetApplicationSsoConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetApplicationSsoConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationSsoConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationSsoConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetForgetPasswordConfigurationResponse> getForgetPasswordConfiguration(GetForgetPasswordConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetForgetPasswordConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetForgetPasswordConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetForgetPasswordConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<GetNetworkAccessEndpointResponse> getNetworkAccessEndpoint(GetNetworkAccessEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNetworkAccessEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNetworkAccessEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNetworkAccessEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetOrganizationalUnitResponse> getOrganizationalUnit(GetOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetOrganizationalUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrganizationalUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetPasswordComplexityConfigurationResponse> getPasswordComplexityConfiguration(GetPasswordComplexityConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPasswordComplexityConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPasswordComplexityConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPasswordComplexityConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetPasswordExpirationConfigurationResponse> getPasswordExpirationConfiguration(GetPasswordExpirationConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPasswordExpirationConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPasswordExpirationConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPasswordExpirationConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetPasswordHistoryConfigurationResponse> getPasswordHistoryConfiguration(GetPasswordHistoryConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPasswordHistoryConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPasswordHistoryConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPasswordHistoryConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetPasswordInitializationConfigurationResponse> getPasswordInitializationConfiguration(GetPasswordInitializationConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPasswordInitializationConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPasswordInitializationConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPasswordInitializationConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetRootOrganizationalUnitResponse> getRootOrganizationalUnit(GetRootOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRootOrganizationalUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRootOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRootOrganizationalUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<ListApplicationClientSecretsResponse> listApplicationClientSecrets(ListApplicationClientSecretsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplicationClientSecrets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationClientSecretsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationClientSecretsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * You can only query the permissions that are directly granted to the EIAM organization by calling the ListApplicationsForOrganizationalUnit operation. You can filter applications by configuring the **ApplicationIds** parameter when you call this operation.
      *
     */
    @Override
    public CompletableFuture<ListApplicationsForOrganizationalUnitResponse> listApplicationsForOrganizationalUnit(ListApplicationsForOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplicationsForOrganizationalUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationsForOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationsForOrganizationalUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListApplicationsForUserResponse> listApplicationsForUser(ListApplicationsForUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplicationsForUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationsForUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationsForUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<ListGroupsForApplicationResponse> listGroupsForApplication(ListGroupsForApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGroupsForApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGroupsForApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGroupsForApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<ListNetworkAccessEndpointAvailableRegionsResponse> listNetworkAccessEndpointAvailableRegions(ListNetworkAccessEndpointAvailableRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNetworkAccessEndpointAvailableRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNetworkAccessEndpointAvailableRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNetworkAccessEndpointAvailableRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListNetworkAccessEndpointAvailableZonesResponse> listNetworkAccessEndpointAvailableZones(ListNetworkAccessEndpointAvailableZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNetworkAccessEndpointAvailableZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNetworkAccessEndpointAvailableZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNetworkAccessEndpointAvailableZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListNetworkAccessEndpointsResponse> listNetworkAccessEndpoints(ListNetworkAccessEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNetworkAccessEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNetworkAccessEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNetworkAccessEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListNetworkAccessPathsResponse> listNetworkAccessPaths(ListNetworkAccessPathsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNetworkAccessPaths").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNetworkAccessPathsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNetworkAccessPathsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListOrganizationalUnitParentsResponse> listOrganizationalUnitParents(ListOrganizationalUnitParentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOrganizationalUnitParents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOrganizationalUnitParentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOrganizationalUnitParentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListOrganizationalUnitsResponse> listOrganizationalUnits(ListOrganizationalUnitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOrganizationalUnits").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOrganizationalUnitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOrganizationalUnitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListOrganizationalUnitsForApplicationResponse> listOrganizationalUnitsForApplication(ListOrganizationalUnitsForApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListOrganizationalUnitsForApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOrganizationalUnitsForApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOrganizationalUnitsForApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<ListUsersForApplicationResponse> listUsersForApplication(ListUsersForApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUsersForApplication").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersForApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersForApplicationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<ObtainApplicationClientSecretResponse> obtainApplicationClientSecret(ObtainApplicationClientSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ObtainApplicationClientSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ObtainApplicationClientSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ObtainApplicationClientSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RemoveUserFromOrganizationalUnitsResponse> removeUserFromOrganizationalUnits(RemoveUserFromOrganizationalUnitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveUserFromOrganizationalUnits").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveUserFromOrganizationalUnitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveUserFromOrganizationalUnitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RemoveUsersFromGroupResponse> removeUsersFromGroup(RemoveUsersFromGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveUsersFromGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveUsersFromGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveUsersFromGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RevokeApplicationFromGroupsResponse> revokeApplicationFromGroups(RevokeApplicationFromGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeApplicationFromGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeApplicationFromGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeApplicationFromGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RevokeApplicationFromOrganizationalUnitsResponse> revokeApplicationFromOrganizationalUnits(RevokeApplicationFromOrganizationalUnitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeApplicationFromOrganizationalUnits").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeApplicationFromOrganizationalUnitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeApplicationFromOrganizationalUnitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RevokeApplicationFromUsersResponse> revokeApplicationFromUsers(RevokeApplicationFromUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeApplicationFromUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeApplicationFromUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeApplicationFromUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetApplicationGrantScopeResponse> setApplicationGrantScope(SetApplicationGrantScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetApplicationGrantScope").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetApplicationGrantScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetApplicationGrantScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetApplicationProvisioningConfigResponse> setApplicationProvisioningConfig(SetApplicationProvisioningConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetApplicationProvisioningConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetApplicationProvisioningConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetApplicationProvisioningConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetApplicationProvisioningScopeResponse> setApplicationProvisioningScope(SetApplicationProvisioningScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetApplicationProvisioningScope").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetApplicationProvisioningScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetApplicationProvisioningScopeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * In IDaaS EIAM, the application management feature supports multiple SSO protocols for applications, including SAML 2.0 and OIDC protocols. Each application supports only one protocol, and the protocol cannot be changed after the application is created. You can specify the SSO configuration attributes of an application based on the supported SSO protocol.
      *
     */
    @Override
    public CompletableFuture<SetApplicationSsoConfigResponse> setApplicationSsoConfig(SetApplicationSsoConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetApplicationSsoConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetApplicationSsoConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetApplicationSsoConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetForgetPasswordConfigurationResponse> setForgetPasswordConfiguration(SetForgetPasswordConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetForgetPasswordConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetForgetPasswordConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetForgetPasswordConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetPasswordComplexityConfigurationResponse> setPasswordComplexityConfiguration(SetPasswordComplexityConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetPasswordComplexityConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetPasswordComplexityConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetPasswordComplexityConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetPasswordExpirationConfigurationResponse> setPasswordExpirationConfiguration(SetPasswordExpirationConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetPasswordExpirationConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetPasswordExpirationConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetPasswordExpirationConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetPasswordHistoryConfigurationResponse> setPasswordHistoryConfiguration(SetPasswordHistoryConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetPasswordHistoryConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetPasswordHistoryConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetPasswordHistoryConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetPasswordInitializationConfigurationResponse> setPasswordInitializationConfiguration(SetPasswordInitializationConfigurationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetPasswordInitializationConfiguration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetPasswordInitializationConfigurationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetPasswordInitializationConfigurationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SetUserPrimaryOrganizationalUnitResponse> setUserPrimaryOrganizationalUnit(SetUserPrimaryOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetUserPrimaryOrganizationalUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetUserPrimaryOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetUserPrimaryOrganizationalUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UnlockUserResponse> unlockUser(UnlockUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnlockUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnlockUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnlockUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateApplicationAuthorizationTypeResponse> updateApplicationAuthorizationType(UpdateApplicationAuthorizationTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateApplicationAuthorizationType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationAuthorizationTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationAuthorizationTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateApplicationDescriptionResponse> updateApplicationDescription(UpdateApplicationDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateApplicationDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<UpdateGroupDescriptionResponse> updateGroupDescription(UpdateGroupDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateGroupDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGroupDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGroupDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateInstanceDescriptionResponse> updateInstanceDescription(UpdateInstanceDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateInstanceDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateNetworkAccessEndpointNameResponse> updateNetworkAccessEndpointName(UpdateNetworkAccessEndpointNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNetworkAccessEndpointName").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNetworkAccessEndpointNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNetworkAccessEndpointNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateOrganizationalUnitResponse> updateOrganizationalUnit(UpdateOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateOrganizationalUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOrganizationalUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateOrganizationalUnitDescriptionResponse> updateOrganizationalUnitDescription(UpdateOrganizationalUnitDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateOrganizationalUnitDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOrganizationalUnitDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOrganizationalUnitDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateOrganizationalUnitParentIdResponse> updateOrganizationalUnitParentId(UpdateOrganizationalUnitParentIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateOrganizationalUnitParentId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOrganizationalUnitParentIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOrganizationalUnitParentIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<UpdateUserDescriptionResponse> updateUserDescription(UpdateUserDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUserDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateUserPasswordResponse> updateUserPassword(UpdateUserPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateUserPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
