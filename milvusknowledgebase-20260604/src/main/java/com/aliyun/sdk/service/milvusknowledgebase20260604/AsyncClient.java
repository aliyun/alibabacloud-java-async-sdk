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
     * <p>按问题或图片检索指定知识库。版本使用 DRAFT、LATEST_PUBLISHED 或 vN 展示名，标签过滤条件按后端实际操作符传入。</p>
     * 
     * @param request the request parameters of SearchKnowledgeBase  SearchKnowledgeBaseRequest
     * @return SearchKnowledgeBaseResponse
     */
    CompletableFuture<SearchKnowledgeBaseResponse> searchKnowledgeBase(SearchKnowledgeBaseRequest request);

}
