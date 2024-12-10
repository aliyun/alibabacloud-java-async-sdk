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

    /**
     * @param request the request parameters of AttachGatewayDomain  AttachGatewayDomainRequest
     * @return AttachGatewayDomainResponse
     */
    CompletableFuture<AttachGatewayDomainResponse> attachGatewayDomain(AttachGatewayDomainRequest request);

    /**
     * @param request the request parameters of CloneService  CloneServiceRequest
     * @return CloneServiceResponse
     */
    CompletableFuture<CloneServiceResponse> cloneService(CloneServiceRequest request);

    /**
     * @param request the request parameters of CommitService  CommitServiceRequest
     * @return CommitServiceResponse
     */
    CompletableFuture<CommitServiceResponse> commitService(CommitServiceRequest request);

    /**
     * @param request the request parameters of CreateAclPolicy  CreateAclPolicyRequest
     * @return CreateAclPolicyResponse
     */
    CompletableFuture<CreateAclPolicyResponse> createAclPolicy(CreateAclPolicyRequest request);

    /**
     * @param request the request parameters of CreateAppService  CreateAppServiceRequest
     * @return CreateAppServiceResponse
     */
    CompletableFuture<CreateAppServiceResponse> createAppService(CreateAppServiceRequest request);

    /**
     * @param request the request parameters of CreateBenchmarkTask  CreateBenchmarkTaskRequest
     * @return CreateBenchmarkTaskResponse
     */
    CompletableFuture<CreateBenchmarkTaskResponse> createBenchmarkTask(CreateBenchmarkTaskRequest request);

    /**
     * @param request the request parameters of CreateGateway  CreateGatewayRequest
     * @return CreateGatewayResponse
     */
    CompletableFuture<CreateGatewayResponse> createGateway(CreateGatewayRequest request);

    /**
     * @param request the request parameters of CreateGatewayIntranetLinkedVpc  CreateGatewayIntranetLinkedVpcRequest
     * @return CreateGatewayIntranetLinkedVpcResponse
     */
    CompletableFuture<CreateGatewayIntranetLinkedVpcResponse> createGatewayIntranetLinkedVpc(CreateGatewayIntranetLinkedVpcRequest request);

    /**
     * @param request the request parameters of CreateGatewayIntranetLinkedVpcPeer  CreateGatewayIntranetLinkedVpcPeerRequest
     * @return CreateGatewayIntranetLinkedVpcPeerResponse
     */
    CompletableFuture<CreateGatewayIntranetLinkedVpcPeerResponse> createGatewayIntranetLinkedVpcPeer(CreateGatewayIntranetLinkedVpcPeerRequest request);

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/144261.html">billing</a> of Elastic Algorithm Service (EAS).</p>
     * 
     * @param request the request parameters of CreateResource  CreateResourceRequest
     * @return CreateResourceResponse
     */
    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    /**
     * @param request the request parameters of CreateResourceInstances  CreateResourceInstancesRequest
     * @return CreateResourceInstancesResponse
     */
    CompletableFuture<CreateResourceInstancesResponse> createResourceInstances(CreateResourceInstancesRequest request);

    /**
     * @param request the request parameters of CreateResourceLog  CreateResourceLogRequest
     * @return CreateResourceLogResponse
     */
    CompletableFuture<CreateResourceLogResponse> createResourceLog(CreateResourceLogRequest request);

    /**
     * <b>description</b> :
     * <p>*Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/144261.html">billing</a> of Elastic Algorithm Service (EAS).</p>
     * 
     * @param request the request parameters of CreateService  CreateServiceRequest
     * @return CreateServiceResponse
     */
    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    /**
     * @param request the request parameters of CreateServiceAutoScaler  CreateServiceAutoScalerRequest
     * @return CreateServiceAutoScalerResponse
     */
    CompletableFuture<CreateServiceAutoScalerResponse> createServiceAutoScaler(CreateServiceAutoScalerRequest request);

    /**
     * @param request the request parameters of CreateServiceCronScaler  CreateServiceCronScalerRequest
     * @return CreateServiceCronScalerResponse
     */
    CompletableFuture<CreateServiceCronScalerResponse> createServiceCronScaler(CreateServiceCronScalerRequest request);

    /**
     * @param request the request parameters of CreateServiceMirror  CreateServiceMirrorRequest
     * @return CreateServiceMirrorResponse
     */
    CompletableFuture<CreateServiceMirrorResponse> createServiceMirror(CreateServiceMirrorRequest request);

    /**
     * @param request the request parameters of CreateVirtualResource  CreateVirtualResourceRequest
     * @return CreateVirtualResourceResponse
     */
    CompletableFuture<CreateVirtualResourceResponse> createVirtualResource(CreateVirtualResourceRequest request);

    /**
     * @param request the request parameters of DeleteAclPolicy  DeleteAclPolicyRequest
     * @return DeleteAclPolicyResponse
     */
    CompletableFuture<DeleteAclPolicyResponse> deleteAclPolicy(DeleteAclPolicyRequest request);

    /**
     * @param request the request parameters of DeleteBenchmarkTask  DeleteBenchmarkTaskRequest
     * @return DeleteBenchmarkTaskResponse
     */
    CompletableFuture<DeleteBenchmarkTaskResponse> deleteBenchmarkTask(DeleteBenchmarkTaskRequest request);

    /**
     * @param request the request parameters of DeleteGateway  DeleteGatewayRequest
     * @return DeleteGatewayResponse
     */
    CompletableFuture<DeleteGatewayResponse> deleteGateway(DeleteGatewayRequest request);

    /**
     * @param request the request parameters of DeleteGatewayIntranetLinkedVpc  DeleteGatewayIntranetLinkedVpcRequest
     * @return DeleteGatewayIntranetLinkedVpcResponse
     */
    CompletableFuture<DeleteGatewayIntranetLinkedVpcResponse> deleteGatewayIntranetLinkedVpc(DeleteGatewayIntranetLinkedVpcRequest request);

    /**
     * @param request the request parameters of DeleteGatewayIntranetLinkedVpcPeer  DeleteGatewayIntranetLinkedVpcPeerRequest
     * @return DeleteGatewayIntranetLinkedVpcPeerResponse
     */
    CompletableFuture<DeleteGatewayIntranetLinkedVpcPeerResponse> deleteGatewayIntranetLinkedVpcPeer(DeleteGatewayIntranetLinkedVpcPeerRequest request);

    /**
     * @param request the request parameters of DeleteResource  DeleteResourceRequest
     * @return DeleteResourceResponse
     */
    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    /**
     * @param request the request parameters of DeleteResourceDLink  DeleteResourceDLinkRequest
     * @return DeleteResourceDLinkResponse
     */
    CompletableFuture<DeleteResourceDLinkResponse> deleteResourceDLink(DeleteResourceDLinkRequest request);

    /**
     * @param request the request parameters of DeleteResourceInstances  DeleteResourceInstancesRequest
     * @return DeleteResourceInstancesResponse
     */
    CompletableFuture<DeleteResourceInstancesResponse> deleteResourceInstances(DeleteResourceInstancesRequest request);

    /**
     * @param request the request parameters of DeleteResourceLog  DeleteResourceLogRequest
     * @return DeleteResourceLogResponse
     */
    CompletableFuture<DeleteResourceLogResponse> deleteResourceLog(DeleteResourceLogRequest request);

    /**
     * @param request the request parameters of DeleteService  DeleteServiceRequest
     * @return DeleteServiceResponse
     */
    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    /**
     * @param request the request parameters of DeleteServiceAutoScaler  DeleteServiceAutoScalerRequest
     * @return DeleteServiceAutoScalerResponse
     */
    CompletableFuture<DeleteServiceAutoScalerResponse> deleteServiceAutoScaler(DeleteServiceAutoScalerRequest request);

    /**
     * @param request the request parameters of DeleteServiceCronScaler  DeleteServiceCronScalerRequest
     * @return DeleteServiceCronScalerResponse
     */
    CompletableFuture<DeleteServiceCronScalerResponse> deleteServiceCronScaler(DeleteServiceCronScalerRequest request);

    /**
     * @param request the request parameters of DeleteServiceInstances  DeleteServiceInstancesRequest
     * @return DeleteServiceInstancesResponse
     */
    CompletableFuture<DeleteServiceInstancesResponse> deleteServiceInstances(DeleteServiceInstancesRequest request);

    /**
     * @param request the request parameters of DeleteServiceLabel  DeleteServiceLabelRequest
     * @return DeleteServiceLabelResponse
     */
    CompletableFuture<DeleteServiceLabelResponse> deleteServiceLabel(DeleteServiceLabelRequest request);

    /**
     * @param request the request parameters of DeleteServiceMirror  DeleteServiceMirrorRequest
     * @return DeleteServiceMirrorResponse
     */
    CompletableFuture<DeleteServiceMirrorResponse> deleteServiceMirror(DeleteServiceMirrorRequest request);

    /**
     * @param request the request parameters of DeleteVirtualResource  DeleteVirtualResourceRequest
     * @return DeleteVirtualResourceResponse
     */
    CompletableFuture<DeleteVirtualResourceResponse> deleteVirtualResource(DeleteVirtualResourceRequest request);

    /**
     * @param request the request parameters of DescribeBenchmarkTask  DescribeBenchmarkTaskRequest
     * @return DescribeBenchmarkTaskResponse
     */
    CompletableFuture<DescribeBenchmarkTaskResponse> describeBenchmarkTask(DescribeBenchmarkTaskRequest request);

    /**
     * @param request the request parameters of DescribeBenchmarkTaskReport  DescribeBenchmarkTaskReportRequest
     * @return DescribeBenchmarkTaskReportResponse
     */
    CompletableFuture<DescribeBenchmarkTaskReportResponse> describeBenchmarkTaskReport(DescribeBenchmarkTaskReportRequest request);

    /**
     * @param request the request parameters of DescribeGateway  DescribeGatewayRequest
     * @return DescribeGatewayResponse
     */
    CompletableFuture<DescribeGatewayResponse> describeGateway(DescribeGatewayRequest request);

    /**
     * @param request the request parameters of DescribeGroup  DescribeGroupRequest
     * @return DescribeGroupResponse
     */
    CompletableFuture<DescribeGroupResponse> describeGroup(DescribeGroupRequest request);

    /**
     * @param request the request parameters of DescribeResource  DescribeResourceRequest
     * @return DescribeResourceResponse
     */
    CompletableFuture<DescribeResourceResponse> describeResource(DescribeResourceRequest request);

    /**
     * @param request the request parameters of DescribeResourceDLink  DescribeResourceDLinkRequest
     * @return DescribeResourceDLinkResponse
     */
    CompletableFuture<DescribeResourceDLinkResponse> describeResourceDLink(DescribeResourceDLinkRequest request);

    /**
     * @param request the request parameters of DescribeResourceLog  DescribeResourceLogRequest
     * @return DescribeResourceLogResponse
     */
    CompletableFuture<DescribeResourceLogResponse> describeResourceLog(DescribeResourceLogRequest request);

    /**
     * @param request the request parameters of DescribeService  DescribeServiceRequest
     * @return DescribeServiceResponse
     */
    CompletableFuture<DescribeServiceResponse> describeService(DescribeServiceRequest request);

    /**
     * @param request the request parameters of DescribeServiceAutoScaler  DescribeServiceAutoScalerRequest
     * @return DescribeServiceAutoScalerResponse
     */
    CompletableFuture<DescribeServiceAutoScalerResponse> describeServiceAutoScaler(DescribeServiceAutoScalerRequest request);

    /**
     * @param request the request parameters of DescribeServiceCronScaler  DescribeServiceCronScalerRequest
     * @return DescribeServiceCronScalerResponse
     */
    CompletableFuture<DescribeServiceCronScalerResponse> describeServiceCronScaler(DescribeServiceCronScalerRequest request);

    /**
     * @param request the request parameters of DescribeServiceDiagnosis  DescribeServiceDiagnosisRequest
     * @return DescribeServiceDiagnosisResponse
     */
    CompletableFuture<DescribeServiceDiagnosisResponse> describeServiceDiagnosis(DescribeServiceDiagnosisRequest request);

    /**
     * @param request the request parameters of DescribeServiceEvent  DescribeServiceEventRequest
     * @return DescribeServiceEventResponse
     */
    CompletableFuture<DescribeServiceEventResponse> describeServiceEvent(DescribeServiceEventRequest request);

    /**
     * @param request the request parameters of DescribeServiceInstanceDiagnosis  DescribeServiceInstanceDiagnosisRequest
     * @return DescribeServiceInstanceDiagnosisResponse
     */
    CompletableFuture<DescribeServiceInstanceDiagnosisResponse> describeServiceInstanceDiagnosis(DescribeServiceInstanceDiagnosisRequest request);

    /**
     * @param request the request parameters of DescribeServiceLog  DescribeServiceLogRequest
     * @return DescribeServiceLogResponse
     */
    CompletableFuture<DescribeServiceLogResponse> describeServiceLog(DescribeServiceLogRequest request);

    /**
     * @param request the request parameters of DescribeServiceMirror  DescribeServiceMirrorRequest
     * @return DescribeServiceMirrorResponse
     */
    CompletableFuture<DescribeServiceMirrorResponse> describeServiceMirror(DescribeServiceMirrorRequest request);

    /**
     * @param request the request parameters of DescribeSpotDiscountHistory  DescribeSpotDiscountHistoryRequest
     * @return DescribeSpotDiscountHistoryResponse
     */
    CompletableFuture<DescribeSpotDiscountHistoryResponse> describeSpotDiscountHistory(DescribeSpotDiscountHistoryRequest request);

    /**
     * @param request the request parameters of DescribeVirtualResource  DescribeVirtualResourceRequest
     * @return DescribeVirtualResourceResponse
     */
    CompletableFuture<DescribeVirtualResourceResponse> describeVirtualResource(DescribeVirtualResourceRequest request);

    /**
     * @param request the request parameters of DetachGatewayDomain  DetachGatewayDomainRequest
     * @return DetachGatewayDomainResponse
     */
    CompletableFuture<DetachGatewayDomainResponse> detachGatewayDomain(DetachGatewayDomainRequest request);

    /**
     * @param request the request parameters of DevelopService  DevelopServiceRequest
     * @return DevelopServiceResponse
     */
    CompletableFuture<DevelopServiceResponse> developService(DevelopServiceRequest request);

    /**
     * @param request the request parameters of ListAclPolicy  ListAclPolicyRequest
     * @return ListAclPolicyResponse
     */
    CompletableFuture<ListAclPolicyResponse> listAclPolicy(ListAclPolicyRequest request);

    /**
     * @param request the request parameters of ListBenchmarkTask  ListBenchmarkTaskRequest
     * @return ListBenchmarkTaskResponse
     */
    CompletableFuture<ListBenchmarkTaskResponse> listBenchmarkTask(ListBenchmarkTaskRequest request);

    /**
     * @param request the request parameters of ListGateway  ListGatewayRequest
     * @return ListGatewayResponse
     */
    CompletableFuture<ListGatewayResponse> listGateway(ListGatewayRequest request);

    /**
     * @param request the request parameters of ListGatewayDomains  ListGatewayDomainsRequest
     * @return ListGatewayDomainsResponse
     */
    CompletableFuture<ListGatewayDomainsResponse> listGatewayDomains(ListGatewayDomainsRequest request);

    /**
     * @param request the request parameters of ListGatewayIntranetLinkedVpc  ListGatewayIntranetLinkedVpcRequest
     * @return ListGatewayIntranetLinkedVpcResponse
     */
    CompletableFuture<ListGatewayIntranetLinkedVpcResponse> listGatewayIntranetLinkedVpc(ListGatewayIntranetLinkedVpcRequest request);

    /**
     * @param request the request parameters of ListGatewayIntranetLinkedVpcPeer  ListGatewayIntranetLinkedVpcPeerRequest
     * @return ListGatewayIntranetLinkedVpcPeerResponse
     */
    CompletableFuture<ListGatewayIntranetLinkedVpcPeerResponse> listGatewayIntranetLinkedVpcPeer(ListGatewayIntranetLinkedVpcPeerRequest request);

    /**
     * @param request the request parameters of ListGatewayIntranetSupportedZone  ListGatewayIntranetSupportedZoneRequest
     * @return ListGatewayIntranetSupportedZoneResponse
     */
    CompletableFuture<ListGatewayIntranetSupportedZoneResponse> listGatewayIntranetSupportedZone(ListGatewayIntranetSupportedZoneRequest request);

    /**
     * @param request the request parameters of ListGroups  ListGroupsRequest
     * @return ListGroupsResponse
     */
    CompletableFuture<ListGroupsResponse> listGroups(ListGroupsRequest request);

    /**
     * @param request the request parameters of ListResourceInstanceWorker  ListResourceInstanceWorkerRequest
     * @return ListResourceInstanceWorkerResponse
     */
    CompletableFuture<ListResourceInstanceWorkerResponse> listResourceInstanceWorker(ListResourceInstanceWorkerRequest request);

    /**
     * @param request the request parameters of ListResourceInstances  ListResourceInstancesRequest
     * @return ListResourceInstancesResponse
     */
    CompletableFuture<ListResourceInstancesResponse> listResourceInstances(ListResourceInstancesRequest request);

    /**
     * @deprecated OpenAPI ListResourceServices is deprecated, please use eas::2021-07-01::ListServices instead.  * @param request  the request parameters of ListResourceServices  ListResourceServicesRequest
     * @return ListResourceServicesResponse
     */
    @Deprecated
    CompletableFuture<ListResourceServicesResponse> listResourceServices(ListResourceServicesRequest request);

    /**
     * @param request the request parameters of ListResources  ListResourcesRequest
     * @return ListResourcesResponse
     */
    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    /**
     * @param request the request parameters of ListServiceContainers  ListServiceContainersRequest
     * @return ListServiceContainersResponse
     */
    CompletableFuture<ListServiceContainersResponse> listServiceContainers(ListServiceContainersRequest request);

    /**
     * @param request the request parameters of ListServiceInstances  ListServiceInstancesRequest
     * @return ListServiceInstancesResponse
     */
    CompletableFuture<ListServiceInstancesResponse> listServiceInstances(ListServiceInstancesRequest request);

    /**
     * @param request the request parameters of ListServiceVersions  ListServiceVersionsRequest
     * @return ListServiceVersionsResponse
     */
    CompletableFuture<ListServiceVersionsResponse> listServiceVersions(ListServiceVersionsRequest request);

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    /**
     * @param request the request parameters of ListTenantAddons  ListTenantAddonsRequest
     * @return ListTenantAddonsResponse
     */
    CompletableFuture<ListTenantAddonsResponse> listTenantAddons(ListTenantAddonsRequest request);

    /**
     * @param request the request parameters of ListVirtualResource  ListVirtualResourceRequest
     * @return ListVirtualResourceResponse
     */
    CompletableFuture<ListVirtualResourceResponse> listVirtualResource(ListVirtualResourceRequest request);

    /**
     * @param request the request parameters of ReinstallTenantAddon  ReinstallTenantAddonRequest
     * @return ReinstallTenantAddonResponse
     */
    CompletableFuture<ReinstallTenantAddonResponse> reinstallTenantAddon(ReinstallTenantAddonRequest request);

    /**
     * @param request the request parameters of ReleaseService  ReleaseServiceRequest
     * @return ReleaseServiceResponse
     */
    CompletableFuture<ReleaseServiceResponse> releaseService(ReleaseServiceRequest request);

    /**
     * @param request the request parameters of RestartService  RestartServiceRequest
     * @return RestartServiceResponse
     */
    CompletableFuture<RestartServiceResponse> restartService(RestartServiceRequest request);

    /**
     * @param request the request parameters of StartBenchmarkTask  StartBenchmarkTaskRequest
     * @return StartBenchmarkTaskResponse
     */
    CompletableFuture<StartBenchmarkTaskResponse> startBenchmarkTask(StartBenchmarkTaskRequest request);

    /**
     * @param request the request parameters of StartService  StartServiceRequest
     * @return StartServiceResponse
     */
    CompletableFuture<StartServiceResponse> startService(StartServiceRequest request);

    /**
     * @param request the request parameters of StopBenchmarkTask  StopBenchmarkTaskRequest
     * @return StopBenchmarkTaskResponse
     */
    CompletableFuture<StopBenchmarkTaskResponse> stopBenchmarkTask(StopBenchmarkTaskRequest request);

    /**
     * @param request the request parameters of StopService  StopServiceRequest
     * @return StopServiceResponse
     */
    CompletableFuture<StopServiceResponse> stopService(StopServiceRequest request);

    /**
     * @param request the request parameters of UpdateAppService  UpdateAppServiceRequest
     * @return UpdateAppServiceResponse
     */
    CompletableFuture<UpdateAppServiceResponse> updateAppService(UpdateAppServiceRequest request);

    /**
     * @param request the request parameters of UpdateBenchmarkTask  UpdateBenchmarkTaskRequest
     * @return UpdateBenchmarkTaskResponse
     */
    CompletableFuture<UpdateBenchmarkTaskResponse> updateBenchmarkTask(UpdateBenchmarkTaskRequest request);

    /**
     * @param request the request parameters of UpdateGateway  UpdateGatewayRequest
     * @return UpdateGatewayResponse
     */
    CompletableFuture<UpdateGatewayResponse> updateGateway(UpdateGatewayRequest request);

    /**
     * @param request the request parameters of UpdateResource  UpdateResourceRequest
     * @return UpdateResourceResponse
     */
    CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request);

    /**
     * @param request the request parameters of UpdateResourceDLink  UpdateResourceDLinkRequest
     * @return UpdateResourceDLinkResponse
     */
    CompletableFuture<UpdateResourceDLinkResponse> updateResourceDLink(UpdateResourceDLinkRequest request);

    /**
     * @param request the request parameters of UpdateResourceInstance  UpdateResourceInstanceRequest
     * @return UpdateResourceInstanceResponse
     */
    CompletableFuture<UpdateResourceInstanceResponse> updateResourceInstance(UpdateResourceInstanceRequest request);

    /**
     * @param request the request parameters of UpdateService  UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    /**
     * @param request the request parameters of UpdateServiceAutoScaler  UpdateServiceAutoScalerRequest
     * @return UpdateServiceAutoScalerResponse
     */
    CompletableFuture<UpdateServiceAutoScalerResponse> updateServiceAutoScaler(UpdateServiceAutoScalerRequest request);

    /**
     * @param request the request parameters of UpdateServiceCronScaler  UpdateServiceCronScalerRequest
     * @return UpdateServiceCronScalerResponse
     */
    CompletableFuture<UpdateServiceCronScalerResponse> updateServiceCronScaler(UpdateServiceCronScalerRequest request);

    /**
     * @param request the request parameters of UpdateServiceInstance  UpdateServiceInstanceRequest
     * @return UpdateServiceInstanceResponse
     */
    CompletableFuture<UpdateServiceInstanceResponse> updateServiceInstance(UpdateServiceInstanceRequest request);

    /**
     * @param request the request parameters of UpdateServiceLabel  UpdateServiceLabelRequest
     * @return UpdateServiceLabelResponse
     */
    CompletableFuture<UpdateServiceLabelResponse> updateServiceLabel(UpdateServiceLabelRequest request);

    /**
     * @param request the request parameters of UpdateServiceMirror  UpdateServiceMirrorRequest
     * @return UpdateServiceMirrorResponse
     */
    CompletableFuture<UpdateServiceMirrorResponse> updateServiceMirror(UpdateServiceMirrorRequest request);

    /**
     * @param request the request parameters of UpdateServiceSafetyLock  UpdateServiceSafetyLockRequest
     * @return UpdateServiceSafetyLockResponse
     */
    CompletableFuture<UpdateServiceSafetyLockResponse> updateServiceSafetyLock(UpdateServiceSafetyLockRequest request);

    /**
     * @param request the request parameters of UpdateServiceVersion  UpdateServiceVersionRequest
     * @return UpdateServiceVersionResponse
     */
    CompletableFuture<UpdateServiceVersionResponse> updateServiceVersion(UpdateServiceVersionRequest request);

    /**
     * @param request the request parameters of UpdateVirtualResource  UpdateVirtualResourceRequest
     * @return UpdateVirtualResourceResponse
     */
    CompletableFuture<UpdateVirtualResourceResponse> updateVirtualResource(UpdateVirtualResourceRequest request);

}
