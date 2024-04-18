// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eas20210701.models.*;
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

    CompletableFuture<CloneServiceResponse> cloneService(CloneServiceRequest request);

    CompletableFuture<CommitServiceResponse> commitService(CommitServiceRequest request);

    CompletableFuture<CreateAppServiceResponse> createAppService(CreateAppServiceRequest request);

    CompletableFuture<CreateBenchmarkTaskResponse> createBenchmarkTask(CreateBenchmarkTaskRequest request);

    CompletableFuture<CreateGatewayResponse> createGateway(CreateGatewayRequest request);

    CompletableFuture<CreateGatewayIntranetLinkedVpcResponse> createGatewayIntranetLinkedVpc(CreateGatewayIntranetLinkedVpcRequest request);

    /**
      * **Before you call this operation, make sure that you are familiar with the [billing](~~144261~~) of Elastic Algorithm Service (EAS).
      *
     */
    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    CompletableFuture<CreateResourceInstancesResponse> createResourceInstances(CreateResourceInstancesRequest request);

    CompletableFuture<CreateResourceLogResponse> createResourceLog(CreateResourceLogRequest request);

    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    CompletableFuture<CreateServiceAutoScalerResponse> createServiceAutoScaler(CreateServiceAutoScalerRequest request);

    CompletableFuture<CreateServiceCronScalerResponse> createServiceCronScaler(CreateServiceCronScalerRequest request);

    CompletableFuture<CreateServiceMirrorResponse> createServiceMirror(CreateServiceMirrorRequest request);

    CompletableFuture<DeleteBenchmarkTaskResponse> deleteBenchmarkTask(DeleteBenchmarkTaskRequest request);

    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    CompletableFuture<DeleteGatewayIntranetLinkedVpcResponse> deleteGatewayIntranetLinkedVpc(DeleteGatewayIntranetLinkedVpcRequest request);

    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    CompletableFuture<DeleteResourceDLinkResponse> deleteResourceDLink(DeleteResourceDLinkRequest request);

    CompletableFuture<DeleteResourceInstancesResponse> deleteResourceInstances(DeleteResourceInstancesRequest request);

    CompletableFuture<DeleteResourceLogResponse> deleteResourceLog(DeleteResourceLogRequest request);

    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    CompletableFuture<DeleteServiceAutoScalerResponse> deleteServiceAutoScaler(DeleteServiceAutoScalerRequest request);

    CompletableFuture<DeleteServiceCronScalerResponse> deleteServiceCronScaler(DeleteServiceCronScalerRequest request);

    CompletableFuture<DeleteServiceInstancesResponse> deleteServiceInstances(DeleteServiceInstancesRequest request);

    CompletableFuture<DeleteServiceLabelResponse> deleteServiceLabel(DeleteServiceLabelRequest request);

    CompletableFuture<DeleteServiceMirrorResponse> deleteServiceMirror(DeleteServiceMirrorRequest request);

    CompletableFuture<DescribeBenchmarkTaskResponse> describeBenchmarkTask(DescribeBenchmarkTaskRequest request);

    CompletableFuture<DescribeBenchmarkTaskReportResponse> describeBenchmarkTaskReport(DescribeBenchmarkTaskReportRequest request);

    CompletableFuture<DescribeGatewayResponse> describeGateway(DescribeGatewayRequest request);

    CompletableFuture<DescribeGroupResponse> describeGroup(DescribeGroupRequest request);

    CompletableFuture<DescribeResourceResponse> describeResource(DescribeResourceRequest request);

    CompletableFuture<DescribeResourceDLinkResponse> describeResourceDLink(DescribeResourceDLinkRequest request);

    CompletableFuture<DescribeResourceLogResponse> describeResourceLog(DescribeResourceLogRequest request);

    CompletableFuture<DescribeServiceResponse> describeService(DescribeServiceRequest request);

    CompletableFuture<DescribeServiceAutoScalerResponse> describeServiceAutoScaler(DescribeServiceAutoScalerRequest request);

    CompletableFuture<DescribeServiceCronScalerResponse> describeServiceCronScaler(DescribeServiceCronScalerRequest request);

    CompletableFuture<DescribeServiceDiagnosisResponse> describeServiceDiagnosis(DescribeServiceDiagnosisRequest request);

    CompletableFuture<DescribeServiceEventResponse> describeServiceEvent(DescribeServiceEventRequest request);

    CompletableFuture<DescribeServiceInstanceDiagnosisResponse> describeServiceInstanceDiagnosis(DescribeServiceInstanceDiagnosisRequest request);

    CompletableFuture<DescribeServiceLogResponse> describeServiceLog(DescribeServiceLogRequest request);

    CompletableFuture<DescribeServiceMirrorResponse> describeServiceMirror(DescribeServiceMirrorRequest request);

    CompletableFuture<DescribeSpotDiscountHistoryResponse> describeSpotDiscountHistory(DescribeSpotDiscountHistoryRequest request);

    CompletableFuture<DevelopServiceResponse> developService(DevelopServiceRequest request);

    CompletableFuture<ListBenchmarkTaskResponse> listBenchmarkTask(ListBenchmarkTaskRequest request);

    CompletableFuture<ListGatewayIntranetLinkedVpcResponse> listGatewayIntranetLinkedVpc(ListGatewayIntranetLinkedVpcRequest request);

    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    CompletableFuture<ListResourceInstanceWorkerResponse> listResourceInstanceWorker(ListResourceInstanceWorkerRequest request);

    CompletableFuture<ListResourceInstancesResponse> listResourceInstances(ListResourceInstancesRequest request);

    CompletableFuture<ListResourceServicesResponse> listResourceServices(ListResourceServicesRequest request);

    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    CompletableFuture<ListServiceContainersResponse> listServiceContainers(ListServiceContainersRequest request);

    CompletableFuture<ListServiceInstancesResponse> listServiceInstances(ListServiceInstancesRequest request);

    CompletableFuture<ListServiceVersionsResponse> listServiceVersions(ListServiceVersionsRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<ReleaseServiceResponse> releaseService(ReleaseServiceRequest request);

    CompletableFuture<RestartServiceResponse> restartService(RestartServiceRequest request);

    CompletableFuture<StartBenchmarkTaskResponse> startBenchmarkTask(StartBenchmarkTaskRequest request);

    CompletableFuture<StartServiceResponse> startService(StartServiceRequest request);

    CompletableFuture<StopBenchmarkTaskResponse> stopBenchmarkTask(StopBenchmarkTaskRequest request);

    CompletableFuture<StopServiceResponse> stopService(StopServiceRequest request);

    CompletableFuture<UpdateAppServiceResponse> updateAppService(UpdateAppServiceRequest request);

    CompletableFuture<UpdateBenchmarkTaskResponse> updateBenchmarkTask(UpdateBenchmarkTaskRequest request);

    CompletableFuture<UpdateGatewayResponse> updateGateway(UpdateGatewayRequest request);

    CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request);

    CompletableFuture<UpdateResourceDLinkResponse> updateResourceDLink(UpdateResourceDLinkRequest request);

    CompletableFuture<UpdateResourceInstanceResponse> updateResourceInstance(UpdateResourceInstanceRequest request);

    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    CompletableFuture<UpdateServiceAutoScalerResponse> updateServiceAutoScaler(UpdateServiceAutoScalerRequest request);

    CompletableFuture<UpdateServiceCronScalerResponse> updateServiceCronScaler(UpdateServiceCronScalerRequest request);

    CompletableFuture<UpdateServiceInstanceResponse> updateServiceInstance(UpdateServiceInstanceRequest request);

    CompletableFuture<UpdateServiceLabelResponse> updateServiceLabel(UpdateServiceLabelRequest request);

    CompletableFuture<UpdateServiceMirrorResponse> updateServiceMirror(UpdateServiceMirrorRequest request);

    CompletableFuture<UpdateServiceSafetyLockResponse> updateServiceSafetyLock(UpdateServiceSafetyLockRequest request);

    CompletableFuture<UpdateServiceVersionResponse> updateServiceVersion(UpdateServiceVersionRequest request);

}
