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
     * @param request the request parameters of AddExtCodeSign  AddExtCodeSignRequest
     * @return AddExtCodeSignResponse
     */
    CompletableFuture<AddExtCodeSignResponse> addExtCodeSign(AddExtCodeSignRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, you must register the primary domain name of the source URL in the Short Message Service (SMS) console. After the domain name is registered, you can call this operation to create a short URL. For more information, see <a href="https://help.aliyun.com/document_detail/302325.html#title-mau-zdh-hd0">Domain name registration</a>.</p>
     * <ul>
     * <li>You can create up to 3,000 short URLs within a natural day.</li>
     * <li>After a short URL is generated, a security review is required. Generally, the review takes 10 minutes to 2 hours to complete. Before the security review is passed, the short URL cannot be directly accessed.</li>
     * </ul>
     * 
     * @param request the request parameters of AddShortUrl  AddShortUrlRequest
     * @return AddShortUrlResponse
     */
    CompletableFuture<AddShortUrlResponse> addShortUrl(AddShortUrlRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the AddSmsSign operation or use the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Short Message Service (SMS) console</a> to create an SMS signature. The signature must comply with the <a href="https://help.aliyun.com/document_detail/108076.html">SMS signature specifications</a>. You can call the QuerySmsSign operation or use the SMS console to query the review status of the signature.
     * For more information, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation only once per second. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You cannot cancel the review of a signature.</li>
     * <li>Individual users can create only one verification code signature, and can create only one general-purpose signature within a natural day. If you need to apply for multiple signatures, we recommend that you upgrade your account to an enterprise user.</li>
     * <li>If you need to use the same signature for messages sent to recipients both in and outside the Chinese mainland, the signature must be a general-purpose signature.</li>
     * <li>If you apply for a signature or message template, you must specify the signature scenario or template type. You must also provide the information of your services, such as a website URL, a domain name with an ICP filing, an application download URL, or the name of your WeChat official account or mini program. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.</li>
     * <li>An SMS signature must undergo a thorough review process before it can be approved for use.</li>
     * </ul>
     * 
     * @param request the request parameters of AddSmsSign  AddSmsSignRequest
     * @return AddSmsSignResponse
     */
    CompletableFuture<AddSmsSignResponse> addSmsSign(AddSmsSignRequest request);

    /**
     * @deprecated OpenAPI AddSmsTemplate is deprecated, please use Dysmsapi::2017-05-25::CreateSmsTemplate instead.  * @description You can call the operation or use the [Alibaba Cloud SMS console](https://dysms.console.aliyun.com/dysms.htm#/overview) to apply for a message template. The template must comply with the [message template specifications](https://help.aliyun.com/document_detail/108253.html). You can call the [QuerySmsTemplate](https://help.aliyun.com/document_detail/419289.html) operation or use the Alibaba Cloud SMS console to check whether the message template is approved.
     * > 
     * *   Message templates pending approval can be withdrawn. You can withdraw a message template pending approval on the Message Templates tab in the [Alibaba Cloud SMS console](https://dysms.console.aliyun.com/dysms.htm#/overview).
     * *   Message templates that have been approved can be deleted, and cannot be modified. You can delete a message template pending approval on the Message Templates tab in the [Alibaba Cloud SMS console](https://dysms.console.aliyun.com/dysms.htm#/overview).
     * *   If you call the AddSmsTemplate operation, you can apply for a maximum of 100 message templates in a calendar day. After you apply for a message template, we recommend that you wait for at least 30 seconds before you apply for another one. If you use the Alibaba Cloud SMS console, you can apply for an unlimited number of message templates.
     * *   Messages sent to the Chinese mainland and messages sent to countries or regions outside the Chinese mainland use separate message templates. Create message templates based on your needs.
     * *   If you apply for a signature or message template, you must specify the signature scenario or template type. You must also provide the information of your services, such as a website URL, a domain name with an ICP filing, an application download URL, or the name of your WeChat official account or mini program. For sign-in scenarios, you must also provide an account and password for tests. A detailed description can improve the review efficiency of signatures and templates.
     * *   A signature must undergo a thorough review process before it can be approved for use. For more information, see [Usage notes](https://help.aliyun.com/document_detail/55324.html).
     * ### QPS limits
     * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * 
     * @param request the request parameters of AddSmsTemplate  AddSmsTemplateRequest
     * @return AddSmsTemplateResponse
     */
    @Deprecated
    CompletableFuture<AddSmsTemplateResponse> addSmsTemplate(AddSmsTemplateRequest request);

    /**
     * @param request the request parameters of ChangeSignatureQualification  ChangeSignatureQualificationRequest
     * @return ChangeSignatureQualificationResponse
     */
    CompletableFuture<ChangeSignatureQualificationResponse> changeSignatureQualification(ChangeSignatureQualificationRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 2,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CheckMobilesCardSupport  CheckMobilesCardSupportRequest
     * @return CheckMobilesCardSupportResponse
     */
    CompletableFuture<CheckMobilesCardSupportResponse> checkMobilesCardSupport(CheckMobilesCardSupportRequest request);

    /**
     * @param request the request parameters of ConversionDataIntl  ConversionDataIntlRequest
     * @return ConversionDataIntlResponse
     */
    CompletableFuture<ConversionDataIntlResponse> conversionDataIntl(ConversionDataIntlRequest request);

    /**
     * <b>description</b> :
     * <p>  The CreateCardSmsTemplate operation saves the card message template information, submits it to the mobile phone manufacturer for approval, and returns the message template ID.</p>
     * <ul>
     * <li>If the type of the message template is not supported or events that are not supported by the mobile phone manufacturer are specified, the template is not submitted. For more information, see <a href="https://help.aliyun.com/document_detail/434611.html">Supported message templates</a>.</li>
     * <li>For information about sample card message templates, see <a href="https://help.aliyun.com/document_detail/435361.html">Sample card message templates</a>.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreateCardSmsTemplate  CreateCardSmsTemplateRequest
     * @return CreateCardSmsTemplateResponse
     */
    CompletableFuture<CreateCardSmsTemplateResponse> createCardSmsTemplate(CreateCardSmsTemplateRequest request);

    /**
     * @param request the request parameters of CreateSmartShortUrl  CreateSmartShortUrlRequest
     * @return CreateSmartShortUrlResponse
     */
    CompletableFuture<CreateSmartShortUrlResponse> createSmartShortUrl(CreateSmartShortUrlRequest request);

    /**
     * @param request the request parameters of CreateSmsAuthorizationLetter  CreateSmsAuthorizationLetterRequest
     * @return CreateSmsAuthorizationLetterResponse
     */
    CompletableFuture<CreateSmsAuthorizationLetterResponse> createSmsAuthorizationLetter(CreateSmsAuthorizationLetterRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the announcement of changes to the new and original interfaces, see <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on Updates to SMS Service Signature &amp; Template Interfaces</a>.</li>
     * <li>Individual authenticated users can apply for one formal signature per natural day under the same Alibaba Cloud account, while enterprise authenticated users have no current restrictions. For details on the differences in rights between individual and enterprise users, please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/usage-notes?spm">User Guide</a>.</li>
     * <li>Signature information applied through the interface will be synchronized in the SMS service console. For operations related to signatures in the console, see <a href="https://help.aliyun.com/zh/sms/user-guide/create-signatures?spm">SMS Signatures</a>.</li>
     * <li>After submitting the signature application, you can query the signature review status and details via the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-getsmssign?spm">GetSmsSign</a> interface. You can also <a href="https://help.aliyun.com/zh/sms/developer-reference/configure-delivery-receipts-1?spm">Configure Receipt Messages</a> and obtain signature review status messages through SignSmsReport.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSmsSign  CreateSmsSignRequest
     * @return CreateSmsSignResponse
     */
    CompletableFuture<CreateSmsSignResponse> createSmsSign(CreateSmsSignRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface compared to the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on the Update of SMS Service Signature &amp; Template Interfaces</a>.</li>
     * <li>It is recommended to apply for SMS templates via the API with at least a 30-second interval between each request.</li>
     * <li>The template information applied through the API will be synchronized in the SMS service console. For operations related to templates in the console, please refer to SMS Templates.</li>
     * <li>After submitting the template application, you can query the audit status and details using the GetSmsTemplate interface. You can also configure delivery receipts to obtain the audit status messages via TemplateSmsReport.</li>
     * <li>Domestic SMS templates are not interchangeable with international/Hong Kong, Macao, and Taiwan SMS templates. Please apply for templates based on your business scenario.</li>
     * <li>Only enterprise-verified users can apply for promotional messages and international/Hong Kong, Macao, and Taiwan messages. For differences in rights between personal and enterprise users, please refer to Usage Instructions.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSmsTemplate  CreateSmsTemplateRequest
     * @return CreateSmsTemplateResponse
     */
    CompletableFuture<CreateSmsTemplateResponse> createSmsTemplate(CreateSmsTemplateRequest request);

    /**
     * @param request the request parameters of DeleteExtCodeSign  DeleteExtCodeSignRequest
     * @return DeleteExtCodeSignResponse
     */
    CompletableFuture<DeleteExtCodeSignResponse> deleteExtCodeSign(DeleteExtCodeSignRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteShortUrl  DeleteShortUrlRequest
     * @return DeleteShortUrlResponse
     */
    CompletableFuture<DeleteShortUrlResponse> deleteShortUrl(DeleteShortUrlRequest request);

    /**
     * @param request the request parameters of DeleteSmsQualification  DeleteSmsQualificationRequest
     * @return DeleteSmsQualificationResponse
     */
    CompletableFuture<DeleteSmsQualificationResponse> deleteSmsQualification(DeleteSmsQualificationRequest request);

    /**
     * <b>description</b> :
     * <p>  You cannot delete a signature that has not been approved.</p>
     * <ul>
     * <li>After you delete a signature, you cannot recover it. Proceed with caution.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteSmsSign  DeleteSmsSignRequest
     * @return DeleteSmsSignResponse
     */
    CompletableFuture<DeleteSmsSignResponse> deleteSmsSign(DeleteSmsSignRequest request);

    /**
     * <b>description</b> :
     * <p>  Message templates pending approval can be withdrawn. You can delete a message template pending approval on the Message Templates tab in the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>.</p>
     * <ul>
     * <li>Message templates that have been approved can be deleted, and cannot be modified. You can delete a message template pending approval on the Message Templates tab in the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>.</li>
     * <li>You cannot recover deleted message templates. Proceed with caution.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteSmsTemplate  DeleteSmsTemplateRequest
     * @return DeleteSmsTemplateResponse
     */
    CompletableFuture<DeleteSmsTemplateResponse> deleteSmsTemplate(DeleteSmsTemplateRequest request);

    /**
     * @param request the request parameters of GetCardSmsDetails  GetCardSmsDetailsRequest
     * @return GetCardSmsDetailsResponse
     */
    CompletableFuture<GetCardSmsDetailsResponse> getCardSmsDetails(GetCardSmsDetailsRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetCardSmsLink  GetCardSmsLinkRequest
     * @return GetCardSmsLinkResponse
     */
    CompletableFuture<GetCardSmsLinkResponse> getCardSmsLink(GetCardSmsLinkRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetMediaResourceId  GetMediaResourceIdRequest
     * @return GetMediaResourceIdResponse
     */
    CompletableFuture<GetMediaResourceIdResponse> getMediaResourceId(GetMediaResourceIdRequest request);

    /**
     * <b>description</b> :
     * <p>Resources such as images and videos used for card message templates can be uploaded to Object Storage Service (OSS) buckets for storage. For more information, see <a href="https://help.aliyun.com/document_detail/437303.html">Upload files to OSS</a>.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetOSSInfoForCardTemplate  GetOSSInfoForCardTemplateRequest
     * @return GetOSSInfoForCardTemplateResponse
     */
    CompletableFuture<GetOSSInfoForCardTemplateResponse> getOSSInfoForCardTemplate(GetOSSInfoForCardTemplateRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When creating signatures or templates, you can upload materials such as login pages with links, backend page screenshots, software copyrights, supplementary agreements, etc. This helps the review personnel understand your business details. If there are multiple materials, they can be combined into one file, supporting png, jpg, jpeg, doc, docx, pdf formats.</li>
     * <li>For additional materials needed when creating signatures or templates, you can upload them to the OSS file system for storage. For file upload operations, refer to <a href="https://help.aliyun.com/zh/sms/upload-files-through-oss">OSS File Upload</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetOSSInfoForUploadFile  GetOSSInfoForUploadFileRequest
     * @return GetOSSInfoForUploadFileResponse
     */
    CompletableFuture<GetOSSInfoForUploadFileResponse> getOSSInfoForUploadFile(GetOSSInfoForUploadFileRequest request);

    /**
     * @param request the request parameters of GetQualificationOssInfo  GetQualificationOssInfoRequest
     * @return GetQualificationOssInfoResponse
     */
    CompletableFuture<GetQualificationOssInfoResponse> getQualificationOssInfo(GetQualificationOssInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface and the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on the Update of SMS Signature &amp; Template Interfaces</a>.</li>
     * <li>Review Time: Generally, after submitting the signature, Alibaba Cloud expects to complete the review within 2 hours (Review Business Hours: Monday to Sunday 9:00~21:00, with legal holidays postponed). It is recommended to submit your application before 18:00.</li>
     * <li>If the signature fails the review, the reason for the failure will be returned. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm">Handling Suggestions for Failed SMS Reviews</a>, invoke the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-updatesmssign?spm">UpdateSmsSign</a> API, or modify the unapproved SMS signature on the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Signature Management</a> page.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSmsSign  GetSmsSignRequest
     * @return GetSmsSignResponse
     */
    CompletableFuture<GetSmsSignResponse> getSmsSign(GetSmsSignRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the announcement of changes to the new and original interfaces, see <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on Updates to SMS Service Signature &amp; Template Interfaces</a>.</li>
     * <li>Review Time: Under normal circumstances, Alibaba Cloud expects to complete the review within 2 hours after template submission (review working hours: Monday to Sunday 9:00~21:00, with statutory holidays postponed). It is recommended to submit your application before 18:00.</li>
     * <li>If the template fails the review, the reason for the failure will be returned. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm=a2c4g.11186623.0.0.41fd339f3bPSCQ">Handling Suggestions for Failed SMS Reviews</a>, invoke the <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-modifysmstemplate?spm=a2c4g.11186623.0.0.5b1f6e8bQloFit">ModifySmsTemplate</a> API or modify the SMS template on the <a href="https://dysms.console.aliyun.com/domestic/text/template">Template Management</a> page.</li>
     * <li>The current QuerySmsTemplate interface queries the audit details of a single template by template code. The <a href="https://help.aliyun.com/zh/sms/developer-reference/api-dysmsapi-2017-05-25-querysmstemplatelist?spm=a2c4g.11186623.0.0.24086e8bO8cFn4">QuerySmsTemplateList</a> interface can query the template details of all templates under your current account.</li>
     * </ul>
     * 
     * @param request the request parameters of GetSmsTemplate  GetSmsTemplateRequest
     * @return GetSmsTemplateResponse
     */
    CompletableFuture<GetSmsTemplateResponse> getSmsTemplate(GetSmsTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the operation or use the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a> to modify an existing signature and submit the signature for approval. The signature must comply with the <a href="https://help.aliyun.com/document_detail/108076.html">signature specifications</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/55324.html">Usage notes</a>.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Signatures pending approval cannot be modified.</li>
     * <li>You cannot modify a signature after it is approved. If you no longer need the signature, you can delete it.</li>
     * <li>If you are an individual user, you cannot apply for a new signature on the same day that your signature is rejected or deleted. We recommend that you modify the rejected signature and submit it again.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySmsSign  ModifySmsSignRequest
     * @return ModifySmsSignResponse
     */
    CompletableFuture<ModifySmsSignResponse> modifySmsSign(ModifySmsSignRequest request);

    /**
     * @deprecated OpenAPI ModifySmsTemplate is deprecated, please use Dysmsapi::2017-05-25::UpdateSmsTemplate instead.  * @description After you apply for a message template, if the template fails to pass the review, you can call this operation to modify the template and submit the template again. You can call this operation to modify only a template for a specific message type.
     * The template content must comply with the [SMS template specifications](https://help.aliyun.com/document_detail/108253.html).
     * For more information, see [Usage notes](https://help.aliyun.com/document_detail/55324.html).
     * ### QPS limit
     * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * 
     * @param request the request parameters of ModifySmsTemplate  ModifySmsTemplateRequest
     * @return ModifySmsTemplateResponse
     */
    @Deprecated
    CompletableFuture<ModifySmsTemplateResponse> modifySmsTemplate(ModifySmsTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryCardSmsTemplate  QueryCardSmsTemplateRequest
     * @return QueryCardSmsTemplateResponse
     */
    CompletableFuture<QueryCardSmsTemplateResponse> queryCardSmsTemplate(QueryCardSmsTemplateRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 300 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryCardSmsTemplateReport  QueryCardSmsTemplateReportRequest
     * @return QueryCardSmsTemplateReportResponse
     */
    CompletableFuture<QueryCardSmsTemplateReportResponse> queryCardSmsTemplateReport(QueryCardSmsTemplateReportRequest request);

    /**
     * @param request the request parameters of QueryExtCodeSign  QueryExtCodeSignRequest
     * @return QueryExtCodeSignResponse
     */
    CompletableFuture<QueryExtCodeSignResponse> queryExtCodeSign(QueryExtCodeSignRequest request);

    /**
     * @param request the request parameters of QueryMobilesCardSupport  QueryMobilesCardSupportRequest
     * @return QueryMobilesCardSupportResponse
     */
    CompletableFuture<QueryMobilesCardSupportResponse> queryMobilesCardSupport(QueryMobilesCardSupportRequest request);

    /**
     * @param request the request parameters of QueryPageSmartShortUrlLog  QueryPageSmartShortUrlLogRequest
     * @return QueryPageSmartShortUrlLogResponse
     */
    CompletableFuture<QueryPageSmartShortUrlLogResponse> queryPageSmartShortUrlLog(QueryPageSmartShortUrlLogRequest request);

    /**
     * @param request the request parameters of QuerySendDetails  QuerySendDetailsRequest
     * @return QuerySendDetailsResponse
     */
    CompletableFuture<QuerySendDetailsResponse> querySendDetails(QuerySendDetailsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the operation to query message delivery details, including the number of delivered messages, the number of messages with delivery receipts, and the time that a message is sent. If a large number of messages are sent on the specified date, you can specify the number of items displayed on each page and the number of pages to view the details by page.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 20 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QuerySendStatistics  QuerySendStatisticsRequest
     * @return QuerySendStatisticsResponse
     */
    CompletableFuture<QuerySendStatisticsResponse> querySendStatistics(QuerySendStatisticsRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>You can call this operation up to 20 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryShortUrl  QueryShortUrlRequest
     * @return QueryShortUrlResponse
     */
    CompletableFuture<QueryShortUrlResponse> queryShortUrl(QueryShortUrlRequest request);

    /**
     * @param request the request parameters of QuerySingleSmsQualification  QuerySingleSmsQualificationRequest
     * @return QuerySingleSmsQualificationResponse
     */
    CompletableFuture<QuerySingleSmsQualificationResponse> querySingleSmsQualification(QuerySingleSmsQualificationRequest request);

    /**
     * @param request the request parameters of QuerySmsAuthorizationLetter  QuerySmsAuthorizationLetterRequest
     * @return QuerySmsAuthorizationLetterResponse
     */
    CompletableFuture<QuerySmsAuthorizationLetterResponse> querySmsAuthorizationLetter(QuerySmsAuthorizationLetterRequest request);

    /**
     * @param request the request parameters of QuerySmsQualificationRecord  QuerySmsQualificationRecordRequest
     * @return QuerySmsQualificationRecordResponse
     */
    CompletableFuture<QuerySmsQualificationRecordResponse> querySmsQualificationRecord(QuerySmsQualificationRecordRequest request);

    /**
     * <b>description</b> :
     * <p>After you apply for an SMS signature, you can query its status by using the <a href="https://dysms.console.aliyun.com/dysms.htm">Alibaba Cloud SMS console</a> or calling the operation. If the signature is rejected, you can modify the signature based on the reason why it is rejected.</p>
     * <h3>QPS limits</h3>
     * <p>You can call this API operation up to 500 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QuerySmsSign  QuerySmsSignRequest
     * @return QuerySmsSignResponse
     */
    CompletableFuture<QuerySmsSignResponse> querySmsSign(QuerySmsSignRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of message signatures, including the name, creation time, and approval status of each signature. If a message template is rejected, the reason is returned. Modify the message signature based on the reason.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QuerySmsSignList  QuerySmsSignListRequest
     * @return QuerySmsSignListResponse
     */
    CompletableFuture<QuerySmsSignListResponse> querySmsSignList(QuerySmsSignListRequest request);

    /**
     * @deprecated OpenAPI QuerySmsTemplate is deprecated, please use Dysmsapi::2017-05-25::GetSmsTemplate instead.  * @description After you create a message template, you can call this operation to query the approval status of the template. If a message template is rejected, the reason is returned. Modify the message template based on the reason.
     * ### QPS limit
     * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     * 
     * @param request the request parameters of QuerySmsTemplate  QuerySmsTemplateRequest
     * @return QuerySmsTemplateResponse
     */
    @Deprecated
    CompletableFuture<QuerySmsTemplateResponse> querySmsTemplate(QuerySmsTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of message templates, including the name, creation time, and approval status of each template. If a message template is rejected, the reason is returned. Modify the message template based on the reason.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QuerySmsTemplateList  QuerySmsTemplateListRequest
     * @return QuerySmsTemplateListResponse
     */
    CompletableFuture<QuerySmsTemplateListResponse> querySmsTemplateList(QuerySmsTemplateListRequest request);

    /**
     * @param request the request parameters of RequiredPhoneCode  RequiredPhoneCodeRequest
     * @return RequiredPhoneCodeResponse
     */
    CompletableFuture<RequiredPhoneCodeResponse> requiredPhoneCode(RequiredPhoneCodeRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the operation to send multiple card messages to a maximum of mobile phone numbers at a time. Different signatures and rollback settings can be specified for the mobile phone numbers.</p>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of SendBatchCardSms  SendBatchCardSmsRequest
     * @return SendBatchCardSmsResponse
     */
    CompletableFuture<SendBatchCardSmsResponse> sendBatchCardSms(SendBatchCardSmsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the operation to send messages to a maximum of 100 recipients at a time.</p>
     * 
     * @param request the request parameters of SendBatchSms  SendBatchSmsRequest
     * @return SendBatchSmsResponse
     */
    CompletableFuture<SendBatchSmsResponse> sendBatchSms(SendBatchSmsRequest request);

    /**
     * <b>description</b> :
     * <p>  Make sure that the message template that you want to use has been approved. If the mobile phone number of a recipient does not support card messages, the SendCardSms operation allows the rollback feature to ensure successful delivery.</p>
     * <ul>
     * <li>When you call the SendCardSms operation to send card messages, the operation checks whether the mobile phone numbers of the recipients support card messages. If the mobile phone numbers do not support card messages, you can specify whether to enable rollback. Otherwise, the card message cannot be delivered.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of SendCardSms  SendCardSmsRequest
     * @return SendCardSmsResponse
     */
    CompletableFuture<SendCardSmsResponse> sendCardSms(SendCardSmsRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is mainly used to send a single message. In special scenarios, you can send multiple messages with the same content to a maximum of 1,000 mobile numbers. Note that group sending may be delayed.</p>
     * <ul>
     * <li>To send messages with different signatures and template content to multiple mobile numbers in a single request, call the <a href="https://help.aliyun.com/document_detail/102364.html">SendBatchSms</a> operation.</li>
     * <li>You are charged for using Alibaba Cloud Short Message Service (SMS) based on the amount of messages sent. For more information, see <a href="https://www.aliyun.com/price/product#/sms/detail">Pricing</a>.</li>
     * <li>If your verification code signature and general-purpose signature have the same name, the system uses the general-purpose signature to send messages by default.</li>
     * </ul>
     * 
     * @param request the request parameters of SendSms  SendSmsRequest
     * @return SendSmsResponse
     */
    CompletableFuture<SendSmsResponse> sendSms(SendSmsRequest request);

    /**
     * <b>description</b> :
     * <p>Metrics:</p>
     * <ul>
     * <li>Requested OTP messages</li>
     * <li>Verified OTP messages
     * An OTP conversion rate is calculated based on the following formula: OTP conversion rate = Number of verified OTP messages/Number of requested OTP messages.<blockquote>
     * <p>If you call the SmsConversion operation to query OTP conversion rates, your business may be affected. We recommend that you perform the following operations: 1. Call the SmsConversion operation in an asynchronous manner by configuring queues or events. 2. Manually degrade your services or use a circuit breaker to automatically degrade services.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of SmsConversionIntl  SmsConversionIntlRequest
     * @return SmsConversionIntlResponse
     */
    CompletableFuture<SmsConversionIntlResponse> smsConversionIntl(SmsConversionIntlRequest request);

    /**
     * @param request the request parameters of SubmitSmsQualification  SubmitSmsQualificationRequest
     * @return SubmitSmsQualificationResponse
     */
    CompletableFuture<SubmitSmsQualificationResponse> submitSmsQualification(SubmitSmsQualificationRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>You can call this operation up to 50 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateExtCodeSign  UpdateExtCodeSignRequest
     * @return UpdateExtCodeSignResponse
     */
    CompletableFuture<UpdateExtCodeSignResponse> updateExtCodeSign(UpdateExtCodeSignRequest request);

    /**
     * @param request the request parameters of UpdateSmsQualification  UpdateSmsQualificationRequest
     * @return UpdateSmsQualificationResponse
     */
    CompletableFuture<UpdateSmsQualificationResponse> updateSmsQualification(UpdateSmsQualificationRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface and the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on the Update of SMS Signature &amp; Template Interfaces</a>.</li>
     * <li>Only signatures that have not passed the review can be modified. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm">Handling Suggestions for Failed SMS Reviews</a> and call this interface to modify and resubmit for review after modification.</li>
     * <li>Signature information applied through the interface will be synchronized in the SMS service console. For operations related to signatures in the console, please see <a href="https://help.aliyun.com/zh/sms/user-guide/create-signatures?spm">SMS Signatures</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSmsSign  UpdateSmsSignRequest
     * @return UpdateSmsSignResponse
     */
    CompletableFuture<UpdateSmsSignResponse> updateSmsSign(UpdateSmsSignRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For details about the changes of this new interface compared to the original one, please refer to <a href="https://help.aliyun.com/zh/sms/product-overview/announcement-on-sms-service-update-signature-template-interface">Announcement on SMS Service Update: Signature &amp; Template Interfaces</a>.</li>
     * <li>Only templates that have not passed the review can be modified. Please refer to <a href="https://help.aliyun.com/zh/sms/user-guide/causes-of-application-failures-and-suggestions?spm=a2c4g.11186623.0.0.4bf5561ajcFtMQ">Handling Suggestions for Failed SMS Template Reviews</a> and call this interface to modify and resubmit for review.</li>
     * <li>Modifications made through the interface will be synchronized in the SMS service console. For related operations on templates in the console, see <a href="https://help.aliyun.com/zh/sms/user-guide/message-templates/?spm=a2c4g.11186623.0.0.35a947464Itaxp">SMS Templates</a>.</li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <p>The single-user QPS limit for this interface is 1000 times/second. Exceeding this limit will result in API throttling, which may impact your business. Please make calls reasonably.</p>
     * 
     * @param request the request parameters of UpdateSmsTemplate  UpdateSmsTemplateRequest
     * @return UpdateSmsTemplateResponse
     */
    CompletableFuture<UpdateSmsTemplateResponse> updateSmsTemplate(UpdateSmsTemplateRequest request);

    /**
     * @param request the request parameters of ValidPhoneCode  ValidPhoneCodeRequest
     * @return ValidPhoneCodeResponse
     */
    CompletableFuture<ValidPhoneCodeResponse> validPhoneCode(ValidPhoneCodeRequest request);

}
