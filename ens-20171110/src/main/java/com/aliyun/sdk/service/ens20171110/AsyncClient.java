// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ens20171110.models.*;
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

    CompletableFuture<AddBackendServersResponse> addBackendServers(AddBackendServersRequest request);

    CompletableFuture<AddDeviceInternetPortResponse> addDeviceInternetPort(AddDeviceInternetPortRequest request);

    CompletableFuture<AddNetworkInterfaceToInstanceResponse> addNetworkInterfaceToInstance(AddNetworkInterfaceToInstanceRequest request);

    CompletableFuture<AllocateEipAddressResponse> allocateEipAddress(AllocateEipAddressRequest request);

    CompletableFuture<AssociateEipAddressResponse> associateEipAddress(AssociateEipAddressRequest request);

    CompletableFuture<AssociateEnsEipAddressResponse> associateEnsEipAddress(AssociateEnsEipAddressRequest request);

    CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request);

    CompletableFuture<AttachEnsInstancesResponse> attachEnsInstances(AttachEnsInstancesRequest request);

    CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request);

    CompletableFuture<AuthorizeSecurityGroupEgressResponse> authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request);

    CompletableFuture<CheckQuotaResponse> checkQuota(CheckQuotaRequest request);

    CompletableFuture<ConfigureSecurityGroupPermissionsResponse> configureSecurityGroupPermissions(ConfigureSecurityGroupPermissionsRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request);

    CompletableFuture<CreateDiskBuyOrderResponse> createDiskBuyOrder(CreateDiskBuyOrderRequest request);

    CompletableFuture<CreateEPInstanceResponse> createEPInstance(CreateEPInstanceRequest request);

    CompletableFuture<CreateEipInstanceResponse> createEipInstance(CreateEipInstanceRequest request);

    CompletableFuture<CreateElbBuyOrderResponse> createElbBuyOrder(CreateElbBuyOrderRequest request);

    CompletableFuture<CreateEnsServiceResponse> createEnsService(CreateEnsServiceRequest request);

    CompletableFuture<CreateEpnInstanceResponse> createEpnInstance(CreateEpnInstanceRequest request);

    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request);

    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    CompletableFuture<CreateLoadBalancerHTTPListenerResponse> createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request);

    CompletableFuture<CreateLoadBalancerHTTPSListenerResponse> createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request);

    CompletableFuture<CreateLoadBalancerTCPListenerResponse> createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request);

    CompletableFuture<CreateLoadBalancerUDPListenerResponse> createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request);

    CompletableFuture<CreateNetworkResponse> createNetwork(CreateNetworkRequest request);

    CompletableFuture<CreateSecurityGroupResponse> createSecurityGroup(CreateSecurityGroupRequest request);

    CompletableFuture<CreateVSwitchResponse> createVSwitch(CreateVSwitchRequest request);

    CompletableFuture<CreateVmAndSaveStockResponse> createVmAndSaveStock(CreateVmAndSaveStockRequest request);

    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeleteDeviceInternetPortResponse> deleteDeviceInternetPort(DeleteDeviceInternetPortRequest request);

    CompletableFuture<DeleteEpnInstanceResponse> deleteEpnInstance(DeleteEpnInstanceRequest request);

    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    CompletableFuture<DeleteLoadBalancerListenerResponse> deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request);

    CompletableFuture<DeleteNetworkResponse> deleteNetwork(DeleteNetworkRequest request);

    CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request);

    CompletableFuture<DeleteVSwitchResponse> deleteVSwitch(DeleteVSwitchRequest request);

    CompletableFuture<DeleteVmResponse> deleteVm(DeleteVmRequest request);

    CompletableFuture<DescribeApplicationResponse> describeApplication(DescribeApplicationRequest request);

    CompletableFuture<DescribeApplicationResourceSummaryResponse> describeApplicationResourceSummary(DescribeApplicationResourceSummaryRequest request);

    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeAvailableResourceInfoResponse> describeAvailableResourceInfo(DescribeAvailableResourceInfoRequest request);

    CompletableFuture<DescribeBandWithdChargeTypeResponse> describeBandWithdChargeType(DescribeBandWithdChargeTypeRequest request);

    CompletableFuture<DescribeBandwitdhByInternetChargeTypeResponse> describeBandwitdhByInternetChargeType(DescribeBandwitdhByInternetChargeTypeRequest request);

    CompletableFuture<DescribeCloudDiskAvailableResourceInfoResponse> describeCloudDiskAvailableResourceInfo(DescribeCloudDiskAvailableResourceInfoRequest request);

    CompletableFuture<DescribeCloudDiskTypesResponse> describeCloudDiskTypes(DescribeCloudDiskTypesRequest request);

    CompletableFuture<DescribeCreatePrePaidInstanceResultResponse> describeCreatePrePaidInstanceResult(DescribeCreatePrePaidInstanceResultRequest request);

    CompletableFuture<DescribeDataDistResultResponse> describeDataDistResult(DescribeDataDistResultRequest request);

    CompletableFuture<DescribeDataDownloadURLResponse> describeDataDownloadURL(DescribeDataDownloadURLRequest request);

    CompletableFuture<DescribeDataPushResultResponse> describeDataPushResult(DescribeDataPushResultRequest request);

    CompletableFuture<DescribeDeviceServiceResponse> describeDeviceService(DescribeDeviceServiceRequest request);

    CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request);

    CompletableFuture<DescribeEipAddressesResponse> describeEipAddresses(DescribeEipAddressesRequest request);

    CompletableFuture<DescribeElbAvailableResourceInfoResponse> describeElbAvailableResourceInfo(DescribeElbAvailableResourceInfoRequest request);

    CompletableFuture<DescribeEnsEipAddressesResponse> describeEnsEipAddresses(DescribeEnsEipAddressesRequest request);

    CompletableFuture<DescribeEnsNetDistrictResponse> describeEnsNetDistrict(DescribeEnsNetDistrictRequest request);

    CompletableFuture<DescribeEnsNetLevelResponse> describeEnsNetLevel(DescribeEnsNetLevelRequest request);

    CompletableFuture<DescribeEnsNetSaleDistrictResponse> describeEnsNetSaleDistrict(DescribeEnsNetSaleDistrictRequest request);

    CompletableFuture<DescribeEnsRegionIdIpv6InfoResponse> describeEnsRegionIdIpv6Info(DescribeEnsRegionIdIpv6InfoRequest request);

    CompletableFuture<DescribeEnsRegionIdResourceResponse> describeEnsRegionIdResource(DescribeEnsRegionIdResourceRequest request);

    CompletableFuture<DescribeEnsRegionsResponse> describeEnsRegions(DescribeEnsRegionsRequest request);

    CompletableFuture<DescribeEnsResourceUsageResponse> describeEnsResourceUsage(DescribeEnsResourceUsageRequest request);

    CompletableFuture<DescribeEpnBandWidthDataResponse> describeEpnBandWidthData(DescribeEpnBandWidthDataRequest request);

    CompletableFuture<DescribeEpnBandwitdhByInternetChargeTypeResponse> describeEpnBandwitdhByInternetChargeType(DescribeEpnBandwitdhByInternetChargeTypeRequest request);

    CompletableFuture<DescribeEpnInstanceAttributeResponse> describeEpnInstanceAttribute(DescribeEpnInstanceAttributeRequest request);

    CompletableFuture<DescribeEpnInstancesResponse> describeEpnInstances(DescribeEpnInstancesRequest request);

    CompletableFuture<DescribeEpnMeasurementDataResponse> describeEpnMeasurementData(DescribeEpnMeasurementDataRequest request);

    CompletableFuture<DescribeExportImageInfoResponse> describeExportImageInfo(DescribeExportImageInfoRequest request);

    CompletableFuture<DescribeExportImageStatusResponse> describeExportImageStatus(DescribeExportImageStatusRequest request);

    CompletableFuture<DescribeImageInfosResponse> describeImageInfos(DescribeImageInfosRequest request);

    CompletableFuture<DescribeImageSharePermissionResponse> describeImageSharePermission(DescribeImageSharePermissionRequest request);

    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    CompletableFuture<DescribeInstanceAutoRenewAttributeResponse> describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request);

    CompletableFuture<DescribeInstanceMonitorDataResponse> describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request);

    CompletableFuture<DescribeInstanceSpecResponse> describeInstanceSpec(DescribeInstanceSpecRequest request);

    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeKeyPairsResponse> describeKeyPairs(DescribeKeyPairsRequest request);

    CompletableFuture<DescribeLoadBalancerAttributeResponse> describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerHTTPListenerAttributeResponse> describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerHTTPSListenerAttributeResponse> describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerSpecResponse> describeLoadBalancerSpec(DescribeLoadBalancerSpecRequest request);

    CompletableFuture<DescribeLoadBalancerTCPListenerAttributeResponse> describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerUDPListenerAttributeResponse> describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancersResponse> describeLoadBalancers(DescribeLoadBalancersRequest request);

    CompletableFuture<DescribeMeasurementDataResponse> describeMeasurementData(DescribeMeasurementDataRequest request);

    CompletableFuture<DescribeNetworkAttributeResponse> describeNetworkAttribute(DescribeNetworkAttributeRequest request);

    CompletableFuture<DescribeNetworkInterfacesResponse> describeNetworkInterfaces(DescribeNetworkInterfacesRequest request);

    CompletableFuture<DescribeNetworksResponse> describeNetworks(DescribeNetworksRequest request);

    CompletableFuture<DescribePrePaidInstanceStockResponse> describePrePaidInstanceStock(DescribePrePaidInstanceStockRequest request);

    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<DescribeRegionIspsResponse> describeRegionIsps(DescribeRegionIspsRequest request);

    CompletableFuture<DescribeReservedResourceResponse> describeReservedResource(DescribeReservedResourceRequest request);

    CompletableFuture<DescribeSecurityGroupAttributeResponse> describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request);

    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    CompletableFuture<DescribeServcieScheduleResponse> describeServcieSchedule(DescribeServcieScheduleRequest request);

    CompletableFuture<DescribeUserBandWidthDataResponse> describeUserBandWidthData(DescribeUserBandWidthDataRequest request);

    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    CompletableFuture<DetachDiskResponse> detachDisk(DetachDiskRequest request);

    CompletableFuture<DistApplicationDataResponse> distApplicationData(DistApplicationDataRequest request);

    CompletableFuture<ExportBillDetailDataResponse> exportBillDetailData(ExportBillDetailDataRequest request);

    CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request);

    CompletableFuture<ExportMeasurementDataResponse> exportMeasurementData(ExportMeasurementDataRequest request);

    CompletableFuture<GetDeviceInternetPortResponse> getDeviceInternetPort(GetDeviceInternetPortRequest request);

    CompletableFuture<GetVmListResponse> getVmList(GetVmListRequest request);

    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    CompletableFuture<JoinPublicIpsToEpnInstanceResponse> joinPublicIpsToEpnInstance(JoinPublicIpsToEpnInstanceRequest request);

    CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request);

    CompletableFuture<JoinVSwitchesToEpnInstanceResponse> joinVSwitchesToEpnInstance(JoinVSwitchesToEpnInstanceRequest request);

    CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request);

    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    CompletableFuture<MigrateVmResponse> migrateVm(MigrateVmRequest request);

    CompletableFuture<ModifyEnsEipAddressAttributeResponse> modifyEnsEipAddressAttribute(ModifyEnsEipAddressAttributeRequest request);

    CompletableFuture<ModifyEpnInstanceResponse> modifyEpnInstance(ModifyEpnInstanceRequest request);

    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request);

    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request);

    CompletableFuture<ModifyLoadBalancerAttributeResponse> modifyLoadBalancerAttribute(ModifyLoadBalancerAttributeRequest request);

    CompletableFuture<ModifyNetworkAttributeResponse> modifyNetworkAttribute(ModifyNetworkAttributeRequest request);

    CompletableFuture<ModifySecurityGroupAttributeResponse> modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request);

    CompletableFuture<ModifyVSwitchAttributeResponse> modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request);

    CompletableFuture<PreCreateEnsServiceResponse> preCreateEnsService(PreCreateEnsServiceRequest request);

    CompletableFuture<PushApplicationDataResponse> pushApplicationData(PushApplicationDataRequest request);

    CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request);

    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    CompletableFuture<ReleaseEipAddressResponse> releaseEipAddress(ReleaseEipAddressRequest request);

    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    CompletableFuture<ReleasePostPaidInstanceResponse> releasePostPaidInstance(ReleasePostPaidInstanceRequest request);

    CompletableFuture<ReleasePrePaidInstanceResponse> releasePrePaidInstance(ReleasePrePaidInstanceRequest request);

    CompletableFuture<RemoveBackendServersResponse> removeBackendServers(RemoveBackendServersRequest request);

    CompletableFuture<RemovePublicIpsFromEpnInstanceResponse> removePublicIpsFromEpnInstance(RemovePublicIpsFromEpnInstanceRequest request);

    CompletableFuture<RemoveVSwitchesFromEpnInstanceResponse> removeVSwitchesFromEpnInstance(RemoveVSwitchesFromEpnInstanceRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<RescaleApplicationResponse> rescaleApplication(RescaleApplicationRequest request);

    CompletableFuture<RescaleDeviceServiceResponse> rescaleDeviceService(RescaleDeviceServiceRequest request);

    CompletableFuture<ResetDeviceInstanceResponse> resetDeviceInstance(ResetDeviceInstanceRequest request);

    CompletableFuture<RestartDeviceInstanceResponse> restartDeviceInstance(RestartDeviceInstanceRequest request);

    CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request);

    CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request);

    CompletableFuture<RollbackApplicationResponse> rollbackApplication(RollbackApplicationRequest request);

    CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request);

    CompletableFuture<RunServiceScheduleResponse> runServiceSchedule(RunServiceScheduleRequest request);

    CompletableFuture<SchedulePodResponse> schedulePod(SchedulePodRequest request);

    CompletableFuture<SetBackendServersResponse> setBackendServers(SetBackendServersRequest request);

    CompletableFuture<SetLoadBalancerHTTPListenerAttributeResponse> setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request);

    CompletableFuture<SetLoadBalancerHTTPSListenerAttributeResponse> setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request);

    CompletableFuture<SetLoadBalancerStatusResponse> setLoadBalancerStatus(SetLoadBalancerStatusRequest request);

    CompletableFuture<SetLoadBalancerTCPListenerAttributeResponse> setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request);

    CompletableFuture<SetLoadBalancerUDPListenerAttributeResponse> setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request);

    CompletableFuture<StartEpnInstanceResponse> startEpnInstance(StartEpnInstanceRequest request);

    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StartLoadBalancerListenerResponse> startLoadBalancerListener(StartLoadBalancerListenerRequest request);

    CompletableFuture<StopEpnInstanceResponse> stopEpnInstance(StopEpnInstanceRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<StopLoadBalancerListenerResponse> stopLoadBalancerListener(StopLoadBalancerListenerRequest request);

    CompletableFuture<UnAssociateEnsEipAddressResponse> unAssociateEnsEipAddress(UnAssociateEnsEipAddressRequest request);

    CompletableFuture<UnassociateEipAddressResponse> unassociateEipAddress(UnassociateEipAddressRequest request);

    CompletableFuture<UpgradeApplicationResponse> upgradeApplication(UpgradeApplicationRequest request);

}
