// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.gdb20190903.models.*;
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

    CompletableFuture<AllocateInstancePublicConnectionResponse> allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request);

    CompletableFuture<CloneDBInstanceResponse> cloneDBInstance(CloneDBInstanceRequest request);

    CompletableFuture<CreateAccountResponse> createAccount(CreateAccountRequest request);

    CompletableFuture<CreateDBInstanceResponse> createDBInstance(CreateDBInstanceRequest request);

    CompletableFuture<CreateReadDBInstanceResponse> createReadDBInstance(CreateReadDBInstanceRequest request);

    CompletableFuture<CreateServiceLinkedRoleResponse> createServiceLinkedRole(CreateServiceLinkedRoleRequest request);

    CompletableFuture<DeleteDBDataResponse> deleteDBData(DeleteDBDataRequest request);

    CompletableFuture<DeleteDBInstanceResponse> deleteDBInstance(DeleteDBInstanceRequest request);

    CompletableFuture<DescribeAccountsResponse> describeAccounts(DescribeAccountsRequest request);

    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeBackupPolicyResponse> describeBackupPolicy(DescribeBackupPolicyRequest request);

    CompletableFuture<DescribeBackupsResponse> describeBackups(DescribeBackupsRequest request);

    CompletableFuture<DescribeDBInstanceAccessWhiteListResponse> describeDBInstanceAccessWhiteList(DescribeDBInstanceAccessWhiteListRequest request);

    CompletableFuture<DescribeDBInstanceAttributeResponse> describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request);

    CompletableFuture<DescribeDBInstancePerformanceResponse> describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request);

    CompletableFuture<DescribeDBInstanceStatusResponse> describeDBInstanceStatus(DescribeDBInstanceStatusRequest request);

    CompletableFuture<DescribeDBInstancesResponse> describeDBInstances(DescribeDBInstancesRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeResourceUsageResponse> describeResourceUsage(DescribeResourceUsageRequest request);

    CompletableFuture<DescribeSecurityGroupConfigurationResponse> describeSecurityGroupConfiguration(DescribeSecurityGroupConfigurationRequest request);

    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyBackupPolicyResponse> modifyBackupPolicy(ModifyBackupPolicyRequest request);

    CompletableFuture<ModifyDBInstanceAccessWhiteListResponse> modifyDBInstanceAccessWhiteList(ModifyDBInstanceAccessWhiteListRequest request);

    CompletableFuture<ModifyDBInstanceDescriptionResponse> modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request);

    CompletableFuture<ModifyDBInstanceMaintainTimeResponse> modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request);

    CompletableFuture<ModifyDBInstanceSpecResponse> modifyDBInstanceSpec(ModifyDBInstanceSpecRequest request);

    CompletableFuture<ModifySecurityGroupConfigurationResponse> modifySecurityGroupConfiguration(ModifySecurityGroupConfigurationRequest request);

    CompletableFuture<ResetAccountPasswordResponse> resetAccountPassword(ResetAccountPasswordRequest request);

    CompletableFuture<RestartDBInstanceResponse> restartDBInstance(RestartDBInstanceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpgradeDBInstanceKernelVersionResponse> upgradeDBInstanceKernelVersion(UpgradeDBInstanceKernelVersionRequest request);

}
