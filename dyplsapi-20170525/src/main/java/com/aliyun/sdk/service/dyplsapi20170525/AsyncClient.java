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
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
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
     * <blockquote>
     * <p> An AXN private number is a dedicated private number assigned to phone number A. When an N-side number is used to call phone number X, the call is forwarded to phone number A.</p>
     * </blockquote>
     * 
     * @param request the request parameters of BindAxn  BindAxnRequest
     * @return BindAxnResponse
     */
    CompletableFuture<BindAxnResponse> bindAxn(BindAxnRequest request);

    /**
     * <b>description</b> :
     * <p>Before you add an AXN extension binding, confirm phone number A and phone number N in the business scenario. Phone number A belongs to a customer, and phone number X is the private number assigned to the customer. When any other phone number is used to call phone number X and the extension, the call is transferred to phone number A. When phone number A is used to call phone number X, the call is transferred to the default phone number B that is specified during the phone number binding.</p>
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of BindAxnExtension  BindAxnExtensionRequest
     * @return BindAxnExtensionResponse
     */
    CompletableFuture<BindAxnExtensionResponse> bindAxnExtension(BindAxnExtensionRequest request);

    /**
     * @param request the request parameters of BindBatchAxg  BindBatchAxgRequest
     * @return BindBatchAxgResponse
     */
    CompletableFuture<BindBatchAxgResponse> bindBatchAxg(BindBatchAxgRequest request);

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
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreatePickUpWaybill  CreatePickUpWaybillRequest
     * @return CreatePickUpWaybillResponse
     */
    CompletableFuture<CreatePickUpWaybillResponse> createPickUpWaybill(CreatePickUpWaybillRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of CreatePickUpWaybillPreQuery  CreatePickUpWaybillPreQueryRequest
     * @return CreatePickUpWaybillPreQueryResponse
     */
    CompletableFuture<CreatePickUpWaybillPreQueryResponse> createPickUpWaybillPreQuery(CreatePickUpWaybillPreQueryRequest request);

    /**
     * @param request the request parameters of CreateSmsSign  CreateSmsSignRequest
     * @return CreateSmsSignResponse
     */
    CompletableFuture<CreateSmsSignResponse> createSmsSign(CreateSmsSignRequest request);

    /**
     * @param request the request parameters of DeleteAxgGroup  DeleteAxgGroupRequest
     * @return DeleteAxgGroupResponse
     */
    CompletableFuture<DeleteAxgGroupResponse> deleteAxgGroup(DeleteAxgGroupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of DeleteSecretBlacklist  DeleteSecretBlacklistRequest
     * @return DeleteSecretBlacklistResponse
     */
    CompletableFuture<DeleteSecretBlacklistResponse> deleteSecretBlacklist(DeleteSecretBlacklistRequest request);

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
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. We recommend that you take note of the limit when you call this operation.</p>
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
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * <h3><a href="#poolkeyproducttype"></a>Limits on PoolKey and ProductType</h3>
     * <p>You must specify either PoolKey or ProductType. If both parameters are not specified, an error is reported when you call the QuerySubscriptionDetail operation. We recommend that you specify the ProductType parameter for the original key accounts of Alibaba Cloud and the PoolKey parameter for Alibaba Cloud users.</p>
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
     * <h3><a href="#qps"></a>QPS limits</h3>
     * <p>You can call this operation up to 10,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * @param request the request parameters of UpdateSubscription  UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    CompletableFuture<UpdateSubscriptionResponse> updateSubscription(UpdateSubscriptionRequest request);

}
