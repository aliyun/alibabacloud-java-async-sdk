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
     * <p>For office networks based on convenience accounts, if no cloud computers are created within 15 consecutive calendar days, the office network is automatically locked and VPC-related resources are released. To use the office network again, call this operation to unlock it.</p>
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
     * <p>Each device can only be registered under one Alibaba Cloud account. If the device you attempt to register is already registered under another Alibaba Cloud account, an error is returned.</p>
     * 
     * @param request the request parameters of AddDevices  AddDevicesRequest
     * @return AddDevicesResponse
     */
    CompletableFuture<AddDevicesResponse> addDevices(AddDevicesRequest request);

    /**
     * <b>description</b> :
     * <p>You can share a specified folder with other users and set access permissions for the folder.</p>
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
     * @param request the request parameters of AllocateIpAddress  AllocateIpAddressRequest
     * @return AllocateIpAddressResponse
     */
    CompletableFuture<AllocateIpAddressResponse> allocateIpAddress(AllocateIpAddressRequest request);

    /**
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
     * <p>The cloud computer must be in the Running state.</p>
     * 
     * @param request the request parameters of ApproveFotaUpdate  ApproveFotaUpdateRequest
     * @return ApproveFotaUpdateResponse
     */
    CompletableFuture<ApproveFotaUpdateResponse> approveFotaUpdate(ApproveFotaUpdateRequest request);

    /**
     * @param request the request parameters of AssociateIpAddress  AssociateIpAddressRequest
     * @return AssociateIpAddressResponse
     */
    CompletableFuture<AssociateIpAddressResponse> associateIpAddress(AssociateIpAddressRequest request);

    /**
     * @param request the request parameters of AssociateNetworkPackage  AssociateNetworkPackageRequest
     * @return AssociateNetworkPackageResponse
     */
    CompletableFuture<AssociateNetworkPackageResponse> associateNetworkPackage(AssociateNetworkPackageRequest request);

    /**
     * @param request the request parameters of AssociateRouteTable  AssociateRouteTableRequest
     * @return AssociateRouteTableResponse
     */
    CompletableFuture<AssociateRouteTableResponse> associateRouteTable(AssociateRouteTableRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>A CEN instance is available.</li>
     * <li>The office network is an advanced office network, and the account system type is convenience account.<blockquote>
     * <p>An AD office network is already added to a CEN instance during creation. An office network can be added to only one CEN instance.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>The cloud computers must be in the Running state.</li>
     * <li>This operation immediately returns a result. To check whether the assignment is successful, call <a href="https://help.aliyun.com/document_detail/436815.html">DescribeDesktops</a> and check the <code>ManagementFlags</code> response parameter: <code>ASSIGNING</code> indicates that the assignment is in progress, and other values indicate that the assignment is complete.</li>
     * <li>Check whether the assignment is complete every 2 to 5 seconds, for a maximum of 50 seconds. In most cases, the assignment is completed within 1 to 5 seconds.</li>
     * </ul>
     * 
     * @param request the request parameters of BatchModifyEntitlement  BatchModifyEntitlementRequest
     * @return BatchModifyEntitlementResponse
     */
    CompletableFuture<BatchModifyEntitlementResponse> batchModifyEntitlement(BatchModifyEntitlementRequest request);

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
     * @param request the request parameters of CloneCenterPolicy  CloneCenterPolicyRequest
     * @return CloneCenterPolicyResponse
     */
    CompletableFuture<CloneCenterPolicyResponse> cloneCenterPolicy(CloneCenterPolicyRequest request);

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
     * <p>AD directories are used to connect to your enterprise Active Directory (AD) and are suitable for large-scale cloud computer deployments. Connecting to an enterprise AD incurs directory fees. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.</p>
     * 
     * @param request the request parameters of CreateADConnectorDirectory  CreateADConnectorDirectoryRequest
     * @return CreateADConnectorDirectoryResponse
     */
    CompletableFuture<CreateADConnectorDirectoryResponse> createADConnectorDirectory(CreateADConnectorDirectoryRequest request);

    /**
     * <b>description</b> :
     * <p>When you create an AD office network, the system performs automatic creation of an AD Connector to connect to your enterprise AD. You are charged for the AD Connector. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.
     * After you call this operation to create an AD office network, you must complete the AD domain configurations. The procedure is as follows:</p>
     * <ol>
     * <li><p>Configure a conditional forwarder on the DNS server.</p>
     * </li>
     * <li><p>Configure a trust relationship on the AD domain server, and then call <a href="https://help.aliyun.com/document_detail/311258.html">ConfigADConnectorTrust</a> to configure the trust relationship for the AD office network.</p>
     * </li>
     * <li><p>Call <a href="https://help.aliyun.com/document_detail/311259.html">ListUserAdOrganizationUnits</a> to obtain the organizational unit (OU) information of the AD domain, and then call <a href="https://help.aliyun.com/document_detail/311262.html">ConfigADConnectorUser</a> to specify the OU and administrator for the AD office network.</p>
     * <blockquote>
     * <p>When you create an AD office network, if you specify the domain administrator and password (DomainUserName and DomainPassword), you only need to configure the conditional forwarder afterward. If you do not specify the domain administrator and password, you must complete the configurations of the conditional forwarder, trust relationship, and OU as described above.</p>
     * </blockquote>
     * </li>
     * </ol>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/214469.html">Create and manage an AD-based office network</a>.</p>
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
     * <p>Cloud computer templates are classified into system templates and custom templates. System templates are default templates provided by Alibaba Cloud. You can call this operation to create a custom template.</p>
     * 
     * @param request the request parameters of CreateBundle  CreateBundleRequest
     * @return CreateBundleResponse
     */
    CompletableFuture<CreateBundleResponse> createBundle(CreateBundleRequest request);

    /**
     * <b>description</b> :
     * <p>Call this API to create a folder directly in the enterprise cloud disk. To upload a file, call this API to obtain an upload URL. Then use that URL with the <a href="https://help.aliyun.com/document_detail/2247620.html">CompleteCdsFile</a> API to complete the upload.</p>
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
     * @param request the request parameters of CreateCenterPolicy  CreateCenterPolicyRequest
     * @return CreateCenterPolicyResponse
     */
    CompletableFuture<CreateCenterPolicyResponse> createCenterPolicy(CreateCenterPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>The disk team list is synchronized from the EDS client -&gt; User Management -&gt; organization chart. If a user wants to use a team space, you can move the user to the specified organization in the User Management interface. The user can then see the team space menu bar in the disk client.</p>
     * 
     * @param request the request parameters of CreateCloudDriveGroup  CreateCloudDriveGroupRequest
     * @return CreateCloudDriveGroupResponse
     */
    CompletableFuture<CreateCloudDriveGroupResponse> createCloudDriveGroup(CreateCloudDriveGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of enterprise NAS drives. For more information, see <a href="https://help.aliyun.com/document_detail/386301.html">Enterprise NAS drive overview</a>.</p>
     * 
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
     * <ul>
     * <li>For information about the features, common scenarios, limits, and scaling policies of shared cloud computers, see <a href="https://help.aliyun.com/document_detail/290959.html">Shared cloud computers (formerly cloud computer pools) overview</a>.</li>
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
     * <p>Before creating cloud computers, complete the following preparations:</p>
     * <ul>
     * <li>Create an office network (formerly workspace) and users. For related API operations or documentation, refer to:<ul>
     * <li>Convenience office network: <a href="https://help.aliyun.com/document_detail/215416.html">CreateSimpleOfficeSite</a>, <a href="https://help.aliyun.com/document_detail/437832.html">CreateUsers</a>.</li>
     * <li>AD office network: <a href="https://help.aliyun.com/document_detail/215417.html">CreateADConnectorOfficeSite</a>, <a href="https://help.aliyun.com/document_detail/188619.html">Create AD users</a>.</li>
     * </ul>
     * </li>
     * <li>Call <a href="https://help.aliyun.com/document_detail/188889.html">CreatePolicyGroup</a> to create a policy, or confirm that an existing policy is available.
     * <strong>Call examples:</strong><details>
     * <summary>Example of creating with a template</summary></li>
     * </ul>
     * <pre><code>{
     *   &quot;RegionId&quot;: &quot;cn-hangzhou&quot;,
     *   &quot;DesktopName&quot;: &quot;test-desktop-name&quot;,
     *   &quot;Amount&quot;: &quot;1&quot;,
     *   &quot;OfficeSiteId&quot;: &quot;cn-hangzhou+dir-xxx&quot;,// Create an office network in advance
     *   &quot;PolicyGroupId&quot;: &quot;system-all-enabled-policy&quot;,
     *   &quot;ChargeType&quot;: &quot;PostPaid&quot;,
     *   &quot;BundleId&quot;: &quot;b-enterprise_office_8c16g_windows2022&quot;
     * }
     * </code></pre>
     * </details>
     * <details>
     * <summary>Example of creating without a template</summary>
     * ```
     * {
     *   "RegionId": "cn-hangzhou",
     *   "DesktopName": "test-desktop-name",
     *   "Amount": "1",
     *   "OfficeSiteId": "cn-hangzhou+dir-xxx",// Create an office network in advance
     *   "PolicyGroupId": "system-all-enabled-policy",
     *   "ChargeType": "PostPaid",
     *   "DesktopAttachment": {
     *     "ImageId": "desktopimage-windows-server-2022-64-asp",
     *     "SystemDiskSize": "40",
     *     "DataDiskSize": "0",
     *     "DefaultLanguage": "zh-CN",
     *     "DesktopType": "eds.enterprise_office.4c8g"
     *   }
     * }
     * ```
     * </details>
     * <details>
     * <summary>Example of creating a monthly hourly package</summary>
     * ```
     * {
     *   "RegionId": "cn-hangzhou",
     *   "DesktopName": "test-desktop-name",
     *   "Amount": "1",
     *   "OfficeSiteId": "cn-hangzhou+dir-xxx",// Create an office network in advance
     *   "PolicyGroupId": "system-all-enabled-policy",
     *   "ChargeType": "PostPaid",
     *   "DesktopAttachment": {
     *     "ImageId": "desktopimage-windows-server-2022-64-asp",
     *     "SystemDiskSize": "40",
     *     "DataDiskSize": "0",
     *     "DefaultLanguage": "zh-CN",
     *     "DesktopType": "eds.enterprise_office.4c8g"
     *   },
     *   "MonthDesktopSetting": {
     *     "UseDuration": "120"
     *   },
     *   "Period": "1",
     *   "PeriodUnit": "Month"
     * }
     * ```
     * </details>
     * <details>
     * <summary>Example of creating an Agent resource</summary>
     * ```
     * {
     *   "RegionId": "cn-hangzhou",
     *   "BundleId": "b-openclaw-linux",
     *   "DesktopName": "test-desktop-name",
     *   "Amount": "1",
     *   "OfficeSiteId": "cn-hangzhou+dir-xxx",// Create an office network in advance
     *   "ChargeType": "PostPaid",
     *   "DesktopAttachment": {
     *     "DesktopType": "cloud.space.4c.8g"
     *   },
     *   "PurchaseOptions": {
     *     "MonthlyCredits": "120"
     *   },
     *   "Period": "1",
     *   "PeriodUnit": "Month"
     * }
     * ```
     * </details>
     * To have cloud computers automatically run custom command scripts, use the `UserCommands` field to configure custom commands.
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
     * @param request the request parameters of CreateDrive  CreateDriveRequest
     * @return CreateDriveResponse
     */
    CompletableFuture<CreateDriveResponse> createDrive(CreateDriveRequest request);

    /**
     * @param request the request parameters of CreateEcdReportTask  CreateEcdReportTaskRequest
     * @return CreateEcdReportTaskResponse
     */
    CompletableFuture<CreateEcdReportTaskResponse> createEcdReportTask(CreateEcdReportTaskRequest request);

    /**
     * @param request the request parameters of CreateForwardEntry  CreateForwardEntryRequest
     * @return CreateForwardEntryResponse
     */
    CompletableFuture<CreateForwardEntryResponse> createForwardEntry(CreateForwardEntryRequest request);

    /**
     * @param request the request parameters of CreateImage  CreateImageRequest
     * @return CreateImageResponse
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create one NAS file system for each standard office network to share files among cloud computers within the office network.</li>
     * <li>The system performs automatic creation of a general-purpose NAS file system (with storage-optimized and compute-optimized instance storage types, offering capacities of 10 PiB and 1 PiB respectively) and generates a default mount target.</li>
     * <li>The NAS file system uses the pay-as-you-go billing method by default. You are charged for the actual storage usage. You can also purchase resource plans to offset the storage usage.
     * For more information, see <a href="https://help.aliyun.com/document_detail/214481.html">Create shared storage NAS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateNASFileSystem  CreateNASFileSystemRequest
     * @return CreateNASFileSystemResponse
     */
    CompletableFuture<CreateNASFileSystemResponse> createNASFileSystem(CreateNASFileSystemRequest request);

    /**
     * @param request the request parameters of CreateNatGateway  CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     */
    CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request);

    /**
     * @param request the request parameters of CreateNetworkPackage  CreateNetworkPackageRequest
     * @return CreateNetworkPackageResponse
     */
    CompletableFuture<CreateNetworkPackageResponse> createNetworkPackage(CreateNetworkPackageRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/425831.html">pricing</a> of Global Accelerator (GA).</p>
     * 
     * @param request the request parameters of CreateOfficeSiteAccelerator  CreateOfficeSiteAcceleratorRequest
     * @return CreateOfficeSiteAcceleratorResponse
     */
    CompletableFuture<CreateOfficeSiteAcceleratorResponse> createOfficeSiteAccelerator(CreateOfficeSiteAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <p>A cloud computer policy is a collection of rules that primarily includes configurations for cloud computer performance and security, such as basic policies like disk mapping, USB redirection, and watermarks, as well as rules like DNS management. For more information, see <a href="https://help.aliyun.com/document_detail/189345.html">Policy overview</a>.</p>
     * 
     * @param request the request parameters of CreatePolicyGroup  CreatePolicyGroupRequest
     * @return CreatePolicyGroupResponse
     */
    CompletableFuture<CreatePolicyGroupResponse> createPolicyGroup(CreatePolicyGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Cloud computer templates include system templates and custom templates. System templates are default templates provided by Alibaba Cloud. Call this operation to create a custom template.</p>
     * 
     * @param request the request parameters of CreateQosRule  CreateQosRuleRequest
     * @return CreateQosRuleResponse
     */
    CompletableFuture<CreateQosRuleResponse> createQosRule(CreateQosRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Before creating a RAM-type directory, complete the following preparations:</p>
     * <ul>
     * <li>Call <code>CreateVpc</code> to create a virtual private cloud (VPC) in a region supported by cloud computers.</li>
     * <li>Call <code>CreateVSwitch</code> to create a vSwitch in the same VPC. The zone of the vSwitch must be a zone supported by cloud computers in that region. Call <a href="https://help.aliyun.com/document_detail/196648.html">DescribeZones</a> to query the zones supported by Elastic Desktop Service in a specific region.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRAMDirectory  CreateRAMDirectoryRequest
     * @return CreateRAMDirectoryResponse
     */
    CompletableFuture<CreateRAMDirectoryResponse> createRAMDirectory(CreateRAMDirectoryRequest request);

    /**
     * @param request the request parameters of CreateRouteEntry  CreateRouteEntryRequest
     * @return CreateRouteEntryResponse
     */
    CompletableFuture<CreateRouteEntryResponse> createRouteEntry(CreateRouteEntryRequest request);

    /**
     * @param request the request parameters of CreateRouteTable  CreateRouteTableRequest
     * @return CreateRouteTableResponse
     */
    CompletableFuture<CreateRouteTableResponse> createRouteTable(CreateRouteTableRequest request);

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
     * @param request the request parameters of CreateSnatEntry  CreateSnatEntryRequest
     * @return CreateSnatEntryResponse
     */
    CompletableFuture<CreateSnatEntryResponse> createSnatEntry(CreateSnatEntryRequest request);

    /**
     * @param request the request parameters of CreateSubnet  CreateSubnetRequest
     * @return CreateSubnetResponse
     */
    CompletableFuture<CreateSubnetResponse> createSubnet(CreateSubnetRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, note the following items:</p>
     * <ul>
     * <li>Most parameters in the instance launch template are optional. When you create a template, Alibaba Cloud does not strictly verify the existence or validity of parameter values. Parameter values are validated only when you create an instance by using the template.</li>
     * <li>For parameters that have region attributes in the template, if the region does not match when you create a cloud computer by using the template, these parameters do not take effect.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Deleting an MFA device unbinds the MFA device, which is equivalent to resetting or disabling the MFA device. The corresponding AD user must bind a new MFA device the next time they log on to a Cloud Desktop.</p>
     * 
     * @param request the request parameters of CreateVirtualBridge  CreateVirtualBridgeRequest
     * @return CreateVirtualBridgeResponse
     */
    CompletableFuture<CreateVirtualBridgeResponse> createVirtualBridge(CreateVirtualBridgeRequest request);

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
     * @param request the request parameters of DeleteCenterPolicy  DeleteCenterPolicyRequest
     * @return DeleteCenterPolicyResponse
     */
    CompletableFuture<DeleteCenterPolicyResponse> deleteCenterPolicy(DeleteCenterPolicyRequest request);

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
     * <ul>
     * <li>Before calling this operation, make sure that the shared Cloud Desktop does not contain any connected Cloud Desktops or authorized users.</li>
     * <li>For subscription shared Cloud Desktops, if the subscription Cloud Desktops within the pool have not expired, the shared Cloud Desktop cannot be deleted.</li>
     * <li>For pay-as-you-go shared Cloud Desktops, deleting the shared Cloud Desktop also releases the pay-as-you-go Cloud Desktops within it.</li>
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
     * @param request the request parameters of DeleteDrive  DeleteDriveRequest
     * @return DeleteDriveResponse
     */
    CompletableFuture<DeleteDriveResponse> deleteDrive(DeleteDriveRequest request);

    /**
     * @param request the request parameters of DeleteEduRoom  DeleteEduRoomRequest
     * @return DeleteEduRoomResponse
     */
    CompletableFuture<DeleteEduRoomResponse> deleteEduRoom(DeleteEduRoomRequest request);

    /**
     * @param request the request parameters of DeleteForwardEntry  DeleteForwardEntryRequest
     * @return DeleteForwardEntryResponse
     */
    CompletableFuture<DeleteForwardEntryResponse> deleteForwardEntry(DeleteForwardEntryRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Images include system images and custom images. System images cannot be deleted.</li>
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
     * <p>Warning: 
     * If a NAS file system is deleted, data stored in the NAS file system cannot be restored. Proceed with caution when you delete NAS file systems.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNASFileSystems  DeleteNASFileSystemsRequest
     * @return DeleteNASFileSystemsResponse
     */
    CompletableFuture<DeleteNASFileSystemsResponse> deleteNASFileSystems(DeleteNASFileSystemsRequest request);

    /**
     * @param request the request parameters of DeleteNatGateway  DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     */
    CompletableFuture<DeleteNatGatewayResponse> deleteNatGateway(DeleteNatGatewayRequest request);

    /**
     * @param request the request parameters of DeleteNetworkPackages  DeleteNetworkPackagesRequest
     * @return DeleteNetworkPackagesResponse
     */
    CompletableFuture<DeleteNetworkPackagesResponse> deleteNetworkPackages(DeleteNetworkPackagesRequest request);

    /**
     * @param request the request parameters of DeleteOfficeSiteAccelerator  DeleteOfficeSiteAcceleratorRequest
     * @return DeleteOfficeSiteAcceleratorResponse
     */
    CompletableFuture<DeleteOfficeSiteAcceleratorResponse> deleteOfficeSiteAccelerator(DeleteOfficeSiteAcceleratorRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete an office network, make sure that the following operations are complete:</p>
     * <ul>
     * <li>All cloud computers in the office network are released.</li>
     * <li>The data that you want to retain is backed up.<blockquote>
     * <p>Resources and data on cloud computers in an office network cannot be restored after you delete it. Proceed with caution.</p>
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
     * <ul>
     * <li>You cannot delete the cloud computer policy created by the Elastic Desktop Service (EDS) system.</li>
     * <li>You cannot delete the cloud computer policies that are associated with cloud computers.</li>
     * </ul>
     * 
     * @param request the request parameters of DeletePolicyGroups  DeletePolicyGroupsRequest
     * @return DeletePolicyGroupsResponse
     */
    CompletableFuture<DeletePolicyGroupsResponse> deletePolicyGroups(DeletePolicyGroupsRequest request);

    /**
     * @param request the request parameters of DeleteQosRules  DeleteQosRulesRequest
     * @return DeleteQosRulesResponse
     */
    CompletableFuture<DeleteQosRulesResponse> deleteQosRules(DeleteQosRulesRequest request);

    /**
     * @param request the request parameters of DeleteRouteEntry  DeleteRouteEntryRequest
     * @return DeleteRouteEntryResponse
     */
    CompletableFuture<DeleteRouteEntryResponse> deleteRouteEntry(DeleteRouteEntryRequest request);

    /**
     * @param request the request parameters of DeleteRouteTable  DeleteRouteTableRequest
     * @return DeleteRouteTableResponse
     */
    CompletableFuture<DeleteRouteTableResponse> deleteRouteTable(DeleteRouteTableRequest request);

    /**
     * <b>description</b> :
     * <p>If the IDs of the snapshots that you specify do not exist, requests are ignored.</p>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteSnatEntry  DeleteSnatEntryRequest
     * @return DeleteSnatEntryResponse
     */
    CompletableFuture<DeleteSnatEntryResponse> deleteSnatEntry(DeleteSnatEntryRequest request);

    /**
     * @param request the request parameters of DeleteSubnet  DeleteSubnetRequest
     * @return DeleteSubnetResponse
     */
    CompletableFuture<DeleteSubnetResponse> deleteSubnet(DeleteSubnetRequest request);

    /**
     * <b>description</b> :
     * <p>After the template is deleted, cloud computers that were created based on the template are not affected, and resources associated with the template are not affected.</p>
     * 
     * @param request the request parameters of DeleteTemplates  DeleteTemplatesRequest
     * @return DeleteTemplatesResponse
     */
    CompletableFuture<DeleteTemplatesResponse> deleteTemplates(DeleteTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>Deleting an MFA device unbinds the MFA device, which is equivalent to resetting or disabling the MFA device. The corresponding AD user must bind a new MFA device when logging on to Cloud Desktop.</p>
     * 
     * @param request the request parameters of DeleteVirtualBridge  DeleteVirtualBridgeRequest
     * @return DeleteVirtualBridgeResponse
     */
    CompletableFuture<DeleteVirtualBridgeResponse> deleteVirtualBridge(DeleteVirtualBridgeRequest request);

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
     * @param request the request parameters of DescribeCenterPolicyList  DescribeCenterPolicyListRequest
     * @return DescribeCenterPolicyListResponse
     */
    CompletableFuture<DescribeCenterPolicyListResponse> describeCenterPolicyList(DescribeCenterPolicyListRequest request);

    /**
     * @param request the request parameters of DescribeClientEvents  DescribeClientEventsRequest
     * @return DescribeClientEventsResponse
     */
    CompletableFuture<DescribeClientEventsResponse> describeClientEvents(DescribeClientEventsRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud disk team list is synchronized from the Wuying client &gt; User Management &gt; Organization Structure. To use team spaces, shift users to a specified organization in the User Management interface. Users can then see the team space menu bar in the cloud disk client.</p>
     * 
     * @param request the request parameters of DescribeCloudDiskGroupDrives  DescribeCloudDiskGroupDrivesRequest
     * @return DescribeCloudDiskGroupDrivesResponse
     */
    CompletableFuture<DescribeCloudDiskGroupDrivesResponse> describeCloudDiskGroupDrives(DescribeCloudDiskGroupDrivesRequest request);

    /**
     * <b>description</b> :
     * <p>After security protection is enabled, the system automatically scans Cloud Desktop instances for system vulnerabilities on a periodic basis (once a day).</p>
     * 
     * @param request the request parameters of DescribeCloudDiskGroups  DescribeCloudDiskGroupsRequest
     * @return DescribeCloudDiskGroupsResponse
     */
    CompletableFuture<DescribeCloudDiskGroupsResponse> describeCloudDiskGroups(DescribeCloudDiskGroupsRequest request);

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
     * <b>description</b> :
     * <p>This is a centralized API that only supports queries from the Shanghai and Singapore sites.</p>
     * 
     * @param request the request parameters of DescribeDesktopMetadata  DescribeDesktopMetadataRequest
     * @return DescribeDesktopMetadataResponse
     */
    CompletableFuture<DescribeDesktopMetadataResponse> describeDesktopMetadata(DescribeDesktopMetadataRequest request);

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
     * <p>Only data within the last 30 days can be queried.</p>
     * 
     * @param request the request parameters of DescribeDesktopSessions  DescribeDesktopSessionsRequest
     * @return DescribeDesktopSessionsResponse
     */
    CompletableFuture<DescribeDesktopSessionsResponse> describeDesktopSessions(DescribeDesktopSessionsRequest request);

    /**
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
     * @param request the request parameters of DescribeDrives  DescribeDrivesRequest
     * @return DescribeDrivesResponse
     */
    CompletableFuture<DescribeDrivesResponse> describeDrives(DescribeDrivesRequest request);

    /**
     * @param request the request parameters of DescribeEcdReportTasks  DescribeEcdReportTasksRequest
     * @return DescribeEcdReportTasksResponse
     */
    CompletableFuture<DescribeEcdReportTasksResponse> describeEcdReportTasks(DescribeEcdReportTasksRequest request);

    /**
     * @param request the request parameters of DescribeFlowMetric  DescribeFlowMetricRequest
     * @return DescribeFlowMetricResponse
     */
    CompletableFuture<DescribeFlowMetricResponse> describeFlowMetric(DescribeFlowMetricRequest request);

    /**
     * @param request the request parameters of DescribeForwardTableEntries  DescribeForwardTableEntriesRequest
     * @return DescribeForwardTableEntriesResponse
     */
    CompletableFuture<DescribeForwardTableEntriesResponse> describeForwardTableEntries(DescribeForwardTableEntriesRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>China site users should select Shanghai as the site. International site users should select Singapore.</li>
     * <li>By default, both deleted and non-deleted cloud desktops are queried.</li>
     * <li>Deleted cloud desktops can only be queried if they were deleted within the last three months.</li>
     * <li>Sort conditions cannot be used together with other conditions.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeGlobalDesktopRecords  DescribeGlobalDesktopRecordsRequest
     * @return DescribeGlobalDesktopRecordsResponse
     */
    CompletableFuture<DescribeGlobalDesktopRecordsResponse> describeGlobalDesktopRecords(DescribeGlobalDesktopRecordsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation uses a centralized endpoint. The access point is Shanghai or Singapore. Other regions are not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeGlobalTimerBatches  DescribeGlobalTimerBatchesRequest
     * @return DescribeGlobalTimerBatchesResponse
     */
    CompletableFuture<DescribeGlobalTimerBatchesResponse> describeGlobalTimerBatches(DescribeGlobalTimerBatchesRequest request);

    /**
     * @param request the request parameters of DescribeGlobalTimerRecords  DescribeGlobalTimerRecordsRequest
     * @return DescribeGlobalTimerRecordsResponse
     */
    CompletableFuture<DescribeGlobalTimerRecordsResponse> describeGlobalTimerRecords(DescribeGlobalTimerRecordsRequest request);

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
     * <ul>
     * <li>After you run a command, it does not necessarily succeed or produce the expected results. Check the actual execution results based on the response values returned by this operation.</li>
     * <li>You can query execution information from the last two weeks. A maximum of 100,000 execution records are retained.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInvocations  DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    /**
     * @param request the request parameters of DescribeIpAddresses  DescribeIpAddressesRequest
     * @return DescribeIpAddressesResponse
     */
    CompletableFuture<DescribeIpAddressesResponse> describeIpAddresses(DescribeIpAddressesRequest request);

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
     * @param request the request parameters of DescribeNatGateways  DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     */
    CompletableFuture<DescribeNatGatewaysResponse> describeNatGateways(DescribeNatGatewaysRequest request);

    /**
     * @param request the request parameters of DescribeNetworkPackages  DescribeNetworkPackagesRequest
     * @return DescribeNetworkPackagesResponse
     */
    CompletableFuture<DescribeNetworkPackagesResponse> describeNetworkPackages(DescribeNetworkPackagesRequest request);

    /**
     * <b>description</b> :
     * <p>Before deleting an office network, ensure that the following operations are completed:</p>
     * <ul>
     * <li>All cloud computers in the office network are released.</li>
     * <li>Related data that needs to be retained is backed up.<blockquote>
     * <p>Warning: Related resources and data cannot be recovered after deletion. Proceed with caution.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeOfficeSiteBridgeInfo  DescribeOfficeSiteBridgeInfoRequest
     * @return DescribeOfficeSiteBridgeInfoResponse
     */
    CompletableFuture<DescribeOfficeSiteBridgeInfoResponse> describeOfficeSiteBridgeInfo(DescribeOfficeSiteBridgeInfoRequest request);

    /**
     * @param request the request parameters of DescribeOfficeSites  DescribeOfficeSitesRequest
     * @return DescribeOfficeSitesResponse
     */
    CompletableFuture<DescribeOfficeSitesResponse> describeOfficeSites(DescribeOfficeSitesRequest request);

    /**
     * <b>description</b> :
     * <p>Make sure that you are familiar with the resource types and product types of WUYING Workspace before you call this operation.</p>
     * 
     * @param request the request parameters of DescribeOnlineUserCount  DescribeOnlineUserCountRequest
     * @return DescribeOnlineUserCountResponse
     */
    CompletableFuture<DescribeOnlineUserCountResponse> describeOnlineUserCount(DescribeOnlineUserCountRequest request);

    /**
     * <b>description</b> :
     * <p>When multiple filter conditions are specified, only drivers that meet all conditions are returned. If no filter conditions are specified, both Wuying official drivers and drivers of the current account are returned. Use PageSize and PageNumber for pagination. Keep the filter conditions and PageSize unchanged, increment PageNumber page by page, and stop when an empty list is returned. The example values are provided to illustrate the format. Replace them with actual values.</p>
     * <h2>Request examples</h2>
     * <p>The following JSON examples show the logical request parameters. Common signature parameters are generated by the SDK or signing component.</p>
     * <h3>Query official printer drivers</h3>
     * <p>Query official printer drivers of a specified brand that contain a keyword. The first page is returned with a maximum of 20 entries per page.</p>
     * <pre><code class="language-json">{
     *   &quot;Action&quot;: &quot;DescribePeripheralDrivers&quot;,
     *   &quot;Version&quot;: &quot;2020-09-30&quot;,
     *   &quot;OwnerType&quot;: &quot;WUYING&quot;,
     *   &quot;Brand&quot;: &quot;hp&quot;,
     *   &quot;DeviceType&quot;: &quot;printer&quot;,
     *   &quot;Filter&quot;: &quot;LaserJet&quot;,
     *   &quot;PageSize&quot;: 20,
     *   &quot;PageNumber&quot;: 1
     * }
     * </code></pre>
     * <h3>Query drivers by driver ID in batches</h3>
     * <pre><code class="language-json">{
     *   &quot;Action&quot;: &quot;DescribePeripheralDrivers&quot;,
     *   &quot;Version&quot;: &quot;2020-09-30&quot;,
     *   &quot;DriverIds&quot;: [
     *     &quot;11111111-2222-4333-8444-555555555555&quot;,
     *     &quot;66666666-7777-4888-8999-000000000000&quot;
     *   ],
     *   &quot;PageSize&quot;: 20,
     *   &quot;PageNumber&quot;: 1
     * }
     * </code></pre>
     * <p>When you construct request parameters directly, expand DriverIds by sequence number:</p>
     * <pre><code class="language-text">DriverIds.1=11111111-2222-4333-8444-555555555555
     * DriverIds.2=66666666-7777-4888-8999-000000000000
     * </code></pre>
     * <p>When you use an SDK, pass in a string array and the SDK handles the encoding.</p>
     * <h2>Response examples</h2>
     * <p>The following responses are format examples. The icon URLs are for illustration purposes only. The reserved fields MaxResults and NextToken do not provide valid values and are omitted from the examples.</p>
     * <h3>Successful query</h3>
     * <pre><code class="language-json">{
     *   &quot;RequestId&quot;: &quot;00000000-1111-4222-8333-444444444444&quot;,
     *   &quot;Count&quot;: 1,
     *   &quot;DriverInfos&quot;: [
     *     {
     *       &quot;Id&quot;: &quot;11111111-2222-4333-8444-555555555555&quot;,
     *       &quot;Icon&quot;: &quot;https://example.com/icons/printer.png&quot;,
     *       &quot;Name&quot;: &quot;HP Universal Printing PCL 6&quot;,
     *       &quot;Brand&quot;: &quot;hp&quot;,
     *       &quot;DeviceType&quot;: &quot;printer&quot;,
     *       &quot;OsType&quot;: &quot;Windows&quot;,
     *       &quot;CreateTime&quot;: &quot;2026-09-01T10:30:00+08:00&quot;,
     *       &quot;Source&quot;: &quot;Wuying&quot;,
     *       &quot;OwnerType&quot;: &quot;WUYING&quot;
     *     }
     *   ]
     * }
     * </code></pre>
     * <h3>No matching results</h3>
     * <pre><code class="language-json">{
     *   &quot;RequestId&quot;: &quot;00000000-1111-4222-8333-444444444444&quot;,
     *   &quot;Count&quot;: 0,
     *   &quot;DriverInfos&quot;: []
     * }
     * </code></pre>
     * 
     * @param request the request parameters of DescribePeripheralDrivers  DescribePeripheralDriversRequest
     * @return DescribePeripheralDriversResponse
     */
    CompletableFuture<DescribePeripheralDriversResponse> describePeripheralDrivers(DescribePeripheralDriversRequest request);

    /**
     * @param request the request parameters of DescribePolicyGroups  DescribePolicyGroupsRequest
     * @return DescribePolicyGroupsResponse
     */
    CompletableFuture<DescribePolicyGroupsResponse> describePolicyGroups(DescribePolicyGroupsRequest request);

    /**
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
     * <b>description</b> :
     * <p>Security alerts are classified into two dimensions: alerts and anomalies. A security alert contains multiple anomaly events.</p>
     * 
     * @param request the request parameters of DescribePrinterEvents  DescribePrinterEventsRequest
     * @return DescribePrinterEventsResponse
     */
    CompletableFuture<DescribePrinterEventsResponse> describePrinterEvents(DescribePrinterEventsRequest request);

    /**
     * @param request the request parameters of DescribeQosRules  DescribeQosRulesRequest
     * @return DescribeQosRulesResponse
     */
    CompletableFuture<DescribeQosRulesResponse> describeQosRules(DescribeQosRulesRequest request);

    /**
     * @param request the request parameters of DescribeRecordFile  DescribeRecordFileRequest
     * @return DescribeRecordFileResponse
     */
    CompletableFuture<DescribeRecordFileResponse> describeRecordFile(DescribeRecordFileRequest request);

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
     * @param request the request parameters of DescribeResourceByCenterPolicyId  DescribeResourceByCenterPolicyIdRequest
     * @return DescribeResourceByCenterPolicyIdResponse
     */
    CompletableFuture<DescribeResourceByCenterPolicyIdResponse> describeResourceByCenterPolicyId(DescribeResourceByCenterPolicyIdRequest request);

    /**
     * @param request the request parameters of DescribeRouteEntryList  DescribeRouteEntryListRequest
     * @return DescribeRouteEntryListResponse
     */
    CompletableFuture<DescribeRouteEntryListResponse> describeRouteEntryList(DescribeRouteEntryListRequest request);

    /**
     * @param request the request parameters of DescribeRouteTableList  DescribeRouteTableListRequest
     * @return DescribeRouteTableListResponse
     */
    CompletableFuture<DescribeRouteTableListResponse> describeRouteTableList(DescribeRouteTableListRequest request);

    /**
     * @param request the request parameters of DescribeSecurityGroupAttribute  DescribeSecurityGroupAttributeRequest
     * @return DescribeSecurityGroupAttributeResponse
     */
    CompletableFuture<DescribeSecurityGroupAttributeResponse> describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This is a centralized operation that can be called only through the service in the China (Shanghai) region.</li>
     * <li>You can query real-time statistics for up to 1 hour.</li>
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
     * @param request the request parameters of DescribeSnatTableEntries  DescribeSnatTableEntriesRequest
     * @return DescribeSnatTableEntriesResponse
     */
    CompletableFuture<DescribeSnatTableEntriesResponse> describeSnatTableEntries(DescribeSnatTableEntriesRequest request);

    /**
     * @param request the request parameters of DescribeSubnets  DescribeSubnetsRequest
     * @return DescribeSubnetsResponse
     */
    CompletableFuture<DescribeSubnetsResponse> describeSubnets(DescribeSubnetsRequest request);

    /**
     * @param request the request parameters of DescribeTemplates  DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     */
    CompletableFuture<DescribeTemplatesResponse> describeTemplates(DescribeTemplatesRequest request);

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
     * <b>description</b> :
     * <ul>
     * <li>This operation uses a centralized domain name. The access point is in the China (Shanghai) region. Other regions are not supported.</li>
     * <li>The cloud computer status information returned by this operation has a 1 to 3 second delay from the actual values.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeVulDesktops  DescribeVulDesktopsRequest
     * @return DescribeVulDesktopsResponse
     */
    CompletableFuture<DescribeVulDesktopsResponse> describeVulDesktops(DescribeVulDesktopsRequest request);

    /**
     * <b>description</b> :
     * <p>After security protection is enabled, the system automatically scans cloud desktops for system vulnerabilities on a periodic basis (once a day).</p>
     * 
     * @param request the request parameters of DescribeVulnerability  DescribeVulnerabilityRequest
     * @return DescribeVulnerabilityResponse
     */
    CompletableFuture<DescribeVulnerabilityResponse> describeVulnerability(DescribeVulnerabilityRequest request);

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
     * @param request the request parameters of DissociateIpAddress  DissociateIpAddressRequest
     * @return DissociateIpAddressResponse
     */
    CompletableFuture<DissociateIpAddressResponse> dissociateIpAddress(DissociateIpAddressRequest request);

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
     * <p>The cloud desktop list exported by calling this operation is saved as a CSV file. Each cloud desktop record includes the following fields:</p>
     * <ul>
     * <li>Cloud desktop ID/Cloud desktop name</li>
     * <li>Office network ID/Office network name</li>
     * <li>Specifications/System/Protocol</li>
     * <li>System cloud disk/Data cloud disk</li>
     * <li>Status</li>
     * <li>Billing method</li>
     * <li>Expiration time</li>
     * <li>Remaining duration/Total duration</li>
     * <li>Number of assigned users/Current user</li>
     * <li>Office network type</li>
     * <li>Creation time</li>
     * <li>Tags</li>
     * <li>Encrypted or not</li>
     * <li>IP</li>
     * <li>Hostname</li>
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
     * <p>The cloud computer must be in the Running state. The ticket obtained by calling this operation expires in 10 minutes.</p>
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
     * @param request the request parameters of GetSpMetadata  GetSpMetadataRequest
     * @return GetSpMetadataResponse
     */
    CompletableFuture<GetSpMetadataResponse> getSpMetadata(GetSpMetadataRequest request);

    /**
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
     * @param request the request parameters of ListInstalledApps  ListInstalledAppsRequest
     * @return ListInstalledAppsResponse
     */
    CompletableFuture<ListInstalledAppsResponse> listInstalledApps(ListInstalledAppsRequest request);

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
     * <p>You must specify at least one of the following parameters in the request to specify the query object: <code>ResourceId.N</code>, <code>Tag.N.Key</code>, or <code>Tag.N.Value</code>.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTransferFileDownloadUrl  ListTransferFileDownloadUrlRequest
     * @return ListTransferFileDownloadUrlResponse
     */
    CompletableFuture<ListTransferFileDownloadUrlResponse> listTransferFileDownloadUrl(ListTransferFileDownloadUrlRequest request);

    /**
     * @param request the request parameters of ListTransferFiles  ListTransferFilesRequest
     * @return ListTransferFilesResponse
     */
    CompletableFuture<ListTransferFilesResponse> listTransferFiles(ListTransferFilesRequest request);

    /**
     * @param request the request parameters of ListUserAdOrganizationUnits  ListUserAdOrganizationUnitsRequest
     * @return ListUserAdOrganizationUnitsResponse
     */
    CompletableFuture<ListUserAdOrganizationUnitsResponse> listUserAdOrganizationUnits(ListUserAdOrganizationUnitsRequest request);

    /**
     * <b>description</b> :
     * <p>After the device is locked, the status of the MFA device changes to locked (LOCKED), and the corresponding AD account cannot log on to the WUYING terminal because the MFA device cannot be authenticated. You can call <a href="~~UnlockVirtualMFADevice~~">UnlockVirtualMFADevice</a> to unlock the device.</p>
     * 
     * @param request the request parameters of ListVirtualBridges  ListVirtualBridgesRequest
     * @return ListVirtualBridgesResponse
     */
    CompletableFuture<ListVirtualBridgesResponse> listVirtualBridges(ListVirtualBridgesRequest request);

    /**
     * <b>description</b> :
     * <p>After the device is locked, its status changes to Locked. The corresponding AD account cannot log on to the WUYING terminal because MFA authentication fails. You can call <a href="~~UnlockVirtualMFADevice~~">UnlockVirtualMFADevice</a> to unlock the device.</p>
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
     * <p>Only AD office networks in the <code>ERROR</code> or <code>REGISTERING</code> state support modifications to domain name and DNS-related parameters, including <code>DomainName</code>, <code>SubDomainName</code>, <code>DnsAddress.N</code>, and <code>SubDomainDnsAddress.N</code>.</p>
     * 
     * @param request the request parameters of ModifyADConnectorOfficeSite  ModifyADConnectorOfficeSiteRequest
     * @return ModifyADConnectorOfficeSiteResponse
     */
    CompletableFuture<ModifyADConnectorOfficeSiteResponse> modifyADConnectorOfficeSite(ModifyADConnectorOfficeSiteRequest request);

    /**
     * <b>description</b> :
     * <p>You can set different public network access control policies at different granularities to achieve a composite policy effect. For example, you can access control policy at the office network granularity to deny public network access, and access control policy at the specified cloud computer granularity to allow public network access. The result is that all cloud computers in the office network are denied public network access except for the specified cloud computers.</p>
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
     * @param request the request parameters of ModifyCenterPolicy  ModifyCenterPolicyRequest
     * @return ModifyCenterPolicyResponse
     */
    CompletableFuture<ModifyCenterPolicyResponse> modifyCenterPolicy(ModifyCenterPolicyRequest request);

    /**
     * @param request the request parameters of ModifyCloudDriveGroups  ModifyCloudDriveGroupsRequest
     * @return ModifyCloudDriveGroupsResponse
     */
    CompletableFuture<ModifyCloudDriveGroupsResponse> modifyCloudDriveGroups(ModifyCloudDriveGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>When accessing the file storage within WUYING Workspace, file uploads and downloads between them are always allowed because both reside in a secure environment. However, if the visibility of the file storage on WUYING Terminal has been enabled, end users can directly access the file storage through the WUYING Terminal interface.
     * To prevent end users from transferring sensitive data from WUYING Workspace to on-premises devices via the file storage, the default policy allows users to upload files from on-premises devices to the enterprise file storage but prohibits downloading files from the enterprise file storage to on-premises devices. This default policy applies to all users of the file storage, and you do not need to configure its scope.
     * If needed, you can invoke this API to control user permissions for file transfer between the enterprise file storage and on-premises devices. Users added here will be exempt from the default policy.</p>
     * 
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
     * <ul>
     * <li>Before you invoke this operation, make sure that you fully understand the billing methods of cloud desktops. For more information, see <a href="https://help.aliyun.com/document_detail/188395.html">Billing overview</a>.</li>
     * <li>When you invoke this operation, make sure that the cloud desktops are in the Running or Stopped state and that no overdue payments exist.</li>
     * <li>After the order is paid, the system starts to convert the billing method of the cloud desktops. During the conversion, the cloud desktops are in the Upgrade/Downgrade state and do not support other operations such as starting, stopping, or changing specifications.
     * &lt;props=&quot;china&quot;&gt;When you convert the billing method from subscription to pay-as-you-go, refund quota limits apply. For more information, see <a href="https://help.aliyun.com/document_detail/439964.html">Switch from subscription to pay-as-you-go</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDesktopChargeType  ModifyDesktopChargeTypeRequest
     * @return ModifyDesktopChargeTypeResponse
     */
    CompletableFuture<ModifyDesktopChargeTypeResponse> modifyDesktopChargeType(ModifyDesktopChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a shared cloud computer, the system performs automatic creation of the corresponding number of cloud computers in the shared cloud computer based on the scaling policy in Settings and the connection status of end users. These cloud computers use the same cloud computer template and security policy. In different scenarios, you can modify the shared cloud computer configurations as needed, including the shared cloud computer name, cloud computer template, and associated policies.</p>
     * 
     * @param request the request parameters of ModifyDesktopGroup  ModifyDesktopGroupRequest
     * @return ModifyDesktopGroupResponse
     */
    CompletableFuture<ModifyDesktopGroupResponse> modifyDesktopGroup(ModifyDesktopGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Only the hostname of a Windows cloud desktop in an AD office network can be modified. After the hostname is modified, the cloud desktop is rebuilt.</p>
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
     * <p>When you create a cloud computer, you can select specifications by creating a custom template. Enterprise Graphics or High Frequency Office specifications use ESSDs by default and support settings for disk capacity and performance level (PL). You can change the performance level (PL) of the system cloud disk or data cloud disk as needed.</p>
     * <blockquote>
     * <p>Only Enterprise Graphics and High Frequency Office cloud computers support changing the disk performance level (PL).</p>
     * </blockquote>
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
     * <p>When a NAS file system is created, the system automatically generates a mount target. By default, the mount target does not need to be modified. If the mount target is accidentally deleted, you need to specify a new mount target for the NAS file system of the workspace. You can call <a href="https://help.aliyun.com/document_detail/62621.html">CreateMountTarget</a> to create a mount target.</p>
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
     * @param request the request parameters of ModifyOfficeSiteAccelerator  ModifyOfficeSiteAcceleratorRequest
     * @return ModifyOfficeSiteAcceleratorResponse
     */
    CompletableFuture<ModifyOfficeSiteAcceleratorResponse> modifyOfficeSiteAccelerator(ModifyOfficeSiteAcceleratorRequest request);

    /**
     * @param request the request parameters of ModifyOfficeSiteAttribute  ModifyOfficeSiteAttributeRequest
     * @return ModifyOfficeSiteAttributeResponse
     */
    CompletableFuture<ModifyOfficeSiteAttributeResponse> modifyOfficeSiteAttribute(ModifyOfficeSiteAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>Only AD office networks in the <code>ERROR</code> or <code>REGISTERING</code> state support modifications to domain name and DNS-related parameters, including <code>DomainName</code>, <code>SubDomainName</code>, <code>DnsAddress.N</code>, and <code>SubDomainDnsAddress.N</code>.</p>
     * 
     * @param request the request parameters of ModifyOfficeSiteBridgeInfo  ModifyOfficeSiteBridgeInfoRequest
     * @return ModifyOfficeSiteBridgeInfoResponse
     */
    CompletableFuture<ModifyOfficeSiteBridgeInfoResponse> modifyOfficeSiteBridgeInfo(ModifyOfficeSiteBridgeInfoRequest request);

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
     * @param request the request parameters of ModifyQosEntries  ModifyQosEntriesRequest
     * @return ModifyQosEntriesResponse
     */
    CompletableFuture<ModifyQosEntriesResponse> modifyQosEntries(ModifyQosEntriesRequest request);

    /**
     * @param request the request parameters of ModifyQosRule  ModifyQosRuleRequest
     * @return ModifyQosRuleResponse
     */
    CompletableFuture<ModifyQosRuleResponse> modifyQosRule(ModifyQosRuleRequest request);

    /**
     * @param request the request parameters of ModifyResourceCenterPolicy  ModifyResourceCenterPolicyRequest
     * @return ModifyResourceCenterPolicyResponse
     */
    CompletableFuture<ModifyResourceCenterPolicyResponse> modifyResourceCenterPolicy(ModifyResourceCenterPolicyRequest request);

    /**
     * @param request the request parameters of ModifySecurityGroupAttribute  ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     */
    CompletableFuture<ModifySecurityGroupAttributeResponse> modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: To ensure compatibility with the logic for unset parameters and default upgrades in the template, this operation uses a full-parameter update logic. In other words, any parameter that is not specified is treated as being set to empty.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyTemplate  ModifyTemplateRequest
     * @return ModifyTemplateResponse
     */
    CompletableFuture<ModifyTemplateResponse> modifyTemplate(ModifyTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>This operation only modifies the name and description of a custom cloud computer template. To modify the parameters of a custom cloud computer template, use <a href="https://help.aliyun.com/document_detail/2925841.html">ModifyTemplate</a>.</p>
     * 
     * @param request the request parameters of ModifyTemplateBaseInfo  ModifyTemplateBaseInfoRequest
     * @return ModifyTemplateBaseInfoResponse
     */
    CompletableFuture<ModifyTemplateBaseInfoResponse> modifyTemplateBaseInfo(ModifyTemplateBaseInfoRequest request);

    /**
     * @param request the request parameters of ModifyTimerGroup  ModifyTimerGroupRequest
     * @return ModifyTimerGroupResponse
     */
    CompletableFuture<ModifyTimerGroupResponse> modifyTimerGroup(ModifyTimerGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Only cloud computers in the Running state support modifying authorized users.</p>
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
     * <b>description</b> :
     * <p>Deleting an MFA device unbinds the MFA device, which is equivalent to resetting or disabling the MFA device. The corresponding AD user must bind a new MFA device when logging on to a cloud desktop.</p>
     * 
     * @param request the request parameters of ModifyVirtualBridgeLevel  ModifyVirtualBridgeLevelRequest
     * @return ModifyVirtualBridgeLevelResponse
     */
    CompletableFuture<ModifyVirtualBridgeLevelResponse> modifyVirtualBridgeLevel(ModifyVirtualBridgeLevelRequest request);

    /**
     * <b>description</b> :
     * <p>Only custom images in the active (Available) state can be modified.</p>
     * 
     * @param request the request parameters of ModifyVirtualBridgeStatus  ModifyVirtualBridgeStatusRequest
     * @return ModifyVirtualBridgeStatusResponse
     */
    CompletableFuture<ModifyVirtualBridgeStatusResponse> modifyVirtualBridgeStatus(ModifyVirtualBridgeStatusRequest request);

    /**
     * @param request the request parameters of MoveCdsFile  MoveCdsFileRequest
     * @return MoveCdsFileResponse
     */
    CompletableFuture<MoveCdsFileResponse> moveCdsFile(MoveCdsFileRequest request);

    /**
     * @param request the request parameters of QueryActiveUserStatistic  QueryActiveUserStatisticRequest
     * @return QueryActiveUserStatisticResponse
     */
    CompletableFuture<QueryActiveUserStatisticResponse> queryActiveUserStatistic(QueryActiveUserStatisticRequest request);

    /**
     * @param request the request parameters of QueryEndUserHistoryUsage  QueryEndUserHistoryUsageRequest
     * @return QueryEndUserHistoryUsageResponse
     */
    CompletableFuture<QueryEndUserHistoryUsageResponse> queryEndUserHistoryUsage(QueryEndUserHistoryUsageRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>The <code>AliUid</code> parameter is automatically parsed from the AK/SK and does not need to be manually provided.</li>
     * <li><code>BusinessChannel</code> defaults to Enterprise Edition, but you can also select other business channels.</li>
     * <li><code>DataDate</code> supports a custom statistical date and defaults to the previous day (T-1). Ensure that the input format is &quot;YYYY-MM-DD&quot;.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryHistoryActiveUserCount  QueryHistoryActiveUserCountRequest
     * @return QueryHistoryActiveUserCountResponse
     */
    CompletableFuture<QueryHistoryActiveUserCountResponse> queryHistoryActiveUserCount(QueryHistoryActiveUserCountRequest request);

    /**
     * @param request the request parameters of QueryHistoryActiveUserStatistic  QueryHistoryActiveUserStatisticRequest
     * @return QueryHistoryActiveUserStatisticResponse
     */
    CompletableFuture<QueryHistoryActiveUserStatisticResponse> queryHistoryActiveUserStatistic(QueryHistoryActiveUserStatisticRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation retrieves the historical average monitoring metrics of desktop resources filtered by specified conditions within a given time period.</li>
     * <li>The <code>DataDate</code> and <code>EndDate</code> parameters define the query time range. The default value is the previous day.</li>
     * <li>Filtering by desktop ID and name is supported. You can also customize numeric ranges to further refine query results.</li>
     * <li>The response includes detailed information about each matching desktop resource and its corresponding average values.</li>
     * <li>The pagination parameters <code>PageNum</code> and <code>PageSize</code> allow you to control the amount of returned data to meet different display requirements.</li>
     * <li>Note: When using the <code>Ranges</code> parameter, ensure that the provided ranges are reasonable. Otherwise, query performance may be affected or invalid results may be returned.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryHistoryAvgMetricList  QueryHistoryAvgMetricListRequest
     * @return QueryHistoryAvgMetricListResponse
     */
    CompletableFuture<QueryHistoryAvgMetricListResponse> queryHistoryAvgMetricList(QueryHistoryAvgMetricListRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation is used to query the value distribution of a specific monitoring metrics (such as CPU usage or memory usage) within a specified date range. You can obtain more detailed statistics by defining custom value ranges. Enterprise Edition and Commercial Edition business channels are supported. By default, T-1 (yesterday) data statistics are used.</p>
     * <ul>
     * <li><strong>BusinessChannel</strong>: Enterprise Edition by default. Commercial Edition is optional.</li>
     * <li><strong>StartDate &amp; EndDate</strong>: The default value is T-1, which is yesterday\&quot;s date. The format must be &quot;YYYY-MM-DD&quot;.</li>
     * <li><strong>MetricName</strong>: The name of the specific metric to query. Refer to the valid metric list provided in the documentation.</li>
     * <li><strong>Ranges</strong>: Allows you to define multiple custom value ranges for more granular data analytics. You can set the minimum value, maximum value, and whether to include border values for each range.
     * Settings:</li>
     * </ul>
     * 
     * @param request the request parameters of QueryHistoryMetricDistribution  QueryHistoryMetricDistributionRequest
     * @return QueryHistoryMetricDistributionResponse
     */
    CompletableFuture<QueryHistoryMetricDistributionResponse> queryHistoryMetricDistribution(QueryHistoryMetricDistributionRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Date range</strong>: Supports querying data within a maximum of 90 days.</li>
     * <li><strong>Paged query</strong>: Pagination is implemented through the <code>NextToken</code> parameter, which is obtained from the previous response.</li>
     * <li><strong>Default and maximum limits</strong>: 5 records are returned by default, with a maximum of 200.</li>
     * <li><strong>Authentication</strong>: Uses AccessKey for identity verification.</li>
     * <li><strong>Caller account information</strong>: You do not need to manually pass in AliUid. The system automatically parses it.</li>
     * <li><strong>Billing</strong>: This API call is free of charge.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryHistoryUsageDurationRank  QueryHistoryUsageDurationRankRequest
     * @return QueryHistoryUsageDurationRankResponse
     */
    CompletableFuture<QueryHistoryUsageDurationRankResponse> queryHistoryUsageDurationRank(QueryHistoryUsageDurationRankRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computers must be in the Running state.</p>
     * 
     * @param request the request parameters of RebootDesktops  RebootDesktopsRequest
     * @return RebootDesktopsResponse
     */
    CompletableFuture<RebootDesktopsResponse> rebootDesktops(RebootDesktopsRequest request);

    /**
     * <b>description</b> :
     * <p>The change image operation has the following limits:</p>
     * <ul>
     * <li>Cloud computers in Hong Kong (China) and regions outside China do not support changing to an image of a different operating system (for example, changing from a Windows image to a Linux image).</li>
     * <li>Changing between GPU images and non-GPU images is not supported. Graphics-type cloud computers can only use GPU images, and non-graphics-type cloud computers can only use non-GPU images.
     * After the image is changed, the system uses the new image to initialize the system cloud disk of the cloud computer. The impacts are as follows:</li>
     * <li>Data on the original system cloud disk of the cloud computer is cleared. Snapshots created based on the original system cloud disk become unusable, and the system automatically deletes the related snapshots.</li>
     * <li>If the operating system of the image is changed, data on the original data cloud disk of the cloud computer is cleared, snapshots created based on the original data cloud disk become unusable, and the system automatically deletes the related snapshots. If the operating system of the image is not changed, data on the original data cloud disk is retained, and the related snapshots remain usable.</li>
     * </ul>
     * 
     * @param request the request parameters of RebuildDesktops  RebuildDesktopsRequest
     * @return RebuildDesktopsResponse
     */
    CompletableFuture<RebuildDesktopsResponse> rebuildDesktops(RebuildDesktopsRequest request);

    /**
     * @param request the request parameters of ReleaseIpAddress  ReleaseIpAddressRequest
     * @return ReleaseIpAddressResponse
     */
    CompletableFuture<ReleaseIpAddressResponse> releaseIpAddress(ReleaseIpAddressRequest request);

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
     * <p>After the device is locked, the status of the MFA device changes to locked (LOCKED), and the corresponding AD account cannot log on to the WUYING terminal because the MFA device cannot be authenticated. You can call <a href="~~UnlockVirtualMFADevice~~">UnlockVirtualMFADevice</a> to unlock the device.</p>
     * 
     * @param request the request parameters of RenewVirtualBridge  RenewVirtualBridgeRequest
     * @return RenewVirtualBridgeResponse
     */
    CompletableFuture<RenewVirtualBridgeResponse> renewVirtualBridge(RenewVirtualBridgeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to resetting cloud computers within a shared cloud computer. It does not support resetting regular cloud computers.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ResetDesktops  ResetDesktopsRequest
     * @return ResetDesktopsResponse
     */
    CompletableFuture<ResetDesktopsResponse> resetDesktops(ResetDesktopsRequest request);

    /**
     * <b>description</b> :
     * <p>When you create a NAS file system, the system automatically generates a mount point. By default, the mount point does not need to be modified. If the mount point is in an inactive state, you need to reset the mount point of the NAS file system.</p>
     * 
     * @param request the request parameters of ResetNASDefaultMountTarget  ResetNASDefaultMountTargetRequest
     * @return ResetNASDefaultMountTargetResponse
     */
    CompletableFuture<ResetNASDefaultMountTargetResponse> resetNASDefaultMountTarget(ResetNASDefaultMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>When calling this interface, ensure the following:</p>
     * <ul>
     * <li>You must back up any data on the disk that you want to save.<blockquote>
     * <p>Data recovery is an irreversible operation. After you call this interface, the disk will revert to its state at the time the snapshot was created. Any data created between the snapshot creation time and the current time will be lost. Therefore, back up important data.</p>
     * </blockquote>
     * </li>
     * <li>You must shut down the cloud computer to which the disk belongs.</li>
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
     * @param request the request parameters of RunCommand  RunCommandRequest
     * @return RunCommandResponse
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;When adding a premium office network to a CEN instance that belongs to a different Alibaba Cloud account, call this operation first to obtain a verification code. After a successful call, the system sends the verification code to the phone number associated with the Alibaba Cloud account.
     * &lt;props=&quot;intl&quot;&gt;When adding a premium office network to a CEN instance that belongs to a different Alibaba Cloud account, call this operation first to obtain a verification code. After a successful call, the system sends the verification code to the email address associated with the Alibaba Cloud account.</p>
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
     * <b>description</b> :
     * <p>If you need to perform maintenance operations on a cloud computer and want to prevent end users from connecting to and using the cloud computer during this period, you can switch it to maintenance mode.</p>
     * 
     * @param request the request parameters of SetDesktopMaintenance  SetDesktopMaintenanceRequest
     * @return SetDesktopMaintenanceResponse
     */
    CompletableFuture<SetDesktopMaintenanceResponse> setDesktopMaintenance(SetDesktopMaintenanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation has the same function as <a href="~~SetOfficeSiteSsoStatus~~">SetOfficeSiteSsoStatus</a>. We recommend that you use the <code>SetOfficeSiteSsoStatus</code> operation.</p>
     * 
     * @param request the request parameters of SetDirectorySsoStatus  SetDirectorySsoStatusRequest
     * @return SetDirectorySsoStatusResponse
     */
    CompletableFuture<SetDirectorySsoStatusResponse> setDirectorySsoStatus(SetDirectorySsoStatusRequest request);

    /**
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
     * <p>The cloud computers must be in the Stopped state.</p>
     * 
     * @param request the request parameters of StartDesktops  StartDesktopsRequest
     * @return StartDesktopsResponse
     */
    CompletableFuture<StartDesktopsResponse> startDesktops(StartDesktopsRequest request);

    /**
     * <b>description</b> :
     * <p>The cloud computers must be in the Running state.</p>
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
     * <p>If the specified TagKey already exists, the new TagValue overwrites the original TagValue.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of TransferTaskApprovalCallback  TransferTaskApprovalCallbackRequest
     * @return TransferTaskApprovalCallbackResponse
     */
    CompletableFuture<TransferTaskApprovalCallbackResponse> transferTaskApprovalCallback(TransferTaskApprovalCallbackRequest request);

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
     * <p>Only Windows operating system images can be uploaded.</p>
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
     * <b>description</b> :
     * <p>You can wake up only cloud computers that are in the Hibernated state.</p>
     * 
     * @param request the request parameters of WakeupDesktops  WakeupDesktopsRequest
     * @return WakeupDesktopsResponse
     */
    CompletableFuture<WakeupDesktopsResponse> wakeupDesktops(WakeupDesktopsRequest request);

}
