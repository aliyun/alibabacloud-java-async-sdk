// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.resourcemanager20200331.models.*;
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
     * <p>After an invited Alibaba Cloud account joins a resource directory, it becomes a member of the resource directory. By default, the name of the invited Alibaba Cloud account is used as the display name of the account in the resource directory.
     * This topic provides an example on how to call the API operation to accept the invitation <code>h-Ih8IuPfvV0t0****</code> that is initiated to invite the Alibaba Cloud account <code>177242285274****</code> to join the resource directory <code>rd-3G****</code>.</p>
     * 
     * @param request the request parameters of AcceptHandshake  AcceptHandshakeRequest
     * @return AcceptHandshakeResponse
     */
    CompletableFuture<AcceptHandshakeResponse> acceptHandshake(AcceptHandshakeRequest request);

    /**
     * <b>description</b> :
     * <p>After you attach an access control policy, the operations performed on resources by using members are limited by the policy. Make sure that the attached policy meets your expectations. Otherwise, your business may be affected.
     * By default, the system access control policy FullAliyunAccess is attached to each folder and member.
     * The access control policy that is attached to a folder also applies to all its subfolders and all members in the subfolders.
     * A maximum of 10 access control policies can be attached to a folder or member.
     * This topic provides an example on how to call the API operation to attach the custom access control policy <code>cp-jExXAqIYkwHN****</code> to the folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * @param request the request parameters of AttachControlPolicy  AttachControlPolicyRequest
     * @return AttachControlPolicyResponse
     */
    CompletableFuture<AttachControlPolicyResponse> attachControlPolicy(AttachControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the policy <code>AdministratorAccess</code> is attached to the RAM user <code>alice@demo.onaliyun.com</code> and takes effect only for resources in the <code>rg-9gLOoK****</code> resource group.</p>
     * 
     * @param request the request parameters of AttachPolicy  AttachPolicyRequest
     * @return AttachPolicyResponse
     */
    CompletableFuture<AttachPolicyResponse> attachPolicy(AttachPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation only to bind a mobile phone number to a member of the resource account type. You cannot call this API operation to change the mobile phone number that is bound to a member of the resource account type.
     * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.
     * This topic provides an example on how to call the API operation to bind a mobile phone number to the member <code>138660628348****</code> for security purposes.</p>
     * 
     * @param request the request parameters of BindSecureMobilePhone  BindSecureMobilePhoneRequest
     * @return BindSecureMobilePhoneResponse
     */
    CompletableFuture<BindSecureMobilePhoneResponse> bindSecureMobilePhone(BindSecureMobilePhoneRequest request);

    /**
     * @param request the request parameters of CancelChangeAccountEmail  CancelChangeAccountEmailRequest
     * @return CancelChangeAccountEmailResponse
     */
    CompletableFuture<CancelChangeAccountEmailResponse> cancelChangeAccountEmail(CancelChangeAccountEmailRequest request);

    /**
     * @param request the request parameters of CancelCreateCloudAccount  CancelCreateCloudAccountRequest
     * @return CancelCreateCloudAccountResponse
     */
    CompletableFuture<CancelCreateCloudAccountResponse> cancelCreateCloudAccount(CancelCreateCloudAccountRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to cancel the invitation whose ID is <code>h-ycm4rp****</code>.</p>
     * 
     * @param request the request parameters of CancelHandshake  CancelHandshakeRequest
     * @return CancelHandshakeResponse
     */
    CompletableFuture<CancelHandshakeResponse> cancelHandshake(CancelHandshakeRequest request);

    /**
     * @param request the request parameters of CancelPromoteResourceAccount  CancelPromoteResourceAccountRequest
     * @return CancelPromoteResourceAccountResponse
     */
    CompletableFuture<CancelPromoteResourceAccountResponse> cancelPromoteResourceAccount(CancelPromoteResourceAccountRequest request);

    /**
     * @param request the request parameters of ChangeAccountEmail  ChangeAccountEmailRequest
     * @return ChangeAccountEmailResponse
     */
    CompletableFuture<ChangeAccountEmailResponse> changeAccountEmail(ChangeAccountEmailRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a member, you must call this API operation to check whether the member can be deleted.
     * This topic provides an example on how to call the API operation to perform a deletion check on the member whose ID is <code>179855839641****</code>.</p>
     * 
     * @param request the request parameters of CheckAccountDelete  CheckAccountDeleteRequest
     * @return CheckAccountDeleteResponse
     */
    CompletableFuture<CheckAccountDeleteResponse> checkAccountDelete(CheckAccountDeleteRequest request);

    /**
     * <b>description</b> :
     * <p>You can create up to 10 custom transfer rules. Each custom transfer rule can contain up to 10 content records.</p>
     * 
     * @param request the request parameters of CreateAutoGroupingRule  CreateAutoGroupingRuleRequest
     * @return CreateAutoGroupingRuleResponse
     */
    CompletableFuture<CreateAutoGroupingRuleResponse> createAutoGroupingRule(CreateAutoGroupingRuleRequest request);

    /**
     * <b>description</b> :
     * <p>A resource directory supports two types of member accounts: resource accounts and cloud accounts.</p>
     * <ul>
     * <li>Resource account (recommended): A resource account is only used as a resource container and fully depends on a resource directory. Such member accounts are secure and easy-to-create. For more information about how to create a resource account, see <a href="https://help.aliyun.com/document_detail/159392.html">CreateResourceAccount</a>.<blockquote>
     * <p> A resource account can be upgraded to a cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/159395.html">PromoteResourceAccount</a> .</p>
     * </blockquote>
     * </li>
     * <li>Cloud account: A cloud account has all the features of an Alibaba Cloud account, including root permissions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCloudAccount  CreateCloudAccountRequest
     * @return CreateCloudAccountResponse
     */
    CompletableFuture<CreateCloudAccountResponse> createCloudAccount(CreateCloudAccountRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to create a custom access control policy named <code>ExampleControlPolicy</code>. This access control policy is used to prohibit modifications to the ResourceDirectoryAccountAccessRole role and the permissions of the role.</p>
     * 
     * @param request the request parameters of CreateControlPolicy  CreateControlPolicyRequest
     * @return CreateControlPolicyResponse
     */
    CompletableFuture<CreateControlPolicyResponse> createControlPolicy(CreateControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A maximum of five levels of folders can be created under the root folder.
     * In this example, a folder named <code>rdFolder</code> is created under the root folder.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateFolder  CreateFolderRequest
     * @return CreateFolderResponse
     */
    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    /**
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
     * <p>A member serves as a container for resources and is also an organizational unit in a resource directory. A member indicates a project or application. The resources of different members are isolated.</p>
     * 
     * @param request the request parameters of CreateResourceAccount  CreateResourceAccountRequest
     * @return CreateResourceAccountResponse
     */
    CompletableFuture<CreateResourceAccountResponse> createResourceAccount(CreateResourceAccountRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A maximum of 30 resource groups can be created within an Alibaba Cloud account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateResourceGroup  CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateRole  CreateRoleRequest
     * @return CreateRoleResponse
     */
    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    /**
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of DeclineHandshake  DeclineHandshakeRequest
     * @return DeclineHandshakeResponse
     */
    CompletableFuture<DeclineHandshakeResponse> declineHandshake(DeclineHandshakeRequest request);

    /**
     * <b>description</b> :
     * <p>The ID of the member that you want to delete.</p>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * @param request the request parameters of DeleteAutoGroupingRule  DeleteAutoGroupingRuleRequest
     * @return DeleteAutoGroupingRuleResponse
     */
    CompletableFuture<DeleteAutoGroupingRuleResponse> deleteAutoGroupingRule(DeleteAutoGroupingRuleRequest request);

    /**
     * <b>description</b> :
     * <p>If you want to delete a custom control policy that is attached to folders or member accounts, you must call the <a href="https://help.aliyun.com/document_detail/208331.html">DetachControlPolicy</a> operation to detach the policy before you delete it.
     * In this example, the custom control policy <code>cp-SImPt8GCEwiq****</code> is deleted.</p>
     * 
     * @param request the request parameters of DeleteControlPolicy  DeleteControlPolicyRequest
     * @return DeleteControlPolicyResponse
     */
    CompletableFuture<DeleteControlPolicyResponse> deleteControlPolicy(DeleteControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you delete a folder, make sure that the folder does not contain any member accounts or child folders.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteFolder  DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Before you delete a policy, you must delete all non-default versions of the policy. For more information about how to delete a policy version, see <a href="https://help.aliyun.com/document_detail/159041.html">DeletePolicyVersion</a>.</li>
     * <li>Before you delete a policy, make sure that the policy is not referenced. This means that the policy is not attached to RAM users, RAM user groups, or RAM roles. For more information about how to detach a policy, see <a href="https://help.aliyun.com/document_detail/159168.html">DetachPolicy</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The default version of a permission policy cannot be deleted.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeletePolicyVersion  DeletePolicyVersionRequest
     * @return DeletePolicyVersionResponse
     */
    CompletableFuture<DeletePolicyVersionResponse> deletePolicyVersion(DeletePolicyVersionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you delete a resource group, you must delete all the resources in it.
     * In this example, the resource group whose ID is <code>rg-9gLOoK****</code> is deleted.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteResourceGroup  DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request);

    /**
     * @param request the request parameters of DeleteRole  DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    /**
     * @param request the request parameters of DeleteServiceLinkedRole  DeleteServiceLinkedRoleRequest
     * @return DeleteServiceLinkedRoleResponse
     */
    CompletableFuture<DeleteServiceLinkedRoleResponse> deleteServiceLinkedRole(DeleteServiceLinkedRoleRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If the delegated administrator account that you want to remove has historical management tasks in the related trusted service, the trusted service may be affected after the delegated administrator account is removed. Therefore, proceed with caution.
     * This topic provides an example on how to call the API operation to remove the delegated administrator account <code>181761095690****</code> for Cloud Firewall.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeregisterDelegatedAdministrator  DeregisterDelegatedAdministratorRequest
     * @return DeregisterDelegatedAdministratorResponse
     */
    CompletableFuture<DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministrator(DeregisterDelegatedAdministratorRequest request);

    /**
     * <b>description</b> :
     * <p>Before you disable a resource directory, make sure that the following requirements are met:</p>
     * <ul>
     * <li>All member accounts must be removed from the resource directory. For more information about how to remove a member account, see <a href="https://help.aliyun.com/document_detail/159431.html">RemoveCloudAccount</a>.</li>
     * <li>All folders except the root folder must be deleted from the resource directory. For more information about how to delete a folder, see <a href="https://help.aliyun.com/document_detail/159432.html">DeleteFolder</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DestroyResourceDirectory  DestroyResourceDirectoryRequest
     * @return DestroyResourceDirectoryResponse
     */
    CompletableFuture<DestroyResourceDirectoryResponse> destroyResourceDirectory(DestroyResourceDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>After you detach an access control policy, the operations performed on resources by using members are not limited by the policy. Make sure that the detached policy meets your expectations. Otherwise, your business may be affected.
     * Both the system and custom access control policies can be detached. If an object has only one access control policy attached, the policy cannot be detached.
     * This topic provides an example on how to call the API operation to detach the custom control policy <code>cp-jExXAqIYkwHN****</code> from the folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * @param request the request parameters of DetachControlPolicy  DetachControlPolicyRequest
     * @return DetachControlPolicyResponse
     */
    CompletableFuture<DetachControlPolicyResponse> detachControlPolicy(DetachControlPolicyRequest request);

    /**
     * @param request the request parameters of DetachPolicy  DetachPolicyRequest
     * @return DetachPolicyResponse
     */
    CompletableFuture<DetachPolicyResponse> detachPolicy(DetachPolicyRequest request);

    /**
     * @param request the request parameters of DisableAssociatedTransfer  DisableAssociatedTransferRequest
     * @return DisableAssociatedTransferResponse
     */
    CompletableFuture<DisableAssociatedTransferResponse> disableAssociatedTransfer(DisableAssociatedTransferRequest request);

    /**
     * @param request the request parameters of DisableAutoGrouping  DisableAutoGroupingRequest
     * @return DisableAutoGroupingResponse
     */
    CompletableFuture<DisableAutoGroupingResponse> disableAutoGrouping(DisableAutoGroupingRequest request);

    /**
     * <b>description</b> :
     * <p>After you disable the Control Policy feature, the system automatically detaches all control policies that are attached to folders and member accounts. The system does not delete these control policies, but you cannot attach them to folders or member accounts again.</p>
     * <blockquote>
     * <p> If you disable the Control Policy feature, the permissions of all folders and member accounts in a resource directory are affected. You must proceed with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DisableControlPolicy  DisableControlPolicyRequest
     * @return DisableControlPolicyResponse
     */
    CompletableFuture<DisableControlPolicyResponse> disableControlPolicy(DisableControlPolicyRequest request);

    /**
     * @param request the request parameters of EnableAssociatedTransfer  EnableAssociatedTransferRequest
     * @return EnableAssociatedTransferResponse
     */
    CompletableFuture<EnableAssociatedTransferResponse> enableAssociatedTransfer(EnableAssociatedTransferRequest request);

    /**
     * @param request the request parameters of EnableAutoGrouping  EnableAutoGroupingRequest
     * @return EnableAutoGroupingResponse
     */
    CompletableFuture<EnableAutoGroupingResponse> enableAutoGrouping(EnableAutoGroupingRequest request);

    /**
     * <b>description</b> :
     * <p>The Control Policy feature allows you to manage the permission boundaries of the folders or member accounts in a resource directory in a centralized manner. This feature is implemented based on the resource directory. You can use this feature to develop common or dedicated rules for access control. The Control Policy feature does not grant permissions but only defines permission boundaries. A member account in a resource directory can be used to access resources only after it is granted the required permissions by using the Resource Access Management (RAM) service. For more information, see <a href="https://help.aliyun.com/document_detail/178671.html">Overview of the Control Policy feature</a>.</p>
     * 
     * @param request the request parameters of EnableControlPolicy  EnableControlPolicyRequest
     * @return EnableControlPolicyResponse
     */
    CompletableFuture<EnableControlPolicyResponse> enableControlPolicy(EnableControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can use the current account or a newly created account to enable a resource directory. For more information, see <a href="https://help.aliyun.com/document_detail/111215.html">Enable a resource directory</a>.
     * In this example, the current account is used to enable a resource directory.</p>
     * 
     * @param request the request parameters of EnableResourceDirectory  EnableResourceDirectoryRequest
     * @return EnableResourceDirectoryResponse
     */
    CompletableFuture<EnableResourceDirectoryResponse> enableResourceDirectory(EnableResourceDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the information of the member whose Alibaba Cloud account ID is <code>181761095690****</code>.</p>
     * 
     * @param request the request parameters of GetAccount  GetAccountRequest
     * @return GetAccountResponse
     */
    CompletableFuture<GetAccountResponse> getAccount(GetAccountRequest request);

    /**
     * <b>description</b> :
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/448542.html">CheckAccountDelete</a> operation to perform a member deletion check, you can call the GetAccountDeletionCheckResult operation to query the check result. If the check result shows that the member meets deletion requirements, you can delete the member. Otherwise, you need to first modify the items that do not meet requirements.
     * This topic provides an example on how to call the API operation to query the result of the deletion check for the member whose ID is <code>179855839641****</code>. The response shows that the member does not meet deletion requirements.</p>
     * 
     * @param request the request parameters of GetAccountDeletionCheckResult  GetAccountDeletionCheckResultRequest
     * @return GetAccountDeletionCheckResultResponse
     */
    CompletableFuture<GetAccountDeletionCheckResultResponse> getAccountDeletionCheckResult(GetAccountDeletionCheckResultRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the deletion status of the member whose Alibaba Cloud account ID is <code>169946124551****</code>. The response shows that the member is deleted.</p>
     * 
     * @param request the request parameters of GetAccountDeletionStatus  GetAccountDeletionStatusRequest
     * @return GetAccountDeletionStatusResponse
     */
    CompletableFuture<GetAccountDeletionStatusResponse> getAccountDeletionStatus(GetAccountDeletionStatusRequest request);

    /**
     * @param request the request parameters of GetAutoGroupingRule  GetAutoGroupingRuleRequest
     * @return GetAutoGroupingRuleResponse
     */
    CompletableFuture<GetAutoGroupingRuleResponse> getAutoGroupingRule(GetAutoGroupingRuleRequest request);

    /**
     * @param request the request parameters of GetAutoGroupingStatus  GetAutoGroupingStatusRequest
     * @return GetAutoGroupingStatusResponse
     */
    CompletableFuture<GetAutoGroupingStatusResponse> getAutoGroupingStatus(GetAutoGroupingStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the details of the access control policy whose ID is <code>cp-SImPt8GCEwiq****</code>.</p>
     * 
     * @param request the request parameters of GetControlPolicy  GetControlPolicyRequest
     * @return GetControlPolicyResponse
     */
    CompletableFuture<GetControlPolicyResponse> getControlPolicy(GetControlPolicyRequest request);

    /**
     * @param request the request parameters of GetControlPolicyEnablementStatus  GetControlPolicyEnablementStatusRequest
     * @return GetControlPolicyEnablementStatusResponse
     */
    CompletableFuture<GetControlPolicyEnablementStatusResponse> getControlPolicyEnablementStatus(GetControlPolicyEnablementStatusRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the information of the folder <code>fd-Jyl5U7****</code> is queried.</p>
     * 
     * @param request the request parameters of GetFolder  GetFolderRequest
     * @return GetFolderResponse
     */
    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the information of the invitation whose ID is <code>h-ycm4rp****</code> is queried.</p>
     * 
     * @param request the request parameters of GetHandshake  GetHandshakeRequest
     * @return GetHandshakeResponse
     */
    CompletableFuture<GetHandshakeResponse> getHandshake(GetHandshakeRequest request);

    /**
     * @param request the request parameters of GetPayerForAccount  GetPayerForAccountRequest
     * @return GetPayerForAccountResponse
     */
    CompletableFuture<GetPayerForAccountResponse> getPayerForAccount(GetPayerForAccountRequest request);

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
     * <b>description</b> :
     * <p>This topic provides an example on how to use a management account to call the API operation to query the information of the resource directory that is enabled by using the management account.</p>
     * 
     * @param request the request parameters of GetResourceDirectory  GetResourceDirectoryRequest
     * @return GetResourceDirectoryResponse
     */
    CompletableFuture<GetResourceDirectoryResponse> getResourceDirectory(GetResourceDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about common request parameters, see <a href="https://help.aliyun.com/document_detail/159973.html">Common parameters</a>.</p>
     * 
     * @param request the request parameters of GetResourceGroup  GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request);

    /**
     * @param request the request parameters of GetRole  GetRoleRequest
     * @return GetRoleResponse
     */
    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    /**
     * @param request the request parameters of GetServiceLinkedRoleDeletionStatus  GetServiceLinkedRoleDeletionStatusRequest
     * @return GetServiceLinkedRoleDeletionStatusResponse
     */
    CompletableFuture<GetServiceLinkedRoleDeletionStatusResponse> getServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>An account can be used to enable a resource directory only after it passes enterprise real-name verification. An account that only passed individual real-name verification cannot be used to enable a resource directory.</li>
     * <li>We recommend that you only use the enterprise management account as the administrator of the resource directory. Do not use the enterprise management account to purchase cloud resources.</li>
     * </ul>
     * 
     * @param request the request parameters of InitResourceDirectory  InitResourceDirectoryRequest
     * @return InitResourceDirectoryResponse
     */
    CompletableFuture<InitResourceDirectoryResponse> initResourceDirectory(InitResourceDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to invite the account <code>someone@example.com</code> to join a resource directory.</p>
     * 
     * @param request the request parameters of InviteAccountToResourceDirectory  InviteAccountToResourceDirectoryRequest
     * @return InviteAccountToResourceDirectoryResponse
     */
    CompletableFuture<InviteAccountToResourceDirectoryResponse> inviteAccountToResourceDirectory(InviteAccountToResourceDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>You can use only the management account of a resource directory or a delegated administrator account of a trusted service to call this operation.</p>
     * 
     * @param request the request parameters of ListAccounts  ListAccountsRequest
     * @return ListAccountsResponse
     */
    CompletableFuture<ListAccountsResponse> listAccounts(ListAccountsRequest request);

    /**
     * @param request the request parameters of ListAccountsForParent  ListAccountsForParentRequest
     * @return ListAccountsForParentResponse
     */
    CompletableFuture<ListAccountsForParentResponse> listAccountsForParent(ListAccountsForParentRequest request);

    /**
     * @param request the request parameters of ListAncestors  ListAncestorsRequest
     * @return ListAncestorsResponse
     */
    CompletableFuture<ListAncestorsResponse> listAncestors(ListAncestorsRequest request);

    /**
     * @param request the request parameters of ListAssociatedTransferSetting  ListAssociatedTransferSettingRequest
     * @return ListAssociatedTransferSettingResponse
     */
    CompletableFuture<ListAssociatedTransferSettingResponse> listAssociatedTransferSetting(ListAssociatedTransferSettingRequest request);

    /**
     * @param request the request parameters of ListAutoGroupingRules  ListAutoGroupingRulesRequest
     * @return ListAutoGroupingRulesResponse
     */
    CompletableFuture<ListAutoGroupingRulesResponse> listAutoGroupingRules(ListAutoGroupingRulesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the system access control policies within a resource directory. The response shows that the resource directory has only one system access control policy. The policy is named <code>FullAliyunAccess</code>.</p>
     * 
     * @param request the request parameters of ListControlPolicies  ListControlPoliciesRequest
     * @return ListControlPoliciesResponse
     */
    CompletableFuture<ListControlPoliciesResponse> listControlPolicies(ListControlPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the access control policies that are attached to the folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * @param request the request parameters of ListControlPolicyAttachmentsForTarget  ListControlPolicyAttachmentsForTargetRequest
     * @return ListControlPolicyAttachmentsForTargetResponse
     */
    CompletableFuture<ListControlPolicyAttachmentsForTargetResponse> listControlPolicyAttachmentsForTarget(ListControlPolicyAttachmentsForTargetRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query all delegated administrator accounts in a resource directory. The response shows that two delegated administrator accounts for Cloud Firewall exist in the resource directory.</p>
     * 
     * @param request the request parameters of ListDelegatedAdministrators  ListDelegatedAdministratorsRequest
     * @return ListDelegatedAdministratorsResponse
     */
    CompletableFuture<ListDelegatedAdministratorsResponse> listDelegatedAdministrators(ListDelegatedAdministratorsRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the trusted services for which the member <code>138660628348****</code> is specified as a delegated administrator account. The response shows that the member is specified as a delegated administrator account of Cloud Firewall.</p>
     * 
     * @param request the request parameters of ListDelegatedServicesForAccount  ListDelegatedServicesForAccountRequest
     * @return ListDelegatedServicesForAccountResponse
     */
    CompletableFuture<ListDelegatedServicesForAccountResponse> listDelegatedServicesForAccount(ListDelegatedServicesForAccountRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can view the information of only the first-level subfolders of a folder.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListFoldersForParent  ListFoldersForParentRequest
     * @return ListFoldersForParentResponse
     */
    CompletableFuture<ListFoldersForParentResponse> listFoldersForParent(ListFoldersForParentRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the invitations that are associated with the management account <code>172841235500****</code>. The response shows that two invitations are associated with the management account.</p>
     * 
     * @param request the request parameters of ListHandshakesForAccount  ListHandshakesForAccountRequest
     * @return ListHandshakesForAccountResponse
     */
    CompletableFuture<ListHandshakesForAccountResponse> listHandshakesForAccount(ListHandshakesForAccountRequest request);

    /**
     * @param request the request parameters of ListHandshakesForResourceDirectory  ListHandshakesForResourceDirectoryRequest
     * @return ListHandshakesForResourceDirectoryResponse
     */
    CompletableFuture<ListHandshakesForResourceDirectoryResponse> listHandshakesForResourceDirectory(ListHandshakesForResourceDirectoryRequest request);

    /**
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>You can view the following information:</p>
     * <ul>
     * <li>Policy attachment records under an Alibaba Cloud account or a resource group</li>
     * <li>Policies attached to RAM users, RAM user groups, or RAM roles</li>
     * <li>RAM users, RAM user groups, or RAM roles to which policies are attached under an Alibaba Cloud account or a resource group</li>
     * </ul>
     * 
     * @param request the request parameters of ListPolicyAttachments  ListPolicyAttachmentsRequest
     * @return ListPolicyAttachmentsResponse
     */
    CompletableFuture<ListPolicyAttachmentsResponse> listPolicyAttachments(ListPolicyAttachmentsRequest request);

    /**
     * @param request the request parameters of ListPolicyVersions  ListPolicyVersionsRequest
     * @return ListPolicyVersionsResponse
     */
    CompletableFuture<ListPolicyVersionsResponse> listPolicyVersions(ListPolicyVersionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation to query all resource groups within the current account. You can also call this API operation to query a specific resource group based on the status, ID, identifier, or display name of the resource group.
     * This topic provides an example on how to call the API operation to query the basic information about the resource groups <code>rg-1hSBH2****</code> and <code>rg-9gLOoK****</code> within the current account.</p>
     * 
     * @param request the request parameters of ListResourceGroups  ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can use a RAM role that is not associated with a session policy to call this API operation.
     * This topic provides an example on how to call the API operation to query resources that can be accessed by the current account in resource groups. The response shows that the current account can access only the Elastic Compute Service (ECS) instance <code>i-23v38****</code> in the resource group <code>rg-uPJpP****</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    /**
     * @param request the request parameters of ListRoles  ListRolesRequest
     * @return ListRolesResponse
     */
    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query tag keys. The response shows that the custom tag key team exists.</p>
     * 
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the tags that are added to the resource group with an ID of <code>rg-aekz6bre2uq****</code>. The response shows that only the <code>k1:v1</code> tag is added to the resource group.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to query the tag values of the tag key k1. The response shows that the tag value of the tag key k1 is v1.</p>
     * 
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the folders or member accounts to which the control policy <code>cp-jExXAqIYkwHN****</code> is attached are queried. The returned result shows that the control policy is attached to the folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * @param request the request parameters of ListTargetAttachmentsForControlPolicy  ListTargetAttachmentsForControlPolicyRequest
     * @return ListTargetAttachmentsForControlPolicyResponse
     */
    CompletableFuture<ListTargetAttachmentsForControlPolicyResponse> listTargetAttachmentsForControlPolicy(ListTargetAttachmentsForControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Only an enterprise management account or delegated administrator account can be used to call this operation.
     * In this example, the trusted services that are enabled within an enterprise management account are queried. The returned result shows that the trusted services Cloud Config and ActionTrail are enabled within the enterprise management account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListTrustedServiceStatus  ListTrustedServiceStatusRequest
     * @return ListTrustedServiceStatusResponse
     */
    CompletableFuture<ListTrustedServiceStatusResponse> listTrustedServiceStatus(ListTrustedServiceStatusRequest request);

    /**
     * @param request the request parameters of MoveAccount  MoveAccountRequest
     * @return MoveAccountResponse
     */
    CompletableFuture<MoveAccountResponse> moveAccount(MoveAccountRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about Alibaba Cloud services whose resources can be moved between resource groups, see the <strong>Supported by the API</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Alibaba Cloud services that support resource groups</a>.
     * In this example, two virtual private clouds (VPCs) <code>vpc-bp1sig0mjktx5ewx1****</code> and <code>vpc-bp1visxm225pv49dz****</code> that reside in different regions and belong to different resource groups are moved to the resource group <code>rg-aekzmeobk5w****</code>.</p>
     * 
     * @param request the request parameters of MoveResources  MoveResourcesRequest
     * @return MoveResourcesResponse
     */
    CompletableFuture<MoveResourcesResponse> moveResources(MoveResourcesRequest request);

    /**
     * @param request the request parameters of PromoteResourceAccount  PromoteResourceAccountRequest
     * @return PromoteResourceAccountResponse
     */
    CompletableFuture<PromoteResourceAccountResponse> promoteResourceAccount(PromoteResourceAccountRequest request);

    /**
     * <b>description</b> :
     * <p>The delegated administrator account can be used to access the information of the resource directory and view the structure and members of the resource directory. The delegated administrator account can also be used to perform service-related management operations in the trusted service on behalf of the management account of the resource directory.
     * When you call this operation, you must take note of the following limits:</p>
     * <ul>
     * <li>Only some trusted services support delegated administrator accounts. For more information, see <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</li>
     * <li>Only the management account of a resource directory or an authorized RAM user or RAM role of the management account can be used to call this operation.</li>
     * <li>The number of delegated administrator accounts that are allowed for a trusted service is defined by the trusted service.
     * This topic provides an example on how to call the API operation to specify the member <code>181761095690****</code> as a delegated administrator account of Cloud Firewall.</li>
     * </ul>
     * 
     * @param request the request parameters of RegisterDelegatedAdministrator  RegisterDelegatedAdministratorRequest
     * @return RegisterDelegatedAdministratorResponse
     */
    CompletableFuture<RegisterDelegatedAdministratorResponse> registerDelegatedAdministrator(RegisterDelegatedAdministratorRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to remove the member <code>177242285274****</code> from a resource directory.</p>
     * 
     * @param request the request parameters of RemoveCloudAccount  RemoveCloudAccountRequest
     * @return RemoveCloudAccountResponse
     */
    CompletableFuture<RemoveCloudAccountResponse> removeCloudAccount(RemoveCloudAccountRequest request);

    /**
     * @param request the request parameters of ResendCreateCloudAccountEmail  ResendCreateCloudAccountEmailRequest
     * @return ResendCreateCloudAccountEmailResponse
     */
    CompletableFuture<ResendCreateCloudAccountEmailResponse> resendCreateCloudAccountEmail(ResendCreateCloudAccountEmailRequest request);

    /**
     * @param request the request parameters of ResendPromoteResourceAccountEmail  ResendPromoteResourceAccountEmailRequest
     * @return ResendPromoteResourceAccountEmailResponse
     */
    CompletableFuture<ResendPromoteResourceAccountEmailResponse> resendPromoteResourceAccountEmail(ResendPromoteResourceAccountEmailRequest request);

    /**
     * @param request the request parameters of RetryChangeAccountEmail  RetryChangeAccountEmailRequest
     * @return RetryChangeAccountEmailResponse
     */
    CompletableFuture<RetryChangeAccountEmailResponse> retryChangeAccountEmail(RetryChangeAccountEmailRequest request);

    /**
     * <b>description</b> :
     * <p>To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.
     * In this example, a verification code is sent to the mobile phone number that you want to bind to the resource account <code>138660628348****</code>.</p>
     * 
     * @param request the request parameters of SendVerificationCodeForBindSecureMobilePhone  SendVerificationCodeForBindSecureMobilePhoneRequest
     * @return SendVerificationCodeForBindSecureMobilePhoneResponse
     */
    CompletableFuture<SendVerificationCodeForBindSecureMobilePhoneResponse> sendVerificationCodeForBindSecureMobilePhone(SendVerificationCodeForBindSecureMobilePhoneRequest request);

    /**
     * <b>description</b> :
     * <p>Each Alibaba Cloud account can be used to send a maximum of 100 verification codes per day.</p>
     * 
     * @param request the request parameters of SendVerificationCodeForEnableRD  SendVerificationCodeForEnableRDRequest
     * @return SendVerificationCodeForEnableRDResponse
     */
    CompletableFuture<SendVerificationCodeForEnableRDResponse> sendVerificationCodeForEnableRD(SendVerificationCodeForEnableRDRequest request);

    /**
     * @param request the request parameters of SetDefaultPolicyVersion  SetDefaultPolicyVersionRequest
     * @return SetDefaultPolicyVersionResponse
     */
    CompletableFuture<SetDefaultPolicyVersionResponse> setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request);

    /**
     * <b>description</b> :
     * <p>Members of the resource account type can be deleted only after the member deletion feature is enabled.</p>
     * 
     * @param request the request parameters of SetMemberDeletionPermission  SetMemberDeletionPermissionRequest
     * @return SetMemberDeletionPermissionResponse
     */
    CompletableFuture<SetMemberDeletionPermissionResponse> setMemberDeletionPermission(SetMemberDeletionPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to add the tag <code>k1:v1</code> to the resource group with an ID of <code>rg-aekz6bre2uq****</code>.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the API operation to remove the tag whose tag key is <code>k1</code> from the resource group whose ID is <code>rg-aek2dpwyrfr****</code>.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>  To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.</p>
     * <ul>
     * <li>Before you switch the type of a member from resource account to cloud account, make sure that specific conditions are met. For more information about the conditions, see <a href="https://help.aliyun.com/document_detail/111233.html">Switch a resource account to a cloud account</a>.</li>
     * <li>Before you switch the type of a member from cloud account to resource account, make sure that specific conditions are met. For more information about the conditions, see <a href="https://help.aliyun.com/document_detail/209980.html">Switch a cloud account to a resource account</a>.
     * This example provides an example on how to call the API operation to change the display name of the member <code>12323344****</code> to <code>admin</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAccount  UpdateAccountRequest
     * @return UpdateAccountResponse
     */
    CompletableFuture<UpdateAccountResponse> updateAccount(UpdateAccountRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the resources that support the Transfer Associated Resources feature, see <a href="https://help.aliyun.com/document_detail/606232.html">Use the Transfer Associated Resources feature</a>.</p>
     * 
     * @param request the request parameters of UpdateAssociatedTransferSetting  UpdateAssociatedTransferSettingRequest
     * @return UpdateAssociatedTransferSettingResponse
     */
    CompletableFuture<UpdateAssociatedTransferSettingResponse> updateAssociatedTransferSetting(UpdateAssociatedTransferSettingRequest request);

    /**
     * @param request the request parameters of UpdateAutoGroupingConfig  UpdateAutoGroupingConfigRequest
     * @return UpdateAutoGroupingConfigResponse
     */
    CompletableFuture<UpdateAutoGroupingConfigResponse> updateAutoGroupingConfig(UpdateAutoGroupingConfigRequest request);

    /**
     * @param request the request parameters of UpdateAutoGroupingRule  UpdateAutoGroupingRuleRequest
     * @return UpdateAutoGroupingRuleResponse
     */
    CompletableFuture<UpdateAutoGroupingRuleResponse> updateAutoGroupingRule(UpdateAutoGroupingRuleRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the name of the access control policy whose ID is <code>cp-jExXAqIYkwHN****</code> is changed to <code>NewControlPolicy</code>.</p>
     * 
     * @param request the request parameters of UpdateControlPolicy  UpdateControlPolicyRequest
     * @return UpdateControlPolicyResponse
     */
    CompletableFuture<UpdateControlPolicyResponse> updateControlPolicy(UpdateControlPolicyRequest request);

    /**
     * @param request the request parameters of UpdateFolder  UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the display name of the resource group <code>rg-9gLOoK****</code> is changed to <code>project</code>.</p>
     * 
     * @param request the request parameters of UpdateResourceGroup  UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     */
    CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the description of the RAM role <code>ECSAdmin</code> is updated to <code>ECS administrator</code>.</p>
     * 
     * @param request the request parameters of UpdateRole  UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

}
