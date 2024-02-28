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
      * The ID of the request, which is used to locate and troubleshoot issues.
      *
     */
    CompletableFuture<ConfigInstanceWhiteListResponse> configInstanceWhiteList(ConfigInstanceWhiteListRequest request);

    CompletableFuture<CreateHostResponse> createHost(CreateHostRequest request);

    CompletableFuture<CreateHostAccountResponse> createHostAccount(CreateHostAccountRequest request);

    CompletableFuture<CreateHostGroupResponse> createHostGroup(CreateHostGroupRequest request);

    CompletableFuture<CreateHostShareKeyResponse> createHostShareKey(CreateHostShareKeyRequest request);

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

    CompletableFuture<DeleteHostResponse> deleteHost(DeleteHostRequest request);

    /**
      * ## Usage notes
      * You can call this operation to remove a single host account. If you no longer use a host account that is added to a host in Bastionhost, you can call this operation to remove the host account from the host.  
      * >  After you remove the host account, you must enter the username and password of the host when you log on to the host in Bastionhost.  
      * ## Limits
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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

    CompletableFuture<EnableInstancePublicAccessResponse> enableInstancePublicAccess(EnableInstancePublicAccessRequest request);

    CompletableFuture<GetHostResponse> getHost(GetHostRequest request);

    CompletableFuture<GetHostAccountResponse> getHostAccount(GetHostAccountRequest request);

    CompletableFuture<GetHostGroupResponse> getHostGroup(GetHostGroupRequest request);

    CompletableFuture<GetHostShareKeyResponse> getHostShareKey(GetHostShareKeyRequest request);

    /**
      * The condition that is used to filter users.
      *
     */
    CompletableFuture<GetInstanceADAuthServerResponse> getInstanceADAuthServer(GetInstanceADAuthServerRequest request);

    CompletableFuture<GetInstanceLDAPAuthServerResponse> getInstanceLDAPAuthServer(GetInstanceLDAPAuthServerRequest request);

    /**
      * Indicates whether two-factor authentication is enabled. Valid values:
      * *   **true**: enabled
      * *   **false**: disabled
      *
     */
    CompletableFuture<GetInstanceTwoFactorResponse> getInstanceTwoFactor(GetInstanceTwoFactorRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserGroupResponse> getUserGroup(GetUserGroupRequest request);

    CompletableFuture<ListApproveCommandsResponse> listApproveCommands(ListApproveCommandsRequest request);

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

    CompletableFuture<ListOperationTicketsResponse> listOperationTickets(ListOperationTicketsRequest request);

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

    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    CompletableFuture<ModifyUserGroupResponse> modifyUserGroup(ModifyUserGroupRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<RejectApproveCommandResponse> rejectApproveCommand(RejectApproveCommandRequest request);

    /**
      * You can call this operation to reject an O\\&M application of an O\\&M engineer as a Bastionhost administrator.
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<RejectOperationTicketResponse> rejectOperationTicket(RejectOperationTicketRequest request);

    CompletableFuture<RemoveHostsFromGroupResponse> removeHostsFromGroup(RemoveHostsFromGroupRequest request);

    /**
      * You can call this operation to remove one or more users from a user group. When users in a user group are transferred to a new position, resign, or are switched to another user group, you can call this operation to remove the users from the current user group at a time.  
      * ## QPS limit
      * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<RemoveUsersFromGroupResponse> removeUsersFromGroup(RemoveUsersFromGroupRequest request);

    CompletableFuture<ResetHostAccountCredentialResponse> resetHostAccountCredential(ResetHostAccountCredentialRequest request);

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

}
