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
     * @param request the request parameters of CreateConfig  CreateConfigRequest
     * @return CreateConfigResponse
     */
    CompletableFuture<CreateConfigResponse> createConfig(CreateConfigRequest request);

    /**
     * @param request the request parameters of CreateFaultInjection  CreateFaultInjectionRequest
     * @return CreateFaultInjectionResponse
     */
    CompletableFuture<CreateFaultInjectionResponse> createFaultInjection(CreateFaultInjectionRequest request);

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
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

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
     * @param request the request parameters of CreateServiceInstanceToken  CreateServiceInstanceTokenRequest
     * @return CreateServiceInstanceTokenResponse
     */
    CompletableFuture<CreateServiceInstanceTokenResponse> createServiceInstanceToken(CreateServiceInstanceTokenRequest request);

    /**
     * @param request the request parameters of CreateServiceMirror  CreateServiceMirrorRequest
     * @return CreateServiceMirrorResponse
     */
    CompletableFuture<CreateServiceMirrorResponse> createServiceMirror(CreateServiceMirrorRequest request);

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>策略互斥</strong>：<code>Partition</code>（分区发布）和<code>Batch</code>（批量发布）两种策略只能选择其中一种，不能同时使用。</li>
     * <li><strong>请求速率限制</strong>：每秒最多100次请求。</li>
     * <li><strong>授权信息</strong>：需要具备<code>eas:CreateServiceRollout</code>权限才能调用此接口。</li>
     * <li><strong>资源ARN</strong>：<code>acs:eas:{#regionId}:{#accountId}:service/{#ServiceName}</code>。</li>
     * <li><strong>暂停发布</strong>：通过设置<code>Paused</code>参数为<code>true</code>可以暂停发布流程，之后可通过<code>UpdateServiceRollout</code>接口恢复或取消发布。</li>
     * <li><strong>监控与回滚</strong>：在发布过程中建议持续监控服务指标，以便及时发现并处理问题；如需回滚，可以通过调整<code>Partition</code>值或删除发布策略来实现。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateServiceRollout  CreateServiceRolloutRequest
     * @return CreateServiceRolloutResponse
     */
    CompletableFuture<CreateServiceRolloutResponse> createServiceRollout(CreateServiceRolloutRequest request);

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
     * @param request the request parameters of DeleteConfig  DeleteConfigRequest
     * @return DeleteConfigResponse
     */
    CompletableFuture<DeleteConfigResponse> deleteConfig(DeleteConfigRequest request);

    /**
     * @param request the request parameters of DeleteFaultInjection  DeleteFaultInjectionRequest
     * @return DeleteFaultInjectionResponse
     */
    CompletableFuture<DeleteFaultInjectionResponse> deleteFaultInjection(DeleteFaultInjectionRequest request);

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
     * @param request the request parameters of DeleteGatewayLabel  DeleteGatewayLabelRequest
     * @return DeleteGatewayLabelResponse
     */
    CompletableFuture<DeleteGatewayLabelResponse> deleteGatewayLabel(DeleteGatewayLabelRequest request);

    /**
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

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
     * @param request the request parameters of DeleteResourceInstanceLabel  DeleteResourceInstanceLabelRequest
     * @return DeleteResourceInstanceLabelResponse
     */
    CompletableFuture<DeleteResourceInstanceLabelResponse> deleteResourceInstanceLabel(DeleteResourceInstanceLabelRequest request);

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
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>不可恢复</strong>：删除操作不可撤销，请谨慎操作。</li>
     * <li><strong>不自动回退</strong>：删除策略不会回退已更新的副本。</li>
     * <li><strong>停止发布</strong>：正在进行的发布会立即停止。</li>
     * <li><strong>状态保留</strong>：已更新的副本保持新版本，未更新的保持旧版本。</li>
     * <li>删除后，后续服务更新将采用默认的滚动更新方式。</li>
     * <li>在删除前，请确认要删除的服务名称和地域，并了解当前发布状态（可以通过调用<code>DescribeServiceRollout</code>接口获取）。</li>
     * <li>如果需要回退版本，请在删除策略后通过重新创建策略或直接更新服务镜像来实现。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteServiceRollout  DeleteServiceRolloutRequest
     * @return DeleteServiceRolloutResponse
     */
    CompletableFuture<DeleteServiceRolloutResponse> deleteServiceRollout(DeleteServiceRolloutRequest request);

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
     * @param request the request parameters of DescribeGroupEndpoints  DescribeGroupEndpointsRequest
     * @return DescribeGroupEndpointsResponse
     */
    CompletableFuture<DescribeGroupEndpointsResponse> describeGroupEndpoints(DescribeGroupEndpointsRequest request);

    /**
     * @param request the request parameters of DescribeMachineSpec  DescribeMachineSpecRequest
     * @return DescribeMachineSpecResponse
     */
    CompletableFuture<DescribeMachineSpecResponse> describeMachineSpec(DescribeMachineSpecRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

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
     * @param request the request parameters of DescribeServiceEndpoints  DescribeServiceEndpointsRequest
     * @return DescribeServiceEndpointsResponse
     */
    CompletableFuture<DescribeServiceEndpointsResponse> describeServiceEndpoints(DescribeServiceEndpointsRequest request);

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
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询特定服务的发布策略（Rollout）配置和当前执行状态。</li>
     * <li>返回的信息包括但不限于发布策略的具体参数、当前发布进度等。</li>
     * <li>请求时需提供<code>ClusterId</code>和服务名称<code>ServiceName</code>作为路径参数。</li>
     * <li>注意，请求速率限制为每秒最多100次。</li>
     * <li>如果服务不存在或未创建发布策略，调用此接口将返回错误。</li>
     * <li>返回的状态是实时查询的结果，可能会随时间而变化，请根据实际需要调整轮询间隔。</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeServiceRollout  DescribeServiceRolloutRequest
     * @return DescribeServiceRolloutResponse
     */
    CompletableFuture<DescribeServiceRolloutResponse> describeServiceRollout(DescribeServiceRolloutRequest request);

    /**
     * @param request the request parameters of DescribeServiceSignedUrl  DescribeServiceSignedUrlRequest
     * @return DescribeServiceSignedUrlResponse
     */
    CompletableFuture<DescribeServiceSignedUrlResponse> describeServiceSignedUrl(DescribeServiceSignedUrlRequest request);

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
     * @param request the request parameters of ListConfigs  ListConfigsRequest
     * @return ListConfigsResponse
     */
    CompletableFuture<ListConfigsResponse> listConfigs(ListConfigsRequest request);

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
     * @param request the request parameters of ListServiceInstanceFaultInjectionInfo  ListServiceInstanceFaultInjectionInfoRequest
     * @return ListServiceInstanceFaultInjectionInfoResponse
     */
    CompletableFuture<ListServiceInstanceFaultInjectionInfoResponse> listServiceInstanceFaultInjectionInfo(ListServiceInstanceFaultInjectionInfoRequest request);

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
     * @param request the request parameters of MigrateResourceInstance  MigrateResourceInstanceRequest
     * @return MigrateResourceInstanceResponse
     */
    CompletableFuture<MigrateResourceInstanceResponse> migrateResourceInstance(MigrateResourceInstanceRequest request);

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
     * @param request the request parameters of ScaleService  ScaleServiceRequest
     * @return ScaleServiceResponse
     */
    CompletableFuture<ScaleServiceResponse> scaleService(ScaleServiceRequest request);

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
     * @param request the request parameters of UpdateConfig  UpdateConfigRequest
     * @return UpdateConfigResponse
     */
    CompletableFuture<UpdateConfigResponse> updateConfig(UpdateConfigRequest request);

    /**
     * @param request the request parameters of UpdateGateway  UpdateGatewayRequest
     * @return UpdateGatewayResponse
     */
    CompletableFuture<UpdateGatewayResponse> updateGateway(UpdateGatewayRequest request);

    /**
     * @param request the request parameters of UpdateGatewayLabel  UpdateGatewayLabelRequest
     * @return UpdateGatewayLabelResponse
     */
    CompletableFuture<UpdateGatewayLabelResponse> updateGatewayLabel(UpdateGatewayLabelRequest request);

    /**
     * @param request the request parameters of UpdateGroup  UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    CompletableFuture<UpdateGroupResponse> updateGroup(UpdateGroupRequest request);

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
     * @param request the request parameters of UpdateResourceInstanceLabel  UpdateResourceInstanceLabelRequest
     * @return UpdateResourceInstanceLabelResponse
     */
    CompletableFuture<UpdateResourceInstanceLabelResponse> updateResourceInstanceLabel(UpdateResourceInstanceLabelRequest request);

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
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>至少提供一个参数</strong>：必须在请求中指定<code>Partition</code>、<code>Batch</code>或<code>Paused</code>中的至少一个参数。</li>
     * <li><strong>互斥策略</strong>：不能同时提供<code>Partition</code>和<code>Batch</code>配置。</li>
     * <li><strong>实时生效</strong>：更新将立即生效，影响正在进行的服务发布过程。</li>
     * <li><strong>回退操作</strong>：通过增加<code>Partition</code>值可以实现版本回退，但不会自动触发，需要手动更新服务镜像。</li>
     * <li><strong>暂停不影响参数</strong>：暂停发布不会改变已设置的<code>Partition</code>或<code>Batch</code>参数，仅暂停执行当前策略。</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateServiceRollout  UpdateServiceRolloutRequest
     * @return UpdateServiceRolloutResponse
     */
    CompletableFuture<UpdateServiceRolloutResponse> updateServiceRollout(UpdateServiceRolloutRequest request);

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
