// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.resourcedirectorymaster20220419.models.*;
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
     * <p>After an invited Alibaba Cloud account joins a resource directory, it becomes a member of the resource directory. By default, the name of the invited Alibaba Cloud account is used as the display name of the account in the resource directory.</p>
     * 
     * @param request the request parameters of AcceptHandshake  AcceptHandshakeRequest
     * @return AcceptHandshakeResponse
     */
    CompletableFuture<AcceptHandshakeResponse> acceptHandshake(AcceptHandshakeRequest request);

    /**
     * @param request the request parameters of AddMessageContact  AddMessageContactRequest
     * @return AddMessageContactResponse
     */
    CompletableFuture<AddMessageContactResponse> addMessageContact(AddMessageContactRequest request);

    /**
     * @param request the request parameters of AssociateMembers  AssociateMembersRequest
     * @return AssociateMembersResponse
     */
    CompletableFuture<AssociateMembersResponse> associateMembers(AssociateMembersRequest request);

    /**
     * <b>description</b> :
     * <p>After you attach a custom access control policy, the operations performed on resources by using members are limited by the policy. Make sure that the attached policy meets your expectations. Otherwise, your business may be affected.
     * By default, the system access control policy FullAliyunAccess is attached to each folder and member.
     * The access control policy that is attached to a folder also applies to all its subfolders and all members in the subfolders.
     * A maximum of 10 access control policies can be attached to a folder or member.</p>
     * 
     * @param request the request parameters of AttachControlPolicy  AttachControlPolicyRequest
     * @return AttachControlPolicyResponse
     */
    CompletableFuture<AttachControlPolicyResponse> attachControlPolicy(AttachControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this API operation only to bind a mobile phone number to a member of the resource account type. You cannot call this API operation to change the mobile phone number that is bound to a member of the resource account type.
     * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.</p>
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
     * @param request the request parameters of CancelHandshake  CancelHandshakeRequest
     * @return CancelHandshakeResponse
     */
    CompletableFuture<CancelHandshakeResponse> cancelHandshake(CancelHandshakeRequest request);

    /**
     * @param request the request parameters of CancelMessageContactUpdate  CancelMessageContactUpdateRequest
     * @return CancelMessageContactUpdateResponse
     */
    CompletableFuture<CancelMessageContactUpdateResponse> cancelMessageContactUpdate(CancelMessageContactUpdateRequest request);

    /**
     * @param request the request parameters of ChangeAccountEmail  ChangeAccountEmailRequest
     * @return ChangeAccountEmailResponse
     */
    CompletableFuture<ChangeAccountEmailResponse> changeAccountEmail(ChangeAccountEmailRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a member, you must call this API operation to check whether the member can be deleted.</p>
     * 
     * @param request the request parameters of CheckAccountDelete  CheckAccountDeleteRequest
     * @return CheckAccountDeleteResponse
     */
    CompletableFuture<CheckAccountDeleteResponse> checkAccountDelete(CheckAccountDeleteRequest request);

    /**
     * @param request the request parameters of CreateControlPolicy  CreateControlPolicyRequest
     * @return CreateControlPolicyResponse
     */
    CompletableFuture<CreateControlPolicyResponse> createControlPolicy(CreateControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>A maximum of five levels of folders can be created under the Root folder.</p>
     * 
     * @param request the request parameters of CreateFolder  CreateFolderRequest
     * @return CreateFolderResponse
     */
    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    /**
     * <b>description</b> :
     * <p>A member serves as a container for resources and is also an organizational unit in a resource directory. A member indicates a project or application. The resources of different members are isolated.
     * This topic provides an example on how to call the API operation to create a member in the <code>fd-r23M55****</code> folder. The display name of the member is <code>Dev</code>, and the prefix for the Alibaba Cloud account name of the member is <code>alice</code>.</p>
     * 
     * @param request the request parameters of CreateResourceAccount  CreateResourceAccountRequest
     * @return CreateResourceAccountResponse
     */
    CompletableFuture<CreateResourceAccountResponse> createResourceAccount(CreateResourceAccountRequest request);

    /**
     * @param request the request parameters of DeclineHandshake  DeclineHandshakeRequest
     * @return DeclineHandshakeResponse
     */
    CompletableFuture<DeclineHandshakeResponse> declineHandshake(DeclineHandshakeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a member, we recommend that you call the <a href="~~CheckAccountDelete~~">CheckAccountDelete</a> and <a href="~~GetAccountDeletionCheckResult~~">GetAccountDeletionCheckResult</a> operations to check whether the member meets deletion requirements. You can call the DeleteAccount operation to delete only members that meet the deletion requirements.
     * After you submit a deletion request for a member, you can call the <a href="~~GetAccountDeletionStatus~~">GetAccountDeletionStatus</a> operation to query the deletion status of the member. After a member is deleted, the resources and data within the member are deleted, and you can no longer use the member to log on to the Alibaba Cloud Management Console. In addition, the member cannot be recovered. Proceed with caution. For more information about how to delete a member, see <a href="https://help.aliyun.com/document_detail/446078.html">Delete a member of the resource account type</a>.</p>
     * 
     * @param request the request parameters of DeleteAccount  DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
     * <b>description</b> :
     * <p>If you want to delete a custom access control policy that is attached to folders or members, you must call the <a href="~~DetachControlPolicy~~">DetachControlPolicy</a> operation to detach the policy before you delete it.</p>
     * 
     * @param request the request parameters of DeleteControlPolicy  DeleteControlPolicyRequest
     * @return DeleteControlPolicyResponse
     */
    CompletableFuture<DeleteControlPolicyResponse> deleteControlPolicy(DeleteControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a folder, you must make sure that the folder does not contain members or subfolders.</p>
     * 
     * @param request the request parameters of DeleteFolder  DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    /**
     * @param request the request parameters of DeleteMessageContact  DeleteMessageContactRequest
     * @return DeleteMessageContactResponse
     */
    CompletableFuture<DeleteMessageContactResponse> deleteMessageContact(DeleteMessageContactRequest request);

    /**
     * <b>description</b> :
     * <p>If the delegated administrator account that you want to remove has historical management tasks in the related trusted service, the trusted service may be affected after the delegated administrator account is removed. Therefore, proceed with caution.</p>
     * 
     * @param request the request parameters of DeregisterDelegatedAdministrator  DeregisterDelegatedAdministratorRequest
     * @return DeregisterDelegatedAdministratorResponse
     */
    CompletableFuture<DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministrator(DeregisterDelegatedAdministratorRequest request);

    /**
     * <b>description</b> :
     * <p>Before you disable a resource directory, you must make sure that the following requirements are met:</p>
     * <ul>
     * <li>All members of the cloud account type in the resource directory are removed. You can call the <a href="~~RemoveCloudAccount~~">RemoveCloudAccount</a> operation to remove a member of the cloud account type.</li>
     * <li>All folders except the Root folder are deleted from the resource directory. You can call the <a href="~~DeleteFolder~~">DeleteFolder</a> operation to delete a folder.</li>
     * </ul>
     * 
     * @param request the request parameters of DestroyResourceDirectory  DestroyResourceDirectoryRequest
     * @return DestroyResourceDirectoryResponse
     */
    CompletableFuture<DestroyResourceDirectoryResponse> destroyResourceDirectory(DestroyResourceDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>After you detach an access control policy, the operations performed on resources by using members are not limited by the policy. Make sure that the detached policy meets your expectations. Otherwise, your business may be affected.
     * Both the system and custom access control policies can be detached. If an object has only one access control policy attached, the policy cannot be detached.</p>
     * 
     * @param request the request parameters of DetachControlPolicy  DetachControlPolicyRequest
     * @return DetachControlPolicyResponse
     */
    CompletableFuture<DetachControlPolicyResponse> detachControlPolicy(DetachControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>After you disable the Control Policy feature, the system automatically detaches all access control policies that are attached to folders and members. The system does not delete these access control policies, but you cannot attach them to folders or members again.</p>
     * <blockquote>
     * <p>If you disable the Control Policy feature, the permissions of all folders and members in your resource directory are affected. Therefore, proceed with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DisableControlPolicy  DisableControlPolicyRequest
     * @return DisableControlPolicyResponse
     */
    CompletableFuture<DisableControlPolicyResponse> disableControlPolicy(DisableControlPolicyRequest request);

    /**
     * @param request the request parameters of DisassociateMembers  DisassociateMembersRequest
     * @return DisassociateMembersResponse
     */
    CompletableFuture<DisassociateMembersResponse> disassociateMembers(DisassociateMembersRequest request);

    /**
     * <b>description</b> :
     * <p>The Control Policy feature provided by the Resource Directory service allows you to manage the permission boundaries of the folders or members in your resource directory in a centralized manner. This feature is implemented based on the resource directory. You can use this feature to develop common or dedicated rules for access control. The Control Policy feature does not grant permissions but only defines permission boundaries. A member in a resource directory can be used to access resources only after it is granted the required permissions by using the Resource Access Management (RAM) service. For more information, see <a href="https://help.aliyun.com/document_detail/178671.html">Overview of the Control Policy feature</a>.</p>
     * 
     * @param request the request parameters of EnableControlPolicy  EnableControlPolicyRequest
     * @return EnableControlPolicyResponse
     */
    CompletableFuture<EnableControlPolicyResponse> enableControlPolicy(EnableControlPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can use the current account or a newly created account to enable a resource directory. For more information, see <a href="https://help.aliyun.com/document_detail/111215.html">Enable a resource directory</a>.</p>
     * 
     * @param request the request parameters of EnableResourceDirectory  EnableResourceDirectoryRequest
     * @return EnableResourceDirectoryResponse
     */
    CompletableFuture<EnableResourceDirectoryResponse> enableResourceDirectory(EnableResourceDirectoryRequest request);

    /**
     * @param request the request parameters of GetAccount  GetAccountRequest
     * @return GetAccountResponse
     */
    CompletableFuture<GetAccountResponse> getAccount(GetAccountRequest request);

    /**
     * <b>description</b> :
     * <p>After you call the <a href="~~CheckAccountDelete~~">CheckAccountDelete</a> operation to perform a member deletion check, you can call the <a href="~~GetAccountDeletionCheckResult~~">GetAccountDeletionCheckResult</a> operation to query the check result. If the check result shows that the member meets deletion requirements, you can delete the member. Otherwise, you need to first modify the items that do not meet requirements.</p>
     * 
     * @param request the request parameters of GetAccountDeletionCheckResult  GetAccountDeletionCheckResultRequest
     * @return GetAccountDeletionCheckResultResponse
     */
    CompletableFuture<GetAccountDeletionCheckResultResponse> getAccountDeletionCheckResult(GetAccountDeletionCheckResultRequest request);

    /**
     * @param request the request parameters of GetAccountDeletionStatus  GetAccountDeletionStatusRequest
     * @return GetAccountDeletionStatusResponse
     */
    CompletableFuture<GetAccountDeletionStatusResponse> getAccountDeletionStatus(GetAccountDeletionStatusRequest request);

    /**
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
     * @param request the request parameters of GetHandshake  GetHandshakeRequest
     * @return GetHandshakeResponse
     */
    CompletableFuture<GetHandshakeResponse> getHandshake(GetHandshakeRequest request);

    /**
     * @param request the request parameters of GetMessageContact  GetMessageContactRequest
     * @return GetMessageContactResponse
     */
    CompletableFuture<GetMessageContactResponse> getMessageContact(GetMessageContactRequest request);

    /**
     * @param request the request parameters of GetMessageContactDeletionStatus  GetMessageContactDeletionStatusRequest
     * @return GetMessageContactDeletionStatusResponse
     */
    CompletableFuture<GetMessageContactDeletionStatusResponse> getMessageContactDeletionStatus(GetMessageContactDeletionStatusRequest request);

    /**
     * @param request the request parameters of GetPayerForAccount  GetPayerForAccountRequest
     * @return GetPayerForAccountResponse
     */
    CompletableFuture<GetPayerForAccountResponse> getPayerForAccount(GetPayerForAccountRequest request);

    /**
     * @param request the request parameters of GetResourceDirectory  GetResourceDirectoryRequest
     * @return GetResourceDirectoryResponse
     */
    CompletableFuture<GetResourceDirectoryResponse> getResourceDirectory(GetResourceDirectoryRequest request);

    /**
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
     * @param request the request parameters of ListControlPolicies  ListControlPoliciesRequest
     * @return ListControlPoliciesResponse
     */
    CompletableFuture<ListControlPoliciesResponse> listControlPolicies(ListControlPoliciesRequest request);

    /**
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
     * <p>You can call this API operation to view the information of only the first-level subfolders of a folder.</p>
     * 
     * @param request the request parameters of ListFoldersForParent  ListFoldersForParentRequest
     * @return ListFoldersForParentResponse
     */
    CompletableFuture<ListFoldersForParentResponse> listFoldersForParent(ListFoldersForParentRequest request);

    /**
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
     * @param request the request parameters of ListMessageContactVerifications  ListMessageContactVerificationsRequest
     * @return ListMessageContactVerificationsResponse
     */
    CompletableFuture<ListMessageContactVerificationsResponse> listMessageContactVerifications(ListMessageContactVerificationsRequest request);

    /**
     * @param request the request parameters of ListMessageContacts  ListMessageContactsRequest
     * @return ListMessageContactsResponse
     */
    CompletableFuture<ListMessageContactsResponse> listMessageContacts(ListMessageContactsRequest request);

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
     * <p>Only a management account or delegated administrator account can be used to call this operation.</p>
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
     * @param request the request parameters of PrecheckForConsolidatedBillingAccount  PrecheckForConsolidatedBillingAccountRequest
     * @return PrecheckForConsolidatedBillingAccountResponse
     */
    CompletableFuture<PrecheckForConsolidatedBillingAccountResponse> precheckForConsolidatedBillingAccount(PrecheckForConsolidatedBillingAccountRequest request);

    /**
     * <b>description</b> :
     * <p>The delegated administrator account can be used to access the information of the resource directory and view the structure and members of the resource directory. The delegated administrator account can also be used to perform service-related management operations in the trusted service on behalf of the management account of the resource directory. When you call this operation, you must take note of the following limits:</p>
     * <ul>
     * <li>Only some trusted services support delegated administrator accounts. For more information, see <a href="https://help.aliyun.com/document_detail/208133.html">Supported trusted services</a>.</li>
     * <li>Only the management account of a resource directory or an authorized RAM user or RAM role of the management account can be used to call this operation.</li>
     * <li>The number of delegated administrator accounts that are allowed for a trusted service is defined by the trusted service.</li>
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
     * @param request the request parameters of RetryChangeAccountEmail  RetryChangeAccountEmailRequest
     * @return RetryChangeAccountEmailResponse
     */
    CompletableFuture<RetryChangeAccountEmailResponse> retryChangeAccountEmail(RetryChangeAccountEmailRequest request);

    /**
     * @param request the request parameters of SendEmailVerificationForMessageContact  SendEmailVerificationForMessageContactRequest
     * @return SendEmailVerificationForMessageContactResponse
     */
    CompletableFuture<SendEmailVerificationForMessageContactResponse> sendEmailVerificationForMessageContact(SendEmailVerificationForMessageContactRequest request);

    /**
     * @param request the request parameters of SendPhoneVerificationForMessageContact  SendPhoneVerificationForMessageContactRequest
     * @return SendPhoneVerificationForMessageContactResponse
     */
    CompletableFuture<SendPhoneVerificationForMessageContactResponse> sendPhoneVerificationForMessageContact(SendPhoneVerificationForMessageContactRequest request);

    /**
     * <b>description</b> :
     * <p>To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.</p>
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
     * <b>description</b> :
     * <p>Members of the resource account type can be deleted only after the member deletion feature is enabled.</p>
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
     * <p>  To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.</p>
     * <ul>
     * <li>Before you switch the type of a member from resource account to cloud account, make sure that specific conditions are met. For more information about the conditions, see <a href="https://help.aliyun.com/document_detail/111233.html">Switch a resource account to a cloud account</a>.</li>
     * <li>Before you switch the type of a member from cloud account to resource account, make sure that specific conditions are met. For more information about the conditions, see <a href="https://help.aliyun.com/document_detail/209980.html">Switch a cloud account to a resource account</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAccount  UpdateAccountRequest
     * @return UpdateAccountResponse
     */
    CompletableFuture<UpdateAccountResponse> updateAccount(UpdateAccountRequest request);

    /**
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
     * @param request the request parameters of UpdateMessageContact  UpdateMessageContactRequest
     * @return UpdateMessageContactResponse
     */
    CompletableFuture<UpdateMessageContactResponse> updateMessageContact(UpdateMessageContactRequest request);

}
