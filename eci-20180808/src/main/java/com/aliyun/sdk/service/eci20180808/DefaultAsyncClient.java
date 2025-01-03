// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.eci20180808.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Eci";
        this.version = "2018-08-08";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>You must specify the Alibaba Cloud Resource Name (ARN) of the RAM role of the Container Registry Enterprise Edition instance to grant the elastic container instance to assume the RAM role to push images.</p>
     * 
     * @param request the request parameters of CommitContainer  CommitContainerRequest
     * @return CommitContainerResponse
     */
    @Override
    public CompletableFuture<CommitContainerResponse> commitContainer(CommitContainerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CommitContainer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CommitContainerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CommitContainerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CopyDataCacheResponse> copyDataCache(CopyDataCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyDataCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyDataCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyDataCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateContainerGroupResponse> createContainerGroup(CreateContainerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateContainerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContainerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContainerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateDataCacheResponse> createDataCache(CreateDataCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDataCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateImageCacheResponse> createImageCache(CreateImageCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateInstanceOpsTaskResponse> createInstanceOpsTask(CreateInstanceOpsTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstanceOpsTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceOpsTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceOpsTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateVirtualNodeResponse> createVirtualNode(CreateVirtualNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVirtualNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVirtualNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVirtualNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can delete a container group that you no longer need. Before you delete a container group, make sure that you understand the lifecycle of container groups. For more information, see <a href="https://help.aliyun.com/document_detail/122385.html">Lifecycle of an elastic container instance</a>.</p>
     * 
     * @param request the request parameters of DeleteContainerGroup  DeleteContainerGroupRequest
     * @return DeleteContainerGroupResponse
     */
    @Override
    public CompletableFuture<DeleteContainerGroupResponse> deleteContainerGroup(DeleteContainerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteContainerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContainerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContainerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataCache  DeleteDataCacheRequest
     * @return DeleteDataCacheResponse
     */
    @Override
    public CompletableFuture<DeleteDataCacheResponse> deleteDataCache(DeleteDataCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDataCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDataCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDataCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteImageCache  DeleteImageCacheRequest
     * @return DeleteImageCacheResponse
     */
    @Override
    public CompletableFuture<DeleteImageCacheResponse> deleteImageCache(DeleteImageCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImageCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVirtualNode  DeleteVirtualNodeRequest
     * @return DeleteVirtualNodeResponse
     */
    @Override
    public CompletableFuture<DeleteVirtualNodeResponse> deleteVirtualNode(DeleteVirtualNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVirtualNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVirtualNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVirtualNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call the CreateContainerGroup operation to create an elastic container instance, you can use the InstanceType parameter to specify ECS instance types that fit your specific needs. To ensure that the elastic container instance can be created, you can call the DescribeAvailableResource operation to query which ECS instance types and instance families are available in the specified region and zone before you create the elastic container instance.</p>
     * 
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    @Override
    public CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailableResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailableResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCommitContainerTask  DescribeCommitContainerTaskRequest
     * @return DescribeCommitContainerTaskResponse
     */
    @Override
    public CompletableFuture<DescribeCommitContainerTaskResponse> describeCommitContainerTask(DescribeCommitContainerTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommitContainerTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommitContainerTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommitContainerTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the event information about multiple elastic container instances at a time. By default, the most recent 50 entries of events of each elastic container instance are returned.</p>
     * 
     * @param request the request parameters of DescribeContainerGroupEvents  DescribeContainerGroupEventsRequest
     * @return DescribeContainerGroupEventsResponse
     */
    @Override
    public CompletableFuture<DescribeContainerGroupEventsResponse> describeContainerGroupEvents(DescribeContainerGroupEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerGroupEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerGroupEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerGroupEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeContainerGroupMetricResponse> describeContainerGroupMetric(DescribeContainerGroupMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerGroupMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerGroupMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerGroupMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeContainerGroupPriceResponse> describeContainerGroupPrice(DescribeContainerGroupPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerGroupPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerGroupPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerGroupPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerGroupStatus  DescribeContainerGroupStatusRequest
     * @return DescribeContainerGroupStatusResponse
     */
    @Override
    public CompletableFuture<DescribeContainerGroupStatusResponse> describeContainerGroupStatus(DescribeContainerGroupStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerGroupStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerGroupStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerGroupStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeContainerGroupsResponse> describeContainerGroups(DescribeContainerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeContainerLog  DescribeContainerLogRequest
     * @return DescribeContainerLogResponse
     */
    @Override
    public CompletableFuture<DescribeContainerLogResponse> describeContainerLog(DescribeContainerLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeContainerLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeContainerLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeContainerLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDataCaches  DescribeDataCachesRequest
     * @return DescribeDataCachesResponse
     */
    @Override
    public CompletableFuture<DescribeDataCachesResponse> describeDataCaches(DescribeDataCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDataCaches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDataCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDataCachesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeImageCaches  DescribeImageCachesRequest
     * @return DescribeImageCachesResponse
     */
    @Override
    public CompletableFuture<DescribeImageCachesResponse> describeImageCaches(DescribeImageCachesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageCaches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageCachesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageCachesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeInstanceOpsRecords  DescribeInstanceOpsRecordsRequest
     * @return DescribeInstanceOpsRecordsResponse
     */
    @Override
    public CompletableFuture<DescribeInstanceOpsRecordsResponse> describeInstanceOpsRecords(DescribeInstanceOpsRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceOpsRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceOpsRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceOpsRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeMultiContainerGroupMetricResponse> describeMultiContainerGroupMetric(DescribeMultiContainerGroupMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMultiContainerGroupMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMultiContainerGroupMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMultiContainerGroupMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVirtualNodes  DescribeVirtualNodesRequest
     * @return DescribeVirtualNodesResponse
     */
    @Override
    public CompletableFuture<DescribeVirtualNodesResponse> describeVirtualNodes(DescribeVirtualNodesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVirtualNodes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVirtualNodesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVirtualNodesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecContainerCommand  ExecContainerCommandRequest
     * @return ExecContainerCommandResponse
     */
    @Override
    public CompletableFuture<ExecContainerCommandResponse> execContainerCommand(ExecContainerCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExecContainerCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecContainerCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecContainerCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation does not support resource group authentication.</p>
     * 
     * @param request the request parameters of ListUsage  ListUsageRequest
     * @return ListUsageResponse
     */
    @Override
    public CompletableFuture<ListUsageResponse> listUsage(ListUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ResizeContainerGroupVolumeResponse> resizeContainerGroupVolume(ResizeContainerGroupVolumeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResizeContainerGroupVolume").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResizeContainerGroupVolumeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResizeContainerGroupVolumeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RestartContainerGroupResponse> restartContainerGroup(RestartContainerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestartContainerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestartContainerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestartContainerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateContainerGroupResponse> updateContainerGroup(UpdateContainerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateContainerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContainerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContainerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDataCache  UpdateDataCacheRequest
     * @return UpdateDataCacheResponse
     */
    @Override
    public CompletableFuture<UpdateDataCacheResponse> updateDataCache(UpdateDataCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDataCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDataCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDataCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only image caches that are in the Ready or UpdateFailed state can be updated.</p>
     * 
     * @param request the request parameters of UpdateImageCache  UpdateImageCacheRequest
     * @return UpdateImageCacheResponse
     */
    @Override
    public CompletableFuture<UpdateImageCacheResponse> updateImageCache(UpdateImageCacheRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateImageCache").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateImageCacheResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateImageCacheResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Only virtual nodes that are in the Ready state can be updated.</p>
     * 
     * @param request the request parameters of UpdateVirtualNode  UpdateVirtualNodeRequest
     * @return UpdateVirtualNodeResponse
     */
    @Override
    public CompletableFuture<UpdateVirtualNodeResponse> updateVirtualNode(UpdateVirtualNodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVirtualNode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVirtualNodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVirtualNodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
