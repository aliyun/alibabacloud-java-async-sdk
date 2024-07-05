// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vs20181212.models.*;
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

    CompletableFuture<AddVsPullStreamInfoConfigResponse> addVsPullStreamInfoConfig(AddVsPullStreamInfoConfigRequest request);

    CompletableFuture<BatchBindDirectoriesResponse> batchBindDirectories(BatchBindDirectoriesRequest request);

    CompletableFuture<BatchBindParentPlatformDevicesResponse> batchBindParentPlatformDevices(BatchBindParentPlatformDevicesRequest request);

    CompletableFuture<BatchBindPurchasedDevicesResponse> batchBindPurchasedDevices(BatchBindPurchasedDevicesRequest request);

    CompletableFuture<BatchBindTemplateResponse> batchBindTemplate(BatchBindTemplateRequest request);

    CompletableFuture<BatchBindTemplatesResponse> batchBindTemplates(BatchBindTemplatesRequest request);

    CompletableFuture<BatchDeleteDevicesResponse> batchDeleteDevices(BatchDeleteDevicesRequest request);

    CompletableFuture<BatchDeleteVsDomainConfigsResponse> batchDeleteVsDomainConfigs(BatchDeleteVsDomainConfigsRequest request);

    CompletableFuture<BatchForbidVsStreamResponse> batchForbidVsStream(BatchForbidVsStreamRequest request);

    CompletableFuture<BatchResumeVsStreamResponse> batchResumeVsStream(BatchResumeVsStreamRequest request);

    CompletableFuture<BatchSetVsDomainConfigsResponse> batchSetVsDomainConfigs(BatchSetVsDomainConfigsRequest request);

    CompletableFuture<BatchStartDevicesResponse> batchStartDevices(BatchStartDevicesRequest request);

    CompletableFuture<BatchStartStreamsResponse> batchStartStreams(BatchStartStreamsRequest request);

    CompletableFuture<BatchStopDevicesResponse> batchStopDevices(BatchStopDevicesRequest request);

    CompletableFuture<BatchStopStreamsResponse> batchStopStreams(BatchStopStreamsRequest request);

    CompletableFuture<BatchUnbindDirectoriesResponse> batchUnbindDirectories(BatchUnbindDirectoriesRequest request);

    CompletableFuture<BatchUnbindParentPlatformDevicesResponse> batchUnbindParentPlatformDevices(BatchUnbindParentPlatformDevicesRequest request);

    CompletableFuture<BatchUnbindPurchasedDevicesResponse> batchUnbindPurchasedDevices(BatchUnbindPurchasedDevicesRequest request);

    CompletableFuture<BatchUnbindTemplateResponse> batchUnbindTemplate(BatchUnbindTemplateRequest request);

    CompletableFuture<BatchUnbindTemplatesResponse> batchUnbindTemplates(BatchUnbindTemplatesRequest request);

    CompletableFuture<BindDirectoryResponse> bindDirectory(BindDirectoryRequest request);

    CompletableFuture<BindParentPlatformDeviceResponse> bindParentPlatformDevice(BindParentPlatformDeviceRequest request);

    CompletableFuture<BindPurchasedDeviceResponse> bindPurchasedDevice(BindPurchasedDeviceRequest request);

    CompletableFuture<BindTemplateResponse> bindTemplate(BindTemplateRequest request);

    CompletableFuture<ContinuousAdjustResponse> continuousAdjust(ContinuousAdjustRequest request);

    CompletableFuture<ContinuousMoveResponse> continuousMove(ContinuousMoveRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateDeviceResponse> createDevice(CreateDeviceRequest request);

    CompletableFuture<CreateDeviceAlarmResponse> createDeviceAlarm(CreateDeviceAlarmRequest request);

    CompletableFuture<CreateDirectoryResponse> createDirectory(CreateDirectoryRequest request);

    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    CompletableFuture<CreateParentPlatformResponse> createParentPlatform(CreateParentPlatformRequest request);

    CompletableFuture<CreateRenderingInstanceResponse> createRenderingInstance(CreateRenderingInstanceRequest request);

    CompletableFuture<CreateStreamSnapshotResponse> createStreamSnapshot(CreateStreamSnapshotRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<DeleteCloudAppResponse> deleteCloudApp(DeleteCloudAppRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteDeviceResponse> deleteDevice(DeleteDeviceRequest request);

    CompletableFuture<DeleteDirectoryResponse> deleteDirectory(DeleteDirectoryRequest request);

    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    CompletableFuture<DeleteParentPlatformResponse> deleteParentPlatform(DeleteParentPlatformRequest request);

    CompletableFuture<DeletePresetResponse> deletePreset(DeletePresetRequest request);

    CompletableFuture<DeletePublicKeyResponse> deletePublicKey(DeletePublicKeyRequest request);

    CompletableFuture<DeleteRenderingInstanceConfigurationResponse> deleteRenderingInstanceConfiguration(DeleteRenderingInstanceConfigurationRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DeleteVsPullStreamInfoConfigResponse> deleteVsPullStreamInfoConfig(DeleteVsPullStreamInfoConfigRequest request);

    CompletableFuture<DeleteVsStreamsNotifyUrlConfigResponse> deleteVsStreamsNotifyUrlConfig(DeleteVsStreamsNotifyUrlConfigRequest request);

    CompletableFuture<DescribeAccountStatResponse> describeAccountStat(DescribeAccountStatRequest request);

    CompletableFuture<DescribeClusterResponse> describeCluster(DescribeClusterRequest request);

    CompletableFuture<DescribeClusterDevicesResponse> describeClusterDevices(DescribeClusterDevicesRequest request);

    CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request);

    CompletableFuture<DescribeContainerInstanceIdResponse> describeContainerInstanceId(DescribeContainerInstanceIdRequest request);

    CompletableFuture<DescribeDeviceResponse> describeDevice(DescribeDeviceRequest request);

    CompletableFuture<DescribeDeviceChannelsResponse> describeDeviceChannels(DescribeDeviceChannelsRequest request);

    CompletableFuture<DescribeDeviceGatewayResponse> describeDeviceGateway(DescribeDeviceGatewayRequest request);

    CompletableFuture<DescribeDeviceURLResponse> describeDeviceURL(DescribeDeviceURLRequest request);

    CompletableFuture<DescribeDevicesResponse> describeDevices(DescribeDevicesRequest request);

    CompletableFuture<DescribeDirectoriesResponse> describeDirectories(DescribeDirectoriesRequest request);

    CompletableFuture<DescribeDirectoryResponse> describeDirectory(DescribeDirectoryRequest request);

    CompletableFuture<DescribeGroupResponse> describeGroup(DescribeGroupRequest request);

    CompletableFuture<DescribeGroupsResponse> describeGroups(DescribeGroupsRequest request);

    CompletableFuture<DescribeParentPlatformResponse> describeParentPlatform(DescribeParentPlatformRequest request);

    CompletableFuture<DescribeParentPlatformDevicesResponse> describeParentPlatformDevices(DescribeParentPlatformDevicesRequest request);

    CompletableFuture<DescribeParentPlatformsResponse> describeParentPlatforms(DescribeParentPlatformsRequest request);

    CompletableFuture<DescribePresetsResponse> describePresets(DescribePresetsRequest request);

    CompletableFuture<DescribePublishStreamStatusResponse> describePublishStreamStatus(DescribePublishStreamStatusRequest request);

    CompletableFuture<DescribePurchasedDeviceResponse> describePurchasedDevice(DescribePurchasedDeviceRequest request);

    CompletableFuture<DescribePurchasedDevicesResponse> describePurchasedDevices(DescribePurchasedDevicesRequest request);

    CompletableFuture<DescribeRecordsResponse> describeRecords(DescribeRecordsRequest request);

    CompletableFuture<DescribeRenderingInstanceResponse> describeRenderingInstance(DescribeRenderingInstanceRequest request);

    CompletableFuture<DescribeRenderingInstanceConfigurationResponse> describeRenderingInstanceConfiguration(DescribeRenderingInstanceConfigurationRequest request);

    CompletableFuture<DescribeStreamResponse> describeStream(DescribeStreamRequest request);

    CompletableFuture<DescribeStreamURLResponse> describeStreamURL(DescribeStreamURLRequest request);

    CompletableFuture<DescribeStreamVodListResponse> describeStreamVodList(DescribeStreamVodListRequest request);

    CompletableFuture<DescribeStreamsResponse> describeStreams(DescribeStreamsRequest request);

    CompletableFuture<DescribeTemplateResponse> describeTemplate(DescribeTemplateRequest request);

    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

    CompletableFuture<DescribeUserDevicesResponse> describeUserDevices(DescribeUserDevicesRequest request);

    CompletableFuture<DescribeVodStreamURLResponse> describeVodStreamURL(DescribeVodStreamURLRequest request);

    CompletableFuture<DescribeVsCertificateDetailResponse> describeVsCertificateDetail(DescribeVsCertificateDetailRequest request);

    CompletableFuture<DescribeVsCertificateListResponse> describeVsCertificateList(DescribeVsCertificateListRequest request);

    CompletableFuture<DescribeVsDevicesDataResponse> describeVsDevicesData(DescribeVsDevicesDataRequest request);

    CompletableFuture<DescribeVsDomainBpsDataResponse> describeVsDomainBpsData(DescribeVsDomainBpsDataRequest request);

    CompletableFuture<DescribeVsDomainCertificateInfoResponse> describeVsDomainCertificateInfo(DescribeVsDomainCertificateInfoRequest request);

    CompletableFuture<DescribeVsDomainConfigsResponse> describeVsDomainConfigs(DescribeVsDomainConfigsRequest request);

    CompletableFuture<DescribeVsDomainDetailResponse> describeVsDomainDetail(DescribeVsDomainDetailRequest request);

    CompletableFuture<DescribeVsDomainPvDataResponse> describeVsDomainPvData(DescribeVsDomainPvDataRequest request);

    CompletableFuture<DescribeVsDomainPvUvDataResponse> describeVsDomainPvUvData(DescribeVsDomainPvUvDataRequest request);

    CompletableFuture<DescribeVsDomainRecordDataResponse> describeVsDomainRecordData(DescribeVsDomainRecordDataRequest request);

    CompletableFuture<DescribeVsDomainRegionDataResponse> describeVsDomainRegionData(DescribeVsDomainRegionDataRequest request);

    CompletableFuture<DescribeVsDomainReqBpsDataResponse> describeVsDomainReqBpsData(DescribeVsDomainReqBpsDataRequest request);

    CompletableFuture<DescribeVsDomainReqTrafficDataResponse> describeVsDomainReqTrafficData(DescribeVsDomainReqTrafficDataRequest request);

    CompletableFuture<DescribeVsDomainSnapshotDataResponse> describeVsDomainSnapshotData(DescribeVsDomainSnapshotDataRequest request);

    CompletableFuture<DescribeVsDomainTrafficDataResponse> describeVsDomainTrafficData(DescribeVsDomainTrafficDataRequest request);

    CompletableFuture<DescribeVsDomainUvDataResponse> describeVsDomainUvData(DescribeVsDomainUvDataRequest request);

    CompletableFuture<DescribeVsPullStreamInfoConfigResponse> describeVsPullStreamInfoConfig(DescribeVsPullStreamInfoConfigRequest request);

    CompletableFuture<DescribeVsStreamsNotifyUrlConfigResponse> describeVsStreamsNotifyUrlConfig(DescribeVsStreamsNotifyUrlConfigRequest request);

    CompletableFuture<DescribeVsStreamsOnlineListResponse> describeVsStreamsOnlineList(DescribeVsStreamsOnlineListRequest request);

    CompletableFuture<DescribeVsStreamsPublishListResponse> describeVsStreamsPublishList(DescribeVsStreamsPublishListRequest request);

    CompletableFuture<DescribeVsTopDomainsByFlowResponse> describeVsTopDomainsByFlow(DescribeVsTopDomainsByFlowRequest request);

    CompletableFuture<DescribeVsUpPeakPublishStreamDataResponse> describeVsUpPeakPublishStreamData(DescribeVsUpPeakPublishStreamDataRequest request);

    CompletableFuture<DescribeVsUserResourcePackageResponse> describeVsUserResourcePackage(DescribeVsUserResourcePackageRequest request);

    CompletableFuture<DescribeVsVerifyContentResponse> describeVsVerifyContent(DescribeVsVerifyContentRequest request);

    CompletableFuture<ForbidVsStreamResponse> forbidVsStream(ForbidVsStreamRequest request);

    CompletableFuture<GetRenderingInstanceStreamingInfoResponse> getRenderingInstanceStreamingInfo(GetRenderingInstanceStreamingInfoRequest request);

    CompletableFuture<GotoPresetResponse> gotoPreset(GotoPresetRequest request);

    CompletableFuture<InstallCloudAppResponse> installCloudApp(InstallCloudAppRequest request);

    CompletableFuture<ListCloudAppInstallationsResponse> listCloudAppInstallations(ListCloudAppInstallationsRequest request);

    CompletableFuture<ListCloudAppsResponse> listCloudApps(ListCloudAppsRequest request);

    CompletableFuture<ListFilePushStatusesResponse> listFilePushStatuses(ListFilePushStatusesRequest request);

    CompletableFuture<ListFilesResponse> listFiles(ListFilesRequest request);

    CompletableFuture<ListPublicKeysResponse> listPublicKeys(ListPublicKeysRequest request);

    CompletableFuture<ListRenderingInstancesResponse> listRenderingInstances(ListRenderingInstancesRequest request);

    CompletableFuture<ManageLoginResponse> manageLogin(ManageLoginRequest request);

    CompletableFuture<ModifyDeviceResponse> modifyDevice(ModifyDeviceRequest request);

    CompletableFuture<ModifyDeviceAlarmResponse> modifyDeviceAlarm(ModifyDeviceAlarmRequest request);

    CompletableFuture<ModifyDeviceCaptureResponse> modifyDeviceCapture(ModifyDeviceCaptureRequest request);

    CompletableFuture<ModifyDeviceChannelsResponse> modifyDeviceChannels(ModifyDeviceChannelsRequest request);

    CompletableFuture<ModifyDirectoryResponse> modifyDirectory(ModifyDirectoryRequest request);

    CompletableFuture<ModifyGroupResponse> modifyGroup(ModifyGroupRequest request);

    CompletableFuture<ModifyParentPlatformResponse> modifyParentPlatform(ModifyParentPlatformRequest request);

    CompletableFuture<ModifyRenderingInstanceBandwidthResponse> modifyRenderingInstanceBandwidth(ModifyRenderingInstanceBandwidthRequest request);

    CompletableFuture<ModifyTemplateResponse> modifyTemplate(ModifyTemplateRequest request);

    CompletableFuture<OpenVsServiceResponse> openVsService(OpenVsServiceRequest request);

    CompletableFuture<PushFileResponse> pushFile(PushFileRequest request);

    CompletableFuture<RebootRenderingInstanceResponse> rebootRenderingInstance(RebootRenderingInstanceRequest request);

    CompletableFuture<ReleaseRenderingInstanceResponse> releaseRenderingInstance(ReleaseRenderingInstanceRequest request);

    CompletableFuture<RenewRenderingInstanceResponse> renewRenderingInstance(RenewRenderingInstanceRequest request);

    CompletableFuture<ResumeVsStreamResponse> resumeVsStream(ResumeVsStreamRequest request);

    CompletableFuture<SendRenderingInstanceCommandsResponse> sendRenderingInstanceCommands(SendRenderingInstanceCommandsRequest request);

    CompletableFuture<SetPresetResponse> setPreset(SetPresetRequest request);

    CompletableFuture<SetVsDomainCertificateResponse> setVsDomainCertificate(SetVsDomainCertificateRequest request);

    CompletableFuture<SetVsStreamsNotifyUrlConfigResponse> setVsStreamsNotifyUrlConfig(SetVsStreamsNotifyUrlConfigRequest request);

    CompletableFuture<StartDeviceResponse> startDevice(StartDeviceRequest request);

    CompletableFuture<StartParentPlatformResponse> startParentPlatform(StartParentPlatformRequest request);

    CompletableFuture<StartPublishStreamResponse> startPublishStream(StartPublishStreamRequest request);

    CompletableFuture<StartRecordStreamResponse> startRecordStream(StartRecordStreamRequest request);

    CompletableFuture<StartStreamResponse> startStream(StartStreamRequest request);

    CompletableFuture<StartTransferStreamResponse> startTransferStream(StartTransferStreamRequest request);

    CompletableFuture<StopAdjustResponse> stopAdjust(StopAdjustRequest request);

    CompletableFuture<StopDeviceResponse> stopDevice(StopDeviceRequest request);

    CompletableFuture<StopMoveResponse> stopMove(StopMoveRequest request);

    CompletableFuture<StopPublishStreamResponse> stopPublishStream(StopPublishStreamRequest request);

    CompletableFuture<StopRecordStreamResponse> stopRecordStream(StopRecordStreamRequest request);

    CompletableFuture<StopStreamResponse> stopStream(StopStreamRequest request);

    CompletableFuture<StopTransferStreamResponse> stopTransferStream(StopTransferStreamRequest request);

    CompletableFuture<SyncCatalogsResponse> syncCatalogs(SyncCatalogsRequest request);

    CompletableFuture<UnbindDirectoryResponse> unbindDirectory(UnbindDirectoryRequest request);

    CompletableFuture<UnbindParentPlatformDeviceResponse> unbindParentPlatformDevice(UnbindParentPlatformDeviceRequest request);

    CompletableFuture<UnbindPurchasedDeviceResponse> unbindPurchasedDevice(UnbindPurchasedDeviceRequest request);

    CompletableFuture<UnbindTemplateResponse> unbindTemplate(UnbindTemplateRequest request);

    CompletableFuture<UninstallCloudAppResponse> uninstallCloudApp(UninstallCloudAppRequest request);

    CompletableFuture<UnlockDeviceResponse> unlockDevice(UnlockDeviceRequest request);

    CompletableFuture<UpdateCloudAppInfoResponse> updateCloudAppInfo(UpdateCloudAppInfoRequest request);

    CompletableFuture<UpdateClusterResponse> updateCluster(UpdateClusterRequest request);

    CompletableFuture<UpdateFileInfoResponse> updateFileInfo(UpdateFileInfoRequest request);

    CompletableFuture<UpdateRenderingInstanceConfigurationResponse> updateRenderingInstanceConfiguration(UpdateRenderingInstanceConfigurationRequest request);

    CompletableFuture<UpdateVsPullStreamInfoConfigResponse> updateVsPullStreamInfoConfig(UpdateVsPullStreamInfoConfigRequest request);

    CompletableFuture<UploadCloudAppResponse> uploadCloudApp(UploadCloudAppRequest request);

    CompletableFuture<UploadFileResponse> uploadFile(UploadFileRequest request);

    CompletableFuture<UploadPublicKeyResponse> uploadPublicKey(UploadPublicKeyRequest request);

    CompletableFuture<VerifyVsDomainOwnerResponse> verifyVsDomainOwner(VerifyVsDomainOwnerRequest request);

}
