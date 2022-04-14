// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.adcp20220101.models.*;
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

    CompletableFuture<AttachClusterToHubResponse> attachClusterToHub(AttachClusterToHubRequest request);

    CompletableFuture<CreateHubClusterResponse> createHubCluster(CreateHubClusterRequest request);

    CompletableFuture<DeleteHubClusterResponse> deleteHubCluster(DeleteHubClusterRequest request);

    CompletableFuture<DescribeHubClusterDetailsResponse> describeHubClusterDetails(DescribeHubClusterDetailsRequest request);

    CompletableFuture<DescribeHubClusterKubeconfigResponse> describeHubClusterKubeconfig(DescribeHubClusterKubeconfigRequest request);

    CompletableFuture<DescribeHubClusterLogsResponse> describeHubClusterLogs(DescribeHubClusterLogsRequest request);

    CompletableFuture<DescribeHubClustersResponse> describeHubClusters(DescribeHubClustersRequest request);

    CompletableFuture<DescribeManagedClustersResponse> describeManagedClusters(DescribeManagedClustersRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DetachClusterFromHubResponse> detachClusterFromHub(DetachClusterFromHubRequest request);

}
