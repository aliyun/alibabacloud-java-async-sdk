// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ens20171110.models.*;
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

    CompletableFuture<AccosicateNetworkAclResponse> accosicateNetworkAcl(AccosicateNetworkAclRequest request);

    /**
      * *   You can call this operation up to 100 times per second.
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<AddBackendServersResponse> addBackendServers(AddBackendServersRequest request);

    CompletableFuture<AddDeviceInternetPortResponse> addDeviceInternetPort(AddDeviceInternetPortRequest request);

    /**
      * # [](#)Usage notes
      * *   You can call this operation up to 100 times per second.
      * *   You can call this operation up to 5 times per second per user.
      * *   Internal networks and IPv4 addresses are not supported.
      *
     */
    CompletableFuture<AddNetworkInterfaceToInstanceResponse> addNetworkInterfaceToInstance(AddNetworkInterfaceToInstanceRequest request);

    CompletableFuture<AddSnatIpForSnatEntryResponse> addSnatIpForSnatEntry(AddSnatIpForSnatEntryRequest request);

    CompletableFuture<AssignPrivateIpAddressesResponse> assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request);

    CompletableFuture<AssociateEnsEipAddressResponse> associateEnsEipAddress(AssociateEnsEipAddressRequest request);

    CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request);

    /**
      * # [](#)Usage notes
      * *   You can call this operation up to 10 times per second per account.
      * *   After you execute the command, the instance restarts loading.
      * *   Limits: The instance has at least two vCPUs and 4 GB memory. An image of CentOS 7.4 or later is required.
      *
     */
    CompletableFuture<AttachEnsInstancesResponse> attachEnsInstances(AttachEnsInstancesRequest request);

    CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request);

    /**
      * In the security group-related API documents, outbound traffic refers to the traffic that is sent by the source device and received at the destination device.
      *
     */
    CompletableFuture<AuthorizeSecurityGroupEgressResponse> authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request);

    CompletableFuture<CleanDistDataResponse> cleanDistData(CleanDistDataRequest request);

    CompletableFuture<CopySDGResponse> copySDG(CopySDGRequest request);

    CompletableFuture<CopySnapshotResponse> copySnapshot(CopySnapshotRequest request);

    CompletableFuture<CreateARMServerInstancesResponse> createARMServerInstances(CreateARMServerInstancesRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateClassicNetworkResponse> createClassicNetwork(CreateClassicNetworkRequest request);

    CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request);

    /**
      * *   You can call this operation up to 5,000 times per second per account.
      * *   You can call this operation up to 50 times per second per user.
      *
     */
    CompletableFuture<CreateEipInstanceResponse> createEipInstance(CreateEipInstanceRequest request);

    CompletableFuture<CreateEnsRouteEntryResponse> createEnsRouteEntry(CreateEnsRouteEntryRequest request);

    CompletableFuture<CreateEnsSaleControlResponse> createEnsSaleControl(CreateEnsSaleControlRequest request);

    CompletableFuture<CreateEnsServiceResponse> createEnsService(CreateEnsServiceRequest request);

    CompletableFuture<CreateEpnInstanceResponse> createEpnInstance(CreateEpnInstanceRequest request);

    CompletableFuture<CreateFileSystemResponse> createFileSystem(CreateFileSystemRequest request);

    CompletableFuture<CreateForwardEntryResponse> createForwardEntry(CreateForwardEntryRequest request);

    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
      * *   You can call this operation up to 10 times per second per account.
      * *   We recommend that you increase the request time because instance creation is an asynchronous operation. If the return code of the API operation is 0, it indicates that the request is successful, but does not indicate that the instance is created. If the request is successful, an instance ID is returned. You can check whether the instance is created based on the instance ID.
      * *   InvalidUserData.NotInWhiteList operation restriction: You can create an instance only if you are in the whitelist in which members have the purchase permissions. Otherwise, an error is returned.
      *
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateInstanceActiveOpsTaskResponse> createInstanceActiveOpsTask(CreateInstanceActiveOpsTaskRequest request);

    /**
      * An SSH key pair consists of a public key and a private key. ENS stores the public key and returns the unencrypted private key that is PEM-encoded in the PKCS#8 format. You must securely lock away the private key.
      *
     */
    CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 5 times per second per user.
      *
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<CreateLoadBalancerHTTPListenerResponse> createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<CreateLoadBalancerHTTPSListenerResponse> createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<CreateLoadBalancerTCPListenerResponse> createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<CreateLoadBalancerUDPListenerResponse> createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request);

    /**
      * ## [](#)Precautions
      * After you call this operation, a mount target is not immediately created. Therefore, we recommend that you call the DescribeMountTargets operation to query the status of the mount target. If the mount target is in the Active state, you can then mount the file system. Otherwise, the file system may fail to be mounted.
      *
     */
    CompletableFuture<CreateMountTargetResponse> createMountTarget(CreateMountTargetRequest request);

    CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request);

    /**
      * *   You can call this operation up to 100 times per second.
      * *   You can call this operation up to 5 times per second per user.
      *
     */
    CompletableFuture<CreateNetworkResponse> createNetwork(CreateNetworkRequest request);

    CompletableFuture<CreateNetworkAclResponse> createNetworkAcl(CreateNetworkAclRequest request);

    CompletableFuture<CreateNetworkAclEntryResponse> createNetworkAclEntry(CreateNetworkAclEntryRequest request);

    /**
      * ## [](#)
      * After you create an SDG, you must call the [SaveSDG](~~608126~~) operation to save the SDG. Otherwise, the SDG is unavailable.
      *
     */
    CompletableFuture<CreateSDGResponse> createSDG(CreateSDGRequest request);

    CompletableFuture<CreateSecurityGroupResponse> createSecurityGroup(CreateSecurityGroupRequest request);

    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    CompletableFuture<CreateSnatEntryResponse> createSnatEntry(CreateSnatEntryRequest request);

    CompletableFuture<CreateVSwitchResponse> createVSwitch(CreateVSwitchRequest request);

    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
      * *   Only the Alibaba Cloud Account ID owner of a bucket can delete the bucket from the account.
      * *   You cannot delete buckets that store objects. You can only delete empty buckets.
      *
     */
    CompletableFuture<DeleteBucketResponse> deleteBucket(DeleteBucketRequest request);

    CompletableFuture<DeleteBucketLifecycleResponse> deleteBucketLifecycle(DeleteBucketLifecycleRequest request);

    CompletableFuture<DeleteDeviceInternetPortResponse> deleteDeviceInternetPort(DeleteDeviceInternetPortRequest request);

    /**
      * When you release a disk, the disk must be in the Available state.
      *
     */
    CompletableFuture<DeleteDiskResponse> deleteDisk(DeleteDiskRequest request);

    CompletableFuture<DeleteEnsRouteEntryResponse> deleteEnsRouteEntry(DeleteEnsRouteEntryRequest request);

    CompletableFuture<DeleteEnsSaleConditionControlResponse> deleteEnsSaleConditionControl(DeleteEnsSaleConditionControlRequest request);

    CompletableFuture<DeleteEnsSaleControlResponse> deleteEnsSaleControl(DeleteEnsSaleControlRequest request);

    /**
      * You can delete an EPN instance only when the instance group information is empty.
      *
     */
    CompletableFuture<DeleteEpnInstanceResponse> deleteEpnInstance(DeleteEpnInstanceRequest request);

    CompletableFuture<DeleteFileSystemResponse> deleteFileSystem(DeleteFileSystemRequest request);

    CompletableFuture<DeleteForwardEntryResponse> deleteForwardEntry(DeleteForwardEntryRequest request);

    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
      * *   After you delete an SSH key pair, you can no longer query the key pair by calling the DescribeKeyPairs operation.
      * *   If you delete an SSH key pair that is bound to an Edge Node Service (ENS) instance, ENS no longer stores the SSH key pair. However, you can still use the key pair to access the instance. When you call the DescribeInstance operation to query instance information, no other information but the name of the key pair (**KeyPairName**) is returned.
      *
     */
    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<DeleteLoadBalancerListenerResponse> deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request);

    /**
      * After you delete a mount target, the mount target cannot be restored. Proceed with caution.
      *
     */
    CompletableFuture<DeleteMountTargetResponse> deleteMountTarget(DeleteMountTargetRequest request);

    CompletableFuture<DeleteNatGatewayResponse> deleteNatGateway(DeleteNatGatewayRequest request);

    CompletableFuture<DeleteNetworkResponse> deleteNetwork(DeleteNetworkRequest request);

    CompletableFuture<DeleteNetworkAclResponse> deleteNetworkAcl(DeleteNetworkAclRequest request);

    CompletableFuture<DeleteNetworkAclEntryResponse> deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request);

    CompletableFuture<DeleteObjectResponse> deleteObject(DeleteObjectRequest request);

    /**
      * ## [](#)
      * If all the SDGs corresponding to the original disk are deleted, the original disk is automatically cleared.
      *
     */
    CompletableFuture<DeleteSDGResponse> deleteSDG(DeleteSDGRequest request);

    /**
      * Before you delete a security group, make sure that no instances exist in the security group.
      *
     */
    CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request);

    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    CompletableFuture<DeleteSnatEntryResponse> deleteSnatEntry(DeleteSnatEntryRequest request);

    CompletableFuture<DeleteSnatIpForSnatEntryResponse> deleteSnatIpForSnatEntry(DeleteSnatIpForSnatEntryRequest request);

    /**
      * Before you delete a vSwitch, make sure that no instances exist in the vSwitch.
      *
     */
    CompletableFuture<DeleteVSwitchResponse> deleteVSwitch(DeleteVSwitchRequest request);

    CompletableFuture<DeploySDGResponse> deploySDG(DeploySDGRequest request);

    CompletableFuture<DescribeAICImagesResponse> describeAICImages(DescribeAICImagesRequest request);

    CompletableFuture<DescribeARMServerInstancesResponse> describeARMServerInstances(DescribeARMServerInstancesRequest request);

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

    CompletableFuture<DescribeEnsCommodityCodeResponse> describeEnsCommodityCode(DescribeEnsCommodityCodeRequest request);

    CompletableFuture<DescribeEnsCommodityModuleCodeResponse> describeEnsCommodityModuleCode(DescribeEnsCommodityModuleCodeRequest request);

    CompletableFuture<DescribeEnsEipAddressesResponse> describeEnsEipAddresses(DescribeEnsEipAddressesRequest request);

    CompletableFuture<DescribeEnsNetDistrictResponse> describeEnsNetDistrict(DescribeEnsNetDistrictRequest request);

    CompletableFuture<DescribeEnsNetLevelResponse> describeEnsNetLevel(DescribeEnsNetLevelRequest request);

    CompletableFuture<DescribeEnsNetSaleDistrictResponse> describeEnsNetSaleDistrict(DescribeEnsNetSaleDistrictRequest request);

    CompletableFuture<DescribeEnsRegionIdIpv6InfoResponse> describeEnsRegionIdIpv6Info(DescribeEnsRegionIdIpv6InfoRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<DescribeEnsRegionIdResourceResponse> describeEnsRegionIdResource(DescribeEnsRegionIdResourceRequest request);

    CompletableFuture<DescribeEnsRegionsResponse> describeEnsRegions(DescribeEnsRegionsRequest request);

    CompletableFuture<DescribeEnsResourceUsageResponse> describeEnsResourceUsage(DescribeEnsResourceUsageRequest request);

    CompletableFuture<DescribeEnsRouteEntryListResponse> describeEnsRouteEntryList(DescribeEnsRouteEntryListRequest request);

    CompletableFuture<DescribeEnsSaleControlResponse> describeEnsSaleControl(DescribeEnsSaleControlRequest request);

    CompletableFuture<DescribeEnsSaleControlAvailableResourceResponse> describeEnsSaleControlAvailableResource(DescribeEnsSaleControlAvailableResourceRequest request);

    CompletableFuture<DescribeEnsSaleControlStockResponse> describeEnsSaleControlStock(DescribeEnsSaleControlStockRequest request);

    CompletableFuture<DescribeEpnBandWidthDataResponse> describeEpnBandWidthData(DescribeEpnBandWidthDataRequest request);

    CompletableFuture<DescribeEpnBandwitdhByInternetChargeTypeResponse> describeEpnBandwitdhByInternetChargeType(DescribeEpnBandwitdhByInternetChargeTypeRequest request);

    /**
      * In internal networking mode, the value of Instances is empty in the response. In public networking mode, the value of VSwitches is empty in the response.
      *
     */
    CompletableFuture<DescribeEpnInstanceAttributeResponse> describeEpnInstanceAttribute(DescribeEpnInstanceAttributeRequest request);

    CompletableFuture<DescribeEpnInstancesResponse> describeEpnInstances(DescribeEpnInstancesRequest request);

    CompletableFuture<DescribeEpnMeasurementDataResponse> describeEpnMeasurementData(DescribeEpnMeasurementDataRequest request);

    /**
      * *   You can call this operation to query information about all custom images in your account. The information include the image properties, image export status, and the Object Storage Service (OSS) download links.
      * *   Empty strings are returned for images that are not exported.
      * *   The download links may become invalid if you delete objects in OSS.
      *
     */
    CompletableFuture<DescribeExportImageInfoResponse> describeExportImageInfo(DescribeExportImageInfoRequest request);

    CompletableFuture<DescribeExportImageStatusResponse> describeExportImageStatus(DescribeExportImageStatusRequest request);

    CompletableFuture<DescribeFileSystemsResponse> describeFileSystems(DescribeFileSystemsRequest request);

    CompletableFuture<DescribeForwardTableEntriesResponse> describeForwardTableEntries(DescribeForwardTableEntriesRequest request);

    CompletableFuture<DescribeImageInfosResponse> describeImageInfos(DescribeImageInfosRequest request);

    CompletableFuture<DescribeImageSharePermissionResponse> describeImageSharePermission(DescribeImageSharePermissionRequest request);

    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    CompletableFuture<DescribeInstanceAutoRenewAttributeResponse> describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request);

    CompletableFuture<DescribeInstanceMonitorDataResponse> describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request);

    CompletableFuture<DescribeInstanceSpecResponse> describeInstanceSpec(DescribeInstanceSpecRequest request);

    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request);

    /**
      * *   You can call this operation up to 800 times per second per account.
      * *   You can call this operation up to 100 times per second per user.
      * *   You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are included in the filter conditions. However, if InstanceIds is set to an empty JSON array, it is regarded as a valid filter condition and an empty result is returned.
      *
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeKeyPairsResponse> describeKeyPairs(DescribeKeyPairsRequest request);

    /**
      * > 
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<DescribeLoadBalancerAttributeResponse> describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request);

    /**
      * > 
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<DescribeLoadBalancerHTTPListenerAttributeResponse> describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<DescribeLoadBalancerHTTPSListenerAttributeResponse> describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerSpecResponse> describeLoadBalancerSpec(DescribeLoadBalancerSpecRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<DescribeLoadBalancerTCPListenerAttributeResponse> describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<DescribeLoadBalancerUDPListenerAttributeResponse> describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<DescribeLoadBalancersResponse> describeLoadBalancers(DescribeLoadBalancersRequest request);

    CompletableFuture<DescribeMeasurementDataResponse> describeMeasurementData(DescribeMeasurementDataRequest request);

    CompletableFuture<DescribeMountTargetsResponse> describeMountTargets(DescribeMountTargetsRequest request);

    CompletableFuture<DescribeNCInformationResponse> describeNCInformation(DescribeNCInformationRequest request);

    CompletableFuture<DescribeNatGatewaysResponse> describeNatGateways(DescribeNatGatewaysRequest request);

    CompletableFuture<DescribeNetworkAclsResponse> describeNetworkAcls(DescribeNetworkAclsRequest request);

    /**
      * *   You can call this operation up to 100 times per second.
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeNetworkAttributeResponse> describeNetworkAttribute(DescribeNetworkAttributeRequest request);

    CompletableFuture<DescribeNetworkInterfacesResponse> describeNetworkInterfaces(DescribeNetworkInterfacesRequest request);

    /**
      * *   You can call this operation up to 100 times per second.
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<DescribeNetworksResponse> describeNetworks(DescribeNetworksRequest request);

    CompletableFuture<DescribePrePaidInstanceStockResponse> describePrePaidInstanceStock(DescribePrePaidInstanceStockRequest request);

    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<DescribeRegionIspsResponse> describeRegionIsps(DescribeRegionIspsRequest request);

    CompletableFuture<DescribeRegionResourceResponse> describeRegionResource(DescribeRegionResourceRequest request);

    CompletableFuture<DescribeReservedResourceResponse> describeReservedResource(DescribeReservedResourceRequest request);

    CompletableFuture<DescribeResourceTimelineResponse> describeResourceTimeline(DescribeResourceTimelineRequest request);

    CompletableFuture<DescribeSDGDeploymentStatusResponse> describeSDGDeploymentStatus(DescribeSDGDeploymentStatusRequest request);

    CompletableFuture<DescribeSDGsResponse> describeSDGs(DescribeSDGsRequest request);

    CompletableFuture<DescribeSecurityGroupAttributeResponse> describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request);

    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    CompletableFuture<DescribeSelfImagesResponse> describeSelfImages(DescribeSelfImagesRequest request);

    CompletableFuture<DescribeServcieScheduleResponse> describeServcieSchedule(DescribeServcieScheduleRequest request);

    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    CompletableFuture<DescribeSnatAttributeResponse> describeSnatAttribute(DescribeSnatAttributeRequest request);

    CompletableFuture<DescribeSnatTableEntriesResponse> describeSnatTableEntries(DescribeSnatTableEntriesRequest request);

    CompletableFuture<DescribeUserBandWidthDataResponse> describeUserBandWidthData(DescribeUserBandWidthDataRequest request);

    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    CompletableFuture<DetachDiskResponse> detachDisk(DetachDiskRequest request);

    CompletableFuture<DistApplicationDataResponse> distApplicationData(DistApplicationDataRequest request);

    CompletableFuture<ExportBillDetailDataResponse> exportBillDetailData(ExportBillDetailDataRequest request);

    CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request);

    CompletableFuture<ExportMeasurementDataResponse> exportMeasurementData(ExportMeasurementDataRequest request);

    CompletableFuture<GetBucketAclResponse> getBucketAcl(GetBucketAclRequest request);

    CompletableFuture<GetBucketInfoResponse> getBucketInfo(GetBucketInfoRequest request);

    CompletableFuture<GetBucketLifecycleResponse> getBucketLifecycle(GetBucketLifecycleRequest request);

    CompletableFuture<GetDeviceInternetPortResponse> getDeviceInternetPort(GetDeviceInternetPortRequest request);

    CompletableFuture<GetOssStorageAndAccByBucketsResponse> getOssStorageAndAccByBuckets(GetOssStorageAndAccByBucketsRequest request);

    /**
      * The query and aggregation granularity of bandwidth and storage usage cannot exceed one day. Data aggregation is to collect the maximum values of usage data within a period of time.
      *
     */
    CompletableFuture<GetOssUsageDataResponse> getOssUsageData(GetOssUsageDataRequest request);

    /**
      * *   After the key pair is imported, ENS stores the public key. You must securely store the private key.
      * *   The key pair can be only in the ssh-rsa format.
      *
     */
    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    CompletableFuture<JoinPublicIpsToEpnInstanceResponse> joinPublicIpsToEpnInstance(JoinPublicIpsToEpnInstanceRequest request);

    /**
      * Before you call this operation to add an instance to a security group, make sure that the instance is in the Stopped or Running state.
      *
     */
    CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request);

    CompletableFuture<JoinVSwitchesToEpnInstanceResponse> joinVSwitchesToEpnInstance(JoinVSwitchesToEpnInstanceRequest request);

    /**
      * Before you remove an instance from a security group, the instance must be in the Stopped or Running state.
      *
     */
    CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request);

    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    CompletableFuture<ListBucketsResponse> listBuckets(ListBucketsRequest request);

    CompletableFuture<ListObjectsResponse> listObjects(ListObjectsRequest request);

    CompletableFuture<ModifyEnsEipAddressAttributeResponse> modifyEnsEipAddressAttribute(ModifyEnsEipAddressAttributeRequest request);

    CompletableFuture<ModifyEpnInstanceResponse> modifyEpnInstance(ModifyEpnInstanceRequest request);

    CompletableFuture<ModifyFileSystemResponse> modifyFileSystem(ModifyFileSystemRequest request);

    CompletableFuture<ModifyForwardEntryResponse> modifyForwardEntry(ModifyForwardEntryRequest request);

    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request);

    /**
      * *   If an instance is in the Starting state, you cannot reset the password of the instance.
      * *   When the instance is in the Running state, you cannot change the password of the instance.
      * *   After resetting the password, you must Restart the instance in the ECS console or call the RebootInstance operation to validate the modifications. The restart operation within the instance does not validate the modifications.
      *
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request);

    /**
      * Before you call this operation, make sure that you fully understand the billing methods and pricing of ENS.
      * The instances must be in the Running or Stopped state, and you have no overdue payments for them.
      *
     */
    CompletableFuture<ModifyInstanceChargeTypeResponse> modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<ModifyLoadBalancerAttributeResponse> modifyLoadBalancerAttribute(ModifyLoadBalancerAttributeRequest request);

    /**
      * *   You can call this operation up to 100 times per second.
      * *   You can call this operation up to 5 times per second per user.
      *
     */
    CompletableFuture<ModifyNetworkAttributeResponse> modifyNetworkAttribute(ModifyNetworkAttributeRequest request);

    CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request);

    /**
      * *   You can call this operation up to 100 times per second.
      * *   You can call this operation up to 5 times per second per user.
      *
     */
    CompletableFuture<ModifySecurityGroupAttributeResponse> modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request);

    CompletableFuture<ModifySnapshotAttributeResponse> modifySnapshotAttribute(ModifySnapshotAttributeRequest request);

    /**
      * *   You can call this operation up to 100 times per second.
      * *   You can call this operation up to 5 times per second per user.
      *
     */
    CompletableFuture<ModifyVSwitchAttributeResponse> modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request);

    CompletableFuture<PushApplicationDataResponse> pushApplicationData(PushApplicationDataRequest request);

    CompletableFuture<PutBucketResponse> putBucket(PutBucketRequest request);

    CompletableFuture<PutBucketAclResponse> putBucketAcl(PutBucketAclRequest request);

    /**
      * - You can configure up to 1000 rules. 
      * - If an object meets multiple rules, the rule that has the earliest expiration time prevails.
      *
     */
    CompletableFuture<PutBucketLifecycleResponse> putBucketLifecycle(PutBucketLifecycleRequest request);

    CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request);

    CompletableFuture<RebootAICInstanceResponse> rebootAICInstance(RebootAICInstanceRequest request);

    CompletableFuture<RebootARMServerInstanceResponse> rebootARMServerInstance(RebootARMServerInstanceRequest request);

    /**
      * *   Only instances that are in the Running state can be restarted.
      * *   If the operation is successful, the status of the instance becomes Starting.
      *
     */
    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request);

    CompletableFuture<RecoverAICInstanceResponse> recoverAICInstance(RecoverAICInstanceRequest request);

    CompletableFuture<ReinitInstanceResponse> reinitInstance(ReinitInstanceRequest request);

    CompletableFuture<ReinitInstancesResponse> reinitInstances(ReinitInstancesRequest request);

    CompletableFuture<ReleaseAICInstanceResponse> releaseAICInstance(ReleaseAICInstanceRequest request);

    CompletableFuture<ReleaseARMServerInstanceResponse> releaseARMServerInstance(ReleaseARMServerInstanceRequest request);

    /**
      * *   You can call this operation up to 10,000 times per second per account.
      * *   The maximum number of times that each user can call this operation per second is 50.
      *
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    CompletableFuture<ReleasePostPaidInstanceResponse> releasePostPaidInstance(ReleasePostPaidInstanceRequest request);

    CompletableFuture<ReleasePrePaidInstanceResponse> releasePrePaidInstance(ReleasePrePaidInstanceRequest request);

    /**
      * *   You can call this operation up to 100 times per second.
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<RemoveBackendServersResponse> removeBackendServers(RemoveBackendServersRequest request);

    CompletableFuture<RemovePublicIpsFromEpnInstanceResponse> removePublicIpsFromEpnInstance(RemovePublicIpsFromEpnInstanceRequest request);

    CompletableFuture<RemoveSDGResponse> removeSDG(RemoveSDGRequest request);

    CompletableFuture<RemoveVSwitchesFromEpnInstanceResponse> removeVSwitchesFromEpnInstance(RemoveVSwitchesFromEpnInstanceRequest request);

    CompletableFuture<RenewARMServerInstanceResponse> renewARMServerInstance(RenewARMServerInstanceRequest request);

    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    CompletableFuture<RescaleApplicationResponse> rescaleApplication(RescaleApplicationRequest request);

    CompletableFuture<RescaleDeviceServiceResponse> rescaleDeviceService(RescaleDeviceServiceRequest request);

    CompletableFuture<ResetAICInstanceResponse> resetAICInstance(ResetAICInstanceRequest request);

    CompletableFuture<ResetDeviceInstanceResponse> resetDeviceInstance(ResetDeviceInstanceRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   The disk must be in the In Use (In_Use) or Unattached (Available) state.
      * *   The instance to which the disk is attached must be in the Stopped (Stopped) state. You can call the **StopInstance** operation to stop an instance.
      * *   The snapshot specified by the SnapshotId parameter must be created from the disk specified by the DiskId parameter.
      * *   When you call the **DescribeInstance** operation to query instance information, if the response contains `{"OperationLocks": {"LockReason" : "security"}}` for an instance, the instance is locked for security reasons and you cannot perform operations on the instance.
      *
     */
    CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request);

    CompletableFuture<ResizeDiskResponse> resizeDisk(ResizeDiskRequest request);

    CompletableFuture<RestartDeviceInstanceResponse> restartDeviceInstance(RestartDeviceInstanceRequest request);

    /**
      * *   In the security group-related API documents, inbound traffic refers to the traffic sent by the source and received by the destination.
      * *   You can determine an inbound security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      * *   You can specify one or more of the following parameters to remove access control for a CIDR block: IpProtocol, PortRange, Policy, and SourceCidrIp.
      *
     */
    CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request);

    /**
      * >  In the security group-related API documents, outbound traffic refers to the traffic sent by the source and received by the destination.
      *
     */
    CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request);

    CompletableFuture<RollbackApplicationResponse> rollbackApplication(RollbackApplicationRequest request);

    CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request);

    CompletableFuture<RunServiceScheduleResponse> runServiceSchedule(RunServiceScheduleRequest request);

    CompletableFuture<SaveSDGResponse> saveSDG(SaveSDGRequest request);

    /**
      * *   You can call this operation up to 100 times per second.
      * *   You can call this operation up to 10 times per second per account.
      *
     */
    CompletableFuture<SetBackendServersResponse> setBackendServers(SetBackendServersRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<SetLoadBalancerHTTPListenerAttributeResponse> setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<SetLoadBalancerHTTPSListenerAttributeResponse> setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<SetLoadBalancerStatusResponse> setLoadBalancerStatus(SetLoadBalancerStatusRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<SetLoadBalancerTCPListenerAttributeResponse> setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request);

    /**
      * > 
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<SetLoadBalancerUDPListenerAttributeResponse> setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request);

    CompletableFuture<StartEpnInstanceResponse> startEpnInstance(StartEpnInstanceRequest request);

    /**
      * *   You can call the operation only when the instance is in the Stopped state.
      * *   If the operation is successful, the status of the instance becomes Starting.
      *
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<StartLoadBalancerListenerResponse> startLoadBalancerListener(StartLoadBalancerListenerRequest request);

    CompletableFuture<StartSnatIpForSnatEntryResponse> startSnatIpForSnatEntry(StartSnatIpForSnatEntryRequest request);

    CompletableFuture<StopEpnInstanceResponse> stopEpnInstance(StopEpnInstanceRequest request);

    /**
      * *   You can call this operation to stop instances that are only in the Running state.
      * *   If the call is successful, the state of the instance becomes Stopping.
      * *   Once the instance is stopped, the state of the instance becomes Stopped.
      * *   Force stop is supported, which is equivalent to power-off. Data that is not written to disks on the instance may be lost.
      *
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    /**
      * *   You can call this operation up to 100 times per second per account.
      * *   You can call this operation up to 10 times per second per user.
      *
     */
    CompletableFuture<StopLoadBalancerListenerResponse> stopLoadBalancerListener(StopLoadBalancerListenerRequest request);

    CompletableFuture<StopSnatIpForSnatEntryResponse> stopSnatIpForSnatEntry(StopSnatIpForSnatEntryRequest request);

    CompletableFuture<UnAssociateEnsEipAddressResponse> unAssociateEnsEipAddress(UnAssociateEnsEipAddressRequest request);

    CompletableFuture<UnassignPrivateIpAddressesResponse> unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request);

    CompletableFuture<UnassociateNetworkAclResponse> unassociateNetworkAcl(UnassociateNetworkAclRequest request);

    CompletableFuture<UpdateEnsSaleControlResponse> updateEnsSaleControl(UpdateEnsSaleControlRequest request);

    CompletableFuture<UpgradeAICInstanceImageResponse> upgradeAICInstanceImage(UpgradeAICInstanceImageRequest request);

    CompletableFuture<UpgradeApplicationResponse> upgradeApplication(UpgradeApplicationRequest request);

}
