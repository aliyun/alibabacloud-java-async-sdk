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

    /**
      * IDaaS EIAM supports the following two standard single sign-on (SSO) protocols for adding applications: SAML 2.0 and OIDC. You can select an SSO protocol based on your business requirements when you add an application. You cannot change the SSO protocol that you selected after the application is added.
      *
     */
    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateApplicationClientSecretResponse> createApplicationClientSecret(CreateApplicationClientSecretRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateDomainProxyTokenResponse> createDomainProxyToken(CreateDomainProxyTokenRequest request);

    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateNetworkAccessEndpointResponse> createNetworkAccessEndpoint(CreateNetworkAccessEndpointRequest request);

    CompletableFuture<CreateOrganizationalUnitResponse> createOrganizationalUnit(CreateOrganizationalUnitRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
      * Make sure that the EIAM application that you want to delete is not used before you delete the EIAM application. After you delete the EIAM application, all configurations are deleted and cannot be restored.
      *
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeleteApplicationClientSecretResponse> deleteApplicationClientSecret(DeleteApplicationClientSecretRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteDomainProxyTokenResponse> deleteDomainProxyToken(DeleteDomainProxyTokenRequest request);

    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
      * Make sure that the instance to be deleted is no longer used. If the instance is deleted, all data related to the instance will be deleted.
      *
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteNetworkAccessEndpointResponse> deleteNetworkAccessEndpoint(DeleteNetworkAccessEndpointRequest request);

    CompletableFuture<DeleteOrganizationalUnitResponse> deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
      * All features of the EIAM application cannot be used if you disable the EIAM application, such as single sign-on (SSO) and account synchronization. Make sure that you acknowledge the risks of the delete operation.
      *
     */
    CompletableFuture<DisableApplicationResponse> disableApplication(DisableApplicationRequest request);

    CompletableFuture<DisableApplicationApiInvokeResponse> disableApplicationApiInvoke(DisableApplicationApiInvokeRequest request);

    CompletableFuture<DisableApplicationClientSecretResponse> disableApplicationClientSecret(DisableApplicationClientSecretRequest request);

    CompletableFuture<DisableApplicationProvisioningResponse> disableApplicationProvisioning(DisableApplicationProvisioningRequest request);

    CompletableFuture<DisableApplicationSsoResponse> disableApplicationSso(DisableApplicationSsoRequest request);

    CompletableFuture<DisableDomainProxyTokenResponse> disableDomainProxyToken(DisableDomainProxyTokenRequest request);

    CompletableFuture<DisableInitDomainAutoRedirectResponse> disableInitDomainAutoRedirect(DisableInitDomainAutoRedirectRequest request);

    CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request);

    CompletableFuture<EnableApplicationResponse> enableApplication(EnableApplicationRequest request);

    CompletableFuture<EnableApplicationApiInvokeResponse> enableApplicationApiInvoke(EnableApplicationApiInvokeRequest request);

    CompletableFuture<EnableApplicationClientSecretResponse> enableApplicationClientSecret(EnableApplicationClientSecretRequest request);

    CompletableFuture<EnableApplicationProvisioningResponse> enableApplicationProvisioning(EnableApplicationProvisioningRequest request);

    CompletableFuture<EnableApplicationSsoResponse> enableApplicationSso(EnableApplicationSsoRequest request);

    CompletableFuture<EnableDomainProxyTokenResponse> enableDomainProxyToken(EnableDomainProxyTokenRequest request);

    CompletableFuture<EnableInitDomainAutoRedirectResponse> enableInitDomainAutoRedirect(EnableInitDomainAutoRedirectRequest request);

    CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request);

    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetApplicationGrantScopeResponse> getApplicationGrantScope(GetApplicationGrantScopeRequest request);

    CompletableFuture<GetApplicationProvisioningConfigResponse> getApplicationProvisioningConfig(GetApplicationProvisioningConfigRequest request);

    CompletableFuture<GetApplicationProvisioningScopeResponse> getApplicationProvisioningScope(GetApplicationProvisioningScopeRequest request);

    CompletableFuture<GetApplicationSsoConfigResponse> getApplicationSsoConfig(GetApplicationSsoConfigRequest request);

    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    CompletableFuture<GetDomainDnsChallengeResponse> getDomainDnsChallenge(GetDomainDnsChallengeRequest request);

    CompletableFuture<GetForgetPasswordConfigurationResponse> getForgetPasswordConfiguration(GetForgetPasswordConfigurationRequest request);

    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetNetworkAccessEndpointResponse> getNetworkAccessEndpoint(GetNetworkAccessEndpointRequest request);

    CompletableFuture<GetOrganizationalUnitResponse> getOrganizationalUnit(GetOrganizationalUnitRequest request);

    CompletableFuture<GetPasswordComplexityConfigurationResponse> getPasswordComplexityConfiguration(GetPasswordComplexityConfigurationRequest request);

    CompletableFuture<GetPasswordExpirationConfigurationResponse> getPasswordExpirationConfiguration(GetPasswordExpirationConfigurationRequest request);

    CompletableFuture<GetPasswordHistoryConfigurationResponse> getPasswordHistoryConfiguration(GetPasswordHistoryConfigurationRequest request);

    CompletableFuture<GetPasswordInitializationConfigurationResponse> getPasswordInitializationConfiguration(GetPasswordInitializationConfigurationRequest request);

    CompletableFuture<GetRootOrganizationalUnitResponse> getRootOrganizationalUnit(GetRootOrganizationalUnitRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<ListApplicationClientSecretsResponse> listApplicationClientSecrets(ListApplicationClientSecretsRequest request);

    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
      * You can only query the permissions that are directly granted to the EIAM organization by calling the ListApplicationsForOrganizationalUnit operation. You can filter applications by configuring the **ApplicationIds** parameter when you call this operation.
      *
     */
    CompletableFuture<ListApplicationsForOrganizationalUnitResponse> listApplicationsForOrganizationalUnit(ListApplicationsForOrganizationalUnitRequest request);

    CompletableFuture<ListApplicationsForUserResponse> listApplicationsForUser(ListApplicationsForUserRequest request);

    CompletableFuture<ListDomainProxyTokensResponse> listDomainProxyTokens(ListDomainProxyTokensRequest request);

    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    CompletableFuture<ListEiamInstancesResponse> listEiamInstances(ListEiamInstancesRequest request);

    CompletableFuture<ListEiamRegionsResponse> listEiamRegions(ListEiamRegionsRequest request);

    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    CompletableFuture<ListGroupsForApplicationResponse> listGroupsForApplication(ListGroupsForApplicationRequest request);

    CompletableFuture<ListGroupsForUserResponse> listGroupsForUser(ListGroupsForUserRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListNetworkAccessEndpointAvailableRegionsResponse> listNetworkAccessEndpointAvailableRegions(ListNetworkAccessEndpointAvailableRegionsRequest request);

    CompletableFuture<ListNetworkAccessEndpointAvailableZonesResponse> listNetworkAccessEndpointAvailableZones(ListNetworkAccessEndpointAvailableZonesRequest request);

    CompletableFuture<ListNetworkAccessEndpointsResponse> listNetworkAccessEndpoints(ListNetworkAccessEndpointsRequest request);

    CompletableFuture<ListNetworkAccessPathsResponse> listNetworkAccessPaths(ListNetworkAccessPathsRequest request);

    CompletableFuture<ListOrganizationalUnitParentsResponse> listOrganizationalUnitParents(ListOrganizationalUnitParentsRequest request);

    CompletableFuture<ListOrganizationalUnitsResponse> listOrganizationalUnits(ListOrganizationalUnitsRequest request);

    CompletableFuture<ListOrganizationalUnitsForApplicationResponse> listOrganizationalUnitsForApplication(ListOrganizationalUnitsForApplicationRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListUsersForApplicationResponse> listUsersForApplication(ListUsersForApplicationRequest request);

    CompletableFuture<ListUsersForGroupResponse> listUsersForGroup(ListUsersForGroupRequest request);

    CompletableFuture<ObtainApplicationClientSecretResponse> obtainApplicationClientSecret(ObtainApplicationClientSecretRequest request);

    CompletableFuture<ObtainDomainProxyTokenResponse> obtainDomainProxyToken(ObtainDomainProxyTokenRequest request);

    CompletableFuture<RemoveUserFromOrganizationalUnitsResponse> removeUserFromOrganizationalUnits(RemoveUserFromOrganizationalUnitsRequest request);

    CompletableFuture<RemoveUsersFromGroupResponse> removeUsersFromGroup(RemoveUsersFromGroupRequest request);

    CompletableFuture<RevokeApplicationFromGroupsResponse> revokeApplicationFromGroups(RevokeApplicationFromGroupsRequest request);

    CompletableFuture<RevokeApplicationFromOrganizationalUnitsResponse> revokeApplicationFromOrganizationalUnits(RevokeApplicationFromOrganizationalUnitsRequest request);

    CompletableFuture<RevokeApplicationFromUsersResponse> revokeApplicationFromUsers(RevokeApplicationFromUsersRequest request);

    CompletableFuture<SetApplicationGrantScopeResponse> setApplicationGrantScope(SetApplicationGrantScopeRequest request);

    CompletableFuture<SetApplicationProvisioningConfigResponse> setApplicationProvisioningConfig(SetApplicationProvisioningConfigRequest request);

    CompletableFuture<SetApplicationProvisioningScopeResponse> setApplicationProvisioningScope(SetApplicationProvisioningScopeRequest request);

    /**
      * In IDaaS EIAM, the application management feature supports multiple SSO protocols for applications, including SAML 2.0 and OIDC protocols. Each application supports only one protocol, and the protocol cannot be changed after the application is created. You can specify the SSO configuration attributes of an application based on the supported SSO protocol.
      *
     */
    CompletableFuture<SetApplicationSsoConfigResponse> setApplicationSsoConfig(SetApplicationSsoConfigRequest request);

    CompletableFuture<SetDefaultDomainResponse> setDefaultDomain(SetDefaultDomainRequest request);

    CompletableFuture<SetForgetPasswordConfigurationResponse> setForgetPasswordConfiguration(SetForgetPasswordConfigurationRequest request);

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

    CompletableFuture<UpdateNetworkAccessEndpointNameResponse> updateNetworkAccessEndpointName(UpdateNetworkAccessEndpointNameRequest request);

    CompletableFuture<UpdateOrganizationalUnitResponse> updateOrganizationalUnit(UpdateOrganizationalUnitRequest request);

    CompletableFuture<UpdateOrganizationalUnitDescriptionResponse> updateOrganizationalUnitDescription(UpdateOrganizationalUnitDescriptionRequest request);

    CompletableFuture<UpdateOrganizationalUnitParentIdResponse> updateOrganizationalUnitParentId(UpdateOrganizationalUnitParentIdRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    CompletableFuture<UpdateUserDescriptionResponse> updateUserDescription(UpdateUserDescriptionRequest request);

    CompletableFuture<UpdateUserPasswordResponse> updateUserPassword(UpdateUserPasswordRequest request);

}
