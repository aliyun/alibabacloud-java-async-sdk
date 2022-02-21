// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp20180408;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.nlp20180408.models.*;
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

    CompletableFuture<EntityResponse> entity(EntityRequest request);

    CompletableFuture<IEResponse> iE(IERequest request);

    CompletableFuture<KWEResponse> kWE(KWERequest request);

    CompletableFuture<ReviewAnalysisResponse> reviewAnalysis(ReviewAnalysisRequest request);

    CompletableFuture<SentimentResponse> sentiment(SentimentRequest request);

    CompletableFuture<TextStructureResponse> textStructure(TextStructureRequest request);

    CompletableFuture<TranslateResponse> translate(TranslateRequest request);

    CompletableFuture<WordPosResponse> wordPos(WordPosRequest request);

    CompletableFuture<WordSegmentResponse> wordSegment(WordSegmentRequest request);

}
