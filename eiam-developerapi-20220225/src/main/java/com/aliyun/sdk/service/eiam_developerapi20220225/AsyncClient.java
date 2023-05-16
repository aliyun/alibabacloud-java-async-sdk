// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eiam_developerapi20220225.models.*;
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

    CompletableFuture<CreateOrganizationalUnitResponse> createOrganizationalUnit(CreateOrganizationalUnitRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<DeleteOrganizationalUnitResponse> deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DisableUserResponse> disableUser(DisableUserRequest request);

    CompletableFuture<EnableUserResponse> enableUser(EnableUserRequest request);

    CompletableFuture<GenerateDeviceCodeResponse> generateDeviceCode(GenerateDeviceCodeRequest request);

    CompletableFuture<GenerateTokenResponse> generateToken(GenerateTokenRequest request);

    CompletableFuture<GetApplicationProvisioningScopeResponse> getApplicationProvisioningScope(GetApplicationProvisioningScopeRequest request);

    CompletableFuture<GetOrganizationalUnitResponse> getOrganizationalUnit(GetOrganizationalUnitRequest request);

    CompletableFuture<GetOrganizationalUnitIdByExternalIdResponse> getOrganizationalUnitIdByExternalId(GetOrganizationalUnitIdByExternalIdRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserIdByEmailResponse> getUserIdByEmail(GetUserIdByEmailRequest request);

    CompletableFuture<GetUserIdByPhoneNumberResponse> getUserIdByPhoneNumber(GetUserIdByPhoneNumberRequest request);

    CompletableFuture<GetUserIdByUserExternalIdResponse> getUserIdByUserExternalId(GetUserIdByUserExternalIdRequest request);

    CompletableFuture<GetUserIdByUsernameResponse> getUserIdByUsername(GetUserIdByUsernameRequest request);

    CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request);

    CompletableFuture<ListOrganizationalUnitParentIdsResponse> listOrganizationalUnitParentIds(ListOrganizationalUnitParentIdsRequest request);

    CompletableFuture<ListOrganizationalUnitsResponse> listOrganizationalUnits(ListOrganizationalUnitsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<PatchOrganizationalUnitResponse> patchOrganizationalUnit(PatchOrganizationalUnitRequest request);

    CompletableFuture<PatchUserResponse> patchUser(PatchUserRequest request);

    CompletableFuture<RemoveUserFromOrganizationalUnitsResponse> removeUserFromOrganizationalUnits(RemoveUserFromOrganizationalUnitsRequest request);

    CompletableFuture<RevokeTokenResponse> revokeToken(RevokeTokenRequest request);

    CompletableFuture<SetUserPrimaryOrganizationalUnitResponse> setUserPrimaryOrganizationalUnit(SetUserPrimaryOrganizationalUnitRequest request);

    CompletableFuture<UpdateUserPasswordResponse> updateUserPassword(UpdateUserPasswordRequest request);

}
