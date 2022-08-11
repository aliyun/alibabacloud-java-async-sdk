// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.xgippop20220520.models.*;
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

    CompletableFuture<ChangeApplicationInfoResponse> changeApplicationInfo(ChangeApplicationInfoRequest request);

    CompletableFuture<CreateApplicationInfoResponse> createApplicationInfo(CreateApplicationInfoRequest request);

    CompletableFuture<GetAliyunXgipTokenResponse> getAliyunXgipToken(GetAliyunXgipTokenRequest request);

    CompletableFuture<GetApplicationResponse> getApplication(GetApplicationRequest request);

    CompletableFuture<GetFreeFlowInstanceResponse> getFreeFlowInstance(GetFreeFlowInstanceRequest request);

    CompletableFuture<GetFreeFlowProductListResponse> getFreeFlowProductList(GetFreeFlowProductListRequest request);

    CompletableFuture<GetFreeFlowUsageResponse> getFreeFlowUsage(GetFreeFlowUsageRequest request);

    CompletableFuture<GetFreeFlowUsageStatisticResponse> getFreeFlowUsageStatistic(GetFreeFlowUsageStatisticRequest request);

    CompletableFuture<GetItemListResponse> getItemList(GetItemListRequest request);

    CompletableFuture<GetOrderFreeFlowProductStatusResponse> getOrderFreeFlowProductStatus(GetOrderFreeFlowProductStatusRequest request);

    CompletableFuture<GetQosFlowUsageResponse> getQosFlowUsage(GetQosFlowUsageRequest request);

    CompletableFuture<GetQosUsageStatisticResponse> getQosUsageStatistic(GetQosUsageStatisticRequest request);

    CompletableFuture<GetUatDataListResponse> getUatDataList(GetUatDataListRequest request);

    CompletableFuture<GetUatSpecCtDataResponse> getUatSpecCtData(GetUatSpecCtDataRequest request);

    CompletableFuture<MockGetOrderFreeFlowProductStatusResponse> mockGetOrderFreeFlowProductStatus(MockGetOrderFreeFlowProductStatusRequest request);

    CompletableFuture<MockOrderFreeFlowProductResponse> mockOrderFreeFlowProduct(MockOrderFreeFlowProductRequest request);

    CompletableFuture<ModifyApplicationResponse> modifyApplication(ModifyApplicationRequest request);

    CompletableFuture<OrderFreeFlowProductResponse> orderFreeFlowProduct(OrderFreeFlowProductRequest request);

    CompletableFuture<OrderQosProductResponse> orderQosProduct(OrderQosProductRequest request);

    CompletableFuture<SaveApplicationInfoResponse> saveApplicationInfo(SaveApplicationInfoRequest request);

    CompletableFuture<SdkOrderQosProductResponse> sdkOrderQosProduct(SdkOrderQosProductRequest request);

    CompletableFuture<SdkValidateStatusResponse> sdkValidateStatus(SdkValidateStatusRequest request);

    CompletableFuture<ValidControllerAuthorResponse> validControllerAuthor(ValidControllerAuthorRequest request);

    CompletableFuture<ValidateStatusResponse> validateStatus(ValidateStatusRequest request);

}
