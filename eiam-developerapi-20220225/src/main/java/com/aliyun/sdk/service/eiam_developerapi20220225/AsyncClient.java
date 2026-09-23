// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eiam_developerapi20220225.models.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    /**
     * @param request the request parameters of AddUserToOrganizationalUnits  AddUserToOrganizationalUnitsRequest
     * @return AddUserToOrganizationalUnitsResponse
     */
    CompletableFuture<AddUserToOrganizationalUnitsResponse> addUserToOrganizationalUnits(AddUserToOrganizationalUnitsRequest request);

    /**
     * @param request the request parameters of AddUsersToGroup  AddUsersToGroupRequest
     * @return AddUsersToGroupResponse
     */
    CompletableFuture<AddUsersToGroupResponse> addUsersToGroup(AddUsersToGroupRequest request);

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * @param request the request parameters of CreateOrganizationalUnit  CreateOrganizationalUnitRequest
     * @return CreateOrganizationalUnitResponse
     */
    CompletableFuture<CreateOrganizationalUnitResponse> createOrganizationalUnit(CreateOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

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
    CompletableFuture<CreateUserExclusiveCredentialResponse> createUserExclusiveCredential(CreateUserExclusiveCredentialRequest request);

    /**
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * @param request the request parameters of DeleteOrganizationalUnit  DeleteOrganizationalUnitRequest
     * @return DeleteOrganizationalUnitResponse
     */
    CompletableFuture<DeleteOrganizationalUnitResponse> deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * @param request the request parameters of DisableUser  DisableUserRequest
     * @return DisableUserResponse
     */
    CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request);

    /**
     * @param request the request parameters of EnableUser  EnableUserRequest
     * @return EnableUserResponse
     */
    CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request);

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
    CompletableFuture<FetchOAuthAuthenticationTokenResponse> fetchOAuthAuthenticationToken(FetchOAuthAuthenticationTokenRequest request);

    /**
     * @param request the request parameters of GenerateDeviceCode  GenerateDeviceCodeRequest
     * @return GenerateDeviceCodeResponse
     */
    CompletableFuture<GenerateDeviceCodeResponse> generateDeviceCode(GenerateDeviceCodeRequest request);

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
    CompletableFuture<GenerateJwtAuthenticationTokenResponse> generateJwtAuthenticationToken(GenerateJwtAuthenticationTokenRequest request);

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
    CompletableFuture<GenerateTokenResponse> generateToken(GenerateTokenRequest request);

    /**
     * @param request the request parameters of GenerateTokenByAuthorizationServer  GenerateTokenByAuthorizationServerRequest
     * @return GenerateTokenByAuthorizationServerResponse
     */
    CompletableFuture<GenerateTokenByAuthorizationServerResponse> generateTokenByAuthorizationServer(GenerateTokenByAuthorizationServerRequest request);

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
    CompletableFuture<GetApplicationProvisioningScopeResponse> getApplicationProvisioningScope(GetApplicationProvisioningScopeRequest request);

    /**
     * @param request the request parameters of GetGroup  GetGroupRequest
     * @return GetGroupResponse
     */
    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    /**
     * @param request the request parameters of GetOAuthAuthorizationSession  GetOAuthAuthorizationSessionRequest
     * @return GetOAuthAuthorizationSessionResponse
     */
    CompletableFuture<GetOAuthAuthorizationSessionResponse> getOAuthAuthorizationSession(GetOAuthAuthorizationSessionRequest request);

    /**
     * @param request the request parameters of GetOrganizationalUnit  GetOrganizationalUnitRequest
     * @return GetOrganizationalUnitResponse
     */
    CompletableFuture<GetOrganizationalUnitResponse> getOrganizationalUnit(GetOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of GetOrganizationalUnitIdByExternalId  GetOrganizationalUnitIdByExternalIdRequest
     * @return GetOrganizationalUnitIdByExternalIdResponse
     */
    CompletableFuture<GetOrganizationalUnitIdByExternalIdResponse> getOrganizationalUnitIdByExternalId(GetOrganizationalUnitIdByExternalIdRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GetUserIdByEmail  GetUserIdByEmailRequest
     * @return GetUserIdByEmailResponse
     */
    CompletableFuture<GetUserIdByEmailResponse> getUserIdByEmail(GetUserIdByEmailRequest request);

    /**
     * @param request the request parameters of GetUserIdByPhoneNumber  GetUserIdByPhoneNumberRequest
     * @return GetUserIdByPhoneNumberResponse
     */
    CompletableFuture<GetUserIdByPhoneNumberResponse> getUserIdByPhoneNumber(GetUserIdByPhoneNumberRequest request);

    /**
     * @param request the request parameters of GetUserIdByUserExternalId  GetUserIdByUserExternalIdRequest
     * @return GetUserIdByUserExternalIdResponse
     */
    CompletableFuture<GetUserIdByUserExternalIdResponse> getUserIdByUserExternalId(GetUserIdByUserExternalIdRequest request);

    /**
     * @param request the request parameters of GetUserIdByUsername  GetUserIdByUsernameRequest
     * @return GetUserIdByUsernameResponse
     */
    CompletableFuture<GetUserIdByUsernameResponse> getUserIdByUsername(GetUserIdByUsernameRequest request);

    /**
     * @param request the request parameters of GetUserInfo  GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request);

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
    CompletableFuture<ListAuthenticationTokensResponse> listAuthenticationTokens(ListAuthenticationTokensRequest request);

    /**
     * @param request the request parameters of ListGroups  ListGroupsRequest
     * @return ListGroupsResponse
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
     * @param request the request parameters of ListGroupsForUser  ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     */
    CompletableFuture<ListGroupsForUserResponse> listGroupsForUser(ListGroupsForUserRequest request);

    /**
     * @param request the request parameters of ListOrganizationalUnitParentIds  ListOrganizationalUnitParentIdsRequest
     * @return ListOrganizationalUnitParentIdsResponse
     */
    CompletableFuture<ListOrganizationalUnitParentIdsResponse> listOrganizationalUnitParentIds(ListOrganizationalUnitParentIdsRequest request);

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
    CompletableFuture<ListOrganizationalUnitsResponse> listOrganizationalUnits(ListOrganizationalUnitsRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListUsersForGroup  ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     */
    CompletableFuture<ListUsersForGroupResponse> listUsersForGroup(ListUsersForGroupRequest request);

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
    CompletableFuture<ObtainCloudAccountRoleAccessCredentialResponse> obtainCloudAccountRoleAccessCredential(ObtainCloudAccountRoleAccessCredentialRequest request);

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
    CompletableFuture<ObtainCredentialResponse> obtainCredential(ObtainCredentialRequest request);

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
    CompletableFuture<ObtainJwtAuthenticationTokenResponse> obtainJwtAuthenticationToken(ObtainJwtAuthenticationTokenRequest request);

    /**
     * @param request the request parameters of ObtainJwtAuthenticationTokenByDerivedShortToken  ObtainJwtAuthenticationTokenByDerivedShortTokenRequest
     * @return ObtainJwtAuthenticationTokenByDerivedShortTokenResponse
     */
    CompletableFuture<ObtainJwtAuthenticationTokenByDerivedShortTokenResponse> obtainJwtAuthenticationTokenByDerivedShortToken(ObtainJwtAuthenticationTokenByDerivedShortTokenRequest request);

    /**
     * @param request the request parameters of PatchGroup  PatchGroupRequest
     * @return PatchGroupResponse
     */
    CompletableFuture<PatchGroupResponse> patchGroup(PatchGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The operation conforms to the HTTP PATCH request method. The value of a parameter is modified only if the parameter is specified in the request.</p>
     * 
     * @param request the request parameters of PatchOrganizationalUnit  PatchOrganizationalUnitRequest
     * @return PatchOrganizationalUnitResponse
     */
    CompletableFuture<PatchOrganizationalUnitResponse> patchOrganizationalUnit(PatchOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of PatchOrganizationalUnitParentId  PatchOrganizationalUnitParentIdRequest
     * @return PatchOrganizationalUnitParentIdResponse
     */
    CompletableFuture<PatchOrganizationalUnitParentIdResponse> patchOrganizationalUnitParentId(PatchOrganizationalUnitParentIdRequest request);

    /**
     * <b>description</b> :
     * <p>The operation conforms to the HTTP PATCH request method. The value of a parameter is modified only if the parameter is specified in the request.</p>
     * 
     * @param request the request parameters of PatchUser  PatchUserRequest
     * @return PatchUserResponse
     */
    CompletableFuture<PatchUserResponse> patchUser(PatchUserRequest request);

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
    CompletableFuture<ReinstateAuthenticationTokenResponse> reinstateAuthenticationToken(ReinstateAuthenticationTokenRequest request);

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
    CompletableFuture<ReinstateAuthenticationTokenByConsumerResponse> reinstateAuthenticationTokenByConsumer(ReinstateAuthenticationTokenByConsumerRequest request);

    /**
     * @param request the request parameters of RemoveUserFromOrganizationalUnits  RemoveUserFromOrganizationalUnitsRequest
     * @return RemoveUserFromOrganizationalUnitsResponse
     */
    CompletableFuture<RemoveUserFromOrganizationalUnitsResponse> removeUserFromOrganizationalUnits(RemoveUserFromOrganizationalUnitsRequest request);

    /**
     * @param request the request parameters of RemoveUsersFromGroup  RemoveUsersFromGroupRequest
     * @return RemoveUsersFromGroupResponse
     */
    CompletableFuture<RemoveUsersFromGroupResponse> removeUsersFromGroup(RemoveUsersFromGroupRequest request);

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
    CompletableFuture<RevokeAuthenticationTokenResponse> revokeAuthenticationToken(RevokeAuthenticationTokenRequest request);

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
    CompletableFuture<RevokeAuthenticationTokenByConsumerResponse> revokeAuthenticationTokenByConsumer(RevokeAuthenticationTokenByConsumerRequest request);

    /**
     * @param request the request parameters of RevokeToken  RevokeTokenRequest
     * @return RevokeTokenResponse
     */
    CompletableFuture<RevokeTokenResponse> revokeToken(RevokeTokenRequest request);

    /**
     * @param request the request parameters of SetUserPrimaryOrganizationalUnit  SetUserPrimaryOrganizationalUnitRequest
     * @return SetUserPrimaryOrganizationalUnitResponse
     */
    CompletableFuture<SetUserPrimaryOrganizationalUnitResponse> setUserPrimaryOrganizationalUnit(SetUserPrimaryOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of UpdateUserPassword  UpdateUserPasswordRequest
     * @return UpdateUserPasswordResponse
     */
    CompletableFuture<UpdateUserPasswordResponse> updateUserPassword(UpdateUserPasswordRequest request);

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
    CompletableFuture<ValidateAuthenticationTokenResponse> validateAuthenticationToken(ValidateAuthenticationTokenRequest request);

}
