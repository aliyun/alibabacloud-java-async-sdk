// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ims20190815.models.*;
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
     * @param request the request parameters of AddClientIdToOIDCProvider  AddClientIdToOIDCProviderRequest
     * @return AddClientIdToOIDCProviderResponse
     */
    CompletableFuture<AddClientIdToOIDCProviderResponse> addClientIdToOIDCProvider(AddClientIdToOIDCProviderRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to add the fingerprint <code>902ef2deeb3c5b13ea4c3d5193629309e231****</code> to the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of AddFingerprintToOIDCProvider  AddFingerprintToOIDCProviderRequest
     * @return AddFingerprintToOIDCProviderResponse
     */
    CompletableFuture<AddFingerprintToOIDCProviderResponse> addFingerprintToOIDCProvider(AddFingerprintToOIDCProviderRequest request);

    /**
     * @param request the request parameters of AddUserToGroup  AddUserToGroupRequest
     * @return AddUserToGroupResponse
     */
    CompletableFuture<AddUserToGroupResponse> addUserToGroup(AddUserToGroupRequest request);

    /**
     * @param request the request parameters of BindMFADevice  BindMFADeviceRequest
     * @return BindMFADeviceResponse
     */
    CompletableFuture<BindMFADeviceResponse> bindMFADevice(BindMFADeviceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is available only for RAM users. Before you call this operation, make sure that <code>AllowUserToChangePassword</code> in <a href="https://help.aliyun.com/document_detail/43765.html">SetSecurityPreference</a> is set to <code>True</code>. The value True indicates that RAM users can manage their passwords.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ChangePassword  ChangePasswordRequest
     * @return ChangePasswordResponse
     */
    CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request);

    /**
     * @param request the request parameters of CreateAccessKey  CreateAccessKeyRequest
     * @return CreateAccessKeyResponse
     */
    CompletableFuture<CreateAccessKeyResponse> createAccessKey(CreateAccessKeyRequest request);

    /**
     * @param request the request parameters of CreateAppSecret  CreateAppSecretRequest
     * @return CreateAppSecretResponse
     */
    CompletableFuture<CreateAppSecretResponse> createAppSecret(CreateAppSecretRequest request);

    /**
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * @param request the request parameters of CreateLoginProfile  CreateLoginProfileRequest
     * @return CreateLoginProfileResponse
     */
    CompletableFuture<CreateLoginProfileResponse> createLoginProfile(CreateLoginProfileRequest request);

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
    CompletableFuture<CreateOIDCProviderResponse> createOIDCProvider(CreateOIDCProviderRequest request);

    /**
     * @param request the request parameters of CreateSAMLProvider  CreateSAMLProviderRequest
     * @return CreateSAMLProviderResponse
     */
    CompletableFuture<CreateSAMLProviderResponse> createSAMLProvider(CreateSAMLProviderRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a RAM user named <code>test</code>.</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * @param request the request parameters of CreateVirtualMFADevice  CreateVirtualMFADeviceRequest
     * @return CreateVirtualMFADeviceResponse
     */
    CompletableFuture<CreateVirtualMFADeviceResponse> createVirtualMFADevice(CreateVirtualMFADeviceRequest request);

    /**
     * @param request the request parameters of DeleteAccessKey  DeleteAccessKeyRequest
     * @return DeleteAccessKeyResponse
     */
    CompletableFuture<DeleteAccessKeyResponse> deleteAccessKey(DeleteAccessKeyRequest request);

    /**
     * @param request the request parameters of DeleteAccessKeyInRecycleBin  DeleteAccessKeyInRecycleBinRequest
     * @return DeleteAccessKeyInRecycleBinResponse
     */
    CompletableFuture<DeleteAccessKeyInRecycleBinResponse> deleteAccessKeyInRecycleBin(DeleteAccessKeyInRecycleBinRequest request);

    /**
     * @param request the request parameters of DeleteAppSecret  DeleteAppSecretRequest
     * @return DeleteAppSecretResponse
     */
    CompletableFuture<DeleteAppSecretResponse> deleteAppSecret(DeleteAppSecretRequest request);

    /**
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a RAM user group, make sure that no policies are attached to the group and no RAM users are included in the group.</p>
     * 
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * @param request the request parameters of DeleteLoginProfile  DeleteLoginProfileRequest
     * @return DeleteLoginProfileResponse
     */
    CompletableFuture<DeleteLoginProfileResponse> deleteLoginProfile(DeleteLoginProfileRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of DeleteOIDCProvider  DeleteOIDCProviderRequest
     * @return DeleteOIDCProviderResponse
     */
    CompletableFuture<DeleteOIDCProviderResponse> deleteOIDCProvider(DeleteOIDCProviderRequest request);

    /**
     * @param request the request parameters of DeletePasskey  DeletePasskeyRequest
     * @return DeletePasskeyResponse
     */
    CompletableFuture<DeletePasskeyResponse> deletePasskey(DeletePasskeyRequest request);

    /**
     * @param request the request parameters of DeleteSAMLProvider  DeleteSAMLProviderRequest
     * @return DeleteSAMLProviderResponse
     */
    CompletableFuture<DeleteSAMLProviderResponse> deleteSAMLProvider(DeleteSAMLProviderRequest request);

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * @param request the request parameters of DeleteUserInRecycleBin  DeleteUserInRecycleBinRequest
     * @return DeleteUserInRecycleBinResponse
     */
    CompletableFuture<DeleteUserInRecycleBinResponse> deleteUserInRecycleBin(DeleteUserInRecycleBinRequest request);

    /**
     * @param request the request parameters of DeleteVirtualMFADevice  DeleteVirtualMFADeviceRequest
     * @return DeleteVirtualMFADeviceResponse
     */
    CompletableFuture<DeleteVirtualMFADeviceResponse> deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request);

    /**
     * <b>description</b> :
     * <p>If you want to call this operation to uninstall an internal application, the type of the internal application must be <strong>ServerApp</strong>. Otherwise, an error occurs when you call this operation.</p>
     * <blockquote>
     * <p> For <strong>internal applications</strong>, only internal applications of the ServerApp type need to be <strong>installed or provisioned</strong>. Therefore, only internal applications of the ServerApp type <strong>can be uninstalled</strong>. Internal applications of the WebApp and NativeApp types <strong>do not need to and cannot be uninstalled</strong>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeprovisionApplication  DeprovisionApplicationRequest
     * @return DeprovisionApplicationResponse
     */
    CompletableFuture<DeprovisionApplicationResponse> deprovisionApplication(DeprovisionApplicationRequest request);

    /**
     * @param request the request parameters of DeprovisionExternalApplication  DeprovisionExternalApplicationRequest
     * @return DeprovisionExternalApplicationResponse
     */
    CompletableFuture<DeprovisionExternalApplicationResponse> deprovisionExternalApplication(DeprovisionExternalApplicationRequest request);

    /**
     * @param request the request parameters of DisableVirtualMFA  DisableVirtualMFARequest
     * @return DisableVirtualMFAResponse
     */
    CompletableFuture<DisableVirtualMFAResponse> disableVirtualMFA(DisableVirtualMFARequest request);

    /**
     * @param request the request parameters of GenerateCredentialReport  GenerateCredentialReportRequest
     * @return GenerateCredentialReportResponse
     */
    CompletableFuture<GenerateCredentialReportResponse> generateCredentialReport(GenerateCredentialReportRequest request);

    /**
     * @param request the request parameters of GenerateGovernanceReport  GenerateGovernanceReportRequest
     * @return GenerateGovernanceReportResponse
     */
    CompletableFuture<GenerateGovernanceReportResponse> generateGovernanceReport(GenerateGovernanceReportRequest request);

    /**
     * @param request the request parameters of GetAccessKeyInfoInRecycleBin  GetAccessKeyInfoInRecycleBinRequest
     * @return GetAccessKeyInfoInRecycleBinResponse
     */
    CompletableFuture<GetAccessKeyInfoInRecycleBinResponse> getAccessKeyInfoInRecycleBin(GetAccessKeyInfoInRecycleBinRequest request);

    /**
     * @param request the request parameters of GetAccessKeyLastUsed  GetAccessKeyLastUsedRequest
     * @return GetAccessKeyLastUsedResponse
     */
    CompletableFuture<GetAccessKeyLastUsedResponse> getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request);

    /**
     * @param request the request parameters of GetAccountMFAInfo  GetAccountMFAInfoRequest
     * @return GetAccountMFAInfoResponse
     */
    CompletableFuture<GetAccountMFAInfoResponse> getAccountMFAInfo(GetAccountMFAInfoRequest request);

    /**
     * @param request the request parameters of GetAccountSecurityPracticeReport  GetAccountSecurityPracticeReportRequest
     * @return GetAccountSecurityPracticeReportResponse
     */
    CompletableFuture<GetAccountSecurityPracticeReportResponse> getAccountSecurityPracticeReport(GetAccountSecurityPracticeReportRequest request);

    /**
     * @param request the request parameters of GetAccountSummary  GetAccountSummaryRequest
     * @return GetAccountSummaryResponse
     */
    CompletableFuture<GetAccountSummaryResponse> getAccountSummary(GetAccountSummaryRequest request);

    /**
     * @param request the request parameters of GetAppSecret  GetAppSecretRequest
     * @return GetAppSecretResponse
     */
    CompletableFuture<GetAppSecretResponse> getAppSecret(GetAppSecretRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the configurations of an application named <code>472457090344041****</code>.</p>
     * 
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
     * @param request the request parameters of GetApplicationProvisionInfo  GetApplicationProvisionInfoRequest
     * @return GetApplicationProvisionInfoResponse
     */
    CompletableFuture<GetApplicationProvisionInfoResponse> getApplicationProvisionInfo(GetApplicationProvisionInfoRequest request);

    /**
     * @param request the request parameters of GetCredentialReport  GetCredentialReportRequest
     * @return GetCredentialReportResponse
     */
    CompletableFuture<GetCredentialReportResponse> getCredentialReport(GetCredentialReportRequest request);

    /**
     * @param request the request parameters of GetDefaultDomain  GetDefaultDomainRequest
     * @return GetDefaultDomainResponse
     */
    CompletableFuture<GetDefaultDomainResponse> getDefaultDomain(GetDefaultDomainRequest request);

    /**
     * @param request the request parameters of GetExternalApplication  GetExternalApplicationRequest
     * @return GetExternalApplicationResponse
     */
    CompletableFuture<GetExternalApplicationResponse> getExternalApplication(GetExternalApplicationRequest request);

    /**
     * @param request the request parameters of GetGovernanceItemReport  GetGovernanceItemReportRequest
     * @return GetGovernanceItemReportResponse
     */
    CompletableFuture<GetGovernanceItemReportResponse> getGovernanceItemReport(GetGovernanceItemReportRequest request);

    /**
     * @param request the request parameters of GetGovernanceReportStatus  GetGovernanceReportStatusRequest
     * @return GetGovernanceReportStatusResponse
     */
    CompletableFuture<GetGovernanceReportStatusResponse> getGovernanceReportStatus(GetGovernanceReportStatusRequest request);

    /**
     * @param request the request parameters of GetGroup  GetGroupRequest
     * @return GetGroupResponse
     */
    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    /**
     * @param request the request parameters of GetLoginProfile  GetLoginProfileRequest
     * @return GetLoginProfileResponse
     */
    CompletableFuture<GetLoginProfileResponse> getLoginProfile(GetLoginProfileRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to query the information about an OpenID Connect (OIDC) identity provider (IdP) named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of GetOIDCProvider  GetOIDCProviderRequest
     * @return GetOIDCProviderResponse
     */
    CompletableFuture<GetOIDCProviderResponse> getOIDCProvider(GetOIDCProviderRequest request);

    /**
     * @param request the request parameters of GetPasswordPolicy  GetPasswordPolicyRequest
     * @return GetPasswordPolicyResponse
     */
    CompletableFuture<GetPasswordPolicyResponse> getPasswordPolicy(GetPasswordPolicyRequest request);

    /**
     * @param request the request parameters of GetSAMLProvider  GetSAMLProviderRequest
     * @return GetSAMLProviderResponse
     */
    CompletableFuture<GetSAMLProviderResponse> getSAMLProvider(GetSAMLProviderRequest request);

    /**
     * @param request the request parameters of GetSecurityPreference  GetSecurityPreferenceRequest
     * @return GetSecurityPreferenceResponse
     */
    CompletableFuture<GetSecurityPreferenceResponse> getSecurityPreference(GetSecurityPreferenceRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the information about a RAM user named <code>test@example.onaliyun.com</code>.</p>
     * 
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GetUserInRecycleBin  GetUserInRecycleBinRequest
     * @return GetUserInRecycleBinResponse
     */
    CompletableFuture<GetUserInRecycleBinResponse> getUserInRecycleBin(GetUserInRecycleBinRequest request);

    /**
     * @param request the request parameters of GetUserMFAInfo  GetUserMFAInfoRequest
     * @return GetUserMFAInfoResponse
     */
    CompletableFuture<GetUserMFAInfoResponse> getUserMFAInfo(GetUserMFAInfoRequest request);

    /**
     * @param request the request parameters of GetUserSsoSettings  GetUserSsoSettingsRequest
     * @return GetUserSsoSettingsResponse
     */
    CompletableFuture<GetUserSsoSettingsResponse> getUserSsoSettings(GetUserSsoSettingsRequest request);

    /**
     * @param request the request parameters of GetVerificationInfo  GetVerificationInfoRequest
     * @return GetVerificationInfoResponse
     */
    CompletableFuture<GetVerificationInfoResponse> getVerificationInfo(GetVerificationInfoRequest request);

    /**
     * @param request the request parameters of ListAccessKeys  ListAccessKeysRequest
     * @return ListAccessKeysResponse
     */
    CompletableFuture<ListAccessKeysResponse> listAccessKeys(ListAccessKeysRequest request);

    /**
     * @param request the request parameters of ListAccessKeysInRecycleBin  ListAccessKeysInRecycleBinRequest
     * @return ListAccessKeysInRecycleBinResponse
     */
    CompletableFuture<ListAccessKeysInRecycleBinResponse> listAccessKeysInRecycleBin(ListAccessKeysInRecycleBinRequest request);

    /**
     * @param request the request parameters of ListAppSecretIds  ListAppSecretIdsRequest
     * @return ListAppSecretIdsResponse
     */
    CompletableFuture<ListAppSecretIdsResponse> listAppSecretIds(ListAppSecretIdsRequest request);

    /**
     * @param request the request parameters of ListApplicationProvisionInfos  ListApplicationProvisionInfosRequest
     * @return ListApplicationProvisionInfosResponse
     */
    CompletableFuture<ListApplicationProvisionInfosResponse> listApplicationProvisionInfos(ListApplicationProvisionInfosRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the applications within the current account. The returned result shows that only one application named <code>myapp</code> belongs to the current account.</p>
     * 
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
     * @param request the request parameters of ListExternalApplications  ListExternalApplicationsRequest
     * @return ListExternalApplicationsResponse
     */
    CompletableFuture<ListExternalApplicationsResponse> listExternalApplications(ListExternalApplicationsRequest request);

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
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to query all OpenID Connect (OIDC) identity providers (IdPs) within your Alibaba Cloud account. The response shows that your Alibaba Cloud account has only one OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of ListOIDCProviders  ListOIDCProvidersRequest
     * @return ListOIDCProvidersResponse
     */
    CompletableFuture<ListOIDCProvidersResponse> listOIDCProviders(ListOIDCProvidersRequest request);

    /**
     * @param request the request parameters of ListPasskeys  ListPasskeysRequest
     * @return ListPasskeysResponse
     */
    CompletableFuture<ListPasskeysResponse> listPasskeys(ListPasskeysRequest request);

    /**
     * @param request the request parameters of ListPredefinedScopes  ListPredefinedScopesRequest
     * @return ListPredefinedScopesResponse
     */
    CompletableFuture<ListPredefinedScopesResponse> listPredefinedScopes(ListPredefinedScopesRequest request);

    /**
     * @param request the request parameters of ListRecentGovernanceMetrics  ListRecentGovernanceMetricsRequest
     * @return ListRecentGovernanceMetricsResponse
     */
    CompletableFuture<ListRecentGovernanceMetricsResponse> listRecentGovernanceMetrics(ListRecentGovernanceMetricsRequest request);

    /**
     * @param request the request parameters of ListSAMLProviders  ListSAMLProvidersRequest
     * @return ListSAMLProvidersResponse
     */
    CompletableFuture<ListSAMLProvidersResponse> listSAMLProviders(ListSAMLProvidersRequest request);

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
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the following API operations to query information about all RAM users:</p>
     * <ul>
     * <li>ListUsers: queries the details of all RAM users.</li>
     * <li>ListUserBasicInfos: queries the basic information about all RAM users. The basic information includes only the logon names (<code>UserPrincipalName</code>), display names (<code>DisplayName</code>), and user IDs (<code>UserId</code>).</li>
     * </ul>
     * 
     * @param request the request parameters of ListUserBasicInfos  ListUserBasicInfosRequest
     * @return ListUserBasicInfosResponse
     */
    CompletableFuture<ListUserBasicInfosResponse> listUserBasicInfos(ListUserBasicInfosRequest request);

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
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListUsersForGroup  ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     */
    CompletableFuture<ListUsersForGroupResponse> listUsersForGroup(ListUsersForGroupRequest request);

    /**
     * @param request the request parameters of ListUsersInRecycleBin  ListUsersInRecycleBinRequest
     * @return ListUsersInRecycleBinResponse
     */
    CompletableFuture<ListUsersInRecycleBinResponse> listUsersInRecycleBin(ListUsersInRecycleBinRequest request);

    /**
     * @param request the request parameters of ListVirtualMFADevices  ListVirtualMFADevicesRequest
     * @return ListVirtualMFADevicesResponse
     */
    CompletableFuture<ListVirtualMFADevicesResponse> listVirtualMFADevices(ListVirtualMFADevicesRequest request);

    /**
     * @param request the request parameters of ProvisionApplication  ProvisionApplicationRequest
     * @return ProvisionApplicationResponse
     */
    CompletableFuture<ProvisionApplicationResponse> provisionApplication(ProvisionApplicationRequest request);

    /**
     * @param request the request parameters of ProvisionExternalApplication  ProvisionExternalApplicationRequest
     * @return ProvisionExternalApplicationResponse
     */
    CompletableFuture<ProvisionExternalApplicationResponse> provisionExternalApplication(ProvisionExternalApplicationRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the client ID <code>498469743454717****</code> from the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of RemoveClientIdFromOIDCProvider  RemoveClientIdFromOIDCProviderRequest
     * @return RemoveClientIdFromOIDCProviderResponse
     */
    CompletableFuture<RemoveClientIdFromOIDCProviderResponse> removeClientIdFromOIDCProvider(RemoveClientIdFromOIDCProviderRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the fingerprint <code>6938fd4d98bab03faadb97b34396831e3780****</code> from the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * @param request the request parameters of RemoveFingerprintFromOIDCProvider  RemoveFingerprintFromOIDCProviderRequest
     * @return RemoveFingerprintFromOIDCProviderResponse
     */
    CompletableFuture<RemoveFingerprintFromOIDCProviderResponse> removeFingerprintFromOIDCProvider(RemoveFingerprintFromOIDCProviderRequest request);

    /**
     * @param request the request parameters of RemoveUserFromGroup  RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     */
    CompletableFuture<RemoveUserFromGroupResponse> removeUserFromGroup(RemoveUserFromGroupRequest request);

    /**
     * @param request the request parameters of RestoreAccessKeyFromRecycleBin  RestoreAccessKeyFromRecycleBinRequest
     * @return RestoreAccessKeyFromRecycleBinResponse
     */
    CompletableFuture<RestoreAccessKeyFromRecycleBinResponse> restoreAccessKeyFromRecycleBin(RestoreAccessKeyFromRecycleBinRequest request);

    /**
     * @param request the request parameters of RestoreUserFromRecycleBin  RestoreUserFromRecycleBinRequest
     * @return RestoreUserFromRecycleBinResponse
     */
    CompletableFuture<RestoreUserFromRecycleBinResponse> restoreUserFromRecycleBin(RestoreUserFromRecycleBinRequest request);

    /**
     * @param request the request parameters of SetDefaultDomain  SetDefaultDomainRequest
     * @return SetDefaultDomainResponse
     */
    CompletableFuture<SetDefaultDomainResponse> setDefaultDomain(SetDefaultDomainRequest request);

    /**
     * @param request the request parameters of SetPasswordPolicy  SetPasswordPolicyRequest
     * @return SetPasswordPolicyResponse
     */
    CompletableFuture<SetPasswordPolicyResponse> setPasswordPolicy(SetPasswordPolicyRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to enable multi-factor authentication (MFA) only for RAM users who initiated unusual logons.</p>
     * 
     * @param request the request parameters of SetSecurityPreference  SetSecurityPreferenceRequest
     * @return SetSecurityPreferenceResponse
     */
    CompletableFuture<SetSecurityPreferenceResponse> setSecurityPreference(SetSecurityPreferenceRequest request);

    /**
     * @param request the request parameters of SetUserSsoSettings  SetUserSsoSettingsRequest
     * @return SetUserSsoSettingsResponse
     */
    CompletableFuture<SetUserSsoSettingsResponse> setUserSsoSettings(SetUserSsoSettingsRequest request);

    /**
     * @param request the request parameters of SetVerificationInfo  SetVerificationInfoRequest
     * @return SetVerificationInfoResponse
     */
    CompletableFuture<SetVerificationInfoResponse> setVerificationInfo(SetVerificationInfoRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnbindMFADevice  UnbindMFADeviceRequest
     * @return UnbindMFADeviceResponse
     */
    CompletableFuture<UnbindMFADeviceResponse> unbindMFADevice(UnbindMFADeviceRequest request);

    /**
     * @param request the request parameters of UnbindVerification  UnbindVerificationRequest
     * @return UnbindVerificationResponse
     */
    CompletableFuture<UnbindVerificationResponse> unbindVerification(UnbindVerificationRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAccessKey  UpdateAccessKeyRequest
     * @return UpdateAccessKeyResponse
     */
    CompletableFuture<UpdateAccessKeyResponse> updateAccessKey(UpdateAccessKeyRequest request);

    /**
     * @param request the request parameters of UpdateApplication  UpdateApplicationRequest
     * @return UpdateApplicationResponse
     */
    CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request);

    /**
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    /**
     * @param request the request parameters of UpdateLoginProfile  UpdateLoginProfileRequest
     * @return UpdateLoginProfileResponse
     */
    CompletableFuture<UpdateLoginProfileResponse> updateLoginProfile(UpdateLoginProfileRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to change the description of the OIDC IdP named <code>TestOIDCProvider</code> to <code>This is a new OIDC Provider.</code></p>
     * 
     * @param request the request parameters of UpdateOIDCProvider  UpdateOIDCProviderRequest
     * @return UpdateOIDCProviderResponse
     */
    CompletableFuture<UpdateOIDCProviderResponse> updateOIDCProvider(UpdateOIDCProviderRequest request);

    /**
     * @param request the request parameters of UpdatePasskey  UpdatePasskeyRequest
     * @return UpdatePasskeyResponse
     */
    CompletableFuture<UpdatePasskeyResponse> updatePasskey(UpdatePasskeyRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the description of an IdP named <code>test-provider</code> to <code>This is a new provider.</code></p>
     * 
     * @param request the request parameters of UpdateSAMLProvider  UpdateSAMLProviderRequest
     * @return UpdateSAMLProviderResponse
     */
    CompletableFuture<UpdateSAMLProviderResponse> updateSAMLProvider(UpdateSAMLProviderRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to modify the name of a RAM user from <code>test@example.onaliyun.com</code> to <code>new@example.onaliyun.com</code>.</p>
     * 
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
