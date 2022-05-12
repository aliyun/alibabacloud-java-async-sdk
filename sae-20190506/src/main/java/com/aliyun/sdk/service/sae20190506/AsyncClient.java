// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sae20190506.models.*;
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

    CompletableFuture<AbortAndRollbackChangeOrderResponse> abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request);

    CompletableFuture<AbortChangeOrderResponse> abortChangeOrder(AbortChangeOrderRequest request);

    CompletableFuture<BatchStartApplicationsResponse> batchStartApplications(BatchStartApplicationsRequest request);

    CompletableFuture<BatchStopApplicationsResponse> batchStopApplications(BatchStopApplicationsRequest request);

    CompletableFuture<BindSlbResponse> bindSlb(BindSlbRequest request);

    CompletableFuture<ConfirmPipelineBatchResponse> confirmPipelineBatch(ConfirmPipelineBatchRequest request);

    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    CompletableFuture<CreateApplicationScalingRuleResponse> createApplicationScalingRule(CreateApplicationScalingRuleRequest request);

    CompletableFuture<CreateConfigMapResponse> createConfigMap(CreateConfigMapRequest request);

    CompletableFuture<CreateGreyTagRouteResponse> createGreyTagRoute(CreateGreyTagRouteRequest request);

    CompletableFuture<CreateIngressResponse> createIngress(CreateIngressRequest request);

    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    CompletableFuture<DeleteApplicationScalingRuleResponse> deleteApplicationScalingRule(DeleteApplicationScalingRuleRequest request);

    CompletableFuture<DeleteConfigMapResponse> deleteConfigMap(DeleteConfigMapRequest request);

    CompletableFuture<DeleteGreyTagRouteResponse> deleteGreyTagRoute(DeleteGreyTagRouteRequest request);

    CompletableFuture<DeleteIngressResponse> deleteIngress(DeleteIngressRequest request);

    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    CompletableFuture<DeployApplicationResponse> deployApplication(DeployApplicationRequest request);

    CompletableFuture<DescribeAppServiceDetailResponse> describeAppServiceDetail(DescribeAppServiceDetailRequest request);

    CompletableFuture<DescribeApplicationConfigResponse> describeApplicationConfig(DescribeApplicationConfigRequest request);

    CompletableFuture<DescribeApplicationGroupsResponse> describeApplicationGroups(DescribeApplicationGroupsRequest request);

    CompletableFuture<DescribeApplicationImageResponse> describeApplicationImage(DescribeApplicationImageRequest request);

    CompletableFuture<DescribeApplicationInstancesResponse> describeApplicationInstances(DescribeApplicationInstancesRequest request);

    CompletableFuture<DescribeApplicationScalingRuleResponse> describeApplicationScalingRule(DescribeApplicationScalingRuleRequest request);

    CompletableFuture<DescribeApplicationScalingRulesResponse> describeApplicationScalingRules(DescribeApplicationScalingRulesRequest request);

    CompletableFuture<DescribeApplicationSlbsResponse> describeApplicationSlbs(DescribeApplicationSlbsRequest request);

    CompletableFuture<DescribeApplicationStatusResponse> describeApplicationStatus(DescribeApplicationStatusRequest request);

    CompletableFuture<DescribeChangeOrderResponse> describeChangeOrder(DescribeChangeOrderRequest request);

    CompletableFuture<DescribeComponentsResponse> describeComponents(DescribeComponentsRequest request);

    CompletableFuture<DescribeConfigMapResponse> describeConfigMap(DescribeConfigMapRequest request);

    CompletableFuture<DescribeConfigurationPriceResponse> describeConfigurationPrice(DescribeConfigurationPriceRequest request);

    CompletableFuture<DescribeEdasContainersResponse> describeEdasContainers(DescribeEdasContainersRequest request);

    CompletableFuture<DescribeGreyTagRouteResponse> describeGreyTagRoute(DescribeGreyTagRouteRequest request);

    CompletableFuture<DescribeIngressResponse> describeIngress(DescribeIngressRequest request);

    CompletableFuture<DescribeInstanceLogResponse> describeInstanceLog(DescribeInstanceLogRequest request);

    CompletableFuture<DescribeInstanceSpecificationsResponse> describeInstanceSpecifications(DescribeInstanceSpecificationsRequest request);

    CompletableFuture<DescribeNamespaceResponse> describeNamespace(DescribeNamespaceRequest request);

    CompletableFuture<DescribeNamespaceListResponse> describeNamespaceList(DescribeNamespaceListRequest request);

    CompletableFuture<DescribeNamespaceResourcesResponse> describeNamespaceResources(DescribeNamespaceResourcesRequest request);

    CompletableFuture<DescribeNamespacesResponse> describeNamespaces(DescribeNamespacesRequest request);

    CompletableFuture<DescribePipelineResponse> describePipeline(DescribePipelineRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DisableApplicationScalingRuleResponse> disableApplicationScalingRule(DisableApplicationScalingRuleRequest request);

    CompletableFuture<EnableApplicationScalingRuleResponse> enableApplicationScalingRule(EnableApplicationScalingRuleRequest request);

    CompletableFuture<ListAppEventsResponse> listAppEvents(ListAppEventsRequest request);

    CompletableFuture<ListAppServicesPageResponse> listAppServicesPage(ListAppServicesPageRequest request);

    CompletableFuture<ListAppVersionsResponse> listAppVersions(ListAppVersionsRequest request);

    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    CompletableFuture<ListChangeOrdersResponse> listChangeOrders(ListChangeOrdersRequest request);

    CompletableFuture<ListConsumedServicesResponse> listConsumedServices(ListConsumedServicesRequest request);

    CompletableFuture<ListGreyTagRouteResponse> listGreyTagRoute(ListGreyTagRouteRequest request);

    CompletableFuture<ListIngressesResponse> listIngresses(ListIngressesRequest request);

    CompletableFuture<ListLogConfigsResponse> listLogConfigs(ListLogConfigsRequest request);

    CompletableFuture<ListNamespaceChangeOrdersResponse> listNamespaceChangeOrders(ListNamespaceChangeOrdersRequest request);

    CompletableFuture<ListNamespacedConfigMapsResponse> listNamespacedConfigMaps(ListNamespacedConfigMapsRequest request);

    CompletableFuture<ListPublishedServicesResponse> listPublishedServices(ListPublishedServicesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<OpenSaeServiceResponse> openSaeService(OpenSaeServiceRequest request);

    CompletableFuture<QueryResourceStaticsResponse> queryResourceStatics(QueryResourceStaticsRequest request);

    CompletableFuture<ReduceApplicationCapacityByInstanceIdsResponse> reduceApplicationCapacityByInstanceIds(ReduceApplicationCapacityByInstanceIdsRequest request);

    CompletableFuture<RescaleApplicationResponse> rescaleApplication(RescaleApplicationRequest request);

    CompletableFuture<RescaleApplicationVerticallyResponse> rescaleApplicationVertically(RescaleApplicationVerticallyRequest request);

    CompletableFuture<RestartApplicationResponse> restartApplication(RestartApplicationRequest request);

    CompletableFuture<RestartInstancesResponse> restartInstances(RestartInstancesRequest request);

    CompletableFuture<RollbackApplicationResponse> rollbackApplication(RollbackApplicationRequest request);

    CompletableFuture<StartApplicationResponse> startApplication(StartApplicationRequest request);

    CompletableFuture<StopApplicationResponse> stopApplication(StopApplicationRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnbindSlbResponse> unbindSlb(UnbindSlbRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAppSecurityGroupResponse> updateAppSecurityGroup(UpdateAppSecurityGroupRequest request);

    CompletableFuture<UpdateApplicationDescriptionResponse> updateApplicationDescription(UpdateApplicationDescriptionRequest request);

    CompletableFuture<UpdateApplicationScalingRuleResponse> updateApplicationScalingRule(UpdateApplicationScalingRuleRequest request);

    CompletableFuture<UpdateApplicationVswitchesResponse> updateApplicationVswitches(UpdateApplicationVswitchesRequest request);

    CompletableFuture<UpdateConfigMapResponse> updateConfigMap(UpdateConfigMapRequest request);

    CompletableFuture<UpdateGreyTagRouteResponse> updateGreyTagRoute(UpdateGreyTagRouteRequest request);

    CompletableFuture<UpdateIngressResponse> updateIngress(UpdateIngressRequest request);

    CompletableFuture<UpdateNamespaceResponse> updateNamespace(UpdateNamespaceRequest request);

    CompletableFuture<UpdateNamespaceVpcResponse> updateNamespaceVpc(UpdateNamespaceVpcRequest request);

}
