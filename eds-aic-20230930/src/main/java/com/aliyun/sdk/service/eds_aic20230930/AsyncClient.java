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

    /**
     * @param request the request parameters of AttachKeyPair  AttachKeyPairRequest
     * @return AttachKeyPairResponse
     */
    CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request);

    /**
     * @param request the request parameters of AuthorizeAndroidInstance  AuthorizeAndroidInstanceRequest
     * @return AuthorizeAndroidInstanceResponse
     */
    CompletableFuture<AuthorizeAndroidInstanceResponse> authorizeAndroidInstance(AuthorizeAndroidInstanceRequest request);

    /**
     * @param request the request parameters of BackupFile  BackupFileRequest
     * @return BackupFileResponse
     */
    CompletableFuture<BackupFileResponse> backupFile(BackupFileRequest request);

    /**
     * @param request the request parameters of BatchGetAcpConnectionTicket  BatchGetAcpConnectionTicketRequest
     * @return BatchGetAcpConnectionTicketResponse
     */
    CompletableFuture<BatchGetAcpConnectionTicketResponse> batchGetAcpConnectionTicket(BatchGetAcpConnectionTicketRequest request);

    /**
     * @param request the request parameters of CheckResourceStock  CheckResourceStockRequest
     * @return CheckResourceStockResponse
     */
    CompletableFuture<CheckResourceStockResponse> checkResourceStock(CheckResourceStockRequest request);

    /**
     * @param request the request parameters of CreateAndroidInstanceGroup  CreateAndroidInstanceGroupRequest
     * @return CreateAndroidInstanceGroupResponse
     */
    CompletableFuture<CreateAndroidInstanceGroupResponse> createAndroidInstanceGroup(CreateAndroidInstanceGroupRequest request);

    /**
     * @param request the request parameters of CreateApp  CreateAppRequest
     * @return CreateAppResponse
     */
    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    /**
     * @param request the request parameters of CreateCustomImage  CreateCustomImageRequest
     * @return CreateCustomImageResponse
     */
    CompletableFuture<CreateCustomImageResponse> createCustomImage(CreateCustomImageRequest request);

    /**
     * @param request the request parameters of CreateKeyPair  CreateKeyPairRequest
     * @return CreateKeyPairResponse
     */
    CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request);

    /**
     * @param request the request parameters of CreatePolicyGroup  CreatePolicyGroupRequest
     * @return CreatePolicyGroupResponse
     */
    CompletableFuture<CreatePolicyGroupResponse> createPolicyGroup(CreatePolicyGroupRequest request);

    /**
     * @param request the request parameters of CreateScreenshot  CreateScreenshotRequest
     * @return CreateScreenshotResponse
     */
    CompletableFuture<CreateScreenshotResponse> createScreenshot(CreateScreenshotRequest request);

    /**
     * @param request the request parameters of DeleteAndroidInstanceGroup  DeleteAndroidInstanceGroupRequest
     * @return DeleteAndroidInstanceGroupResponse
     */
    CompletableFuture<DeleteAndroidInstanceGroupResponse> deleteAndroidInstanceGroup(DeleteAndroidInstanceGroupRequest request);

    /**
     * @param request the request parameters of DeleteApps  DeleteAppsRequest
     * @return DeleteAppsResponse
     */
    CompletableFuture<DeleteAppsResponse> deleteApps(DeleteAppsRequest request);

    /**
     * @param request the request parameters of DeleteImages  DeleteImagesRequest
     * @return DeleteImagesResponse
     */
    CompletableFuture<DeleteImagesResponse> deleteImages(DeleteImagesRequest request);

    /**
     * @param request the request parameters of DeleteKeyPairs  DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     */
    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    /**
     * @param request the request parameters of DeletePolicyGroup  DeletePolicyGroupRequest
     * @return DeletePolicyGroupResponse
     */
    CompletableFuture<DeletePolicyGroupResponse> deletePolicyGroup(DeletePolicyGroupRequest request);

    /**
     * @param request the request parameters of DescribeAndroidInstanceGroups  DescribeAndroidInstanceGroupsRequest
     * @return DescribeAndroidInstanceGroupsResponse
     */
    CompletableFuture<DescribeAndroidInstanceGroupsResponse> describeAndroidInstanceGroups(DescribeAndroidInstanceGroupsRequest request);

    /**
     * @param request the request parameters of DescribeAndroidInstances  DescribeAndroidInstancesRequest
     * @return DescribeAndroidInstancesResponse
     */
    CompletableFuture<DescribeAndroidInstancesResponse> describeAndroidInstances(DescribeAndroidInstancesRequest request);

    /**
     * @param request the request parameters of DescribeApps  DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    CompletableFuture<DescribeAppsResponse> describeApps(DescribeAppsRequest request);

    /**
     * @param request the request parameters of DescribeBackupFiles  DescribeBackupFilesRequest
     * @return DescribeBackupFilesResponse
     */
    CompletableFuture<DescribeBackupFilesResponse> describeBackupFiles(DescribeBackupFilesRequest request);

    /**
     * @param request the request parameters of DescribeImageList  DescribeImageListRequest
     * @return DescribeImageListResponse
     */
    CompletableFuture<DescribeImageListResponse> describeImageList(DescribeImageListRequest request);

    /**
     * @param request the request parameters of DescribeInvocations  DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    /**
     * @param request the request parameters of DescribeKeyPairs  DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     */
    CompletableFuture<DescribeKeyPairsResponse> describeKeyPairs(DescribeKeyPairsRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeSpec  DescribeSpecRequest
     * @return DescribeSpecResponse
     */
    CompletableFuture<DescribeSpecResponse> describeSpec(DescribeSpecRequest request);

    /**
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
     * @param request the request parameters of DetachKeyPair  DetachKeyPairRequest
     * @return DetachKeyPairResponse
     */
    CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request);

    /**
     * @param request the request parameters of DistributeImage  DistributeImageRequest
     * @return DistributeImageResponse
     */
    CompletableFuture<DistributeImageResponse> distributeImage(DistributeImageRequest request);

    /**
     * @param request the request parameters of DowngradeAndroidInstanceGroup  DowngradeAndroidInstanceGroupRequest
     * @return DowngradeAndroidInstanceGroupResponse
     */
    CompletableFuture<DowngradeAndroidInstanceGroupResponse> downgradeAndroidInstanceGroup(DowngradeAndroidInstanceGroupRequest request);

    /**
     * @param request the request parameters of FetchFile  FetchFileRequest
     * @return FetchFileResponse
     */
    CompletableFuture<FetchFileResponse> fetchFile(FetchFileRequest request);

    /**
     * @param request the request parameters of ImportKeyPair  ImportKeyPairRequest
     * @return ImportKeyPairResponse
     */
    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    /**
     * @param request the request parameters of InstallApp  InstallAppRequest
     * @return InstallAppResponse
     */
    CompletableFuture<InstallAppResponse> installApp(InstallAppRequest request);

    /**
     * @param request the request parameters of ListPolicyGroups  ListPolicyGroupsRequest
     * @return ListPolicyGroupsResponse
     */
    CompletableFuture<ListPolicyGroupsResponse> listPolicyGroups(ListPolicyGroupsRequest request);

    /**
     * @param request the request parameters of ModifyAndroidInstance  ModifyAndroidInstanceRequest
     * @return ModifyAndroidInstanceResponse
     */
    CompletableFuture<ModifyAndroidInstanceResponse> modifyAndroidInstance(ModifyAndroidInstanceRequest request);

    /**
     * @param request the request parameters of ModifyAndroidInstanceGroup  ModifyAndroidInstanceGroupRequest
     * @return ModifyAndroidInstanceGroupResponse
     */
    CompletableFuture<ModifyAndroidInstanceGroupResponse> modifyAndroidInstanceGroup(ModifyAndroidInstanceGroupRequest request);

    /**
     * @param request the request parameters of ModifyApp  ModifyAppRequest
     * @return ModifyAppResponse
     */
    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    /**
     * @param request the request parameters of ModifyKeyPairName  ModifyKeyPairNameRequest
     * @return ModifyKeyPairNameResponse
     */
    CompletableFuture<ModifyKeyPairNameResponse> modifyKeyPairName(ModifyKeyPairNameRequest request);

    /**
     * @param request the request parameters of ModifyPolicyGroup  ModifyPolicyGroupRequest
     * @return ModifyPolicyGroupResponse
     */
    CompletableFuture<ModifyPolicyGroupResponse> modifyPolicyGroup(ModifyPolicyGroupRequest request);

    /**
     * @param request the request parameters of OperateApp  OperateAppRequest
     * @return OperateAppResponse
     */
    CompletableFuture<OperateAppResponse> operateApp(OperateAppRequest request);

    /**
     * @param request the request parameters of RebootAndroidInstancesInGroup  RebootAndroidInstancesInGroupRequest
     * @return RebootAndroidInstancesInGroupResponse
     */
    CompletableFuture<RebootAndroidInstancesInGroupResponse> rebootAndroidInstancesInGroup(RebootAndroidInstancesInGroupRequest request);

    /**
     * @param request the request parameters of RecoveryFile  RecoveryFileRequest
     * @return RecoveryFileResponse
     */
    CompletableFuture<RecoveryFileResponse> recoveryFile(RecoveryFileRequest request);

    /**
     * @param request the request parameters of RenewAndroidInstanceGroups  RenewAndroidInstanceGroupsRequest
     * @return RenewAndroidInstanceGroupsResponse
     */
    CompletableFuture<RenewAndroidInstanceGroupsResponse> renewAndroidInstanceGroups(RenewAndroidInstanceGroupsRequest request);

    /**
     * @param request the request parameters of ResetAndroidInstancesInGroup  ResetAndroidInstancesInGroupRequest
     * @return ResetAndroidInstancesInGroupResponse
     */
    CompletableFuture<ResetAndroidInstancesInGroupResponse> resetAndroidInstancesInGroup(ResetAndroidInstancesInGroupRequest request);

    /**
     * @param request the request parameters of RunCommand  RunCommandRequest
     * @return RunCommandResponse
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
     * @param request the request parameters of SendFile  SendFileRequest
     * @return SendFileResponse
     */
    CompletableFuture<SendFileResponse> sendFile(SendFileRequest request);

    /**
     * @param request the request parameters of StartAndroidInstance  StartAndroidInstanceRequest
     * @return StartAndroidInstanceResponse
     */
    CompletableFuture<StartAndroidInstanceResponse> startAndroidInstance(StartAndroidInstanceRequest request);

    /**
     * @param request the request parameters of StopAndroidInstance  StopAndroidInstanceRequest
     * @return StopAndroidInstanceResponse
     */
    CompletableFuture<StopAndroidInstanceResponse> stopAndroidInstance(StopAndroidInstanceRequest request);

    /**
     * @param request the request parameters of UninstallApp  UninstallAppRequest
     * @return UninstallAppResponse
     */
    CompletableFuture<UninstallAppResponse> uninstallApp(UninstallAppRequest request);

    /**
     * @param request the request parameters of UpdateCustomImageName  UpdateCustomImageNameRequest
     * @return UpdateCustomImageNameResponse
     */
    CompletableFuture<UpdateCustomImageNameResponse> updateCustomImageName(UpdateCustomImageNameRequest request);

    /**
     * @param request the request parameters of UpdateInstanceGroupImage  UpdateInstanceGroupImageRequest
     * @return UpdateInstanceGroupImageResponse
     */
    CompletableFuture<UpdateInstanceGroupImageResponse> updateInstanceGroupImage(UpdateInstanceGroupImageRequest request);

    /**
     * @param request the request parameters of UpgradeAndroidInstanceGroup  UpgradeAndroidInstanceGroupRequest
     * @return UpgradeAndroidInstanceGroupResponse
     */
    CompletableFuture<UpgradeAndroidInstanceGroupResponse> upgradeAndroidInstanceGroup(UpgradeAndroidInstanceGroupRequest request);

}
