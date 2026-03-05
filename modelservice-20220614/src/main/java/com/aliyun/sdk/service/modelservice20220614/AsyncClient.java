// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelservice20220614;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.modelservice20220614.models.*;
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
     * @param request the request parameters of GetMonthAmount  GetMonthAmountRequest
     * @return GetMonthAmountResponse
     */
    CompletableFuture<GetMonthAmountResponse> getMonthAmount(GetMonthAmountRequest request);

    /**
     * @param request the request parameters of GetUser  GetUserRequest
     * @return GetUserResponse
     */
    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    /**
     * @param request the request parameters of ListDayAmount  ListDayAmountRequest
     * @return ListDayAmountResponse
     */
    CompletableFuture<ListDayAmountResponse> listDayAmount(ListDayAmountRequest request);

    /**
     * @param request the request parameters of ListRechargeBills  ListRechargeBillsRequest
     * @return ListRechargeBillsResponse
     */
    CompletableFuture<ListRechargeBillsResponse> listRechargeBills(ListRechargeBillsRequest request);

}
