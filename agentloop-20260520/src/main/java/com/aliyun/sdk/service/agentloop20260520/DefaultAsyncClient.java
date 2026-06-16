// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.agentloop20260520.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "AgentLoop";
        this.version = "2026-05-20";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddMem0Memories  AddMem0MemoriesRequest
     * @return AddMem0MemoriesResponse
     */
    @Override
    public CompletableFuture<AddMem0MemoriesResponse> addMem0Memories(AddMem0MemoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddMem0Memories").setMethod(HttpMethod.POST).setPathRegex("/v1/memories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMem0MemoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMem0MemoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAgentSpace  CreateAgentSpaceRequest
     * @return CreateAgentSpaceResponse
     */
    @Override
    public CompletableFuture<CreateAgentSpaceResponse> createAgentSpace(CreateAgentSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentSpace").setMethod(HttpMethod.POST).setPathRegex("/agentspace").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateContextStore  CreateContextStoreRequest
     * @return CreateContextStoreResponse
     */
    @Override
    public CompletableFuture<CreateContextStoreResponse> createContextStore(CreateContextStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateContextStore").setMethod(HttpMethod.POST).setPathRegex("/agentspace/{agentSpace}/contextstore").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContextStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContextStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateContextStoreAPIKey  CreateContextStoreAPIKeyRequest
     * @return CreateContextStoreAPIKeyResponse
     */
    @Override
    public CompletableFuture<CreateContextStoreAPIKeyResponse> createContextStoreAPIKey(CreateContextStoreAPIKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateContextStoreAPIKey").setMethod(HttpMethod.POST).setPathRegex("/agentspace/{agentSpace}/contextstore/{contextStoreName}/apikey").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateContextStoreAPIKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateContextStoreAPIKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataset  CreateDatasetRequest
     * @return CreateDatasetResponse
     */
    @Override
    public CompletableFuture<CreateDatasetResponse> createDataset(CreateDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDataset").setMethod(HttpMethod.POST).setPathRegex("/agentspace/{agentSpace}/dataset").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAgentSpace  DeleteAgentSpaceRequest
     * @return DeleteAgentSpaceResponse
     */
    @Override
    public CompletableFuture<DeleteAgentSpaceResponse> deleteAgentSpace(DeleteAgentSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentSpace").setMethod(HttpMethod.DELETE).setPathRegex("/agentspace/{agentSpace}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContextStore  DeleteContextStoreRequest
     * @return DeleteContextStoreResponse
     */
    @Override
    public CompletableFuture<DeleteContextStoreResponse> deleteContextStore(DeleteContextStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteContextStore").setMethod(HttpMethod.DELETE).setPathRegex("/agentspace/{agentSpace}/contextstore/{contextStoreName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContextStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContextStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteContextStoreAPIKey  DeleteContextStoreAPIKeyRequest
     * @return DeleteContextStoreAPIKeyResponse
     */
    @Override
    public CompletableFuture<DeleteContextStoreAPIKeyResponse> deleteContextStoreAPIKey(DeleteContextStoreAPIKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteContextStoreAPIKey").setMethod(HttpMethod.DELETE).setPathRegex("/agentspace/{agentSpace}/contextstore/{contextStoreName}/apikey/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteContextStoreAPIKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteContextStoreAPIKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDataset  DeleteDatasetRequest
     * @return DeleteDatasetResponse
     */
    @Override
    public CompletableFuture<DeleteDatasetResponse> deleteDataset(DeleteDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDataset").setMethod(HttpMethod.DELETE).setPathRegex("/agentspace/{agentSpace}/dataset/{datasetName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMem0Memories  DeleteMem0MemoriesRequest
     * @return DeleteMem0MemoriesResponse
     */
    @Override
    public CompletableFuture<DeleteMem0MemoriesResponse> deleteMem0Memories(DeleteMem0MemoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMem0Memories").setMethod(HttpMethod.DELETE).setPathRegex("/v1/memories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMem0MemoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMem0MemoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMem0Memory  DeleteMem0MemoryRequest
     * @return DeleteMem0MemoryResponse
     */
    @Override
    public CompletableFuture<DeleteMem0MemoryResponse> deleteMem0Memory(DeleteMem0MemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMem0Memory").setMethod(HttpMethod.DELETE).setPathRegex("/v1/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMem0MemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMem0MemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePipeline  DeletePipelineRequest
     * @return DeletePipelineResponse
     */
    @Override
    public CompletableFuture<DeletePipelineResponse> deletePipeline(DeletePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeletePipeline").setMethod(HttpMethod.DELETE).setPathRegex("/agentspace/{agentSpace}/pipeline/{pipelineName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeRegions").setMethod(HttpMethod.GET).setPathRegex("/regions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExecuteQuery  ExecuteQueryRequest
     * @return ExecuteQueryResponse
     */
    @Override
    public CompletableFuture<ExecuteQueryResponse> executeQuery(ExecuteQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExecuteQuery").setMethod(HttpMethod.POST).setPathRegex("/agentspace/{agentSpace}/dataset/{datasetName}/query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExecuteQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExecuteQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentSpace  GetAgentSpaceRequest
     * @return GetAgentSpaceResponse
     */
    @Override
    public CompletableFuture<GetAgentSpaceResponse> getAgentSpace(GetAgentSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentSpace").setMethod(HttpMethod.GET).setPathRegex("/agentspace/{agentSpace}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetContextStore  GetContextStoreRequest
     * @return GetContextStoreResponse
     */
    @Override
    public CompletableFuture<GetContextStoreResponse> getContextStore(GetContextStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetContextStore").setMethod(HttpMethod.GET).setPathRegex("/agentspace/{agentSpace}/contextstore/{contextStoreName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetContextStoreAPIKey  GetContextStoreAPIKeyRequest
     * @return GetContextStoreAPIKeyResponse
     */
    @Override
    public CompletableFuture<GetContextStoreAPIKeyResponse> getContextStoreAPIKey(GetContextStoreAPIKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetContextStoreAPIKey").setMethod(HttpMethod.GET).setPathRegex("/agentspace/{agentSpace}/contextstore/{contextStoreName}/apikey/{name}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetContextStoreAPIKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetContextStoreAPIKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDataset  GetDatasetRequest
     * @return GetDatasetResponse
     */
    @Override
    public CompletableFuture<GetDatasetResponse> getDataset(GetDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDataset").setMethod(HttpMethod.GET).setPathRegex("/agentspace/{agentSpace}/dataset/{datasetName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMem0Memories  GetMem0MemoriesRequest
     * @return GetMem0MemoriesResponse
     */
    @Override
    public CompletableFuture<GetMem0MemoriesResponse> getMem0Memories(GetMem0MemoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMem0Memories").setMethod(HttpMethod.POST).setPathRegex("/v2/memories").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMem0MemoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMem0MemoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMem0Memory  GetMem0MemoryRequest
     * @return GetMem0MemoryResponse
     */
    @Override
    public CompletableFuture<GetMem0MemoryResponse> getMem0Memory(GetMem0MemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMem0Memory").setMethod(HttpMethod.GET).setPathRegex("/v1/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMem0MemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMem0MemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPipeline  GetPipelineRequest
     * @return GetPipelineResponse
     */
    @Override
    public CompletableFuture<GetPipelineResponse> getPipeline(GetPipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetPipeline").setMethod(HttpMethod.GET).setPathRegex("/agentspace/{agentSpace}/pipeline/{pipelineName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentSpaces  ListAgentSpacesRequest
     * @return ListAgentSpacesResponse
     */
    @Override
    public CompletableFuture<ListAgentSpacesResponse> listAgentSpaces(ListAgentSpacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentSpaces").setMethod(HttpMethod.GET).setPathRegex("/agentspace").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentSpacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentSpacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListContextStoreAPIKeys  ListContextStoreAPIKeysRequest
     * @return ListContextStoreAPIKeysResponse
     */
    @Override
    public CompletableFuture<ListContextStoreAPIKeysResponse> listContextStoreAPIKeys(ListContextStoreAPIKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListContextStoreAPIKeys").setMethod(HttpMethod.GET).setPathRegex("/agentspace/{agentSpace}/contextstore/{contextStoreName}/apikey").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextStoreAPIKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextStoreAPIKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListContextStores  ListContextStoresRequest
     * @return ListContextStoresResponse
     */
    @Override
    public CompletableFuture<ListContextStoresResponse> listContextStores(ListContextStoresRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListContextStores").setMethod(HttpMethod.GET).setPathRegex("/agentspace/{agentSpace}/contextstore").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListContextStoresResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListContextStoresResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDatasets  ListDatasetsRequest
     * @return ListDatasetsResponse
     */
    @Override
    public CompletableFuture<ListDatasetsResponse> listDatasets(ListDatasetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDatasets").setMethod(HttpMethod.GET).setPathRegex("/agentspace/{agentSpace}/dataset").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDatasetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDatasetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPipelines  ListPipelinesRequest
     * @return ListPipelinesResponse
     */
    @Override
    public CompletableFuture<ListPipelinesResponse> listPipelines(ListPipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPipelines").setMethod(HttpMethod.GET).setPathRegex("/agentspace/{agentSpace}/pipeline").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchContext  SearchContextRequest
     * @return SearchContextResponse
     */
    @Override
    public CompletableFuture<SearchContextResponse> searchContext(SearchContextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchContext").setMethod(HttpMethod.POST).setPathRegex("/agentspace/{agentSpace}/contextstore/{contextStoreName}/context/search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchContextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchContextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchMem0Memories  SearchMem0MemoriesRequest
     * @return SearchMem0MemoriesResponse
     */
    @Override
    public CompletableFuture<SearchMem0MemoriesResponse> searchMem0Memories(SearchMem0MemoriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SearchMem0Memories").setMethod(HttpMethod.POST).setPathRegex("/v2/memories/search").setBodyType(BodyType.ARRAY).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchMem0MemoriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchMem0MemoriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAgentSpace  UpdateAgentSpaceRequest
     * @return UpdateAgentSpaceResponse
     */
    @Override
    public CompletableFuture<UpdateAgentSpaceResponse> updateAgentSpace(UpdateAgentSpaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentSpace").setMethod(HttpMethod.PUT).setPathRegex("/agentspace/{agentSpace}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentSpaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentSpaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateContextStore  UpdateContextStoreRequest
     * @return UpdateContextStoreResponse
     */
    @Override
    public CompletableFuture<UpdateContextStoreResponse> updateContextStore(UpdateContextStoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateContextStore").setMethod(HttpMethod.PUT).setPathRegex("/agentspace/{agentSpace}/contextstore/{contextStoreName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateContextStoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateContextStoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDataset  UpdateDatasetRequest
     * @return UpdateDatasetResponse
     */
    @Override
    public CompletableFuture<UpdateDatasetResponse> updateDataset(UpdateDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDataset").setMethod(HttpMethod.PUT).setPathRegex("/agentspace/{agentSpace}/dataset/{datasetName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMem0Memory  UpdateMem0MemoryRequest
     * @return UpdateMem0MemoryResponse
     */
    @Override
    public CompletableFuture<UpdateMem0MemoryResponse> updateMem0Memory(UpdateMem0MemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMem0Memory").setMethod(HttpMethod.PUT).setPathRegex("/v1/memories/{memoryId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMem0MemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMem0MemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdatePipeline  UpdatePipelineRequest
     * @return UpdatePipelineResponse
     */
    @Override
    public CompletableFuture<UpdatePipelineResponse> updatePipeline(UpdatePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdatePipeline").setMethod(HttpMethod.PUT).setPathRegex("/agentspace/{agentSpace}/pipeline/{pipelineName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ValidateMem0APIKey  ValidateMem0APIKeyRequest
     * @return ValidateMem0APIKeyResponse
     */
    @Override
    public CompletableFuture<ValidateMem0APIKeyResponse> validateMem0APIKey(ValidateMem0APIKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ValidateMem0APIKey").setMethod(HttpMethod.GET).setPathRegex("/v1/ping").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateMem0APIKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateMem0APIKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
