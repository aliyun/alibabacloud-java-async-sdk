// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasaisearchproxy20260424;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.maasaisearchproxy20260424.models.*;
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
     * @param request the request parameters of OpenDatasetImportData  OpenDatasetImportDataRequest
     * @return OpenDatasetImportDataResponse
     */
    CompletableFuture<OpenDatasetImportDataResponse> openDatasetImportData(OpenDatasetImportDataRequest request);

    /**
     * @param request the request parameters of OpenDatasetResourceUrl  OpenDatasetResourceUrlRequest
     * @return OpenDatasetResourceUrlResponse
     */
    CompletableFuture<OpenDatasetResourceUrlResponse> openDatasetResourceUrl(OpenDatasetResourceUrlRequest request);

    /**
     * @param request the request parameters of WebSearch  WebSearchRequest
     * @return WebSearchResponse
     */
    CompletableFuture<WebSearchResponse> webSearch(WebSearchRequest request);

}
