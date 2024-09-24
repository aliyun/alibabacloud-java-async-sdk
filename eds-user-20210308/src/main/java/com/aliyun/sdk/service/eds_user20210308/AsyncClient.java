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

    CompletableFuture<BatchSetDesktopManagerResponse> batchSetDesktopManager(BatchSetDesktopManagerRequest request);

    CompletableFuture<CheckUsedPropertyResponse> checkUsedProperty(CheckUsedPropertyRequest request);

    /**
      * Before you call the operation, you can call the [ListProperty](~~410890~~) operation to query the existing user properties and their IDs (PropertyId) and values (PropertyValueId).
      *
     */
    CompletableFuture<CheckUsedPropertyValueResponse> checkUsedPropertyValue(CheckUsedPropertyValueRequest request);

    CompletableFuture<CreatePropertyResponse> createProperty(CreatePropertyRequest request);

    /**
      * Convenience users are dedicated Elastic Desktop Service (EDS) user accounts and are suitable for scenarios in which you do not need to connect to enterprise Active Directory (AD) systems. The information about a convenience user includes the username, email address, and mobile number. You must specify the username or email address.
      *
     */
    CompletableFuture<CreateUsersResponse> createUsers(CreateUsersRequest request);

    /**
      * Before you call this operation, you can call the FilterUsers operation to query the users that are associated with user properties.
      *
     */
    CompletableFuture<DeleteUserPropertyValueResponse> deleteUserPropertyValue(DeleteUserPropertyValueRequest request);

    CompletableFuture<DescribeMfaDevicesResponse> describeMfaDevices(DescribeMfaDevicesRequest request);

    /**
      * An organization is in a tree structure. The root organization ID is in the following format: org-aliyun-wy-org-id.
      *
     */
    CompletableFuture<DescribeOrgsResponse> describeOrgs(DescribeOrgsRequest request);

    CompletableFuture<DescribeUsersResponse> describeUsers(DescribeUsersRequest request);

    CompletableFuture<FilterUsersResponse> filterUsers(FilterUsersRequest request);

    CompletableFuture<GetManagerInfoByAuthCodeResponse> getManagerInfoByAuthCode(GetManagerInfoByAuthCodeRequest request);

    CompletableFuture<ListPropertyResponse> listProperty(ListPropertyRequest request);

    CompletableFuture<ListPropertyValueResponse> listPropertyValue(ListPropertyValueRequest request);

    /**
      * After a virtual MFA device is locked, the status of the virtual MFA device changes to LOCKED. The convenience user to which the MFA device is bound cannot log on to the cloud desktop that resides in the workspace with the MFA feature enabled because the identity of the convenience user cannot be verified based on the virtual MFA device. You can call the [UnlockMfaDevice](~~286534~~) operation to unlock the virtual MFA device.
      *
     */
    CompletableFuture<LockMfaDeviceResponse> lockMfaDevice(LockMfaDeviceRequest request);

    CompletableFuture<LockUsersResponse> lockUsers(LockUsersRequest request);

    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    CompletableFuture<QuerySyncStatusByAliUidResponse> querySyncStatusByAliUid(QuerySyncStatusByAliUidRequest request);

    /**
      * If you remove a virtual MFA device that is bound to a convenience user, the convenience user can no longer use the virtual MFA device to log on to cloud desktops. Before the convenience user can log on to cloud desktops again, a new virtual MFA device must be bound to the convenience user.
      *
     */
    CompletableFuture<RemoveMfaDeviceResponse> removeMfaDevice(RemoveMfaDeviceRequest request);

    CompletableFuture<RemovePropertyResponse> removeProperty(RemovePropertyRequest request);

    CompletableFuture<RemoveUsersResponse> removeUsers(RemoveUsersRequest request);

    CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request);

    CompletableFuture<SetUserPropertyValueResponse> setUserPropertyValue(SetUserPropertyValueRequest request);

    CompletableFuture<SyncAllEduInfoResponse> syncAllEduInfo(SyncAllEduInfoRequest request);

    CompletableFuture<UnlockMfaDeviceResponse> unlockMfaDevice(UnlockMfaDeviceRequest request);

    CompletableFuture<UnlockUsersResponse> unlockUsers(UnlockUsersRequest request);

    CompletableFuture<UpdatePropertyResponse> updateProperty(UpdatePropertyRequest request);

}
