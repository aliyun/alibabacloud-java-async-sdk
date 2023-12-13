// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eci20180808.models.*;
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
      * You must specify the Alibaba Cloud Resource Name (ARN) of the RAM role of the Container Registry Enterprise Edition instance to grant the elastic container instance to assume the RAM role to push images.
      *
     */
    CompletableFuture<CommitContainerResponse> commitContainer(CommitContainerRequest request);

    /**
      * You cannot directly use a DataCache across regions. You can call this operation to copy a DataCache from one region to another region. This operation is suitable for the following scenarios:
      * *   If you want to use a DataCache across regions and the DataCache exists in Region A, you can call this operation to quickly copy the DataCache to Region B.
      * *   If you directly pull data from a region outside China to a region inside the Chinese mainland when you create a DataCache, the data may be pulled at a slow speed due to network limits. In this case, you can create a DataCache in a region outside the Chinese mainland but inside China, such as the China (Hong Kong) region, and call this operation to copy the data to the region inside the Chinese mainland.
      * > The process of copying a DataCache is equivalent to copying a snapshot. You are charged for the traffic generated during the copy process and the storage of the generated DataCache.
      *
     */
    CompletableFuture<CopyDataCacheResponse> copyDataCache(CopyDataCacheRequest request);

    /**
      * When you call the CreateContainerGroup operation to create an elastic container instance, the system creates a service-linked role named AliyunServiceRoleForECI. This role is used to access other Alibaba Cloud services such as Elastic Compute Service (ECS) and Virtual Private Cloud (VPC). For more information, see [Elastic Container Instance service-linked role](~~212914~~).
      * When you create an elastic container instance, you can configure features such as instances, images, and storage based on your business requirements. For information about parameters configured for the features and the description of the parameters, see the following documents:
      * **Instances** You can use one of the following methods to create an elastic container instance:
      * *   [Specify the number of vCPUs and memory size to create an elastic container instance](~~114662~~)
      *     *   [Create job-optimized elastic container instances](~~324246~~)
      *     *   [Ignore special containers during resource adjustment](~~446853~~)
      * *   [Specify ECS instance types to create an elastic container instance](~~114664~~)
      * Both the preceding creation methods support the following features:
      * *   [Specify custom CPU options](~~197781~~)
      * *   [Create a preemptible elastic container instance](~~157759~~)
      * *   [Configure multiple zones](~~157290~~)
      * *   [Configure multiple specifications](~~146468~~)
      * *   [Use tags to manage elastic container instances](~~146608~~)
      * **Images**
      * *   [Configure a container image](~~461311~~)
      * *   [Use the image cache feature to accelerate the creation of an elastic container instance](~~141281~~)
      * *   [Specify a Container Registry Enterprise Edition instance](~~194250~~)
      * *   [Use self-managed image repositories](~~378059~~)
      * **Networking**
      * *   [Create and Associate an EIP](~~99146~~)
      * *   [Assign a security group](~~176237~~)
      * *   [Assign an IPv6 address to an elastic container instance](~~451282~~)
      * *   [Configure maximum bandwidth](~~190635~~)
      * **Storage**
      * *   [Mount a disk volume](~~144571~~)
      * *   [Mount a NAS volume](~~464075~~)
      * *   [Mount an OSS bucket to an elastic container instance as a volume](~~464076~~)
      * *   [Mount an emptyDir volume](~~464078~~)
      * *   [Mount a ConfigFile volume](~~464080~~)
      * *   [Increase the size of the temporary storage space](~~204066~~)
      * **Container configuration**
      * *   [Configure startup commands and arguments for a container](~~94593~~)
      * *   [Use probes to perform health checks on a container](~~99053~~)
      * *   [Obtain metadata by using environment variables](~~141788~~)
      * *   [Configure a security context](~~462313~~)
      * *   [Configure the NTP service](~~462768~~)
      * **Logging and O\\&M**
      * *   [Use environment variables to configure log collection](~~121973~~)
      * *   [Save core files to volumes](~~167801~~)
      *
     */
    CompletableFuture<CreateContainerGroupResponse> createContainerGroup(CreateContainerGroupRequest request);

    /**
      * *   You are charged for the creation of image caches. We recommend that you learn the relevant billing information in advance. For more information, see [DataCaches](~~2503093~~).
      * *   Before you create an image cache, you must evaluate the size of the data to be cached. If the size of the data exceeds the specified cache size, the image cache fails to be created.
      * *   When a data cache is being created, the system automatically creates a temporary elastic container instance (ECI) and an enhanced SSD (ESSD) for the data cache. During the creation, do not delete the ECI and ESSD. Otherwise, the data cache fails to be created.
      * *   When a data cache is being created, a snapshot is generated for the data cache. Do not delete the snapshot. Otherwise, the data cache becomes invalid.
      *
     */
    CompletableFuture<CreateDataCacheResponse> createDataCache(CreateDataCacheRequest request);

    /**
      * *   **Precautions**
      *     *   You are charged for creation of image caches. We recommend that you learn the relevant billing information in advance. For more information about billing of image caches, see [Image caches](~~447682~~).
      *     *   Before you create an image cache, you must estimate the total size of the images that you want to cache. If the total size of the images exceeds the specified cache size, the image cache cannot be created.
      *     *   When an image cache is being created, the system creates an intermediate elastic container instance and an intermediate enhanced SSD (ESSD) at performance level 1 (PL1). Do not delete the intermediate instance and the ESSD while the image cache is being created. If you delete the intermediate instance or the ESSD, the image cache cannot be created.
      *     *   A temporary local snapshot and a specific number of regular snapshots are generated during the creation of the image cache. Do not delete these snapshots. If you delete these snapshots, the image cache becomes invalid.
      *     *   If you use SDKs, SDK for Java 1.0.10 or later and SDK for Python 1.0.7 or later are supported.
      * *   **Usage notes**
      *     *   For images that are created based on Container Registry Enterprise Edition instances and use custom domain names, if you want to configure password-free access to the image caches, you must use AcrRegistryInfo-related parameters to specify Container Registry instances. When you configure AcrRegistryInfo-related parameters, you must set the AcrRegistryInfo.N.InstanceId parameter.
      *     *   If the image cache that you created will be used to create more than 1,000 elastic container instances at a time, we recommend that you use the StandardCopyCount and FlashCopyCount parameters to create multiple temporary local snapshots and regular snapshots of the image. The multiple snapshots are billed based on incremental data. If no incremental data exists on the multiple snapshots, you are not charged for the multiple snapshots.
      * >  When you call the CreateImageCache operation to create an image cache, the system automatically creates a service-linked role named AliyunServiceRoleForECI. The role is used to access other Alibaba Cloud services such as Elastic Compute Service (ECS) and Virtual Private Cloud (VPC). For more information, see [Elastic Container Instance service-linked role](~~212914~~).
      *
     */
    CompletableFuture<CreateImageCacheResponse> createImageCache(CreateImageCacheRequest request);

    /**
      * O&M tasks are classified into:
      * *   coredump: After you enable coredump, the system generates a core dump file when a container unexpectedly stops. You can use the core dump file to analyze the exception and find out the cause of the problem. For more information, see [Enable coredump](~~167801~~).
      * *   tcpdump: After you enable tcpdump, the system captures network packets when a container unexpectedly stops. You can analyze the packets and locate network problems. For more information, see Enable [tcpdump](~~429749~~).
      *
     */
    CompletableFuture<CreateInstanceOpsTaskResponse> createInstanceOpsTask(CreateInstanceOpsTaskRequest request);

    /**
      * *   When you call this operation to create a virtual node, the system automatically creates a service-linked role AliyunServiceRoleForECIVnode. This way, you can use the service-linked role to access relevant cloud services such as Elastic Container Instance, Elastic Compute Service (ECS), and Virtual Private Cloud (VPC). For more information, see [Service-linked role for virtual nodes](~~311014~~).
      * *   You are charged for virtual nodes based on number of virtual nodes that you use. Each virtual node has a resident node, which is equivalent to an ECI instance with 2 vCPU cores and 8 GiB memory. You are charged for virtual nodes based on elastic container instances.
      *
     */
    CompletableFuture<CreateVirtualNodeResponse> createVirtualNode(CreateVirtualNodeRequest request);

    CompletableFuture<DeleteContainerGroupResponse> deleteContainerGroup(DeleteContainerGroupRequest request);

    CompletableFuture<DeleteDataCacheResponse> deleteDataCache(DeleteDataCacheRequest request);

    CompletableFuture<DeleteImageCacheResponse> deleteImageCache(DeleteImageCacheRequest request);

    CompletableFuture<DeleteVirtualNodeResponse> deleteVirtualNode(DeleteVirtualNodeRequest request);

    /**
      * When you call the CreateContainerGroup operation to create an elastic container instance, you can use the InstanceType parameter to specify ECS instance types that fit your specific needs. To ensure that the elastic container instance can be created, you can call the DescribeAvailableResource operation to query which ECS instance types and instance families are available in the specified region and zone before you create the elastic container instance.
      *
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeCommitContainerTaskResponse> describeCommitContainerTask(DescribeCommitContainerTaskRequest request);

    /**
      * You can call this operation to query the event information about multiple elastic container instances at a time. By default, the most recent 50 entries of events of each elastic container instance are returned.
      *
     */
    CompletableFuture<DescribeContainerGroupEventsResponse> describeContainerGroupEvents(DescribeContainerGroupEventsRequest request);

    /**
      * *   A maximum of 50 monitoring data entries can be returned. If the number of monitoring data entries exceeds this limit, an error message is returned.
      * *   You can query real-time monitoring data (data generated within the last 5 minutes) and historical data (data generated more than 5 minutes ago). If the time range to query starts or ends later than the current time, historical monitoring data generated more than 5 minutes ago is returned.
      * *   The elastic container instance whose monitoring data you want to query must be created after April 3, 2019, 15:00 UTC+8.
      *
     */
    CompletableFuture<DescribeContainerGroupMetricResponse> describeContainerGroupMetric(DescribeContainerGroupMetricRequest request);

    /**
      * *   When you call this operation, you cannot use resource groups to control the permissions of a RAM user.
      * *   You can create an elastic container instance by specifying vCPU and memory resource specifications or by specifying ECS instance types. When you call this operation to query the prices of elastic container instances, pass in specifications of the elastic container instances.
      *     *   [vCPU and memory specifications](~~114662~~).
      *     *   [ECS instance types that are supported by Elastic Container Instance](~~114664~~).
      *
     */
    CompletableFuture<DescribeContainerGroupPriceResponse> describeContainerGroupPrice(DescribeContainerGroupPriceRequest request);

    CompletableFuture<DescribeContainerGroupStatusResponse> describeContainerGroupStatus(DescribeContainerGroupStatusRequest request);

    /**
      * *   After an elastic container instance is terminated, its underlying computing resources are recycled. By default, other resources, such as elastic IP addresses (EIPs), that are created together with the instance are released together with the instance.
      * *   The metadata of an instance in the final status (Failed, Succeeded, or Expired) is retained based on the following rules:
      *     *   All metadata information is retained within 1 hour since the instance enters the final status.
      *     *   One hour after the instance enters the final status, only the latest 100 entries of metadata information in each region are retained.
      *
     */
    CompletableFuture<DescribeContainerGroupsResponse> describeContainerGroups(DescribeContainerGroupsRequest request);

    CompletableFuture<DescribeContainerLogResponse> describeContainerLog(DescribeContainerLogRequest request);

    CompletableFuture<DescribeDataCachesResponse> describeDataCaches(DescribeDataCachesRequest request);

    CompletableFuture<DescribeImageCachesResponse> describeImageCaches(DescribeImageCachesRequest request);

    CompletableFuture<DescribeInstanceOpsRecordsResponse> describeInstanceOpsRecords(DescribeInstanceOpsRecordsRequest request);

    /**
      * *   Only the latest entry of monitoring data of each elastic container instance is returned.
      * *   You can query only the monitoring data of elastic container instances that are created after April 3, 2019 15:00:00 UTC+8.
      *
     */
    CompletableFuture<DescribeMultiContainerGroupMetricResponse> describeMultiContainerGroupMetric(DescribeMultiContainerGroupMetricRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeVirtualNodesResponse> describeVirtualNodes(DescribeVirtualNodesRequest request);

    CompletableFuture<ExecContainerCommandResponse> execContainerCommand(ExecContainerCommandRequest request);

    /**
      * This operation does not support resource group authentication.
      *
     */
    CompletableFuture<ListUsageResponse> listUsage(ListUsageRequest request);

    /**
      * You can scale up volumes by calling this operation. You cannot scale down volumes by calling this operation. Only volumes of Alibaba Cloud disks can be scaled up.
      *
     */
    CompletableFuture<ResizeContainerGroupVolumeResponse> resizeContainerGroupVolume(ResizeContainerGroupVolumeRequest request);

    /**
      * *   Only elastic container instances that are in the Pending or Running state can be restarted. Instances that are in the Succeeded or Failed state cannot be restarted.
      * *   Elastic container instances that were created before 15:00:00 on March 7, 2019 cannot be restarted.
      * *   When an elastic container instance is being restarted, its status changes into Restarting.
      *
     */
    CompletableFuture<RestartContainerGroupResponse> restartContainerGroup(RestartContainerGroupRequest request);

    /**
      * *   You can update only elastic container instances that are in the Pending or Running state. After you call this operation to update an elastic container instance, the instance enters the Updating state.
      * *   You cannot update elastic container instances that were created before 15:00:00 March 7, 2019.
      *
     */
    CompletableFuture<UpdateContainerGroupResponse> updateContainerGroup(UpdateContainerGroupRequest request);

    CompletableFuture<UpdateDataCacheResponse> updateDataCache(UpdateDataCacheRequest request);

    /**
      * Only image caches that are in the Ready or UpdateFailed state can be updated.
      *
     */
    CompletableFuture<UpdateImageCacheResponse> updateImageCache(UpdateImageCacheRequest request);

    /**
      * ## Usage notes
      * Only virtual nodes that are in the Ready state can be updated.
      *
     */
    CompletableFuture<UpdateVirtualNodeResponse> updateVirtualNode(UpdateVirtualNodeRequest request);

}
