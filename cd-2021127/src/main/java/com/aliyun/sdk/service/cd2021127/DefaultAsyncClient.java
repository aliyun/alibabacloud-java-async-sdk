// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cd2021127.models.*;
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
        this.product = "cd";
        this.version = "2021-12-7";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddProductImage  AddProductImageRequest
     * @return AddProductImageResponse
     */
    @Override
    public CompletableFuture<AddProductImageResponse> addProductImage(AddProductImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddProductImage").setMethod(HttpMethod.POST).setPathRegex("/AddProductImage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddProductImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddProductImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddShopToGroup  AddShopToGroupRequest
     * @return AddShopToGroupResponse
     */
    @Override
    public CompletableFuture<AddShopToGroupResponse> addShopToGroup(AddShopToGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddShopToGroup").setMethod(HttpMethod.POST).setPathRegex("/AddShopToGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddShopToGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddShopToGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddShopsToGroup  AddShopsToGroupRequest
     * @return AddShopsToGroupResponse
     */
    @Override
    public CompletableFuture<AddShopsToGroupResponse> addShopsToGroup(AddShopsToGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddShopsToGroup").setMethod(HttpMethod.POST).setPathRegex("/AddShopsToGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddShopsToGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddShopsToGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BaiLianSseChat  BaiLianSseChatRequest
     * @return BaiLianSseChatResponse
     */
    @Override
    public CompletableFuture<BaiLianSseChatResponse> baiLianSseChat(BaiLianSseChatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BaiLianSseChat").setMethod(HttpMethod.POST).setPathRegex("/llm/sse/vqa").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BaiLianSseChatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BaiLianSseChatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<BaiLianSseChatResponseBody> baiLianSseChatWithResponseIterable(BaiLianSseChatRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("BaiLianSseChat").setMethod(HttpMethod.POST).setPathRegex("/llm/sse/vqa").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        BaiLianSseChatResponseBodyIterator iterator = BaiLianSseChatResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of BatchCreateShop  BatchCreateShopRequest
     * @return BatchCreateShopResponse
     */
    @Override
    public CompletableFuture<BatchCreateShopResponse> batchCreateShop(BatchCreateShopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchCreateShop").setMethod(HttpMethod.POST).setPathRegex("/BatchCreateShop").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateShopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateShopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchCreateShopGroup  BatchCreateShopGroupRequest
     * @return BatchCreateShopGroupResponse
     */
    @Override
    public CompletableFuture<BatchCreateShopGroupResponse> batchCreateShopGroup(BatchCreateShopGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchCreateShopGroup").setMethod(HttpMethod.POST).setPathRegex("/BatchCreateShopGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchCreateShopGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchCreateShopGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchGetStoreTextData  BatchGetStoreTextDataRequest
     * @return BatchGetStoreTextDataResponse
     */
    @Override
    public CompletableFuture<BatchGetStoreTextDataResponse> batchGetStoreTextData(BatchGetStoreTextDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchGetStoreTextData").setMethod(HttpMethod.POST).setPathRegex("/BatchGetStoreTextData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchGetStoreTextDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchGetStoreTextDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BatchUpdateStoreTextData  BatchUpdateStoreTextDataRequest
     * @return BatchUpdateStoreTextDataResponse
     */
    @Override
    public CompletableFuture<BatchUpdateStoreTextDataResponse> batchUpdateStoreTextData(BatchUpdateStoreTextDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BatchUpdateStoreTextData").setMethod(HttpMethod.POST).setPathRegex("/BatchUpdateStoreTextData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchUpdateStoreTextDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchUpdateStoreTextDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLabel  CreateLabelRequest
     * @return CreateLabelResponse
     */
    @Override
    public CompletableFuture<CreateLabelResponse> createLabel(CreateLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLabel").setMethod(HttpMethod.POST).setPathRegex("/CreateLabel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMenuData  CreateMenuDataRequest
     * @return CreateMenuDataResponse
     */
    @Override
    public CompletableFuture<CreateMenuDataResponse> createMenuData(CreateMenuDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMenuData").setMethod(HttpMethod.POST).setPathRegex("/CreateMenuData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMenuDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMenuDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateShop  CreateShopRequest
     * @return CreateShopResponse
     */
    @Override
    public CompletableFuture<CreateShopResponse> createShop(CreateShopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateShop").setMethod(HttpMethod.POST).setPathRegex("/CreateShop").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateShopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateShopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateShopGroup  CreateShopGroupRequest
     * @return CreateShopGroupResponse
     */
    @Override
    public CompletableFuture<CreateShopGroupResponse> createShopGroup(CreateShopGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateShopGroup").setMethod(HttpMethod.POST).setPathRegex("/CreateShopGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateShopGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateShopGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSpeechTemplate  CreateSpeechTemplateRequest
     * @return CreateSpeechTemplateResponse
     */
    @Override
    public CompletableFuture<CreateSpeechTemplateResponse> createSpeechTemplate(CreateSpeechTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSpeechTemplate").setMethod(HttpMethod.POST).setPathRegex("/CreateSpeechTemplate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSpeechTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSpeechTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLabel  DeleteLabelRequest
     * @return DeleteLabelResponse
     */
    @Override
    public CompletableFuture<DeleteLabelResponse> deleteLabel(DeleteLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLabel").setMethod(HttpMethod.POST).setPathRegex("/DeleteLabel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProductImage  DeleteProductImageRequest
     * @return DeleteProductImageResponse
     */
    @Override
    public CompletableFuture<DeleteProductImageResponse> deleteProductImage(DeleteProductImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteProductImage").setMethod(HttpMethod.POST).setPathRegex("/DeleteProductImage").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProductImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProductImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteShop  DeleteShopRequest
     * @return DeleteShopResponse
     */
    @Override
    public CompletableFuture<DeleteShopResponse> deleteShop(DeleteShopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteShop").setMethod(HttpMethod.POST).setPathRegex("/DeleteShop").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteShopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteShopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteShopGroup  DeleteShopGroupRequest
     * @return DeleteShopGroupResponse
     */
    @Override
    public CompletableFuture<DeleteShopGroupResponse> deleteShopGroup(DeleteShopGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteShopGroup").setMethod(HttpMethod.POST).setPathRegex("/DeleteShopGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteShopGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteShopGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSpeechTemplate  DeleteSpeechTemplateRequest
     * @return DeleteSpeechTemplateResponse
     */
    @Override
    public CompletableFuture<DeleteSpeechTemplateResponse> deleteSpeechTemplate(DeleteSpeechTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSpeechTemplate").setMethod(HttpMethod.POST).setPathRegex("/DeleteSpeechTemplate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSpeechTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSpeechTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMenuDataStatus  GetMenuDataStatusRequest
     * @return GetMenuDataStatusResponse
     */
    @Override
    public CompletableFuture<GetMenuDataStatusResponse> getMenuDataStatus(GetMenuDataStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMenuDataStatus").setMethod(HttpMethod.POST).setPathRegex("/GetMenuDataStatus").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMenuDataStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMenuDataStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetShop  GetShopRequest
     * @return GetShopResponse
     */
    @Override
    public CompletableFuture<GetShopResponse> getShop(GetShopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetShop").setMethod(HttpMethod.POST).setPathRegex("/GetShop").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetShopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetShopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetShopGroup  GetShopGroupRequest
     * @return GetShopGroupResponse
     */
    @Override
    public CompletableFuture<GetShopGroupResponse> getShopGroup(GetShopGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetShopGroup").setMethod(HttpMethod.POST).setPathRegex("/GetShopGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetShopGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetShopGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSpeechTemplate  GetSpeechTemplateRequest
     * @return GetSpeechTemplateResponse
     */
    @Override
    public CompletableFuture<GetSpeechTemplateResponse> getSpeechTemplate(GetSpeechTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSpeechTemplate").setMethod(HttpMethod.POST).setPathRegex("/GetSpeechTemplate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSpeechTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSpeechTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMenuData  ListMenuDataRequest
     * @return ListMenuDataResponse
     */
    @Override
    public CompletableFuture<ListMenuDataResponse> listMenuData(ListMenuDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMenuData").setMethod(HttpMethod.POST).setPathRegex("/ListMenuData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMenuDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMenuDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListShop  ListShopRequest
     * @return ListShopResponse
     */
    @Override
    public CompletableFuture<ListShopResponse> listShop(ListShopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListShop").setMethod(HttpMethod.POST).setPathRegex("/ListShop").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListShopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListShopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListShopGroup  ListShopGroupRequest
     * @return ListShopGroupResponse
     */
    @Override
    public CompletableFuture<ListShopGroupResponse> listShopGroup(ListShopGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListShopGroup").setMethod(HttpMethod.POST).setPathRegex("/ListShopGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListShopGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListShopGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PushStoreSpeechData  PushStoreSpeechDataRequest
     * @return PushStoreSpeechDataResponse
     */
    @Override
    public CompletableFuture<PushStoreSpeechDataResponse> pushStoreSpeechData(PushStoreSpeechDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PushStoreSpeechData").setMethod(HttpMethod.POST).setPathRegex("/PushStoreSpeechData").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PushStoreSpeechDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PushStoreSpeechDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryDeviceDataList  QueryDeviceDataListRequest
     * @return QueryDeviceDataListResponse
     */
    @Override
    public CompletableFuture<QueryDeviceDataListResponse> queryDeviceDataList(QueryDeviceDataListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryDeviceDataList").setMethod(HttpMethod.POST).setPathRegex("/QueryDeviceDataList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryDeviceDataListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryDeviceDataListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaultBriefList  QueryFaultBriefListRequest
     * @return QueryFaultBriefListResponse
     */
    @Override
    public CompletableFuture<QueryFaultBriefListResponse> queryFaultBriefList(QueryFaultBriefListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryFaultBriefList").setMethod(HttpMethod.POST).setPathRegex("/QueryFaultBriefList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaultBriefListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaultBriefListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryFaultDeviceList  QueryFaultDeviceListRequest
     * @return QueryFaultDeviceListResponse
     */
    @Override
    public CompletableFuture<QueryFaultDeviceListResponse> queryFaultDeviceList(QueryFaultDeviceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryFaultDeviceList").setMethod(HttpMethod.POST).setPathRegex("/QueryFaultDeviceList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryFaultDeviceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryFaultDeviceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryLabel  QueryLabelRequest
     * @return QueryLabelResponse
     */
    @Override
    public CompletableFuture<QueryLabelResponse> queryLabel(QueryLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryLabel").setMethod(HttpMethod.POST).setPathRegex("/QueryLabel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryOperationIndex  QueryOperationIndexRequest
     * @return QueryOperationIndexResponse
     */
    @Override
    public CompletableFuture<QueryOperationIndexResponse> queryOperationIndex(QueryOperationIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryOperationIndex").setMethod(HttpMethod.POST).setPathRegex("/QueryOperationIndex").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOperationIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOperationIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryShopIndex  QueryShopIndexRequest
     * @return QueryShopIndexResponse
     */
    @Override
    public CompletableFuture<QueryShopIndexResponse> queryShopIndex(QueryShopIndexRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryShopIndex").setMethod(HttpMethod.POST).setPathRegex("/QueryShopIndex").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryShopIndexResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryShopIndexResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTicketList  QueryTicketListRequest
     * @return QueryTicketListResponse
     */
    @Override
    public CompletableFuture<QueryTicketListResponse> queryTicketList(QueryTicketListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryTicketList").setMethod(HttpMethod.POST).setPathRegex("/QueryTicketList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTicketListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTicketListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveShopFromGroup  RemoveShopFromGroupRequest
     * @return RemoveShopFromGroupResponse
     */
    @Override
    public CompletableFuture<RemoveShopFromGroupResponse> removeShopFromGroup(RemoveShopFromGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveShopFromGroup").setMethod(HttpMethod.POST).setPathRegex("/RemoveShopFromGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveShopFromGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveShopFromGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveShopsFromGroup  RemoveShopsFromGroupRequest
     * @return RemoveShopsFromGroupResponse
     */
    @Override
    public CompletableFuture<RemoveShopsFromGroupResponse> removeShopsFromGroup(RemoveShopsFromGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RemoveShopsFromGroup").setMethod(HttpMethod.POST).setPathRegex("/RemoveShopsFromGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveShopsFromGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveShopsFromGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLabel  UpdateLabelRequest
     * @return UpdateLabelResponse
     */
    @Override
    public CompletableFuture<UpdateLabelResponse> updateLabel(UpdateLabelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLabel").setMethod(HttpMethod.POST).setPathRegex("/UpdateLabel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLabelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLabelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateShop  UpdateShopRequest
     * @return UpdateShopResponse
     */
    @Override
    public CompletableFuture<UpdateShopResponse> updateShop(UpdateShopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateShop").setMethod(HttpMethod.POST).setPathRegex("/UpdateShop").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateShopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateShopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateShopGroup  UpdateShopGroupRequest
     * @return UpdateShopGroupResponse
     */
    @Override
    public CompletableFuture<UpdateShopGroupResponse> updateShopGroup(UpdateShopGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateShopGroup").setMethod(HttpMethod.POST).setPathRegex("/UpdateShopGroup").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateShopGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateShopGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSpeechTemplate  UpdateSpeechTemplateRequest
     * @return UpdateSpeechTemplateResponse
     */
    @Override
    public CompletableFuture<UpdateSpeechTemplateResponse> updateSpeechTemplate(UpdateSpeechTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSpeechTemplate").setMethod(HttpMethod.POST).setPathRegex("/UpdateSpeechTemplate").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSpeechTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSpeechTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
