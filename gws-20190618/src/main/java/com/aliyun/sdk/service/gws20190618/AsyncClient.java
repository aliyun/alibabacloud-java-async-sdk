// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.gws20190618.models.*;
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

    CompletableFuture<CheckServiceLinkedRoleForDeletingResponse> checkServiceLinkedRoleForDeleting(CheckServiceLinkedRoleForDeletingRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeClusterADDomainResponse> describeClusterADDomain(DescribeClusterADDomainRequest request);

    CompletableFuture<DescribeClusterConnectionsResponse> describeClusterConnections(DescribeClusterConnectionsRequest request);

    CompletableFuture<DescribeClusterPolicyResponse> describeClusterPolicy(DescribeClusterPolicyRequest request);

    CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request);

    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    CompletableFuture<DescribeInstancePolicyResponse> describeInstancePolicy(DescribeInstancePolicyRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<GetConnectTicketResponse> getConnectTicket(GetConnectTicketRequest request);

    CompletableFuture<IsUserAdminResponse> isUserAdmin(IsUserAdminRequest request);

    CompletableFuture<RestartInstanceResponse> restartInstance(RestartInstanceRequest request);

    CompletableFuture<SetClusterADDomainResponse> setClusterADDomain(SetClusterADDomainRequest request);

    CompletableFuture<SetClusterDnatResponse> setClusterDnat(SetClusterDnatRequest request);

    CompletableFuture<SetClusterNameResponse> setClusterName(SetClusterNameRequest request);

    CompletableFuture<SetClusterPolicyResponse> setClusterPolicy(SetClusterPolicyRequest request);

    CompletableFuture<SetImageNameResponse> setImageName(SetImageNameRequest request);

    CompletableFuture<SetInstanceNameResponse> setInstanceName(SetInstanceNameRequest request);

    CompletableFuture<SetInstancePolicyResponse> setInstancePolicy(SetInstancePolicyRequest request);

    CompletableFuture<SetInstanceUserResponse> setInstanceUser(SetInstanceUserRequest request);

    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

}
