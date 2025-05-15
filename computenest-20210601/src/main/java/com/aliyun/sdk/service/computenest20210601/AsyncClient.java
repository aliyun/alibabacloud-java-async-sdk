// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.computenest20210601.models.*;
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
     * @param request the request parameters of CancelServiceUsage  CancelServiceUsageRequest
     * @return CancelServiceUsageResponse
     */
    CompletableFuture<CancelServiceUsageResponse> cancelServiceUsage(CancelServiceUsageRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckServiceDeployable  CheckServiceDeployableRequest
     * @return CheckServiceDeployableResponse
     */
    CompletableFuture<CheckServiceDeployableResponse> checkServiceDeployable(CheckServiceDeployableRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only for service instances that belong to private services deployed by using Resource Orchestration Service (ROS).</p>
     * 
     * @param request the request parameters of ContinueDeployServiceInstance  ContinueDeployServiceInstanceRequest
     * @return ContinueDeployServiceInstanceResponse
     */
    CompletableFuture<ContinueDeployServiceInstanceResponse> continueDeployServiceInstance(ContinueDeployServiceInstanceRequest request);

    /**
     * @param request the request parameters of CreateServiceInstance  CreateServiceInstanceRequest
     * @return CreateServiceInstanceResponse
     */
    CompletableFuture<CreateServiceInstanceResponse> createServiceInstance(CreateServiceInstanceRequest request);

    /**
     * @param request the request parameters of CreateServiceUsage  CreateServiceUsageRequest
     * @return CreateServiceUsageResponse
     */
    CompletableFuture<CreateServiceUsageResponse> createServiceUsage(CreateServiceUsageRequest request);

    /**
     * @param request the request parameters of DeleteServiceInstances  DeleteServiceInstancesRequest
     * @return DeleteServiceInstancesResponse
     */
    CompletableFuture<DeleteServiceInstancesResponse> deleteServiceInstances(DeleteServiceInstancesRequest request);

    /**
     * @param request the request parameters of DeployServiceInstance  DeployServiceInstanceRequest
     * @return DeployServiceInstanceResponse
     */
    CompletableFuture<DeployServiceInstanceResponse> deployServiceInstance(DeployServiceInstanceRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of GenerateServicePolicy  GenerateServicePolicyRequest
     * @return GenerateServicePolicyResponse
     */
    CompletableFuture<GenerateServicePolicyResponse> generateServicePolicy(GenerateServicePolicyRequest request);

    /**
     * @param request the request parameters of GetService  GetServiceRequest
     * @return GetServiceResponse
     */
    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    /**
     * @param request the request parameters of GetServiceEstimateCost  GetServiceEstimateCostRequest
     * @return GetServiceEstimateCostResponse
     */
    CompletableFuture<GetServiceEstimateCostResponse> getServiceEstimateCost(GetServiceEstimateCostRequest request);

    /**
     * @param request the request parameters of GetServiceInstance  GetServiceInstanceRequest
     * @return GetServiceInstanceResponse
     */
    CompletableFuture<GetServiceInstanceResponse> getServiceInstance(GetServiceInstanceRequest request);

    /**
     * @param request the request parameters of GetServiceInstanceSubscriptionEstimateCost  GetServiceInstanceSubscriptionEstimateCostRequest
     * @return GetServiceInstanceSubscriptionEstimateCostResponse
     */
    CompletableFuture<GetServiceInstanceSubscriptionEstimateCostResponse> getServiceInstanceSubscriptionEstimateCost(GetServiceInstanceSubscriptionEstimateCostRequest request);

    /**
     * @param request the request parameters of GetServiceProvisions  GetServiceProvisionsRequest
     * @return GetServiceProvisionsResponse
     */
    CompletableFuture<GetServiceProvisionsResponse> getServiceProvisions(GetServiceProvisionsRequest request);

    /**
     * @param request the request parameters of GetServiceTemplateParameterConstraints  GetServiceTemplateParameterConstraintsRequest
     * @return GetServiceTemplateParameterConstraintsResponse
     */
    CompletableFuture<GetServiceTemplateParameterConstraintsResponse> getServiceTemplateParameterConstraints(GetServiceTemplateParameterConstraintsRequest request);

    /**
     * @param request the request parameters of GetUserInformation  GetUserInformationRequest
     * @return GetUserInformationResponse
     */
    CompletableFuture<GetUserInformationResponse> getUserInformation(GetUserInformationRequest request);

    /**
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request);

    /**
     * @param request the request parameters of ListServiceCategories  ListServiceCategoriesRequest
     * @return ListServiceCategoriesResponse
     */
    CompletableFuture<ListServiceCategoriesResponse> listServiceCategories(ListServiceCategoriesRequest request);

    /**
     * @param request the request parameters of ListServiceInstanceBill  ListServiceInstanceBillRequest
     * @return ListServiceInstanceBillResponse
     */
    CompletableFuture<ListServiceInstanceBillResponse> listServiceInstanceBill(ListServiceInstanceBillRequest request);

    /**
     * @param request the request parameters of ListServiceInstanceLogs  ListServiceInstanceLogsRequest
     * @return ListServiceInstanceLogsResponse
     */
    CompletableFuture<ListServiceInstanceLogsResponse> listServiceInstanceLogs(ListServiceInstanceLogsRequest request);

    /**
     * @param request the request parameters of ListServiceInstanceResources  ListServiceInstanceResourcesRequest
     * @return ListServiceInstanceResourcesResponse
     */
    CompletableFuture<ListServiceInstanceResourcesResponse> listServiceInstanceResources(ListServiceInstanceResourcesRequest request);

    /**
     * @param request the request parameters of ListServiceInstanceUpgradeHistory  ListServiceInstanceUpgradeHistoryRequest
     * @return ListServiceInstanceUpgradeHistoryResponse
     */
    CompletableFuture<ListServiceInstanceUpgradeHistoryResponse> listServiceInstanceUpgradeHistory(ListServiceInstanceUpgradeHistoryRequest request);

    /**
     * @param request the request parameters of ListServiceInstances  ListServiceInstancesRequest
     * @return ListServiceInstancesResponse
     */
    CompletableFuture<ListServiceInstancesResponse> listServiceInstances(ListServiceInstancesRequest request);

    /**
     * @param request the request parameters of ListServiceUsages  ListServiceUsagesRequest
     * @return ListServiceUsagesResponse
     */
    CompletableFuture<ListServiceUsagesResponse> listServiceUsages(ListServiceUsagesRequest request);

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
     * @param request the request parameters of RenewServiceInstanceResources  RenewServiceInstanceResourcesRequest
     * @return RenewServiceInstanceResourcesResponse
     */
    CompletableFuture<RenewServiceInstanceResourcesResponse> renewServiceInstanceResources(RenewServiceInstanceResourcesRequest request);

    /**
     * @param request the request parameters of RestartServiceInstance  RestartServiceInstanceRequest
     * @return RestartServiceInstanceResponse
     */
    CompletableFuture<RestartServiceInstanceResponse> restartServiceInstance(RestartServiceInstanceRequest request);

    /**
     * @param request the request parameters of RollbackServiceInstance  RollbackServiceInstanceRequest
     * @return RollbackServiceInstanceResponse
     */
    CompletableFuture<RollbackServiceInstanceResponse> rollbackServiceInstance(RollbackServiceInstanceRequest request);

    /**
     * @param request the request parameters of StartServiceInstance  StartServiceInstanceRequest
     * @return StartServiceInstanceResponse
     */
    CompletableFuture<StartServiceInstanceResponse> startServiceInstance(StartServiceInstanceRequest request);

    /**
     * @param request the request parameters of StopServiceInstance  StopServiceInstanceRequest
     * @return StopServiceInstanceResponse
     */
    CompletableFuture<StopServiceInstanceResponse> stopServiceInstance(StopServiceInstanceRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnTagResources  UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateServiceInstanceAttributes  UpdateServiceInstanceAttributesRequest
     * @return UpdateServiceInstanceAttributesResponse
     */
    CompletableFuture<UpdateServiceInstanceAttributesResponse> updateServiceInstanceAttributes(UpdateServiceInstanceAttributesRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Configuration change is enabled and the related parameters are configured for the service by the service provider.</p>
     * 
     * @param request the request parameters of UpdateServiceInstanceSpec  UpdateServiceInstanceSpecRequest
     * @return UpdateServiceInstanceSpecResponse
     */
    CompletableFuture<UpdateServiceInstanceSpecResponse> updateServiceInstanceSpec(UpdateServiceInstanceSpecRequest request);

    /**
     * @param request the request parameters of UpdateServiceUsage  UpdateServiceUsageRequest
     * @return UpdateServiceUsageResponse
     */
    CompletableFuture<UpdateServiceUsageResponse> updateServiceUsage(UpdateServiceUsageRequest request);

    /**
     * @param request the request parameters of UpdateUserInformation  UpdateUserInformationRequest
     * @return UpdateUserInformationResponse
     */
    CompletableFuture<UpdateUserInformationResponse> updateUserInformation(UpdateUserInformationRequest request);

    /**
     * @param request the request parameters of UpgradeServiceInstance  UpgradeServiceInstanceRequest
     * @return UpgradeServiceInstanceResponse
     */
    CompletableFuture<UpgradeServiceInstanceResponse> upgradeServiceInstance(UpgradeServiceInstanceRequest request);

}
