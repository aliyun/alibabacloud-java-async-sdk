// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dataanalysisgbi20240823.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
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
        this.product = "DataAnalysisGBI";
        this.version = "2024-08-23";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of BatchDeleteSynonyms  BatchDeleteSynonymsRequest
     * @return BatchDeleteSynonymsResponse
     */
    @Override
    public CompletableFuture<BatchDeleteSynonymsResponse> batchDeleteSynonyms(BatchDeleteSynonymsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchDeleteSynonyms").setMethod(HttpMethod.POST).setPathRegex("/gbi/batchDelete/synonyms").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchDeleteSynonymsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchDeleteSynonymsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelDatasourceAuthorization  CancelDatasourceAuthorizationRequest
     * @return CancelDatasourceAuthorizationResponse
     */
    @Override
    public CompletableFuture<CancelDatasourceAuthorizationResponse> cancelDatasourceAuthorization(CancelDatasourceAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelDatasourceAuthorization").setMethod(HttpMethod.POST).setPathRegex("/gbi/cancel/datasource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelDatasourceAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelDatasourceAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateBusinessLogic  CreateBusinessLogicRequest
     * @return CreateBusinessLogicResponse
     */
    @Override
    public CompletableFuture<CreateBusinessLogicResponse> createBusinessLogic(CreateBusinessLogicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateBusinessLogic").setMethod(HttpMethod.POST).setPathRegex("/gbi/create/logic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBusinessLogicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBusinessLogicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDatasourceAuthorization  CreateDatasourceAuthorizationRequest
     * @return CreateDatasourceAuthorizationResponse
     */
    @Override
    public CompletableFuture<CreateDatasourceAuthorizationResponse> createDatasourceAuthorization(CreateDatasourceAuthorizationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDatasourceAuthorization").setMethod(HttpMethod.POST).setPathRegex("/gbi/create/datasource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDatasourceAuthorizationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDatasourceAuthorizationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSynonyms  CreateSynonymsRequest
     * @return CreateSynonymsResponse
     */
    @Override
    public CompletableFuture<CreateSynonymsResponse> createSynonyms(CreateSynonymsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSynonyms").setMethod(HttpMethod.POST).setPathRegex("/gbi/create/synonyms").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSynonymsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSynonymsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVirtualDatasourceInstance  CreateVirtualDatasourceInstanceRequest
     * @return CreateVirtualDatasourceInstanceResponse
     */
    @Override
    public CompletableFuture<CreateVirtualDatasourceInstanceResponse> createVirtualDatasourceInstance(CreateVirtualDatasourceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateVirtualDatasourceInstance").setMethod(HttpMethod.POST).setPathRegex("/gbi/virtualDatasource/createVirtualDatasourceInstance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVirtualDatasourceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVirtualDatasourceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteBusinessLogic  DeleteBusinessLogicRequest
     * @return DeleteBusinessLogicResponse
     */
    @Override
    public CompletableFuture<DeleteBusinessLogicResponse> deleteBusinessLogic(DeleteBusinessLogicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteBusinessLogic").setMethod(HttpMethod.POST).setPathRegex("/gbi/delete/logic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBusinessLogicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBusinessLogicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteColumn  DeleteColumnRequest
     * @return DeleteColumnResponse
     */
    @Override
    public CompletableFuture<DeleteColumnResponse> deleteColumn(DeleteColumnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteColumn").setMethod(HttpMethod.POST).setPathRegex("/gbi/delete/column").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteColumnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteColumnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSelectedTable  DeleteSelectedTableRequest
     * @return DeleteSelectedTableResponse
     */
    @Override
    public CompletableFuture<DeleteSelectedTableResponse> deleteSelectedTable(DeleteSelectedTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSelectedTable").setMethod(HttpMethod.POST).setPathRegex("/gbi/delete/table").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSelectedTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSelectedTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVirtualDatasourceInstance  DeleteVirtualDatasourceInstanceRequest
     * @return DeleteVirtualDatasourceInstanceResponse
     */
    @Override
    public CompletableFuture<DeleteVirtualDatasourceInstanceResponse> deleteVirtualDatasourceInstance(DeleteVirtualDatasourceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteVirtualDatasourceInstance").setMethod(HttpMethod.POST).setPathRegex("/gbi/virtualDatasource/deleteVirtualDatasourceInstance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVirtualDatasourceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVirtualDatasourceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListBusinessLogic  ListBusinessLogicRequest
     * @return ListBusinessLogicResponse
     */
    @Override
    public CompletableFuture<ListBusinessLogicResponse> listBusinessLogic(ListBusinessLogicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListBusinessLogic").setMethod(HttpMethod.POST).setPathRegex("/gbi/list/logic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBusinessLogicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBusinessLogicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListColumn  ListColumnRequest
     * @return ListColumnResponse
     */
    @Override
    public CompletableFuture<ListColumnResponse> listColumn(ListColumnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListColumn").setMethod(HttpMethod.POST).setPathRegex("/gbi/list/column").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListColumnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListColumnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnumMapping  ListEnumMappingRequest
     * @return ListEnumMappingResponse
     */
    @Override
    public CompletableFuture<ListEnumMappingResponse> listEnumMapping(ListEnumMappingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListEnumMapping").setMethod(HttpMethod.POST).setPathRegex("/gbi/list/mapping").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnumMappingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnumMappingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSelectedTables  ListSelectedTablesRequest
     * @return ListSelectedTablesResponse
     */
    @Override
    public CompletableFuture<ListSelectedTablesResponse> listSelectedTables(ListSelectedTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSelectedTables").setMethod(HttpMethod.POST).setPathRegex("/gbi/list/datasource/table").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSelectedTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSelectedTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSynonyms  ListSynonymsRequest
     * @return ListSynonymsResponse
     */
    @Override
    public CompletableFuture<ListSynonymsResponse> listSynonyms(ListSynonymsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSynonyms").setMethod(HttpMethod.POST).setPathRegex("/gbi/list/synonyms").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSynonymsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSynonymsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVirtualDatasourceInstance  ListVirtualDatasourceInstanceRequest
     * @return ListVirtualDatasourceInstanceResponse
     */
    @Override
    public CompletableFuture<ListVirtualDatasourceInstanceResponse> listVirtualDatasourceInstance(ListVirtualDatasourceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVirtualDatasourceInstance").setMethod(HttpMethod.POST).setPathRegex("/gbi/virtualDatasource/listVirtualDatasourceInstance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVirtualDatasourceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVirtualDatasourceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecoverColumn  RecoverColumnRequest
     * @return RecoverColumnResponse
     */
    @Override
    public CompletableFuture<RecoverColumnResponse> recoverColumn(RecoverColumnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RecoverColumn").setMethod(HttpMethod.POST).setPathRegex("/gbi/recover/column").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecoverColumnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecoverColumnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResyncTable  ResyncTableRequest
     * @return ResyncTableResponse
     */
    @Override
    public CompletableFuture<ResyncTableResponse> resyncTable(ResyncTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ResyncTable").setMethod(HttpMethod.POST).setPathRegex("/gbi/refresh/table").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResyncTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResyncTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RunDataAnalysis  RunDataAnalysisRequest
     * @return RunDataAnalysisResponse
     */
    @Override
    public CompletableFuture<RunDataAnalysisResponse> runDataAnalysis(RunDataAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RunDataAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/gbi/runDataAnalysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunDataAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunDataAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<RunDataAnalysisResponseBody> runDataAnalysisWithResponseIterable(RunDataAnalysisRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("RunDataAnalysis").setMethod(HttpMethod.POST).setPathRegex("/{workspaceId}/gbi/runDataAnalysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        RunDataAnalysisResponseBodyIterator iterator = RunDataAnalysisResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of SaveVirtualDatasourceDdl  SaveVirtualDatasourceDdlRequest
     * @return SaveVirtualDatasourceDdlResponse
     */
    @Override
    public CompletableFuture<SaveVirtualDatasourceDdlResponse> saveVirtualDatasourceDdl(SaveVirtualDatasourceDdlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SaveVirtualDatasourceDdl").setMethod(HttpMethod.POST).setPathRegex("/gbi/virtualDatasource/addDdl2VirtualInstance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveVirtualDatasourceDdlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveVirtualDatasourceDdlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncRemoteTables  SyncRemoteTablesRequest
     * @return SyncRemoteTablesResponse
     */
    @Override
    public CompletableFuture<SyncRemoteTablesResponse> syncRemoteTables(SyncRemoteTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncRemoteTables").setMethod(HttpMethod.POST).setPathRegex("/gbi/update/datasource/tables").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncRemoteTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncRemoteTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateBusinessLogic  UpdateBusinessLogicRequest
     * @return UpdateBusinessLogicResponse
     */
    @Override
    public CompletableFuture<UpdateBusinessLogicResponse> updateBusinessLogic(UpdateBusinessLogicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateBusinessLogic").setMethod(HttpMethod.POST).setPathRegex("/gbi/update/logic").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBusinessLogicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBusinessLogicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateColumn  UpdateColumnRequest
     * @return UpdateColumnResponse
     */
    @Override
    public CompletableFuture<UpdateColumnResponse> updateColumn(UpdateColumnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateColumn").setMethod(HttpMethod.POST).setPathRegex("/gbi/update/column").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateColumnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateColumnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEnumMapping  UpdateEnumMappingRequest
     * @return UpdateEnumMappingResponse
     */
    @Override
    public CompletableFuture<UpdateEnumMappingResponse> updateEnumMapping(UpdateEnumMappingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateEnumMapping").setMethod(HttpMethod.POST).setPathRegex("/gbi/update/mapping").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEnumMappingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEnumMappingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSynonyms  UpdateSynonymsRequest
     * @return UpdateSynonymsResponse
     */
    @Override
    public CompletableFuture<UpdateSynonymsResponse> updateSynonyms(UpdateSynonymsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSynonyms").setMethod(HttpMethod.POST).setPathRegex("/gbi/update/synonyms").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSynonymsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSynonymsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTableInfo  UpdateTableInfoRequest
     * @return UpdateTableInfoResponse
     */
    @Override
    public CompletableFuture<UpdateTableInfoResponse> updateTableInfo(UpdateTableInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateTableInfo").setMethod(HttpMethod.POST).setPathRegex("/gbi/update/table").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTableInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTableInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateVirtualDatasourceInstance  UpdateVirtualDatasourceInstanceRequest
     * @return UpdateVirtualDatasourceInstanceResponse
     */
    @Override
    public CompletableFuture<UpdateVirtualDatasourceInstanceResponse> updateVirtualDatasourceInstance(UpdateVirtualDatasourceInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateVirtualDatasourceInstance").setMethod(HttpMethod.POST).setPathRegex("/gbi/virtualDatasource/updateVirtualDatasourceInstance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVirtualDatasourceInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVirtualDatasourceInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
