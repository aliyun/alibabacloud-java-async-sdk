// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ram20150501.models.*;
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

    CompletableFuture<AddUserToGroupResponse> addUserToGroup(AddUserToGroupRequest request);

    CompletableFuture<AttachPolicyToGroupResponse> attachPolicyToGroup(AttachPolicyToGroupRequest request);

    CompletableFuture<AttachPolicyToRoleResponse> attachPolicyToRole(AttachPolicyToRoleRequest request);

    CompletableFuture<AttachPolicyToUserResponse> attachPolicyToUser(AttachPolicyToUserRequest request);

    CompletableFuture<BindMFADeviceResponse> bindMFADevice(BindMFADeviceRequest request);

    /**
      * >  This operation is available only for RAM users. Before you call this operation, make sure that `AllowUserToChangePassword` in [SetSecurityPreference](~~43765~~) is set to `True`. The value True indicates that RAM users can change their passwords.
      *
     */
    CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request);

    CompletableFuture<ClearAccountAliasResponse> clearAccountAlias(ClearAccountAliasRequest request);

    CompletableFuture<CreateAccessKeyResponse> createAccessKey(CreateAccessKeyRequest request);

    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    CompletableFuture<CreateLoginProfileResponse> createLoginProfile(CreateLoginProfileRequest request);

    /**
      * For more information about policies, see [Policy overview](~~93732~~).
      * This topic provides an example on how to create a custom policy to query Elastic Compute Service (ECS) instances in a specific region.
      *
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    CompletableFuture<CreatePolicyVersionResponse> createPolicyVersion(CreatePolicyVersionRequest request);

    /**
      * ## Description
      * For more information about RAM roles, see [Overview of RAM roles](~~93689~~).
      *
     */
    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    /**
      * This topic provides an example on how to create a RAM user named `alice`.
      *
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CreateVirtualMFADeviceResponse> createVirtualMFADevice(CreateVirtualMFADeviceRequest request);

    CompletableFuture<DecodeDiagnosticMessageResponse> decodeDiagnosticMessage(DecodeDiagnosticMessageRequest request);

    CompletableFuture<DeleteAccessKeyResponse> deleteAccessKey(DeleteAccessKeyRequest request);

    /**
      * Before you delete a RAM user group, make sure that no policies are attached to the group and no RAM users are included in the group.
      *
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    CompletableFuture<DeleteLoginProfileResponse> deleteLoginProfile(DeleteLoginProfileRequest request);

    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    CompletableFuture<DeletePolicyVersionResponse> deletePolicyVersion(DeletePolicyVersionRequest request);

    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    /**
      * Before you delete a RAM user, make sure that no policies are attached to the RAM user and that the RAM user does not belong to any groups.
      *
     */
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

    /**
      * This topic provides an example on how to query the information about the RAM user `alice`.
      *
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<GetUserMFAInfoResponse> getUserMFAInfo(GetUserMFAInfoRequest request);

    CompletableFuture<ListAccessKeysResponse> listAccessKeys(ListAccessKeysRequest request);

    CompletableFuture<ListEntitiesForPolicyResponse> listEntitiesForPolicy(ListEntitiesForPolicyRequest request);

    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
      * This topic provides an example on how to query the RAM user groups to which the RAM user `Alice` belongs. The response shows that `Alice` belongs to the RAM user group named `Dev-Team`.
      *
     */
    CompletableFuture<ListGroupsForUserResponse> listGroupsForUser(ListGroupsForUserRequest request);

    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    CompletableFuture<ListPoliciesForGroupResponse> listPoliciesForGroup(ListPoliciesForGroupRequest request);

    CompletableFuture<ListPoliciesForRoleResponse> listPoliciesForRole(ListPoliciesForRoleRequest request);

    /**
      * > You can call this operation to query only the policies that are attached to Alibaba Cloud accounts. You cannot query the policies that are attached to resource groups.
      *
     */
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

    /**
      * You can call this operation to modify only the description of a custom policy. You cannot modify the description of a system policy.
      *
     */
    CompletableFuture<UpdatePolicyDescriptionResponse> updatePolicyDescription(UpdatePolicyDescriptionRequest request);

    /**
      * This topic provides an example to show how to change the description of ECSAdmin to ECS administrator.
      *
     */
    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

    /**
      * This topic provides an example on how to change the name of a RAM user from `zhangq****` to `xiaoq****`.
      *
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
