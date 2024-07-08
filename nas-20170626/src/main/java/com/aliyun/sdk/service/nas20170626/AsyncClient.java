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
      * The API operation is available only for CPFS file systems.
      *
     */
    CompletableFuture<AddClientToBlackListResponse> addClientToBlackList(AddClientToBlackListRequest request);

    /**
      * ## Limits
      * *   Each tag includes a TagKey and a TagValue.
      * *   Placeholders at the start and end of each TagKey and TagValue are automatically removed. These placeholders include the spacebar ( ), tab (\\t), line break (\\n), and carriage return (\\r).
      * *   You must specify a TagKey. You can leave a TagValue empty.
      * *   A TagKey and TagValue are not case-sensitive.
      * *   A TagKey can be a maximum of 64 characters in length. A TagValue can be a maximum of 128 characters in length.
      * *   You can add a maximum of 10 tags to a file system at a time. If you add two tags with the same TagKey, the new tag added will overwrite the existing tag.
      * *   If you remove a tag from all linked file systems, the tag is automatically deleted.
      *
     */
    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support this feature.
      * *   You can apply only one automatic snapshot policy to each file system.
      * *   Each automatic snapshot policy can be applied to multiple file systems.
      * *   If an automatic snapshot policy is applied to a file system, you can call the ApplyAutoSnapshotPolicy operation to change the automatic snapshot policy.
      *
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
      * *   You can add AutoRefresh configurations only to the dataflows that are in the `Running` state.
      * *   You can add a maximum of five AutoRefresh configurations to a dataflow.
      * *   It generally takes 2 to 5 minutes to create an AutoRefresh configuration. You can call the [DescribeDataFlows](~~336901~~) operation to query the dataflow status.
      * *   AutoRefresh depends on the object modification events collected by EventBridge from the source Object Storage Service (OSS) bucket. You must first [activate EventBridge](~~182246~~).
      *     **
      *     **Note** The event buses and event rules created for CPFS in the EventBridge console contain the `Create for cpfs auto refresh` description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly.
      * *   The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. When you add an AutoRefresh configuration to the prefix for a CPFS dataflow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS dataflow.
      * *   After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a dataflow task to load the updated data.
      * *   AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS dataflow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the dataflow status becomes Misconfigured. To resolve these issues, you can increase the dataflow specifications or reduce the frequency of triggering the object modification event.
      *
     */
    CompletableFuture<ApplyDataFlowAutoRefreshResponse> applyDataFlowAutoRefresh(ApplyDataFlowAutoRefreshRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support this feature.
      *
     */
    CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
      * *   You can cancel AutoRefresh configurations only for the dataflows that are in the `Running` or `Stopped` state.
      * *   It generally takes 2 to 5 minutes to cancel the AutoRefresh configurations. You can call the [DescribeDataFlows](~~336901~~) operation to query the status of the AutoRefresh tasks.
      *
     */
    CompletableFuture<CancelDataFlowAutoRefreshResponse> cancelDataFlowAutoRefresh(CancelDataFlowAutoRefreshRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support dataflow tasks. You can view the version information on the file system details page in the console.
      * *   You can cancel only the dataflow tasks that are in the `Pending` and `Executing` states.
      * *   It generally takes 5 to 10 minutes to cancel a dataflow task. You can query the task execution status by calling the [DescribeDataFlowTasks](~~2402275~~) operation.
      *
     */
    CompletableFuture<CancelDataFlowTaskResponse> cancelDataFlowTask(CancelDataFlowTaskRequest request);

    /**
      * Only General-purpose file systems support the directory quota feature.
      *
     */
    CompletableFuture<CancelDirQuotaResponse> cancelDirQuota(CancelDirQuotaRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<CancelLifecycleRetrieveJobResponse> cancelLifecycleRetrieveJob(CancelLifecycleRetrieveJobRequest request);

    /**
      * *   Only General-purpose NAS file systems support this operation.
      * *   You can cancel only jobs that are in the Running state. You cannot cancel jobs that are in the PartialSuccess, Success, Fail, or Cancelled state.
      * *   If you cancel a running job that permanently deletes files, you cannot restore the files that are already permanently deleted.
      * *   If you cancel a running job that restores files, you can query the restored files from the file system, and query the unrestored files from the recycle bin.
      *
     */
    CompletableFuture<CancelRecycleBinJobResponse> cancelRecycleBinJob(CancelRecycleBinJobRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CreateAccessGroupResponse> createAccessGroup(CreateAccessGroupRequest request);

    CompletableFuture<CreateAccessPointResponse> createAccessPoint(CreateAccessPointRequest request);

    CompletableFuture<CreateAccessRuleResponse> createAccessRule(CreateAccessRuleRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support the snapshot feature.
      * *   You can create a maximum of 100 automatic snapshot policies in each region for an Alibaba Cloud account.
      * *   If an auto snapshot is being created when the scheduled time for a new auto snapshot arrives, the creation of the new snapshot is skipped. This occurs if the file system stores a large volume of data. For example, you have scheduled auto snapshots to be created at 09:00:00, 10:00:00, 11:00:00, and 12:00:00 for a file system. The system starts to create an auto snapshot at 09:00:00 and does not complete the process until 10:20:00. The process takes 80 minutes because the file system has a large volume of data. In this case, the system does not create an auto snapshot at 10:00:00, but creates an auto snapshot at 11:00:00.
      * *   A maximum of 128 auto snapshots can be created for a file system. If the upper limit is reached, the earliest auto snapshot is deleted. This rule does not apply to manual snapshots.
      * *   If you modify the retention period of an automatic snapshot policy, the modification applies only to subsequent snapshots, but not to the existing snapshots.
      * *   If an auto snapshot is being created for a file system, you cannot create a manual snapshot for the file system. You must wait after the auto snapshot is created.
      * *   You can only apply automatic snapshot policies to a file system that is in the Running state.
      * *   All auto snapshots are named in the `auto_yyyyMMdd_X` format, where: `auto` indicates that the snapshot is created based on an automatic snapshot policy. `yyyyMMdd` indicates the date on which the snapshot is created. `y` indicates the year. `M` indicates the month. `d` indicates the day. `X` indicates the ordinal number of the snapshot on the current day. For example, `auto_20201018_1` indicates the first auto snapshot that was created on October 18, 2020.
      * *   After an automatic snapshot policy is created, you can call the ApplyAutoSnapshotPolicy operation to apply the policy to a file system and call the ModifyAutoSnapshotPolicy operation to modify the policy.
      *
     */
    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    /**
      * *   Billing
      *     *   If you create a dataflow, you are charged for using the dataflow throughput. For more information, see [Billing methods and billable items of CPFS](~~111858~~).
      *     *   When you configure the AutoRefresh feature for a dataflow, CPFS must use EventBridge to collect object modification events from the source Object Storage Service (OSS) bucket. Event fees are incurred. For more information, see [Billing of EventBridge](~~163752~~).
      * *   Dataflow specifications
      *     *   The dataflow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The dataflow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a dataflow.
      *     *   When you create a dataflow, the vSwitch IP addresses used by a CPFS mount target are consumed. Make sure that the vSwitch can provide sufficient IP addresses.
      *     *   Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the dataflow whose throughput is changed meet the requirements.
      * *   Fileset
      *     *   The destination for a dataflow is a fileset in the CPFS file system. A fileset is a new directory tree structure (a small file directory) in a CPFS file system. Each fileset independently manages an inode space.
      *     *   When you create a dataflow, the related fileset must already exist and cannot be nested with other filesets. Only one dataflow can be created in a fileset, which corresponds to one source storage.
      *     *   A fileset supports a maximum of one million files. If the number of files imported from an OSS bucket into the fileset exceeds the upper limit, the `no space` error message is returned when you add new files.
      *     **
      *     **Note** If data already exists in the fileset, after you create a dataflow, the existing data in the fileset is cleared and replaced with the data synchronized from the OSS bucket.
      * *   Source storage
      *     *   The source storage is an OSS bucket. SourceStorage for a dataflow must be an OSS bucket. The prefix of an OSS bucket is not supported.
      *     *   CPFS dataflows support both encrypted and unencrypted access to OSS. If you select SSL-encrypted access to OSS, make sure that encryption in transit for OSS buckets supports encrypted access.
      *     *   If dataflows for multiple CPFS file systems or multiple dataflows for the same CPFS file system are stored in the same OSS bucket, you must enable versioning for the OSS bucket to prevent data conflicts caused by data export from multiple CPFS file systems to one OSS bucket.
      *     *   Dataflows are not supported for OSS buckets across regions. The OSS bucket must reside in the same region as the CPFS file system.
      *         **
      *         **Note** Before you create a dataflow, you must configure a tag (key: cpfs-dataflow, value: true) for the source OSS bucket. This way, the created dataflow can access the data in the OSS bucket. When a dataflow is being used, do not delete or modify the tag. Otherwise, the dataflow for CPFS cannot access the data in the OSS bucket.
      * *   AutoRefresh
      *     *   After AutoRefresh is configured, if the data in the source OSS bucket is updated, the updated metadata is automatically synchronized to the CPFS file system. You can load the updated data when you access files, or run a dataflow task to load the updated data.
      *     *   AutoRefresh depends on the object modification events collected by EventBridge from the source OSS bucket. You must first [activate EventBridge](~~182246~~).
      *     *   The AutoRefresh configuration applies only to the prefix and is specified by the RefreshPath parameter. You can configure a maximum of five AutoRefresh directories for a dataflow.
      *     *   AutoRefreshInterval refers to the interval at which CPFS checks whether data is updated in the prefix of the source OSS bucket. If data is updated, CPFS runs an AutoRefresh task. If the frequency of triggering the object modification event in the source OSS bucket exceeds the processing capability of the CPFS dataflow, AutoRefresh tasks are accumulated, metadata updates are delayed, and the dataflow status becomes `Misconfigured`. To resolve these issues, you can increase the dataflow specifications or reduce the frequency of triggering the object modification event.
      *     *   When you add an AutoRefresh configuration to the prefix for a CPFS dataflow, an event bus is created at the user side and an event rule is created for the prefix of the source OSS bucket. When an object is modified in the prefix of the source OSS bucket, an OSS event is generated in the EventBridge console. The event is processed by the CPFS dataflow.
      *     **
      *     **Note** The event buses and event rules created for CPFS in the EventBridge console contain the `Create for cpfs auto refresh` description. The event buses and event rules cannot be modified or deleted. Otherwise, AutoRefresh cannot work properly
      * *   Permissions
      *     When you create a dataflow, CPFS obtains two service-linked roles: `AliyunServiceRoleForNasOssDataflow` and `AliyunServiceRoleForNasEventNotification`. For more information, see [CPFS service-linked roles](~~185138~~).
      * *   Basic operations
      *     *   Only CPFS V2.2.0 and later support dataflows.
      *     *   You can create a dataflow only if the CPFS file system is in the Running state.
      *     *   A maximum of 10 dataflows can be created for a CPFS file system.
      *     *   It generally takes 2 to 5 minutes to create a dataflow. You can call the DescribeDataFlows operation to check whether the dataflow has been created.
      *
     */
    CompletableFuture<CreateDataFlowResponse> createDataFlow(CreateDataFlowRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Dataflow tasks can be created only in CPFS V2.2.0 and later. You can view the version information on the file system details page in the console.
      * *   You can create a dataflow task only for a dataflow that is in the Running state.
      * *   Dataflow tasks are executed asynchronously. You can call the [DescribeDataFlowTasks](~~336914~~) operation to query the task execution status. The task duration depends on the amount of data to be imported and exported. If a large amount of data exists, we recommend that you create multiple tasks.
      * *   When you manually run a dataflow task, the automatic data update task for the dataflow is interrupted and enters the pending state.
      *
     */
    CompletableFuture<CreateDataFlowTaskResponse> createDataFlowTask(CreateDataFlowTaskRequest request);

    CompletableFuture<CreateDirResponse> createDir(CreateDirRequest request);

    /**
      * *   This operation is only available to some users.
      * *   This operation supports only General-purpose NAS file systems that use the Server Message Block (SMB) protocol and have Resource Access Management (RAM) enabled.
      *
     */
    CompletableFuture<CreateFileResponse> createFile(CreateFileRequest request);

    /**
      * *   Before you call this operation, you must understand the billing and pricing of Apsara File Storage NAS. For more information, see [Billing](~~178365~~) and [Pricing](https://www.alibabacloud.com/product/nas/pricing).
      * *   Before you create a file system, you must complete real-name verification.
      * *   When you call this operation, a service-linked role of NAS is automatically created. For more information, see [Manage the service-linked roles of NAS](~~208530~~).
      *
     */
    CompletableFuture<CreateFileSystemResponse> createFileSystem(CreateFileSystemRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support fileset creation. You can view the version information on the file system details page in the console.
      * *   A maximum of 10 filesets can be created for a CPFS file system.
      * *   The maximum depth supported by a fileset is eight levels. The depth of the root directory / is 0 levels. For example, the /test/aaa/ccc/ fileset has three levels.
      * *   Nested filesets are not supported. If a fileset is specified as a parent directory, its subdirectory cannot be a fileset.
      * *   A fileset supports a maximum of one million files. If the number of files exceeds the upper limit, the `no space` error message is returned when you add new files.
      *
     */
    CompletableFuture<CreateFilesetResponse> createFileset(CreateFilesetRequest request);

    CompletableFuture<CreateLDAPConfigResponse> createLDAPConfig(CreateLDAPConfigRequest request);

    /**
      * *   You can create lifecycle policies only for General-purpose NAS file systems.
      * *   You can create up to 20 lifecycle policies in each region within an Alibaba Cloud account.
      *
     */
    CompletableFuture<CreateLifecyclePolicyResponse> createLifecyclePolicy(CreateLifecyclePolicyRequest request);

    /**
      * *   Only General-purpose NAS file systems support this operation.
      * *   You can run a maximum of 20 data retrieval tasks in each region within an Alibaba Cloud account.
      *
     */
    CompletableFuture<CreateLifecycleRetrieveJobResponse> createLifecycleRetrieveJob(CreateLifecycleRetrieveJobRequest request);

    CompletableFuture<CreateLogAnalysisResponse> createLogAnalysis(CreateLogAnalysisRequest request);

    /**
      * *   After you call the CreateMountTarget operation, a mount target is not immediately created. Therefore, we recommend that you call the DescribeMountTargets operation to query the status of the mount target. If the mount target is in the **Active** state, you can then mount the file system. Otherwise, the file system may fail to be mounted.
      * *   When you call this operation, a service-linked role of NAS is automatically created. For more information, see [Manage the service-linked roles of NAS](~~208530~~).
      *
     */
    CompletableFuture<CreateMountTargetResponse> createMountTarget(CreateMountTargetRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Prerequisites
      *     A protocol service is created.
      * *   Others
      *     *   The virtual private cloud (VPC) CIDR block of the export directory for the protocol service cannot overlap with the VPC CIDR block of the file system.
      *     *   The VPC CIDR blocks of multiple export directories of a protocol service cannot overlap.
      *     *   You can create a maximum of 10 export directories for a protocol service.
      *     *   When you create export directories for a protocol service, a maximum of 32 IP addresses that are allocated by the specified vSwitch are used. Make sure that the vSwitch can provide sufficient IP addresses.
      *
     */
    CompletableFuture<CreateProtocolMountTargetResponse> createProtocolMountTarget(CreateProtocolMountTargetRequest request);

    /**
      * *   This operation is available only to CPFS file systems on the China site (aliyun.com).
      * *   Only CPFS V2.3.0 and later support protocol services. You can query the version information of the file system by calling the [DescribeFileSystems](~~2402188.~~) operation.
      * *   Protocol service types
      *     Protocol services are classified into general-purpose protocol services and cache protocol services. Different from general-purpose protocol services, cache protocol services can cache hot data. If data exists in the cache, the bandwidth of the cache protocol service may exceed the bandwidth of the CPFS file system, reaching the maximum bandwidth specified for the protocol service.
      *     *   General-purpose protocol services: provide NFS access and [directory-level mount targets](~~427175~~) for CPFS file systems. You do not need to configure a POSIX client to manage clusters. General-purpose protocol services are provided free of charge.
      *     *   Cache protocol services: provide the server memory cache based on the least recently used (LRU) policy. When data is cached in the memory, CPFS provides higher internal bandwidth. Cache protocol services are divided into Cache L1 and Cache L2 specifications. The differences are the internal bandwidth size and memory cache size.
      *        >   Note You are charged for using cache protocol services, which are in invitational preview. For more information about the billing method of cache protocol services, see [Billable items](~~111858~~). If you have any feedback or questions, you can join the DingTalk group (group number: 31045006299).
      * *   Protocol type
      *     Only NFSv3 is supported.
      * *   Others
      *     *   Only one protocol service can be created for a CPFS file system.
      *     *   A protocol service can use a maximum of 32 IP addresses that are allocated by a specified vSwitch. Make sure that the vSwitch can provide sufficient IP addresses.
      *
     */
    CompletableFuture<CreateProtocolServiceResponse> createProtocolService(CreateProtocolServiceRequest request);

    /**
      * *   Only General-purpose NAS file systems support this operation.
      * *   If you permanently delete a directory, the files in the directory are recursively cleared.
      * *   You can run only one job at a time for a single file system to permanently delete the files from the file system. You cannot create a restoration or deletion job when a file or directory is being deleted.
      *
     */
    CompletableFuture<CreateRecycleBinDeleteJobResponse> createRecycleBinDeleteJob(CreateRecycleBinDeleteJobRequest request);

    /**
      * ### Usage notes
      * *   Only General-purpose NAS file systems support this operation.
      * *   You can run only one job at a time for a single file system to restore files to or clear files from the file system. You cannot create a restore or cleanup job when files are being restored from the recycle bin.
      * *   You can restore only one file or directory in a single restore job. If you restore a specified directory, all files in the directory are recursively restored.
      * *   After files are restored, the data of the files is defragmented. When the data is being defragmented, the read performance is slightly degraded.
      *
     */
    CompletableFuture<CreateRecycleBinRestoreJobResponse> createRecycleBinRestoreJob(CreateRecycleBinRestoreJobRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/zh/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support the snapshot feature.
      * *   You can create a maximum of 128 snapshots for a file system.
      * *   The compute node on which a file system is mounted must function as expected. Otherwise, you cannot create a snapshot for the file system.
      * *   You can create only one snapshot for a file system at a time.
      * *   If the file system expires when a snapshot is being created, the file system is released and the snapshot is deleted.
      * *   When you create a snapshot for a file system, the I/O performance of the file system may be degraded for a short period of time. We recommend that you create snapshots during off-peak hours.
      * *   A snapshot is a backup of a file system at a specific point in time. After you create a snapshot, incremental data that is generated in the file system will not be synchronized to the snapshot.
      * *   Manually created snapshots will not be deleted until 15 days after the service is suspended due to overdue payments. We recommend that you delete unnecessary snapshots at regular intervals to prevent extra fees incurred by the snapshots.
      *
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
      * The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.
      *
     */
    CompletableFuture<DeleteAccessGroupResponse> deleteAccessGroup(DeleteAccessGroupRequest request);

    CompletableFuture<DeleteAccessPointResponse> deleteAccessPoint(DeleteAccessPointRequest request);

    /**
      * Rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be deleted.
      *
     */
    CompletableFuture<DeleteAccessRuleResponse> deleteAccessRule(DeleteAccessRuleRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support the snapshot feature.
      * *   If you delete an automatic snapshot policy that is applied to a file system, snapshots for the file system are no longer created based on the policy.
      *
     */
    CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   You can create filesets only in CPFS V2.2.0 and later. You can view the version information on the file system details page in the console.
      * *   You can delete the dataflows that are only in the `Running` or `Stopped` state.
      * *   After a dataflow is deleted, the resources related to the dataflow are released and cannot be restored. You must create a dataflow again if required.
      *
     */
    CompletableFuture<DeleteDataFlowResponse> deleteDataFlow(DeleteDataFlowRequest request);

    /**
      * *   Before you delete a file system, you must delete all mount targets of the file system.
      * *   Before you delete a file system, you must make sure that no lifecycle policy is created for the file system.
      * *   After a file system is deleted, the data on the file system cannot be restored. Proceed with caution.
      *
     */
    CompletableFuture<DeleteFileSystemResponse> deleteFileSystem(DeleteFileSystemRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support fileset deletion. After you delete a fileset, all data in the fileset is deleted and cannot be restored. Proceed with caution.
      *
     */
    CompletableFuture<DeleteFilesetResponse> deleteFileset(DeleteFilesetRequest request);

    CompletableFuture<DeleteLDAPConfigResponse> deleteLDAPConfig(DeleteLDAPConfigRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<DeleteLifecyclePolicyResponse> deleteLifecyclePolicy(DeleteLifecyclePolicyRequest request);

    CompletableFuture<DeleteLogAnalysisResponse> deleteLogAnalysis(DeleteLogAnalysisRequest request);

    /**
      * After you delete a mount target, the mount target cannot be restored. Proceed with caution.
      *
     */
    CompletableFuture<DeleteMountTargetResponse> deleteMountTarget(DeleteMountTargetRequest request);

    /**
      * This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      *
     */
    CompletableFuture<DeleteProtocolMountTargetResponse> deleteProtocolMountTarget(DeleteProtocolMountTargetRequest request);

    /**
      * *   This operation is available only to CPFS file systems on the China site (aliyun.com).
      * *   When you delete a protocol service, the export directories in the protocol service are also deleted.
      *
     */
    CompletableFuture<DeleteProtocolServiceResponse> deleteProtocolService(DeleteProtocolServiceRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support this feature.
      *
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    CompletableFuture<DescribeAccessGroupsResponse> describeAccessGroups(DescribeAccessGroupsRequest request);

    CompletableFuture<DescribeAccessPointResponse> describeAccessPoint(DescribeAccessPointRequest request);

    CompletableFuture<DescribeAccessPointsResponse> describeAccessPoints(DescribeAccessPointsRequest request);

    CompletableFuture<DescribeAccessRulesResponse> describeAccessRules(DescribeAccessRulesRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support this feature.
      *
     */
    CompletableFuture<DescribeAutoSnapshotPoliciesResponse> describeAutoSnapshotPolicies(DescribeAutoSnapshotPoliciesRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support the snapshot feature.
      *
     */
    CompletableFuture<DescribeAutoSnapshotTasksResponse> describeAutoSnapshotTasks(DescribeAutoSnapshotTasksRequest request);

    /**
      * The API operation is available only for CPFS file systems.
      *
     */
    CompletableFuture<DescribeBlackListClientsResponse> describeBlackListClients(DescribeBlackListClientsRequest request);

    /**
      * ###
      * *
      * *
      *
     */
    CompletableFuture<DescribeDataFlowTasksResponse> describeDataFlowTasks(DescribeDataFlowTasksRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
      * *   In Filters, FsetIds, DataFlowlds, SourceStorage, ThroughputList, and Status support exact match only. FileSystemPath and Description support fuzzy match.
      * *   Combined query is supported.
      *
     */
    CompletableFuture<DescribeDataFlowsResponse> describeDataFlows(DescribeDataFlowsRequest request);

    /**
      * Only General-purpose NAS file systems support the directory quota feature.
      *
     */
    CompletableFuture<DescribeDirQuotasResponse> describeDirQuotas(DescribeDirQuotasRequest request);

    CompletableFuture<DescribeFileSystemStatisticsResponse> describeFileSystemStatistics(DescribeFileSystemStatisticsRequest request);

    CompletableFuture<DescribeFileSystemsResponse> describeFileSystems(DescribeFileSystemsRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support filesets. You can view the version information on the file system details page in the console.
      * *   In Filters, FsetIds supports exact match only. FileSystemPath and Description support fuzzy match.
      * *   Combined query is supported.
      *
     */
    CompletableFuture<DescribeFilesetsResponse> describeFilesets(DescribeFilesetsRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<DescribeLifecyclePoliciesResponse> describeLifecyclePolicies(DescribeLifecyclePoliciesRequest request);

    CompletableFuture<DescribeLogAnalysisResponse> describeLogAnalysis(DescribeLogAnalysisRequest request);

    CompletableFuture<DescribeMountTargetsResponse> describeMountTargets(DescribeMountTargetsRequest request);

    /**
      * *   Only General-purpose NAS file systems support this operation.
      * *   This operation returns the clients that have accessed the specified file system within the last minute. If the file system is mounted on a client but the client did not access the file system within the last minute, the client is not included in the returned information.
      *
     */
    CompletableFuture<DescribeMountedClientsResponse> describeMountedClients(DescribeMountedClientsRequest request);

    CompletableFuture<DescribeNfsAclResponse> describeNfsAcl(DescribeNfsAclRequest request);

    /**
      * This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      *
     */
    CompletableFuture<DescribeProtocolMountTargetResponse> describeProtocolMountTarget(DescribeProtocolMountTargetRequest request);

    /**
      * This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      *
     */
    CompletableFuture<DescribeProtocolServiceResponse> describeProtocolService(DescribeProtocolServiceRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeSmbAclResponse> describeSmbAcl(DescribeSmbAclRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support this feature.
      *
     */
    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    CompletableFuture<DescribeStoragePackagesResponse> describeStoragePackages(DescribeStoragePackagesRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
      * *   Only General-purpose NAS file systems support this operation.
      * *   If you disable the recycle bin, all files in the recycle bin are permanently deleted.
      * *   If you disable and then enable the recycle bin, the recycle bin is empty. You cannot retrieve the deleted files.
      *
     */
    CompletableFuture<DisableAndCleanRecycleBinResponse> disableAndCleanRecycleBin(DisableAndCleanRecycleBinRequest request);

    CompletableFuture<DisableNfsAclResponse> disableNfsAcl(DisableNfsAclRequest request);

    CompletableFuture<DisableSmbAclResponse> disableSmbAcl(DisableSmbAclRequest request);

    CompletableFuture<EnableNfsAclResponse> enableNfsAcl(EnableNfsAclRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<EnableRecycleBinResponse> enableRecycleBin(EnableRecycleBinRequest request);

    CompletableFuture<EnableSmbAclResponse> enableSmbAcl(EnableSmbAclRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<GetDirectoryOrFilePropertiesResponse> getDirectoryOrFileProperties(GetDirectoryOrFilePropertiesRequest request);

    CompletableFuture<GetRecycleBinAttributeResponse> getRecycleBinAttribute(GetRecycleBinAttributeRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<ListDirectoriesAndFilesResponse> listDirectoriesAndFiles(ListDirectoriesAndFilesRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<ListLifecycleRetrieveJobsResponse> listLifecycleRetrieveJobs(ListLifecycleRetrieveJobsRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<ListRecentlyRecycledDirectoriesResponse> listRecentlyRecycledDirectories(ListRecentlyRecycledDirectoriesRequest request);

    /**
      * *   Only General-purpose NAS file systems support this operation.
      * *   You can query a maximum of 50 jobs that are recently executed.
      *
     */
    CompletableFuture<ListRecycleBinJobsResponse> listRecycleBinJobs(ListRecycleBinJobsRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<ListRecycledDirectoriesAndFilesResponse> listRecycledDirectoriesAndFiles(ListRecycledDirectoriesAndFilesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * The default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.
      *
     */
    CompletableFuture<ModifyAccessGroupResponse> modifyAccessGroup(ModifyAccessGroupRequest request);

    CompletableFuture<ModifyAccessPointResponse> modifyAccessPoint(ModifyAccessPointRequest request);

    /**
      * The rules in the default permission group (DEFAULT_VPC_GROUP_NAME) cannot be modified.
      *
     */
    CompletableFuture<ModifyAccessRuleResponse> modifyAccessRule(ModifyAccessRuleRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support this feature.
      *
     */
    CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support dataflows.
      * *   You can modify the attributes only of the dataflows that are in the `Running` state.
      * *   It generally takes 2 to 5 minutes to modify the attributes of a dataflow. You can call the [DescribeDataFlows](~~336901~~) operation to query the status of the dataflow to be modified.
      * *   Data flow specifications:
      *     *   The dataflow throughput supports the following specifications: 600 MB/s, 1,200 MB/s, and 1,500 MB/s. The dataflow throughput is the maximum transmission bandwidth that can be reached when data is imported or exported for a dataflow.
      *     *   Inventory query: If you set the DryRun parameter to true, you can check whether the resources for the dataflow whose throughput is changed meet the requirements.
      * *   Billing
      *     Changing the dataflow throughput involves the billing of dataflow bandwidth. We recommend that you understand CPFS billing methods in advance. For more information, see [Billing methods and billable items of CPFS](~~111858~~).
      *
     */
    CompletableFuture<ModifyDataFlowResponse> modifyDataFlow(ModifyDataFlowRequest request);

    CompletableFuture<ModifyDataFlowAutoRefreshResponse> modifyDataFlowAutoRefresh(ModifyDataFlowAutoRefreshRequest request);

    CompletableFuture<ModifyFileSystemResponse> modifyFileSystem(ModifyFileSystemRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support fileset modification.
      *
     */
    CompletableFuture<ModifyFilesetResponse> modifyFileset(ModifyFilesetRequest request);

    /**
      * #
      *
     */
    CompletableFuture<ModifyLDAPConfigResponse> modifyLDAPConfig(ModifyLDAPConfigRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<ModifyLifecyclePolicyResponse> modifyLifecyclePolicy(ModifyLifecyclePolicyRequest request);

    CompletableFuture<ModifyMountTargetResponse> modifyMountTarget(ModifyMountTargetRequest request);

    /**
      * This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      *
     */
    CompletableFuture<ModifyProtocolMountTargetResponse> modifyProtocolMountTarget(ModifyProtocolMountTargetRequest request);

    /**
      * This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      *
     */
    CompletableFuture<ModifyProtocolServiceResponse> modifyProtocolService(ModifyProtocolServiceRequest request);

    CompletableFuture<ModifySmbAclResponse> modifySmbAcl(ModifySmbAclRequest request);

    CompletableFuture<OpenNASServiceResponse> openNASService(OpenNASServiceRequest request);

    /**
      * The IP address of a client to remove from the blacklist.
      *
     */
    CompletableFuture<RemoveClientFromBlackListResponse> removeClientFromBlackList(RemoveClientFromBlackListRequest request);

    /**
      * A request ID is returned even if the tag that you want to remove or the associated file system does not exist. For example, if the associated file system does not exist, or the TagKey and TagValue cannot be found, a request ID is returned.
      *
     */
    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
      * *   The snapshot feature is in public preview and is provided free of charge. [Apsara File Storage NAS Service Level Agreement (SLA)](https://www.alibabacloud.com/help/legal/latest/network-attached-storage-service-level-agreement) is not guaranteed in public preview.
      * *   Only advanced Extreme NAS file systems support this feature.
      * *   The file system must be in the Running state.
      * *   To roll back a file system to a snapshot, you must specify the ID of the snapshot that is created from the file system.
      *
     */
    CompletableFuture<ResetFileSystemResponse> resetFileSystem(ResetFileSystemRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<RetryLifecycleRetrieveJobResponse> retryLifecycleRetrieveJob(RetryLifecycleRetrieveJobRequest request);

    /**
      * Only General-purpose Apsara File Storage NAS (NAS) file systems support the directory quota feature.
      *
     */
    CompletableFuture<SetDirQuotaResponse> setDirQuota(SetDirQuotaRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
      * *   You can enable the dataflows that are only in the `Stopped` state.
      * *   If the value of DryRun is `true`, you can check whether sufficient resources are available to enable the specified dataflow. If the resources are insufficient, the dataflow cannot be enabled.
      * *   It generally takes 2 to 5 minutes to enable a dataflow. You can query the dataflow status by calling the [DescribeDataFlows](~~2402270~~) operation.
      *
     */
    CompletableFuture<StartDataFlowResponse> startDataFlow(StartDataFlowRequest request);

    /**
      * *   This operation is available only to Cloud Parallel File Storage (CPFS) file systems on the China site (aliyun.com).
      * *   Only CPFS V2.2.0 and later support dataflows. You can view the version information on the file system details page in the console.
      * *   You can disable only the dataflows that are in the `Running` state.
      * *   After a dataflow is disabled, you cannot create a dataflow task for the dataflow. If AutoRefresh is configured, source data updates are not synchronized to CPFS.
      * *   After a dataflow is disabled, the dataflow throughput is no longer billed because resources are reclaimed. However, the dataflow may fail to be restarted due to insufficient resources.
      * *   It generally takes 2 to 5 minutes to disable a dataflow. You can call the [DescribeDataFlows](~~2402271~~) operation to query the dataflow status.
      *
     */
    CompletableFuture<StopDataFlowResponse> stopDataFlow(StopDataFlowRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * Only General-purpose NAS file systems support this operation.
      *
     */
    CompletableFuture<UpdateRecycleBinAttributeResponse> updateRecycleBinAttribute(UpdateRecycleBinAttributeRequest request);

    /**
      * *   Only Extreme NAS file systems and CPFS file systems can be scaled up. CPFS file systems are available only on the China site (aliyun.com).
      * *   A General-purpose NAS file system is automatically scaled up. You do not need to call this operation to scale up a General-purpose NAS file system.
      *
     */
    CompletableFuture<UpgradeFileSystemResponse> upgradeFileSystem(UpgradeFileSystemRequest request);

}
