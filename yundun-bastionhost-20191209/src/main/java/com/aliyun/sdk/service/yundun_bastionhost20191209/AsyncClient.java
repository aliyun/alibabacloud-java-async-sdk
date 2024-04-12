// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yundun_bastionhost20191209.models.*;
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

    CompletableFuture<AcceptApproveCommandResponse> acceptApproveCommand(AcceptApproveCommandRequest request);

    /**
      * You can call this operation as a Bastionhost administrator to approve an O\\&M application of an O\\&M engineer.
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<AcceptOperationTicketResponse> acceptOperationTicket(AcceptOperationTicketRequest request);

    CompletableFuture<AddDatabasesToGroupResponse> addDatabasesToGroup(AddDatabasesToGroupRequest request);

    /**
      * You can call this operation to add one or more hosts to a host group. You can add multiple hosts to a host group to manage and grant permissions on the hosts in a centralized manner.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
     */
    CompletableFuture<AddHostsToGroupResponse> addHostsToGroup(AddHostsToGroupRequest request);

    /**
      * #
      * You can call this operation to add one or more users to a user group. After you call the [CreateUserGroup](~~204596~~) operation to create a user group, you can call the AddUsersToGroup operation to add multiple users to the user group. Then, you can manage and grant permissions to the users at a time.
      * # Limit
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<AddUsersToGroupResponse> addUsersToGroup(AddUsersToGroupRequest request);

    CompletableFuture<AttachDatabaseAccountsToUserResponse> attachDatabaseAccountsToUser(AttachDatabaseAccountsToUserRequest request);

    CompletableFuture<AttachDatabaseAccountsToUserGroupResponse> attachDatabaseAccountsToUserGroup(AttachDatabaseAccountsToUserGroupRequest request);

    CompletableFuture<AttachHostAccountsToHostShareKeyResponse> attachHostAccountsToHostShareKey(AttachHostAccountsToHostShareKeyRequest request);

    CompletableFuture<AttachHostAccountsToUserResponse> attachHostAccountsToUser(AttachHostAccountsToUserRequest request);

    /**
      * After you authorize a user group to manage specific hosts and host accounts, all the users in the user group have access to the authorized hosts and host accounts.
      *
     */
    CompletableFuture<AttachHostAccountsToUserGroupResponse> attachHostAccountsToUserGroup(AttachHostAccountsToUserGroupRequest request);

    CompletableFuture<AttachHostGroupAccountsToUserResponse> attachHostGroupAccountsToUser(AttachHostGroupAccountsToUserRequest request);

    CompletableFuture<AttachHostGroupAccountsToUserGroupResponse> attachHostGroupAccountsToUserGroup(AttachHostGroupAccountsToUserGroupRequest request);

    CompletableFuture<ConfigInstanceSecurityGroupsResponse> configInstanceSecurityGroups(ConfigInstanceSecurityGroupsRequest request);

    /**
      * ## Usage notes
      * You can call this operation to configure a whitelist of public IP addresses for a bastion host. By default, a bastion host is accessible from all public IP addresses. If you want to allow the requests from specific public IP addresses, you can call this operation to add trusted IP addresses to the whitelist of the bastion host.  
      * ## Limits
      * You can call this operation up to 30 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ConfigInstanceWhiteListResponse> configInstanceWhiteList(ConfigInstanceWhiteListRequest request);

    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    CompletableFuture<CreateDatabaseAccountResponse> createDatabaseAccount(CreateDatabaseAccountRequest request);

    CompletableFuture<CreateHostResponse> createHost(CreateHostRequest request);

    CompletableFuture<CreateHostAccountResponse> createHostAccount(CreateHostAccountRequest request);

    CompletableFuture<CreateHostGroupResponse> createHostGroup(CreateHostGroupRequest request);

    CompletableFuture<CreateHostShareKeyResponse> createHostShareKey(CreateHostShareKeyRequest request);

    CompletableFuture<CreateNetworkDomainResponse> createNetworkDomain(CreateNetworkDomainRequest request);

    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
      * ## Usage notes
      * You can call this operation to add a user to a bastion host. You can add local users and Resource Access Management (RAM) users. After a Bastionhost administrator adds a user to a bastion host, the O&M personnel can log on to the bastion host as the user to perform O&M operations on the host on which they have permissions.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
      * You can call this operation to create a user group for a bastion host as an administrator. Then, you can call the [AddUsersToGroup](~~204600~~) operation to add users to the user group at a time. After you add the users to the user group, you can authorize and manage the users in a centralized manner.
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request);

    /**
      * You can call the CreateUserPublicKey operation to create a public key for the specified user of a bastion host.
      *
     */
    CompletableFuture<CreateUserPublicKeyResponse> createUserPublicKey(CreateUserPublicKeyRequest request);

    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    CompletableFuture<DeleteDatabaseAccountResponse> deleteDatabaseAccount(DeleteDatabaseAccountRequest request);

    CompletableFuture<DeleteHostResponse> deleteHost(DeleteHostRequest request);

    /**
      * ## Usage notes
      * This interface is used to delete individual host accounts. If a host account is no longer in use, you can invoke this interface to delete the host account for that host that has been configured on the bastion.
      * >  After you remove the host account, you must enter the username and password of the host when you log on to the host in Bastionhost.  
      * ## QPS Limit
      * The single-user QPS limit of this interface is 10 times/second. If the limit is exceeded, the API call will be stream-limited, which may affect your business, please call reasonably.
      *
     */
    CompletableFuture<DeleteHostAccountResponse> deleteHostAccount(DeleteHostAccountRequest request);

    /**
      * You can call this operation to delete a single host group. If you no longer need to perform O\\&M operations on all hosts in a host group, you can call this operation to delete the host group.
      * ### Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteHostGroupResponse> deleteHostGroup(DeleteHostGroupRequest request);

    CompletableFuture<DeleteHostShareKeyResponse> deleteHostShareKey(DeleteHostShareKeyRequest request);

    CompletableFuture<DeleteNetworkDomainResponse> deleteNetworkDomain(DeleteNetworkDomainRequest request);

    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DeleteUserGroupResponse> deleteUserGroup(DeleteUserGroupRequest request);

    /**
      * You can call the DeleteUserPublicKey operation to delete a public key from the specified user of a bastion host.
      *
     */
    CompletableFuture<DeleteUserPublicKeyResponse> deleteUserPublicKey(DeleteUserPublicKeyRequest request);

    CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DetachDatabaseAccountsFromUserResponse> detachDatabaseAccountsFromUser(DetachDatabaseAccountsFromUserRequest request);

    CompletableFuture<DetachDatabaseAccountsFromUserGroupResponse> detachDatabaseAccountsFromUserGroup(DetachDatabaseAccountsFromUserGroupRequest request);

    CompletableFuture<DetachHostAccountsFromHostShareKeyResponse> detachHostAccountsFromHostShareKey(DetachHostAccountsFromHostShareKeyRequest request);

    CompletableFuture<DetachHostAccountsFromUserResponse> detachHostAccountsFromUser(DetachHostAccountsFromUserRequest request);

    CompletableFuture<DetachHostAccountsFromUserGroupResponse> detachHostAccountsFromUserGroup(DetachHostAccountsFromUserGroupRequest request);

    CompletableFuture<DetachHostGroupAccountsFromUserResponse> detachHostGroupAccountsFromUser(DetachHostGroupAccountsFromUserRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<DetachHostGroupAccountsFromUserGroupResponse> detachHostGroupAccountsFromUserGroup(DetachHostGroupAccountsFromUserGroupRequest request);

    CompletableFuture<DisableInstancePublicAccessResponse> disableInstancePublicAccess(DisableInstancePublicAccessRequest request);

    CompletableFuture<DisableRuleResponse> disableRule(DisableRuleRequest request);

    CompletableFuture<EnableInstancePublicAccessResponse> enableInstancePublicAccess(EnableInstancePublicAccessRequest request);

    CompletableFuture<EnableRuleResponse> enableRule(EnableRuleRequest request);

    CompletableFuture<GenerateAssetOperationTokenResponse> generateAssetOperationToken(GenerateAssetOperationTokenRequest request);

    CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request);

    CompletableFuture<GetDatabaseAccountResponse> getDatabaseAccount(GetDatabaseAccountRequest request);

    CompletableFuture<GetHostResponse> getHost(GetHostRequest request);

    CompletableFuture<GetHostAccountResponse> getHostAccount(GetHostAccountRequest request);

    CompletableFuture<GetHostGroupResponse> getHostGroup(GetHostGroupRequest request);

    CompletableFuture<GetHostShareKeyResponse> getHostShareKey(GetHostShareKeyRequest request);

    /**
      * ###
      * You can call this operation to query the settings of AD authentication on a bastion host. After you configure AD authentication on a bastion host, you can import AD-authenticated users into the bastion host. After the AD-authenticated users are imported into the bastion host, the AD-authenticated users can log on to the bastion host to perform O\\&M operations on servers.
      * ### Limit
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetInstanceADAuthServerResponse> getInstanceADAuthServer(GetInstanceADAuthServerRequest request);

    CompletableFuture<GetInstanceLDAPAuthServerResponse> getInstanceLDAPAuthServer(GetInstanceLDAPAuthServerRequest request);

    /**
      * You can call this operation to query the settings of two-factor authentication on a bastion host. After you enable two-factor authentication, Bastionhost sends a verification code to a local user when the local user logs on to a bastion host. A local user can log on to the bastion host only when the local user enters the valid username and password and the verification code. This reduces the security risks caused by account information leaks.
      * ### Limit
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetInstanceTwoFactorResponse> getInstanceTwoFactor(GetInstanceTwoFactorRequest request);

    CompletableFuture<GetNetworkDomainResponse> getNetworkDomain(GetNetworkDomainRequest request);

    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    CompletableFuture<GetPolicyAssetScopeResponse> getPolicyAssetScope(GetPolicyAssetScopeRequest request);

    CompletableFuture<GetPolicyUserScopeResponse> getPolicyUserScope(GetPolicyUserScopeRequest request);

    CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserGroupResponse> getUserGroup(GetUserGroupRequest request);

    CompletableFuture<ListApproveCommandsResponse> listApproveCommands(ListApproveCommandsRequest request);

    CompletableFuture<ListDatabaseAccountsResponse> listDatabaseAccounts(ListDatabaseAccountsRequest request);

    CompletableFuture<ListDatabaseAccountsForUserResponse> listDatabaseAccountsForUser(ListDatabaseAccountsForUserRequest request);

    CompletableFuture<ListDatabaseAccountsForUserGroupResponse> listDatabaseAccountsForUserGroup(ListDatabaseAccountsForUserGroupRequest request);

    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    CompletableFuture<ListDatabasesForUserResponse> listDatabasesForUser(ListDatabasesForUserRequest request);

    CompletableFuture<ListDatabasesForUserGroupResponse> listDatabasesForUserGroup(ListDatabasesForUserGroupRequest request);

    CompletableFuture<ListHostAccountsResponse> listHostAccounts(ListHostAccountsRequest request);

    CompletableFuture<ListHostAccountsForHostShareKeyResponse> listHostAccountsForHostShareKey(ListHostAccountsForHostShareKeyRequest request);

    CompletableFuture<ListHostAccountsForUserResponse> listHostAccountsForUser(ListHostAccountsForUserRequest request);

    CompletableFuture<ListHostAccountsForUserGroupResponse> listHostAccountsForUserGroup(ListHostAccountsForUserGroupRequest request);

    CompletableFuture<ListHostGroupAccountNamesForUserResponse> listHostGroupAccountNamesForUser(ListHostGroupAccountNamesForUserRequest request);

    CompletableFuture<ListHostGroupAccountNamesForUserGroupResponse> listHostGroupAccountNamesForUserGroup(ListHostGroupAccountNamesForUserGroupRequest request);

    CompletableFuture<ListHostGroupsResponse> listHostGroups(ListHostGroupsRequest request);

    CompletableFuture<ListHostGroupsForUserResponse> listHostGroupsForUser(ListHostGroupsForUserRequest request);

    CompletableFuture<ListHostGroupsForUserGroupResponse> listHostGroupsForUserGroup(ListHostGroupsForUserGroupRequest request);

    CompletableFuture<ListHostShareKeysResponse> listHostShareKeys(ListHostShareKeysRequest request);

    CompletableFuture<ListHostsResponse> listHosts(ListHostsRequest request);

    CompletableFuture<ListHostsForUserResponse> listHostsForUser(ListHostsForUserRequest request);

    CompletableFuture<ListHostsForUserGroupResponse> listHostsForUserGroup(ListHostsForUserGroupRequest request);

    CompletableFuture<ListNetworkDomainsResponse> listNetworkDomains(ListNetworkDomainsRequest request);

    CompletableFuture<ListOperationDatabaseAccountsResponse> listOperationDatabaseAccounts(ListOperationDatabaseAccountsRequest request);

    CompletableFuture<ListOperationDatabasesResponse> listOperationDatabases(ListOperationDatabasesRequest request);

    CompletableFuture<ListOperationHostAccountsResponse> listOperationHostAccounts(ListOperationHostAccountsRequest request);

    CompletableFuture<ListOperationHostsResponse> listOperationHosts(ListOperationHostsRequest request);

    CompletableFuture<ListOperationTicketsResponse> listOperationTickets(ListOperationTicketsRequest request);

    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListUserGroupsResponse> listUserGroups(ListUserGroupsRequest request);

    CompletableFuture<ListUserPublicKeysResponse> listUserPublicKeys(ListUserPublicKeysRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
      * # Description
      * You can call this operation to lock one or more users of a bastion host. If a user does not need to use a bastion host to perform O\\&M operations within a specific period of time, you can lock the user. The locked user can no longer log on to or perform O\\&M operations on the hosts on which the user is granted permissions. If you want to unlock the user later, you can call the [UnlockUsers](~~204590~~) operation.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<LockUsersResponse> lockUsers(LockUsersRequest request);

    CompletableFuture<ModifyDatabaseResponse> modifyDatabase(ModifyDatabaseRequest request);

    CompletableFuture<ModifyDatabaseAccountResponse> modifyDatabaseAccount(ModifyDatabaseAccountRequest request);

    /**
      * You can call the ModifyHost operation to modify the basic information about a host in a data center, an Elastic Compute Service (ECS) instance, or a host in an ApsaraDB MyBase dedicated cluster.
      * > The basic information about ECS instances and hosts in ApsaraDB MyBase dedicated clusters within your Alibaba Cloud account is synchronized to Bastionhost on a regular basis. After you modify the basic information about an ECS instance or a host in an ApsaraDB MyBase dedicated cluster, the modification result may be overwritten by the synchronized information.
      *
     */
    CompletableFuture<ModifyHostResponse> modifyHost(ModifyHostRequest request);

    CompletableFuture<ModifyHostAccountResponse> modifyHostAccount(ModifyHostAccountRequest request);

    CompletableFuture<ModifyHostGroupResponse> modifyHostGroup(ModifyHostGroupRequest request);

    CompletableFuture<ModifyHostShareKeyResponse> modifyHostShareKey(ModifyHostShareKeyRequest request);

    CompletableFuture<ModifyHostsActiveAddressTypeResponse> modifyHostsActiveAddressType(ModifyHostsActiveAddressTypeRequest request);

    /**
      * ## Usage notes
      * You can call this operation to change the port for the O&M protocol on one or more hosts. If the standard port for the O&M protocol on your host is vulnerable to attacks, you can call this operation to specify a custom port. For example, the standard port for SSH is port 22.  
      * >  Ports 0 to 1024 are reserved for Bastionhost. Do not change the port for the O&M protocol to a reserved port.  
      * ## QPS limit
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifyHostsPortResponse> modifyHostsPort(ModifyHostsPortRequest request);

    CompletableFuture<ModifyInstanceADAuthServerResponse> modifyInstanceADAuthServer(ModifyInstanceADAuthServerRequest request);

    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    CompletableFuture<ModifyInstanceLDAPAuthServerResponse> modifyInstanceLDAPAuthServer(ModifyInstanceLDAPAuthServerRequest request);

    CompletableFuture<ModifyInstanceTwoFactorResponse> modifyInstanceTwoFactor(ModifyInstanceTwoFactorRequest request);

    CompletableFuture<ModifyNetworkDomainResponse> modifyNetworkDomain(ModifyNetworkDomainRequest request);

    CompletableFuture<ModifyPolicyResponse> modifyPolicy(ModifyPolicyRequest request);

    CompletableFuture<ModifyRuleResponse> modifyRule(ModifyRuleRequest request);

    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    CompletableFuture<ModifyUserGroupResponse> modifyUserGroup(ModifyUserGroupRequest request);

    CompletableFuture<ModifyUserPublicKeyResponse> modifyUserPublicKey(ModifyUserPublicKeyRequest request);

    CompletableFuture<MoveDatabasesToNetworkDomainResponse> moveDatabasesToNetworkDomain(MoveDatabasesToNetworkDomainRequest request);

    CompletableFuture<MoveHostsToNetworkDomainResponse> moveHostsToNetworkDomain(MoveHostsToNetworkDomainRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<RejectApproveCommandResponse> rejectApproveCommand(RejectApproveCommandRequest request);

    /**
      * You can call this operation to reject an O\\&M application of an O\\&M engineer as a Bastionhost administrator.
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<RejectOperationTicketResponse> rejectOperationTicket(RejectOperationTicketRequest request);

    CompletableFuture<RemoveDatabasesFromGroupResponse> removeDatabasesFromGroup(RemoveDatabasesFromGroupRequest request);

    CompletableFuture<RemoveHostsFromGroupResponse> removeHostsFromGroup(RemoveHostsFromGroupRequest request);

    /**
      * You can call this operation to remove one or more users from a user group. When users in a user group are transferred to a new position, resign, or are switched to another user group, you can call this operation to remove the users from the current user group at a time.  
      * ## QPS limit
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<RemoveUsersFromGroupResponse> removeUsersFromGroup(RemoveUsersFromGroupRequest request);

    CompletableFuture<RenewAssetOperationTokenResponse> renewAssetOperationToken(RenewAssetOperationTokenRequest request);

    CompletableFuture<ResetHostAccountCredentialResponse> resetHostAccountCredential(ResetHostAccountCredentialRequest request);

    CompletableFuture<SetPolicyAccessTimeRangeConfigResponse> setPolicyAccessTimeRangeConfig(SetPolicyAccessTimeRangeConfigRequest request);

    CompletableFuture<SetPolicyApprovalConfigResponse> setPolicyApprovalConfig(SetPolicyApprovalConfigRequest request);

    CompletableFuture<SetPolicyAssetScopeResponse> setPolicyAssetScope(SetPolicyAssetScopeRequest request);

    CompletableFuture<SetPolicyCommandConfigResponse> setPolicyCommandConfig(SetPolicyCommandConfigRequest request);

    CompletableFuture<SetPolicyIPAclConfigResponse> setPolicyIPAclConfig(SetPolicyIPAclConfigRequest request);

    CompletableFuture<SetPolicyProtocolConfigResponse> setPolicyProtocolConfig(SetPolicyProtocolConfigRequest request);

    CompletableFuture<SetPolicyUserScopeResponse> setPolicyUserScope(SetPolicyUserScopeRequest request);

    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * After you call the [LockUsers](~~204591~~) operation to lock one or more users of a bastion host, you can call this operation to unlock the users. After the users are unlocked, the users can perform O\\&M operations by using the bastion host.
      * # Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<UnlockUsersResponse> unlockUsers(UnlockUsersRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<VerifyInstanceADAuthServerResponse> verifyInstanceADAuthServer(VerifyInstanceADAuthServerRequest request);

    CompletableFuture<VerifyInstanceLDAPAuthServerResponse> verifyInstanceLDAPAuthServer(VerifyInstanceLDAPAuthServerRequest request);

}
