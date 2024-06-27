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

    CompletableFuture<AyncTradeDocumentPackageExtractSmartAppResponse> ayncTradeDocumentPackageExtractSmartApp(AyncTradeDocumentPackageExtractSmartAppRequest request);

    CompletableFuture<GetDocStructureResultResponse> getDocStructureResult(GetDocStructureResultRequest request);

    CompletableFuture<GetDocumentCompareResultResponse> getDocumentCompareResult(GetDocumentCompareResultRequest request);

    CompletableFuture<GetDocumentConvertResultResponse> getDocumentConvertResult(GetDocumentConvertResultRequest request);

    CompletableFuture<GetDocumentExtractResultResponse> getDocumentExtractResult(GetDocumentExtractResultRequest request);

    CompletableFuture<GetPageNumResponse> getPageNum(GetPageNumRequest request);

    CompletableFuture<GetTableUnderstandingResultResponse> getTableUnderstandingResult(GetTableUnderstandingResultRequest request);

    CompletableFuture<SubmitConvertImageToExcelJobResponse> submitConvertImageToExcelJob(SubmitConvertImageToExcelJobRequest request);

    CompletableFuture<SubmitConvertImageToMarkdownJobResponse> submitConvertImageToMarkdownJob(SubmitConvertImageToMarkdownJobRequest request);

    CompletableFuture<SubmitConvertImageToPdfJobResponse> submitConvertImageToPdfJob(SubmitConvertImageToPdfJobRequest request);

    CompletableFuture<SubmitConvertImageToWordJobResponse> submitConvertImageToWordJob(SubmitConvertImageToWordJobRequest request);

}
