// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vs20181212.models.*;
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

    CompletableFuture<AddDeviceResponse> addDevice(AddDeviceRequest request);

    CompletableFuture<AddRegisteredDeviceResponse> addRegisteredDevice(AddRegisteredDeviceRequest request);

    CompletableFuture<AddRegisteredVendorResponse> addRegisteredVendor(AddRegisteredVendorRequest request);

    CompletableFuture<AddRenderingDeviceInternetPortsResponse> addRenderingDeviceInternetPorts(AddRenderingDeviceInternetPortsRequest request);

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

    CompletableFuture<CaptureDeviceSnapshotResponse> captureDeviceSnapshot(CaptureDeviceSnapshotRequest request);

    CompletableFuture<ContinuousAdjustResponse> continuousAdjust(ContinuousAdjustRequest request);

    CompletableFuture<ContinuousMoveResponse> continuousMove(ContinuousMoveRequest request);

    CompletableFuture<CreateAIConfigResponse> createAIConfig(CreateAIConfigRequest request);

    CompletableFuture<CreateClusterResponse> createCluster(CreateClusterRequest request);

    CompletableFuture<CreateDeviceResponse> createDevice(CreateDeviceRequest request);

    CompletableFuture<CreateDeviceAlarmResponse> createDeviceAlarm(CreateDeviceAlarmRequest request);

    CompletableFuture<CreateDeviceSnapshotResponse> createDeviceSnapshot(CreateDeviceSnapshotRequest request);

    CompletableFuture<CreateDirectoryResponse> createDirectory(CreateDirectoryRequest request);

    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    CompletableFuture<CreateParentPlatformResponse> createParentPlatform(CreateParentPlatformRequest request);

    CompletableFuture<CreateRenderingDeviceResponse> createRenderingDevice(CreateRenderingDeviceRequest request);

    CompletableFuture<CreateStreamSnapshotResponse> createStreamSnapshot(CreateStreamSnapshotRequest request);

    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    CompletableFuture<DeleteAIConfigResponse> deleteAIConfig(DeleteAIConfigRequest request);

    CompletableFuture<DeleteBucketResponse> deleteBucket(DeleteBucketRequest request);

    CompletableFuture<DeleteClusterResponse> deleteCluster(DeleteClusterRequest request);

    CompletableFuture<DeleteDeviceResponse> deleteDevice(DeleteDeviceRequest request);

    CompletableFuture<DeleteDirectoryResponse> deleteDirectory(DeleteDirectoryRequest request);

    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    CompletableFuture<DeleteParentPlatformResponse> deleteParentPlatform(DeleteParentPlatformRequest request);

    CompletableFuture<DeletePresetResponse> deletePreset(DeletePresetRequest request);

    CompletableFuture<DeletePurchasedDeviceResponse> deletePurchasedDevice(DeletePurchasedDeviceRequest request);

    CompletableFuture<DeleteRenderingDeviceInternetPortsResponse> deleteRenderingDeviceInternetPorts(DeleteRenderingDeviceInternetPortsRequest request);

    CompletableFuture<DeleteRenderingDevicesResponse> deleteRenderingDevices(DeleteRenderingDevicesRequest request);

    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    CompletableFuture<DeleteVsPullStreamInfoConfigResponse> deleteVsPullStreamInfoConfig(DeleteVsPullStreamInfoConfigRequest request);

    CompletableFuture<DeleteVsStreamsNotifyUrlConfigResponse> deleteVsStreamsNotifyUrlConfig(DeleteVsStreamsNotifyUrlConfigRequest request);

    CompletableFuture<DescribeAIConfigResponse> describeAIConfig(DescribeAIConfigRequest request);

    CompletableFuture<DescribeAIConfigListResponse> describeAIConfigList(DescribeAIConfigListRequest request);

    CompletableFuture<DescribeAIEventListResponse> describeAIEventList(DescribeAIEventListRequest request);

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

    CompletableFuture<DescribeExternalStreamURLResponse> describeExternalStreamURL(DescribeExternalStreamURLRequest request);

    CompletableFuture<DescribeGroupResponse> describeGroup(DescribeGroupRequest request);

    CompletableFuture<DescribeGroupsResponse> describeGroups(DescribeGroupsRequest request);

    CompletableFuture<DescribeNodeDevicesInfoResponse> describeNodeDevicesInfo(DescribeNodeDevicesInfoRequest request);

    CompletableFuture<DescribeParentPlatformResponse> describeParentPlatform(DescribeParentPlatformRequest request);

    CompletableFuture<DescribeParentPlatformDevicesResponse> describeParentPlatformDevices(DescribeParentPlatformDevicesRequest request);

    CompletableFuture<DescribeParentPlatformsResponse> describeParentPlatforms(DescribeParentPlatformsRequest request);

    CompletableFuture<DescribePresetsResponse> describePresets(DescribePresetsRequest request);

    CompletableFuture<DescribePurchasedDeviceResponse> describePurchasedDevice(DescribePurchasedDeviceRequest request);

    CompletableFuture<DescribePurchasedDevicesResponse> describePurchasedDevices(DescribePurchasedDevicesRequest request);

    CompletableFuture<DescribeRecordsResponse> describeRecords(DescribeRecordsRequest request);

    CompletableFuture<DescribeRenderingDevicesResponse> describeRenderingDevices(DescribeRenderingDevicesRequest request);

    CompletableFuture<DescribeStreamResponse> describeStream(DescribeStreamRequest request);

    CompletableFuture<DescribeStreamURLResponse> describeStreamURL(DescribeStreamURLRequest request);

    CompletableFuture<DescribeStreamVodListResponse> describeStreamVodList(DescribeStreamVodListRequest request);

    CompletableFuture<DescribeStreamsResponse> describeStreams(DescribeStreamsRequest request);

    CompletableFuture<DescribeTemplateResponse> describeTemplate(DescribeTemplateRequest request);

    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

    CompletableFuture<DescribeVodStreamURLResponse> describeVodStreamURL(DescribeVodStreamURLRequest request);

    CompletableFuture<DescribeVsCertificateDetailResponse> describeVsCertificateDetail(DescribeVsCertificateDetailRequest request);

    CompletableFuture<DescribeVsCertificateListResponse> describeVsCertificateList(DescribeVsCertificateListRequest request);

    CompletableFuture<DescribeVsDevicesDataResponse> describeVsDevicesData(DescribeVsDevicesDataRequest request);

    CompletableFuture<DescribeVsDomainBpsDataResponse> describeVsDomainBpsData(DescribeVsDomainBpsDataRequest request);

    CompletableFuture<DescribeVsDomainCertificateInfoResponse> describeVsDomainCertificateInfo(DescribeVsDomainCertificateInfoRequest request);

    CompletableFuture<DescribeVsDomainConfigsResponse> describeVsDomainConfigs(DescribeVsDomainConfigsRequest request);

    CompletableFuture<DescribeVsDomainDetailResponse> describeVsDomainDetail(DescribeVsDomainDetailRequest request);

    CompletableFuture<DescribeVsDomainOnlineUserNumResponse> describeVsDomainOnlineUserNum(DescribeVsDomainOnlineUserNumRequest request);

    CompletableFuture<DescribeVsDomainPvDataResponse> describeVsDomainPvData(DescribeVsDomainPvDataRequest request);

    CompletableFuture<DescribeVsDomainPvUvDataResponse> describeVsDomainPvUvData(DescribeVsDomainPvUvDataRequest request);

    CompletableFuture<DescribeVsDomainRecordDataResponse> describeVsDomainRecordData(DescribeVsDomainRecordDataRequest request);

    CompletableFuture<DescribeVsDomainRegionDataResponse> describeVsDomainRegionData(DescribeVsDomainRegionDataRequest request);

    CompletableFuture<DescribeVsDomainReqBpsDataResponse> describeVsDomainReqBpsData(DescribeVsDomainReqBpsDataRequest request);

    CompletableFuture<DescribeVsDomainReqTrafficDataResponse> describeVsDomainReqTrafficData(DescribeVsDomainReqTrafficDataRequest request);

    CompletableFuture<DescribeVsDomainSnapshotDataResponse> describeVsDomainSnapshotData(DescribeVsDomainSnapshotDataRequest request);

    CompletableFuture<DescribeVsDomainTrafficDataResponse> describeVsDomainTrafficData(DescribeVsDomainTrafficDataRequest request);

    CompletableFuture<DescribeVsDomainUvDataResponse> describeVsDomainUvData(DescribeVsDomainUvDataRequest request);

    CompletableFuture<DescribeVsPullStreamConfigResponse> describeVsPullStreamConfig(DescribeVsPullStreamConfigRequest request);

    CompletableFuture<DescribeVsPullStreamInfoConfigResponse> describeVsPullStreamInfoConfig(DescribeVsPullStreamInfoConfigRequest request);

    CompletableFuture<DescribeVsStorageTrafficUsageDataResponse> describeVsStorageTrafficUsageData(DescribeVsStorageTrafficUsageDataRequest request);

    CompletableFuture<DescribeVsStorageUsageDataResponse> describeVsStorageUsageData(DescribeVsStorageUsageDataRequest request);

    CompletableFuture<DescribeVsStreamsNotifyUrlConfigResponse> describeVsStreamsNotifyUrlConfig(DescribeVsStreamsNotifyUrlConfigRequest request);

    CompletableFuture<DescribeVsStreamsOnlineListResponse> describeVsStreamsOnlineList(DescribeVsStreamsOnlineListRequest request);

    CompletableFuture<DescribeVsStreamsPublishListResponse> describeVsStreamsPublishList(DescribeVsStreamsPublishListRequest request);

    CompletableFuture<DescribeVsTopDomainsByFlowResponse> describeVsTopDomainsByFlow(DescribeVsTopDomainsByFlowRequest request);

    CompletableFuture<DescribeVsUpPeakPublishStreamDataResponse> describeVsUpPeakPublishStreamData(DescribeVsUpPeakPublishStreamDataRequest request);

    CompletableFuture<DescribeVsUserResourcePackageResponse> describeVsUserResourcePackage(DescribeVsUserResourcePackageRequest request);

    CompletableFuture<ForbidVsStreamResponse> forbidVsStream(ForbidVsStreamRequest request);

    CompletableFuture<GetBucketInfoResponse> getBucketInfo(GetBucketInfoRequest request);

    CompletableFuture<GetObjectTotalResponse> getObjectTotal(GetObjectTotalRequest request);

    CompletableFuture<GotoPresetResponse> gotoPreset(GotoPresetRequest request);

    CompletableFuture<ListBucketsResponse> listBuckets(ListBucketsRequest request);

    CompletableFuture<ListDeviceChannelsResponse> listDeviceChannels(ListDeviceChannelsRequest request);

    CompletableFuture<ListDeviceRecordsResponse> listDeviceRecords(ListDeviceRecordsRequest request);

    CompletableFuture<ListObjectsResponse> listObjects(ListObjectsRequest request);

    CompletableFuture<ModifyDeviceResponse> modifyDevice(ModifyDeviceRequest request);

    CompletableFuture<ModifyDeviceAlarmResponse> modifyDeviceAlarm(ModifyDeviceAlarmRequest request);

    CompletableFuture<ModifyDeviceCaptureResponse> modifyDeviceCapture(ModifyDeviceCaptureRequest request);

    CompletableFuture<ModifyDeviceChannelsResponse> modifyDeviceChannels(ModifyDeviceChannelsRequest request);

    CompletableFuture<ModifyDirectoryResponse> modifyDirectory(ModifyDirectoryRequest request);

    CompletableFuture<ModifyGroupResponse> modifyGroup(ModifyGroupRequest request);

    CompletableFuture<ModifyParentPlatformResponse> modifyParentPlatform(ModifyParentPlatformRequest request);

    CompletableFuture<ModifyPurchasedDeviceResponse> modifyPurchasedDevice(ModifyPurchasedDeviceRequest request);

    CompletableFuture<ModifyTemplateResponse> modifyTemplate(ModifyTemplateRequest request);

    CompletableFuture<OpenVsServiceResponse> openVsService(OpenVsServiceRequest request);

    CompletableFuture<OperateRenderingDevicesResponse> operateRenderingDevices(OperateRenderingDevicesRequest request);

    CompletableFuture<PrepareUploadResponse> prepareUpload(PrepareUploadRequest request);

    CompletableFuture<PutBucketResponse> putBucket(PutBucketRequest request);

    CompletableFuture<ResetRenderingDevicesResponse> resetRenderingDevices(ResetRenderingDevicesRequest request);

    CompletableFuture<ResumeVsStreamResponse> resumeVsStream(ResumeVsStreamRequest request);

    CompletableFuture<SetPresetResponse> setPreset(SetPresetRequest request);

    CompletableFuture<SetVsDomainCertificateResponse> setVsDomainCertificate(SetVsDomainCertificateRequest request);

    CompletableFuture<SetVsStreamsNotifyUrlConfigResponse> setVsStreamsNotifyUrlConfig(SetVsStreamsNotifyUrlConfigRequest request);

    CompletableFuture<StartDeviceResponse> startDevice(StartDeviceRequest request);

    CompletableFuture<StartParentPlatformResponse> startParentPlatform(StartParentPlatformRequest request);

    CompletableFuture<StartRecordStreamResponse> startRecordStream(StartRecordStreamRequest request);

    CompletableFuture<StartStreamResponse> startStream(StartStreamRequest request);

    CompletableFuture<StartTransferStreamResponse> startTransferStream(StartTransferStreamRequest request);

    CompletableFuture<StopAdjustResponse> stopAdjust(StopAdjustRequest request);

    CompletableFuture<StopDeviceResponse> stopDevice(StopDeviceRequest request);

    CompletableFuture<StopMoveResponse> stopMove(StopMoveRequest request);

    CompletableFuture<StopParentPlatformResponse> stopParentPlatform(StopParentPlatformRequest request);

    CompletableFuture<StopRecordStreamResponse> stopRecordStream(StopRecordStreamRequest request);

    CompletableFuture<StopStreamResponse> stopStream(StopStreamRequest request);

    CompletableFuture<StopTransferStreamResponse> stopTransferStream(StopTransferStreamRequest request);

    CompletableFuture<SyncCatalogsResponse> syncCatalogs(SyncCatalogsRequest request);

    CompletableFuture<SyncDeviceChannelsResponse> syncDeviceChannels(SyncDeviceChannelsRequest request);

    CompletableFuture<UnbindDirectoryResponse> unbindDirectory(UnbindDirectoryRequest request);

    CompletableFuture<UnbindParentPlatformDeviceResponse> unbindParentPlatformDevice(UnbindParentPlatformDeviceRequest request);

    CompletableFuture<UnbindPurchasedDeviceResponse> unbindPurchasedDevice(UnbindPurchasedDeviceRequest request);

    CompletableFuture<UnbindTemplateResponse> unbindTemplate(UnbindTemplateRequest request);

    CompletableFuture<UnlockDeviceResponse> unlockDevice(UnlockDeviceRequest request);

    CompletableFuture<UpdateAIConfigResponse> updateAIConfig(UpdateAIConfigRequest request);

    CompletableFuture<UpdateBucketInfoResponse> updateBucketInfo(UpdateBucketInfoRequest request);

    CompletableFuture<UpdateClusterResponse> updateCluster(UpdateClusterRequest request);

    CompletableFuture<UpdateRenderingDeviceSpecResponse> updateRenderingDeviceSpec(UpdateRenderingDeviceSpecRequest request);

    CompletableFuture<UpdateVsPullStreamInfoConfigResponse> updateVsPullStreamInfoConfig(UpdateVsPullStreamInfoConfigRequest request);

    CompletableFuture<UpgradeRenderingDevicesHostOSResponse> upgradeRenderingDevicesHostOS(UpgradeRenderingDevicesHostOSRequest request);

    CompletableFuture<UpgradeRenderingDevicesImageResponse> upgradeRenderingDevicesImage(UpgradeRenderingDevicesImageRequest request);

    CompletableFuture<UploadDeviceRecordResponse> uploadDeviceRecord(UploadDeviceRecordRequest request);

}
