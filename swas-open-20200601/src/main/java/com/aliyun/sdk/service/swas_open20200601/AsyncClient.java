// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.swas_open20200601.models.*;
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

    CompletableFuture<CreateCustomImageResponse> createCustomImage(CreateCustomImageRequest request);

    CompletableFuture<CreateFirewallRuleResponse> createFirewallRule(CreateFirewallRuleRequest request);

    CompletableFuture<CreateInstancesResponse> createInstances(CreateInstancesRequest request);

    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    CompletableFuture<DeleteCustomImageResponse> deleteCustomImage(DeleteCustomImageRequest request);

    CompletableFuture<DeleteFirewallRuleResponse> deleteFirewallRule(DeleteFirewallRuleRequest request);

    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    CompletableFuture<ListDisksResponse> listDisks(ListDisksRequest request);

    CompletableFuture<ListFirewallRulesResponse> listFirewallRules(ListFirewallRulesRequest request);

    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    CompletableFuture<ListInstancePlansModificationResponse> listInstancePlansModification(ListInstancePlansModificationRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListInstancesTrafficPackagesResponse> listInstancesTrafficPackages(ListInstancesTrafficPackagesRequest request);

    CompletableFuture<ListPlansResponse> listPlans(ListPlansRequest request);

    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    CompletableFuture<ModifyImageShareStatusResponse> modifyImageShareStatus(ModifyImageShareStatusRequest request);

    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request);

    CompletableFuture<ResetSystemResponse> resetSystem(ResetSystemRequest request);

    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<UpdateInstanceAttributeResponse> updateInstanceAttribute(UpdateInstanceAttributeRequest request);

    CompletableFuture<UpgradeInstanceResponse> upgradeInstance(UpgradeInstanceRequest request);

}
