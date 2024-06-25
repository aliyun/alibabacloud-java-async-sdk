// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dysmsapi20170525.models.*;
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
      * *   Before you call this operation, you must register the primary domain name of the source URL in the Short Message Service (SMS) console. After the domain name is registered, you can call this operation to create a short URL. For more information, see [Domain name registration](~~302325~~#title-mau-zdh-hd0).
      * *   You can create up to 3,000 short URLs within a natural day.
      * *   After a short URL is generated, a security review is required. Generally, the review takes 10 minutes to 2 hours to complete. Before the security review is passed, the short URL cannot be directly accessed.
      *
     */
    CompletableFuture<AddShortUrlResponse> addShortUrl(AddShortUrlRequest request);

    /**
      * You can call the AddSmsSign operation or use the [Short Message Service (SMS) console](https://dysms.console.aliyun.com/dysms.htm#/overview) to create an SMS signature. The signature must comply with the [SMS signature specifications](~~108076~~). You can call the QuerySmsSign operation or use the SMS console to query the review status of the signature.
      * For more information, see [Usage notes](~~55324~~).
      * ### QPS limit
      * You can call this operation only once per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      * > 
      * *   You cannot cancel the review of a signature.
      * *   Individual users can create only one verification code signature, and can create only one general-purpose signature within a natural day. If you need to apply for multiple signatures, we recommend that you upgrade your account to an enterprise user.
      * *   If you need to use the same signature for messages sent to recipients both in and outside the Chinese mainland, the signature must be a general-purpose signature.
      * *   If you apply for a signature or message template, you must specify the signature scenario or template type. You must also provide the information of your services, such as a website URL, a domain name with an ICP filing, an application download URL, or the name of your WeChat official account or mini program. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.
      * *   An SMS signature must undergo a thorough review process before it can be approved for use.
      *
     */
    CompletableFuture<AddSmsSignResponse> addSmsSign(AddSmsSignRequest request);

    /**
      * You can call the operation or use the [Alibaba Cloud SMS console](https://dysms.console.aliyun.com/dysms.htm#/overview) to apply for a message template. The template must comply with the [message template specifications](~~108253~~). You can call the [QuerySmsTemplate](~~419289~~) operation or use the Alibaba Cloud SMS console to check whether the message template is approved.
      * > 
      * *   Message templates pending approval can be withdrawn. You can withdraw a message template pending approval on the Message Templates tab in the [Alibaba Cloud SMS console](https://dysms.console.aliyun.com/dysms.htm#/overview).
      * *   Message templates that have been approved can be deleted, and cannot be modified. You can delete a message template pending approval on the Message Templates tab in the [Alibaba Cloud SMS console](https://dysms.console.aliyun.com/dysms.htm#/overview).
      * *   If you call the AddSmsTemplate operation, you can apply for a maximum of 100 message templates in a calendar day. After you apply for a message template, we recommend that you wait for at least 30 seconds before you apply for another one. If you use the Alibaba Cloud SMS console, you can apply for an unlimited number of message templates.
      * *   Messages sent to the Chinese mainland and messages sent to countries or regions outside the Chinese mainland use separate message templates. Create message templates based on your needs.
      * *   If you apply for a signature or message template, you must specify the signature scenario or template type. You must also provide the information of your services, such as a website URL, a domain name with an ICP filing, an application download URL, or the name of your WeChat official account or mini program. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.
      * *   A signature must undergo a thorough review process before it can be approved for use. For more information, see [Usage notes](~~55324~~).
      * ### QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<AddSmsTemplateResponse> addSmsTemplate(AddSmsTemplateRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 2,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CheckMobilesCardSupportResponse> checkMobilesCardSupport(CheckMobilesCardSupportRequest request);

    CompletableFuture<ConversionDataIntlResponse> conversionDataIntl(ConversionDataIntlRequest request);

    /**
      * *   The CreateCardSmsTemplate operation saves the card message template information, submits it to the mobile phone manufacturer for approval, and returns the message template ID.
      * *   If the type of the message template is not supported or events that are not supported by the mobile phone manufacturer are specified, the template is not submitted. For more information, see [Supported message templates](~~434611~~).
      * *   For information about sample card message templates, see [Sample card message templates](~~435361~~).
      * ### QPS limit
      * You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreateCardSmsTemplateResponse> createCardSmsTemplate(CreateCardSmsTemplateRequest request);

    CompletableFuture<CreateSmartShortUrlResponse> createSmartShortUrl(CreateSmartShortUrlRequest request);

    CompletableFuture<CreateSmsSignResponse> createSmsSign(CreateSmsSignRequest request);

    CompletableFuture<CreateSmsTemplateResponse> createSmsTemplate(CreateSmsTemplateRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteShortUrlResponse> deleteShortUrl(DeleteShortUrlRequest request);

    /**
      * *   You cannot delete a signature that has not been approved.
      * *   After you delete a signature, you cannot recover it. Proceed with caution.
      * ### QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteSmsSignResponse> deleteSmsSign(DeleteSmsSignRequest request);

    /**
      * *   Message templates pending approval can be withdrawn. You can delete a message template pending approval on the Message Templates tab in the [Alibaba Cloud SMS console](https://dysms.console.aliyun.com/dysms.htm#/overview).
      * *   Message templates that have been approved can be deleted, and cannot be modified. You can delete a message template pending approval on the Message Templates tab in the [Alibaba Cloud SMS console](https://dysms.console.aliyun.com/dysms.htm#/overview).
      * *   You cannot recover deleted message templates. Proceed with caution.
      * ### QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteSmsTemplateResponse> deleteSmsTemplate(DeleteSmsTemplateRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetCardSmsLinkResponse> getCardSmsLink(GetCardSmsLinkRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetMediaResourceIdResponse> getMediaResourceId(GetMediaResourceIdRequest request);

    /**
      * Resources such as images and videos used for card message templates can be uploaded to Object Storage Service (OSS) buckets for storage. For more information, see [Upload files to OSS](~~437303~~).
      * ### QPS limit
      * You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetOSSInfoForCardTemplateResponse> getOSSInfoForCardTemplate(GetOSSInfoForCardTemplateRequest request);

    CompletableFuture<GetOSSInfoForUploadFileResponse> getOSSInfoForUploadFile(GetOSSInfoForUploadFileRequest request);

    CompletableFuture<GetSmsSignResponse> getSmsSign(GetSmsSignRequest request);

    CompletableFuture<GetSmsTemplateResponse> getSmsTemplate(GetSmsTemplateRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * You can call the operation or use the [Alibaba Cloud SMS console](https://dysms.console.aliyun.com/dysms.htm#/overview) to modify an existing signature and submit the signature for approval. The signature must comply with the [signature specifications](~~108076~~).
      * For more information, see [Usage notes](~~55324~~).
      * ### QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      * > 
      * *   Signatures pending approval cannot be modified.
      * *   You cannot modify a signature after it is approved. If you no longer need the signature, you can delete it.
      * *   If you are an individual user, you cannot apply for a new signature on the same day that your signature is rejected or deleted. We recommend that you modify the rejected signature and submit it again.
      *
     */
    CompletableFuture<ModifySmsSignResponse> modifySmsSign(ModifySmsSignRequest request);

    /**
      * After you apply for a message template, if the template fails to pass the review, you can call this operation to modify the template and submit the template again. You can call this operation to modify only a template for a specific message type.
      * The template content must comply with the [SMS template specifications](~~108253~~).
      * For more information, see [Usage notes](~~55324~~).
      * ### QPS limit
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<ModifySmsTemplateResponse> modifySmsTemplate(ModifySmsTemplateRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryCardSmsTemplateResponse> queryCardSmsTemplate(QueryCardSmsTemplateRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryCardSmsTemplateReportResponse> queryCardSmsTemplateReport(QueryCardSmsTemplateReportRequest request);

    CompletableFuture<QueryMobilesCardSupportResponse> queryMobilesCardSupport(QueryMobilesCardSupportRequest request);

    CompletableFuture<QueryPageSmartShortUrlLogResponse> queryPageSmartShortUrlLog(QueryPageSmartShortUrlLogRequest request);

    CompletableFuture<QuerySendDetailsResponse> querySendDetails(QuerySendDetailsRequest request);

    /**
      * You can call the operation to query message delivery details, including the number of delivered messages, the number of messages with delivery receipts, and the time that a message is sent. If a large number of messages are sent on the specified date, you can specify the number of items displayed on each page and the number of pages to view the details by page.
      * ### QPS limits
      * You can call this operation up to 20 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QuerySendStatisticsResponse> querySendStatistics(QuerySendStatisticsRequest request);

    /**
      * ### QPS limits
      * You can call this operation up to 20 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryShortUrlResponse> queryShortUrl(QueryShortUrlRequest request);

    /**
      * After you apply for an SMS signature, you can query its status by using the [Alibaba Cloud SMS console](https://dysms.console.aliyun.com/dysms.htm) or calling the operation. If the signature is rejected, you can modify the signature based on the reason why it is rejected.
      * ### QPS limits
      * You can call this API operation up to 500 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QuerySmsSignResponse> querySmsSign(QuerySmsSignRequest request);

    /**
      * You can call this operation to query the details of message signatures, including the name, creation time, and approval status of each signature. If a message template is rejected, the reason is returned. Modify the message signature based on the reason.
      * ### QPS limit
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QuerySmsSignListResponse> querySmsSignList(QuerySmsSignListRequest request);

    /**
      * After you create a message template, you can call this operation to query the approval status of the template. If a message template is rejected, the reason is returned. Modify the message template based on the reason.
      * ### QPS limit
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QuerySmsTemplateResponse> querySmsTemplate(QuerySmsTemplateRequest request);

    /**
      * You can call this operation to query the details of message templates, including the name, creation time, and approval status of each template. If a message template is rejected, the reason is returned. Modify the message template based on the reason.
      * ### QPS limit
      * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QuerySmsTemplateListResponse> querySmsTemplateList(QuerySmsTemplateListRequest request);

    /**
      * You can call the operation to send multiple card messages to a maximum of mobile phone numbers at a time. Different signatures and rollback settings can be specified for the mobile phone numbers.
      * ### QPS limit
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<SendBatchCardSmsResponse> sendBatchCardSms(SendBatchCardSmsRequest request);

    /**
      * You can call the operation to send messages to a maximum of 100 recipients at a time.
      *
     */
    CompletableFuture<SendBatchSmsResponse> sendBatchSms(SendBatchSmsRequest request);

    /**
      * *   Make sure that the message template that you want to use has been approved. If the mobile phone number of a recipient does not support card messages, the SendCardSms operation allows the rollback feature to ensure successful delivery.
      * *   When you call the SendCardSms operation to send card messages, the operation checks whether the mobile phone numbers of the recipients support card messages. If the mobile phone numbers do not support card messages, you can specify whether to enable rollback. Otherwise, the card message cannot be delivered.
      * ### QPS limit
      * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<SendCardSmsResponse> sendCardSms(SendCardSmsRequest request);

    /**
      * *   This operation is mainly used to send a single message. In special scenarios, you can send multiple messages with the same content to a maximum of 1,000 mobile numbers. Note that group sending may be delayed.
      * *   To send messages with different signatures and template content to multiple mobile numbers in a single request, call the [SendBatchSms](~~102364~~) operation.
      * *   You are charged for using Alibaba Cloud Short Message Service (SMS) based on the amount of messages sent. For more information, see [Pricing](https://www.aliyun.com/price/product#/sms/detail).
      * *   If your verification code signature and general-purpose signature have the same name, the system uses the general-purpose signature to send messages by default.
      *
     */
    CompletableFuture<SendSmsResponse> sendSms(SendSmsRequest request);

    /**
      * Metrics:
      * *   Requested OTP messages
      * *   Verified OTP messages
      * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.
      * > If you call the SmsConversion operation to query OTP conversion rates, your business may be affected. We recommend that you perform the following operations: 1. Call the SmsConversion operation in an asynchronous manner by configuring queues or events. 2. Manually degrade your services or use a circuit breaker to automatically degrade services.
      *
     */
    CompletableFuture<SmsConversionIntlResponse> smsConversionIntl(SmsConversionIntlRequest request);

    /**
      * ### QPS limit
      * You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateSmsSignResponse> updateSmsSign(UpdateSmsSignRequest request);

    CompletableFuture<UpdateSmsTemplateResponse> updateSmsTemplate(UpdateSmsTemplateRequest request);

}
