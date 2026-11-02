// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvusknowledgebase20260604;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.milvusknowledgebase20260604.models.*;
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
     * @param request the request parameters of AddDocuments  AddDocumentsRequest
     * @return AddDocumentsResponse
     */
    CompletableFuture<AddDocumentsResponse> addDocuments(AddDocumentsRequest request);

    /**
     * @param request the request parameters of GetKnowledgeBasePreSignedUrl  GetKnowledgeBasePreSignedUrlRequest
     * @return GetKnowledgeBasePreSignedUrlResponse
     */
    CompletableFuture<GetKnowledgeBasePreSignedUrlResponse> getKnowledgeBasePreSignedUrl(GetKnowledgeBasePreSignedUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Searches a specified knowledge base by using a query or an image. For the version, use the display name DRAFT, LATEST_PUBLISHED, or vN. Pass tag filter conditions based on the actual operators used by the backend.</p>
     * 
     * @param request the request parameters of SearchKnowledgeBase  SearchKnowledgeBaseRequest
     * @return SearchKnowledgeBaseResponse
     */
    CompletableFuture<SearchKnowledgeBaseResponse> searchKnowledgeBase(SearchKnowledgeBaseRequest request);

}
