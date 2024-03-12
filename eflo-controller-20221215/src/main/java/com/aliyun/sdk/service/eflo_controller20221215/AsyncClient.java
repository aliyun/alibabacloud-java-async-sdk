// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eflo_controller20221215.models.*;
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

    CompletableFuture<ApproveOperationResponse> approveOperation(ApproveOperationRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    CompletableFuture<DescribeNodeResponse> describeNode(DescribeNodeRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSendFileResultsResponse> describeSendFileResults(DescribeSendFileResultsRequest request);

    CompletableFuture<DescribeTaskResponse> describeTask(DescribeTaskRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<ExtendClusterResponse> extendCluster(ExtendClusterRequest request);

    CompletableFuture<ListClusterNodesResponse> listClusterNodes(ListClusterNodesRequest request);

    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    CompletableFuture<ListFreeNodesResponse> listFreeNodes(ListFreeNodesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<RebootNodesResponse> rebootNodes(RebootNodesRequest request);

    CompletableFuture<ReimageNodesResponse> reimageNodes(ReimageNodesRequest request);

    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    CompletableFuture<SendFileResponse> sendFile(SendFileRequest request);

    CompletableFuture<ShrinkClusterResponse> shrinkCluster(ShrinkClusterRequest request);

    CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
