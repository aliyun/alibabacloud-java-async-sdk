// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ebs20210730.models.*;
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
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   A replication pair and a replication pair-consistent group replicate in the same direction if they have the same primary region (production region), primary zone (production zone), secondary region (disaster recovery region), and secondary zone (disaster recovery zone). A replication pair can be added only to a replication pair-consistent group that replicates in the same direction as the replication pair.
      * *   Before you can add a replication pair to a replication pair-consistent group, make sure that the pair and the group are in the **Created** (`created`) or **Stopped** (`stopped`) state.
      * *   Up to 17 replication pairs can be added to a single replication pair-consistent group.
      * *   After replication pairs are added to a replication pair-consistent group, the recovery point objective (RPO) of the group takes effect on the pairs in place of their original RPOs.
      *
     */
    CompletableFuture<AddDiskReplicaPairResponse> addDiskReplicaPair(AddDiskReplicaPairRequest request);

    /**
      * ## Usage notes
      * CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    CompletableFuture<ApplyLensServiceResponse> applyLensService(ApplyLensServiceRequest request);

    CompletableFuture<BindEnterpriseSnapshotPolicyResponse> bindEnterpriseSnapshotPolicy(BindEnterpriseSnapshotPolicyRequest request);

    /**
      * ## Usage notes
      * CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    CompletableFuture<CancelLensServiceResponse> cancelLensService(CancelLensServiceRequest request);

    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<ClearPairDrillResponse> clearPairDrill(ClearPairDrillRequest request);

    CompletableFuture<ClearReplicaGroupDrillResponse> clearReplicaGroupDrill(ClearReplicaGroupDrillRequest request);

    /**
      * Dedicated block storage clusters are physically isolated from public block storage clusters. The owner of each dedicated block storage cluster has exclusive access to all resources in the cluster.
      * Disks created in a dedicated block storage cluster can be attached only to Elastic Compute Service (ECS) instances that reside in the same zone as the cluster. Before you create a dedicated block storage cluster, decide the regions and zones in which to deploy your cloud resources.
      * Dedicated block storage clusters are classified into basic and performance types. When you create a dedicated block storage cluster, select a cluster type based on your business requirements.
      * You are charged for creating dedicated block storage clusters.
      *
     */
    CompletableFuture<CreateDedicatedBlockStorageClusterResponse> createDedicatedBlockStorageCluster(CreateDedicatedBlockStorageClusterRequest request);

    /**
      * ## [](#)Usage notes
      * The replication pair-consistent group feature allows you to batch manage multiple disks in disaster recovery scenarios. You can restore the data of all disks in the same replication pair-consistent group to the same point in time to allow for disaster recovery of instances.
      * Take note of the following items:
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   Replication pair-consistent groups can be used to implement disaster recovery across zones within the same region and disaster recovery across regions.
      * *   A replication pair and a replication pair-consistent group can replicate in the same direction if they have the same primary region (production region), primary zone (production zone), secondary region (disaster recovery region), and secondary zone (disaster recovery zone). A replication pair can be added to only a replication pair-consistent group that replicates in the same direction as the replication pair.
      * *   After replication pairs are added to a replication pair-consistent group, the recovery point objective (RPO) of the group takes effect on the pairs instead of their original RPOs.
      *
     */
    CompletableFuture<CreateDiskReplicaGroupResponse> createDiskReplicaGroup(CreateDiskReplicaGroupRequest request);

    /**
      * Async replication is a feature that protects data across regions by using the data replication capability of Elastic Block Storage (EBS). This feature can be used to asynchronously replicate data from a disk in one region to a disk in another region for disaster recovery purposes. You can use this feature to implement disaster recovery for critical business to protect data in your databases and improve business continuity.
      * Currently, the async replication feature can asynchronously replicate data only between enhanced SSDs (ESSDs). The functionality of disks in replication pairs is limited. You are charged on a subscription basis for the bandwidth that is used by the async replication feature.
      * Before you call this operation, take note of the following items:
      * *   Make sure that the source disk (primary disk) from which to replicate data and the destination disk (secondary disk) to which to replicate data are created. You can call the [CreateDisk](~~25513~~) operation to create disks.
      * *   The secondary disk cannot reside the same region as the primary disk. The async replication feature is supported in the China (Hangzhou), China (Shanghai), China (Beijing), China (Shenzhen), China (Heyuan), China (Chengdu), China (Hong Kong), Singapore, US (Silicon Valley), and US (Virginia) regions.
      * *   After you call this operation to create a replication pair, you must call the [StartDiskReplicaPair](~~354205~~) operation to enable async replication to periodically replicate data from the primary disk to the secondary disk across regions.
      *
     */
    CompletableFuture<CreateDiskReplicaPairResponse> createDiskReplicaPair(CreateDiskReplicaPairRequest request);

    CompletableFuture<CreateEnterpriseSnapshotPolicyResponse> createEnterpriseSnapshotPolicy(CreateEnterpriseSnapshotPolicyRequest request);

    /**
      * Currently, this API is only available for use with ACS resource hosting and is not yet open for direct invocation.
      *
     */
    CompletableFuture<DeleteDiskResponse> deleteDisk(DeleteDiskRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   Before you can delete a replication pair-consistent group, make sure that no replication pairs exist in the group.
      * *   The replication pair-consistent group that you want to delete must be in the **Created** (`created`), **Creation Failed** (`create_failed`), **Stopped** (`stopped`), **Failovered** (`failovered`), **Deleting** (`deleting`), **Deletion Failed** (`delete_failed`), or **Invalid** (`invalid`) state.
      *
     */
    CompletableFuture<DeleteDiskReplicaGroupResponse> deleteDiskReplicaGroup(DeleteDiskReplicaGroupRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   Only replication pairs that are in the **Stopped** (`stopped`), **Invalid** (`invalid`), or **Failovered** (`failovered`) state can be deleted. This operation deletes only replication pairs. The primary and secondary disks in the deleted replication pairs are retained.
      * *   To delete a replication pair, you must call this operation in the region where the primary disk is located. After the replication pair is deleted, the functionality limits are lifted from the primary and secondary disks. For example, you can attach the secondary disk, resize the disk, or read data from or write data to the disk.
      *
     */
    CompletableFuture<DeleteDiskReplicaPairResponse> deleteDiskReplicaPair(DeleteDiskReplicaPairRequest request);

    CompletableFuture<DeleteEnterpriseSnapshotPolicyResponse> deleteEnterpriseSnapshotPolicy(DeleteEnterpriseSnapshotPolicyRequest request);

    /**
      * *   You can use one of the following methods to check the responses:
      *     *   Method 1: Use `NextToken` to configure the query token. Set the value to the `NextToken` value that is returned in the last call to the DescribeDisks operation. Then, use `MaxResults` to specify the maximum number of entries to return on each page.
      *     *   Method 2: Use `PageSize` to specify the number of entries to return on each page and then use `PageNumber` to specify the number of the page to return.
      *         You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use method 1. When `NextToken` is specified, `PageSize` and `PageNumber` do not take effect and `TotalCount` in the response is invalid.
      * *   A disk that has the multi-attach feature enabled can be attached to multiple instances. You can query the attachment information of the disk based on the `Attachment` values in the response.
      * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    CompletableFuture<DescribeDedicatedBlockStorageClusterDisksResponse> describeDedicatedBlockStorageClusterDisks(DescribeDedicatedBlockStorageClusterDisksRequest request);

    /**
      * ## [](#)Usage notes
      * >  The Dedicated Block Storage Cluster feature is available only in the China (Heyuan), Indonesia (Jakarta), and China (Shenzhen) regions.
      * *   You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are included in the filter conditions.
      * *   We recommend that you use NextToken and MaxResults to perform paged queries. We recommend that you use MaxResults to specify the maximum number of entries to return in each request. The return value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeDedicatedBlockStorageClusters operation to retrieve a new page of results, set NextToken to the NextToken value that is returned in the previous call and specify MaxResults to limit the number of entries returned.
      *
     */
    CompletableFuture<DescribeDedicatedBlockStorageClustersResponse> describeDedicatedBlockStorageClusters(DescribeDedicatedBlockStorageClustersRequest request);

    /**
      * ## Usage notes
      * CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    CompletableFuture<DescribeDiskEventsResponse> describeDiskEvents(DescribeDiskEventsRequest request);

    /**
      * ## Usage notes
      * *   CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      * *   Up to 400 monitoring data entries can be returned at a time. An error is returned if the value calculated based on the following formula is greater than 400: `(EndTime - StartTime)/Period`.
      * *   You can query the monitoring data collected in the last three days. An error is returned if the time specified by `StartTime` is more than three days prior to the current time.
      *
     */
    CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request);

    /**
      * ## Usage notes
      * CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    CompletableFuture<DescribeDiskMonitorDataListResponse> describeDiskMonitorDataList(DescribeDiskMonitorDataListRequest request);

    /**
      * To perform a paged query, set the MaxResults and NextToken parameters.
      * During a paged query, when you call the DescribeDiskReplicaGroups operation to retrieve the first page of results, set `MaxResults` to specify the maximum number of entries to return in the call. The return value of `NextToken` is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeDiskReplicaGroups operation to retrieve a new page of results, set `NextToken` to the `NextToken` value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call.
      *
     */
    CompletableFuture<DescribeDiskReplicaGroupsResponse> describeDiskReplicaGroups(DescribeDiskReplicaGroupsRequest request);

    CompletableFuture<DescribeDiskReplicaPairProgressResponse> describeDiskReplicaPairProgress(DescribeDiskReplicaPairProgressRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   When you call this operation for a specific region, if the primary disk (source disk) or secondary disk (destination disk) of a replication pair resides in the region, information about the replication pair is displayed in the response.
      * *   If you want to perform a paged query, configure the `NextToken` and `MaxResults` parameters. During a paged query, when you call the DescribeDiskReplicaPairs operation to retrieve the first page of results, set `MaxResults` to limit the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeDiskReplicaPairs operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call.
      *
     */
    CompletableFuture<DescribeDiskReplicaPairsResponse> describeDiskReplicaPairs(DescribeDiskReplicaPairsRequest request);

    CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request);

    CompletableFuture<DescribeEnterpriseSnapshotPolicyResponse> describeEnterpriseSnapshotPolicy(DescribeEnterpriseSnapshotPolicyRequest request);

    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
      * ## Usage notes
      * CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    CompletableFuture<DescribeLensServiceStatusResponse> describeLensServiceStatus(DescribeLensServiceStatusRequest request);

    CompletableFuture<DescribeMetricDataResponse> describeMetricData(DescribeMetricDataRequest request);

    CompletableFuture<DescribePairDrillsResponse> describePairDrills(DescribePairDrillsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeReplicaGroupDrillsResponse> describeReplicaGroupDrills(DescribeReplicaGroupDrillsRequest request);

    CompletableFuture<DescribeSolutionInstanceConfigurationResponse> describeSolutionInstanceConfiguration(DescribeSolutionInstanceConfigurationRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   The replication pair-consistent group must be in the **One-time Syncing** (`manual_syncing`), **Syncing** (`syncing`), **Normal** (`normal`), **Stopping** (`stopping`), **Stop Failed** (`stop_failed`), **Stopped** (`stopped`), **In Failover** (`failovering`), **Failover Failed** (`failover_failed`), or **Failovered** (`failovered`) state.
      * *   After a failover is performed, the replication pair-consistent group enters the **Failovered** (`failovered`) state.
      * *   Before you perform a failover, make sure that the first full data synchronization is completed between the primary site and secondary site.
      *
     */
    CompletableFuture<FailoverDiskReplicaGroupResponse> failoverDiskReplicaGroup(FailoverDiskReplicaGroupRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   The replication pair for which you want to enable failover cannot be in the **Invalid** (`invalid`) or **Deleted** (`deleted`) state.
      * *   After a failover is performed, the replication pair enters the **Failovered** (`failovered`) state.
      *
     */
    CompletableFuture<FailoverDiskReplicaPairResponse> failoverDiskReplicaPair(FailoverDiskReplicaPairRequest request);

    CompletableFuture<GetDiskResponse> getDisk(GetDiskRequest request);

    /**
      * Specify at least one of the following parameters or parameter pairs in a request to determine a query object:
      * *   `ResourceId.N`
      * *   `Tag.N` parameter pair (`Tag.N.Key` and `Tag.N.Value`)
      * If you set `Tag.N` and `ResourceId.N` at the same time, the EBS resources that match both the parameters are returned.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * You can call this operation to modify the information of a dedicated block storage cluster. The information includes the name and description of the cluster.
      *
     */
    CompletableFuture<ModifyDedicatedBlockStorageClusterAttributeResponse> modifyDedicatedBlockStorageClusterAttribute(ModifyDedicatedBlockStorageClusterAttributeRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   The replication pair-consistent group must be in the **Created** (`created`) or **Stopped** (`stopped`) state.
      *
     */
    CompletableFuture<ModifyDiskReplicaGroupResponse> modifyDiskReplicaGroup(ModifyDiskReplicaGroupRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   Only replication pairs that are in the **Created** (`created`) or **Stopped** (`stopped`) state can have their names or descriptions modified.
      *
     */
    CompletableFuture<ModifyDiskReplicaPairResponse> modifyDiskReplicaPair(ModifyDiskReplicaPairRequest request);

    CompletableFuture<QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse> queryDedicatedBlockStorageClusterDiskThroughputStatus(QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest request);

    /**
      * Period is the time interval between data retrieval points. When set to 60 (minute interval), a maximum of 1440 data points can be returned; when set to 3600 (hour interval), a maximum of 744 data points can be returned; and when set to 86400 (day interval), a maximum of 366 data points can be returned.
      *
     */
    CompletableFuture<QueryDedicatedBlockStorageClusterInventoryDataResponse> queryDedicatedBlockStorageClusterInventoryData(QueryDedicatedBlockStorageClusterInventoryDataRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   The replication pair-consistent group from which you want to remove a replication pair must be in the **Created** (`created`), **Stopped** (`stopped`), or **Invalid** (`invalid`) state.
      *
     */
    CompletableFuture<RemoveDiskReplicaPairResponse> removeDiskReplicaPair(RemoveDiskReplicaPairRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   The replication pair-consistent group for which you want to enable reverse replication must be in the **Failovered** (`failovered`) state. You can call the `FailoverDiskReplicaPair` operation to enable failover.
      * *   Before a reverse replication is performed, the primary disks must be detached from its associated Elastic Compute Service (ECS) instance and must be in the Unattached state. You can call the [DetachDisk](~~25516~~) operation to detach the disks.
      * *   After you enable reverse replication, you must call the `StartDiskReplicaPair` operation again to enable the async replication feature before data can be replicated from the original secondary disks to the original primary disks.
      * *   You can set the ReverseReplicate parameter to false to cancel the **Failovered** (`failovered`) state and restore the original replication direction.
      *
     */
    CompletableFuture<ReprotectDiskReplicaGroupResponse> reprotectDiskReplicaGroup(ReprotectDiskReplicaGroupRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   The replication pair for which you want to enable reverse replication must be in the **Failovered** (`failovered`) state. You can call the [FailoverDiskReplicaPair](~~354358~~) operation to enable failover.
      * *   The primary disk must be detached from its associated Elastic Compute Service (ECS) instance and is in the Unattached state. You can call the [DetachDisk](~~25516~~) operation to detach the disk.
      * *   After you enable reverse replication, you must call the [StartDiskReplicaPair](~~354205~~) operation again to activate the replication pair before data can be replicated from the original secondary disk to the original primary disk.
      * *   You can set the ReverseReplicate parameter to false to cancel the **Failovered** (`failovered`) state and restore the original replication direction.
      *
     */
    CompletableFuture<ReprotectDiskReplicaPairResponse> reprotectDiskReplicaPair(ReprotectDiskReplicaPairRequest request);

    CompletableFuture<SetDedicatedBlockStorageClusterDiskThroughputResponse> setDedicatedBlockStorageClusterDiskThroughput(SetDedicatedBlockStorageClusterDiskThroughputRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   If you set the `OneShot` to `false`, the replication pair-consistent group must be in the **Created** (`created` ), **Synchronizing** (`syncing` ), **Normal** (`normal` ), or **Stopped** (`stopped`) state.
      * *   If you set `OneShot` to `true`, the replication pair-consistent group must be in the **Created** (`created` ), **One-time Syncing** (`manual_syncing` ), or **Stopped** (`stopped`) state. The time interval between two consecutive one-time synchronizations must be longer than one half of the recovery point objective (RPO).
      * *   After a replication pair-consistent group is activated, the group enters the **Initial Syncing** (`initial_syncing`) state and the system performs the first async replication to replicate all data from the primary disks to secondary disks.
      *
     */
    CompletableFuture<StartDiskReplicaGroupResponse> startDiskReplicaGroup(StartDiskReplicaGroupRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   Only replication pairs that are in the **Created** (`created`) or **Stopped** (`stopped`) state can be activated.
      * *   After a replication pair is activated, it enters the **Initial Syncing** (`initial_syncing`) state and the system performs the first asynchronous replication to replicate all data from the primary disk to the secondary disk.
      *
     */
    CompletableFuture<StartDiskReplicaPairResponse> startDiskReplicaPair(StartDiskReplicaPairRequest request);

    /**
      * After the disaster recovery drill is complete on the secondary disk, a pay-as-you-go drill disk that has the same capacity and category as the secondary disk is created in the zone where the secondary disk resides. The drill disk contains last-recovery-point data that can be used to test the completeness and correctness of applications.
      *
     */
    CompletableFuture<StartPairDrillResponse> startPairDrill(StartPairDrillRequest request);

    /**
      * After the disaster recovery drill is complete on secondary disks, a pay-as-you-go drill disk is created in the zone where the secondary disk of each replication pair resides. The latest-recovery-point data is restored to the drill disks to test the completeness and correctness of applications.
      *
     */
    CompletableFuture<StartReplicaGroupDrillResponse> startReplicaGroupDrill(StartReplicaGroupDrillRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   The replication pair-consistent group that you want to stop must be in the **One-time Syncing** (`manual_syncing`), **Syncing** (`syncing`), **Normal** (`normal`), **Stopping** (`stopping`), **Stop Failed** (`stop_failed`), or **Stopped** (`stopped`) state.
      * *   When a replication pair-consistent group is stopped, it enters the **Stopped** (`stopped`) state. If a replication pair-consistent group cannot be stopped, the state of the group remains unchanged or changes to **Stop Failed** (`stop_failed`). In this case, try again later.
      *
     */
    CompletableFuture<StopDiskReplicaGroupResponse> stopDiskReplicaGroup(StopDiskReplicaGroupRequest request);

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   Only replication pairs that are in the **Initial Syncing** (`initial_syncing`), **Syncing** (`syncing`), **One-time Syncing** (`manual_syncing`), or **Normal** (`normal`) state can be stopped. When a replication pair is stopped, it enters the Stopped (`stopped`) state. The secondary disk rolls back to the point in time when the last async replication was complete and drops all the data that is being replicated from the primary disk.
      *
     */
    CompletableFuture<StopDiskReplicaPairResponse> stopDiskReplicaPair(StopDiskReplicaPairRequest request);

    /**
      * Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number of tags is reached, an error message is returned. For more information, see the "Tag limits" section in [Limits](~~25412~~).
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnbindEnterpriseSnapshotPolicyResponse> unbindEnterpriseSnapshotPolicy(UnbindEnterpriseSnapshotPolicyRequest request);

    /**
      * *   You can remove up to 20 tags at a time.
      * *   After a tag is removed from an EBS resource, the tag is automatically deleted if the tag is not added to any instance.
      *
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateEnterpriseSnapshotPolicyResponse> updateEnterpriseSnapshotPolicy(UpdateEnterpriseSnapshotPolicyRequest request);

    CompletableFuture<UpdateSolutionInstanceAttributeResponse> updateSolutionInstanceAttribute(UpdateSolutionInstanceAttributeRequest request);

}
