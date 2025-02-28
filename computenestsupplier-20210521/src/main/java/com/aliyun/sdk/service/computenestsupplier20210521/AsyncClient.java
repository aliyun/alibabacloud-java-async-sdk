// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.computenestsupplier20210521.models.*;
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
     * @param request the request parameters of AddServiceSharedAccounts  AddServiceSharedAccountsRequest
     * @return AddServiceSharedAccountsResponse
     */
    CompletableFuture<AddServiceSharedAccountsResponse> addServiceSharedAccounts(AddServiceSharedAccountsRequest request);

    /**
     * @param request the request parameters of ApproveServiceUsage  ApproveServiceUsageRequest
     * @return ApproveServiceUsageResponse
     */
    CompletableFuture<ApproveServiceUsageResponse> approveServiceUsage(ApproveServiceUsageRequest request);

    /**
     * <b>description</b> :
     * <p>Only service registration in the Submitted status can be canceled.</p>
     * 
     * @param request the request parameters of CancelServiceRegistration  CancelServiceRegistrationRequest
     * @return CancelServiceRegistrationResponse
     */
    CompletableFuture<CancelServiceRegistrationResponse> cancelServiceRegistration(CancelServiceRegistrationRequest request);

    /**
     * @param request the request parameters of ContinueDeployServiceInstance  ContinueDeployServiceInstanceRequest
     * @return ContinueDeployServiceInstanceResponse
     */
    CompletableFuture<ContinueDeployServiceInstanceResponse> continueDeployServiceInstance(ContinueDeployServiceInstanceRequest request);

    /**
     * @param request the request parameters of CreateArtifact  CreateArtifactRequest
     * @return CreateArtifactResponse
     */
    CompletableFuture<CreateArtifactResponse> createArtifact(CreateArtifactRequest request);

    /**
     * @param request the request parameters of CreateService  CreateServiceRequest
     * @return CreateServiceResponse
     */
    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    /**
     * @param request the request parameters of CreateServiceInstance  CreateServiceInstanceRequest
     * @return CreateServiceInstanceResponse
     */
    CompletableFuture<CreateServiceInstanceResponse> createServiceInstance(CreateServiceInstanceRequest request);

    /**
     * @param request the request parameters of CreateServiceTestCase  CreateServiceTestCaseRequest
     * @return CreateServiceTestCaseResponse
     */
    CompletableFuture<CreateServiceTestCaseResponse> createServiceTestCase(CreateServiceTestCaseRequest request);

    /**
     * @param request the request parameters of CreateServiceTestTask  CreateServiceTestTaskRequest
     * @return CreateServiceTestTaskResponse
     */
    CompletableFuture<CreateServiceTestTaskResponse> createServiceTestTask(CreateServiceTestTaskRequest request);

    /**
     * @param request the request parameters of CreateServiceUsage  CreateServiceUsageRequest
     * @return CreateServiceUsageResponse
     */
    CompletableFuture<CreateServiceUsageResponse> createServiceUsage(CreateServiceUsageRequest request);

    /**
     * @param request the request parameters of CreateSupplierRegistration  CreateSupplierRegistrationRequest
     * @return CreateSupplierRegistrationResponse
     */
    CompletableFuture<CreateSupplierRegistrationResponse> createSupplierRegistration(CreateSupplierRegistrationRequest request);

    /**
     * @param request the request parameters of DeleteArtifact  DeleteArtifactRequest
     * @return DeleteArtifactResponse
     */
    CompletableFuture<DeleteArtifactResponse> deleteArtifact(DeleteArtifactRequest request);

    /**
     * @param request the request parameters of DeleteService  DeleteServiceRequest
     * @return DeleteServiceResponse
     */
    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    /**
     * @param request the request parameters of DeleteServiceInstances  DeleteServiceInstancesRequest
     * @return DeleteServiceInstancesResponse
     */
    CompletableFuture<DeleteServiceInstancesResponse> deleteServiceInstances(DeleteServiceInstancesRequest request);

    /**
     * @param request the request parameters of DeleteServiceTestCase  DeleteServiceTestCaseRequest
     * @return DeleteServiceTestCaseResponse
     */
    CompletableFuture<DeleteServiceTestCaseResponse> deleteServiceTestCase(DeleteServiceTestCaseRequest request);

    /**
     * @param request the request parameters of DeployServiceInstance  DeployServiceInstanceRequest
     * @return DeployServiceInstanceResponse
     */
    CompletableFuture<DeployServiceInstanceResponse> deployServiceInstance(DeployServiceInstanceRequest request);

    /**
     * @param request the request parameters of GenerateDefaultServiceTestConfig  GenerateDefaultServiceTestConfigRequest
     * @return GenerateDefaultServiceTestConfigResponse
     */
    CompletableFuture<GenerateDefaultServiceTestConfigResponse> generateDefaultServiceTestConfig(GenerateDefaultServiceTestConfigRequest request);

    /**
     * @param request the request parameters of GenerateServicePolicy  GenerateServicePolicyRequest
     * @return GenerateServicePolicyResponse
     */
    CompletableFuture<GenerateServicePolicyResponse> generateServicePolicy(GenerateServicePolicyRequest request);

    /**
     * @param request the request parameters of GetArtifact  GetArtifactRequest
     * @return GetArtifactResponse
     */
    CompletableFuture<GetArtifactResponse> getArtifact(GetArtifactRequest request);

    /**
     * @param request the request parameters of GetArtifactRepositoryCredentials  GetArtifactRepositoryCredentialsRequest
     * @return GetArtifactRepositoryCredentialsResponse
     */
    CompletableFuture<GetArtifactRepositoryCredentialsResponse> getArtifactRepositoryCredentials(GetArtifactRepositoryCredentialsRequest request);

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
     * @param request the request parameters of GetServiceProvisions  GetServiceProvisionsRequest
     * @return GetServiceProvisionsResponse
     */
    CompletableFuture<GetServiceProvisionsResponse> getServiceProvisions(GetServiceProvisionsRequest request);

    /**
     * @param request the request parameters of GetServiceRegistration  GetServiceRegistrationRequest
     * @return GetServiceRegistrationResponse
     */
    CompletableFuture<GetServiceRegistrationResponse> getServiceRegistration(GetServiceRegistrationRequest request);

    /**
     * @param request the request parameters of GetServiceTemplateParameterConstraints  GetServiceTemplateParameterConstraintsRequest
     * @return GetServiceTemplateParameterConstraintsResponse
     */
    CompletableFuture<GetServiceTemplateParameterConstraintsResponse> getServiceTemplateParameterConstraints(GetServiceTemplateParameterConstraintsRequest request);

    /**
     * @param request the request parameters of GetServiceTestTask  GetServiceTestTaskRequest
     * @return GetServiceTestTaskResponse
     */
    CompletableFuture<GetServiceTestTaskResponse> getServiceTestTask(GetServiceTestTaskRequest request);

    /**
     * @param request the request parameters of GetSupplierInformation  GetSupplierInformationRequest
     * @return GetSupplierInformationResponse
     */
    CompletableFuture<GetSupplierInformationResponse> getSupplierInformation(GetSupplierInformationRequest request);

    /**
     * @param request the request parameters of GetUploadCredentials  GetUploadCredentialsRequest
     * @return GetUploadCredentialsResponse
     */
    CompletableFuture<GetUploadCredentialsResponse> getUploadCredentials(GetUploadCredentialsRequest request);

    /**
     * @param request the request parameters of LaunchService  LaunchServiceRequest
     * @return LaunchServiceResponse
     */
    CompletableFuture<LaunchServiceResponse> launchService(LaunchServiceRequest request);

    /**
     * @param request the request parameters of ListAcrImageRepositories  ListAcrImageRepositoriesRequest
     * @return ListAcrImageRepositoriesResponse
     */
    CompletableFuture<ListAcrImageRepositoriesResponse> listAcrImageRepositories(ListAcrImageRepositoriesRequest request);

    /**
     * @param request the request parameters of ListAcrImageTags  ListAcrImageTagsRequest
     * @return ListAcrImageTagsResponse
     */
    CompletableFuture<ListAcrImageTagsResponse> listAcrImageTags(ListAcrImageTagsRequest request);

    /**
     * @param request the request parameters of ListArtifactRisks  ListArtifactRisksRequest
     * @return ListArtifactRisksResponse
     */
    CompletableFuture<ListArtifactRisksResponse> listArtifactRisks(ListArtifactRisksRequest request);

    /**
     * @param request the request parameters of ListArtifactVersions  ListArtifactVersionsRequest
     * @return ListArtifactVersionsResponse
     */
    CompletableFuture<ListArtifactVersionsResponse> listArtifactVersions(ListArtifactVersionsRequest request);

    /**
     * @param request the request parameters of ListArtifacts  ListArtifactsRequest
     * @return ListArtifactsResponse
     */
    CompletableFuture<ListArtifactsResponse> listArtifacts(ListArtifactsRequest request);

    /**
     * @param request the request parameters of ListServiceInstanceDeployDetails  ListServiceInstanceDeployDetailsRequest
     * @return ListServiceInstanceDeployDetailsResponse
     */
    CompletableFuture<ListServiceInstanceDeployDetailsResponse> listServiceInstanceDeployDetails(ListServiceInstanceDeployDetailsRequest request);

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
     * @param request the request parameters of ListServiceRegistrations  ListServiceRegistrationsRequest
     * @return ListServiceRegistrationsResponse
     */
    CompletableFuture<ListServiceRegistrationsResponse> listServiceRegistrations(ListServiceRegistrationsRequest request);

    /**
     * @param request the request parameters of ListServiceSharedAccounts  ListServiceSharedAccountsRequest
     * @return ListServiceSharedAccountsResponse
     */
    CompletableFuture<ListServiceSharedAccountsResponse> listServiceSharedAccounts(ListServiceSharedAccountsRequest request);

    /**
     * @param request the request parameters of ListServiceTestCases  ListServiceTestCasesRequest
     * @return ListServiceTestCasesResponse
     */
    CompletableFuture<ListServiceTestCasesResponse> listServiceTestCases(ListServiceTestCasesRequest request);

    /**
     * @param request the request parameters of ListServiceTestTaskLogs  ListServiceTestTaskLogsRequest
     * @return ListServiceTestTaskLogsResponse
     */
    CompletableFuture<ListServiceTestTaskLogsResponse> listServiceTestTaskLogs(ListServiceTestTaskLogsRequest request);

    /**
     * @param request the request parameters of ListServiceTestTasks  ListServiceTestTasksRequest
     * @return ListServiceTestTasksResponse
     */
    CompletableFuture<ListServiceTestTasksResponse> listServiceTestTasks(ListServiceTestTasksRequest request);

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
     * @param request the request parameters of ListSupplierRegistrations  ListSupplierRegistrationsRequest
     * @return ListSupplierRegistrationsResponse
     */
    CompletableFuture<ListSupplierRegistrationsResponse> listSupplierRegistrations(ListSupplierRegistrationsRequest request);

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
     * @param request the request parameters of ModifyServiceInstanceResources  ModifyServiceInstanceResourcesRequest
     * @return ModifyServiceInstanceResourcesResponse
     */
    CompletableFuture<ModifyServiceInstanceResourcesResponse> modifyServiceInstanceResources(ModifyServiceInstanceResourcesRequest request);

    /**
     * @param request the request parameters of PreLaunchService  PreLaunchServiceRequest
     * @return PreLaunchServiceResponse
     */
    CompletableFuture<PreLaunchServiceResponse> preLaunchService(PreLaunchServiceRequest request);

    /**
     * @param request the request parameters of PushMeteringData  PushMeteringDataRequest
     * @return PushMeteringDataResponse
     */
    CompletableFuture<PushMeteringDataResponse> pushMeteringData(PushMeteringDataRequest request);

    /**
     * @param request the request parameters of RegisterService  RegisterServiceRequest
     * @return RegisterServiceResponse
     */
    CompletableFuture<RegisterServiceResponse> registerService(RegisterServiceRequest request);

    /**
     * @param request the request parameters of RejectServiceUsage  RejectServiceUsageRequest
     * @return RejectServiceUsageResponse
     */
    CompletableFuture<RejectServiceUsageResponse> rejectServiceUsage(RejectServiceUsageRequest request);

    /**
     * @param request the request parameters of ReleaseArtifact  ReleaseArtifactRequest
     * @return ReleaseArtifactResponse
     */
    CompletableFuture<ReleaseArtifactResponse> releaseArtifact(ReleaseArtifactRequest request);

    /**
     * @param request the request parameters of RemoveServiceSharedAccounts  RemoveServiceSharedAccountsRequest
     * @return RemoveServiceSharedAccountsResponse
     */
    CompletableFuture<RemoveServiceSharedAccountsResponse> removeServiceSharedAccounts(RemoveServiceSharedAccountsRequest request);

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
     * @param request the request parameters of UpdateArtifact  UpdateArtifactRequest
     * @return UpdateArtifactResponse
     */
    CompletableFuture<UpdateArtifactResponse> updateArtifact(UpdateArtifactRequest request);

    /**
     * @param request the request parameters of UpdateService  UpdateServiceRequest
     * @return UpdateServiceResponse
     */
    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    /**
     * @param request the request parameters of UpdateServiceInstanceAttribute  UpdateServiceInstanceAttributeRequest
     * @return UpdateServiceInstanceAttributeResponse
     */
    CompletableFuture<UpdateServiceInstanceAttributeResponse> updateServiceInstanceAttribute(UpdateServiceInstanceAttributeRequest request);

    /**
     * @param request the request parameters of UpdateServiceInstanceSpec  UpdateServiceInstanceSpecRequest
     * @return UpdateServiceInstanceSpecResponse
     */
    CompletableFuture<UpdateServiceInstanceSpecResponse> updateServiceInstanceSpec(UpdateServiceInstanceSpecRequest request);

    /**
     * @param request the request parameters of UpdateServiceTestCase  UpdateServiceTestCaseRequest
     * @return UpdateServiceTestCaseResponse
     */
    CompletableFuture<UpdateServiceTestCaseResponse> updateServiceTestCase(UpdateServiceTestCaseRequest request);

    /**
     * @param request the request parameters of UpdateSharedAccountPermission  UpdateSharedAccountPermissionRequest
     * @return UpdateSharedAccountPermissionResponse
     */
    CompletableFuture<UpdateSharedAccountPermissionResponse> updateSharedAccountPermission(UpdateSharedAccountPermissionRequest request);

    /**
     * @param request the request parameters of UpdateSupplierInformation  UpdateSupplierInformationRequest
     * @return UpdateSupplierInformationResponse
     */
    CompletableFuture<UpdateSupplierInformationResponse> updateSupplierInformation(UpdateSupplierInformationRequest request);

    /**
     * @param request the request parameters of UpgradeServiceInstance  UpgradeServiceInstanceRequest
     * @return UpgradeServiceInstanceResponse
     */
    CompletableFuture<UpgradeServiceInstanceResponse> upgradeServiceInstance(UpgradeServiceInstanceRequest request);

    /**
     * @param request the request parameters of WithdrawService  WithdrawServiceRequest
     * @return WithdrawServiceResponse
     */
    CompletableFuture<WithdrawServiceResponse> withdrawService(WithdrawServiceRequest request);

}
