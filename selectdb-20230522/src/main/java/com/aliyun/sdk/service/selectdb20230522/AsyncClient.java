// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.selectdb20230522.models.*;
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

    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    CompletableFuture<CheckCreateDBInstanceResponse> checkCreateDBInstance(CheckCreateDBInstanceRequest request);

    CompletableFuture<CheckServiceLinkedRoleResponse> checkServiceLinkedRole(CheckServiceLinkedRoleRequest request);

    CompletableFuture<CreateDBClusterResponse> createDBCluster(CreateDBClusterRequest request);

    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    CompletableFuture<CreateServiceLinkedRoleForSelectDBResponse> createServiceLinkedRoleForSelectDB(CreateServiceLinkedRoleForSelectDBRequest request);

    CompletableFuture<DeleteDBClusterResponse> deleteDBCluster(DeleteDBClusterRequest request);

    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    CompletableFuture<DescribeDBInstanceNetInfoResponse> describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request);

    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    CompletableFuture<DescribeSecurityIPListResponse> describeSecurityIPList(DescribeSecurityIPListRequest request);

    CompletableFuture<ModifyBEClusterAttributeResponse> modifyBEClusterAttribute(ModifyBEClusterAttributeRequest request);

    CompletableFuture<ModifyDBClusterResponse> modifyDBCluster(ModifyDBClusterRequest request);

    CompletableFuture<ModifyDBInstanceAttributeResponse> modifyDBInstanceAttribute(ModifyDBInstanceAttributeRequest request);

    CompletableFuture<ModifySecurityIPListResponse> modifySecurityIPList(ModifySecurityIPListRequest request);

    CompletableFuture<ReleaseInstancePublicConnectionResponse> releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<RestartDBClusterResponse> restartDBCluster(RestartDBClusterRequest request);

    CompletableFuture<StartBEClusterResponse> startBECluster(StartBEClusterRequest request);

    CompletableFuture<StopBEClusterResponse> stopBECluster(StopBEClusterRequest request);

    CompletableFuture<UpgradeDBInstanceEngineVersionResponse> upgradeDBInstanceEngineVersion(UpgradeDBInstanceEngineVersionRequest request);

}
