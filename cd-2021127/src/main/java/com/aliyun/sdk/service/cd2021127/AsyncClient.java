// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cd2021127.models.*;
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
     * @param request the request parameters of AddProductImage  AddProductImageRequest
     * @return AddProductImageResponse
     */
    CompletableFuture<AddProductImageResponse> addProductImage(AddProductImageRequest request);

    /**
     * @param request the request parameters of AddShopToGroup  AddShopToGroupRequest
     * @return AddShopToGroupResponse
     */
    CompletableFuture<AddShopToGroupResponse> addShopToGroup(AddShopToGroupRequest request);

    /**
     * @param request the request parameters of AddShopsToGroup  AddShopsToGroupRequest
     * @return AddShopsToGroupResponse
     */
    CompletableFuture<AddShopsToGroupResponse> addShopsToGroup(AddShopsToGroupRequest request);

    /**
     * @param request the request parameters of BaiLianSseChat  BaiLianSseChatRequest
     * @return BaiLianSseChatResponse
     */
    CompletableFuture<BaiLianSseChatResponse> baiLianSseChat(BaiLianSseChatRequest request);

    ResponseIterable<BaiLianSseChatResponseBody> baiLianSseChatWithResponseIterable(BaiLianSseChatRequest request);

    /**
     * @param request the request parameters of BatchCreateShop  BatchCreateShopRequest
     * @return BatchCreateShopResponse
     */
    CompletableFuture<BatchCreateShopResponse> batchCreateShop(BatchCreateShopRequest request);

    /**
     * @param request the request parameters of BatchCreateShopGroup  BatchCreateShopGroupRequest
     * @return BatchCreateShopGroupResponse
     */
    CompletableFuture<BatchCreateShopGroupResponse> batchCreateShopGroup(BatchCreateShopGroupRequest request);

    /**
     * @param request the request parameters of BatchGetStoreTextData  BatchGetStoreTextDataRequest
     * @return BatchGetStoreTextDataResponse
     */
    CompletableFuture<BatchGetStoreTextDataResponse> batchGetStoreTextData(BatchGetStoreTextDataRequest request);

    /**
     * @param request the request parameters of BatchUpdateStoreTextData  BatchUpdateStoreTextDataRequest
     * @return BatchUpdateStoreTextDataResponse
     */
    CompletableFuture<BatchUpdateStoreTextDataResponse> batchUpdateStoreTextData(BatchUpdateStoreTextDataRequest request);

    /**
     * @param request the request parameters of CreateLabel  CreateLabelRequest
     * @return CreateLabelResponse
     */
    CompletableFuture<CreateLabelResponse> createLabel(CreateLabelRequest request);

    /**
     * @param request the request parameters of CreateMenuData  CreateMenuDataRequest
     * @return CreateMenuDataResponse
     */
    CompletableFuture<CreateMenuDataResponse> createMenuData(CreateMenuDataRequest request);

    /**
     * @param request the request parameters of CreateShop  CreateShopRequest
     * @return CreateShopResponse
     */
    CompletableFuture<CreateShopResponse> createShop(CreateShopRequest request);

    /**
     * @param request the request parameters of CreateShopGroup  CreateShopGroupRequest
     * @return CreateShopGroupResponse
     */
    CompletableFuture<CreateShopGroupResponse> createShopGroup(CreateShopGroupRequest request);

    /**
     * @param request the request parameters of CreateSpeechTemplate  CreateSpeechTemplateRequest
     * @return CreateSpeechTemplateResponse
     */
    CompletableFuture<CreateSpeechTemplateResponse> createSpeechTemplate(CreateSpeechTemplateRequest request);

    /**
     * @param request the request parameters of DeleteLabel  DeleteLabelRequest
     * @return DeleteLabelResponse
     */
    CompletableFuture<DeleteLabelResponse> deleteLabel(DeleteLabelRequest request);

    /**
     * @param request the request parameters of DeleteProductImage  DeleteProductImageRequest
     * @return DeleteProductImageResponse
     */
    CompletableFuture<DeleteProductImageResponse> deleteProductImage(DeleteProductImageRequest request);

    /**
     * @param request the request parameters of DeleteShop  DeleteShopRequest
     * @return DeleteShopResponse
     */
    CompletableFuture<DeleteShopResponse> deleteShop(DeleteShopRequest request);

    /**
     * @param request the request parameters of DeleteShopGroup  DeleteShopGroupRequest
     * @return DeleteShopGroupResponse
     */
    CompletableFuture<DeleteShopGroupResponse> deleteShopGroup(DeleteShopGroupRequest request);

    /**
     * @param request the request parameters of DeleteSpeechTemplate  DeleteSpeechTemplateRequest
     * @return DeleteSpeechTemplateResponse
     */
    CompletableFuture<DeleteSpeechTemplateResponse> deleteSpeechTemplate(DeleteSpeechTemplateRequest request);

    /**
     * @param request the request parameters of GetMenuDataStatus  GetMenuDataStatusRequest
     * @return GetMenuDataStatusResponse
     */
    CompletableFuture<GetMenuDataStatusResponse> getMenuDataStatus(GetMenuDataStatusRequest request);

    /**
     * @param request the request parameters of GetShop  GetShopRequest
     * @return GetShopResponse
     */
    CompletableFuture<GetShopResponse> getShop(GetShopRequest request);

    /**
     * @param request the request parameters of GetShopGroup  GetShopGroupRequest
     * @return GetShopGroupResponse
     */
    CompletableFuture<GetShopGroupResponse> getShopGroup(GetShopGroupRequest request);

    /**
     * @param request the request parameters of GetSpeechTemplate  GetSpeechTemplateRequest
     * @return GetSpeechTemplateResponse
     */
    CompletableFuture<GetSpeechTemplateResponse> getSpeechTemplate(GetSpeechTemplateRequest request);

    /**
     * @param request the request parameters of ListMenuData  ListMenuDataRequest
     * @return ListMenuDataResponse
     */
    CompletableFuture<ListMenuDataResponse> listMenuData(ListMenuDataRequest request);

    /**
     * @param request the request parameters of ListShop  ListShopRequest
     * @return ListShopResponse
     */
    CompletableFuture<ListShopResponse> listShop(ListShopRequest request);

    /**
     * @param request the request parameters of ListShopGroup  ListShopGroupRequest
     * @return ListShopGroupResponse
     */
    CompletableFuture<ListShopGroupResponse> listShopGroup(ListShopGroupRequest request);

    /**
     * @param request the request parameters of PushStoreSpeechData  PushStoreSpeechDataRequest
     * @return PushStoreSpeechDataResponse
     */
    CompletableFuture<PushStoreSpeechDataResponse> pushStoreSpeechData(PushStoreSpeechDataRequest request);

    /**
     * @param request the request parameters of QueryDeviceDataList  QueryDeviceDataListRequest
     * @return QueryDeviceDataListResponse
     */
    CompletableFuture<QueryDeviceDataListResponse> queryDeviceDataList(QueryDeviceDataListRequest request);

    /**
     * @param request the request parameters of QueryFaultBriefList  QueryFaultBriefListRequest
     * @return QueryFaultBriefListResponse
     */
    CompletableFuture<QueryFaultBriefListResponse> queryFaultBriefList(QueryFaultBriefListRequest request);

    /**
     * @param request the request parameters of QueryFaultDeviceList  QueryFaultDeviceListRequest
     * @return QueryFaultDeviceListResponse
     */
    CompletableFuture<QueryFaultDeviceListResponse> queryFaultDeviceList(QueryFaultDeviceListRequest request);

    /**
     * @param request the request parameters of QueryLabel  QueryLabelRequest
     * @return QueryLabelResponse
     */
    CompletableFuture<QueryLabelResponse> queryLabel(QueryLabelRequest request);

    /**
     * @param request the request parameters of QueryOperationIndex  QueryOperationIndexRequest
     * @return QueryOperationIndexResponse
     */
    CompletableFuture<QueryOperationIndexResponse> queryOperationIndex(QueryOperationIndexRequest request);

    /**
     * @param request the request parameters of QueryShopIndex  QueryShopIndexRequest
     * @return QueryShopIndexResponse
     */
    CompletableFuture<QueryShopIndexResponse> queryShopIndex(QueryShopIndexRequest request);

    /**
     * @param request the request parameters of QueryTicketList  QueryTicketListRequest
     * @return QueryTicketListResponse
     */
    CompletableFuture<QueryTicketListResponse> queryTicketList(QueryTicketListRequest request);

    /**
     * @param request the request parameters of RemoveShopFromGroup  RemoveShopFromGroupRequest
     * @return RemoveShopFromGroupResponse
     */
    CompletableFuture<RemoveShopFromGroupResponse> removeShopFromGroup(RemoveShopFromGroupRequest request);

    /**
     * @param request the request parameters of RemoveShopsFromGroup  RemoveShopsFromGroupRequest
     * @return RemoveShopsFromGroupResponse
     */
    CompletableFuture<RemoveShopsFromGroupResponse> removeShopsFromGroup(RemoveShopsFromGroupRequest request);

    /**
     * @param request the request parameters of UpdateLabel  UpdateLabelRequest
     * @return UpdateLabelResponse
     */
    CompletableFuture<UpdateLabelResponse> updateLabel(UpdateLabelRequest request);

    /**
     * @param request the request parameters of UpdateShop  UpdateShopRequest
     * @return UpdateShopResponse
     */
    CompletableFuture<UpdateShopResponse> updateShop(UpdateShopRequest request);

    /**
     * @param request the request parameters of UpdateShopGroup  UpdateShopGroupRequest
     * @return UpdateShopGroupResponse
     */
    CompletableFuture<UpdateShopGroupResponse> updateShopGroup(UpdateShopGroupRequest request);

    /**
     * @param request the request parameters of UpdateSpeechTemplate  UpdateSpeechTemplateRequest
     * @return UpdateSpeechTemplateResponse
     */
    CompletableFuture<UpdateSpeechTemplateResponse> updateSpeechTemplate(UpdateSpeechTemplateRequest request);

}
