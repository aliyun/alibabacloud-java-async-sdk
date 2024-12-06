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
