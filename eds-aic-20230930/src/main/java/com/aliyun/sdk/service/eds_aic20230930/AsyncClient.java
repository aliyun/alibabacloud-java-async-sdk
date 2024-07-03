// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eds_aic20230930.models.*;
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

    CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request);

    CompletableFuture<AuthorizeAndroidInstanceResponse> authorizeAndroidInstance(AuthorizeAndroidInstanceRequest request);

    CompletableFuture<BackupFileResponse> backupFile(BackupFileRequest request);

    CompletableFuture<CheckResourceStockResponse> checkResourceStock(CheckResourceStockRequest request);

    CompletableFuture<CreateAndroidInstanceGroupResponse> createAndroidInstanceGroup(CreateAndroidInstanceGroupRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateCustomImageResponse> createCustomImage(CreateCustomImageRequest request);

    CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request);

    CompletableFuture<CreatePolicyGroupResponse> createPolicyGroup(CreatePolicyGroupRequest request);

    CompletableFuture<DeleteAndroidInstanceGroupResponse> deleteAndroidInstanceGroup(DeleteAndroidInstanceGroupRequest request);

    CompletableFuture<DeleteAppsResponse> deleteApps(DeleteAppsRequest request);

    CompletableFuture<DeleteImagesResponse> deleteImages(DeleteImagesRequest request);

    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    CompletableFuture<DeletePolicyGroupResponse> deletePolicyGroup(DeletePolicyGroupRequest request);

    CompletableFuture<DescribeAndroidInstanceGroupsResponse> describeAndroidInstanceGroups(DescribeAndroidInstanceGroupsRequest request);

    CompletableFuture<DescribeAndroidInstancesResponse> describeAndroidInstances(DescribeAndroidInstancesRequest request);

    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    CompletableFuture<DescribeBackupFilesResponse> describeBackupFiles(DescribeBackupFilesRequest request);

    CompletableFuture<DescribeImageListResponse> describeImageList(DescribeImageListRequest request);

    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    CompletableFuture<DescribeKeyPairsResponse> describeKeyPairs(DescribeKeyPairsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSpecResponse> describeSpec(DescribeSpecRequest request);

    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request);

    CompletableFuture<DistributeImageResponse> distributeImage(DistributeImageRequest request);

    CompletableFuture<DowngradeAndroidInstanceGroupResponse> downgradeAndroidInstanceGroup(DowngradeAndroidInstanceGroupRequest request);

    CompletableFuture<FetchFileResponse> fetchFile(FetchFileRequest request);

    CompletableFuture<GetAdbSecureResponse> getAdbSecure(GetAdbSecureRequest request);

    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    CompletableFuture<InstallAppResponse> installApp(InstallAppRequest request);

    CompletableFuture<ListPolicyGroupsResponse> listPolicyGroups(ListPolicyGroupsRequest request);

    CompletableFuture<ModifyAndroidInstanceResponse> modifyAndroidInstance(ModifyAndroidInstanceRequest request);

    CompletableFuture<ModifyAndroidInstanceGroupResponse> modifyAndroidInstanceGroup(ModifyAndroidInstanceGroupRequest request);

    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    CompletableFuture<ModifyKeyPairNameResponse> modifyKeyPairName(ModifyKeyPairNameRequest request);

    CompletableFuture<ModifyPolicyGroupResponse> modifyPolicyGroup(ModifyPolicyGroupRequest request);

    CompletableFuture<RebootAndroidInstancesInGroupResponse> rebootAndroidInstancesInGroup(RebootAndroidInstancesInGroupRequest request);

    CompletableFuture<RecoveryFileResponse> recoveryFile(RecoveryFileRequest request);

    CompletableFuture<RenewAndroidInstanceGroupsResponse> renewAndroidInstanceGroups(RenewAndroidInstanceGroupsRequest request);

    CompletableFuture<ResetAndroidInstancesInGroupResponse> resetAndroidInstancesInGroup(ResetAndroidInstancesInGroupRequest request);

    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    CompletableFuture<SendFileResponse> sendFile(SendFileRequest request);

    CompletableFuture<SetAdbSecureResponse> setAdbSecure(SetAdbSecureRequest request);

    CompletableFuture<StartAndroidInstanceResponse> startAndroidInstance(StartAndroidInstanceRequest request);

    CompletableFuture<StopAndroidInstanceResponse> stopAndroidInstance(StopAndroidInstanceRequest request);

    CompletableFuture<UninstallAppResponse> uninstallApp(UninstallAppRequest request);

    CompletableFuture<UpdateCustomImageNameResponse> updateCustomImageName(UpdateCustomImageNameRequest request);

    CompletableFuture<UpdateInstanceGroupImageResponse> updateInstanceGroupImage(UpdateInstanceGroupImageRequest request);

    CompletableFuture<UpgradeAndroidInstanceGroupResponse> upgradeAndroidInstanceGroup(UpgradeAndroidInstanceGroupRequest request);

}
