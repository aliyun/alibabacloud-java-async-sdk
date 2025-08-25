// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acc20240402;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.acc20240402.models.*;
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
     * @param request the request parameters of CreateImageCache  CreateImageCacheRequest
     * @return CreateImageCacheResponse
     */
    CompletableFuture<CreateImageCacheResponse> createImageCache(CreateImageCacheRequest request);

    /**
     * @param request the request parameters of DeleteImageCache  DeleteImageCacheRequest
     * @return DeleteImageCacheResponse
     */
    CompletableFuture<DeleteImageCacheResponse> deleteImageCache(DeleteImageCacheRequest request);

    /**
     * @param request the request parameters of GetImageCache  GetImageCacheRequest
     * @return GetImageCacheResponse
     */
    CompletableFuture<GetImageCacheResponse> getImageCache(GetImageCacheRequest request);

    /**
     * @param request the request parameters of ListImageCaches  ListImageCachesRequest
     * @return ListImageCachesResponse
     */
    CompletableFuture<ListImageCachesResponse> listImageCaches(ListImageCachesRequest request);

}
