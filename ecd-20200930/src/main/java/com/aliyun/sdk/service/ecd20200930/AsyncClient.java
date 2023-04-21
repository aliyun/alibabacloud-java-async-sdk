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

    /**
      * To improve resource utilization, the system automatically locks a workspace of the convenience account type to release virtual private cloud (VPC) resources, and the workspace has been no longer used for a long time. If you want to continue using the locked workspace, you can call this operation to activate it. When you activate the locked workspace, the system recreates VPC resources based on the original configurations.
      *
     */
    CompletableFuture<ActivateOfficeSiteResponse> activateOfficeSite(ActivateOfficeSiteRequest request);

    /**
      * You can add only one device to a tenant.
      *
     */
    CompletableFuture<AddDevicesResponse> addDevices(AddDevicesRequest request);

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
      * ## Description
      * *   A Cloud Enterprise Network (CEN) instance is created.
      * *   A workspace of the convenience account type is created.
      * >  The secure office network of a workspace of the enterprise Active Directory (AD) account type is attached to a CEN instance when you create the workspace. The secure office network that corresponds to each workspace can be attached only to a single CEN instance.
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
      * AD directories are used to connect to enterprise AD systems and are suitable for large-scale desktop deployments. You are charged for AD directories that are used to connect to enterprise AD systems. For more information, see [Billing overview](~~188395~~).
      *
     */
    CompletableFuture<CreateADConnectorDirectoryResponse> createADConnectorDirectory(CreateADConnectorDirectoryRequest request);

    /**
      * - When you create a workspace of the enterprise Active Directory (AD) account type, AD connectors are automatically created for you to connect to enterprise AD systems. You are charged for the AD connectors. For more information, see [Billing overview](~~188395~~).
      * - After you call this operation to create the AD workspace, you must configure the AD domain. To configure the AD domain, perform the following operations:
      *     1. Configure the conditional forwarder in the Domain Name System (DNS) server.
      *     2. Configure the trust relationship in the AD domain server, and call the [ConfigADConnectorTrust](~~311258~~) operation to configure the trust relationship for the AD workspace.
      *     3. Call the [ListUserAdOrganizationUnits](~~311259~~) operation to obtain the organizational unit (OU) details of the AD domain. Then, call the [ConfigADConnectorUser](~~311262~~) operation to specify an OU and an administrator for the AD workspace.
      *     > If you specify the DomainUserName and DomainPassword parameters when you create the AD workspace, you need to configure only the conditional forwarder. If you do not specify the DomainUserName and DomainPassword parameters, you need to configure the conditional forwarder, trust relationship, and OU.
      * For more information, see [Create a workspace of the enterprise account type](~~214469~~).
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
      * ## Description
      * Desktop templates are categorized into system templates and custom templates. System templates are the templates provided by Alibaba Cloud. You can call this operation to create a custom template.
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

    /**
      * *   You can create a NAS file system for each standard workspace so that cloud desktops within the workspace can share files.
      * *   The system creates a General-purpose NAS file system and generates a default mount target. The storage types of the NAS file system includes Capacity type and Performance type. The Capacity type provides 10 PiB of storage while the Performance type provides only 1 PiB of storage.
      * *   NAS file systems are billed on a pay-as-you-go basis. You are charged based on the amount of used storage. You can also purchase resource plans to offset the storage fees of the NAS file systems.
      * For more information, see [Create a NAS file system](~~214481~~).
      *
     */
    CompletableFuture<CreateNASFileSystemResponse> createNASFileSystem(CreateNASFileSystemRequest request);

    CompletableFuture<CreateNetworkPackageResponse> createNetworkPackage(CreateNetworkPackageRequest request);

    /**
      * A policy is a set of security rules that are used to control security configurations when end users use cloud desktops. A policy contains basic features, such as USB redirection and watermarking, and other features, such as security group control. For more information, see [Policy overview](~~189345~~).
      *
     */
    CompletableFuture<CreatePolicyGroupResponse> createPolicyGroup(CreatePolicyGroupRequest request);

    /**
      * Before you create a RAM directory, make sure that you have completed the following operations:
      * *   You have created a virtual private cloud (VPC) by calling the [CreateVpc](~~35737~~) operation in a region where EDS is available.
      * *   You have created a vSwitch in the VPC by calling the [CreateVSwitch](~~35745~~) operation, and the vSwitch resides in a zone where EDS is available.
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
      * You cannot delete directories that are in use by cloud desktops.
      *
     */
    CompletableFuture<DeleteDirectoriesResponse> deleteDirectories(DeleteDirectoriesRequest request);

    /**
      * ## Description
      * *   Images include system images and custom images. System images cannot be deleted.
      * *   If an image to delete is used by a desktop bundle, call the [DeleteBundles](~~188885~~) operation to delete the desktop bundle.
      *
     */
    CompletableFuture<DeleteImagesResponse> deleteImages(DeleteImagesRequest request);

    /**
      * ## Description
      * Before you delete a NAS file system, make sure that the data you want to retain is backed up.
      * >  If a NAS file system is deleted, data stored in the NAS file system cannot be restored. Proceed with caution when you delete NAS file systems.
      *
     */
    CompletableFuture<DeleteNASFileSystemsResponse> deleteNASFileSystems(DeleteNASFileSystemsRequest request);

    CompletableFuture<DeleteNetworkPackagesResponse> deleteNetworkPackages(DeleteNetworkPackagesRequest request);

    /**
      * Before you delete a workspace, make sure that the following operations are complete:
      * *   All cloud desktops in the workspace are released.
      * *   The data that you want to retain is backed up.
      * >  After a workspace is deleted, its resources and data cannot be restored. Proceed with caution.
      *
     */
    CompletableFuture<DeleteOfficeSitesResponse> deleteOfficeSites(DeleteOfficeSitesRequest request);

    /**
      * *   System policies cannot be deleted.
      * *   Custom policies that are associated with cloud desktops cannot be deleted.
      *
     */
    CompletableFuture<DeletePolicyGroupsResponse> deletePolicyGroups(DeletePolicyGroupsRequest request);

    /**
      * If the IDs of the snapshots that you specify do not exist, requests are ignored.
      *
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
      * ## Description
      * If an MFA device is deleted, the device is unbound, reset, and disabled. When the Active Directory (AD) user wants to log on to the cloud desktop, the AD user must bind a new MFA device.
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
      * You can audit the operation logs of regular users to improve security. The operation logs record events such as desktop startup, shutdown, and session disconnection.
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

    /**
      * > You can query only the traffic data in the last 90 days.
      *
     */
    CompletableFuture<DescribeFlowStatisticResponse> describeFlowStatistic(DescribeFlowStatisticRequest request);

    CompletableFuture<DescribeFotaPendingDesktopsResponse> describeFotaPendingDesktops(DescribeFotaPendingDesktopsRequest request);

    CompletableFuture<DescribeFotaTasksResponse> describeFotaTasks(DescribeFotaTasksRequest request);

    /**
      * You can query the information about patches of up to 50 vulnerabilities in each request before you fix the current vulnerability.
      *
     */
    CompletableFuture<DescribeFrontVulPatchListResponse> describeFrontVulPatchList(DescribeFrontVulPatchListRequest request);

    /**
      * ## Description
      * After security protection is enabled, the system scans your cloud desktops for vulnerabilities once every day.
      *
     */
    CompletableFuture<DescribeGroupedVulResponse> describeGroupedVul(DescribeGroupedVulRequest request);

    /**
      * If you have changed the image for a cloud desktop, you can go to the Elastic Desktop Service (EDS) console to query the image change records. To query the image change records of a cloud desktop, find the cloud desktop that you want to manage, click **Change Image History** to the right of **Image ID/Name** on the **Basic Information** tab.
      *
     */
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
      * ## Description
      * When alerts are handled, the system quarantines the files that contain detected threats to the quarantine panel. You can call this operation to view the quarantined files.
      *
     */
    CompletableFuture<DescribeSuspEventQuaraFilesResponse> describeSuspEventQuaraFiles(DescribeSuspEventQuaraFilesRequest request);

    /**
      * An alert event consists of alerts and exceptions. Each alert event corresponds to multiple exceptions.
      *
     */
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

    /**
      * You can call the operation to export desktop groups and then save the desktop groups in the .xlsx file. The information about exported desktop groups includes: the desktop group ID and name, the workspace ID and name, the desktop template, the security policy name, the number of authorized users, the billing method, and the creation time.
      *
     */
    CompletableFuture<ExportDesktopGroupInfoResponse> exportDesktopGroupInfo(ExportDesktopGroupInfoRequest request);

    /**
      * The list of cloud desktops that are exported by calling the ExportDesktopListInfo operation is saved in a CSV file. The CSV file contains the information about each cloud desktop, including the IDs and names of cloud desktops, IDs and names of workspaces, IDs and names of desktop groups, vCPUs, memory, protocols, system disk capacity, data disk capacity, OSs, running status, current user, tags, IP addresses, billing methods, and creation time.
      *
     */
    CompletableFuture<ExportDesktopListInfoResponse> exportDesktopListInfo(ExportDesktopListInfoRequest request);

    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    CompletableFuture<GetDesktopGroupDetailResponse> getDesktopGroupDetail(GetDesktopGroupDetailRequest request);

    CompletableFuture<GetOfficeSiteSsoStatusResponse> getOfficeSiteSsoStatus(GetOfficeSiteSsoStatusRequest request);

    /**
      * ## Description
      * You can call this operation only for workspaces of the Active Directory (AD) and convenience account types. You cannot call this operation for RAM directories.
      *
     */
    CompletableFuture<GetSpMetadataResponse> getSpMetadata(GetSpMetadataRequest request);

    CompletableFuture<HandleSecurityEventsResponse> handleSecurityEvents(HandleSecurityEventsRequest request);

    CompletableFuture<ListCdsFilesResponse> listCdsFiles(ListCdsFilesRequest request);

    /**
      * If you use an AD directory to connect to an AD system of an enterprise, you can call this operation to obtain the information about users in the AD system.
      *
     */
    CompletableFuture<ListDirectoryUsersResponse> listDirectoryUsers(ListDirectoryUsersRequest request);

    CompletableFuture<ListFilePermissionResponse> listFilePermission(ListFilePermissionRequest request);

    CompletableFuture<ListOfficeSiteOverviewResponse> listOfficeSiteOverview(ListOfficeSiteOverviewRequest request);

    CompletableFuture<ListOfficeSiteUsersResponse> listOfficeSiteUsers(ListOfficeSiteUsersRequest request);

    /**
      * ## Description
      * You must specify at least one of the ResourceId.N, Tag.N.Key, and Tag.N.Value parameters in the request to specify the query objects.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListUserAdOrganizationUnitsResponse> listUserAdOrganizationUnits(ListUserAdOrganizationUnitsRequest request);

    /**
      * ## Description
      * After a virtual MFA device is locked, its status changes to LOCKED. The AD user who uses the virtual MFA device is unable to pass MFA and is therefore unable to log on to the client. You can call the [UnlockVirtualMFADevice](~~206212~~) operation to unlock the device.
      *
     */
    CompletableFuture<LockVirtualMFADeviceResponse> lockVirtualMFADevice(LockVirtualMFADeviceRequest request);

    CompletableFuture<MigrateDesktopsResponse> migrateDesktops(MigrateDesktopsRequest request);

    /**
      * This operation modifies only the domain name and Domain Name System (DNS) parameters of AD directories in the ERROR or REGISTERING state. DNS parameters include DomainName, SubDomainName, DnsAddress.N, and SubDomainDnsAddress.
      *
     */
    CompletableFuture<ModifyADConnectorDirectoryResponse> modifyADConnectorDirectory(ModifyADConnectorDirectoryRequest request);

    /**
      * This operation modifies the domain name and DNS parameters of workspaces that are of enterprise AD account type and in the Error or Registering state. DNS parameters include DomainName, SubDomainName, DnsAddress.N, and SubDomainDnsAddress.N.
      *
     */
    CompletableFuture<ModifyADConnectorOfficeSiteResponse> modifyADConnectorOfficeSite(ModifyADConnectorOfficeSiteRequest request);

    CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request);

    /**
      * ## Description
      * Only custom desktop templates can be modified.
      *
     */
    CompletableFuture<ModifyBundleResponse> modifyBundle(ModifyBundleRequest request);

    CompletableFuture<ModifyCdsFileResponse> modifyCdsFile(ModifyCdsFileRequest request);

    CompletableFuture<ModifyCdsFileShareLinkResponse> modifyCdsFileShareLink(ModifyCdsFileShareLinkRequest request);

    CompletableFuture<ModifyCloudDriveGroupsResponse> modifyCloudDriveGroups(ModifyCloudDriveGroupsRequest request);

    CompletableFuture<ModifyCloudDrivePermissionResponse> modifyCloudDrivePermission(ModifyCloudDrivePermissionRequest request);

    CompletableFuture<ModifyCustomizedListHeadersResponse> modifyCustomizedListHeaders(ModifyCustomizedListHeadersRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the billing methods of cloud desktops in Elastic Desktop Service (EDS). For more information, see [Billing overview](~~188395~~).
      * *   Before you call this operation, make sure that the cloud desktop that you want to manage is in the Running or Stopped state and no overdue payments of the cloud desktop are generated.
      * *   After the order payment is completed, the system starts to change the billing method of the cloud desktop. During the change, you cannot perform operations, such as starting or stopping the cloud desktop, and changing configurations of the cloud desktop.<props="china"> 
      * After you change the billing method of the cloud desktop from subscription to pay-as-you-go, you may get a refund. For more information, see [Change a subscription cloud desktop to a pay-as-you-go one](https://help.aliyun.com/document_detail/439964.html).
      * </props>
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
      * ## Description
      * You can only change the hostname of a Windows cloud desktop in the workspace of the enterprise Active Directory (AD) account type. After the hostname is changed, the cloud desktop is recreated.
      *
     */
    CompletableFuture<ModifyDesktopHostNameResponse> modifyDesktopHostName(ModifyDesktopHostNameRequest request);

    CompletableFuture<ModifyDesktopNameResponse> modifyDesktopName(ModifyDesktopNameRequest request);

    /**
      * You can call this operation to change the configurations, such as the desktop type and disk size, of a cloud desktop.
      * *   Before you call this operation, take note of the cloud desktop types and the disk sizes for each type of cloud desktop that Elastic Desktop Service (EDS) provides. For more information, see [Cloud desktop types](~~188609~~).
      * *   When you change the configurations of a cloud desktop, you must change the desktop type or the size of the system disk or data disk. You must configure at least one of the following parameters: DesktopType, RootDiskSizeGib, and UserDiskSizeGib. You must take note of the following items:
      *     *   Each desktop type contains different desktop specifications, such as vCPUs, memory, and GPUs. When you change the desktop configurations, you can only change the desktop type from one to another. However, you cannot change only one of the specifications, such as vCPUs, memory, and GPUs.
      *     *   You cannot change a cloud desktop from the General Office type to a non-General Office type, or from a non-General Office type to the General Office type. You cannot change a cloud desktop from the Graphics type to a non-Graphics type, or from a non-Graphics type to the Graphics type.
      *     *   You can only increase the sizes of system and data disks.
      *     *   If your cloud desktop uses the subscription billing method, the price difference is calculated based on the price before and after configuration changes. You may receive a refund, or pay for the price difference.
      *     *   If you want to change the configurations of your cloud desktop for multiple times, we recommend that you wait at least 5 minutes the next time you change the configurations of the same cloud desktop.
      *     *   The cloud desktop for which you want to change configurations must be in the Stopped state.
      * *   The changes do not affect your personal data on the cloud desktop.
      *
     */
    CompletableFuture<ModifyDesktopSpecResponse> modifyDesktopSpec(ModifyDesktopSpecRequest request);

    /**
      * The cloud desktops whose policy you want to modify must be in the Running state.
      *
     */
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
      * The cloud desktop must be in the Running state.
      *
     */
    CompletableFuture<ModifyEntitlementResponse> modifyEntitlement(ModifyEntitlementRequest request);

    /**
      * ## Description
      * You can call this operation to modify the properties of only custom images in the Available (Available) state.
      *
     */
    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    /**
      * ### Security of shared images
      * Elastic Desktop Service (EDS) does not ensure the integrity and security of shared images on cloud desktops. Before you use shared images, make sure that the images come from trusted accounts. You must assume all risks.
      * ### Quotas and billing
      * *   Shared images do not count against the image quotas of the recipient Alibaba Cloud accounts.
      * *   Alibaba Cloud accounts that share images are not charged if the recipient accounts use the shared images to create cloud desktops.
      * *   There are no additional charges for sharing an image.
      * ### Supported sharing behavior
      * *   You can share custom images with other Alibaba Cloud accounts.
      * *   You can share custom images between accounts in the China site (aliyun.com) and the international site (alibabacloud.com).
      * ### Unsupported sharing behavior
      * *   You cannot share images that are shared by other Alibaba Cloud accounts.
      * *   You cannot share encrypted images.
      * *   You cannot share images across regions. If you want to share images across regions, you can call the CopyImage operation to copy the images from the source region to the destination region.
      *
     */
    CompletableFuture<ModifyImagePermissionResponse> modifyImagePermission(ModifyImagePermissionRequest request);

    /**
      * ## Description
      * When you create a NAS file system, a mount target is automatically generated. By default, the mount target does not need to be changed. If the mount target is accidentally deleted, you must specify a new mount target for the NAS file system in the workspace. You can call the [CreateMountTarget](~~62621~~) operation to create a mount target.
      *
     */
    CompletableFuture<ModifyNASDefaultMountTargetResponse> modifyNASDefaultMountTarget(ModifyNASDefaultMountTargetRequest request);

    CompletableFuture<ModifyNetworkPackageBandwidthResponse> modifyNetworkPackageBandwidth(ModifyNetworkPackageBandwidthRequest request);

    /**
      * ## Description
      * If you want to temporarily disable Internet access for a cloud desktop, you can disable the Internet access package. You can restore the package based on your requirements.
      *
     */
    CompletableFuture<ModifyNetworkPackageEnabledResponse> modifyNetworkPackageEnabled(ModifyNetworkPackageEnabledRequest request);

    CompletableFuture<ModifyOfficeSiteAttributeResponse> modifyOfficeSiteAttribute(ModifyOfficeSiteAttributeRequest request);

    CompletableFuture<ModifyOfficeSiteCrossDesktopAccessResponse> modifyOfficeSiteCrossDesktopAccess(ModifyOfficeSiteCrossDesktopAccessRequest request);

    CompletableFuture<ModifyOfficeSiteMfaEnabledResponse> modifyOfficeSiteMfaEnabled(ModifyOfficeSiteMfaEnabledRequest request);

    CompletableFuture<ModifyOperateVulResponse> modifyOperateVul(ModifyOperateVulRequest request);

    CompletableFuture<ModifyPolicyGroupResponse> modifyPolicyGroup(ModifyPolicyGroupRequest request);

    /**
      * You can modify permissions for regular users on cloud desktops that are only in the Running state.
      *
     */
    CompletableFuture<ModifyUserEntitlementResponse> modifyUserEntitlement(ModifyUserEntitlementRequest request);

    CompletableFuture<ModifyUserToDesktopGroupResponse> modifyUserToDesktopGroup(ModifyUserToDesktopGroupRequest request);

    CompletableFuture<MoveCdsFileResponse> moveCdsFile(MoveCdsFileRequest request);

    CompletableFuture<OperateVulsResponse> operateVuls(OperateVulsRequest request);

    /**
      * The cloud desktops that you want to restart by calling this operation must be in the Running state.
      *
     */
    CompletableFuture<RebootDesktopsResponse> rebootDesktops(RebootDesktopsRequest request);

    /**
      * Before you change the image of a cloud desktop, take note of the following limits:
      * - You can select the OS of an image during image change. However, this operation is unavailable in the following regions: China (Hong Kong), Australia (Sydney), Singapore (Singapore), and Japan (Tokyo).
      * - Image change between GPU and non-GPU images is not supported. If a cloud desktop is of the Graphics type, you can use only a GPU image. If the cloud desktop is of a non-Graphics type, you can use only a non-GPU image.
      * After you change the image of the cloud desktop, the system uses the new image to initialize the system disk of the cloud desktop. Take note of the following impacts:
      * - The system deletes data from the original system disk. The snapshots that are created from the original system disk of the cloud desktop become unavailable and are automatically deleted.
      * - If you change the OS of the image, the system deletes data from the original data disk of the cloud desktop. The system also deletes snapshots that are created from the original data disk of the cloud desktop because original snapshots become unavailable. If you do not change the OS of the image, data on the original data disk is retained, and snapshots that are created from the data disk are still available.
      *
     */
    CompletableFuture<RebuildDesktopsResponse> rebuildDesktops(RebuildDesktopsRequest request);

    CompletableFuture<RemoveFilePermissionResponse> removeFilePermission(RemoveFilePermissionRequest request);

    CompletableFuture<RemoveUserFromDesktopGroupResponse> removeUserFromDesktopGroup(RemoveUserFromDesktopGroupRequest request);

    CompletableFuture<RenewDesktopsResponse> renewDesktops(RenewDesktopsRequest request);

    CompletableFuture<RenewNetworkPackagesResponse> renewNetworkPackages(RenewNetworkPackagesRequest request);

    CompletableFuture<ResetDesktopsResponse> resetDesktops(ResetDesktopsRequest request);

    /**
      * ## Description
      * When you create a NAS file system, a mount target is automatically generated. By default, you do not need to modify the mount target of the NAS file system. If the mount target is disabled, you need to reset the mount target of the NAS file system.
      *
     */
    CompletableFuture<ResetNASDefaultMountTargetResponse> resetNASDefaultMountTarget(ResetNASDefaultMountTargetRequest request);

    /**
      * Before you call this operation, make sure that the following operations are performed:
      * *   The data that you want to retain in the disk is backed up.
      *     **
      *     **Note**The disk restoration operation is irreversible. After you restore data on a disk, the disk is restored to the status at the point in time when the snapshot was created. Data that is generated between the snapshot creation time and the current time is lost. Before you restore a disk from a snapshot, make sure that you back up important data.
      * *   The cloud desktop whose disk you want to restore is stopped.
      *
     */
    CompletableFuture<ResetSnapshotResponse> resetSnapshot(ResetSnapshotRequest request);

    CompletableFuture<RevokeCoordinatePrivilegeResponse> revokeCoordinatePrivilege(RevokeCoordinatePrivilegeRequest request);

    /**
      * ## Description
      * When alerts are handled, the system quarantines the files that contain detected threats to the quarantine panel. You can call this operation to remove quarantined files from the quarantine panel.
      *
     */
    CompletableFuture<RollbackSuspEventQuaraFileResponse> rollbackSuspEventQuaraFile(RollbackSuspEventQuaraFileRequest request);

    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
      * ## Description
      * When you attach your workspace network to a Cloud Enterprise Network (CEN) instance in another Alibaba Cloud account, you need to call this operation to obtain a verification code. After the call is successful, the system sends a verification code to the email address associated with the Alibaba Cloud account.
      *
     */
    CompletableFuture<SendVerifyCodeResponse> sendVerifyCode(SendVerifyCodeRequest request);

    CompletableFuture<SetDesktopGroupScaleTimerResponse> setDesktopGroupScaleTimer(SetDesktopGroupScaleTimerRequest request);

    CompletableFuture<SetDesktopGroupTimerResponse> setDesktopGroupTimer(SetDesktopGroupTimerRequest request);

    CompletableFuture<SetDesktopGroupTimerStatusResponse> setDesktopGroupTimerStatus(SetDesktopGroupTimerStatusRequest request);

    CompletableFuture<SetDirectorySsoStatusResponse> setDirectorySsoStatus(SetDirectorySsoStatusRequest request);

    /**
      * ## Description
      * You can call this operation only for workspaces of the Active Directory (AD) and convenience account types. You cannot call this operation for RAM directories.
      *
     */
    CompletableFuture<SetIdpMetadataResponse> setIdpMetadata(SetIdpMetadataRequest request);

    CompletableFuture<SetOfficeSiteSsoStatusResponse> setOfficeSiteSsoStatus(SetOfficeSiteSsoStatusRequest request);

    CompletableFuture<SetUserProfilePathRulesResponse> setUserProfilePathRules(SetUserProfilePathRulesRequest request);

    /**
      * The cloud desktop to be started must be in the Stopped (Stopped) state.
      *
     */
    CompletableFuture<StartDesktopsResponse> startDesktops(StartDesktopsRequest request);

    /**
      * When you call this operation, you must specify a workspace or a cloud desktop by specifying the OfficeSiteId or DesktopId parameter.
      * > When you specify a workspace, all cloud desktops within the workspace are scanned.
      *
     */
    CompletableFuture<StartVirusScanTaskResponse> startVirusScanTask(StartVirusScanTaskRequest request);

    /**
      * The cloud desktop must be in the Running state.
      *
     */
    CompletableFuture<StopDesktopsResponse> stopDesktops(StopDesktopsRequest request);

    /**
      * When you stop a one-time execution of a command, the command continues to run on the cloud desktops where it has started to run, and will not run on the cloud desktops where it has not started to run.
      *
     */
    CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request);

    /**
      * If TagKey is specified, the new TagValue value overrides the original TagValue value.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnlockVirtualMFADeviceResponse> unlockVirtualMFADevice(UnlockVirtualMFADeviceRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateFotaTaskResponse> updateFotaTask(UpdateFotaTaskRequest request);

    CompletableFuture<UploadImageResponse> uploadImage(UploadImageRequest request);

    CompletableFuture<VerifyCenResponse> verifyCen(VerifyCenRequest request);

}
