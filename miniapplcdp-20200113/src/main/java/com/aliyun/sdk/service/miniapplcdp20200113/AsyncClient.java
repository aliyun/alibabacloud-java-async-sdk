// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.miniapplcdp20200113.models.*;
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

    CompletableFuture<BatchCreateModelResponse> batchCreateModel(BatchCreateModelRequest request);

    CompletableFuture<BatchDeleteModelResponse> batchDeleteModel(BatchDeleteModelRequest request);

    CompletableFuture<BatchDeleteResourcesResponse> batchDeleteResources(BatchDeleteResourcesRequest request);

    CompletableFuture<BatchRestoreModelResponse> batchRestoreModel(BatchRestoreModelRequest request);

    CompletableFuture<CheckDomainResponse> checkDomain(CheckDomainRequest request);

    CompletableFuture<CloneAppResponse> cloneApp(CloneAppRequest request);

    CompletableFuture<CloneModelFromCommitResponse> cloneModelFromCommit(CloneModelFromCommitRequest request);

    CompletableFuture<CloneModelInModuleResponse> cloneModelInModule(CloneModelInModuleRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateCommitResponse> createCommit(CreateCommitRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateLinkEntityAndAssociationResponse> createLinkEntityAndAssociation(CreateLinkEntityAndAssociationRequest request);

    CompletableFuture<CreateModelResponse> createModel(CreateModelRequest request);

    CompletableFuture<CreateModuleResponse> createModule(CreateModuleRequest request);

    CompletableFuture<CreateModulePublishResponse> createModulePublish(CreateModulePublishRequest request);

    CompletableFuture<CreatePublishResponse> createPublish(CreatePublishRequest request);

    CompletableFuture<CreateResourceResponse> createResource(CreateResourceRequest request);

    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    CompletableFuture<DeleteCommitResponse> deleteCommit(DeleteCommitRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteModelResponse> deleteModel(DeleteModelRequest request);

    CompletableFuture<DeleteModuleResponse> deleteModule(DeleteModuleRequest request);

    CompletableFuture<DeleteResourceResponse> deleteResource(DeleteResourceRequest request);

    CompletableFuture<GenerateAppUserPasswordResponse> generateAppUserPassword(GenerateAppUserPasswordRequest request);

    CompletableFuture<GenerateAuthTokenResponse> generateAuthToken(GenerateAuthTokenRequest request);

    CompletableFuture<GenerateUploadTokenResponse> generateUploadToken(GenerateUploadTokenRequest request);

    CompletableFuture<GetAppResponse> getApp(GetAppRequest request);

    CompletableFuture<GetAppModelResponse> getAppModel(GetAppModelRequest request);

    CompletableFuture<GetAppSecretResponse> getAppSecret(GetAppSecretRequest request);

    CompletableFuture<GetArtifactResponse> getArtifact(GetArtifactRequest request);

    CompletableFuture<GetCommitResponse> getCommit(GetCommitRequest request);

    CompletableFuture<GetDefaultAppUserResponse> getDefaultAppUser(GetDefaultAppUserRequest request);

    CompletableFuture<GetDomainCnameResponse> getDomainCname(GetDomainCnameRequest request);

    CompletableFuture<GetDomainOverviewResponse> getDomainOverview(GetDomainOverviewRequest request);

    CompletableFuture<GetEnvironmentResponse> getEnvironment(GetEnvironmentRequest request);

    CompletableFuture<GetHistoryStatsResponse> getHistoryStats(GetHistoryStatsRequest request);

    CompletableFuture<GetLatestCommitResponse> getLatestCommit(GetLatestCommitRequest request);

    CompletableFuture<GetModelResponse> getModel(GetModelRequest request);

    CompletableFuture<GetModuleResponse> getModule(GetModuleRequest request);

    CompletableFuture<GetPublishResponse> getPublish(GetPublishRequest request);

    CompletableFuture<GetRealtimeStatsResponse> getRealtimeStats(GetRealtimeStatsRequest request);

    CompletableFuture<GetResourceResponse> getResource(GetResourceRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<ListAppModulesResponse> listAppModules(ListAppModulesRequest request);

    CompletableFuture<ListAppTemplatesResponse> listAppTemplates(ListAppTemplatesRequest request);

    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    CompletableFuture<ListArtifactsResponse> listArtifacts(ListArtifactsRequest request);

    CompletableFuture<ListCommitsResponse> listCommits(ListCommitsRequest request);

    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    CompletableFuture<ListEnvironmentOverviewsResponse> listEnvironmentOverviews(ListEnvironmentOverviewsRequest request);

    CompletableFuture<ListEnvironmentsResponse> listEnvironments(ListEnvironmentsRequest request);

    CompletableFuture<ListModelsResponse> listModels(ListModelsRequest request);

    CompletableFuture<ListModelsByPageResponse> listModelsByPage(ListModelsByPageRequest request);

    CompletableFuture<ListModuleDependenciesResponse> listModuleDependencies(ListModuleDependenciesRequest request);

    CompletableFuture<ListModuleModelsResponse> listModuleModels(ListModuleModelsRequest request);

    CompletableFuture<ListModulePublishVersionsResponse> listModulePublishVersions(ListModulePublishVersionsRequest request);

    CompletableFuture<ListModuleResourcesResponse> listModuleResources(ListModuleResourcesRequest request);

    CompletableFuture<ListModulesResponse> listModules(ListModulesRequest request);

    CompletableFuture<ListModulesByPageResponse> listModulesByPage(ListModulesByPageRequest request);

    CompletableFuture<ListPublishVersionsResponse> listPublishVersions(ListPublishVersionsRequest request);

    CompletableFuture<ListPublishedModulesResponse> listPublishedModules(ListPublishedModulesRequest request);

    CompletableFuture<ListPublishesResponse> listPublishes(ListPublishesRequest request);

    CompletableFuture<ListResourcesResponse> listResources(ListResourcesRequest request);

    CompletableFuture<ListResourcesByPageResponse> listResourcesByPage(ListResourcesByPageRequest request);

    CompletableFuture<ResetAppUserPasswordResponse> resetAppUserPassword(ResetAppUserPasswordRequest request);

    CompletableFuture<RestoreModelResponse> restoreModel(RestoreModelRequest request);

    CompletableFuture<RunLogicModelResponse> runLogicModel(RunLogicModelRequest request);

    CompletableFuture<SetEnvironmentDefaultDomainResponse> setEnvironmentDefaultDomain(SetEnvironmentDefaultDomainRequest request);

    CompletableFuture<StartAppServerResponse> startAppServer(StartAppServerRequest request);

    CompletableFuture<StopAppServerResponse> stopAppServer(StopAppServerRequest request);

    CompletableFuture<UpdateAppResponse> updateApp(UpdateAppRequest request);

    CompletableFuture<UpdateAppModelResponse> updateAppModel(UpdateAppModelRequest request);

    CompletableFuture<UpdateModelResponse> updateModel(UpdateModelRequest request);

    CompletableFuture<UpdateModuleResponse> updateModule(UpdateModuleRequest request);

    CompletableFuture<UpdateResourceResponse> updateResource(UpdateResourceRequest request);

    CompletableFuture<UpdateResourceContentResponse> updateResourceContent(UpdateResourceContentRequest request);

    CompletableFuture<UpdateResourceInfoResponse> updateResourceInfo(UpdateResourceInfoRequest request);

}
