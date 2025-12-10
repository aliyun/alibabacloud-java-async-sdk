// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paistudio20210202.models.*;
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
     * @param request the request parameters of CopyExperiment  CopyExperimentRequest
     * @return CopyExperimentResponse
     */
    CompletableFuture<CopyExperimentResponse> copyExperiment(CopyExperimentRequest request);

    /**
     * @param request the request parameters of CreateExperiment  CreateExperimentRequest
     * @return CreateExperimentResponse
     */
    CompletableFuture<CreateExperimentResponse> createExperiment(CreateExperimentRequest request);

    /**
     * @param request the request parameters of CreateExperimentFolder  CreateExperimentFolderRequest
     * @return CreateExperimentFolderResponse
     */
    CompletableFuture<CreateExperimentFolderResponse> createExperimentFolder(CreateExperimentFolderRequest request);

    /**
     * @param request the request parameters of CreateExperimentMigrateValidation  CreateExperimentMigrateValidationRequest
     * @return CreateExperimentMigrateValidationResponse
     */
    CompletableFuture<CreateExperimentMigrateValidationResponse> createExperimentMigrateValidation(CreateExperimentMigrateValidationRequest request);

    /**
     * @param request the request parameters of CreateJob  CreateJobRequest
     * @return CreateJobResponse
     */
    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    /**
     * @param request the request parameters of DeleteExperiment  DeleteExperimentRequest
     * @return DeleteExperimentResponse
     */
    CompletableFuture<DeleteExperimentResponse> deleteExperiment(DeleteExperimentRequest request);

    /**
     * @param request the request parameters of DeleteExperimentFolder  DeleteExperimentFolderRequest
     * @return DeleteExperimentFolderResponse
     */
    CompletableFuture<DeleteExperimentFolderResponse> deleteExperimentFolder(DeleteExperimentFolderRequest request);

    /**
     * @param request the request parameters of GetAlgoTree  GetAlgoTreeRequest
     * @return GetAlgoTreeResponse
     */
    CompletableFuture<GetAlgoTreeResponse> getAlgoTree(GetAlgoTreeRequest request);

    /**
     * @param request the request parameters of GetAlgorithmDef  GetAlgorithmDefRequest
     * @return GetAlgorithmDefResponse
     */
    CompletableFuture<GetAlgorithmDefResponse> getAlgorithmDef(GetAlgorithmDefRequest request);

    /**
     * @param request the request parameters of GetAlgorithmDefs  GetAlgorithmDefsRequest
     * @return GetAlgorithmDefsResponse
     */
    CompletableFuture<GetAlgorithmDefsResponse> getAlgorithmDefs(GetAlgorithmDefsRequest request);

    /**
     * @param request the request parameters of GetAlgorithmTree  GetAlgorithmTreeRequest
     * @return GetAlgorithmTreeResponse
     */
    CompletableFuture<GetAlgorithmTreeResponse> getAlgorithmTree(GetAlgorithmTreeRequest request);

    /**
     * @param request the request parameters of GetExperiment  GetExperimentRequest
     * @return GetExperimentResponse
     */
    CompletableFuture<GetExperimentResponse> getExperiment(GetExperimentRequest request);

    /**
     * @param request the request parameters of GetExperimentFolderChildren  GetExperimentFolderChildrenRequest
     * @return GetExperimentFolderChildrenResponse
     */
    CompletableFuture<GetExperimentFolderChildrenResponse> getExperimentFolderChildren(GetExperimentFolderChildrenRequest request);

    /**
     * @param request the request parameters of GetExperimentMeta  GetExperimentMetaRequest
     * @return GetExperimentMetaResponse
     */
    CompletableFuture<GetExperimentMetaResponse> getExperimentMeta(GetExperimentMetaRequest request);

    /**
     * @param request the request parameters of GetExperimentStatus  GetExperimentStatusRequest
     * @return GetExperimentStatusResponse
     */
    CompletableFuture<GetExperimentStatusResponse> getExperimentStatus(GetExperimentStatusRequest request);

    /**
     * @param request the request parameters of GetExperimentVisualizationMeta  GetExperimentVisualizationMetaRequest
     * @return GetExperimentVisualizationMetaResponse
     */
    CompletableFuture<GetExperimentVisualizationMetaResponse> getExperimentVisualizationMeta(GetExperimentVisualizationMetaRequest request);

    /**
     * @param request the request parameters of GetExperimentsStatistics  GetExperimentsStatisticsRequest
     * @return GetExperimentsStatisticsResponse
     */
    CompletableFuture<GetExperimentsStatisticsResponse> getExperimentsStatistics(GetExperimentsStatisticsRequest request);

    /**
     * @param request the request parameters of GetExperimentsUsersStatistics  GetExperimentsUsersStatisticsRequest
     * @return GetExperimentsUsersStatisticsResponse
     */
    CompletableFuture<GetExperimentsUsersStatisticsResponse> getExperimentsUsersStatistics(GetExperimentsUsersStatisticsRequest request);

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    /**
     * @param request the request parameters of GetMCTableSchema  GetMCTableSchemaRequest
     * @return GetMCTableSchemaResponse
     */
    CompletableFuture<GetMCTableSchemaResponse> getMCTableSchema(GetMCTableSchemaRequest request);

    /**
     * @param request the request parameters of GetNodeInputSchema  GetNodeInputSchemaRequest
     * @return GetNodeInputSchemaResponse
     */
    CompletableFuture<GetNodeInputSchemaResponse> getNodeInputSchema(GetNodeInputSchemaRequest request);

    /**
     * @param request the request parameters of GetNodeOutput  GetNodeOutputRequest
     * @return GetNodeOutputResponse
     */
    CompletableFuture<GetNodeOutputResponse> getNodeOutput(GetNodeOutputRequest request);

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @param request the request parameters of ListAuthRoles  ListAuthRolesRequest
     * @return ListAuthRolesResponse
     */
    CompletableFuture<ListAuthRolesResponse> listAuthRoles(ListAuthRolesRequest request);

    /**
     * @param request the request parameters of ListExperiments  ListExperimentsRequest
     * @return ListExperimentsResponse
     */
    CompletableFuture<ListExperimentsResponse> listExperiments(ListExperimentsRequest request);

    /**
     * @param request the request parameters of ListImageLabels  ListImageLabelsRequest
     * @return ListImageLabelsResponse
     */
    CompletableFuture<ListImageLabelsResponse> listImageLabels(ListImageLabelsRequest request);

    /**
     * @param request the request parameters of ListImages  ListImagesRequest
     * @return ListImagesResponse
     */
    CompletableFuture<ListImagesResponse> listImages(ListImagesRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListNodeOutputs  ListNodeOutputsRequest
     * @return ListNodeOutputsResponse
     */
    CompletableFuture<ListNodeOutputsResponse> listNodeOutputs(ListNodeOutputsRequest request);

    /**
     * @param request the request parameters of ListRecentExperiments  ListRecentExperimentsRequest
     * @return ListRecentExperimentsResponse
     */
    CompletableFuture<ListRecentExperimentsResponse> listRecentExperiments(ListRecentExperimentsRequest request);

    /**
     * @param request the request parameters of ListTemplates  ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    CompletableFuture<ListTemplatesResponse> listTemplates(ListTemplatesRequest request);

    /**
     * @param request the request parameters of MigrateExperimentFolders  MigrateExperimentFoldersRequest
     * @return MigrateExperimentFoldersResponse
     */
    CompletableFuture<MigrateExperimentFoldersResponse> migrateExperimentFolders(MigrateExperimentFoldersRequest request);

    /**
     * @param request the request parameters of MigrateExperiments  MigrateExperimentsRequest
     * @return MigrateExperimentsResponse
     */
    CompletableFuture<MigrateExperimentsResponse> migrateExperiments(MigrateExperimentsRequest request);

    /**
     * @param request the request parameters of PreviewMCTable  PreviewMCTableRequest
     * @return PreviewMCTableResponse
     */
    CompletableFuture<PreviewMCTableResponse> previewMCTable(PreviewMCTableRequest request);

    /**
     * @param request the request parameters of PublishExperiment  PublishExperimentRequest
     * @return PublishExperimentResponse
     */
    CompletableFuture<PublishExperimentResponse> publishExperiment(PublishExperimentRequest request);

    /**
     * @param request the request parameters of QueryExperimentVisualizationData  QueryExperimentVisualizationDataRequest
     * @return QueryExperimentVisualizationDataResponse
     */
    CompletableFuture<QueryExperimentVisualizationDataResponse> queryExperimentVisualizationData(QueryExperimentVisualizationDataRequest request);

    /**
     * @param request the request parameters of SearchMCTables  SearchMCTablesRequest
     * @return SearchMCTablesResponse
     */
    CompletableFuture<SearchMCTablesResponse> searchMCTables(SearchMCTablesRequest request);

    /**
     * @param request the request parameters of StopExperiment  StopExperimentRequest
     * @return StopExperimentResponse
     */
    CompletableFuture<StopExperimentResponse> stopExperiment(StopExperimentRequest request);

    /**
     * @param request the request parameters of StopJob  StopJobRequest
     * @return StopJobResponse
     */
    CompletableFuture<StopJobResponse> stopJob(StopJobRequest request);

    /**
     * @param request the request parameters of UpdateExperimentContent  UpdateExperimentContentRequest
     * @return UpdateExperimentContentResponse
     */
    CompletableFuture<UpdateExperimentContentResponse> updateExperimentContent(UpdateExperimentContentRequest request);

    /**
     * @param request the request parameters of UpdateExperimentFolder  UpdateExperimentFolderRequest
     * @return UpdateExperimentFolderResponse
     */
    CompletableFuture<UpdateExperimentFolderResponse> updateExperimentFolder(UpdateExperimentFolderRequest request);

    /**
     * @param request the request parameters of UpdateExperimentMeta  UpdateExperimentMetaRequest
     * @return UpdateExperimentMetaResponse
     */
    CompletableFuture<UpdateExperimentMetaResponse> updateExperimentMeta(UpdateExperimentMetaRequest request);

}
