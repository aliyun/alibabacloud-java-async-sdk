// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentretailvision20260506;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.agentretailvision20260506.models.*;
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
     * @param request the request parameters of ImportProducts  ImportProductsRequest
     * @return ImportProductsResponse
     */
    CompletableFuture<ImportProductsResponse> importProducts(ImportProductsRequest request);

    /**
     * @param request the request parameters of QueryRecognitionResult  QueryRecognitionResultRequest
     * @return QueryRecognitionResultResponse
     */
    CompletableFuture<QueryRecognitionResultResponse> queryRecognitionResult(QueryRecognitionResultRequest request);

    /**
     * @param request the request parameters of RecognizeOrder  RecognizeOrderRequest
     * @return RecognizeOrderResponse
     */
    CompletableFuture<RecognizeOrderResponse> recognizeOrder(RecognizeOrderRequest request);

    /**
     * @param request the request parameters of RegisterWebhook  RegisterWebhookRequest
     * @return RegisterWebhookResponse
     */
    CompletableFuture<RegisterWebhookResponse> registerWebhook(RegisterWebhookRequest request);

    /**
     * @param request the request parameters of UpdateProduct  UpdateProductRequest
     * @return UpdateProductResponse
     */
    CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request);

}
