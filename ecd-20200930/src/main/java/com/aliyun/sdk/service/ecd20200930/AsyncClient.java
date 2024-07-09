// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecd20200930.models.*;
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
      * If you do not create any cloud computer in a convenience office network within 15 days, the office network is automatically locked and virtual private cloud (VPC) resources are released. If you want to resume the office network, you can call this operation to unlock the office network.
      *
     */
    CompletableFuture<ActivateOfficeSiteResponse> activateOfficeSite(ActivateOfficeSiteRequest request);

    CompletableFuture<AddDesktopOversoldUserGroupResponse> addDesktopOversoldUserGroup(AddDesktopOversoldUserGroupRequest request);

    /**
      * Each device can be registered in only one Alibaba Cloud account. If you register a device that has been registered in another Alibaba Cloud account, an error is reported.
      *
     */
    CompletableFuture<AddDevicesResponse> addDevices(AddDevicesRequest request);

    /**
      * You can call this operation to share a specific folder with other users. You can also configure the folder permissions.
      *
     */
    CompletableFuture<AddFilePermissionResponse> addFilePermission(AddFilePermissionRequest request);

    CompletableFuture<AddUserToDesktopGroupResponse> addUserToDesktopGroup(AddUserToDesktopGroupRequest request);

    CompletableFuture<AddUserToDesktopOversoldUserGroupResponse> addUserToDesktopOversoldUserGroup(AddUserToDesktopOversoldUserGroupRequest request);

    /**
      * You can also associate an automatic snapshot policy with a cloud desktop in the Elastic Desktop Service (EDS) console. To do so, perform the following steps: 1. Log on to the EDS console. 2. Choose Desktops and Groups > Desktops in the left-side navigation pane. 3. Find the cloud desktop that you want to manage on the Cloud Desktops page and choose More > Change Automatic Snapshot Policy in the Actions column. 4. Configure a policy for the cloud desktop as prompted in the Change Automatic Snapshot Policy panel.
      * After you associate an automatic snapshot policy with the cloud desktop, the system creates snapshots for the cloud desktop based on the policy.
      *
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    CompletableFuture<ApplyCoordinatePrivilegeResponse> applyCoordinatePrivilege(ApplyCoordinatePrivilegeRequest request);

    CompletableFuture<ApplyCoordinationForMonitoringResponse> applyCoordinationForMonitoring(ApplyCoordinationForMonitoringRequest request);

    /**
      * The cloud computers for which you want to allow image updates must be in the Running state.
      *
     */
    CompletableFuture<ApproveFotaUpdateResponse> approveFotaUpdate(ApproveFotaUpdateRequest request);

    CompletableFuture<AssociateNetworkPackageResponse> associateNetworkPackage(AssociateNetworkPackageRequest request);

    /**
      * Prerequisites
      * *   A CEN instance is created.
      * *   The office network is an advanced office network, and the account system type is convenient account.
      * >  The office network is added to the CEN instance when you create the instance. An office network can be added to only one CEN instance.
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
      * An AD directory is used to connect to an enterprise\\"s existing Active Directory and is suitable for large-scale cloud computer deployment. You are charged directory fees when you connect your AD to cloud computers. For more information, see [Billing overview](~~188395~~).
      *
     */
    CompletableFuture<CreateADConnectorDirectoryResponse> createADConnectorDirectory(CreateADConnectorDirectoryRequest request);

    /**
      * When you create an enterprise AD office network, the system automatically creates an AD connector to connect to an enterprise AD. You are charged for the AD connector. For more information, see [Billing overview](~~188395~~).
      * After you call this operation to create an AD office network, you must perform the following steps to complete AD domain setting:
      * 1.  Configure a conditional forwarder in a Domain Name System (DNS) server.
      * 2.  Configure a trust relationship in an AD domain controller and call the [ConfigADConnectorTrust](~~311258~~) operation to configure the trust relationship with the AD office network.
      * 3.  Call the [ListUserAdOrganizationUnits](~~311259~~) operation to query a list of organizational units (OUs) of the AD domain, and call the [ConfigADConnectorUser](~~311262~~) operation to specify an OU and administrator for the AD office network.
      *     >  When you create the AD office network, take note of the DomainUserName and DomainPassword parameters. If you specify the parameters, you need to only configure a conditional forwarder. If you do not specify the parameters, you must configure a conditional forwarder, trust relationship, and OU as prompted.
      * For more information, see [Create and manage enterprise AD office networks](~~214469~~).
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
      * Cloud computer templates include system templates and custom templates. A system template is the default template provided by Alibaba Cloud. You can call this operation to create a custom template.
      *
     */
    CompletableFuture<CreateBundleResponse> createBundle(CreateBundleRequest request);

    /**
      * After the RAM permissions are authenticated, you can call the CreateCdsFile operation to obtain the upload URL of a file and upload the file to a cloud disk.
      *
     */
    CompletableFuture<CreateCdsFileResponse> createCdsFile(CreateCdsFileRequest request);

    CompletableFuture<CreateCdsFileShareLinkResponse> createCdsFileShareLink(CreateCdsFileShareLinkRequest request);

    CompletableFuture<CreateCloudDriveServiceResponse> createCloudDriveService(CreateCloudDriveServiceRequest request);

    CompletableFuture<CreateCloudDriveUsersResponse> createCloudDriveUsers(CreateCloudDriveUsersRequest request);

    /**
      * Before you call this operation to create a desktop group, make sure that the following operations are complete:
      * *   You are familiar with the features, usage limits, and scaling policies of desktop groups. For more information, see [Overview](~~290959~~) of desktop groups.
      * *   Resources, such as workspaces, users, desktop templates, and policies, are created.
      *
     */
    CompletableFuture<CreateDesktopGroupResponse> createDesktopGroup(CreateDesktopGroupRequest request);

    CompletableFuture<CreateDesktopOversoldGroupResponse> createDesktopOversoldGroup(CreateDesktopOversoldGroupRequest request);

    /**
      * Before you create cloud computers, complete the following preparations:
      * *   An office network (formerly called workspace) and users are created. For more information, see:
      *     *   Convenience office network: [CreateSimpleOfficeSite](~~215416~~) and [CreateUsers](~~437832~~).
      *     *   Active Directory (AD) office network: [CreateADConnectorOfficeSite](~~215417~~) and [Create an AD user](~~188619~~).
      * *   Make sure a cloud computer template exists. If no cloud computer template exists, call the [CreateBundle](~~188883~~) operation to create a template.
      * *   Make sure a policy exists. If no policy exists, call the [CreatePolicyGroup](~~188889~~) operation to create a policy.
      * If you want the cloud computers to automatically execute a custom command script, you can use the `UserCommands` field to configure a custom command.
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
      * Before you create a RAM directory, complete the following preparations:
      * *   Call the `CreateVpc` operation to create a virtual private cloud (VPC) in a region supported by Elastic Desktop Service.
      * *   Call the `CreateVSwitch` operation to create a vSwitch in the VPC. The vSwitch is in a zone that is supported by Elastic Desktop Service. You can call the [DescribeZones](~~196648~~) operation to obtain the most recent zone list for a region supported by Elastic Desktop Service
      *
     */
    CompletableFuture<CreateRAMDirectoryResponse> createRAMDirectory(CreateRAMDirectoryRequest request);

    CompletableFuture<CreateSimpleOfficeSiteResponse> createSimpleOfficeSite(CreateSimpleOfficeSiteRequest request);

    /**
      * The cloud computer must be in the **Running** or **Stopped** state.
      *
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request);

    CompletableFuture<DeleteBundlesResponse> deleteBundles(DeleteBundlesRequest request);

    CompletableFuture<DeleteCdsFileResponse> deleteCdsFile(DeleteCdsFileRequest request);

    CompletableFuture<DeleteCloudDriveGroupsResponse> deleteCloudDriveGroups(DeleteCloudDriveGroupsRequest request);

    CompletableFuture<DeleteCloudDriveUsersResponse> deleteCloudDriveUsers(DeleteCloudDriveUsersRequest request);

    /**
      * *   Before you delete a desktop group, make sure that cloud desktops in the desktop group are not connected and no users are authorized to use the cloud desktops.
      * *   You cannot delete a subscription desktop group when cloud desktops in the group are in valid period.
      * *   If you delete a pay-as-you-go desktop group, cloud desktops in the group are deleted.
      *
     */
    CompletableFuture<DeleteDesktopGroupResponse> deleteDesktopGroup(DeleteDesktopGroupRequest request);

    CompletableFuture<DeleteDesktopsResponse> deleteDesktops(DeleteDesktopsRequest request);

    /**
      * You can call the operation to manage client devices.
      *
     */
    CompletableFuture<DeleteDevicesResponse> deleteDevices(DeleteDevicesRequest request);

    /**
      * You cannot delete a directory that has a cloud computer or is used by a cloud computer.
      *
     */
    CompletableFuture<DeleteDirectoriesResponse> deleteDirectories(DeleteDirectoriesRequest request);

    CompletableFuture<DeleteEduRoomResponse> deleteEduRoom(DeleteEduRoomRequest request);

    /**
      * *   Images include system images and custom images. System images cannot be deleted.
      * *   If an image that you want to delete is referenced by a cloud computer template, call the [DeleteBundles](~~436972~~) operation to delete the cloud computer template before you delete the image.
      *
     */
    CompletableFuture<DeleteImagesResponse> deleteImages(DeleteImagesRequest request);

    /**
      * Before you delete an Apsara File Storage NAS (NAS) file system, make sure that the data you want to retain is backed up.
      * ><warning>If a NAS file system is deleted, data stored in the NAS file system cannot be restored. Proceed with caution when you delete NAS file systems.></warning>
      *
     */
    CompletableFuture<DeleteNASFileSystemsResponse> deleteNASFileSystems(DeleteNASFileSystemsRequest request);

    CompletableFuture<DeleteNetworkPackagesResponse> deleteNetworkPackages(DeleteNetworkPackagesRequest request);

    /**
      * Before you delete an office network, make sure that the following operations are complete:
      * *   All cloud computers in the office network are released.
      * *   The data that you want to retain is backed up.
      * >  Resources and data on cloud computers in an office network cannot be restored after you delete it. Proceed with caution.
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
      * If an MFA device is deleted, the device is unbound, reset, and disabled. When an Active Directory (AD) user wants to connect to the cloud desktop that is bound to the MFA device, the AD user must bind a new MFA device.
      *
     */
    CompletableFuture<DeleteVirtualMFADeviceResponse> deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request);

    CompletableFuture<DescribeAclEntriesResponse> describeAclEntries(DescribeAclEntriesRequest request);

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

    CompletableFuture<DescribeCloudDriveUsersResponse> describeCloudDriveUsers(DescribeCloudDriveUsersRequest request);

    CompletableFuture<DescribeCustomizedListHeadersResponse> describeCustomizedListHeaders(DescribeCustomizedListHeadersRequest request);

    CompletableFuture<DescribeDesktopGroupSessionsResponse> describeDesktopGroupSessions(DescribeDesktopGroupSessionsRequest request);

    CompletableFuture<DescribeDesktopGroupsResponse> describeDesktopGroups(DescribeDesktopGroupsRequest request);

    CompletableFuture<DescribeDesktopInfoResponse> describeDesktopInfo(DescribeDesktopInfoRequest request);

    CompletableFuture<DescribeDesktopOversoldGroupResponse> describeDesktopOversoldGroup(DescribeDesktopOversoldGroupRequest request);

    CompletableFuture<DescribeDesktopOversoldUserResponse> describeDesktopOversoldUser(DescribeDesktopOversoldUserRequest request);

    CompletableFuture<DescribeDesktopOversoldUserGroupResponse> describeDesktopOversoldUserGroup(DescribeDesktopOversoldUserGroupRequest request);

    /**
      * You can only query data within the last 30 days.
      *
     */
    CompletableFuture<DescribeDesktopSessionsResponse> describeDesktopSessions(DescribeDesktopSessionsRequest request);

    /**
      * When no values are specified for the `InstanceTypeFamily` and `DesktopTypeId` parameters for a cloud desktop, all types of cloud desktops are queried.
      *
     */
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

    CompletableFuture<DescribeGuestApplicationsResponse> describeGuestApplications(DescribeGuestApplicationsRequest request);

    CompletableFuture<DescribeImageModifiedRecordsResponse> describeImageModifiedRecords(DescribeImageModifiedRecordsRequest request);

    /**
      * You can call the [ModifyImagePermission](~~436982~~) operation to share an image with another cloud computer user or unshare an image. You can call the DescribeImagePermission operation to obtain the Alibaba Cloud accounts with which the current image is shared.
      *
     */
    CompletableFuture<DescribeImagePermissionResponse> describeImagePermission(DescribeImagePermissionRequest request);

    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    /**
      * *   After you run a command, it may not succeed. You can call this operation to query the execution result.
      * *   You can query the information about execution in the last two weeks. A maximum of 100,000 lines of execution information can be retained.
      *
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    CompletableFuture<DescribeKmsKeysResponse> describeKmsKeys(DescribeKmsKeysRequest request);

    CompletableFuture<DescribeNASFileSystemsResponse> describeNASFileSystems(DescribeNASFileSystemsRequest request);

    CompletableFuture<DescribeNetworkPackagesResponse> describeNetworkPackages(DescribeNetworkPackagesRequest request);

    CompletableFuture<DescribeOfficeSitesResponse> describeOfficeSites(DescribeOfficeSitesRequest request);

    CompletableFuture<DescribePolicyGroupsResponse> describePolicyGroups(DescribePolicyGroupsRequest request);

    /**
      * ## Usage notes
      * The request parameters vary based on the type of desktop resources whose price you want to query. Take note of the following items:
      * *   If you set ResourceType to OfficeSite, you must specify InstanceType.
      * *   If you set ResourceType to Bandwidth, the pay-by-data-transfer metering method is used for network billing.
      * *   If you set ResourceType to Desktop, you must specify InstanceType, RootDiskSizeGib, and UserDiskSizeGib. You can specify OsType, PeriodUnit, Period, and Amount based on your business requirements.
      * > Before you call this operation to query the prices of cloud desktops by setting ResourceType to Desktop, you must know the desktop types and disk sizes that EDS provides. The disk sizes vary based on the desktop types. For more information, see [Cloud desktop types](~~188609~~).
      *
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    CompletableFuture<DescribePriceForCreateDesktopOversoldGroupResponse> describePriceForCreateDesktopOversoldGroup(DescribePriceForCreateDesktopOversoldGroupRequest request);

    CompletableFuture<DescribePriceForModifyDesktopOversoldGroupSaleResponse> describePriceForModifyDesktopOversoldGroupSale(DescribePriceForModifyDesktopOversoldGroupSaleRequest request);

    CompletableFuture<DescribePriceForRenewDesktopOversoldGroupResponse> describePriceForRenewDesktopOversoldGroup(DescribePriceForRenewDesktopOversoldGroupRequest request);

    CompletableFuture<DescribeRecordingsResponse> describeRecordings(DescribeRecordingsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * *   This is a central operation and can be called only by using services in the China (Shanghai) region.
      * *   You can query session statistics for the past hour.
      *
     */
    CompletableFuture<DescribeSessionStatisticResponse> describeSessionStatistic(DescribeSessionStatisticRequest request);

    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    CompletableFuture<DescribeUserConnectTimeResponse> describeUserConnectTime(DescribeUserConnectTimeRequest request);

    CompletableFuture<DescribeUserConnectionRecordsResponse> describeUserConnectionRecords(DescribeUserConnectionRecordsRequest request);

    CompletableFuture<DescribeUserProfilePathRulesResponse> describeUserProfilePathRules(DescribeUserProfilePathRulesRequest request);

    CompletableFuture<DescribeUsersInGroupResponse> describeUsersInGroup(DescribeUsersInGroupRequest request);

    CompletableFuture<DescribeUsersPasswordResponse> describeUsersPassword(DescribeUsersPasswordRequest request);

    CompletableFuture<DescribeVirtualMFADevicesResponse> describeVirtualMFADevices(DescribeVirtualMFADevicesRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<DetachCenResponse> detachCen(DetachCenRequest request);

    CompletableFuture<DetachEndUserResponse> detachEndUser(DetachEndUserRequest request);

    CompletableFuture<DisableDesktopsInGroupResponse> disableDesktopsInGroup(DisableDesktopsInGroupRequest request);

    CompletableFuture<DisconnectDesktopSessionsResponse> disconnectDesktopSessions(DisconnectDesktopSessionsRequest request);

    CompletableFuture<DissociateNetworkPackageResponse> dissociateNetworkPackage(DissociateNetworkPackageRequest request);

    CompletableFuture<ExportClientEventsResponse> exportClientEvents(ExportClientEventsRequest request);

    CompletableFuture<ExportDesktopGroupInfoResponse> exportDesktopGroupInfo(ExportDesktopGroupInfoRequest request);

    /**
      * The cloud computer list exported by calling this operation is saved as a CSV file. Each entry of data of a cloud computer includes the following fields:
      * *   Cloud computer ID and name
      * *   Office network ID and name
      * *   The instance type, OS and protocol of the cloud computer
      * *   System disk and data disk of the cloud computer
      * *   The status
      * *   Purchase method
      * *   The time when the cloud computer expires
      * *   Remaining duration and total duration
      * *   Number of assigned users and number of current users
      * *   Office network type
      * *   The time when the cloud computer was created
      * *   Tags
      * *   Encryption status
      * *   IP
      * *   The hostname
      *
     */
    CompletableFuture<ExportDesktopListInfoResponse> exportDesktopListInfo(ExportDesktopListInfoRequest request);

    CompletableFuture<GetAsyncTaskResponse> getAsyncTask(GetAsyncTaskRequest request);

    /**
      * The cloud computer must be in the Running state.
      *
     */
    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    CompletableFuture<GetCoordinateTicketResponse> getCoordinateTicket(GetCoordinateTicketRequest request);

    CompletableFuture<GetDesktopGroupDetailResponse> getDesktopGroupDetail(GetDesktopGroupDetailRequest request);

    CompletableFuture<GetOfficeSiteSsoStatusResponse> getOfficeSiteSsoStatus(GetOfficeSiteSsoStatusRequest request);

    /**
      * You can call this operation only for workspaces of the Active Directory (AD) and convenience account types.
      *
     */
    CompletableFuture<GetSpMetadataResponse> getSpMetadata(GetSpMetadataRequest request);

    /**
      * Hibernating a cloud desktop is in private preview. If you want to try this feature, submit a ticket.
      *
     */
    CompletableFuture<HibernateDesktopsResponse> hibernateDesktops(HibernateDesktopsRequest request);

    CompletableFuture<ListCdsFilesResponse> listCdsFiles(ListCdsFilesRequest request);

    /**
      * If you use an AD directory to connect to an AD system, you can call this operation to obtain the user information in the AD system.
      *
     */
    CompletableFuture<ListDirectoryUsersResponse> listDirectoryUsers(ListDirectoryUsersRequest request);

    CompletableFuture<ListFilePermissionResponse> listFilePermission(ListFilePermissionRequest request);

    CompletableFuture<ListOfficeSiteOverviewResponse> listOfficeSiteOverview(ListOfficeSiteOverviewRequest request);

    CompletableFuture<ListOfficeSiteUsersResponse> listOfficeSiteUsers(ListOfficeSiteUsersRequest request);

    /**
      * You must use at least one of the following parameters in the request to determine the object that you want to query: `ResourceId.N`, `Tag.N.Key`, and `Tag.N.Value`.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListUserAdOrganizationUnitsResponse> listUserAdOrganizationUnits(ListUserAdOrganizationUnitsRequest request);

    /**
      * After a virtual MFA device is locked, its status changes to LOCKED. The Active Directory (AD) user who uses the virtual MFA device is unable to pass MFA and is therefore unable to log on to the client. You can call the [UnlockVirtualMFADevice](~~206212~~) operation to unlock the device.
      *
     */
    CompletableFuture<LockVirtualMFADeviceResponse> lockVirtualMFADevice(LockVirtualMFADeviceRequest request);

    CompletableFuture<MigrateDesktopsResponse> migrateDesktops(MigrateDesktopsRequest request);

    CompletableFuture<MigrateImageProtocolResponse> migrateImageProtocol(MigrateImageProtocolRequest request);

    /**
      * You can modify the following domain name- and Domain Name System (DNS)-related parameters only for Active Directory (AD) directories that are in the ERROR or REGISTERING state: `DomainName`, `SubDomainName`, `DnsAddress.N`, and `SubDomainDnsAddress`.
      *
     */
    CompletableFuture<ModifyADConnectorDirectoryResponse> modifyADConnectorDirectory(ModifyADConnectorDirectoryRequest request);

    /**
      * You can modify parameters of domain names and Domain Name System (DNS) for enterprise AD office networks that are in the `ERROR` or `REGISTERED` state. The parameters include `DomainName`, `SubDomainName`, `DnsAddress.N`, and `SubDomainDnsAddress.N`.
      *
     */
    CompletableFuture<ModifyADConnectorOfficeSiteResponse> modifyADConnectorOfficeSite(ModifyADConnectorOfficeSiteRequest request);

    /**
      * You can set different Internet access control policies at different granularities to achieve the effect of composite policies. For example, you can disable the Internet access on the office network granularity and enable the Internet access on specific cloud computer granularity. The effect is that all cloud computers in the office network except the specified cloud computers are not allowed to access the Internet.
      *
     */
    CompletableFuture<ModifyAclEntriesResponse> modifyAclEntries(ModifyAclEntriesRequest request);

    CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request);

    /**
      * Only custom desktop templates can be modified.
      *
     */
    CompletableFuture<ModifyBundleResponse> modifyBundle(ModifyBundleRequest request);

    CompletableFuture<ModifyCdsFileResponse> modifyCdsFile(ModifyCdsFileRequest request);

    CompletableFuture<ModifyCdsFileShareLinkResponse> modifyCdsFileShareLink(ModifyCdsFileShareLinkRequest request);

    CompletableFuture<ModifyCloudDriveGroupsResponse> modifyCloudDriveGroups(ModifyCloudDriveGroupsRequest request);

    CompletableFuture<ModifyCloudDrivePermissionResponse> modifyCloudDrivePermission(ModifyCloudDrivePermissionRequest request);

    CompletableFuture<ModifyCloudDriveUsersResponse> modifyCloudDriveUsers(ModifyCloudDriveUsersRequest request);

    CompletableFuture<ModifyCustomizedListHeadersResponse> modifyCustomizedListHeaders(ModifyCustomizedListHeadersRequest request);

    /**
      * *   Before you call this operation, make sure that you fully understand the billing methods of cloud computers. For more information, see [Billing overview](~~188395~~).
      * *   Before you call this operation, make sure that the cloud computers whose billing method you want to change are in the Running or Stopped state and you have no overdue payments in your Alibaba Cloud account.
      * *   After the order payment is completed, the system starts to change the billing method of the cloud computers. During the change, you cannot perform operations, such as starting or stopping the cloud computers, and changing configurations of the cloud computers.
      *
     */
    CompletableFuture<ModifyDesktopChargeTypeResponse> modifyDesktopChargeType(ModifyDesktopChargeTypeRequest request);

    /**
      * After a cloud computer pool is created, the system creates a specific number of cloud computers in the pool based on the auto scaling policy and user connections. Cloud computers are created by using the same cloud computer template and security policy. You can modify the configurations of the pool, including the pool name, cloud computer template, and policy, in different business scenarios.
      *
     */
    CompletableFuture<ModifyDesktopGroupResponse> modifyDesktopGroup(ModifyDesktopGroupRequest request);

    /**
      * The Windows cloud computer whose hostname you want to modify must be in an AD office network. After the hostname is modified, the cloud computer is re-created.
      *
     */
    CompletableFuture<ModifyDesktopHostNameResponse> modifyDesktopHostName(ModifyDesktopHostNameRequest request);

    CompletableFuture<ModifyDesktopNameResponse> modifyDesktopName(ModifyDesktopNameRequest request);

    CompletableFuture<ModifyDesktopOversoldGroupResponse> modifyDesktopOversoldGroup(ModifyDesktopOversoldGroupRequest request);

    CompletableFuture<ModifyDesktopOversoldGroupSaleResponse> modifyDesktopOversoldGroupSale(ModifyDesktopOversoldGroupSaleRequest request);

    CompletableFuture<ModifyDesktopOversoldUserGroupResponse> modifyDesktopOversoldUserGroup(ModifyDesktopOversoldUserGroupRequest request);

    /**
      * Changing the configurations of a cloud computer includes changing the instance type of the cloud computer and scaling up the disks of the cloud computer.
      * *   Before you change the configurations of a cloud computer, you must understand the instance types and disk sizes supported by cloud computers. For more information, see [Cloud computer types](~~188609~~). You can call the [DescribeDesktopTypes](~~188882~~) operation to query the instance types supported by cloud computers.
      * *   You must change at least one of the following configurations: instance type, system disk size, and data disk size of the cloud computer. You must specify at least one of the following parameters: `DesktopType`, `RootDiskSizeGib`, and `UserDiskSizeGib`. Take note of the following items:
      *     *   The instance type of a cloud computer includes the configurations of vCPUs, memory, and GPUs. You can only change an instance type to another. You cannot change only one of the configurations.
      *     *   You cannot change a cloud computer between the General Office type and the non-General Office type. You cannot yet change a cloud computer between the Graphics type and the non-Graphics type.
      *     *   The system disk and data disks of a cloud computer can only be scaled up and cannot be scaled down.
      *     *   If the billing method of the cloud computer is subscription, the system calculates the price difference based on the configuration difference between the original cloud computer and the new cloud computer. You must make up for the price difference or receive a refund for the price difference.
      *     *   We recommend that you do not change the configurations of a cloud computer twice within 5 minutes.
      *     *   When you change the configurations of a cloud computer, the cloud computer must be in the Stopped state.
      * *   After you change the configurations of a cloud computer, the personal data on the cloud computer is not affected.
      *
     */
    CompletableFuture<ModifyDesktopSpecResponse> modifyDesktopSpec(ModifyDesktopSpecRequest request);

    CompletableFuture<ModifyDesktopTimerResponse> modifyDesktopTimer(ModifyDesktopTimerRequest request);

    /**
      * The cloud desktops that you want to restart by calling this operation must be in the Running state.
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
      * *   The cloud computer must be in the Running state.
      * *   After you call this operation, the assignment result is immediately returned. You can call the [DescribeDesktops](~~436815~~) operation to query the assignment of the cloud computer. The value of the `ManagementFlags` response parameter indicates the assignment of the cloud computer. A value of `ASSIGNING` indicates that the cloud computer is being assigned, and other values indicate that the cloud computer is assigned.
      * *   We recommend that you check the assignment every 2 to 5 seconds and perform the checks within 50 seconds. Typically, 1 to 5 seconds are required to complete the assignment.
      *
     */
    CompletableFuture<ModifyEntitlementResponse> modifyEntitlement(ModifyEntitlementRequest request);

    /**
      * You can call this operation to modify the attributes of only custom images that are in the Available state.
      *
     */
    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    /**
      * ### [](#)Security of shared images
      * Elastic Desktop Service cannot guarantee the integrity and security of shared images. When you use a shared image, you must make sure that the image comes from a trusted sharer or account, and you are legally responsible for using the shared image.
      * ### [](#)Quota and billing
      * *   A shared image does not count against the image quotas of principals to which the image is shared.
      * *   After a principal uses a shared image to create a cloud computer, the sharer is not charged for the shared image.
      * *   You are not charged for shared images.
      * ### [](#)Supported sharing behaviors
      * *   You can share custom images with other Alibaba Cloud accounts.
      * *   You can share custom images between accounts in the China site (aliyun.com) and the international site (alibabacloud.com).
      * ### [](#)Unsupported sharing behaviors
      * *   You cannot share images that are shared by other Alibaba Cloud accounts.
      * *   You cannot share encrypted images.
      * *   You cannot share images across regions. If you want to share an image across regions, you must copy the image to the destination region and then share the image. For more information, see [CopyImage](~~436978~~).
      *
     */
    CompletableFuture<ModifyImagePermissionResponse> modifyImagePermission(ModifyImagePermissionRequest request);

    /**
      * When you create a NAS file system, a mount target is automatically generated. By default, the mount target does not need to be changed. If the mount target is deleted by misoperation, you must specify a new mount target for the NAS file system in the workspace. You can call the [CreateMountTarget](~~62621~~) operation to create a mount target.
      *
     */
    CompletableFuture<ModifyNASDefaultMountTargetResponse> modifyNASDefaultMountTarget(ModifyNASDefaultMountTargetRequest request);

    CompletableFuture<ModifyNetworkPackageBandwidthResponse> modifyNetworkPackageBandwidth(ModifyNetworkPackageBandwidthRequest request);

    /**
      * If you want to temporarily disable the Internet access of your cloud computer after the Internet access is enabled for your cloud computer, you can disable the premium bandwidth plan and restore it as needed.
      *
     */
    CompletableFuture<ModifyNetworkPackageEnabledResponse> modifyNetworkPackageEnabled(ModifyNetworkPackageEnabledRequest request);

    CompletableFuture<ModifyOfficeSiteAttributeResponse> modifyOfficeSiteAttribute(ModifyOfficeSiteAttributeRequest request);

    CompletableFuture<ModifyOfficeSiteCrossDesktopAccessResponse> modifyOfficeSiteCrossDesktopAccess(ModifyOfficeSiteCrossDesktopAccessRequest request);

    CompletableFuture<ModifyOfficeSiteMfaEnabledResponse> modifyOfficeSiteMfaEnabled(ModifyOfficeSiteMfaEnabledRequest request);

    CompletableFuture<ModifyPolicyGroupResponse> modifyPolicyGroup(ModifyPolicyGroupRequest request);

    /**
      * You can modify end users only for cloud computers that are in the Running state.
      *
     */
    CompletableFuture<ModifyUserEntitlementResponse> modifyUserEntitlement(ModifyUserEntitlementRequest request);

    CompletableFuture<ModifyUserToDesktopGroupResponse> modifyUserToDesktopGroup(ModifyUserToDesktopGroupRequest request);

    CompletableFuture<MoveCdsFileResponse> moveCdsFile(MoveCdsFileRequest request);

    /**
      * The cloud computers that you want to restart must be in the Running state.
      *
     */
    CompletableFuture<RebootDesktopsResponse> rebootDesktops(RebootDesktopsRequest request);

    /**
      * Before you change the image of a cloud computer, take note of the following limits:
      * *   You can select an image whose OS is different from the OS of the original image. The image change feature is not supported in the following regions: China (Hong Kong), Australia (Sydney), Singapore, and Japan (Tokyo).
      * *   GPU images and non-GPU images cannot be exchanged. Graphical cloud computers can only use GPU-accelerated images. Non-graphical cloud computers can only use non-GPU-accelerated images.
      * After the image is changed, the system uses the new image to initialize the system disk of the cloud computer. This has the following impacts:
      * *   Data in the system disk of the original cloud computer is cleared. Snapshots that are created based on the system disk of the original cloud computer can no longer be used. The system automatically deletes the snapshots.
      * *   If the OS of the image is changed, the data in the data disks of the original cloud computer is cleared, and the snapshots that are created based on the data disks of the original cloud computer can no longer be used. The system automatically deletes the snapshots. If the OS of the image is not changed, the data in the data disks of the original cloud computer is retained, and the snapshots that are created based on the data disks of the original cloud computer can still be used.
      *
     */
    CompletableFuture<RebuildDesktopsResponse> rebuildDesktops(RebuildDesktopsRequest request);

    CompletableFuture<RemoveFilePermissionResponse> removeFilePermission(RemoveFilePermissionRequest request);

    CompletableFuture<RemoveUserFromDesktopGroupResponse> removeUserFromDesktopGroup(RemoveUserFromDesktopGroupRequest request);

    CompletableFuture<RemoveUserFromDesktopOversoldUserGroupResponse> removeUserFromDesktopOversoldUserGroup(RemoveUserFromDesktopOversoldUserGroupRequest request);

    CompletableFuture<RenewDesktopOversoldGroupResponse> renewDesktopOversoldGroup(RenewDesktopOversoldGroupRequest request);

    CompletableFuture<RenewDesktopsResponse> renewDesktops(RenewDesktopsRequest request);

    CompletableFuture<RenewNetworkPackagesResponse> renewNetworkPackages(RenewNetworkPackagesRequest request);

    /**
      * > You can call this operation to reset only cloud computers in a cloud computer pool.
      *
     */
    CompletableFuture<ResetDesktopsResponse> resetDesktops(ResetDesktopsRequest request);

    /**
      * When you create a NAS file system, a mount target is automatically generated. By default, you do not need to modify the mount target of the NAS file system. If the mount target is disabled, you need to reset the mount target of the NAS file system.
      *
     */
    CompletableFuture<ResetNASDefaultMountTargetResponse> resetNASDefaultMountTarget(ResetNASDefaultMountTargetRequest request);

    /**
      * Before you call this operation, make sure that the following operations are performed:
      * *   The data that you want to retain is backed up.
      *     > The disk restoration operation is irreversible. After you call this operation, the disk is restored to the status at the point in time when the snapshot was created. Data that is generated between the snapshot creation time and the current time is lost. Before you restore the disk based on the snapshot, make sure that you back up data.
      * *   The cloud computer to which the disk belongs is stopped.
      *
     */
    CompletableFuture<ResetSnapshotResponse> resetSnapshot(ResetSnapshotRequest request);

    CompletableFuture<RevokeCoordinatePrivilegeResponse> revokeCoordinatePrivilege(RevokeCoordinatePrivilegeRequest request);

    /**
      * You can use the RunCommand operation to run scripts only on Windows cloud desktops.
      *
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
      * You must call this operation to obtain the verification code that is required when you bind an advanced office network to a CEN instance that belongs to another Alibaba Cloud account. After you call this operation, the system sends a verification code to the email address associated with the Alibaba Cloud account to which the CEN instance belongs.
      *
     */
    CompletableFuture<SendVerifyCodeResponse> sendVerifyCode(SendVerifyCodeRequest request);

    CompletableFuture<SetDesktopGroupScaleTimerResponse> setDesktopGroupScaleTimer(SetDesktopGroupScaleTimerRequest request);

    CompletableFuture<SetDesktopGroupTimerResponse> setDesktopGroupTimer(SetDesktopGroupTimerRequest request);

    CompletableFuture<SetDesktopGroupTimerStatusResponse> setDesktopGroupTimerStatus(SetDesktopGroupTimerStatusRequest request);

    CompletableFuture<SetDesktopMaintenanceResponse> setDesktopMaintenance(SetDesktopMaintenanceRequest request);

    /**
      * This operation is supported only for AD directories, not for RAM directories.
      *
     */
    CompletableFuture<SetDirectorySsoStatusResponse> setDirectorySsoStatus(SetDirectorySsoStatusRequest request);

    /**
      * You can call this operation only for workspaces of the Active Directory (AD) and convenience account types.
      *
     */
    CompletableFuture<SetIdpMetadataResponse> setIdpMetadata(SetIdpMetadataRequest request);

    CompletableFuture<SetOfficeSiteSsoStatusResponse> setOfficeSiteSsoStatus(SetOfficeSiteSsoStatusRequest request);

    CompletableFuture<SetUserProfilePathRulesResponse> setUserProfilePathRules(SetUserProfilePathRulesRequest request);

    /**
      * The cloud computers that you want to start must be in the Stopped state.
      *
     */
    CompletableFuture<StartDesktopsResponse> startDesktops(StartDesktopsRequest request);

    /**
      * The cloud computers that you want to stop must be in the Running state.
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

    CompletableFuture<UnbindUserDesktopResponse> unbindUserDesktop(UnbindUserDesktopRequest request);

    CompletableFuture<UnlockVirtualMFADeviceResponse> unlockVirtualMFADevice(UnlockVirtualMFADeviceRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * You can call this operation to manage each image update task. This operation is valid only when the auto-update switch in the image update module for global image updates is turned off. If the auto-update switch is turned on, the switches for each image update task are always turned on. If you want to turn on or off the auto-update switch, go to the Elastic Desktop Service console and choose **Operations > Image Updates** in the left-side navigation pane.
      *
     */
    CompletableFuture<UpdateFotaTaskResponse> updateFotaTask(UpdateFotaTaskRequest request);

    /**
      * >  You can upload only Windows images.
      *
     */
    CompletableFuture<UploadImageResponse> uploadImage(UploadImageRequest request);

    CompletableFuture<VerifyCenResponse> verifyCen(VerifyCenRequest request);

    CompletableFuture<WakeupDesktopsResponse> wakeupDesktops(WakeupDesktopsRequest request);

}
