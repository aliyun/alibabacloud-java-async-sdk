// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.eas20210701.models.*;
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

    CompletableFuture<CreateBenchmarkTaskResponse> createBenchmarkTask(CreateBenchmarkTaskRequest request);

    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    CompletableFuture<CreateResourceInstancesResponse> createResourceInstances(CreateResourceInstancesRequest request);

    CompletableFuture<CreateResourceLogResponse> createResourceLog(CreateResourceLogRequest request);

    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    CompletableFuture<CreateServiceAutoScalerResponse> createServiceAutoScaler(CreateServiceAutoScalerRequest request);

    CompletableFuture<CreateServiceCronScalerResponse> createServiceCronScaler(CreateServiceCronScalerRequest request);

    CompletableFuture<CreateServiceMirrorResponse> createServiceMirror(CreateServiceMirrorRequest request);

    CompletableFuture<CreateStressResponse> createStress(CreateStressRequest request);

    CompletableFuture<DeleteBenchmarkTaskResponse> deleteBenchmarkTask(DeleteBenchmarkTaskRequest request);

    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    CompletableFuture<DeleteResourceDLinkResponse> deleteResourceDLink(DeleteResourceDLinkRequest request);

    CompletableFuture<DeleteResourceInstancesResponse> deleteResourceInstances(DeleteResourceInstancesRequest request);

    CompletableFuture<DeleteResourceLogResponse> deleteResourceLog(DeleteResourceLogRequest request);

    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    CompletableFuture<DeleteServiceAutoScalerResponse> deleteServiceAutoScaler(DeleteServiceAutoScalerRequest request);

    CompletableFuture<DeleteServiceCronScalerResponse> deleteServiceCronScaler(DeleteServiceCronScalerRequest request);

    CompletableFuture<DeleteServiceInstancesResponse> deleteServiceInstances(DeleteServiceInstancesRequest request);

    CompletableFuture<DeleteServiceMirrorResponse> deleteServiceMirror(DeleteServiceMirrorRequest request);

    CompletableFuture<DeleteStressResponse> deleteStress(DeleteStressRequest request);

    CompletableFuture<DescribeBenchmarkTaskResponse> describeBenchmarkTask(DescribeBenchmarkTaskRequest request);

    CompletableFuture<DescribeBenchmarkTaskReportResponse> describeBenchmarkTaskReport(DescribeBenchmarkTaskReportRequest request);

    CompletableFuture<DescribeResourceResponse> describeResource(DescribeResourceRequest request);

    CompletableFuture<DescribeResourceDLinkResponse> describeResourceDLink(DescribeResourceDLinkRequest request);

    CompletableFuture<DescribeResourceLogResponse> describeResourceLog(DescribeResourceLogRequest request);

    CompletableFuture<DescribeServiceResponse> describeService(DescribeServiceRequest request);

    CompletableFuture<DescribeServiceAutoScalerResponse> describeServiceAutoScaler(DescribeServiceAutoScalerRequest request);

    CompletableFuture<DescribeServiceCronScalerResponse> describeServiceCronScaler(DescribeServiceCronScalerRequest request);

    CompletableFuture<DescribeServiceLogResponse> describeServiceLog(DescribeServiceLogRequest request);

    CompletableFuture<DescribeServiceMirrorResponse> describeServiceMirror(DescribeServiceMirrorRequest request);

    CompletableFuture<DescribeStressResponse> describeStress(DescribeStressRequest request);

    CompletableFuture<ListBenchmarkTaskResponse> listBenchmarkTask(ListBenchmarkTaskRequest request);

    CompletableFuture<ListResourceInstanceWorkerResponse> listResourceInstanceWorker(ListResourceInstanceWorkerRequest request);

    CompletableFuture<ListResourceInstancesResponse> listResourceInstances(ListResourceInstancesRequest request);

    CompletableFuture<ListResourceServicesResponse> listResourceServices(ListResourceServicesRequest request);

    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    CompletableFuture<ListServiceInstancesResponse> listServiceInstances(ListServiceInstancesRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<ListStressesResponse> listStresses(ListStressesRequest request);

    CompletableFuture<ReleaseServiceResponse> releaseService(ReleaseServiceRequest request);

    CompletableFuture<ReportStressResponse> reportStress(ReportStressRequest request);

    CompletableFuture<StartBenchmarkTaskResponse> startBenchmarkTask(StartBenchmarkTaskRequest request);

    CompletableFuture<StartServiceResponse> startService(StartServiceRequest request);

    CompletableFuture<StartStressResponse> startStress(StartStressRequest request);

    CompletableFuture<StopBenchmarkTaskResponse> stopBenchmarkTask(StopBenchmarkTaskRequest request);

    CompletableFuture<StopServiceResponse> stopService(StopServiceRequest request);

    CompletableFuture<StopStressResponse> stopStress(StopStressRequest request);

    CompletableFuture<UpdateBenchmarkTaskResponse> updateBenchmarkTask(UpdateBenchmarkTaskRequest request);

    CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request);

    CompletableFuture<UpdateResourceDLinkResponse> updateResourceDLink(UpdateResourceDLinkRequest request);

    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    CompletableFuture<UpdateServiceAutoScalerResponse> updateServiceAutoScaler(UpdateServiceAutoScalerRequest request);

    CompletableFuture<UpdateServiceCronScalerResponse> updateServiceCronScaler(UpdateServiceCronScalerRequest request);

    CompletableFuture<UpdateServiceMirrorResponse> updateServiceMirror(UpdateServiceMirrorRequest request);

    CompletableFuture<UpdateServiceVersionResponse> updateServiceVersion(UpdateServiceVersionRequest request);

    CompletableFuture<UpdateStressResponse> updateStress(UpdateStressRequest request);

}
