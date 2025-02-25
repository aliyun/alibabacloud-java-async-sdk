// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.docmind_api20220711.models.*;
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
     * @param request the request parameters of AyncTradeDocumentPackageExtractSmartApp  AyncTradeDocumentPackageExtractSmartAppRequest
     * @return AyncTradeDocumentPackageExtractSmartAppResponse
     */
    CompletableFuture<AyncTradeDocumentPackageExtractSmartAppResponse> ayncTradeDocumentPackageExtractSmartApp(AyncTradeDocumentPackageExtractSmartAppRequest request);

    /**
     * @param request the request parameters of GetDocParserResult  GetDocParserResultRequest
     * @return GetDocParserResultResponse
     */
    CompletableFuture<GetDocParserResultResponse> getDocParserResult(GetDocParserResultRequest request);

    /**
     * @param request the request parameters of GetDocStructureResult  GetDocStructureResultRequest
     * @return GetDocStructureResultResponse
     */
    CompletableFuture<GetDocStructureResultResponse> getDocStructureResult(GetDocStructureResultRequest request);

    /**
     * @param request the request parameters of GetDocumentCompareResult  GetDocumentCompareResultRequest
     * @return GetDocumentCompareResultResponse
     */
    CompletableFuture<GetDocumentCompareResultResponse> getDocumentCompareResult(GetDocumentCompareResultRequest request);

    /**
     * @param request the request parameters of GetDocumentConvertResult  GetDocumentConvertResultRequest
     * @return GetDocumentConvertResultResponse
     */
    CompletableFuture<GetDocumentConvertResultResponse> getDocumentConvertResult(GetDocumentConvertResultRequest request);

    /**
     * @param request the request parameters of GetDocumentExtractResult  GetDocumentExtractResultRequest
     * @return GetDocumentExtractResultResponse
     */
    CompletableFuture<GetDocumentExtractResultResponse> getDocumentExtractResult(GetDocumentExtractResultRequest request);

    /**
     * @param request the request parameters of GetPageNum  GetPageNumRequest
     * @return GetPageNumResponse
     */
    CompletableFuture<GetPageNumResponse> getPageNum(GetPageNumRequest request);

    /**
     * @param request the request parameters of GetTableUnderstandingResult  GetTableUnderstandingResultRequest
     * @return GetTableUnderstandingResultResponse
     */
    CompletableFuture<GetTableUnderstandingResultResponse> getTableUnderstandingResult(GetTableUnderstandingResultRequest request);

    /**
     * @param request the request parameters of QueryDocParserStatus  QueryDocParserStatusRequest
     * @return QueryDocParserStatusResponse
     */
    CompletableFuture<QueryDocParserStatusResponse> queryDocParserStatus(QueryDocParserStatusRequest request);

    /**
     * @param request the request parameters of SubmitConvertImageToExcelJob  SubmitConvertImageToExcelJobRequest
     * @return SubmitConvertImageToExcelJobResponse
     */
    CompletableFuture<SubmitConvertImageToExcelJobResponse> submitConvertImageToExcelJob(SubmitConvertImageToExcelJobRequest request);

    /**
     * @param request the request parameters of SubmitConvertImageToMarkdownJob  SubmitConvertImageToMarkdownJobRequest
     * @return SubmitConvertImageToMarkdownJobResponse
     */
    CompletableFuture<SubmitConvertImageToMarkdownJobResponse> submitConvertImageToMarkdownJob(SubmitConvertImageToMarkdownJobRequest request);

    /**
     * @param request the request parameters of SubmitConvertImageToPdfJob  SubmitConvertImageToPdfJobRequest
     * @return SubmitConvertImageToPdfJobResponse
     */
    CompletableFuture<SubmitConvertImageToPdfJobResponse> submitConvertImageToPdfJob(SubmitConvertImageToPdfJobRequest request);

    /**
     * @param request the request parameters of SubmitConvertImageToWordJob  SubmitConvertImageToWordJobRequest
     * @return SubmitConvertImageToWordJobResponse
     */
    CompletableFuture<SubmitConvertImageToWordJobResponse> submitConvertImageToWordJob(SubmitConvertImageToWordJobRequest request);

}
