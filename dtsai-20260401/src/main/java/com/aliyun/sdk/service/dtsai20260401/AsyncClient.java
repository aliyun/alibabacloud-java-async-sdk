// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dtsai20260401.models.*;
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
     * @param request the request parameters of AuthorizeFileUpload  AuthorizeFileUploadRequest
     * @return AuthorizeFileUploadResponse
     */
    CompletableFuture<AuthorizeFileUploadResponse> authorizeFileUpload(AuthorizeFileUploadRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Region: Only China (Beijing) is supported.</li>
     * <li>Fees: Free of charge during the public preview period.</li>
     * <li>Call DescribeDocParserJobResult to retrieve the parsing result of a document parsing task. Call this operation only after DescribeDocParserJobStatus returns a Status of success. Task results are retained for 72 hours and cannot be retrieved after expiration.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDocParserJobResult  DescribeDocParserJobResultRequest
     * @return DescribeDocParserJobResultResponse
     */
    CompletableFuture<DescribeDocParserJobResultResponse> describeDocParserJobResult(DescribeDocParserJobResultRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Region: Only China (Beijing) is supported.</li>
     * <li>Fees: The service is free of charge during the public preview period.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDocParserJobStatus  DescribeDocParserJobStatusRequest
     * @return DescribeDocParserJobStatusResponse
     */
    CompletableFuture<DescribeDocParserJobStatusResponse> describeDocParserJobStatus(DescribeDocParserJobStatusRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Region: Only China (Beijing) is supported.</li>
     * <li>Fees: The service is free of charge during the public preview period.
     * General notes:</li>
     * <li>WebFetch and WebSearch are AI-based automated information retrieval tools. Search keywords, target web pages, and content extraction results are automatically generated and processed by DTS based on your instruction intent. Understanding deviations, omissions, or errors may occur. </li>
     * <li>The information returned by both features is sourced from third-party public networks. DTS does not verify, review, or endorse such content. The content does not represent the views or positions of DTS. The original source is responsible for its authenticity, accuracy, completeness, timeliness, and legality. </li>
     * <li>DTS makes no express or implied warranties regarding the accuracy, completeness, timeliness, legality, security, or fitness for a particular purpose of the search and retrieval results. DTS does not guarantee that the service is always available, uninterrupted, or error-free. </li>
     * <li>You are responsible for evaluating and assuming the risks of using the results. Before using the results for decision-making, citation, public release, commercial use, or other scenarios, verify the content independently and comply with applicable laws, regulations, and the terms and intellectual property requirements of third-party websites. You assume all liability for any losses or disputes arising from the use of the results.</li>
     * <li>The results do not constitute opinions or advice in professional fields such as law, medicine, finance, or investment. For significant matters, consult qualified professionals.</li>
     * </ul>
     * 
     * @param request the request parameters of WebFetch  WebFetchRequest
     * @return WebFetchResponse
     */
    CompletableFuture<WebFetchResponse> webFetch(WebFetchRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Region: Only China (Beijing) is supported.</li>
     * <li>Fees: This feature is free of charge during the public preview period.</li>
     * <li>SLA: This feature is not covered by the DTS Service Level Agreement (SLA).
     * General notes:</li>
     * <li>WebFetch and WebSearch are AI-based automated information retrieval tools. Search keywords, target web pages, and content extraction results are automatically generated and processed by DTS based on the intent of your instructions. Understanding deviations, omissions, or errors may occur. </li>
     * <li>The information returned by both features is sourced from third-party public networks. DTS does not verify, review, or endorse the information. The content does not represent the views or positions of DTS. The original source is responsible for the authenticity, accuracy, completeness, timeliness, and legality of the content. </li>
     * <li>DTS makes no express or implied warranties regarding the accuracy, completeness, timeliness, legality, security, or fitness for a particular purpose of the search and retrieval results. DTS does not guarantee that the service is always available, uninterrupted, or error-free. </li>
     * <li>You are responsible for evaluating and assuming the risks of using the results. Before using the results for decision-making, citation, public release, commercial use, or other scenarios, verify the content and comply with applicable laws, regulations, and the terms and intellectual property requirements of third-party websites. You assume all liability for any losses or disputes arising from the use of the results.</li>
     * <li>The results do not constitute opinions or advice in professional fields such as law, medicine, finance, or investment. For significant matters, consult qualified professionals.</li>
     * </ul>
     * 
     * @param request the request parameters of WebSearch  WebSearchRequest
     * @return WebSearchResponse
     */
    CompletableFuture<WebSearchResponse> webSearch(WebSearchRequest request);

}
