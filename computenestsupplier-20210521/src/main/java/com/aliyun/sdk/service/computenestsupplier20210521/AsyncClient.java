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

    CompletableFuture<AddServiceSharedAccountsResponse> addServiceSharedAccounts(AddServiceSharedAccountsRequest request);

    CompletableFuture<ApproveServiceUsageResponse> approveServiceUsage(ApproveServiceUsageRequest request);

    CompletableFuture<ContinueDeployServiceInstanceResponse> continueDeployServiceInstance(ContinueDeployServiceInstanceRequest request);

    CompletableFuture<CreateArtifactResponse> createArtifact(CreateArtifactRequest request);

    CompletableFuture<CreateServiceResponse> createService(CreateServiceRequest request);

    CompletableFuture<CreateServiceInstanceResponse> createServiceInstance(CreateServiceInstanceRequest request);

    CompletableFuture<CreateServiceUsageResponse> createServiceUsage(CreateServiceUsageRequest request);

    CompletableFuture<DeleteArtifactResponse> deleteArtifact(DeleteArtifactRequest request);

    CompletableFuture<DeleteServiceResponse> deleteService(DeleteServiceRequest request);

    CompletableFuture<DeleteServiceInstancesResponse> deleteServiceInstances(DeleteServiceInstancesRequest request);

    CompletableFuture<DeployServiceInstanceResponse> deployServiceInstance(DeployServiceInstanceRequest request);

    CompletableFuture<GetArtifactResponse> getArtifact(GetArtifactRequest request);

    CompletableFuture<GetArtifactRepositoryCredentialsResponse> getArtifactRepositoryCredentials(GetArtifactRepositoryCredentialsRequest request);

    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    CompletableFuture<GetServiceEstimateCostResponse> getServiceEstimateCost(GetServiceEstimateCostRequest request);

    CompletableFuture<GetServiceInstanceResponse> getServiceInstance(GetServiceInstanceRequest request);

    CompletableFuture<GetServiceTemplateParameterConstraintsResponse> getServiceTemplateParameterConstraints(GetServiceTemplateParameterConstraintsRequest request);

    CompletableFuture<GetUploadCredentialsResponse> getUploadCredentials(GetUploadCredentialsRequest request);

    CompletableFuture<ListAcrImageRepositoriesResponse> listAcrImageRepositories(ListAcrImageRepositoriesRequest request);

    CompletableFuture<ListAcrImageTagsResponse> listAcrImageTags(ListAcrImageTagsRequest request);

    CompletableFuture<ListArtifactVersionsResponse> listArtifactVersions(ListArtifactVersionsRequest request);

    CompletableFuture<ListArtifactsResponse> listArtifacts(ListArtifactsRequest request);

    CompletableFuture<ListServiceCategoriesResponse> listServiceCategories(ListServiceCategoriesRequest request);

    CompletableFuture<ListServiceInstancesResponse> listServiceInstances(ListServiceInstancesRequest request);

    CompletableFuture<ListServiceSharedAccountsResponse> listServiceSharedAccounts(ListServiceSharedAccountsRequest request);

    CompletableFuture<ListServiceUsagesResponse> listServiceUsages(ListServiceUsagesRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<ModifyServiceInstanceResourcesResponse> modifyServiceInstanceResources(ModifyServiceInstanceResourcesRequest request);

    CompletableFuture<PushMeteringDataResponse> pushMeteringData(PushMeteringDataRequest request);

    CompletableFuture<RegisterServiceResponse> registerService(RegisterServiceRequest request);

    CompletableFuture<RejectServiceUsageResponse> rejectServiceUsage(RejectServiceUsageRequest request);

    CompletableFuture<ReleaseArtifactResponse> releaseArtifact(ReleaseArtifactRequest request);

    CompletableFuture<RemoveServiceSharedAccountsResponse> removeServiceSharedAccounts(RemoveServiceSharedAccountsRequest request);

    CompletableFuture<RestartServiceInstanceResponse> restartServiceInstance(RestartServiceInstanceRequest request);

    CompletableFuture<StartServiceInstanceResponse> startServiceInstance(StartServiceInstanceRequest request);

    CompletableFuture<StopServiceInstanceResponse> stopServiceInstance(StopServiceInstanceRequest request);

    CompletableFuture<UpdateArtifactResponse> updateArtifact(UpdateArtifactRequest request);

    CompletableFuture<UpdateServiceResponse> updateService(UpdateServiceRequest request);

    CompletableFuture<UpdateServiceInstanceAttributeResponse> updateServiceInstanceAttribute(UpdateServiceInstanceAttributeRequest request);

    CompletableFuture<UpdateServiceInstanceSpecResponse> updateServiceInstanceSpec(UpdateServiceInstanceSpecRequest request);

    CompletableFuture<UpgradeServiceInstanceResponse> upgradeServiceInstance(UpgradeServiceInstanceRequest request);

}
