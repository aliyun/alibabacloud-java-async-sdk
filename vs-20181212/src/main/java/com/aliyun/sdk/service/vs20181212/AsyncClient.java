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

    /**
     * @param request the request parameters of AddVsPullStreamInfoConfig  AddVsPullStreamInfoConfigRequest
     * @return AddVsPullStreamInfoConfigResponse
     */
    CompletableFuture<AddVsPullStreamInfoConfigResponse> addVsPullStreamInfoConfig(AddVsPullStreamInfoConfigRequest request);

    /**
     * @param request the request parameters of BatchBindDirectories  BatchBindDirectoriesRequest
     * @return BatchBindDirectoriesResponse
     */
    CompletableFuture<BatchBindDirectoriesResponse> batchBindDirectories(BatchBindDirectoriesRequest request);

    /**
     * @param request the request parameters of BatchBindParentPlatformDevices  BatchBindParentPlatformDevicesRequest
     * @return BatchBindParentPlatformDevicesResponse
     */
    CompletableFuture<BatchBindParentPlatformDevicesResponse> batchBindParentPlatformDevices(BatchBindParentPlatformDevicesRequest request);

    /**
     * @param request the request parameters of BatchBindPurchasedDevices  BatchBindPurchasedDevicesRequest
     * @return BatchBindPurchasedDevicesResponse
     */
    CompletableFuture<BatchBindPurchasedDevicesResponse> batchBindPurchasedDevices(BatchBindPurchasedDevicesRequest request);

    /**
     * @param request the request parameters of BatchBindTemplate  BatchBindTemplateRequest
     * @return BatchBindTemplateResponse
     */
    CompletableFuture<BatchBindTemplateResponse> batchBindTemplate(BatchBindTemplateRequest request);

    /**
     * @param request the request parameters of BatchBindTemplates  BatchBindTemplatesRequest
     * @return BatchBindTemplatesResponse
     */
    CompletableFuture<BatchBindTemplatesResponse> batchBindTemplates(BatchBindTemplatesRequest request);

    /**
     * @param request the request parameters of BatchDeleteDevices  BatchDeleteDevicesRequest
     * @return BatchDeleteDevicesResponse
     */
    CompletableFuture<BatchDeleteDevicesResponse> batchDeleteDevices(BatchDeleteDevicesRequest request);

    /**
     * @param request the request parameters of BatchDeleteVsDomainConfigs  BatchDeleteVsDomainConfigsRequest
     * @return BatchDeleteVsDomainConfigsResponse
     */
    CompletableFuture<BatchDeleteVsDomainConfigsResponse> batchDeleteVsDomainConfigs(BatchDeleteVsDomainConfigsRequest request);

    /**
     * @param request the request parameters of BatchForbidVsStream  BatchForbidVsStreamRequest
     * @return BatchForbidVsStreamResponse
     */
    CompletableFuture<BatchForbidVsStreamResponse> batchForbidVsStream(BatchForbidVsStreamRequest request);

    /**
     * @param request the request parameters of BatchResumeVsStream  BatchResumeVsStreamRequest
     * @return BatchResumeVsStreamResponse
     */
    CompletableFuture<BatchResumeVsStreamResponse> batchResumeVsStream(BatchResumeVsStreamRequest request);

    /**
     * @param request the request parameters of BatchSetVsDomainConfigs  BatchSetVsDomainConfigsRequest
     * @return BatchSetVsDomainConfigsResponse
     */
    CompletableFuture<BatchSetVsDomainConfigsResponse> batchSetVsDomainConfigs(BatchSetVsDomainConfigsRequest request);

    /**
     * @param request the request parameters of BatchStartDevices  BatchStartDevicesRequest
     * @return BatchStartDevicesResponse
     */
    CompletableFuture<BatchStartDevicesResponse> batchStartDevices(BatchStartDevicesRequest request);

    /**
     * @param request the request parameters of BatchStartStreams  BatchStartStreamsRequest
     * @return BatchStartStreamsResponse
     */
    CompletableFuture<BatchStartStreamsResponse> batchStartStreams(BatchStartStreamsRequest request);

    /**
     * @param request the request parameters of BatchStopDevices  BatchStopDevicesRequest
     * @return BatchStopDevicesResponse
     */
    CompletableFuture<BatchStopDevicesResponse> batchStopDevices(BatchStopDevicesRequest request);

    /**
     * @param request the request parameters of BatchStopStreams  BatchStopStreamsRequest
     * @return BatchStopStreamsResponse
     */
    CompletableFuture<BatchStopStreamsResponse> batchStopStreams(BatchStopStreamsRequest request);

    /**
     * @param request the request parameters of BatchUnbindDirectories  BatchUnbindDirectoriesRequest
     * @return BatchUnbindDirectoriesResponse
     */
    CompletableFuture<BatchUnbindDirectoriesResponse> batchUnbindDirectories(BatchUnbindDirectoriesRequest request);

    /**
     * @param request the request parameters of BatchUnbindParentPlatformDevices  BatchUnbindParentPlatformDevicesRequest
     * @return BatchUnbindParentPlatformDevicesResponse
     */
    CompletableFuture<BatchUnbindParentPlatformDevicesResponse> batchUnbindParentPlatformDevices(BatchUnbindParentPlatformDevicesRequest request);

    /**
     * @param request the request parameters of BatchUnbindPurchasedDevices  BatchUnbindPurchasedDevicesRequest
     * @return BatchUnbindPurchasedDevicesResponse
     */
    CompletableFuture<BatchUnbindPurchasedDevicesResponse> batchUnbindPurchasedDevices(BatchUnbindPurchasedDevicesRequest request);

    /**
     * @param request the request parameters of BatchUnbindTemplate  BatchUnbindTemplateRequest
     * @return BatchUnbindTemplateResponse
     */
    CompletableFuture<BatchUnbindTemplateResponse> batchUnbindTemplate(BatchUnbindTemplateRequest request);

    /**
     * @param request the request parameters of BatchUnbindTemplates  BatchUnbindTemplatesRequest
     * @return BatchUnbindTemplatesResponse
     */
    CompletableFuture<BatchUnbindTemplatesResponse> batchUnbindTemplates(BatchUnbindTemplatesRequest request);

    /**
     * @param request the request parameters of BindDirectory  BindDirectoryRequest
     * @return BindDirectoryResponse
     */
    CompletableFuture<BindDirectoryResponse> bindDirectory(BindDirectoryRequest request);

    /**
     * @param request the request parameters of BindParentPlatformDevice  BindParentPlatformDeviceRequest
     * @return BindParentPlatformDeviceResponse
     */
    CompletableFuture<BindParentPlatformDeviceResponse> bindParentPlatformDevice(BindParentPlatformDeviceRequest request);

    /**
     * @param request the request parameters of BindPurchasedDevice  BindPurchasedDeviceRequest
     * @return BindPurchasedDeviceResponse
     */
    CompletableFuture<BindPurchasedDeviceResponse> bindPurchasedDevice(BindPurchasedDeviceRequest request);

    /**
     * @param request the request parameters of BindTemplate  BindTemplateRequest
     * @return BindTemplateResponse
     */
    CompletableFuture<BindTemplateResponse> bindTemplate(BindTemplateRequest request);

    /**
     * @param request the request parameters of ContinuousAdjust  ContinuousAdjustRequest
     * @return ContinuousAdjustResponse
     */
    CompletableFuture<ContinuousAdjustResponse> continuousAdjust(ContinuousAdjustRequest request);

    /**
     * @param request the request parameters of ContinuousMove  ContinuousMoveRequest
     * @return ContinuousMoveResponse
     */
    CompletableFuture<ContinuousMoveResponse> continuousMove(ContinuousMoveRequest request);

    /**
     * @param request the request parameters of CreateDevice  CreateDeviceRequest
     * @return CreateDeviceResponse
     */
    CompletableFuture<CreateDeviceResponse> createDevice(CreateDeviceRequest request);

    /**
     * @param request the request parameters of CreateDeviceAlarm  CreateDeviceAlarmRequest
     * @return CreateDeviceAlarmResponse
     */
    CompletableFuture<CreateDeviceAlarmResponse> createDeviceAlarm(CreateDeviceAlarmRequest request);

    /**
     * @param request the request parameters of CreateDirectory  CreateDirectoryRequest
     * @return CreateDirectoryResponse
     */
    CompletableFuture<CreateDirectoryResponse> createDirectory(CreateDirectoryRequest request);

    /**
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * @param request the request parameters of CreateParentPlatform  CreateParentPlatformRequest
     * @return CreateParentPlatformResponse
     */
    CompletableFuture<CreateParentPlatformResponse> createParentPlatform(CreateParentPlatformRequest request);

    /**
     * @param request the request parameters of CreateRenderingDataPackage  CreateRenderingDataPackageRequest
     * @return CreateRenderingDataPackageResponse
     */
    CompletableFuture<CreateRenderingDataPackageResponse> createRenderingDataPackage(CreateRenderingDataPackageRequest request);

    /**
     * @param request the request parameters of CreateRenderingInstance  CreateRenderingInstanceRequest
     * @return CreateRenderingInstanceResponse
     */
    CompletableFuture<CreateRenderingInstanceResponse> createRenderingInstance(CreateRenderingInstanceRequest request);

    /**
     * @param request the request parameters of CreateRenderingInstanceGateway  CreateRenderingInstanceGatewayRequest
     * @return CreateRenderingInstanceGatewayResponse
     */
    CompletableFuture<CreateRenderingInstanceGatewayResponse> createRenderingInstanceGateway(CreateRenderingInstanceGatewayRequest request);

    /**
     * @param request the request parameters of CreateStreamSnapshot  CreateStreamSnapshotRequest
     * @return CreateStreamSnapshotResponse
     */
    CompletableFuture<CreateStreamSnapshotResponse> createStreamSnapshot(CreateStreamSnapshotRequest request);

    /**
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * @param request the request parameters of DeleteCloudApp  DeleteCloudAppRequest
     * @return DeleteCloudAppResponse
     */
    CompletableFuture<DeleteCloudAppResponse> deleteCloudApp(DeleteCloudAppRequest request);

    /**
     * @param request the request parameters of DeleteDevice  DeleteDeviceRequest
     * @return DeleteDeviceResponse
     */
    CompletableFuture<DeleteDeviceResponse> deleteDevice(DeleteDeviceRequest request);

    /**
     * @param request the request parameters of DeleteDirectory  DeleteDirectoryRequest
     * @return DeleteDirectoryResponse
     */
    CompletableFuture<DeleteDirectoryResponse> deleteDirectory(DeleteDirectoryRequest request);

    /**
     * @param request the request parameters of DeleteFile  DeleteFileRequest
     * @return DeleteFileResponse
     */
    CompletableFuture<DeleteFileResponse> deleteFile(DeleteFileRequest request);

    /**
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * @param request the request parameters of DeleteParentPlatform  DeleteParentPlatformRequest
     * @return DeleteParentPlatformResponse
     */
    CompletableFuture<DeleteParentPlatformResponse> deleteParentPlatform(DeleteParentPlatformRequest request);

    /**
     * @param request the request parameters of DeletePreset  DeletePresetRequest
     * @return DeletePresetResponse
     */
    CompletableFuture<DeletePresetResponse> deletePreset(DeletePresetRequest request);

    /**
     * @param request the request parameters of DeletePublicKey  DeletePublicKeyRequest
     * @return DeletePublicKeyResponse
     */
    CompletableFuture<DeletePublicKeyResponse> deletePublicKey(DeletePublicKeyRequest request);

    /**
     * @param request the request parameters of DeleteRenderingInstanceConfiguration  DeleteRenderingInstanceConfigurationRequest
     * @return DeleteRenderingInstanceConfigurationResponse
     */
    CompletableFuture<DeleteRenderingInstanceConfigurationResponse> deleteRenderingInstanceConfiguration(DeleteRenderingInstanceConfigurationRequest request);

    /**
     * @param request the request parameters of DeleteRenderingInstanceGateway  DeleteRenderingInstanceGatewayRequest
     * @return DeleteRenderingInstanceGatewayResponse
     */
    CompletableFuture<DeleteRenderingInstanceGatewayResponse> deleteRenderingInstanceGateway(DeleteRenderingInstanceGatewayRequest request);

    /**
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * @param request the request parameters of DeleteVsPullStreamInfoConfig  DeleteVsPullStreamInfoConfigRequest
     * @return DeleteVsPullStreamInfoConfigResponse
     */
    CompletableFuture<DeleteVsPullStreamInfoConfigResponse> deleteVsPullStreamInfoConfig(DeleteVsPullStreamInfoConfigRequest request);

    /**
     * @param request the request parameters of DeleteVsStreamsNotifyUrlConfig  DeleteVsStreamsNotifyUrlConfigRequest
     * @return DeleteVsStreamsNotifyUrlConfigResponse
     */
    CompletableFuture<DeleteVsStreamsNotifyUrlConfigResponse> deleteVsStreamsNotifyUrlConfig(DeleteVsStreamsNotifyUrlConfigRequest request);

    /**
     * @param request the request parameters of DescribeAccountStat  DescribeAccountStatRequest
     * @return DescribeAccountStatResponse
     */
    CompletableFuture<DescribeAccountStatResponse> describeAccountStat(DescribeAccountStatRequest request);

    /**
     * @param request the request parameters of DescribeDevice  DescribeDeviceRequest
     * @return DescribeDeviceResponse
     */
    CompletableFuture<DescribeDeviceResponse> describeDevice(DescribeDeviceRequest request);

    /**
     * @param request the request parameters of DescribeDeviceChannels  DescribeDeviceChannelsRequest
     * @return DescribeDeviceChannelsResponse
     */
    CompletableFuture<DescribeDeviceChannelsResponse> describeDeviceChannels(DescribeDeviceChannelsRequest request);

    /**
     * @param request the request parameters of DescribeDeviceGateway  DescribeDeviceGatewayRequest
     * @return DescribeDeviceGatewayResponse
     */
    CompletableFuture<DescribeDeviceGatewayResponse> describeDeviceGateway(DescribeDeviceGatewayRequest request);

    /**
     * @param request the request parameters of DescribeDeviceURL  DescribeDeviceURLRequest
     * @return DescribeDeviceURLResponse
     */
    CompletableFuture<DescribeDeviceURLResponse> describeDeviceURL(DescribeDeviceURLRequest request);

    /**
     * @param request the request parameters of DescribeDevices  DescribeDevicesRequest
     * @return DescribeDevicesResponse
     */
    CompletableFuture<DescribeDevicesResponse> describeDevices(DescribeDevicesRequest request);

    /**
     * @param request the request parameters of DescribeDirectories  DescribeDirectoriesRequest
     * @return DescribeDirectoriesResponse
     */
    CompletableFuture<DescribeDirectoriesResponse> describeDirectories(DescribeDirectoriesRequest request);

    /**
     * @param request the request parameters of DescribeDirectory  DescribeDirectoryRequest
     * @return DescribeDirectoryResponse
     */
    CompletableFuture<DescribeDirectoryResponse> describeDirectory(DescribeDirectoryRequest request);

    /**
     * @param request the request parameters of DescribeGroup  DescribeGroupRequest
     * @return DescribeGroupResponse
     */
    CompletableFuture<DescribeGroupResponse> describeGroup(DescribeGroupRequest request);

    /**
     * @param request the request parameters of DescribeGroups  DescribeGroupsRequest
     * @return DescribeGroupsResponse
     */
    CompletableFuture<DescribeGroupsResponse> describeGroups(DescribeGroupsRequest request);

    /**
     * @param request the request parameters of DescribeParentPlatform  DescribeParentPlatformRequest
     * @return DescribeParentPlatformResponse
     */
    CompletableFuture<DescribeParentPlatformResponse> describeParentPlatform(DescribeParentPlatformRequest request);

    /**
     * @param request the request parameters of DescribeParentPlatformDevices  DescribeParentPlatformDevicesRequest
     * @return DescribeParentPlatformDevicesResponse
     */
    CompletableFuture<DescribeParentPlatformDevicesResponse> describeParentPlatformDevices(DescribeParentPlatformDevicesRequest request);

    /**
     * @param request the request parameters of DescribeParentPlatforms  DescribeParentPlatformsRequest
     * @return DescribeParentPlatformsResponse
     */
    CompletableFuture<DescribeParentPlatformsResponse> describeParentPlatforms(DescribeParentPlatformsRequest request);

    /**
     * @param request the request parameters of DescribePresets  DescribePresetsRequest
     * @return DescribePresetsResponse
     */
    CompletableFuture<DescribePresetsResponse> describePresets(DescribePresetsRequest request);

    /**
     * @param request the request parameters of DescribePublishStreamStatus  DescribePublishStreamStatusRequest
     * @return DescribePublishStreamStatusResponse
     */
    CompletableFuture<DescribePublishStreamStatusResponse> describePublishStreamStatus(DescribePublishStreamStatusRequest request);

    /**
     * @param request the request parameters of DescribePurchasedDevice  DescribePurchasedDeviceRequest
     * @return DescribePurchasedDeviceResponse
     */
    CompletableFuture<DescribePurchasedDeviceResponse> describePurchasedDevice(DescribePurchasedDeviceRequest request);

    /**
     * @param request the request parameters of DescribePurchasedDevices  DescribePurchasedDevicesRequest
     * @return DescribePurchasedDevicesResponse
     */
    CompletableFuture<DescribePurchasedDevicesResponse> describePurchasedDevices(DescribePurchasedDevicesRequest request);

    /**
     * @param request the request parameters of DescribeRecords  DescribeRecordsRequest
     * @return DescribeRecordsResponse
     */
    CompletableFuture<DescribeRecordsResponse> describeRecords(DescribeRecordsRequest request);

    /**
     * @param request the request parameters of DescribeRenderingInstance  DescribeRenderingInstanceRequest
     * @return DescribeRenderingInstanceResponse
     */
    CompletableFuture<DescribeRenderingInstanceResponse> describeRenderingInstance(DescribeRenderingInstanceRequest request);

    /**
     * @param request the request parameters of DescribeRenderingInstanceConfiguration  DescribeRenderingInstanceConfigurationRequest
     * @return DescribeRenderingInstanceConfigurationResponse
     */
    CompletableFuture<DescribeRenderingInstanceConfigurationResponse> describeRenderingInstanceConfiguration(DescribeRenderingInstanceConfigurationRequest request);

    /**
     * @param request the request parameters of DescribeStream  DescribeStreamRequest
     * @return DescribeStreamResponse
     */
    CompletableFuture<DescribeStreamResponse> describeStream(DescribeStreamRequest request);

    /**
     * @param request the request parameters of DescribeStreamURL  DescribeStreamURLRequest
     * @return DescribeStreamURLResponse
     */
    CompletableFuture<DescribeStreamURLResponse> describeStreamURL(DescribeStreamURLRequest request);

    /**
     * @param request the request parameters of DescribeStreamVodList  DescribeStreamVodListRequest
     * @return DescribeStreamVodListResponse
     */
    CompletableFuture<DescribeStreamVodListResponse> describeStreamVodList(DescribeStreamVodListRequest request);

    /**
     * @param request the request parameters of DescribeStreams  DescribeStreamsRequest
     * @return DescribeStreamsResponse
     */
    CompletableFuture<DescribeStreamsResponse> describeStreams(DescribeStreamsRequest request);

    /**
     * @param request the request parameters of DescribeTemplate  DescribeTemplateRequest
     * @return DescribeTemplateResponse
     */
    CompletableFuture<DescribeTemplateResponse> describeTemplate(DescribeTemplateRequest request);

    /**
     * @param request the request parameters of DescribeTemplates  DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     */
    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeVodStreamURL  DescribeVodStreamURLRequest
     * @return DescribeVodStreamURLResponse
     */
    CompletableFuture<DescribeVodStreamURLResponse> describeVodStreamURL(DescribeVodStreamURLRequest request);

    /**
     * @param request the request parameters of DescribeVsCertificateDetail  DescribeVsCertificateDetailRequest
     * @return DescribeVsCertificateDetailResponse
     */
    CompletableFuture<DescribeVsCertificateDetailResponse> describeVsCertificateDetail(DescribeVsCertificateDetailRequest request);

    /**
     * @param request the request parameters of DescribeVsCertificateList  DescribeVsCertificateListRequest
     * @return DescribeVsCertificateListResponse
     */
    CompletableFuture<DescribeVsCertificateListResponse> describeVsCertificateList(DescribeVsCertificateListRequest request);

    /**
     * @param request the request parameters of DescribeVsDevicesData  DescribeVsDevicesDataRequest
     * @return DescribeVsDevicesDataResponse
     */
    CompletableFuture<DescribeVsDevicesDataResponse> describeVsDevicesData(DescribeVsDevicesDataRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainBpsData  DescribeVsDomainBpsDataRequest
     * @return DescribeVsDomainBpsDataResponse
     */
    CompletableFuture<DescribeVsDomainBpsDataResponse> describeVsDomainBpsData(DescribeVsDomainBpsDataRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainCertificateInfo  DescribeVsDomainCertificateInfoRequest
     * @return DescribeVsDomainCertificateInfoResponse
     */
    CompletableFuture<DescribeVsDomainCertificateInfoResponse> describeVsDomainCertificateInfo(DescribeVsDomainCertificateInfoRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainConfigs  DescribeVsDomainConfigsRequest
     * @return DescribeVsDomainConfigsResponse
     */
    CompletableFuture<DescribeVsDomainConfigsResponse> describeVsDomainConfigs(DescribeVsDomainConfigsRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainDetail  DescribeVsDomainDetailRequest
     * @return DescribeVsDomainDetailResponse
     */
    CompletableFuture<DescribeVsDomainDetailResponse> describeVsDomainDetail(DescribeVsDomainDetailRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainPvData  DescribeVsDomainPvDataRequest
     * @return DescribeVsDomainPvDataResponse
     */
    CompletableFuture<DescribeVsDomainPvDataResponse> describeVsDomainPvData(DescribeVsDomainPvDataRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainPvUvData  DescribeVsDomainPvUvDataRequest
     * @return DescribeVsDomainPvUvDataResponse
     */
    CompletableFuture<DescribeVsDomainPvUvDataResponse> describeVsDomainPvUvData(DescribeVsDomainPvUvDataRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainRecordData  DescribeVsDomainRecordDataRequest
     * @return DescribeVsDomainRecordDataResponse
     */
    CompletableFuture<DescribeVsDomainRecordDataResponse> describeVsDomainRecordData(DescribeVsDomainRecordDataRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainRegionData  DescribeVsDomainRegionDataRequest
     * @return DescribeVsDomainRegionDataResponse
     */
    CompletableFuture<DescribeVsDomainRegionDataResponse> describeVsDomainRegionData(DescribeVsDomainRegionDataRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainReqBpsData  DescribeVsDomainReqBpsDataRequest
     * @return DescribeVsDomainReqBpsDataResponse
     */
    CompletableFuture<DescribeVsDomainReqBpsDataResponse> describeVsDomainReqBpsData(DescribeVsDomainReqBpsDataRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainReqTrafficData  DescribeVsDomainReqTrafficDataRequest
     * @return DescribeVsDomainReqTrafficDataResponse
     */
    CompletableFuture<DescribeVsDomainReqTrafficDataResponse> describeVsDomainReqTrafficData(DescribeVsDomainReqTrafficDataRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainSnapshotData  DescribeVsDomainSnapshotDataRequest
     * @return DescribeVsDomainSnapshotDataResponse
     */
    CompletableFuture<DescribeVsDomainSnapshotDataResponse> describeVsDomainSnapshotData(DescribeVsDomainSnapshotDataRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainTrafficData  DescribeVsDomainTrafficDataRequest
     * @return DescribeVsDomainTrafficDataResponse
     */
    CompletableFuture<DescribeVsDomainTrafficDataResponse> describeVsDomainTrafficData(DescribeVsDomainTrafficDataRequest request);

    /**
     * @param request the request parameters of DescribeVsDomainUvData  DescribeVsDomainUvDataRequest
     * @return DescribeVsDomainUvDataResponse
     */
    CompletableFuture<DescribeVsDomainUvDataResponse> describeVsDomainUvData(DescribeVsDomainUvDataRequest request);

    /**
     * @param request the request parameters of DescribeVsPullStreamInfoConfig  DescribeVsPullStreamInfoConfigRequest
     * @return DescribeVsPullStreamInfoConfigResponse
     */
    CompletableFuture<DescribeVsPullStreamInfoConfigResponse> describeVsPullStreamInfoConfig(DescribeVsPullStreamInfoConfigRequest request);

    /**
     * @param request the request parameters of DescribeVsStreamsNotifyUrlConfig  DescribeVsStreamsNotifyUrlConfigRequest
     * @return DescribeVsStreamsNotifyUrlConfigResponse
     */
    CompletableFuture<DescribeVsStreamsNotifyUrlConfigResponse> describeVsStreamsNotifyUrlConfig(DescribeVsStreamsNotifyUrlConfigRequest request);

    /**
     * @param request the request parameters of DescribeVsStreamsOnlineList  DescribeVsStreamsOnlineListRequest
     * @return DescribeVsStreamsOnlineListResponse
     */
    CompletableFuture<DescribeVsStreamsOnlineListResponse> describeVsStreamsOnlineList(DescribeVsStreamsOnlineListRequest request);

    /**
     * @param request the request parameters of DescribeVsStreamsPublishList  DescribeVsStreamsPublishListRequest
     * @return DescribeVsStreamsPublishListResponse
     */
    CompletableFuture<DescribeVsStreamsPublishListResponse> describeVsStreamsPublishList(DescribeVsStreamsPublishListRequest request);

    /**
     * @param request the request parameters of DescribeVsTopDomainsByFlow  DescribeVsTopDomainsByFlowRequest
     * @return DescribeVsTopDomainsByFlowResponse
     */
    CompletableFuture<DescribeVsTopDomainsByFlowResponse> describeVsTopDomainsByFlow(DescribeVsTopDomainsByFlowRequest request);

    /**
     * @param request the request parameters of DescribeVsUpPeakPublishStreamData  DescribeVsUpPeakPublishStreamDataRequest
     * @return DescribeVsUpPeakPublishStreamDataResponse
     */
    CompletableFuture<DescribeVsUpPeakPublishStreamDataResponse> describeVsUpPeakPublishStreamData(DescribeVsUpPeakPublishStreamDataRequest request);

    /**
     * @param request the request parameters of DescribeVsUserResourcePackage  DescribeVsUserResourcePackageRequest
     * @return DescribeVsUserResourcePackageResponse
     */
    CompletableFuture<DescribeVsUserResourcePackageResponse> describeVsUserResourcePackage(DescribeVsUserResourcePackageRequest request);

    /**
     * @param request the request parameters of DescribeVsVerifyContent  DescribeVsVerifyContentRequest
     * @return DescribeVsVerifyContentResponse
     */
    CompletableFuture<DescribeVsVerifyContentResponse> describeVsVerifyContent(DescribeVsVerifyContentRequest request);

    /**
     * @param request the request parameters of ForbidVsStream  ForbidVsStreamRequest
     * @return ForbidVsStreamResponse
     */
    CompletableFuture<ForbidVsStreamResponse> forbidVsStream(ForbidVsStreamRequest request);

    /**
     * @param request the request parameters of GetRenderingInstanceStreamingInfo  GetRenderingInstanceStreamingInfoRequest
     * @return GetRenderingInstanceStreamingInfoResponse
     */
    CompletableFuture<GetRenderingInstanceStreamingInfoResponse> getRenderingInstanceStreamingInfo(GetRenderingInstanceStreamingInfoRequest request);

    /**
     * @param request the request parameters of GotoPreset  GotoPresetRequest
     * @return GotoPresetResponse
     */
    CompletableFuture<GotoPresetResponse> gotoPreset(GotoPresetRequest request);

    /**
     * @param request the request parameters of InstallCloudApp  InstallCloudAppRequest
     * @return InstallCloudAppResponse
     */
    CompletableFuture<InstallCloudAppResponse> installCloudApp(InstallCloudAppRequest request);

    /**
     * @param request the request parameters of ListCloudAppInstallations  ListCloudAppInstallationsRequest
     * @return ListCloudAppInstallationsResponse
     */
    CompletableFuture<ListCloudAppInstallationsResponse> listCloudAppInstallations(ListCloudAppInstallationsRequest request);

    /**
     * @param request the request parameters of ListCloudApps  ListCloudAppsRequest
     * @return ListCloudAppsResponse
     */
    CompletableFuture<ListCloudAppsResponse> listCloudApps(ListCloudAppsRequest request);

    /**
     * @param request the request parameters of ListFilePushStatuses  ListFilePushStatusesRequest
     * @return ListFilePushStatusesResponse
     */
    CompletableFuture<ListFilePushStatusesResponse> listFilePushStatuses(ListFilePushStatusesRequest request);

    /**
     * @param request the request parameters of ListFiles  ListFilesRequest
     * @return ListFilesResponse
     */
    CompletableFuture<ListFilesResponse> listFiles(ListFilesRequest request);

    /**
     * @param request the request parameters of ListPublicKeys  ListPublicKeysRequest
     * @return ListPublicKeysResponse
     */
    CompletableFuture<ListPublicKeysResponse> listPublicKeys(ListPublicKeysRequest request);

    /**
     * @param request the request parameters of ListRenderingInstanceGateway  ListRenderingInstanceGatewayRequest
     * @return ListRenderingInstanceGatewayResponse
     */
    CompletableFuture<ListRenderingInstanceGatewayResponse> listRenderingInstanceGateway(ListRenderingInstanceGatewayRequest request);

    /**
     * @param request the request parameters of ListRenderingInstances  ListRenderingInstancesRequest
     * @return ListRenderingInstancesResponse
     */
    CompletableFuture<ListRenderingInstancesResponse> listRenderingInstances(ListRenderingInstancesRequest request);

    /**
     * @param request the request parameters of ManageLogin  ManageLoginRequest
     * @return ManageLoginResponse
     */
    CompletableFuture<ManageLoginResponse> manageLogin(ManageLoginRequest request);

    /**
     * @param request the request parameters of ModifyDevice  ModifyDeviceRequest
     * @return ModifyDeviceResponse
     */
    CompletableFuture<ModifyDeviceResponse> modifyDevice(ModifyDeviceRequest request);

    /**
     * @param request the request parameters of ModifyDeviceAlarm  ModifyDeviceAlarmRequest
     * @return ModifyDeviceAlarmResponse
     */
    CompletableFuture<ModifyDeviceAlarmResponse> modifyDeviceAlarm(ModifyDeviceAlarmRequest request);

    /**
     * @param request the request parameters of ModifyDeviceCapture  ModifyDeviceCaptureRequest
     * @return ModifyDeviceCaptureResponse
     */
    CompletableFuture<ModifyDeviceCaptureResponse> modifyDeviceCapture(ModifyDeviceCaptureRequest request);

    /**
     * @param request the request parameters of ModifyDeviceChannels  ModifyDeviceChannelsRequest
     * @return ModifyDeviceChannelsResponse
     */
    CompletableFuture<ModifyDeviceChannelsResponse> modifyDeviceChannels(ModifyDeviceChannelsRequest request);

    /**
     * @param request the request parameters of ModifyDirectory  ModifyDirectoryRequest
     * @return ModifyDirectoryResponse
     */
    CompletableFuture<ModifyDirectoryResponse> modifyDirectory(ModifyDirectoryRequest request);

    /**
     * @param request the request parameters of ModifyGroup  ModifyGroupRequest
     * @return ModifyGroupResponse
     */
    CompletableFuture<ModifyGroupResponse> modifyGroup(ModifyGroupRequest request);

    /**
     * @param request the request parameters of ModifyParentPlatform  ModifyParentPlatformRequest
     * @return ModifyParentPlatformResponse
     */
    CompletableFuture<ModifyParentPlatformResponse> modifyParentPlatform(ModifyParentPlatformRequest request);

    /**
     * @param request the request parameters of ModifyRenderingInstance  ModifyRenderingInstanceRequest
     * @return ModifyRenderingInstanceResponse
     */
    CompletableFuture<ModifyRenderingInstanceResponse> modifyRenderingInstance(ModifyRenderingInstanceRequest request);

    /**
     * @param request the request parameters of ModifyRenderingInstanceBandwidth  ModifyRenderingInstanceBandwidthRequest
     * @return ModifyRenderingInstanceBandwidthResponse
     */
    CompletableFuture<ModifyRenderingInstanceBandwidthResponse> modifyRenderingInstanceBandwidth(ModifyRenderingInstanceBandwidthRequest request);

    /**
     * @param request the request parameters of ModifyTemplate  ModifyTemplateRequest
     * @return ModifyTemplateResponse
     */
    CompletableFuture<ModifyTemplateResponse> modifyTemplate(ModifyTemplateRequest request);

    /**
     * @param request the request parameters of OpenVsService  OpenVsServiceRequest
     * @return OpenVsServiceResponse
     */
    CompletableFuture<OpenVsServiceResponse> openVsService(OpenVsServiceRequest request);

    /**
     * @param request the request parameters of PushFile  PushFileRequest
     * @return PushFileResponse
     */
    CompletableFuture<PushFileResponse> pushFile(PushFileRequest request);

    /**
     * @param request the request parameters of RebootRenderingInstance  RebootRenderingInstanceRequest
     * @return RebootRenderingInstanceResponse
     */
    CompletableFuture<RebootRenderingInstanceResponse> rebootRenderingInstance(RebootRenderingInstanceRequest request);

    /**
     * @param request the request parameters of ReleaseRenderingDataPackage  ReleaseRenderingDataPackageRequest
     * @return ReleaseRenderingDataPackageResponse
     */
    CompletableFuture<ReleaseRenderingDataPackageResponse> releaseRenderingDataPackage(ReleaseRenderingDataPackageRequest request);

    /**
     * @param request the request parameters of ReleaseRenderingInstance  ReleaseRenderingInstanceRequest
     * @return ReleaseRenderingInstanceResponse
     */
    CompletableFuture<ReleaseRenderingInstanceResponse> releaseRenderingInstance(ReleaseRenderingInstanceRequest request);

    /**
     * @param request the request parameters of RenewRenderingInstance  RenewRenderingInstanceRequest
     * @return RenewRenderingInstanceResponse
     */
    CompletableFuture<RenewRenderingInstanceResponse> renewRenderingInstance(RenewRenderingInstanceRequest request);

    /**
     * @param request the request parameters of ResumeVsStream  ResumeVsStreamRequest
     * @return ResumeVsStreamResponse
     */
    CompletableFuture<ResumeVsStreamResponse> resumeVsStream(ResumeVsStreamRequest request);

    /**
     * @param request the request parameters of SendRenderingInstanceCommands  SendRenderingInstanceCommandsRequest
     * @return SendRenderingInstanceCommandsResponse
     */
    CompletableFuture<SendRenderingInstanceCommandsResponse> sendRenderingInstanceCommands(SendRenderingInstanceCommandsRequest request);

    /**
     * @param request the request parameters of SetPreset  SetPresetRequest
     * @return SetPresetResponse
     */
    CompletableFuture<SetPresetResponse> setPreset(SetPresetRequest request);

    /**
     * @param request the request parameters of SetVsDomainCertificate  SetVsDomainCertificateRequest
     * @return SetVsDomainCertificateResponse
     */
    CompletableFuture<SetVsDomainCertificateResponse> setVsDomainCertificate(SetVsDomainCertificateRequest request);

    /**
     * @param request the request parameters of SetVsStreamsNotifyUrlConfig  SetVsStreamsNotifyUrlConfigRequest
     * @return SetVsStreamsNotifyUrlConfigResponse
     */
    CompletableFuture<SetVsStreamsNotifyUrlConfigResponse> setVsStreamsNotifyUrlConfig(SetVsStreamsNotifyUrlConfigRequest request);

    /**
     * @param request the request parameters of StartDevice  StartDeviceRequest
     * @return StartDeviceResponse
     */
    CompletableFuture<StartDeviceResponse> startDevice(StartDeviceRequest request);

    /**
     * @param request the request parameters of StartParentPlatform  StartParentPlatformRequest
     * @return StartParentPlatformResponse
     */
    CompletableFuture<StartParentPlatformResponse> startParentPlatform(StartParentPlatformRequest request);

    /**
     * @param request the request parameters of StartPublishStream  StartPublishStreamRequest
     * @return StartPublishStreamResponse
     */
    CompletableFuture<StartPublishStreamResponse> startPublishStream(StartPublishStreamRequest request);

    /**
     * @param request the request parameters of StartRecordStream  StartRecordStreamRequest
     * @return StartRecordStreamResponse
     */
    CompletableFuture<StartRecordStreamResponse> startRecordStream(StartRecordStreamRequest request);

    /**
     * @param request the request parameters of StartStream  StartStreamRequest
     * @return StartStreamResponse
     */
    CompletableFuture<StartStreamResponse> startStream(StartStreamRequest request);

    /**
     * @param request the request parameters of StartTransferStream  StartTransferStreamRequest
     * @return StartTransferStreamResponse
     */
    CompletableFuture<StartTransferStreamResponse> startTransferStream(StartTransferStreamRequest request);

    /**
     * @param request the request parameters of StopAdjust  StopAdjustRequest
     * @return StopAdjustResponse
     */
    CompletableFuture<StopAdjustResponse> stopAdjust(StopAdjustRequest request);

    /**
     * @param request the request parameters of StopDevice  StopDeviceRequest
     * @return StopDeviceResponse
     */
    CompletableFuture<StopDeviceResponse> stopDevice(StopDeviceRequest request);

    /**
     * @param request the request parameters of StopMove  StopMoveRequest
     * @return StopMoveResponse
     */
    CompletableFuture<StopMoveResponse> stopMove(StopMoveRequest request);

    /**
     * @param request the request parameters of StopPublishStream  StopPublishStreamRequest
     * @return StopPublishStreamResponse
     */
    CompletableFuture<StopPublishStreamResponse> stopPublishStream(StopPublishStreamRequest request);

    /**
     * @param request the request parameters of StopRecordStream  StopRecordStreamRequest
     * @return StopRecordStreamResponse
     */
    CompletableFuture<StopRecordStreamResponse> stopRecordStream(StopRecordStreamRequest request);

    /**
     * @param request the request parameters of StopStream  StopStreamRequest
     * @return StopStreamResponse
     */
    CompletableFuture<StopStreamResponse> stopStream(StopStreamRequest request);

    /**
     * @param request the request parameters of StopTransferStream  StopTransferStreamRequest
     * @return StopTransferStreamResponse
     */
    CompletableFuture<StopTransferStreamResponse> stopTransferStream(StopTransferStreamRequest request);

    /**
     * @param request the request parameters of SyncCatalogs  SyncCatalogsRequest
     * @return SyncCatalogsResponse
     */
    CompletableFuture<SyncCatalogsResponse> syncCatalogs(SyncCatalogsRequest request);

    /**
     * @param request the request parameters of UnbindDirectory  UnbindDirectoryRequest
     * @return UnbindDirectoryResponse
     */
    CompletableFuture<UnbindDirectoryResponse> unbindDirectory(UnbindDirectoryRequest request);

    /**
     * @param request the request parameters of UnbindParentPlatformDevice  UnbindParentPlatformDeviceRequest
     * @return UnbindParentPlatformDeviceResponse
     */
    CompletableFuture<UnbindParentPlatformDeviceResponse> unbindParentPlatformDevice(UnbindParentPlatformDeviceRequest request);

    /**
     * @param request the request parameters of UnbindPurchasedDevice  UnbindPurchasedDeviceRequest
     * @return UnbindPurchasedDeviceResponse
     */
    CompletableFuture<UnbindPurchasedDeviceResponse> unbindPurchasedDevice(UnbindPurchasedDeviceRequest request);

    /**
     * @param request the request parameters of UnbindTemplate  UnbindTemplateRequest
     * @return UnbindTemplateResponse
     */
    CompletableFuture<UnbindTemplateResponse> unbindTemplate(UnbindTemplateRequest request);

    /**
     * @param request the request parameters of UninstallCloudApp  UninstallCloudAppRequest
     * @return UninstallCloudAppResponse
     */
    CompletableFuture<UninstallCloudAppResponse> uninstallCloudApp(UninstallCloudAppRequest request);

    /**
     * @param request the request parameters of UnlockDevice  UnlockDeviceRequest
     * @return UnlockDeviceResponse
     */
    CompletableFuture<UnlockDeviceResponse> unlockDevice(UnlockDeviceRequest request);

    /**
     * @param request the request parameters of UpdateCloudAppInfo  UpdateCloudAppInfoRequest
     * @return UpdateCloudAppInfoResponse
     */
    CompletableFuture<UpdateCloudAppInfoResponse> updateCloudAppInfo(UpdateCloudAppInfoRequest request);

    /**
     * @param request the request parameters of UpdateFileInfo  UpdateFileInfoRequest
     * @return UpdateFileInfoResponse
     */
    CompletableFuture<UpdateFileInfoResponse> updateFileInfo(UpdateFileInfoRequest request);

    /**
     * @param request the request parameters of UpdateRenderingInstanceConfiguration  UpdateRenderingInstanceConfigurationRequest
     * @return UpdateRenderingInstanceConfigurationResponse
     */
    CompletableFuture<UpdateRenderingInstanceConfigurationResponse> updateRenderingInstanceConfiguration(UpdateRenderingInstanceConfigurationRequest request);

    /**
     * @param request the request parameters of UpdateVsPullStreamInfoConfig  UpdateVsPullStreamInfoConfigRequest
     * @return UpdateVsPullStreamInfoConfigResponse
     */
    CompletableFuture<UpdateVsPullStreamInfoConfigResponse> updateVsPullStreamInfoConfig(UpdateVsPullStreamInfoConfigRequest request);

    /**
     * @param request the request parameters of UploadCloudApp  UploadCloudAppRequest
     * @return UploadCloudAppResponse
     */
    CompletableFuture<UploadCloudAppResponse> uploadCloudApp(UploadCloudAppRequest request);

    /**
     * @param request the request parameters of UploadFile  UploadFileRequest
     * @return UploadFileResponse
     */
    CompletableFuture<UploadFileResponse> uploadFile(UploadFileRequest request);

    /**
     * @param request the request parameters of UploadPublicKey  UploadPublicKeyRequest
     * @return UploadPublicKeyResponse
     */
    CompletableFuture<UploadPublicKeyResponse> uploadPublicKey(UploadPublicKeyRequest request);

    /**
     * @param request the request parameters of VerifyVsDomainOwner  VerifyVsDomainOwnerRequest
     * @return VerifyVsDomainOwnerResponse
     */
    CompletableFuture<VerifyVsDomainOwnerResponse> verifyVsDomainOwner(VerifyVsDomainOwnerRequest request);

}
