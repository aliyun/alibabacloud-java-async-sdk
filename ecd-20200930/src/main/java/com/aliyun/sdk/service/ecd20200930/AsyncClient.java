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
     * <b>description</b> :
     * <p>If you do not create any cloud computer in a convenience office network within 15 days, the office network is automatically locked and virtual private cloud (VPC) resources are released. If you want to resume the office network, you can call this operation to unlock the office network.</p>
     * 
     * @param request the request parameters of ActivateOfficeSite  ActivateOfficeSiteRequest
     * @return ActivateOfficeSiteResponse
     */
    CompletableFuture<ActivateOfficeSiteResponse> activateOfficeSite(ActivateOfficeSiteRequest request);

    /**
     * @param request the request parameters of AddDesktopOversoldUserGroup  AddDesktopOversoldUserGroupRequest
     * @return AddDesktopOversoldUserGroupResponse
     */
    CompletableFuture<AddDesktopOversoldUserGroupResponse> addDesktopOversoldUserGroup(AddDesktopOversoldUserGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Each device can be registered in only one Alibaba Cloud account. If you register a device that has been registered in another Alibaba Cloud account, an error is reported.</p>
     * 
     * @param request the request parameters of AddDevices  AddDevicesRequest
     * @return AddDevicesResponse
     */
    CompletableFuture<AddDevicesResponse> addDevices(AddDevicesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to share a specific folder with other users. You can also configure the folder permissions.</p>
     * 
     * @param request the request parameters of AddFilePermission  AddFilePermissionRequest
     * @return AddFilePermissionResponse
     */
    CompletableFuture<AddFilePermissionResponse> addFilePermission(AddFilePermissionRequest request);

    /**
     * @param request the request parameters of AddUserToDesktopGroup  AddUserToDesktopGroupRequest
     * @return AddUserToDesktopGroupResponse
     */
    CompletableFuture<AddUserToDesktopGroupResponse> addUserToDesktopGroup(AddUserToDesktopGroupRequest request);

    /**
     * @param request the request parameters of AddUserToDesktopOversoldUserGroup  AddUserToDesktopOversoldUserGroupRequest
     * @return AddUserToDesktopOversoldUserGroupResponse
     */
    CompletableFuture<AddUserToDesktopOversoldUserGroupResponse> addUserToDesktopOversoldUserGroup(AddUserToDesktopOversoldUserGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can also associate an automatic snapshot policy with a cloud desktop in the Elastic Desktop Service (EDS) console. To do so, perform the following steps: 1. Log on to the EDS console. 2. Choose Desktops and Groups &gt; Desktops in the left-side navigation pane. 3. Find the cloud desktop that you want to manage on the Cloud Desktops page and choose More &gt; Change Automatic Snapshot Policy in the Actions column. 4. Configure a policy for the cloud desktop as prompted in the Change Automatic Snapshot Policy panel.
     * After you associate an automatic snapshot policy with the cloud desktop, the system creates snapshots for the cloud desktop based on the policy.</p>
     * 
     * @param request the request parameters of ApplyAutoSnapshotPolicy  ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of ApplyCoordinatePrivilege  ApplyCoordinatePrivilegeRequest
     * @return ApplyCoordinatePrivilegeResponse
     */
    CompletableFuture<ApplyCoordinatePrivilegeResponse> applyCoordinatePrivilege(ApplyCoordinatePrivilegeRequest request);

    /**
     * @param request the request parameters of ApplyCoordinationForMonitoring  ApplyCoordinationForMonitoringRequest
     * @return ApplyCoordinationForMonitoringResponse
     */
    CompletableFuture<ApplyCoordinationForMonitoringResponse> applyCoordinationForMonitoring(ApplyCoordinationForMonitoringRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computers for which you want to allow image updates must be in the Running state.</p>
     * 
     * @param request the request parameters of ApproveFotaUpdate  ApproveFotaUpdateRequest
     * @return ApproveFotaUpdateResponse
     */
    CompletableFuture<ApproveFotaUpdateResponse> approveFotaUpdate(ApproveFotaUpdateRequest request);

    /**
     * @param request the request parameters of AssociateNetworkPackage  AssociateNetworkPackageRequest
     * @return AssociateNetworkPackageResponse
     */
    CompletableFuture<AssociateNetworkPackageResponse> associateNetworkPackage(AssociateNetworkPackageRequest request);

    /**
     * <b>description</b> :
     * <p>Prerequisites</p>
     * <ul>
     * <li>A CEN instance is created.</li>
     * <li>The office network is an advanced office network, and the account system type is convenient account.<blockquote>
     * <p> The office network is added to the CEN instance when you create the instance. An office network can be added to only one CEN instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AttachCen  AttachCenRequest
     * @return AttachCenResponse
     */
    CompletableFuture<AttachCenResponse> attachCen(AttachCenRequest request);

    /**
     * @param request the request parameters of AttachEndUser  AttachEndUserRequest
     * @return AttachEndUserResponse
     */
    CompletableFuture<AttachEndUserResponse> attachEndUser(AttachEndUserRequest request);

    /**
     * @param request the request parameters of BindConfigGroup  BindConfigGroupRequest
     * @return BindConfigGroupResponse
     */
    CompletableFuture<BindConfigGroupResponse> bindConfigGroup(BindConfigGroupRequest request);

    /**
     * @param request the request parameters of CancelAutoSnapshotPolicy  CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of CancelCdsFileShareLink  CancelCdsFileShareLinkRequest
     * @return CancelCdsFileShareLinkResponse
     */
    CompletableFuture<CancelCdsFileShareLinkResponse> cancelCdsFileShareLink(CancelCdsFileShareLinkRequest request);

    /**
     * @param request the request parameters of CancelCoordinationForMonitoring  CancelCoordinationForMonitoringRequest
     * @return CancelCoordinationForMonitoringResponse
     */
    CompletableFuture<CancelCoordinationForMonitoringResponse> cancelCoordinationForMonitoring(CancelCoordinationForMonitoringRequest request);

    /**
     * @param request the request parameters of CancelCopyImage  CancelCopyImageRequest
     * @return CancelCopyImageResponse
     */
    CompletableFuture<CancelCopyImageResponse> cancelCopyImage(CancelCopyImageRequest request);

    /**
     * @param request the request parameters of ClonePolicyGroup  ClonePolicyGroupRequest
     * @return ClonePolicyGroupResponse
     */
    CompletableFuture<ClonePolicyGroupResponse> clonePolicyGroup(ClonePolicyGroupRequest request);

    /**
     * @param request the request parameters of CompleteCdsFile  CompleteCdsFileRequest
     * @return CompleteCdsFileResponse
     */
    CompletableFuture<CompleteCdsFileResponse> completeCdsFile(CompleteCdsFileRequest request);

    /**
     * @param request the request parameters of ConfigADConnectorTrust  ConfigADConnectorTrustRequest
     * @return ConfigADConnectorTrustResponse
     */
    CompletableFuture<ConfigADConnectorTrustResponse> configADConnectorTrust(ConfigADConnectorTrustRequest request);

    /**
     * @param request the request parameters of ConfigADConnectorUser  ConfigADConnectorUserRequest
     * @return ConfigADConnectorUserResponse
     */
    CompletableFuture<ConfigADConnectorUserResponse> configADConnectorUser(ConfigADConnectorUserRequest request);

    /**
     * @param request the request parameters of CopyCdsFile  CopyCdsFileRequest
     * @return CopyCdsFileResponse
     */
    CompletableFuture<CopyCdsFileResponse> copyCdsFile(CopyCdsFileRequest request);

    /**
     * @param request the request parameters of CopyImage  CopyImageRequest
     * @return CopyImageResponse
     */
    CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request);

    /**
     * <b>description</b> :
     * <p>An AD directory is used to connect to an enterprise\&quot;s existing Active Directory and is suitable for large-scale cloud computer deployment. You are charged directory fees when you connect your AD to cloud computers. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.</p>
     * 
     * @param request the request parameters of CreateADConnectorDirectory  CreateADConnectorDirectoryRequest
     * @return CreateADConnectorDirectoryResponse
     */
    CompletableFuture<CreateADConnectorDirectoryResponse> createADConnectorDirectory(CreateADConnectorDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>When you create an enterprise AD office network, the system automatically creates an AD connector to connect to an enterprise AD. You are charged for the AD connector. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.
     * After you call this operation to create an AD office network, you must perform the following steps to complete AD domain setting:</p>
     * <ol>
     * <li>Configure a conditional forwarder in a Domain Name System (DNS) server.</li>
     * <li>Configure a trust relationship in an AD domain controller and call the <a href="https://help.aliyun.com/document_detail/311258.html">ConfigADConnectorTrust</a> operation to configure the trust relationship with the AD office network.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> operation to query a list of organizational units (OUs) of the AD domain, and call the <a href="https://help.aliyun.com/document_detail/311262.html">ConfigADConnectorUser</a> operation to specify an OU and administrator for the AD office network.<blockquote>
     * <p> When you create the AD office network, take note of the DomainUserName and DomainPassword parameters. If you specify the parameters, you need to only configure a conditional forwarder. If you do not specify the parameters, you must configure a conditional forwarder, trust relationship, and OU as prompted.
     * For more information, see <a href="https://help.aliyun.com/document_detail/214469.html">Create and manage enterprise AD office networks</a>.</p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of CreateADConnectorOfficeSite  CreateADConnectorOfficeSiteRequest
     * @return CreateADConnectorOfficeSiteResponse
     */
    CompletableFuture<CreateADConnectorOfficeSiteResponse> createADConnectorOfficeSite(CreateADConnectorOfficeSiteRequest request);

    /**
     * @param request the request parameters of CreateAndBindNasFileSystem  CreateAndBindNasFileSystemRequest
     * @return CreateAndBindNasFileSystemResponse
     */
    CompletableFuture<CreateAndBindNasFileSystemResponse> createAndBindNasFileSystem(CreateAndBindNasFileSystemRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the operation to create an automatic snapshot policy based on a CRON expression. Then, the system automatically creates snapshots of a cloud desktop based on the policy.</p>
     * 
     * @param request the request parameters of CreateAutoSnapshotPolicy  CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of CreateBandwidthResourcePackages  CreateBandwidthResourcePackagesRequest
     * @return CreateBandwidthResourcePackagesResponse
     */
    CompletableFuture<CreateBandwidthResourcePackagesResponse> createBandwidthResourcePackages(CreateBandwidthResourcePackagesRequest request);

    /**
     * <b>description</b> :
     * <p>Cloud computer templates include system templates and custom templates. A system template is the default template provided by Alibaba Cloud. You can call this operation to create a custom template.</p>
     * 
     * @param request the request parameters of CreateBundle  CreateBundleRequest
     * @return CreateBundleResponse
     */
    CompletableFuture<CreateBundleResponse> createBundle(CreateBundleRequest request);

    /**
     * <b>description</b> :
     * <p>After the RAM permissions are authenticated, you can call the CreateCdsFile operation to obtain the upload URL of a file and upload the file to a cloud disk.</p>
     * 
     * @param request the request parameters of CreateCdsFile  CreateCdsFileRequest
     * @return CreateCdsFileResponse
     */
    CompletableFuture<CreateCdsFileResponse> createCdsFile(CreateCdsFileRequest request);

    /**
     * @param request the request parameters of CreateCdsFileShareLink  CreateCdsFileShareLinkRequest
     * @return CreateCdsFileShareLinkResponse
     */
    CompletableFuture<CreateCdsFileShareLinkResponse> createCdsFileShareLink(CreateCdsFileShareLinkRequest request);

    /**
     * @param request the request parameters of CreateCloudDriveService  CreateCloudDriveServiceRequest
     * @return CreateCloudDriveServiceResponse
     */
    CompletableFuture<CreateCloudDriveServiceResponse> createCloudDriveService(CreateCloudDriveServiceRequest request);

    /**
     * @param request the request parameters of CreateCloudDriveUsers  CreateCloudDriveUsersRequest
     * @return CreateCloudDriveUsersResponse
     */
    CompletableFuture<CreateCloudDriveUsersResponse> createCloudDriveUsers(CreateCloudDriveUsersRequest request);

    /**
     * @param request the request parameters of CreateConfigGroup  CreateConfigGroupRequest
     * @return CreateConfigGroupResponse
     */
    CompletableFuture<CreateConfigGroupResponse> createConfigGroup(CreateConfigGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to create a desktop group, make sure that the following operations are complete:</p>
     * <ul>
     * <li>You are familiar with the features, usage limits, and scaling policies of desktop groups. For more information, see <a href="https://help.aliyun.com/document_detail/290959.html">Overview</a> of desktop groups.</li>
     * <li>Resources, such as workspaces, users, desktop templates, and policies, are created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDesktopGroup  CreateDesktopGroupRequest
     * @return CreateDesktopGroupResponse
     */
    CompletableFuture<CreateDesktopGroupResponse> createDesktopGroup(CreateDesktopGroupRequest request);

    /**
     * @param request the request parameters of CreateDesktopOversoldGroup  CreateDesktopOversoldGroupRequest
     * @return CreateDesktopOversoldGroupResponse
     */
    CompletableFuture<CreateDesktopOversoldGroupResponse> createDesktopOversoldGroup(CreateDesktopOversoldGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you create cloud computers, complete the following preparations:</p>
     * <ul>
     * <li>An office network (formerly called workspace) and users are created. For more information, see:<ul>
     * <li>Convenience office network: <a href="https://help.aliyun.com/document_detail/215416.html">CreateSimpleOfficeSite</a> and <a href="https://help.aliyun.com/document_detail/437832.html">CreateUsers</a>.</li>
     * <li>Active Directory (AD) office network: <a href="https://help.aliyun.com/document_detail/215417.html">CreateADConnectorOfficeSite</a> and <a href="https://help.aliyun.com/document_detail/188619.html">Create an AD user</a>.</li>
     * </ul>
     * </li>
     * <li>Make sure a cloud computer template exists. If no cloud computer template exists, call the <a href="https://help.aliyun.com/document_detail/188883.html">CreateBundle</a> operation to create a template.</li>
     * <li>Make sure a policy exists. If no policy exists, call the <a href="https://help.aliyun.com/document_detail/188889.html">CreatePolicyGroup</a> operation to create a policy.
     * If you want the cloud computers to automatically execute a custom command script, you can use the <code>UserCommands</code> field to configure a custom command.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDesktops  CreateDesktopsRequest
     * @return CreateDesktopsResponse
     */
    CompletableFuture<CreateDesktopsResponse> createDesktops(CreateDesktopsRequest request);

    /**
     * @param request the request parameters of CreateDiskEncryptionService  CreateDiskEncryptionServiceRequest
     * @return CreateDiskEncryptionServiceResponse
     */
    CompletableFuture<CreateDiskEncryptionServiceResponse> createDiskEncryptionService(CreateDiskEncryptionServiceRequest request);

    /**
     * @param request the request parameters of CreateImage  CreateImageRequest
     * @return CreateImageResponse
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Each standard workspace can create one NAS file system to meet the need for sharing files between cloud desktops in the workspace.</li>
     * <li>The system will automatically create a general-purpose NAS file system (with storage specifications of Capacity and Performance, with capacities of 10 PiB and 1 PiB respectively) and generate a default mount point.</li>
     * <li>The NAS file system uses pay-as-you-go by default. You need to pay for the actual storage usage. You can also purchase resource packages to offset the storage usage.
     * For more information, see <a href="https://help.aliyun.com/document_detail/214481.html">Creating Shared Storage NAS</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Each standard workspace can create one NAS file system to meet the need for sharing files between cloud desktops in the workspace.</li>
     * <li>The system will automatically create a general-purpose NAS file system (with storage specifications of Capacity and Performance, with capacities of 10 PiB and 1 PiB respectively) and generate a default mount point.</li>
     * <li>The NAS file system uses pay-as-you-go by default. You need to pay for the actual storage usage. You can also purchase storage packages to offset the storage usage.
     * For more information, see <a href="https://help.aliyun.com/document_detail/214481.html">Creating Shared Storage NAS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateNASFileSystem  CreateNASFileSystemRequest
     * @return CreateNASFileSystemResponse
     */
    CompletableFuture<CreateNASFileSystemResponse> createNASFileSystem(CreateNASFileSystemRequest request);

    /**
     * @param request the request parameters of CreateNetworkPackage  CreateNetworkPackageRequest
     * @return CreateNetworkPackageResponse
     */
    CompletableFuture<CreateNetworkPackageResponse> createNetworkPackage(CreateNetworkPackageRequest request);

    /**
     * <b>description</b> :
     * <p>A cloud computer policy is a collection of rules to manage cloud computers in performance and security. For example, you can create a basic policy that involves the disk mapping, USB redirection, watermarking features and rules such as DNS rules. For more information, see <a href="https://help.aliyun.com/document_detail/189345.html">Policy overview</a>.</p>
     * 
     * @param request the request parameters of CreatePolicyGroup  CreatePolicyGroupRequest
     * @return CreatePolicyGroupResponse
     */
    CompletableFuture<CreatePolicyGroupResponse> createPolicyGroup(CreatePolicyGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you create a RAM directory, complete the following preparations:</p>
     * <ul>
     * <li>Call the <code>CreateVpc</code> operation to create a virtual private cloud (VPC) in a region supported by Elastic Desktop Service.</li>
     * <li>Call the <code>CreateVSwitch</code> operation to create a vSwitch in the VPC. The vSwitch is in a zone that is supported by Elastic Desktop Service. You can call the <a href="https://help.aliyun.com/document_detail/196648.html">DescribeZones</a> operation to obtain the most recent zone list for a region supported by Elastic Desktop Service</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRAMDirectory  CreateRAMDirectoryRequest
     * @return CreateRAMDirectoryResponse
     */
    CompletableFuture<CreateRAMDirectoryResponse> createRAMDirectory(CreateRAMDirectoryRequest request);

    /**
     * @param request the request parameters of CreateSimpleOfficeSite  CreateSimpleOfficeSiteRequest
     * @return CreateSimpleOfficeSiteResponse
     */
    CompletableFuture<CreateSimpleOfficeSiteResponse> createSimpleOfficeSite(CreateSimpleOfficeSiteRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computer must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</p>
     * 
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteAutoSnapshotPolicy  DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
    CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of DeleteBundles  DeleteBundlesRequest
     * @return DeleteBundlesResponse
     */
    CompletableFuture<DeleteBundlesResponse> deleteBundles(DeleteBundlesRequest request);

    /**
     * @param request the request parameters of DeleteCdsFile  DeleteCdsFileRequest
     * @return DeleteCdsFileResponse
     */
    CompletableFuture<DeleteCdsFileResponse> deleteCdsFile(DeleteCdsFileRequest request);

    /**
     * @param request the request parameters of DeleteCloudDriveGroups  DeleteCloudDriveGroupsRequest
     * @return DeleteCloudDriveGroupsResponse
     */
    CompletableFuture<DeleteCloudDriveGroupsResponse> deleteCloudDriveGroups(DeleteCloudDriveGroupsRequest request);

    /**
     * @param request the request parameters of DeleteCloudDriveUsers  DeleteCloudDriveUsersRequest
     * @return DeleteCloudDriveUsersResponse
     */
    CompletableFuture<DeleteCloudDriveUsersResponse> deleteCloudDriveUsers(DeleteCloudDriveUsersRequest request);

    /**
     * @param request the request parameters of DeleteConfigGroup  DeleteConfigGroupRequest
     * @return DeleteConfigGroupResponse
     */
    CompletableFuture<DeleteConfigGroupResponse> deleteConfigGroup(DeleteConfigGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you delete a desktop group, make sure that cloud desktops in the desktop group are not connected and no users are authorized to use the cloud desktops.</p>
     * <ul>
     * <li>You cannot delete a subscription desktop group when cloud desktops in the group are in valid period.</li>
     * <li>If you delete a pay-as-you-go desktop group, cloud desktops in the group are deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDesktopGroup  DeleteDesktopGroupRequest
     * @return DeleteDesktopGroupResponse
     */
    CompletableFuture<DeleteDesktopGroupResponse> deleteDesktopGroup(DeleteDesktopGroupRequest request);

    /**
     * @param request the request parameters of DeleteDesktops  DeleteDesktopsRequest
     * @return DeleteDesktopsResponse
     */
    CompletableFuture<DeleteDesktopsResponse> deleteDesktops(DeleteDesktopsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the operation to manage client devices.</p>
     * 
     * @param request the request parameters of DeleteDevices  DeleteDevicesRequest
     * @return DeleteDevicesResponse
     */
    CompletableFuture<DeleteDevicesResponse> deleteDevices(DeleteDevicesRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot delete a directory that has a cloud computer or is used by a cloud computer.</p>
     * 
     * @param request the request parameters of DeleteDirectories  DeleteDirectoriesRequest
     * @return DeleteDirectoriesResponse
     */
    CompletableFuture<DeleteDirectoriesResponse> deleteDirectories(DeleteDirectoriesRequest request);

    /**
     * @param request the request parameters of DeleteEduRoom  DeleteEduRoomRequest
     * @return DeleteEduRoomResponse
     */
    CompletableFuture<DeleteEduRoomResponse> deleteEduRoom(DeleteEduRoomRequest request);

    /**
     * <b>description</b> :
     * <p>  Images include system images and custom images. System images cannot be deleted.</p>
     * <ul>
     * <li>If an image that you want to delete is referenced by a cloud computer template, call the <a href="https://help.aliyun.com/document_detail/436972.html">DeleteBundles</a> operation to delete the cloud computer template before you delete the image.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteImages  DeleteImagesRequest
     * @return DeleteImagesResponse
     */
    CompletableFuture<DeleteImagesResponse> deleteImages(DeleteImagesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a File Storage NAS (NAS) file system, make sure that the data you want to retain is backed up.</p>
     * <blockquote>
     * <p>Warning: If a NAS file system is deleted, data stored in the NAS file system cannot be restored. Proceed with caution when you delete NAS file systems.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNASFileSystems  DeleteNASFileSystemsRequest
     * @return DeleteNASFileSystemsResponse
     */
    CompletableFuture<DeleteNASFileSystemsResponse> deleteNASFileSystems(DeleteNASFileSystemsRequest request);

    /**
     * @param request the request parameters of DeleteNetworkPackages  DeleteNetworkPackagesRequest
     * @return DeleteNetworkPackagesResponse
     */
    CompletableFuture<DeleteNetworkPackagesResponse> deleteNetworkPackages(DeleteNetworkPackagesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete an office network, make sure that the following operations are complete:</p>
     * <ul>
     * <li>All cloud computers in the office network are released.</li>
     * <li>The data that you want to retain is backed up.<blockquote>
     * <p> Resources and data on cloud computers in an office network cannot be restored after you delete it. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteOfficeSites  DeleteOfficeSitesRequest
     * @return DeleteOfficeSitesResponse
     */
    CompletableFuture<DeleteOfficeSitesResponse> deleteOfficeSites(DeleteOfficeSitesRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot delete the cloud computer policy created by the Elastic Desktop Service (EDS) system.</p>
     * <ul>
     * <li>You cannot delete the cloud computer policies that are associated with cloud computers.</li>
     * </ul>
     * 
     * @param request the request parameters of DeletePolicyGroups  DeletePolicyGroupsRequest
     * @return DeletePolicyGroupsResponse
     */
    CompletableFuture<DeletePolicyGroupsResponse> deletePolicyGroups(DeletePolicyGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>If the IDs of the snapshots that you specify do not exist, requests are ignored.</p>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * <b>description</b> :
     * <p>If an MFA device is deleted, the device is unbound, reset, and disabled. When an Active Directory (AD) user wants to connect to the cloud desktop that is bound to the MFA device, the AD user must bind a new MFA device.</p>
     * 
     * @param request the request parameters of DeleteVirtualMFADevice  DeleteVirtualMFADeviceRequest
     * @return DeleteVirtualMFADeviceResponse
     */
    CompletableFuture<DeleteVirtualMFADeviceResponse> deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request);

    /**
     * @param request the request parameters of DescribeAclEntries  DescribeAclEntriesRequest
     * @return DescribeAclEntriesResponse
     */
    CompletableFuture<DescribeAclEntriesResponse> describeAclEntries(DescribeAclEntriesRequest request);

    /**
     * <b>description</b> :
     * <p>You can view an automatic snapshot policy that is associated with a cloud desktop in the Elastic Desktop Service (EDS) console. To view the automatic snapshot policy, you can go to the EDS console, choose Deployment &gt; Snapshots in the left-side navigation pane, and then view an automatic snapshot policy on the Snapshots page.</p>
     * 
     * @param request the request parameters of DescribeAutoSnapshotPolicy  DescribeAutoSnapshotPolicyRequest
     * @return DescribeAutoSnapshotPolicyResponse
     */
    CompletableFuture<DescribeAutoSnapshotPolicyResponse> describeAutoSnapshotPolicy(DescribeAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of DescribeBundles  DescribeBundlesRequest
     * @return DescribeBundlesResponse
     */
    CompletableFuture<DescribeBundlesResponse> describeBundles(DescribeBundlesRequest request);

    /**
     * @param request the request parameters of DescribeCdsFileShareLinks  DescribeCdsFileShareLinksRequest
     * @return DescribeCdsFileShareLinksResponse
     */
    CompletableFuture<DescribeCdsFileShareLinksResponse> describeCdsFileShareLinks(DescribeCdsFileShareLinksRequest request);

    /**
     * @param request the request parameters of DescribeCens  DescribeCensRequest
     * @return DescribeCensResponse
     */
    CompletableFuture<DescribeCensResponse> describeCens(DescribeCensRequest request);

    /**
     * <b>description</b> :
     * <p>You can audit the operation logs of regular users to improve security. The operation logs record events such as desktop startup, shutdown, and session disconnection.</p>
     * 
     * @param request the request parameters of DescribeClientEvents  DescribeClientEventsRequest
     * @return DescribeClientEventsResponse
     */
    CompletableFuture<DescribeClientEventsResponse> describeClientEvents(DescribeClientEventsRequest request);

    /**
     * @param request the request parameters of DescribeCloudDriveGroups  DescribeCloudDriveGroupsRequest
     * @return DescribeCloudDriveGroupsResponse
     */
    CompletableFuture<DescribeCloudDriveGroupsResponse> describeCloudDriveGroups(DescribeCloudDriveGroupsRequest request);

    /**
     * @param request the request parameters of DescribeCloudDrivePermissions  DescribeCloudDrivePermissionsRequest
     * @return DescribeCloudDrivePermissionsResponse
     */
    CompletableFuture<DescribeCloudDrivePermissionsResponse> describeCloudDrivePermissions(DescribeCloudDrivePermissionsRequest request);

    /**
     * @param request the request parameters of DescribeCloudDriveUsers  DescribeCloudDriveUsersRequest
     * @return DescribeCloudDriveUsersResponse
     */
    CompletableFuture<DescribeCloudDriveUsersResponse> describeCloudDriveUsers(DescribeCloudDriveUsersRequest request);

    /**
     * @param request the request parameters of DescribeConfigGroup  DescribeConfigGroupRequest
     * @return DescribeConfigGroupResponse
     */
    CompletableFuture<DescribeConfigGroupResponse> describeConfigGroup(DescribeConfigGroupRequest request);

    /**
     * @param request the request parameters of DescribeCustomizedListHeaders  DescribeCustomizedListHeadersRequest
     * @return DescribeCustomizedListHeadersResponse
     */
    CompletableFuture<DescribeCustomizedListHeadersResponse> describeCustomizedListHeaders(DescribeCustomizedListHeadersRequest request);

    /**
     * @param request the request parameters of DescribeDesktopGroupSessions  DescribeDesktopGroupSessionsRequest
     * @return DescribeDesktopGroupSessionsResponse
     */
    CompletableFuture<DescribeDesktopGroupSessionsResponse> describeDesktopGroupSessions(DescribeDesktopGroupSessionsRequest request);

    /**
     * @param request the request parameters of DescribeDesktopGroups  DescribeDesktopGroupsRequest
     * @return DescribeDesktopGroupsResponse
     */
    CompletableFuture<DescribeDesktopGroupsResponse> describeDesktopGroups(DescribeDesktopGroupsRequest request);

    /**
     * @param request the request parameters of DescribeDesktopInfo  DescribeDesktopInfoRequest
     * @return DescribeDesktopInfoResponse
     */
    CompletableFuture<DescribeDesktopInfoResponse> describeDesktopInfo(DescribeDesktopInfoRequest request);

    /**
     * @param request the request parameters of DescribeDesktopOversoldGroup  DescribeDesktopOversoldGroupRequest
     * @return DescribeDesktopOversoldGroupResponse
     */
    CompletableFuture<DescribeDesktopOversoldGroupResponse> describeDesktopOversoldGroup(DescribeDesktopOversoldGroupRequest request);

    /**
     * @param request the request parameters of DescribeDesktopOversoldUser  DescribeDesktopOversoldUserRequest
     * @return DescribeDesktopOversoldUserResponse
     */
    CompletableFuture<DescribeDesktopOversoldUserResponse> describeDesktopOversoldUser(DescribeDesktopOversoldUserRequest request);

    /**
     * @param request the request parameters of DescribeDesktopOversoldUserGroup  DescribeDesktopOversoldUserGroupRequest
     * @return DescribeDesktopOversoldUserGroupResponse
     */
    CompletableFuture<DescribeDesktopOversoldUserGroupResponse> describeDesktopOversoldUserGroup(DescribeDesktopOversoldUserGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can only query data within the last 30 days.</p>
     * 
     * @param request the request parameters of DescribeDesktopSessions  DescribeDesktopSessionsRequest
     * @return DescribeDesktopSessionsResponse
     */
    CompletableFuture<DescribeDesktopSessionsResponse> describeDesktopSessions(DescribeDesktopSessionsRequest request);

    /**
     * <b>description</b> :
     * <p>When no values are specified for the <code>InstanceTypeFamily</code> and <code>DesktopTypeId</code> parameters for a cloud desktop, all types of cloud desktops are queried.</p>
     * 
     * @param request the request parameters of DescribeDesktopTypes  DescribeDesktopTypesRequest
     * @return DescribeDesktopTypesResponse
     */
    CompletableFuture<DescribeDesktopTypesResponse> describeDesktopTypes(DescribeDesktopTypesRequest request);

    /**
     * @param request the request parameters of DescribeDesktops  DescribeDesktopsRequest
     * @return DescribeDesktopsResponse
     */
    CompletableFuture<DescribeDesktopsResponse> describeDesktops(DescribeDesktopsRequest request);

    /**
     * @param request the request parameters of DescribeDesktopsInGroup  DescribeDesktopsInGroupRequest
     * @return DescribeDesktopsInGroupResponse
     */
    CompletableFuture<DescribeDesktopsInGroupResponse> describeDesktopsInGroup(DescribeDesktopsInGroupRequest request);

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
     * @param request the request parameters of DescribeFlowMetric  DescribeFlowMetricRequest
     * @return DescribeFlowMetricResponse
     */
    CompletableFuture<DescribeFlowMetricResponse> describeFlowMetric(DescribeFlowMetricRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query only the traffic data in the last 90 days.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeFlowStatistic  DescribeFlowStatisticRequest
     * @return DescribeFlowStatisticResponse
     */
    CompletableFuture<DescribeFlowStatisticResponse> describeFlowStatistic(DescribeFlowStatisticRequest request);

    /**
     * @param request the request parameters of DescribeFotaPendingDesktops  DescribeFotaPendingDesktopsRequest
     * @return DescribeFotaPendingDesktopsResponse
     */
    CompletableFuture<DescribeFotaPendingDesktopsResponse> describeFotaPendingDesktops(DescribeFotaPendingDesktopsRequest request);

    /**
     * @param request the request parameters of DescribeFotaTasks  DescribeFotaTasksRequest
     * @return DescribeFotaTasksResponse
     */
    CompletableFuture<DescribeFotaTasksResponse> describeFotaTasks(DescribeFotaTasksRequest request);

    /**
     * @param request the request parameters of DescribeGuestApplications  DescribeGuestApplicationsRequest
     * @return DescribeGuestApplicationsResponse
     */
    CompletableFuture<DescribeGuestApplicationsResponse> describeGuestApplications(DescribeGuestApplicationsRequest request);

    /**
     * @param request the request parameters of DescribeImageModifiedRecords  DescribeImageModifiedRecordsRequest
     * @return DescribeImageModifiedRecordsResponse
     */
    CompletableFuture<DescribeImageModifiedRecordsResponse> describeImageModifiedRecords(DescribeImageModifiedRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/436982.html">ModifyImagePermission</a> operation to share an image with another cloud computer user or unshare an image. You can call the DescribeImagePermission operation to obtain the Alibaba Cloud accounts with which the current image is shared.</p>
     * 
     * @param request the request parameters of DescribeImagePermission  DescribeImagePermissionRequest
     * @return DescribeImagePermissionResponse
     */
    CompletableFuture<DescribeImagePermissionResponse> describeImagePermission(DescribeImagePermissionRequest request);

    /**
     * @param request the request parameters of DescribeImages  DescribeImagesRequest
     * @return DescribeImagesResponse
     */
    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    /**
     * <b>description</b> :
     * <p>  After you run a command, it may not succeed. You can call this operation to query the execution result.</p>
     * <ul>
     * <li>You can query the information about execution in the last two weeks. A maximum of 100,000 lines of execution information can be retained.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInvocations  DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    /**
     * @param request the request parameters of DescribeKmsKeys  DescribeKmsKeysRequest
     * @return DescribeKmsKeysResponse
     */
    CompletableFuture<DescribeKmsKeysResponse> describeKmsKeys(DescribeKmsKeysRequest request);

    /**
     * @param request the request parameters of DescribeModificationPrice  DescribeModificationPriceRequest
     * @return DescribeModificationPriceResponse
     */
    CompletableFuture<DescribeModificationPriceResponse> describeModificationPrice(DescribeModificationPriceRequest request);

    /**
     * @param request the request parameters of DescribeNASFileSystems  DescribeNASFileSystemsRequest
     * @return DescribeNASFileSystemsResponse
     */
    CompletableFuture<DescribeNASFileSystemsResponse> describeNASFileSystems(DescribeNASFileSystemsRequest request);

    /**
     * @param request the request parameters of DescribeNetworkPackages  DescribeNetworkPackagesRequest
     * @return DescribeNetworkPackagesResponse
     */
    CompletableFuture<DescribeNetworkPackagesResponse> describeNetworkPackages(DescribeNetworkPackagesRequest request);

    /**
     * @param request the request parameters of DescribeOfficeSites  DescribeOfficeSitesRequest
     * @return DescribeOfficeSitesResponse
     */
    CompletableFuture<DescribeOfficeSitesResponse> describeOfficeSites(DescribeOfficeSitesRequest request);

    /**
     * @param request the request parameters of DescribePolicyGroups  DescribePolicyGroupsRequest
     * @return DescribePolicyGroupsResponse
     */
    CompletableFuture<DescribePolicyGroupsResponse> describePolicyGroups(DescribePolicyGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>The request parameters vary based on the type of desktop resources whose price you want to query. Take note of the following items:</p>
     * <ul>
     * <li>If you set ResourceType to OfficeSite, you must specify InstanceType.</li>
     * <li>If you set ResourceType to Bandwidth, the pay-by-data-transfer metering method is used for network billing.</li>
     * <li>If you set ResourceType to Desktop, you must specify InstanceType, RootDiskSizeGib, and UserDiskSizeGib. You can specify OsType, PeriodUnit, Period, and Amount based on your business requirements.<blockquote>
     * <p>Before you call this operation to query the prices of cloud desktops by setting ResourceType to Desktop, you must know the desktop types and disk sizes that EDS provides. The disk sizes vary based on the desktop types. For more information, see <a href="https://help.aliyun.com/document_detail/188609.html">Cloud desktop types</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    /**
     * @param request the request parameters of DescribePriceForCreateDesktopOversoldGroup  DescribePriceForCreateDesktopOversoldGroupRequest
     * @return DescribePriceForCreateDesktopOversoldGroupResponse
     */
    CompletableFuture<DescribePriceForCreateDesktopOversoldGroupResponse> describePriceForCreateDesktopOversoldGroup(DescribePriceForCreateDesktopOversoldGroupRequest request);

    /**
     * @param request the request parameters of DescribePriceForModifyDesktopOversoldGroupSale  DescribePriceForModifyDesktopOversoldGroupSaleRequest
     * @return DescribePriceForModifyDesktopOversoldGroupSaleResponse
     */
    CompletableFuture<DescribePriceForModifyDesktopOversoldGroupSaleResponse> describePriceForModifyDesktopOversoldGroupSale(DescribePriceForModifyDesktopOversoldGroupSaleRequest request);

    /**
     * @param request the request parameters of DescribePriceForRenewDesktopOversoldGroup  DescribePriceForRenewDesktopOversoldGroupRequest
     * @return DescribePriceForRenewDesktopOversoldGroupResponse
     */
    CompletableFuture<DescribePriceForRenewDesktopOversoldGroupResponse> describePriceForRenewDesktopOversoldGroup(DescribePriceForRenewDesktopOversoldGroupRequest request);

    /**
     * @param request the request parameters of DescribeRecordings  DescribeRecordingsRequest
     * @return DescribeRecordingsResponse
     */
    CompletableFuture<DescribeRecordingsResponse> describeRecordings(DescribeRecordingsRequest request);

    /**
     * @param request the request parameters of DescribeRefundPrice  DescribeRefundPriceRequest
     * @return DescribeRefundPriceResponse
     */
    CompletableFuture<DescribeRefundPriceResponse> describeRefundPrice(DescribeRefundPriceRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRenewalPrice  DescribeRenewalPriceRequest
     * @return DescribeRenewalPriceResponse
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    /**
     * <b>description</b> :
     * <p>  This is a central operation and can be called only by using services in the China (Shanghai) region.</p>
     * <ul>
     * <li>You can query session statistics for the past hour.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSessionStatistic  DescribeSessionStatisticRequest
     * @return DescribeSessionStatisticResponse
     */
    CompletableFuture<DescribeSessionStatisticResponse> describeSessionStatistic(DescribeSessionStatisticRequest request);

    /**
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    /**
     * @param request the request parameters of DescribeTimerGroup  DescribeTimerGroupRequest
     * @return DescribeTimerGroupResponse
     */
    CompletableFuture<DescribeTimerGroupResponse> describeTimerGroup(DescribeTimerGroupRequest request);

    /**
     * @param request the request parameters of DescribeUserConnectTime  DescribeUserConnectTimeRequest
     * @return DescribeUserConnectTimeResponse
     */
    CompletableFuture<DescribeUserConnectTimeResponse> describeUserConnectTime(DescribeUserConnectTimeRequest request);

    /**
     * @param request the request parameters of DescribeUserConnectionRecords  DescribeUserConnectionRecordsRequest
     * @return DescribeUserConnectionRecordsResponse
     */
    CompletableFuture<DescribeUserConnectionRecordsResponse> describeUserConnectionRecords(DescribeUserConnectionRecordsRequest request);

    /**
     * @param request the request parameters of DescribeUserProfilePathRules  DescribeUserProfilePathRulesRequest
     * @return DescribeUserProfilePathRulesResponse
     */
    CompletableFuture<DescribeUserProfilePathRulesResponse> describeUserProfilePathRules(DescribeUserProfilePathRulesRequest request);

    /**
     * @param request the request parameters of DescribeUsersInGroup  DescribeUsersInGroupRequest
     * @return DescribeUsersInGroupResponse
     */
    CompletableFuture<DescribeUsersInGroupResponse> describeUsersInGroup(DescribeUsersInGroupRequest request);

    /**
     * @param request the request parameters of DescribeUsersPassword  DescribeUsersPasswordRequest
     * @return DescribeUsersPasswordResponse
     */
    CompletableFuture<DescribeUsersPasswordResponse> describeUsersPassword(DescribeUsersPasswordRequest request);

    /**
     * @param request the request parameters of DescribeVirtualMFADevices  DescribeVirtualMFADevicesRequest
     * @return DescribeVirtualMFADevicesResponse
     */
    CompletableFuture<DescribeVirtualMFADevicesResponse> describeVirtualMFADevices(DescribeVirtualMFADevicesRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * @param request the request parameters of DetachCen  DetachCenRequest
     * @return DetachCenResponse
     */
    CompletableFuture<DetachCenResponse> detachCen(DetachCenRequest request);

    /**
     * @param request the request parameters of DetachEndUser  DetachEndUserRequest
     * @return DetachEndUserResponse
     */
    CompletableFuture<DetachEndUserResponse> detachEndUser(DetachEndUserRequest request);

    /**
     * @param request the request parameters of DisableDesktopsInGroup  DisableDesktopsInGroupRequest
     * @return DisableDesktopsInGroupResponse
     */
    CompletableFuture<DisableDesktopsInGroupResponse> disableDesktopsInGroup(DisableDesktopsInGroupRequest request);

    /**
     * @param request the request parameters of DisconnectDesktopSessions  DisconnectDesktopSessionsRequest
     * @return DisconnectDesktopSessionsResponse
     */
    CompletableFuture<DisconnectDesktopSessionsResponse> disconnectDesktopSessions(DisconnectDesktopSessionsRequest request);

    /**
     * @param request the request parameters of DissociateNetworkPackage  DissociateNetworkPackageRequest
     * @return DissociateNetworkPackageResponse
     */
    CompletableFuture<DissociateNetworkPackageResponse> dissociateNetworkPackage(DissociateNetworkPackageRequest request);

    /**
     * @param request the request parameters of DownloadCdsFile  DownloadCdsFileRequest
     * @return DownloadCdsFileResponse
     */
    CompletableFuture<DownloadCdsFileResponse> downloadCdsFile(DownloadCdsFileRequest request);

    /**
     * @param request the request parameters of ExportClientEvents  ExportClientEventsRequest
     * @return ExportClientEventsResponse
     */
    CompletableFuture<ExportClientEventsResponse> exportClientEvents(ExportClientEventsRequest request);

    /**
     * @param request the request parameters of ExportDesktopGroupInfo  ExportDesktopGroupInfoRequest
     * @return ExportDesktopGroupInfoResponse
     */
    CompletableFuture<ExportDesktopGroupInfoResponse> exportDesktopGroupInfo(ExportDesktopGroupInfoRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computer list exported by calling this operation is saved as a CSV file. Each entry of data of a cloud computer includes the following fields:</p>
     * <ul>
     * <li>Cloud computer ID and name</li>
     * <li>Office network ID and name</li>
     * <li>The instance type, OS and protocol of the cloud computer</li>
     * <li>System disk and data disk of the cloud computer</li>
     * <li>The status</li>
     * <li>Purchase method</li>
     * <li>The time when the cloud computer expires</li>
     * <li>Remaining duration and total duration</li>
     * <li>Number of assigned users and number of current users</li>
     * <li>Office network type</li>
     * <li>The time when the cloud computer was created</li>
     * <li>Tags</li>
     * <li>Encryption status</li>
     * <li>IP</li>
     * <li>The hostname</li>
     * </ul>
     * 
     * @param request the request parameters of ExportDesktopListInfo  ExportDesktopListInfoRequest
     * @return ExportDesktopListInfoResponse
     */
    CompletableFuture<ExportDesktopListInfoResponse> exportDesktopListInfo(ExportDesktopListInfoRequest request);

    /**
     * @param request the request parameters of GetAsyncTask  GetAsyncTaskRequest
     * @return GetAsyncTaskResponse
     */
    CompletableFuture<GetAsyncTaskResponse> getAsyncTask(GetAsyncTaskRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computer must be in the Running state.</p>
     * 
     * @param request the request parameters of GetConnectionTicket  GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    /**
     * @param request the request parameters of GetCoordinateTicket  GetCoordinateTicketRequest
     * @return GetCoordinateTicketResponse
     */
    CompletableFuture<GetCoordinateTicketResponse> getCoordinateTicket(GetCoordinateTicketRequest request);

    /**
     * @param request the request parameters of GetDesktopGroupDetail  GetDesktopGroupDetailRequest
     * @return GetDesktopGroupDetailResponse
     */
    CompletableFuture<GetDesktopGroupDetailResponse> getDesktopGroupDetail(GetDesktopGroupDetailRequest request);

    /**
     * @param request the request parameters of GetOfficeSiteSsoStatus  GetOfficeSiteSsoStatusRequest
     * @return GetOfficeSiteSsoStatusResponse
     */
    CompletableFuture<GetOfficeSiteSsoStatusResponse> getOfficeSiteSsoStatus(GetOfficeSiteSsoStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for workspaces of the Active Directory (AD) and convenience account types.</p>
     * 
     * @param request the request parameters of GetSpMetadata  GetSpMetadataRequest
     * @return GetSpMetadataResponse
     */
    CompletableFuture<GetSpMetadataResponse> getSpMetadata(GetSpMetadataRequest request);

    /**
     * <b>description</b> :
     * <p>Hibernating a cloud desktop is in private preview. If you want to try this feature, submit a ticket.</p>
     * 
     * @param request the request parameters of HibernateDesktops  HibernateDesktopsRequest
     * @return HibernateDesktopsResponse
     */
    CompletableFuture<HibernateDesktopsResponse> hibernateDesktops(HibernateDesktopsRequest request);

    /**
     * @param request the request parameters of ListCdsFiles  ListCdsFilesRequest
     * @return ListCdsFilesResponse
     */
    CompletableFuture<ListCdsFilesResponse> listCdsFiles(ListCdsFilesRequest request);

    /**
     * <b>description</b> :
     * <p>If you use an AD directory to connect to an AD system, you can call this operation to obtain the user information in the AD system.</p>
     * 
     * @param request the request parameters of ListDirectoryUsers  ListDirectoryUsersRequest
     * @return ListDirectoryUsersResponse
     */
    CompletableFuture<ListDirectoryUsersResponse> listDirectoryUsers(ListDirectoryUsersRequest request);

    /**
     * @param request the request parameters of ListFilePermission  ListFilePermissionRequest
     * @return ListFilePermissionResponse
     */
    CompletableFuture<ListFilePermissionResponse> listFilePermission(ListFilePermissionRequest request);

    /**
     * @param request the request parameters of ListOfficeSiteOverview  ListOfficeSiteOverviewRequest
     * @return ListOfficeSiteOverviewResponse
     */
    CompletableFuture<ListOfficeSiteOverviewResponse> listOfficeSiteOverview(ListOfficeSiteOverviewRequest request);

    /**
     * @param request the request parameters of ListOfficeSiteUsers  ListOfficeSiteUsersRequest
     * @return ListOfficeSiteUsersResponse
     */
    CompletableFuture<ListOfficeSiteUsersResponse> listOfficeSiteUsers(ListOfficeSiteUsersRequest request);

    /**
     * <b>description</b> :
     * <p>You must use at least one of the following parameters in the request to determine the object that you want to query: <code>ResourceId.N</code>, <code>Tag.N.Key</code>, and <code>Tag.N.Value</code>.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListUserAdOrganizationUnits  ListUserAdOrganizationUnitsRequest
     * @return ListUserAdOrganizationUnitsResponse
     */
    CompletableFuture<ListUserAdOrganizationUnitsResponse> listUserAdOrganizationUnits(ListUserAdOrganizationUnitsRequest request);

    /**
     * <b>description</b> :
     * <p>After a virtual MFA device is locked, its status changes to LOCKED. The Active Directory (AD) user who uses the virtual MFA device is unable to pass MFA and is therefore unable to log on to the client. You can call the <a href="https://help.aliyun.com/document_detail/206212.html">UnlockVirtualMFADevice</a> operation to unlock the device.</p>
     * 
     * @param request the request parameters of LockVirtualMFADevice  LockVirtualMFADeviceRequest
     * @return LockVirtualMFADeviceResponse
     */
    CompletableFuture<LockVirtualMFADeviceResponse> lockVirtualMFADevice(LockVirtualMFADeviceRequest request);

    /**
     * @param request the request parameters of MigrateDesktops  MigrateDesktopsRequest
     * @return MigrateDesktopsResponse
     */
    CompletableFuture<MigrateDesktopsResponse> migrateDesktops(MigrateDesktopsRequest request);

    /**
     * @param request the request parameters of MigrateImageProtocol  MigrateImageProtocolRequest
     * @return MigrateImageProtocolResponse
     */
    CompletableFuture<MigrateImageProtocolResponse> migrateImageProtocol(MigrateImageProtocolRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify the following domain name- and Domain Name System (DNS)-related parameters only for Active Directory (AD) directories that are in the ERROR or REGISTERING state: <code>DomainName</code>, <code>SubDomainName</code>, <code>DnsAddress.N</code>, and <code>SubDomainDnsAddress</code>.</p>
     * 
     * @param request the request parameters of ModifyADConnectorDirectory  ModifyADConnectorDirectoryRequest
     * @return ModifyADConnectorDirectoryResponse
     */
    CompletableFuture<ModifyADConnectorDirectoryResponse> modifyADConnectorDirectory(ModifyADConnectorDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify parameters of domain names and Domain Name System (DNS) for enterprise AD office networks that are in the <code>ERROR</code> or <code>REGISTERED</code> state. The parameters include <code>DomainName</code>, <code>SubDomainName</code>, <code>DnsAddress.N</code>, and <code>SubDomainDnsAddress.N</code>.</p>
     * 
     * @param request the request parameters of ModifyADConnectorOfficeSite  ModifyADConnectorOfficeSiteRequest
     * @return ModifyADConnectorOfficeSiteResponse
     */
    CompletableFuture<ModifyADConnectorOfficeSiteResponse> modifyADConnectorOfficeSite(ModifyADConnectorOfficeSiteRequest request);

    /**
     * <b>description</b> :
     * <p>You can set different Internet access control policies at different granularities to achieve the effect of composite policies. For example, you can disable the Internet access on the office network granularity and enable the Internet access on specific cloud computer granularity. The effect is that all cloud computers in the office network except the specified cloud computers are not allowed to access the Internet.</p>
     * 
     * @param request the request parameters of ModifyAclEntries  ModifyAclEntriesRequest
     * @return ModifyAclEntriesResponse
     */
    CompletableFuture<ModifyAclEntriesResponse> modifyAclEntries(ModifyAclEntriesRequest request);

    /**
     * @param request the request parameters of ModifyAutoSnapshotPolicy  ModifyAutoSnapshotPolicyRequest
     * @return ModifyAutoSnapshotPolicyResponse
     */
    CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Only custom desktop templates can be modified.</p>
     * 
     * @param request the request parameters of ModifyBundle  ModifyBundleRequest
     * @return ModifyBundleResponse
     */
    CompletableFuture<ModifyBundleResponse> modifyBundle(ModifyBundleRequest request);

    /**
     * @param request the request parameters of ModifyCdsFile  ModifyCdsFileRequest
     * @return ModifyCdsFileResponse
     */
    CompletableFuture<ModifyCdsFileResponse> modifyCdsFile(ModifyCdsFileRequest request);

    /**
     * @param request the request parameters of ModifyCdsFileShareLink  ModifyCdsFileShareLinkRequest
     * @return ModifyCdsFileShareLinkResponse
     */
    CompletableFuture<ModifyCdsFileShareLinkResponse> modifyCdsFileShareLink(ModifyCdsFileShareLinkRequest request);

    /**
     * @param request the request parameters of ModifyCloudDriveGroups  ModifyCloudDriveGroupsRequest
     * @return ModifyCloudDriveGroupsResponse
     */
    CompletableFuture<ModifyCloudDriveGroupsResponse> modifyCloudDriveGroups(ModifyCloudDriveGroupsRequest request);

    /**
     * @param request the request parameters of ModifyCloudDrivePermission  ModifyCloudDrivePermissionRequest
     * @return ModifyCloudDrivePermissionResponse
     */
    CompletableFuture<ModifyCloudDrivePermissionResponse> modifyCloudDrivePermission(ModifyCloudDrivePermissionRequest request);

    /**
     * @param request the request parameters of ModifyCloudDriveUsers  ModifyCloudDriveUsersRequest
     * @return ModifyCloudDriveUsersResponse
     */
    CompletableFuture<ModifyCloudDriveUsersResponse> modifyCloudDriveUsers(ModifyCloudDriveUsersRequest request);

    /**
     * @param request the request parameters of ModifyConfigGroup  ModifyConfigGroupRequest
     * @return ModifyConfigGroupResponse
     */
    CompletableFuture<ModifyConfigGroupResponse> modifyConfigGroup(ModifyConfigGroupRequest request);

    /**
     * @param request the request parameters of ModifyCustomizedListHeaders  ModifyCustomizedListHeadersRequest
     * @return ModifyCustomizedListHeadersResponse
     */
    CompletableFuture<ModifyCustomizedListHeadersResponse> modifyCustomizedListHeaders(ModifyCustomizedListHeadersRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you fully understand the billing methods of cloud computers. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that the cloud computers whose billing method you want to change are in the Running or Stopped state and you have no overdue payments in your Alibaba Cloud account.</li>
     * <li>After the order payment is completed, the system starts to change the billing method of the cloud computers. During the change, you cannot perform operations, such as starting or stopping the cloud computers, and changing configurations of the cloud computers.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDesktopChargeType  ModifyDesktopChargeTypeRequest
     * @return ModifyDesktopChargeTypeResponse
     */
    CompletableFuture<ModifyDesktopChargeTypeResponse> modifyDesktopChargeType(ModifyDesktopChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>After a cloud computer pool is created, the system creates a specific number of cloud computers in the pool based on the auto scaling policy and user connections. Cloud computers are created by using the same cloud computer template and security policy. You can modify the configurations of the pool, including the pool name, cloud computer template, and policy, in different business scenarios.</p>
     * 
     * @param request the request parameters of ModifyDesktopGroup  ModifyDesktopGroupRequest
     * @return ModifyDesktopGroupResponse
     */
    CompletableFuture<ModifyDesktopGroupResponse> modifyDesktopGroup(ModifyDesktopGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The Windows cloud computer whose hostname you want to modify must be in an AD office network. After the hostname is modified, the cloud computer is re-created.</p>
     * 
     * @param request the request parameters of ModifyDesktopHostName  ModifyDesktopHostNameRequest
     * @return ModifyDesktopHostNameResponse
     */
    CompletableFuture<ModifyDesktopHostNameResponse> modifyDesktopHostName(ModifyDesktopHostNameRequest request);

    /**
     * @param request the request parameters of ModifyDesktopName  ModifyDesktopNameRequest
     * @return ModifyDesktopNameResponse
     */
    CompletableFuture<ModifyDesktopNameResponse> modifyDesktopName(ModifyDesktopNameRequest request);

    /**
     * @param request the request parameters of ModifyDesktopOversoldGroup  ModifyDesktopOversoldGroupRequest
     * @return ModifyDesktopOversoldGroupResponse
     */
    CompletableFuture<ModifyDesktopOversoldGroupResponse> modifyDesktopOversoldGroup(ModifyDesktopOversoldGroupRequest request);

    /**
     * @param request the request parameters of ModifyDesktopOversoldGroupSale  ModifyDesktopOversoldGroupSaleRequest
     * @return ModifyDesktopOversoldGroupSaleResponse
     */
    CompletableFuture<ModifyDesktopOversoldGroupSaleResponse> modifyDesktopOversoldGroupSale(ModifyDesktopOversoldGroupSaleRequest request);

    /**
     * @param request the request parameters of ModifyDesktopOversoldUserGroup  ModifyDesktopOversoldUserGroupRequest
     * @return ModifyDesktopOversoldUserGroupResponse
     */
    CompletableFuture<ModifyDesktopOversoldUserGroupResponse> modifyDesktopOversoldUserGroup(ModifyDesktopOversoldUserGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Changing the configurations of a cloud computer includes changing the instance type of the cloud computer and scaling up the disks of the cloud computer.</p>
     * <ul>
     * <li>Before you change the configurations of a cloud computer, you must understand the instance types and disk sizes supported by cloud computers. For more information, see <a href="https://help.aliyun.com/document_detail/188609.html">Cloud computer types</a>. You can call the <a href="https://help.aliyun.com/document_detail/188882.html">DescribeDesktopTypes</a> operation to query the instance types supported by cloud computers.</li>
     * <li>You must change at least one of the following configurations: instance type, system disk size, and data disk size of the cloud computer. You must specify at least one of the following parameters: <code>DesktopType</code>, <code>RootDiskSizeGib</code>, and <code>UserDiskSizeGib</code>. Take note of the following items:<ul>
     * <li>The instance type of a cloud computer includes the configurations of vCPUs, memory, and GPUs. You can only change an instance type to another. You cannot change only one of the configurations.</li>
     * <li>You cannot change a cloud computer between the General Office type and the non-General Office type. You cannot yet change a cloud computer between the Graphics type and the non-Graphics type.</li>
     * <li>The system disk and data disks of a cloud computer can only be scaled up and cannot be scaled down.</li>
     * <li>If the billing method of the cloud computer is subscription, the system calculates the price difference based on the configuration difference between the original cloud computer and the new cloud computer. You must make up for the price difference or receive a refund for the price difference.</li>
     * <li>We recommend that you do not change the configurations of a cloud computer twice within 5 minutes.</li>
     * <li>When you change the configurations of a cloud computer, the cloud computer must be in the Stopped state.</li>
     * </ul>
     * </li>
     * <li>After you change the configurations of a cloud computer, the personal data on the cloud computer is not affected.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDesktopSpec  ModifyDesktopSpecRequest
     * @return ModifyDesktopSpecResponse
     */
    CompletableFuture<ModifyDesktopSpecResponse> modifyDesktopSpec(ModifyDesktopSpecRequest request);

    /**
     * @param request the request parameters of ModifyDesktopTimer  ModifyDesktopTimerRequest
     * @return ModifyDesktopTimerResponse
     */
    CompletableFuture<ModifyDesktopTimerResponse> modifyDesktopTimer(ModifyDesktopTimerRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computers for which you want to change their policies must be in the Running state.</p>
     * 
     * @param request the request parameters of ModifyDesktopsPolicyGroup  ModifyDesktopsPolicyGroupRequest
     * @return ModifyDesktopsPolicyGroupResponse
     */
    CompletableFuture<ModifyDesktopsPolicyGroupResponse> modifyDesktopsPolicyGroup(ModifyDesktopsPolicyGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to change the configurations, such as the desktop type and disk size, of a cloud desktop.</p>
     * <ul>
     * <li>Before you call this operation, you must know the cloud desktop types and the disk sizes for each type of cloud desktop that Elastic Desktop Service (EDS) provides.</li>
     * <li>When you change the configurations of a cloud desktop, you must change the desktop type or the size of the system disk or data disk. You must configure at least one of the following parameters: DesktopType, RootDiskSizeGib, and UserDiskSizeGib. Take note of the following items:
     * 1\. Desktop types include the specifications of vCPUs, memory, and GPUs. You can change only the desktop type, instead of one of the specifications.
     * 2\. You cannot change a cloud desktop from the General Office type to a non-General Office type, or from a non-General Office type to the General Office type. You cannot change a cloud desktop from the Graphics type to a non-Graphics type, or from a non-Graphics type to the Graphics type.
     * 3\. You can only increase the sizes of system and data disks. You cannot decrease the sizes of system and data disks.
     * 4\. If your cloud desktop uses the subscription billing method, the price difference is calculated based on the price before and after configuration changes. You may receive a refund, or must pay for the price difference.
     * 5\. If you need to change the configurations of a cloud desktop multiple times, we recommend that you wait at least 5 minutes between consecutive operations on the cloud desktop.
     * 6\. The cloud desktop for which you want to change the desktop type must be in the Stopped state.</li>
     * <li>The changes do not affect your personal data on the cloud desktop.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskSpec  ModifyDiskSpecRequest
     * @return ModifyDiskSpecResponse
     */
    CompletableFuture<ModifyDiskSpecResponse> modifyDiskSpec(ModifyDiskSpecRequest request);

    /**
     * <b>description</b> :
     * <p>  The cloud computer must be in the Running state.</p>
     * <ul>
     * <li>After you call this operation, the assignment result is immediately returned. You can call the <a href="https://help.aliyun.com/document_detail/436815.html">DescribeDesktops</a> operation to query the assignment of the cloud computer. The value of the <code>ManagementFlags</code> response parameter indicates the assignment of the cloud computer. A value of <code>ASSIGNING</code> indicates that the cloud computer is being assigned, and other values indicate that the cloud computer is assigned.</li>
     * <li>We recommend that you check the assignment every 2 to 5 seconds and perform the checks within 50 seconds. Typically, 1 to 5 seconds are required to complete the assignment.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyEntitlement  ModifyEntitlementRequest
     * @return ModifyEntitlementResponse
     */
    CompletableFuture<ModifyEntitlementResponse> modifyEntitlement(ModifyEntitlementRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the attributes of only custom images that are in the Available state.</p>
     * 
     * @param request the request parameters of ModifyImageAttribute  ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     */
    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Security of shared images</h3>
     * <p>Elastic Desktop Service cannot guarantee the integrity and security of shared images. When you use a shared image, you must make sure that the image comes from a trusted sharer or account, and you are legally responsible for using the shared image.</p>
     * <h3><a href="#"></a>Quota and billing</h3>
     * <ul>
     * <li>A shared image does not count against the image quotas of principals to which the image is shared.</li>
     * <li>After a principal uses a shared image to create a cloud computer, the sharer is not charged for the shared image.</li>
     * <li>You are not charged for shared images.</li>
     * </ul>
     * <h3><a href="#"></a>Supported sharing behaviors</h3>
     * <ul>
     * <li>You can share custom images with other Alibaba Cloud accounts.</li>
     * <li>You can share custom images between accounts in the China site (aliyun.com) and the international site (alibabacloud.com).</li>
     * </ul>
     * <h3><a href="#"></a>Unsupported sharing behaviors</h3>
     * <ul>
     * <li>You cannot share images that are shared by other Alibaba Cloud accounts.</li>
     * <li>You cannot share encrypted images.</li>
     * <li>You cannot share images across regions. If you want to share an image across regions, you must copy the image to the destination region and then share the image. For more information, see <a href="https://help.aliyun.com/document_detail/436978.html">CopyImage</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyImagePermission  ModifyImagePermissionRequest
     * @return ModifyImagePermissionResponse
     */
    CompletableFuture<ModifyImagePermissionResponse> modifyImagePermission(ModifyImagePermissionRequest request);

    /**
     * <b>description</b> :
     * <p>When you create a NAS file system, a mount target is automatically generated. By default, the mount target does not need to be changed. If the mount target is deleted by misoperation, you must specify a new mount target for the NAS file system in the workspace. You can call the <a href="https://help.aliyun.com/document_detail/62621.html">CreateMountTarget</a> operation to create a mount target.</p>
     * 
     * @param request the request parameters of ModifyNASDefaultMountTarget  ModifyNASDefaultMountTargetRequest
     * @return ModifyNASDefaultMountTargetResponse
     */
    CompletableFuture<ModifyNASDefaultMountTargetResponse> modifyNASDefaultMountTarget(ModifyNASDefaultMountTargetRequest request);

    /**
     * @param request the request parameters of ModifyNetworkPackageBandwidth  ModifyNetworkPackageBandwidthRequest
     * @return ModifyNetworkPackageBandwidthResponse
     */
    CompletableFuture<ModifyNetworkPackageBandwidthResponse> modifyNetworkPackageBandwidth(ModifyNetworkPackageBandwidthRequest request);

    /**
     * <b>description</b> :
     * <p>If you want to temporarily disable the Internet access of your cloud computer after the Internet access is enabled for your cloud computer, you can disable the premium bandwidth plan and restore it as needed.</p>
     * 
     * @param request the request parameters of ModifyNetworkPackageEnabled  ModifyNetworkPackageEnabledRequest
     * @return ModifyNetworkPackageEnabledResponse
     */
    CompletableFuture<ModifyNetworkPackageEnabledResponse> modifyNetworkPackageEnabled(ModifyNetworkPackageEnabledRequest request);

    /**
     * @param request the request parameters of ModifyOfficeSiteAttribute  ModifyOfficeSiteAttributeRequest
     * @return ModifyOfficeSiteAttributeResponse
     */
    CompletableFuture<ModifyOfficeSiteAttributeResponse> modifyOfficeSiteAttribute(ModifyOfficeSiteAttributeRequest request);

    /**
     * @param request the request parameters of ModifyOfficeSiteCrossDesktopAccess  ModifyOfficeSiteCrossDesktopAccessRequest
     * @return ModifyOfficeSiteCrossDesktopAccessResponse
     */
    CompletableFuture<ModifyOfficeSiteCrossDesktopAccessResponse> modifyOfficeSiteCrossDesktopAccess(ModifyOfficeSiteCrossDesktopAccessRequest request);

    /**
     * @param request the request parameters of ModifyOfficeSiteDnsInfo  ModifyOfficeSiteDnsInfoRequest
     * @return ModifyOfficeSiteDnsInfoResponse
     */
    CompletableFuture<ModifyOfficeSiteDnsInfoResponse> modifyOfficeSiteDnsInfo(ModifyOfficeSiteDnsInfoRequest request);

    /**
     * @param request the request parameters of ModifyOfficeSiteMfaEnabled  ModifyOfficeSiteMfaEnabledRequest
     * @return ModifyOfficeSiteMfaEnabledResponse
     */
    CompletableFuture<ModifyOfficeSiteMfaEnabledResponse> modifyOfficeSiteMfaEnabled(ModifyOfficeSiteMfaEnabledRequest request);

    /**
     * @param request the request parameters of ModifyPolicyGroup  ModifyPolicyGroupRequest
     * @return ModifyPolicyGroupResponse
     */
    CompletableFuture<ModifyPolicyGroupResponse> modifyPolicyGroup(ModifyPolicyGroupRequest request);

    /**
     * @param request the request parameters of ModifyTimerGroup  ModifyTimerGroupRequest
     * @return ModifyTimerGroupResponse
     */
    CompletableFuture<ModifyTimerGroupResponse> modifyTimerGroup(ModifyTimerGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify end users only for cloud computers that are in the Running state.</p>
     * 
     * @param request the request parameters of ModifyUserEntitlement  ModifyUserEntitlementRequest
     * @return ModifyUserEntitlementResponse
     */
    CompletableFuture<ModifyUserEntitlementResponse> modifyUserEntitlement(ModifyUserEntitlementRequest request);

    /**
     * @param request the request parameters of ModifyUserToDesktopGroup  ModifyUserToDesktopGroupRequest
     * @return ModifyUserToDesktopGroupResponse
     */
    CompletableFuture<ModifyUserToDesktopGroupResponse> modifyUserToDesktopGroup(ModifyUserToDesktopGroupRequest request);

    /**
     * @param request the request parameters of MoveCdsFile  MoveCdsFileRequest
     * @return MoveCdsFileResponse
     */
    CompletableFuture<MoveCdsFileResponse> moveCdsFile(MoveCdsFileRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to restart must be in the Running state.</p>
     * 
     * @param request the request parameters of RebootDesktops  RebootDesktopsRequest
     * @return RebootDesktopsResponse
     */
    CompletableFuture<RebootDesktopsResponse> rebootDesktops(RebootDesktopsRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following limits when you change an image:</p>
     * <ul>
     * <li>You can select an image whose OS is different from the OS of the original image. The image change feature is not supported in the following regions: China (Hong Kong), Singapore, and Japan (Tokyo).</li>
     * <li>GPU images and non-GPU images cannot be exchanged. Graphic-based cloud computers can only use GPU-accelerated images. The other cloud computers can only use non-GPU-accelerated images.
     * After the image of a cloud computer is changed, the system uses the new image to initialize the system disk of the cloud computer. This has the following impacts:</li>
     * <li>Data in the system disk of the original cloud computer is cleared. Snapshots that are created based on the system disk of the original cloud computer become unavailable. The system automatically deletes the snapshots.</li>
     * <li>If the OS of the image is changed, the data in the data disk of the original cloud computer is cleared, and the snapshots that are created based on the data disk of the original cloud computer can no longer be used. The system automatically deletes the snapshots. If the OS of the image is not changed, the data in the data disk of the original cloud computer is retained, and the snapshots that are created based on the data disk of the original cloud computer can still be used.</li>
     * </ul>
     * 
     * @param request the request parameters of RebuildDesktops  RebuildDesktopsRequest
     * @return RebuildDesktopsResponse
     */
    CompletableFuture<RebuildDesktopsResponse> rebuildDesktops(RebuildDesktopsRequest request);

    /**
     * @param request the request parameters of RemoveFilePermission  RemoveFilePermissionRequest
     * @return RemoveFilePermissionResponse
     */
    CompletableFuture<RemoveFilePermissionResponse> removeFilePermission(RemoveFilePermissionRequest request);

    /**
     * @param request the request parameters of RemoveUserFromDesktopGroup  RemoveUserFromDesktopGroupRequest
     * @return RemoveUserFromDesktopGroupResponse
     */
    CompletableFuture<RemoveUserFromDesktopGroupResponse> removeUserFromDesktopGroup(RemoveUserFromDesktopGroupRequest request);

    /**
     * @param request the request parameters of RemoveUserFromDesktopOversoldUserGroup  RemoveUserFromDesktopOversoldUserGroupRequest
     * @return RemoveUserFromDesktopOversoldUserGroupResponse
     */
    CompletableFuture<RemoveUserFromDesktopOversoldUserGroupResponse> removeUserFromDesktopOversoldUserGroup(RemoveUserFromDesktopOversoldUserGroupRequest request);

    /**
     * @param request the request parameters of RenewDesktopGroup  RenewDesktopGroupRequest
     * @return RenewDesktopGroupResponse
     */
    CompletableFuture<RenewDesktopGroupResponse> renewDesktopGroup(RenewDesktopGroupRequest request);

    /**
     * @param request the request parameters of RenewDesktopOversoldGroup  RenewDesktopOversoldGroupRequest
     * @return RenewDesktopOversoldGroupResponse
     */
    CompletableFuture<RenewDesktopOversoldGroupResponse> renewDesktopOversoldGroup(RenewDesktopOversoldGroupRequest request);

    /**
     * @param request the request parameters of RenewDesktops  RenewDesktopsRequest
     * @return RenewDesktopsResponse
     */
    CompletableFuture<RenewDesktopsResponse> renewDesktops(RenewDesktopsRequest request);

    /**
     * @param request the request parameters of RenewNetworkPackages  RenewNetworkPackagesRequest
     * @return RenewNetworkPackagesResponse
     */
    CompletableFuture<RenewNetworkPackagesResponse> renewNetworkPackages(RenewNetworkPackagesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to reset only cloud computers in a cloud computer pool.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetDesktops  ResetDesktopsRequest
     * @return ResetDesktopsResponse
     */
    CompletableFuture<ResetDesktopsResponse> resetDesktops(ResetDesktopsRequest request);

    /**
     * <b>description</b> :
     * <p>When you create a NAS file system, a mount target is automatically generated. By default, you do not need to modify the mount target of the NAS file system. If the mount target is disabled, you need to reset the mount target of the NAS file system.</p>
     * 
     * @param request the request parameters of ResetNASDefaultMountTarget  ResetNASDefaultMountTargetRequest
     * @return ResetNASDefaultMountTargetResponse
     */
    CompletableFuture<ResetNASDefaultMountTargetResponse> resetNASDefaultMountTarget(ResetNASDefaultMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the following operations are performed:</p>
     * <ul>
     * <li>The data that you want to retain is backed up.<blockquote>
     * <p>The disk restoration operation is irreversible. After you call this operation, the disk is restored to the status at the point in time when the snapshot was created. Data that is generated between the snapshot creation time and the current time is lost. Before you restore the disk based on the snapshot, make sure that you back up data.</p>
     * </blockquote>
     * </li>
     * <li>The cloud computer to which the disk belongs is stopped.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetSnapshot  ResetSnapshotRequest
     * @return ResetSnapshotResponse
     */
    CompletableFuture<ResetSnapshotResponse> resetSnapshot(ResetSnapshotRequest request);

    /**
     * @param request the request parameters of RevokeCoordinatePrivilege  RevokeCoordinatePrivilegeRequest
     * @return RevokeCoordinatePrivilegeResponse
     */
    CompletableFuture<RevokeCoordinatePrivilegeResponse> revokeCoordinatePrivilege(RevokeCoordinatePrivilegeRequest request);

    /**
     * <b>description</b> :
     * <p>You can use the RunCommand operation to run scripts only on Windows cloud desktops.</p>
     * 
     * @param request the request parameters of RunCommand  RunCommandRequest
     * @return RunCommandResponse
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
     * <b>description</b> :
     * <p>You must call this operation to obtain the verification code that is required when you bind an advanced office network to a CEN instance that belongs to another Alibaba Cloud account. After you call this operation, the system sends a verification code to the email address associated with the Alibaba Cloud account to which the CEN instance belongs.</p>
     * 
     * @param request the request parameters of SendVerifyCode  SendVerifyCodeRequest
     * @return SendVerifyCodeResponse
     */
    CompletableFuture<SendVerifyCodeResponse> sendVerifyCode(SendVerifyCodeRequest request);

    /**
     * @param request the request parameters of SetDesktopGroupScaleTimer  SetDesktopGroupScaleTimerRequest
     * @return SetDesktopGroupScaleTimerResponse
     */
    CompletableFuture<SetDesktopGroupScaleTimerResponse> setDesktopGroupScaleTimer(SetDesktopGroupScaleTimerRequest request);

    /**
     * @param request the request parameters of SetDesktopGroupTimer  SetDesktopGroupTimerRequest
     * @return SetDesktopGroupTimerResponse
     */
    CompletableFuture<SetDesktopGroupTimerResponse> setDesktopGroupTimer(SetDesktopGroupTimerRequest request);

    /**
     * @param request the request parameters of SetDesktopGroupTimerStatus  SetDesktopGroupTimerStatusRequest
     * @return SetDesktopGroupTimerStatusResponse
     */
    CompletableFuture<SetDesktopGroupTimerStatusResponse> setDesktopGroupTimerStatus(SetDesktopGroupTimerStatusRequest request);

    /**
     * @param request the request parameters of SetDesktopMaintenance  SetDesktopMaintenanceRequest
     * @return SetDesktopMaintenanceResponse
     */
    CompletableFuture<SetDesktopMaintenanceResponse> setDesktopMaintenance(SetDesktopMaintenanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only for AD directories, not for RAM directories.</p>
     * 
     * @param request the request parameters of SetDirectorySsoStatus  SetDirectorySsoStatusRequest
     * @return SetDirectorySsoStatusResponse
     */
    CompletableFuture<SetDirectorySsoStatusResponse> setDirectorySsoStatus(SetDirectorySsoStatusRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation only for workspaces of the Active Directory (AD) and convenience account types.</p>
     * 
     * @param request the request parameters of SetIdpMetadata  SetIdpMetadataRequest
     * @return SetIdpMetadataResponse
     */
    CompletableFuture<SetIdpMetadataResponse> setIdpMetadata(SetIdpMetadataRequest request);

    /**
     * @param request the request parameters of SetOfficeSiteSsoStatus  SetOfficeSiteSsoStatusRequest
     * @return SetOfficeSiteSsoStatusResponse
     */
    CompletableFuture<SetOfficeSiteSsoStatusResponse> setOfficeSiteSsoStatus(SetOfficeSiteSsoStatusRequest request);

    /**
     * @param request the request parameters of SetUserProfilePathRules  SetUserProfilePathRulesRequest
     * @return SetUserProfilePathRulesResponse
     */
    CompletableFuture<SetUserProfilePathRulesResponse> setUserProfilePathRules(SetUserProfilePathRulesRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to start must be in the Stopped state.</p>
     * 
     * @param request the request parameters of StartDesktops  StartDesktopsRequest
     * @return StartDesktopsResponse
     */
    CompletableFuture<StartDesktopsResponse> startDesktops(StartDesktopsRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computers that you want to stop must be in the Running state.</p>
     * 
     * @param request the request parameters of StopDesktops  StopDesktopsRequest
     * @return StopDesktopsResponse
     */
    CompletableFuture<StopDesktopsResponse> stopDesktops(StopDesktopsRequest request);

    /**
     * <b>description</b> :
     * <p>When you stop a one-time execution of a command, the command continues to run on the cloud desktops where it has started to run, and will not run on the cloud desktops where it has not started to run.</p>
     * 
     * @param request the request parameters of StopInvocation  StopInvocationRequest
     * @return StopInvocationResponse
     */
    CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request);

    /**
     * <b>description</b> :
     * <p>If TagKey is specified, the new TagValue value overrides the original TagValue value.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnbindConfigGroup  UnbindConfigGroupRequest
     * @return UnbindConfigGroupResponse
     */
    CompletableFuture<UnbindConfigGroupResponse> unbindConfigGroup(UnbindConfigGroupRequest request);

    /**
     * @param request the request parameters of UnbindUserDesktop  UnbindUserDesktopRequest
     * @return UnbindUserDesktopResponse
     */
    CompletableFuture<UnbindUserDesktopResponse> unbindUserDesktop(UnbindUserDesktopRequest request);

    /**
     * @param request the request parameters of UnlockVirtualMFADevice  UnlockVirtualMFADeviceRequest
     * @return UnlockVirtualMFADeviceResponse
     */
    CompletableFuture<UnlockVirtualMFADeviceResponse> unlockVirtualMFADevice(UnlockVirtualMFADeviceRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to manage each image update task. This operation is valid only when the auto-update switch in the image update module for global image updates is turned off. If the auto-update switch is turned on, the switches for each image update task are always turned on. If you want to turn on or off the auto-update switch, go to the Elastic Desktop Service console and choose <strong>Operations &gt; Image Updates</strong> in the left-side navigation pane.</p>
     * 
     * @param request the request parameters of UpdateFotaTask  UpdateFotaTaskRequest
     * @return UpdateFotaTaskResponse
     */
    CompletableFuture<UpdateFotaTaskResponse> updateFotaTask(UpdateFotaTaskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can upload only Windows images.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UploadImage  UploadImageRequest
     * @return UploadImageResponse
     */
    CompletableFuture<UploadImageResponse> uploadImage(UploadImageRequest request);

    /**
     * @param request the request parameters of VerifyCen  VerifyCenRequest
     * @return VerifyCenResponse
     */
    CompletableFuture<VerifyCenResponse> verifyCen(VerifyCenRequest request);

    /**
     * @param request the request parameters of WakeupDesktops  WakeupDesktopsRequest
     * @return WakeupDesktopsResponse
     */
    CompletableFuture<WakeupDesktopsResponse> wakeupDesktops(WakeupDesktopsRequest request);

}
