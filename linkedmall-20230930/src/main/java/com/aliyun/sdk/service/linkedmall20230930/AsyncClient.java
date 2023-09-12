// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkedmall20230930.models.*;
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

    CompletableFuture<CancelRefundOrderResponse> cancelRefundOrder(CancelRefundOrderRequest request);

    CompletableFuture<ConfirmDisburseResponse> confirmDisburse(ConfirmDisburseRequest request);

    CompletableFuture<CreateGoodsShippingNoticeResponse> createGoodsShippingNotice(CreateGoodsShippingNoticeRequest request);

    CompletableFuture<CreatePurchaseOrderResponse> createPurchaseOrder(CreatePurchaseOrderRequest request);

    CompletableFuture<CreateRefundOrderResponse> createRefundOrder(CreateRefundOrderRequest request);

    CompletableFuture<GetOrderResponse> getOrder(GetOrderRequest request);

    CompletableFuture<GetProductResponse> getProduct(GetProductRequest request);

    CompletableFuture<GetProductSaleInfoResponse> getProductSaleInfo(GetProductSaleInfoRequest request);

    CompletableFuture<GetPurchaseOrderStatusResponse> getPurchaseOrderStatus(GetPurchaseOrderStatusRequest request);

    CompletableFuture<GetRefundOrderResponse> getRefundOrder(GetRefundOrderRequest request);

    CompletableFuture<GetShopResponse> getShop(GetShopRequest request);

    CompletableFuture<ListLogisticsOrdersResponse> listLogisticsOrders(ListLogisticsOrdersRequest request);

    CompletableFuture<ListProductGeneralBillsResponse> listProductGeneralBills(ListProductGeneralBillsRequest request);

    CompletableFuture<ListProductSaleInfosResponse> listProductSaleInfos(ListProductSaleInfosRequest request);

    CompletableFuture<ListProductsResponse> listProducts(ListProductsRequest request);

    CompletableFuture<ListShopsResponse> listShops(ListShopsRequest request);

    CompletableFuture<ListSkuSaleInfosResponse> listSkuSaleInfos(ListSkuSaleInfosRequest request);

    CompletableFuture<QueryChildDivisionCodeResponse> queryChildDivisionCode(QueryChildDivisionCodeRequest request);

    CompletableFuture<QueryOrdersResponse> queryOrders(QueryOrdersRequest request);

    CompletableFuture<RenderPurchaseOrderResponse> renderPurchaseOrder(RenderPurchaseOrderRequest request);

    CompletableFuture<RenderRefundOrderResponse> renderRefundOrder(RenderRefundOrderRequest request);

}
