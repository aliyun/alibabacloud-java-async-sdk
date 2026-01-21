// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bsn20150512;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.bsn20150512.models.*;
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
     * @param request the request parameters of GetBsnByResource  GetBsnByResourceRequest
     * @return GetBsnByResourceResponse
     */
    CompletableFuture<GetBsnByResourceResponse> getBsnByResource(GetBsnByResourceRequest request);

    /**
     * @param request the request parameters of GrantBsnCode  GrantBsnCodeRequest
     * @return GrantBsnCodeResponse
     */
    CompletableFuture<GrantBsnCodeResponse> grantBsnCode(GrantBsnCodeRequest request);

    /**
     * @param request the request parameters of ProductBindBsn  ProductBindBsnRequest
     * @return ProductBindBsnResponse
     */
    CompletableFuture<ProductBindBsnResponse> productBindBsn(ProductBindBsnRequest request);

}
