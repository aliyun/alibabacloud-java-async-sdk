// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dypnsapi20170525.models.*;
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
        this.product = "Dypnsapi";
        this.version = "2017-05-25";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CheckSmsVerifyCode  CheckSmsVerifyCodeRequest
     * @return CheckSmsVerifyCodeResponse
     */
    @Override
    public CompletableFuture<CheckSmsVerifyCodeResponse> checkSmsVerifyCode(CheckSmsVerifyCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckSmsVerifyCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckSmsVerifyCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckSmsVerifyCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSchemeConfig  CreateSchemeConfigRequest
     * @return CreateSchemeConfigResponse
     */
    @Override
    public CompletableFuture<CreateSchemeConfigResponse> createSchemeConfig(CreateSchemeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSchemeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSchemeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSchemeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateVerifyScheme  CreateVerifySchemeRequest
     * @return CreateVerifySchemeResponse
     */
    @Override
    public CompletableFuture<CreateVerifySchemeResponse> createVerifyScheme(CreateVerifySchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVerifyScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVerifySchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVerifySchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteVerifyScheme  DeleteVerifySchemeRequest
     * @return DeleteVerifySchemeResponse
     */
    @Override
    public CompletableFuture<DeleteVerifySchemeResponse> deleteVerifyScheme(DeleteVerifySchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVerifyScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVerifySchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVerifySchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DescribeVerifyScheme  DescribeVerifySchemeRequest
     * @return DescribeVerifySchemeResponse
     */
    @Override
    public CompletableFuture<DescribeVerifySchemeResponse> describeVerifyScheme(DescribeVerifySchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVerifyScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVerifySchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVerifySchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetAuthTokenResponse> getAuthToken(GetAuthTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAuthToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAuthTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAuthTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetAuthorizationUrlResponse> getAuthorizationUrl(GetAuthorizationUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAuthorizationUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAuthorizationUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAuthorizationUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFusionAuthToken  GetFusionAuthTokenRequest
     * @return GetFusionAuthTokenResponse
     */
    @Override
    public CompletableFuture<GetFusionAuthTokenResponse> getFusionAuthToken(GetFusionAuthTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFusionAuthToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFusionAuthTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFusionAuthTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetMobileResponse> getMobile(GetMobileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetMobile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMobileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMobileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetPhoneWithTokenResponse> getPhoneWithToken(GetPhoneWithTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPhoneWithToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPhoneWithTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPhoneWithTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GetSmsAuthTokensResponse> getSmsAuthTokens(GetSmsAuthTokensRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSmsAuthTokens").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSmsAuthTokensResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSmsAuthTokensResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI JyCreateVerifyScheme is deprecated, please use Dypnsapi::2017-05-25::CreateVerifyScheme instead.  * @param request  the request parameters of JyCreateVerifyScheme  JyCreateVerifySchemeRequest
     * @return JyCreateVerifySchemeResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<JyCreateVerifySchemeResponse> jyCreateVerifyScheme(JyCreateVerifySchemeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JyCreateVerifyScheme").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JyCreateVerifySchemeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JyCreateVerifySchemeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI JyQueryAppInfoBySceneCode is deprecated, please use Dypnsapi::2017-05-25::QueryAppInfoBySceneCode instead.  * @param request  the request parameters of JyQueryAppInfoBySceneCode  JyQueryAppInfoBySceneCodeRequest
     * @return JyQueryAppInfoBySceneCodeResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<JyQueryAppInfoBySceneCodeResponse> jyQueryAppInfoBySceneCode(JyQueryAppInfoBySceneCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JyQueryAppInfoBySceneCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JyQueryAppInfoBySceneCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JyQueryAppInfoBySceneCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryGateVerifyBillingPublic  QueryGateVerifyBillingPublicRequest
     * @return QueryGateVerifyBillingPublicResponse
     */
    @Override
    public CompletableFuture<QueryGateVerifyBillingPublicResponse> queryGateVerifyBillingPublic(QueryGateVerifyBillingPublicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryGateVerifyBillingPublic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryGateVerifyBillingPublicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryGateVerifyBillingPublicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryGateVerifyStatisticPublic  QueryGateVerifyStatisticPublicRequest
     * @return QueryGateVerifyStatisticPublicResponse
     */
    @Override
    public CompletableFuture<QueryGateVerifyStatisticPublicResponse> queryGateVerifyStatisticPublic(QueryGateVerifyStatisticPublicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryGateVerifyStatisticPublic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryGateVerifyStatisticPublicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryGateVerifyStatisticPublicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI QuerySendDetails is deprecated  * @param request  the request parameters of QuerySendDetails  QuerySendDetailsRequest
     * @return QuerySendDetailsResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<QuerySendDetailsResponse> querySendDetails(QuerySendDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySendDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySendDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySendDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SendSmsVerifyCode  SendSmsVerifyCodeRequest
     * @return SendSmsVerifyCodeResponse
     */
    @Override
    public CompletableFuture<SendSmsVerifyCodeResponse> sendSmsVerifyCode(SendSmsVerifyCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendSmsVerifyCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendSmsVerifyCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendSmsVerifyCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<VerifyMobileResponse> verifyMobile(VerifyMobileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyMobile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyMobileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyMobileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<VerifyPhoneWithTokenResponse> verifyPhoneWithToken(VerifyPhoneWithTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyPhoneWithToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyPhoneWithTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyPhoneWithTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<VerifySmsCodeResponse> verifySmsCode(VerifySmsCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifySmsCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifySmsCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifySmsCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifyWithFusionAuthToken  VerifyWithFusionAuthTokenRequest
     * @return VerifyWithFusionAuthTokenResponse
     */
    @Override
    public CompletableFuture<VerifyWithFusionAuthTokenResponse> verifyWithFusionAuthToken(VerifyWithFusionAuthTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyWithFusionAuthToken").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyWithFusionAuthTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyWithFusionAuthTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
