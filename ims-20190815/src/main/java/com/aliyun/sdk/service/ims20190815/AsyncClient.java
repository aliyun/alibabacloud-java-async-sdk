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

    CompletableFuture<AddClientIdToOIDCProviderResponse> addClientIdToOIDCProvider(AddClientIdToOIDCProviderRequest request);

    CompletableFuture<AddFingerprintToOIDCProviderResponse> addFingerprintToOIDCProvider(AddFingerprintToOIDCProviderRequest request);

    CompletableFuture<AddUserToGroupResponse> addUserToGroup(AddUserToGroupRequest request);

    CompletableFuture<BindMFADeviceResponse> bindMFADevice(BindMFADeviceRequest request);

    CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request);

    CompletableFuture<CreateAccessKeyResponse> createAccessKey(CreateAccessKeyRequest request);

    CompletableFuture<CreateAppSecretResponse> createAppSecret(CreateAppSecretRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    CompletableFuture<CreateLoginProfileResponse> createLoginProfile(CreateLoginProfileRequest request);

    CompletableFuture<CreateOIDCProviderResponse> createOIDCProvider(CreateOIDCProviderRequest request);

    CompletableFuture<CreateSAMLProviderResponse> createSAMLProvider(CreateSAMLProviderRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CreateVirtualMFADeviceResponse> createVirtualMFADevice(CreateVirtualMFADeviceRequest request);

    CompletableFuture<DeleteAccessKeyResponse> deleteAccessKey(DeleteAccessKeyRequest request);

    CompletableFuture<DeleteAppSecretResponse> deleteAppSecret(DeleteAppSecretRequest request);

    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    CompletableFuture<DeleteLoginProfileResponse> deleteLoginProfile(DeleteLoginProfileRequest request);

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

    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetCredentialReportResponse> getCredentialReport(GetCredentialReportRequest request);

    CompletableFuture<GetDefaultDomainResponse> getDefaultDomain(GetDefaultDomainRequest request);

    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    CompletableFuture<GetLoginProfileResponse> getLoginProfile(GetLoginProfileRequest request);

    CompletableFuture<GetOIDCProviderResponse> getOIDCProvider(GetOIDCProviderRequest request);

    CompletableFuture<GetPasswordPolicyResponse> getPasswordPolicy(GetPasswordPolicyRequest request);

    CompletableFuture<GetSAMLProviderResponse> getSAMLProvider(GetSAMLProviderRequest request);

    CompletableFuture<GetSecurityPreferenceResponse> getSecurityPreference(GetSecurityPreferenceRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserMFAInfoResponse> getUserMFAInfo(GetUserMFAInfoRequest request);

    CompletableFuture<GetUserSsoSettingsResponse> getUserSsoSettings(GetUserSsoSettingsRequest request);

    CompletableFuture<ListAccessKeysResponse> listAccessKeys(ListAccessKeysRequest request);

    CompletableFuture<ListAppSecretIdsResponse> listAppSecretIds(ListAppSecretIdsRequest request);

    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    CompletableFuture<ListGroupsForUserResponse> listGroupsForUser(ListGroupsForUserRequest request);

    CompletableFuture<ListOIDCProvidersResponse> listOIDCProviders(ListOIDCProvidersRequest request);

    CompletableFuture<ListPredefinedScopesResponse> listPredefinedScopes(ListPredefinedScopesRequest request);

    CompletableFuture<ListSAMLProvidersResponse> listSAMLProviders(ListSAMLProvidersRequest request);

    CompletableFuture<ListUserBasicInfosResponse> listUserBasicInfos(ListUserBasicInfosRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListUsersForGroupResponse> listUsersForGroup(ListUsersForGroupRequest request);

    CompletableFuture<ListVirtualMFADevicesResponse> listVirtualMFADevices(ListVirtualMFADevicesRequest request);

    CompletableFuture<RemoveClientIdFromOIDCProviderResponse> removeClientIdFromOIDCProvider(RemoveClientIdFromOIDCProviderRequest request);

    CompletableFuture<RemoveFingerprintFromOIDCProviderResponse> removeFingerprintFromOIDCProvider(RemoveFingerprintFromOIDCProviderRequest request);

    CompletableFuture<RemoveUserFromGroupResponse> removeUserFromGroup(RemoveUserFromGroupRequest request);

    CompletableFuture<SetDefaultDomainResponse> setDefaultDomain(SetDefaultDomainRequest request);

    CompletableFuture<SetPasswordPolicyResponse> setPasswordPolicy(SetPasswordPolicyRequest request);

    CompletableFuture<SetSecurityPreferenceResponse> setSecurityPreference(SetSecurityPreferenceRequest request);

    CompletableFuture<SetUserSsoSettingsResponse> setUserSsoSettings(SetUserSsoSettingsRequest request);

    CompletableFuture<UnbindMFADeviceResponse> unbindMFADevice(UnbindMFADeviceRequest request);

    CompletableFuture<UpdateAccessKeyResponse> updateAccessKey(UpdateAccessKeyRequest request);

    CompletableFuture<UpdateApplicationResponse> updateApplication(UpdateApplicationRequest request);

    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    CompletableFuture<UpdateLoginProfileResponse> updateLoginProfile(UpdateLoginProfileRequest request);

    CompletableFuture<UpdateOIDCProviderResponse> updateOIDCProvider(UpdateOIDCProviderRequest request);

    CompletableFuture<UpdateSAMLProviderResponse> updateSAMLProvider(UpdateSAMLProviderRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
