// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dtsai20260401;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dtsai20260401.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "DtsAI";
        this.version = "2026-04-01";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AuthorizeFileUpload  AuthorizeFileUploadRequest
     * @return AuthorizeFileUploadResponse
     */
    @Override
    public CompletableFuture<AuthorizeFileUploadResponse> authorizeFileUpload(AuthorizeFileUploadRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeFileUpload").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeFileUploadResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeFileUploadResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeDocParserJobResultResponse> describeDocParserJobResult(DescribeDocParserJobResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDocParserJobResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDocParserJobResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDocParserJobResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeDocParserJobStatusResponse> describeDocParserJobStatus(DescribeDocParserJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDocParserJobStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDocParserJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDocParserJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<WebFetchResponse> webFetch(WebFetchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("WebFetch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WebFetchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WebFetchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<WebSearchResponse> webSearch(WebSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("WebSearch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WebSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WebSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
