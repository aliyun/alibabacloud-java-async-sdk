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
     * @deprecated OpenAPI AddClientToBlackList is deprecated  * @description The API operation is available only for CPFS file systems.
     * 
     * @param request the request parameters of AddClientToBlackList  AddClientToBlackListRequest
     * @return AddClientToBlackListResponse
     */
    @Deprecated
    CompletableFuture<AddClientToBlackListResponse> addClientToBlackList(AddClientToBlackListRequest request);

    /**
     * @deprecated OpenAPI AddTags is deprecated, please use NAS::2017-06-26::TagResources instead.  * @description >  The tag feature has been upgraded and this document will be unpublished. For more information, see TagResources.
     * *   Each tag consists of a tag key (TagKey) and a tag value (TagValue).
     * *   Placeholders at the start and end of each TagKey and TagValue are automatically removed. Placeholders include the spacebar ( ), tab (\\t), line break (\\n), and carriage return (\\r).
     * *   You must specify a tag key. You can leave a tag value empty.
     * *   The tag key and tag value are not case-sensitive.
     * *   A tag key can be up to 64 characters in length and a tag value can be up to 128 characters in length.
     * *   You can add a maximum of 10 tags to a file system. If you add two tags with the same tag key, the newly added tag will overwrite the existing tag.
     * *   If you remove a tag from all linked file systems, the tag is automatically deleted.
     * 
     * @param request the request parameters of AddTags  AddTagsRequest
     * @return AddTagsResponse
     */
    @Deprecated
    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * <li>You can apply only one automatic snapshot policy to each file system.</li>
     * <li>Each automatic snapshot policy can be applied to multiple file systems.</li>
     * <li>If an automatic snapshot policy is applied to a file system, you can call the ApplyAutoSnapshotPolicy operation to change the automatic snapshot policy.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyAutoSnapshotPolicy  ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can add AutoRefresh configurations only to the dataflows that are in the <code>Running</code> state.</li>
     * <li>You can add a maximum of five AutoRefresh configurations to a dataflow.</li>
     * <li>It generally takes 2 to 5 minutes to create an AutoRefresh configuration. You can call the <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> operation to query the dataflow status.</li>
     * <li>AutoRefresh depends on the object modification events collected by EventBridge from the source Object Storage Service (OSS) bucket. You must first <a href="https://help.aliyun.com/document_detail/182246.html">activate EventBridge</a>.
     * **
     * <strong>Note</strong> The event buses and event rules created for CPFS in the EventBridge console contain the <code>Create for cpfs auto refresh</code> description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly.</li>
     * <li>The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. When you add an AutoRefresh configuration to the prefix for a CPFS dataflow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS dataflow.</li>
     * <li>After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a dataflow task to load the updated data.</li>
     * <li>AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS dataflow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the dataflow status becomes Misconfigured. To resolve these issues, you can increase the dataflow specifications or reduce the frequency of triggering the object modification event.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyDataFlowAutoRefresh  ApplyDataFlowAutoRefreshRequest
     * @return ApplyDataFlowAutoRefreshResponse
     */
    CompletableFuture<ApplyDataFlowAutoRefreshResponse> applyDataFlowAutoRefresh(ApplyDataFlowAutoRefreshRequest request);

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelAutoSnapshotPolicy  CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can cancel AutoRefresh configurations only for the dataflows that are in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>It generally takes 2 to 5 minutes to cancel the AutoRefresh configurations. You can call the <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> operation to query the status of the AutoRefresh tasks.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDataFlowAutoRefresh  CancelDataFlowAutoRefreshRequest
     * @return CancelDataFlowAutoRefreshResponse
     */
    CompletableFuture<CancelDataFlowAutoRefreshResponse> cancelDataFlowAutoRefresh(CancelDataFlowAutoRefreshRequest request);

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can cancel a data streaming task only when the task is in the CREATED or RUNNING state.</li>
     * <li>Data streaming tasks are executed asynchronously. You can call the DescribeDataFlowSubTasks operation to query the task execution status.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDataFlowSubTask  CancelDataFlowSubTaskRequest
     * @return CancelDataFlowSubTaskResponse
     */
    CompletableFuture<CancelDataFlowSubTaskResponse> cancelDataFlowSubTask(CancelDataFlowSubTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.4.0 and later support data flow tasks. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can cancel only the data flow tasks that are in the <code>Pending</code> and <code>Executing</code> states.</li>
     * <li>It generally takes 5 to 10 minutes to cancel a data flow task. You can query the task execution status by calling the <a href="https://help.aliyun.com/document_detail/2402275.html">DescribeDataFlowTasks</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelDataFlowTask  CancelDataFlowTaskRequest
     * @return CancelDataFlowTaskResponse
     */
    CompletableFuture<CancelDataFlowTaskResponse> cancelDataFlowTask(CancelDataFlowTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose file systems support the directory quota feature.</p>
     * 
     * @param request the request parameters of CancelDirQuota  CancelDirQuotaRequest
     * @return CancelDirQuotaResponse
     */
    CompletableFuture<CancelDirQuotaResponse> cancelDirQuota(CancelDirQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of CancelLifecycleRetrieveJob  CancelLifecycleRetrieveJobRequest
     * @return CancelLifecycleRetrieveJobResponse
     */
    CompletableFuture<CancelLifecycleRetrieveJobResponse> cancelLifecycleRetrieveJob(CancelLifecycleRetrieveJobRequest request);

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can cancel only jobs that are in the Running state. You cannot cancel jobs that are in the PartialSuccess, Success, Fail, or Cancelled state.</li>
     * <li>If you cancel a running job that permanently deletes files, you cannot restore the files that are already permanently deleted.</li>
     * <li>If you cancel a running job that restores files, you can query the restored files from the file system, and query the unrestored files from the recycle bin.</li>
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
     * @param request the request parameters of CreateAccessGroup  CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     */
    CompletableFuture<CreateAccessGroupResponse> createAccessGroup(CreateAccessGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  After you call the CreateAccessPoint operation, an access point is not immediately created. Therefore, after you perform the CreateAccessPoint operation successfully, call the DescribeAccessPoints or DescribeAccessPoint operation to query the status of the access point. If the status is <strong>Active</strong>, mount the file system. Otherwise, the file system may fail to be mounted.</p>
     * <ul>
     * <li>Only General-purpose Network File System (NFS) file systems support this operation.</li>
     * <li>If you want to perform the EnabledRam operation to enable a Resource Access Management (RAM) policy, you must configure the corresponding RAM permissions. For more information, see <a href="https://help.aliyun.com/document_detail/2545998.html">Manage endpoints</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccessPoint  CreateAccessPointRequest
     * @return CreateAccessPointResponse
     */
    CompletableFuture<CreateAccessPointResponse> createAccessPoint(CreateAccessPointRequest request);

    /**
     * @param request the request parameters of CreateAccessRule  CreateAccessRuleRequest
     * @return CreateAccessRuleResponse
     */
    CompletableFuture<CreateAccessRuleResponse> createAccessRule(CreateAccessRuleRequest request);

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>You can create a maximum of 100 automatic snapshot policies in each region for an Alibaba Cloud account.</li>
     * <li>If an auto snapshot is being created when the scheduled time for a new auto snapshot arrives, the creation of the new snapshot is skipped. This occurs if the file system stores a large volume of data. For example, you have scheduled auto snapshots to be created at 09:00:00, 10:00:00, 11:00:00, and 12:00:00 for a file system. The system starts to create an auto snapshot at 09:00:00 and does not complete the process until 10:20:00. The process takes 80 minutes because the file system has a large volume of data. In this case, the system does not create an auto snapshot at 10:00:00, but creates an auto snapshot at 11:00:00.</li>
     * <li>A maximum of 128 auto snapshots can be created for a file system. If the upper limit is reached, the earliest auto snapshot is deleted. This rule does not apply to manual snapshots.</li>
     * <li>If you modify the retention period of an automatic snapshot policy, the modification applies only to subsequent snapshots, but not to the existing snapshots.</li>
     * <li>If an auto snapshot is being created for a file system, you cannot create a manual snapshot for the file system. You must wait after the auto snapshot is created.</li>
     * <li>You can only apply automatic snapshot policies to a file system that is in the Running state.</li>
     * <li>All auto snapshots are named in the <code>auto_yyyyMMdd_X</code> format, where: <code>auto</code> indicates that the snapshot is created based on an automatic snapshot policy. <code>yyyyMMdd</code> indicates the date on which the snapshot is created. <code>y</code> indicates the year. <code>M</code> indicates the month. <code>d</code> indicates the day. <code>X</code> indicates the ordinal number of the snapshot on the current day. For example, <code>auto_20201018_1</code> indicates the first auto snapshot that was created on October 18, 2020.</li>
     * <li>After an automatic snapshot policy is created, you can call the ApplyAutoSnapshotPolicy operation to apply the policy to a file system and call the ModifyAutoSnapshotPolicy operation to modify the policy.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAutoSnapshotPolicy  CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  Basic operations
     *     *   Cloud Parallel File Storage (CPFS) for LINGJUN V2.4.0 and later support data flows.
     *     *   You can create a data flow only when a CPFS for LINGJUN file system is in the Running state.
     *     *   A maximum of 10 data flows can be created for a CPFS for LINGJUN file system.
     *     *   It generally takes 2 to 5 minutes to create a data flow. You can call the DescribeDataFlows operation to check whether the data flow has been created.</p>
     * <ul>
     * <li>Permissions
     * When you create a data flow, CPFS for LINGJUN obtains the following two service-linked roles: <code>AliyunServiceRoleForNasOssDataflow</code> and <code>AliyunServiceRoleForNasEventNotification</code>. For more information, see <a href="https://help.aliyun.com/document_detail/185138.html">CPFS service-linked roles</a>.</li>
     * <li>CPFS for LINGJUN usage notes<ul>
     * <li>Source storage<ul>
     * <li>The source storage is an Object Storage Service (OSS) bucket. SourceStorage for a data flow must be an OSS bucket.</li>
     * <li>CPFS for LINGJUN data flows support both encrypted and unencrypted access to OSS. If you select SSL-encrypted access to OSS, make sure that encryption in transit for OSS buckets supports encrypted access.</li>
     * <li>If data flows for multiple CPFS for LINGJUN file systems or multiple data flows for the same CPFS for LINGJUN file system are stored in the same OSS bucket, you must enable versioning for the OSS bucket to prevent data conflicts caused by data export from multiple CPFS for LINGJUN file systems to one OSS bucket.</li>
     * <li>Data flows are not supported for OSS buckets across regions. The OSS bucket must reside in the same region as the CPFS file system.</li>
     * <li>CPFS for LINGJUN V2.6.0 and later allows you to create data flows for OSS buckets across accounts.</li>
     * <li>The account id parameter is required only when you use OSS buckets across accounts.</li>
     * <li>To use OSS buckets across accounts, you must first grant permissions to the related accounts. For more information, see <a href="https://help.aliyun.com/document_detail/182246.html">Cross-account authorization on data flows</a>.
     * **
     * <strong>Note</strong> Before you create a data flow, you must configure a tag (key: cpfs-dataflow, value: true) for the source OSS bucket. This way, the created data flow can access the data in the OSS bucket. When a data flow is being used, do not delete or modify the tag. Otherwise, the data flow for CPFS for LINGJUN cannot access the data in the OSS bucket.</li>
     * </ul>
     * </li>
     * <li>Limits of data flows on file systems<ul>
     * <li>You cannot rename a non-empty directory in a path that is associated with a data flow. Otherwise, the Permission Denied error message or an error message indicating that the directory is not empty is returned.</li>
     * <li>Proceed with caution when you use special characters in the names of directories and files. The following characters are supported: letters, digits, exclamation points (!), hyphens (-), underscores (_), periods (.), asterisks (\*), and parentheses (()).</li>
     * <li>The path can be up to 1,023 characters in length.</li>
     * </ul>
     * </li>
     * <li>Limits of data flows on import<ul>
     * <li>After a symbolic link is imported to CPFS for LINGJUN, the symbolic link is converted into a common data file that contains no symbolic link information.</li>
     * <li>If an OSS bucket has multiple versions, only data of the latest version is used.</li>
     * <li>The name of a file or a subdirectory can be up to 255 bytes in length.</li>
     * </ul>
     * </li>
     * <li>Limits of data flows on export<ul>
     * <li>After a symbolic link is synchronized to OSS, the file that the symbolic link points to is not synchronized to OSS. In this case, the symbolic link is converted into a common object that contains no data.</li>
     * <li>Hard links can be synchronized to OSS only as common files that contain no link information.</li>
     * <li>After a file of the Socket, Device, or Pipe type is exported to an OSS bucket, the file is converted into a common object that contains no data.</li>
     * <li>The directory path can be up to 1,023 characters in length.</li>
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
     * @param request the request parameters of CreateDataFlowSubTask  CreateDataFlowSubTaskRequest
     * @return CreateDataFlowSubTaskResponse
     */
    CompletableFuture<CreateDataFlowSubTaskResponse> createDataFlowSubTask(CreateDataFlowSubTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for LINGJUN V2.3.4 and later support data flows. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can create a data flow task only for a data flow that is in the Running state.</li>
     * <li>Data flow tasks are executed asynchronously. You can call the <a href="https://help.aliyun.com/document_detail/336914.html">DescribeDataFlowTasks</a> operation to query the task execution status. The task duration depends on the amount of data to be imported and exported. If a large amount of data exists, we recommend that you create multiple tasks.</li>
     * <li>When you manually run a data flow task, the automatic data update task for the data flow is interrupted and enters the pending state.</li>
     * <li>When you create an export task, make sure that the total length of the absolute path of the files to be exported from a CPFS or CPFS for LINGJUN file system does not exceed 1,023 characters.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataFlowTask  CreateDataFlowTaskRequest
     * @return CreateDataFlowTaskResponse
     */
    CompletableFuture<CreateDataFlowTaskResponse> createDataFlowTask(CreateDataFlowTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * @param request the request parameters of CreateDir  CreateDirRequest
     * @return CreateDirResponse
     */
    CompletableFuture<CreateDirResponse> createDir(CreateDirRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is only available to some users.</p>
     * <ul>
     * <li>This operation supports only General-purpose NAS file systems that use the Server Message Block (SMB) protocol and have Resource Access Management (RAM) enabled.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFile  CreateFileRequest
     * @return CreateFileResponse
     */
    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, you must understand the billing and pricing of Apsara File Storage NAS. For more information, see <a href="https://help.aliyun.com/document_detail/178365.html">Billing</a> and <a href="https://www.alibabacloud.com/product/nas/pricing">Pricing</a>.</p>
     * <ul>
     * <li>Before you create a file system, you must complete real-name verification.</li>
     * <li>When you call this operation, a service-linked role of NAS is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked roles of NAS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFileSystem  CreateFileSystemRequest
     * @return CreateFileSystemResponse
     */
    CompletableFuture<CreateFileSystemResponse> createFileSystem(CreateFileSystemRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support fileset creation. You can view the version information on the file system details page in the console.</li>
     * <li>A maximum of 10 filesets can be created for a CPFS file system.</li>
     * <li>The maximum depth supported by a fileset is eight levels. The depth of the root directory / is 0 levels. For example, the /test/aaa/ccc/ fileset has three levels.</li>
     * <li>Nested filesets are not supported. If a fileset is specified as a parent directory, its subdirectory cannot be a fileset.</li>
     * <li>A fileset supports a maximum of one million files. If the number of files exceeds the upper limit, the <code>no space</code> error message is returned when you add new files.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFileset  CreateFilesetRequest
     * @return CreateFilesetResponse
     */
    CompletableFuture<CreateFilesetResponse> createFileset(CreateFilesetRequest request);

    /**
     * @param request the request parameters of CreateLDAPConfig  CreateLDAPConfigRequest
     * @return CreateLDAPConfigResponse
     */
    CompletableFuture<CreateLDAPConfigResponse> createLDAPConfig(CreateLDAPConfigRequest request);

    /**
     * <b>description</b> :
     * <p>  You can create lifecycle policies only for General-purpose NAS file systems.</p>
     * <ul>
     * <li>You can create up to 20 lifecycle policies in each region within an Alibaba Cloud account.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLifecyclePolicy  CreateLifecyclePolicyRequest
     * @return CreateLifecyclePolicyResponse
     */
    CompletableFuture<CreateLifecyclePolicyResponse> createLifecyclePolicy(CreateLifecyclePolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can run a maximum of 20 data retrieval tasks in each region within an Alibaba Cloud account.</li>
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
     * <p>  After you call the CreateMountTarget operation, a mount target is not immediately created. Therefore, we recommend that you call the DescribeMountTargets operation to query the status of the mount target. If the mount target is in the <strong>Active</strong> state, you can then mount the file system. Otherwise, the file system may fail to be mounted.</p>
     * <ul>
     * <li>When you call this operation, a service-linked role of NAS is automatically created. For more information, see <a href="https://help.aliyun.com/document_detail/208530.html">Manage the service-linked roles of NAS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateMountTarget  CreateMountTargetRequest
     * @return CreateMountTargetResponse
     */
    CompletableFuture<CreateMountTargetResponse> createMountTarget(CreateMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Prerequisites
     * A protocol service is created.</li>
     * <li>Others<ul>
     * <li>The virtual private cloud (VPC) CIDR block of the export directory for the protocol service cannot overlap with the VPC CIDR block of the file system.</li>
     * <li>The VPC CIDR blocks of multiple export directories of a protocol service cannot overlap.</li>
     * <li>You can create a maximum of 10 export directories for a protocol service.</li>
     * <li>When you create export directories for a protocol service, a maximum of 32 IP addresses that are allocated by the specified vSwitch are used. Make sure that the vSwitch can provide sufficient IP addresses.</li>
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
     * <p>  This operation is available only to CPFS file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.3.0 and later support protocol services. You can query the version information of the file system by calling the <a href="~~2402188.~~">DescribeFileSystems</a> operation.</li>
     * <li>Protocol service types
     * Protocol services are classified into general-purpose protocol services and cache protocol services. Different from general-purpose protocol services, cache protocol services can cache hot data. If data exists in the cache, the bandwidth of the cache protocol service may exceed the bandwidth of the CPFS file system, reaching the maximum bandwidth specified for the protocol service.<ul>
     * <li>General-purpose protocol services: provide NFS access and <a href="https://help.aliyun.com/document_detail/427175.html">directory-level mount targets</a> for CPFS file systems. You do not need to configure a POSIX client to manage clusters. General-purpose protocol services are provided free of charge.</li>
     * <li>Cache protocol services: provide the server memory cache based on the least recently used (LRU) policy. When data is cached in the memory, CPFS provides higher internal bandwidth. Cache protocol services are divided into Cache L1 and Cache L2 specifications. The differences are the internal bandwidth size and memory cache size.<blockquote>
     * <p>  Note You are charged for using cache protocol services, which are in invitational preview. For more information about the billing method of cache protocol services, see <a href="https://help.aliyun.com/document_detail/111858.html">Billable items</a>. If you have any feedback or questions, you can join the DingTalk group (group number: 31045006299).</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>Protocol type
     * Only NFSv3 is supported.</li>
     * <li>Others<ul>
     * <li>Only one protocol service can be created for a CPFS file system.</li>
     * <li>A protocol service can use a maximum of 32 IP addresses that are allocated by a specified vSwitch. Make sure that the vSwitch can provide sufficient IP addresses.</li>
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
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>If you permanently delete a directory, the files in the directory are recursively cleared.</li>
     * <li>You can run only one job at a time for a single file system to permanently delete the files from the file system. You cannot create a restoration or deletion job when a file or directory is being deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecycleBinDeleteJob  CreateRecycleBinDeleteJobRequest
     * @return CreateRecycleBinDeleteJobResponse
     */
    CompletableFuture<CreateRecycleBinDeleteJobResponse> createRecycleBinDeleteJob(CreateRecycleBinDeleteJobRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Only General-purpose NAS file systems support this operation.</li>
     * <li>You can run only one job at a time for a single file system to restore files to or clear files from the file system. You cannot create a restore or cleanup job when files are being restored from the recycle bin.</li>
     * <li>You can restore only one file or directory in a single restore job. If you restore a specified directory, all files in the directory are recursively restored.</li>
     * <li>After files are restored, the data of the files is defragmented. When the data is being defragmented, the read performance is slightly degraded.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRecycleBinRestoreJob  CreateRecycleBinRestoreJobRequest
     * @return CreateRecycleBinRestoreJobResponse
     */
    CompletableFuture<CreateRecycleBinRestoreJobResponse> createRecycleBinRestoreJob(CreateRecycleBinRestoreJobRequest request);

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>You can create a maximum of 128 snapshots for a file system.</li>
     * <li>The compute node on which a file system is mounted must function as expected. Otherwise, you cannot create a snapshot for the file system.</li>
     * <li>You can create only one snapshot for a file system at a time.</li>
     * <li>If the file system expires when a snapshot is being created, the file system is released and the snapshot is deleted.</li>
     * <li>When you create a snapshot for a file system, the I/O performance of the file system may be degraded for a short period of time. We recommend that you create snapshots during off-peak hours.</li>
     * <li>A snapshot is a backup of a file system at a specific point in time. After you create a snapshot, incremental data that is generated in the file system will not be synchronized to the snapshot.</li>
     * <li>Manually created snapshots will not be deleted until 15 days after the service is suspended due to overdue payments. We recommend that you delete unnecessary snapshots at regular intervals to prevent extra fees incurred by the snapshots.</li>
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
     * <p>  Only General-purpose Network File System (NFS) file systems support access points.</p>
     * <ul>
     * <li>After an access point is deleted, all I/O operations that are being performed on the directory accessed over the access point are interrupted immediately. Exercise caution when you perform this operation.</li>
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
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * <li>If you delete an automatic snapshot policy that is applied to a file system, snapshots for the file system are no longer created based on the policy.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAutoSnapshotPolicy  DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
    CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.4.0 and later support data flows. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>You can delete the data flows that are only in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>After a data flow is deleted, the resources related to the data flow are released and cannot be restored. You must create a data flow again if required.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDataFlow  DeleteDataFlowRequest
     * @return DeleteDataFlowResponse
     */
    CompletableFuture<DeleteDataFlowResponse> deleteDataFlow(DeleteDataFlowRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you delete a file system, you must delete all mount targets of the file system.</p>
     * <ul>
     * <li>Before you delete a file system, you must make sure that no lifecycle policy is created for the file system.</li>
     * <li>After a file system is deleted, the data on the file system cannot be restored. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFileSystem  DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     */
    CompletableFuture<DeleteFileSystemResponse> deleteFileSystem(DeleteFileSystemRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support fileset deletion. After you delete a fileset, all data in the fileset is deleted and cannot be restored. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFileset  DeleteFilesetRequest
     * @return DeleteFilesetResponse
     */
    CompletableFuture<DeleteFilesetResponse> deleteFileset(DeleteFilesetRequest request);

    /**
     * @param request the request parameters of DeleteLDAPConfig  DeleteLDAPConfigRequest
     * @return DeleteLDAPConfigResponse
     */
    CompletableFuture<DeleteLDAPConfigResponse> deleteLDAPConfig(DeleteLDAPConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
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
     * <p>After you delete a mount target, the mount target cannot be restored. Proceed with caution.</p>
     * 
     * @param request the request parameters of DeleteMountTarget  DeleteMountTargetRequest
     * @return DeleteMountTargetResponse
     */
    CompletableFuture<DeleteMountTargetResponse> deleteMountTarget(DeleteMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * 
     * @param request the request parameters of DeleteProtocolMountTarget  DeleteProtocolMountTargetRequest
     * @return DeleteProtocolMountTargetResponse
     */
    CompletableFuture<DeleteProtocolMountTargetResponse> deleteProtocolMountTarget(DeleteProtocolMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to CPFS file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>When you delete a protocol service, the export directories in the protocol service are also deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteProtocolService  DeleteProtocolServiceRequest
     * @return DeleteProtocolServiceResponse
     */
    CompletableFuture<DeleteProtocolServiceResponse> deleteProtocolService(DeleteProtocolServiceRequest request);

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
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
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * @param request the request parameters of DescribeAccessPoint  DescribeAccessPointRequest
     * @return DescribeAccessPointResponse
     */
    CompletableFuture<DescribeAccessPointResponse> describeAccessPoint(DescribeAccessPointRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * @param request the request parameters of DescribeAccessPoints  DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     */
    CompletableFuture<DescribeAccessPointsResponse> describeAccessPoints(DescribeAccessPointsRequest request);

    /**
     * @param request the request parameters of DescribeAccessRules  DescribeAccessRulesRequest
     * @return DescribeAccessRulesResponse
     */
    CompletableFuture<DescribeAccessRulesResponse> describeAccessRules(DescribeAccessRulesRequest request);

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAutoSnapshotPolicies  DescribeAutoSnapshotPoliciesRequest
     * @return DescribeAutoSnapshotPoliciesResponse
     */
    CompletableFuture<DescribeAutoSnapshotPoliciesResponse> describeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support the snapshot feature.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAutoSnapshotTasks  DescribeAutoSnapshotTasksRequest
     * @return DescribeAutoSnapshotTasksResponse
     */
    CompletableFuture<DescribeAutoSnapshotTasksResponse> describeAutoSnapshotTasks(DescribeAutoSnapshotTasksRequest request);

    /**
     * @deprecated OpenAPI DescribeBlackListClients is deprecated  * @description The API operation is available only for CPFS file systems.
     * 
     * @param request the request parameters of DescribeBlackListClients  DescribeBlackListClientsRequest
     * @return DescribeBlackListClientsResponse
     */
    @Deprecated
    CompletableFuture<DescribeBlackListClientsResponse> describeBlackListClients(DescribeBlackListClientsRequest request);

    /**
     * <b>description</b> :
     * <p>Only Cloud Parallel File Storage (CPFS) for LINGJUN V2.6.0 and later support this operation. You can view the version information on the file system details page in the console.</p>
     * 
     * @param request the request parameters of DescribeDataFlowSubTasks  DescribeDataFlowSubTasksRequest
     * @return DescribeDataFlowSubTasksResponse
     */
    CompletableFuture<DescribeDataFlowSubTasksResponse> describeDataFlowSubTasks(DescribeDataFlowSubTasksRequest request);

    /**
     * <b>description</b> :
     * <h3></h3>
     * <ul>
     * <li></li>
     * <li></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDataFlowTasks  DescribeDataFlowTasksRequest
     * @return DescribeDataFlowTasksResponse
     */
    CompletableFuture<DescribeDataFlowTasksResponse> describeDataFlowTasks(DescribeDataFlowTasksRequest request);

    /**
     * <b>description</b> :
     * <p>  Only Cloud Parallel File Storage (CPFS) V2.2.0 and later and CPFS for LINGJUN V2.4.0 and later support data flows. You can view the version information on the file system details page in the console.</p>
     * <ul>
     * <li>In Filters, FsetIds, DataFlowlds, SourceStorage, ThroughputList, and Status support exact match only. FileSystemPath, Description, and SourceStoragePath support fuzzy match.</li>
     * <li>Combined query is supported.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDataFlows  DescribeDataFlowsRequest
     * @return DescribeDataFlowsResponse
     */
    CompletableFuture<DescribeDataFlowsResponse> describeDataFlows(DescribeDataFlowsRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support the directory quota feature.</p>
     * 
     * @param request the request parameters of DescribeDirQuotas  DescribeDirQuotasRequest
     * @return DescribeDirQuotasResponse
     */
    CompletableFuture<DescribeDirQuotasResponse> describeDirQuotas(DescribeDirQuotasRequest request);

    /**
     * @param request the request parameters of DescribeFileSystemStatistics  DescribeFileSystemStatisticsRequest
     * @return DescribeFileSystemStatisticsResponse
     */
    CompletableFuture<DescribeFileSystemStatisticsResponse> describeFileSystemStatistics(DescribeFileSystemStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeFileSystems  DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     */
    CompletableFuture<DescribeFileSystemsResponse> describeFileSystems(DescribeFileSystemsRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support filesets. You can view the version information on the file system details page in the console.</li>
     * <li>In Filters, FsetIds supports exact match only. FileSystemPath and Description support fuzzy match.</li>
     * <li>Combined query is supported.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeFilesets  DescribeFilesetsRequest
     * @return DescribeFilesetsResponse
     */
    CompletableFuture<DescribeFilesetsResponse> describeFilesets(DescribeFilesetsRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of DescribeLifecyclePolicies  DescribeLifecyclePoliciesRequest
     * @return DescribeLifecyclePoliciesResponse
     */
    CompletableFuture<DescribeLifecyclePoliciesResponse> describeLifecyclePolicies(DescribeLifecyclePoliciesRequest request);

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
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>This operation returns the clients that have accessed the specified file system within the last minute. If the file system is mounted on a client but the client did not access the file system within the last minute, the client is not included in the returned information.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMountedClients  DescribeMountedClientsRequest
     * @return DescribeMountedClientsResponse
     */
    CompletableFuture<DescribeMountedClientsResponse> describeMountedClients(DescribeMountedClientsRequest request);

    /**
     * @param request the request parameters of DescribeNfsAcl  DescribeNfsAclRequest
     * @return DescribeNfsAclResponse
     */
    CompletableFuture<DescribeNfsAclResponse> describeNfsAcl(DescribeNfsAclRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * 
     * @param request the request parameters of DescribeProtocolMountTarget  DescribeProtocolMountTargetRequest
     * @return DescribeProtocolMountTargetResponse
     */
    CompletableFuture<DescribeProtocolMountTargetResponse> describeProtocolMountTarget(DescribeProtocolMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
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
     * @param request the request parameters of DescribeSmbAcl  DescribeSmbAclRequest
     * @return DescribeSmbAclResponse
     */
    CompletableFuture<DescribeSmbAclResponse> describeSmbAcl(DescribeSmbAclRequest request);

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
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
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>If you disable the recycle bin, all files in the recycle bin are permanently deleted.</li>
     * <li>If you disable and then enable the recycle bin, the recycle bin is empty. You cannot retrieve the deleted files.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableAndCleanRecycleBin  DisableAndCleanRecycleBinRequest
     * @return DisableAndCleanRecycleBinResponse
     */
    CompletableFuture<DisableAndCleanRecycleBinResponse> disableAndCleanRecycleBin(DisableAndCleanRecycleBinRequest request);

    /**
     * @param request the request parameters of DisableNfsAcl  DisableNfsAclRequest
     * @return DisableNfsAclResponse
     */
    CompletableFuture<DisableNfsAclResponse> disableNfsAcl(DisableNfsAclRequest request);

    /**
     * @param request the request parameters of DisableSmbAcl  DisableSmbAclRequest
     * @return DisableSmbAclResponse
     */
    CompletableFuture<DisableSmbAclResponse> disableSmbAcl(DisableSmbAclRequest request);

    /**
     * @param request the request parameters of EnableNfsAcl  EnableNfsAclRequest
     * @return EnableNfsAclResponse
     */
    CompletableFuture<EnableNfsAclResponse> enableNfsAcl(EnableNfsAclRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of EnableRecycleBin  EnableRecycleBinRequest
     * @return EnableRecycleBinResponse
     */
    CompletableFuture<EnableRecycleBinResponse> enableRecycleBin(EnableRecycleBinRequest request);

    /**
     * @param request the request parameters of EnableSmbAcl  EnableSmbAclRequest
     * @return EnableSmbAclResponse
     */
    CompletableFuture<EnableSmbAclResponse> enableSmbAcl(EnableSmbAclRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of GetDirectoryOrFileProperties  GetDirectoryOrFilePropertiesRequest
     * @return GetDirectoryOrFilePropertiesResponse
     */
    CompletableFuture<GetDirectoryOrFilePropertiesResponse> getDirectoryOrFileProperties(GetDirectoryOrFilePropertiesRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose Apsara File Storage NAS (NAS) file systems support this operation.</p>
     * 
     * @param request the request parameters of GetRecycleBinAttribute  GetRecycleBinAttributeRequest
     * @return GetRecycleBinAttributeResponse
     */
    CompletableFuture<GetRecycleBinAttributeResponse> getRecycleBinAttribute(GetRecycleBinAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of ListDirectoriesAndFiles  ListDirectoriesAndFilesRequest
     * @return ListDirectoriesAndFilesResponse
     */
    CompletableFuture<ListDirectoriesAndFilesResponse> listDirectoriesAndFiles(ListDirectoriesAndFilesRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of ListLifecycleRetrieveJobs  ListLifecycleRetrieveJobsRequest
     * @return ListLifecycleRetrieveJobsResponse
     */
    CompletableFuture<ListLifecycleRetrieveJobsResponse> listLifecycleRetrieveJobs(ListLifecycleRetrieveJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of ListRecentlyRecycledDirectories  ListRecentlyRecycledDirectoriesRequest
     * @return ListRecentlyRecycledDirectoriesResponse
     */
    CompletableFuture<ListRecentlyRecycledDirectoriesResponse> listRecentlyRecycledDirectories(ListRecentlyRecycledDirectoriesRequest request);

    /**
     * <b>description</b> :
     * <p>  Only General-purpose NAS file systems support this operation.</p>
     * <ul>
     * <li>You can query a maximum of 50 jobs that are recently executed.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRecycleBinJobs  ListRecycleBinJobsRequest
     * @return ListRecycleBinJobsResponse
     */
    CompletableFuture<ListRecycleBinJobsResponse> listRecycleBinJobs(ListRecycleBinJobsRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
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
     * <p>Only General-purpose Network File System (NFS) file systems support this operation.</p>
     * 
     * @param request the request parameters of ModifyAccessPoint  ModifyAccessPointRequest
     * @return ModifyAccessPointResponse
     */
    CompletableFuture<ModifyAccessPointResponse> modifyAccessPoint(ModifyAccessPointRequest request);

    /**
     * <b>description</b> :
     * <p>The rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.</p>
     * 
     * @param request the request parameters of ModifyAccessRule  ModifyAccessRuleRequest
     * @return ModifyAccessRuleResponse
     */
    CompletableFuture<ModifyAccessRuleResponse> modifyAccessRule(ModifyAccessRuleRequest request);

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAutoSnapshotPolicy  ModifyAutoSnapshotPolicyRequest
     * @return ModifyAutoSnapshotPolicyResponse
     */
    CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support dataflows.</li>
     * <li>You can modify the attributes only of the dataflows that are in the <code>Running</code> state.</li>
     * <li>It generally takes 2 to 5 minutes to modify the attributes of a dataflow. You can call the <a href="https://help.aliyun.com/document_detail/336901.html">DescribeDataFlows</a> operation to query the status of the dataflow to be modified.</li>
     * <li>Data flow specifications:<ul>
     * <li>The dataflow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The dataflow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a dataflow.</li>
     * <li>Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the dataflow whose throughput is changed meet the requirements.</li>
     * </ul>
     * </li>
     * <li>Billing
     * Changing the dataflow throughput involves the billing of dataflow bandwidth. We recommend that you understand CPFS billing methods in advance. For more information, see <a href="https://help.aliyun.com/document_detail/111858.html">Billing methods and billable items of CPFS</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDataFlow  ModifyDataFlowRequest
     * @return ModifyDataFlowResponse
     */
    CompletableFuture<ModifyDataFlowResponse> modifyDataFlow(ModifyDataFlowRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can modify the AutoRefresh configurations only for the dataflows that are in the <code>Running</code> or <code>Stopped</code> state.</li>
     * <li>It generally takes 2 to 5 minutes to modify an AutoRefresh configuration. You can call the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation to query the task of modifying an AutoRefresh configuration.</li>
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
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support fileset modification.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyFileset  ModifyFilesetRequest
     * @return ModifyFilesetResponse
     */
    CompletableFuture<ModifyFilesetResponse> modifyFileset(ModifyFilesetRequest request);

    /**
     * <b>description</b> :
     * <p>The API operation is available only for Cloud Parallel File Storage (CPFS) file systems.</p>
     * 
     * @param request the request parameters of ModifyLDAPConfig  ModifyLDAPConfigRequest
     * @return ModifyLDAPConfigResponse
     */
    CompletableFuture<ModifyLDAPConfigResponse> modifyLDAPConfig(ModifyLDAPConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of ModifyLifecyclePolicy  ModifyLifecyclePolicyRequest
     * @return ModifyLifecyclePolicyResponse
     */
    CompletableFuture<ModifyLifecyclePolicyResponse> modifyLifecyclePolicy(ModifyLifecyclePolicyRequest request);

    /**
     * @param request the request parameters of ModifyMountTarget  ModifyMountTargetRequest
     * @return ModifyMountTargetResponse
     */
    CompletableFuture<ModifyMountTargetResponse> modifyMountTarget(ModifyMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * 
     * @param request the request parameters of ModifyProtocolMountTarget  ModifyProtocolMountTargetRequest
     * @return ModifyProtocolMountTargetResponse
     */
    CompletableFuture<ModifyProtocolMountTargetResponse> modifyProtocolMountTarget(ModifyProtocolMountTargetRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * 
     * @param request the request parameters of ModifyProtocolService  ModifyProtocolServiceRequest
     * @return ModifyProtocolServiceResponse
     */
    CompletableFuture<ModifyProtocolServiceResponse> modifyProtocolService(ModifyProtocolServiceRequest request);

    /**
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
     * @deprecated OpenAPI RemoveClientFromBlackList is deprecated  * @description The IP address of a client to remove from the blacklist.
     * 
     * @param request the request parameters of RemoveClientFromBlackList  RemoveClientFromBlackListRequest
     * @return RemoveClientFromBlackListResponse
     */
    @Deprecated
    CompletableFuture<RemoveClientFromBlackListResponse> removeClientFromBlackList(RemoveClientFromBlackListRequest request);

    /**
     * @deprecated OpenAPI RemoveTags is deprecated, please use NAS::2017-06-26::UntagResources instead.  * @description >  The tag feature has been upgraded and this document will be unpublished. For more information, see UntagResources.
     * A request ID is returned even if the tag that you want to remove or the associated file system does not exist. For example, if the associated file system does not exist, or the TagKey and TagValue cannot be found, a request ID is still returned.
     * 
     * @param request the request parameters of RemoveTags  RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    @Deprecated
    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
     * <b>description</b> :
     * <p>  The snapshot feature is in public preview and is provided free of charge. <a href="https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement">Apsara File Storage NAS Service Level Agreement (SLA)</a> is not guaranteed in public preview.</p>
     * <ul>
     * <li>Only advanced Extreme NAS file systems support this feature.</li>
     * <li>The file system must be in the Running state.</li>
     * <li>To roll back a file system to a snapshot, you must specify the ID of the snapshot that is created from the file system.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetFileSystem  ResetFileSystemRequest
     * @return ResetFileSystemResponse
     */
    CompletableFuture<ResetFileSystemResponse> resetFileSystem(ResetFileSystemRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of RetryLifecycleRetrieveJob  RetryLifecycleRetrieveJobRequest
     * @return RetryLifecycleRetrieveJobResponse
     */
    CompletableFuture<RetryLifecycleRetrieveJobResponse> retryLifecycleRetrieveJob(RetryLifecycleRetrieveJobRequest request);

    /**
     * <b>description</b> :
     * <p>Only General-purpose Apsara File Storage NAS (NAS) file systems support the directory quota feature.</p>
     * 
     * @param request the request parameters of SetDirQuota  SetDirQuotaRequest
     * @return SetDirQuotaResponse
     */
    CompletableFuture<SetDirQuotaResponse> setDirQuota(SetDirQuotaRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support data flows. You can view the version information on the file system details page in the console.</li>
     * <li>You can enable the data flows that are only in the <code>Stopped</code> state.</li>
     * <li>If the value of DryRun is <code>true</code>, you can check whether sufficient resources are available to enable the specified data flow. If the resources are insufficient, the data flow cannot be enabled.</li>
     * <li>It generally takes 2 to 5 minutes to enable a data flow. You can query the data flow status by calling the <a href="https://help.aliyun.com/document_detail/2402270.html">DescribeDataFlows</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of StartDataFlow  StartDataFlowRequest
     * @return StartDataFlowResponse
     */
    CompletableFuture<StartDataFlowResponse> startDataFlow(StartDataFlowRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).</p>
     * <ul>
     * <li>Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.</li>
     * <li>You can disable only the dataflows that are in the <code>Running</code> state.</li>
     * <li>After a dataflow is disabled, you cannot create a dataflow task for the dataflow. If AutoRefresh is configured, source data updates are not synchronized to CPFS.</li>
     * <li>After a dataflow is disabled, the dataflow throughput is no longer billed because resources are reclaimed. However, the dataflow may fail to be restarted due to insufficient resources.</li>
     * <li>It generally takes 2 to 5 minutes to disable a dataflow. You can call the <a href="https://help.aliyun.com/document_detail/2402271.html">DescribeDataFlows</a> operation to query the dataflow status.</li>
     * </ul>
     * 
     * @param request the request parameters of StopDataFlow  StopDataFlowRequest
     * @return StopDataFlowResponse
     */
    CompletableFuture<StopDataFlowResponse> stopDataFlow(StopDataFlowRequest request);

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
     * <b>description</b> :
     * <p>Only General-purpose NAS file systems support this operation.</p>
     * 
     * @param request the request parameters of UpdateRecycleBinAttribute  UpdateRecycleBinAttributeRequest
     * @return UpdateRecycleBinAttributeResponse
     */
    CompletableFuture<UpdateRecycleBinAttributeResponse> updateRecycleBinAttribute(UpdateRecycleBinAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  Only Extreme NAS file systems and CPFS file systems can be scaled up. CPFS file systems are available only on the China site (aliyun.com).</p>
     * <ul>
     * <li>A General-purpose NAS file system is automatically scaled up. You do not need to call this operation to scale up a General-purpose NAS file system.</li>
     * </ul>
     * 
     * @param request the request parameters of UpgradeFileSystem  UpgradeFileSystemRequest
     * @return UpgradeFileSystemResponse
     */
    CompletableFuture<UpgradeFileSystemResponse> upgradeFileSystem(UpgradeFileSystemRequest request);

}
