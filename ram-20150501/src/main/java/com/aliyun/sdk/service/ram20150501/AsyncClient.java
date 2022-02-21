// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ram20150501.models.*;
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

    CompletableFuture<AddUserToGroupResponse> addUserToGroup(AddUserToGroupRequest request);

    CompletableFuture<AttachPolicyToGroupResponse> attachPolicyToGroup(AttachPolicyToGroupRequest request);

    CompletableFuture<AttachPolicyToRoleResponse> attachPolicyToRole(AttachPolicyToRoleRequest request);

    CompletableFuture<AttachPolicyToUserResponse> attachPolicyToUser(AttachPolicyToUserRequest request);

    CompletableFuture<BindMFADeviceResponse> bindMFADevice(BindMFADeviceRequest request);

    CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request);

    CompletableFuture<ClearAccountAliasResponse> clearAccountAlias(ClearAccountAliasRequest request);

    CompletableFuture<CreateAccessKeyResponse> createAccessKey(CreateAccessKeyRequest request);

    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    CompletableFuture<CreateLoginProfileResponse> createLoginProfile(CreateLoginProfileRequest request);

    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    CompletableFuture<CreatePolicyVersionResponse> createPolicyVersion(CreatePolicyVersionRequest request);

    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CreateVirtualMFADeviceResponse> createVirtualMFADevice(CreateVirtualMFADeviceRequest request);

    CompletableFuture<DeleteAccessKeyResponse> deleteAccessKey(DeleteAccessKeyRequest request);

    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    CompletableFuture<DeleteLoginProfileResponse> deleteLoginProfile(DeleteLoginProfileRequest request);

    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    CompletableFuture<DeletePolicyVersionResponse> deletePolicyVersion(DeletePolicyVersionRequest request);

    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DeleteVirtualMFADeviceResponse> deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request);

    CompletableFuture<DetachPolicyFromGroupResponse> detachPolicyFromGroup(DetachPolicyFromGroupRequest request);

    CompletableFuture<DetachPolicyFromRoleResponse> detachPolicyFromRole(DetachPolicyFromRoleRequest request);

    CompletableFuture<DetachPolicyFromUserResponse> detachPolicyFromUser(DetachPolicyFromUserRequest request);

    CompletableFuture<GetAccessKeyLastUsedResponse> getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request);

    CompletableFuture<GetAccountAliasResponse> getAccountAlias(GetAccountAliasRequest request);

    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    CompletableFuture<GetLoginProfileResponse> getLoginProfile(GetLoginProfileRequest request);

    CompletableFuture<GetPasswordPolicyResponse> getPasswordPolicy(GetPasswordPolicyRequest request);

    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    CompletableFuture<GetPolicyVersionResponse> getPolicyVersion(GetPolicyVersionRequest request);

    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    CompletableFuture<GetSecurityPreferenceResponse> getSecurityPreference(GetSecurityPreferenceRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserMFAInfoResponse> getUserMFAInfo(GetUserMFAInfoRequest request);

    CompletableFuture<ListAccessKeysResponse> listAccessKeys(ListAccessKeysRequest request);

    CompletableFuture<ListEntitiesForPolicyResponse> listEntitiesForPolicy(ListEntitiesForPolicyRequest request);

    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    CompletableFuture<ListGroupsForUserResponse> listGroupsForUser(ListGroupsForUserRequest request);

    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    CompletableFuture<ListPoliciesForGroupResponse> listPoliciesForGroup(ListPoliciesForGroupRequest request);

    CompletableFuture<ListPoliciesForRoleResponse> listPoliciesForRole(ListPoliciesForRoleRequest request);

    CompletableFuture<ListPoliciesForUserResponse> listPoliciesForUser(ListPoliciesForUserRequest request);

    CompletableFuture<ListPolicyVersionsResponse> listPolicyVersions(ListPolicyVersionsRequest request);

    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ListUsersForGroupResponse> listUsersForGroup(ListUsersForGroupRequest request);

    CompletableFuture<ListVirtualMFADevicesResponse> listVirtualMFADevices(ListVirtualMFADevicesRequest request);

    CompletableFuture<RemoveUserFromGroupResponse> removeUserFromGroup(RemoveUserFromGroupRequest request);

    CompletableFuture<SetAccountAliasResponse> setAccountAlias(SetAccountAliasRequest request);

    CompletableFuture<SetDefaultPolicyVersionResponse> setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request);

    CompletableFuture<SetPasswordPolicyResponse> setPasswordPolicy(SetPasswordPolicyRequest request);

    CompletableFuture<SetSecurityPreferenceResponse> setSecurityPreference(SetSecurityPreferenceRequest request);

    CompletableFuture<UnbindMFADeviceResponse> unbindMFADevice(UnbindMFADeviceRequest request);

    CompletableFuture<UpdateAccessKeyResponse> updateAccessKey(UpdateAccessKeyRequest request);

    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    CompletableFuture<UpdateLoginProfileResponse> updateLoginProfile(UpdateLoginProfileRequest request);

    CompletableFuture<UpdatePolicyDescriptionResponse> updatePolicyDescription(UpdatePolicyDescriptionRequest request);

    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
