// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.dysmsapi20180501.models.*;
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
        this.product = "Dysmsapi";
        this.version = "2018-05-01";
        this.endpointRule = "central";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("ap-southeast-1", "dysmsapi.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "dysmsapi.ap-southeast-5.aliyuncs.com"),
            new TeaPair("cn-beijing", "dysmsapi-proxy.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-hongkong", "dysmsapi-xman.cn-hongkong.aliyuncs.com"),
            new TeaPair("eu-central-1", "dysmsapi.eu-central-1.aliyuncs.com"),
            new TeaPair("us-east-1", "dysmsapi.us-east-1.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>  You cannot call the BatchSendMessageToGlobe operation to send messages to the Chinese mainland.</p>
     * <ul>
     * <li>You can call the BatchSendMessageToGlobe operation to send notifications and promotional messages to a limited number of mobile phone numbers at a time. To send messages to a large number of mobile phone numbers at a time, use the mass messaging feature in the SMS console.</li>
     * <li>For time-sensitive related messages, we recommend that you use the <a href="https://www.alibabacloud.com/help/en/sms/developer-reference/api-dysmsapi-2018-05-01-batchsendmessagetoglobe">SendMessageToGlobe</a> operation to ensure that messages are delivered on time.</li>
     * <li>In each request, you can send messages to up to 1,000 mobile phone numbers.</li>
     * </ul>
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation only once per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of BatchSendMessageToGlobe  BatchSendMessageToGlobeRequest
     * @return BatchSendMessageToGlobeResponse
     */
    @Override
    public CompletableFuture<BatchSendMessageToGlobeResponse> batchSendMessageToGlobe(BatchSendMessageToGlobeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BatchSendMessageToGlobe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BatchSendMessageToGlobeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BatchSendMessageToGlobeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Metrics:</p>
     * <ul>
     * <li>Requested OTP messages</li>
     * <li>Verified OTP messages
     * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.</li>
     * </ul>
     * 
     * @param request the request parameters of ConversionData  ConversionDataRequest
     * @return ConversionDataResponse
     */
    @Override
    public CompletableFuture<ConversionDataResponse> conversionData(ConversionDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConversionData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConversionDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConversionDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     * 
     * @param request the request parameters of QueryMessage  QueryMessageRequest
     * @return QueryMessageResponse
     */
    @Override
    public CompletableFuture<QueryMessageResponse> queryMessage(QueryMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryMessage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>The SendMessageToGlobe API operation does not support message delivery to the Chinese mainland.</p>
     * <h3><a href="#qps-"></a>QPS limit</h3>
     * <p>You can call this operation up to 30 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of SendMessageToGlobe  SendMessageToGlobeRequest
     * @return SendMessageToGlobeResponse
     */
    @Override
    public CompletableFuture<SendMessageToGlobeResponse> sendMessageToGlobe(SendMessageToGlobeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendMessageToGlobe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendMessageToGlobeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendMessageToGlobeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>You can call the SendMessageWithTemplate operation to send messages only to the Chinese mainland.</p>
     * 
     * @param request the request parameters of SendMessageWithTemplate  SendMessageWithTemplateRequest
     * @return SendMessageWithTemplateResponse
     */
    @Override
    public CompletableFuture<SendMessageWithTemplateResponse> sendMessageWithTemplate(SendMessageWithTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendMessageWithTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendMessageWithTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendMessageWithTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Metrics:</p>
     * <ul>
     * <li>Requested OTP messages</li>
     * <li>Verified OTP messages
     * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.<blockquote>
     * <p>If you call the SmsConversion operation to query OTP conversion rates, your business may be affected. We recommend that you perform the following operations:</p>
     * <ul>
     * <li>Call the SmsConversion operation in an asynchronous manner by configuring queues or events.</li>
     * <li>Manually degrade your services or use a circuit breaker to automatically degrade services.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SmsConversion  SmsConversionRequest
     * @return SmsConversionResponse
     */
    @Override
    public CompletableFuture<SmsConversionResponse> smsConversion(SmsConversionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SmsConversion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SmsConversionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SmsConversionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
