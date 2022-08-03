// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.resourcemanager20161111.models.*;
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

    CompletableFuture<AttachPolicyResponse> attachPolicy(AttachPolicyRequest request);

    CompletableFuture<CancelCreateCloudAccountResponse> cancelCreateCloudAccount(CancelCreateCloudAccountRequest request);

    CompletableFuture<CancelPromoteResourceAccountResponse> cancelPromoteResourceAccount(CancelPromoteResourceAccountRequest request);

    CompletableFuture<CreateCloudAccountResponse> createCloudAccount(CreateCloudAccountRequest request);

    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request);

    CompletableFuture<CreatePolicyVersionResponse> createPolicyVersion(CreatePolicyVersionRequest request);

    CompletableFuture<CreateResourceAccountResponse> createResourceAccount(CreateResourceAccountRequest request);

    CompletableFuture<CreateResourceGroupResponse> createResourceGroup(CreateResourceGroupRequest request);

    CompletableFuture<CreateRoleResponse> createRole(CreateRoleRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    CompletableFuture<DeleteInvalidCloudAccountRecordResponse> deleteInvalidCloudAccountRecord(DeleteInvalidCloudAccountRecordRequest request);

    CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request);

    CompletableFuture<DeletePolicyVersionResponse> deletePolicyVersion(DeletePolicyVersionRequest request);

    CompletableFuture<DeleteResourceGroupResponse> deleteResourceGroup(DeleteResourceGroupRequest request);

    CompletableFuture<DeleteRoleResponse> deleteRole(DeleteRoleRequest request);

    CompletableFuture<DeleteServiceLinkedRoleResponse> deleteServiceLinkedRole(DeleteServiceLinkedRoleRequest request);

    CompletableFuture<DestoryResourceDirectoryResponse> destoryResourceDirectory(DestoryResourceDirectoryRequest request);

    CompletableFuture<DestroyResourceDirectoryResponse> destroyResourceDirectory(DestroyResourceDirectoryRequest request);

    CompletableFuture<DetachPolicyResponse> detachPolicy(DetachPolicyRequest request);

    CompletableFuture<GetAccountSummaryResponse> getAccountSummary(GetAccountSummaryRequest request);

    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    CompletableFuture<GetPolicyResponse> getPolicy(GetPolicyRequest request);

    CompletableFuture<GetPolicyVersionResponse> getPolicyVersion(GetPolicyVersionRequest request);

    CompletableFuture<GetResourceDirectoryResponse> getResourceDirectory(GetResourceDirectoryRequest request);

    CompletableFuture<GetResourceDirectoryAccountResponse> getResourceDirectoryAccount(GetResourceDirectoryAccountRequest request);

    CompletableFuture<GetResourceGroupResponse> getResourceGroup(GetResourceGroupRequest request);

    CompletableFuture<GetRoleResponse> getRole(GetRoleRequest request);

    CompletableFuture<GetServiceLinkedRoleDeletionStatusResponse> getServiceLinkedRoleDeletionStatus(GetServiceLinkedRoleDeletionStatusRequest request);

    CompletableFuture<GetServiceLinkedRoleTemplateResponse> getServiceLinkedRoleTemplate(GetServiceLinkedRoleTemplateRequest request);

    CompletableFuture<InitResourceDirectoryResponse> initResourceDirectory(InitResourceDirectoryRequest request);

    CompletableFuture<ListAccountRecordsForParentResponse> listAccountRecordsForParent(ListAccountRecordsForParentRequest request);

    CompletableFuture<ListAccountsResponse> listAccounts(ListAccountsRequest request);

    CompletableFuture<ListAccountsForParentResponse> listAccountsForParent(ListAccountsForParentRequest request);

    CompletableFuture<ListAncestorsResponse> listAncestors(ListAncestorsRequest request);

    CompletableFuture<ListFoldersForParentResponse> listFoldersForParent(ListFoldersForParentRequest request);

    CompletableFuture<ListParentsResponse> listParents(ListParentsRequest request);

    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    CompletableFuture<ListPolicyAttachmentsResponse> listPolicyAttachments(ListPolicyAttachmentsRequest request);

    CompletableFuture<ListPolicyVersionsResponse> listPolicyVersions(ListPolicyVersionsRequest request);

    CompletableFuture<ListResourceGroupsResponse> listResourceGroups(ListResourceGroupsRequest request);

    CompletableFuture<ListRolesResponse> listRoles(ListRolesRequest request);

    CompletableFuture<ListRolesForServiceResponse> listRolesForService(ListRolesForServiceRequest request);

    CompletableFuture<ListTrustedServiceStatusResponse> listTrustedServiceStatus(ListTrustedServiceStatusRequest request);

    CompletableFuture<MoveAccountResponse> moveAccount(MoveAccountRequest request);

    CompletableFuture<PromoteResourceAccountResponse> promoteResourceAccount(PromoteResourceAccountRequest request);

    CompletableFuture<QueryResourceResponse> queryResource(QueryResourceRequest request);

    CompletableFuture<RemoveCloudAccountResponse> removeCloudAccount(RemoveCloudAccountRequest request);

    CompletableFuture<ResendCreateCloudAccountEmailResponse> resendCreateCloudAccountEmail(ResendCreateCloudAccountEmailRequest request);

    CompletableFuture<ResendPromoteResourceAccountEmailResponse> resendPromoteResourceAccountEmail(ResendPromoteResourceAccountEmailRequest request);

    CompletableFuture<SetDefaultPolicyVersionResponse> setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request);

    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

    CompletableFuture<UpdateResourceGroupResponse> updateResourceGroup(UpdateResourceGroupRequest request);

    CompletableFuture<UpdateRoleResponse> updateRole(UpdateRoleRequest request);

}
