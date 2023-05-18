// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.resourcemanager20200331.models.*;
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
      * After an invited Alibaba Cloud account joins a resource directory, it becomes a member of the resource directory. By default, the name of the invited Alibaba Cloud account is used as the display name of the account in the resource directory.
      * This topic provides an example on how to call the API operation to accept the invitation `h-Ih8IuPfvV0t0****` that is initiated to invite the Alibaba Cloud account `177242285274****` to join the resource directory `rd-3G****`.
      *
     */
    CompletableFuture<AcceptHandshakeResponse> acceptHandshake(AcceptHandshakeRequest request);

    /**
      * After you attach an access control policy, the operations performed on resources by using members are limited by the policy. Make sure that the attached policy meets your expectations. Otherwise, your business may be affected.
      * By default, the system access control policy FullAliyunAccess is attached to each folder and member.
      * The access control policy that is attached to a folder also applies to all its subfolders and all members in the subfolders.
      * A maximum of 10 access control policies can be attached to a folder or member.
      * This topic provides an example on how to call the API operation to attach the custom access control policy `cp-jExXAqIYkwHN****` to the folder `fd-ZDNPiT****`.
      *
     */
    CompletableFuture<AttachControlPolicyResponse> attachControlPolicy(AttachControlPolicyRequest request);

    /**
      * In this example, the policy `AdministratorAccess` is attached to the RAM user `alice@demo.onaliyun.com` and takes effect only for resources in the `rg-9gLOoK****` resource group.
      *
     */
    CompletableFuture<AttachPolicyResponse> attachPolicy(AttachPolicyRequest request);

    /**
      * You can call this API operation only to bind a mobile phone number to a member of the resource account type. You cannot call this API operation to change the mobile phone number that is bound to a member of the resource account type.
      * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.
      * This topic provides an example on how to call the API operation to bind a mobile phone number to the member `138660628348****` for security purposes.
      *
     */
    CompletableFuture<BindSecureMobilePhoneResponse> bindSecureMobilePhone(BindSecureMobilePhoneRequest request);

    CompletableFuture<CancelChangeAccountEmailResponse> cancelChangeAccountEmail(CancelChangeAccountEmailRequest request);

    CompletableFuture<CancelCreateCloudAccountResponse> cancelCreateCloudAccount(CancelCreateCloudAccountRequest request);

    /**
      * This topic provides an example on how to call the API operation to cancel the invitation whose ID is `h-ycm4rp****`.
      *
     */
    CompletableFuture<CancelHandshakeResponse> cancelHandshake(CancelHandshakeRequest request);

    CompletableFuture<CancelPromoteResourceAccountResponse> cancelPromoteResourceAccount(CancelPromoteResourceAccountRequest request);

    CompletableFuture<ChangeAccountEmailResponse> changeAccountEmail(ChangeAccountEmailRequest request);

    /**
      * Before you delete a member, you must call this API operation to check whether the member can be deleted.
      * This topic provides an example on how to call the API operation to perform a deletion check on the member whose ID is `179855839641****`.
      *
     */
    CompletableFuture<CheckAccountDeleteResponse> checkAccountDelete(CheckAccountDeleteRequest request);

    /**
      * A resource directory supports two types of member accounts: resource accounts and cloud accounts.
      * *   Resource account (recommended): A resource account is only used as a resource container and fully depends on a resource directory. Such member accounts are secure and easy-to-create. For more information about how to create a resource account, see [CreateResourceAccount](~~159392~~).
      * >  A resource account can be upgraded to a cloud account. For more information, see [PromoteResourceAccount](~~159395~~) .
      * *   Cloud account: A cloud account has all the features of an Alibaba Cloud account, including root permissions.
      *
     */
    CompletableFuture<CreateCloudAccountResponse> createCloudAccount(CreateCloudAccountRequest request);

    /**
      * This topic provides an example on how to call the API operation to create a custom access control policy named `ExampleControlPolicy`. This access control policy is used to prohibit modifications to the ResourceDirectoryAccountAccessRole role and the permissions of the role.
      *
     */
    CompletableFuture<CreateControlPolicyResponse> createControlPolicy(CreateControlPolicyRequest request);

    /**
      * >  A maximum of five levels of folders can be created under the root folder.
      * In this example, a folder named `rdFolder` is created under the root folder.
      *
     */
    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    CompletableFuture<CreatePolicyVersionResponse> createPolicyVersion(CreatePolicyVersionRequest request);

    /**
      * A member serves as a container for resources and is also an organizational unit in a resource directory. A member indicates a project or application. The resources of different members are isolated.
      * This topic provides an example on how to call the API operation to create a member in the `fd-r23M55****` folder. The display name of the member is `Dev`, and the prefix for the Alibaba Cloud account name of the member is `alice`.
      *
     */
    CompletableFuture<CreateResourceAccountResponse> createResourceAccount(CreateResourceAccountRequest request);

    /**
      * For more information about common request parameters, see [Common parameters](~~159973~~).
      *
     */
    CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request);

    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<DeclineHandshakeResponse> declineHandshake(DeclineHandshakeRequest request);

    /**
      * The ID of the member that you want to delete.
      *
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
      * If you want to delete a custom control policy that is attached to folders or member accounts, you must call the [DetachControlPolicy](~~208331~~) operation to detach the policy before you delete it.
      * In this example, the custom control policy `cp-SImPt8GCEwiq****` is deleted.
      *
     */
    CompletableFuture<DeleteControlPolicyResponse> deleteControlPolicy(DeleteControlPolicyRequest request);

    /**
      * >  Before you delete a folder, make sure that the folder does not contain any member accounts or child folders.
      *
     */
    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    /**
      * > 
      * *   Before you delete a policy, you must delete all non-default versions of the policy. For more information about how to delete a policy version, see [DeletePolicyVersion](~~159041~~).
      * *   Before you delete a policy, make sure that the policy is not referenced. This means that the policy is not attached to RAM users, RAM user groups, or RAM roles. For more information about how to detach a policy, see [DetachPolicy](~~159168~~).
      *
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
      * >  The default version of a permission policy cannot be deleted.
      *
     */
    CompletableFuture<DeletePolicyVersionResponse> deletePolicyVersion(DeletePolicyVersionRequest request);

    /**
      * >  Before you delete a resource group, you must delete all the resources in it.
      * In this example, the resource group whose ID is `rg-9gLOoK****` is deleted.
      *
     */
    CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request);

    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    CompletableFuture<DeleteServiceLinkedRoleResponse> deleteServiceLinkedRole(DeleteServiceLinkedRoleRequest request);

    /**
      * >  If the delegated administrator account that you want to remove has historical management tasks in the related trusted service, the trusted service may be affected after the delegated administrator account is removed. Therefore, proceed with caution.
      * This topic provides an example on how to call the API operation to remove the delegated administrator account `181761095690****` for Cloud Firewall.
      *
     */
    CompletableFuture<DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministrator(DeregisterDelegatedAdministratorRequest request);

    /**
      * Before you disable a resource directory, make sure that the following requirements are met:
      * *   All member accounts must be removed from the resource directory. For more information about how to remove a member account, see [RemoveCloudAccount](~~159431~~).
      * *   All folders except the root folder must be deleted from the resource directory. For more information about how to delete a folder, see [DeleteFolder](~~159432~~).
      *
     */
    CompletableFuture<DestroyResourceDirectoryResponse> destroyResourceDirectory(DestroyResourceDirectoryRequest request);

    /**
      * After you detach an access control policy, the operations performed on resources by using members are not limited by the policy. Make sure that the detached policy meets your expectations. Otherwise, your business may be affected.
      * Both the system and custom access control policies can be detached. If an object has only one access control policy attached, the policy cannot be detached.
      * This topic provides an example on how to call the API operation to detach the custom control policy `cp-jExXAqIYkwHN****` from the folder `fd-ZDNPiT****`.
      *
     */
    CompletableFuture<DetachControlPolicyResponse> detachControlPolicy(DetachControlPolicyRequest request);

    CompletableFuture<DetachPolicyResponse> detachPolicy(DetachPolicyRequest request);

    /**
      * After you disable the Control Policy feature, the system automatically detaches all control policies that are attached to folders and member accounts. The system does not delete these control policies, but you cannot attach them to folders or member accounts again.
      * >  If you disable the Control Policy feature, the permissions of all folders and member accounts in a resource directory are affected. You must proceed with caution.
      *
     */
    CompletableFuture<DisableControlPolicyResponse> disableControlPolicy(DisableControlPolicyRequest request);

    /**
      * The Control Policy feature allows you to manage the permission boundaries of the folders or member accounts in a resource directory in a centralized manner. This feature is implemented based on the resource directory. You can use this feature to develop common or dedicated rules for access control. The Control Policy feature does not grant permissions but only defines permission boundaries. A member account in a resource directory can be used to access resources only after it is granted the required permissions by using the Resource Access Management (RAM) service. For more information, see [Overview of the Control Policy feature](~~178671~~).
      *
     */
    CompletableFuture<EnableControlPolicyResponse> enableControlPolicy(EnableControlPolicyRequest request);

    /**
      * You can use the current account or a newly created account to enable a resource directory. For more information, see [Enable a resource directory](~~111215~~).
      * In this example, the current account is used to enable a resource directory.
      *
     */
    CompletableFuture<EnableResourceDirectoryResponse> enableResourceDirectory(EnableResourceDirectoryRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the information of the member whose Alibaba Cloud account ID is `181761095690****`.
      *
     */
    CompletableFuture<GetAccountResponse> getAccount(GetAccountRequest request);

    /**
      * After you call the [CheckAccountDelete](~~448542~~) operation to perform a member deletion check, you can call the GetAccountDeletionCheckResult operation to query the check result. If the check result shows that the member meets deletion requirements, you can delete the member. Otherwise, you need to first modify the items that do not meet requirements.
      * This topic provides an example on how to call the API operation to query the result of the deletion check for the member whose ID is `179855839641****`. The response shows that the member does not meet deletion requirements.
      *
     */
    CompletableFuture<GetAccountDeletionCheckResultResponse> getAccountDeletionCheckResult(GetAccountDeletionCheckResultRequest request);

    CompletableFuture<GetAccountDeletionStatusResponse> getAccountDeletionStatus(GetAccountDeletionStatusRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the details of the access control policy whose ID is `cp-SImPt8GCEwiq****`.
      *
     */
    CompletableFuture<GetControlPolicyResponse> getControlPolicy(GetControlPolicyRequest request);

    CompletableFuture<GetControlPolicyEnablementStatusResponse> getControlPolicyEnablementStatus(GetControlPolicyEnablementStatusRequest request);

    /**
      * In this example, the information of the folder `fd-Jyl5U7****` is queried.
      *
     */
    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    /**
      * In this example, the information of the invitation whose ID is `h-ycm4rp****` is queried.
      *
     */
    CompletableFuture<GetHandshakeResponse> getHandshake(GetHandshakeRequest request);

    CompletableFuture<GetPayerForAccountResponse> getPayerForAccount(GetPayerForAccountRequest request);

    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    CompletableFuture<GetPolicyVersionResponse> getPolicyVersion(GetPolicyVersionRequest request);

    /**
      * This topic provides an example on how to use a management account to call the API operation to query the information of the resource directory that is enabled by using the management account.
      *
     */
    CompletableFuture<GetResourceDirectoryResponse> getResourceDirectory(GetResourceDirectoryRequest request);

    /**
      * For more information about common request parameters, see [Common parameters](~~159973~~).
      *
     */
    CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request);

    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    CompletableFuture<GetServiceLinkedRoleDeletionStatusResponse> getServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest request);

    /**
      * > 
      * *   An account can be used to enable a resource directory only after it passes enterprise real-name verification. An account that only passed individual real-name verification cannot be used to enable a resource directory.
      * *   We recommend that you only use the enterprise management account as the administrator of the resource directory. Do not use the enterprise management account to purchase cloud resources.
      *
     */
    CompletableFuture<InitResourceDirectoryResponse> initResourceDirectory(InitResourceDirectoryRequest request);

    /**
      * This topic provides an example on how to call the API operation to invite the account `someone@example.com` to join a resource directory.
      *
     */
    CompletableFuture<InviteAccountToResourceDirectoryResponse> inviteAccountToResourceDirectory(InviteAccountToResourceDirectoryRequest request);

    /**
      * You can use only the management account of a resource directory or a delegated administrator account of a trusted service to call this operation.
      *
     */
    CompletableFuture<ListAccountsResponse> listAccounts(ListAccountsRequest request);

    CompletableFuture<ListAccountsForParentResponse> listAccountsForParent(ListAccountsForParentRequest request);

    CompletableFuture<ListAncestorsResponse> listAncestors(ListAncestorsRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the system access control policies within a resource directory. The response shows that the resource directory has only one system access control policy. The policy is named `FullAliyunAccess`.
      *
     */
    CompletableFuture<ListControlPoliciesResponse> listControlPolicies(ListControlPoliciesRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the access control policies that are attached to the folder `fd-ZDNPiT****`.
      *
     */
    CompletableFuture<ListControlPolicyAttachmentsForTargetResponse> listControlPolicyAttachmentsForTarget(ListControlPolicyAttachmentsForTargetRequest request);

    /**
      * This topic provides an example on how to call the API operation to query all delegated administrator accounts in a resource directory. The response shows that two delegated administrator accounts for Cloud Firewall exist in the resource directory.
      *
     */
    CompletableFuture<ListDelegatedAdministratorsResponse> listDelegatedAdministrators(ListDelegatedAdministratorsRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the trusted services for which the member `138660628348****` is specified as a delegated administrator account. The response shows that the member is specified as a delegated administrator account of Cloud Firewall.
      *
     */
    CompletableFuture<ListDelegatedServicesForAccountResponse> listDelegatedServicesForAccount(ListDelegatedServicesForAccountRequest request);

    /**
      * >  You can view the information of only the first-level subfolders of a folder.
      *
     */
    CompletableFuture<ListFoldersForParentResponse> listFoldersForParent(ListFoldersForParentRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the invitations that are associated with the management account `172841235500****`. The response shows that two invitations are associated with the management account.
      *
     */
    CompletableFuture<ListHandshakesForAccountResponse> listHandshakesForAccount(ListHandshakesForAccountRequest request);

    CompletableFuture<ListHandshakesForResourceDirectoryResponse> listHandshakesForResourceDirectory(ListHandshakesForResourceDirectoryRequest request);

    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    /**
      * You can view the following information:
      * *   Policy attachment records under an Alibaba Cloud account or a resource group
      * *   Policies attached to RAM users, RAM user groups, or RAM roles
      * *   RAM users, RAM user groups, or RAM roles to which policies are attached under an Alibaba Cloud account or a resource group
      *
     */
    CompletableFuture<ListPolicyAttachmentsResponse> listPolicyAttachments(ListPolicyAttachmentsRequest request);

    CompletableFuture<ListPolicyVersionsResponse> listPolicyVersions(ListPolicyVersionsRequest request);

    /**
      * You can call this API operation to query all resource groups within the current account. You can also call this API operation to query a specific resource group based on the status, ID, identifier, or display name of the resource group.
      * This topic provides an example on how to call the API operation to query the basic information about the resource groups `rg-1hSBH2****` and `rg-9gLOoK****` within the current account.
      *
     */
    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    /**
      * >  You can use a RAM role that is not associated with a session policy to call this API operation.
      * This topic provides an example on how to call the API operation to query the resources that can be accessed by the current account in resource groups. The response shows that the current account can access only the Elastic Compute Service (ECS) instance `i-23v38****` in the resource group `rg-uPJpP****`.
      *
     */
    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
      * This topic provides an example on how to call the API operation to query tag keys. The response shows that the custom tag key team exists.
      *
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the tags that are added to the resource group with an ID of `rg-aekz6bre2uq****`. The response shows that only the `k1:v1` tag is added to the resource group.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * This topic provides an example on how to call the API operation to query the tag values of the tag key k1. The response shows that the tag value of the tag key k1 is v1.
      *
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
      * In this example, the folders or member accounts to which the control policy `cp-jExXAqIYkwHN****` is attached are queried. The returned result shows that the control policy is attached to the folder `fd-ZDNPiT****`.
      *
     */
    CompletableFuture<ListTargetAttachmentsForControlPolicyResponse> listTargetAttachmentsForControlPolicy(ListTargetAttachmentsForControlPolicyRequest request);

    /**
      * >  Only an enterprise management account or delegated administrator account can be used to call this operation.
      * In this example, the trusted services that are enabled within an enterprise management account are queried. The returned result shows that the trusted services Cloud Config and ActionTrail are enabled within the enterprise management account.
      *
     */
    CompletableFuture<ListTrustedServiceStatusResponse> listTrustedServiceStatus(ListTrustedServiceStatusRequest request);

    CompletableFuture<MoveAccountResponse> moveAccount(MoveAccountRequest request);

    /**
      * For more information about Alibaba Cloud services whose resources can be moved between resource groups, see the **Supported by the API** column in [Alibaba Cloud services that support resource groups](~~94479~~).
      * In this example, two virtual private clouds (VPCs) `vpc-bp1sig0mjktx5ewx1****` and `vpc-bp1visxm225pv49dz****` that reside in different regions and belong to different resource groups are moved to the resource group `rg-aekzmeobk5w****`.
      *
     */
    CompletableFuture<MoveResourcesResponse> moveResources(MoveResourcesRequest request);

    CompletableFuture<PromoteResourceAccountResponse> promoteResourceAccount(PromoteResourceAccountRequest request);

    /**
      * The delegated administrator account can be used to access the information of the resource directory and view the structure and members of the resource directory. The delegated administrator account can also be used to perform service-related management operations in the trusted service on behalf of the management account of the resource directory.
      * When you call this operation, you must take note of the following limits:
      * *   Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](~~208133~~).
      * *   Only the management account of a resource directory or an authorized RAM user or RAM role of the management account can be used to call this operation.
      * *   The number of delegated administrator accounts that are allowed for a trusted service is defined by the trusted service.
      * This topic provides an example on how to call the API operation to specify the member `181761095690****` as a delegated administrator account of Cloud Firewall.
      *
     */
    CompletableFuture<RegisterDelegatedAdministratorResponse> registerDelegatedAdministrator(RegisterDelegatedAdministratorRequest request);

    /**
      * This topic provides an example on how to call the API operation to remove the member `177242285274****` from a resource directory.
      *
     */
    CompletableFuture<RemoveCloudAccountResponse> removeCloudAccount(RemoveCloudAccountRequest request);

    CompletableFuture<ResendCreateCloudAccountEmailResponse> resendCreateCloudAccountEmail(ResendCreateCloudAccountEmailRequest request);

    CompletableFuture<ResendPromoteResourceAccountEmailResponse> resendPromoteResourceAccountEmail(ResendPromoteResourceAccountEmailRequest request);

    CompletableFuture<RetryChangeAccountEmailResponse> retryChangeAccountEmail(RetryChangeAccountEmailRequest request);

    /**
      * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.
      * In this example, a verification code is sent to the mobile phone number that you want to bind to the resource account `138660628348****`.
      *
     */
    CompletableFuture<SendVerificationCodeForBindSecureMobilePhoneResponse> sendVerificationCodeForBindSecureMobilePhone(SendVerificationCodeForBindSecureMobilePhoneRequest request);

    /**
      * Each Alibaba Cloud account can be used to send a maximum of 100 verification codes per day.
      *
     */
    CompletableFuture<SendVerificationCodeForEnableRDResponse> sendVerificationCodeForEnableRD(SendVerificationCodeForEnableRDRequest request);

    CompletableFuture<SetDefaultPolicyVersionResponse> setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request);

    /**
      * Members of the resource account type can be deleted only after the member deletion feature is enabled.
      *
     */
    CompletableFuture<SetMemberDeletionPermissionResponse> setMemberDeletionPermission(SetMemberDeletionPermissionRequest request);

    /**
      * This topic provides an example on how to call the API operation to add the tag `k1:v1` to the resource group with an ID of `rg-aekz6bre2uq****`.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * This topic provides an example on how to call the API operation to remove the tag whose tag key is `k1` from the resource group whose ID is `rg-aek2dpwyrfr****`.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * *   To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.
      * *   Before you switch the type of a member from resource account to cloud account, make sure that specific conditions are met. For more information about the conditions, see [Switch a resource account to a cloud account](~~111233~~).
      * *   Before you switch the type of a member from cloud account to resource account, make sure that specific conditions are met. For more information about the conditions, see [Switch a cloud account to a resource account](~~209980~~).
      * This example provides an example on how to call the API operation to change the display name of the member `12323344****` to `admin`.
      *
     */
    CompletableFuture<UpdateAccountResponse> updateAccount(UpdateAccountRequest request);

    /**
      * In this example, the name of the access control policy whose ID is `cp-jExXAqIYkwHN****` is changed to `NewControlPolicy`.
      *
     */
    CompletableFuture<UpdateControlPolicyResponse> updateControlPolicy(UpdateControlPolicyRequest request);

    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

    /**
      * In this example, the display name of the resource group `rg-9gLOoK****` is changed to `project`.
      *
     */
    CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request);

    /**
      * In this example, the description of the RAM role `ECSAdmin` is updated to `ECS administrator`.
      *
     */
    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

}
