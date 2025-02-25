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

    /**
     * <b>description</b> :
     * <p>You can call this operation as a Bastionhost administrator to approve the request to run a command of an O\&amp;M engineer.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AcceptApproveCommand  AcceptApproveCommandRequest
     * @return AcceptApproveCommandResponse
     */
    CompletableFuture<AcceptApproveCommandResponse> acceptApproveCommand(AcceptApproveCommandRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation as a Bastionhost administrator to approve an O\&amp;M application of an O\&amp;M engineer.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AcceptOperationTicket  AcceptOperationTicketRequest
     * @return AcceptOperationTicketResponse
     */
    CompletableFuture<AcceptOperationTicketResponse> acceptOperationTicket(AcceptOperationTicketRequest request);

    /**
     * @param request the request parameters of AddDatabasesToGroup  AddDatabasesToGroupRequest
     * @return AddDatabasesToGroupResponse
     */
    CompletableFuture<AddDatabasesToGroupResponse> addDatabasesToGroup(AddDatabasesToGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to add one or more hosts to a host group. You can add multiple hosts to a host group to manage and grant permissions on the hosts in a centralized manner.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     * 
     * @param request the request parameters of AddHostsToGroup  AddHostsToGroupRequest
     * @return AddHostsToGroupResponse
     */
    CompletableFuture<AddHostsToGroupResponse> addHostsToGroup(AddHostsToGroupRequest request);

    /**
     * <b>description</b> :
     * <h1></h1>
     * <p>You can call this operation to add one or more users to a user group. After you call the <a href="https://help.aliyun.com/document_detail/204596.html">CreateUserGroup</a> operation to create a user group, you can call the AddUsersToGroup operation to add multiple users to the user group. Then, you can manage and grant permissions to the users at a time.</p>
     * <h1>Limit</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddUsersToGroup  AddUsersToGroupRequest
     * @return AddUsersToGroupResponse
     */
    CompletableFuture<AddUsersToGroupResponse> addUsersToGroup(AddUsersToGroupRequest request);

    /**
     * @param request the request parameters of AttachDatabaseAccountsToUser  AttachDatabaseAccountsToUserRequest
     * @return AttachDatabaseAccountsToUserResponse
     */
    CompletableFuture<AttachDatabaseAccountsToUserResponse> attachDatabaseAccountsToUser(AttachDatabaseAccountsToUserRequest request);

    /**
     * @param request the request parameters of AttachDatabaseAccountsToUserGroup  AttachDatabaseAccountsToUserGroupRequest
     * @return AttachDatabaseAccountsToUserGroupResponse
     */
    CompletableFuture<AttachDatabaseAccountsToUserGroupResponse> attachDatabaseAccountsToUserGroup(AttachDatabaseAccountsToUserGroupRequest request);

    /**
     * @param request the request parameters of AttachHostAccountsToHostShareKey  AttachHostAccountsToHostShareKeyRequest
     * @return AttachHostAccountsToHostShareKeyResponse
     */
    CompletableFuture<AttachHostAccountsToHostShareKeyResponse> attachHostAccountsToHostShareKey(AttachHostAccountsToHostShareKeyRequest request);

    /**
     * @param request the request parameters of AttachHostAccountsToUser  AttachHostAccountsToUserRequest
     * @return AttachHostAccountsToUserResponse
     */
    CompletableFuture<AttachHostAccountsToUserResponse> attachHostAccountsToUser(AttachHostAccountsToUserRequest request);

    /**
     * <b>description</b> :
     * <p>After you authorize a user group to manage specific hosts and host accounts, all the users in the user group have access to the authorized hosts and host accounts.</p>
     * 
     * @param request the request parameters of AttachHostAccountsToUserGroup  AttachHostAccountsToUserGroupRequest
     * @return AttachHostAccountsToUserGroupResponse
     */
    CompletableFuture<AttachHostAccountsToUserGroupResponse> attachHostAccountsToUserGroup(AttachHostAccountsToUserGroupRequest request);

    /**
     * @param request the request parameters of AttachHostGroupAccountsToUser  AttachHostGroupAccountsToUserRequest
     * @return AttachHostGroupAccountsToUserResponse
     */
    CompletableFuture<AttachHostGroupAccountsToUserResponse> attachHostGroupAccountsToUser(AttachHostGroupAccountsToUserRequest request);

    /**
     * @param request the request parameters of AttachHostGroupAccountsToUserGroup  AttachHostGroupAccountsToUserGroupRequest
     * @return AttachHostGroupAccountsToUserGroupResponse
     */
    CompletableFuture<AttachHostGroupAccountsToUserGroupResponse> attachHostGroupAccountsToUserGroup(AttachHostGroupAccountsToUserGroupRequest request);

    /**
     * @param request the request parameters of ConfigInstanceSecurityGroups  ConfigInstanceSecurityGroupsRequest
     * @return ConfigInstanceSecurityGroupsResponse
     */
    CompletableFuture<ConfigInstanceSecurityGroupsResponse> configInstanceSecurityGroups(ConfigInstanceSecurityGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to configure a whitelist of public IP addresses for a bastion host. By default, a bastion host is accessible from all public IP addresses. If you want to allow the requests from specific public IP addresses, you can call this operation to add trusted IP addresses to the whitelist of the bastion host.  </p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 30 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ConfigInstanceWhiteList  ConfigInstanceWhiteListRequest
     * @return ConfigInstanceWhiteListResponse
     */
    CompletableFuture<ConfigInstanceWhiteListResponse> configInstanceWhiteList(ConfigInstanceWhiteListRequest request);

    /**
     * @param request the request parameters of CreateDatabase  CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    CompletableFuture<CreateDatabaseResponse> createDatabase(CreateDatabaseRequest request);

    /**
     * @param request the request parameters of CreateDatabaseAccount  CreateDatabaseAccountRequest
     * @return CreateDatabaseAccountResponse
     */
    CompletableFuture<CreateDatabaseAccountResponse> createDatabaseAccount(CreateDatabaseAccountRequest request);

    /**
     * @param request the request parameters of CreateExportConfigJob  CreateExportConfigJobRequest
     * @return CreateExportConfigJobResponse
     */
    CompletableFuture<CreateExportConfigJobResponse> createExportConfigJob(CreateExportConfigJobRequest request);

    /**
     * @param request the request parameters of CreateHost  CreateHostRequest
     * @return CreateHostResponse
     */
    CompletableFuture<CreateHostResponse> createHost(CreateHostRequest request);

    /**
     * @param request the request parameters of CreateHostAccount  CreateHostAccountRequest
     * @return CreateHostAccountResponse
     */
    CompletableFuture<CreateHostAccountResponse> createHostAccount(CreateHostAccountRequest request);

    /**
     * @param request the request parameters of CreateHostGroup  CreateHostGroupRequest
     * @return CreateHostGroupResponse
     */
    CompletableFuture<CreateHostGroupResponse> createHostGroup(CreateHostGroupRequest request);

    /**
     * @param request the request parameters of CreateHostShareKey  CreateHostShareKeyRequest
     * @return CreateHostShareKeyResponse
     */
    CompletableFuture<CreateHostShareKeyResponse> createHostShareKey(CreateHostShareKeyRequest request);

    /**
     * @param request the request parameters of CreateNetworkDomain  CreateNetworkDomainRequest
     * @return CreateNetworkDomainResponse
     */
    CompletableFuture<CreateNetworkDomainResponse> createNetworkDomain(CreateNetworkDomainRequest request);

    /**
     * @param request the request parameters of CreateOperationTicket  CreateOperationTicketRequest
     * @return CreateOperationTicketResponse
     */
    CompletableFuture<CreateOperationTicketResponse> createOperationTicket(CreateOperationTicketRequest request);

    /**
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    /**
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the CreateUser operation to add local users, Resource Access Management (RAM) users, Active Directory (AD)-authenticated users, or Lightweight Directory Access Protocol (LDAP)-authenticated users to a bastion host. After a Bastionhost administrator adds a user to a bastion host, O\&amp;M engineers can log on to the bastion host as the user to perform O\&amp;M operations on the hosts that the user is authorized to manage.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a user group for a bastion host as an administrator. Then, you can call the <a href="https://help.aliyun.com/document_detail/204600.html">AddUsersToGroup</a> operation to add users to the user group at a time. After you add the users to the user group, you can authorize and manage the users in a centralized manner.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateUserGroup  CreateUserGroupRequest
     * @return CreateUserGroupResponse
     */
    CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the CreateUserPublicKey operation to create a public key for the specified user of a bastion host.</p>
     * 
     * @param request the request parameters of CreateUserPublicKey  CreateUserPublicKeyRequest
     * @return CreateUserPublicKeyResponse
     */
    CompletableFuture<CreateUserPublicKeyResponse> createUserPublicKey(CreateUserPublicKeyRequest request);

    /**
     * @param request the request parameters of DeleteDatabase  DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     */
    CompletableFuture<DeleteDatabaseResponse> deleteDatabase(DeleteDatabaseRequest request);

    /**
     * @param request the request parameters of DeleteDatabaseAccount  DeleteDatabaseAccountRequest
     * @return DeleteDatabaseAccountResponse
     */
    CompletableFuture<DeleteDatabaseAccountResponse> deleteDatabaseAccount(DeleteDatabaseAccountRequest request);

    /**
     * @param request the request parameters of DeleteHost  DeleteHostRequest
     * @return DeleteHostResponse
     */
    CompletableFuture<DeleteHostResponse> deleteHost(DeleteHostRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>This interface is used to delete individual host accounts. If a host account is no longer in use, you can invoke this interface to delete the host account for that host that has been configured on the bastion.</p>
     * <blockquote>
     * <p> After you remove the host account, you must enter the username and password of the host when you log on to the host in Bastionhost.  </p>
     * </blockquote>
     * <h2>QPS Limit</h2>
     * <p>The single-user QPS limit of this interface is 10 times/second. If the limit is exceeded, the API call will be stream-limited, which may affect your business, please call reasonably.</p>
     * 
     * @param request the request parameters of DeleteHostAccount  DeleteHostAccountRequest
     * @return DeleteHostAccountResponse
     */
    CompletableFuture<DeleteHostAccountResponse> deleteHostAccount(DeleteHostAccountRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete a single host group. If you no longer need to perform O\&amp;M operations on all hosts in a host group, you can call this operation to delete the host group.</p>
     * <h3>Limits</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteHostGroup  DeleteHostGroupRequest
     * @return DeleteHostGroupResponse
     */
    CompletableFuture<DeleteHostGroupResponse> deleteHostGroup(DeleteHostGroupRequest request);

    /**
     * @param request the request parameters of DeleteHostShareKey  DeleteHostShareKeyRequest
     * @return DeleteHostShareKeyResponse
     */
    CompletableFuture<DeleteHostShareKeyResponse> deleteHostShareKey(DeleteHostShareKeyRequest request);

    /**
     * @param request the request parameters of DeleteNetworkDomain  DeleteNetworkDomainRequest
     * @return DeleteNetworkDomainResponse
     */
    CompletableFuture<DeleteNetworkDomainResponse> deleteNetworkDomain(DeleteNetworkDomainRequest request);

    /**
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * @param request the request parameters of DeleteRule  DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    /**
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * @param request the request parameters of DeleteUserGroup  DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     */
    CompletableFuture<DeleteUserGroupResponse> deleteUserGroup(DeleteUserGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the DeleteUserPublicKey operation to delete a public key from the specified user of a bastion host.</p>
     * 
     * @param request the request parameters of DeleteUserPublicKey  DeleteUserPublicKeyRequest
     * @return DeleteUserPublicKeyResponse
     */
    CompletableFuture<DeleteUserPublicKeyResponse> deleteUserPublicKey(DeleteUserPublicKeyRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of DescribeInstanceAttribute  DescribeInstanceAttributeRequest
     * @return DescribeInstanceAttributeResponse
     */
    CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DetachDatabaseAccountsFromUser  DetachDatabaseAccountsFromUserRequest
     * @return DetachDatabaseAccountsFromUserResponse
     */
    CompletableFuture<DetachDatabaseAccountsFromUserResponse> detachDatabaseAccountsFromUser(DetachDatabaseAccountsFromUserRequest request);

    /**
     * @param request the request parameters of DetachDatabaseAccountsFromUserGroup  DetachDatabaseAccountsFromUserGroupRequest
     * @return DetachDatabaseAccountsFromUserGroupResponse
     */
    CompletableFuture<DetachDatabaseAccountsFromUserGroupResponse> detachDatabaseAccountsFromUserGroup(DetachDatabaseAccountsFromUserGroupRequest request);

    /**
     * @param request the request parameters of DetachHostAccountsFromHostShareKey  DetachHostAccountsFromHostShareKeyRequest
     * @return DetachHostAccountsFromHostShareKeyResponse
     */
    CompletableFuture<DetachHostAccountsFromHostShareKeyResponse> detachHostAccountsFromHostShareKey(DetachHostAccountsFromHostShareKeyRequest request);

    /**
     * @param request the request parameters of DetachHostAccountsFromUser  DetachHostAccountsFromUserRequest
     * @return DetachHostAccountsFromUserResponse
     */
    CompletableFuture<DetachHostAccountsFromUserResponse> detachHostAccountsFromUser(DetachHostAccountsFromUserRequest request);

    /**
     * @param request the request parameters of DetachHostAccountsFromUserGroup  DetachHostAccountsFromUserGroupRequest
     * @return DetachHostAccountsFromUserGroupResponse
     */
    CompletableFuture<DetachHostAccountsFromUserGroupResponse> detachHostAccountsFromUserGroup(DetachHostAccountsFromUserGroupRequest request);

    /**
     * @param request the request parameters of DetachHostGroupAccountsFromUser  DetachHostGroupAccountsFromUserRequest
     * @return DetachHostGroupAccountsFromUserResponse
     */
    CompletableFuture<DetachHostGroupAccountsFromUserResponse> detachHostGroupAccountsFromUser(DetachHostGroupAccountsFromUserRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of DetachHostGroupAccountsFromUserGroup  DetachHostGroupAccountsFromUserGroupRequest
     * @return DetachHostGroupAccountsFromUserGroupResponse
     */
    CompletableFuture<DetachHostGroupAccountsFromUserGroupResponse> detachHostGroupAccountsFromUserGroup(DetachHostGroupAccountsFromUserGroupRequest request);

    /**
     * @param request the request parameters of DisableInstancePublicAccess  DisableInstancePublicAccessRequest
     * @return DisableInstancePublicAccessResponse
     */
    CompletableFuture<DisableInstancePublicAccessResponse> disableInstancePublicAccess(DisableInstancePublicAccessRequest request);

    /**
     * @param request the request parameters of DisableRule  DisableRuleRequest
     * @return DisableRuleResponse
     */
    CompletableFuture<DisableRuleResponse> disableRule(DisableRuleRequest request);

    /**
     * @param request the request parameters of EnableInstancePublicAccess  EnableInstancePublicAccessRequest
     * @return EnableInstancePublicAccessResponse
     */
    CompletableFuture<EnableInstancePublicAccessResponse> enableInstancePublicAccess(EnableInstancePublicAccessRequest request);

    /**
     * @param request the request parameters of EnableRule  EnableRuleRequest
     * @return EnableRuleResponse
     */
    CompletableFuture<EnableRuleResponse> enableRule(EnableRuleRequest request);

    /**
     * @param request the request parameters of GenerateAssetOperationToken  GenerateAssetOperationTokenRequest
     * @return GenerateAssetOperationTokenResponse
     */
    CompletableFuture<GenerateAssetOperationTokenResponse> generateAssetOperationToken(GenerateAssetOperationTokenRequest request);

    /**
     * @param request the request parameters of GetDatabase  GetDatabaseRequest
     * @return GetDatabaseResponse
     */
    CompletableFuture<GetDatabaseResponse> getDatabase(GetDatabaseRequest request);

    /**
     * @param request the request parameters of GetDatabaseAccount  GetDatabaseAccountRequest
     * @return GetDatabaseAccountResponse
     */
    CompletableFuture<GetDatabaseAccountResponse> getDatabaseAccount(GetDatabaseAccountRequest request);

    /**
     * @param request the request parameters of GetExportConfigJob  GetExportConfigJobRequest
     * @return GetExportConfigJobResponse
     */
    CompletableFuture<GetExportConfigJobResponse> getExportConfigJob(GetExportConfigJobRequest request);

    /**
     * @param request the request parameters of GetHost  GetHostRequest
     * @return GetHostResponse
     */
    CompletableFuture<GetHostResponse> getHost(GetHostRequest request);

    /**
     * @param request the request parameters of GetHostAccount  GetHostAccountRequest
     * @return GetHostAccountResponse
     */
    CompletableFuture<GetHostAccountResponse> getHostAccount(GetHostAccountRequest request);

    /**
     * @param request the request parameters of GetHostGroup  GetHostGroupRequest
     * @return GetHostGroupResponse
     */
    CompletableFuture<GetHostGroupResponse> getHostGroup(GetHostGroupRequest request);

    /**
     * @param request the request parameters of GetHostShareKey  GetHostShareKeyRequest
     * @return GetHostShareKeyResponse
     */
    CompletableFuture<GetHostShareKeyResponse> getHostShareKey(GetHostShareKeyRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>You can call this operation to query the settings of AD authentication on a bastion host. After you configure AD authentication on a bastion host, you can import AD-authenticated users into the bastion host. After the AD-authenticated users are imported into the bastion host, the AD-authenticated users can log on to the bastion host to perform O\&amp;M operations on servers.</p>
     * <h3>Limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetInstanceADAuthServer  GetInstanceADAuthServerRequest
     * @return GetInstanceADAuthServerResponse
     */
    CompletableFuture<GetInstanceADAuthServerResponse> getInstanceADAuthServer(GetInstanceADAuthServerRequest request);

    /**
     * @param request the request parameters of GetInstanceLDAPAuthServer  GetInstanceLDAPAuthServerRequest
     * @return GetInstanceLDAPAuthServerResponse
     */
    CompletableFuture<GetInstanceLDAPAuthServerResponse> getInstanceLDAPAuthServer(GetInstanceLDAPAuthServerRequest request);

    /**
     * @param request the request parameters of GetInstanceStoreInfo  GetInstanceStoreInfoRequest
     * @return GetInstanceStoreInfoResponse
     */
    CompletableFuture<GetInstanceStoreInfoResponse> getInstanceStoreInfo(GetInstanceStoreInfoRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the settings of two-factor authentication on a bastion host. After you enable two-factor authentication, Bastionhost sends a verification code to a local user when the local user logs on to a bastion host. A local user can log on to the bastion host only when the local user enters the valid username and password and the verification code. This reduces the security risks caused by account information leaks.</p>
     * <h3>Limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetInstanceTwoFactor  GetInstanceTwoFactorRequest
     * @return GetInstanceTwoFactorResponse
     */
    CompletableFuture<GetInstanceTwoFactorResponse> getInstanceTwoFactor(GetInstanceTwoFactorRequest request);

    /**
     * @param request the request parameters of GetNetworkDomain  GetNetworkDomainRequest
     * @return GetNetworkDomainResponse
     */
    CompletableFuture<GetNetworkDomainResponse> getNetworkDomain(GetNetworkDomainRequest request);

    /**
     * @param request the request parameters of GetPolicy  GetPolicyRequest
     * @return GetPolicyResponse
     */
    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    /**
     * @param request the request parameters of GetPolicyAssetScope  GetPolicyAssetScopeRequest
     * @return GetPolicyAssetScopeResponse
     */
    CompletableFuture<GetPolicyAssetScopeResponse> getPolicyAssetScope(GetPolicyAssetScopeRequest request);

    /**
     * @param request the request parameters of GetPolicyUserScope  GetPolicyUserScopeRequest
     * @return GetPolicyUserScopeResponse
     */
    CompletableFuture<GetPolicyUserScopeResponse> getPolicyUserScope(GetPolicyUserScopeRequest request);

    /**
     * @param request the request parameters of GetRule  GetRuleRequest
     * @return GetRuleResponse
     */
    CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GetUserGroup  GetUserGroupRequest
     * @return GetUserGroupResponse
     */
    CompletableFuture<GetUserGroupResponse> getUserGroup(GetUserGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query commands to be reviewed by a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListApproveCommands  ListApproveCommandsRequest
     * @return ListApproveCommandsResponse
     */
    CompletableFuture<ListApproveCommandsResponse> listApproveCommands(ListApproveCommandsRequest request);

    /**
     * @param request the request parameters of ListDatabaseAccounts  ListDatabaseAccountsRequest
     * @return ListDatabaseAccountsResponse
     */
    CompletableFuture<ListDatabaseAccountsResponse> listDatabaseAccounts(ListDatabaseAccountsRequest request);

    /**
     * @param request the request parameters of ListDatabaseAccountsForUser  ListDatabaseAccountsForUserRequest
     * @return ListDatabaseAccountsForUserResponse
     */
    CompletableFuture<ListDatabaseAccountsForUserResponse> listDatabaseAccountsForUser(ListDatabaseAccountsForUserRequest request);

    /**
     * @param request the request parameters of ListDatabaseAccountsForUserGroup  ListDatabaseAccountsForUserGroupRequest
     * @return ListDatabaseAccountsForUserGroupResponse
     */
    CompletableFuture<ListDatabaseAccountsForUserGroupResponse> listDatabaseAccountsForUserGroup(ListDatabaseAccountsForUserGroupRequest request);

    /**
     * @param request the request parameters of ListDatabases  ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    CompletableFuture<ListDatabasesResponse> listDatabases(ListDatabasesRequest request);

    /**
     * @param request the request parameters of ListDatabasesForUser  ListDatabasesForUserRequest
     * @return ListDatabasesForUserResponse
     */
    CompletableFuture<ListDatabasesForUserResponse> listDatabasesForUser(ListDatabasesForUserRequest request);

    /**
     * @param request the request parameters of ListDatabasesForUserGroup  ListDatabasesForUserGroupRequest
     * @return ListDatabasesForUserGroupResponse
     */
    CompletableFuture<ListDatabasesForUserGroupResponse> listDatabasesForUserGroup(ListDatabasesForUserGroupRequest request);

    /**
     * @param request the request parameters of ListHostAccounts  ListHostAccountsRequest
     * @return ListHostAccountsResponse
     */
    CompletableFuture<ListHostAccountsResponse> listHostAccounts(ListHostAccountsRequest request);

    /**
     * @param request the request parameters of ListHostAccountsForHostShareKey  ListHostAccountsForHostShareKeyRequest
     * @return ListHostAccountsForHostShareKeyResponse
     */
    CompletableFuture<ListHostAccountsForHostShareKeyResponse> listHostAccountsForHostShareKey(ListHostAccountsForHostShareKeyRequest request);

    /**
     * @param request the request parameters of ListHostAccountsForUser  ListHostAccountsForUserRequest
     * @return ListHostAccountsForUserResponse
     */
    CompletableFuture<ListHostAccountsForUserResponse> listHostAccountsForUser(ListHostAccountsForUserRequest request);

    /**
     * @param request the request parameters of ListHostAccountsForUserGroup  ListHostAccountsForUserGroupRequest
     * @return ListHostAccountsForUserGroupResponse
     */
    CompletableFuture<ListHostAccountsForUserGroupResponse> listHostAccountsForUserGroup(ListHostAccountsForUserGroupRequest request);

    /**
     * @param request the request parameters of ListHostGroupAccountNamesForUser  ListHostGroupAccountNamesForUserRequest
     * @return ListHostGroupAccountNamesForUserResponse
     */
    CompletableFuture<ListHostGroupAccountNamesForUserResponse> listHostGroupAccountNamesForUser(ListHostGroupAccountNamesForUserRequest request);

    /**
     * @param request the request parameters of ListHostGroupAccountNamesForUserGroup  ListHostGroupAccountNamesForUserGroupRequest
     * @return ListHostGroupAccountNamesForUserGroupResponse
     */
    CompletableFuture<ListHostGroupAccountNamesForUserGroupResponse> listHostGroupAccountNamesForUserGroup(ListHostGroupAccountNamesForUserGroupRequest request);

    /**
     * @param request the request parameters of ListHostGroups  ListHostGroupsRequest
     * @return ListHostGroupsResponse
     */
    CompletableFuture<ListHostGroupsResponse> listHostGroups(ListHostGroupsRequest request);

    /**
     * @param request the request parameters of ListHostGroupsForUser  ListHostGroupsForUserRequest
     * @return ListHostGroupsForUserResponse
     */
    CompletableFuture<ListHostGroupsForUserResponse> listHostGroupsForUser(ListHostGroupsForUserRequest request);

    /**
     * @param request the request parameters of ListHostGroupsForUserGroup  ListHostGroupsForUserGroupRequest
     * @return ListHostGroupsForUserGroupResponse
     */
    CompletableFuture<ListHostGroupsForUserGroupResponse> listHostGroupsForUserGroup(ListHostGroupsForUserGroupRequest request);

    /**
     * @param request the request parameters of ListHostShareKeys  ListHostShareKeysRequest
     * @return ListHostShareKeysResponse
     */
    CompletableFuture<ListHostShareKeysResponse> listHostShareKeys(ListHostShareKeysRequest request);

    /**
     * @param request the request parameters of ListHosts  ListHostsRequest
     * @return ListHostsResponse
     */
    CompletableFuture<ListHostsResponse> listHosts(ListHostsRequest request);

    /**
     * @param request the request parameters of ListHostsForUser  ListHostsForUserRequest
     * @return ListHostsForUserResponse
     */
    CompletableFuture<ListHostsForUserResponse> listHostsForUser(ListHostsForUserRequest request);

    /**
     * @param request the request parameters of ListHostsForUserGroup  ListHostsForUserGroupRequest
     * @return ListHostsForUserGroupResponse
     */
    CompletableFuture<ListHostsForUserGroupResponse> listHostsForUserGroup(ListHostsForUserGroupRequest request);

    /**
     * @param request the request parameters of ListNetworkDomains  ListNetworkDomainsRequest
     * @return ListNetworkDomainsResponse
     */
    CompletableFuture<ListNetworkDomainsResponse> listNetworkDomains(ListNetworkDomainsRequest request);

    /**
     * @param request the request parameters of ListOperationDatabaseAccounts  ListOperationDatabaseAccountsRequest
     * @return ListOperationDatabaseAccountsResponse
     */
    CompletableFuture<ListOperationDatabaseAccountsResponse> listOperationDatabaseAccounts(ListOperationDatabaseAccountsRequest request);

    /**
     * @param request the request parameters of ListOperationDatabases  ListOperationDatabasesRequest
     * @return ListOperationDatabasesResponse
     */
    CompletableFuture<ListOperationDatabasesResponse> listOperationDatabases(ListOperationDatabasesRequest request);

    /**
     * @param request the request parameters of ListOperationHostAccounts  ListOperationHostAccountsRequest
     * @return ListOperationHostAccountsResponse
     */
    CompletableFuture<ListOperationHostAccountsResponse> listOperationHostAccounts(ListOperationHostAccountsRequest request);

    /**
     * @param request the request parameters of ListOperationHosts  ListOperationHostsRequest
     * @return ListOperationHostsResponse
     */
    CompletableFuture<ListOperationHostsResponse> listOperationHosts(ListOperationHostsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the O\&amp;M applications to be reviewed by a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListOperationTickets  ListOperationTicketsRequest
     * @return ListOperationTicketsResponse
     */
    CompletableFuture<ListOperationTicketsResponse> listOperationTickets(ListOperationTicketsRequest request);

    /**
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    /**
     * @param request the request parameters of ListRules  ListRulesRequest
     * @return ListRulesResponse
     */
    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListUserGroups  ListUserGroupsRequest
     * @return ListUserGroupsResponse
     */
    CompletableFuture<ListUserGroupsResponse> listUserGroups(ListUserGroupsRequest request);

    /**
     * @param request the request parameters of ListUserPublicKeys  ListUserPublicKeysRequest
     * @return ListUserPublicKeysResponse
     */
    CompletableFuture<ListUserPublicKeysResponse> listUserPublicKeys(ListUserPublicKeysRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * <b>description</b> :
     * <h1>Description</h1>
     * <p>You can call this operation to lock one or more users of a bastion host. If a user does not need to use a bastion host to perform O\&amp;M operations within a specific period of time, you can lock the user. The locked user can no longer log on to or perform O\&amp;M operations on the hosts on which the user is granted permissions. If you want to unlock the user later, you can call the <a href="https://help.aliyun.com/document_detail/204590.html">UnlockUsers</a> operation.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of LockUsers  LockUsersRequest
     * @return LockUsersResponse
     */
    CompletableFuture<LockUsersResponse> lockUsers(LockUsersRequest request);

    /**
     * @param request the request parameters of ModifyDatabase  ModifyDatabaseRequest
     * @return ModifyDatabaseResponse
     */
    CompletableFuture<ModifyDatabaseResponse> modifyDatabase(ModifyDatabaseRequest request);

    /**
     * @param request the request parameters of ModifyDatabaseAccount  ModifyDatabaseAccountRequest
     * @return ModifyDatabaseAccountResponse
     */
    CompletableFuture<ModifyDatabaseAccountResponse> modifyDatabaseAccount(ModifyDatabaseAccountRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the ModifyHost operation to modify the basic information about a host in a data center, an Elastic Compute Service (ECS) instance, or a host in an ApsaraDB MyBase dedicated cluster.</p>
     * <blockquote>
     * <p>The basic information about ECS instances and hosts in ApsaraDB MyBase dedicated clusters within your Alibaba Cloud account is synchronized to Bastionhost on a regular basis. After you modify the basic information about an ECS instance or a host in an ApsaraDB MyBase dedicated cluster, the modification result may be overwritten by the synchronized information.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyHost  ModifyHostRequest
     * @return ModifyHostResponse
     */
    CompletableFuture<ModifyHostResponse> modifyHost(ModifyHostRequest request);

    /**
     * @param request the request parameters of ModifyHostAccount  ModifyHostAccountRequest
     * @return ModifyHostAccountResponse
     */
    CompletableFuture<ModifyHostAccountResponse> modifyHostAccount(ModifyHostAccountRequest request);

    /**
     * @param request the request parameters of ModifyHostGroup  ModifyHostGroupRequest
     * @return ModifyHostGroupResponse
     */
    CompletableFuture<ModifyHostGroupResponse> modifyHostGroup(ModifyHostGroupRequest request);

    /**
     * @param request the request parameters of ModifyHostShareKey  ModifyHostShareKeyRequest
     * @return ModifyHostShareKeyResponse
     */
    CompletableFuture<ModifyHostShareKeyResponse> modifyHostShareKey(ModifyHostShareKeyRequest request);

    /**
     * @param request the request parameters of ModifyHostsActiveAddressType  ModifyHostsActiveAddressTypeRequest
     * @return ModifyHostsActiveAddressTypeResponse
     */
    CompletableFuture<ModifyHostsActiveAddressTypeResponse> modifyHostsActiveAddressType(ModifyHostsActiveAddressTypeRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>You can call this operation to change the port for the O&amp;M protocol on one or more hosts. If the standard port for the O&amp;M protocol on your host is vulnerable to attacks, you can call this operation to specify a custom port. For example, the standard port for SSH is port 22.  </p>
     * <blockquote>
     * <p> Ports 0 to 1024 are reserved for Bastionhost. Do not change the port for the O&amp;M protocol to a reserved port.  </p>
     * </blockquote>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ModifyHostsPort  ModifyHostsPortRequest
     * @return ModifyHostsPortResponse
     */
    CompletableFuture<ModifyHostsPortResponse> modifyHostsPort(ModifyHostsPortRequest request);

    /**
     * @param request the request parameters of ModifyInstanceADAuthServer  ModifyInstanceADAuthServerRequest
     * @return ModifyInstanceADAuthServerResponse
     */
    CompletableFuture<ModifyInstanceADAuthServerResponse> modifyInstanceADAuthServer(ModifyInstanceADAuthServerRequest request);

    /**
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
     * @param request the request parameters of ModifyInstanceLDAPAuthServer  ModifyInstanceLDAPAuthServerRequest
     * @return ModifyInstanceLDAPAuthServerResponse
     */
    CompletableFuture<ModifyInstanceLDAPAuthServerResponse> modifyInstanceLDAPAuthServer(ModifyInstanceLDAPAuthServerRequest request);

    /**
     * @param request the request parameters of ModifyInstanceTwoFactor  ModifyInstanceTwoFactorRequest
     * @return ModifyInstanceTwoFactorResponse
     */
    CompletableFuture<ModifyInstanceTwoFactorResponse> modifyInstanceTwoFactor(ModifyInstanceTwoFactorRequest request);

    /**
     * @param request the request parameters of ModifyNetworkDomain  ModifyNetworkDomainRequest
     * @return ModifyNetworkDomainResponse
     */
    CompletableFuture<ModifyNetworkDomainResponse> modifyNetworkDomain(ModifyNetworkDomainRequest request);

    /**
     * @param request the request parameters of ModifyPolicy  ModifyPolicyRequest
     * @return ModifyPolicyResponse
     */
    CompletableFuture<ModifyPolicyResponse> modifyPolicy(ModifyPolicyRequest request);

    /**
     * @param request the request parameters of ModifyRule  ModifyRuleRequest
     * @return ModifyRuleResponse
     */
    CompletableFuture<ModifyRuleResponse> modifyRule(ModifyRuleRequest request);

    /**
     * @param request the request parameters of ModifyUser  ModifyUserRequest
     * @return ModifyUserResponse
     */
    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    /**
     * @param request the request parameters of ModifyUserGroup  ModifyUserGroupRequest
     * @return ModifyUserGroupResponse
     */
    CompletableFuture<ModifyUserGroupResponse> modifyUserGroup(ModifyUserGroupRequest request);

    /**
     * @param request the request parameters of ModifyUserPublicKey  ModifyUserPublicKeyRequest
     * @return ModifyUserPublicKeyResponse
     */
    CompletableFuture<ModifyUserPublicKeyResponse> modifyUserPublicKey(ModifyUserPublicKeyRequest request);

    /**
     * @param request the request parameters of MoveDatabasesToNetworkDomain  MoveDatabasesToNetworkDomainRequest
     * @return MoveDatabasesToNetworkDomainResponse
     */
    CompletableFuture<MoveDatabasesToNetworkDomainResponse> moveDatabasesToNetworkDomain(MoveDatabasesToNetworkDomainRequest request);

    /**
     * @param request the request parameters of MoveHostsToNetworkDomain  MoveHostsToNetworkDomainRequest
     * @return MoveHostsToNetworkDomainResponse
     */
    CompletableFuture<MoveHostsToNetworkDomainResponse> moveHostsToNetworkDomain(MoveHostsToNetworkDomainRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation as a Bastionhost administrator to reject the request to run a command of an O\&amp;M engineer.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of RejectApproveCommand  RejectApproveCommandRequest
     * @return RejectApproveCommandResponse
     */
    CompletableFuture<RejectApproveCommandResponse> rejectApproveCommand(RejectApproveCommandRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to reject an O\&amp;M application of an O\&amp;M engineer as a Bastionhost administrator.
     * You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of RejectOperationTicket  RejectOperationTicketRequest
     * @return RejectOperationTicketResponse
     */
    CompletableFuture<RejectOperationTicketResponse> rejectOperationTicket(RejectOperationTicketRequest request);

    /**
     * @param request the request parameters of RemoveDatabasesFromGroup  RemoveDatabasesFromGroupRequest
     * @return RemoveDatabasesFromGroupResponse
     */
    CompletableFuture<RemoveDatabasesFromGroupResponse> removeDatabasesFromGroup(RemoveDatabasesFromGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the RemoveHostsFromGroup operation to remove multiple hosts from an asset group at a time. If you no longer need to manage some hosts in an asset group, you can call this operation to remove the hosts from the asset group.</p>
     * <h1><a href="#qps-"></a>QPS limit</h1>
     * <p>You can call this API operation up to 10 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * @param request the request parameters of RemoveHostsFromGroup  RemoveHostsFromGroupRequest
     * @return RemoveHostsFromGroupResponse
     */
    CompletableFuture<RemoveHostsFromGroupResponse> removeHostsFromGroup(RemoveHostsFromGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove one or more users from a user group. When users in a user group are transferred to a new position, resign, or are switched to another user group, you can call this operation to remove the users from the current user group at a time.  </p>
     * <h2>QPS limit</h2>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of RemoveUsersFromGroup  RemoveUsersFromGroupRequest
     * @return RemoveUsersFromGroupResponse
     */
    CompletableFuture<RemoveUsersFromGroupResponse> removeUsersFromGroup(RemoveUsersFromGroupRequest request);

    /**
     * @param request the request parameters of RenewAssetOperationToken  RenewAssetOperationTokenRequest
     * @return RenewAssetOperationTokenResponse
     */
    CompletableFuture<RenewAssetOperationTokenResponse> renewAssetOperationToken(RenewAssetOperationTokenRequest request);

    /**
     * @param request the request parameters of ResetHostAccountCredential  ResetHostAccountCredentialRequest
     * @return ResetHostAccountCredentialResponse
     */
    CompletableFuture<ResetHostAccountCredentialResponse> resetHostAccountCredential(ResetHostAccountCredentialRequest request);

    /**
     * @param request the request parameters of SetPolicyAccessTimeRangeConfig  SetPolicyAccessTimeRangeConfigRequest
     * @return SetPolicyAccessTimeRangeConfigResponse
     */
    CompletableFuture<SetPolicyAccessTimeRangeConfigResponse> setPolicyAccessTimeRangeConfig(SetPolicyAccessTimeRangeConfigRequest request);

    /**
     * @param request the request parameters of SetPolicyApprovalConfig  SetPolicyApprovalConfigRequest
     * @return SetPolicyApprovalConfigResponse
     */
    CompletableFuture<SetPolicyApprovalConfigResponse> setPolicyApprovalConfig(SetPolicyApprovalConfigRequest request);

    /**
     * @param request the request parameters of SetPolicyAssetScope  SetPolicyAssetScopeRequest
     * @return SetPolicyAssetScopeResponse
     */
    CompletableFuture<SetPolicyAssetScopeResponse> setPolicyAssetScope(SetPolicyAssetScopeRequest request);

    /**
     * @param request the request parameters of SetPolicyCommandConfig  SetPolicyCommandConfigRequest
     * @return SetPolicyCommandConfigResponse
     */
    CompletableFuture<SetPolicyCommandConfigResponse> setPolicyCommandConfig(SetPolicyCommandConfigRequest request);

    /**
     * @param request the request parameters of SetPolicyIPAclConfig  SetPolicyIPAclConfigRequest
     * @return SetPolicyIPAclConfigResponse
     */
    CompletableFuture<SetPolicyIPAclConfigResponse> setPolicyIPAclConfig(SetPolicyIPAclConfigRequest request);

    /**
     * @param request the request parameters of SetPolicyProtocolConfig  SetPolicyProtocolConfigRequest
     * @return SetPolicyProtocolConfigResponse
     */
    CompletableFuture<SetPolicyProtocolConfigResponse> setPolicyProtocolConfig(SetPolicyProtocolConfigRequest request);

    /**
     * @param request the request parameters of SetPolicyUserScope  SetPolicyUserScopeRequest
     * @return SetPolicyUserScopeResponse
     */
    CompletableFuture<SetPolicyUserScopeResponse> setPolicyUserScope(SetPolicyUserScopeRequest request);

    /**
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/204591.html">LockUsers</a> operation to lock one or more users of a bastion host, you can call this operation to unlock the users. After the users are unlocked, the users can perform O\&amp;M operations by using the bastion host.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UnlockUsers  UnlockUsersRequest
     * @return UnlockUsersResponse
     */
    CompletableFuture<UnlockUsersResponse> unlockUsers(UnlockUsersRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of VerifyInstanceADAuthServer  VerifyInstanceADAuthServerRequest
     * @return VerifyInstanceADAuthServerResponse
     */
    CompletableFuture<VerifyInstanceADAuthServerResponse> verifyInstanceADAuthServer(VerifyInstanceADAuthServerRequest request);

    /**
     * @param request the request parameters of VerifyInstanceLDAPAuthServer  VerifyInstanceLDAPAuthServerRequest
     * @return VerifyInstanceLDAPAuthServerResponse
     */
    CompletableFuture<VerifyInstanceLDAPAuthServerResponse> verifyInstanceLDAPAuthServer(VerifyInstanceLDAPAuthServerRequest request);

}
