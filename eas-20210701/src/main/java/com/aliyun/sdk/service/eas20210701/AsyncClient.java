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
     * <b>description</b> :
     * <p>Before binding a custom domain name to a dedicated gateway, enable internal network access (EnableIntranet) or public network access (EnableInternet) by calling UpdateGateway. To enable internal network access, determine the VpcId and VSwitchIds first. Query existing resources by calling ListGateway, DescribeGateway, DescribeVpcs, and DescribeVSwitches in sequence. If necessary, call CreateVSwitch to create a vSwitch, and then call UpdateGateway to complete the network configuration.</p>
     * 
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API sends a POST request to a specified path to create a dynamic parameter.</li>
     * <li>The name of the dynamic parameter (ConfigKey) supports letters, digits, periods, underscores, hyphens, and forward slashes, with a maximum length of 100 characters.</li>
     * <li>The request body must contain the specific value (Value) of the dynamic parameter.</li>
     * <li>After the dynamic parameter is created, the API returns the key information of the new dynamic parameter, including the parameter name (Key), value (Value), and the creation and update timestamps.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateConfig  CreateConfigRequest
     * @return CreateConfigResponse
     */
    CompletableFuture<CreateConfigResponse> createConfig(CreateConfigRequest request);

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of Elastic Algorithm Service (EAS) before you call this operation.</em>*</p>
     * 
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
     * <b>description</b> :
     * <p><em>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of EAS.</em>*</p>
     * 
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
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of Elastic Algorithm Service (EAS) before you call this operation.</em>*</p>
     * 
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of EAS before you call this operation.</em>*</p>
     * 
     * @param request the request parameters of CreateResource  CreateResourceRequest
     * @return CreateResourceResponse
     */
    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of Elastic Algorithm Service (EAS).</em>*</p>
     * 
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
     * <p><em>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of EAS.</em>*</p>
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
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Mutually exclusive policies</strong>: You can select only one of the Partition (partition-based rollout) and Batch (batch-based rollout) policies. They cannot be used simultaneously.</li>
     * <li><strong>Request rate limit</strong>: A maximum of 100 requests per second.</li>
     * <li><strong>Authorization information</strong>: You must have the eas:CreateServiceRollout permission to call this operation.</li>
     * <li><strong>Resource ARN</strong>: acs:eas:{#regionId}:{#accountId}:service/{#ServiceName}.</li>
     * <li><strong>Pause a rollout</strong>: You can pause the rollout process by setting the Paused parameter to true. You can then resume or cancel the rollout by calling the UpdateServiceRollout operation.</li>
     * <li><strong>Monitoring and rollback</strong>: Continuously monitor service metrics during the rollout to promptly identify and resolve issues. To roll back, adjust the Partition value or delete the rollout policy.</li>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API allows you to delete a specific configuration item by specifying the cluster ID, configuration type, service name, and configuration item name. Ensure that the provided parameter values are accurate to avoid accidental deletion of important configurations.</p>
     * 
     * @param request the request parameters of DeleteConfig  DeleteConfigRequest
     * @return DeleteConfigResponse
     */
    CompletableFuture<DeleteConfigResponse> deleteConfig(DeleteConfigRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of Elastic Algorithm Service (EAS).</em>*</p>
     * 
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
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of Elastic Algorithm Service (EAS).</em>*</p>
     * 
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
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you understand the billing methods and&#x20;<strong><a href="https://help.aliyun.com/document_detail/144261.html"><strong>pricing</strong></a></strong>&#x20;of Elastic Algorithm Service (EAS).*</em></p>
     * 
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
     * <p>Deletes the update plan for a specified service.</p>
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
     * @param request the request parameters of DescribeArtifact  DescribeArtifactRequest
     * @return DescribeArtifactResponse
     */
    CompletableFuture<DescribeArtifactResponse> describeArtifact(DescribeArtifactRequest request);

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
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the rollout configuration and current execution status of a specific service.</li>
     * <li>The returned information includes but is not limited to the specific parameters of the rollout and the current rollout progress.</li>
     * <li>You must provide ClusterId and the service name ServiceName as path parameters in the request.</li>
     * <li>Note that the request rate limit is up to 100 requests per second.</li>
     * <li>If the service does not exist or no rollout is created, calling this operation returns an error.</li>
     * <li>The returned status is the result of a real-time query and may change over time. Adjust the polling interval as needed.</li>
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
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of EAS.</em>*</p>
     * 
     * @param request the request parameters of ListBenchmarkTask  ListBenchmarkTaskRequest
     * @return ListBenchmarkTaskResponse
     */
    CompletableFuture<ListBenchmarkTaskResponse> listBenchmarkTask(ListBenchmarkTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation queries the list of dynamic parameters for a specific service.</li>
     * <li><code>ClusterId</code> specifies the region of the service to query.</li>
     * <li><code>ConfigType</code> currently supports only the <code>service</code> type.</li>
     * <li><code>Name</code> specifies the service name.</li>
     * <li>You can use the <code>Page</code> and <code>PageSize</code> parameters to perform a paged query. By default, 100 records are displayed per page, and a maximum of 200 records are supported.</li>
     * <li>The response includes the details of the dynamic parameters and paging information.</li>
     * </ul>
     * 
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
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of Elastic Algorithm Service (EAS).</em>*</p>
     * 
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
     * <b>description</b> :
     * <p><em>Before calling this operation, make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of Elastic Algorithm Service (EAS).</em>*</p>
     * 
     * @param request the request parameters of ListServiceInstanceFaultInjectionInfo  ListServiceInstanceFaultInjectionInfoRequest
     * @return ListServiceInstanceFaultInjectionInfoResponse
     */
    CompletableFuture<ListServiceInstanceFaultInjectionInfoResponse> listServiceInstanceFaultInjectionInfo(ListServiceInstanceFaultInjectionInfoRequest request);

    /**
     * <b>description</b> :
     * <p><em>Ensure that you understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of Elastic Algorithm Service (EAS) before you call this operation.</em>*</p>
     * 
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
     * <b>description</b> :
     * <p>Updates a specified stress testing task. Only stress testing tasks whose mode is manual or async and that are in the Running state can be updated. You can call the DescribeBenchmarkTask operation to query the task status. If the task is in the Stopped state, you must first call the StartBenchmarkTask operation and wait until the task enters the Running state.</p>
     * 
     * @param request the request parameters of UpdateBenchmarkTask  UpdateBenchmarkTaskRequest
     * @return UpdateBenchmarkTaskResponse
     */
    CompletableFuture<UpdateBenchmarkTaskResponse> updateBenchmarkTask(UpdateBenchmarkTaskRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API allows you to update the value of a specific dynamic parameter by specifying ClusterId, ConfigType, Name, and ConfigKey. The request body must include the new parameter value Value. Ensure that the provided path parameters are accurate to avoid updating the wrong dynamic parameter.</p>
     * 
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
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of EAS before you call this operation.</em>*</p>
     * 
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
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/144261.html">pricing</a> of Elastic Algorithm Service (EAS) before you call this operation.</em>*</p>
     * 
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
     * <b>description</b> :
     * <p>Updates the traffic mirror configuration of a service. Before calling this operation, you must enable traffic mirroring for the target service by calling CreateServiceMirror. If traffic mirroring is not enabled, an InvalidServiceMirror.NotFound error is returned.</p>
     * 
     * @param request the request parameters of UpdateServiceMirror  UpdateServiceMirrorRequest
     * @return UpdateServiceMirrorResponse
     */
    CompletableFuture<UpdateServiceMirrorResponse> updateServiceMirror(UpdateServiceMirrorRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Provide at least one parameter</strong>: You must specify at least one of the Partition, Batch, or Paused parameters in the request.</li>
     * <li><strong>Mutually exclusive policies</strong>: You cannot provide both Partition and Batch configurations at the same time.</li>
     * <li><strong>Immediate effect</strong>: Updates take effect immediately and affect the ongoing service rollout process.</li>
     * <li><strong>Rollback operation</strong>: You can roll back to a previous version by increasing the Partition value. However, this is not triggered automatically and requires a manual update of the service image.</li>
     * <li><strong>Pause does not affect parameters</strong>: Pausing the rollout does not change the configured Partition or Batch parameters. It only pauses the execution of the current policy.</li>
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
     * <b>description</b> :
     * <p>Updates the traffic mirroring configuration for a service. Before you call this operation, you must enable traffic mirroring for the target service by calling CreateServiceMirror. If traffic mirroring is not enabled, the InvalidServiceMirror.NotFound error is returned.</p>
     * 
     * @param request the request parameters of UpdateServiceVersionRemark  UpdateServiceVersionRemarkRequest
     * @return UpdateServiceVersionRemarkResponse
     */
    CompletableFuture<UpdateServiceVersionRemarkResponse> updateServiceVersionRemark(UpdateServiceVersionRemarkRequest request);

    /**
     * @param request the request parameters of UpdateVirtualResource  UpdateVirtualResourceRequest
     * @return UpdateVirtualResourceResponse
     */
    CompletableFuture<UpdateVirtualResourceResponse> updateVirtualResource(UpdateVirtualResourceRequest request);

}
