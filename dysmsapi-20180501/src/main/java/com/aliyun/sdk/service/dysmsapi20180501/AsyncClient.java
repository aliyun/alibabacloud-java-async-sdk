// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dysmsapi20180501.models.*;
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
    CompletableFuture<BatchSendMessageToGlobeResponse> batchSendMessageToGlobe(BatchSendMessageToGlobeRequest request);

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
    CompletableFuture<ConversionDataResponse> conversionData(ConversionDataRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     * 
     * @param request the request parameters of QueryMessage  QueryMessageRequest
     * @return QueryMessageResponse
     */
    CompletableFuture<QueryMessageResponse> queryMessage(QueryMessageRequest request);

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
    CompletableFuture<SendMessageToGlobeResponse> sendMessageToGlobe(SendMessageToGlobeRequest request);

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>You can call the SendMessageWithTemplate operation to send messages only to the Chinese mainland.</p>
     * 
     * @param request the request parameters of SendMessageWithTemplate  SendMessageWithTemplateRequest
     * @return SendMessageWithTemplateResponse
     */
    CompletableFuture<SendMessageWithTemplateResponse> sendMessageWithTemplate(SendMessageWithTemplateRequest request);

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
    CompletableFuture<SmsConversionResponse> smsConversion(SmsConversionRequest request);

}
