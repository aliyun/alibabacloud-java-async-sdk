// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ebs20210730.models.*;
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
        this.product = "ebs";
        this.version = "2021-07-30";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
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
    @Override
    public CompletableFuture<AddDiskReplicaPairResponse> addDiskReplicaPair(AddDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDiskReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDiskReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    @Override
    public CompletableFuture<ApplyLensServiceResponse> applyLensService(ApplyLensServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyLensService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyLensServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyLensServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<BindEnterpriseSnapshotPolicyResponse> bindEnterpriseSnapshotPolicy(BindEnterpriseSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindEnterpriseSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindEnterpriseSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindEnterpriseSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    @Override
    public CompletableFuture<CancelLensServiceResponse> cancelLensService(CancelLensServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelLensService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelLensServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelLensServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ClearPairDrillResponse> clearPairDrill(ClearPairDrillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClearPairDrill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClearPairDrillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClearPairDrillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ClearReplicaGroupDrillResponse> clearReplicaGroupDrill(ClearReplicaGroupDrillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClearReplicaGroupDrill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClearReplicaGroupDrillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClearReplicaGroupDrillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Dedicated block storage clusters are physically isolated from public block storage clusters. The owner of each dedicated block storage cluster has exclusive access to all resources in the cluster.
      * Disks created in a dedicated block storage cluster can be attached only to Elastic Compute Service (ECS) instances that reside in the same zone as the cluster. Before you create a dedicated block storage cluster, decide the regions and zones in which to deploy your cloud resources.
      * Dedicated block storage clusters are classified into basic and performance types. When you create a dedicated block storage cluster, select a cluster type based on your business requirements.
      * You are charged for creating dedicated block storage clusters.
      *
     */
    @Override
    public CompletableFuture<CreateDedicatedBlockStorageClusterResponse> createDedicatedBlockStorageCluster(CreateDedicatedBlockStorageClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDedicatedBlockStorageCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDedicatedBlockStorageClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDedicatedBlockStorageClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateDiskReplicaGroupResponse> createDiskReplicaGroup(CreateDiskReplicaGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDiskReplicaGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDiskReplicaGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDiskReplicaGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Async replication is a feature that protects data across regions by using the data replication capability of Elastic Block Storage (EBS). This feature can be used to asynchronously replicate data from a disk in one region to a disk in another region for disaster recovery purposes. You can use this feature to implement disaster recovery for critical business to protect data in your databases and improve business continuity.
      * Currently, the async replication feature can asynchronously replicate data only between enhanced SSDs (ESSDs). The functionality of disks in replication pairs is limited. You are charged on a subscription basis for the bandwidth that is used by the async replication feature.
      * Before you call this operation, take note of the following items:
      * *   Make sure that the source disk (primary disk) from which to replicate data and the destination disk (secondary disk) to which to replicate data are created. You can call the [CreateDisk](~~25513~~) operation to create disks.
      * *   The secondary disk cannot reside the same region as the primary disk. The async replication feature is supported in the China (Hangzhou), China (Shanghai), China (Beijing), China (Shenzhen), China (Heyuan), China (Chengdu), China (Hong Kong), Singapore, US (Silicon Valley), and US (Virginia) regions.
      * *   After you call this operation to create a replication pair, you must call the [StartDiskReplicaPair](~~354205~~) operation to enable async replication to periodically replicate data from the primary disk to the secondary disk across regions.
      *
     */
    @Override
    public CompletableFuture<CreateDiskReplicaPairResponse> createDiskReplicaPair(CreateDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDiskReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDiskReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateEnterpriseSnapshotPolicyResponse> createEnterpriseSnapshotPolicy(CreateEnterpriseSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEnterpriseSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEnterpriseSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEnterpriseSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Currently, this API is only available for use with ACS resource hosting and is not yet open for direct invocation.
      *
     */
    @Override
    public CompletableFuture<DeleteDiskResponse> deleteDisk(DeleteDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   Before you can delete a replication pair-consistent group, make sure that no replication pairs exist in the group.
      * *   The replication pair-consistent group that you want to delete must be in the **Created** (`created`), **Creation Failed** (`create_failed`), **Stopped** (`stopped`), **Failovered** (`failovered`), **Deleting** (`deleting`), **Deletion Failed** (`delete_failed`), or **Invalid** (`invalid`) state.
      *
     */
    @Override
    public CompletableFuture<DeleteDiskReplicaGroupResponse> deleteDiskReplicaGroup(DeleteDiskReplicaGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDiskReplicaGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDiskReplicaGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDiskReplicaGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   Only replication pairs that are in the **Stopped** (`stopped`), **Invalid** (`invalid`), or **Failovered** (`failovered`) state can be deleted. This operation deletes only replication pairs. The primary and secondary disks in the deleted replication pairs are retained.
      * *   To delete a replication pair, you must call this operation in the region where the primary disk is located. After the replication pair is deleted, the functionality limits are lifted from the primary and secondary disks. For example, you can attach the secondary disk, resize the disk, or read data from or write data to the disk.
      *
     */
    @Override
    public CompletableFuture<DeleteDiskReplicaPairResponse> deleteDiskReplicaPair(DeleteDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDiskReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDiskReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteEnterpriseSnapshotPolicyResponse> deleteEnterpriseSnapshotPolicy(DeleteEnterpriseSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEnterpriseSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEnterpriseSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEnterpriseSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can use one of the following methods to check the responses:
      *     *   Method 1: Use `NextToken` to configure the query token. Set the value to the `NextToken` value that is returned in the last call to the DescribeDisks operation. Then, use `MaxResults` to specify the maximum number of entries to return on each page.
      *     *   Method 2: Use `PageSize` to specify the number of entries to return on each page and then use `PageNumber` to specify the number of the page to return.
      *         You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use method 1. When `NextToken` is specified, `PageSize` and `PageNumber` do not take effect and `TotalCount` in the response is invalid.
      * *   A disk that has the multi-attach feature enabled can be attached to multiple instances. You can query the attachment information of the disk based on the `Attachment` values in the response.
      * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    @Override
    public CompletableFuture<DescribeDedicatedBlockStorageClusterDisksResponse> describeDedicatedBlockStorageClusterDisks(DescribeDedicatedBlockStorageClusterDisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedBlockStorageClusterDisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedBlockStorageClusterDisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedBlockStorageClusterDisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * >  The Dedicated Block Storage Cluster feature is available only in the China (Heyuan), Indonesia (Jakarta), and China (Shenzhen) regions.
      * *   You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are included in the filter conditions.
      * *   We recommend that you use NextToken and MaxResults to perform paged queries. We recommend that you use MaxResults to specify the maximum number of entries to return in each request. The return value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeDedicatedBlockStorageClusters operation to retrieve a new page of results, set NextToken to the NextToken value that is returned in the previous call and specify MaxResults to limit the number of entries returned.
      *
     */
    @Override
    public CompletableFuture<DescribeDedicatedBlockStorageClustersResponse> describeDedicatedBlockStorageClusters(DescribeDedicatedBlockStorageClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedBlockStorageClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedBlockStorageClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedBlockStorageClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    @Override
    public CompletableFuture<DescribeDiskEventsResponse> describeDiskEvents(DescribeDiskEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiskEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiskEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * *   CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      * *   Up to 400 monitoring data entries can be returned at a time. An error is returned if the value calculated based on the following formula is greater than 400: `(EndTime - StartTime)/Period`.
      * *   You can query the monitoring data collected in the last three days. An error is returned if the time specified by `StartTime` is more than three days prior to the current time.
      *
     */
    @Override
    public CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiskMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiskMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    @Override
    public CompletableFuture<DescribeDiskMonitorDataListResponse> describeDiskMonitorDataList(DescribeDiskMonitorDataListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskMonitorDataList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiskMonitorDataListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiskMonitorDataListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * To perform a paged query, set the MaxResults and NextToken parameters.
      * During a paged query, when you call the DescribeDiskReplicaGroups operation to retrieve the first page of results, set `MaxResults` to specify the maximum number of entries to return in the call. The return value of `NextToken` is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeDiskReplicaGroups operation to retrieve a new page of results, set `NextToken` to the `NextToken` value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call.
      *
     */
    @Override
    public CompletableFuture<DescribeDiskReplicaGroupsResponse> describeDiskReplicaGroups(DescribeDiskReplicaGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskReplicaGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiskReplicaGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiskReplicaGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDiskReplicaPairProgressResponse> describeDiskReplicaPairProgress(DescribeDiskReplicaPairProgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskReplicaPairProgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiskReplicaPairProgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiskReplicaPairProgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   When you call this operation for a specific region, if the primary disk (source disk) or secondary disk (destination disk) of a replication pair resides in the region, information about the replication pair is displayed in the response.
      * *   If you want to perform a paged query, configure the `NextToken` and `MaxResults` parameters. During a paged query, when you call the DescribeDiskReplicaPairs operation to retrieve the first page of results, set `MaxResults` to limit the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeDiskReplicaPairs operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call.
      *
     */
    @Override
    public CompletableFuture<DescribeDiskReplicaPairsResponse> describeDiskReplicaPairs(DescribeDiskReplicaPairsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskReplicaPairs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiskReplicaPairsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiskReplicaPairsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeEnterpriseSnapshotPolicyResponse> describeEnterpriseSnapshotPolicy(DescribeEnterpriseSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEnterpriseSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEnterpriseSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEnterpriseSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * CloudLens for EBS is in invitational preview in the China (Hangzhou), China (Shanghai), China (Zhangjiakou), China (Shenzhen), and China (Hong Kong) regions. To use the feature, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      *
     */
    @Override
    public CompletableFuture<DescribeLensServiceStatusResponse> describeLensServiceStatus(DescribeLensServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLensServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLensServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLensServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeMetricDataResponse> describeMetricData(DescribeMetricDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMetricData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribePairDrillsResponse> describePairDrills(DescribePairDrillsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePairDrills").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePairDrillsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePairDrillsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DescribeReplicaGroupDrillsResponse> describeReplicaGroupDrills(DescribeReplicaGroupDrillsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeReplicaGroupDrills").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeReplicaGroupDrillsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeReplicaGroupDrillsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   The replication pair-consistent group must be in the **One-time Syncing** (`manual_syncing`), **Syncing** (`syncing`), **Normal** (`normal`), **Stopping** (`stopping`), **Stop Failed** (`stop_failed`), **Stopped** (`stopped`), **In Failover** (`failovering`), **Failover Failed** (`failover_failed`), or **Failovered** (`failovered`) state.
      * *   After a failover is performed, the replication pair-consistent group enters the **Failovered** (`failovered`) state.
      * *   Before you perform a failover, make sure that the first full data synchronization is completed between the primary site and secondary site.
      *
     */
    @Override
    public CompletableFuture<FailoverDiskReplicaGroupResponse> failoverDiskReplicaGroup(FailoverDiskReplicaGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FailoverDiskReplicaGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FailoverDiskReplicaGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FailoverDiskReplicaGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   The replication pair for which you want to enable failover cannot be in the **Invalid** (`invalid`) or **Deleted** (`deleted`) state.
      * *   After a failover is performed, the replication pair enters the **Failovered** (`failovered`) state.
      *
     */
    @Override
    public CompletableFuture<FailoverDiskReplicaPairResponse> failoverDiskReplicaPair(FailoverDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FailoverDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FailoverDiskReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FailoverDiskReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDiskResponse> getDisk(GetDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Specify at least one of the following parameters or parameter pairs in a request to determine a query object:
      * *   `ResourceId.N`
      * *   `Tag.N` parameter pair (`Tag.N.Key` and `Tag.N.Value`)
      * If you set `Tag.N` and `ResourceId.N` at the same time, the EBS resources that match both the parameters are returned.
      *
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
      * You can call this operation to modify the information of a dedicated block storage cluster. The information includes the name and description of the cluster.
      *
     */
    @Override
    public CompletableFuture<ModifyDedicatedBlockStorageClusterAttributeResponse> modifyDedicatedBlockStorageClusterAttribute(ModifyDedicatedBlockStorageClusterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedBlockStorageClusterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedBlockStorageClusterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedBlockStorageClusterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   The replication pair-consistent group must be in the **Created** (`created`) or **Stopped** (`stopped`) state.
      *
     */
    @Override
    public CompletableFuture<ModifyDiskReplicaGroupResponse> modifyDiskReplicaGroup(ModifyDiskReplicaGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskReplicaGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskReplicaGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskReplicaGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   Only replication pairs that are in the **Created** (`created`) or **Stopped** (`stopped`) state can have their names or descriptions modified.
      *
     */
    @Override
    public CompletableFuture<ModifyDiskReplicaPairResponse> modifyDiskReplicaPair(ModifyDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Period is the time interval between data retrieval points. When set to 60 (minute interval), a maximum of 1440 data points can be returned; when set to 3600 (hour interval), a maximum of 744 data points can be returned; and when set to 86400 (day interval), a maximum of 366 data points can be returned.
      *
     */
    @Override
    public CompletableFuture<QueryDedicatedBlockStorageClusterInventoryDataResponse> queryDedicatedBlockStorageClusterInventoryData(QueryDedicatedBlockStorageClusterInventoryDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryDedicatedBlockStorageClusterInventoryData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDedicatedBlockStorageClusterInventoryDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDedicatedBlockStorageClusterInventoryDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   The replication pair-consistent group from which you want to remove a replication pair must be in the **Created** (`created`), **Stopped** (`stopped`), or **Invalid** (`invalid`) state.
      *
     */
    @Override
    public CompletableFuture<RemoveDiskReplicaPairResponse> removeDiskReplicaPair(RemoveDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveDiskReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveDiskReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   The replication pair-consistent group for which you want to enable reverse replication must be in the **Failovered** (`failovered`) state. You can call the `FailoverDiskReplicaPair` operation to enable failover.
      * *   Before a reverse replication is performed, the primary disks must be detached from its associated Elastic Compute Service (ECS) instance and must be in the Unattached state. You can call the [DetachDisk](~~25516~~) operation to detach the disks.
      * *   After you enable reverse replication, you must call the `StartDiskReplicaPair` operation again to enable the async replication feature before data can be replicated from the original secondary disks to the original primary disks.
      * *   You can set the ReverseReplicate parameter to false to cancel the **Failovered** (`failovered`) state and restore the original replication direction.
      *
     */
    @Override
    public CompletableFuture<ReprotectDiskReplicaGroupResponse> reprotectDiskReplicaGroup(ReprotectDiskReplicaGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReprotectDiskReplicaGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReprotectDiskReplicaGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReprotectDiskReplicaGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   The replication pair for which you want to enable reverse replication must be in the **Failovered** (`failovered`) state. You can call the [FailoverDiskReplicaPair](~~354358~~) operation to enable failover.
      * *   The primary disk must be detached from its associated Elastic Compute Service (ECS) instance and is in the Unattached state. You can call the [DetachDisk](~~25516~~) operation to detach the disk.
      * *   After you enable reverse replication, you must call the [StartDiskReplicaPair](~~354205~~) operation again to activate the replication pair before data can be replicated from the original secondary disk to the original primary disk.
      * *   You can set the ReverseReplicate parameter to false to cancel the **Failovered** (`failovered`) state and restore the original replication direction.
      *
     */
    @Override
    public CompletableFuture<ReprotectDiskReplicaPairResponse> reprotectDiskReplicaPair(ReprotectDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReprotectDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReprotectDiskReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReprotectDiskReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   If you set the `OneShot` to `false`, the replication pair-consistent group must be in the **Created** (`created` ), **Synchronizing** (`syncing` ), **Normal** (`normal` ), or **Stopped** (`stopped`) state.
      * *   If you set `OneShot` to `true`, the replication pair-consistent group must be in the **Created** (`created` ), **One-time Syncing** (`manual_syncing` ), or **Stopped** (`stopped`) state. The time interval between two consecutive one-time synchronizations must be longer than one half of the recovery point objective (RPO).
      * *   After a replication pair-consistent group is activated, the group enters the **Initial Syncing** (`initial_syncing`) state and the system performs the first async replication to replicate all data from the primary disks to secondary disks.
      *
     */
    @Override
    public CompletableFuture<StartDiskReplicaGroupResponse> startDiskReplicaGroup(StartDiskReplicaGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDiskReplicaGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDiskReplicaGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDiskReplicaGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   Only replication pairs that are in the **Created** (`created`) or **Stopped** (`stopped`) state can be activated.
      * *   After a replication pair is activated, it enters the **Initial Syncing** (`initial_syncing`) state and the system performs the first asynchronous replication to replicate all data from the primary disk to the secondary disk.
      *
     */
    @Override
    public CompletableFuture<StartDiskReplicaPairResponse> startDiskReplicaPair(StartDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartDiskReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartDiskReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After the disaster recovery drill is complete on the secondary disk, a pay-as-you-go drill disk that has the same capacity and category as the secondary disk is created in the zone where the secondary disk resides. The drill disk contains last-recovery-point data that can be used to test the completeness and correctness of applications.
      *
     */
    @Override
    public CompletableFuture<StartPairDrillResponse> startPairDrill(StartPairDrillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartPairDrill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartPairDrillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartPairDrillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After the disaster recovery drill is complete on secondary disks, a pay-as-you-go drill disk is created in the zone where the secondary disk of each replication pair resides. The latest-recovery-point data is restored to the drill disks to test the completeness and correctness of applications.
      *
     */
    @Override
    public CompletableFuture<StartReplicaGroupDrillResponse> startReplicaGroupDrill(StartReplicaGroupDrillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartReplicaGroupDrill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartReplicaGroupDrillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartReplicaGroupDrillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which the replication pair-consistent group feature is available, see [Overview](~~314563~~).
      * *   The replication pair-consistent group that you want to stop must be in the **One-time Syncing** (`manual_syncing`), **Syncing** (`syncing`), **Normal** (`normal`), **Stopping** (`stopping`), **Stop Failed** (`stop_failed`), or **Stopped** (`stopped`) state.
      * *   When a replication pair-consistent group is stopped, it enters the **Stopped** (`stopped`) state. If a replication pair-consistent group cannot be stopped, the state of the group remains unchanged or changes to **Stop Failed** (`stop_failed`). In this case, try again later.
      *
     */
    @Override
    public CompletableFuture<StopDiskReplicaGroupResponse> stopDiskReplicaGroup(StopDiskReplicaGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDiskReplicaGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDiskReplicaGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDiskReplicaGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   For information about the regions in which async replication is available, see [Overview](~~314563~~).
      * *   Only replication pairs that are in the **Initial Syncing** (`initial_syncing`), **Syncing** (`syncing`), **One-time Syncing** (`manual_syncing`), or **Normal** (`normal`) state can be stopped. When a replication pair is stopped, it enters the Stopped (`stopped`) state. The secondary disk rolls back to the point in time when the last async replication was complete and drops all the data that is being replicated from the primary disk.
      *
     */
    @Override
    public CompletableFuture<StopDiskReplicaPairResponse> stopDiskReplicaPair(StopDiskReplicaPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopDiskReplicaPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopDiskReplicaPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopDiskReplicaPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number of tags is reached, an error message is returned. For more information, see the "Tag limits" section in [Limits](~~25412~~).
      *
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

    @Override
    public CompletableFuture<UnbindEnterpriseSnapshotPolicyResponse> unbindEnterpriseSnapshotPolicy(UnbindEnterpriseSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindEnterpriseSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindEnterpriseSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindEnterpriseSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can remove up to 20 tags at a time.
      * *   After a tag is removed from an EBS resource, the tag is automatically deleted if the tag is not added to any instance.
      *
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

    @Override
    public CompletableFuture<UpdateEnterpriseSnapshotPolicyResponse> updateEnterpriseSnapshotPolicy(UpdateEnterpriseSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEnterpriseSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEnterpriseSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEnterpriseSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateSolutionInstanceAttributeResponse> updateSolutionInstanceAttribute(UpdateSolutionInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSolutionInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSolutionInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSolutionInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
