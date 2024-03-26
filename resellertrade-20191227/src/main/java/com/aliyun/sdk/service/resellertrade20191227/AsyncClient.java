// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resellertrade20191227;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.resellertrade20191227.models.*;
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

    CompletableFuture<CreateCouponTemplateResponse> createCouponTemplate(CreateCouponTemplateRequest request);

    CompletableFuture<DiscardCouponListResponse> discardCouponList(DiscardCouponListRequest request);

    CompletableFuture<GetCouponPageResponse> getCouponPage(GetCouponPageRequest request);

    CompletableFuture<GetCustomerListResponse> getCustomerList(GetCustomerListRequest request);

    CompletableFuture<GetRelationResponse> getRelation(GetRelationRequest request);

    CompletableFuture<GetResellerPayOrderResponse> getResellerPayOrder(GetResellerPayOrderRequest request);

    CompletableFuture<LabelPartnerUserResponse> labelPartnerUser(LabelPartnerUserRequest request);

    CompletableFuture<MigrateResourceResponse> migrateResource(MigrateResourceRequest request);

    CompletableFuture<OfflineActivityResponse> offlineActivity(OfflineActivityRequest request);

    CompletableFuture<PayResultCallbackResponse> payResultCallback(PayResultCallbackRequest request);

    CompletableFuture<PublicActivityResponse> publicActivity(PublicActivityRequest request);

    CompletableFuture<QueryActivityResponse> queryActivity(QueryActivityRequest request);

    CompletableFuture<QueryEcoRelationResponse> queryEcoRelation(QueryEcoRelationRequest request);

    CompletableFuture<SaveActivityResponse> saveActivity(SaveActivityRequest request);

    CompletableFuture<SendCouponResponse> sendCoupon(SendCouponRequest request);

    CompletableFuture<TransferResourceResponse> transferResource(TransferResourceRequest request);

}
