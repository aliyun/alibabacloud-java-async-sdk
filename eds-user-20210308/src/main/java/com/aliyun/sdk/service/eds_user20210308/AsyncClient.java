// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eds_user20210308.models.*;
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

    CompletableFuture<CheckUsedPropertyResponse> checkUsedProperty(CheckUsedPropertyRequest request);

    /**
      * The operation that you want to perform. Set the value to **CheckUsedPropertyValue**.
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
      * The operation that you want to perform. Set the value to **DeleteUserPropertyValue**.
      *
     */
    CompletableFuture<DeleteUserPropertyValueResponse> deleteUserPropertyValue(DeleteUserPropertyValueRequest request);

    CompletableFuture<DescribeMfaDevicesResponse> describeMfaDevices(DescribeMfaDevicesRequest request);

    CompletableFuture<DescribeUsersResponse> describeUsers(DescribeUsersRequest request);

    CompletableFuture<FilterUsersResponse> filterUsers(FilterUsersRequest request);

    CompletableFuture<ListPropertyResponse> listProperty(ListPropertyRequest request);

    CompletableFuture<ListPropertyValueResponse> listPropertyValue(ListPropertyValueRequest request);

    /**
      * Locks a virtual MFA device that is bound to a convenience user.
      *
     */
    CompletableFuture<LockMfaDeviceResponse> lockMfaDevice(LockMfaDeviceRequest request);

    CompletableFuture<LockUsersResponse> lockUsers(LockUsersRequest request);

    CompletableFuture<ModifyUserResponse> modifyUser(ModifyUserRequest request);

    CompletableFuture<QuerySyncStatusByAliUidResponse> querySyncStatusByAliUid(QuerySyncStatusByAliUidRequest request);

    CompletableFuture<RemoveMfaDeviceResponse> removeMfaDevice(RemoveMfaDeviceRequest request);

    CompletableFuture<RemovePropertyResponse> removeProperty(RemovePropertyRequest request);

    CompletableFuture<RemoveUsersResponse> removeUsers(RemoveUsersRequest request);

    CompletableFuture<ResetUserPasswordResponse> resetUserPassword(ResetUserPasswordRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<SetUserPropertyValueResponse> setUserPropertyValue(SetUserPropertyValueRequest request);

    CompletableFuture<SyncAllEduInfoResponse> syncAllEduInfo(SyncAllEduInfoRequest request);

    CompletableFuture<UnlockMfaDeviceResponse> unlockMfaDevice(UnlockMfaDeviceRequest request);

    CompletableFuture<UnlockUsersResponse> unlockUsers(UnlockUsersRequest request);

    CompletableFuture<UpdatePropertyResponse> updateProperty(UpdatePropertyRequest request);

}
