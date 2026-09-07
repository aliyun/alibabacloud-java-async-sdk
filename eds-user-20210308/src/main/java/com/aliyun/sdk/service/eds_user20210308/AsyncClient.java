// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eds_user20210308.models.*;
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
     * <p>A convenience account with local administrator permissions can install software or modify certain system settings on the cloud computer.</p>
     * 
     * @param request the request parameters of BatchSetDesktopManager  BatchSetDesktopManagerRequest
     * @return BatchSetDesktopManagerResponse
     */
    CompletableFuture<BatchSetDesktopManagerResponse> batchSetDesktopManager(BatchSetDesktopManagerRequest request);

    /**
     * @param request the request parameters of ChangeUserPassword  ChangeUserPasswordRequest
     * @return ChangeUserPasswordResponse
     */
    CompletableFuture<ChangeUserPasswordResponse> changeUserPassword(ChangeUserPasswordRequest request);

    /**
     * @param request the request parameters of CheckUsedProperty  CheckUsedPropertyRequest
     * @return CheckUsedPropertyResponse
     */
    CompletableFuture<CheckUsedPropertyResponse> checkUsedProperty(CheckUsedPropertyRequest request);

    /**
     * @param request the request parameters of CheckUsedPropertyValue  CheckUsedPropertyValueRequest
     * @return CheckUsedPropertyValueResponse
     */
    CompletableFuture<CheckUsedPropertyValueResponse> checkUsedPropertyValue(CheckUsedPropertyValueRequest request);

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * @param request the request parameters of CreateOrg  CreateOrgRequest
     * @return CreateOrgResponse
     */
    CompletableFuture<CreateOrgResponse> createOrg(CreateOrgRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create up to 10 different properties under one Alibaba Cloud account. Each property includes a property name (PropertyKey) and multiple attribute values (PropertyValue).  </li>
     * <li>You can add up to 50 different attribute values to a single property.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateProperty  CreatePropertyRequest
     * @return CreatePropertyResponse
     */
    CompletableFuture<CreatePropertyResponse> createProperty(CreatePropertyRequest request);

    /**
     * @param request the request parameters of CreateResourceGroup  CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * A convenience account is a dedicated account system in Wuying Workspace for simple use cases that do not require enterprise AD integration. Accounts require a username, and either an email or a phone number.
     * &lt;props=&quot;intl&quot;&gt;
     * A convenience account is a dedicated account system in Wuying Workspace for simple use cases that do not require enterprise AD integration. Accounts require both a username and an email.</p>
     * 
     * @param request the request parameters of CreateUsers  CreateUsersRequest
     * @return CreateUsersResponse
     */
    CompletableFuture<CreateUsersResponse> createUsers(CreateUsersRequest request);

    /**
     * @param request the request parameters of DeleteResourceGroup  DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request);

    /**
     * @param request the request parameters of DeleteUserPropertyValue  DeleteUserPropertyValueRequest
     * @return DeleteUserPropertyValueResponse
     */
    CompletableFuture<DeleteUserPropertyValueResponse> deleteUserPropertyValue(DeleteUserPropertyValueRequest request);

    /**
     * @param request the request parameters of DescribeGroupUser  DescribeGroupUserRequest
     * @return DescribeGroupUserResponse
     */
    CompletableFuture<DescribeGroupUserResponse> describeGroupUser(DescribeGroupUserRequest request);

    /**
     * @param request the request parameters of DescribeGroups  DescribeGroupsRequest
     * @return DescribeGroupsResponse
     */
    CompletableFuture<DescribeGroupsResponse> describeGroups(DescribeGroupsRequest request);

    /**
     * @param request the request parameters of DescribeMfaDevices  DescribeMfaDevicesRequest
     * @return DescribeMfaDevicesResponse
     */
    CompletableFuture<DescribeMfaDevicesResponse> describeMfaDevices(DescribeMfaDevicesRequest request);

    /**
     * @param request the request parameters of DescribeOrgByLayer  DescribeOrgByLayerRequest
     * @return DescribeOrgByLayerResponse
     */
    CompletableFuture<DescribeOrgByLayerResponse> describeOrgByLayer(DescribeOrgByLayerRequest request);

    /**
     * <b>description</b> :
     * <p>Organizations have a tree structure. The root organization ID is org-aliyun-wy-org-id.</p>
     * 
     * @param request the request parameters of DescribeOrgs  DescribeOrgsRequest
     * @return DescribeOrgsResponse
     */
    CompletableFuture<DescribeOrgsResponse> describeOrgs(DescribeOrgsRequest request);

    /**
     * @param request the request parameters of DescribeResourceGroups  DescribeResourceGroupsRequest
     * @return DescribeResourceGroupsResponse
     */
    CompletableFuture<DescribeResourceGroupsResponse> describeResourceGroups(DescribeResourceGroupsRequest request);

    /**
     * @param request the request parameters of DescribeUser  DescribeUserRequest
     * @return DescribeUserResponse
     */
    CompletableFuture<DescribeUserResponse> describeUser(DescribeUserRequest request);

    /**
     * @param request the request parameters of DescribeUsers  DescribeUsersRequest
     * @return DescribeUsersResponse
     */
    CompletableFuture<DescribeUsersResponse> describeUsers(DescribeUsersRequest request);

    /**
     * @param request the request parameters of FilterUsers  FilterUsersRequest
     * @return FilterUsersResponse
     */
    CompletableFuture<FilterUsersResponse> filterUsers(FilterUsersRequest request);

    /**
     * <b>description</b> :
     * <p>出于安全考虑，您可以锁定便捷账号。被锁定的便捷用户无法登录无影终端，因此也无法访问任何无影云资源。</p>
     * <blockquote>
     * <p>您可以调用<a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a>查询便捷账号信息。若返回数据中<code>Status</code>取值为0，表示该便捷账号未被锁定；若<code>Status</code>取值为9，表示该便捷账号已被锁定。</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetAdUsersCount  GetAdUsersCountRequest
     * @return GetAdUsersCountResponse
     */
    CompletableFuture<GetAdUsersCountResponse> getAdUsersCount(GetAdUsersCountRequest request);

    /**
     * @param request the request parameters of GetManagerInfoByAuthCode  GetManagerInfoByAuthCodeRequest
     * @return GetManagerInfoByAuthCodeResponse
     */
    CompletableFuture<GetManagerInfoByAuthCodeResponse> getManagerInfoByAuthCode(GetManagerInfoByAuthCodeRequest request);

    /**
     * <b>description</b> :
     * <p>出于安全考虑，您可以锁定便捷账号。被锁定的便捷用户无法登录无影终端，因此也无法访问任何无影云资源。</p>
     * <blockquote>
     * <p>您可以调用<a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a>查询便捷账号信息。若返回数据中<code>Status</code>取值为0，表示该便捷账号未被锁定；若<code>Status</code>取值为9，表示该便捷账号已被锁定。</p>
     * </blockquote>
     * 
     * @param request the request parameters of GetUsersCount  GetUsersCountRequest
     * @return GetUsersCountResponse
     */
    CompletableFuture<GetUsersCountResponse> getUsersCount(GetUsersCountRequest request);

    /**
     * @param request the request parameters of InitTenantAlias  InitTenantAliasRequest
     * @return InitTenantAliasResponse
     */
    CompletableFuture<InitTenantAliasResponse> initTenantAlias(InitTenantAliasRequest request);

    /**
     * @param request the request parameters of ListProperty  ListPropertyRequest
     * @return ListPropertyResponse
     */
    CompletableFuture<ListPropertyResponse> listProperty(ListPropertyRequest request);

    /**
     * @param request the request parameters of ListPropertyValue  ListPropertyValueRequest
     * @return ListPropertyValueResponse
     */
    CompletableFuture<ListPropertyValueResponse> listPropertyValue(ListPropertyValueRequest request);

    /**
     * <b>description</b> :
     * <p>After locking, the status of the virtual MFA device changes to LOCKED. When the associated convenience account attempts to log on to a WUYING Terminal through an office network with MFA enabled, authentication will fail due to the locked MFA device, preventing successful logon. You can invoke <a href="~~UnlockMfaDevice~~">UnlockMfaDevice</a> to unlock it.</p>
     * 
     * @param request the request parameters of LockMfaDevice  LockMfaDeviceRequest
     * @return LockMfaDeviceResponse
     */
    CompletableFuture<LockMfaDeviceResponse> lockMfaDevice(LockMfaDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>For security purposes, you can lock convenience accounts. Locked convenience users cannot sign in to Wuying clients, and therefore cannot access any Wuying cloud resources.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a> operation to check the lock status of convenience accounts. The <code>Status</code> value in the response is 0 for unlocked accounts and 9 for locked accounts.</p>
     * </blockquote>
     * 
     * @param request the request parameters of LockUsers  LockUsersRequest
     * @return LockUsersResponse
     */
    CompletableFuture<LockUsersResponse> lockUsers(LockUsersRequest request);

    /**
     * @param request the request parameters of ModifyGroup  ModifyGroupRequest
     * @return ModifyGroupResponse
     */
    CompletableFuture<ModifyGroupResponse> modifyGroup(ModifyGroupRequest request);

    /**
     * @param request the request parameters of ModifyOrg  ModifyOrgRequest
     * @return ModifyOrgResponse
     */
    CompletableFuture<ModifyOrgResponse> modifyOrg(ModifyOrgRequest request);

    /**
     * @param request the request parameters of ModifyUser  ModifyUserRequest
     * @return ModifyUserResponse
     */
    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    /**
     * @param request the request parameters of MoveOrg  MoveOrgRequest
     * @return MoveOrgResponse
     */
    CompletableFuture<MoveOrgResponse> moveOrg(MoveOrgRequest request);

    /**
     * @param request the request parameters of MoveUserOrg  MoveUserOrgRequest
     * @return MoveUserOrgResponse
     */
    CompletableFuture<MoveUserOrgResponse> moveUserOrg(MoveUserOrgRequest request);

    /**
     * @param request the request parameters of QuerySyncStatusByAliUid  QuerySyncStatusByAliUidRequest
     * @return QuerySyncStatusByAliUidResponse
     */
    CompletableFuture<QuerySyncStatusByAliUidResponse> querySyncStatusByAliUid(QuerySyncStatusByAliUidRequest request);

    /**
     * @param request the request parameters of RemoveGroup  RemoveGroupRequest
     * @return RemoveGroupResponse
     */
    CompletableFuture<RemoveGroupResponse> removeGroup(RemoveGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Deleting the virtual MFA device attached to a convenience account unbinds the MFA device, which is equivalent to resetting or disabling it. The corresponding convenience account must reattach a new virtual MFA device when logging on to a WUYING Terminal.</p>
     * 
     * @param request the request parameters of RemoveMfaDevice  RemoveMfaDeviceRequest
     * @return RemoveMfaDeviceResponse
     */
    CompletableFuture<RemoveMfaDeviceResponse> removeMfaDevice(RemoveMfaDeviceRequest request);

    /**
     * @param request the request parameters of RemoveOrg  RemoveOrgRequest
     * @return RemoveOrgResponse
     */
    CompletableFuture<RemoveOrgResponse> removeOrg(RemoveOrgRequest request);

    /**
     * @param request the request parameters of RemoveProperty  RemovePropertyRequest
     * @return RemovePropertyResponse
     */
    CompletableFuture<RemovePropertyResponse> removeProperty(RemovePropertyRequest request);

    /**
     * @param request the request parameters of RemoveUsers  RemoveUsersRequest
     * @return RemoveUsersResponse
     */
    CompletableFuture<RemoveUsersResponse> removeUsers(RemoveUsersRequest request);

    /**
     * @param request the request parameters of ResetUserPassword  ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request);

    /**
     * @param request the request parameters of SetUserPropertyValue  SetUserPropertyValueRequest
     * @return SetUserPropertyValueResponse
     */
    CompletableFuture<SetUserPropertyValueResponse> setUserPropertyValue(SetUserPropertyValueRequest request);

    /**
     * @param request the request parameters of SyncAllEduInfo  SyncAllEduInfoRequest
     * @return SyncAllEduInfoResponse
     */
    CompletableFuture<SyncAllEduInfoResponse> syncAllEduInfo(SyncAllEduInfoRequest request);

    /**
     * @param request the request parameters of TransferResourcesIntoGroup  TransferResourcesIntoGroupRequest
     * @return TransferResourcesIntoGroupResponse
     */
    CompletableFuture<TransferResourcesIntoGroupResponse> transferResourcesIntoGroup(TransferResourcesIntoGroupRequest request);

    /**
     * @param request the request parameters of TransferResourcesOutofGroup  TransferResourcesOutofGroupRequest
     * @return TransferResourcesOutofGroupResponse
     */
    CompletableFuture<TransferResourcesOutofGroupResponse> transferResourcesOutofGroup(TransferResourcesOutofGroupRequest request);

    /**
     * @param request the request parameters of UnlockMfaDevice  UnlockMfaDeviceRequest
     * @return UnlockMfaDeviceResponse
     */
    CompletableFuture<UnlockMfaDeviceResponse> unlockMfaDevice(UnlockMfaDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>Locked convenience accounts cannot log on to WUYING Terminal and therefore cannot access any WUYING cloud resources. To allow a convenience account to log on to WUYING Terminal, you must first unlock it.  </p>
     * <blockquote>
     * <p>You can invoke <a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a> to query convenience account information. If the value of <code>Status</code> in the returned data is 0, the convenience account is not locked. If the value of <code>Status</code> is 9, the convenience account is locked.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UnlockUsers  UnlockUsersRequest
     * @return UnlockUsersResponse
     */
    CompletableFuture<UnlockUsersResponse> unlockUsers(UnlockUsersRequest request);

    /**
     * @param request the request parameters of UpdateProperty  UpdatePropertyRequest
     * @return UpdatePropertyResponse
     */
    CompletableFuture<UpdatePropertyResponse> updateProperty(UpdatePropertyRequest request);

    /**
     * @param request the request parameters of UserBatchJoinGroup  UserBatchJoinGroupRequest
     * @return UserBatchJoinGroupResponse
     */
    CompletableFuture<UserBatchJoinGroupResponse> userBatchJoinGroup(UserBatchJoinGroupRequest request);

    /**
     * @param request the request parameters of UserBatchQuitGroup  UserBatchQuitGroupRequest
     * @return UserBatchQuitGroupResponse
     */
    CompletableFuture<UserBatchQuitGroupResponse> userBatchQuitGroup(UserBatchQuitGroupRequest request);

}
