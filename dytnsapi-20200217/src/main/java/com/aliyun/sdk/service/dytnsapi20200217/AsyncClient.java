// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dytnsapi20200217.models.*;
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

    CompletableFuture<CertNoTwoElementVerificationResponse> certNoTwoElementVerification(CertNoTwoElementVerificationRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the billing of services related to four-element verification for enterprises. For more information, see [Billing](https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4).
      * *   You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0, 1, or 2.
      * *   Before you call this operation, perform the following operations: Log on to the [Cell Phone Number Service console](https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC\\&lang=zh). On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      *
     */
    CompletableFuture<CompanyFourElementsVerificationResponse> companyFourElementsVerification(CompanyFourElementsVerificationRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the billing of services related to three-element verification for enterprises. For more information, see [Billing](https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4).
      * *   You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0, 1, or 2.
      * *   Before you call this operation, perform the following operations: Log on to the [Cell Phone Number Service console](https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC\\&lang=zh). On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      *
     */
    CompletableFuture<CompanyThreeElementsVerificationResponse> companyThreeElementsVerification(CompanyThreeElementsVerificationRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the billing of services related to two-element verification for enterprises. For more information, see [Billing](https://help.aliyun.com/document_detail/154751.html?spm=a2c4g.154007.0.0.3edd7eb6E90YT4).
      * *   You are charged only if the value of VerifyResult is true or false and the value of ReasonCode is 0 or 1.
      * *   Before you call this operation, perform the following operations: Log on to the [Cell Phone Number Service console](https://account.aliyun.com/login/login.htm?oauth_callback=https%3A%2F%2Fdytns.console.aliyun.com%2Foverview%3Fspm%3Da2c4g.608385.0.0.79847f8b3awqUC\\&lang=zh). On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      *
     */
    CompletableFuture<CompanyTwoElementsVerificationResponse> companyTwoElementsVerification(CompanyTwoElementsVerificationRequest request);

    /**
      * *   You can call this operation to verify whether a phone number is a nonexistent number. When you call this operation to verify a number, the system charges you CNY 0.01 per verification based on the number of verifications. **Before you call this operation, make sure that you are familiar with the billing of Cell Phone Number Service.**
      * *   You are charged only if the value of Code is OK and the value of Status is not UNKNOWN.
      * *   The prediction is not strictly accurate because Cell Phone Number Service predicts the nonexistent number probability by using AI algorithms. The accuracy rate of the prediction and the recall rate of empty numbers are about 95%. **Pay attention to this point when you call this operation**.
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      * ### [](#)Authorization information
      * By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](~~154006~~).
      *
     */
    CompletableFuture<DescribeEmptyNumberResponse> describeEmptyNumber(DescribeEmptyNumberRequest request);

    CompletableFuture<DescribePhoneNumberAnalysisResponse> describePhoneNumberAnalysis(DescribePhoneNumberAnalysisRequest request);

    /**
      * Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the Labels page, find the label that you want to use, click Activate Now, enter the required information, and then submit your application. After your application is approved, you can use the label. Before you call this operation, make sure that you are familiar with the billing of Cell Phone Number Service.
      *
     */
    CompletableFuture<DescribePhoneNumberAnalysisAIResponse> describePhoneNumberAnalysisAI(DescribePhoneNumberAnalysisAIRequest request);

    CompletableFuture<DescribePhoneNumberAnalysisTransparentResponse> describePhoneNumberAnalysisTransparent(DescribePhoneNumberAnalysisTransparentRequest request);

    /**
      * @deprecated
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * *   By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](~~154006~~).
      * ### [](#qps)QPS limits
      * You can call this operation up to 2,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribePhoneNumberAttributeResponse> describePhoneNumberAttribute(DescribePhoneNumberAttributeRequest request);

    /**
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * ### [](#qps)QPS limits
      * You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribePhoneNumberOnlineTimeResponse> describePhoneNumberOnlineTime(DescribePhoneNumberOnlineTimeRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154008~~) of Cell Phone Number Service.
      * *   By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](~~154006~~).
      * *   You can call this operation to obtain the carrier, registration location, and mobile number portability information about a phone number. You can query phone numbers in **plaintext** and phone numbers that are encrypted by using **MD5** and **SHA256**.
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      *
     */
    CompletableFuture<DescribePhoneNumberOperatorAttributeResponse> describePhoneNumberOperatorAttribute(DescribePhoneNumberOperatorAttributeRequest request);

    CompletableFuture<DescribePhoneNumberRiskResponse> describePhoneNumberRisk(DescribePhoneNumberRiskRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * *   You are charged for phone number verifications only if the value of Code is OK and the value of VerifyResult is not 0.
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * ## [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      * ## [](#)Authorization information
      * By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](~~154006~~).
      *
     */
    CompletableFuture<DescribePhoneTwiceTelVerifyResponse> describePhoneTwiceTelVerify(DescribePhoneTwiceTelVerifyRequest request);

    CompletableFuture<GetUAIDApplyTokenSignResponse> getUAIDApplyTokenSign(GetUAIDApplyTokenSignRequest request);

    /**
      * Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * ### [](#qps)QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<InvalidPhoneNumberFilterResponse> invalidPhoneNumberFilter(InvalidPhoneNumberFilterRequest request);

    CompletableFuture<PhoneNumberConvertServiceResponse> phoneNumberConvertService(PhoneNumberConvertServiceRequest request);

    /**
      * Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * ### [](#qps)QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PhoneNumberEncryptResponse> phoneNumberEncrypt(PhoneNumberEncryptRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * *   By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](~~154006~~).
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * ### [](#qps)QPS limits
      * You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PhoneNumberStatusForAccountResponse> phoneNumberStatusForAccount(PhoneNumberStatusForAccountRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * *   By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](~~154006~~).
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * ### [](#qps)QPS limits
      * You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PhoneNumberStatusForPublicResponse> phoneNumberStatusForPublic(PhoneNumberStatusForPublicRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * *   By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](~~154006~~).
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * ### [](#qps)QPS limits
      * You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PhoneNumberStatusForRealResponse> phoneNumberStatusForReal(PhoneNumberStatusForRealRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * *   By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](~~154006~~).
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * ### [](#qps)QPS limits
      * You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PhoneNumberStatusForSmsResponse> phoneNumberStatusForSms(PhoneNumberStatusForSmsRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * *   You are charged only if the value of Code is OK and the value of IsPrivacyNumber is true or false.
      * *   By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](~~154006~~).
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * ### [](#qps)QPS limits
      * You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PhoneNumberStatusForVirtualResponse> phoneNumberStatusForVirtual(PhoneNumberStatusForVirtualRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * *   By default, only Alibaba Cloud accounts can call this operation. RAM users can call this operation only after the RAM users are granted the related permissions. For more information, see [Grant permissions to RAM users](~~154006~~).
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * ### [](#qps)QPS limits
      * You can call this operation up to 300 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<PhoneNumberStatusForVoiceResponse> phoneNumberStatusForVoice(PhoneNumberStatusForVoiceRequest request);

    CompletableFuture<QueryAvailableAuthCodeResponse> queryAvailableAuthCode(QueryAvailableAuthCodeRequest request);

    CompletableFuture<QueryPhoneNumberOnlineTimeResponse> queryPhoneNumberOnlineTime(QueryPhoneNumberOnlineTimeRequest request);

    CompletableFuture<QueryTagApplyRuleResponse> queryTagApplyRule(QueryTagApplyRuleRequest request);

    CompletableFuture<QueryTagInfoBySelectionResponse> queryTagInfoBySelection(QueryTagInfoBySelectionRequest request);

    CompletableFuture<QueryTagListPageResponse> queryTagListPage(QueryTagListPageRequest request);

    CompletableFuture<QueryUsageStatisticsByTagIdResponse> queryUsageStatisticsByTagId(QueryUsageStatisticsByTagIdRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * *   You are charged only if the value of Code is OK and the value of IsConsistent is not 2.
      * ### [](#qps)QPS limits
      * You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ThreeElementsVerificationResponse> threeElementsVerification(ThreeElementsVerificationRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the [billing](~~154751~~) of Cell Phone Number Service.
      * *   Before you call this operation, perform the following operations: Log on to the Cell Phone Number Service console. On the [Labels](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click **Activate Now**, enter the required information, and then submit your application. After your application is approved, you can use the label.
      * *   You are charged only if the value of Code is OK and the value of IsConsistent is not 2.
      * ### [](#qps)QPS limits
      * You can call this operation up to 200 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<TwoElementsVerificationResponse> twoElementsVerification(TwoElementsVerificationRequest request);

    CompletableFuture<UAIDVerificationResponse> uAIDVerification(UAIDVerificationRequest request);

}
