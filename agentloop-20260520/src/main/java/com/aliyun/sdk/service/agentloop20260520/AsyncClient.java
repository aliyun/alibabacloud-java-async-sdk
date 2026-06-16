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
     * @param request the request parameters of AddMem0Memories  AddMem0MemoriesRequest
     * @return AddMem0MemoriesResponse
     */
    CompletableFuture<AddMem0MemoriesResponse> addMem0Memories(AddMem0MemoriesRequest request);

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
     * @param request the request parameters of DeleteMem0Memories  DeleteMem0MemoriesRequest
     * @return DeleteMem0MemoriesResponse
     */
    CompletableFuture<DeleteMem0MemoriesResponse> deleteMem0Memories(DeleteMem0MemoriesRequest request);

    /**
     * @param request the request parameters of DeleteMem0Memory  DeleteMem0MemoryRequest
     * @return DeleteMem0MemoryResponse
     */
    CompletableFuture<DeleteMem0MemoryResponse> deleteMem0Memory(DeleteMem0MemoryRequest request);

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
     * @param request the request parameters of GetMem0Memories  GetMem0MemoriesRequest
     * @return GetMem0MemoriesResponse
     */
    CompletableFuture<GetMem0MemoriesResponse> getMem0Memories(GetMem0MemoriesRequest request);

    /**
     * @param request the request parameters of GetMem0Memory  GetMem0MemoryRequest
     * @return GetMem0MemoryResponse
     */
    CompletableFuture<GetMem0MemoryResponse> getMem0Memory(GetMem0MemoryRequest request);

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
     * @param request the request parameters of SearchMem0Memories  SearchMem0MemoriesRequest
     * @return SearchMem0MemoriesResponse
     */
    CompletableFuture<SearchMem0MemoriesResponse> searchMem0Memories(SearchMem0MemoriesRequest request);

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
     * @param request the request parameters of UpdateMem0Memory  UpdateMem0MemoryRequest
     * @return UpdateMem0MemoryResponse
     */
    CompletableFuture<UpdateMem0MemoryResponse> updateMem0Memory(UpdateMem0MemoryRequest request);

    /**
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request);

    /**
     * @param request the request parameters of ValidateMem0APIKey  ValidateMem0APIKeyRequest
     * @return ValidateMem0APIKeyResponse
     */
    CompletableFuture<ValidateMem0APIKeyResponse> validateMem0APIKey(ValidateMem0APIKeyRequest request);

}
