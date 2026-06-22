// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agentloop20260520.models.*;
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
     * @param request the request parameters of AddDatasetData  AddDatasetDataRequest
     * @return AddDatasetDataResponse
     */
    CompletableFuture<AddDatasetDataResponse> addDatasetData(AddDatasetDataRequest request);

    /**
     * @param request the request parameters of CreateAgentSpace  CreateAgentSpaceRequest
     * @return CreateAgentSpaceResponse
     */
    CompletableFuture<CreateAgentSpaceResponse> createAgentSpace(CreateAgentSpaceRequest request);

    /**
     * @param request the request parameters of CreateContextStore  CreateContextStoreRequest
     * @return CreateContextStoreResponse
     */
    CompletableFuture<CreateContextStoreResponse> createContextStore(CreateContextStoreRequest request);

    /**
     * @param request the request parameters of CreateContextStoreAPIKey  CreateContextStoreAPIKeyRequest
     * @return CreateContextStoreAPIKeyResponse
     */
    CompletableFuture<CreateContextStoreAPIKeyResponse> createContextStoreAPIKey(CreateContextStoreAPIKeyRequest request);

    /**
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request);

    /**
     * @param request the request parameters of DeleteAgentSpace  DeleteAgentSpaceRequest
     * @return DeleteAgentSpaceResponse
     */
    CompletableFuture<DeleteAgentSpaceResponse> deleteAgentSpace(DeleteAgentSpaceRequest request);

    /**
     * @param request the request parameters of DeleteContextStore  DeleteContextStoreRequest
     * @return DeleteContextStoreResponse
     */
    CompletableFuture<DeleteContextStoreResponse> deleteContextStore(DeleteContextStoreRequest request);

    /**
     * @param request the request parameters of DeleteContextStoreAPIKey  DeleteContextStoreAPIKeyRequest
     * @return DeleteContextStoreAPIKeyResponse
     */
    CompletableFuture<DeleteContextStoreAPIKeyResponse> deleteContextStoreAPIKey(DeleteContextStoreAPIKeyRequest request);

    /**
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request);

    /**
     * @param request the request parameters of DeletePipeline  DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of ExecuteQuery  ExecuteQueryRequest
     * @return ExecuteQueryResponse
     */
    CompletableFuture<ExecuteQueryResponse> executeQuery(ExecuteQueryRequest request);

    /**
     * @param request the request parameters of GetAgentSpace  GetAgentSpaceRequest
     * @return GetAgentSpaceResponse
     */
    CompletableFuture<GetAgentSpaceResponse> getAgentSpace(GetAgentSpaceRequest request);

    /**
     * @param request the request parameters of GetContextStore  GetContextStoreRequest
     * @return GetContextStoreResponse
     */
    CompletableFuture<GetContextStoreResponse> getContextStore(GetContextStoreRequest request);

    /**
     * @param request the request parameters of GetContextStoreAPIKey  GetContextStoreAPIKeyRequest
     * @return GetContextStoreAPIKeyResponse
     */
    CompletableFuture<GetContextStoreAPIKeyResponse> getContextStoreAPIKey(GetContextStoreAPIKeyRequest request);

    /**
     * @param request the request parameters of GetDataset  GetDatasetRequest
     * @return GetDatasetResponse
     */
    CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request);

    /**
     * @param request the request parameters of GetPipeline  GetPipelineRequest
     * @return GetPipelineResponse
     */
    CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request);

    /**
     * @param request the request parameters of ListAgentSpaces  ListAgentSpacesRequest
     * @return ListAgentSpacesResponse
     */
    CompletableFuture<ListAgentSpacesResponse> listAgentSpaces(ListAgentSpacesRequest request);

    /**
     * @param request the request parameters of ListContextStoreAPIKeys  ListContextStoreAPIKeysRequest
     * @return ListContextStoreAPIKeysResponse
     */
    CompletableFuture<ListContextStoreAPIKeysResponse> listContextStoreAPIKeys(ListContextStoreAPIKeysRequest request);

    /**
     * @param request the request parameters of ListContextStores  ListContextStoresRequest
     * @return ListContextStoresResponse
     */
    CompletableFuture<ListContextStoresResponse> listContextStores(ListContextStoresRequest request);

    /**
     * @param request the request parameters of ListDatasets  ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request);

    /**
     * @param request the request parameters of ListPipelines  ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request);

    /**
     * @param request the request parameters of SearchContext  SearchContextRequest
     * @return SearchContextResponse
     */
    CompletableFuture<SearchContextResponse> searchContext(SearchContextRequest request);

    /**
     * @param request the request parameters of UpdateAgentSpace  UpdateAgentSpaceRequest
     * @return UpdateAgentSpaceResponse
     */
    CompletableFuture<UpdateAgentSpaceResponse> updateAgentSpace(UpdateAgentSpaceRequest request);

    /**
     * @param request the request parameters of UpdateContextStore  UpdateContextStoreRequest
     * @return UpdateContextStoreResponse
     */
    CompletableFuture<UpdateContextStoreResponse> updateContextStore(UpdateContextStoreRequest request);

    /**
     * @param request the request parameters of UpdateDataset  UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request);

    /**
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

}
