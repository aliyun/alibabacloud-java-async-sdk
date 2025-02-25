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
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>A replication pair and a replication pair-consistent group replicate in the same direction if they have the same primary region (production region), primary zone (production zone), secondary region (disaster recovery region), and secondary zone (disaster recovery zone). A replication pair can be added only to a replication pair-consistent group that replicates in the same direction as the replication pair.</li>
     * <li>Before you can add a replication pair to a replication pair-consistent group, make sure that the pair and the group are in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * <li>Up to 17 replication pairs can be added to a single replication pair-consistent group.</li>
     * <li>After replication pairs are added to a replication pair-consistent group, the recovery point objective (RPO) of the group takes effect on the pairs in place of their original RPOs.</li>
     * </ul>
     * 
     * @param request the request parameters of AddDiskReplicaPair  AddDiskReplicaPairRequest
     * @return AddDiskReplicaPairResponse
     */
    CompletableFuture<AddDiskReplicaPairResponse> addDiskReplicaPair(AddDiskReplicaPairRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * @param request the request parameters of ApplyLensService  ApplyLensServiceRequest
     * @return ApplyLensServiceResponse
     */
    CompletableFuture<ApplyLensServiceResponse> applyLensService(ApplyLensServiceRequest request);

    /**
     * @param request the request parameters of BindEnterpriseSnapshotPolicy  BindEnterpriseSnapshotPolicyRequest
     * @return BindEnterpriseSnapshotPolicyResponse
     */
    CompletableFuture<BindEnterpriseSnapshotPolicyResponse> bindEnterpriseSnapshotPolicy(BindEnterpriseSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * @param request the request parameters of CancelLensService  CancelLensServiceRequest
     * @return CancelLensServiceResponse
     */
    CompletableFuture<CancelLensServiceResponse> cancelLensService(CancelLensServiceRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of ClearPairDrill  ClearPairDrillRequest
     * @return ClearPairDrillResponse
     */
    CompletableFuture<ClearPairDrillResponse> clearPairDrill(ClearPairDrillRequest request);

    /**
     * @param request the request parameters of ClearReplicaGroupDrill  ClearReplicaGroupDrillRequest
     * @return ClearReplicaGroupDrillResponse
     */
    CompletableFuture<ClearReplicaGroupDrillResponse> clearReplicaGroupDrill(ClearReplicaGroupDrillRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>Dedicated block storage clusters are physically isolated from public block storage clusters. The owner of each dedicated block storage cluster has exclusive access to all resources in the cluster.</li>
     * <li>Disks created in a dedicated block storage cluster can be attached only to Elastic Compute Service (ECS) instances that reside in the same zone as the cluster. Before you create a dedicated block storage cluster, decide the regions and zones in which to deploy your cloud resources.</li>
     * <li>Dedicated block storage clusters are classified into basic and performance types. When you create a dedicated block storage cluster, select a cluster type based on your business requirements.</li>
     * <li>You are charged for creating dedicated block storage clusters.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDedicatedBlockStorageCluster  CreateDedicatedBlockStorageClusterRequest
     * @return CreateDedicatedBlockStorageClusterResponse
     */
    CompletableFuture<CreateDedicatedBlockStorageClusterResponse> createDedicatedBlockStorageCluster(CreateDedicatedBlockStorageClusterRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The replication pair-consistent group feature allows you to batch manage multiple disks in disaster recovery scenarios. You can restore the data of all disks in the same replication pair-consistent group to the same point in time to allow for disaster recovery of instances.
     * Take note of the following items:</p>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Replication pair-consistent groups can be used to implement disaster recovery across zones within the same region and disaster recovery across regions.</li>
     * <li>A replication pair and a replication pair-consistent group can replicate in the same direction if they have the same primary region (production region), primary zone (production zone), secondary region (disaster recovery region), and secondary zone (disaster recovery zone). A replication pair can be added to only a replication pair-consistent group that replicates in the same direction as the replication pair.</li>
     * <li>After replication pairs are added to a replication pair-consistent group, the recovery point objective (RPO) of the group takes effect on the pairs instead of their original RPOs.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDiskReplicaGroup  CreateDiskReplicaGroupRequest
     * @return CreateDiskReplicaGroupResponse
     */
    CompletableFuture<CreateDiskReplicaGroupResponse> createDiskReplicaGroup(CreateDiskReplicaGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Async replication is a feature that protects data across regions by using the data replication capability of Elastic Block Storage (EBS). This feature can be used to asynchronously replicate data from a disk in one region to a disk in another region for disaster recovery purposes. You can use this feature to implement disaster recovery for critical business to protect data in your databases and improve business continuity.
     * Currently, the async replication feature can asynchronously replicate data only between enhanced SSDs (ESSDs). The functionality of disks in replication pairs is limited. You are charged on a subscription basis for the bandwidth that is used by the async replication feature.
     * Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Make sure that the source disk (primary disk) from which to replicate data and the destination disk (secondary disk) to which to replicate data are created. You can call the <a href="https://help.aliyun.com/document_detail/25513.html">CreateDisk</a> operation to create disks.</li>
     * <li>The secondary disk cannot reside the same region as the primary disk. The async replication feature is supported in the China (Hangzhou), China (Shanghai), China (Beijing), China (Shenzhen), China (Heyuan), China (Chengdu), China (Hong Kong), Singapore, US (Silicon Valley), and US (Virginia) regions.</li>
     * <li>After you call this operation to create a replication pair, you must call the <a href="https://help.aliyun.com/document_detail/354205.html">StartDiskReplicaPair</a> operation to enable async replication to periodically replicate data from the primary disk to the secondary disk across regions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDiskReplicaPair  CreateDiskReplicaPairRequest
     * @return CreateDiskReplicaPairResponse
     */
    CompletableFuture<CreateDiskReplicaPairResponse> createDiskReplicaPair(CreateDiskReplicaPairRequest request);

    /**
     * @param request the request parameters of CreateEnterpriseSnapshotPolicy  CreateEnterpriseSnapshotPolicyRequest
     * @return CreateEnterpriseSnapshotPolicyResponse
     */
    CompletableFuture<CreateEnterpriseSnapshotPolicyResponse> createEnterpriseSnapshotPolicy(CreateEnterpriseSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Before you can delete a replication pair-consistent group, make sure that no replication pairs exist in the group.</li>
     * <li>The replication pair-consistent group that you want to delete must be in the <strong>Created</strong> (<code>created</code>), <strong>Creation Failed</strong> (<code>create_failed</code>), <strong>Stopped</strong> (<code>stopped</code>), <strong>Failovered</strong> (<code>failovered</code>), <strong>Deleting</strong> (<code>deleting</code>), <strong>Deletion Failed</strong> (<code>delete_failed</code>), or <strong>Invalid</strong> (<code>invalid</code>) state.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDiskReplicaGroup  DeleteDiskReplicaGroupRequest
     * @return DeleteDiskReplicaGroupResponse
     */
    CompletableFuture<DeleteDiskReplicaGroupResponse> deleteDiskReplicaGroup(DeleteDiskReplicaGroupRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Stopped</strong> (<code>stopped</code>), <strong>Invalid</strong> (<code>invalid</code>), or <strong>Failovered</strong> (<code>failovered</code>) state can be deleted. This operation deletes only replication pairs. The primary and secondary disks in the deleted replication pairs are retained.</li>
     * <li>To delete a replication pair, you must call this operation in the region where the primary disk is located. After the replication pair is deleted, the functionality limits are lifted from the primary and secondary disks. For example, you can attach the secondary disk, resize the disk, or read data from or write data to the disk.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDiskReplicaPair  DeleteDiskReplicaPairRequest
     * @return DeleteDiskReplicaPairResponse
     */
    CompletableFuture<DeleteDiskReplicaPairResponse> deleteDiskReplicaPair(DeleteDiskReplicaPairRequest request);

    /**
     * @param request the request parameters of DeleteEnterpriseSnapshotPolicy  DeleteEnterpriseSnapshotPolicyRequest
     * @return DeleteEnterpriseSnapshotPolicyResponse
     */
    CompletableFuture<DeleteEnterpriseSnapshotPolicyResponse> deleteEnterpriseSnapshotPolicy(DeleteEnterpriseSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  You can use one of the following methods to check the responses:
     *     *   Method 1: Use <code>NextToken</code> to configure the query token. Set the value to the <code>NextToken</code> value that is returned in the last call to the DescribeDisks operation. Then, use <code>MaxResults</code> to specify the maximum number of entries to return on each page.
     *     *   Method 2: Use <code>PageSize</code> to specify the number of entries to return on each page and then use <code>PageNumber</code> to specify the number of the page to return.
     *         You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use method 1. When <code>NextToken</code> is specified, <code>PageSize</code> and <code>PageNumber</code> do not take effect and <code>TotalCount</code> in the response is invalid.</p>
     * <ul>
     * <li>A disk that has the multi-attach feature enabled can be attached to multiple instances. You can query the attachment information of the disk based on the <code>Attachment</code> values in the response.
     * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDedicatedBlockStorageClusterDisks  DescribeDedicatedBlockStorageClusterDisksRequest
     * @return DescribeDedicatedBlockStorageClusterDisksResponse
     */
    CompletableFuture<DescribeDedicatedBlockStorageClusterDisksResponse> describeDedicatedBlockStorageClusterDisks(DescribeDedicatedBlockStorageClusterDisksRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <blockquote>
     * <p> The Dedicated Block Storage Cluster feature is available only in the China (Heyuan), Indonesia (Jakarta), and China (Shenzhen) regions.</p>
     * </blockquote>
     * <ul>
     * <li>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are included in the filter conditions.</li>
     * <li>We recommend that you use NextToken and MaxResults to perform paged queries. We recommend that you use MaxResults to specify the maximum number of entries to return in each request. The return value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeDedicatedBlockStorageClusters operation to retrieve a new page of results, set NextToken to the NextToken value that is returned in the previous call and specify MaxResults to limit the number of entries returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDedicatedBlockStorageClusters  DescribeDedicatedBlockStorageClustersRequest
     * @return DescribeDedicatedBlockStorageClustersResponse
     */
    CompletableFuture<DescribeDedicatedBlockStorageClustersResponse> describeDedicatedBlockStorageClusters(DescribeDedicatedBlockStorageClustersRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * @param request the request parameters of DescribeDiskEvents  DescribeDiskEventsRequest
     * @return DescribeDiskEventsResponse
     */
    CompletableFuture<DescribeDiskEventsResponse> describeDiskEvents(DescribeDiskEventsRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>Up to 400 monitoring data entries can be returned at a time. An error is returned if the value calculated based on the following formula is greater than 400: <code>(EndTime - StartTime)/Period</code>.</li>
     * <li>You can query the monitoring data collected in the last three days. An error is returned if the time specified by <code>StartTime</code> is more than three days prior to the current time.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDiskMonitorData  DescribeDiskMonitorDataRequest
     * @return DescribeDiskMonitorDataResponse
     */
    CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * @param request the request parameters of DescribeDiskMonitorDataList  DescribeDiskMonitorDataListRequest
     * @return DescribeDiskMonitorDataListResponse
     */
    CompletableFuture<DescribeDiskMonitorDataListResponse> describeDiskMonitorDataList(DescribeDiskMonitorDataListRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>To perform a paged query, specify the MaxResults and NextToken parameters.
     * During a paged query, when you call the DescribeDiskReplicaGroups operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeDiskReplicaGroups operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call.</p>
     * 
     * @param request the request parameters of DescribeDiskReplicaGroups  DescribeDiskReplicaGroupsRequest
     * @return DescribeDiskReplicaGroupsResponse
     */
    CompletableFuture<DescribeDiskReplicaGroupsResponse> describeDiskReplicaGroups(DescribeDiskReplicaGroupsRequest request);

    /**
     * @param request the request parameters of DescribeDiskReplicaPairProgress  DescribeDiskReplicaPairProgressRequest
     * @return DescribeDiskReplicaPairProgressResponse
     */
    CompletableFuture<DescribeDiskReplicaPairProgressResponse> describeDiskReplicaPairProgress(DescribeDiskReplicaPairProgressRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>When you call this operation for a specific region, if the primary disk (source disk) or secondary disk (destination disk) of a replication pair resides in the region, information about the replication pair is displayed in the response.</li>
     * <li>If you want to perform a paged query, configure the <code>NextToken</code> and <code>MaxResults</code> parameters. During a paged query, when you call the DescribeDiskReplicaPairs operation to retrieve the first page of results, set <code>MaxResults</code> to limit the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeDiskReplicaPairs operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDiskReplicaPairs  DescribeDiskReplicaPairsRequest
     * @return DescribeDiskReplicaPairsResponse
     */
    CompletableFuture<DescribeDiskReplicaPairsResponse> describeDiskReplicaPairs(DescribeDiskReplicaPairsRequest request);

    /**
     * @param request the request parameters of DescribeEnterpriseSnapshotPolicy  DescribeEnterpriseSnapshotPolicyRequest
     * @return DescribeEnterpriseSnapshotPolicyResponse
     */
    CompletableFuture<DescribeEnterpriseSnapshotPolicyResponse> describeEnterpriseSnapshotPolicy(DescribeEnterpriseSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of DescribeEvents  DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    CompletableFuture<DescribeEventsResponse> describeEvents(DescribeEventsRequest request);

    /**
     * @param request the request parameters of DescribeLensMonitorDisks  DescribeLensMonitorDisksRequest
     * @return DescribeLensMonitorDisksResponse
     */
    CompletableFuture<DescribeLensMonitorDisksResponse> describeLensMonitorDisks(DescribeLensMonitorDisksRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</p>
     * 
     * @param request the request parameters of DescribeLensServiceStatus  DescribeLensServiceStatusRequest
     * @return DescribeLensServiceStatusResponse
     */
    CompletableFuture<DescribeLensServiceStatusResponse> describeLensServiceStatus(DescribeLensServiceStatusRequest request);

    /**
     * @param request the request parameters of DescribeMetricData  DescribeMetricDataRequest
     * @return DescribeMetricDataResponse
     */
    CompletableFuture<DescribeMetricDataResponse> describeMetricData(DescribeMetricDataRequest request);

    /**
     * @param request the request parameters of DescribePairDrills  DescribePairDrillsRequest
     * @return DescribePairDrillsResponse
     */
    CompletableFuture<DescribePairDrillsResponse> describePairDrills(DescribePairDrillsRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeReplicaGroupDrills  DescribeReplicaGroupDrillsRequest
     * @return DescribeReplicaGroupDrillsResponse
     */
    CompletableFuture<DescribeReplicaGroupDrillsResponse> describeReplicaGroupDrills(DescribeReplicaGroupDrillsRequest request);

    /**
     * @param request the request parameters of DescribeSolutionInstanceConfiguration  DescribeSolutionInstanceConfigurationRequest
     * @return DescribeSolutionInstanceConfigurationResponse
     */
    CompletableFuture<DescribeSolutionInstanceConfigurationResponse> describeSolutionInstanceConfiguration(DescribeSolutionInstanceConfigurationRequest request);

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>Query the tag key-value pairs of user\&quot;s cloud disk and snapshot. The search scope can be narrowed down by using filterTagKey.</p>
     * 
     * @param request the request parameters of DescribeUserTagKeys  DescribeUserTagKeysRequest
     * @return DescribeUserTagKeysResponse
     */
    CompletableFuture<DescribeUserTagKeysResponse> describeUserTagKeys(DescribeUserTagKeysRequest request);

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <blockquote>
     * <p>The dedicated block storage cluster feature is currently supported in the following regions: South China 2 (Heyuan), Indonesia (Jakarta), and South China 1 (Shenzhen).</p>
     * </blockquote>
     * <ul>
     * <li>The request parameters act as a filter, with a logical AND relationship. If any parameter is empty, the filter does not take effect.</li>
     * <li>For paginated queries, it is recommended to use the MaxResults and NextToken parameters. Usage instructions: When querying the first page, set only MaxResults to limit the number of returned entries. The NextToken in the response will serve as the token for querying subsequent pages. When querying subsequent pages, set the NextToken parameter to the value obtained from the previous response, and set MaxResults to limit the number of returned entries.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUserTagValues  DescribeUserTagValuesRequest
     * @return DescribeUserTagValuesResponse
     */
    CompletableFuture<DescribeUserTagValuesResponse> describeUserTagValues(DescribeUserTagValuesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group must be in the <strong>One-time Syncing</strong> (<code>manual_syncing</code>), <strong>Syncing</strong> (<code>syncing</code>), <strong>Normal</strong> (<code>normal</code>), <strong>Stopping</strong> (<code>stopping</code>), <strong>Stop Failed</strong> (<code>stop_failed</code>), <strong>Stopped</strong> (<code>stopped</code>), <strong>In Failover</strong> (<code>failovering</code>), <strong>Failover Failed</strong> (<code>failover_failed</code>), or <strong>Failovered</strong> (<code>failovered</code>) state.</li>
     * <li>After a failover is performed, the replication pair-consistent group enters the <strong>Failovered</strong> (<code>failovered</code>) state.</li>
     * <li>Before you perform a failover, make sure that the first full data synchronization is completed between the primary site and secondary site.</li>
     * </ul>
     * 
     * @param request the request parameters of FailoverDiskReplicaGroup  FailoverDiskReplicaGroupRequest
     * @return FailoverDiskReplicaGroupResponse
     */
    CompletableFuture<FailoverDiskReplicaGroupResponse> failoverDiskReplicaGroup(FailoverDiskReplicaGroupRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair for which you want to enable failover cannot be in the <strong>Invalid</strong> (<code>invalid</code>) or <strong>Deleted</strong> (<code>deleted</code>) state.</li>
     * <li>After a failover is performed, the replication pair enters the <strong>Failovered</strong> (<code>failovered</code>) state.</li>
     * </ul>
     * 
     * @param request the request parameters of FailoverDiskReplicaPair  FailoverDiskReplicaPairRequest
     * @return FailoverDiskReplicaPairResponse
     */
    CompletableFuture<FailoverDiskReplicaPairResponse> failoverDiskReplicaPair(FailoverDiskReplicaPairRequest request);

    /**
     * @param request the request parameters of GetReport  GetReportRequest
     * @return GetReportResponse
     */
    CompletableFuture<GetReportResponse> getReport(GetReportRequest request);

    /**
     * @param request the request parameters of ListReports  ListReportsRequest
     * @return ListReportsResponse
     */
    CompletableFuture<ListReportsResponse> listReports(ListReportsRequest request);

    /**
     * <b>description</b> :
     * <p>Specify at least one of the following parameters or parameter pairs in a request to determine a query object:</p>
     * <ul>
     * <li><code>ResourceId.N</code></li>
     * <li><code>Tag.N</code> parameter pair (<code>Tag.N.Key</code> and <code>Tag.N.Value</code>)
     * If you set <code>Tag.N</code> and <code>ResourceId.N</code> at the same time, the EBS resources that match both the parameters are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the information of a dedicated block storage cluster. The information includes the name and description of the cluster.</p>
     * 
     * @param request the request parameters of ModifyDedicatedBlockStorageClusterAttribute  ModifyDedicatedBlockStorageClusterAttributeRequest
     * @return ModifyDedicatedBlockStorageClusterAttributeResponse
     */
    CompletableFuture<ModifyDedicatedBlockStorageClusterAttributeResponse> modifyDedicatedBlockStorageClusterAttribute(ModifyDedicatedBlockStorageClusterAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group must be in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskReplicaGroup  ModifyDiskReplicaGroupRequest
     * @return ModifyDiskReplicaGroupResponse
     */
    CompletableFuture<ModifyDiskReplicaGroupResponse> modifyDiskReplicaGroup(ModifyDiskReplicaGroupRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state can have their names or descriptions modified.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskReplicaPair  ModifyDiskReplicaPairRequest
     * @return ModifyDiskReplicaPairResponse
     */
    CompletableFuture<ModifyDiskReplicaPairResponse> modifyDiskReplicaPair(ModifyDiskReplicaPairRequest request);

    /**
     * @param request the request parameters of QueryDedicatedBlockStorageClusterDiskThroughputStatus  QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest
     * @return QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse
     */
    CompletableFuture<QueryDedicatedBlockStorageClusterDiskThroughputStatusResponse> queryDedicatedBlockStorageClusterDiskThroughputStatus(QueryDedicatedBlockStorageClusterDiskThroughputStatusRequest request);

    /**
     * <b>description</b> :
     * <p>Period is the time interval between data retrieval points. When set to 60 (minute interval), a maximum of 1440 data points can be returned; when set to 3600 (hour interval), a maximum of 744 data points can be returned; and when set to 86400 (day interval), a maximum of 366 data points can be returned.</p>
     * 
     * @param request the request parameters of QueryDedicatedBlockStorageClusterInventoryData  QueryDedicatedBlockStorageClusterInventoryDataRequest
     * @return QueryDedicatedBlockStorageClusterInventoryDataResponse
     */
    CompletableFuture<QueryDedicatedBlockStorageClusterInventoryDataResponse> queryDedicatedBlockStorageClusterInventoryData(QueryDedicatedBlockStorageClusterInventoryDataRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group from which you want to remove a replication pair must be in the <strong>Created</strong> (<code>created</code>), <strong>Stopped</strong> (<code>stopped</code>), or <strong>Invalid</strong> (<code>invalid</code>) state.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveDiskReplicaPair  RemoveDiskReplicaPairRequest
     * @return RemoveDiskReplicaPairResponse
     */
    CompletableFuture<RemoveDiskReplicaPairResponse> removeDiskReplicaPair(RemoveDiskReplicaPairRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group for which you want to enable reverse replication must be in the <strong>Failovered</strong> (<code>failovered</code>) state. You can call the <code>FailoverDiskReplicaPair</code> operation to enable failover.</li>
     * <li>Before a reverse replication is performed, the primary disks must be detached from its associated Elastic Compute Service (ECS) instance and must be in the Unattached state. You can call the <a href="https://help.aliyun.com/document_detail/25516.html">DetachDisk</a> operation to detach the disks.</li>
     * <li>After you enable reverse replication, you must call the <code>StartDiskReplicaPair</code> operation again to enable the async replication feature before data can be replicated from the original secondary disks to the original primary disks.</li>
     * <li>You can set the ReverseReplicate parameter to false to cancel the <strong>Failovered</strong> (<code>failovered</code>) state and restore the original replication direction.</li>
     * </ul>
     * 
     * @param request the request parameters of ReprotectDiskReplicaGroup  ReprotectDiskReplicaGroupRequest
     * @return ReprotectDiskReplicaGroupResponse
     */
    CompletableFuture<ReprotectDiskReplicaGroupResponse> reprotectDiskReplicaGroup(ReprotectDiskReplicaGroupRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair for which you want to enable reverse replication must be in the <strong>Failovered</strong> (<code>failovered</code>) state. You can call the <a href="https://help.aliyun.com/document_detail/354358.html">FailoverDiskReplicaPair</a> operation to enable failover.</li>
     * <li>The primary disk must be detached from its associated Elastic Compute Service (ECS) instance and is in the Unattached state. You can call the <a href="https://help.aliyun.com/document_detail/25516.html">DetachDisk</a> operation to detach the disk.</li>
     * <li>After you enable reverse replication, you must call the <a href="https://help.aliyun.com/document_detail/354205.html">StartDiskReplicaPair</a> operation again to activate the replication pair before data can be replicated from the original secondary disk to the original primary disk.</li>
     * <li>You can set the ReverseReplicate parameter to false to cancel the <strong>Failovered</strong> (<code>failovered</code>) state and restore the original replication direction.</li>
     * </ul>
     * 
     * @param request the request parameters of ReprotectDiskReplicaPair  ReprotectDiskReplicaPairRequest
     * @return ReprotectDiskReplicaPairResponse
     */
    CompletableFuture<ReprotectDiskReplicaPairResponse> reprotectDiskReplicaPair(ReprotectDiskReplicaPairRequest request);

    /**
     * @param request the request parameters of SetDedicatedBlockStorageClusterDiskThroughput  SetDedicatedBlockStorageClusterDiskThroughputRequest
     * @return SetDedicatedBlockStorageClusterDiskThroughputResponse
     */
    CompletableFuture<SetDedicatedBlockStorageClusterDiskThroughputResponse> setDedicatedBlockStorageClusterDiskThroughput(SetDedicatedBlockStorageClusterDiskThroughputRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>If you set the <code>OneShot</code> to <code>false</code>, the replication pair-consistent group must be in the <strong>Created</strong> (<code>created</code> ), <strong>Synchronizing</strong> (<code>syncing</code> ), <strong>Normal</strong> (<code>normal</code> ), or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * <li>If you set <code>OneShot</code> to <code>true</code>, the replication pair-consistent group must be in the <strong>Created</strong> (<code>created</code> ), <strong>One-time Syncing</strong> (<code>manual_syncing</code> ), or <strong>Stopped</strong> (<code>stopped</code>) state. The time interval between two consecutive one-time synchronizations must be longer than one half of the recovery point objective (RPO).</li>
     * <li>After a replication pair-consistent group is activated, the group enters the <strong>Initial Syncing</strong> (<code>initial_syncing</code>) state and the system performs the first async replication to replicate all data from the primary disks to secondary disks.</li>
     * </ul>
     * 
     * @param request the request parameters of StartDiskReplicaGroup  StartDiskReplicaGroupRequest
     * @return StartDiskReplicaGroupResponse
     */
    CompletableFuture<StartDiskReplicaGroupResponse> startDiskReplicaGroup(StartDiskReplicaGroupRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Created</strong> (<code>created</code>) or <strong>Stopped</strong> (<code>stopped</code>) state can be activated.</li>
     * <li>After a replication pair is activated, it enters the <strong>Initial Syncing</strong> (<code>initial_syncing</code>) state and the system performs the first asynchronous replication to replicate all data from the primary disk to the secondary disk.</li>
     * </ul>
     * 
     * @param request the request parameters of StartDiskReplicaPair  StartDiskReplicaPairRequest
     * @return StartDiskReplicaPairResponse
     */
    CompletableFuture<StartDiskReplicaPairResponse> startDiskReplicaPair(StartDiskReplicaPairRequest request);

    /**
     * <b>description</b> :
     * <p>After the disaster recovery drill is complete on the secondary disk, a pay-as-you-go drill disk that has the same capacity and category as the secondary disk is created in the zone where the secondary disk resides. The drill disk contains last-recovery-point data that can be used to test the completeness and correctness of applications.</p>
     * 
     * @param request the request parameters of StartPairDrill  StartPairDrillRequest
     * @return StartPairDrillResponse
     */
    CompletableFuture<StartPairDrillResponse> startPairDrill(StartPairDrillRequest request);

    /**
     * <b>description</b> :
     * <p>After the disaster recovery drill is complete on secondary disks, a pay-as-you-go drill disk is created in the zone where the secondary disk of each replication pair resides. The latest-recovery-point data is restored to the drill disks to test the completeness and correctness of applications.</p>
     * 
     * @param request the request parameters of StartReplicaGroupDrill  StartReplicaGroupDrillRequest
     * @return StartReplicaGroupDrillResponse
     */
    CompletableFuture<StartReplicaGroupDrillResponse> startReplicaGroupDrill(StartReplicaGroupDrillRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which the replication pair-consistent group feature is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>The replication pair-consistent group that you want to stop must be in the <strong>One-time Syncing</strong> (<code>manual_syncing</code>), <strong>Syncing</strong> (<code>syncing</code>), <strong>Normal</strong> (<code>normal</code>), <strong>Stopping</strong> (<code>stopping</code>), <strong>Stop Failed</strong> (<code>stop_failed</code>), or <strong>Stopped</strong> (<code>stopped</code>) state.</li>
     * <li>When a replication pair-consistent group is stopped, it enters the <strong>Stopped</strong> (<code>stopped</code>) state. If a replication pair-consistent group cannot be stopped, the state of the group remains unchanged or changes to <strong>Stop Failed</strong> (<code>stop_failed</code>). In this case, try again later.</li>
     * </ul>
     * 
     * @param request the request parameters of StopDiskReplicaGroup  StopDiskReplicaGroupRequest
     * @return StopDiskReplicaGroupResponse
     */
    CompletableFuture<StopDiskReplicaGroupResponse> stopDiskReplicaGroup(StopDiskReplicaGroupRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>For information about the regions in which async replication is available, see <a href="https://help.aliyun.com/document_detail/314563.html">Overview</a>.</li>
     * <li>Only replication pairs that are in the <strong>Initial Syncing</strong> (<code>initial_syncing</code>), <strong>Syncing</strong> (<code>syncing</code>), <strong>One-time Syncing</strong> (<code>manual_syncing</code>), or <strong>Normal</strong> (<code>normal</code>) state can be stopped. When a replication pair is stopped, it enters the Stopped (<code>stopped</code>) state. The secondary disk rolls back to the point in time when the last async replication was complete and drops all the data that is being replicated from the primary disk.</li>
     * </ul>
     * 
     * @param request the request parameters of StopDiskReplicaPair  StopDiskReplicaPairRequest
     * @return StopDiskReplicaPairResponse
     */
    CompletableFuture<StopDiskReplicaPairResponse> stopDiskReplicaPair(StopDiskReplicaPairRequest request);

    /**
     * <b>description</b> :
     * <p>Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number of tags is reached, an error message is returned. For more information, see the &quot;Tag limits&quot; section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnbindEnterpriseSnapshotPolicy  UnbindEnterpriseSnapshotPolicyRequest
     * @return UnbindEnterpriseSnapshotPolicyResponse
     */
    CompletableFuture<UnbindEnterpriseSnapshotPolicyResponse> unbindEnterpriseSnapshotPolicy(UnbindEnterpriseSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>  You can remove up to 20 tags at a time.</p>
     * <ul>
     * <li>After a tag is removed from an EBS resource, the tag is automatically deleted if the tag is not added to any instance.</li>
     * </ul>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateEnterpriseSnapshotPolicy  UpdateEnterpriseSnapshotPolicyRequest
     * @return UpdateEnterpriseSnapshotPolicyResponse
     */
    CompletableFuture<UpdateEnterpriseSnapshotPolicyResponse> updateEnterpriseSnapshotPolicy(UpdateEnterpriseSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of UpdateSolutionInstanceAttribute  UpdateSolutionInstanceAttributeRequest
     * @return UpdateSolutionInstanceAttributeResponse
     */
    CompletableFuture<UpdateSolutionInstanceAttributeResponse> updateSolutionInstanceAttribute(UpdateSolutionInstanceAttributeRequest request);

}
