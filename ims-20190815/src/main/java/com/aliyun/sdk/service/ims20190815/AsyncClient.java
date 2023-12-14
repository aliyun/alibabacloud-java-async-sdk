// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ims20190815.models.*;
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
      * ###
      * This topic provides an example on how to add the client ID `598469743454717****` to the OIDC IdP named `TestOIDCProvider`.
      *
     */
    CompletableFuture<AddClientIdToOIDCProviderResponse> addClientIdToOIDCProvider(AddClientIdToOIDCProviderRequest request);

    /**
      * ###
      * This topic provides an example on how to add the fingerprint `902ef2deeb3c5b13ea4c3d5193629309e231****` to the OIDC IdP named `TestOIDCProvider`.
      *
     */
    CompletableFuture<AddFingerprintToOIDCProviderResponse> addFingerprintToOIDCProvider(AddFingerprintToOIDCProviderRequest request);

    CompletableFuture<AddUserToGroupResponse> addUserToGroup(AddUserToGroupRequest request);

    CompletableFuture<BindMFADeviceResponse> bindMFADevice(BindMFADeviceRequest request);

    /**
      * >  This operation is available only for RAM users. Before you call this operation, make sure that `AllowUserToChangePassword` in [SetSecurityPreference](~~43765~~) is set to `True`. The value True indicates that RAM users can change their passwords.
      *
     */
    CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request);

    CompletableFuture<CreateAccessKeyResponse> createAccessKey(CreateAccessKeyRequest request);

    CompletableFuture<CreateAppSecretResponse> createAppSecret(CreateAppSecretRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    CompletableFuture<CreateLoginProfileResponse> createLoginProfile(CreateLoginProfileRequest request);

    /**
      * ### Prerequisites
      * Before you call this operation, make sure that the information such as the URL of the issuer, the fingerprints of HTTPS certificates, and the client IDs are obtained from an external (IdP, such as Google G Suite or Okta.
      * ### Limits
      * *   You can create a maximum of 100 OIDC IdPs in an Alibaba Cloud account.
      * *   You can add a maximum of 20 client IDs to an OIDC IdP.
      * *   You can add a maximum of five fingerprints to an OIDC IdP.
      * ###
      * This topic provides an example on how to create an IdP named `TestOIDCProvider` to configure a trust relationship between the external IdP and Alibaba Cloud.
      *
     */
    CompletableFuture<CreateOIDCProviderResponse> createOIDCProvider(CreateOIDCProviderRequest request);

    CompletableFuture<CreateSAMLProviderResponse> createSAMLProvider(CreateSAMLProviderRequest request);

    /**
      * This topic provides an example on how to create a RAM user named `test`.
      *
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CreateVirtualMFADeviceResponse> createVirtualMFADevice(CreateVirtualMFADeviceRequest request);

    CompletableFuture<DeleteAccessKeyResponse> deleteAccessKey(DeleteAccessKeyRequest request);

    CompletableFuture<DeleteAppSecretResponse> deleteAppSecret(DeleteAppSecretRequest request);

    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
      * Before you delete a RAM user group, make sure that no policies are attached to the group and no RAM users are included in the group.
      *
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    CompletableFuture<DeleteLoginProfileResponse> deleteLoginProfile(DeleteLoginProfileRequest request);

    /**
      * ###
      * This topic provides an example on how to remove the OIDC IdP named `TestOIDCProvider`.
      *
     */
    CompletableFuture<DeleteOIDCProviderResponse> deleteOIDCProvider(DeleteOIDCProviderRequest request);

    CompletableFuture<DeleteSAMLProviderResponse> deleteSAMLProvider(DeleteSAMLProviderRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DeleteVirtualMFADeviceResponse> deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request);

    CompletableFuture<DisableVirtualMFAResponse> disableVirtualMFA(DisableVirtualMFARequest request);

    CompletableFuture<GenerateCredentialReportResponse> generateCredentialReport(GenerateCredentialReportRequest request);

    CompletableFuture<GetAccessKeyLastUsedResponse> getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request);

    CompletableFuture<GetAccountMFAInfoResponse> getAccountMFAInfo(GetAccountMFAInfoRequest request);

    CompletableFuture<GetAccountSecurityPracticeReportResponse> getAccountSecurityPracticeReport(GetAccountSecurityPracticeReportRequest request);

    CompletableFuture<GetAccountSummaryResponse> getAccountSummary(GetAccountSummaryRequest request);

    CompletableFuture<GetAppSecretResponse> getAppSecret(GetAppSecretRequest request);

    /**
      * This topic provides an example on how to query the configurations of an application named `472457090344041****`.
      *
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetCredentialReportResponse> getCredentialReport(GetCredentialReportRequest request);

    CompletableFuture<GetDefaultDomainResponse> getDefaultDomain(GetDefaultDomainRequest request);

    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    CompletableFuture<GetLoginProfileResponse> getLoginProfile(GetLoginProfileRequest request);

    /**
      * ###
      * This topic provides an example on how to query the information about an OpenID Connect (OIDC) identity provider (IdP) named `TestOIDCProvider`.
      *
     */
    CompletableFuture<GetOIDCProviderResponse> getOIDCProvider(GetOIDCProviderRequest request);

    CompletableFuture<GetPasswordPolicyResponse> getPasswordPolicy(GetPasswordPolicyRequest request);

    CompletableFuture<GetSAMLProviderResponse> getSAMLProvider(GetSAMLProviderRequest request);

    CompletableFuture<GetSecurityPreferenceResponse> getSecurityPreference(GetSecurityPreferenceRequest request);

    /**
      * This topic provides an example to show how to query the information about a RAM user named `test@example.onaliyun.com`.
      *
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserMFAInfoResponse> getUserMFAInfo(GetUserMFAInfoRequest request);

    CompletableFuture<GetUserSsoSettingsResponse> getUserSsoSettings(GetUserSsoSettingsRequest request);

    CompletableFuture<ListAccessKeysResponse> listAccessKeys(ListAccessKeysRequest request);

    CompletableFuture<ListAppSecretIdsResponse> listAppSecretIds(ListAppSecretIdsRequest request);

    /**
      * This topic provides an example on how to query the applications within the current account. The returned result shows that only one application named `myapp` belongs to the current account.
      *
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    CompletableFuture<ListGroupsForUserResponse> listGroupsForUser(ListGroupsForUserRequest request);

    /**
      * ###
      * This topic provides an example on how to query all OpenID Connect (OIDC) identity providers (IdPs) within your Alibaba Cloud account. The response shows that your Alibaba Cloud account has only one OIDC IdP named `TestOIDCProvider`.
      *
     */
    CompletableFuture<ListOIDCProvidersResponse> listOIDCProviders(ListOIDCProvidersRequest request);

    CompletableFuture<ListPredefinedScopesResponse> listPredefinedScopes(ListPredefinedScopesRequest request);

    CompletableFuture<ListSAMLProvidersResponse> listSAMLProviders(ListSAMLProvidersRequest request);

    /**
      * ###
      * You must specify at least one of the following parameters or parameter pairs in a request to determine a query object:
      * *   `ResourceId.N`
      * *   `Tag.N.Key`
      * *   `Tag.N.Key` and `Tag.N.Value`
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * You can call the following API operations to query the information about all RAM users:
      * *   ListUsers: queries the details of all RAM users.
      * *   ListUserBasicInfos: queries the basic information about all RAM users. The basic information includes only the logon names (`UserPrincipalName`), display names (`DisplayName`), and user IDs (`UserId`).
      *
     */
    CompletableFuture<ListUserBasicInfosResponse> listUserBasicInfos(ListUserBasicInfosRequest request);

    /**
      * ### [](#)
      * You can call the following API operations to query the details of all RAM users:
      * *   ListUsers: queries the details of all RAM users.
      * *   ListUserBasicInfos: queries the basic information about all RAM users. The basic information includes only the logon names (`UserPrincipalName`), display names (`DisplayName`), and user IDs (`UserId`).
      *
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListUsersForGroupResponse> listUsersForGroup(ListUsersForGroupRequest request);

    CompletableFuture<ListVirtualMFADevicesResponse> listVirtualMFADevices(ListVirtualMFADevicesRequest request);

    /**
      * ###
      * This topic provides an example on how to remove the client ID `498469743454717****` from the OIDC IdP named `TestOIDCProvider`.
      *
     */
    CompletableFuture<RemoveClientIdFromOIDCProviderResponse> removeClientIdFromOIDCProvider(RemoveClientIdFromOIDCProviderRequest request);

    /**
      * ###
      * This topic provides an example on how to remove the fingerprint `6938fd4d98bab03faadb97b34396831e3780****` from the OIDC IdP named `TestOIDCProvider`.
      *
     */
    CompletableFuture<RemoveFingerprintFromOIDCProviderResponse> removeFingerprintFromOIDCProvider(RemoveFingerprintFromOIDCProviderRequest request);

    CompletableFuture<RemoveUserFromGroupResponse> removeUserFromGroup(RemoveUserFromGroupRequest request);

    CompletableFuture<SetDefaultDomainResponse> setDefaultDomain(SetDefaultDomainRequest request);

    CompletableFuture<SetPasswordPolicyResponse> setPasswordPolicy(SetPasswordPolicyRequest request);

    /**
      * ###
      * This topic provides an example on how to enable multi-factor authentication (MFA) only for RAM users who initiated unusual logons.
      *
     */
    CompletableFuture<SetSecurityPreferenceResponse> setSecurityPreference(SetSecurityPreferenceRequest request);

    CompletableFuture<SetUserSsoSettingsResponse> setUserSsoSettings(SetUserSsoSettingsRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnbindMFADeviceResponse> unbindMFADevice(UnbindMFADeviceRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAccessKeyResponse> updateAccessKey(UpdateAccessKeyRequest request);

    CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request);

    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    CompletableFuture<UpdateLoginProfileResponse> updateLoginProfile(UpdateLoginProfileRequest request);

    /**
      * ###
      * This topic provides an example on how to change the description of the OIDC IdP named `TestOIDCProvider` to `This is a new OIDC Provider.`
      *
     */
    CompletableFuture<UpdateOIDCProviderResponse> updateOIDCProvider(UpdateOIDCProviderRequest request);

    /**
      * This topic provides an example on how to change the description of an IdP named `test-provider` to `This is a new provider.`
      *
     */
    CompletableFuture<UpdateSAMLProviderResponse> updateSAMLProvider(UpdateSAMLProviderRequest request);

    /**
      * This topic provides an example to show how to modify the name of a RAM user from `test@example.onaliyun.com` to `new@example.onaliyun.com`.
      *
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
