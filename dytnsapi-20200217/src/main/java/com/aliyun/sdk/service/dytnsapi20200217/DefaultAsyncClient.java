// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dytnsapi20200217.models.*;
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
        this.product = "Dytnsapi";
        this.version = "2020-02-17";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CertNoThreeElementVerification  CertNoThreeElementVerificationRequest
     * @return CertNoThreeElementVerificationResponse
     */
    @Override
    public CompletableFuture<CertNoThreeElementVerificationResponse> certNoThreeElementVerification(CertNoThreeElementVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CertNoThreeElementVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CertNoThreeElementVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CertNoThreeElementVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CertNoTwoElementVerification  CertNoTwoElementVerificationRequest
     * @return CertNoTwoElementVerificationResponse
     */
    @Override
    public CompletableFuture<CertNoTwoElementVerificationResponse> certNoTwoElementVerification(CertNoTwoElementVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CertNoTwoElementVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CertNoTwoElementVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CertNoTwoElementVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of services related to four-element verification for enterprises. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</p>
     * <ul>
     * <li>You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0, 1, or 2.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC%5C&lang=zh">Cell Phone Number Service console</a>. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * @param request the request parameters of CompanyFourElementsVerification  CompanyFourElementsVerificationRequest
     * @return CompanyFourElementsVerificationResponse
     */
    @Override
    public CompletableFuture<CompanyFourElementsVerificationResponse> companyFourElementsVerification(CompanyFourElementsVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompanyFourElementsVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompanyFourElementsVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompanyFourElementsVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of services related to three-element verification for enterprises. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</p>
     * <ul>
     * <li>You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0, 1, or 2.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC%5C&lang=zh">Cell Phone Number Service console</a>. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * @param request the request parameters of CompanyThreeElementsVerification  CompanyThreeElementsVerificationRequest
     * @return CompanyThreeElementsVerificationResponse
     */
    @Override
    public CompletableFuture<CompanyThreeElementsVerificationResponse> companyThreeElementsVerification(CompanyThreeElementsVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompanyThreeElementsVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompanyThreeElementsVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompanyThreeElementsVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing of services related to two-element verification for enterprises. For more information, see <a href="https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4">Billing</a>.</p>
     * <ul>
     * <li>You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0 or 1.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the <a href="https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC%5C&lang=zh">Cell Phone Number Service console</a>. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * @param request the request parameters of CompanyTwoElementsVerification  CompanyTwoElementsVerificationRequest
     * @return CompanyTwoElementsVerificationResponse
     */
    @Override
    public CompletableFuture<CompanyTwoElementsVerificationResponse> companyTwoElementsVerification(CompanyTwoElementsVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompanyTwoElementsVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompanyTwoElementsVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompanyTwoElementsVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to verify whether a phone number is a nonexistent number. When you call this operation to verify a number, the system charges you CNY 0.01 per verification based on the number of verifications. <strong>Before you call this operation, make sure that you are familiar with the billing of Cell Phone Number Service.</strong></p>
     * <ul>
     * <li>You are charged only if the value of Code is OK and the value of Status is not UNKNOWN.</li>
     * <li>The prediction is not strictly accurate because Cell Phone Number Service predicts the nonexistent number probability by using AI algorithms. The accuracy rate of the prediction and the recall rate of empty numbers are about 95%. <strong>Pay attention to this point when you call this operation</strong>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <h3><a href="#"></a>Authorization information</h3>
     * <p>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</p>
     * 
     * @param request the request parameters of DescribeEmptyNumber  DescribeEmptyNumberRequest
     * @return DescribeEmptyNumberResponse
     */
    @Override
    public CompletableFuture<DescribeEmptyNumberResponse> describeEmptyNumber(DescribeEmptyNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEmptyNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEmptyNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEmptyNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeMobileOperatorAttribute  DescribeMobileOperatorAttributeRequest
     * @return DescribeMobileOperatorAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeMobileOperatorAttributeResponse> describeMobileOperatorAttribute(DescribeMobileOperatorAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeMobileOperatorAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMobileOperatorAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMobileOperatorAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePhoneNumberAnalysis  DescribePhoneNumberAnalysisRequest
     * @return DescribePhoneNumberAnalysisResponse
     */
    @Override
    public CompletableFuture<DescribePhoneNumberAnalysisResponse> describePhoneNumberAnalysis(DescribePhoneNumberAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneNumberAnalysis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneNumberAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneNumberAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the Labels page, find the label that you want to use, click Activate Now, enter the required information, and then submit your application. After your application is approved, you can use the label. Before you call this operation, make sure that you are familiar with the billing of Cell Phone Number Service.</p>
     * 
     * @param request the request parameters of DescribePhoneNumberAnalysisAI  DescribePhoneNumberAnalysisAIRequest
     * @return DescribePhoneNumberAnalysisAIResponse
     */
    @Override
    public CompletableFuture<DescribePhoneNumberAnalysisAIResponse> describePhoneNumberAnalysisAI(DescribePhoneNumberAnalysisAIRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneNumberAnalysisAI").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneNumberAnalysisAIResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneNumberAnalysisAIResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePhoneNumberAnalysisPai  DescribePhoneNumberAnalysisPaiRequest
     * @return DescribePhoneNumberAnalysisPaiResponse
     */
    @Override
    public CompletableFuture<DescribePhoneNumberAnalysisPaiResponse> describePhoneNumberAnalysisPai(DescribePhoneNumberAnalysisPaiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneNumberAnalysisPai").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneNumberAnalysisPaiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneNumberAnalysisPaiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePhoneNumberAnalysisTransparent  DescribePhoneNumberAnalysisTransparentRequest
     * @return DescribePhoneNumberAnalysisTransparentResponse
     */
    @Override
    public CompletableFuture<DescribePhoneNumberAnalysisTransparentResponse> describePhoneNumberAnalysisTransparent(DescribePhoneNumberAnalysisTransparentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneNumberAnalysisTransparent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneNumberAnalysisTransparentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneNumberAnalysisTransparentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribePhoneNumberAttribute is deprecated, please use Dytnsapi::2020-02-17::DescribePhoneNumberOperatorAttribute instead.  * @description *   Before you call this operation, make sure that you are familiar with the [billing](https://help.aliyun.com/document_detail/154751.html) of Cell Phone Number Service.
     * *   By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](https://help.aliyun.com/document_detail/154006.html).
     * ### [](#qps)QPS limits
     * You can call this operation up to 2,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * 
     * @param request the request parameters of DescribePhoneNumberAttribute  DescribePhoneNumberAttributeRequest
     * @return DescribePhoneNumberAttributeResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<DescribePhoneNumberAttributeResponse> describePhoneNumberAttribute(DescribePhoneNumberAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneNumberAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneNumberAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneNumberAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribePhoneNumberOnlineTime  DescribePhoneNumberOnlineTimeRequest
     * @return DescribePhoneNumberOnlineTimeResponse
     */
    @Override
    public CompletableFuture<DescribePhoneNumberOnlineTimeResponse> describePhoneNumberOnlineTime(DescribePhoneNumberOnlineTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneNumberOnlineTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneNumberOnlineTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneNumberOnlineTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154008.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>You can call this operation to obtain the carrier, registration location, and mobile number portability information about a phone number. You can query phone numbers in <strong>plaintext</strong> and phone numbers that are encrypted by using <strong>MD5</strong> and <strong>SHA256</strong>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePhoneNumberOperatorAttribute  DescribePhoneNumberOperatorAttributeRequest
     * @return DescribePhoneNumberOperatorAttributeResponse
     */
    @Override
    public CompletableFuture<DescribePhoneNumberOperatorAttributeResponse> describePhoneNumberOperatorAttribute(DescribePhoneNumberOperatorAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneNumberOperatorAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneNumberOperatorAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneNumberOperatorAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePhoneNumberOperatorAttributeAnnual  DescribePhoneNumberOperatorAttributeAnnualRequest
     * @return DescribePhoneNumberOperatorAttributeAnnualResponse
     */
    @Override
    public CompletableFuture<DescribePhoneNumberOperatorAttributeAnnualResponse> describePhoneNumberOperatorAttributeAnnual(DescribePhoneNumberOperatorAttributeAnnualRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneNumberOperatorAttributeAnnual").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneNumberOperatorAttributeAnnualResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneNumberOperatorAttributeAnnualResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePhoneNumberOperatorAttributeAnnualUse  DescribePhoneNumberOperatorAttributeAnnualUseRequest
     * @return DescribePhoneNumberOperatorAttributeAnnualUseResponse
     */
    @Override
    public CompletableFuture<DescribePhoneNumberOperatorAttributeAnnualUseResponse> describePhoneNumberOperatorAttributeAnnualUse(DescribePhoneNumberOperatorAttributeAnnualUseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneNumberOperatorAttributeAnnualUse").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneNumberOperatorAttributeAnnualUseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneNumberOperatorAttributeAnnualUseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePhoneNumberRisk  DescribePhoneNumberRiskRequest
     * @return DescribePhoneNumberRiskResponse
     */
    @Override
    public CompletableFuture<DescribePhoneNumberRiskResponse> describePhoneNumberRisk(DescribePhoneNumberRiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneNumberRisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneNumberRiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneNumberRiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>You are charged for phone number verifications only if the value of Code is OK and the value of VerifyResult is not 0.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h2><a href="#qps"></a>QPS limits</h2>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <h2><a href="#"></a>Authorization information</h2>
     * <p>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</p>
     * 
     * @param request the request parameters of DescribePhoneTwiceTelVerify  DescribePhoneTwiceTelVerifyRequest
     * @return DescribePhoneTwiceTelVerifyResponse
     */
    @Override
    public CompletableFuture<DescribePhoneTwiceTelVerifyResponse> describePhoneTwiceTelVerify(DescribePhoneTwiceTelVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhoneTwiceTelVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhoneTwiceTelVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhoneTwiceTelVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUAIDApplyTokenSign  GetUAIDApplyTokenSignRequest
     * @return GetUAIDApplyTokenSignResponse
     */
    @Override
    public CompletableFuture<GetUAIDApplyTokenSignResponse> getUAIDApplyTokenSign(GetUAIDApplyTokenSignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUAIDApplyTokenSign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUAIDApplyTokenSignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUAIDApplyTokenSignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetUAIDConversionSign  GetUAIDConversionSignRequest
     * @return GetUAIDConversionSignResponse
     */
    @Override
    public CompletableFuture<GetUAIDConversionSignResponse> getUAIDConversionSign(GetUAIDConversionSignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetUAIDConversionSign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetUAIDConversionSignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetUAIDConversionSignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of InvalidPhoneNumberFilter  InvalidPhoneNumberFilterRequest
     * @return InvalidPhoneNumberFilterResponse
     */
    @Override
    public CompletableFuture<InvalidPhoneNumberFilterResponse> invalidPhoneNumberFilter(InvalidPhoneNumberFilterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InvalidPhoneNumberFilter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvalidPhoneNumberFilterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvalidPhoneNumberFilterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PhoneNumberConvertService  PhoneNumberConvertServiceRequest
     * @return PhoneNumberConvertServiceResponse
     */
    @Override
    public CompletableFuture<PhoneNumberConvertServiceResponse> phoneNumberConvertService(PhoneNumberConvertServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PhoneNumberConvertService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PhoneNumberConvertServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PhoneNumberConvertServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PhoneNumberEncrypt  PhoneNumberEncryptRequest
     * @return PhoneNumberEncryptResponse
     */
    @Override
    public CompletableFuture<PhoneNumberEncryptResponse> phoneNumberEncrypt(PhoneNumberEncryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PhoneNumberEncrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PhoneNumberEncryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PhoneNumberEncryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PhoneNumberStatusForAccount  PhoneNumberStatusForAccountRequest
     * @return PhoneNumberStatusForAccountResponse
     */
    @Override
    public CompletableFuture<PhoneNumberStatusForAccountResponse> phoneNumberStatusForAccount(PhoneNumberStatusForAccountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PhoneNumberStatusForAccount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PhoneNumberStatusForAccountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PhoneNumberStatusForAccountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PhoneNumberStatusForPublic  PhoneNumberStatusForPublicRequest
     * @return PhoneNumberStatusForPublicResponse
     */
    @Override
    public CompletableFuture<PhoneNumberStatusForPublicResponse> phoneNumberStatusForPublic(PhoneNumberStatusForPublicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PhoneNumberStatusForPublic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PhoneNumberStatusForPublicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PhoneNumberStatusForPublicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PhoneNumberStatusForReal  PhoneNumberStatusForRealRequest
     * @return PhoneNumberStatusForRealResponse
     */
    @Override
    public CompletableFuture<PhoneNumberStatusForRealResponse> phoneNumberStatusForReal(PhoneNumberStatusForRealRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PhoneNumberStatusForReal").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PhoneNumberStatusForRealResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PhoneNumberStatusForRealResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PhoneNumberStatusForSms  PhoneNumberStatusForSmsRequest
     * @return PhoneNumberStatusForSmsResponse
     */
    @Override
    public CompletableFuture<PhoneNumberStatusForSmsResponse> phoneNumberStatusForSms(PhoneNumberStatusForSmsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PhoneNumberStatusForSms").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PhoneNumberStatusForSmsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PhoneNumberStatusForSmsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PhoneNumberStatusForVoice  PhoneNumberStatusForVoiceRequest
     * @return PhoneNumberStatusForVoiceResponse
     */
    @Override
    public CompletableFuture<PhoneNumberStatusForVoiceResponse> phoneNumberStatusForVoice(PhoneNumberStatusForVoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PhoneNumberStatusForVoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PhoneNumberStatusForVoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PhoneNumberStatusForVoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAvailableAuthCode  QueryAvailableAuthCodeRequest
     * @return QueryAvailableAuthCodeResponse
     */
    @Override
    public CompletableFuture<QueryAvailableAuthCodeResponse> queryAvailableAuthCode(QueryAvailableAuthCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAvailableAuthCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAvailableAuthCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAvailableAuthCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPhoneNumberOnlineTime  QueryPhoneNumberOnlineTimeRequest
     * @return QueryPhoneNumberOnlineTimeResponse
     */
    @Override
    public CompletableFuture<QueryPhoneNumberOnlineTimeResponse> queryPhoneNumberOnlineTime(QueryPhoneNumberOnlineTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPhoneNumberOnlineTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPhoneNumberOnlineTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPhoneNumberOnlineTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryPhoneTwiceTelVerify  QueryPhoneTwiceTelVerifyRequest
     * @return QueryPhoneTwiceTelVerifyResponse
     */
    @Override
    public CompletableFuture<QueryPhoneTwiceTelVerifyResponse> queryPhoneTwiceTelVerify(QueryPhoneTwiceTelVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryPhoneTwiceTelVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryPhoneTwiceTelVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryPhoneTwiceTelVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTagApplyRule  QueryTagApplyRuleRequest
     * @return QueryTagApplyRuleResponse
     */
    @Override
    public CompletableFuture<QueryTagApplyRuleResponse> queryTagApplyRule(QueryTagApplyRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTagApplyRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTagApplyRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTagApplyRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTagInfoBySelection  QueryTagInfoBySelectionRequest
     * @return QueryTagInfoBySelectionResponse
     */
    @Override
    public CompletableFuture<QueryTagInfoBySelectionResponse> queryTagInfoBySelection(QueryTagInfoBySelectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTagInfoBySelection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTagInfoBySelectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTagInfoBySelectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryTagListPage  QueryTagListPageRequest
     * @return QueryTagListPageResponse
     */
    @Override
    public CompletableFuture<QueryTagListPageResponse> queryTagListPage(QueryTagListPageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryTagListPage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryTagListPageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryTagListPageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryUsageStatisticsByTagId  QueryUsageStatisticsByTagIdRequest
     * @return QueryUsageStatisticsByTagIdResponse
     */
    @Override
    public CompletableFuture<QueryUsageStatisticsByTagIdResponse> queryUsageStatisticsByTagId(QueryUsageStatisticsByTagIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryUsageStatisticsByTagId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryUsageStatisticsByTagIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryUsageStatisticsByTagIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * <li>You are charged only if the value of Code is OK and the value of IsConsistent is not 2.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ThreeElementsVerification  ThreeElementsVerificationRequest
     * @return ThreeElementsVerificationResponse
     */
    @Override
    public CompletableFuture<ThreeElementsVerificationResponse> threeElementsVerification(ThreeElementsVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ThreeElementsVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ThreeElementsVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ThreeElementsVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * <li>You are charged only if the value of Code is OK and the value of IsConsistent is not 2.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of TwoElementsVerification  TwoElementsVerificationRequest
     * @return TwoElementsVerificationResponse
     */
    @Override
    public CompletableFuture<TwoElementsVerificationResponse> twoElementsVerification(TwoElementsVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TwoElementsVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TwoElementsVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TwoElementsVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UAIDCollection  UAIDCollectionRequest
     * @return UAIDCollectionResponse
     */
    @Override
    public CompletableFuture<UAIDCollectionResponse> uAIDCollection(UAIDCollectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UAIDCollection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UAIDCollectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UAIDCollectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UAIDConversion  UAIDConversionRequest
     * @return UAIDConversionResponse
     */
    @Override
    public CompletableFuture<UAIDConversionResponse> uAIDConversion(UAIDConversionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UAIDConversion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UAIDConversionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UAIDConversionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UAIDVerification  UAIDVerificationRequest
     * @return UAIDVerificationResponse
     */
    @Override
    public CompletableFuture<UAIDVerificationResponse> uAIDVerification(UAIDVerificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UAIDVerification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UAIDVerificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UAIDVerificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
