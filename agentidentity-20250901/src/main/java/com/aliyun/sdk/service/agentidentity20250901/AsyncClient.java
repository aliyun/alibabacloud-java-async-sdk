// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agentidentity20250901.models.*;
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
     * @param request the request parameters of AddSAMLIdentityProviderCertificate  AddSAMLIdentityProviderCertificateRequest
     * @return AddSAMLIdentityProviderCertificateResponse
     */
    CompletableFuture<AddSAMLIdentityProviderCertificateResponse> addSAMLIdentityProviderCertificate(AddSAMLIdentityProviderCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Attaches a policy set to a target gateway.
     * The attachment relationship is 1:1. A gateway can have only one policy set attached at a time. If you attach a policy set multiple times, the latest attachment takes effect. You can specify the policy enforcement mode by using the EnforcementMode parameter. Valid values: ENFORCE (blocks non-compliant requests) and LOG_ONLY (records non-compliant requests but allows them, which is commonly used for canary release observation).</p>
     * 
     * @param request the request parameters of AttachPolicySetToGateway  AttachPolicySetToGatewayRequest
     * @return AttachPolicySetToGatewayResponse
     */
    CompletableFuture<AttachPolicySetToGatewayResponse> attachPolicySetToGateway(AttachPolicySetToGatewayRequest request);

    /**
     * @param request the request parameters of CreateAPIKeyCredentialProvider  CreateAPIKeyCredentialProviderRequest
     * @return CreateAPIKeyCredentialProviderResponse
     */
    CompletableFuture<CreateAPIKeyCredentialProviderResponse> createAPIKeyCredentialProvider(CreateAPIKeyCredentialProviderRequest request);

    /**
     * <b>description</b> :
     * <p>The response includes the plaintext client secret (ClientSecretValue). For security reasons, the plaintext secret is returned only once upon creation and cannot be retrieved later. Store it securely.</p>
     * 
     * @param request the request parameters of CreateClientSecret  CreateClientSecretRequest
     * @return CreateClientSecretResponse
     */
    CompletableFuture<CreateClientSecretResponse> createClientSecret(CreateClientSecretRequest request);

    /**
     * @param request the request parameters of CreateIdentityProvider  CreateIdentityProviderRequest
     * @return CreateIdentityProviderResponse
     */
    CompletableFuture<CreateIdentityProviderResponse> createIdentityProvider(CreateIdentityProviderRequest request);

    /**
     * @param request the request parameters of CreateOAuth2CredentialProvider  CreateOAuth2CredentialProviderRequest
     * @return CreateOAuth2CredentialProviderResponse
     */
    CompletableFuture<CreateOAuth2CredentialProviderResponse> createOAuth2CredentialProvider(CreateOAuth2CredentialProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the CreatePolicy operation to add a policy to an existing policy set. The policy defines specific control rules, such as throttling thresholds, admission conditions, and allow or block actions, through the Definition field. After a policy set is mounted to a gateway, requests on the gateway are evaluated and controlled based on the merged results of all policies in the policy set.</p>
     * 
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Calls CreatePolicySet to create a policy set in the current account. A policy set is a container for a group of policies. After a policy set is mounted to a gateway, all policies in the set evaluate requests to the gateway as a whole.</p>
     * 
     * @param request the request parameters of CreatePolicySet  CreatePolicySetRequest
     * @return CreatePolicySetResponse
     */
    CompletableFuture<CreatePolicySetResponse> createPolicySet(CreatePolicySetRequest request);

    /**
     * <b>description</b> :
     * <p>Users in a user pool can be allocated roles to enable quick authorization. Administrators can specify permissions for roles in an access policy.
     * When a user pool is created, the platform automatically provisions a default role, and newly created users are automatically allocated this default role. This operation creates a custom role of the Manual type, which must be explicitly allocated to users by calling CreateRoleAssignment.</p>
     * 
     * @param request the request parameters of CreateRole  CreateRoleRequest
     * @return CreateRoleResponse
     */
    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    /**
     * <b>description</b> :
     * <p>Users must be assigned roles to complete authorization. When a user is created through JIT, a default role is automatically assigned. Administrators can use this operation to assign additional custom roles to users.
     * PrincipalType currently supports only User. A single identity can have multiple role assignments.</p>
     * 
     * @param request the request parameters of CreateRoleAssignment  CreateRoleAssignmentRequest
     * @return CreateRoleAssignmentResponse
     */
    CompletableFuture<CreateRoleAssignmentResponse> createRoleAssignment(CreateRoleAssignmentRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the CreateTokenVault operation to create a token vault within the current Alibaba Cloud account. A token vault is a container used by the AgentIdentity service to securely store sensitive credentials such as OAuth2 tokens and API keys. Each token is encrypted when it is written to the vault.
     * You can specify the encryption configuration when you create the vault. By default, a service-managed key (SERVICE_MANAGED_KEY) is used. For greater control over the key, you can use a customer-managed Key Management Service (KMS) key (CUSTOMER_MANAGED_KEY). To use a customer-managed key, specify the Alibaba Cloud Resource Name (ARN) of the KMS key and use the RoleArn parameter to authorize the AgentIdentity service to access the KMS key.</p>
     * 
     * @param request the request parameters of CreateTokenVault  CreateTokenVaultRequest
     * @return CreateTokenVaultResponse
     */
    CompletableFuture<CreateTokenVaultResponse> createTokenVault(CreateTokenVaultRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a user in a specified user pool. The type of the created user is Manual, and the default status is Enabled. The username must be unique within the user pool and can contain letters, digits, underscores (_), periods (.), and hyphens (-), and must be 3 to 128 characters in length. The email address must be unique within the user pool. After the user is created, you can call the SetUserPassword operation to set a logon password for the user and call the CreateRoleAssignment operation to assign a role to the user.</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * <b>description</b> :
     * <p>A user pool is a secure and isolated user folder designed by the Agent Identity platform for the AI agent ecosystem. You can create multiple user pools under a single Alibaba Cloud account for the independent user identity management of different AI agents. When you create a user pool, you only need to specify the name (UserPoolName). The description is optional. After the user pool is created, the platform automatically generates a default role for the user pool. Users subsequently created through SAML SSO just-in-time (JIT) synchronization are automatically allocated this default role.</p>
     * 
     * @param request the request parameters of CreateUserPool  CreateUserPoolRequest
     * @return CreateUserPoolResponse
     */
    CompletableFuture<CreateUserPoolResponse> createUserPool(CreateUserPoolRequest request);

    /**
     * <b>description</b> :
     * <p>A client represents an application that is integrated with a user pool. When you create a client, you must specify the client name and redirect URIs. You can configure whether an application secret is required, whether to enforce Proof Key for Code Exchange (PKCE), the access token validity period, and the refresh token validity period. The application scopes are generated by the platform by default. If SecretRequired is set to true, you must call CreateClientSecret to create a client secret.</p>
     * 
     * @param request the request parameters of CreateUserPoolClient  CreateUserPoolClientRequest
     * @return CreateUserPoolClientResponse
     */
    CompletableFuture<CreateUserPoolClientResponse> createUserPoolClient(CreateUserPoolClientRequest request);

    /**
     * @param request the request parameters of CreateWorkloadIdentity  CreateWorkloadIdentityRequest
     * @return CreateWorkloadIdentityResponse
     */
    CompletableFuture<CreateWorkloadIdentityResponse> createWorkloadIdentity(CreateWorkloadIdentityRequest request);

    /**
     * @param request the request parameters of DeleteAPIKeyCredentialProvider  DeleteAPIKeyCredentialProviderRequest
     * @return DeleteAPIKeyCredentialProviderResponse
     */
    CompletableFuture<DeleteAPIKeyCredentialProviderResponse> deleteAPIKeyCredentialProvider(DeleteAPIKeyCredentialProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified client secret by client ID and key ID. The secret becomes invalid immediately after deletion, and all OAuth authentication flows that use this secret will fail.</p>
     * 
     * @param request the request parameters of DeleteClientSecret  DeleteClientSecretRequest
     * @return DeleteClientSecretResponse
     */
    CompletableFuture<DeleteClientSecretResponse> deleteClientSecret(DeleteClientSecretRequest request);

    /**
     * @param request the request parameters of DeleteIdentityProvider  DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    CompletableFuture<DeleteIdentityProviderResponse> deleteIdentityProvider(DeleteIdentityProviderRequest request);

    /**
     * @param request the request parameters of DeleteOAuth2CredentialProvider  DeleteOAuth2CredentialProviderRequest
     * @return DeleteOAuth2CredentialProviderResponse
     */
    CompletableFuture<DeleteOAuth2CredentialProviderResponse> deleteOAuth2CredentialProvider(DeleteOAuth2CredentialProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Calls DeletePolicy to remove a policy from a specified policy set. The policy becomes invalid immediately after deletion, and gateways that depend on the policy set do not need to be remounted.</p>
     * 
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Calls DeletePolicySet to delete a policy set that is no longer in use.
     * Before deleting the policy set, ensure that it is unmounted from all gateways (you can query this by calling ListPolicySetAttachedGateways) and contains no policies. Otherwise, the deletion fails.</p>
     * 
     * @param request the request parameters of DeletePolicySet  DeletePolicySetRequest
     * @return DeletePolicySetResponse
     */
    CompletableFuture<DeletePolicySetResponse> deletePolicySet(DeletePolicySetRequest request);

    /**
     * <b>description</b> :
     * <p>Before deletion, the system checks whether the role has any bound users. If role assignments exist, the deletion is rejected. You must call DeleteRoleAssignment to remove the assignments before deleting the role. Default roles (Type=Default) cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteRole  DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    /**
     * <b>description</b> :
     * <p>Removes the role assignment relationship between an identity and a role.</p>
     * 
     * @param request the request parameters of DeleteRoleAssignment  DeleteRoleAssignmentRequest
     * @return DeleteRoleAssignmentResponse
     */
    CompletableFuture<DeleteRoleAssignmentResponse> deleteRoleAssignment(DeleteRoleAssignmentRequest request);

    /**
     * <b>description</b> :
     * <p>Cleans up expired or unused certificates after certificate rotation is complete. Before deleting the certificate, ensure that it is no longer used for SAML assertion signature verification. Otherwise, SSO logon may fail.</p>
     * 
     * @param request the request parameters of DeleteSAMLIdentityProviderCertificate  DeleteSAMLIdentityProviderCertificateRequest
     * @return DeleteSAMLIdentityProviderCertificateResponse
     */
    CompletableFuture<DeleteSAMLIdentityProviderCertificateResponse> deleteSAMLIdentityProviderCertificate(DeleteSAMLIdentityProviderCertificateRequest request);

    /**
     * <b>description</b> :
     * <p>Call DeleteTokenVault to delete a token vault that is no longer in use.
     * Before deletion, ensure that the token vault is not referenced by any credential provider. Otherwise, the deletion may cause credentials that depend on the token vault to become unavailable. This operation cannot be undone.</p>
     * 
     * @param request the request parameters of DeleteTokenVault  DeleteTokenVaultRequest
     * @return DeleteTokenVaultResponse
     */
    CompletableFuture<DeleteTokenVaultResponse> deleteTokenVault(DeleteTokenVaultRequest request);

    /**
     * <b>description</b> :
     * <p>Deleting a user forcibly clears all role assignments of the user in the user pool. This operation is irreversible. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * <b>description</b> :
     * <p>Before deleting a user pool, you must clean up all resources in the user pool, including all users, roles, clients, SAML IdPs, and role assignments. Calls to this operation are rejected if the resources are not cleaned up. This operation is irreversible. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeleteUserPool  DeleteUserPoolRequest
     * @return DeleteUserPoolResponse
     */
    CompletableFuture<DeleteUserPoolResponse> deleteUserPool(DeleteUserPoolRequest request);

    /**
     * <b>description</b> :
     * <p>Deleting a client also removes all its associated client secrets. After deletion, the client can no longer be used for OAuth authentication and authorization flows. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeleteUserPoolClient  DeleteUserPoolClientRequest
     * @return DeleteUserPoolClientResponse
     */
    CompletableFuture<DeleteUserPoolClientResponse> deleteUserPoolClient(DeleteUserPoolClientRequest request);

    /**
     * @param request the request parameters of DeleteWorkloadIdentity  DeleteWorkloadIdentityRequest
     * @return DeleteWorkloadIdentityResponse
     */
    CompletableFuture<DeleteWorkloadIdentityResponse> deleteWorkloadIdentity(DeleteWorkloadIdentityRequest request);

    /**
     * <b>description</b> :
     * <p>Detaches a policy set from a gateway. After the policy set is detached, requests on the gateway are no longer governed by the policies in the policy set.</p>
     * 
     * @param request the request parameters of DetachPolicySetFromGateway  DetachPolicySetFromGatewayRequest
     * @return DetachPolicySetFromGatewayResponse
     */
    CompletableFuture<DetachPolicySetFromGatewayResponse> detachPolicySetFromGateway(DetachPolicySetFromGatewayRequest request);

    /**
     * @param request the request parameters of GetAPIKeyCredentialProvider  GetAPIKeyCredentialProviderRequest
     * @return GetAPIKeyCredentialProviderResponse
     */
    CompletableFuture<GetAPIKeyCredentialProviderResponse> getAPIKeyCredentialProvider(GetAPIKeyCredentialProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the GetGatewayPolicyConfig operation to query the currently effective policy configuration of a gateway, including the ARN of the mounted policy set and the enforcement mode.</p>
     * 
     * @param request the request parameters of GetGatewayPolicyConfig  GetGatewayPolicyConfigRequest
     * @return GetGatewayPolicyConfigResponse
     */
    CompletableFuture<GetGatewayPolicyConfigResponse> getGatewayPolicyConfig(GetGatewayPolicyConfigRequest request);

    /**
     * @param request the request parameters of GetIdentityProvider  GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    CompletableFuture<GetIdentityProviderResponse> getIdentityProvider(GetIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>目标用户池需已配置指定类型的身份源。本接口使用已保存的身份源配置，无需传入钉钉或飞书应用密钥。
     * 同步范围支持 AllAuthorized 和 SelectedDepartments。未显式配置范围时默认为 AllAuthorized，表示第三方应用授权可见范围内的全部用户。SelectedDepartments 包含选中部门及其全部后代部门；人员有任一当前所属部门命中展开集合，即命中同步范围。
     * 本接口不修改范围、不创建人员同步任务。查询可能触发后台统计；EstimateStatus 表示范围统计状态，不是人员同步任务状态。统计结果可能复用缓存，也可能来自同一范围最近一次同步结果；跨部门重复用户可能重复计数，不应视为实时、精确去重人数。
     * 对应身份源未配置时返回 EntityNotExists.IdpConfiguration；目录权限或通讯录可见范围不足时，返回 DingTalkApiPermissionDenied 或 FeishuApiPermissionDenied，不会将权限问题当作部门不存在。</p>
     * 
     * @param request the request parameters of GetIdentityProviderSyncScope  GetIdentityProviderSyncScopeRequest
     * @return GetIdentityProviderSyncScopeResponse
     */
    CompletableFuture<GetIdentityProviderSyncScopeResponse> getIdentityProviderSyncScope(GetIdentityProviderSyncScopeRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the logon configuration and password policy of a specified user pool. The logon configuration includes preference settings such as whether to enable password logon. The password policy includes rules for password complexity, length limits, and logon failure lockouts. The password policy is read-only and does not support custom modifications.</p>
     * 
     * @param request the request parameters of GetLoginPreference  GetLoginPreferenceRequest
     * @return GetLoginPreferenceResponse
     */
    CompletableFuture<GetLoginPreferenceResponse> getLoginPreference(GetLoginPreferenceRequest request);

    /**
     * @param request the request parameters of GetOAuth2CredentialProvider  GetOAuth2CredentialProviderRequest
     * @return GetOAuth2CredentialProviderResponse
     */
    CompletableFuture<GetOAuth2CredentialProviderResponse> getOAuth2CredentialProvider(GetOAuth2CredentialProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Calls GetPolicy to retrieve the complete configuration of a single policy, including its definition, associated policy set, and creation and update times.</p>
     * 
     * @param request the request parameters of GetPolicy  GetPolicyRequest
     * @return GetPolicyResponse
     */
    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Calls GetPolicySet to query the complete configuration of a single policy set, including the ARN, description, creation time, and update time.</p>
     * 
     * @param request the request parameters of GetPolicySet  GetPolicySetRequest
     * @return GetPolicySetResponse
     */
    CompletableFuture<GetPolicySetResponse> getPolicySet(GetPolicySetRequest request);

    /**
     * <b>description</b> :
     * <p>Returns the complete information about a specified role, including the role ID, name, description, type (Default or Manual), and creation and update times.</p>
     * 
     * @param request the request parameters of GetRole  GetRoleRequest
     * @return GetRoleResponse
     */
    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    /**
     * <b>description</b> :
     * <p>Returns the complete configuration of the SAML IdP, including the EntityId, logon URL, X509 certificate list, and the enabling status of SSO and JIT synchronization.</p>
     * 
     * @param request the request parameters of GetSAMLIdentityProvider  GetSAMLIdentityProviderRequest
     * @return GetSAMLIdentityProviderResponse
     */
    CompletableFuture<GetSAMLIdentityProviderResponse> getSAMLIdentityProvider(GetSAMLIdentityProviderRequest request);

    /**
     * @param request the request parameters of GetSAMLServiceProviderInfo  GetSAMLServiceProviderInfoRequest
     * @return GetSAMLServiceProviderInfoResponse
     */
    CompletableFuture<GetSAMLServiceProviderInfoResponse> getSAMLServiceProviderInfo(GetSAMLServiceProviderInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the SSO configuration of a specific type of identity provider in a specified user pool. Returns information such as the enabling status, synchronization callback status, and metadata of the IdP. For security reasons, sensitive fields such as appSecret, encryptKey, and verificationToken are not returned in the response.</p>
     * 
     * @param request the request parameters of GetSpecificIdentityProvider  GetSpecificIdentityProviderRequest
     * @return GetSpecificIdentityProviderResponse
     */
    CompletableFuture<GetSpecificIdentityProviderResponse> getSpecificIdentityProvider(GetSpecificIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Calls GetTokenVault to retrieve the complete configuration of a single token vault, including the encryption method, associated RAM role ARN, creation time, and update time.</p>
     * 
     * @param request the request parameters of GetTokenVault  GetTokenVaultRequest
     * @return GetTokenVaultResponse
     */
    CompletableFuture<GetTokenVaultResponse> getTokenVault(GetTokenVaultRequest request);

    /**
     * <b>description</b> :
     * <p>Returns the complete information of a specified user, including the user ID, username, display name, description, and creation and update times.</p>
     * 
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * <b>description</b> :
     * <p>Returns the complete configuration information of a specified user pool, including the user pool ID, name, description, creation time, and update time.</p>
     * 
     * @param request the request parameters of GetUserPool  GetUserPoolRequest
     * @return GetUserPoolResponse
     */
    CompletableFuture<GetUserPoolResponse> getUserPool(GetUserPoolRequest request);

    /**
     * <b>description</b> :
     * <p>Returns the complete configuration information of a client, including the client ID, name, redirect URIs, token validity periods, SecretRequired and EnforcePKCE settings, and default client scopes.</p>
     * 
     * @param request the request parameters of GetUserPoolClient  GetUserPoolClientRequest
     * @return GetUserPoolClientResponse
     */
    CompletableFuture<GetUserPoolClientResponse> getUserPoolClient(GetUserPoolClientRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the execution details of a single synchronization task in a specified user pool, including the task status, start and end times, synchronization result statistics (the number of created, updated, deleted, and unchanged users), and error messages.</p>
     * 
     * @param request the request parameters of GetUserPoolSyncJob  GetUserPoolSyncJobRequest
     * @return GetUserPoolSyncJobResponse
     */
    CompletableFuture<GetUserPoolSyncJobResponse> getUserPoolSyncJob(GetUserPoolSyncJobRequest request);

    /**
     * @param request the request parameters of GetWorkloadIdentity  GetWorkloadIdentityRequest
     * @return GetWorkloadIdentityResponse
     */
    CompletableFuture<GetWorkloadIdentityResponse> getWorkloadIdentity(GetWorkloadIdentityRequest request);

    /**
     * @param request the request parameters of ListAPIKeyCredentialProviders  ListAPIKeyCredentialProvidersRequest
     * @return ListAPIKeyCredentialProvidersResponse
     */
    CompletableFuture<ListAPIKeyCredentialProvidersResponse> listAPIKeyCredentialProviders(ListAPIKeyCredentialProvidersRequest request);

    /**
     * <b>description</b> :
     * <p>Returns summary information about all secrets of a client, including the client key ID and creation time. For security reasons, the plaintext secret (ClientSecretValue) is not returned in the list.</p>
     * 
     * @param request the request parameters of ListClientSecrets  ListClientSecretsRequest
     * @return ListClientSecretsResponse
     */
    CompletableFuture<ListClientSecretsResponse> listClientSecrets(ListClientSecretsRequest request);

    /**
     * <b>description</b> :
     * <p>用户池需已配置相应身份源，且应用具有目标部门的通讯录访问权限。本接口使用已保存的身份源配置，无需传入应用密钥。
     * 本接口仅返回指定父部门的直属子部门，不包含父部门本身，不递归返回整棵部门树。未传父部门时，钉钉默认查询根部门1下的直属子部门，飞书默认查询根部门0下的直属子部门。部门浏览受应用授权可见范围限制，不受当前保存的同步范围限制。
     * 本接口不修改同步范围，不触发人员同步。</p>
     * 
     * @param request the request parameters of ListIdentityProviderDepartments  ListIdentityProviderDepartmentsRequest
     * @return ListIdentityProviderDepartmentsResponse
     */
    CompletableFuture<ListIdentityProviderDepartmentsResponse> listIdentityProviderDepartments(ListIdentityProviderDepartmentsRequest request);

    /**
     * @param request the request parameters of ListIdentityProviders  ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    CompletableFuture<ListIdentityProvidersResponse> listIdentityProviders(ListIdentityProvidersRequest request);

    /**
     * @param request the request parameters of ListOAuth2CredentialProviders  ListOAuth2CredentialProvidersRequest
     * @return ListOAuth2CredentialProvidersResponse
     */
    CompletableFuture<ListOAuth2CredentialProvidersResponse> listOAuth2CredentialProviders(ListOAuth2CredentialProvidersRequest request);

    /**
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>Calls ListPolicySetAttachedGateways to query the gateways to which a specific policy set is currently attached. Call this operation before deleting a policy set to verify that no residual attachments exist.</p>
     * 
     * @param request the request parameters of ListPolicySetAttachedGateways  ListPolicySetAttachedGatewaysRequest
     * @return ListPolicySetAttachedGatewaysResponse
     */
    CompletableFuture<ListPolicySetAttachedGatewaysResponse> listPolicySetAttachedGateways(ListPolicySetAttachedGatewaysRequest request);

    /**
     * @param request the request parameters of ListPolicySets  ListPolicySetsRequest
     * @return ListPolicySetsResponse
     */
    CompletableFuture<ListPolicySetsResponse> listPolicySets(ListPolicySetsRequest request);

    /**
     * @param request the request parameters of ListRoleAssignments  ListRoleAssignmentsRequest
     * @return ListRoleAssignmentsResponse
     */
    CompletableFuture<ListRoleAssignmentsResponse> listRoleAssignments(ListRoleAssignmentsRequest request);

    /**
     * <b>description</b> :
     * <p>Returns summary information about all roles in a user pool, including the default role Default and custom roles Manual. The information includes the role ID, name, description, creation time, update time, and role type.</p>
     * 
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
     * <b>description</b> :
     * <p>Returns a list of all X.509 certificates under the SAML IdP configuration of the user pool to help administrators manage the certificate lifecycle and perform certificate rotation.</p>
     * 
     * @param request the request parameters of ListSAMLIdentityProviderCertificates  ListSAMLIdentityProviderCertificatesRequest
     * @return ListSAMLIdentityProviderCertificatesResponse
     */
    CompletableFuture<ListSAMLIdentityProviderCertificatesResponse> listSAMLIdentityProviderCertificates(ListSAMLIdentityProviderCertificatesRequest request);

    /**
     * @param request the request parameters of ListTokenVaults  ListTokenVaultsRequest
     * @return ListTokenVaultsResponse
     */
    CompletableFuture<ListTokenVaultsResponse> listTokenVaults(ListTokenVaultsRequest request);

    /**
     * <b>description</b> :
     * <p>Returns summary information about all clients in a user pool, including the client ID, name, redirect URIs, creation time, and configurations such as PKCE, client secret, and token validity periods.</p>
     * 
     * @param request the request parameters of ListUserPoolClients  ListUserPoolClientsRequest
     * @return ListUserPoolClientsResponse
     */
    CompletableFuture<ListUserPoolClientsResponse> listUserPoolClients(ListUserPoolClientsRequest request);

    /**
     * @param request the request parameters of ListUserPoolSyncJobs  ListUserPoolSyncJobsRequest
     * @return ListUserPoolSyncJobsResponse
     */
    CompletableFuture<ListUserPoolSyncJobsResponse> listUserPoolSyncJobs(ListUserPoolSyncJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Returns summary information about all user pools within the current account, including the user pool ID, name, description, and creation and update times. Supports pagination by using NextToken.</p>
     * 
     * @param request the request parameters of ListUserPools  ListUserPoolsRequest
     * @return ListUserPoolsResponse
     */
    CompletableFuture<ListUserPoolsResponse> listUserPools(ListUserPoolsRequest request);

    /**
     * <b>description</b> :
     * <p>Returns the summary information of all users in a user pool, including the user ID, username, display name, description, creation time, and update time.</p>
     * 
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListWorkloadIdentities  ListWorkloadIdentitiesRequest
     * @return ListWorkloadIdentitiesResponse
     */
    CompletableFuture<ListWorkloadIdentitiesResponse> listWorkloadIdentities(ListWorkloadIdentitiesRequest request);

    /**
     * <b>description</b> :
     * <p>Creates and immediately executes a user synchronization task in a specified user pool. The system pulls user data from the specified identity provider and synchronizes the data to the user pool. The task runs asynchronously. The operation completes after the task ID is returned. You can call GetUserPoolSyncJob to query the execution progress and results. Only one synchronization task can run in a user pool at a time.</p>
     * 
     * @param request the request parameters of RunUserPoolSyncJob  RunUserPoolSyncJobRequest
     * @return RunUserPoolSyncJobResponse
     */
    CompletableFuture<RunUserPoolSyncJobResponse> runUserPoolSyncJob(RunUserPoolSyncJobRequest request);

    /**
     * <b>description</b> :
     * <p>This operation sets or updates the core configurations of a SAML identity provider (IdP), including the IdP identifier (EntityId), logon URL (LoginURL), X.509 certificates, single sign-on (SSO) status, and Just-In-Time (JIT) user provisioning and update settings. If you specify X509Certificates, all existing certificates in the user pool are replaced. To append certificates while retaining the existing ones, use AddSAMLIdentityProviderCertificate.</p>
     * 
     * @param request the request parameters of SetSAMLIdentityProvider  SetSAMLIdentityProviderRequest
     * @return SetSAMLIdentityProviderResponse
     */
    CompletableFuture<SetSAMLIdentityProviderResponse> setSAMLIdentityProvider(SetSAMLIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Configures a specific type of identity provider for a specified user pool. This operation is used to configure SSO logon and address book synchronization for non-SAML IdPs such as DingTalk. A user pool does not support enabling multiple identity providers at the same time. You must disable other enabled IdPs before enabling a new IdP.</p>
     * 
     * @param request the request parameters of SetSpecificIdentityProvider  SetSpecificIdentityProviderRequest
     * @return SetSpecificIdentityProviderResponse
     */
    CompletableFuture<SetSpecificIdentityProviderResponse> setSpecificIdentityProvider(SetSpecificIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Sets or resets the logon password for a user in a specified user pool. Two methods are supported: specifying a password (Password) or generating a random password (GenerateRandomPassword). The two methods are mutually exclusive, and you must select exactly one. If you specify a password, it must meet the password policy requirements: a minimum length of 8 characters, containing at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters, and it must not contain the username. Passwords are managed independently of the user creation process and are not passed through CreateUser.</p>
     * 
     * @param request the request parameters of SetUserPassword  SetUserPasswordRequest
     * @return SetUserPasswordResponse
     */
    CompletableFuture<SetUserPasswordResponse> setUserPassword(SetUserPasswordRequest request);

    /**
     * @param request the request parameters of UpdateAPIKeyCredentialProvider  UpdateAPIKeyCredentialProviderRequest
     * @return UpdateAPIKeyCredentialProviderResponse
     */
    CompletableFuture<UpdateAPIKeyCredentialProviderResponse> updateAPIKeyCredentialProvider(UpdateAPIKeyCredentialProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Calls UpdateGatewayPolicyConfig to adjust the policy enforcement mode on a gateway. Common usage: Use LOG_ONLY for observation and verification during the initial rollout of a policy. After confirming that everything is correct, switch the gateway to ENFORCE to enforce interception. This operation does not modify the attached policy set itself. To replace the policy set, call AttachPolicySetToGateway.</p>
     * 
     * @param request the request parameters of UpdateGatewayPolicyConfig  UpdateGatewayPolicyConfigRequest
     * @return UpdateGatewayPolicyConfigResponse
     */
    CompletableFuture<UpdateGatewayPolicyConfigResponse> updateGatewayPolicyConfig(UpdateGatewayPolicyConfigRequest request);

    /**
     * @param request the request parameters of UpdateIdentityProvider  UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    CompletableFuture<UpdateIdentityProviderResponse> updateIdentityProvider(UpdateIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the logon configuration of a specified user pool. Currently, only logon preferences, such as whether password logon is enabled, can be updated. The password policy cannot be modified. Specify only the fields to be updated. Unspecified fields remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateLoginPreference  UpdateLoginPreferenceRequest
     * @return UpdateLoginPreferenceResponse
     */
    CompletableFuture<UpdateLoginPreferenceResponse> updateLoginPreference(UpdateLoginPreferenceRequest request);

    /**
     * @param request the request parameters of UpdateOAuth2CredentialProvider  UpdateOAuth2CredentialProviderRequest
     * @return UpdateOAuth2CredentialProviderResponse
     */
    CompletableFuture<UpdateOAuth2CredentialProviderResponse> updateOAuth2CredentialProvider(UpdateOAuth2CredentialProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Calls the UpdatePolicy operation to update the description and definition of an existing policy. The updated definition takes effect immediately for all gateways to which the policy set is mounted.</p>
     * 
     * @param request the request parameters of UpdatePolicy  UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    CompletableFuture<UpdatePolicyResponse> updatePolicy(UpdatePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Calls UpdatePolicySet to update the description of an existing policy set. To modify specific policies in the policy set, use UpdatePolicy. To change the mount relationship, use AttachPolicySetToGateway or DetachPolicySetFromGateway.</p>
     * 
     * @param request the request parameters of UpdatePolicySet  UpdatePolicySetRequest
     * @return UpdatePolicySetResponse
     */
    CompletableFuture<UpdatePolicySetResponse> updatePolicySet(UpdatePolicySetRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the Description field of a role. The RoleName field serves as a unique identifier and cannot be modified.</p>
     * 
     * @param request the request parameters of UpdateRole  UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the description and role configuration of an existing token vault. Note: The encryption configuration (KeyType or KmsKeyArn) of a token vault cannot be changed after it is created.</p>
     * 
     * @param request the request parameters of UpdateTokenVault  UpdateTokenVaultRequest
     * @return UpdateTokenVaultResponse
     */
    CompletableFuture<UpdateTokenVaultResponse> updateTokenVault(UpdateTokenVaultRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the attribute information of a user in a specified user pool. Specify only the fields that you want to update. Unspecified fields remain unchanged. UserName is the user identifier and cannot be modified. You can update the display name, description, email address, and status. Email addresses must be unique within the user pool.</p>
     * 
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    /**
     * @param request the request parameters of UpdateUserPool  UpdateUserPoolRequest
     * @return UpdateUserPoolResponse
     */
    CompletableFuture<UpdateUserPoolResponse> updateUserPool(UpdateUserPoolRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the callback URLs (RedirectURIs), whether an application secret is required (SecretRequired), whether Proof Key for Code Exchange (PKCE) is enforced (EnforcePKCE), and the validity periods of the access token and refresh token. The client name (ClientName) serves as a unique identifier and cannot be modified.</p>
     * 
     * @param request the request parameters of UpdateUserPoolClient  UpdateUserPoolClientRequest
     * @return UpdateUserPoolClientResponse
     */
    CompletableFuture<UpdateUserPoolClientResponse> updateUserPoolClient(UpdateUserPoolClientRequest request);

    /**
     * @param request the request parameters of UpdateWorkloadIdentity  UpdateWorkloadIdentityRequest
     * @return UpdateWorkloadIdentityResponse
     */
    CompletableFuture<UpdateWorkloadIdentityResponse> updateWorkloadIdentity(UpdateWorkloadIdentityRequest request);

}
