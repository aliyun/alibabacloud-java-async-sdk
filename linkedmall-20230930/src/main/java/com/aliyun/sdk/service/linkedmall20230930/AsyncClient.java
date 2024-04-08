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

    CompletableFuture<CancelRefundOrderResponse> cancelRefundOrder(CancelRefundOrderRequest request);

    CompletableFuture<ConfirmDisburseResponse> confirmDisburse(ConfirmDisburseRequest request);

    CompletableFuture<CreateGoodsShippingNoticeResponse> createGoodsShippingNotice(CreateGoodsShippingNoticeRequest request);

    CompletableFuture<CreatePurchaseOrderResponse> createPurchaseOrder(CreatePurchaseOrderRequest request);

    CompletableFuture<CreateRefundOrderResponse> createRefundOrder(CreateRefundOrderRequest request);

    CompletableFuture<GetOrderResponse> getOrder(GetOrderRequest request);

    CompletableFuture<GetPurchaseOrderStatusResponse> getPurchaseOrderStatus(GetPurchaseOrderStatusRequest request);

    CompletableFuture<GetPurchaserShopResponse> getPurchaserShop(GetPurchaserShopRequest request);

    CompletableFuture<GetRefundOrderResponse> getRefundOrder(GetRefundOrderRequest request);

    CompletableFuture<GetSelectionProductResponse> getSelectionProduct(GetSelectionProductRequest request);

    CompletableFuture<GetSelectionProductSaleInfoResponse> getSelectionProductSaleInfo(GetSelectionProductSaleInfoRequest request);

    CompletableFuture<ListCategoriesResponse> listCategories(ListCategoriesRequest request);

    CompletableFuture<ListLogisticsOrdersResponse> listLogisticsOrders(ListLogisticsOrdersRequest request);

    CompletableFuture<ListPurchaserShopsResponse> listPurchaserShops(ListPurchaserShopsRequest request);

    CompletableFuture<ListSelectionProductSaleInfosResponse> listSelectionProductSaleInfos(ListSelectionProductSaleInfosRequest request);

    CompletableFuture<ListSelectionProductsResponse> listSelectionProducts(ListSelectionProductsRequest request);

    CompletableFuture<ListSelectionSkuSaleInfosResponse> listSelectionSkuSaleInfos(ListSelectionSkuSaleInfosRequest request);

    CompletableFuture<QueryChildDivisionCodeResponse> queryChildDivisionCode(QueryChildDivisionCodeRequest request);

    CompletableFuture<QueryOrdersResponse> queryOrders(QueryOrdersRequest request);

    CompletableFuture<RenderPurchaseOrderResponse> renderPurchaseOrder(RenderPurchaseOrderRequest request);

    CompletableFuture<RenderRefundOrderResponse> renderRefundOrder(RenderRefundOrderRequest request);

}
