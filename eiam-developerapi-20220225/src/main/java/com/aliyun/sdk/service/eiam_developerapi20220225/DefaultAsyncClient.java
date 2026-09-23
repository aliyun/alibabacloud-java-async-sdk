// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.eiam_developerapi20220225.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.eiam.dev.*;
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
        this.product = "Eiam-developerapi";
        this.version = "2022-02-25";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddUserToOrganizationalUnits  AddUserToOrganizationalUnitsRequest
     * @return AddUserToOrganizationalUnitsResponse
     */
    @Override
    public CompletableFuture<AddUserToOrganizationalUnitsResponse> addUserToOrganizationalUnits(AddUserToOrganizationalUnitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddUserToOrganizationalUnits").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users/{userId}/actions/addUserToOrganizationalUnits").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddUserToOrganizationalUnitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddUserToOrganizationalUnitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddUsersToGroup  AddUsersToGroupRequest
     * @return AddUsersToGroupResponse
     */
    @Override
    public CompletableFuture<AddUsersToGroupResponse> addUsersToGroup(AddUsersToGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddUsersToGroup").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/groups/{groupId}/actions/addUsersToGroup").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddUsersToGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddUsersToGroupResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateGroup").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateOrganizationalUnit  CreateOrganizationalUnitRequest
     * @return CreateOrganizationalUnitResponse
     */
    @Override
    public CompletableFuture<CreateOrganizationalUnitResponse> createOrganizationalUnit(CreateOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateOrganizationalUnit").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/organizationalUnits").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOrganizationalUnitResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateUser").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
     * <p>This API uses an Access Token issued by IDaaS for identity authentication and authorization.
     * Ensure that the Access Token you pass in has the &quot;Manage Static Credentials&quot; permission for the IDaaS built-in PAM application (Privileged Access Management).</p>
     * <blockquote>
     * <p>The corresponding scope is <code>urn:cloud:idaas:pam|credential:manage</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateUserExclusiveCredential  CreateUserExclusiveCredentialRequest
     * @return CreateUserExclusiveCredentialResponse
     */
    @Override
    public CompletableFuture<CreateUserExclusiveCredentialResponse> createUserExclusiveCredential(CreateUserExclusiveCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateUserExclusiveCredential").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/credentials/_/actions/createUserExclusive").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserExclusiveCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserExclusiveCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    @Override
    public CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteGroup").setMethod(HttpMethod.DELETE).setPathRegex("/v2/{instanceId}/{applicationId}/groups/{groupId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOrganizationalUnit  DeleteOrganizationalUnitRequest
     * @return DeleteOrganizationalUnitResponse
     */
    @Override
    public CompletableFuture<DeleteOrganizationalUnitResponse> deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteOrganizationalUnit").setMethod(HttpMethod.DELETE).setPathRegex("/v2/{instanceId}/{applicationId}/organizationalUnits/{organizationalUnitId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOrganizationalUnitResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteUser").setMethod(HttpMethod.DELETE).setPathRegex("/v2/{instanceId}/{applicationId}/users/{userId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableUser  DisableUserRequest
     * @return DisableUserResponse
     */
    @Override
    public CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DisableUser").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users/{userId}/actions/disable").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableUser  EnableUserRequest
     * @return EnableUserResponse
     */
    @Override
    public CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EnableUser").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users/{userId}/actions/enable").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API authenticates and authorizes requests based on an Access Token issued by IDaaS.
     * Ensure that the Access Token you provide has the function authorization to &quot;obtain authentication token&quot; for the IDaaS built-in PAM application (Privileged Access Management).</p>
     * <blockquote>
     * <p>The corresponding scope is <code>urn:cloud:idaas:pam|authentication_token:obtain</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of FetchOAuthAuthenticationToken  FetchOAuthAuthenticationTokenRequest
     * @return FetchOAuthAuthenticationTokenResponse
     */
    @Override
    public CompletableFuture<FetchOAuthAuthenticationTokenResponse> fetchOAuthAuthenticationToken(FetchOAuthAuthenticationTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FetchOAuthAuthenticationToken").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/authenticationTokens/_/actions/fetchOAuthAccessToken").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FetchOAuthAuthenticationTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FetchOAuthAuthenticationTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateDeviceCode  GenerateDeviceCodeRequest
     * @return GenerateDeviceCodeResponse
     */
    @Override
    public CompletableFuture<GenerateDeviceCodeResponse> generateDeviceCode(GenerateDeviceCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateDeviceCode").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/oauth2/device/code").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateDeviceCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateDeviceCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API performs identity authentication and authorization using the Access Token issued by IDaaS.
     * Ensure that the provided Access Token has the authorization to access the &quot;Obtain Authentication Token&quot; feature of the built-in Privileged Access Management (PAM) application in IDaaS.</p>
     * <blockquote>
     * <p>The corresponding scope is <code>urn:cloud:idaas:pam|authentication_token:obtain</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateJwtAuthenticationToken  GenerateJwtAuthenticationTokenRequest
     * @return GenerateJwtAuthenticationTokenResponse
     */
    @Override
    public CompletableFuture<GenerateJwtAuthenticationTokenResponse> generateJwtAuthenticationToken(GenerateJwtAuthenticationTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateJwtAuthenticationToken").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/authenticationTokens/_/actions/generateJwt").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateJwtAuthenticationTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateJwtAuthenticationTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The following methods are supported: Authorization Code, Device Flow, Refresh Token, Client Credentials, and Password.</p>
     * <h3>1. Authorization Code</h3>
     * <p>Scenario: This is the standard OAuth 2.0 authorization code flow, which is suitable for web applications with frontend interaction.
     * Example call:</p>
     * <pre><code>POST /v2/{instanceId}/{applicationId}/oauth2/token
     * Content-Type: application/x-www-form-urlencoded
     * grant_type=authorization_code
     * &amp;code={authorization_code}
     * &amp;redirect_uri={redirect_uri}
     * &amp;client_id={client_id}
     * &amp;client_secret={client_secret}
     * </code></pre>
     * <p>Parameters:
     * ● code: The authorization code obtained from the authorization endpoint.
     * ● redirect_uri: Must be the same as the redirect_uri that was used to obtain the authorization code.</p>
     * <h3>1.1 Authorization Code for public clients</h3>
     * <p>Scenario: This scenario is suitable for applications that cannot securely store a secret, such as single-page applications (SPAs) or native applications. In this flow, a client_secret is not required, but you must use the Proof Key for Code Exchange (PKCE) mechanism. Example call:</p>
     * <pre><code>POST /v2/{instanceId}/{applicationId}/oauth2/token
     * Content-Type: application/x-www-form-urlencoded
     * grant_type=authorization_code
     * &amp;code={authorization_code}
     * &amp;redirect_uri={redirect_uri}
     * &amp;client_id={client_id}
     * &amp;code_verifier={code_verifier}
     * </code></pre>
     * <p>Parameters:
     * ● code_verifier: The code verifier for the PKCE mechanism. The client generates it when initiating an authorization request and uses it to derive the \<code>code_challenge\\</code>. When exchanging for a token, you must submit this value. It must be identical to the value used to generate the \<code>code_challenge\\</code>.
     * Java example for generating a code_verifier and code_challenge:</p>
     * <pre><code class="language-java">String codeVerifier = Base64.getUrlEncoder().withoutPadding().encodeToString(new SecureRandom().generateSeed(43));
     * String codeChallenge = Base64.getUrlEncoder().withoutPadding().encodeToString(java.security.MessageDigest.getInstance(&quot;SHA-256&quot;).digest(codeVerifier.getBytes()));
     * </code></pre>
     * <h3>2. Device Flow</h3>
     * <p>Scenario: This scenario is suitable for input-constrained devices, such as TVs and IoT devices. Example call:</p>
     * <pre><code>POST /v2/{instanceId}/{applicationId}/oauth2/token
     * Content-Type: application/x-www-form-urlencoded
     * grant_type=urn:ietf:params:oauth:grant-type:device_code
     * &amp;device_code={device_code}
     * &amp;client_id={client_id}
     * &amp;client_secret={client_secret}
     * </code></pre>
     * <p>To obtain the device code, first call <code>/oauth2/device/code</code> to retrieve the device_code and user_code.</p>
     * <h3>2.1 Device Flow for public clients</h3>
     * <p>Scenario: This scenario is used when interactive logon is not convenient and the client is a public client. Example call:</p>
     * <pre><code>POST /v2/{instanceId}/{applicationId}/oauth2/token
     * Content-Type: application/x-www-form-urlencoded
     * grant_type=urn:ietf:params:oauth:grant-type:device_code
     * &amp;device_code={device_code}
     * &amp;client_id={client_id}
     * </code></pre>
     * <h3>3. Refresh Token</h3>
     * <p>Scenario: This scenario uses a refresh_token to obtain a new access_token. Example call:</p>
     * <pre><code>POST /v2/{instanceId}/{applicationId}/oauth2/token
     * Content-Type: application/x-www-form-urlencoded
     * grant_type=refresh_token
     * &amp;refresh_token={refresh_token}
     * &amp;client_id={client_id}
     * &amp;client_secret={client_secret}
     * </code></pre>
     * <h3>4. Client Credentials</h3>
     * <p>Scenario: This scenario is for server-to-server authentication without user involvement. Example call:</p>
     * <pre><code>POST /v2/{instanceId}/{applicationId}/oauth2/token
     * Content-Type: application/x-www-form-urlencoded
     * grant_type=client_credentials
     * &amp;client_id={client_id}
     * &amp;client_secret={client_secret}
     * &amp;scope={scope}
     * </code></pre>
     * <h3>5. Password</h3>
     * <p>Scenario: This scenario uses traditional username and password authentication. Use this method with caution. Example call:</p>
     * <pre><code>POST /v2/{instanceId}/{applicationId}/oauth2/token
     * Content-Type: application/x-www-form-urlencoded
     * grant_type=password
     * &amp;username={username}
     * &amp;password={password}
     * &amp;client_id={client_id}
     * &amp;scope={scope}
     * </code></pre>
     * 
     * @param request the request parameters of GenerateToken  GenerateTokenRequest
     * @return GenerateTokenResponse
     */
    @Override
    public CompletableFuture<GenerateTokenResponse> generateToken(GenerateTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateToken").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/oauth2/token").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GenerateTokenByAuthorizationServer  GenerateTokenByAuthorizationServerRequest
     * @return GenerateTokenByAuthorizationServerResponse
     */
    @Override
    public CompletableFuture<GenerateTokenByAuthorizationServerResponse> generateTokenByAuthorizationServer(GenerateTokenByAuthorizationServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateTokenByAuthorizationServer").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/authorizationServer/{authorizationServerId}/oauth2/token").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateTokenByAuthorizationServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateTokenByAuthorizationServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can set the synchronization scope in Application Management in the IDaaS console. After you create an application, you have permission to call this API by default.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of GetApplicationProvisioningScope  GetApplicationProvisioningScopeRequest
     * @return GetApplicationProvisioningScopeResponse
     */
    @Override
    public CompletableFuture<GetApplicationProvisioningScopeResponse> getApplicationProvisioningScope(GetApplicationProvisioningScopeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetApplicationProvisioningScope").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/provisioningScope").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetApplicationProvisioningScopeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetApplicationProvisioningScopeResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGroup").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/groups/{groupId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOAuthAuthorizationSession  GetOAuthAuthorizationSessionRequest
     * @return GetOAuthAuthorizationSessionResponse
     */
    @Override
    public CompletableFuture<GetOAuthAuthorizationSessionResponse> getOAuthAuthorizationSession(GetOAuthAuthorizationSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOAuthAuthorizationSession").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/oauthAuthorizationSessions/_/actions/get").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOAuthAuthorizationSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOAuthAuthorizationSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOrganizationalUnit  GetOrganizationalUnitRequest
     * @return GetOrganizationalUnitResponse
     */
    @Override
    public CompletableFuture<GetOrganizationalUnitResponse> getOrganizationalUnit(GetOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOrganizationalUnit").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/organizationalUnits/{organizationalUnitId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrganizationalUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOrganizationalUnitIdByExternalId  GetOrganizationalUnitIdByExternalIdRequest
     * @return GetOrganizationalUnitIdByExternalIdResponse
     */
    @Override
    public CompletableFuture<GetOrganizationalUnitIdByExternalIdResponse> getOrganizationalUnitIdByExternalId(GetOrganizationalUnitIdByExternalIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOrganizationalUnitIdByExternalId").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/organizationalUnits/_/actions/getOrganizationalUnitIdByExternalId").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOrganizationalUnitIdByExternalIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOrganizationalUnitIdByExternalIdResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUser").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/users/{userId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserIdByEmail  GetUserIdByEmailRequest
     * @return GetUserIdByEmailResponse
     */
    @Override
    public CompletableFuture<GetUserIdByEmailResponse> getUserIdByEmail(GetUserIdByEmailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserIdByEmail").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users/_/actions/getUserIdByEmail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserIdByEmailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserIdByEmailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserIdByPhoneNumber  GetUserIdByPhoneNumberRequest
     * @return GetUserIdByPhoneNumberResponse
     */
    @Override
    public CompletableFuture<GetUserIdByPhoneNumberResponse> getUserIdByPhoneNumber(GetUserIdByPhoneNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserIdByPhoneNumber").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users/_/actions/getUserIdByPhoneNumber").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserIdByPhoneNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserIdByPhoneNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserIdByUserExternalId  GetUserIdByUserExternalIdRequest
     * @return GetUserIdByUserExternalIdResponse
     */
    @Override
    public CompletableFuture<GetUserIdByUserExternalIdResponse> getUserIdByUserExternalId(GetUserIdByUserExternalIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserIdByUserExternalId").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users/_/actions/getUserIdByExternalId").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserIdByUserExternalIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserIdByUserExternalIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserIdByUsername  GetUserIdByUsernameRequest
     * @return GetUserIdByUsernameResponse
     */
    @Override
    public CompletableFuture<GetUserIdByUsernameResponse> getUserIdByUsername(GetUserIdByUsernameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserIdByUsername").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users/_/actions/getUserIdByUsername").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserIdByUsernameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserIdByUsernameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUserInfo  GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    @Override
    public CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetUserInfo").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/oauth2/userinfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUserInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUserInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API uses an Access Token issued by IDaaS for identity authentication and authorization.
     * Ensure that the Access Token you provide has the Query authentication tokens permission for the built-in Privileged Access Management (PAM) application in IDaaS.</p>
     * <blockquote>
     * <p>The required scope is <code>urn:cloud:idaas:pam|authentication_token:read</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListAuthenticationTokens  ListAuthenticationTokensRequest
     * @return ListAuthenticationTokensResponse
     */
    @Override
    public CompletableFuture<ListAuthenticationTokensResponse> listAuthenticationTokens(ListAuthenticationTokensRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAuthenticationTokens").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/authenticationTokens").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAuthenticationTokensResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAuthenticationTokensResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListGroups").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/groups").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListGroupsForUser").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/users/{userId}/actions/listGroupsForUser").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGroupsForUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGroupsForUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOrganizationalUnitParentIds  ListOrganizationalUnitParentIdsRequest
     * @return ListOrganizationalUnitParentIdsResponse
     */
    @Override
    public CompletableFuture<ListOrganizationalUnitParentIdsResponse> listOrganizationalUnitParentIds(ListOrganizationalUnitParentIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOrganizationalUnitParentIds").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/organizationalUnits/{organizationalUnitId}/parentIds").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOrganizationalUnitParentIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOrganizationalUnitParentIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To retrieve the direct child organizations of the root organization, set the request parameter as follows:</p>
     * <pre><code>{
     *   &quot;parentOrganizationalUnitId&quot;: &quot;ou_root&quot;
     * }
     * </code></pre>
     * 
     * @param request the request parameters of ListOrganizationalUnits  ListOrganizationalUnitsRequest
     * @return ListOrganizationalUnitsResponse
     */
    @Override
    public CompletableFuture<ListOrganizationalUnitsResponse> listOrganizationalUnits(ListOrganizationalUnitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOrganizationalUnits").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/organizationalUnits").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOrganizationalUnitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOrganizationalUnitsResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUsers").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/users").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListUsersForGroup").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/{applicationId}/groups/{groupId}/actions/listUsersForGroup").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsersForGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsersForGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API authenticates and authorizes requests based on an Access Token issued by IDaaS.
     * Ensure that the Access Token you provide has the &quot;Obtain Cloud Role Access Credential&quot; permission for the IDaaS built-in PAM application (Privileged Access Management).</p>
     * <blockquote>
     * <p>The corresponding scope is <code>urn:cloud:idaas:pam|cloud_account_role:obtain_access_credential</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ObtainCloudAccountRoleAccessCredential  ObtainCloudAccountRoleAccessCredentialRequest
     * @return ObtainCloudAccountRoleAccessCredentialResponse
     */
    @Override
    public CompletableFuture<ObtainCloudAccountRoleAccessCredentialResponse> obtainCloudAccountRoleAccessCredential(ObtainCloudAccountRoleAccessCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ObtainCloudAccountRoleAccessCredential").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/cloudAccountRoles/_/actions/obtainAccessCredential").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ObtainCloudAccountRoleAccessCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ObtainCloudAccountRoleAccessCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API uses an Access Token issued by IDaaS for identity authentication and authorization.
     * Ensure that the Access Token you pass in has the &quot;Obtain Static Credential&quot; permission for the IDaaS built-in PAM application (Privileged Access Management).</p>
     * <blockquote>
     * <p>The corresponding scope is <code>urn:cloud:idaas:pam|credential:obtain</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ObtainCredential  ObtainCredentialRequest
     * @return ObtainCredentialResponse
     */
    @Override
    public CompletableFuture<ObtainCredentialResponse> obtainCredential(ObtainCredentialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ObtainCredential").setMethod(HttpMethod.GET).setPathRegex("/v2/{instanceId}/credentials/_/actions/obtain").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ObtainCredentialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ObtainCredentialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API requires an access token issued by IDaaS for authentication and authorization.
     * The provided access token must have permission to obtain authentication tokens for the built-in privileged access management (PAM) application in IDaaS.</p>
     * <blockquote>
     * <p>The corresponding scope is <code>urn:cloud:idaas:pam|authentication_token:obtain</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ObtainJwtAuthenticationToken  ObtainJwtAuthenticationTokenRequest
     * @return ObtainJwtAuthenticationTokenResponse
     */
    @Override
    public CompletableFuture<ObtainJwtAuthenticationTokenResponse> obtainJwtAuthenticationToken(ObtainJwtAuthenticationTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ObtainJwtAuthenticationToken").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/authenticationTokens/_/actions/obtainJwt").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ObtainJwtAuthenticationTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ObtainJwtAuthenticationTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ObtainJwtAuthenticationTokenByDerivedShortToken  ObtainJwtAuthenticationTokenByDerivedShortTokenRequest
     * @return ObtainJwtAuthenticationTokenByDerivedShortTokenResponse
     */
    @Override
    public CompletableFuture<ObtainJwtAuthenticationTokenByDerivedShortTokenResponse> obtainJwtAuthenticationTokenByDerivedShortToken(ObtainJwtAuthenticationTokenByDerivedShortTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ObtainJwtAuthenticationTokenByDerivedShortToken").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/authenticationTokens/_/actions/obtainJwtByDerivedShortToken").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ObtainJwtAuthenticationTokenByDerivedShortTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ObtainJwtAuthenticationTokenByDerivedShortTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PatchGroup  PatchGroupRequest
     * @return PatchGroupResponse
     */
    @Override
    public CompletableFuture<PatchGroupResponse> patchGroup(PatchGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PatchGroup").setMethod(HttpMethod.PATCH).setPathRegex("/v2/{instanceId}/{applicationId}/groups/{groupId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PatchGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PatchGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The operation conforms to the HTTP PATCH request method. The value of a parameter is modified only if the parameter is specified in the request.</p>
     * 
     * @param request the request parameters of PatchOrganizationalUnit  PatchOrganizationalUnitRequest
     * @return PatchOrganizationalUnitResponse
     */
    @Override
    public CompletableFuture<PatchOrganizationalUnitResponse> patchOrganizationalUnit(PatchOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PatchOrganizationalUnit").setMethod(HttpMethod.PATCH).setPathRegex("/v2/{instanceId}/{applicationId}/organizationalUnits/{organizationalUnitId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PatchOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PatchOrganizationalUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PatchOrganizationalUnitParentId  PatchOrganizationalUnitParentIdRequest
     * @return PatchOrganizationalUnitParentIdResponse
     */
    @Override
    public CompletableFuture<PatchOrganizationalUnitParentIdResponse> patchOrganizationalUnitParentId(PatchOrganizationalUnitParentIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PatchOrganizationalUnitParentId").setMethod(HttpMethod.PATCH).setPathRegex("/v2/{instanceId}/{applicationId}/organizationalUnits/{organizationalUnitId}/parentId").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PatchOrganizationalUnitParentIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PatchOrganizationalUnitParentIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The operation conforms to the HTTP PATCH request method. The value of a parameter is modified only if the parameter is specified in the request.</p>
     * 
     * @param request the request parameters of PatchUser  PatchUserRequest
     * @return PatchUserResponse
     */
    @Override
    public CompletableFuture<PatchUserResponse> patchUser(PatchUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PatchUser").setMethod(HttpMethod.PATCH).setPathRegex("/v2/{instanceId}/{applicationId}/users/{userId}").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PatchUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PatchUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API uses an IDaaS-issued Access Token for identity authentication and authorization.
     * Ensure that the Access Token you provide has the Manage authentication tokens permission for the IDaaS built-in Privileged Access Management (PAM) application.</p>
     * <blockquote>
     * <p>The required scope is <code>urn:cloud:idaas:pam|authentication_token:manage</code>.
     * Notice: 
     * Only JWT authentication tokens support this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ReinstateAuthenticationToken  ReinstateAuthenticationTokenRequest
     * @return ReinstateAuthenticationTokenResponse
     */
    @Override
    public CompletableFuture<ReinstateAuthenticationTokenResponse> reinstateAuthenticationToken(ReinstateAuthenticationTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReinstateAuthenticationToken").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/authenticationTokens/_/actions/reinstate").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReinstateAuthenticationTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReinstateAuthenticationTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API uses an access token issued by IDaaS to perform identity authentication and authorization.
     * Ensure that the provided access token is authorized to access the Manage Authentication Token feature in the IDaaS built-in PAM (Privileged Access Management) application.</p>
     * <blockquote>
     * <p>The corresponding scope is <code>urn:cloud:idaas:pam|authentication_token:manage</code>.
     * Notice: 
     * This operation supports only JWT-type authentication tokens.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ReinstateAuthenticationTokenByConsumer  ReinstateAuthenticationTokenByConsumerRequest
     * @return ReinstateAuthenticationTokenByConsumerResponse
     */
    @Override
    public CompletableFuture<ReinstateAuthenticationTokenByConsumerResponse> reinstateAuthenticationTokenByConsumer(ReinstateAuthenticationTokenByConsumerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ReinstateAuthenticationTokenByConsumer").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/authenticationTokens/_/actions/reinstateByConsumer").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReinstateAuthenticationTokenByConsumerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReinstateAuthenticationTokenByConsumerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveUserFromOrganizationalUnits  RemoveUserFromOrganizationalUnitsRequest
     * @return RemoveUserFromOrganizationalUnitsResponse
     */
    @Override
    public CompletableFuture<RemoveUserFromOrganizationalUnitsResponse> removeUserFromOrganizationalUnits(RemoveUserFromOrganizationalUnitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveUserFromOrganizationalUnits").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users/{userId}/actions/removeUserFromOrganizationalUnits").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveUserFromOrganizationalUnitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveUserFromOrganizationalUnitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveUsersFromGroup  RemoveUsersFromGroupRequest
     * @return RemoveUsersFromGroupResponse
     */
    @Override
    public CompletableFuture<RemoveUsersFromGroupResponse> removeUsersFromGroup(RemoveUsersFromGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveUsersFromGroup").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/groups/{groupId}/actions/removeUsersFromGroup").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveUsersFromGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveUsersFromGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API uses an Access Token issued by IDaaS to perform identity authentication and authorization.
     * Ensure that the Access Token is authorized to access the &quot;Manage Authentication Tokens&quot; feature of the built-in Privileged Access Management (PAM) application in IDaaS.</p>
     * <blockquote>
     * <p>The corresponding scope is <code>urn:cloud:idaas:pam|authentication_token:manage</code>.
     * Notice: 
     * This operation currently supports only JWT authentication tokens.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RevokeAuthenticationToken  RevokeAuthenticationTokenRequest
     * @return RevokeAuthenticationTokenResponse
     */
    @Override
    public CompletableFuture<RevokeAuthenticationTokenResponse> revokeAuthenticationToken(RevokeAuthenticationTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeAuthenticationToken").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/authenticationTokens/_/actions/revoke").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeAuthenticationTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeAuthenticationTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This API uses an access token issued by IDaaS to authenticate and authorize requests.
     * Make sure that the access token you provide has the \&quot;Manage authentication tokens\&quot; permission for the built-in Privileged Access Management (PAM) application in IDaaS.</p>
     * <blockquote>
     * <p>The required scope is <code>urn:cloud:idaas:pam|authentication_token:manage</code>.
     * Notice: 
     * This operation can revoke only JWT authentication tokens.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RevokeAuthenticationTokenByConsumer  RevokeAuthenticationTokenByConsumerRequest
     * @return RevokeAuthenticationTokenByConsumerResponse
     */
    @Override
    public CompletableFuture<RevokeAuthenticationTokenByConsumerResponse> revokeAuthenticationTokenByConsumer(RevokeAuthenticationTokenByConsumerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeAuthenticationTokenByConsumer").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/authenticationTokens/_/actions/revokeByConsumer").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeAuthenticationTokenByConsumerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeAuthenticationTokenByConsumerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeToken  RevokeTokenRequest
     * @return RevokeTokenResponse
     */
    @Override
    public CompletableFuture<RevokeTokenResponse> revokeToken(RevokeTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RevokeToken").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/oauth2/revoke").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetUserPrimaryOrganizationalUnit  SetUserPrimaryOrganizationalUnitRequest
     * @return SetUserPrimaryOrganizationalUnitResponse
     */
    @Override
    public CompletableFuture<SetUserPrimaryOrganizationalUnitResponse> setUserPrimaryOrganizationalUnit(SetUserPrimaryOrganizationalUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SetUserPrimaryOrganizationalUnit").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users/{userId}/actions/setUserPrimaryOrganizationalUnit").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetUserPrimaryOrganizationalUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetUserPrimaryOrganizationalUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateUserPassword  UpdateUserPasswordRequest
     * @return UpdateUserPasswordResponse
     */
    @Override
    public CompletableFuture<UpdateUserPasswordResponse> updateUserPassword(UpdateUserPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateUserPassword").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/{applicationId}/users/{userId}/actions/updateUserPassword").setBodyType(BodyType.NONE).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateUserPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateUserPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: 
     * This operation is supported only for JSON Web Token (JWT) authentication tokens.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ValidateAuthenticationToken  ValidateAuthenticationTokenRequest
     * @return ValidateAuthenticationTokenResponse
     */
    @Override
    public CompletableFuture<ValidateAuthenticationTokenResponse> validateAuthenticationToken(ValidateAuthenticationTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ValidateAuthenticationToken").setMethod(HttpMethod.POST).setPathRegex("/v2/{instanceId}/authenticationTokens/_/actions/validate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateAuthenticationTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateAuthenticationTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
