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
     * <p>After the invited Alibaba Cloud account successfully joins a resource directory, the account becomes a member of the resource directory. The resource directory uses the name of the invited Alibaba Cloud account as the display name and account name of the member by default.
     * This topic provides an example on how the invited Alibaba Cloud account <code>177242285274****</code> accepts an invitation from the resource directory <code>rd-3G****</code>. The handshake ID is <code>h-Ih8IuPfvV0t0****</code>.</p>
     * 
     * @param request the request parameters of AcceptHandshake  AcceptHandshakeRequest
     * @return AcceptHandshakeResponse
     */
    CompletableFuture<AcceptHandshakeResponse> acceptHandshake(AcceptHandshakeRequest request);

    /**
     * <b>description</b> :
     * <p>After the control policy is attached, the resource folder or member immediately becomes subject to the control policy. Make sure that the result of the attach operation is as expected to avoid affecting your business.
     * The system attaches the system policy FullAliyunAccess to resource folders and members by default.
     * A control policy takes effect on the entire node to which it is attached. A control policy attached to a parent resource folder also takes effect on its child resource folders and members.
     * Each node (resource folder or member) can have a maximum of 10 control policies attached.
     * This topic provides an example on how to attach the custom policy <code>cp-jExXAqIYkwHN****</code> to the resource folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * @param request the request parameters of AttachControlPolicy  AttachControlPolicyRequest
     * @return AttachControlPolicyResponse
     */
    CompletableFuture<AttachControlPolicyResponse> attachControlPolicy(AttachControlPolicyRequest request);

    /**
     * @param request the request parameters of AttachPolicy  AttachPolicyRequest
     * @return AttachPolicyResponse
     */
    CompletableFuture<AttachPolicyResponse> attachPolicy(AttachPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>This API operation is used only to set a secure phone number for a resource account for the first time. It cannot be used to modify an existing secure phone number.
     * To ensure that the system can record the specific author of management operations, use a Resource Access Management (RAM) user or RAM role under the management account that has the resource folder management permission (AliyunResourceDirectoryFullAccess) to invoke this API operation.
     * This topic provides an example of how to set a secure phone number for the member <code>138660628348****</code>.</p>
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
     * <p>This topic provides an example on how to cancel the handshake whose ID is <code>h-ycm4rp****</code>.</p>
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
     * <p>Before deleting a member account, call this API to perform a pre-deletion condition check on the target member account.</p>
     * 
     * @param request the request parameters of CheckAccountDelete  CheckAccountDeleteRequest
     * @return CheckAccountDeleteResponse
     */
    CompletableFuture<CheckAccountDeleteResponse> checkAccountDelete(CheckAccountDeleteRequest request);

    /**
     * <b>description</b> :
     * <p>You can create up to 10 custom allocation rules, and each custom allocation rule supports up to 10 rule content entries.</p>
     * 
     * @param request the request parameters of CreateAutoGroupingRule  CreateAutoGroupingRuleRequest
     * @return CreateAutoGroupingRuleResponse
     */
    CompletableFuture<CreateAutoGroupingRuleResponse> createAutoGroupingRule(CreateAutoGroupingRuleRequest request);

    /**
     * <b>description</b> :
     * <p>A resource directory contains two types of members: resource accounts and cloud accounts. </p>
     * <ul>
     * <li>Resource account (recommended): A resource account serves only as a resource container and fully depends on the resource directory. It is a more secure account type that is easier to create. To create a resource account type member, see <a href="https://help.aliyun.com/document_detail/159392.html">CreateResourceAccount</a>. <blockquote>
     * <p>A resource account can also be upgraded to a cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/159395.html">PromoteResourceAccount</a>.</p>
     * </blockquote>
     * </li>
     * <li>Cloud account: A cloud account has all the features of an Alibaba Cloud account, including root logon access.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCloudAccount  CreateCloudAccountRequest
     * @return CreateCloudAccountResponse
     */
    CompletableFuture<CreateCloudAccountResponse> createCloudAccount(CreateCloudAccountRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a control policy named <code>ExampleControlPolicy</code> that prohibits modifications to the ResourceDirectoryAccountAccessRole role and its permissions.</p>
     * 
     * @param request the request parameters of CreateControlPolicy  CreateControlPolicyRequest
     * @return CreateControlPolicyResponse
     */
    CompletableFuture<CreateControlPolicyResponse> createControlPolicy(CreateControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can create a maximum of five levels of resource folders.
     * This topic provides an example of how to create a resource folder named <code>rdFolder</code> under the Root folder.</p>
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
     * <p>In a resource directory, a member serves as a resource container and is a resource grouping unit. A member typically represents a project or application. Resources in each member are physically isolated from resources in other members.</p>
     * 
     * @param request the request parameters of CreateResourceAccount  CreateResourceAccountRequest
     * @return CreateResourceAccountResponse
     */
    CompletableFuture<CreateResourceAccountResponse> createResourceAccount(CreateResourceAccountRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can create a maximum of 30 resource groups within an Alibaba Cloud account.</p>
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
     * <p>Before deleting a member, call <a href="https://help.aliyun.com/document_detail/448542.html">CheckAccountDelete</a> and <a href="https://help.aliyun.com/document_detail/448775.html">GetAccountDeletionCheckResult</a> to perform a pre-deletion check on the member. Only members that meet the deletion conditions can be successfully deleted by calling DeleteAccount.
     * After you successfully submit a member deletion request, you can call <a href="https://help.aliyun.com/document_detail/449001.html">GetAccountDeletionStatus</a> to query the deletion status. Once a member is deleted, all resources and data in the member are deleted. You can no longer log on to or use the member, and the data cannot be recovered. Proceed with caution. For more information about member deletion, see <a href="https://help.aliyun.com/document_detail/446078.html">Delete a member of the resource account type</a>.</p>
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
     * <p>To delete a custom control policy that is attached to a resource folder or member accounts, invoke <a href="https://help.aliyun.com/document_detail/208331.html">DetachControlPolicy</a> to detach the policy first.
     * This topic provides an example on how to delete the custom control policy cp-SImPt8GCEwiq****.</p>
     * 
     * @param request the request parameters of DeleteControlPolicy  DeleteControlPolicyRequest
     * @return DeleteControlPolicyResponse
     */
    CompletableFuture<DeleteControlPolicyResponse> deleteControlPolicy(DeleteControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before deleting a folder, make sure that the folder does not contain any member accounts or subfolders.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteFolder  DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Before deleting an access policy, delete all non-default versions of the policy. For information about how to delete a policy version, see <a href="https://help.aliyun.com/document_detail/159041.html">DeletePolicyVersion</a>.</li>
     * <li>Before deleting an access policy, make sure that the policy is not referenced, meaning it is not attached to any Resource Access Management (RAM) user, user group, or RAM role. For information about how to remove an authorization, see <a href="https://help.aliyun.com/document_detail/159168.html">DetachPolicy</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The default version of an access policy cannot be deleted.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeletePolicyVersion  DeletePolicyVersionRequest
     * @return DeletePolicyVersionResponse
     */
    CompletableFuture<DeletePolicyVersionResponse> deletePolicyVersion(DeletePolicyVersionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you delete a resource group, delete all resources in the resource group.</p>
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
     * <p>If the delegated administrator account being removed has historical management tasks in the trusted service, the removal may affect the normal use of the trusted service. Carefully consider the potential impact before performing the removal.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeregisterDelegatedAdministrator  DeregisterDelegatedAdministratorRequest
     * @return DeregisterDelegatedAdministratorResponse
     */
    CompletableFuture<DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministrator(DeregisterDelegatedAdministratorRequest request);

    /**
     * <b>description</b> :
     * <p>Before closing a resource directory, make sure that you have completed the following operations:</p>
     * <ul>
     * <li>All members in the resource directory have been removed. For information about how to remove a member, see <a href="https://help.aliyun.com/document_detail/159431.html">RemoveCloudAccount</a>.</li>
     * <li>All folders except the Root folder in the resource directory have been deleted. For information about how to delete a folder, see <a href="https://help.aliyun.com/document_detail/159432.html">DeleteFolder</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DestroyResourceDirectory  DestroyResourceDirectoryRequest
     * @return DestroyResourceDirectoryResponse
     */
    CompletableFuture<DestroyResourceDirectoryResponse> destroyResourceDirectory(DestroyResourceDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>After the control policy is detached, the resource folder or member that was previously associated with the policy immediately loses the governance enforced by the policy. Make sure that the result of the detach operation is as expected to avoid impact on your business.
     * Both system policies and custom control policies can be detached. However, the last control policy associated with a resource folder or member cannot be detached.
     * This topic provides an example on how to detach the custom policy <code>cp-jExXAqIYkwHN****</code> from the resource folder <code>fd-ZDNPiT****</code>.</p>
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
     * <p>After you disable the control policy feature, all control policies that are attached to resource folders and member accounts are automatically detached. However, the control policies are not deleted. They cannot be attached to any target nodes.</p>
     * <blockquote>
     * <p>Disabling the control policy feature affects the permissions of resource folders and member accounts in the entire resource directory. Proceed with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DisableControlPolicy  DisableControlPolicyRequest
     * @return DisableControlPolicyResponse
     */
    CompletableFuture<DisableControlPolicyResponse> disableControlPolicy(DisableControlPolicyRequest request);

    /**
     * @param request the request parameters of DisableResourceGroupNotification  DisableResourceGroupNotificationRequest
     * @return DisableResourceGroupNotificationResponse
     */
    CompletableFuture<DisableResourceGroupNotificationResponse> disableResourceGroupNotification(DisableResourceGroupNotificationRequest request);

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
     * <p>A resource directory control policy is an access control policy based on the resource structure (resource folders or member accounts). It allows you to centrally manage the access permissions border for resource access at each level of the resource directory and establish overall or localized access control principles for your enterprise. Control policies define only the access permissions border and do not actually grant permissions. You must also set permissions by using Resource Access Management (RAM) in a member account before the corresponding identity can have access permissions to resources. For more information, see <a href="https://help.aliyun.com/document_detail/178671.html">Overview of control policies</a>.</p>
     * 
     * @param request the request parameters of EnableControlPolicy  EnableControlPolicyRequest
     * @return EnableControlPolicyResponse
     */
    CompletableFuture<EnableControlPolicyResponse> enableControlPolicy(EnableControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can enable a resource directory by using the current logon account or by creating a new management account. For more information, refer to <a href="https://help.aliyun.com/document_detail/111215.html">Enable a resource directory</a>.
     * This topic provides an example of how to enable a resource directory by using the current logon account.</p>
     * 
     * @param request the request parameters of EnableResourceDirectory  EnableResourceDirectoryRequest
     * @return EnableResourceDirectoryResponse
     */
    CompletableFuture<EnableResourceDirectoryResponse> enableResourceDirectory(EnableResourceDirectoryRequest request);

    /**
     * @param request the request parameters of EnableResourceGroupNotification  EnableResourceGroupNotificationRequest
     * @return EnableResourceGroupNotificationResponse
     */
    CompletableFuture<EnableResourceGroupNotificationResponse> enableResourceGroupNotification(EnableResourceGroupNotificationRequest request);

    /**
     * @param request the request parameters of GetAccount  GetAccountRequest
     * @return GetAccountResponse
     */
    CompletableFuture<GetAccountResponse> getAccount(GetAccountRequest request);

    /**
     * <b>description</b> :
     * <p>After you call <a href="https://help.aliyun.com/document_detail/448542.html">CheckAccountDelete</a> to perform a member deletion check task, you can call GetAccountDeletionCheckResult to query the result of the member deletion check. If the deletion check requirements are met, the member account can be deleted. Otherwise, manually handle the non-compliant items until all requirements are met.
     * This topic provides an example on how to query the deletion check result of the member account <code>179855839641****</code> that you want to delete. The response shows that the member account does not meet the deletion requirements.</p>
     * 
     * @param request the request parameters of GetAccountDeletionCheckResult  GetAccountDeletionCheckResultRequest
     * @return GetAccountDeletionCheckResultResponse
     */
    CompletableFuture<GetAccountDeletionCheckResultResponse> getAccountDeletionCheckResult(GetAccountDeletionCheckResultRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the deletion status of the member account <code>169946124551****</code>. The response shows that the member account has been successfully deleted.</p>
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
     * <p>This topic provides an example on how to query the details of the control policy whose ID is <code>cp-SImPt8GCEwiq****</code>.</p>
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
     * @param request the request parameters of GetFolder  GetFolderRequest
     * @return GetFolderResponse
     */
    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to retrieve the information about the handshake whose ID is <code>h-ycm4rp****</code>.</p>
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
     * <p>This topic provides an example of how to use a management account to query the details of the resource directory created by the management account.</p>
     * 
     * @param request the request parameters of GetResourceDirectory  GetResourceDirectoryRequest
     * @return GetResourceDirectoryResponse
     */
    CompletableFuture<GetResourceDirectoryResponse> getResourceDirectory(GetResourceDirectoryRequest request);

    /**
     * @param request the request parameters of GetResourceGroup  GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request);

    /**
     * @param request the request parameters of GetResourceGroupAdminSetting  GetResourceGroupAdminSettingRequest
     * @return GetResourceGroupAdminSettingResponse
     */
    CompletableFuture<GetResourceGroupAdminSettingResponse> getResourceGroupAdminSetting(GetResourceGroupAdminSettingRequest request);

    /**
     * @param request the request parameters of GetResourceGroupNotificationSetting  GetResourceGroupNotificationSettingRequest
     * @return GetResourceGroupNotificationSettingResponse
     */
    CompletableFuture<GetResourceGroupNotificationSettingResponse> getResourceGroupNotificationSetting(GetResourceGroupNotificationSettingRequest request);

    /**
     * @param request the request parameters of GetResourceGroupResourceCounts  GetResourceGroupResourceCountsRequest
     * @return GetResourceGroupResourceCountsResponse
     */
    CompletableFuture<GetResourceGroupResourceCountsResponse> getResourceGroupResourceCounts(GetResourceGroupResourceCountsRequest request);

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
     * <ul>
     * <li>Use an account that has passed enterprise real-name verification to enable a resource directory. An account that has passed only individual real-name verification cannot enable a resource directory.</li>
     * <li>Use the management account only as the administrator of the resource directory. Do not purchase cloud service resources with the management account.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of InitResourceDirectory  InitResourceDirectoryRequest
     * @return InitResourceDirectoryResponse
     */
    CompletableFuture<InitResourceDirectoryResponse> initResourceDirectory(InitResourceDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to invite the external account <code>someone@example.com</code> to join a resource directory.</p>
     * 
     * @param request the request parameters of InviteAccountToResourceDirectory  InviteAccountToResourceDirectoryRequest
     * @return InviteAccountToResourceDirectoryResponse
     */
    CompletableFuture<InviteAccountToResourceDirectoryResponse> inviteAccountToResourceDirectory(InviteAccountToResourceDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>The management account of the resource directory and the delegated administrator accounts of trusted services can call this operation.</p>
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
     * @param request the request parameters of ListAutoGroupingRemediations  ListAutoGroupingRemediationsRequest
     * @return ListAutoGroupingRemediationsResponse
     */
    CompletableFuture<ListAutoGroupingRemediationsResponse> listAutoGroupingRemediations(ListAutoGroupingRemediationsRequest request);

    /**
     * @param request the request parameters of ListAutoGroupingRules  ListAutoGroupingRulesRequest
     * @return ListAutoGroupingRulesResponse
     */
    CompletableFuture<ListAutoGroupingRulesResponse> listAutoGroupingRules(ListAutoGroupingRulesRequest request);

    /**
     * @param request the request parameters of ListControlPolicies  ListControlPoliciesRequest
     * @return ListControlPoliciesResponse
     */
    CompletableFuture<ListControlPoliciesResponse> listControlPolicies(ListControlPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the list of control policies attached to the resource folder <code>fd-ZDNPiT****</code>.</p>
     * 
     * @param request the request parameters of ListControlPolicyAttachmentsForTarget  ListControlPolicyAttachmentsForTargetRequest
     * @return ListControlPolicyAttachmentsForTargetResponse
     */
    CompletableFuture<ListControlPolicyAttachmentsForTargetResponse> listControlPolicyAttachmentsForTarget(ListControlPolicyAttachmentsForTargetRequest request);

    /**
     * @param request the request parameters of ListDelegatedAdministrators  ListDelegatedAdministratorsRequest
     * @return ListDelegatedAdministratorsResponse
     */
    CompletableFuture<ListDelegatedAdministratorsResponse> listDelegatedAdministrators(ListDelegatedAdministratorsRequest request);

    /**
     * @param request the request parameters of ListDelegatedServicesForAccount  ListDelegatedServicesForAccountRequest
     * @return ListDelegatedServicesForAccountResponse
     */
    CompletableFuture<ListDelegatedServicesForAccountResponse> listDelegatedServicesForAccount(ListDelegatedServicesForAccountRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query only the subfolders at the next level of the specified folder. You cannot query subfolders at deeper levels.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListFoldersForParent  ListFoldersForParentRequest
     * @return ListFoldersForParentResponse
     */
    CompletableFuture<ListFoldersForParentResponse> listFoldersForParent(ListFoldersForParentRequest request);

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the invitation records of the current management account <code>172841235500****</code>.</p>
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
     * <p>You can query the following information:</p>
     * <ul>
     * <li>All authorization records under an Alibaba Cloud account or a resource group.</li>
     * <li>All access policies granted to a Resource Access Management (RAM) user, RAM user group, or RAM role.</li>
     * <li>RAM users, RAM user groups, and RAM roles that have a specific permission under an Alibaba Cloud account or a resource group.</li>
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
     * @param request the request parameters of ListResourceGroupCapability  ListResourceGroupCapabilityRequest
     * @return ListResourceGroupCapabilityResponse
     */
    CompletableFuture<ListResourceGroupCapabilityResponse> listResourceGroupCapability(ListResourceGroupCapabilityRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query all resource groups under the current account. You can also filter resource groups by resource group status, resource group ID, resource group identifier, or resource group display name.</p>
     * 
     * @param request the request parameters of ListResourceGroups  ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    /**
     * @param request the request parameters of ListResourceGroupsWithAuthDetails  ListResourceGroupsWithAuthDetailsRequest
     * @return ListResourceGroupsWithAuthDetailsResponse
     */
    CompletableFuture<ListResourceGroupsWithAuthDetailsResponse> listResourceGroupsWithAuthDetails(ListResourceGroupsWithAuthDetailsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API can be called by assuming a RAM role, but session policies for the role are not supported.</p>
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
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This topic provides an example on how to query the tag values of the tag key k1. The response shows that the tag value corresponding to the tag key k1 is v1.</p>
     * 
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
     * @param request the request parameters of ListTargetAttachmentsForControlPolicy  ListTargetAttachmentsForControlPolicyRequest
     * @return ListTargetAttachmentsForControlPolicyResponse
     */
    CompletableFuture<ListTargetAttachmentsForControlPolicyResponse> listTargetAttachmentsForControlPolicy(ListTargetAttachmentsForControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation can be called only by the management account or a delegated administrator account.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListTrustedServiceStatus  ListTrustedServiceStatusRequest
     * @return ListTrustedServiceStatusResponse
     */
    CompletableFuture<ListTrustedServiceStatusResponse> listTrustedServiceStatus(ListTrustedServiceStatusRequest request);

    /**
     * @param request the request parameters of LookupResourceGroupEvents  LookupResourceGroupEventsRequest
     * @return LookupResourceGroupEventsResponse
     */
    CompletableFuture<LookupResourceGroupEventsResponse> lookupResourceGroupEvents(LookupResourceGroupEventsRequest request);

    /**
     * @param request the request parameters of MoveAccount  MoveAccountRequest
     * @return MoveAccountResponse
     */
    CompletableFuture<MoveAccountResponse> moveAccount(MoveAccountRequest request);

    /**
     * <b>description</b> :
     * <p>Supports batch transfer of resources across regions, cloud services, and resource groups.
     * For cloud services that support resource group transfer, see the <strong>API</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Cloud services that support resource groups</a>.</p>
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
     * <p>After the settings are complete, the delegated administrator account is granted authorization to access the organizational information of the resource directory, which provides visibility into the organization members and structure. The delegated administrator account executes service-related management operations on behalf of the management account in the specified trusted service.
     * Limits:</p>
     * <ul>
     * <li>Only some trusted services support the delegated administrator feature. For more information, see <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</li>
     * <li>Only the management account of the resource directory and authorized Resource Access Management (RAM) users and RAM roles under the management account can invoke this API operation.</li>
     * <li>The maximum number of delegated administrator accounts that can be added is defined by each trusted service.</li>
     * </ul>
     * 
     * @param request the request parameters of RegisterDelegatedAdministrator  RegisterDelegatedAdministratorRequest
     * @return RegisterDelegatedAdministratorResponse
     */
    CompletableFuture<RegisterDelegatedAdministratorResponse> registerDelegatedAdministrator(RegisterDelegatedAdministratorRequest request);

    /**
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
     * <p>To ensure that the system can record the specific operator of management operations, use a Resource Access Management (RAM) user or RAM role under the management account that has the resource directory management permission (AliyunResourceDirectoryFullAccess) to call this API operation.</p>
     * 
     * @param request the request parameters of SendVerificationCodeForBindSecureMobilePhone  SendVerificationCodeForBindSecureMobilePhoneRequest
     * @return SendVerificationCodeForBindSecureMobilePhoneResponse
     */
    CompletableFuture<SendVerificationCodeForBindSecureMobilePhoneResponse> sendVerificationCodeForBindSecureMobilePhone(SendVerificationCodeForBindSecureMobilePhoneRequest request);

    /**
     * <b>description</b> :
     * <p>Each Alibaba Cloud account can send up to 100 verification codes per day.</p>
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
     * <p>You can delete members of the resource account type only after the member deletion permission is enabled.</p>
     * 
     * @param request the request parameters of SetMemberDeletionPermission  SetMemberDeletionPermissionRequest
     * @return SetMemberDeletionPermissionResponse
     */
    CompletableFuture<SetMemberDeletionPermissionResponse> setMemberDeletionPermission(SetMemberDeletionPermissionRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>To ensure that the system can record the specific operator of management operations, use a Resource Access Management (RAM) user or RAM role under the management account that has the resource folder management permission (AliyunResourceDirectoryFullAccess) to invoke this API operation.</li>
     * <li>For the conditions that must be met to switch a resource account to a cloud account, see <a href="https://help.aliyun.com/document_detail/111233.html">Switch a resource account to a cloud account</a>.</li>
     * <li>For the conditions that must be met to switch a cloud account to a resource account, see <a href="https://help.aliyun.com/document_detail/209980.html">Switch a cloud account to a resource account</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAccount  UpdateAccountRequest
     * @return UpdateAccountResponse
     */
    CompletableFuture<UpdateAccountResponse> updateAccount(UpdateAccountRequest request);

    /**
     * <b>description</b> :
     * <p>For cloud resources that support the attached-resource allocation feature, see <a href="https://help.aliyun.com/document_detail/606232.html">Attached-resource allocation</a>.</p>
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
     * <p>This topic provides an example on how to modify the name of the control policy <code>cp-jExXAqIYkwHN****</code> to <code>NewControlPolicy</code>.</p>
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
     * @param request the request parameters of UpdateResourceGroup  UpdateResourceGroupRequest
     * @return UpdateResourceGroupResponse
     */
    CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request);

    /**
     * @param request the request parameters of UpdateResourceGroupAdminSetting  UpdateResourceGroupAdminSettingRequest
     * @return UpdateResourceGroupAdminSettingResponse
     */
    CompletableFuture<UpdateResourceGroupAdminSettingResponse> updateResourceGroupAdminSetting(UpdateResourceGroupAdminSettingRequest request);

    /**
     * @param request the request parameters of UpdateRole  UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

}
