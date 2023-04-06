// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eiam20211201.models.*;
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

    CompletableFuture<AddUserToOrganizationalUnitsResponse> addUserToOrganizationalUnits(AddUserToOrganizationalUnitsRequest request);

    CompletableFuture<AddUsersToGroupResponse> addUsersToGroup(AddUsersToGroupRequest request);

    CompletableFuture<AuthorizeApplicationToGroupsResponse> authorizeApplicationToGroups(AuthorizeApplicationToGroupsRequest request);

    CompletableFuture<AuthorizeApplicationToOrganizationalUnitsResponse> authorizeApplicationToOrganizationalUnits(AuthorizeApplicationToOrganizationalUnitsRequest request);

    CompletableFuture<AuthorizeApplicationToUsersResponse> authorizeApplicationToUsers(AuthorizeApplicationToUsersRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateApplicationClientSecretResponse> createApplicationClientSecret(CreateApplicationClientSecretRequest request);

    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateOrganizationalUnitResponse> createOrganizationalUnit(CreateOrganizationalUnitRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeleteApplicationClientSecretResponse> deleteApplicationClientSecret(DeleteApplicationClientSecretRequest request);

    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteOrganizationalUnitResponse> deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DisableApplicationResponse> disableApplication(DisableApplicationRequest request);

    CompletableFuture<DisableApplicationApiInvokeResponse> disableApplicationApiInvoke(DisableApplicationApiInvokeRequest request);

    CompletableFuture<DisableApplicationClientSecretResponse> disableApplicationClientSecret(DisableApplicationClientSecretRequest request);

    CompletableFuture<DisableApplicationProvisioningResponse> disableApplicationProvisioning(DisableApplicationProvisioningRequest request);

    CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request);

    CompletableFuture<EnableApplicationResponse> enableApplication(EnableApplicationRequest request);

    CompletableFuture<EnableApplicationApiInvokeResponse> enableApplicationApiInvoke(EnableApplicationApiInvokeRequest request);

    CompletableFuture<EnableApplicationClientSecretResponse> enableApplicationClientSecret(EnableApplicationClientSecretRequest request);

    CompletableFuture<EnableApplicationProvisioningResponse> enableApplicationProvisioning(EnableApplicationProvisioningRequest request);

    CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request);

    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetApplicationGrantScopeResponse> getApplicationGrantScope(GetApplicationGrantScopeRequest request);

    CompletableFuture<GetApplicationProvisioningConfigResponse> getApplicationProvisioningConfig(GetApplicationProvisioningConfigRequest request);

    CompletableFuture<GetApplicationProvisioningScopeResponse> getApplicationProvisioningScope(GetApplicationProvisioningScopeRequest request);

    CompletableFuture<GetApplicationSsoConfigResponse> getApplicationSsoConfig(GetApplicationSsoConfigRequest request);

    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetOrganizationalUnitResponse> getOrganizationalUnit(GetOrganizationalUnitRequest request);

    CompletableFuture<GetPasswordComplexityConfigurationResponse> getPasswordComplexityConfiguration(GetPasswordComplexityConfigurationRequest request);

    CompletableFuture<GetPasswordExpirationConfigurationResponse> getPasswordExpirationConfiguration(GetPasswordExpirationConfigurationRequest request);

    CompletableFuture<GetPasswordHistoryConfigurationResponse> getPasswordHistoryConfiguration(GetPasswordHistoryConfigurationRequest request);

    CompletableFuture<GetPasswordInitializationConfigurationResponse> getPasswordInitializationConfiguration(GetPasswordInitializationConfigurationRequest request);

    CompletableFuture<GetRootOrganizationalUnitResponse> getRootOrganizationalUnit(GetRootOrganizationalUnitRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<ListApplicationClientSecretsResponse> listApplicationClientSecrets(ListApplicationClientSecretsRequest request);

    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    CompletableFuture<ListApplicationsForOrganizationalUnitResponse> listApplicationsForOrganizationalUnit(ListApplicationsForOrganizationalUnitRequest request);

    CompletableFuture<ListApplicationsForUserResponse> listApplicationsForUser(ListApplicationsForUserRequest request);

    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    CompletableFuture<ListGroupsForApplicationResponse> listGroupsForApplication(ListGroupsForApplicationRequest request);

    CompletableFuture<ListGroupsForUserResponse> listGroupsForUser(ListGroupsForUserRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListOrganizationalUnitsResponse> listOrganizationalUnits(ListOrganizationalUnitsRequest request);

    CompletableFuture<ListOrganizationalUnitsForApplicationResponse> listOrganizationalUnitsForApplication(ListOrganizationalUnitsForApplicationRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListUsersForApplicationResponse> listUsersForApplication(ListUsersForApplicationRequest request);

    CompletableFuture<ListUsersForGroupResponse> listUsersForGroup(ListUsersForGroupRequest request);

    CompletableFuture<ObtainApplicationClientSecretResponse> obtainApplicationClientSecret(ObtainApplicationClientSecretRequest request);

    CompletableFuture<RemoveUserFromOrganizationalUnitsResponse> removeUserFromOrganizationalUnits(RemoveUserFromOrganizationalUnitsRequest request);

    CompletableFuture<RemoveUsersFromGroupResponse> removeUsersFromGroup(RemoveUsersFromGroupRequest request);

    CompletableFuture<RevokeApplicationFromGroupsResponse> revokeApplicationFromGroups(RevokeApplicationFromGroupsRequest request);

    CompletableFuture<RevokeApplicationFromOrganizationalUnitsResponse> revokeApplicationFromOrganizationalUnits(RevokeApplicationFromOrganizationalUnitsRequest request);

    CompletableFuture<RevokeApplicationFromUsersResponse> revokeApplicationFromUsers(RevokeApplicationFromUsersRequest request);

    CompletableFuture<SetApplicationGrantScopeResponse> setApplicationGrantScope(SetApplicationGrantScopeRequest request);

    CompletableFuture<SetApplicationProvisioningConfigResponse> setApplicationProvisioningConfig(SetApplicationProvisioningConfigRequest request);

    CompletableFuture<SetApplicationProvisioningScopeResponse> setApplicationProvisioningScope(SetApplicationProvisioningScopeRequest request);

    CompletableFuture<SetApplicationSsoConfigResponse> setApplicationSsoConfig(SetApplicationSsoConfigRequest request);

    CompletableFuture<SetPasswordComplexityConfigurationResponse> setPasswordComplexityConfiguration(SetPasswordComplexityConfigurationRequest request);

    CompletableFuture<SetPasswordExpirationConfigurationResponse> setPasswordExpirationConfiguration(SetPasswordExpirationConfigurationRequest request);

    CompletableFuture<SetPasswordHistoryConfigurationResponse> setPasswordHistoryConfiguration(SetPasswordHistoryConfigurationRequest request);

    CompletableFuture<SetPasswordInitializationConfigurationResponse> setPasswordInitializationConfiguration(SetPasswordInitializationConfigurationRequest request);

    CompletableFuture<SetUserPrimaryOrganizationalUnitResponse> setUserPrimaryOrganizationalUnit(SetUserPrimaryOrganizationalUnitRequest request);

    CompletableFuture<UnlockUserResponse> unlockUser(UnlockUserRequest request);

    CompletableFuture<UpdateApplicationAuthorizationTypeResponse> updateApplicationAuthorizationType(UpdateApplicationAuthorizationTypeRequest request);

    CompletableFuture<UpdateApplicationDescriptionResponse> updateApplicationDescription(UpdateApplicationDescriptionRequest request);

    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    CompletableFuture<UpdateGroupDescriptionResponse> updateGroupDescription(UpdateGroupDescriptionRequest request);

    CompletableFuture<UpdateInstanceDescriptionResponse> updateInstanceDescription(UpdateInstanceDescriptionRequest request);

    CompletableFuture<UpdateOrganizationalUnitResponse> updateOrganizationalUnit(UpdateOrganizationalUnitRequest request);

    CompletableFuture<UpdateOrganizationalUnitDescriptionResponse> updateOrganizationalUnitDescription(UpdateOrganizationalUnitDescriptionRequest request);

    CompletableFuture<UpdateOrganizationalUnitParentIdResponse> updateOrganizationalUnitParentId(UpdateOrganizationalUnitParentIdRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    CompletableFuture<UpdateUserDescriptionResponse> updateUserDescription(UpdateUserDescriptionRequest request);

    CompletableFuture<UpdateUserPasswordResponse> updateUserPassword(UpdateUserPasswordRequest request);

}
