// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eiam20211201.models.*;
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
     * @param request the request parameters of AuthorizeApplicationToGroups  AuthorizeApplicationToGroupsRequest
     * @return AuthorizeApplicationToGroupsResponse
     */
    CompletableFuture<AuthorizeApplicationToGroupsResponse> authorizeApplicationToGroups(AuthorizeApplicationToGroupsRequest request);

    /**
     * @param request the request parameters of AuthorizeApplicationToOrganizationalUnits  AuthorizeApplicationToOrganizationalUnitsRequest
     * @return AuthorizeApplicationToOrganizationalUnitsResponse
     */
    CompletableFuture<AuthorizeApplicationToOrganizationalUnitsResponse> authorizeApplicationToOrganizationalUnits(AuthorizeApplicationToOrganizationalUnitsRequest request);

    /**
     * @param request the request parameters of AuthorizeApplicationToUsers  AuthorizeApplicationToUsersRequest
     * @return AuthorizeApplicationToUsersResponse
     */
    CompletableFuture<AuthorizeApplicationToUsersResponse> authorizeApplicationToUsers(AuthorizeApplicationToUsersRequest request);

    /**
     * <b>description</b> :
     * <p>IDaaS EIAM supports the following two standard single sign-on (SSO) protocols for adding applications: SAML 2.0 and OIDC. You can select an SSO protocol based on your business requirements when you add an application. You cannot change the SSO protocol that you selected after the application is added.</p>
     * 
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
     * @param request the request parameters of CreateApplicationClientSecret  CreateApplicationClientSecretRequest
     * @return CreateApplicationClientSecretResponse
     */
    CompletableFuture<CreateApplicationClientSecretResponse> createApplicationClientSecret(CreateApplicationClientSecretRequest request);

    /**
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
     * @param request the request parameters of CreateDomainProxyToken  CreateDomainProxyTokenRequest
     * @return CreateDomainProxyTokenResponse
     */
    CompletableFuture<CreateDomainProxyTokenResponse> createDomainProxyToken(CreateDomainProxyTokenRequest request);

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * @param request the request parameters of CreateIdentityProvider  CreateIdentityProviderRequest
     * @return CreateIdentityProviderResponse
     */
    CompletableFuture<CreateIdentityProviderResponse> createIdentityProvider(CreateIdentityProviderRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateNetworkAccessEndpoint  CreateNetworkAccessEndpointRequest
     * @return CreateNetworkAccessEndpointResponse
     */
    CompletableFuture<CreateNetworkAccessEndpointResponse> createNetworkAccessEndpoint(CreateNetworkAccessEndpointRequest request);

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
     * <p>Make sure that the EIAM application that you want to delete is not used before you delete the EIAM application. After you delete the EIAM application, all configurations are deleted and cannot be restored.</p>
     * 
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
     * @param request the request parameters of DeleteApplicationClientSecret  DeleteApplicationClientSecretRequest
     * @return DeleteApplicationClientSecretResponse
     */
    CompletableFuture<DeleteApplicationClientSecretResponse> deleteApplicationClientSecret(DeleteApplicationClientSecretRequest request);

    /**
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * @param request the request parameters of DeleteDomainProxyToken  DeleteDomainProxyTokenRequest
     * @return DeleteDomainProxyTokenResponse
     */
    CompletableFuture<DeleteDomainProxyTokenResponse> deleteDomainProxyToken(DeleteDomainProxyTokenRequest request);

    /**
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * @param request the request parameters of DeleteIdentityProvider  DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    CompletableFuture<DeleteIdentityProviderResponse> deleteIdentityProvider(DeleteIdentityProviderRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that the instance to be deleted is no longer used. If the instance is deleted, all data related to the instance will be deleted.</p>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteNetworkAccessEndpoint  DeleteNetworkAccessEndpointRequest
     * @return DeleteNetworkAccessEndpointResponse
     */
    CompletableFuture<DeleteNetworkAccessEndpointResponse> deleteNetworkAccessEndpoint(DeleteNetworkAccessEndpointRequest request);

    /**
     * @param request the request parameters of DeleteOrganizationalUnit  DeleteOrganizationalUnitRequest
     * @return DeleteOrganizationalUnitResponse
     */
    CompletableFuture<DeleteOrganizationalUnitResponse> deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of DeleteOrganizationalUnitChildren  DeleteOrganizationalUnitChildrenRequest
     * @return DeleteOrganizationalUnitChildrenResponse
     */
    CompletableFuture<DeleteOrganizationalUnitChildrenResponse> deleteOrganizationalUnitChildren(DeleteOrganizationalUnitChildrenRequest request);

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * <b>description</b> :
     * <p>All features of the EIAM application cannot be used if you disable the EIAM application, such as single sign-on (SSO) and account synchronization. Make sure that you acknowledge the risks of the delete operation.</p>
     * 
     * @param request the request parameters of DisableApplication  DisableApplicationRequest
     * @return DisableApplicationResponse
     */
    CompletableFuture<DisableApplicationResponse> disableApplication(DisableApplicationRequest request);

    /**
     * @param request the request parameters of DisableApplicationApiInvoke  DisableApplicationApiInvokeRequest
     * @return DisableApplicationApiInvokeResponse
     */
    CompletableFuture<DisableApplicationApiInvokeResponse> disableApplicationApiInvoke(DisableApplicationApiInvokeRequest request);

    /**
     * @param request the request parameters of DisableApplicationClientSecret  DisableApplicationClientSecretRequest
     * @return DisableApplicationClientSecretResponse
     */
    CompletableFuture<DisableApplicationClientSecretResponse> disableApplicationClientSecret(DisableApplicationClientSecretRequest request);

    /**
     * @param request the request parameters of DisableApplicationProvisioning  DisableApplicationProvisioningRequest
     * @return DisableApplicationProvisioningResponse
     */
    CompletableFuture<DisableApplicationProvisioningResponse> disableApplicationProvisioning(DisableApplicationProvisioningRequest request);

    /**
     * @param request the request parameters of DisableApplicationSso  DisableApplicationSsoRequest
     * @return DisableApplicationSsoResponse
     */
    CompletableFuture<DisableApplicationSsoResponse> disableApplicationSso(DisableApplicationSsoRequest request);

    /**
     * @param request the request parameters of DisableDomainProxyToken  DisableDomainProxyTokenRequest
     * @return DisableDomainProxyTokenResponse
     */
    CompletableFuture<DisableDomainProxyTokenResponse> disableDomainProxyToken(DisableDomainProxyTokenRequest request);

    /**
     * @param request the request parameters of DisableIdentityProviderUdPull  DisableIdentityProviderUdPullRequest
     * @return DisableIdentityProviderUdPullResponse
     */
    CompletableFuture<DisableIdentityProviderUdPullResponse> disableIdentityProviderUdPull(DisableIdentityProviderUdPullRequest request);

    /**
     * @param request the request parameters of DisableInitDomainAutoRedirect  DisableInitDomainAutoRedirectRequest
     * @return DisableInitDomainAutoRedirectResponse
     */
    CompletableFuture<DisableInitDomainAutoRedirectResponse> disableInitDomainAutoRedirect(DisableInitDomainAutoRedirectRequest request);

    /**
     * @param request the request parameters of DisableUser  DisableUserRequest
     * @return DisableUserResponse
     */
    CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request);

    /**
     * @param request the request parameters of EnableApplication  EnableApplicationRequest
     * @return EnableApplicationResponse
     */
    CompletableFuture<EnableApplicationResponse> enableApplication(EnableApplicationRequest request);

    /**
     * @param request the request parameters of EnableApplicationApiInvoke  EnableApplicationApiInvokeRequest
     * @return EnableApplicationApiInvokeResponse
     */
    CompletableFuture<EnableApplicationApiInvokeResponse> enableApplicationApiInvoke(EnableApplicationApiInvokeRequest request);

    /**
     * @param request the request parameters of EnableApplicationClientSecret  EnableApplicationClientSecretRequest
     * @return EnableApplicationClientSecretResponse
     */
    CompletableFuture<EnableApplicationClientSecretResponse> enableApplicationClientSecret(EnableApplicationClientSecretRequest request);

    /**
     * @param request the request parameters of EnableApplicationProvisioning  EnableApplicationProvisioningRequest
     * @return EnableApplicationProvisioningResponse
     */
    CompletableFuture<EnableApplicationProvisioningResponse> enableApplicationProvisioning(EnableApplicationProvisioningRequest request);

    /**
     * @param request the request parameters of EnableApplicationSso  EnableApplicationSsoRequest
     * @return EnableApplicationSsoResponse
     */
    CompletableFuture<EnableApplicationSsoResponse> enableApplicationSso(EnableApplicationSsoRequest request);

    /**
     * @param request the request parameters of EnableDomainProxyToken  EnableDomainProxyTokenRequest
     * @return EnableDomainProxyTokenResponse
     */
    CompletableFuture<EnableDomainProxyTokenResponse> enableDomainProxyToken(EnableDomainProxyTokenRequest request);

    /**
     * @param request the request parameters of EnableIdentityProviderUdPull  EnableIdentityProviderUdPullRequest
     * @return EnableIdentityProviderUdPullResponse
     */
    CompletableFuture<EnableIdentityProviderUdPullResponse> enableIdentityProviderUdPull(EnableIdentityProviderUdPullRequest request);

    /**
     * @param request the request parameters of EnableInitDomainAutoRedirect  EnableInitDomainAutoRedirectRequest
     * @return EnableInitDomainAutoRedirectResponse
     */
    CompletableFuture<EnableInitDomainAutoRedirectResponse> enableInitDomainAutoRedirect(EnableInitDomainAutoRedirectRequest request);

    /**
     * @param request the request parameters of EnableUser  EnableUserRequest
     * @return EnableUserResponse
     */
    CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request);

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
     * @param request the request parameters of GetApplicationGrantScope  GetApplicationGrantScopeRequest
     * @return GetApplicationGrantScopeResponse
     */
    CompletableFuture<GetApplicationGrantScopeResponse> getApplicationGrantScope(GetApplicationGrantScopeRequest request);

    /**
     * @param request the request parameters of GetApplicationProvisioningConfig  GetApplicationProvisioningConfigRequest
     * @return GetApplicationProvisioningConfigResponse
     */
    CompletableFuture<GetApplicationProvisioningConfigResponse> getApplicationProvisioningConfig(GetApplicationProvisioningConfigRequest request);

    /**
     * @param request the request parameters of GetApplicationProvisioningScope  GetApplicationProvisioningScopeRequest
     * @return GetApplicationProvisioningScopeResponse
     */
    CompletableFuture<GetApplicationProvisioningScopeResponse> getApplicationProvisioningScope(GetApplicationProvisioningScopeRequest request);

    /**
     * @param request the request parameters of GetApplicationSsoConfig  GetApplicationSsoConfigRequest
     * @return GetApplicationSsoConfigResponse
     */
    CompletableFuture<GetApplicationSsoConfigResponse> getApplicationSsoConfig(GetApplicationSsoConfigRequest request);

    /**
     * @param request the request parameters of GetDomain  GetDomainRequest
     * @return GetDomainResponse
     */
    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    /**
     * @param request the request parameters of GetDomainDnsChallenge  GetDomainDnsChallengeRequest
     * @return GetDomainDnsChallengeResponse
     */
    CompletableFuture<GetDomainDnsChallengeResponse> getDomainDnsChallenge(GetDomainDnsChallengeRequest request);

    /**
     * @param request the request parameters of GetForgetPasswordConfiguration  GetForgetPasswordConfigurationRequest
     * @return GetForgetPasswordConfigurationResponse
     */
    CompletableFuture<GetForgetPasswordConfigurationResponse> getForgetPasswordConfiguration(GetForgetPasswordConfigurationRequest request);

    /**
     * @param request the request parameters of GetGroup  GetGroupRequest
     * @return GetGroupResponse
     */
    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    /**
     * @param request the request parameters of GetIdentityProvider  GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    CompletableFuture<GetIdentityProviderResponse> getIdentityProvider(GetIdentityProviderRequest request);

    /**
     * @param request the request parameters of GetIdentityProviderUdPullConfiguration  GetIdentityProviderUdPullConfigurationRequest
     * @return GetIdentityProviderUdPullConfigurationResponse
     */
    CompletableFuture<GetIdentityProviderUdPullConfigurationResponse> getIdentityProviderUdPullConfiguration(GetIdentityProviderUdPullConfigurationRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetNetworkAccessEndpoint  GetNetworkAccessEndpointRequest
     * @return GetNetworkAccessEndpointResponse
     */
    CompletableFuture<GetNetworkAccessEndpointResponse> getNetworkAccessEndpoint(GetNetworkAccessEndpointRequest request);

    /**
     * @param request the request parameters of GetOrganizationalUnit  GetOrganizationalUnitRequest
     * @return GetOrganizationalUnitResponse
     */
    CompletableFuture<GetOrganizationalUnitResponse> getOrganizationalUnit(GetOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of GetPasswordComplexityConfiguration  GetPasswordComplexityConfigurationRequest
     * @return GetPasswordComplexityConfigurationResponse
     */
    CompletableFuture<GetPasswordComplexityConfigurationResponse> getPasswordComplexityConfiguration(GetPasswordComplexityConfigurationRequest request);

    /**
     * @param request the request parameters of GetPasswordExpirationConfiguration  GetPasswordExpirationConfigurationRequest
     * @return GetPasswordExpirationConfigurationResponse
     */
    CompletableFuture<GetPasswordExpirationConfigurationResponse> getPasswordExpirationConfiguration(GetPasswordExpirationConfigurationRequest request);

    /**
     * @param request the request parameters of GetPasswordHistoryConfiguration  GetPasswordHistoryConfigurationRequest
     * @return GetPasswordHistoryConfigurationResponse
     */
    CompletableFuture<GetPasswordHistoryConfigurationResponse> getPasswordHistoryConfiguration(GetPasswordHistoryConfigurationRequest request);

    /**
     * @param request the request parameters of GetPasswordInitializationConfiguration  GetPasswordInitializationConfigurationRequest
     * @return GetPasswordInitializationConfigurationResponse
     */
    CompletableFuture<GetPasswordInitializationConfigurationResponse> getPasswordInitializationConfiguration(GetPasswordInitializationConfigurationRequest request);

    /**
     * @param request the request parameters of GetRootOrganizationalUnit  GetRootOrganizationalUnitRequest
     * @return GetRootOrganizationalUnitResponse
     */
    CompletableFuture<GetRootOrganizationalUnitResponse> getRootOrganizationalUnit(GetRootOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of GetSynchronizationJob  GetSynchronizationJobRequest
     * @return GetSynchronizationJobResponse
     */
    CompletableFuture<GetSynchronizationJobResponse> getSynchronizationJob(GetSynchronizationJobRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of ListApplicationClientSecrets  ListApplicationClientSecretsRequest
     * @return ListApplicationClientSecretsResponse
     */
    CompletableFuture<ListApplicationClientSecretsResponse> listApplicationClientSecrets(ListApplicationClientSecretsRequest request);

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
     * <b>description</b> :
     * <p>You can only query the permissions that are directly granted to the EIAM organization by calling the ListApplicationsForOrganizationalUnit operation. You can filter applications by configuring the <strong>ApplicationIds</strong> parameter when you call this operation.</p>
     * 
     * @param request the request parameters of ListApplicationsForOrganizationalUnit  ListApplicationsForOrganizationalUnitRequest
     * @return ListApplicationsForOrganizationalUnitResponse
     */
    CompletableFuture<ListApplicationsForOrganizationalUnitResponse> listApplicationsForOrganizationalUnit(ListApplicationsForOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of ListApplicationsForUser  ListApplicationsForUserRequest
     * @return ListApplicationsForUserResponse
     */
    CompletableFuture<ListApplicationsForUserResponse> listApplicationsForUser(ListApplicationsForUserRequest request);

    /**
     * @param request the request parameters of ListDomainProxyTokens  ListDomainProxyTokensRequest
     * @return ListDomainProxyTokensResponse
     */
    CompletableFuture<ListDomainProxyTokensResponse> listDomainProxyTokens(ListDomainProxyTokensRequest request);

    /**
     * @param request the request parameters of ListDomains  ListDomainsRequest
     * @return ListDomainsResponse
     */
    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    /**
     * @param request the request parameters of ListEiamInstances  ListEiamInstancesRequest
     * @return ListEiamInstancesResponse
     */
    CompletableFuture<ListEiamInstancesResponse> listEiamInstances(ListEiamInstancesRequest request);

    /**
     * @param request the request parameters of ListEiamRegions  ListEiamRegionsRequest
     * @return ListEiamRegionsResponse
     */
    CompletableFuture<ListEiamRegionsResponse> listEiamRegions(ListEiamRegionsRequest request);

    /**
     * @param request the request parameters of ListGroups  ListGroupsRequest
     * @return ListGroupsResponse
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
     * @param request the request parameters of ListGroupsForApplication  ListGroupsForApplicationRequest
     * @return ListGroupsForApplicationResponse
     */
    CompletableFuture<ListGroupsForApplicationResponse> listGroupsForApplication(ListGroupsForApplicationRequest request);

    /**
     * @param request the request parameters of ListGroupsForUser  ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     */
    CompletableFuture<ListGroupsForUserResponse> listGroupsForUser(ListGroupsForUserRequest request);

    /**
     * @param request the request parameters of ListIdentityProviders  ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    CompletableFuture<ListIdentityProvidersResponse> listIdentityProviders(ListIdentityProvidersRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListNetworkAccessEndpointAvailableRegions  ListNetworkAccessEndpointAvailableRegionsRequest
     * @return ListNetworkAccessEndpointAvailableRegionsResponse
     */
    CompletableFuture<ListNetworkAccessEndpointAvailableRegionsResponse> listNetworkAccessEndpointAvailableRegions(ListNetworkAccessEndpointAvailableRegionsRequest request);

    /**
     * @param request the request parameters of ListNetworkAccessEndpointAvailableZones  ListNetworkAccessEndpointAvailableZonesRequest
     * @return ListNetworkAccessEndpointAvailableZonesResponse
     */
    CompletableFuture<ListNetworkAccessEndpointAvailableZonesResponse> listNetworkAccessEndpointAvailableZones(ListNetworkAccessEndpointAvailableZonesRequest request);

    /**
     * @param request the request parameters of ListNetworkAccessEndpoints  ListNetworkAccessEndpointsRequest
     * @return ListNetworkAccessEndpointsResponse
     */
    CompletableFuture<ListNetworkAccessEndpointsResponse> listNetworkAccessEndpoints(ListNetworkAccessEndpointsRequest request);

    /**
     * @param request the request parameters of ListNetworkAccessPaths  ListNetworkAccessPathsRequest
     * @return ListNetworkAccessPathsResponse
     */
    CompletableFuture<ListNetworkAccessPathsResponse> listNetworkAccessPaths(ListNetworkAccessPathsRequest request);

    /**
     * @param request the request parameters of ListOrganizationalUnitParents  ListOrganizationalUnitParentsRequest
     * @return ListOrganizationalUnitParentsResponse
     */
    CompletableFuture<ListOrganizationalUnitParentsResponse> listOrganizationalUnitParents(ListOrganizationalUnitParentsRequest request);

    /**
     * @param request the request parameters of ListOrganizationalUnits  ListOrganizationalUnitsRequest
     * @return ListOrganizationalUnitsResponse
     */
    CompletableFuture<ListOrganizationalUnitsResponse> listOrganizationalUnits(ListOrganizationalUnitsRequest request);

    /**
     * @param request the request parameters of ListOrganizationalUnitsForApplication  ListOrganizationalUnitsForApplicationRequest
     * @return ListOrganizationalUnitsForApplicationResponse
     */
    CompletableFuture<ListOrganizationalUnitsForApplicationResponse> listOrganizationalUnitsForApplication(ListOrganizationalUnitsForApplicationRequest request);

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of ListSynchronizationJobs  ListSynchronizationJobsRequest
     * @return ListSynchronizationJobsResponse
     */
    CompletableFuture<ListSynchronizationJobsResponse> listSynchronizationJobs(ListSynchronizationJobsRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListUsersForApplication  ListUsersForApplicationRequest
     * @return ListUsersForApplicationResponse
     */
    CompletableFuture<ListUsersForApplicationResponse> listUsersForApplication(ListUsersForApplicationRequest request);

    /**
     * @param request the request parameters of ListUsersForGroup  ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     */
    CompletableFuture<ListUsersForGroupResponse> listUsersForGroup(ListUsersForGroupRequest request);

    /**
     * @param request the request parameters of ObtainApplicationClientSecret  ObtainApplicationClientSecretRequest
     * @return ObtainApplicationClientSecretResponse
     */
    CompletableFuture<ObtainApplicationClientSecretResponse> obtainApplicationClientSecret(ObtainApplicationClientSecretRequest request);

    /**
     * @param request the request parameters of ObtainDomainProxyToken  ObtainDomainProxyTokenRequest
     * @return ObtainDomainProxyTokenResponse
     */
    CompletableFuture<ObtainDomainProxyTokenResponse> obtainDomainProxyToken(ObtainDomainProxyTokenRequest request);

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
     * @param request the request parameters of RevokeApplicationFromGroups  RevokeApplicationFromGroupsRequest
     * @return RevokeApplicationFromGroupsResponse
     */
    CompletableFuture<RevokeApplicationFromGroupsResponse> revokeApplicationFromGroups(RevokeApplicationFromGroupsRequest request);

    /**
     * @param request the request parameters of RevokeApplicationFromOrganizationalUnits  RevokeApplicationFromOrganizationalUnitsRequest
     * @return RevokeApplicationFromOrganizationalUnitsResponse
     */
    CompletableFuture<RevokeApplicationFromOrganizationalUnitsResponse> revokeApplicationFromOrganizationalUnits(RevokeApplicationFromOrganizationalUnitsRequest request);

    /**
     * @param request the request parameters of RevokeApplicationFromUsers  RevokeApplicationFromUsersRequest
     * @return RevokeApplicationFromUsersResponse
     */
    CompletableFuture<RevokeApplicationFromUsersResponse> revokeApplicationFromUsers(RevokeApplicationFromUsersRequest request);

    /**
     * @param request the request parameters of RunSynchronizationJob  RunSynchronizationJobRequest
     * @return RunSynchronizationJobResponse
     */
    CompletableFuture<RunSynchronizationJobResponse> runSynchronizationJob(RunSynchronizationJobRequest request);

    /**
     * @param request the request parameters of SetApplicationGrantScope  SetApplicationGrantScopeRequest
     * @return SetApplicationGrantScopeResponse
     */
    CompletableFuture<SetApplicationGrantScopeResponse> setApplicationGrantScope(SetApplicationGrantScopeRequest request);

    /**
     * @param request the request parameters of SetApplicationProvisioningConfig  SetApplicationProvisioningConfigRequest
     * @return SetApplicationProvisioningConfigResponse
     */
    CompletableFuture<SetApplicationProvisioningConfigResponse> setApplicationProvisioningConfig(SetApplicationProvisioningConfigRequest request);

    /**
     * @param request the request parameters of SetApplicationProvisioningScope  SetApplicationProvisioningScopeRequest
     * @return SetApplicationProvisioningScopeResponse
     */
    CompletableFuture<SetApplicationProvisioningScopeResponse> setApplicationProvisioningScope(SetApplicationProvisioningScopeRequest request);

    /**
     * <b>description</b> :
     * <p>In IDaaS EIAM, the application management feature supports multiple SSO protocols for applications, including SAML 2.0 and OIDC protocols. Each application supports only one protocol, and the protocol cannot be changed after the application is created. You can specify the SSO configuration attributes of an application based on the supported SSO protocol.</p>
     * 
     * @param request the request parameters of SetApplicationSsoConfig  SetApplicationSsoConfigRequest
     * @return SetApplicationSsoConfigResponse
     */
    CompletableFuture<SetApplicationSsoConfigResponse> setApplicationSsoConfig(SetApplicationSsoConfigRequest request);

    /**
     * @param request the request parameters of SetDefaultDomain  SetDefaultDomainRequest
     * @return SetDefaultDomainResponse
     */
    CompletableFuture<SetDefaultDomainResponse> setDefaultDomain(SetDefaultDomainRequest request);

    /**
     * @param request the request parameters of SetForgetPasswordConfiguration  SetForgetPasswordConfigurationRequest
     * @return SetForgetPasswordConfigurationResponse
     */
    CompletableFuture<SetForgetPasswordConfigurationResponse> setForgetPasswordConfiguration(SetForgetPasswordConfigurationRequest request);

    /**
     * @param request the request parameters of SetIdentityProviderUdPullConfiguration  SetIdentityProviderUdPullConfigurationRequest
     * @return SetIdentityProviderUdPullConfigurationResponse
     */
    CompletableFuture<SetIdentityProviderUdPullConfigurationResponse> setIdentityProviderUdPullConfiguration(SetIdentityProviderUdPullConfigurationRequest request);

    /**
     * @param request the request parameters of SetPasswordComplexityConfiguration  SetPasswordComplexityConfigurationRequest
     * @return SetPasswordComplexityConfigurationResponse
     */
    CompletableFuture<SetPasswordComplexityConfigurationResponse> setPasswordComplexityConfiguration(SetPasswordComplexityConfigurationRequest request);

    /**
     * @param request the request parameters of SetPasswordExpirationConfiguration  SetPasswordExpirationConfigurationRequest
     * @return SetPasswordExpirationConfigurationResponse
     */
    CompletableFuture<SetPasswordExpirationConfigurationResponse> setPasswordExpirationConfiguration(SetPasswordExpirationConfigurationRequest request);

    /**
     * @param request the request parameters of SetPasswordHistoryConfiguration  SetPasswordHistoryConfigurationRequest
     * @return SetPasswordHistoryConfigurationResponse
     */
    CompletableFuture<SetPasswordHistoryConfigurationResponse> setPasswordHistoryConfiguration(SetPasswordHistoryConfigurationRequest request);

    /**
     * @param request the request parameters of SetPasswordInitializationConfiguration  SetPasswordInitializationConfigurationRequest
     * @return SetPasswordInitializationConfigurationResponse
     */
    CompletableFuture<SetPasswordInitializationConfigurationResponse> setPasswordInitializationConfiguration(SetPasswordInitializationConfigurationRequest request);

    /**
     * @param request the request parameters of SetUserPrimaryOrganizationalUnit  SetUserPrimaryOrganizationalUnitRequest
     * @return SetUserPrimaryOrganizationalUnitResponse
     */
    CompletableFuture<SetUserPrimaryOrganizationalUnitResponse> setUserPrimaryOrganizationalUnit(SetUserPrimaryOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of UnlockUser  UnlockUserRequest
     * @return UnlockUserResponse
     */
    CompletableFuture<UnlockUserResponse> unlockUser(UnlockUserRequest request);

    /**
     * @param request the request parameters of UpdateApplicationAuthorizationType  UpdateApplicationAuthorizationTypeRequest
     * @return UpdateApplicationAuthorizationTypeResponse
     */
    CompletableFuture<UpdateApplicationAuthorizationTypeResponse> updateApplicationAuthorizationType(UpdateApplicationAuthorizationTypeRequest request);

    /**
     * @param request the request parameters of UpdateApplicationDescription  UpdateApplicationDescriptionRequest
     * @return UpdateApplicationDescriptionResponse
     */
    CompletableFuture<UpdateApplicationDescriptionResponse> updateApplicationDescription(UpdateApplicationDescriptionRequest request);

    /**
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    /**
     * @param request the request parameters of UpdateGroupDescription  UpdateGroupDescriptionRequest
     * @return UpdateGroupDescriptionResponse
     */
    CompletableFuture<UpdateGroupDescriptionResponse> updateGroupDescription(UpdateGroupDescriptionRequest request);

    /**
     * @param request the request parameters of UpdateIdentityProvider  UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    CompletableFuture<UpdateIdentityProviderResponse> updateIdentityProvider(UpdateIdentityProviderRequest request);

    /**
     * @param request the request parameters of UpdateInstanceDescription  UpdateInstanceDescriptionRequest
     * @return UpdateInstanceDescriptionResponse
     */
    CompletableFuture<UpdateInstanceDescriptionResponse> updateInstanceDescription(UpdateInstanceDescriptionRequest request);

    /**
     * @param request the request parameters of UpdateNetworkAccessEndpointName  UpdateNetworkAccessEndpointNameRequest
     * @return UpdateNetworkAccessEndpointNameResponse
     */
    CompletableFuture<UpdateNetworkAccessEndpointNameResponse> updateNetworkAccessEndpointName(UpdateNetworkAccessEndpointNameRequest request);

    /**
     * @param request the request parameters of UpdateOrganizationalUnit  UpdateOrganizationalUnitRequest
     * @return UpdateOrganizationalUnitResponse
     */
    CompletableFuture<UpdateOrganizationalUnitResponse> updateOrganizationalUnit(UpdateOrganizationalUnitRequest request);

    /**
     * @param request the request parameters of UpdateOrganizationalUnitDescription  UpdateOrganizationalUnitDescriptionRequest
     * @return UpdateOrganizationalUnitDescriptionResponse
     */
    CompletableFuture<UpdateOrganizationalUnitDescriptionResponse> updateOrganizationalUnitDescription(UpdateOrganizationalUnitDescriptionRequest request);

    /**
     * @param request the request parameters of UpdateOrganizationalUnitParentId  UpdateOrganizationalUnitParentIdRequest
     * @return UpdateOrganizationalUnitParentIdResponse
     */
    CompletableFuture<UpdateOrganizationalUnitParentIdResponse> updateOrganizationalUnitParentId(UpdateOrganizationalUnitParentIdRequest request);

    /**
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    /**
     * @param request the request parameters of UpdateUserDescription  UpdateUserDescriptionRequest
     * @return UpdateUserDescriptionResponse
     */
    CompletableFuture<UpdateUserDescriptionResponse> updateUserDescription(UpdateUserDescriptionRequest request);

    /**
     * @param request the request parameters of UpdateUserPassword  UpdateUserPasswordRequest
     * @return UpdateUserPasswordResponse
     */
    CompletableFuture<UpdateUserPasswordResponse> updateUserPassword(UpdateUserPasswordRequest request);

}
