// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkedmall20230930.models.*;
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
     * @param request the request parameters of CancelRefundOrder  CancelRefundOrderRequest
     * @return CancelRefundOrderResponse
     */
    CompletableFuture<CancelRefundOrderResponse> cancelRefundOrder(CancelRefundOrderRequest request);

    /**
     * @param request the request parameters of ConfirmDisburse  ConfirmDisburseRequest
     * @return ConfirmDisburseResponse
     */
    CompletableFuture<ConfirmDisburseResponse> confirmDisburse(ConfirmDisburseRequest request);

    /**
     * @param request the request parameters of CreateGoodsShippingNotice  CreateGoodsShippingNoticeRequest
     * @return CreateGoodsShippingNoticeResponse
     */
    CompletableFuture<CreateGoodsShippingNoticeResponse> createGoodsShippingNotice(CreateGoodsShippingNoticeRequest request);

    /**
     * @param request the request parameters of CreatePurchaseOrder  CreatePurchaseOrderRequest
     * @return CreatePurchaseOrderResponse
     */
    CompletableFuture<CreatePurchaseOrderResponse> createPurchaseOrder(CreatePurchaseOrderRequest request);

    /**
     * @param request the request parameters of CreateRefundOrder  CreateRefundOrderRequest
     * @return CreateRefundOrderResponse
     */
    CompletableFuture<CreateRefundOrderResponse> createRefundOrder(CreateRefundOrderRequest request);

    /**
     * @param request the request parameters of GetOrder  GetOrderRequest
     * @return GetOrderResponse
     */
    CompletableFuture<GetOrderResponse> getOrder(GetOrderRequest request);

    /**
     * @param request the request parameters of GetPurchaseOrderStatus  GetPurchaseOrderStatusRequest
     * @return GetPurchaseOrderStatusResponse
     */
    CompletableFuture<GetPurchaseOrderStatusResponse> getPurchaseOrderStatus(GetPurchaseOrderStatusRequest request);

    /**
     * @param request the request parameters of GetPurchaserShop  GetPurchaserShopRequest
     * @return GetPurchaserShopResponse
     */
    CompletableFuture<GetPurchaserShopResponse> getPurchaserShop(GetPurchaserShopRequest request);

    /**
     * @param request the request parameters of GetRefundOrder  GetRefundOrderRequest
     * @return GetRefundOrderResponse
     */
    CompletableFuture<GetRefundOrderResponse> getRefundOrder(GetRefundOrderRequest request);

    /**
     * @param request the request parameters of GetSelectionProduct  GetSelectionProductRequest
     * @return GetSelectionProductResponse
     */
    CompletableFuture<GetSelectionProductResponse> getSelectionProduct(GetSelectionProductRequest request);

    /**
     * @param request the request parameters of GetSelectionProductSaleInfo  GetSelectionProductSaleInfoRequest
     * @return GetSelectionProductSaleInfoResponse
     */
    CompletableFuture<GetSelectionProductSaleInfoResponse> getSelectionProductSaleInfo(GetSelectionProductSaleInfoRequest request);

    /**
     * @param request the request parameters of ListCategories  ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request);

    /**
     * @param request the request parameters of ListLogisticsOrders  ListLogisticsOrdersRequest
     * @return ListLogisticsOrdersResponse
     */
    CompletableFuture<ListLogisticsOrdersResponse> listLogisticsOrders(ListLogisticsOrdersRequest request);

    /**
     * @param request the request parameters of ListPurchaserShops  ListPurchaserShopsRequest
     * @return ListPurchaserShopsResponse
     */
    CompletableFuture<ListPurchaserShopsResponse> listPurchaserShops(ListPurchaserShopsRequest request);

    /**
     * @param request the request parameters of ListSelectionProductSaleInfos  ListSelectionProductSaleInfosRequest
     * @return ListSelectionProductSaleInfosResponse
     */
    CompletableFuture<ListSelectionProductSaleInfosResponse> listSelectionProductSaleInfos(ListSelectionProductSaleInfosRequest request);

    /**
     * @param request the request parameters of ListSelectionProducts  ListSelectionProductsRequest
     * @return ListSelectionProductsResponse
     */
    CompletableFuture<ListSelectionProductsResponse> listSelectionProducts(ListSelectionProductsRequest request);

    /**
     * @param request the request parameters of ListSelectionSkuSaleInfos  ListSelectionSkuSaleInfosRequest
     * @return ListSelectionSkuSaleInfosResponse
     */
    CompletableFuture<ListSelectionSkuSaleInfosResponse> listSelectionSkuSaleInfos(ListSelectionSkuSaleInfosRequest request);

    /**
     * @param request the request parameters of QueryChildDivisionCode  QueryChildDivisionCodeRequest
     * @return QueryChildDivisionCodeResponse
     */
    CompletableFuture<QueryChildDivisionCodeResponse> queryChildDivisionCode(QueryChildDivisionCodeRequest request);

    /**
     * @param request the request parameters of QueryOrders  QueryOrdersRequest
     * @return QueryOrdersResponse
     */
    CompletableFuture<QueryOrdersResponse> queryOrders(QueryOrdersRequest request);

    /**
     * @param request the request parameters of RenderPurchaseOrder  RenderPurchaseOrderRequest
     * @return RenderPurchaseOrderResponse
     */
    CompletableFuture<RenderPurchaseOrderResponse> renderPurchaseOrder(RenderPurchaseOrderRequest request);

    /**
     * @param request the request parameters of RenderRefundOrder  RenderRefundOrderRequest
     * @return RenderRefundOrderResponse
     */
    CompletableFuture<RenderRefundOrderResponse> renderRefundOrder(RenderRefundOrderRequest request);

    /**
     * @param request the request parameters of SplitPurchaseOrder  SplitPurchaseOrderRequest
     * @return SplitPurchaseOrderResponse
     */
    CompletableFuture<SplitPurchaseOrderResponse> splitPurchaseOrder(SplitPurchaseOrderRequest request);

}
