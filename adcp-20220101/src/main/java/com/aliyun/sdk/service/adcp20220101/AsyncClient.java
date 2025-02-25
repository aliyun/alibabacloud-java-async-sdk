// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.adcp20220101.models.*;
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

    CompletableFuture<AttachClusterToHubResponse> attachClusterToHub(AttachClusterToHubRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CreateHubClusterResponse> createHubCluster(CreateHubClusterRequest request);

    CompletableFuture<DeleteHubClusterResponse> deleteHubCluster(DeleteHubClusterRequest request);

    CompletableFuture<DeletePolicyInstanceResponse> deletePolicyInstance(DeletePolicyInstanceRequest request);

    CompletableFuture<DeleteUserPermissionResponse> deleteUserPermission(DeleteUserPermissionRequest request);

    CompletableFuture<DeployPolicyInstanceResponse> deployPolicyInstance(DeployPolicyInstanceRequest request);

    CompletableFuture<DescribeHubClusterDetailsResponse> describeHubClusterDetails(DescribeHubClusterDetailsRequest request);

    CompletableFuture<DescribeHubClusterKubeconfigResponse> describeHubClusterKubeconfig(DescribeHubClusterKubeconfigRequest request);

    CompletableFuture<DescribeHubClusterLogsResponse> describeHubClusterLogs(DescribeHubClusterLogsRequest request);

    CompletableFuture<DescribeHubClustersResponse> describeHubClusters(DescribeHubClustersRequest request);

    CompletableFuture<DescribeManagedClustersResponse> describeManagedClusters(DescribeManagedClustersRequest request);

    CompletableFuture<DescribePoliciesResponse> describePolicies(DescribePoliciesRequest request);

    CompletableFuture<DescribePolicyDetailsResponse> describePolicyDetails(DescribePolicyDetailsRequest request);

    CompletableFuture<DescribePolicyGovernanceInClusterResponse> describePolicyGovernanceInCluster(DescribePolicyGovernanceInClusterRequest request);

    CompletableFuture<DescribePolicyInstancesResponse> describePolicyInstances(DescribePolicyInstancesRequest request);

    CompletableFuture<DescribePolicyInstancesStatusResponse> describePolicyInstancesStatus(DescribePolicyInstancesStatusRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeUserPermissionsResponse> describeUserPermissions(DescribeUserPermissionsRequest request);

    CompletableFuture<DetachClusterFromHubResponse> detachClusterFromHub(DetachClusterFromHubRequest request);

    /**
      * *   To call this API operation to grant permissions to a RAM user or RAM role on a specific cluster, you must use an Alibaba Cloud account, the account that is used to create the cluster, or a RAM user that has the cluster administrator permissions. A regular RAM user does not have the permissions to call this operation.
      * *   Before you grant RBAC permissions to a RAM user or RAM role on a cluster, you must grant the operation permissions to the RAM user or RAM role on the specified cluster. For more information, see [Attach a system permission policy to a RAM user or RAM role](~~613486~~).
      * For more information, see [Authorization overview](~~613468~~).
      *
     */
    CompletableFuture<GrantUserPermissionResponse> grantUserPermission(GrantUserPermissionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<GrantUserPermissionsResponse> grantUserPermissions(GrantUserPermissionsRequest request);

    CompletableFuture<UpdateHubClusterFeatureResponse> updateHubClusterFeature(UpdateHubClusterFeatureRequest request);

    CompletableFuture<UpdateUserPermissionResponse> updateUserPermission(UpdateUserPermissionRequest request);

}
