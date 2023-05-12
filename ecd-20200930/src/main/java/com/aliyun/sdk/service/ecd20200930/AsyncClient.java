// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecd20200930.models.*;
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

    CompletableFuture<ActivateOfficeSiteResponse> activateOfficeSite(ActivateOfficeSiteRequest request);

    /**
      * You can add only one device to a tenant.
      *
     */
    CompletableFuture<AddDevicesResponse> addDevices(AddDevicesRequest request);

    /**
      * You can call this operation to share a specific folder with other users. You can also configure the folder permissions.
      *
     */
    CompletableFuture<AddFilePermissionResponse> addFilePermission(AddFilePermissionRequest request);

    CompletableFuture<AddUserToDesktopGroupResponse> addUserToDesktopGroup(AddUserToDesktopGroupRequest request);

    /**
      * You can also associate an automatic snapshot policy with a cloud desktop in the Elastic Desktop Service (EDS) console. To do so, perform the following steps: 1. Log on to the EDS console. 2. Choose Desktops and Groups > Desktops in the left-side navigation pane. 3. Find the cloud desktop that you want to manage on the Cloud Desktops page and choose More > Change Automatic Snapshot Policy in the Actions column. 4. Configure a policy for the cloud desktop as prompted in the Change Automatic Snapshot Policy panel.
      * After you associate an automatic snapshot policy with the cloud desktop, the system creates snapshots for the cloud desktop based on the policy.
      *
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    CompletableFuture<ApplyCoordinatePrivilegeResponse> applyCoordinatePrivilege(ApplyCoordinatePrivilegeRequest request);

    CompletableFuture<ApplyCoordinationForMonitoringResponse> applyCoordinationForMonitoring(ApplyCoordinationForMonitoringRequest request);

    CompletableFuture<ApproveFotaUpdateResponse> approveFotaUpdate(ApproveFotaUpdateRequest request);

    CompletableFuture<AssociateNetworkPackageResponse> associateNetworkPackage(AssociateNetworkPackageRequest request);

    /**
      * The ID of the CEN instance.
      *
     */
    CompletableFuture<AttachCenResponse> attachCen(AttachCenRequest request);

    CompletableFuture<AttachEndUserResponse> attachEndUser(AttachEndUserRequest request);

    CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request);

    CompletableFuture<CancelCdsFileShareLinkResponse> cancelCdsFileShareLink(CancelCdsFileShareLinkRequest request);

    CompletableFuture<CancelCoordinationForMonitoringResponse> cancelCoordinationForMonitoring(CancelCoordinationForMonitoringRequest request);

    CompletableFuture<CancelCopyImageResponse> cancelCopyImage(CancelCopyImageRequest request);

    CompletableFuture<ClonePolicyGroupResponse> clonePolicyGroup(ClonePolicyGroupRequest request);

    CompletableFuture<CompleteCdsFileResponse> completeCdsFile(CompleteCdsFileRequest request);

    CompletableFuture<ConfigADConnectorTrustResponse> configADConnectorTrust(ConfigADConnectorTrustRequest request);

    CompletableFuture<ConfigADConnectorUserResponse> configADConnectorUser(ConfigADConnectorUserRequest request);

    CompletableFuture<CopyCdsFileResponse> copyCdsFile(CopyCdsFileRequest request);

    CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request);

    /**
      * The ID of the vSwitch.
      *
     */
    CompletableFuture<CreateADConnectorDirectoryResponse> createADConnectorDirectory(CreateADConnectorDirectoryRequest request);

    /**
      * The ID of the CEN instance.
      *
     */
    CompletableFuture<CreateADConnectorOfficeSiteResponse> createADConnectorOfficeSite(CreateADConnectorOfficeSiteRequest request);

    CompletableFuture<CreateAndBindNasFileSystemResponse> createAndBindNasFileSystem(CreateAndBindNasFileSystemRequest request);

    /**
      * You can call the operation to create an automatic snapshot policy based on a CRON expression. Then, the system automatically creates snapshots of a cloud desktop based on the policy.
      *
     */
    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    /**
      * The PL of the data disk. If the cloud desktop type is Graphics or High Frequency, you can set the PL of the data disk. Valid values:
      * *   PL0
      * *   PL1
      * *   PL2
      * *   PL3
      * For more information about the differences between disks at different PLs, see [Enhanced SSDs](~~122389~~).
      *
     */
    CompletableFuture<CreateBundleResponse> createBundle(CreateBundleRequest request);

    CompletableFuture<CreateCdsFileResponse> createCdsFile(CreateCdsFileRequest request);

    CompletableFuture<CreateCdsFileShareLinkResponse> createCdsFileShareLink(CreateCdsFileShareLinkRequest request);

    /**
      * # Description
      * Before you call this operation to create a desktop group, make sure that the following operations are complete:
      * *   You are familiar with the features, usage limits, and scaling policies of desktop groups. For more information, see [Overview](~~290959~~) of desktop groups.
      * *   Resources, such as workspaces, users, desktop templates, and policies, are created.
      *
     */
    CompletableFuture<CreateDesktopGroupResponse> createDesktopGroup(CreateDesktopGroupRequest request);

    /**
      * 1\\. Before you create a cloud desktop in Elastic Desktop Service (EDS), make sure that the following operations are complete:
      * *   A workspace and a user are created. For more information, see the following topics:
      *     *   Create a workspace of the convenience account type and a convenience user: [CreateSimpleOfficeSite](~~215416~~) and [Create a convenience user](~~214472~~)
      *     *   Create a workspace of the enterprise Active Directory (AD) account type and an enterprise AD user: [CreateADConnectorOfficeSite](~~215417~~) and [Create an enterprise AD user](~~188619~~)
      * *   A cloud desktop template is created by calling the [CreateBundle](~~188883~~) operation, or an existing cloud desktop template is used.
      * *   A policy is created by calling the [CreatePolicyGroup](~~188889~~) operation, or an existing policy is used.
      * 2\\. A custom command script that can be automatically executed after you create the cloud desktop is prepared. You can customize a command script by using the UserCommands parameter.
      *
     */
    CompletableFuture<CreateDesktopsResponse> createDesktops(CreateDesktopsRequest request);

    CompletableFuture<CreateDiskEncryptionServiceResponse> createDiskEncryptionService(CreateDiskEncryptionServiceRequest request);

    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    CompletableFuture<CreateNASFileSystemResponse> createNASFileSystem(CreateNASFileSystemRequest request);

    CompletableFuture<CreateNetworkPackageResponse> createNetworkPackage(CreateNetworkPackageRequest request);

    /**
      * A policy is a set of security rules that are used to control security configurations when end users use cloud desktops. A policy contains basic features, such as USB redirection and watermarking, and other features, such as security group control. For more information, see [Policy overview](~~189345~~).
      *
     */
    CompletableFuture<CreatePolicyGroupResponse> createPolicyGroup(CreatePolicyGroupRequest request);

    /**
      * The name of the directory. The name must be 2 to 255 characters in length and can contain letters, digits, colons (:), underscores (\\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
      * This parameter is empty by default.
      *
     */
    CompletableFuture<CreateRAMDirectoryResponse> createRAMDirectory(CreateRAMDirectoryRequest request);

    CompletableFuture<CreateSimpleOfficeSiteResponse> createSimpleOfficeSite(CreateSimpleOfficeSiteRequest request);

    /**
      * The cloud desktop for which you want to create a snapshot must be in the **Running** state or **Stopped** state.
      *
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request);

    CompletableFuture<DeleteBundlesResponse> deleteBundles(DeleteBundlesRequest request);

    CompletableFuture<DeleteCdsFileResponse> deleteCdsFile(DeleteCdsFileRequest request);

    CompletableFuture<DeleteCloudDriveGroupsResponse> deleteCloudDriveGroups(DeleteCloudDriveGroupsRequest request);

    CompletableFuture<DeleteCloudDriveUsersResponse> deleteCloudDriveUsers(DeleteCloudDriveUsersRequest request);

    CompletableFuture<DeleteDesktopGroupResponse> deleteDesktopGroup(DeleteDesktopGroupRequest request);

    CompletableFuture<DeleteDesktopsResponse> deleteDesktops(DeleteDesktopsRequest request);

    /**
      * You can call the operation to manage client devices.
      *
     */
    CompletableFuture<DeleteDevicesResponse> deleteDevices(DeleteDevicesRequest request);

    /**
      * The ID of directory N. You can specify one or more directory IDs.
      *
     */
    CompletableFuture<DeleteDirectoriesResponse> deleteDirectories(DeleteDirectoriesRequest request);

    /**
      * The IDs of the images that you want to delete. You can configure one or more image IDs. Valid values of N: 1 to 100.
      *
     */
    CompletableFuture<DeleteImagesResponse> deleteImages(DeleteImagesRequest request);

    /**
      * The operation that you want to perform. Set the value to DeleteNASFileSystems.
      *
     */
    CompletableFuture<DeleteNASFileSystemsResponse> deleteNASFileSystems(DeleteNASFileSystemsRequest request);

    CompletableFuture<DeleteNetworkPackagesResponse> deleteNetworkPackages(DeleteNetworkPackagesRequest request);

    /**
      * The operation that you want to perform. Set the value to **DeleteOfficeSites**.
      *
     */
    CompletableFuture<DeleteOfficeSitesResponse> deleteOfficeSites(DeleteOfficeSitesRequest request);

    CompletableFuture<DeletePolicyGroupsResponse> deletePolicyGroups(DeletePolicyGroupsRequest request);

    /**
      * If the IDs of the snapshots that you specify do not exist, requests are ignored.
      *
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteVirtualMFADeviceResponse> deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request);

    CompletableFuture<DescribeAlarmEventStackInfoResponse> describeAlarmEventStackInfo(DescribeAlarmEventStackInfoRequest request);

    /**
      * You can view an automatic snapshot policy that is associated with a cloud desktop in the Elastic Desktop Service (EDS) console. To view the automatic snapshot policy, you can go to the EDS console, choose Deployment > Snapshots in the left-side navigation pane, and then view an automatic snapshot policy on the Snapshots page.
      *
     */
    CompletableFuture<DescribeAutoSnapshotPolicyResponse> describeAutoSnapshotPolicy(DescribeAutoSnapshotPolicyRequest request);

    CompletableFuture<DescribeBundlesResponse> describeBundles(DescribeBundlesRequest request);

    CompletableFuture<DescribeCdsFileShareLinksResponse> describeCdsFileShareLinks(DescribeCdsFileShareLinksRequest request);

    CompletableFuture<DescribeCensResponse> describeCens(DescribeCensRequest request);

    /**
      * The version of the client.
      *
     */
    CompletableFuture<DescribeClientEventsResponse> describeClientEvents(DescribeClientEventsRequest request);

    CompletableFuture<DescribeCloudDriveGroupsResponse> describeCloudDriveGroups(DescribeCloudDriveGroupsRequest request);

    CompletableFuture<DescribeCloudDrivePermissionsResponse> describeCloudDrivePermissions(DescribeCloudDrivePermissionsRequest request);

    CompletableFuture<DescribeCustomizedListHeadersResponse> describeCustomizedListHeaders(DescribeCustomizedListHeadersRequest request);

    CompletableFuture<DescribeDesktopGroupsResponse> describeDesktopGroups(DescribeDesktopGroupsRequest request);

    CompletableFuture<DescribeDesktopIdsByVulNamesResponse> describeDesktopIdsByVulNames(DescribeDesktopIdsByVulNamesRequest request);

    CompletableFuture<DescribeDesktopTypesResponse> describeDesktopTypes(DescribeDesktopTypesRequest request);

    CompletableFuture<DescribeDesktopsResponse> describeDesktops(DescribeDesktopsRequest request);

    CompletableFuture<DescribeDesktopsInGroupResponse> describeDesktopsInGroup(DescribeDesktopsInGroupRequest request);

    CompletableFuture<DescribeDevicesResponse> describeDevices(DescribeDevicesRequest request);

    CompletableFuture<DescribeDirectoriesResponse> describeDirectories(DescribeDirectoriesRequest request);

    CompletableFuture<DescribeFlowMetricResponse> describeFlowMetric(DescribeFlowMetricRequest request);

    CompletableFuture<DescribeFlowStatisticResponse> describeFlowStatistic(DescribeFlowStatisticRequest request);

    CompletableFuture<DescribeFotaPendingDesktopsResponse> describeFotaPendingDesktops(DescribeFotaPendingDesktopsRequest request);

    CompletableFuture<DescribeFotaTasksResponse> describeFotaTasks(DescribeFotaTasksRequest request);

    CompletableFuture<DescribeFrontVulPatchListResponse> describeFrontVulPatchList(DescribeFrontVulPatchListRequest request);

    /**
      * The number of vulnerabilities processed.
      *
     */
    CompletableFuture<DescribeGroupedVulResponse> describeGroupedVul(DescribeGroupedVulRequest request);

    CompletableFuture<DescribeImageModifiedRecordsResponse> describeImageModifiedRecords(DescribeImageModifiedRecordsRequest request);

    CompletableFuture<DescribeImagePermissionResponse> describeImagePermission(DescribeImagePermissionRequest request);

    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    /**
      * *   After you run a command, the command may not succeed or return the expected results. You can call this operation to query the execution result.
      * *   You can query the execution information in the previous two weeks. Up to 100,000 lines of execution information can be retained.
      *
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    CompletableFuture<DescribeKmsKeysResponse> describeKmsKeys(DescribeKmsKeysRequest request);

    CompletableFuture<DescribeNASFileSystemsResponse> describeNASFileSystems(DescribeNASFileSystemsRequest request);

    CompletableFuture<DescribeNetworkPackagesResponse> describeNetworkPackages(DescribeNetworkPackagesRequest request);

    CompletableFuture<DescribeOfficeSitesResponse> describeOfficeSites(DescribeOfficeSitesRequest request);

    CompletableFuture<DescribePolicyGroupsResponse> describePolicyGroups(DescribePolicyGroupsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeScanTaskProgressResponse> describeScanTaskProgress(DescribeScanTaskProgressRequest request);

    CompletableFuture<DescribeSecurityEventOperationStatusResponse> describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request);

    CompletableFuture<DescribeSecurityEventOperationsResponse> describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request);

    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    CompletableFuture<DescribeSuspEventOverviewResponse> describeSuspEventOverview(DescribeSuspEventOverviewRequest request);

    /**
      * The path where the quarantined file is stored on the cloud desktop.
      *
     */
    CompletableFuture<DescribeSuspEventQuaraFilesResponse> describeSuspEventQuaraFiles(DescribeSuspEventQuaraFilesRequest request);

    CompletableFuture<DescribeSuspEventsResponse> describeSuspEvents(DescribeSuspEventsRequest request);

    CompletableFuture<DescribeUserConnectionRecordsResponse> describeUserConnectionRecords(DescribeUserConnectionRecordsRequest request);

    CompletableFuture<DescribeUserProfilePathRulesResponse> describeUserProfilePathRules(DescribeUserProfilePathRulesRequest request);

    CompletableFuture<DescribeUsersInGroupResponse> describeUsersInGroup(DescribeUsersInGroupRequest request);

    CompletableFuture<DescribeUsersPasswordResponse> describeUsersPassword(DescribeUsersPasswordRequest request);

    CompletableFuture<DescribeVirtualMFADevicesResponse> describeVirtualMFADevices(DescribeVirtualMFADevicesRequest request);

    CompletableFuture<DescribeVulDetailsResponse> describeVulDetails(DescribeVulDetailsRequest request);

    CompletableFuture<DescribeVulListResponse> describeVulList(DescribeVulListRequest request);

    CompletableFuture<DescribeVulOverviewResponse> describeVulOverview(DescribeVulOverviewRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<DetachCenResponse> detachCen(DetachCenRequest request);

    CompletableFuture<DetachEndUserResponse> detachEndUser(DetachEndUserRequest request);

    CompletableFuture<DisableDesktopsInGroupResponse> disableDesktopsInGroup(DisableDesktopsInGroupRequest request);

    CompletableFuture<DissociateNetworkPackageResponse> dissociateNetworkPackage(DissociateNetworkPackageRequest request);

    CompletableFuture<ExportClientEventsResponse> exportClientEvents(ExportClientEventsRequest request);

    CompletableFuture<ExportDesktopGroupInfoResponse> exportDesktopGroupInfo(ExportDesktopGroupInfoRequest request);

    CompletableFuture<ExportDesktopListInfoResponse> exportDesktopListInfo(ExportDesktopListInfoRequest request);

    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    CompletableFuture<GetDesktopGroupDetailResponse> getDesktopGroupDetail(GetDesktopGroupDetailRequest request);

    CompletableFuture<GetOfficeSiteSsoStatusResponse> getOfficeSiteSsoStatus(GetOfficeSiteSsoStatusRequest request);

    /**
      * The ID of the workspace.
      *
     */
    CompletableFuture<GetSpMetadataResponse> getSpMetadata(GetSpMetadataRequest request);

    CompletableFuture<HandleSecurityEventsResponse> handleSecurityEvents(HandleSecurityEventsRequest request);

    CompletableFuture<HibernateDesktopsResponse> hibernateDesktops(HibernateDesktopsRequest request);

    CompletableFuture<ListCdsFilesResponse> listCdsFiles(ListCdsFilesRequest request);

    CompletableFuture<ListDirectoryUsersResponse> listDirectoryUsers(ListDirectoryUsersRequest request);

    CompletableFuture<ListFilePermissionResponse> listFilePermission(ListFilePermissionRequest request);

    CompletableFuture<ListOfficeSiteOverviewResponse> listOfficeSiteOverview(ListOfficeSiteOverviewRequest request);

    CompletableFuture<ListOfficeSiteUsersResponse> listOfficeSiteUsers(ListOfficeSiteUsersRequest request);

    /**
      * The tag key of the resource.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListUserAdOrganizationUnitsResponse> listUserAdOrganizationUnits(ListUserAdOrganizationUnitsRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<LockVirtualMFADeviceResponse> lockVirtualMFADevice(LockVirtualMFADeviceRequest request);

    CompletableFuture<MigrateDesktopsResponse> migrateDesktops(MigrateDesktopsRequest request);

    CompletableFuture<ModifyADConnectorDirectoryResponse> modifyADConnectorDirectory(ModifyADConnectorDirectoryRequest request);

    CompletableFuture<ModifyADConnectorOfficeSiteResponse> modifyADConnectorOfficeSite(ModifyADConnectorOfficeSiteRequest request);

    CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request);

    /**
      * The ID of the desktop template.
      *
     */
    CompletableFuture<ModifyBundleResponse> modifyBundle(ModifyBundleRequest request);

    CompletableFuture<ModifyCdsFileResponse> modifyCdsFile(ModifyCdsFileRequest request);

    CompletableFuture<ModifyCdsFileShareLinkResponse> modifyCdsFileShareLink(ModifyCdsFileShareLinkRequest request);

    CompletableFuture<ModifyCloudDriveGroupsResponse> modifyCloudDriveGroups(ModifyCloudDriveGroupsRequest request);

    CompletableFuture<ModifyCloudDrivePermissionResponse> modifyCloudDrivePermission(ModifyCloudDrivePermissionRequest request);

    CompletableFuture<ModifyCustomizedListHeadersResponse> modifyCustomizedListHeaders(ModifyCustomizedListHeadersRequest request);

    /**
      * The new billing method that you want to use for the desktop group.
      *
     */
    CompletableFuture<ModifyDesktopChargeTypeResponse> modifyDesktopChargeType(ModifyDesktopChargeTypeRequest request);

    /**
      * After you create a desktop group, the system creates a specific number of cloud desktops based on the scaling policy that you configure for the desktop group and the number of end users who request to connect to the cloud desktops. Cloud desktops in a desktop group are created by using the same desktop template and security policy. You can modify the configurations of the desktop group in different scenarios to manage cloud desktops in a centralized manner.
      * *   By default, a desktop group has the same name as all cloud desktops in the group. You can modify the desktop group name, which is specified by the DesktopGroupName parameter, to distinguish the desktop group from the cloud desktops.
      * *   If the number of vCPUs and memory size of the cloud desktop cannot meet your business requirements in high performance scenarios, you can change the desktop template that is used to create the cloud desktop to a desktop template (OwnBundleId) that has higher specifications.
      * *   If a security policy that is associated with the desktop group cannot meet your requirements on security, you can change the policy to another policy (PolicyGroupId) that provides higher security.
      * *   If the number of cloud desktops in the desktop group is insufficient to meet the business requirements of end users, you can modify the parameter settings in the scaling policy. The parameters include MinDesktopsCount, MaxDesktopsCount, and AllowBufferCount.
      *
     */
    CompletableFuture<ModifyDesktopGroupResponse> modifyDesktopGroup(ModifyDesktopGroupRequest request);

    /**
      * The ID of the region.
      *
     */
    CompletableFuture<ModifyDesktopHostNameResponse> modifyDesktopHostName(ModifyDesktopHostNameRequest request);

    CompletableFuture<ModifyDesktopNameResponse> modifyDesktopName(ModifyDesktopNameRequest request);

    CompletableFuture<ModifyDesktopSpecResponse> modifyDesktopSpec(ModifyDesktopSpecRequest request);

    CompletableFuture<ModifyDesktopsPolicyGroupResponse> modifyDesktopsPolicyGroup(ModifyDesktopsPolicyGroupRequest request);

    /**
      * You can call this operation to change the configurations, such as the desktop type and disk size, of a cloud desktop.
      * *   Before you call this operation, you must know the cloud desktop types and the disk sizes for each type of cloud desktop that Elastic Desktop Service (EDS) provides.
      * *   When you change the configurations of a cloud desktop, you must change the desktop type or the size of the system disk or data disk. You must configure at least one of the following parameters: DesktopType, RootDiskSizeGib, and UserDiskSizeGib. Take note of the following items:
      * 1\\. Desktop types include the specifications of vCPUs, memory, and GPUs. You can change only the desktop type, instead of one of the specifications.
      * 2\\. You cannot change a cloud desktop from the General Office type to a non-General Office type, or from a non-General Office type to the General Office type. You cannot change a cloud desktop from the Graphics type to a non-Graphics type, or from a non-Graphics type to the Graphics type.
      * 3\\. You can only increase the sizes of system and data disks. You cannot decrease the sizes of system and data disks.
      * 4\\. If your cloud desktop uses the subscription billing method, the price difference is calculated based on the price before and after configuration changes. You may receive a refund, or must pay for the price difference.
      * 5\\. If you need to change the configurations of a cloud desktop multiple times, we recommend that you wait at least 5 minutes between consecutive operations on the cloud desktop.
      * 6\\. The cloud desktop for which you want to change the desktop type must be in the Stopped state.
      * *   The changes do not affect your personal data on the cloud desktop.
      *
     */
    CompletableFuture<ModifyDiskSpecResponse> modifyDiskSpec(ModifyDiskSpecRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<ModifyEntitlementResponse> modifyEntitlement(ModifyEntitlementRequest request);

    /**
      * The ID of the image.
      *
     */
    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    CompletableFuture<ModifyImagePermissionResponse> modifyImagePermission(ModifyImagePermissionRequest request);

    /**
      * The ID of the region.
      *
     */
    CompletableFuture<ModifyNASDefaultMountTargetResponse> modifyNASDefaultMountTarget(ModifyNASDefaultMountTargetRequest request);

    CompletableFuture<ModifyNetworkPackageBandwidthResponse> modifyNetworkPackageBandwidth(ModifyNetworkPackageBandwidthRequest request);

    /**
      * The ID of the region.
      *
     */
    CompletableFuture<ModifyNetworkPackageEnabledResponse> modifyNetworkPackageEnabled(ModifyNetworkPackageEnabledRequest request);

    CompletableFuture<ModifyOfficeSiteAttributeResponse> modifyOfficeSiteAttribute(ModifyOfficeSiteAttributeRequest request);

    CompletableFuture<ModifyOfficeSiteCrossDesktopAccessResponse> modifyOfficeSiteCrossDesktopAccess(ModifyOfficeSiteCrossDesktopAccessRequest request);

    CompletableFuture<ModifyOfficeSiteMfaEnabledResponse> modifyOfficeSiteMfaEnabled(ModifyOfficeSiteMfaEnabledRequest request);

    CompletableFuture<ModifyOperateVulResponse> modifyOperateVul(ModifyOperateVulRequest request);

    CompletableFuture<ModifyPolicyGroupResponse> modifyPolicyGroup(ModifyPolicyGroupRequest request);

    /**
      * The IDs of regular users.
      *
     */
    CompletableFuture<ModifyUserEntitlementResponse> modifyUserEntitlement(ModifyUserEntitlementRequest request);

    CompletableFuture<ModifyUserToDesktopGroupResponse> modifyUserToDesktopGroup(ModifyUserToDesktopGroupRequest request);

    CompletableFuture<MoveCdsFileResponse> moveCdsFile(MoveCdsFileRequest request);

    CompletableFuture<OperateVulsResponse> operateVuls(OperateVulsRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<RebootDesktopsResponse> rebootDesktops(RebootDesktopsRequest request);

    /**
      * The error message. This parameter is not returned if the value of Code is success.
      *
     */
    CompletableFuture<RebuildDesktopsResponse> rebuildDesktops(RebuildDesktopsRequest request);

    CompletableFuture<RemoveFilePermissionResponse> removeFilePermission(RemoveFilePermissionRequest request);

    CompletableFuture<RemoveUserFromDesktopGroupResponse> removeUserFromDesktopGroup(RemoveUserFromDesktopGroupRequest request);

    CompletableFuture<RenewDesktopsResponse> renewDesktops(RenewDesktopsRequest request);

    CompletableFuture<RenewNetworkPackagesResponse> renewNetworkPackages(RenewNetworkPackagesRequest request);

    CompletableFuture<ResetDesktopsResponse> resetDesktops(ResetDesktopsRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<ResetNASDefaultMountTargetResponse> resetNASDefaultMountTarget(ResetNASDefaultMountTargetRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<ResetSnapshotResponse> resetSnapshot(ResetSnapshotRequest request);

    CompletableFuture<RevokeCoordinatePrivilegeResponse> revokeCoordinatePrivilege(RevokeCoordinatePrivilegeRequest request);

    /**
      * The ID of the region.
      *
     */
    CompletableFuture<RollbackSuspEventQuaraFileResponse> rollbackSuspEventQuaraFile(RollbackSuspEventQuaraFileRequest request);

    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    CompletableFuture<SendVerifyCodeResponse> sendVerifyCode(SendVerifyCodeRequest request);

    CompletableFuture<SetDesktopGroupScaleTimerResponse> setDesktopGroupScaleTimer(SetDesktopGroupScaleTimerRequest request);

    CompletableFuture<SetDesktopGroupTimerResponse> setDesktopGroupTimer(SetDesktopGroupTimerRequest request);

    CompletableFuture<SetDesktopGroupTimerStatusResponse> setDesktopGroupTimerStatus(SetDesktopGroupTimerStatusRequest request);

    CompletableFuture<SetDirectorySsoStatusResponse> setDirectorySsoStatus(SetDirectorySsoStatusRequest request);

    /**
      * The entityID value obtained after the IdP metadata file is parsed.
      *
     */
    CompletableFuture<SetIdpMetadataResponse> setIdpMetadata(SetIdpMetadataRequest request);

    CompletableFuture<SetOfficeSiteSsoStatusResponse> setOfficeSiteSsoStatus(SetOfficeSiteSsoStatusRequest request);

    CompletableFuture<SetUserProfilePathRulesResponse> setUserProfilePathRules(SetUserProfilePathRulesRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<StartDesktopsResponse> startDesktops(StartDesktopsRequest request);

    CompletableFuture<StartVirusScanTaskResponse> startVirusScanTask(StartVirusScanTaskRequest request);

    /**
      * The billing mode after you stop the cloud desktop.
      * *   StopCharging: Computing resources are not billed after you stop the cloud desktop. After the cloud desktop is stopped, the system automatically reclaims computing resources. From this point on, you are no longer charged for computing resources. However, you are still charged for storage resources.
      * *   KeepCharging: The billing continues after you stop the cloud desktop. After the cloud desktop is stopped, the system does not reclaim resources to avoid startup failures due to insufficient resources. You are still charged for the resources.
      * Default value: StopCharging
      *
     */
    CompletableFuture<StopDesktopsResponse> stopDesktops(StopDesktopsRequest request);

    /**
      * The ID of the execution.
      *
     */
    CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request);

    /**
      * The ID of the resource, which is the ID of the cloud desktop.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnlockVirtualMFADeviceResponse> unlockVirtualMFADevice(UnlockVirtualMFADeviceRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateFotaTaskResponse> updateFotaTask(UpdateFotaTaskRequest request);

    CompletableFuture<UploadImageResponse> uploadImage(UploadImageRequest request);

    CompletableFuture<VerifyCenResponse> verifyCen(VerifyCenRequest request);

    CompletableFuture<WakeupDesktopsResponse> wakeupDesktops(WakeupDesktopsRequest request);

}
