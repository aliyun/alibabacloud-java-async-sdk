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
     * <p>A convenience account with local administrator permissions can install software or modify specific system settings on the cloud desktop.</p>
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
     * <li>You can create up to 10 different properties under an Alibaba Cloud account. Each property includes a property key (PropertyKey) and multiple property values (PropertyValue).</li>
     * <li>You can add up to 50 different property values to a single property.</li>
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
     * <p>&lt;props=&quot;china&quot;&gt;A convenience account is an account system dedicated to Wuying Workspace, which is suitable for simple scenarios where you do not want to connect to an enterprise Active Directory (AD). The information of a convenience account includes the username, email address, and phone number. The username is required, and you must specify at least one of the email address and phone number.
     * &lt;props=&quot;intl&quot;&gt;A convenience account is an account system dedicated to Wuying Workspace, which is suitable for simple scenarios where you do not want to connect to an enterprise Active Directory (AD). The information of a convenience account includes the username and email address, both of which are required.</p>
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
     * <p>Organizations use a tree structure. The root organization ID is org-aliyun-wy-org-id.</p>
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
     * <p>For security purposes, you can lock convenience accounts. Locked convenience users cannot log on to Wuying terminals and therefore cannot access any Wuying cloud resources.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a> to query convenience account information. If the <code>Status</code> value in the returned data is 0, the convenience account is not locked. If the <code>Status</code> value is 9, the convenience account is locked.</p>
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
     * <p>For security purposes, you can lock convenience accounts. Locked convenience users cannot log on to Wuying terminals and therefore cannot access any Wuying cloud resources.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a> to query convenience account information. If the <code>Status</code> value in the returned data is 0, the convenience account is not locked. If the <code>Status</code> value is 9, the convenience account is locked.</p>
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
     * <p>After the device is locked, the status of the virtual MFA device changes to LOCKED. When the corresponding convenience account logs on to a Wuying terminal through an office network with MFA enabled, the logon fails because the MFA device cannot be authenticated. You can call <a href="~~UnlockMfaDevice~~">UnlockMfaDevice</a> to unlock the device.</p>
     * 
     * @param request the request parameters of LockMfaDevice  LockMfaDeviceRequest
     * @return LockMfaDeviceResponse
     */
    CompletableFuture<LockMfaDeviceResponse> lockMfaDevice(LockMfaDeviceRequest request);

    /**
     * <b>description</b> :
     * <p>For security purposes, you can lock convenience accounts. Locked convenience users cannot log on to cloud desktop terminals and therefore cannot access any cloud desktop resources.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a> to query convenience account information. If the <code>Status</code> value in the response is 0, the convenience account is not locked. If the <code>Status</code> value is 9, the convenience account is locked.</p>
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
     * <p>Deleting the virtual MFA device bound to a convenience user unbinds the MFA device, which is equivalent to resetting or disabling the MFA device. The convenience user must bind a new virtual MFA device when logging on to the Wuying terminal.</p>
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
     * <p>Locked convenience users cannot log on to Wuying terminals and therefore cannot access any Wuying cloud resources. To allow a convenience user to log on to a Wuying terminal, you must unlock the user first.</p>
     * <blockquote>
     * <p>You can call <a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a> to query the information of convenience users. If the <code>Status</code> parameter in the response is 0, the convenience user is not locked. If the <code>Status</code> parameter is 9, the convenience user is locked.</p>
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
