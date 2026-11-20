// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dyplsapi20170525.models.*;
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
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of AddAxnTrackNo  AddAxnTrackNoRequest
     * @return AddAxnTrackNoResponse
     */
    CompletableFuture<AddAxnTrackNoResponse> addAxnTrackNo(AddAxnTrackNoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is not a batch operation. You can add only one pair of <strong>point-to-point blacklist</strong> numbers or one <strong>number pool blacklist</strong> number at a time.</li>
     * <li>To delete a blacklist entry, call the <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-deletesecretblacklist">DeleteSecretBlacklist</a> operation.</li>
     * </ul>
     * <h3>Quantity limit</h3>
     * <p>The maximum number of blacklist entries per number pool is 2,000,000. If this limit is exceeded, API calls to add blacklist numbers will fail, which may affect your business. If you have special requirements, contact your Alibaba Cloud account manager.</p>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. If this limit is exceeded, API calls will be throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of AddSecretBlacklist  AddSecretBlacklistRequest
     * @return AddSecretBlacklistResponse
     */
    CompletableFuture<AddSecretBlacklistResponse> addSecretBlacklist(AddSecretBlacklistRequest request);

    /**
     * @param request the request parameters of BindAXBCall  BindAXBCallRequest
     * @return BindAXBCallResponse
     */
    CompletableFuture<BindAXBCallResponse> bindAXBCall(BindAXBCallRequest request);

    /**
     * <b>description</b> :
     * <p>Before you add an AXB binding, we recommend that you specify role A and role B in the AXB device certificate (ProductKey, DeviceName, and DeviceSecret) in your business scenario. For example, in a taxi-hailing scenario, role A is the passenger and role B is the driver.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of BindAxb  BindAxbRequest
     * @return BindAxbResponse
     */
    CompletableFuture<BindAxbResponse> bindAxb(BindAxbRequest request);

    /**
     * <b>description</b> :
     * <p>Before invoking this operation, make sure that you have purchased a private number in the console.
     * You can use this operation to attach numbers for a 700AXB private number, or attach A and B numbers for a 700AXB private number on the Number Management page in the console.
     * Before attaching numbers for a 700AXB private number, determine the A role and B role in your business scenario. For example, in a ride-hailing scenario, A is the passenger and B is the driver.
     * The 700AXB private number is mainly used for privacy protection in one-to-one scenarios. You attach number A and number B through the Phone Number Protection service. When A calls X, the call is forwarded to B. When B calls X, the call is forwarded to A. A single X number can be reused by up to 200 binding pairs, such as A1XB1, A2XB2, A3XB3, and so on. As long as the phone numbers of A and B users are unique, a single X number can be bound to 200 groups of phone numbers simultaneously, and calls can also be made simultaneously.
     * QPS limit
     * The single-user QPS limit for this operation is 5,000 calls per second. Exceeding this limit will cause throttling, which may affect your business. Invoke this operation appropriately.</p>
     * 
     * @param request the request parameters of BindAxb700  BindAxb700Request
     * @return BindAxb700Response
     */
    CompletableFuture<BindAxb700Response> bindAxb700(BindAxb700Request request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this operation, make sure that you have purchased a privacy number in the console. You can use this operation to bind numbers to a fixed-line AXB intermediate number. Currently, you cannot bind Number A and Number B to a fixed-line AXB intermediate number on the Number Management page in the console.</li>
     * <li>Before binding numbers, we recommend that you clarify the roles of User A and User B in your business scenario. For example, in common scenarios such as ride-hailing, User A is the passenger and User B is the driver.</li>
     * <li>Fixed-line AXB intermediate numbers are mainly used for privacy protection in one-to-one scenarios. Number A and Number B are bound through the Phone Number Protection service. When User A calls Number X, the call is forwarded to User B. When User B calls Number X, the call is forwarded to User A. A single fixed-line Number X can be reused for N binding relationships, such as A1-X-B1, A2-X-B2, and A3-X-B3. As long as the mobile phone numbers of Users A and B are not duplicated, a single fixed-line Number X can be bound to N pairs of mobile phone numbers simultaneously, and calls can be made concurrently.</li>
     * <li>The number of times a number can be reused varies based on the number you purchased. You can confirm the specific reuse limit with your technical support when purchasing the number.</li>
     * </ul>
     * 
     * @param request the request parameters of BindAxbFixedLine  BindAxbFixedLineRequest
     * @return BindAxbFixedLineResponse
     */
    CompletableFuture<BindAxbFixedLineResponse> bindAxbFixedLine(BindAxbFixedLineRequest request);

    /**
     * <b>description</b> :
     * <p>An AXG protection solution can be configured to meet the requirements for grading users, limiting the scope of calls, and restricting order snatching. The letter G represents a phone number group to which you can add phone numbers as needed.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of BindAxg  BindAxgRequest
     * @return BindAxgResponse
     */
    CompletableFuture<BindAxgResponse> bindAxg(BindAxgRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased a privacy number</a> in the console.</li>
     * <li>You can use this operation to bind numbers to an AXN privacy number, or bind Number A and Number B to an AXN privacy number on the <a href="https://dyplsnext.console.aliyun.com/number/list?spm=a2c4g.11186623.0.0.64e649bbTzmb6j&resType=1&billId=FC100000165392498">Number Management</a> page in the console.</li>
     * <li>Before binding numbers to an AXN privacy number, clarify the role of User A in your business scenario. For example, in a used car information publishing scenario, User A represents the contact information of the landlord or agent.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 5,000 calls per second. If this limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of BindAxn  BindAxnRequest
     * @return BindAxnResponse
     */
    CompletableFuture<BindAxnResponse> bindAxn(BindAxnRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this operation, make sure that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased privacy numbers</a> in the console.</li>
     * <li>You can use this operation to bind numbers to an AXN extension number. You can also bind numbers A and B to an AXN extension number on the <a href="https://dyplsnext.console.aliyun.com/number/list?spm=a2c4g.11186623.0.0.64e649bbTzmb6j&resType=1&billId=FC100000165392498">Number Management</a> page in the console.</li>
     * <li>Before binding numbers for an AXN extension number, we recommend that you clarify the roles of A and N in your business scenario. For example, if number A is a customer, number X is the privacy number assigned to the customer. Calls from any other number to number X plus the extension number are forwarded to number A. When A calls X, the call is forwarded to the default number B specified during binding.</li>
     * </ul>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 5,000 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of BindAxnExtension  BindAxnExtensionRequest
     * @return BindAxnExtensionResponse
     */
    CompletableFuture<BindAxnExtensionResponse> bindAxnExtension(BindAxnExtensionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before calling this API, make sure that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased privacy numbers</a> in the console.</li>
     * <li>You can use this API to bind numbers for the fixed-line AXN extension number. Binding numbers for the fixed-line AXN extension number through the console is not supported.</li>
     * <li>Before binding numbers, we recommend that you first clarify the A role and N role in your business scenario. For example, if the A number represents the customer, the X number is the privacy number assigned to the customer. Any other number calling the X number plus the extension number will be forwarded to the A number. When A calls X, the call will be forwarded to the default B number specified during binding.</li>
     * </ul>
     * 
     * @param request the request parameters of BindAxnExtensionFixedLine  BindAxnExtensionFixedLineRequest
     * @return BindAxnExtensionFixedLineResponse
     */
    CompletableFuture<BindAxnExtensionFixedLineResponse> bindAxnExtensionFixedLine(BindAxnExtensionFixedLineRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you call this operation, make sure that you have purchased a privacy number in the console. You can use this operation to bind a number to a fixed-line AXN privacy number. The console does not support binding for fixed-line AXN privacy numbers.</li>
     * <li>Before binding a number, we recommend that you clarify the role of User A in your business scenario. For example, in a used car listing scenario, User A represents the contact information of the property owner or broker.</li>
     * </ul>
     * 
     * @param request the request parameters of BindAxnFixedLine  BindAxnFixedLineRequest
     * @return BindAxnFixedLineResponse
     */
    CompletableFuture<BindAxnFixedLineResponse> bindAxnFixedLine(BindAxnFixedLineRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you bind AXG Numbers, you must purchase X Numbers, create a G Number Group, and add Numbers to the group. To create a G Number Group, see <a href="https://help.aliyun.com/zh/pnp/user-guide/manage-phone-number-pools#section-9bb-xrg-c78">Set up G Number Group</a> or call the <a href="https://help.aliyun.com/zh/pnp/developer-reference/api-dyplsapi-2017-05-25-createaxggroup">CreateAxgGroup</a> API.</li>
     * <li>Before binding AXG Numbers, define Role A and Role G for your business scenario. For example, on a recruitment platform, Role A can represent job applicants and Role G can represent the hiring team.</li>
     * <li>When you call this API for Batch Binding of AXG Numbers, a single failed request does not affect others in the batch. The API returns a status code for each binding request.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 5,000 per user. Exceeding this limit results in throttling. Plan your API calls accordingly to avoid impacting your business.</p>
     * 
     * @param request the request parameters of BindBatchAxg  BindBatchAxgRequest
     * @return BindBatchAxgResponse
     */
    CompletableFuture<BindBatchAxgResponse> bindBatchAxg(BindBatchAxgRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you have purchased a private number in the console.
     * You can use this operation to bind numbers to a 700GXB private number, or bind numbers on the Number Management page in the console.
     * Before binding numbers for a 700GXB private number, clarify the G role and B role in your business scenario. For example, on a recruitment platform, B is the job applicant and G is the recruitment team.
     * QPS limit
     * The single-user QPS limit for this operation is 5,000 calls per second. If this limit is exceeded, API calls are throttled, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of BindGxb700  BindGxb700Request
     * @return BindGxb700Response
     */
    CompletableFuture<BindGxb700Response> bindGxb700(BindGxb700Request request);

    /**
     * @param request the request parameters of BindXB  BindXBRequest
     * @return BindXBResponse
     */
    CompletableFuture<BindXBResponse> bindXB(BindXBRequest request);

    /**
     * <b>description</b> :
     * <p>  After you create a phone number pool in the Phone Number Protection console, the phone number pool is empty by default. You must purchase phone numbers and add them to the phone number pool.</p>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/59825.html">pricing</a> of Phone Number Protection.</li>
     * <li>When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before you call this operation to purchase a phone number, check the quantity of phone numbers available for purchase by using the <a href="https://help.aliyun.com/document_detail/111699.html">QuerySecretNoRemain</a> operation.</li>
     * <li>The account used to purchase a phone number must be an enterprise account that has passed real-name verification. For more information about how to perform real-name verification, see <a href="https://help.aliyun.com/document_detail/37172.html">Enterprise verification FAQs</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of BuySecretNo  BuySecretNoRequest
     * @return BuySecretNoResponse
     */
    CompletableFuture<BuySecretNoResponse> buySecretNo(BuySecretNoRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CancelPickUpWaybill  CancelPickUpWaybillRequest
     * @return CancelPickUpWaybillResponse
     */
    CompletableFuture<CancelPickUpWaybillResponse> cancelPickUpWaybill(CancelPickUpWaybillRequest request);

    /**
     * @param request the request parameters of ConfigX  ConfigXRequest
     * @return ConfigXResponse
     */
    CompletableFuture<ConfigXResponse> configX(ConfigXRequest request);

    /**
     * <b>description</b> :
     * <p>Before you add an AXG binding, you must purchase phone number X, create number group G, and then add phone numbers to number group G. If you do not add phone numbers to number group G after you create number group G, you can call the <a href="https://help.aliyun.com/document_detail/110252.htm">OperateAxgGroup</a> operation to add phone numbers to number group G.</p>
     * <blockquote>
     * <p> Up to 2,000 number groups G can be added for a single phone number pool.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateAxgGroup  CreateAxgGroupRequest
     * @return CreateAxgGroupResponse
     */
    CompletableFuture<CreateAxgGroupResponse> createAxgGroup(CreateAxgGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before invoking this API, you need to first call <a href="https://help.aliyun.com/document_detail/2880885.html">GetDyplsOSSInfoForUploadFile</a> to upload the individual\&quot;s photo information to OSS. For the detailed operation flow, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit Individual Real-name Information for Number A via API</a>.</p>
     * <h3>queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 50 queries per second per user. If this limit is exceeded, Rate Limiting will be applied to your API Call, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of CreateFixedNoAReport  CreateFixedNoAReportRequest
     * @return CreateFixedNoAReportResponse
     */
    CompletableFuture<CreateFixedNoAReportResponse> createFixedNoAReport(CreateFixedNoAReportRequest request);

    /**
     * <b>description</b> :
     * <p>Before invoking this API, you must first call <a href="https://help.aliyun.com/document_detail/2880885.html">GetDyplsOSSInfoForUploadFile</a> to upload the individual\&quot;s photo information to OSS. For the detailed operation flow, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit Individual Real-name Information of an A-number Mobile Phone Number via API</a>.</p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 50 requests per second per user. If this limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * @param request the request parameters of CreatePhoneNoAReport  CreatePhoneNoAReportRequest
     * @return CreatePhoneNoAReportResponse
     */
    CompletableFuture<CreatePhoneNoAReportResponse> createPhoneNoAReport(CreatePhoneNoAReportRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 200 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * @param request the request parameters of CreatePickUpWaybill  CreatePickUpWaybillRequest
     * @return CreatePickUpWaybillResponse
     */
    CompletableFuture<CreatePickUpWaybillResponse> createPickUpWaybill(CreatePickUpWaybillRequest request);

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 100 calls per second. Exceeding this limit will trigger throttling, which may affect your business. Call this operation appropriately.</p>
     * 
     * @param request the request parameters of CreatePickUpWaybillPreQuery  CreatePickUpWaybillPreQueryRequest
     * @return CreatePickUpWaybillPreQueryResponse
     */
    CompletableFuture<CreatePickUpWaybillPreQueryResponse> createPickUpWaybillPreQuery(CreatePickUpWaybillPreQueryRequest request);

    /**
     * @param request the request parameters of CreateSecretTransferRecord  CreateSecretTransferRecordRequest
     * @return CreateSecretTransferRecordResponse
     */
    CompletableFuture<CreateSecretTransferRecordResponse> createSecretTransferRecord(CreateSecretTransferRecordRequest request);

    /**
     * @param request the request parameters of CreateSmsSign  CreateSmsSignRequest
     * @return CreateSmsSignResponse
     */
    CompletableFuture<CreateSmsSignResponse> createSmsSign(CreateSmsSignRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After unbinding a fixed-line AXB privacy number from an existing binding, your business continuity may be affected. Proceed with caution.</li>
     * <li>Before releasing a number, you must unbind the number first.</li>
     * <li>Unbinding a fixed-line AXB privacy number is supported only through this API. Unbinding through the console is currently not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAxbBindFixedLine  DeleteAxbBindFixedLineRequest
     * @return DeleteAxbBindFixedLineResponse
     */
    CompletableFuture<DeleteAxbBindFixedLineResponse> deleteAxbBindFixedLine(DeleteAxbBindFixedLineRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Deleted G groups cannot be recovered. Proceed with caution.</li>
     * <li>Before calling this operation, verify the G group to be deleted and the Number Pool it belongs to.</li>
     * <li>You cannot delete a G group that has active bindings. Before you delete the group, you must unbind the associated AXG privacy number. To do this, log on to the Phone Number Privacy Protection <a href="https://dyplsnext.console.aliyun.com/number/list">Console</a>, go to the <strong>Number Management</strong> page, filter by <strong>AXG privacy number</strong>, and click <strong>Details</strong> &gt; Unbind. Alternatively, you can call the <a href="https://help.aliyun.com/zh/pnp/developer-reference/api-dyplsapi-2017-05-25-unbindsubscription">UnbindSubscription</a> API to unbind the number.</li>
     * <li>When you delete a G group, all phone numbers in the group are also deleted.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this API is 5,000 requests per second. API calls that exceed this limit are subject to throttling. Plan your API calls accordingly to prevent disruptions to your business.</p>
     * 
     * @param request the request parameters of DeleteAxgGroup  DeleteAxgGroupRequest
     * @return DeleteAxgGroupResponse
     */
    CompletableFuture<DeleteAxgGroupResponse> deleteAxgGroup(DeleteAxgGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After you unbind an existing fixed-line AXN private number binding relationship, your service continuity may be affected. Proceed with caution.</li>
     * <li>Before releasing a number, unbind the number binding relationship.</li>
     * <li>Unbinding a fixed-line AXN private number binding relationship is supported only through this API operation. The console does not support this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAxnBindFixedLine  DeleteAxnBindFixedLineRequest
     * @return DeleteAxnBindFixedLineResponse
     */
    CompletableFuture<DeleteAxnBindFixedLineResponse> deleteAxnBindFixedLine(DeleteAxnBindFixedLineRequest request);

    /**
     * @param request the request parameters of DeleteAxnExtensionBindFixedLine  DeleteAxnExtensionBindFixedLineRequest
     * @return DeleteAxnExtensionBindFixedLineResponse
     */
    CompletableFuture<DeleteAxnExtensionBindFixedLineResponse> deleteAxnExtensionBindFixedLine(DeleteAxnExtensionBindFixedLineRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This API can only delete A-number filing records whose filing status is either &quot;Reviewed and Passed&quot; or &quot;Review Failed.&quot; It does not support deleting A-number filing records with a filing status of &quot;Under Review.&quot;</li>
     * <li>After deleting an A-number filing record, the carrier will immediately impose call restrictions or deactivate the number, which may impact your business continuity. Proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSecretAPhoneNoToCust  DeleteSecretAPhoneNoToCustRequest
     * @return DeleteSecretAPhoneNoToCustResponse
     */
    CompletableFuture<DeleteSecretAPhoneNoToCustResponse> deleteSecretAPhoneNoToCust(DeleteSecretAPhoneNoToCustRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>This operation is not a batch operation. It supports deleting only one pair of point-to-point blacklist numbers or one number pool blacklist number at a time.</li>
     * <li>To add a blacklist, call the <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-addsecretblacklist">AddSecretBlacklist</a> operation.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * @param request the request parameters of DeleteSecretBlacklist  DeleteSecretBlacklistRequest
     * @return DeleteSecretBlacklistResponse
     */
    CompletableFuture<DeleteSecretBlacklistResponse> deleteSecretBlacklist(DeleteSecretBlacklistRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When uploading personal filing photos for an A-number mobile phone number, you must upload a clear frontal portrait photo with the face unobscured, and optionally select to upload photos of both sides of your ID card. Uploading these photos helps reviewers understand your personal identity information. Supported formats are PNG, JPG, and JPEG. The image size must not exceed 2 MB.</li>
     * <li>For the specific operation flow when submitting personal real-name filing for an A-number mobile phone number through the API, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit Personal Real-Name Information for an A-Number Mobile Phone Number via API</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetDyplsOSSInfoForUploadFile  GetDyplsOSSInfoForUploadFileRequest
     * @return GetDyplsOSSInfoForUploadFileResponse
     */
    CompletableFuture<GetDyplsOSSInfoForUploadFileResponse> getDyplsOSSInfoForUploadFile(GetDyplsOSSInfoForUploadFileRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call the GetSecretAsrDetail operation, set the ASRStatus parameter to true in the <a href="https://help.aliyun.com/document_detail/400483.html">BindAxn operation</a>. This ensures that you can obtain the ASR result properly.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetSecretAsrDetail  GetSecretAsrDetailRequest
     * @return GetSecretAsrDetailResponse
     */
    CompletableFuture<GetSecretAsrDetailResponse> getSecretAsrDetail(GetSecretAsrDetailRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of GetTotalPublicUrl  GetTotalPublicUrlRequest
     * @return GetTotalPublicUrlResponse
     */
    CompletableFuture<GetTotalPublicUrlResponse> getTotalPublicUrl(GetTotalPublicUrlRequest request);

    /**
     * @param request the request parameters of GetXConfig  GetXConfigRequest
     * @return GetXConfigResponse
     */
    CompletableFuture<GetXConfigResponse> getXConfig(GetXConfigRequest request);

    /**
     * @param request the request parameters of GetXDefaultConfig  GetXDefaultConfigRequest
     * @return GetXDefaultConfigResponse
     */
    CompletableFuture<GetXDefaultConfigResponse> getXDefaultConfig(GetXDefaultConfigRequest request);

    /**
     * @param request the request parameters of ListXTelephones  ListXTelephonesRequest
     * @return ListXTelephonesResponse
     */
    CompletableFuture<ListXTelephonesResponse> listXTelephones(ListXTelephonesRequest request);

    /**
     * <b>description</b> :
     * <p>After a phone number is locked, the locked phone number cannot be selected when you call an operation to create a binding.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of LockSecretNo  LockSecretNoRequest
     * @return LockSecretNoResponse
     */
    CompletableFuture<LockSecretNoResponse> lockSecretNo(LockSecretNoRequest request);

    /**
     * <b>description</b> :
     * <p>After you create number group G, you can call the OperateAxgGroup operation to modify number group G. For example, you can add phone numbers to number group G, delete phone numbers from number group G, and replace all phone numbers in number group G.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of OperateAxgGroup  OperateAxgGroupRequest
     * @return OperateAxgGroupResponse
     */
    CompletableFuture<OperateAxgGroupResponse> operateAxgGroup(OperateAxgGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The OperateBlackNo operation supports the following number pool types: AXN, AXN extension, and 95AXN.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of OperateBlackNo  OperateBlackNoRequest
     * @return OperateBlackNoResponse
     */
    CompletableFuture<OperateBlackNoResponse> operateBlackNo(OperateBlackNoRequest request);

    /**
     * @param request the request parameters of QueryAxbBindFixedLine  QueryAxbBindFixedLineRequest
     * @return QueryAxbBindFixedLineResponse
     */
    CompletableFuture<QueryAxbBindFixedLineResponse> queryAxbBindFixedLine(QueryAxbBindFixedLineRequest request);

    /**
     * @param request the request parameters of QueryAxnBindFixedLine  QueryAxnBindFixedLineRequest
     * @return QueryAxnBindFixedLineResponse
     */
    CompletableFuture<QueryAxnBindFixedLineResponse> queryAxnBindFixedLine(QueryAxnBindFixedLineRequest request);

    /**
     * @param request the request parameters of QueryAxnExtensionBindFixedLine  QueryAxnExtensionBindFixedLineRequest
     * @return QueryAxnExtensionBindFixedLineResponse
     */
    CompletableFuture<QueryAxnExtensionBindFixedLineResponse> queryAxnExtensionBindFixedLine(QueryAxnExtensionBindFixedLineRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of QueryPhoneNoAByTrackNo  QueryPhoneNoAByTrackNoRequest
     * @return QueryPhoneNoAByTrackNoResponse
     */
    CompletableFuture<QueryPhoneNoAByTrackNoResponse> queryPhoneNoAByTrackNo(QueryPhoneNoAByTrackNoRequest request);

    /**
     * <b>description</b> :
     * <p>If the recording feature is enabled for a binding, all calls made by the bound phone numbers are recorded. You can obtain the download URL of a recording file by calling the QueryRecordFileDownloadUrl operation and download the recording file.</p>
     * <blockquote>
     * <p> We recommend that you subscribe to <a href="https://help.aliyun.com/document_detail/109198.html">the recording status report SecretRecording</a>. The values of the response parameters in SecretRecording can be used as the values of the request parameters for downloading a recording file.</p>
     * </blockquote>
     * <h3><a href="#"></a>Procedure for obtaining a recording file</h3>
     * <ol>
     * <li>Specify the request parameter in an update or binding operation to enable the recording feature.</li>
     * <li>Subscribe to recording message receipts in the Phone Number Protection console.</li>
     * <li>After a recording message receipt is returned, call the QueryRecordFileDownloadUrl operation to obtain the download URL of the recording file, and download the recording file.<blockquote>
     * </blockquote>
     * </li>
     * </ol>
     * <ul>
     * <li>A download URL is valid for 2 hours. Download the recording file as soon as possible after obtaining a download URL.</li>
     * <li>The storage period of recording files is 30 days. You can download only the recording files of calls recorded in the last 30 days.</li>
     * </ul>
     * 
     * @param request the request parameters of QueryRecordFileDownloadUrl  QueryRecordFileDownloadUrlRequest
     * @return QueryRecordFileDownloadUrlResponse
     */
    CompletableFuture<QueryRecordFileDownloadUrlResponse> queryRecordFileDownloadUrl(QueryRecordFileDownloadUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke this API to query the reporting status of an A number, you must first submit the real-name information for the mobile or landline A number by calling the <a href="https://help.aliyun.com/document_detail/2880908.html">CreatePhoneNoAReport</a> or <a href="https://help.aliyun.com/document_detail/2881429.html">CreateFixedNoAReport</a> API. For detailed instructions, see <a href="https://help.aliyun.com/document_detail/2880077.html">Submit real-name information for an A number via API</a>.</p>
     * 
     * @param request the request parameters of QuerySecretAPhoneNoToCust  QuerySecretAPhoneNoToCustRequest
     * @return QuerySecretAPhoneNoToCustResponse
     */
    CompletableFuture<QuerySecretAPhoneNoToCustResponse> querySecretAPhoneNoToCust(QuerySecretAPhoneNoToCustRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can query information about a private number (X number), including the purchase time, carrier, province, city, and status.</li>
     * <li>Before you call this operation, make sure that you have the private number (X number) that you want to query.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The single-user QPS limit for this operation is 1,000 calls per second. If the limit is exceeded, the API call is throttled. Call this operation properly.</p>
     * 
     * @param request the request parameters of QuerySecretNoDetail  QuerySecretNoDetailRequest
     * @return QuerySecretNoDetailResponse
     */
    CompletableFuture<QuerySecretNoDetailResponse> querySecretNoDetail(QuerySecretNoDetailRequest request);

    /**
     * <b>description</b> :
     * <p>When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before calling the <a href="~~BuySecretNo~~">BuySecretNo</a> operation to purchase a phone number, call the <a href="~~QuerySecretNoRemain~~">QuerySecretNoRemain</a> operation to query the quantity of remaining phone numbers available for online purchase.</p>
     * 
     * @param request the request parameters of QuerySecretNoRemain  QuerySecretNoRemainRequest
     * @return QuerySecretNoRemainResponse
     */
    CompletableFuture<QuerySecretNoRemainResponse> querySecretNoRemain(QuerySecretNoRemainRequest request);

    /**
     * @param request the request parameters of QuerySecretTransferDetails  QuerySecretTransferDetailsRequest
     * @return QuerySecretTransferDetailsResponse
     */
    CompletableFuture<QuerySecretTransferDetailsResponse> querySecretTransferDetails(QuerySecretTransferDetailsRequest request);

    /**
     * @param request the request parameters of QuerySoundRecord  QuerySoundRecordRequest
     * @return QuerySoundRecordResponse
     */
    CompletableFuture<QuerySoundRecordResponse> querySoundRecord(QuerySoundRecordRequest request);

    /**
     * <b>description</b> :
     * <p>You can query binding IDs by phone number X. In the AXB product, multiple bindings may exist for the same phone number X. In this case, multiple binding IDs may be obtained for the same phone number X.</p>
     * 
     * @param request the request parameters of QuerySubsId  QuerySubsIdRequest
     * @return QuerySubsIdResponse
     */
    CompletableFuture<QuerySubsIdResponse> querySubsId(QuerySubsIdRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have the private number (X number) to query and that the number has a binding relationship.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 1,000. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * <h3>PoolKey and ProductType limit</h3>
     * <p>Specify at least one of the PoolKey and ProductType parameters. If neither parameter is specified, an error is returned.
     * Former Alibaba Dayu users should specify the ProductType parameter, and Alibaba Cloud users should specify the PoolKey parameter.</p>
     * 
     * @param request the request parameters of QuerySubscriptionDetail  QuerySubscriptionDetailRequest
     * @return QuerySubscriptionDetailResponse
     */
    CompletableFuture<QuerySubscriptionDetailResponse> querySubscriptionDetail(QuerySubscriptionDetailRequest request);

    /**
     * <b>description</b> :
     * <p>  After a phone number is released, it will no longer be charged from the following month.</p>
     * <ul>
     * <li>Before you release a phone number, log on to the <a href="https://dypls.console.aliyun.com/dypls.htm#/account">Phone Number Protection console</a> to check whether the phone number is bound to other phone numbers. The phone number can be released only if it is not bound to other phone numbers.</li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseSecretNo  ReleaseSecretNoRequest
     * @return ReleaseSecretNoResponse
     */
    CompletableFuture<ReleaseSecretNoResponse> releaseSecretNo(ReleaseSecretNoRequest request);

    /**
     * @param request the request parameters of UnBindAXB  UnBindAXBRequest
     * @return UnBindAXBResponse
     */
    CompletableFuture<UnBindAXBResponse> unBindAXB(UnBindAXBRequest request);

    /**
     * @param request the request parameters of UnBindXB  UnBindXBRequest
     * @return UnBindXBResponse
     */
    CompletableFuture<UnBindXBResponse> unBindXB(UnBindXBRequest request);

    /**
     * @param request the request parameters of UnbindSubs700  UnbindSubs700Request
     * @return UnbindSubs700Response
     */
    CompletableFuture<UnbindSubs700Response> unbindSubs700(UnbindSubs700Request request);

    /**
     * <b>description</b> :
     * <p>Before releasing a phone number, you must call the UnbindSubscription operation to unbind the phone number.</p>
     * 
     * @param request the request parameters of UnbindSubscription  UnbindSubscriptionRequest
     * @return UnbindSubscriptionResponse
     */
    CompletableFuture<UnbindSubscriptionResponse> unbindSubscription(UnbindSubscriptionRequest request);

    /**
     * <b>description</b> :
     * <p>After a phone number is unlocked, you can reselect the unlocked phone number when you call an operation to create a binding.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UnlockSecretNo  UnlockSecretNoRequest
     * @return UnlockSecretNoResponse
     */
    CompletableFuture<UnlockSecretNoResponse> unlockSecretNo(UnlockSecretNoRequest request);

    /**
     * <b>description</b> :
     * <p>When you update an AXB privacy number for landlines, you cannot modify Number A and Number B at the same time. For example, if the original binding relationship is A1 and B1, you can change it to A1 and B2, or A2 and B1.</p>
     * 
     * @param request the request parameters of UpdateAxbBindFixedLine  UpdateAxbBindFixedLineRequest
     * @return UpdateAxbBindFixedLineResponse
     */
    CompletableFuture<UpdateAxbBindFixedLineResponse> updateAxbBindFixedLine(UpdateAxbBindFixedLineRequest request);

    /**
     * @param request the request parameters of UpdateAxnBindFixedLine  UpdateAxnBindFixedLineRequest
     * @return UpdateAxnBindFixedLineResponse
     */
    CompletableFuture<UpdateAxnBindFixedLineResponse> updateAxnBindFixedLine(UpdateAxnBindFixedLineRequest request);

    /**
     * @param request the request parameters of UpdateAxnExtensionBindFixedLine  UpdateAxnExtensionBindFixedLineRequest
     * @return UpdateAxnExtensionBindFixedLineResponse
     */
    CompletableFuture<UpdateAxnExtensionBindFixedLineResponse> updateAxnExtensionBindFixedLine(UpdateAxnExtensionBindFixedLineRequest request);

    /**
     * @param request the request parameters of UpdateSubs700  UpdateSubs700Request
     * @return UpdateSubs700Response
     */
    CompletableFuture<UpdateSubs700Response> updateSubs700(UpdateSubs700Request request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 10,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateSubscription  UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    CompletableFuture<UpdateSubscriptionResponse> updateSubscription(UpdateSubscriptionRequest request);

}
