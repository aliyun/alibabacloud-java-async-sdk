// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.resourcedirectorymaster20220419.models.*;
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
      *
     */
    CompletableFuture<AcceptHandshakeResponse> acceptHandshake(AcceptHandshakeRequest request);

    CompletableFuture<AddMessageContactResponse> addMessageContact(AddMessageContactRequest request);

    CompletableFuture<AssociateMembersResponse> associateMembers(AssociateMembersRequest request);

    /**
      * After you attach a custom access control policy, the operations performed on resources by using members are limited by the policy. Make sure that the attached policy meets your expectations. Otherwise, your business may be affected.
      * By default, the system access control policy FullAliyunAccess is attached to each folder and member.
      * The access control policy that is attached to a folder also applies to all its subfolders and all members in the subfolders.
      * A maximum of 10 access control policies can be attached to a folder or member.
      *
     */
    CompletableFuture<AttachControlPolicyResponse> attachControlPolicy(AttachControlPolicyRequest request);

    /**
      * You can call this API operation only to bind a mobile phone number to a member of the resource account type. You cannot call this API operation to change the mobile phone number that is bound to a member of the resource account type.
      * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.
      *
     */
    CompletableFuture<BindSecureMobilePhoneResponse> bindSecureMobilePhone(BindSecureMobilePhoneRequest request);

    CompletableFuture<CancelChangeAccountEmailResponse> cancelChangeAccountEmail(CancelChangeAccountEmailRequest request);

    CompletableFuture<CancelHandshakeResponse> cancelHandshake(CancelHandshakeRequest request);

    CompletableFuture<CancelMessageContactUpdateResponse> cancelMessageContactUpdate(CancelMessageContactUpdateRequest request);

    CompletableFuture<ChangeAccountEmailResponse> changeAccountEmail(ChangeAccountEmailRequest request);

    /**
      * Before you delete a member, you must call this API operation to check whether the member can be deleted.
      *
     */
    CompletableFuture<CheckAccountDeleteResponse> checkAccountDelete(CheckAccountDeleteRequest request);

    CompletableFuture<CreateControlPolicyResponse> createControlPolicy(CreateControlPolicyRequest request);

    /**
      * A maximum of five levels of folders can be created under the Root folder.
      *
     */
    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    /**
      * A member serves as a container for resources and is also an organizational unit in a resource directory. A member indicates a project or application. The resources of different members are isolated.
      * This topic provides an example on how to call the API operation to create a member in the `fd-r23M55****` folder. The display name of the member is `Dev`, and the prefix for the Alibaba Cloud account name of the member is `alice`.
      *
     */
    CompletableFuture<CreateResourceAccountResponse> createResourceAccount(CreateResourceAccountRequest request);

    CompletableFuture<DeclineHandshakeResponse> declineHandshake(DeclineHandshakeRequest request);

    /**
      * Before you delete a member, we recommend that you call the [CheckAccountDelete](~~CheckAccountDelete~~) and [GetAccountDeletionCheckResult](~~GetAccountDeletionCheckResult~~) operations to check whether the member meets deletion requirements. You can call the DeleteAccount operation to delete only members that meet the deletion requirements.
      * After you submit a deletion request for a member, you can call the [GetAccountDeletionStatus](~~GetAccountDeletionStatus~~) operation to query the deletion status of the member. After a member is deleted, the resources and data within the member are deleted, and you can no longer use the member to log on to the Alibaba Cloud Management Console. In addition, the member cannot be recovered. Proceed with caution. For more information about how to delete a member, see [Delete a member of the resource account type](~~446078~~).
      *
     */
    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    /**
      * If you want to delete a custom access control policy that is attached to folders or members, you must call the [DetachControlPolicy](~~DetachControlPolicy~~) operation to detach the policy before you delete it.
      *
     */
    CompletableFuture<DeleteControlPolicyResponse> deleteControlPolicy(DeleteControlPolicyRequest request);

    /**
      * Before you delete a folder, you must make sure that the folder does not contain members or subfolders.
      *
     */
    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    CompletableFuture<DeleteInvalidCloudAccountRecordResponse> deleteInvalidCloudAccountRecord(DeleteInvalidCloudAccountRecordRequest request);

    CompletableFuture<DeleteMessageContactResponse> deleteMessageContact(DeleteMessageContactRequest request);

    /**
      * If the delegated administrator account that you want to remove has historical management tasks in the related trusted service, the trusted service may be affected after the delegated administrator account is removed. Therefore, proceed with caution.
      *
     */
    CompletableFuture<DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministrator(DeregisterDelegatedAdministratorRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DestroyResourceDirectoryResponse> destroyResourceDirectory(DestroyResourceDirectoryRequest request);

    /**
      * After you detach an access control policy, the operations performed on resources by using members are not limited by the policy. Make sure that the detached policy meets your expectations. Otherwise, your business may be affected.
      * Both the system and custom access control policies can be detached. If an object has only one access control policy attached, the policy cannot be detached.
      *
     */
    CompletableFuture<DetachControlPolicyResponse> detachControlPolicy(DetachControlPolicyRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DisableControlPolicyResponse> disableControlPolicy(DisableControlPolicyRequest request);

    CompletableFuture<DisassociateMembersResponse> disassociateMembers(DisassociateMembersRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<EnableControlPolicyResponse> enableControlPolicy(EnableControlPolicyRequest request);

    /**
      * You can use the current account or a newly created account to enable a resource directory. For more information, see [Enable a resource directory](~~111215~~).
      *
     */
    CompletableFuture<EnableResourceDirectoryResponse> enableResourceDirectory(EnableResourceDirectoryRequest request);

    CompletableFuture<GetAccountResponse> getAccount(GetAccountRequest request);

    /**
      * After you call the [CheckAccountDelete](~~CheckAccountDelete~~) operation to perform a member deletion check, you can call the [GetAccountDeletionCheckResult](~~GetAccountDeletionCheckResult~~) operation to query the check result. If the check result shows that the member meets deletion requirements, you can delete the member. Otherwise, you need to first modify the items that do not meet requirements.
      *
     */
    CompletableFuture<GetAccountDeletionCheckResultResponse> getAccountDeletionCheckResult(GetAccountDeletionCheckResultRequest request);

    CompletableFuture<GetAccountDeletionStatusResponse> getAccountDeletionStatus(GetAccountDeletionStatusRequest request);

    CompletableFuture<GetControlPolicyResponse> getControlPolicy(GetControlPolicyRequest request);

    CompletableFuture<GetControlPolicyEnablementStatusResponse> getControlPolicyEnablementStatus(GetControlPolicyEnablementStatusRequest request);

    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    CompletableFuture<GetHandshakeResponse> getHandshake(GetHandshakeRequest request);

    CompletableFuture<GetMessageContactResponse> getMessageContact(GetMessageContactRequest request);

    CompletableFuture<GetMessageContactDeletionStatusResponse> getMessageContactDeletionStatus(GetMessageContactDeletionStatusRequest request);

    CompletableFuture<GetPayerForAccountResponse> getPayerForAccount(GetPayerForAccountRequest request);

    CompletableFuture<GetResourceDirectoryResponse> getResourceDirectory(GetResourceDirectoryRequest request);

    CompletableFuture<InviteAccountToResourceDirectoryResponse> inviteAccountToResourceDirectory(InviteAccountToResourceDirectoryRequest request);

    /**
      * You can use only the management account of a resource directory or a delegated administrator account of a trusted service to call this operation.
      *
     */
    CompletableFuture<ListAccountsResponse> listAccounts(ListAccountsRequest request);

    CompletableFuture<ListAccountsForParentResponse> listAccountsForParent(ListAccountsForParentRequest request);

    CompletableFuture<ListAncestorsResponse> listAncestors(ListAncestorsRequest request);

    CompletableFuture<ListControlPoliciesResponse> listControlPolicies(ListControlPoliciesRequest request);

    CompletableFuture<ListControlPolicyAttachmentsForTargetResponse> listControlPolicyAttachmentsForTarget(ListControlPolicyAttachmentsForTargetRequest request);

    CompletableFuture<ListDelegatedAdministratorsResponse> listDelegatedAdministrators(ListDelegatedAdministratorsRequest request);

    CompletableFuture<ListDelegatedServicesForAccountResponse> listDelegatedServicesForAccount(ListDelegatedServicesForAccountRequest request);

    /**
      * You can call this API operation to view the information of only the first-level subfolders of a folder.
      *
     */
    CompletableFuture<ListFoldersForParentResponse> listFoldersForParent(ListFoldersForParentRequest request);

    CompletableFuture<ListHandshakesForAccountResponse> listHandshakesForAccount(ListHandshakesForAccountRequest request);

    CompletableFuture<ListHandshakesForResourceDirectoryResponse> listHandshakesForResourceDirectory(ListHandshakesForResourceDirectoryRequest request);

    CompletableFuture<ListMessageContactVerificationsResponse> listMessageContactVerifications(ListMessageContactVerificationsRequest request);

    CompletableFuture<ListMessageContactsResponse> listMessageContacts(ListMessageContactsRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    CompletableFuture<ListTargetAttachmentsForControlPolicyResponse> listTargetAttachmentsForControlPolicy(ListTargetAttachmentsForControlPolicyRequest request);

    /**
      * Only a management account or delegated administrator account can be used to call this operation.
      *
     */
    CompletableFuture<ListTrustedServiceStatusResponse> listTrustedServiceStatus(ListTrustedServiceStatusRequest request);

    CompletableFuture<MoveAccountResponse> moveAccount(MoveAccountRequest request);

    CompletableFuture<PrecheckForConsolidatedBillingAccountResponse> precheckForConsolidatedBillingAccount(PrecheckForConsolidatedBillingAccountRequest request);

    /**
      * The delegated administrator account can be used to access the information of the resource directory and view the structure and members of the resource directory. The delegated administrator account can also be used to perform service-related management operations in the trusted service on behalf of the management account of the resource directory. When you call this operation, you must take note of the following limits:
      * *   Only some trusted services support delegated administrator accounts. For more information, see [Supported trusted services](~~208133~~).
      * *   Only the management account of a resource directory or an authorized RAM user or RAM role of the management account can be used to call this operation.
      * *   The number of delegated administrator accounts that are allowed for a trusted service is defined by the trusted service.
      *
     */
    CompletableFuture<RegisterDelegatedAdministratorResponse> registerDelegatedAdministrator(RegisterDelegatedAdministratorRequest request);

    CompletableFuture<RemoveCloudAccountResponse> removeCloudAccount(RemoveCloudAccountRequest request);

    CompletableFuture<RetryChangeAccountEmailResponse> retryChangeAccountEmail(RetryChangeAccountEmailRequest request);

    CompletableFuture<SendEmailVerificationForMessageContactResponse> sendEmailVerificationForMessageContact(SendEmailVerificationForMessageContactRequest request);

    CompletableFuture<SendPhoneVerificationForMessageContactResponse> sendPhoneVerificationForMessageContact(SendPhoneVerificationForMessageContactRequest request);

    /**
      * To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this API operation.
      *
     */
    CompletableFuture<SendVerificationCodeForBindSecureMobilePhoneResponse> sendVerificationCodeForBindSecureMobilePhone(SendVerificationCodeForBindSecureMobilePhoneRequest request);

    /**
      * Each Alibaba Cloud account can be used to send a maximum of 100 verification codes per day.
      *
     */
    CompletableFuture<SendVerificationCodeForEnableRDResponse> sendVerificationCodeForEnableRD(SendVerificationCodeForEnableRDRequest request);

    /**
      * Members of the resource account type can be deleted only after the member deletion feature is enabled.
      *
     */
    CompletableFuture<SetMemberDeletionPermissionResponse> setMemberDeletionPermission(SetMemberDeletionPermissionRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * *   To ensure that the system can record the operators of management operations, you must use a RAM user or RAM role to which the AliyunResourceDirectoryFullAccess policy is attached within the management account of your resource directory to call this operation.
      * *   Before you switch the type of a member from resource account to cloud account, make sure that specific conditions are met. For more information about the conditions, see [Switch a resource account to a cloud account](~~111233~~).
      * *   Before you switch the type of a member from cloud account to resource account, make sure that specific conditions are met. For more information about the conditions, see [Switch a cloud account to a resource account](~~209980~~).
      *
     */
    CompletableFuture<UpdateAccountResponse> updateAccount(UpdateAccountRequest request);

    CompletableFuture<UpdateControlPolicyResponse> updateControlPolicy(UpdateControlPolicyRequest request);

    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

    CompletableFuture<UpdateMessageContactResponse> updateMessageContact(UpdateMessageContactRequest request);

}
