// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dypnsapi20170525.models.*;
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
     * @param request the request parameters of CheckSmsVerifyCode  CheckSmsVerifyCodeRequest
     * @return CheckSmsVerifyCodeResponse
     */
    CompletableFuture<CheckSmsVerifyCodeResponse> checkSmsVerifyCode(CheckSmsVerifyCodeRequest request);

    /**
     * @param request the request parameters of CreateSchemeConfig  CreateSchemeConfigRequest
     * @return CreateSchemeConfigResponse
     */
    CompletableFuture<CreateSchemeConfigResponse> createSchemeConfig(CreateSchemeConfigRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateVerifyScheme  CreateVerifySchemeRequest
     * @return CreateVerifySchemeResponse
     */
    CompletableFuture<CreateVerifySchemeResponse> createVerifyScheme(CreateVerifySchemeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteVerifyScheme  DeleteVerifySchemeRequest
     * @return DeleteVerifySchemeResponse
     */
    CompletableFuture<DeleteVerifySchemeResponse> deleteVerifyScheme(DeleteVerifySchemeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVerifyScheme  DescribeVerifySchemeRequest
     * @return DescribeVerifySchemeResponse
     */
    CompletableFuture<DescribeVerifySchemeResponse> describeVerifyScheme(DescribeVerifySchemeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Preparations</h3>
     * <p>You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see <a href="https://help.aliyun.com/document_detail/169786.html">Use the phone number verification feature for HTML5 pages</a>.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetAuthToken  GetAuthTokenRequest
     * @return GetAuthTokenResponse
     */
    CompletableFuture<GetAuthTokenResponse> getAuthToken(GetAuthTokenRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Preparations</h3>
     * <p>You must register an Alibaba Cloud account and obtain an Alibaba Cloud AccessKey pair. For more information, see <a href="https://help.aliyun.com/document_detail/196922.html">Process of communication authorization</a>.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetAuthorizationUrl  GetAuthorizationUrlRequest
     * @return GetAuthorizationUrlResponse
     */
    CompletableFuture<GetAuthorizationUrlResponse> getAuthorizationUrl(GetAuthorizationUrlRequest request);

    /**
     * @param request the request parameters of GetFusionAuthToken  GetFusionAuthTokenRequest
     * @return GetFusionAuthTokenResponse
     */
    CompletableFuture<GetFusionAuthTokenResponse> getFusionAuthToken(GetFusionAuthTokenRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Preparations</h3>
     * <p>You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see <a href="https://help.aliyun.com/document_detail/84541.html">Getting Started</a>.</p>
     * <blockquote>
     * <p> This operation is applicable only to one-click logon or registration. You can call this operation only after you confirm the authorization on the authorization page provided by the SDK for one-click logon. You are prohibited from simulating or bypassing the authorization process. Alibaba Cloud reserves the right to terminate our services and take legal actions against such violations.</p>
     * </blockquote>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetMobile  GetMobileRequest
     * @return GetMobileResponse
     */
    CompletableFuture<GetMobileResponse> getMobile(GetMobileRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Preparations</h3>
     * <p>You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see <a href="https://help.aliyun.com/document_detail/84541.html">Getting Started</a>.</p>
     * <blockquote>
     * <p> This operation is applicable only to one-click logon or registration in HTML5 pages. You can call this operation only after you confirm the authorization on the authorization page provided by the JavaScript SDK. You are prohibited from simulating or bypassing the authorization process. Alibaba Cloud reserves the right to terminate our services and take legal actions against such violations.</p>
     * </blockquote>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetPhoneWithToken  GetPhoneWithTokenRequest
     * @return GetPhoneWithTokenResponse
     */
    CompletableFuture<GetPhoneWithTokenResponse> getPhoneWithToken(GetPhoneWithTokenRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Preparations</h3>
     * <p>You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see <a href="https://help.aliyun.com/document_detail/313209.html">Use the SMS verification feature</a>.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetSmsAuthTokens  GetSmsAuthTokensRequest
     * @return GetSmsAuthTokensResponse
     */
    CompletableFuture<GetSmsAuthTokensResponse> getSmsAuthTokens(GetSmsAuthTokensRequest request);

    /**
     * @deprecated OpenAPI JyCreateVerifyScheme is deprecated, please use Dypnsapi::2017-05-25::CreateVerifyScheme instead.  * @param request  the request parameters of JyCreateVerifyScheme  JyCreateVerifySchemeRequest
     * @return JyCreateVerifySchemeResponse
     */
    @Deprecated
    CompletableFuture<JyCreateVerifySchemeResponse> jyCreateVerifyScheme(JyCreateVerifySchemeRequest request);

    /**
     * @deprecated OpenAPI JyQueryAppInfoBySceneCode is deprecated, please use Dypnsapi::2017-05-25::QueryAppInfoBySceneCode instead.  * @param request  the request parameters of JyQueryAppInfoBySceneCode  JyQueryAppInfoBySceneCodeRequest
     * @return JyQueryAppInfoBySceneCodeResponse
     */
    @Deprecated
    CompletableFuture<JyQueryAppInfoBySceneCodeResponse> jyQueryAppInfoBySceneCode(JyQueryAppInfoBySceneCodeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryGateVerifyBillingPublic  QueryGateVerifyBillingPublicRequest
     * @return QueryGateVerifyBillingPublicResponse
     */
    CompletableFuture<QueryGateVerifyBillingPublicResponse> queryGateVerifyBillingPublic(QueryGateVerifyBillingPublicRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryGateVerifyStatisticPublic  QueryGateVerifyStatisticPublicRequest
     * @return QueryGateVerifyStatisticPublicResponse
     */
    CompletableFuture<QueryGateVerifyStatisticPublicResponse> queryGateVerifyStatisticPublic(QueryGateVerifyStatisticPublicRequest request);

    /**
     * @deprecated OpenAPI QuerySendDetails is deprecated  * @param request  the request parameters of QuerySendDetails  QuerySendDetailsRequest
     * @return QuerySendDetailsResponse
     */
    @Deprecated
    CompletableFuture<QuerySendDetailsResponse> querySendDetails(QuerySendDetailsRequest request);

    /**
     * @param request the request parameters of SendSmsVerifyCode  SendSmsVerifyCodeRequest
     * @return SendSmsVerifyCodeResponse
     */
    CompletableFuture<SendSmsVerifyCodeResponse> sendSmsVerifyCode(SendSmsVerifyCodeRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Preparations</h3>
     * <p>You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see <a href="https://help.aliyun.com/document_detail/84541.html">Getting Started</a>.</p>
     * <blockquote>
     * <p> This operation is applicable to only the verification of thephone number that you use. To obtain a phone number for one-click logon, call <a href="https://help.aliyun.com/document_detail/189865.html">GetMobile</a>.</p>
     * </blockquote>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of VerifyMobile  VerifyMobileRequest
     * @return VerifyMobileResponse
     */
    CompletableFuture<VerifyMobileResponse> verifyMobile(VerifyMobileRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Preparations</h3>
     * <p>You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see <a href="https://help.aliyun.com/document_detail/169786.html">Use the phone number verification feature for HTML5 pages</a>.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of VerifyPhoneWithToken  VerifyPhoneWithTokenRequest
     * @return VerifyPhoneWithTokenResponse
     */
    CompletableFuture<VerifyPhoneWithTokenResponse> verifyPhoneWithToken(VerifyPhoneWithTokenRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Preparations</h3>
     * <p>You must register an Alibaba Cloud account, obtain an Alibaba Cloud AccessKey pair, and create a verification service. For more information, see <a href="https://help.aliyun.com/document_detail/313209.html">Use the SMS verification feature</a>.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of VerifySmsCode  VerifySmsCodeRequest
     * @return VerifySmsCodeResponse
     */
    CompletableFuture<VerifySmsCodeResponse> verifySmsCode(VerifySmsCodeRequest request);

    /**
     * @param request the request parameters of VerifyWithFusionAuthToken  VerifyWithFusionAuthTokenRequest
     * @return VerifyWithFusionAuthTokenResponse
     */
    CompletableFuture<VerifyWithFusionAuthTokenResponse> verifyWithFusionAuthToken(VerifyWithFusionAuthTokenRequest request);

}
