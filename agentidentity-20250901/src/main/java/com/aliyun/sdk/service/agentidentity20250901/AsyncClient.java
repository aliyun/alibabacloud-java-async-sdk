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
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    /**
     * @param request the request parameters of CreatePolicySet  CreatePolicySetRequest
     * @return CreatePolicySetResponse
     */
    CompletableFuture<CreatePolicySetResponse> createPolicySet(CreatePolicySetRequest request);

    /**
     * @param request the request parameters of CreateRole  CreateRoleRequest
     * @return CreateRoleResponse
     */
    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    /**
     * @param request the request parameters of CreateRoleAssignment  CreateRoleAssignmentRequest
     * @return CreateRoleAssignmentResponse
     */
    CompletableFuture<CreateRoleAssignmentResponse> createRoleAssignment(CreateRoleAssignmentRequest request);

    /**
     * @param request the request parameters of CreateTokenVault  CreateTokenVaultRequest
     * @return CreateTokenVaultResponse
     */
    CompletableFuture<CreateTokenVaultResponse> createTokenVault(CreateTokenVaultRequest request);

    /**
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * @param request the request parameters of CreateUserPool  CreateUserPoolRequest
     * @return CreateUserPoolResponse
     */
    CompletableFuture<CreateUserPoolResponse> createUserPool(CreateUserPoolRequest request);

    /**
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
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * @param request the request parameters of DeletePolicySet  DeletePolicySetRequest
     * @return DeletePolicySetResponse
     */
    CompletableFuture<DeletePolicySetResponse> deletePolicySet(DeletePolicySetRequest request);

    /**
     * @param request the request parameters of DeleteRole  DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    /**
     * @param request the request parameters of DeleteRoleAssignment  DeleteRoleAssignmentRequest
     * @return DeleteRoleAssignmentResponse
     */
    CompletableFuture<DeleteRoleAssignmentResponse> deleteRoleAssignment(DeleteRoleAssignmentRequest request);

    /**
     * @param request the request parameters of DeleteSAMLIdentityProviderCertificate  DeleteSAMLIdentityProviderCertificateRequest
     * @return DeleteSAMLIdentityProviderCertificateResponse
     */
    CompletableFuture<DeleteSAMLIdentityProviderCertificateResponse> deleteSAMLIdentityProviderCertificate(DeleteSAMLIdentityProviderCertificateRequest request);

    /**
     * @param request the request parameters of DeleteTokenVault  DeleteTokenVaultRequest
     * @return DeleteTokenVaultResponse
     */
    CompletableFuture<DeleteTokenVaultResponse> deleteTokenVault(DeleteTokenVaultRequest request);

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * @param request the request parameters of DeleteUserPool  DeleteUserPoolRequest
     * @return DeleteUserPoolResponse
     */
    CompletableFuture<DeleteUserPoolResponse> deleteUserPool(DeleteUserPoolRequest request);

    /**
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
     * @param request the request parameters of GetPolicy  GetPolicyRequest
     * @return GetPolicyResponse
     */
    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    /**
     * @param request the request parameters of GetPolicySet  GetPolicySetRequest
     * @return GetPolicySetResponse
     */
    CompletableFuture<GetPolicySetResponse> getPolicySet(GetPolicySetRequest request);

    /**
     * @param request the request parameters of GetRole  GetRoleRequest
     * @return GetRoleResponse
     */
    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    /**
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
     * @param request the request parameters of GetSpecificIdentityProvider  GetSpecificIdentityProviderRequest
     * @return GetSpecificIdentityProviderResponse
     */
    CompletableFuture<GetSpecificIdentityProviderResponse> getSpecificIdentityProvider(GetSpecificIdentityProviderRequest request);

    /**
     * @param request the request parameters of GetTokenVault  GetTokenVaultRequest
     * @return GetTokenVaultResponse
     */
    CompletableFuture<GetTokenVaultResponse> getTokenVault(GetTokenVaultRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GetUserPool  GetUserPoolRequest
     * @return GetUserPoolResponse
     */
    CompletableFuture<GetUserPoolResponse> getUserPool(GetUserPoolRequest request);

    /**
     * @param request the request parameters of GetUserPoolClient  GetUserPoolClientRequest
     * @return GetUserPoolClientResponse
     */
    CompletableFuture<GetUserPoolClientResponse> getUserPoolClient(GetUserPoolClientRequest request);

    /**
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
     * @param request the request parameters of ListClientSecrets  ListClientSecretsRequest
     * @return ListClientSecretsResponse
     */
    CompletableFuture<ListClientSecretsResponse> listClientSecrets(ListClientSecretsRequest request);

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
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
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
     * @param request the request parameters of ListUserPools  ListUserPoolsRequest
     * @return ListUserPoolsResponse
     */
    CompletableFuture<ListUserPoolsResponse> listUserPools(ListUserPoolsRequest request);

    /**
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
     * @param request the request parameters of RunUserPoolSyncJob  RunUserPoolSyncJobRequest
     * @return RunUserPoolSyncJobResponse
     */
    CompletableFuture<RunUserPoolSyncJobResponse> runUserPoolSyncJob(RunUserPoolSyncJobRequest request);

    /**
     * @param request the request parameters of SetSAMLIdentityProvider  SetSAMLIdentityProviderRequest
     * @return SetSAMLIdentityProviderResponse
     */
    CompletableFuture<SetSAMLIdentityProviderResponse> setSAMLIdentityProvider(SetSAMLIdentityProviderRequest request);

    /**
     * @param request the request parameters of SetSpecificIdentityProvider  SetSpecificIdentityProviderRequest
     * @return SetSpecificIdentityProviderResponse
     */
    CompletableFuture<SetSpecificIdentityProviderResponse> setSpecificIdentityProvider(SetSpecificIdentityProviderRequest request);

    /**
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
     * @param request the request parameters of UpdatePolicy  UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    CompletableFuture<UpdatePolicyResponse> updatePolicy(UpdatePolicyRequest request);

    /**
     * @param request the request parameters of UpdatePolicySet  UpdatePolicySetRequest
     * @return UpdatePolicySetResponse
     */
    CompletableFuture<UpdatePolicySetResponse> updatePolicySet(UpdatePolicySetRequest request);

    /**
     * @param request the request parameters of UpdateRole  UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

    /**
     * @param request the request parameters of UpdateTokenVault  UpdateTokenVaultRequest
     * @return UpdateTokenVaultResponse
     */
    CompletableFuture<UpdateTokenVaultResponse> updateTokenVault(UpdateTokenVaultRequest request);

    /**
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
