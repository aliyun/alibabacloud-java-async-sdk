// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20211130;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.umeng_finplus20211130.models.*;
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
        this.product = "umeng-finplus";
        this.version = "2021-11-30";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<CancelComputeTaskByBcIdResponse> cancelComputeTaskByBcId(CancelComputeTaskByBcIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelComputeTaskByBcId").setMethod(HttpMethod.POST).setPathRegex("/batch_compute/cancelComputeTaskByBcId").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelComputeTaskByBcIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelComputeTaskByBcIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateComputeTaskByDataSetIdResponse> createComputeTaskByDataSetId(CreateComputeTaskByDataSetIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateComputeTaskByDataSetId").setMethod(HttpMethod.POST).setPathRegex("/batch_compute/createComputeTaskByDataSetId").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComputeTaskByDataSetIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComputeTaskByDataSetIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateComputeTaskByMultiDataSetIdResponse> createComputeTaskByMultiDataSetId(CreateComputeTaskByMultiDataSetIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateComputeTaskByMultiDataSetId").setMethod(HttpMethod.POST).setPathRegex("/batch_compute/createComputeTaskByMultiDataSetId").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComputeTaskByMultiDataSetIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComputeTaskByMultiDataSetIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetAvailableDataSetListResponse> getAvailableDataSetList(GetAvailableDataSetListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAvailableDataSetList").setMethod(HttpMethod.GET).setPathRegex("/batch_compute/getAvailableDataSetList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAvailableDataSetListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAvailableDataSetListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetComputeResultResponse> getComputeResult(GetComputeResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetComputeResult").setMethod(HttpMethod.GET).setPathRegex("/batch_compute/getComputeTaskResult").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetComputeResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetComputeResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDataSetStatusResponse> getDataSetStatus(GetDataSetStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDataSetStatus").setMethod(HttpMethod.GET).setPathRegex("/batch_compute/getDataSetStatus").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataSetStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataSetStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDataSetStsAKResponse> getDataSetStsAK(GetDataSetStsAKRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDataSetStsAK").setMethod(HttpMethod.GET).setPathRegex("/batch_compute/getDataSetStsAk").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDataSetStsAKResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDataSetStsAKResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SubmitDataSetTaskResponse> submitDataSetTask(SubmitDataSetTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitDataSetTask").setMethod(HttpMethod.POST).setPathRegex("/batch_compute/submitDataSetTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDataSetTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDataSetTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelYydTaskByBcIdResponse> cancelYydTaskByBcId(CancelYydTaskByBcIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("cancelYydTaskByBcId").setMethod(HttpMethod.POST).setPathRegex("/batch_compute/yyd/task/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelYydTaskByBcIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelYydTaskByBcIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateYydComputeTaskResponse> createYydComputeTask(CreateYydComputeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("createYydComputeTask").setMethod(HttpMethod.POST).setPathRegex("/batch_compute/yyd/task/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateYydComputeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateYydComputeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateYydDataSetResponse> createYydDataSet(CreateYydDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("createYydDataSet").setMethod(HttpMethod.POST).setPathRegex("/batch_compute/yyd/dataset/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateYydDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateYydDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListYydComputeTaskListResponse> listYydComputeTaskList(ListYydComputeTaskListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("listYydComputeTaskList").setMethod(HttpMethod.POST).setPathRegex("/batch_compute/yyd/task/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListYydComputeTaskListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListYydComputeTaskListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListYydDataSetResponse> listYydDataSet(ListYydDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("listYydDataSet").setMethod(HttpMethod.POST).setPathRegex("/batch_compute/yyd/dataset/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListYydDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListYydDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
