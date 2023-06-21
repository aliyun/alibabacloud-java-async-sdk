// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dysmsapi20180501.models.*;
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
      * *   You cannot call the BatchSendMessageToGlobe operation to send messages to the Chinese mainland.
      * *   You can call the BatchSendMessageToGlobe operation to send notifications and promotional messages to a limited number of mobile phone numbers at a time. To send messages exceeding more than 1,000 mobile number per request, you can choose to use the broadcast messaging feature available in the Alibaba Cloud SMS console.
      * *   For time-sensitive related messages, we recommend that you use the [SendMessageToGlobe](~~SendMessageToGlobe~~) operation to ensure that messages are delivered on time.
      * *   In each request, you can send messages to up to 1,000 mobile phone numbers.
      * ### QPS limit
      * You may call this operation only once per second. If the number of calls per second exceeds this limit, throttling will be triggered. This can potentially impact your business operations. Therefore, we recommend that you take note of this limit when making calls to this operation.
      *
     */
    CompletableFuture<BatchSendMessageToGlobeResponse> batchSendMessageToGlobe(BatchSendMessageToGlobeRequest request);

    /**
      * Metrics:
      * *   Requested OTP messages
      * *   Verified OTP messages
      * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.
      *
     */
    CompletableFuture<ConversionDataResponse> conversionData(ConversionDataRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 300 times per second. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
      *
     */
    CompletableFuture<QueryMessageResponse> queryMessage(QueryMessageRequest request);

    /**
      * ### Usage notes
      * You cannot call the SendMessageToGlobe operation to send messages to the Chinese mainland.
      * ### QPS limit
      * You may call this operation up to 300 times per second. If the number of calls per second exceeds this limit, throttling will be triggered. This can potentially impact your business operations. Therefore, we recommend that you take note of this limit when making calls to this operation.
      *
     */
    CompletableFuture<SendMessageToGlobeResponse> sendMessageToGlobe(SendMessageToGlobeRequest request);

    /**
      * ### Usage notes
      * You can call the SendMessageWithTemplate operation to send messages only to the Chinese mainland.
      *
     */
    CompletableFuture<SendMessageWithTemplateResponse> sendMessageWithTemplate(SendMessageWithTemplateRequest request);

    /**
      * Metrics:
      * *   Requested OTP messages
      * *   Verified OTP messages
      * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.
      * > If you call the SmsConversion operation to query OTP conversion rates, your business may be affected. We recommend that you perform the following operations:
      * > * Call the SmsConversion operation in an asynchronous manner by configuring queues or events.
      * > * Manually degrade your services or use a circuit breaker to automatically degrade services.
      *
     */
    CompletableFuture<SmsConversionResponse> smsConversion(SmsConversionRequest request);

}
