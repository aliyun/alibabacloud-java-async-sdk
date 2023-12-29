// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dypnsapi20170525.models.*;
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

    CompletableFuture<CheckSmsVerifyCodeResponse> checkSmsVerifyCode(CheckSmsVerifyCodeRequest request);

    CompletableFuture<CreateSchemeConfigResponse> createSchemeConfig(CreateSchemeConfigRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateVerifySchemeResponse> createVerifyScheme(CreateVerifySchemeRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteVerifySchemeResponse> deleteVerifyScheme(DeleteVerifySchemeRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DescribeVerifySchemeResponse> describeVerifyScheme(DescribeVerifySchemeRequest request);

    /**
      * ### [](#)Preparations
      * You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see [Use the phone number verification feature for HTML5 pages](~~169786~~).
      * ### [](#qps)QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetAuthTokenResponse> getAuthToken(GetAuthTokenRequest request);

    /**
      * ### [](#)Preparations
      * You must register an Alibaba Cloud account and obtain an Alibaba Cloud AccessKey pair. For more information, see [Process of communication authorization](~~196922~~).
      * ### [](#qps)QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetAuthorizationUrlResponse> getAuthorizationUrl(GetAuthorizationUrlRequest request);

    CompletableFuture<GetFusionAuthTokenResponse> getFusionAuthToken(GetFusionAuthTokenRequest request);

    /**
      * ### [](#)Preparations
      * You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see [Getting Started](~~84541~~).
      * >  This operation is applicable only to one-click logon or registration. You can call this operation only after you confirm the authorization on the authorization page provided by the SDK for one-click logon. You are prohibited from simulating or bypassing the authorization process. Alibaba Cloud reserves the right to terminate our services and take legal actions against such violations.
      * ### [](#qps)QPS limits
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetMobileResponse> getMobile(GetMobileRequest request);

    /**
      * ### [](#)Preparations
      * You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see [Getting Started](~~84541~~).
      * >  This operation is applicable only to one-click logon or registration in HTML5 pages. You can call this operation only after you confirm the authorization on the authorization page provided by the JavaScript SDK. You are prohibited from simulating or bypassing the authorization process. Alibaba Cloud reserves the right to terminate our services and take legal actions against such violations.
      * ### [](#qps)QPS limits
      * You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetPhoneWithTokenResponse> getPhoneWithToken(GetPhoneWithTokenRequest request);

    /**
      * ### [](#)Preparations
      * You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see [Use the SMS verification feature](~~313209~~).
      * ### [](#qps)QPS limits
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetSmsAuthTokensResponse> getSmsAuthTokens(GetSmsAuthTokensRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<JyCreateVerifySchemeResponse> jyCreateVerifyScheme(JyCreateVerifySchemeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<JyQueryAppInfoBySceneCodeResponse> jyQueryAppInfoBySceneCode(JyQueryAppInfoBySceneCodeRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryGateVerifyBillingPublicResponse> queryGateVerifyBillingPublic(QueryGateVerifyBillingPublicRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryGateVerifyStatisticPublicResponse> queryGateVerifyStatisticPublic(QueryGateVerifyStatisticPublicRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<QuerySendDetailsResponse> querySendDetails(QuerySendDetailsRequest request);

    CompletableFuture<SendSmsVerifyCodeResponse> sendSmsVerifyCode(SendSmsVerifyCodeRequest request);

    /**
      * ### [](#)Preparations
      * You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see [Getting Started](~~84541~~).
      * >  This operation is applicable to only the verification of thephone number that you use. To obtain a phone number for one-click logon, call [GetMobile](~~189865~~).
      * ### [](#qps)QPS limits
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<VerifyMobileResponse> verifyMobile(VerifyMobileRequest request);

    /**
      * ### [](#)Preparations
      * You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see [Use the phone number verification feature for HTML5 pages](~~169786~~).
      * ### [](#qps)QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<VerifyPhoneWithTokenResponse> verifyPhoneWithToken(VerifyPhoneWithTokenRequest request);

    /**
      * ### [](#)Preparations
      * You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see [Use the SMS verification feature](~~313209~~).
      * ### [](#qps)QPS limits
      * You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<VerifySmsCodeResponse> verifySmsCode(VerifySmsCodeRequest request);

    CompletableFuture<VerifyWithFusionAuthTokenResponse> verifyWithFusionAuthToken(VerifyWithFusionAuthTokenRequest request);

}
