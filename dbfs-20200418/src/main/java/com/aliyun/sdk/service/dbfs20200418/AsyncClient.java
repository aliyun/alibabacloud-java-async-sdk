// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dbfs20200418.models.*;
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
     * @param request the request parameters of AddTagsBatch  AddTagsBatchRequest
     * @return AddTagsBatchResponse
     */
    CompletableFuture<AddTagsBatchResponse> addTagsBatch(AddTagsBatchRequest request);

    /**
     * @param request the request parameters of ApplyAutoSnapshotPolicy  ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of AttachDbfs  AttachDbfsRequest
     * @return AttachDbfsResponse
     */
    CompletableFuture<AttachDbfsResponse> attachDbfs(AttachDbfsRequest request);

    /**
     * @param request the request parameters of CancelAutoSnapshotPolicy  CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of CreateAutoSnapshotPolicy  CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of CreateDbfs  CreateDbfsRequest
     * @return CreateDbfsResponse
     */
    CompletableFuture<CreateDbfsResponse> createDbfs(CreateDbfsRequest request);

    /**
     * @param request the request parameters of CreateServiceLinkedRole  CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteAutoSnapshotPolicy  DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
    CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of DeleteDbfs  DeleteDbfsRequest
     * @return DeleteDbfsResponse
     */
    CompletableFuture<DeleteDbfsResponse> deleteDbfs(DeleteDbfsRequest request);

    /**
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteTagsBatch  DeleteTagsBatchRequest
     * @return DeleteTagsBatchResponse
     */
    CompletableFuture<DeleteTagsBatchResponse> deleteTagsBatch(DeleteTagsBatchRequest request);

    /**
     * @param request the request parameters of DescribeDbfsSpecifications  DescribeDbfsSpecificationsRequest
     * @return DescribeDbfsSpecificationsResponse
     */
    CompletableFuture<DescribeDbfsSpecificationsResponse> describeDbfsSpecifications(DescribeDbfsSpecificationsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceTypes  DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     */
    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    /**
     * @param request the request parameters of DetachDbfs  DetachDbfsRequest
     * @return DetachDbfsResponse
     */
    CompletableFuture<DetachDbfsResponse> detachDbfs(DetachDbfsRequest request);

    /**
     * @param request the request parameters of GetAutoSnapshotPolicy  GetAutoSnapshotPolicyRequest
     * @return GetAutoSnapshotPolicyResponse
     */
    CompletableFuture<GetAutoSnapshotPolicyResponse> getAutoSnapshotPolicy(GetAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of GetDbfs  GetDbfsRequest
     * @return GetDbfsResponse
     */
    CompletableFuture<GetDbfsResponse> getDbfs(GetDbfsRequest request);

    /**
     * @param request the request parameters of GetServiceLinkedRole  GetServiceLinkedRoleRequest
     * @return GetServiceLinkedRoleResponse
     */
    CompletableFuture<GetServiceLinkedRoleResponse> getServiceLinkedRole(GetServiceLinkedRoleRequest request);

    /**
     * @param request the request parameters of GetSnapshotLink  GetSnapshotLinkRequest
     * @return GetSnapshotLinkResponse
     */
    CompletableFuture<GetSnapshotLinkResponse> getSnapshotLink(GetSnapshotLinkRequest request);

    /**
     * @param request the request parameters of ListAutoSnapshotPolicies  ListAutoSnapshotPoliciesRequest
     * @return ListAutoSnapshotPoliciesResponse
     */
    CompletableFuture<ListAutoSnapshotPoliciesResponse> listAutoSnapshotPolicies(ListAutoSnapshotPoliciesRequest request);

    /**
     * @param request the request parameters of ListAutoSnapshotPolicyAppliedDbfs  ListAutoSnapshotPolicyAppliedDbfsRequest
     * @return ListAutoSnapshotPolicyAppliedDbfsResponse
     */
    CompletableFuture<ListAutoSnapshotPolicyAppliedDbfsResponse> listAutoSnapshotPolicyAppliedDbfs(ListAutoSnapshotPolicyAppliedDbfsRequest request);

    /**
     * @param request the request parameters of ListAutoSnapshotPolicyUnappliedDbfs  ListAutoSnapshotPolicyUnappliedDbfsRequest
     * @return ListAutoSnapshotPolicyUnappliedDbfsResponse
     */
    CompletableFuture<ListAutoSnapshotPolicyUnappliedDbfsResponse> listAutoSnapshotPolicyUnappliedDbfs(ListAutoSnapshotPolicyUnappliedDbfsRequest request);

    /**
     * @param request the request parameters of ListDbfs  ListDbfsRequest
     * @return ListDbfsResponse
     */
    CompletableFuture<ListDbfsResponse> listDbfs(ListDbfsRequest request);

    /**
     * @param request the request parameters of ListDbfsAttachableEcsInstances  ListDbfsAttachableEcsInstancesRequest
     * @return ListDbfsAttachableEcsInstancesResponse
     */
    CompletableFuture<ListDbfsAttachableEcsInstancesResponse> listDbfsAttachableEcsInstances(ListDbfsAttachableEcsInstancesRequest request);

    /**
     * @param request the request parameters of ListDbfsAttachedEcsInstances  ListDbfsAttachedEcsInstancesRequest
     * @return ListDbfsAttachedEcsInstancesResponse
     */
    CompletableFuture<ListDbfsAttachedEcsInstancesResponse> listDbfsAttachedEcsInstances(ListDbfsAttachedEcsInstancesRequest request);

    /**
     * @param request the request parameters of ListSnapshot  ListSnapshotRequest
     * @return ListSnapshotResponse
     */
    CompletableFuture<ListSnapshotResponse> listSnapshot(ListSnapshotRequest request);

    /**
     * @param request the request parameters of ListSnapshotLinks  ListSnapshotLinksRequest
     * @return ListSnapshotLinksResponse
     */
    CompletableFuture<ListSnapshotLinksResponse> listSnapshotLinks(ListSnapshotLinksRequest request);

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
     * @param request the request parameters of ModifyAutoSnapshotPolicy  ModifyAutoSnapshotPolicyRequest
     * @return ModifyAutoSnapshotPolicyResponse
     */
    CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of ModifySnapshotAttribute  ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     */
    CompletableFuture<ModifySnapshotAttributeResponse> modifySnapshotAttribute(ModifySnapshotAttributeRequest request);

    /**
     * @param request the request parameters of RenameDbfs  RenameDbfsRequest
     * @return RenameDbfsResponse
     */
    CompletableFuture<RenameDbfsResponse> renameDbfs(RenameDbfsRequest request);

    /**
     * @param request the request parameters of ResizeDbfs  ResizeDbfsRequest
     * @return ResizeDbfsResponse
     */
    CompletableFuture<ResizeDbfsResponse> resizeDbfs(ResizeDbfsRequest request);

    /**
     * @param request the request parameters of TagDbfs  TagDbfsRequest
     * @return TagDbfsResponse
     */
    CompletableFuture<TagDbfsResponse> tagDbfs(TagDbfsRequest request);

    /**
     * @param request the request parameters of UpdateDbfs  UpdateDbfsRequest
     * @return UpdateDbfsResponse
     */
    CompletableFuture<UpdateDbfsResponse> updateDbfs(UpdateDbfsRequest request);

}
