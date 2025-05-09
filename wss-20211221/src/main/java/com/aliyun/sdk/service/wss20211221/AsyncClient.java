// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.wss20211221.models.*;
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
     * @param request the request parameters of CreateMultiOrder  CreateMultiOrderRequest
     * @return CreateMultiOrderResponse
     */
    CompletableFuture<CreateMultiOrderResponse> createMultiOrder(CreateMultiOrderRequest request);

    /**
     * @param request the request parameters of DescribeDeliveryAddress  DescribeDeliveryAddressRequest
     * @return DescribeDeliveryAddressResponse
     */
    CompletableFuture<DescribeDeliveryAddressResponse> describeDeliveryAddress(DescribeDeliveryAddressRequest request);

    /**
     * @param request the request parameters of DescribeMultiPrice  DescribeMultiPriceRequest
     * @return DescribeMultiPriceResponse
     */
    CompletableFuture<DescribeMultiPriceResponse> describeMultiPrice(DescribeMultiPriceRequest request);

    /**
     * @param request the request parameters of DescribePackageDeductions  DescribePackageDeductionsRequest
     * @return DescribePackageDeductionsResponse
     */
    CompletableFuture<DescribePackageDeductionsResponse> describePackageDeductions(DescribePackageDeductionsRequest request);

    /**
     * @param request the request parameters of ModifyInstanceProperties  ModifyInstancePropertiesRequest
     * @return ModifyInstancePropertiesResponse
     */
    CompletableFuture<ModifyInstancePropertiesResponse> modifyInstanceProperties(ModifyInstancePropertiesRequest request);

}
