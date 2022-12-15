// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dbfs20200418.models.*;
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

    CompletableFuture<AddTagsBatchResponse> addTagsBatch(AddTagsBatchRequest request);

    CompletableFuture<AttachDbfsResponse> attachDbfs(AttachDbfsRequest request);

    CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request);

    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    CompletableFuture<CreateDbfsResponse> createDbfs(CreateDbfsRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    CompletableFuture<DeleteDbfsResponse> deleteDbfs(DeleteDbfsRequest request);

    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    CompletableFuture<DeleteTagsBatchResponse> deleteTagsBatch(DeleteTagsBatchRequest request);

    CompletableFuture<DescribeDbfsSpecificationsResponse> describeDbfsSpecifications(DescribeDbfsSpecificationsRequest request);

    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    CompletableFuture<DetachDbfsResponse> detachDbfs(DetachDbfsRequest request);

    CompletableFuture<GetDbfsResponse> getDbfs(GetDbfsRequest request);

    CompletableFuture<GetServiceLinkedRoleResponse> getServiceLinkedRole(GetServiceLinkedRoleRequest request);

    CompletableFuture<ListDbfsResponse> listDbfs(ListDbfsRequest request);

    CompletableFuture<ListDbfsAttachableEcsInstancesResponse> listDbfsAttachableEcsInstances(ListDbfsAttachableEcsInstancesRequest request);

    CompletableFuture<ListDbfsAttachedEcsInstancesResponse> listDbfsAttachedEcsInstances(ListDbfsAttachedEcsInstancesRequest request);

    CompletableFuture<ListSnapshotResponse> listSnapshot(ListSnapshotRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    CompletableFuture<RenameDbfsResponse> renameDbfs(RenameDbfsRequest request);

    CompletableFuture<ResizeDbfsResponse> resizeDbfs(ResizeDbfsRequest request);

    CompletableFuture<TagDbfsResponse> tagDbfs(TagDbfsRequest request);

    CompletableFuture<UpdateDbfsResponse> updateDbfs(UpdateDbfsRequest request);

}
