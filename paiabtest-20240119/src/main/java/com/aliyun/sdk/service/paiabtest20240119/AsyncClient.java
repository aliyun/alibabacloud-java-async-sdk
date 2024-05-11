// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paiabtest20240119.models.*;
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

    CompletableFuture<CheckLayerResponse> checkLayer(CheckLayerRequest request);

    CompletableFuture<CreateCrowdResponse> createCrowd(CreateCrowdRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    CompletableFuture<CreateExperimentResponse> createExperiment(CreateExperimentRequest request);

    CompletableFuture<CreateExperimentVersionResponse> createExperimentVersion(CreateExperimentVersionRequest request);

    CompletableFuture<CreateFeatureResponse> createFeature(CreateFeatureRequest request);

    CompletableFuture<CreateLayerResponse> createLayer(CreateLayerRequest request);

    CompletableFuture<CreateMetricResponse> createMetric(CreateMetricRequest request);

    CompletableFuture<CreateMetricGroupResponse> createMetricGroup(CreateMetricGroupRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateTableMetaResponse> createTableMeta(CreateTableMetaRequest request);

    CompletableFuture<DeleteCrowdResponse> deleteCrowd(DeleteCrowdRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request);

    CompletableFuture<DeleteExperimentVersionResponse> deleteExperimentVersion(DeleteExperimentVersionRequest request);

    CompletableFuture<DeleteFeatureResponse> deleteFeature(DeleteFeatureRequest request);

    CompletableFuture<DeleteLayerResponse> deleteLayer(DeleteLayerRequest request);

    CompletableFuture<DeleteMetricResponse> deleteMetric(DeleteMetricRequest request);

    CompletableFuture<DeleteMetricGroupResponse> deleteMetricGroup(DeleteMetricGroupRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteTableMetaResponse> deleteTableMeta(DeleteTableMetaRequest request);

    CompletableFuture<GetCrowdResponse> getCrowd(GetCrowdRequest request);

    CompletableFuture<GetDomainResponse> getDomain(GetDomainRequest request);

    CompletableFuture<GetExperimentResponse> getExperiment(GetExperimentRequest request);

    CompletableFuture<GetExperimentVersionResponse> getExperimentVersion(GetExperimentVersionRequest request);

    CompletableFuture<GetFeatureResponse> getFeature(GetFeatureRequest request);

    CompletableFuture<GetLayerResponse> getLayer(GetLayerRequest request);

    CompletableFuture<GetMetricResponse> getMetric(GetMetricRequest request);

    CompletableFuture<GetMetricGroupResponse> getMetricGroup(GetMetricGroupRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetTableMetaResponse> getTableMeta(GetTableMetaRequest request);

    CompletableFuture<ListCrowdsResponse> listCrowds(ListCrowdsRequest request);

    CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request);

    CompletableFuture<ListExperimentVersionsResponse> listExperimentVersions(ListExperimentVersionsRequest request);

    CompletableFuture<ListExperimentsResponse> listExperiments(ListExperimentsRequest request);

    CompletableFuture<ListFeaturesResponse> listFeatures(ListFeaturesRequest request);

    CompletableFuture<ListLayersResponse> listLayers(ListLayersRequest request);

    CompletableFuture<ListMetricGroupsResponse> listMetricGroups(ListMetricGroupsRequest request);

    CompletableFuture<ListMetricsResponse> listMetrics(ListMetricsRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListTableMetasResponse> listTableMetas(ListTableMetasRequest request);

    CompletableFuture<PushAllExperimentVersionResponse> pushAllExperimentVersion(PushAllExperimentVersionRequest request);

    CompletableFuture<StartExperimentResponse> startExperiment(StartExperimentRequest request);

    CompletableFuture<StopExperimentResponse> stopExperiment(StopExperimentRequest request);

    CompletableFuture<UpdateCrowdResponse> updateCrowd(UpdateCrowdRequest request);

    CompletableFuture<UpdateDomainResponse> updateDomain(UpdateDomainRequest request);

    CompletableFuture<UpdateExperimentResponse> updateExperiment(UpdateExperimentRequest request);

    CompletableFuture<UpdateExperimentVersionResponse> updateExperimentVersion(UpdateExperimentVersionRequest request);

    CompletableFuture<UpdateFeatureResponse> updateFeature(UpdateFeatureRequest request);

    CompletableFuture<UpdateLayerResponse> updateLayer(UpdateLayerRequest request);

    CompletableFuture<UpdateMetricResponse> updateMetric(UpdateMetricRequest request);

    CompletableFuture<UpdateMetricGroupResponse> updateMetricGroup(UpdateMetricGroupRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<UpdateTableMetaResponse> updateTableMeta(UpdateTableMetaRequest request);

}
