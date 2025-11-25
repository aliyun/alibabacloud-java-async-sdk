// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.anytrans20250707;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.anytrans20250707.models.*;
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
     * @param request the request parameters of BatchTranslate  BatchTranslateRequest
     * @return BatchTranslateResponse
     */
    CompletableFuture<BatchTranslateResponse> batchTranslate(BatchTranslateRequest request);

    /**
     * @param request the request parameters of BatchTranslateForHtml  BatchTranslateForHtmlRequest
     * @return BatchTranslateForHtmlResponse
     */
    CompletableFuture<BatchTranslateForHtmlResponse> batchTranslateForHtml(BatchTranslateForHtmlRequest request);

    /**
     * @param request the request parameters of GetDocTranslateTask  GetDocTranslateTaskRequest
     * @return GetDocTranslateTaskResponse
     */
    CompletableFuture<GetDocTranslateTaskResponse> getDocTranslateTask(GetDocTranslateTaskRequest request);

    /**
     * @param request the request parameters of GetHtmlTranslateTask  GetHtmlTranslateTaskRequest
     * @return GetHtmlTranslateTaskResponse
     */
    CompletableFuture<GetHtmlTranslateTaskResponse> getHtmlTranslateTask(GetHtmlTranslateTaskRequest request);

    /**
     * @param request the request parameters of GetImageTranslateTask  GetImageTranslateTaskRequest
     * @return GetImageTranslateTaskResponse
     */
    CompletableFuture<GetImageTranslateTaskResponse> getImageTranslateTask(GetImageTranslateTaskRequest request);

    /**
     * @param request the request parameters of GetLongTextTranslateTask  GetLongTextTranslateTaskRequest
     * @return GetLongTextTranslateTaskResponse
     */
    CompletableFuture<GetLongTextTranslateTaskResponse> getLongTextTranslateTask(GetLongTextTranslateTaskRequest request);

    /**
     * @param request the request parameters of SubmitDocTranslateTask  SubmitDocTranslateTaskRequest
     * @return SubmitDocTranslateTaskResponse
     */
    CompletableFuture<SubmitDocTranslateTaskResponse> submitDocTranslateTask(SubmitDocTranslateTaskRequest request);

    /**
     * @param request the request parameters of SubmitHtmlTranslateTask  SubmitHtmlTranslateTaskRequest
     * @return SubmitHtmlTranslateTaskResponse
     */
    CompletableFuture<SubmitHtmlTranslateTaskResponse> submitHtmlTranslateTask(SubmitHtmlTranslateTaskRequest request);

    /**
     * @param request the request parameters of SubmitImageTranslateTask  SubmitImageTranslateTaskRequest
     * @return SubmitImageTranslateTaskResponse
     */
    CompletableFuture<SubmitImageTranslateTaskResponse> submitImageTranslateTask(SubmitImageTranslateTaskRequest request);

    /**
     * @param request the request parameters of SubmitLongTextTranslateTask  SubmitLongTextTranslateTaskRequest
     * @return SubmitLongTextTranslateTaskResponse
     */
    CompletableFuture<SubmitLongTextTranslateTaskResponse> submitLongTextTranslateTask(SubmitLongTextTranslateTaskRequest request);

    /**
     * @param request the request parameters of TermEdit  TermEditRequest
     * @return TermEditResponse
     */
    CompletableFuture<TermEditResponse> termEdit(TermEditRequest request);

    /**
     * @param request the request parameters of TermQuery  TermQueryRequest
     * @return TermQueryResponse
     */
    CompletableFuture<TermQueryResponse> termQuery(TermQueryRequest request);

    /**
     * @param request the request parameters of TextTranslate  TextTranslateRequest
     * @return TextTranslateResponse
     */
    CompletableFuture<TextTranslateResponse> textTranslate(TextTranslateRequest request);

}
