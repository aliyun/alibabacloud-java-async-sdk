// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20220531;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkedmall20220531.models.*;
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

    CompletableFuture<ApplyCreateDistributionOrderResponse> applyCreateDistributionOrder(ApplyCreateDistributionOrderRequest request);

    CompletableFuture<ApplyRefund4DistributionResponse> applyRefund4Distribution(ApplyRefund4DistributionRequest request);

    CompletableFuture<CancelDistributionTradeResponse> cancelDistributionTrade(CancelDistributionTradeRequest request);

    CompletableFuture<CancelRefund4DistributionResponse> cancelRefund4Distribution(CancelRefund4DistributionRequest request);

    CompletableFuture<ConfirmDisburse4DistributionResponse> confirmDisburse4Distribution(ConfirmDisburse4DistributionRequest request);

    CompletableFuture<InitApplyRefund4DistributionResponse> initApplyRefund4Distribution(InitApplyRefund4DistributionRequest request);

    CompletableFuture<InitModifyRefund4DistributionResponse> initModifyRefund4Distribution(InitModifyRefund4DistributionRequest request);

    CompletableFuture<ListDistributionItemResponse> listDistributionItem(ListDistributionItemRequest request);

    CompletableFuture<ListDistributionItemWithoutCacheResponse> listDistributionItemWithoutCache(ListDistributionItemWithoutCacheRequest request);

    CompletableFuture<ListDistributionMallResponse> listDistributionMall(ListDistributionMallRequest request);

    CompletableFuture<ModifyRefund4DistributionResponse> modifyRefund4Distribution(ModifyRefund4DistributionRequest request);

    CompletableFuture<QueryChildDivisionCodeByIdResponse> queryChildDivisionCodeById(QueryChildDivisionCodeByIdRequest request);

    CompletableFuture<QueryDistributionBillDetailResponse> queryDistributionBillDetail(QueryDistributionBillDetailRequest request);

    CompletableFuture<QueryDistributionMallResponse> queryDistributionMall(QueryDistributionMallRequest request);

    CompletableFuture<QueryDistributionTradeStatusResponse> queryDistributionTradeStatus(QueryDistributionTradeStatusRequest request);

    CompletableFuture<QueryItemDetailResponse> queryItemDetail(QueryItemDetailRequest request);

    CompletableFuture<QueryItemDetailWithDivisionResponse> queryItemDetailWithDivision(QueryItemDetailWithDivisionRequest request);

    CompletableFuture<QueryItemGuideRetailPriceResponse> queryItemGuideRetailPrice(QueryItemGuideRetailPriceRequest request);

    CompletableFuture<QueryLogistics4DistributionResponse> queryLogistics4Distribution(QueryLogistics4DistributionRequest request);

    CompletableFuture<QueryMallCategoryListResponse> queryMallCategoryList(QueryMallCategoryListRequest request);

    CompletableFuture<QueryOrderDetail4DistributionResponse> queryOrderDetail4Distribution(QueryOrderDetail4DistributionRequest request);

    CompletableFuture<QueryOrderList4DistributionResponse> queryOrderList4Distribution(QueryOrderList4DistributionRequest request);

    CompletableFuture<QueryRefundApplicationDetail4DistributionResponse> queryRefundApplicationDetail4Distribution(QueryRefundApplicationDetail4DistributionRequest request);

    CompletableFuture<RenderDistributionOrderResponse> renderDistributionOrder(RenderDistributionOrderRequest request);

    CompletableFuture<SubmitReturnGoodLogistics4DistributionResponse> submitReturnGoodLogistics4Distribution(SubmitReturnGoodLogistics4DistributionRequest request);

}
