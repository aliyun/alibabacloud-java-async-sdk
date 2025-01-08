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

    /**
     * @param request the request parameters of AddUserToGroup  AddUserToGroupRequest
     * @return AddUserToGroupResponse
     */
    CompletableFuture<AddUserToGroupResponse> addUserToGroup(AddUserToGroupRequest request);

    /**
     * @param request the request parameters of AttachPolicyToGroup  AttachPolicyToGroupRequest
     * @return AttachPolicyToGroupResponse
     */
    CompletableFuture<AttachPolicyToGroupResponse> attachPolicyToGroup(AttachPolicyToGroupRequest request);

    /**
     * @param request the request parameters of AttachPolicyToRole  AttachPolicyToRoleRequest
     * @return AttachPolicyToRoleResponse
     */
    CompletableFuture<AttachPolicyToRoleResponse> attachPolicyToRole(AttachPolicyToRoleRequest request);

    /**
     * @param request the request parameters of AttachPolicyToUser  AttachPolicyToUserRequest
     * @return AttachPolicyToUserResponse
     */
    CompletableFuture<AttachPolicyToUserResponse> attachPolicyToUser(AttachPolicyToUserRequest request);

    /**
     * @param request the request parameters of BindMFADevice  BindMFADeviceRequest
     * @return BindMFADeviceResponse
     */
    CompletableFuture<BindMFADeviceResponse> bindMFADevice(BindMFADeviceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is available only for RAM users. Before you call this operation, make sure that <code>AllowUserToChangePassword</code> in <a href="https://help.aliyun.com/document_detail/43765.html">SetSecurityPreference</a> is set to <code>True</code>. The value True indicates that RAM users can change their passwords.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ChangePassword  ChangePasswordRequest
     * @return ChangePasswordResponse
     */
    CompletableFuture<ChangePasswordResponse> changePassword(ChangePasswordRequest request);

    /**
     * @param request the request parameters of ClearAccountAlias  ClearAccountAliasRequest
     * @return ClearAccountAliasResponse
     */
    CompletableFuture<ClearAccountAliasResponse> clearAccountAlias(ClearAccountAliasRequest request);

    /**
     * @param request the request parameters of CreateAccessKey  CreateAccessKeyRequest
     * @return CreateAccessKeyResponse
     */
    CompletableFuture<CreateAccessKeyResponse> createAccessKey(CreateAccessKeyRequest request);

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * @param request the request parameters of CreateLoginProfile  CreateLoginProfileRequest
     * @return CreateLoginProfileResponse
     */
    CompletableFuture<CreateLoginProfileResponse> createLoginProfile(CreateLoginProfileRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about policies, see <a href="https://help.aliyun.com/document_detail/93732.html">Policy overview</a>.
     * This topic provides an example on how to create a custom policy to query Elastic Compute Service (ECS) instances in a specific region.</p>
     * 
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    /**
     * @param request the request parameters of CreatePolicyVersion  CreatePolicyVersionRequest
     * @return CreatePolicyVersionResponse
     */
    CompletableFuture<CreatePolicyVersionResponse> createPolicyVersion(CreatePolicyVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>For more information about RAM roles, see <a href="https://help.aliyun.com/document_detail/93689.html">Overview of RAM roles</a>.</p>
     * 
     * @param request the request parameters of CreateRole  CreateRoleRequest
     * @return CreateRoleResponse
     */
    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a RAM user named <code>alice</code>.</p>
     * 
     * @param request the request parameters of CreateUser  CreateUserRequest
     * @return CreateUserResponse
     */
    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    /**
     * @param request the request parameters of CreateVirtualMFADevice  CreateVirtualMFADeviceRequest
     * @return CreateVirtualMFADeviceResponse
     */
    CompletableFuture<CreateVirtualMFADeviceResponse> createVirtualMFADevice(CreateVirtualMFADeviceRequest request);

    /**
     * @param request the request parameters of DecodeDiagnosticMessage  DecodeDiagnosticMessageRequest
     * @return DecodeDiagnosticMessageResponse
     */
    CompletableFuture<DecodeDiagnosticMessageResponse> decodeDiagnosticMessage(DecodeDiagnosticMessageRequest request);

    /**
     * @param request the request parameters of DeleteAccessKey  DeleteAccessKeyRequest
     * @return DeleteAccessKeyResponse
     */
    CompletableFuture<DeleteAccessKeyResponse> deleteAccessKey(DeleteAccessKeyRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a RAM user group, make sure that no policies are attached to the group and no RAM users are included in the group.</p>
     * 
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * @param request the request parameters of DeleteLoginProfile  DeleteLoginProfileRequest
     * @return DeleteLoginProfileResponse
     */
    CompletableFuture<DeleteLoginProfileResponse> deleteLoginProfile(DeleteLoginProfileRequest request);

    /**
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * @param request the request parameters of DeletePolicyVersion  DeletePolicyVersionRequest
     * @return DeletePolicyVersionResponse
     */
    CompletableFuture<DeletePolicyVersionResponse> deletePolicyVersion(DeletePolicyVersionRequest request);

    /**
     * @param request the request parameters of DeleteRole  DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a RAM user, make sure that no policies are attached to the RAM user and that the RAM user does not belong to any groups.</p>
     * 
     * @param request the request parameters of DeleteUser  DeleteUserRequest
     * @return DeleteUserResponse
     */
    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    /**
     * @param request the request parameters of DeleteVirtualMFADevice  DeleteVirtualMFADeviceRequest
     * @return DeleteVirtualMFADeviceResponse
     */
    CompletableFuture<DeleteVirtualMFADeviceResponse> deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request);

    /**
     * @param request the request parameters of DetachPolicyFromGroup  DetachPolicyFromGroupRequest
     * @return DetachPolicyFromGroupResponse
     */
    CompletableFuture<DetachPolicyFromGroupResponse> detachPolicyFromGroup(DetachPolicyFromGroupRequest request);

    /**
     * @param request the request parameters of DetachPolicyFromRole  DetachPolicyFromRoleRequest
     * @return DetachPolicyFromRoleResponse
     */
    CompletableFuture<DetachPolicyFromRoleResponse> detachPolicyFromRole(DetachPolicyFromRoleRequest request);

    /**
     * @param request the request parameters of DetachPolicyFromUser  DetachPolicyFromUserRequest
     * @return DetachPolicyFromUserResponse
     */
    CompletableFuture<DetachPolicyFromUserResponse> detachPolicyFromUser(DetachPolicyFromUserRequest request);

    /**
     * @param request the request parameters of GetAccessKeyLastUsed  GetAccessKeyLastUsedRequest
     * @return GetAccessKeyLastUsedResponse
     */
    CompletableFuture<GetAccessKeyLastUsedResponse> getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request);

    /**
     * @param request the request parameters of GetAccountAlias  GetAccountAliasRequest
     * @return GetAccountAliasResponse
     */
    CompletableFuture<GetAccountAliasResponse> getAccountAlias(GetAccountAliasRequest request);

    /**
     * @param request the request parameters of GetGroup  GetGroupRequest
     * @return GetGroupResponse
     */
    CompletableFuture<GetGroupResponse> getGroup(GetGroupRequest request);

    /**
     * @param request the request parameters of GetLoginProfile  GetLoginProfileRequest
     * @return GetLoginProfileResponse
     */
    CompletableFuture<GetLoginProfileResponse> getLoginProfile(GetLoginProfileRequest request);

    /**
     * @param request the request parameters of GetPasswordPolicy  GetPasswordPolicyRequest
     * @return GetPasswordPolicyResponse
     */
    CompletableFuture<GetPasswordPolicyResponse> getPasswordPolicy(GetPasswordPolicyRequest request);

    /**
     * @param request the request parameters of GetPolicy  GetPolicyRequest
     * @return GetPolicyResponse
     */
    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    /**
     * @param request the request parameters of GetPolicyVersion  GetPolicyVersionRequest
     * @return GetPolicyVersionResponse
     */
    CompletableFuture<GetPolicyVersionResponse> getPolicyVersion(GetPolicyVersionRequest request);

    /**
     * @param request the request parameters of GetRole  GetRoleRequest
     * @return GetRoleResponse
     */
    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    /**
     * @param request the request parameters of GetSecurityPreference  GetSecurityPreferenceRequest
     * @return GetSecurityPreferenceResponse
     */
    CompletableFuture<GetSecurityPreferenceResponse> getSecurityPreference(GetSecurityPreferenceRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about the RAM user <code>alice</code>.</p>
     * 
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of GetUserMFAInfo  GetUserMFAInfoRequest
     * @return GetUserMFAInfoResponse
     */
    CompletableFuture<GetUserMFAInfoResponse> getUserMFAInfo(GetUserMFAInfoRequest request);

    /**
     * @param request the request parameters of ListAccessKeys  ListAccessKeysRequest
     * @return ListAccessKeysResponse
     */
    CompletableFuture<ListAccessKeysResponse> listAccessKeys(ListAccessKeysRequest request);

    /**
     * @param request the request parameters of ListEntitiesForPolicy  ListEntitiesForPolicyRequest
     * @return ListEntitiesForPolicyResponse
     */
    CompletableFuture<ListEntitiesForPolicyResponse> listEntitiesForPolicy(ListEntitiesForPolicyRequest request);

    /**
     * @param request the request parameters of ListGroups  ListGroupsRequest
     * @return ListGroupsResponse
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the RAM user groups to which the RAM user <code>Alice</code> belongs. The response shows that <code>Alice</code> belongs to the RAM user group named <code>Dev-Team</code>.</p>
     * 
     * @param request the request parameters of ListGroupsForUser  ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     */
    CompletableFuture<ListGroupsForUserResponse> listGroupsForUser(ListGroupsForUserRequest request);

    /**
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    /**
     * @param request the request parameters of ListPoliciesForGroup  ListPoliciesForGroupRequest
     * @return ListPoliciesForGroupResponse
     */
    CompletableFuture<ListPoliciesForGroupResponse> listPoliciesForGroup(ListPoliciesForGroupRequest request);

    /**
     * @param request the request parameters of ListPoliciesForRole  ListPoliciesForRoleRequest
     * @return ListPoliciesForRoleResponse
     */
    CompletableFuture<ListPoliciesForRoleResponse> listPoliciesForRole(ListPoliciesForRoleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to query only the policies that are attached to Alibaba Cloud accounts. You cannot query the policies that are attached to resource groups.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListPoliciesForUser  ListPoliciesForUserRequest
     * @return ListPoliciesForUserResponse
     */
    CompletableFuture<ListPoliciesForUserResponse> listPoliciesForUser(ListPoliciesForUserRequest request);

    /**
     * @param request the request parameters of ListPolicyVersions  ListPolicyVersionsRequest
     * @return ListPolicyVersionsResponse
     */
    CompletableFuture<ListPolicyVersionsResponse> listPolicyVersions(ListPolicyVersionsRequest request);

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
     * @param request the request parameters of ListUsers  ListUsersRequest
     * @return ListUsersResponse
     */
    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    /**
     * @param request the request parameters of ListUsersForGroup  ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     */
    CompletableFuture<ListUsersForGroupResponse> listUsersForGroup(ListUsersForGroupRequest request);

    /**
     * @param request the request parameters of ListVirtualMFADevices  ListVirtualMFADevicesRequest
     * @return ListVirtualMFADevicesResponse
     */
    CompletableFuture<ListVirtualMFADevicesResponse> listVirtualMFADevices(ListVirtualMFADevicesRequest request);

    /**
     * @param request the request parameters of RemoveUserFromGroup  RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     */
    CompletableFuture<RemoveUserFromGroupResponse> removeUserFromGroup(RemoveUserFromGroupRequest request);

    /**
     * @param request the request parameters of SetAccountAlias  SetAccountAliasRequest
     * @return SetAccountAliasResponse
     */
    CompletableFuture<SetAccountAliasResponse> setAccountAlias(SetAccountAliasRequest request);

    /**
     * @param request the request parameters of SetDefaultPolicyVersion  SetDefaultPolicyVersionRequest
     * @return SetDefaultPolicyVersionResponse
     */
    CompletableFuture<SetDefaultPolicyVersionResponse> setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request);

    /**
     * @param request the request parameters of SetPasswordPolicy  SetPasswordPolicyRequest
     * @return SetPasswordPolicyResponse
     */
    CompletableFuture<SetPasswordPolicyResponse> setPasswordPolicy(SetPasswordPolicyRequest request);

    /**
     * @param request the request parameters of SetSecurityPreference  SetSecurityPreferenceRequest
     * @return SetSecurityPreferenceResponse
     */
    CompletableFuture<SetSecurityPreferenceResponse> setSecurityPreference(SetSecurityPreferenceRequest request);

    /**
     * @param request the request parameters of UnbindMFADevice  UnbindMFADeviceRequest
     * @return UnbindMFADeviceResponse
     */
    CompletableFuture<UnbindMFADeviceResponse> unbindMFADevice(UnbindMFADeviceRequest request);

    /**
     * @param request the request parameters of UpdateAccessKey  UpdateAccessKeyRequest
     * @return UpdateAccessKeyResponse
     */
    CompletableFuture<UpdateAccessKeyResponse> updateAccessKey(UpdateAccessKeyRequest request);

    /**
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

    /**
     * @param request the request parameters of UpdateLoginProfile  UpdateLoginProfileRequest
     * @return UpdateLoginProfileResponse
     */
    CompletableFuture<UpdateLoginProfileResponse> updateLoginProfile(UpdateLoginProfileRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify only the description of a custom policy. You cannot modify the description of a system policy.</p>
     * 
     * @param request the request parameters of UpdatePolicyDescription  UpdatePolicyDescriptionRequest
     * @return UpdatePolicyDescriptionResponse
     */
    CompletableFuture<UpdatePolicyDescriptionResponse> updatePolicyDescription(UpdatePolicyDescriptionRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to change the description of ECSAdmin to ECS administrator.</p>
     * 
     * @param request the request parameters of UpdateRole  UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the name of a RAM user from <code>zhangq****</code> to <code>xiaoq****</code>.</p>
     * 
     * @param request the request parameters of UpdateUser  UpdateUserRequest
     * @return UpdateUserResponse
     */
    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

}
