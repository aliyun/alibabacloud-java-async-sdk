// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.consolecs20160406;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.consolecs20160406.models.*;
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
     * @param request the request parameters of GetOpenApiList  GetOpenApiListRequest
     * @return GetOpenApiListResponse
     */
    CompletableFuture<GetOpenApiListResponse> getOpenApiList(GetOpenApiListRequest request);

    /**
     * @param request the request parameters of ListConsoleProduct  ListConsoleProductRequest
     * @return ListConsoleProductResponse
     */
    CompletableFuture<ListConsoleProductResponse> listConsoleProduct(ListConsoleProductRequest request);

}
