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

    CompletableFuture<AcceptHandshakeResponse> acceptHandshake(AcceptHandshakeRequest request);

    CompletableFuture<AttachControlPolicyResponse> attachControlPolicy(AttachControlPolicyRequest request);

    CompletableFuture<BindSecureMobilePhoneResponse> bindSecureMobilePhone(BindSecureMobilePhoneRequest request);

    CompletableFuture<CancelChangeAccountEmailResponse> cancelChangeAccountEmail(CancelChangeAccountEmailRequest request);

    CompletableFuture<CancelHandshakeResponse> cancelHandshake(CancelHandshakeRequest request);

    CompletableFuture<ChangeAccountEmailResponse> changeAccountEmail(ChangeAccountEmailRequest request);

    CompletableFuture<CheckAccountDeleteResponse> checkAccountDelete(CheckAccountDeleteRequest request);

    CompletableFuture<CreateControlPolicyResponse> createControlPolicy(CreateControlPolicyRequest request);

    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    CompletableFuture<CreateResourceAccountResponse> createResourceAccount(CreateResourceAccountRequest request);

    CompletableFuture<DeclineHandshakeResponse> declineHandshake(DeclineHandshakeRequest request);

    CompletableFuture<DeleteAccountResponse> deleteAccount(DeleteAccountRequest request);

    CompletableFuture<DeleteControlPolicyResponse> deleteControlPolicy(DeleteControlPolicyRequest request);

    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    CompletableFuture<DeregisterDelegatedAdministratorResponse> deregisterDelegatedAdministrator(DeregisterDelegatedAdministratorRequest request);

    CompletableFuture<DestroyResourceDirectoryResponse> destroyResourceDirectory(DestroyResourceDirectoryRequest request);

    CompletableFuture<DetachControlPolicyResponse> detachControlPolicy(DetachControlPolicyRequest request);

    CompletableFuture<DisableControlPolicyResponse> disableControlPolicy(DisableControlPolicyRequest request);

    CompletableFuture<EnableControlPolicyResponse> enableControlPolicy(EnableControlPolicyRequest request);

    CompletableFuture<EnableResourceDirectoryResponse> enableResourceDirectory(EnableResourceDirectoryRequest request);

    CompletableFuture<GetAccountResponse> getAccount(GetAccountRequest request);

    CompletableFuture<GetAccountDeletionCheckResultResponse> getAccountDeletionCheckResult(GetAccountDeletionCheckResultRequest request);

    CompletableFuture<GetAccountDeletionStatusResponse> getAccountDeletionStatus(GetAccountDeletionStatusRequest request);

    CompletableFuture<GetControlPolicyResponse> getControlPolicy(GetControlPolicyRequest request);

    CompletableFuture<GetControlPolicyEnablementStatusResponse> getControlPolicyEnablementStatus(GetControlPolicyEnablementStatusRequest request);

    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    CompletableFuture<GetHandshakeResponse> getHandshake(GetHandshakeRequest request);

    CompletableFuture<GetPayerForAccountResponse> getPayerForAccount(GetPayerForAccountRequest request);

    CompletableFuture<GetResourceDirectoryResponse> getResourceDirectory(GetResourceDirectoryRequest request);

    CompletableFuture<InviteAccountToResourceDirectoryResponse> inviteAccountToResourceDirectory(InviteAccountToResourceDirectoryRequest request);

    CompletableFuture<ListAccountsResponse> listAccounts(ListAccountsRequest request);

    CompletableFuture<ListAccountsForParentResponse> listAccountsForParent(ListAccountsForParentRequest request);

    CompletableFuture<ListAncestorsResponse> listAncestors(ListAncestorsRequest request);

    CompletableFuture<ListControlPoliciesResponse> listControlPolicies(ListControlPoliciesRequest request);

    CompletableFuture<ListControlPolicyAttachmentsForTargetResponse> listControlPolicyAttachmentsForTarget(ListControlPolicyAttachmentsForTargetRequest request);

    CompletableFuture<ListDelegatedAdministratorsResponse> listDelegatedAdministrators(ListDelegatedAdministratorsRequest request);

    CompletableFuture<ListDelegatedServicesForAccountResponse> listDelegatedServicesForAccount(ListDelegatedServicesForAccountRequest request);

    CompletableFuture<ListFoldersForParentResponse> listFoldersForParent(ListFoldersForParentRequest request);

    CompletableFuture<ListHandshakesForAccountResponse> listHandshakesForAccount(ListHandshakesForAccountRequest request);

    CompletableFuture<ListHandshakesForResourceDirectoryResponse> listHandshakesForResourceDirectory(ListHandshakesForResourceDirectoryRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTargetAttachmentsForControlPolicyResponse> listTargetAttachmentsForControlPolicy(ListTargetAttachmentsForControlPolicyRequest request);

    CompletableFuture<ListTrustedServiceStatusResponse> listTrustedServiceStatus(ListTrustedServiceStatusRequest request);

    CompletableFuture<MoveAccountResponse> moveAccount(MoveAccountRequest request);

    CompletableFuture<RegisterDelegatedAdministratorResponse> registerDelegatedAdministrator(RegisterDelegatedAdministratorRequest request);

    CompletableFuture<RemoveCloudAccountResponse> removeCloudAccount(RemoveCloudAccountRequest request);

    CompletableFuture<RetryChangeAccountEmailResponse> retryChangeAccountEmail(RetryChangeAccountEmailRequest request);

    CompletableFuture<SendVerificationCodeForBindSecureMobilePhoneResponse> sendVerificationCodeForBindSecureMobilePhone(SendVerificationCodeForBindSecureMobilePhoneRequest request);

    CompletableFuture<SendVerificationCodeForEnableRDResponse> sendVerificationCodeForEnableRD(SendVerificationCodeForEnableRDRequest request);

    CompletableFuture<SetMemberDeletionPermissionResponse> setMemberDeletionPermission(SetMemberDeletionPermissionRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAccountResponse> updateAccount(UpdateAccountRequest request);

    CompletableFuture<UpdateControlPolicyResponse> updateControlPolicy(UpdateControlPolicyRequest request);

    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

}
