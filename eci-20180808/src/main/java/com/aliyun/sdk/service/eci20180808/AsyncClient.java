// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eci20180808.models.*;
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
     * <p>You must specify the Alibaba Cloud Resource Name (ARN) of the RAM role of the Container Registry Enterprise Edition instance to grant the elastic container instance to assume the RAM role to push images.</p>
     * 
     * @param request the request parameters of CommitContainer  CommitContainerRequest
     * @return CommitContainerResponse
     */
    CompletableFuture<CommitContainerResponse> commitContainer(CommitContainerRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot directly use a DataCache across regions. You can call this operation to copy a DataCache from one region to another region. This operation is suitable for the following scenarios:</p>
     * <ul>
     * <li>If you want to use a DataCache across regions and the DataCache exists in Region A, you can call this operation to quickly copy the DataCache to Region B.</li>
     * <li>If you directly pull data from a region outside China to a region inside the Chinese mainland when you create a DataCache, the data may be pulled at a slow speed due to network limits. In this case, you can create a DataCache in a region outside the Chinese mainland but inside China, such as the China (Hong Kong) region, and call this operation to copy the data to the region inside the Chinese mainland.<blockquote>
     * <p>The process of copying a DataCache is equivalent to copying a snapshot. You are charged for the traffic generated during the copy process and the storage of the generated DataCache.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CopyDataCache  CopyDataCacheRequest
     * @return CopyDataCacheResponse
     */
    CompletableFuture<CopyDataCacheResponse> copyDataCache(CopyDataCacheRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the CreateContainerGroup operation to create an elastic container instance, the system automatically creates a service-linked role named AliyunServiceRoleForECI. You can assume the service-linked role to access relevant cloud services such as Elastic Compute Service (ECS) and Virtual Private Cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/212914.html">Elastic Container Instance service-linked role</a>.
     * When you create an elastic container instance, you can configure features that are related to instances, images, and storage based on your business requirements. For information about parameters configured for the features and the description of the parameters, see the following documents:
     * <strong>Instances</strong>
     * You can use one of the following methods to create an elastic container instance:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/114662.html">Specify the number of vCPUs and memory size to create an elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/114664.html">Specify ECS instance types to create an elastic container instance</a>
     * Both the preceding creation methods support the following features:</li>
     * <li><a href="https://help.aliyun.com/document_detail/157759.html">Create a preemptible elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/157290.html">Configure multiple zones</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146468.html">Configure multiple specifications</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/146608.html">Use tags to manage elastic container instances</a>
     * <strong>Images</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/461311.html">Configure a container image</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/141281.html">Use the image cache feature to accelerate the creation of an elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/194250.html">Specify a Container Registry Enterprise Edition instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/378059.html">Use self-managed image repositories</a>
     * <strong>Networking</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/99146.html">Create and Associate an EIP</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/176237.html">Assign a security group</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/451282.html">Assign an IPv6 address to an elastic container instance</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/190635.html">Configure maximum bandwidth</a>
     * <strong>Storage</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/144571.html">Mount a disk volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464075.html">Mount a NAS volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464076.html">Mount an OSS bucket to an elastic container instance as a volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464078.html">Mount an emptyDir volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/464080.html">Mount a ConfigFile volume</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/204066.html">Increase the size of the temporary storage space</a>
     * <strong>Container configuration</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/94593.html">Configure startup commands and arguments for a container</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/99053.html">Use probes to perform health checks on a container</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/141788.html">Obtain metadata by using environment variables</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/462313.html">Configure a security context for an elastic container instance or a container</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/462768.html">Configure the NTP service</a>
     * <strong>Logging and O\&amp;M</strong></li>
     * <li><a href="https://help.aliyun.com/document_detail/121973.html">Use environment variables to configure log collection</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/167801.html">Save core files to volumes</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateContainerGroup  CreateContainerGroupRequest
     * @return CreateContainerGroupResponse
     */
    CompletableFuture<CreateContainerGroupResponse> createContainerGroup(CreateContainerGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  You are charged for the creation of image caches. We recommend that you learn the relevant billing information in advance. For more information, see <a href="https://help.aliyun.com/document_detail/2503093.html">DataCaches</a>.</p>
     * <ul>
     * <li>Before you create an image cache, you must evaluate the size of the data to be cached. If the size of the data exceeds the specified cache size, the image cache fails to be created.</li>
     * <li>When a data cache is being created, the system automatically creates a temporary elastic container instance (ECI) and an enhanced SSD (ESSD) for the data cache. During the creation, do not delete the ECI and ESSD. Otherwise, the data cache fails to be created.</li>
     * <li>When a data cache is being created, a snapshot is generated for the data cache. Do not delete the snapshot. Otherwise, the data cache becomes invalid.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDataCache  CreateDataCacheRequest
     * @return CreateDataCacheResponse
     */
    CompletableFuture<CreateDataCacheResponse> createDataCache(CreateDataCacheRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Precautions</strong>
     *     *   You are charged for creation of image caches. We recommend that you learn the relevant billing information in advance. For more information about billing of image caches, see <a href="https://help.aliyun.com/document_detail/447682.html">Image caches</a>.
     *     *   Before you create an image cache, you must estimate the total size of the images that you want to cache. If the total size of the images exceeds the specified cache size, the image cache cannot be created.
     *     *   When an image cache is being created, the system creates an intermediate elastic container instance and an intermediate enhanced SSD (ESSD) at performance level 1 (PL1). Do not delete the intermediate instance and the ESSD while the image cache is being created. If you delete the intermediate instance or the ESSD, the image cache cannot be created.
     *     *   A temporary local snapshot and a specific number of regular snapshots are generated during the creation of the image cache. Do not delete these snapshots. If you delete these snapshots, the image cache becomes invalid.
     *     *   If you use SDKs, SDK for Java 1.0.10 or later and SDK for Python 1.0.7 or later are supported.</p>
     * <ul>
     * <li><strong>Usage notes</strong><ul>
     * <li>For images that are created based on Container Registry Enterprise Edition instances and use custom domain names, if you want to configure password-free access to the image caches, you must use AcrRegistryInfo-related parameters to specify Container Registry instances. When you configure AcrRegistryInfo-related parameters, you must set the AcrRegistryInfo.N.InstanceId parameter.</li>
     * <li>If the image cache that you created will be used to create more than 1,000 elastic container instances at a time, we recommend that you use the StandardCopyCount and FlashCopyCount parameters to create multiple temporary local snapshots and regular snapshots of the image. The multiple snapshots are billed based on incremental data. If no incremental data exists on the multiple snapshots, you are not charged for the multiple snapshots.<blockquote>
     * <p> When you call the CreateImageCache operation to create an image cache, the system automatically creates a service-linked role named AliyunServiceRoleForECI. The role is used to access other Alibaba Cloud services such as Elastic Compute Service (ECS) and Virtual Private Cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/212914.html">Elastic Container Instance service-linked role</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageCache  CreateImageCacheRequest
     * @return CreateImageCacheResponse
     */
    CompletableFuture<CreateImageCacheResponse> createImageCache(CreateImageCacheRequest request);

    /**
     * <b>description</b> :
     * <p>O&amp;M tasks are classified into:</p>
     * <ul>
     * <li>coredump: After you enable coredump, the system generates a core dump file when a container unexpectedly stops. You can use the core dump file to analyze the exception and find out the cause of the problem. For more information, see <a href="https://help.aliyun.com/document_detail/167801.html">Enable coredump</a>.</li>
     * <li>tcpdump: After you enable tcpdump, the system captures network packets when a container unexpectedly stops. You can analyze the packets and locate network problems. For more information, see Enable <a href="https://help.aliyun.com/document_detail/429749.html">tcpdump</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstanceOpsTask  CreateInstanceOpsTaskRequest
     * @return CreateInstanceOpsTaskResponse
     */
    CompletableFuture<CreateInstanceOpsTaskResponse> createInstanceOpsTask(CreateInstanceOpsTaskRequest request);

    /**
     * <b>description</b> :
     * <p>  When you call this operation to create a virtual node, the system automatically creates a service-linked role AliyunServiceRoleForECIVnode. This way, you can use the service-linked role to access relevant cloud services such as Elastic Container Instance, Elastic Compute Service (ECS), and Virtual Private Cloud (VPC). For more information, see <a href="https://help.aliyun.com/document_detail/311014.html">Service-linked role for virtual nodes</a>.</p>
     * <ul>
     * <li>You are charged for virtual nodes based on number of virtual nodes that you use. Each virtual node has a resident node, which is equivalent to an ECI instance with 2 vCPU cores and 8 GiB memory. You are charged for virtual nodes based on elastic container instances.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVirtualNode  CreateVirtualNodeRequest
     * @return CreateVirtualNodeResponse
     */
    CompletableFuture<CreateVirtualNodeResponse> createVirtualNode(CreateVirtualNodeRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete a container group that you no longer need. Before you delete a container group, make sure that you understand the lifecycle of container groups. For more information, see <a href="https://help.aliyun.com/document_detail/122385.html">Lifecycle of an elastic container instance</a>.</p>
     * 
     * @param request the request parameters of DeleteContainerGroup  DeleteContainerGroupRequest
     * @return DeleteContainerGroupResponse
     */
    CompletableFuture<DeleteContainerGroupResponse> deleteContainerGroup(DeleteContainerGroupRequest request);

    /**
     * @param request the request parameters of DeleteDataCache  DeleteDataCacheRequest
     * @return DeleteDataCacheResponse
     */
    CompletableFuture<DeleteDataCacheResponse> deleteDataCache(DeleteDataCacheRequest request);

    /**
     * @param request the request parameters of DeleteImageCache  DeleteImageCacheRequest
     * @return DeleteImageCacheResponse
     */
    CompletableFuture<DeleteImageCacheResponse> deleteImageCache(DeleteImageCacheRequest request);

    /**
     * @param request the request parameters of DeleteVirtualNode  DeleteVirtualNodeRequest
     * @return DeleteVirtualNodeResponse
     */
    CompletableFuture<DeleteVirtualNodeResponse> deleteVirtualNode(DeleteVirtualNodeRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the CreateContainerGroup operation to create an elastic container instance, you can use the InstanceType parameter to specify ECS instance types that fit your specific needs. To ensure that the elastic container instance can be created, you can call the DescribeAvailableResource operation to query which ECS instance types and instance families are available in the specified region and zone before you create the elastic container instance.</p>
     * 
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
     * @param request the request parameters of DescribeCommitContainerTask  DescribeCommitContainerTaskRequest
     * @return DescribeCommitContainerTaskResponse
     */
    CompletableFuture<DescribeCommitContainerTaskResponse> describeCommitContainerTask(DescribeCommitContainerTaskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the event information about multiple elastic container instances at a time. By default, the most recent 50 entries of events of each elastic container instance are returned.</p>
     * 
     * @param request the request parameters of DescribeContainerGroupEvents  DescribeContainerGroupEventsRequest
     * @return DescribeContainerGroupEventsResponse
     */
    CompletableFuture<DescribeContainerGroupEventsResponse> describeContainerGroupEvents(DescribeContainerGroupEventsRequest request);

    /**
     * <b>description</b> :
     * <p>  A maximum of 50 monitoring data entries can be returned. If the number of monitoring data entries exceeds this limit, an error message is returned.</p>
     * <ul>
     * <li>You can query real-time monitoring data (data generated within the last 5 minutes) and historical data (data generated more than 5 minutes ago). If the time range to query starts or ends later than the current time, historical monitoring data generated more than 5 minutes ago is returned.</li>
     * <li>The elastic container instance whose monitoring data you want to query must be created after April 3, 2019, 15:00 UTC+8.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeContainerGroupMetric  DescribeContainerGroupMetricRequest
     * @return DescribeContainerGroupMetricResponse
     */
    CompletableFuture<DescribeContainerGroupMetricResponse> describeContainerGroupMetric(DescribeContainerGroupMetricRequest request);

    /**
     * <b>description</b> :
     * <p>  When you call this operation, you cannot use resource groups to control the permissions of a RAM user.</p>
     * <ul>
     * <li>You can create an elastic container instance by specifying vCPU and memory resource specifications or by specifying ECS instance types. When you call this operation to query the prices of elastic container instances, pass in specifications of the elastic container instances.<ul>
     * <li><a href="https://help.aliyun.com/document_detail/114662.html">vCPU and memory specifications</a>.</li>
     * <li><a href="https://help.aliyun.com/document_detail/114664.html">ECS instance types that are supported by Elastic Container Instance</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeContainerGroupPrice  DescribeContainerGroupPriceRequest
     * @return DescribeContainerGroupPriceResponse
     */
    CompletableFuture<DescribeContainerGroupPriceResponse> describeContainerGroupPrice(DescribeContainerGroupPriceRequest request);

    /**
     * @param request the request parameters of DescribeContainerGroupStatus  DescribeContainerGroupStatusRequest
     * @return DescribeContainerGroupStatusResponse
     */
    CompletableFuture<DescribeContainerGroupStatusResponse> describeContainerGroupStatus(DescribeContainerGroupStatusRequest request);

    /**
     * <b>description</b> :
     * <p>  After an elastic container instance is terminated, its underlying computing resources are recycled. By default, other resources, such as elastic IP addresses (EIPs), that are created together with the instance are released together with the instance.</p>
     * <ul>
     * <li>The metadata of an instance in the final status (Failed, Succeeded, or Expired) is retained based on the following rules:<ul>
     * <li>All metadata information is retained within 1 hour since the instance enters the final status.</li>
     * <li>One hour after the instance enters the final status, only the latest 100 entries of metadata information in each region are retained.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeContainerGroups  DescribeContainerGroupsRequest
     * @return DescribeContainerGroupsResponse
     */
    CompletableFuture<DescribeContainerGroupsResponse> describeContainerGroups(DescribeContainerGroupsRequest request);

    /**
     * @param request the request parameters of DescribeContainerLog  DescribeContainerLogRequest
     * @return DescribeContainerLogResponse
     */
    CompletableFuture<DescribeContainerLogResponse> describeContainerLog(DescribeContainerLogRequest request);

    /**
     * @param request the request parameters of DescribeDataCaches  DescribeDataCachesRequest
     * @return DescribeDataCachesResponse
     */
    CompletableFuture<DescribeDataCachesResponse> describeDataCaches(DescribeDataCachesRequest request);

    /**
     * @param request the request parameters of DescribeImageCaches  DescribeImageCachesRequest
     * @return DescribeImageCachesResponse
     */
    CompletableFuture<DescribeImageCachesResponse> describeImageCaches(DescribeImageCachesRequest request);

    /**
     * @param request the request parameters of DescribeInstanceOpsRecords  DescribeInstanceOpsRecordsRequest
     * @return DescribeInstanceOpsRecordsResponse
     */
    CompletableFuture<DescribeInstanceOpsRecordsResponse> describeInstanceOpsRecords(DescribeInstanceOpsRecordsRequest request);

    /**
     * <b>description</b> :
     * <p>  Only the latest entry of monitoring data of each elastic container instance is returned.</p>
     * <ul>
     * <li>You can query only the monitoring data of elastic container instances that are created after April 3, 2019 15:00:00 UTC+8.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeMultiContainerGroupMetric  DescribeMultiContainerGroupMetricRequest
     * @return DescribeMultiContainerGroupMetricResponse
     */
    CompletableFuture<DescribeMultiContainerGroupMetricResponse> describeMultiContainerGroupMetric(DescribeMultiContainerGroupMetricRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeVirtualNodes  DescribeVirtualNodesRequest
     * @return DescribeVirtualNodesResponse
     */
    CompletableFuture<DescribeVirtualNodesResponse> describeVirtualNodes(DescribeVirtualNodesRequest request);

    /**
     * @param request the request parameters of ExecContainerCommand  ExecContainerCommandRequest
     * @return ExecContainerCommandResponse
     */
    CompletableFuture<ExecContainerCommandResponse> execContainerCommand(ExecContainerCommandRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>This operation does not support resource group authentication.</p>
     * 
     * @param request the request parameters of ListUsage  ListUsageRequest
     * @return ListUsageResponse
     */
    CompletableFuture<ListUsageResponse> listUsage(ListUsageRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>You can scale up volumes by calling this operation. You cannot scale down volumes by calling this operation.</li>
     * <li>Only volumes of the disk type can be scaled up. Volumes of other types cannot be scaled up.</li>
     * </ul>
     * 
     * @param request the request parameters of ResizeContainerGroupVolume  ResizeContainerGroupVolumeRequest
     * @return ResizeContainerGroupVolumeResponse
     */
    CompletableFuture<ResizeContainerGroupVolumeResponse> resizeContainerGroupVolume(ResizeContainerGroupVolumeRequest request);

    /**
     * <b>description</b> :
     * <p>  Only elastic container instances that are in the Pending or Running state can be restarted. Instances that are in the Succeeded or Failed state cannot be restarted.</p>
     * <ul>
     * <li>Elastic container instances that were created before 15:00:00 on March 7, 2019 cannot be restarted.</li>
     * <li>When an elastic container instance is being restarted, its status changes into Restarting.</li>
     * </ul>
     * 
     * @param request the request parameters of RestartContainerGroup  RestartContainerGroupRequest
     * @return RestartContainerGroupResponse
     */
    CompletableFuture<RestartContainerGroupResponse> restartContainerGroup(RestartContainerGroupRequest request);

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
     * <p>  Only elastic container instances that are in the Pending or Running state can be updated. After you call this operation to update an elastic container instance, the instance enters the Updating state.</p>
     * <ul>
     * <li>If the RestartPolicy parameter is set to Never for the elastic container instance that you are updating, the containers of the instance may fail. Exercise caution if you want to update the kind of instances.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateContainerGroup  UpdateContainerGroupRequest
     * @return UpdateContainerGroupResponse
     */
    CompletableFuture<UpdateContainerGroupResponse> updateContainerGroup(UpdateContainerGroupRequest request);

    /**
     * @param request the request parameters of UpdateDataCache  UpdateDataCacheRequest
     * @return UpdateDataCacheResponse
     */
    CompletableFuture<UpdateDataCacheResponse> updateDataCache(UpdateDataCacheRequest request);

    /**
     * <b>description</b> :
     * <p>Only image caches that are in the Ready or UpdateFailed state can be updated.</p>
     * 
     * @param request the request parameters of UpdateImageCache  UpdateImageCacheRequest
     * @return UpdateImageCacheResponse
     */
    CompletableFuture<UpdateImageCacheResponse> updateImageCache(UpdateImageCacheRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Only virtual nodes that are in the Ready state can be updated.</p>
     * 
     * @param request the request parameters of UpdateVirtualNode  UpdateVirtualNodeRequest
     * @return UpdateVirtualNodeResponse
     */
    CompletableFuture<UpdateVirtualNodeResponse> updateVirtualNode(UpdateVirtualNodeRequest request);

}
