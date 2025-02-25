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
     * <b>description</b> :
     * <p>Before you call the operation, you can call the <a href="https://help.aliyun.com/document_detail/410890.html">ListProperty</a> operation to query the existing user properties and their IDs (PropertyId) and values (PropertyValueId).</p>
     * 
     * @param request the request parameters of CheckUsedPropertyValue  CheckUsedPropertyValueRequest
     * @return CheckUsedPropertyValueResponse
     */
    CompletableFuture<CheckUsedPropertyValueResponse> checkUsedPropertyValue(CheckUsedPropertyValueRequest request);

    /**
     * @param request the request parameters of CreateProperty  CreatePropertyRequest
     * @return CreatePropertyResponse
     */
    CompletableFuture<CreatePropertyResponse> createProperty(CreatePropertyRequest request);

    /**
     * <b>description</b> :
     * <p>Convenience users are dedicated Elastic Desktop Service (EDS) user accounts and are suitable for scenarios in which you do not need to connect to enterprise Active Directory (AD) systems. The information about a convenience user includes the username, email address, and mobile number. You must specify the username or email address.</p>
     * 
     * @param request the request parameters of CreateUsers  CreateUsersRequest
     * @return CreateUsersResponse
     */
    CompletableFuture<CreateUsersResponse> createUsers(CreateUsersRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you can call the FilterUsers operation to query the users that are associated with user properties.</p>
     * 
     * @param request the request parameters of DeleteUserPropertyValue  DeleteUserPropertyValueRequest
     * @return DeleteUserPropertyValueResponse
     */
    CompletableFuture<DeleteUserPropertyValueResponse> deleteUserPropertyValue(DeleteUserPropertyValueRequest request);

    /**
     * @param request the request parameters of DescribeMfaDevices  DescribeMfaDevicesRequest
     * @return DescribeMfaDevicesResponse
     */
    CompletableFuture<DescribeMfaDevicesResponse> describeMfaDevices(DescribeMfaDevicesRequest request);

    /**
     * <b>description</b> :
     * <p>An organization is in a tree structure. The root organization ID is in the following format: org-aliyun-wy-org-id.</p>
     * 
     * @param request the request parameters of DescribeOrgs  DescribeOrgsRequest
     * @return DescribeOrgsResponse
     */
    CompletableFuture<DescribeOrgsResponse> describeOrgs(DescribeOrgsRequest request);

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
     * @param request the request parameters of GetManagerInfoByAuthCode  GetManagerInfoByAuthCodeRequest
     * @return GetManagerInfoByAuthCodeResponse
     */
    CompletableFuture<GetManagerInfoByAuthCodeResponse> getManagerInfoByAuthCode(GetManagerInfoByAuthCodeRequest request);

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
     * <p>After a virtual MFA device is locked, the status of the virtual MFA device changes to LOCKED. The convenience user to which the MFA device is bound cannot log on to the cloud desktop that resides in the workspace with the MFA feature enabled because the identity of the convenience user cannot be verified based on the virtual MFA device. You can call the <a href="https://help.aliyun.com/document_detail/286534.html">UnlockMfaDevice</a> operation to unlock the virtual MFA device.</p>
     * 
     * @param request the request parameters of LockMfaDevice  LockMfaDeviceRequest
     * @return LockMfaDeviceResponse
     */
    CompletableFuture<LockMfaDeviceResponse> lockMfaDevice(LockMfaDeviceRequest request);

    /**
     * @param request the request parameters of LockUsers  LockUsersRequest
     * @return LockUsersResponse
     */
    CompletableFuture<LockUsersResponse> lockUsers(LockUsersRequest request);

    /**
     * @param request the request parameters of ModifyUser  ModifyUserRequest
     * @return ModifyUserResponse
     */
    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    /**
     * @param request the request parameters of QuerySyncStatusByAliUid  QuerySyncStatusByAliUidRequest
     * @return QuerySyncStatusByAliUidResponse
     */
    CompletableFuture<QuerySyncStatusByAliUidResponse> querySyncStatusByAliUid(QuerySyncStatusByAliUidRequest request);

    /**
     * <b>description</b> :
     * <p>If you remove a virtual MFA device that is bound to a convenience user, the convenience user can no longer use the virtual MFA device to log on to cloud desktops. Before the convenience user can log on to cloud desktops again, a new virtual MFA device must be bound to the convenience user.</p>
     * 
     * @param request the request parameters of RemoveMfaDevice  RemoveMfaDeviceRequest
     * @return RemoveMfaDeviceResponse
     */
    CompletableFuture<RemoveMfaDeviceResponse> removeMfaDevice(RemoveMfaDeviceRequest request);

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
     * @param request the request parameters of UnlockMfaDevice  UnlockMfaDeviceRequest
     * @return UnlockMfaDeviceResponse
     */
    CompletableFuture<UnlockMfaDeviceResponse> unlockMfaDevice(UnlockMfaDeviceRequest request);

    /**
     * @param request the request parameters of UnlockUsers  UnlockUsersRequest
     * @return UnlockUsersResponse
     */
    CompletableFuture<UnlockUsersResponse> unlockUsers(UnlockUsersRequest request);

    /**
     * @param request the request parameters of UpdateProperty  UpdatePropertyRequest
     * @return UpdatePropertyResponse
     */
    CompletableFuture<UpdatePropertyResponse> updateProperty(UpdatePropertyRequest request);

}
