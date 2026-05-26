// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisearchengine20260417;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aisearchengine20260417.models.*;
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
     * @param request the request parameters of EngineSearch  EngineSearchRequest
     * @return EngineSearchResponse
     */
    CompletableFuture<EngineSearchResponse> engineSearch(EngineSearchRequest request);

    /**
     * @param request the request parameters of GetDatasetResourceUrl  GetDatasetResourceUrlRequest
     * @return GetDatasetResourceUrlResponse
     */
    CompletableFuture<GetDatasetResourceUrlResponse> getDatasetResourceUrl(GetDatasetResourceUrlRequest request);

    /**
     * @param request the request parameters of ImportDatasetData  ImportDatasetDataRequest
     * @return ImportDatasetDataResponse
     */
    CompletableFuture<ImportDatasetDataResponse> importDatasetData(ImportDatasetDataRequest request);

    /**
     * @param request the request parameters of QaChat  QaChatRequest
     * @return QaChatResponse
     */
    CompletableFuture<QaChatResponse> qaChat(QaChatRequest request);

    ResponseIterable<QaChatResponseBody> qaChatWithResponseIterable(QaChatRequest request);

}
