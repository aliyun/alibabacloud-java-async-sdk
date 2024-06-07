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
      * ### [](#qps)QPS limits
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<AddAxnTrackNoResponse> addAxnTrackNo(AddAxnTrackNoRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<AddSecretBlacklistResponse> addSecretBlacklist(AddSecretBlacklistRequest request);

    /**
      * Before you add an AXB binding, we recommend that you specify role A and role B in the AXB device certificate (ProductKey, DeviceName, and DeviceSecret) in your business scenario. For example, in a taxi-hailing scenario, role A is the passenger and role B is the driver.
      * ### [](#qps)QPS limits
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<BindAxbResponse> bindAxb(BindAxbRequest request);

    /**
      * An AXG protection solution can be configured to meet the requirements for grading users, limiting the scope of calls, and restricting order snatching. The letter G represents a phone number group to which you can add phone numbers as needed.
      * ### [](#qps)QPS limits
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<BindAxgResponse> bindAxg(BindAxgRequest request);

    /**
      * >  An AXN private number is a dedicated private number assigned to phone number A. When an N-side number is used to call phone number X, the call is forwarded to phone number A.
      *
     */
    CompletableFuture<BindAxnResponse> bindAxn(BindAxnRequest request);

    /**
      * Before you add an AXN extension binding, confirm phone number A and phone number N in the business scenario. Phone number A belongs to a customer, and phone number X is the private number assigned to the customer. When any other phone number is used to call phone number X and the extension, the call is transferred to phone number A. When phone number A is used to call phone number X, the call is transferred to the default phone number B that is specified during the phone number binding.
      * ### [](#qps)QPS limits
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<BindAxnExtensionResponse> bindAxnExtension(BindAxnExtensionRequest request);

    CompletableFuture<BindBatchAxgResponse> bindBatchAxg(BindBatchAxgRequest request);

    /**
      * *   After you create a phone number pool in the Phone Number Protection console, the phone number pool is empty by default. You must purchase phone numbers and add them to the phone number pool.
      * *   Before you call this operation, make sure that you are familiar with the [pricing](~~59825~~) of Phone Number Protection.
      * *   When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before you call this operation to purchase a phone number, check the quantity of phone numbers available for purchase by using the [QuerySecretNoRemain](~~111699~~) operation.
      * *   The account used to purchase a phone number must be an enterprise account that has passed real-name verification. For more information about how to perform real-name verification, see [Enterprise verification FAQs](~~37172~~).
      *
     */
    CompletableFuture<BuySecretNoResponse> buySecretNo(BuySecretNoRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CancelPickUpWaybillResponse> cancelPickUpWaybill(CancelPickUpWaybillRequest request);

    /**
      * Before you add an AXG binding, you must purchase phone number X, create number group G, and then add phone numbers to number group G. If you do not add phone numbers to number group G after you create number group G, you can call the [OperateAxgGroup](https://help.aliyun.com/document_detail/110252.htm) operation to add phone numbers to number group G.
      * >  Up to 2,000 number groups G can be added for a single phone number pool.
      *
     */
    CompletableFuture<CreateAxgGroupResponse> createAxgGroup(CreateAxgGroupRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreatePickUpWaybillResponse> createPickUpWaybill(CreatePickUpWaybillRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<CreatePickUpWaybillPreQueryResponse> createPickUpWaybillPreQuery(CreatePickUpWaybillPreQueryRequest request);

    CompletableFuture<DeleteAxgGroupResponse> deleteAxgGroup(DeleteAxgGroupRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<DeleteSecretBlacklistResponse> deleteSecretBlacklist(DeleteSecretBlacklistRequest request);

    /**
      * Before you call the GetSecretAsrDetail operation, set the ASRStatus parameter to true in the [BindAxn operation](~~400483~~). This ensures that you can obtain the ASR result properly.
      * ### [](#qps)QPS limits
      * You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetSecretAsrDetailResponse> getSecretAsrDetail(GetSecretAsrDetailRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<GetTotalPublicUrlResponse> getTotalPublicUrl(GetTotalPublicUrlRequest request);

    /**
      * After a phone number is locked, the locked phone number cannot be selected when you call an operation to create a binding.
      * ### [](#qps)QPS limits
      * You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<LockSecretNoResponse> lockSecretNo(LockSecretNoRequest request);

    /**
      * After you create number group G, you can call the OperateAxgGroup operation to modify number group G. For example, you can add phone numbers to number group G, delete phone numbers from number group G, and replace all phone numbers in number group G.
      * ### [](#qps)QPS limits
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<OperateAxgGroupResponse> operateAxgGroup(OperateAxgGroupRequest request);

    /**
      * The OperateBlackNo operation supports the following number pool types: AXN, AXN extension, and 95AXN.
      * ### [](#qps)QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<OperateBlackNoResponse> operateBlackNo(OperateBlackNoRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QueryPhoneNoAByTrackNoResponse> queryPhoneNoAByTrackNo(QueryPhoneNoAByTrackNoRequest request);

    /**
      * If the recording feature is enabled for a binding, all calls made by the bound phone numbers are recorded. You can obtain the download URL of a recording file by calling the QueryRecordFileDownloadUrl operation and download the recording file.
      * >  We recommend that you subscribe to [the recording status report SecretRecording](~~109198~~). The values of the response parameters in SecretRecording can be used as the values of the request parameters for downloading a recording file.
      * ### [](#)Procedure for obtaining a recording file
      * 1.  Specify the request parameter in an update or binding operation to enable the recording feature.
      * 2.  Subscribe to recording message receipts in the Phone Number Protection console.
      * 3.  After a recording message receipt is returned, call the QueryRecordFileDownloadUrl operation to obtain the download URL of the recording file, and download the recording file.
      * > 
      * *   A download URL is valid for 2 hours. Download the recording file as soon as possible after obtaining a download URL.
      * *   The storage period of recording files is 30 days. You can download only the recording files of calls recorded in the last 30 days.
      *
     */
    CompletableFuture<QueryRecordFileDownloadUrlResponse> queryRecordFileDownloadUrl(QueryRecordFileDownloadUrlRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 1,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<QuerySecretNoDetailResponse> querySecretNoDetail(QuerySecretNoDetailRequest request);

    /**
      * When purchasing a phone number, specify the home location. If no sufficient phone numbers are available for purchase in the home location, the purchase of the phone number fails. Before calling the [BuySecretNo](~~BuySecretNo~~) operation to purchase a phone number, call the [QuerySecretNoRemain](~~QuerySecretNoRemain~~) operation to query the quantity of remaining phone numbers available for online purchase.
      *
     */
    CompletableFuture<QuerySecretNoRemainResponse> querySecretNoRemain(QuerySecretNoRemainRequest request);

    /**
      * You can query binding IDs by phone number X. In the AXB product, multiple bindings may exist for the same phone number X. In this case, multiple binding IDs may be obtained for the same phone number X.
      *
     */
    CompletableFuture<QuerySubsIdResponse> querySubsId(QuerySubsIdRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 5,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      * ### [](#poolkeyproducttype)Limits on PoolKey and ProductType
      * You must specify either PoolKey or ProductType. If both parameters are not specified, an error is reported when you call the QuerySubscriptionDetail operation. We recommend that you specify the ProductType parameter for the original key accounts of Alibaba Cloud and the PoolKey parameter for Alibaba Cloud users.
      *
     */
    CompletableFuture<QuerySubscriptionDetailResponse> querySubscriptionDetail(QuerySubscriptionDetailRequest request);

    /**
      * *   After a phone number is released, it will no longer be charged from the following month.
      * *   Before you release a phone number, log on to the [Phone Number Protection console](https://dypls.console.aliyun.com/dypls.htm#/account) to check whether the phone number is bound to other phone numbers. The phone number can be released only if it is not bound to other phone numbers.
      *
     */
    CompletableFuture<ReleaseSecretNoResponse> releaseSecretNo(ReleaseSecretNoRequest request);

    /**
      * Before releasing a phone number, you must call the UnbindSubscription operation to unbind the phone number.
      *
     */
    CompletableFuture<UnbindSubscriptionResponse> unbindSubscription(UnbindSubscriptionRequest request);

    /**
      * After a phone number is unlocked, you can reselect the unlocked phone number when you call an operation to create a binding.
      * ### [](#qps)QPS limits
      * You can call this operation up to 500 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<UnlockSecretNoResponse> unlockSecretNo(UnlockSecretNoRequest request);

    /**
      * ### [](#qps)QPS limits
      * You can call this operation up to 10,000 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
      *
     */
    CompletableFuture<UpdateSubscriptionResponse> updateSubscription(UpdateSubscriptionRequest request);

}
