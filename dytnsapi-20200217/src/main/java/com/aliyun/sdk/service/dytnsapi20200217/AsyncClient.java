// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dytnsapi20200217.models.*;
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
     * @param request the request parameters of CertNoThreeElementVerification  CertNoThreeElementVerificationRequest
     * @return CertNoThreeElementVerificationResponse
     */
    CompletableFuture<CertNoThreeElementVerificationResponse> certNoThreeElementVerification(CertNoThreeElementVerificationRequest request);

    /**
     * @param request the request parameters of CertNoTwoElementVerification  CertNoTwoElementVerificationRequest
     * @return CertNoTwoElementVerificationResponse
     */
    CompletableFuture<CertNoTwoElementVerificationResponse> certNoTwoElementVerification(CertNoTwoElementVerificationRequest request);

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
    CompletableFuture<CompanyFourElementsVerificationResponse> companyFourElementsVerification(CompanyFourElementsVerificationRequest request);

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
    CompletableFuture<CompanyThreeElementsVerificationResponse> companyThreeElementsVerification(CompanyThreeElementsVerificationRequest request);

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
    CompletableFuture<CompanyTwoElementsVerificationResponse> companyTwoElementsVerification(CompanyTwoElementsVerificationRequest request);

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
    CompletableFuture<DescribeEmptyNumberResponse> describeEmptyNumber(DescribeEmptyNumberRequest request);

    /**
     * @param request the request parameters of DescribeMobileOperatorAttribute  DescribeMobileOperatorAttributeRequest
     * @return DescribeMobileOperatorAttributeResponse
     */
    CompletableFuture<DescribeMobileOperatorAttributeResponse> describeMobileOperatorAttribute(DescribeMobileOperatorAttributeRequest request);

    /**
     * @param request the request parameters of DescribePhoneNumberAnalysis  DescribePhoneNumberAnalysisRequest
     * @return DescribePhoneNumberAnalysisResponse
     */
    CompletableFuture<DescribePhoneNumberAnalysisResponse> describePhoneNumberAnalysis(DescribePhoneNumberAnalysisRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the Labels page, find the label that you want to use, click Activate Now, enter the required information, and then submit your application. After your application is approved, you can use the label. Before you call this operation, make sure that you are familiar with the billing of Cell Phone Number Service.</p>
     * 
     * @param request the request parameters of DescribePhoneNumberAnalysisAI  DescribePhoneNumberAnalysisAIRequest
     * @return DescribePhoneNumberAnalysisAIResponse
     */
    CompletableFuture<DescribePhoneNumberAnalysisAIResponse> describePhoneNumberAnalysisAI(DescribePhoneNumberAnalysisAIRequest request);

    /**
     * @param request the request parameters of DescribePhoneNumberAnalysisPai  DescribePhoneNumberAnalysisPaiRequest
     * @return DescribePhoneNumberAnalysisPaiResponse
     */
    CompletableFuture<DescribePhoneNumberAnalysisPaiResponse> describePhoneNumberAnalysisPai(DescribePhoneNumberAnalysisPaiRequest request);

    /**
     * @param request the request parameters of DescribePhoneNumberAnalysisTransparent  DescribePhoneNumberAnalysisTransparentRequest
     * @return DescribePhoneNumberAnalysisTransparentResponse
     */
    CompletableFuture<DescribePhoneNumberAnalysisTransparentResponse> describePhoneNumberAnalysisTransparent(DescribePhoneNumberAnalysisTransparentRequest request);

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
    CompletableFuture<DescribePhoneNumberAttributeResponse> describePhoneNumberAttribute(DescribePhoneNumberAttributeRequest request);

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
    CompletableFuture<DescribePhoneNumberOnlineTimeResponse> describePhoneNumberOnlineTime(DescribePhoneNumberOnlineTimeRequest request);

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
    CompletableFuture<DescribePhoneNumberOperatorAttributeResponse> describePhoneNumberOperatorAttribute(DescribePhoneNumberOperatorAttributeRequest request);

    /**
     * @param request the request parameters of DescribePhoneNumberOperatorAttributeAnnual  DescribePhoneNumberOperatorAttributeAnnualRequest
     * @return DescribePhoneNumberOperatorAttributeAnnualResponse
     */
    CompletableFuture<DescribePhoneNumberOperatorAttributeAnnualResponse> describePhoneNumberOperatorAttributeAnnual(DescribePhoneNumberOperatorAttributeAnnualRequest request);

    /**
     * @param request the request parameters of DescribePhoneNumberOperatorAttributeAnnualUse  DescribePhoneNumberOperatorAttributeAnnualUseRequest
     * @return DescribePhoneNumberOperatorAttributeAnnualUseResponse
     */
    CompletableFuture<DescribePhoneNumberOperatorAttributeAnnualUseResponse> describePhoneNumberOperatorAttributeAnnualUse(DescribePhoneNumberOperatorAttributeAnnualUseRequest request);

    /**
     * @param request the request parameters of DescribePhoneNumberRisk  DescribePhoneNumberRiskRequest
     * @return DescribePhoneNumberRiskResponse
     */
    CompletableFuture<DescribePhoneNumberRiskResponse> describePhoneNumberRisk(DescribePhoneNumberRiskRequest request);

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
    CompletableFuture<DescribePhoneTwiceTelVerifyResponse> describePhoneTwiceTelVerify(DescribePhoneTwiceTelVerifyRequest request);

    /**
     * @param request the request parameters of GetUAIDApplyTokenSign  GetUAIDApplyTokenSignRequest
     * @return GetUAIDApplyTokenSignResponse
     */
    CompletableFuture<GetUAIDApplyTokenSignResponse> getUAIDApplyTokenSign(GetUAIDApplyTokenSignRequest request);

    /**
     * @param request the request parameters of GetUAIDConversionSign  GetUAIDConversionSignRequest
     * @return GetUAIDConversionSignResponse
     */
    CompletableFuture<GetUAIDConversionSignResponse> getUAIDConversionSign(GetUAIDConversionSignRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of InvalidPhoneNumberFilter  InvalidPhoneNumberFilterRequest
     * @return InvalidPhoneNumberFilterResponse
     */
    CompletableFuture<InvalidPhoneNumberFilterResponse> invalidPhoneNumberFilter(InvalidPhoneNumberFilterRequest request);

    /**
     * @param request the request parameters of PhoneNumberConvertService  PhoneNumberConvertServiceRequest
     * @return PhoneNumberConvertServiceResponse
     */
    CompletableFuture<PhoneNumberConvertServiceResponse> phoneNumberConvertService(PhoneNumberConvertServiceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PhoneNumberEncrypt  PhoneNumberEncryptRequest
     * @return PhoneNumberEncryptResponse
     */
    CompletableFuture<PhoneNumberEncryptResponse> phoneNumberEncrypt(PhoneNumberEncryptRequest request);

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
    CompletableFuture<PhoneNumberStatusForAccountResponse> phoneNumberStatusForAccount(PhoneNumberStatusForAccountRequest request);

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
    CompletableFuture<PhoneNumberStatusForPublicResponse> phoneNumberStatusForPublic(PhoneNumberStatusForPublicRequest request);

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
    CompletableFuture<PhoneNumberStatusForRealResponse> phoneNumberStatusForReal(PhoneNumberStatusForRealRequest request);

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
    CompletableFuture<PhoneNumberStatusForSmsResponse> phoneNumberStatusForSms(PhoneNumberStatusForSmsRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/154751.html">billing</a> of Cell Phone Number Service.</p>
     * <ul>
     * <li>You are charged only if the value of Code is OK and the value of IsPrivacyNumber is true or false.</li>
     * <li>By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see <a href="https://help.aliyun.com/document_detail/154006.html">Grant permissions to RAM users</a>.</li>
     * <li>Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the <a href="https://dytns.console.aliyun.com/analysis/square">Labels</a> page, find the label that you want to use, click <strong>Activate Now</strong>, enter the required information, and then submit your application. After your application is approved, you can use the label.</li>
     * </ul>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of PhoneNumberStatusForVirtual  PhoneNumberStatusForVirtualRequest
     * @return PhoneNumberStatusForVirtualResponse
     */
    CompletableFuture<PhoneNumberStatusForVirtualResponse> phoneNumberStatusForVirtual(PhoneNumberStatusForVirtualRequest request);

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
    CompletableFuture<PhoneNumberStatusForVoiceResponse> phoneNumberStatusForVoice(PhoneNumberStatusForVoiceRequest request);

    /**
     * @param request the request parameters of QueryAvailableAuthCode  QueryAvailableAuthCodeRequest
     * @return QueryAvailableAuthCodeResponse
     */
    CompletableFuture<QueryAvailableAuthCodeResponse> queryAvailableAuthCode(QueryAvailableAuthCodeRequest request);

    /**
     * @param request the request parameters of QueryPhoneNumberOnlineTime  QueryPhoneNumberOnlineTimeRequest
     * @return QueryPhoneNumberOnlineTimeResponse
     */
    CompletableFuture<QueryPhoneNumberOnlineTimeResponse> queryPhoneNumberOnlineTime(QueryPhoneNumberOnlineTimeRequest request);

    /**
     * @param request the request parameters of QueryPhoneTwiceTelVerify  QueryPhoneTwiceTelVerifyRequest
     * @return QueryPhoneTwiceTelVerifyResponse
     */
    CompletableFuture<QueryPhoneTwiceTelVerifyResponse> queryPhoneTwiceTelVerify(QueryPhoneTwiceTelVerifyRequest request);

    /**
     * @param request the request parameters of QueryTagApplyRule  QueryTagApplyRuleRequest
     * @return QueryTagApplyRuleResponse
     */
    CompletableFuture<QueryTagApplyRuleResponse> queryTagApplyRule(QueryTagApplyRuleRequest request);

    /**
     * @param request the request parameters of QueryTagInfoBySelection  QueryTagInfoBySelectionRequest
     * @return QueryTagInfoBySelectionResponse
     */
    CompletableFuture<QueryTagInfoBySelectionResponse> queryTagInfoBySelection(QueryTagInfoBySelectionRequest request);

    /**
     * @param request the request parameters of QueryTagListPage  QueryTagListPageRequest
     * @return QueryTagListPageResponse
     */
    CompletableFuture<QueryTagListPageResponse> queryTagListPage(QueryTagListPageRequest request);

    /**
     * @param request the request parameters of QueryUsageStatisticsByTagId  QueryUsageStatisticsByTagIdRequest
     * @return QueryUsageStatisticsByTagIdResponse
     */
    CompletableFuture<QueryUsageStatisticsByTagIdResponse> queryUsageStatisticsByTagId(QueryUsageStatisticsByTagIdRequest request);

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
    CompletableFuture<ThreeElementsVerificationResponse> threeElementsVerification(ThreeElementsVerificationRequest request);

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
    CompletableFuture<TwoElementsVerificationResponse> twoElementsVerification(TwoElementsVerificationRequest request);

    /**
     * @param request the request parameters of UAIDCollection  UAIDCollectionRequest
     * @return UAIDCollectionResponse
     */
    CompletableFuture<UAIDCollectionResponse> uAIDCollection(UAIDCollectionRequest request);

    /**
     * @param request the request parameters of UAIDConversion  UAIDConversionRequest
     * @return UAIDConversionResponse
     */
    CompletableFuture<UAIDConversionResponse> uAIDConversion(UAIDConversionRequest request);

    /**
     * @param request the request parameters of UAIDVerification  UAIDVerificationRequest
     * @return UAIDVerificationResponse
     */
    CompletableFuture<UAIDVerificationResponse> uAIDVerification(UAIDVerificationRequest request);

}
