// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.nas20170626.models.*;
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
     * @deprecated OpenAPI AddClientToBlackList is deprecated  * @description This operation supports only CPFS parallel file systems.
     * 
     * @param request the request parameters of AddClientToBlackList  AddClientToBlackListRequest
     * @return AddClientToBlackListResponse
     */
    @Deprecated
    CompletableFuture<AddClientToBlackListResponse> addClientToBlackList(AddClientToBlackListRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * This operation is supported only by Advanced Extreme NAS file systems. Before you call this operation, complete the following preparations:</p>
     * <ul>
     * <li>An Advanced Extreme NAS file system is created. When you invoke the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createfilesystem">CreateFileSystem</a> operation to create the file system, you must configure the following parameter Settings:<ul>
     * <li>FileSystemType: extreme</li>
     * <li>StorageType: advance</li>
     * </ul>
     * </li>
     * <li>An automatic snapshot policy is created. For more information, see <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createautosnapshotpolicy">CreateAutoSnapshotPolicy</a>.</li>
     * <li>You have completed the console authorization for AliyunNASManageENIRole. Before you create an Extreme NAS file system, you must grant authorization to the NAS service-linked role AliyunNASManageENIRole to allow NAS to associate and manage elastic network interfaces (ENIs) and the network interface controller (NIC). For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for NAS</a>.
     * <strong>Usage notes</strong>
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA) protocol</a> is not guaranteed.</li>
     * <li>You can apply only one automatic snapshot policy to a file system.</li>
     * <li>You can apply an automatic snapshot policy to multiple file systems.</li>
     * <li>If an automatic snapshot policy is already applied to the destination file system, you can invoke the ApplyAutoSnapshotPolicy operation to replace the current automatic snapshot policy.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview.</li>
     * <li>You can apply only one automatic snapshot policy to a file system.</li>
     * <li>You can apply an automatic snapshot policy to multiple file systems.</li>
     * <li>If an automatic snapshot policy is already applied to the destination file system, you can call the ApplyAutoSnapshotPolicy operation to replace the current automatic snapshot policy.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyAutoSnapshotPolicy  ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to CPFS file systems.</li>
     * <li>Only CPFS 2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can add an auto-refresh configuration only to data flows in the <code>Running</code> (normal) state.</li>
     * <li>You can add up to five auto-refresh configurations to a data flow.</li>
     * <li>Creating an auto-refresh configuration usually takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> to query the data flow status.</li>
     * <li>Auto-refresh relies on EventBridge to collect object modification events from the source OSS bucket. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.<blockquote>
     * <p>The event buses and event rules that CPFS creates in EventBridge have the description <code>Create for cpfs auto refresh</code>. Do not modify or delete the event buses or event rules. Otherwise, auto-refresh cannot work properly.</p>
     * </blockquote>
     * </li>
     * <li>Auto-refresh applies to a prefix specified by the RefreshPath parameter. When you configure auto-refresh for a prefix in a CPFS data stream, the system creates an event bus in your account and creates an event rule for the prefix of the source OSS bucket. After an object in the prefix of the source OSS bucket is modified, EventBridge generates an OSS event, and the CPFS data stream processes the event.</li>
     * <li>After you configure auto-refresh (AutoRefresh), when data in the source storage changes, automatic synchronization of the changed metadata to the CPFS file system is performed. The changed data is loaded on demand when you access files, or you can start a data stream node to load the data.</li>
     * <li>The auto-refresh interval (AutoRefreshInterval) specifies how often CPFS checks whether data in the prefix of the source OSS bucket is updated. If updates exist, CPFS starts an auto-refresh node. If the frequency of object modification events in the source OSS bucket exceeds the processing capacity of the CPFS data stream, auto-refresh nodes accumulate, metadata updates are delayed, and the data stream status becomes Misconfigured. To resolve this issue, upgrade the data stream specification or reduce the OSS modification frequency.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyDataFlowAutoRefresh  ApplyDataFlowAutoRefreshRequest
     * @return ApplyDataFlowAutoRefreshResponse
     */
    CompletableFuture<ApplyDataFlowAutoRefreshResponse> applyDataFlowAutoRefresh(ApplyDataFlowAutoRefreshRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch execution is supported. In batch execution, only one VscId can be associated with multiple FileSystemIds. That is, the ResourceIds.VscId values must be the same.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachVscToFilesystems  AttachVscToFilesystemsRequest
     * @return AttachVscToFilesystemsResponse
     */
    CompletableFuture<AttachVscToFilesystemsResponse> attachVscToFilesystems(AttachVscToFilesystemsRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.</li>
     * <li>Before you begin: You have applied an automatic snapshot policy to the target Extreme NAS file system by calling <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-applyautosnapshotpolicy">ApplyAutoSnapshotPolicy</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS supports this feature.</li>
     * <li>Before you begin: You have applied an automatic snapshot policy to the target Extreme NAS file system by calling <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-applyautosnapshotpolicy">ApplyAutoSnapshotPolicy</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelAutoSnapshotPolicy  CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Data flows are supported only in CPFS 2.2.0 and later. You can view the version information on the file system details page in the console.</li>
     * <li>You can cancel the auto-update configuration only for data flows in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>Canceling the auto-update configuration typically takes 2 to 5 minutes. You can call the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation to query the status of the cancel task.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDataFlowAutoRefresh  CancelDataFlowAutoRefreshRequest
     * @return CancelDataFlowAutoRefreshResponse
     */
    CompletableFuture<CancelDataFlowAutoRefreshResponse> cancelDataFlowAutoRefresh(CancelDataFlowAutoRefreshRequest request);

    /**
     * <b>description</b> :
     * <p><em>Prerequisite resource creation process</em>*
     * Before you cancel a data flow streaming subtask, create the following resources in order:</p>
     * <ol>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflow-bmcpfs">CreateDataFlow</a> to create a data flow.</li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowtask-bmcpfs">CreateDataFlowTask</a> to create a streaming import (StreamImport) or streaming export (StreamExport) task.</li>
     * <li>Create a data flow streaming subtask: Call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowsubtask-bmcpfs">CreateDataFlowSubTask</a> to create a streaming subtask.<blockquote>
     * <p>CPFS for Lingjun file systems must be created in the console.
     * <strong>Operation description</strong></p>
     * </blockquote>
     * </li>
     * </ol>
     * <ul>
     * <li>Only CPFS for Lingjun 2.6.0 and later are supported. You can view the version information on the file system details page in the console.</li>
     * <li>Prerequisites: A CPFS for Lingjun file system is created, the DataFlow is in the Running state, the DataFlowTask is in the Executing state, and the DataFlowSubTask is in the CREATED or RUNNING state.</li>
     * <li>You can cancel a data flow streaming subtask only when it is in the CREATED or RUNNING state.</li>
     * <li>Data flow streaming tasks are executed asynchronously. You can call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-describedataflowtasks-bmcpfs">DescribeDataFlowSubTasks</a> to query the execution status of a streaming task.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDataFlowSubTask  CancelDataFlowSubTaskRequest
     * @return CancelDataFlowSubTaskResponse
     */
    CompletableFuture<CancelDataFlowSubTaskResponse> cancelDataFlowSubTask(CancelDataFlowSubTaskRequest request);

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*
     * Before you call this operation, create resources in the following order and make sure that the resources at each layer are in the required state:</p>
     * <ol>
     * <li>Create a file system: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a CPFS file system.<ul>
     * <li>State requirement: The file system is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a mount target: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createmounttarget-cpfs">CreateMountTarget</a> to create a mount target.<ul>
     * <li>State requirement: The mount target is in the Active state.</li>
     * </ul>
     * </li>
     * <li>Create a fileset: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfileset-cpfs">CreateFileset</a> to create a fileset.<ul>
     * <li>State requirement: The fileset is created.</li>
     * </ul>
     * </li>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflow-cpfs">CreateDataFlow</a> to create a data flow.<ul>
     * <li>State requirement: The data flow is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflowtask-cpfs">CreateDataFlowTask</a> to create a data flow task.
     * <strong>Operation description</strong></li>
     * </ol>
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data flow tasks. You can view the version information on the file system details page in the console.</li>
     * <li>Only data flow tasks in the <code>Pending</code> state can be canceled.</li>
     * <li>Canceling a data flow task typically takes 5 to 10 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> to query the task execution status.</li>
     * <li>If a streaming data flow task contains running streaming subtasks, the streaming task cannot be canceled. Otherwise, the InvalidStatus.ResourceMismatch error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDataFlowTask  CancelDataFlowTaskRequest
     * @return CancelDataFlowTaskResponse
     */
    CompletableFuture<CancelDataFlowTaskResponse> cancelDataFlowTask(CancelDataFlowTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support the directory quota feature.</p>
     * 
     * @param request the request parameters of CancelDirQuota  CancelDirQuotaRequest
     * @return CancelDirQuotaResponse
     */
    CompletableFuture<CancelDirQuotaResponse> cancelDirQuota(CancelDirQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>Only CPFS for Lingjun 2.7.0 and later support quota cancellation.
     * <strong>Before you begin</strong></p>
     * <ul>
     * <li>This operation is applicable only to CPFS for Lingjun 2.7.0 and later file systems.</li>
     * <li>The fileset feature is available only to whitelisted users. To use this feature, submit a ticket to apply for the fileset whitelist.</li>
     * <li>The file system ID must start with <code>bmcpfs-</code>.</li>
     * <li>Before you call this operation, make sure that a quota is set for the target fileset by calling the <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-setfilesetquota-bmcpfs">SetFilesetQuota</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelFilesetQuota  CancelFilesetQuotaRequest
     * @return CancelFilesetQuotaResponse
     */
    CompletableFuture<CancelFilesetQuotaResponse> cancelFilesetQuota(CancelFilesetQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>This feature is supported only by General-purpose NAS file systems.</p>
     * 
     * @param request the request parameters of CancelLifecycleRetrieveJob  CancelLifecycleRetrieveJobRequest
     * @return CancelLifecycleRetrieveJobResponse
     */
    CompletableFuture<CancelLifecycleRetrieveJobResponse> cancelLifecycleRetrieveJob(CancelLifecycleRetrieveJobRequest request);

    /**
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <ul>
     * <li>This feature is supported only by General-purpose NAS file systems.</li>
     * <li>You can cancel only running tasks. The cancel operation does not take effect on tasks that have reached a terminal state (PartialSuccess: partially successful, Success: successful, Fail: failed, or Cancelled: cancelled).</li>
     * <li>When you cancel a running permanent deletion task, the permanently deleted files cannot be recovered.</li>
     * <li>When you cancel a running file restoration task, you can query the restored files in the file system and the unrestored files in the recycle bin.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelRecycleBinJob  CancelRecycleBinJobRequest
     * @return CancelRecycleBinJobResponse
     */
    CompletableFuture<CancelRecycleBinJobResponse> cancelRecycleBinJob(CancelRecycleBinJobRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>A maximum of 20 permission groups can be created per Alibaba Cloud account in a single region.</li>
     * <li>A maximum of 300 rules can be added to a permission group.</li>
     * <li>Only permission groups of the VPC network type can be created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccessGroup  CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     */
    CompletableFuture<CreateAccessGroupResponse> createAccessGroup(CreateAccessGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you invoke the CreateAccessPoint operation to create an access point, some resources are generated asynchronously. Therefore, after you successfully execute the CreateAccessPoint operation, invoke the <a href="https://help.aliyun.com/document_detail/2712239.html">DescribeAccessPoints</a> or <a href="https://help.aliyun.com/document_detail/2712240.html">DescribeAccessPoint</a> operation to query the status of the access point. Wait until the access point enters the <strong>Active</strong> state before you mount the file system. Otherwise, the mount operation may fail.</li>
     * <li>Only General-purpose NAS NFS file systems support this feature.</li>
     * <li>If you enable the RAM policy (EnabledRam), you must configure the corresponding RAM permissions. For more information, see <a href="https://help.aliyun.com/document_detail/2545998.html">Manage access points</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccessPoint  CreateAccessPointRequest
     * @return CreateAccessPointResponse
     */
    CompletableFuture<CreateAccessPointResponse> createAccessPoint(CreateAccessPointRequest request);

    /**
     * <b>description</b> :
     * <p>A single permission group supports up to 300 rules.</p>
     * 
     * @param request the request parameters of CreateAccessRule  CreateAccessRuleRequest
     * @return CreateAccessRuleResponse
     */
    CompletableFuture<CreateAccessRuleResponse> createAccessRule(CreateAccessRuleRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Before calling this operation, complete the following preparations:</p>
     * <ol>
     * <li><strong>An Agentic file system is created</strong>: When calling <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system, set the following parameters:<ul>
     * <li><code>FileSystemType</code>: Set to <code>standard</code>.</li>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. Go to the <a href="https://nasnext.console.aliyun.com/">NAS console</a> to view the available regions and zones, or contact Alibaba Cloud technical support for the latest list of supported regions.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Complete call chain example:<ol>
     * <li>Call CreateFileSystem to create an Agentic file system (FileSystemType=standard, StorageType=Agentic, ProtocolType=NFS).</li>
     * <li>After the file system is created and its status changes to Running, call this CreateAgenticSpace operation to create an Agentic space.</li>
     * <li>To modify the configurations of the Agentic space, call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-modifyagenticspace">ModifyAgenticSpace</a> operation.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateAgenticSpace  CreateAgenticSpaceRequest
     * @return CreateAgenticSpaceResponse
     */
    CompletableFuture<CreateAgenticSpaceResponse> createAgenticSpace(CreateAgenticSpaceRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>You can create up to 100 automatic snapshot policies per region for each Alibaba Cloud account.</li>
     * <li>If a file system contains a large amount of data and the time required to create an automatic snapshot exceeds the interval between two scheduled time points, the next time point is automatically skipped. For example, you set 09:00, 10:00, 11:00, and 12:00 as the automatic snapshot time points. Because the file system contains a large amount of data, the snapshot creation starts at 09:00 and is completed at 10:20, which takes 80 minutes. The system skips the 10:00 time point and continues to create an automatic snapshot at 11:00.</li>
     * <li>Each file system supports up to 128 automatic snapshots. After the snapshot quota is reached, the system automatically deletes the earliest automatic snapshots. Manual snapshots are not affected.</li>
     * <li>When you modify the retention period of an automatic snapshot policy, the modification takes effect only on new snapshots. Existing snapshots retain their original retention period.</li>
     * <li>If an automatic snapshot is being created for a file system, you must wait until the automatic snapshot is completed before you can manually create a snapshot.</li>
     * <li>Automatic snapshot policies cannot be executed on file systems that are not in the Normal state.</li>
     * <li>Automatic snapshots follow a unified naming format: <code>auto_yyyyMMdd_X</code>. In this format, <code>auto</code> indicates an automatic snapshot, which distinguishes it from manual snapshots. <code>yyyyMMdd</code> indicates the date when the snapshot is created, where <code>y</code> indicates the year, <code>M</code> indicates the month, and <code>d</code> indicates the day. <code>X</code> indicates the sequence number of the automatic snapshot created on that day. For example, <code>auto_20201018_1</code> indicates the first automatic snapshot created on October 18, 2020.</li>
     * <li>A created automatic snapshot policy can be applied to any file system by calling ApplyAutoSnapshotPolicy, and the policy content can be modified by calling ModifyAutoSnapshotPolicy.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>You can create up to 100 automatic snapshot policies per region for each Alibaba Cloud account.</li>
     * <li>If a file system contains a large amount of data and the time required to create an automatic snapshot exceeds the interval between two scheduled time points, the next time point is automatically skipped. For example, you set 09:00, 10:00, 11:00, and 12:00 as the automatic snapshot time points. Because the file system contains a large amount of data, the snapshot creation starts at 09:00 and is completed at 10:20, which takes 80 minutes. The system skips the 10:00 time point and continues to create an automatic snapshot at 11:00.</li>
     * <li>Each file system supports up to 128 automatic snapshots. After the snapshot quota is reached, the system automatically deletes the earliest automatic snapshots. Manual snapshots are not affected.</li>
     * <li>When you modify the retention period of an automatic snapshot policy, the modification takes effect only on new snapshots. Existing snapshots retain their original retention period.</li>
     * <li>If an automatic snapshot is being created for a file system, you must wait until the automatic snapshot is completed before you can manually create a snapshot.</li>
     * <li>Automatic snapshot policies cannot be executed on file systems that are not in the Normal state.</li>
     * <li>Automatic snapshots follow a unified naming format: <code>auto_yyyyMMdd_X</code>. In this format, <code>auto</code> indicates an automatic snapshot, which distinguishes it from manual snapshots. <code>yyyyMMdd</code> indicates the date when the snapshot is created, where <code>y</code> indicates the year, <code>M</code> indicates the month, and <code>d</code> indicates the day. <code>X</code> indicates the sequence number of the automatic snapshot created on that day. For example, <code>auto_20201018_1</code> indicates the first automatic snapshot created on October 18, 2020.</li>
     * <li>A created automatic snapshot policy can be applied to any file system by calling ApplyAutoSnapshotPolicy, and the policy content can be modified by calling ModifyAutoSnapshotPolicy.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAutoSnapshotPolicy  CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Creates an access point for CPFS for Lingjun.</p>
     * 
     * @param request the request parameters of CreateCpfsAccessPoint  CreateCpfsAccessPointRequest
     * @return CreateCpfsAccessPointResponse
     */
    CompletableFuture<CreateCpfsAccessPointResponse> createCpfsAccessPoint(CreateCpfsAccessPointRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable to the following services:<table>
     * <thead>
     * <tr>
     * <th>Service</th>
     * <th>File system ID format</th>
     * <th>Minimum version that supports data flows</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td><strong>General-purpose CPFS</strong></td>
     * <td>Starts with <code>cpfs-</code>, such as cpfs-125487****</td>
     * <td>2.2.0 and later</td>
     * </tr>
     * <tr>
     * <td><strong>CPFS for Lingjun</strong></td>
     * <td>Starts with <code>bmcpfs-</code>, such as bmcpfs-0015****</td>
     * <td>2.4.0 and later</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>: General-purpose CPFS and CPFS for Lingjun share the same set of API operations, but differ in parameter values and supported features. Refer to the corresponding section based on the service you use.</p>
     * </blockquote>
     * </li>
     * <li>Basic operations<ul>
     * <li>You can create a data flow only when the General-purpose CPFS or CPFS for Lingjun file system is in the Running state.</li>
     * <li>You can create a maximum of <strong>10</strong> data flows for a General-purpose CPFS or CPFS for Lingjun file system.</li>
     * <li>Creating a data flow typically takes 2 to 5 minutes. You can call the <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> operation to check whether the data flow is created.</li>
     * </ul>
     * </li>
     * <li>Permissions.
     *   When you create a data flow, Cloud Parallel File Storage assumes the <code>AliyunServiceRoleForNasOssDataflow</code> and <code>AliyunServiceRoleForNasEventNotification</code> service-linked roles to associate the service for the data stream. For more information, see <a href="https://help.aliyun.com/document_detail/185138.html">Service-linked roles for Cloud Parallel File Storage</a>.</li>
     * <li>Usage notes for General-purpose CPFS.
     *    This section applies to General-purpose CPFS file systems whose IDs start with <code>cpfs-</code>.<ul>
     * <li>Billing<ul>
     * <li>You are billed for a data flow based on the data flow bandwidth. For more information, see <a href="https://help.aliyun.com/document_detail/111858.html">Billing of General-purpose CPFS</a>.</li>
     * <li>If you enable auto-refresh, EventBridge is used to collect object modification events from the source OSS bucket. You are billed for these events. For more information, see <a href="https://help.aliyun.com/document_detail/163752.html">Billing of EventBridge</a>.</li>
     * </ul>
     * </li>
     * <li>Data flow specifications<ul>
     * <li>The data flow bandwidth (Throughput) supports three specifications: 600 MB/s, 1200 MB/s, and 1500 MB/s. The data flow bandwidth is the maximum transmission bandwidth that the data flow can achieve when importing or exporting data.</li>
     * <li>Creating a data flow consumes one vSwitch IP address used by a General-purpose Cloud Parallel File Storage mount target. Make sure that the vSwitch has sufficient IP addresses.</li>
     * <li>Resource check: If you set the DryRun Settings parameter to true, the system checks whether the resources required to create a data flow (data stream) of the specified specification are sufficient.</li>
     * </ul>
     * </li>
     * <li>Fileset<ul>
     * <li>The destination of a data flow is a fileset in a General-purpose CPFS file system. A fileset is a new directory tree structure in a General-purpose CPFS file system. It is a small file system within the parent file system and has an independent inode space and management capabilities.</li>
     * <li>The fileset must already exist when you create a data flow, and it cannot be nested with other filesets. You can create only one data flow on a fileset, which corresponds to one source storage.</li>
     * <li>A fileset can contain a maximum of 1 million files. If the number of files imported from the OSS bucket exceeds this limit, a <code>no space</code> error is reported when you create new files.<blockquote>
     * <p>If the fileset already contains data, the existing data in the fileset is cleared and replaced with the data synchronized from the OSS bucket after the data flow is created.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Auto-refresh<ul>
     * <li>After you configure auto-refresh, when the data in the source storage changes, the changed metadata undergoes automatic synchronization to the General-purpose Cloud Parallel File Storage file system. The changed data is loaded on demand when users access the files, or you can start a data flow node to load the data.</li>
     * <li>Auto-refresh relies on EventBridge to collect object modification events from the source OSS bucket. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.</li>
     * <li>The scope of auto-refresh is a prefix, which is specified by the RefreshPath parameter. You can configure a maximum of five auto-refresh folders for a data flow (data stream).</li>
     * <li>The auto-refresh interval (AutoRefreshInterval) is the time interval configured in the Settings by General-purpose Cloud Parallel File Storage to check whether data updates exist within the prefix in the source OSS bucket. If data updates exist, an auto-refresh node is started. If the frequency of object modification events in the source OSS bucket exceeds the processing capability of the General-purpose Cloud Parallel File Storage data flow, auto-refresh nodes accumulate, metadata updates are delayed, and the status of the data flow becomes <code>Misconfigured</code>. To resolve this issue, you can upgrade the data flow specification or reduce the modification frequency in the OSS bucket.</li>
     * <li>When you configure auto-refresh for a prefix in a General-purpose Cloud Parallel File Storage data flow, an event bus is created on the user side, and an event rule is created for the prefix of the source OSS bucket. When an object in the prefix of the source OSS bucket is modified, an OSS event is generated in EventBridge and processed by the General-purpose Cloud Parallel File Storage data flow.<blockquote>
     * <p>The event bus and event rule created by General-purpose Cloud Parallel File Storage in EventBridge contain the <code>Create for cpfs auto refresh</code> description. You cannot modify or delete the event bus or event rule. Otherwise, auto-refresh cannot remain in a Normal state.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Source storage<ul>
     * <li>Only OSS is supported Cloud Parallel File Storage. The source storage (SourceStorage) of a data flow must be an OSS bucket.</li>
     * <li>General-purpose CPFS data flows support encrypted and unencrypted access to OSS. If you select the encrypted (SSL) access method, make sure that encryption in transit is enabled for the OSS bucket.</li>
     * <li>If multiple General-purpose CPFS data flows or multiple data flows of the same General-purpose CPFS file system use the same OSS bucket Cloud Parallel File Storage, you must enable versioning for the OSS bucket to prevent data conflicts when multiple General-purpose CPFS file systems export data to the same source.</li>
     * <li>Cross-region OSS data flows are not supported. The OSS bucket must be in the same region as the General-purpose CPFS file system.<blockquote>
     * <p>Before you create a data flow, you must add a tag (key: cpfs-dataflow, value: true) to the source OSS bucket so that the General-purpose CPFS data flow can access the data in the bucket. Do not delete or modify this tag while the data flow is in use. Otherwise, the General-purpose CPFS data flow cannot access the data in the bucket.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Usage notes for CPFS for Lingjun.
     *    This section applies to CPFS for Lingjun file systems whose IDs start with <code>bmcpfs-</code>.<ul>
     * <li>Source storage<ul>
     * <li>Only OSS is supported as the source storage. The source storage (SourceStorage) of a data flow must be an OSS bucket.</li>
     * <li>CPFS for Lingjun data flows support encrypted and unencrypted access to OSS. If you select the encrypted (SSL) access method, make sure that encryption in transit is enabled for the OSS bucket.</li>
     * <li>If multiple CPFS for Lingjun data flows or multiple data flows of the same CPFS for Lingjun file system use the same OSS bucket as the source storage, you must enable versioning for the OSS bucket to prevent data conflicts when multiple CPFS for Lingjun file systems export data to the same source.</li>
     * <li>Cross-region OSS data flows are not supported. The OSS bucket must be in the same region as the CPFS for Lingjun file system.</li>
     * <li>CPFS for Lingjun 2.6.0 and later support creating data flows by using cross-account OSS buckets.</li>
     * <li>You need to set the account id parameter only when you use a cross-account OSS bucket.</li>
     * <li>Before you use a cross-account OSS bucket, you must grant permissions to the account. For more information, see <a href="https://help.aliyun.com/document_detail/2713462.html">Authorize cross-account data flows</a>.<blockquote>
     * <p>Before you create a data flow, you must add a tag (key: cpfs-dataflow, value: true) to the source OSS bucket so that the CPFS for Lingjun data flow can access the data in the bucket. Do not delete or modify this tag while the data flow is in use. Otherwise, the CPFS for Lingjun data flow cannot access the data in the bucket.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Limits of data flows on file systems.<ul>
     * <li>You cannot rename a non-empty directory in the file system path associated with the data flow. Otherwise, a Permission Denied or Directory Not Empty error is reported.</li>
     * <li>Use special characters in directory and file names with caution. Supported characters include uppercase and lowercase letters, digits, exclamation marks (!), hyphens (-), underscores (_), periods (.), asterisks (*), and parentheses (()).</li>
     * <li>Ultra-long paths are not supported. The maximum path length supported by a data flow is 1,023 characters.</li>
     * </ul>
     * </li>
     * <li>Limits on data flow imports.<ul>
     * <li>When a symbolic link file is imported into CPFS for Lingjun, it is converted into a regular file containing data, and the symbolic link information is lost.</li>
     * <li>If an OSS bucket has multiple versions, only the latest version is copied.</li>
     * <li>File or subdirectory names longer than 255 bytes are not supported.</li>
     * </ul>
     * </li>
     * <li>Data flow export limits</li>
     * <li>Limits on data flow exports<ul>
     * <li>After a symlink file is synchronized to OSS, the file pointed to by the symlink is not synchronized. Instead, the symlink file becomes a regular empty object without data.</li>
     * <li>Hardlink files are synchronized to OSS only as regular files.</li>
     * <li>When socket, device, or pipe files are exported to an OSS bucket, they become regular empty objects without data.</li>
     * <li>Directory paths longer than 1,023 characters are not supported.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataFlow  CreateDataFlowRequest
     * @return CreateDataFlowResponse
     */
    CompletableFuture<CreateDataFlowResponse> createDataFlow(CreateDataFlowRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Before you call this operation, create resources in the following order and make sure that the resources at each level are in the required state:</p>
     * <ol>
     * <li>Create a file system: Create a CPFS for Lingjun file system in the console.<ul>
     * <li>State requirement: The file system is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflow-cpfs">CreateDataFlow</a> to create a data flow.<ul>
     * <li>State requirement: The data flow is in the Running state.</li>
     * </ul>
     * </li>
     * <li>Create a data flow task: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createdataflowtask-cpfs">CreateDataFlowTask</a> to create a streaming import (StreamImport) or streaming export (StreamExport) task.<ul>
     * <li>State requirement: The data flow task is in the Executing state.
     * <strong>Operation description</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>Only CPFS for Lingjun 2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</li>
     * <li>You can create subtasks only for data flow streaming tasks that are in the Executing state.</li>
     * <li>Data flow streaming tasks are executed asynchronously. You can call <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-describedataflowsubtasks-bmcpfs">DescribeDataFlowSubTasks</a> to query the execution status of a streaming task.</li>
     * <li>When the data flow task type is a streaming task, the Executing state only indicates that you can create streaming import or streaming export tasks. It does not indicate that the import or export task is running.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataFlowSubTask  CreateDataFlowSubTaskRequest
     * @return CreateDataFlowSubTaskResponse
     */
    CompletableFuture<CreateDataFlowSubTaskResponse> createDataFlowSubTask(CreateDataFlowSubTaskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>CPFS usage notes<ul>
     * <li>Only CPFS 2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>Data flow tasks are executed asynchronously. You can call the <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> operation to query the task execution status. The time required to complete a task depends on the amount of data to be imported or exported. For a large amount of data, split the data into multiple tasks.</li>
     * <li>You can create data flow tasks only for data flows in the Running state.</li>
     * <li>When you manually execute a data flow task, the automatic data update task of the data flow is interrupted and queued.</li>
     * <li>When you create an export task, ensure that the total length of the absolute paths of the files to be exported from CPFS does not exceed 1,023 characters.</li>
     * </ul>
     * </li>
     * <li>CPFS for Lingjun usage notes<ul>
     * <li>Only CPFS for Lingjun 2.4.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>Data flow tasks are executed asynchronously. You can call the <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> operation to query the task execution status. The time required to complete a task depends on the amount of data to be imported or exported. For a large amount of data, split the data into multiple tasks.</li>
     * <li>You can create data flow tasks only for data flows in the Running state.</li>
     * <li>When you create an export task, ensure that the total length of the absolute paths of the files to be exported from CPFS for Lingjun does not exceed 1,023 characters.</li>
     * <li>CPFS for Lingjun supports batch tasks and streaming tasks. For more information, see <a href="https://help.aliyun.com/document_detail/2845429.html">Task types</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataFlowTask  CreateDataFlowTaskRequest
     * @return CreateDataFlowTaskResponse
     */
    CompletableFuture<CreateDataFlowTaskResponse> createDataFlowTask(CreateDataFlowTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * @param request the request parameters of CreateDir  CreateDirRequest
     * @return CreateDirResponse
     */
    CompletableFuture<CreateDirResponse> createDir(CreateDirRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API operation is available only to selected users.</li>
     * <li>This operation supports only General-purpose NAS file systems of the SMB Protocol Type that have access control enabled. You must also activate Alibaba Cloud Key Management Service (KMS).</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before you call this API operation to create a file, you must complete the following four prerequisite steps:</p>
     * <ol>
     * <li><strong>Create a General-purpose NAS file system that uses the SMB protocol</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createfilesystem">CreateFileSystem</a> operation and set ProtocolType to SMB to create a General-purpose NAS file system that supports the SMB protocol.</li>
     * <li><strong>Activate KMS</strong>: Activate KMS by using one of the following methods:<ul>
     * <li>Call the Kms.OpenKmsService API operation.</li>
     * <li>Go to the <a href="https://common-buy.aliyun.com/?commodityCode=kms#/open">console to activate the service</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Enable SMB ACL</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-enablesmbacl">EnableSmbAcl</a> operation to enable the SMB ACL feature. Recommended configurations:<ul>
     * <li>AuthMethod=NTLM</li>
     * <li>AuthCenter=EDS</li>
     * <li>This configuration does not require an AD domain Keytab and is easier to use.</li>
     * </ul>
     * </li>
     * <li><strong>Call CreateFile</strong>: After you complete the preceding prerequisite steps, call this API operation to create a directory or a file.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateFile  CreateFileRequest
     * @return CreateFileResponse
     */
    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before calling this operation, make sure that you fully understand the billing methods and pricing of File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing overview</a> and <a href="https://www.aliyun.com/price/product?#/nas/">Pricing</a>.</li>
     * <li>To create a file system, you must pass real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>When you invoke this operation, the service-linked role required for the operation is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for NAS</a>.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>Before calling this operation, make sure that you fully understand the billing methods and pricing of File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing overview</a> and <a href="https://www.alibabacloud.com/zh/product/nas/pricing?_p_lc=1&spm=a2796.7960336.8215766810.64.414bb91aiZQiRG&spm=a2c4g.11186623.help-menu-27516.d_5_1_4_2_0.572a1880hEiKCk">Pricing</a>.</li>
     * <li>To create a file system, you must pass real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>When you invoke this operation, the service-linked role required for the operation is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for NAS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFileSystem  CreateFileSystemRequest
     * @return CreateFileSystemResponse
     */
    CompletableFuture<CreateFileSystemResponse> createFileSystem(CreateFileSystemRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>CPFS usage notes.<ul>
     * <li>Only CPFS 2.2.0 and later support Fileset creation. You can view the version information on the file system details page in the console.</li>
     * <li>A single CPFS file system supports the creation of up to 10 Filesets.</li>
     * <li>The parent directory must be an existing directory.</li>
     * <li>The maximum supported depth of a Fileset path is 8 levels. The root directory / is level 0. For example, if the Fileset path is /test/aaa/ccc/, the path depth is 3 levels.</li>
     * <li>You cannot nest Filesets. If a parent directory is already specified as a Fileset, its subdirectories cannot be specified as Filesets.</li>
     * <li>A Fileset supports up to 1 million files. If the number of files exceeds this limit, adding a new file returns the <code>no space</code> error message.</li>
     * </ul>
     * </li>
     * <li>CPFS for Lingjun usage notes<ul>
     * <li>Only CPFS for Lingjun 2.7.0 and later support Fileset creation. You can view the version information on the file system details page in the console.</li>
     * <li>A single CPFS for Lingjun file system supports the creation of up to 500 Filesets.</li>
     * <li>The Fileset path must be a new path and cannot be an existing path. Fileset paths cannot be renamed and cannot be symbolic links.</li>
     * <li>The maximum supported depth of a Fileset path is 8 levels. The root directory / is level 0. For example, if the Fileset path is /test/aaa/ccc/, the path depth is 3 levels.</li>
     * <li>If the Fileset path contains multiple directory levels, the parent directory must be an existing directory.</li>
     * <li>You cannot nest Filesets. If a parent directory is already specified as a Fileset, its subdirectories cannot be specified as Filesets. Each Fileset path supports only one quota.</li>
     * <li>For the Fileset capacity quota, the minimum initial value is 10 GiB, and the expansion unit is 1 GiB.</li>
     * <li>A Fileset supports up to 10 billion files or directories. The minimum initial value is 10,000, and the expansion unit is 1.</li>
     * <li>When you modify a directory quota, the configured quota capacity or file count must be greater than the used capacity or file count.</li>
     * <li>Quota statistics have a 15-minute delay. The current actual usage is reflected only after 15 minutes.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateFileset  CreateFilesetRequest
     * @return CreateFilesetResponse
     */
    CompletableFuture<CreateFilesetResponse> createFileset(CreateFilesetRequest request);

    /**
     * @deprecated OpenAPI CreateLDAPConfig is deprecated  * @param request  the request parameters of CreateLDAPConfig  CreateLDAPConfigRequest
     * @return CreateLDAPConfigResponse
     */
    @Deprecated
    CompletableFuture<CreateLDAPConfigResponse> createLDAPConfig(CreateLDAPConfigRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems and CPFS for Lingjun support the creation of lifecycle management policies.</li>
     * <li>You can create up to 10 Auto-type and 100 OnDemand-type lifecycle management policies for each CPFS for Lingjun file system.</li>
     * <li>You can create up to 20 lifecycle management policies for General-purpose NAS in each region.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLifecyclePolicy  CreateLifecyclePolicyRequest
     * @return CreateLifecyclePolicyResponse
     */
    CompletableFuture<CreateLifecyclePolicyResponse> createLifecyclePolicy(CreateLifecyclePolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>Each Alibaba Cloud account can have up to 20 running data retrieval tasks in the same region.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLifecycleRetrieveJob  CreateLifecycleRetrieveJobRequest
     * @return CreateLifecycleRetrieveJobResponse
     */
    CompletableFuture<CreateLifecycleRetrieveJobResponse> createLifecycleRetrieveJob(CreateLifecycleRetrieveJobRequest request);

    /**
     * @param request the request parameters of CreateLogAnalysis  CreateLogAnalysisRequest
     * @return CreateLogAnalysisResponse
     */
    CompletableFuture<CreateLogAnalysisResponse> createLogAnalysis(CreateLogAnalysisRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you invoke the CreateMountTarget operation to create a mount target, some resources are generated asynchronously. Therefore, after the CreateMountTarget operation succeeds, invoke the DescribeMountTargets operation to query the status of the mount target. Execute the file system mount operation only after the mount target enters the <strong>Active</strong> state. Otherwise, the mount operation may result in a failed state.</li>
     * <li>Invoking this operation triggers the automatic creation of the service-linked role and will associate it with the NAS service. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked role for NAS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMountTarget  CreateMountTargetRequest
     * @return CreateMountTargetResponse
     */
    CompletableFuture<CreateMountTargetResponse> createMountTarget(CreateMountTargetRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>This operation is applicable only to CPFS file systems.</p>
     * </li>
     * <li><p>Before you begin</p>
     * <p> The target CPFS file system must be in the Running state, and a protocol service must be created.</p>
     * </li>
     * <li><p>Other limits</p>
     * <ul>
     * <li>The VPC CIDR block of the protocol service export must not overlap with the VPC CIDR block of the file system.</li>
     * <li>The CIDR blocks of multiple export VPCs on the same protocol service must not overlap.</li>
     * <li>You can create up to 10 export directories for a single protocol service.</li>
     * <li>Creating an export directory for a protocol service consumes IP addresses on the specified vSwitch (up to 32 IP addresses). Make sure that the target vSwitch has sufficient IP addresses.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateProtocolMountTarget  CreateProtocolMountTargetRequest
     * @return CreateProtocolMountTargetResponse
     */
    CompletableFuture<CreateProtocolMountTargetResponse> createProtocolMountTarget(CreateProtocolMountTargetRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>This operation is applicable only to CPFS file systems.</p>
     * </li>
     * <li><p>Only CPFS 2.3.0 and later support protocol services. You can call the <a href="https://help.aliyun.com/document_detail/163314.html">DescribeFileSystems</a> operation to query the version of the target file system.</p>
     * </li>
     * <li><p>Protocol service specifications.
     * Protocol services include two protocol types: General-purpose and Cache. Compared with the General-purpose type, the Cache type provides the capability to cache hot spot data. When a cache hit occurs, the bandwidth of a Cache protocol service can exceed the bandwidth of the CPFS file system and reach the maximum bandwidth configured for the protocol service.</p>
     * <ul>
     * <li>General-purpose: Provides NFS protocol access and <a href="https://help.aliyun.com/document_detail/427175.html">folder-level mount targets</a> for CPFS. Users do not need to configure a POSIX client for cluster management. This feature is free of charge.</li>
     * <li>Cache: Provides server-side memory caching based on the LRU policy in addition to the features of the General-purpose type. When data is cached in memory, CPFS can provide higher internal network bandwidth. Cache protocol services are divided into two specifications: Cache 1 and Cache 2. The difference lies in the internal network bandwidth and memory cache size.<blockquote>
     * <p>Cache protocol services are paid services and are currently in invitational preview. For the billing methods of Cache protocol services, see <a href="https://help.aliyun.com/document_detail/111858.html">Billable items</a>. If you have any feedback or questions, join the DingTalk group (group ID: 31045006299) to communicate and discuss with CPFS engineers.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><p>Protocol types.
     * Only the NFSv3 protocol is supported.</p>
     * </li>
     * <li><p>Prerequisites.
     * The target CPFS file system must be created and in the Running state.</p>
     * </li>
     * <li><p>Others.</p>
     * <ul>
     * <li>You can create only one protocol service for a CPFS file system.</li>
     * <li>Creating a protocol service consumes IP addresses on the specified vSwitch (up to 32 IP addresses). Make sure that the target vSwitch has sufficient IP addresses.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateProtocolService  CreateProtocolServiceRequest
     * @return CreateProtocolServiceResponse
     */
    CompletableFuture<CreateProtocolServiceResponse> createProtocolService(CreateProtocolServiceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>The recycle bin must be enabled.</li>
     * <li>Mount the file system over NFS or SMB (you must use an ECS instance in the same VPC to mount the file system), and then delete the target files in the mount directory to move them to the recycle bin.</li>
     * <li>When a directory is permanently deleted, its contents are recursively deleted.</li>
     * <li>Only one permanent deletion task can be executed at a time for a single file system. You cannot initiate a new restoration or cleanup task while files or directories are being permanently deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecycleBinDeleteJob  CreateRecycleBinDeleteJobRequest
     * @return CreateRecycleBinDeleteJobResponse
     */
    CompletableFuture<CreateRecycleBinDeleteJobResponse> createRecycleBinDeleteJob(CreateRecycleBinDeleteJobRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>A single file system can execute only one file restoration or cleanup task at a time. You cannot initiate a new file restoration or cleanup task while a file is being restored.</li>
     * <li>A single restoration task can restore only one file or directory. Restoring a specified directory recursively restores all files in the directory.</li>
     * <li>After a file is restored, data organization is performed. During data organization, the performance of read requests slightly decreases.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecycleBinRestoreJob  CreateRecycleBinRestoreJobRequest
     * @return CreateRecycleBinRestoreJobResponse
     */
    CompletableFuture<CreateRecycleBinRestoreJobResponse> createRecycleBinRestoreJob(CreateRecycleBinRestoreJobRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.40a34bbe4vbvKY">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support snapshot creation.</li>
     * <li>A maximum of 128 snapshots can be created for a single file system.</li>
     * <li>The instance on which the file system is mounted must be in the Normal state. Otherwise, snapshots cannot be created.</li>
     * <li>If a snapshot is being created, you cannot create another snapshot for the same file system.</li>
     * <li>If the file system reaches its expire and release time while a snapshot is being created, the file system is released and the snapshot in the Creating state is also deleted.</li>
     * <li>Creating a snapshot may slightly degrade the performance of the file system and temporarily slow down I/O performance. Avoid creating snapshots during peak hours.</li>
     * <li>A snapshot only captures a backup of data at a specific point in time. Incremental data generated by file system operations during snapshot creation is not subject to synchronization to the snapshot.</li>
     * <li>Manually created snapshots are retained until they are deleted 15 days after your account has an overdue payment and services are suspended. Periodically delete snapshots that are no longer needed to avoid ongoing snapshot size charges.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support snapshot creation.</li>
     * <li>A maximum of 128 snapshots can be created for a single file system.</li>
     * <li>The instance on which the file system is mounted must be in the Normal state. Otherwise, snapshots cannot be created.</li>
     * <li>If a snapshot is being created, you cannot create another snapshot for the same file system.</li>
     * <li>If the file system reaches its expire and release time while a snapshot is being created, the file system is released and the snapshot in the Creating state is also deleted.</li>
     * <li>Creating a snapshot may slightly degrade the performance of the file system and temporarily slow down I/O performance. Avoid creating snapshots during peak hours.</li>
     * <li>A snapshot only captures a backup of data at a specific point in time. Incremental data generated by file system operations during snapshot creation is not subject to synchronization to the snapshot.</li>
     * <li>Manually created snapshots are retained until they are deleted 15 days after your account has an overdue payment and services are suspended. Periodically delete snapshots that are no longer needed to avoid ongoing snapshot size charges.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * <b>description</b> :
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteAccessGroup  DeleteAccessGroupRequest
     * @return DeleteAccessGroupResponse
     */
    CompletableFuture<DeleteAccessGroupResponse> deleteAccessGroup(DeleteAccessGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is supported only by General-purpose NAS NFS file systems.</li>
     * <li>After you delete an access point, all I/O operations that are currently accessing this folder through the access point will immediately break. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAccessPoint  DeleteAccessPointRequest
     * @return DeleteAccessPointResponse
     */
    CompletableFuture<DeleteAccessPointResponse> deleteAccessPoint(DeleteAccessPointRequest request);

    /**
     * <b>description</b> :
     * <p>Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteAccessRule  DeleteAccessRuleRequest
     * @return DeleteAccessRuleResponse
     */
    CompletableFuture<DeleteAccessRuleResponse> deleteAccessRule(DeleteAccessRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Applies to Agentic file systems.</p>
     * 
     * @param request the request parameters of DeleteAgenticSpace  DeleteAgenticSpaceRequest
     * @return DeleteAgenticSpaceResponse
     */
    CompletableFuture<DeleteAgenticSpaceResponse> deleteAgenticSpace(DeleteAgenticSpaceRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>If the automatic snapshot policy has been applied to a file system, the file system no longer executes the policy after the policy is deleted.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>If the automatic snapshot policy has been applied to a file system, the file system no longer executes the policy after the policy is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAutoSnapshotPolicy  DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
    CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a CPFS for Lingjun access point.</p>
     * 
     * @param request the request parameters of DeleteCpfsAccessPoint  DeleteCpfsAccessPointRequest
     * @return DeleteCpfsAccessPointResponse
     */
    CompletableFuture<DeleteCpfsAccessPointResponse> deleteCpfsAccessPoint(DeleteCpfsAccessPointRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can delete only data flows in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>After a data flow is deleted, its related resources are released and cannot be recovered. To use a data flow again, create a new one.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataFlow  DeleteDataFlowRequest
     * @return DeleteDataFlowResponse
     */
    CompletableFuture<DeleteDataFlowResponse> deleteDataFlow(DeleteDataFlowRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>A file system instance can be deleted only when the number of mount targets for the file system is 0.</li>
     * <li>A file system instance can be deleted only when no lifecycle management policy is created for the file system.</li>
     * <li>Once a file system instance is deleted, the data cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFileSystem  DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     */
    CompletableFuture<DeleteFileSystemResponse> deleteFileSystem(DeleteFileSystemRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and CPFS for Lingjun 2.7.0 and later support deleting filesets. After a fileset is deleted, all data in the directory is also deleted and cannot be recovered. Proceed with caution.</li>
     * <li>If deletion protection is enabled, you must disable it before you can delete the fileset.</li>
     * <li>All filesets in the destination file system must be in the CREATED desired state before you can perform the delete operation.</li>
     * <li>Deleting a fileset in a general-purpose CPFS file system immediately releases disk space. Deleting a fileset in a CPFS for Lingjun file system gradually releases disk space. Deleted data cannot be recovered. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFileset  DeleteFilesetRequest
     * @return DeleteFilesetResponse
     */
    CompletableFuture<DeleteFilesetResponse> deleteFileset(DeleteFilesetRequest request);

    /**
     * @deprecated OpenAPI DeleteLDAPConfig is deprecated  * @description # Description
     * This operation supports only Cloud Parallel File Storage (CPFS) parallel file systems.
     * 
     * @param request the request parameters of DeleteLDAPConfig  DeleteLDAPConfigRequest
     * @return DeleteLDAPConfigResponse
     */
    @Deprecated
    CompletableFuture<DeleteLDAPConfigResponse> deleteLDAPConfig(DeleteLDAPConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems and CPFS for Lingjun support this feature.</p>
     * 
     * @param request the request parameters of DeleteLifecyclePolicy  DeleteLifecyclePolicyRequest
     * @return DeleteLifecyclePolicyResponse
     */
    CompletableFuture<DeleteLifecyclePolicyResponse> deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request);

    /**
     * @param request the request parameters of DeleteLogAnalysis  DeleteLogAnalysisRequest
     * @return DeleteLogAnalysisResponse
     */
    CompletableFuture<DeleteLogAnalysisResponse> deleteLogAnalysis(DeleteLogAnalysisRequest request);

    /**
     * <b>description</b> :
     * <p>Deleted mount targets cannot be recovered. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeleteMountTarget  DeleteMountTargetRequest
     * @return DeleteMountTargetResponse
     */
    CompletableFuture<DeleteMountTargetResponse> deleteMountTarget(DeleteMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * @param request the request parameters of DeleteProtocolMountTarget  DeleteProtocolMountTargetRequest
     * @return DeleteProtocolMountTargetResponse
     */
    CompletableFuture<DeleteProtocolMountTargetResponse> deleteProtocolMountTarget(DeleteProtocolMountTargetRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>When you delete a protocol service, the export directories in the protocol service are also deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProtocolService  DeleteProtocolServiceRequest
     * @return DeleteProtocolServiceResponse
     */
    CompletableFuture<DeleteProtocolServiceResponse> deleteProtocolService(DeleteProtocolServiceRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * @param request the request parameters of DescribeAccessGroups  DescribeAccessGroupsRequest
     * @return DescribeAccessGroupsResponse
     */
    CompletableFuture<DescribeAccessGroupsResponse> describeAccessGroups(DescribeAccessGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * @param request the request parameters of DescribeAccessPoint  DescribeAccessPointRequest
     * @return DescribeAccessPointResponse
     */
    CompletableFuture<DescribeAccessPointResponse> describeAccessPoint(DescribeAccessPointRequest request);

    /**
     * @deprecated OpenAPI DescribeAccessPoints is deprecated, please use NAS::2017-06-26::ListAccessPoints instead.  * @description Only General-purpose NAS NFS file systems support this feature.
     * 
     * @param request the request parameters of DescribeAccessPoints  DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     */
    @Deprecated
    CompletableFuture<DescribeAccessPointsResponse> describeAccessPoints(DescribeAccessPointsRequest request);

    /**
     * @param request the request parameters of DescribeAccessRules  DescribeAccessRulesRequest
     * @return DescribeAccessRulesResponse
     */
    CompletableFuture<DescribeAccessRulesResponse> describeAccessRules(DescribeAccessRulesRequest request);

    /**
     * <b>description</b> :
     * <p>Applies to Agentic file systems.</p>
     * <h2>Before you begin</h2>
     * <p>Before you call this operation, you must create resources in the following order:</p>
     * <ol>
     * <li><strong>Create an Agentic file system</strong>: When you call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system, you must set the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. For more information, see the console.</li>
     * </ul>
     * </li>
     * <li><strong>Query the AgenticSpace list</strong>: After the file system is created and its status changes to Running, call the DescribeAgenticSpaces operation to query the AgenticSpace list under the file system.<ul>
     * <li>If AgenticSpaces are created under the file system, the complete list is returned.</li>
     * <li>If no AgenticSpaces are created under the file system, an empty list is returned.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of DescribeAgenticSpaces  DescribeAgenticSpacesRequest
     * @return DescribeAgenticSpacesResponse
     */
    CompletableFuture<DescribeAgenticSpacesResponse> describeAgenticSpaces(DescribeAgenticSpacesRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAutoSnapshotPolicies  DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     */
    CompletableFuture<DescribeAutoSnapshotPoliciesResponse> describeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAutoSnapshotTasks  DescribeAutoSnapshotTasksRequest
     * @return DescribeAutoSnapshotTasksResponse
     */
    CompletableFuture<DescribeAutoSnapshotTasksResponse> describeAutoSnapshotTasks(DescribeAutoSnapshotTasksRequest request);

    /**
     * @deprecated OpenAPI DescribeBlackListClients is deprecated  * @description # Description
     * This operation applies only to CPFS parallel file systems.
     * 
     * @param request the request parameters of DescribeBlackListClients  DescribeBlackListClientsRequest
     * @return DescribeBlackListClientsResponse
     */
    @Deprecated
    CompletableFuture<DescribeBlackListClientsResponse> describeBlackListClients(DescribeBlackListClientsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the list of clients mounted to a CPFS for Lingjun access point.</p>
     * 
     * @param request the request parameters of DescribeCpfsAccessPointMountedClients  DescribeCpfsAccessPointMountedClientsRequest
     * @return DescribeCpfsAccessPointMountedClientsResponse
     */
    CompletableFuture<DescribeCpfsAccessPointMountedClientsResponse> describeCpfsAccessPointMountedClients(DescribeCpfsAccessPointMountedClientsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the access points of CPFS for Lingjun.</p>
     * 
     * @param request the request parameters of DescribeCpfsAccessPoints  DescribeCpfsAccessPointsRequest
     * @return DescribeCpfsAccessPointsResponse
     */
    CompletableFuture<DescribeCpfsAccessPointsResponse> describeCpfsAccessPoints(DescribeCpfsAccessPointsRequest request);

    /**
     * <b>description</b> :
     * <p>Supported only by CPFS for Lingjun 2.6.0 and later. You can view the version information on the file system details page in the console.
     * <strong>Before you begin</strong>
     * Before you call this operation to query data flow subtasks, you must create resources and start tasks in the following order:</p>
     * <ol>
     * <li><strong>Create a bmcpfs file system</strong>: You must create a CPFS for Lingjun file system in the console and wait until its status changes to Running.</li>
     * <li><strong>Create a data flow rule</strong>: Call the <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflow-bmcpfs">CreateDataFlow</a> operation on the file system to establish a data flow channel.</li>
     * <li><strong>Start a data flow task</strong>: Call the <a href="https://www.alibabacloud.com/help/en/cpfs/bmcpfs/developer-reference/api-nas-2017-06-26-createdataflowtask-bmcpfs">CreateDataFlowTask</a> operation to create and start a data flow task. The task status must be Running.</li>
     * <li><strong>Query the subtask list</strong>: Subtasks are automatically generated during the execution of a data flow task. Call the DescribeDataFlowSubTasks operation to query the list of these subtasks.</li>
     * </ol>
     * 
     * @param request the request parameters of DescribeDataFlowSubTasks  DescribeDataFlowSubTasksRequest
     * @return DescribeDataFlowSubTasksResponse
     */
    CompletableFuture<DescribeDataFlowSubTasksResponse> describeDataFlowSubTasks(DescribeDataFlowSubTasksRequest request);

    /**
     * <b>description</b> :
     * <p>Only CPFS 2.2.0 and later, and CPFS for Lingjun 2.4.0 and later support querying data flow tasks. You can view the version information on the file system details page in the console.</p>
     * 
     * @param request the request parameters of DescribeDataFlowTasks  DescribeDataFlowTasksRequest
     * @return DescribeDataFlowTasksResponse
     */
    CompletableFuture<DescribeDataFlowTasksResponse> describeDataFlowTasks(DescribeDataFlowTasksRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Data flow is supported only by CPFS 2.2.0 and later, and CPFS for Lingjun 2.4.0 and later. You can view the version information on the file system details page in the console.</li>
     * <li>Among the filter keys in Filters, FsetIds, DataFlowIds, SourceStorage, ThroughputList, and Status require exact match, while FileSystemPath, Description, and SourceStoragePath support fuzzy match.</li>
     * <li>Combined queries are supported.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDataFlows  DescribeDataFlowsRequest
     * @return DescribeDataFlowsResponse
     */
    CompletableFuture<DescribeDataFlowsResponse> describeDataFlows(DescribeDataFlowsRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support the directory quota feature.</p>
     * 
     * @param request the request parameters of DescribeDirQuotas  DescribeDirQuotasRequest
     * @return DescribeDirQuotasResponse
     */
    CompletableFuture<DescribeDirQuotasResponse> describeDirQuotas(DescribeDirQuotasRequest request);

    /**
     * @deprecated OpenAPI DescribeFileSystemStatistics is deprecated, please use NAS::2017-06-26::DescribeResourceStatistics instead.  * @param request  the request parameters of DescribeFileSystemStatistics  DescribeFileSystemStatisticsRequest
     * @return DescribeFileSystemStatisticsResponse
     */
    @Deprecated
    CompletableFuture<DescribeFileSystemStatisticsResponse> describeFileSystemStatistics(DescribeFileSystemStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeFileSystems  DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     */
    CompletableFuture<DescribeFileSystemsResponse> describeFileSystems(DescribeFileSystemsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS 2.2.0 and CPFS for Lingjun 2.7.0 and later support filesets. You can view the version information on the file system details page in the console.</li>
     * <li>For filter keys, FsetIds requires an exact match, whereas FileSystemPath and Description support fuzzy matching.</li>
     * <li>Combined queries are supported.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFilesets  DescribeFilesetsRequest
     * @return DescribeFilesetsResponse
     */
    CompletableFuture<DescribeFilesetsResponse> describeFilesets(DescribeFilesetsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun file systems are supported.</li>
     * <li>This is a batch operation that allows you to query up to 20 file systems at a time.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFilesystemsAssociatedHpnZones  DescribeFilesystemsAssociatedHpnZonesRequest
     * @return DescribeFilesystemsAssociatedHpnZonesResponse
     */
    CompletableFuture<DescribeFilesystemsAssociatedHpnZonesResponse> describeFilesystemsAssociatedHpnZones(DescribeFilesystemsAssociatedHpnZonesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature. To use CPFS for Lingjun, you must first submit a ticket to apply for the service whitelist, and then create a file system in the NAS console.</li>
     * <li>Batch execution is supported. In batch execution, only one VscId can be associated with multiple FileSystemIds. This means the ResourceIds.VscId values must be identical.</li>
     * <li>To query the association results between file systems and virtual storage channels, call AttachVscToFilesystems to complete the association first. You can call the ListVscs operation of Lingjun AI Computing Service eflo-controller/2022-12-15 to query the VscId. If the virtual storage channel is not created, call CreateVsc to create one.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFilesystemsVscAttachInfo  DescribeFilesystemsVscAttachInfoRequest
     * @return DescribeFilesystemsVscAttachInfoResponse
     */
    CompletableFuture<DescribeFilesystemsVscAttachInfoResponse> describeFilesystemsVscAttachInfo(DescribeFilesystemsVscAttachInfoRequest request);

    /**
     * <b>description</b> :
     * <p>This feature is supported only by General-purpose NAS file systems and CPFS for Lingjun.</p>
     * 
     * @param request the request parameters of DescribeLifecyclePolicies  DescribeLifecyclePoliciesRequest
     * @return DescribeLifecyclePoliciesResponse
     */
    CompletableFuture<DescribeLifecyclePoliciesResponse> describeLifecyclePolicies(DescribeLifecyclePoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the execution logs of a lifecycle policy. You can query up to 1,000 logs from the last 90 days. This operation is supported only by CPFS for Lingjun.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Ensure that the file system specified by FileSystemId is a CPFS for Lingjun file system.</li>
     * <li>Before you call this operation, call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describelifecyclepolicies">DescribeLifecyclePolicies</a> to query and obtain a valid LifecyclePolicyId.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLifecyclePolicyLogs  DescribeLifecyclePolicyLogsRequest
     * @return DescribeLifecyclePolicyLogsResponse
     */
    CompletableFuture<DescribeLifecyclePolicyLogsResponse> describeLifecyclePolicyLogs(DescribeLifecyclePolicyLogsRequest request);

    /**
     * @param request the request parameters of DescribeLogAnalysis  DescribeLogAnalysisRequest
     * @return DescribeLogAnalysisResponse
     */
    CompletableFuture<DescribeLogAnalysisResponse> describeLogAnalysis(DescribeLogAnalysisRequest request);

    /**
     * @param request the request parameters of DescribeMountTargets  DescribeMountTargetsRequest
     * @return DescribeMountTargetsResponse
     */
    CompletableFuture<DescribeMountTargetsResponse> describeMountTargets(DescribeMountTargetsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this operation.</li>
     * <li>The client list displays client IP addresses that have read or write access to the file system within the last minute. Some mounted client IP addresses that have not accessed the file system may not appear in this list.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMountedClients  DescribeMountedClientsRequest
     * @return DescribeMountedClientsResponse
     */
    CompletableFuture<DescribeMountedClientsResponse> describeMountedClients(DescribeMountedClientsRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * @param request the request parameters of DescribeNfsAcl  DescribeNfsAclRequest
     * @return DescribeNfsAclResponse
     */
    CompletableFuture<DescribeNfsAclResponse> describeNfsAcl(DescribeNfsAclRequest request);

    /**
     * <b>description</b> :
     * <p>This operation applies only to CPFS file systems.</p>
     * 
     * @param request the request parameters of DescribeProtocolMountTarget  DescribeProtocolMountTargetRequest
     * @return DescribeProtocolMountTargetResponse
     */
    CompletableFuture<DescribeProtocolMountTargetResponse> describeProtocolMountTarget(DescribeProtocolMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to CPFS file systems.</p>
     * 
     * @param request the request parameters of DescribeProtocolService  DescribeProtocolServiceRequest
     * @return DescribeProtocolServiceResponse
     */
    CompletableFuture<DescribeProtocolServiceResponse> describeProtocolService(DescribeProtocolServiceRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: Before calling this API, ensure that the KMS service is activated in the target region. You can activate it by calling the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> API or through the console. This restriction also applies to unencrypted file systems where EncryptType=0.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSmbAcl  DescribeSmbAclRequest
     * @return DescribeSmbAclResponse
     */
    CompletableFuture<DescribeSmbAclResponse> describeSmbAcl(DescribeSmbAclRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    /**
     * @param request the request parameters of DescribeStoragePackages  DescribeStoragePackagesRequest
     * @return DescribeStoragePackagesResponse
     */
    CompletableFuture<DescribeStoragePackagesResponse> describeStoragePackages(DescribeStoragePackagesRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun supports this feature.</li>
     * <li>Batch execution is supported. In batch execution, only one VscId can be associated with multiple FileSystemIds. This means the ResourceIds.VscId values must be identical.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachVscFromFilesystems  DetachVscFromFilesystemsRequest
     * @return DetachVscFromFilesystemsResponse
     */
    CompletableFuture<DetachVscFromFilesystemsResponse> detachVscFromFilesystems(DetachVscFromFilesystemsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>Disabling the recycle bin permanently deletes all files in the recycle bin.</li>
     * <li>After you re-enable a disabled recycle bin, the recycle bin is empty, and you cannot recover files that were deleted before the recycle bin feature was enabled.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableAndCleanRecycleBin  DisableAndCleanRecycleBinRequest
     * @return DisableAndCleanRecycleBinResponse
     */
    CompletableFuture<DisableAndCleanRecycleBinResponse> disableAndCleanRecycleBin(DisableAndCleanRecycleBinRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableDataInsight  DisableDataInsightRequest
     * @return DisableDataInsightResponse
     */
    CompletableFuture<DisableDataInsightResponse> disableDataInsight(DisableDataInsightRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * @param request the request parameters of DisableNfsAcl  DisableNfsAclRequest
     * @return DisableNfsAclResponse
     */
    CompletableFuture<DisableNfsAclResponse> disableNfsAcl(DisableNfsAclRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: Before calling this API, make sure that Key Management Service (KMS) is activated in the target region. You can activate KMS by calling the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> API or by using the console. The file system protocol type must be SMB. You can call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to verify the file system protocol type.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableSmbAcl  DisableSmbAclRequest
     * @return DisableSmbAclResponse
     */
    CompletableFuture<DisableSmbAclResponse> disableSmbAcl(DisableSmbAclRequest request);

    /**
     * <b>description</b> :
     * <p>Enables the EBS Lens feature. This feature is supported only by CPFS for Lingjun and is currently in the invitational preview phase.</p>
     * <h2>Before you begin</h2>
     * <ol>
     * <li>You have obtained the qualification for the invitational preview of CPFS for Lingjun by submitting a ticket.</li>
     * <li>You have purchased a CPFS for Lingjun file system through the NAS console and obtained a file system ID with the <code>bmcpfs-*</code> prefix.</li>
     * </ol>
     * 
     * @param request the request parameters of EnableDataInsight  EnableDataInsightRequest
     * @return EnableDataInsightResponse
     */
    CompletableFuture<EnableDataInsightResponse> enableDataInsight(EnableDataInsightRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems support this feature.</p>
     * 
     * @param request the request parameters of EnableNfsAcl  EnableNfsAclRequest
     * @return EnableNfsAclResponse
     */
    CompletableFuture<EnableNfsAclResponse> enableNfsAcl(EnableNfsAclRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this API operation.</p>
     * 
     * @param request the request parameters of EnableRecycleBin  EnableRecycleBinRequest
     * @return EnableRecycleBinResponse
     */
    CompletableFuture<EnableRecycleBinResponse> enableRecycleBin(EnableRecycleBinRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>By connecting the mount target of an SMB file system to an AD domain, you can implement user identity authentication management and file-level access permissions control in the AD domain. Before you mount and use an SMB file system as an AD domain user, you must register a service for the SMB file system in the AD domain, generate a keytab file, and upload the file to the NAS console to enable the SMB ACL feature. <a href="https://help.aliyun.com/document_detail/154930.html">Generate a keytab file</a>.</li>
     * <li>Before you begin: Before invoking this operation, confirm that Key Management Service (KMS) is activated in the target area. You can invoke the <a href="https://www.alibabacloud.com/help/en/kms/key-management-service/developer-reference/api-kms-2016-01-20-openkmsservice">Kms.OpenKmsService</a> operation or activate KMS in the console.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableSmbAcl  EnableSmbAclRequest
     * @return EnableSmbAclResponse
     */
    CompletableFuture<EnableSmbAclResponse> enableSmbAcl(EnableSmbAclRequest request);

    /**
     * <b>description</b> :
     * <p>Applies to Agentic file systems.</p>
     * <h2>Before you begin</h2>
     * <p>Before you call this operation, create resources in the following order:</p>
     * <ol>
     * <li><strong>Create an Agentic file system</strong>: When you call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system, set the following parameters:<ul>
     * <li><code>FileSystemType</code>: Set to <code>standard</code>.</li>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage class is available only in specific regions and zones. Go to the <a href="https://nasnext.console.aliyun.com/">NAS console</a> to view the available regions and zones, or contact Alibaba Cloud technical support to obtain the latest list of supported regions.</li>
     * </ul>
     * </li>
     * <li><strong>Create an Agentic space</strong>: After the file system is created and its status changes to Running, call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createagenticspace">CreateAgenticSpace</a> operation to create an Agentic space in the file system and obtain the returned AgenticSpaceId.</li>
     * </ol>
     * 
     * @param request the request parameters of GetAgenticSpace  GetAgenticSpaceRequest
     * @return GetAgenticSpaceResponse
     */
    CompletableFuture<GetAgenticSpaceResponse> getAgenticSpace(GetAgenticSpaceRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of GetDirectoryOrFileProperties  GetDirectoryOrFilePropertiesRequest
     * @return GetDirectoryOrFilePropertiesResponse
     */
    CompletableFuture<GetDirectoryOrFilePropertiesResponse> getDirectoryOrFileProperties(GetDirectoryOrFilePropertiesRequest request);

    /**
     * <b>description</b> :
     * <p>Only CPFS 2.2.0 and CPFS for Lingjun 2.7.0 and later support Filesets. You can view the version information on the file system details page in the console.</p>
     * 
     * @param request the request parameters of GetFileset  GetFilesetRequest
     * @return GetFilesetResponse
     */
    CompletableFuture<GetFilesetResponse> getFileset(GetFilesetRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the information about protocol service export directories.
     * <strong>Before you begin</strong>
     * Before you call this operation, make sure that each dependent resource in the following three-tier resource model exists:</p>
     * <ol>
     * <li><strong>File system (FileSystem)</strong>: Call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> to obtain the FileSystemId.</li>
     * <li><strong>Protocol service (ProtocolService)</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> to obtain the ProtocolServiceId, or call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolservice-cpfs">CreateProtocolService</a> to create a protocol service.</li>
     * <li><strong>Export directory (ProtocolMountTarget)</strong>: Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolmounttarget-cpfs">CreateProtocolMountTarget</a> to create an export directory and obtain the ExportId, or call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to query the export directory.</li>
     * </ol>
     * 
     * @param request the request parameters of GetProtocolMountTarget  GetProtocolMountTargetRequest
     * @return GetProtocolMountTargetResponse
     */
    CompletableFuture<GetProtocolMountTargetResponse> getProtocolMountTarget(GetProtocolMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of GetRecycleBinAttribute  GetRecycleBinAttributeRequest
     * @return GetRecycleBinAttributeResponse
     */
    CompletableFuture<GetRecycleBinAttributeResponse> getRecycleBinAttribute(GetRecycleBinAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS NFS file systems are supported.</p>
     * 
     * @param request the request parameters of ListAccessPoints  ListAccessPointsRequest
     * @return ListAccessPointsResponse
     */
    CompletableFuture<ListAccessPointsResponse> listAccessPoints(ListAccessPointsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This feature is currently in invitational preview. To use this feature, submit a ticket.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDataInsightDirectories  ListDataInsightDirectoriesRequest
     * @return ListDataInsightDirectoriesResponse
     */
    CompletableFuture<ListDataInsightDirectoriesResponse> listDataInsightDirectories(ListDataInsightDirectoriesRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of ListDirectoriesAndFiles  ListDirectoriesAndFilesRequest
     * @return ListDirectoriesAndFilesResponse
     */
    CompletableFuture<ListDirectoriesAndFilesResponse> listDirectoriesAndFiles(ListDirectoriesAndFilesRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of ListLifecycleRetrieveJobs  ListLifecycleRetrieveJobsRequest
     * @return ListLifecycleRetrieveJobsResponse
     */
    CompletableFuture<ListLifecycleRetrieveJobsResponse> listLifecycleRetrieveJobs(ListLifecycleRetrieveJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.
     * <strong>Before you begin</strong>
     * Before calling this operation, make sure that the recycle bin feature is enabled for the file system. If the recycle bin is not enabled, this operation cannot return the list of recently deleted directories.
     * <strong>Enable the recycle bin</strong>
     * To enable the recycle bin feature, call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-enablerecyclebin">EnableRecycleBin</a> operation. After the recycle bin is enabled, deleted directories in the file system are moved to the recycle bin. You can call this operation to query the list of recently deleted directories.</p>
     * 
     * @param request the request parameters of ListRecentlyRecycledDirectories  ListRecentlyRecycledDirectoriesRequest
     * @return ListRecentlyRecycledDirectoriesResponse
     */
    CompletableFuture<ListRecentlyRecycledDirectoriesResponse> listRecentlyRecycledDirectories(ListRecentlyRecycledDirectoriesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only General-purpose NAS file systems support this feature.</li>
     * <li>You can query up to 50 most recently executed tasks.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecycleBinJobs  ListRecycleBinJobsRequest
     * @return ListRecycleBinJobsResponse
     */
    CompletableFuture<ListRecycleBinJobsResponse> listRecycleBinJobs(ListRecycleBinJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS supports this feature.</p>
     * 
     * @param request the request parameters of ListRecycledDirectoriesAndFiles  ListRecycledDirectoriesAndFilesRequest
     * @return ListRecycledDirectoriesAndFilesResponse
     */
    CompletableFuture<ListRecycledDirectoriesAndFilesResponse> listRecycledDirectoriesAndFiles(ListRecycledDirectoriesAndFilesRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * @param request the request parameters of ModifyAccessGroup  ModifyAccessGroupRequest
     * @return ModifyAccessGroupResponse
     */
    CompletableFuture<ModifyAccessGroupResponse> modifyAccessGroup(ModifyAccessGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This feature is supported only by General-purpose NAS NFS file systems.</p>
     * 
     * @param request the request parameters of ModifyAccessPoint  ModifyAccessPointRequest
     * @return ModifyAccessPointResponse
     */
    CompletableFuture<ModifyAccessPointResponse> modifyAccessPoint(ModifyAccessPointRequest request);

    /**
     * <b>description</b> :
     * <p>Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * @param request the request parameters of ModifyAccessRule  ModifyAccessRuleRequest
     * @return ModifyAccessRuleResponse
     */
    CompletableFuture<ModifyAccessRuleResponse> modifyAccessRule(ModifyAccessRuleRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Before calling this operation, complete the following preparations:</p>
     * <ol>
     * <li><strong>Obtained the AgenticSpaceId</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createagenticspace">CreateAgenticSpace</a> operation to create an Agentic space and obtain the AgenticSpaceId.</li>
     * <li><strong>Created an Agentic file system</strong>: When calling <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system, set the following parameters:<ul>
     * <li><code>StorageType</code>: Set to <code>Agentic</code>.</li>
     * <li><code>ProtocolType</code>: Set to <code>NFS</code>.</li>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. For more information, see the console.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Example of a complete call chain:<ol>
     * <li>Call CreateFileSystem to create an Agentic file system (StorageType=Agentic, ProtocolType=NFS).</li>
     * <li>After the file system is created (status is Running), call CreateAgenticSpace to create an Agentic space.</li>
     * <li>Call this ModifyAgenticSpace operation to modify the configurations of the Agentic space.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAgenticSpace  ModifyAgenticSpaceRequest
     * @return ModifyAgenticSpaceResponse
     */
    CompletableFuture<ModifyAgenticSpaceResponse> modifyAgenticSpace(ModifyAgenticSpaceRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAutoSnapshotPolicy  ModifyAutoSnapshotPolicyRequest
     * @return ModifyAutoSnapshotPolicyResponse
     */
    CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies an access point of CPFS for Lingjun.</p>
     * 
     * @param request the request parameters of ModifyCpfsAccessPoint  ModifyCpfsAccessPointRequest
     * @return ModifyCpfsAccessPointResponse
     */
    CompletableFuture<ModifyCpfsAccessPointResponse> modifyCpfsAccessPoint(ModifyCpfsAccessPointRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>CPFS 2.2.0 and later and CPFS for Lingjun 2.4.0 and later support data streams.</li>
     * <li>You can modify the properties of a data stream only when the data stream is in the <code>Running (Normal)</code> state.</li>
     * <li>Modifying a data stream typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the data stream modification.</li>
     * <li>CPFS data stream specifications:<ul>
     * <li>Data stream bandwidth (Throughput) supports three specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The data stream bandwidth specifies the maximum transmission bandwidth that the data stream can achieve during data import or export.</li>
     * <li>Inventory check: If you set DryRun to true, you can check whether the resources required to modify the data stream to the specified specification are sufficient.</li>
     * </ul>
     * </li>
     * <li>CPFS billing
     * Modifying the data stream bandwidth (Throughput) incurs data stream bandwidth fees. Familiarize yourself with the billable methods of CPFS in advance. For details, see <a href="https://help.aliyun.com/document_detail/111858.html">CPFS billing</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDataFlow  ModifyDataFlowRequest
     * @return ModifyDataFlowResponse
     */
    CompletableFuture<ModifyDataFlowResponse> modifyDataFlow(ModifyDataFlowRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to Cloud Parallel File Storage (CPFS) file systems.</li>
     * <li>Only CPFS 2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can modify the automatic update configuration of a dataflow only when the dataflow is in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>Modifying the automatic update configuration typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the automatic update task.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDataFlowAutoRefresh  ModifyDataFlowAutoRefreshRequest
     * @return ModifyDataFlowAutoRefreshResponse
     */
    CompletableFuture<ModifyDataFlowAutoRefreshResponse> modifyDataFlowAutoRefresh(ModifyDataFlowAutoRefreshRequest request);

    /**
     * @param request the request parameters of ModifyFileSystem  ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     */
    CompletableFuture<ModifyFileSystemResponse> modifyFileSystem(ModifyFileSystemRequest request);

    /**
     * <b>description</b> :
     * <p>Only CPFS 2.2.0 and CPFS for Lingjun 2.7.0 or later support modifying fileset information.</p>
     * 
     * @param request the request parameters of ModifyFileset  ModifyFilesetRequest
     * @return ModifyFilesetResponse
     */
    CompletableFuture<ModifyFilesetResponse> modifyFileset(ModifyFilesetRequest request);

    /**
     * @deprecated OpenAPI ModifyLDAPConfig is deprecated  * @description This operation supports only Cloud Parallel File Storage (CPFS) parallel file systems.
     * 
     * @param request the request parameters of ModifyLDAPConfig  ModifyLDAPConfigRequest
     * @return ModifyLDAPConfigResponse
     */
    @Deprecated
    CompletableFuture<ModifyLDAPConfigResponse> modifyLDAPConfig(ModifyLDAPConfigRequest request);

    /**
     * <b>description</b> :
     * <p>This feature is supported only by General-purpose NAS file systems.</p>
     * 
     * @param request the request parameters of ModifyLifecyclePolicy  ModifyLifecyclePolicyRequest
     * @return ModifyLifecyclePolicyResponse
     */
    CompletableFuture<ModifyLifecyclePolicyResponse> modifyLifecyclePolicy(ModifyLifecyclePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Only mount target information of General-purpose NAS or Extreme NAS file systems can be modified.</p>
     * 
     * @param request the request parameters of ModifyMountTarget  ModifyMountTargetRequest
     * @return ModifyMountTargetResponse
     */
    CompletableFuture<ModifyMountTargetResponse> modifyMountTarget(ModifyMountTargetRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you begin: This API operation applies only to CPFS file systems.</li>
     * <li>Status prerequisite: Before you call this operation, the export directory specified by the ExportId parameter must be in the AVAILABLE state. Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to query the status and wait until the creation is complete before you retry.</li>
     * <li>Prerequisite dependency chain:<ol>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describefilesystems-cpfs">DescribeFileSystems</a> (with the FileSystemType parameter set to cpfs) to obtain the CPFS file system.</li>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> to confirm that the protocol service is in the Running state.</li>
     * <li>Call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolmounttarget-cpfs">DescribeProtocolMountTarget</a> to confirm that the export directory is in the AVAILABLE state.</li>
     * <li>If no export directory exists, call <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolmounttarget-cpfs">CreateProtocolMountTarget</a> to create one.</li>
     * </ol>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyProtocolMountTarget  ModifyProtocolMountTargetRequest
     * @return ModifyProtocolMountTargetResponse
     */
    CompletableFuture<ModifyProtocolMountTargetResponse> modifyProtocolMountTarget(ModifyProtocolMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is applicable only to Cloud Parallel File Storage (CPFS) file systems.</p>
     * <ul>
     * <li>This operation allows you to modify the description of a protocol service.</li>
     * <li>To obtain the protocol service ID (ProtocolServiceId):<ul>
     * <li>Call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createprotocolservice-cpfs">CreateProtocolService</a> operation to create a protocol service and obtain the ID from the response.</li>
     * <li>Call the <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-describeprotocolservice-cpfs">DescribeProtocolService</a> operation to query the list of existing protocol services.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyProtocolService  ModifyProtocolServiceRequest
     * @return ModifyProtocolServiceResponse
     */
    CompletableFuture<ModifyProtocolServiceResponse> modifyProtocolService(ModifyProtocolServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin: Make sure that Key Management Service (KMS) is activated in the target region before you call this operation. Call sequence: Activate KMS → Call EnableSmbAcl to initialize → Call ModifySmbAcl.</p>
     * 
     * @param request the request parameters of ModifySmbAcl  ModifySmbAclRequest
     * @return ModifySmbAclResponse
     */
    CompletableFuture<ModifySmbAclResponse> modifySmbAcl(ModifySmbAclRequest request);

    /**
     * @param request the request parameters of OpenNASService  OpenNASServiceRequest
     * @return OpenNASServiceResponse
     */
    CompletableFuture<OpenNASServiceResponse> openNASService(OpenNASServiceRequest request);

    /**
     * @deprecated OpenAPI RemoveClientFromBlackList is deprecated  * @description This operation supports only CPFS parallel file systems.
     * 
     * @param request the request parameters of RemoveClientFromBlackList  RemoveClientFromBlackListRequest
     * @return RemoveClientFromBlackListResponse
     */
    @Deprecated
    CompletableFuture<RemoveClientFromBlackListResponse> removeClientFromBlackList(RemoveClientFromBlackListRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud201803061139_99860.html?spm=a2c4g.11186623.0.0.5c895ff2YPLrwe">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Normal state.</li>
     * <li>The specified SnapshotId parameter must be a historical snapshot created from the same file system specified by FileSystemId.</li>
     * <li>Dependency chain:</li>
     * <li>(1) Grant the AliyunNASManageENIRole role in the Resource Access Management (RAM) console.</li>
     * <li>(2) Call CreateFileSystem (FileSystemType=extreme, StorageType=advance).</li>
     * <li>(3) Call DescribeFileSystems and poll until Status=Running.</li>
     * <li>(4) Call CreateSnapshot (FileSystemId=ID from the previous step).</li>
     * <li>(5) Call DescribeSnapshots and poll until Status=available.</li>
     * <li>(6) Call ResetFileSystem (FileSystemId, SnapshotId).
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>This feature is in free public preview. During the public preview, the <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">File Storage NAS Service-Level Agreement (SLA)</a> is not guaranteed.</li>
     * <li>Only Advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Normal state.</li>
     * <li>The specified SnapshotId parameter must be a historical snapshot created from the same file system specified by FileSystemId.</li>
     * <li>Dependency chain:</li>
     * <li>(1) Grant the AliyunNASManageENIRole role in the Resource Access Management (RAM) console.</li>
     * <li>(2) Call CreateFileSystem (FileSystemType=extreme, StorageType=advance).</li>
     * <li>(3) Call DescribeFileSystems and poll until Status=Running.</li>
     * <li>(4) Call CreateSnapshot (FileSystemId=ID from the previous step).</li>
     * <li>(5) Call DescribeSnapshots and poll until Status=available.</li>
     * <li>(6) Call ResetFileSystem (FileSystemId, SnapshotId).</li>
     * </ul>
     * 
     * @param request the request parameters of ResetFileSystem  ResetFileSystemRequest
     * @return ResetFileSystemResponse
     */
    CompletableFuture<ResetFileSystemResponse> resetFileSystem(ResetFileSystemRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of RetryLifecycleRetrieveJob  RetryLifecycleRetrieveJobRequest
     * @return RetryLifecycleRetrieveJobResponse
     */
    CompletableFuture<RetryLifecycleRetrieveJobResponse> retryLifecycleRetrieveJob(RetryLifecycleRetrieveJobRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you begin</em>*
     * Before calling this operation, complete the following preparations:</p>
     * <ol>
     * <li><strong>Obtain the AgenticSpaceId</strong>: Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createagenticspace">CreateAgenticSpace</a> operation to create an Agentic space and obtain the AgenticSpaceId.</li>
     * <li><strong>Create an Agentic file system</strong>: When calling <a href="https://www.alibabacloud.com/help/en/cpfs/cpfsonecs/developer-reference/api-nas-2017-06-26-createfilesystem-cpfs">CreateFileSystem</a> to create a file system, set <code>StorageType=Agentic</code>.<ul>
     * <li><strong>Supported regions</strong>: The Agentic storage type is available only in specific regions and zones. For more information, refer to the console.
     * <strong>Usage notes</strong></li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>This operation applies only to Agentic file systems.</li>
     * <li>Quota statistics have a 15-minute delay. The current actual usage takes effect after 15 minutes.</li>
     * </ul>
     * 
     * @param request the request parameters of SetAgenticSpaceQuota  SetAgenticSpaceQuotaRequest
     * @return SetAgenticSpaceQuotaResponse
     */
    CompletableFuture<SetAgenticSpaceQuotaResponse> setAgenticSpaceQuota(SetAgenticSpaceQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>Only general-purpose NAS file systems support the directory quota feature.</p>
     * 
     * @param request the request parameters of SetDirQuota  SetDirQuotaRequest
     * @return SetDirQuotaResponse
     */
    CompletableFuture<SetDirQuotaResponse> setDirQuota(SetDirQuotaRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only CPFS for Lingjun 2.7.0 and later support setting quotas for filesets.</li>
     * <li>The minimum fileset capacity quota is 10 GiB, and the capacity can be increased in increments of 1 GiB.</li>
     * <li>A fileset supports up to 10 billion files or directories. The minimum value is 10,000, and the value can be increased in increments of 1.</li>
     * <li>When you modify a directory quota, the quota capacity or file count must be greater than the used capacity or file count.</li>
     * <li>You must specify at least one of the capacity limit and the file count limit.</li>
     * <li>Quota statistics have a 15-minute delay. The actual usage takes effect 15 minutes later.</li>
     * </ul>
     * 
     * @param request the request parameters of SetFilesetQuota  SetFilesetQuotaRequest
     * @return SetFilesetQuotaResponse
     */
    CompletableFuture<SetFilesetQuotaResponse> setFilesetQuota(SetFilesetQuotaRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is applicable only to CPFS file systems.</li>
     * <li>Only CPFS 2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>Only data flows in the <code>Stopped</code> state can be started.</li>
     * <li>When DryRun is set to <code>true</code>, you can check whether sufficient resources are available to start a data flow with the specified specifications. If resources are insufficient, the data flow cannot be started.</li>
     * <li>Starting a data flow typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> to query the status of the data flow.</li>
     * </ul>
     * 
     * @param request the request parameters of StartDataFlow  StartDataFlowRequest
     * @return StartDataFlowResponse
     */
    CompletableFuture<StartDataFlowResponse> startDataFlow(StartDataFlowRequest request);

    /**
     * <b>description</b> :
     * <p>Starts the execution of a lifecycle policy. This operation is supported only when the LifecyclePolicyType parameter of the lifecycle management policy for a CPFS for Lingjun file system is set to OnDemand.</p>
     * 
     * @param request the request parameters of StartLifecyclePolicyExecution  StartLifecyclePolicyExecutionRequest
     * @return StartLifecyclePolicyExecutionResponse
     */
    CompletableFuture<StartLifecyclePolicyExecutionResponse> startLifecyclePolicyExecution(StartLifecyclePolicyExecutionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation applies only to CPFS file systems.</li>
     * <li>Only CPFS 2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>Only data flows in the <code>Running</code> (normal) state can be disabled.</li>
     * <li>After a data flow is disabled, you cannot create data flow tasks for the data flow. If automatic update is configured, data updates that occur on the source are not synchronized to CPFS.</li>
     * <li>After a data flow is disabled, the data flow bandwidth is no longer billed because resources are reclaimed. However, restarting the data flow may fail due to insufficient inventory.</li>
     * <li>Disabling a data flow typically takes 2 to 5 minutes. You can call <a href="https://help.aliyun.com/document_detail/2402271.html">DescribeDataFlows</a> to query the data flow status.</li>
     * </ul>
     * 
     * @param request the request parameters of StopDataFlow  StopDataFlowRequest
     * @return StopDataFlowResponse
     */
    CompletableFuture<StopDataFlowResponse> stopDataFlow(StopDataFlowRequest request);

    /**
     * <b>description</b> :
     * <p>Stops the execution of a lifecycle policy.
     * This operation is supported only when the LifecyclePolicyType parameter is set to OnDemand in the lifecycle management policy of a CPFS for Lingjun file system.</p>
     * 
     * @param request the request parameters of StopLifecyclePolicyExecution  StopLifecyclePolicyExecutionRequest
     * @return StopLifecyclePolicyExecutionResponse
     */
    CompletableFuture<StopLifecyclePolicyExecutionResponse> stopLifecyclePolicyExecution(StopLifecyclePolicyExecutionRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateLifecyclePolicy  UpdateLifecyclePolicyRequest
     * @return UpdateLifecyclePolicyResponse
     */
    CompletableFuture<UpdateLifecyclePolicyResponse> updateLifecyclePolicy(UpdateLifecyclePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this feature.</p>
     * 
     * @param request the request parameters of UpdateRecycleBinAttribute  UpdateRecycleBinAttributeRequest
     * @return UpdateRecycleBinAttributeResponse
     */
    CompletableFuture<UpdateRecycleBinAttributeResponse> updateRecycleBinAttribute(UpdateRecycleBinAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Extreme NAS file systems and CPFS file systems can be scaled up.</li>
     * <li>General-purpose NAS file systems scale up automatically on demand. You do not need to call this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeFileSystem  UpgradeFileSystemRequest
     * @return UpgradeFileSystemResponse
     */
    CompletableFuture<UpgradeFileSystemResponse> upgradeFileSystem(UpgradeFileSystemRequest request);

}
