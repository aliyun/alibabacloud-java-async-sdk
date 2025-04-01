// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sae20190506.models.*;
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
     * @param request the request parameters of AbortAndRollbackChangeOrder  AbortAndRollbackChangeOrderRequest
     * @return AbortAndRollbackChangeOrderResponse
     */
    CompletableFuture<AbortAndRollbackChangeOrderResponse> abortAndRollbackChangeOrder(AbortAndRollbackChangeOrderRequest request);

    /**
     * @param request the request parameters of AbortChangeOrder  AbortChangeOrderRequest
     * @return AbortChangeOrderResponse
     */
    CompletableFuture<AbortChangeOrderResponse> abortChangeOrder(AbortChangeOrderRequest request);

    /**
     * @param request the request parameters of BatchStartApplications  BatchStartApplicationsRequest
     * @return BatchStartApplicationsResponse
     */
    CompletableFuture<BatchStartApplicationsResponse> batchStartApplications(BatchStartApplicationsRequest request);

    /**
     * @param request the request parameters of BatchStopApplications  BatchStopApplicationsRequest
     * @return BatchStopApplicationsResponse
     */
    CompletableFuture<BatchStopApplicationsResponse> batchStopApplications(BatchStopApplicationsRequest request);

    /**
     * @param request the request parameters of BindSlb  BindSlbRequest
     * @return BindSlbResponse
     */
    CompletableFuture<BindSlbResponse> bindSlb(BindSlbRequest request);

    /**
     * @param request the request parameters of ConfirmPipelineBatch  ConfirmPipelineBatchRequest
     * @return ConfirmPipelineBatchResponse
     */
    CompletableFuture<ConfirmPipelineBatchResponse> confirmPipelineBatch(ConfirmPipelineBatchRequest request);

    /**
     * @param request the request parameters of CreateApplication  CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    CompletableFuture<CreateApplicationResponse> createApplication(CreateApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>The HTTP status code. Take note of the following rules:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateApplicationScalingRule  CreateApplicationScalingRuleRequest
     * @return CreateApplicationScalingRuleResponse
     */
    CompletableFuture<CreateApplicationScalingRuleResponse> createApplicationScalingRule(CreateApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of CreateConfigMap  CreateConfigMapRequest
     * @return CreateConfigMapResponse
     */
    CompletableFuture<CreateConfigMapResponse> createConfigMap(CreateConfigMapRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can configure only one canary release rule for each application.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateGreyTagRoute  CreateGreyTagRouteRequest
     * @return CreateGreyTagRouteResponse
     */
    CompletableFuture<CreateGreyTagRouteResponse> createGreyTagRoute(CreateGreyTagRouteRequest request);

    /**
     * @param request the request parameters of CreateIngress  CreateIngressRequest
     * @return CreateIngressResponse
     */
    CompletableFuture<CreateIngressResponse> createIngress(CreateIngressRequest request);

    /**
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * @param request the request parameters of CreateNamespace  CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    /**
     * @param request the request parameters of CreateSecret  CreateSecretRequest
     * @return CreateSecretResponse
     */
    CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request);

    /**
     * <b>description</b> :
     * <p>Call the CreateWebApplication operation to create a web application.</p>
     * 
     * @param request the request parameters of CreateWebApplication  CreateWebApplicationRequest
     * @return CreateWebApplicationResponse
     */
    CompletableFuture<CreateWebApplicationResponse> createWebApplication(CreateWebApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>Create a custom domain name for the web application.</p>
     * 
     * @param request the request parameters of CreateWebCustomDomain  CreateWebCustomDomainRequest
     * @return CreateWebCustomDomainResponse
     */
    CompletableFuture<CreateWebCustomDomainResponse> createWebCustomDomain(CreateWebCustomDomainRequest request);

    /**
     * @param request the request parameters of DeleteApplication  DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    CompletableFuture<DeleteApplicationResponse> deleteApplication(DeleteApplicationRequest request);

    /**
     * @param request the request parameters of DeleteApplicationScalingRule  DeleteApplicationScalingRuleRequest
     * @return DeleteApplicationScalingRuleResponse
     */
    CompletableFuture<DeleteApplicationScalingRuleResponse> deleteApplicationScalingRule(DeleteApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of DeleteConfigMap  DeleteConfigMapRequest
     * @return DeleteConfigMapResponse
     */
    CompletableFuture<DeleteConfigMapResponse> deleteConfigMap(DeleteConfigMapRequest request);

    /**
     * @param request the request parameters of DeleteGreyTagRoute  DeleteGreyTagRouteRequest
     * @return DeleteGreyTagRouteResponse
     */
    CompletableFuture<DeleteGreyTagRouteResponse> deleteGreyTagRoute(DeleteGreyTagRouteRequest request);

    /**
     * @param request the request parameters of DeleteHistoryJob  DeleteHistoryJobRequest
     * @return DeleteHistoryJobResponse
     */
    CompletableFuture<DeleteHistoryJobResponse> deleteHistoryJob(DeleteHistoryJobRequest request);

    /**
     * @param request the request parameters of DeleteIngress  DeleteIngressRequest
     * @return DeleteIngressResponse
     */
    CompletableFuture<DeleteIngressResponse> deleteIngress(DeleteIngressRequest request);

    /**
     * @param request the request parameters of DeleteJob  DeleteJobRequest
     * @return DeleteJobResponse
     */
    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    /**
     * @param request the request parameters of DeleteNamespace  DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    /**
     * @param request the request parameters of DeleteSecret  DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request);

    /**
     * <b>description</b> :
     * <p>Call the DeleteWebApplication operation to delete a web application.</p>
     * 
     * @param request the request parameters of DeleteWebApplication  DeleteWebApplicationRequest
     * @return DeleteWebApplicationResponse
     */
    CompletableFuture<DeleteWebApplicationResponse> deleteWebApplication(DeleteWebApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>Delete a web application version.</p>
     * 
     * @param request the request parameters of DeleteWebApplicationRevision  DeleteWebApplicationRevisionRequest
     * @return DeleteWebApplicationRevisionResponse
     */
    CompletableFuture<DeleteWebApplicationRevisionResponse> deleteWebApplicationRevision(DeleteWebApplicationRevisionRequest request);

    /**
     * <b>description</b> :
     * <p>Delete a custom domain name.</p>
     * 
     * @param request the request parameters of DeleteWebCustomDomain  DeleteWebCustomDomainRequest
     * @return DeleteWebCustomDomainResponse
     */
    CompletableFuture<DeleteWebCustomDomainResponse> deleteWebCustomDomain(DeleteWebCustomDomainRequest request);

    /**
     * @param request the request parameters of DeployApplication  DeployApplicationRequest
     * @return DeployApplicationResponse
     */
    CompletableFuture<DeployApplicationResponse> deployApplication(DeployApplicationRequest request);

    /**
     * @param request the request parameters of DescribeAppServiceDetail  DescribeAppServiceDetailRequest
     * @return DescribeAppServiceDetailResponse
     */
    CompletableFuture<DescribeAppServiceDetailResponse> describeAppServiceDetail(DescribeAppServiceDetailRequest request);

    /**
     * @param request the request parameters of DescribeApplicationConfig  DescribeApplicationConfigRequest
     * @return DescribeApplicationConfigResponse
     */
    CompletableFuture<DescribeApplicationConfigResponse> describeApplicationConfig(DescribeApplicationConfigRequest request);

    /**
     * @param request the request parameters of DescribeApplicationGroups  DescribeApplicationGroupsRequest
     * @return DescribeApplicationGroupsResponse
     */
    CompletableFuture<DescribeApplicationGroupsResponse> describeApplicationGroups(DescribeApplicationGroupsRequest request);

    /**
     * @param request the request parameters of DescribeApplicationImage  DescribeApplicationImageRequest
     * @return DescribeApplicationImageResponse
     */
    CompletableFuture<DescribeApplicationImageResponse> describeApplicationImage(DescribeApplicationImageRequest request);

    /**
     * @param request the request parameters of DescribeApplicationInstances  DescribeApplicationInstancesRequest
     * @return DescribeApplicationInstancesResponse
     */
    CompletableFuture<DescribeApplicationInstancesResponse> describeApplicationInstances(DescribeApplicationInstancesRequest request);

    /**
     * @param request the request parameters of DescribeApplicationScalingRule  DescribeApplicationScalingRuleRequest
     * @return DescribeApplicationScalingRuleResponse
     */
    CompletableFuture<DescribeApplicationScalingRuleResponse> describeApplicationScalingRule(DescribeApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of DescribeApplicationScalingRules  DescribeApplicationScalingRulesRequest
     * @return DescribeApplicationScalingRulesResponse
     */
    CompletableFuture<DescribeApplicationScalingRulesResponse> describeApplicationScalingRules(DescribeApplicationScalingRulesRequest request);

    /**
     * @param request the request parameters of DescribeApplicationSlbs  DescribeApplicationSlbsRequest
     * @return DescribeApplicationSlbsResponse
     */
    CompletableFuture<DescribeApplicationSlbsResponse> describeApplicationSlbs(DescribeApplicationSlbsRequest request);

    /**
     * @param request the request parameters of DescribeApplicationStatus  DescribeApplicationStatusRequest
     * @return DescribeApplicationStatusResponse
     */
    CompletableFuture<DescribeApplicationStatusResponse> describeApplicationStatus(DescribeApplicationStatusRequest request);

    /**
     * @param request the request parameters of DescribeChangeOrder  DescribeChangeOrderRequest
     * @return DescribeChangeOrderResponse
     */
    CompletableFuture<DescribeChangeOrderResponse> describeChangeOrder(DescribeChangeOrderRequest request);

    /**
     * @param request the request parameters of DescribeComponents  DescribeComponentsRequest
     * @return DescribeComponentsResponse
     */
    CompletableFuture<DescribeComponentsResponse> describeComponents(DescribeComponentsRequest request);

    /**
     * @param request the request parameters of DescribeConfigMap  DescribeConfigMapRequest
     * @return DescribeConfigMapResponse
     */
    CompletableFuture<DescribeConfigMapResponse> describeConfigMap(DescribeConfigMapRequest request);

    /**
     * @param request the request parameters of DescribeConfigurationPrice  DescribeConfigurationPriceRequest
     * @return DescribeConfigurationPriceResponse
     */
    CompletableFuture<DescribeConfigurationPriceResponse> describeConfigurationPrice(DescribeConfigurationPriceRequest request);

    /**
     * @param request the request parameters of DescribeEdasContainers  DescribeEdasContainersRequest
     * @return DescribeEdasContainersResponse
     */
    CompletableFuture<DescribeEdasContainersResponse> describeEdasContainers(DescribeEdasContainersRequest request);

    /**
     * @param request the request parameters of DescribeGreyTagRoute  DescribeGreyTagRouteRequest
     * @return DescribeGreyTagRouteResponse
     */
    CompletableFuture<DescribeGreyTagRouteResponse> describeGreyTagRoute(DescribeGreyTagRouteRequest request);

    /**
     * @param request the request parameters of DescribeIngress  DescribeIngressRequest
     * @return DescribeIngressResponse
     */
    CompletableFuture<DescribeIngressResponse> describeIngress(DescribeIngressRequest request);

    /**
     * @param request the request parameters of DescribeInstanceLog  DescribeInstanceLogRequest
     * @return DescribeInstanceLogResponse
     */
    CompletableFuture<DescribeInstanceLogResponse> describeInstanceLog(DescribeInstanceLogRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSpecifications  DescribeInstanceSpecificationsRequest
     * @return DescribeInstanceSpecificationsResponse
     */
    CompletableFuture<DescribeInstanceSpecificationsResponse> describeInstanceSpecifications(DescribeInstanceSpecificationsRequest request);

    /**
     * @param request the request parameters of DescribeJob  DescribeJobRequest
     * @return DescribeJobResponse
     */
    CompletableFuture<DescribeJobResponse> describeJob(DescribeJobRequest request);

    /**
     * @param request the request parameters of DescribeJobHistory  DescribeJobHistoryRequest
     * @return DescribeJobHistoryResponse
     */
    CompletableFuture<DescribeJobHistoryResponse> describeJobHistory(DescribeJobHistoryRequest request);

    /**
     * @param request the request parameters of DescribeJobStatus  DescribeJobStatusRequest
     * @return DescribeJobStatusResponse
     */
    CompletableFuture<DescribeJobStatusResponse> describeJobStatus(DescribeJobStatusRequest request);

    /**
     * @param request the request parameters of DescribeNamespace  DescribeNamespaceRequest
     * @return DescribeNamespaceResponse
     */
    CompletableFuture<DescribeNamespaceResponse> describeNamespace(DescribeNamespaceRequest request);

    /**
     * @param request the request parameters of DescribeNamespaceList  DescribeNamespaceListRequest
     * @return DescribeNamespaceListResponse
     */
    CompletableFuture<DescribeNamespaceListResponse> describeNamespaceList(DescribeNamespaceListRequest request);

    /**
     * @param request the request parameters of DescribeNamespaceResources  DescribeNamespaceResourcesRequest
     * @return DescribeNamespaceResourcesResponse
     */
    CompletableFuture<DescribeNamespaceResourcesResponse> describeNamespaceResources(DescribeNamespaceResourcesRequest request);

    /**
     * @param request the request parameters of DescribeNamespaces  DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     */
    CompletableFuture<DescribeNamespacesResponse> describeNamespaces(DescribeNamespacesRequest request);

    /**
     * @param request the request parameters of DescribePipeline  DescribePipelineRequest
     * @return DescribePipelineResponse
     */
    CompletableFuture<DescribePipelineResponse> describePipeline(DescribePipelineRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeSecret  DescribeSecretRequest
     * @return DescribeSecretResponse
     */
    CompletableFuture<DescribeSecretResponse> describeSecret(DescribeSecretRequest request);

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplication operation to query web applications.</p>
     * 
     * @param request the request parameters of DescribeWebApplication  DescribeWebApplicationRequest
     * @return DescribeWebApplicationResponse
     */
    CompletableFuture<DescribeWebApplicationResponse> describeWebApplication(DescribeWebApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>Query the resource usage of a web application.</p>
     * 
     * @param request the request parameters of DescribeWebApplicationResourceStatics  DescribeWebApplicationResourceStaticsRequest
     * @return DescribeWebApplicationResourceStaticsResponse
     */
    CompletableFuture<DescribeWebApplicationResourceStaticsResponse> describeWebApplicationResourceStatics(DescribeWebApplicationResourceStaticsRequest request);

    /**
     * <b>description</b> :
     * <p>Describe a web application version.</p>
     * 
     * @param request the request parameters of DescribeWebApplicationRevision  DescribeWebApplicationRevisionRequest
     * @return DescribeWebApplicationRevisionResponse
     */
    CompletableFuture<DescribeWebApplicationRevisionResponse> describeWebApplicationRevision(DescribeWebApplicationRevisionRequest request);

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplicationScalingConfig operation to obtain the scaling configuration of a web application.</p>
     * 
     * @param request the request parameters of DescribeWebApplicationScalingConfig  DescribeWebApplicationScalingConfigRequest
     * @return DescribeWebApplicationScalingConfigResponse
     */
    CompletableFuture<DescribeWebApplicationScalingConfigResponse> describeWebApplicationScalingConfig(DescribeWebApplicationScalingConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Call the DescribeWebApplicationTrafficConfig operation to query the traffic configurations of a web application.</p>
     * 
     * @param request the request parameters of DescribeWebApplicationTrafficConfig  DescribeWebApplicationTrafficConfigRequest
     * @return DescribeWebApplicationTrafficConfigResponse
     */
    CompletableFuture<DescribeWebApplicationTrafficConfigResponse> describeWebApplicationTrafficConfig(DescribeWebApplicationTrafficConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Query the details of a custom domain name for a web application.</p>
     * 
     * @param request the request parameters of DescribeWebCustomDomain  DescribeWebCustomDomainRequest
     * @return DescribeWebCustomDomainResponse
     */
    CompletableFuture<DescribeWebCustomDomainResponse> describeWebCustomDomain(DescribeWebCustomDomainRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the logs of web application instances.</p>
     * 
     * @param request the request parameters of DescribeWebInstanceLogs  DescribeWebInstanceLogsRequest
     * @return DescribeWebInstanceLogsResponse
     */
    CompletableFuture<DescribeWebInstanceLogsResponse> describeWebInstanceLogs(DescribeWebInstanceLogsRequest request);

    /**
     * @param request the request parameters of DisableApplicationScalingRule  DisableApplicationScalingRuleRequest
     * @return DisableApplicationScalingRuleResponse
     */
    CompletableFuture<DisableApplicationScalingRuleResponse> disableApplicationScalingRule(DisableApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of DowngradeApplicationApmService  DowngradeApplicationApmServiceRequest
     * @return DowngradeApplicationApmServiceResponse
     */
    CompletableFuture<DowngradeApplicationApmServiceResponse> downgradeApplicationApmService(DowngradeApplicationApmServiceRequest request);

    /**
     * @param request the request parameters of EnableApplicationScalingRule  EnableApplicationScalingRuleRequest
     * @return EnableApplicationScalingRuleResponse
     */
    CompletableFuture<EnableApplicationScalingRuleResponse> enableApplicationScalingRule(EnableApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of ExecJob  ExecJobRequest
     * @return ExecJobResponse
     */
    CompletableFuture<ExecJobResponse> execJob(ExecJobRequest request);

    /**
     * @param request the request parameters of GetApplication  GetApplicationRequest
     * @return GetApplicationResponse
     */
    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    /**
     * @param request the request parameters of GetArmsTopNMetric  GetArmsTopNMetricRequest
     * @return GetArmsTopNMetricResponse
     */
    CompletableFuture<GetArmsTopNMetricResponse> getArmsTopNMetric(GetArmsTopNMetricRequest request);

    /**
     * @param request the request parameters of GetAvailabilityMetric  GetAvailabilityMetricRequest
     * @return GetAvailabilityMetricResponse
     */
    CompletableFuture<GetAvailabilityMetricResponse> getAvailabilityMetric(GetAvailabilityMetricRequest request);

    /**
     * @param request the request parameters of GetChangeOrderMetric  GetChangeOrderMetricRequest
     * @return GetChangeOrderMetricResponse
     */
    CompletableFuture<GetChangeOrderMetricResponse> getChangeOrderMetric(GetChangeOrderMetricRequest request);

    /**
     * @param request the request parameters of GetScaleAppMetric  GetScaleAppMetricRequest
     * @return GetScaleAppMetricResponse
     */
    CompletableFuture<GetScaleAppMetricResponse> getScaleAppMetric(GetScaleAppMetricRequest request);

    /**
     * @param request the request parameters of GetWarningEventMetric  GetWarningEventMetricRequest
     * @return GetWarningEventMetricResponse
     */
    CompletableFuture<GetWarningEventMetricResponse> getWarningEventMetric(GetWarningEventMetricRequest request);

    /**
     * @param request the request parameters of GetWebshellToken  GetWebshellTokenRequest
     * @return GetWebshellTokenResponse
     */
    CompletableFuture<GetWebshellTokenResponse> getWebshellToken(GetWebshellTokenRequest request);

    /**
     * @param request the request parameters of ListAppEvents  ListAppEventsRequest
     * @return ListAppEventsResponse
     */
    CompletableFuture<ListAppEventsResponse> listAppEvents(ListAppEventsRequest request);

    /**
     * @param request the request parameters of ListAppServices  ListAppServicesRequest
     * @return ListAppServicesResponse
     */
    CompletableFuture<ListAppServicesResponse> listAppServices(ListAppServicesRequest request);

    /**
     * @param request the request parameters of ListAppServicesPage  ListAppServicesPageRequest
     * @return ListAppServicesPageResponse
     */
    CompletableFuture<ListAppServicesPageResponse> listAppServicesPage(ListAppServicesPageRequest request);

    /**
     * @param request the request parameters of ListAppVersions  ListAppVersionsRequest
     * @return ListAppVersionsResponse
     */
    CompletableFuture<ListAppVersionsResponse> listAppVersions(ListAppVersionsRequest request);

    /**
     * @param request the request parameters of ListApplications  ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    CompletableFuture<ListApplicationsResponse> listApplications(ListApplicationsRequest request);

    /**
     * @param request the request parameters of ListChangeOrders  ListChangeOrdersRequest
     * @return ListChangeOrdersResponse
     */
    CompletableFuture<ListChangeOrdersResponse> listChangeOrders(ListChangeOrdersRequest request);

    /**
     * @param request the request parameters of ListConsumedServices  ListConsumedServicesRequest
     * @return ListConsumedServicesResponse
     */
    CompletableFuture<ListConsumedServicesResponse> listConsumedServices(ListConsumedServicesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can configure only one canary release rule for each application.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ListGreyTagRoute  ListGreyTagRouteRequest
     * @return ListGreyTagRouteResponse
     */
    CompletableFuture<ListGreyTagRouteResponse> listGreyTagRoute(ListGreyTagRouteRequest request);

    /**
     * @param request the request parameters of ListIngresses  ListIngressesRequest
     * @return ListIngressesResponse
     */
    CompletableFuture<ListIngressesResponse> listIngresses(ListIngressesRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListLogConfigs  ListLogConfigsRequest
     * @return ListLogConfigsResponse
     */
    CompletableFuture<ListLogConfigsResponse> listLogConfigs(ListLogConfigsRequest request);

    /**
     * @param request the request parameters of ListNamespaceChangeOrders  ListNamespaceChangeOrdersRequest
     * @return ListNamespaceChangeOrdersResponse
     */
    CompletableFuture<ListNamespaceChangeOrdersResponse> listNamespaceChangeOrders(ListNamespaceChangeOrdersRequest request);

    /**
     * @param request the request parameters of ListNamespacedConfigMaps  ListNamespacedConfigMapsRequest
     * @return ListNamespacedConfigMapsResponse
     */
    CompletableFuture<ListNamespacedConfigMapsResponse> listNamespacedConfigMaps(ListNamespacedConfigMapsRequest request);

    /**
     * @param request the request parameters of ListPublishedServices  ListPublishedServicesRequest
     * @return ListPublishedServicesResponse
     */
    CompletableFuture<ListPublishedServicesResponse> listPublishedServices(ListPublishedServicesRequest request);

    /**
     * @param request the request parameters of ListSecrets  ListSecretsRequest
     * @return ListSecretsResponse
     */
    CompletableFuture<ListSecretsResponse> listSecrets(ListSecretsRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Query the list of web application instances.</p>
     * 
     * @param request the request parameters of ListWebApplicationInstances  ListWebApplicationInstancesRequest
     * @return ListWebApplicationInstancesResponse
     */
    CompletableFuture<ListWebApplicationInstancesResponse> listWebApplicationInstances(ListWebApplicationInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Query the list of web application versions.</p>
     * 
     * @param request the request parameters of ListWebApplicationRevisions  ListWebApplicationRevisionsRequest
     * @return ListWebApplicationRevisionsResponse
     */
    CompletableFuture<ListWebApplicationRevisionsResponse> listWebApplicationRevisions(ListWebApplicationRevisionsRequest request);

    /**
     * <b>description</b> :
     * <p>Call the ListWebApplications operation to query the list of web applications.</p>
     * 
     * @param request the request parameters of ListWebApplications  ListWebApplicationsRequest
     * @return ListWebApplicationsResponse
     */
    CompletableFuture<ListWebApplicationsResponse> listWebApplications(ListWebApplicationsRequest request);

    /**
     * <b>description</b> :
     * <p>Query available custom domain names.</p>
     * 
     * @param request the request parameters of ListWebCustomDomains  ListWebCustomDomainsRequest
     * @return ListWebCustomDomainsResponse
     */
    CompletableFuture<ListWebCustomDomainsResponse> listWebCustomDomains(ListWebCustomDomainsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Make sure that your account balance is greater than 0. Otherwise, the SAE service cannot be activated.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OpenSaeService  OpenSaeServiceRequest
     * @return OpenSaeServiceResponse
     */
    CompletableFuture<OpenSaeServiceResponse> openSaeService(OpenSaeServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Publish a web application version. You can change the configurations of the version and create a new version.</p>
     * 
     * @param request the request parameters of PublishWebApplicationRevision  PublishWebApplicationRevisionRequest
     * @return PublishWebApplicationRevisionResponse
     */
    CompletableFuture<PublishWebApplicationRevisionResponse> publishWebApplicationRevision(PublishWebApplicationRevisionRequest request);

    /**
     * @param request the request parameters of QueryResourceStatics  QueryResourceStaticsRequest
     * @return QueryResourceStaticsResponse
     */
    CompletableFuture<QueryResourceStaticsResponse> queryResourceStatics(QueryResourceStaticsRequest request);

    /**
     * @param request the request parameters of ReduceApplicationCapacityByInstanceIds  ReduceApplicationCapacityByInstanceIdsRequest
     * @return ReduceApplicationCapacityByInstanceIdsResponse
     */
    CompletableFuture<ReduceApplicationCapacityByInstanceIdsResponse> reduceApplicationCapacityByInstanceIds(ReduceApplicationCapacityByInstanceIdsRequest request);

    /**
     * @param request the request parameters of RescaleApplication  RescaleApplicationRequest
     * @return RescaleApplicationResponse
     */
    CompletableFuture<RescaleApplicationResponse> rescaleApplication(RescaleApplicationRequest request);

    /**
     * @param request the request parameters of RescaleApplicationVertically  RescaleApplicationVerticallyRequest
     * @return RescaleApplicationVerticallyResponse
     */
    CompletableFuture<RescaleApplicationVerticallyResponse> rescaleApplicationVertically(RescaleApplicationVerticallyRequest request);

    /**
     * @param request the request parameters of RestartApplication  RestartApplicationRequest
     * @return RestartApplicationResponse
     */
    CompletableFuture<RestartApplicationResponse> restartApplication(RestartApplicationRequest request);

    /**
     * @param request the request parameters of RestartInstances  RestartInstancesRequest
     * @return RestartInstancesResponse
     */
    CompletableFuture<RestartInstancesResponse> restartInstances(RestartInstancesRequest request);

    /**
     * @param request the request parameters of RollbackApplication  RollbackApplicationRequest
     * @return RollbackApplicationResponse
     */
    CompletableFuture<RollbackApplicationResponse> rollbackApplication(RollbackApplicationRequest request);

    /**
     * @param request the request parameters of StartApplication  StartApplicationRequest
     * @return StartApplicationResponse
     */
    CompletableFuture<StartApplicationResponse> startApplication(StartApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>Call the StartWebApplication operation to start a web application.</p>
     * 
     * @param request the request parameters of StartWebApplication  StartWebApplicationRequest
     * @return StartWebApplicationResponse
     */
    CompletableFuture<StartWebApplicationResponse> startWebApplication(StartWebApplicationRequest request);

    /**
     * @param request the request parameters of StopApplication  StopApplicationRequest
     * @return StopApplicationResponse
     */
    CompletableFuture<StopApplicationResponse> stopApplication(StopApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>Call the StopWebApplication operation to stop a web application.</p>
     * 
     * @param request the request parameters of StopWebApplication  StopWebApplicationRequest
     * @return StopWebApplicationResponse
     */
    CompletableFuture<StopWebApplicationResponse> stopWebApplication(StopWebApplicationRequest request);

    /**
     * @param request the request parameters of SuspendJob  SuspendJobRequest
     * @return SuspendJobResponse
     */
    CompletableFuture<SuspendJobResponse> suspendJob(SuspendJobRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnbindNlb  UnbindNlbRequest
     * @return UnbindNlbResponse
     */
    CompletableFuture<UnbindNlbResponse> unbindNlb(UnbindNlbRequest request);

    /**
     * @param request the request parameters of UnbindSlb  UnbindSlbRequest
     * @return UnbindSlbResponse
     */
    CompletableFuture<UnbindSlbResponse> unbindSlb(UnbindSlbRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAppSecurityGroup  UpdateAppSecurityGroupRequest
     * @return UpdateAppSecurityGroupResponse
     */
    CompletableFuture<UpdateAppSecurityGroupResponse> updateAppSecurityGroup(UpdateAppSecurityGroupRequest request);

    /**
     * @param request the request parameters of UpdateApplicationDescription  UpdateApplicationDescriptionRequest
     * @return UpdateApplicationDescriptionResponse
     */
    CompletableFuture<UpdateApplicationDescriptionResponse> updateApplicationDescription(UpdateApplicationDescriptionRequest request);

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>If you want to configure more than 50 instances for an application, you must submit a <a href="https://workorder.console.aliyun.com/#/ticket/createIndex">ticket</a> to add your account to the whitelist.</p>
     * 
     * @param request the request parameters of UpdateApplicationScalingRule  UpdateApplicationScalingRuleRequest
     * @return UpdateApplicationScalingRuleResponse
     */
    CompletableFuture<UpdateApplicationScalingRuleResponse> updateApplicationScalingRule(UpdateApplicationScalingRuleRequest request);

    /**
     * @param request the request parameters of UpdateApplicationVswitches  UpdateApplicationVswitchesRequest
     * @return UpdateApplicationVswitchesResponse
     */
    CompletableFuture<UpdateApplicationVswitchesResponse> updateApplicationVswitches(UpdateApplicationVswitchesRequest request);

    /**
     * @param request the request parameters of UpdateConfigMap  UpdateConfigMapRequest
     * @return UpdateConfigMapResponse
     */
    CompletableFuture<UpdateConfigMapResponse> updateConfigMap(UpdateConfigMapRequest request);

    /**
     * @param request the request parameters of UpdateGreyTagRoute  UpdateGreyTagRouteRequest
     * @return UpdateGreyTagRouteResponse
     */
    CompletableFuture<UpdateGreyTagRouteResponse> updateGreyTagRoute(UpdateGreyTagRouteRequest request);

    /**
     * @param request the request parameters of UpdateIngress  UpdateIngressRequest
     * @return UpdateIngressResponse
     */
    CompletableFuture<UpdateIngressResponse> updateIngress(UpdateIngressRequest request);

    /**
     * @param request the request parameters of UpdateJob  UpdateJobRequest
     * @return UpdateJobResponse
     */
    CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request);

    /**
     * @param request the request parameters of UpdateNamespace  UpdateNamespaceRequest
     * @return UpdateNamespaceResponse
     */
    CompletableFuture<UpdateNamespaceResponse> updateNamespace(UpdateNamespaceRequest request);

    /**
     * @param request the request parameters of UpdateNamespaceVpc  UpdateNamespaceVpcRequest
     * @return UpdateNamespaceVpcResponse
     */
    CompletableFuture<UpdateNamespaceVpcResponse> updateNamespaceVpc(UpdateNamespaceVpcRequest request);

    /**
     * @param request the request parameters of UpdateSecret  UpdateSecretRequest
     * @return UpdateSecretResponse
     */
    CompletableFuture<UpdateSecretResponse> updateSecret(UpdateSecretRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the UpdateWebApplication operation to update the configuration at the web application level.</p>
     * 
     * @param request the request parameters of UpdateWebApplication  UpdateWebApplicationRequest
     * @return UpdateWebApplicationResponse
     */
    CompletableFuture<UpdateWebApplicationResponse> updateWebApplication(UpdateWebApplicationRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the UpdateWebApplicationScalingConfig operation to update the scaling configurations of a web application.</p>
     * 
     * @param request the request parameters of UpdateWebApplicationScalingConfig  UpdateWebApplicationScalingConfigRequest
     * @return UpdateWebApplicationScalingConfigResponse
     */
    CompletableFuture<UpdateWebApplicationScalingConfigResponse> updateWebApplicationScalingConfig(UpdateWebApplicationScalingConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Call the UpdateWebApplicationTrafficConfig operation to update the traffic configurations of a web application.</p>
     * 
     * @param request the request parameters of UpdateWebApplicationTrafficConfig  UpdateWebApplicationTrafficConfigRequest
     * @return UpdateWebApplicationTrafficConfigResponse
     */
    CompletableFuture<UpdateWebApplicationTrafficConfigResponse> updateWebApplicationTrafficConfig(UpdateWebApplicationTrafficConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Update a custom domain name.</p>
     * 
     * @param request the request parameters of UpdateWebCustomDomain  UpdateWebCustomDomainRequest
     * @return UpdateWebCustomDomainResponse
     */
    CompletableFuture<UpdateWebCustomDomainResponse> updateWebCustomDomain(UpdateWebCustomDomainRequest request);

    /**
     * <b>description</b> :
     * <p>You are charged when you use the ARMS advanced monitoring feature. Enable this feature based on your business requirements. For more information, see <a href="https://icms.alibaba-inc.com/content/arms/arms?l=1%5C&m=16992%5C&n=3183148">Billing overview</a>.</p>
     * 
     * @param request the request parameters of UpgradeApplicationApmService  UpgradeApplicationApmServiceRequest
     * @return UpgradeApplicationApmServiceResponse
     */
    CompletableFuture<UpgradeApplicationApmServiceResponse> upgradeApplicationApmService(UpgradeApplicationApmServiceRequest request);

}
