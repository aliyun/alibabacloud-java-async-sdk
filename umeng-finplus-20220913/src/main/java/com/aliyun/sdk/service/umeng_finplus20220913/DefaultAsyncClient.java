// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_finplus20220913;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.umeng_finplus20220913.models.*;
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
        this.version = "2022-09-13";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of BuildStsAK  BuildStsAKRequest
     * @return BuildStsAKResponse
     */
    @Override
    public CompletableFuture<BuildStsAKResponse> buildStsAK(BuildStsAKRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BuildStsAK").setMethod(HttpMethod.POST).setPathRegex("/bc/buildStsAK").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BuildStsAKResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BuildStsAKResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BuildStsAK2  BuildStsAK2Request
     * @return BuildStsAK2Response
     */
    @Override
    public CompletableFuture<BuildStsAK2Response> buildStsAK2(BuildStsAK2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BuildStsAK2").setMethod(HttpMethod.POST).setPathRegex("/bc/buildStsAK2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BuildStsAK2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BuildStsAK2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    @Override
    public CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelTask").setMethod(HttpMethod.POST).setPathRegex("/bc/cancelTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelTask2  CancelTask2Request
     * @return CancelTask2Response
     */
    @Override
    public CompletableFuture<CancelTask2Response> cancelTask2(CancelTask2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelTask2").setMethod(HttpMethod.POST).setPathRegex("/bc/cancelTask2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelTask2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelTask2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateComputeTask  CreateComputeTaskRequest
     * @return CreateComputeTaskResponse
     */
    @Override
    public CompletableFuture<CreateComputeTaskResponse> createComputeTask(CreateComputeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateComputeTask").setMethod(HttpMethod.POST).setPathRegex("/bc/createComputeTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComputeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComputeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateComputeTask2  CreateComputeTask2Request
     * @return CreateComputeTask2Response
     */
    @Override
    public CompletableFuture<CreateComputeTask2Response> createComputeTask2(CreateComputeTask2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateComputeTask2").setMethod(HttpMethod.POST).setPathRegex("/bc/createComputeTask2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateComputeTask2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateComputeTask2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataSet  CreateDataSetRequest
     * @return CreateDataSetResponse
     */
    @Override
    public CompletableFuture<CreateDataSetResponse> createDataSet(CreateDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDataSet").setMethod(HttpMethod.POST).setPathRegex("/bc/createDataSet").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateDataSet2  CreateDataSet2Request
     * @return CreateDataSet2Response
     */
    @Override
    public CompletableFuture<CreateDataSet2Response> createDataSet2(CreateDataSet2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateDataSet2").setMethod(HttpMethod.POST).setPathRegex("/bc/createDataSet2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDataSet2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDataSet2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateKnowLedge  CreateKnowLedgeRequest
     * @return CreateKnowLedgeResponse
     */
    @Override
    public CompletableFuture<CreateKnowLedgeResponse> createKnowLedge(CreateKnowLedgeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateKnowLedge").setMethod(HttpMethod.POST).setPathRegex("/yzd/createKnowLedge").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKnowLedgeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKnowLedgeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EncryptInvoke  EncryptInvokeRequest
     * @return EncryptInvokeResponse
     */
    @Override
    public CompletableFuture<EncryptInvokeResponse> encryptInvoke(EncryptInvokeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EncryptInvoke").setMethod(HttpMethod.POST).setPathRegex("/bc/encryptInvoke").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EncryptInvokeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EncryptInvokeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCrowdDataset  GetCrowdDatasetRequest
     * @return GetCrowdDatasetResponse
     */
    @Override
    public CompletableFuture<GetCrowdDatasetResponse> getCrowdDataset(GetCrowdDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCrowdDataset").setMethod(HttpMethod.POST).setPathRegex("/yzd/getCrowdDataset").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCrowdDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCrowdDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetKnowledgeData  GetKnowledgeDataRequest
     * @return GetKnowledgeDataResponse
     */
    @Override
    public CompletableFuture<GetKnowledgeDataResponse> getKnowledgeData(GetKnowledgeDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetKnowledgeData").setMethod(HttpMethod.POST).setPathRegex("/yzd/getKnowledgeData").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKnowledgeDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKnowledgeDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYzdInstanceTaskResult  GetYzdInstanceTaskResultRequest
     * @return GetYzdInstanceTaskResultResponse
     */
    @Override
    public CompletableFuture<GetYzdInstanceTaskResultResponse> getYzdInstanceTaskResult(GetYzdInstanceTaskResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetYzdInstanceTaskResult").setMethod(HttpMethod.POST).setPathRegex("/yzd/getYzdInstanceTaskResult").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYzdInstanceTaskResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYzdInstanceTaskResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetYzdStsAK  GetYzdStsAKRequest
     * @return GetYzdStsAKResponse
     */
    @Override
    public CompletableFuture<GetYzdStsAKResponse> getYzdStsAK(GetYzdStsAKRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetYzdStsAK").setMethod(HttpMethod.POST).setPathRegex("/yzd/getYzdStsAK").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetYzdStsAKResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetYzdStsAKResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListComputeTask  ListComputeTaskRequest
     * @return ListComputeTaskResponse
     */
    @Override
    public CompletableFuture<ListComputeTaskResponse> listComputeTask(ListComputeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListComputeTask").setMethod(HttpMethod.POST).setPathRegex("/bc/listComputeTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComputeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComputeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListComputeTask2  ListComputeTask2Request
     * @return ListComputeTask2Response
     */
    @Override
    public CompletableFuture<ListComputeTask2Response> listComputeTask2(ListComputeTask2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListComputeTask2").setMethod(HttpMethod.POST).setPathRegex("/bc/listComputeTask2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListComputeTask2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListComputeTask2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataSet  ListDataSetRequest
     * @return ListDataSetResponse
     */
    @Override
    public CompletableFuture<ListDataSetResponse> listDataSet(ListDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataSet").setMethod(HttpMethod.POST).setPathRegex("/bc/listDataSet").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDataSet2  ListDataSet2Request
     * @return ListDataSet2Response
     */
    @Override
    public CompletableFuture<ListDataSet2Response> listDataSet2(ListDataSet2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDataSet2").setMethod(HttpMethod.POST).setPathRegex("/bc/listDataSet2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDataSet2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDataSet2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveDataSet  RemoveDataSetRequest
     * @return RemoveDataSetResponse
     */
    @Override
    public CompletableFuture<RemoveDataSetResponse> removeDataSet(RemoveDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveDataSet").setMethod(HttpMethod.POST).setPathRegex("/bc/removeDataSet").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveDataSet2  RemoveDataSet2Request
     * @return RemoveDataSet2Response
     */
    @Override
    public CompletableFuture<RemoveDataSet2Response> removeDataSet2(RemoveDataSet2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveDataSet2").setMethod(HttpMethod.POST).setPathRegex("/bc/removeDataSet2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveDataSet2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveDataSet2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SaveCrowdDatasetAndBindingDataset  SaveCrowdDatasetAndBindingDatasetRequest
     * @return SaveCrowdDatasetAndBindingDatasetResponse
     */
    @Override
    public CompletableFuture<SaveCrowdDatasetAndBindingDatasetResponse> saveCrowdDatasetAndBindingDataset(SaveCrowdDatasetAndBindingDatasetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SaveCrowdDatasetAndBindingDataset").setMethod(HttpMethod.POST).setPathRegex("/yzd/saveCrowdDatasetAndBindingDataset").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SaveCrowdDatasetAndBindingDatasetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SaveCrowdDatasetAndBindingDatasetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SelectComputeTask  SelectComputeTaskRequest
     * @return SelectComputeTaskResponse
     */
    @Override
    public CompletableFuture<SelectComputeTaskResponse> selectComputeTask(SelectComputeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SelectComputeTask").setMethod(HttpMethod.POST).setPathRegex("/bc/selectComputeTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SelectComputeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SelectComputeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SelectComputeTask2  SelectComputeTask2Request
     * @return SelectComputeTask2Response
     */
    @Override
    public CompletableFuture<SelectComputeTask2Response> selectComputeTask2(SelectComputeTask2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SelectComputeTask2").setMethod(HttpMethod.POST).setPathRegex("/bc/selectComputeTask2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SelectComputeTask2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SelectComputeTask2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SelectDataSet  SelectDataSetRequest
     * @return SelectDataSetResponse
     */
    @Override
    public CompletableFuture<SelectDataSetResponse> selectDataSet(SelectDataSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SelectDataSet").setMethod(HttpMethod.POST).setPathRegex("/bc/selectDataSet").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SelectDataSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SelectDataSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SelectDataSet2  SelectDataSet2Request
     * @return SelectDataSet2Response
     */
    @Override
    public CompletableFuture<SelectDataSet2Response> selectDataSet2(SelectDataSet2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SelectDataSet2").setMethod(HttpMethod.POST).setPathRegex("/bc/selectDataSet2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SelectDataSet2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SelectDataSet2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitDataSetTask  SubmitDataSetTaskRequest
     * @return SubmitDataSetTaskResponse
     */
    @Override
    public CompletableFuture<SubmitDataSetTaskResponse> submitDataSetTask(SubmitDataSetTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitDataSetTask").setMethod(HttpMethod.POST).setPathRegex("/bc/submitDataSetTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDataSetTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDataSetTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SubmitDataSetTask2  SubmitDataSetTask2Request
     * @return SubmitDataSetTask2Response
     */
    @Override
    public CompletableFuture<SubmitDataSetTask2Response> submitDataSetTask2(SubmitDataSetTask2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SubmitDataSetTask2").setMethod(HttpMethod.POST).setPathRegex("/bc/submitDataSetTask2").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SubmitDataSetTask2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SubmitDataSetTask2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ValidateKnowLedge  ValidateKnowLedgeRequest
     * @return ValidateKnowLedgeResponse
     */
    @Override
    public CompletableFuture<ValidateKnowLedgeResponse> validateKnowLedge(ValidateKnowLedgeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ValidateKnowLedge").setMethod(HttpMethod.POST).setPathRegex("/yzd/validateKnowLedge").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ValidateKnowLedgeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ValidateKnowLedgeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
