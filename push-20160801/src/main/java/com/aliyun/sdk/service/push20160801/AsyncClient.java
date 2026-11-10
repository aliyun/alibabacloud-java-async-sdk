// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.push20160801.models.*;
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
     * <p>You can attach up to 10 aliases in a single request. The attachment takes effect immediately.</p>
     * 
     * @param request the request parameters of BindAlias  BindAliasRequest
     * @return BindAliasResponse
     */
    CompletableFuture<BindAliasResponse> bindAlias(BindAliasRequest request);

    /**
     * @param request the request parameters of BindPhone  BindPhoneRequest
     * @return BindPhoneResponse
     */
    CompletableFuture<BindPhoneResponse> bindPhone(BindPhoneRequest request);

    /**
     * @param request the request parameters of BindTag  BindTagRequest
     * @return BindTagResponse
     */
    CompletableFuture<BindTagResponse> bindTag(BindTagRequest request);

    /**
     * @param request the request parameters of CancelPush  CancelPushRequest
     * @return CancelPushResponse
     */
    CompletableFuture<CancelPushResponse> cancelPush(CancelPushRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the returned ExpireTime is greater than the current timestamp, it does not necessarily mean that the certificate is available. You must also check whether the Status is OK.</li>
     * <li>The REVOKED status is returned by the APNs server. If the certificate is in the REVOKED status, at least one push notification sent to APNs in the corresponding environment has failed.</li>
     * </ul>
     * 
     * @param request the request parameters of CheckCertificate  CheckCertificateRequest
     * @return CheckCertificateResponse
     */
    CompletableFuture<CheckCertificateResponse> checkCertificate(CheckCertificateRequest request);

    /**
     * @deprecated OpenAPI CheckDevice is deprecated, please use Push::2016-08-01::CheckDevices instead.  * @param request  the request parameters of CheckDevice  CheckDeviceRequest
     * @return CheckDeviceResponse
     */
    @Deprecated
    CompletableFuture<CheckDeviceResponse> checkDevice(CheckDeviceRequest request);

    /**
     * @param request the request parameters of CheckDevices  CheckDevicesRequest
     * @return CheckDevicesResponse
     */
    CompletableFuture<CheckDevicesResponse> checkDevices(CheckDevicesRequest request);

    /**
     * <b>description</b> :
     * <p>If you do not call this operation, the continuous push task automatically ends when it reaches its time-to-live (TTL).</p>
     * 
     * @param request the request parameters of CompleteContinuouslyPush  CompleteContinuouslyPushRequest
     * @return CompleteContinuouslyPushResponse
     */
    CompletableFuture<CompleteContinuouslyPushResponse> completeContinuouslyPush(CompleteContinuouslyPushRequest request);

    /**
     * <b>description</b> :
     * <p>This operation resolves the issue of the maximum number of targets per call in the <a href="https://help.aliyun.com/document_detail/2249916.html">Push advanced push operation</a>, regardless of whether the push is based on devices, accounts, or aliases.</p>
     * <ul>
     * <li>Using continuous push indicates that the business scenario involves sending the same message to a large number of devices. In this case, call the continuous push operation appropriately. For each call, aggregate a group of devices for the push. Currently, the maximum number of targets per push is 1,000 for device-based, account-based, and alias-based pushes. The total number of pushes for the same MessageId is limited to 10,000. If a higher quota is required, contact technical support to evaluate the specific scenario.</li>
     * <li>Before using this operation, call the Push operation, set Target to TBD (To Be Determined), and specify the message content to obtain the MessageId of the message in the push system. Then, you can repeatedly call this operation based on the MessageId and specify different target groups to push the message to these targets.</li>
     * <li>After you call the Push operation and set the target to TBD to obtain the MessageId, the message is retained in the push system for 24 hours by default. Before the message expires, you can use this operation to push the message to specified targets at any time. Pushes are not allowed after the message expires or the maximum total number of pushes is exceeded.</li>
     * <li>Each time you call this operation to specify devices, the message is pushed immediately. Scheduled pushes are not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of ContinuouslyPush  ContinuouslyPushRequest
     * @return ContinuouslyPushResponse
     */
    CompletableFuture<ContinuouslyPushResponse> continuouslyPush(ContinuouslyPushRequest request);

    /**
     * @deprecated OpenAPI ListSummaryApps is deprecated, please use Mhub::2017-08-25::ListApps instead.  * @param request  the request parameters of ListSummaryApps  ListSummaryAppsRequest
     * @return ListSummaryAppsResponse
     */
    @Deprecated
    CompletableFuture<ListSummaryAppsResponse> listSummaryApps(ListSummaryAppsRequest request);

    /**
     * @param request the request parameters of ListTags  ListTagsRequest
     * @return ListTagsResponse
     */
    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> of Mobile Push.</em>*
     * In some business scenarios, you may need to push different messages to a large number of different devices within a very short time. When the number of devices and messages is extremely large, a high queries per second (QPS) rate is generated. This may reach the QPS limit for a single source IP address and cause some push tasks to fail.
     * This operation is designed to address this issue. It allows you to pass up to 100 independent push tasks in a single call. By aggregating requests, it effectively reduces the QPS and improves the stability and success rate of mass single-target push tasks. The rate limit for batch push is 500 calls per second per account.
     * Each independent push task only supports three types of push targets: device, account, and alias. SMS integration configuration is currently not supported.</p>
     * <blockquote>
     * <p>The SDK must be upgraded to version 3.11.0 or later.</p>
     * </blockquote>
     * <h2>PushTask properties</h2>
     * <ul>
     * <li>The PushTask property format is PushTask.N.Property. It includes:<ul>
     * <li>Push target (destination)</li>
     * <li>Push configuration (config)</li>
     * <li>iOS notification task configuration</li>
     * <li>Android notification task configuration</li>
     * <li>Android auxiliary pop-up window configuration</li>
     * <li>HarmonyOS notification task configuration </li>
     * <li>Push control</li>
     * </ul>
     * </li>
     * <li>Each PushTask represents an independent push task. A maximum of 100 push tasks are supported. The push-related configurations are the same as those in the Push operation.</li>
     * <li>The PushTask.N.Target parameter only supports the DEVICE, ACCOUNT, and ALIAS types.</li>
     * <li>PushTask does not support SMS linkage configuration.</li>
     * <li>The product of the number of parent nodes and child nodes cannot exceed 10,000. Otherwise, the parameter is considered invalid.</li>
     * </ul>
     * 
     * @param request the request parameters of MassPush  MassPushRequest
     * @return MassPushResponse
     */
    CompletableFuture<MassPushResponse> massPush(MassPushRequest request);

    /**
     * <b>description</b> :
     * <p>Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing method and pricing</a> of EMAS Mobile Push.</p>
     * 
     * @param request the request parameters of MassPushV2  MassPushV2Request
     * @return MassPushV2Response
     */
    CompletableFuture<MassPushV2Response> massPushV2(MassPushV2Request request);

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> of EMAS Mobile Push.</em>*
     * This operation distinguishes between Android, iOS, and HarmonyOS platforms. For push calls on different platforms, you must pass the AppKey corresponding to the platform.</p>
     * 
     * @param request the request parameters of Push  PushRequest
     * @return PushResponse
     */
    CompletableFuture<PushResponse> push(PushRequest request);

    /**
     * <b>description</b> :
     * <p><em>This operation will be deprecated soon. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">advanced push API</a>, which provides enhanced push capabilities. To achieve the same result, set the <code>DeviceType</code> parameter to <code>ANDROID</code> and the <code>PushType</code> parameter to <code>MESSAGE</code> in the advanced push API.</em>*
     * <strong>Before using this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> for EMAS Mobile Push.</strong>
     * By default, this operation sends messages only to online devices. If a device is offline, set the <code>StoreOffline</code> parameter. The push system then stores the message and delivers it automatically when the device comes online.</p>
     * 
     * @param request the request parameters of PushMessageToAndroid  PushMessageToAndroidRequest
     * @return PushMessageToAndroidResponse
     */
    CompletableFuture<PushMessageToAndroidResponse> pushMessageToAndroid(PushMessageToAndroidRequest request);

    /**
     * <b>description</b> :
     * <p><em>This API is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">advanced push API</a> for more push capabilities. In that API, set the push platform <code>DeviceType</code> to <code>iOS</code> and the push type <code>PushType</code> to <code>MESSAGE</code> to achieve the same effect.</em>*
     * <strong>Before you use this API, review the <a href="https://help.aliyun.com/document_detail/434638.html">billing methods and pricing</a> for EMAS Mobile Push.</strong>
     * By default, this API sends messages only to online devices. If a device is offline, you can set the <code>StoreOffline</code> parameter. The push system then saves the message and automatically delivers it when the device comes back online.</p>
     * 
     * @param request the request parameters of PushMessageToiOS  PushMessageToiOSRequest
     * @return PushMessageToiOSResponse
     */
    CompletableFuture<PushMessageToiOSResponse> pushMessageToiOS(PushMessageToiOSRequest request);

    /**
     * <b>description</b> :
     * <p><em>This operation is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">Advanced Push API</a> instead. In that API, set the <code>DeviceType</code> parameter to <code>ANDROID</code> and the <code>PushType</code> parameter to <code>NOTICE</code>.</em>*
     * <strong>Before using this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing model</a> for EMAS Mobile Push.</strong></p>
     * 
     * @param request the request parameters of PushNoticeToAndroid  PushNoticeToAndroidRequest
     * @return PushNoticeToAndroidResponse
     */
    CompletableFuture<PushNoticeToAndroidResponse> pushNoticeToAndroid(PushNoticeToAndroidRequest request);

    /**
     * <b>description</b> :
     * <p><em>This operation is deprecated. Use the <a href="https://help.aliyun.com/document_detail/2249916.html">Advanced Push API</a> instead. Set the <code>DeviceType</code> parameter to <code>iOS</code> and the <code>PushType</code> parameter to <code>NOTICE</code>.</em>*
     * <strong>Before you use this operation, review the <a href="https://help.aliyun.com/document_detail/434638.html">pricing and billing model</a> for EMAS Mobile Push.</strong></p>
     * 
     * @param request the request parameters of PushNoticeToiOS  PushNoticeToiOSRequest
     * @return PushNoticeToiOSResponse
     */
    CompletableFuture<PushNoticeToiOSResponse> pushNoticeToiOS(PushNoticeToiOSRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/434638.html">billing rules and pricing</a> of EMAS mobile push.</em>*
     * This operation differentiates between the Android, iOS, and HarmonyOS platforms. To send push notifications to different platforms, pass in the AppKey that corresponds to the target platform.</p>
     * 
     * @param request the request parameters of PushV2  PushV2Request
     * @return PushV2Response
     */
    CompletableFuture<PushV2Response> pushV2(PushV2Request request);

    /**
     * @param request the request parameters of QueryAliases  QueryAliasesRequest
     * @return QueryAliasesResponse
     */
    CompletableFuture<QueryAliasesResponse> queryAliases(QueryAliasesRequest request);

    /**
     * @param request the request parameters of QueryDeviceInfo  QueryDeviceInfoRequest
     * @return QueryDeviceInfoResponse
     */
    CompletableFuture<QueryDeviceInfoResponse> queryDeviceInfo(QueryDeviceInfoRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Currently, this API supports only daily data. The daily dimension lets you query data for up to 31 days. Days are calculated based on UTC+8.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryDeviceStat  QueryDeviceStatRequest
     * @return QueryDeviceStatResponse
     */
    CompletableFuture<QueryDeviceStatResponse> queryDeviceStat(QueryDeviceStatRequest request);

    /**
     * @param request the request parameters of QueryDevicesByAccount  QueryDevicesByAccountRequest
     * @return QueryDevicesByAccountResponse
     */
    CompletableFuture<QueryDevicesByAccountResponse> queryDevicesByAccount(QueryDevicesByAccountRequest request);

    /**
     * @param request the request parameters of QueryDevicesByAlias  QueryDevicesByAliasRequest
     * @return QueryDevicesByAliasResponse
     */
    CompletableFuture<QueryDevicesByAliasResponse> queryDevicesByAlias(QueryDevicesByAliasRequest request);

    /**
     * @param request the request parameters of QueryPushRecords  QueryPushRecordsRequest
     * @return QueryPushRecordsResponse
     */
    CompletableFuture<QueryPushRecordsResponse> queryPushRecords(QueryPushRecordsRequest request);

    /**
     * @param request the request parameters of QueryPushStatByApp  QueryPushStatByAppRequest
     * @return QueryPushStatByAppResponse
     */
    CompletableFuture<QueryPushStatByAppResponse> queryPushStatByApp(QueryPushStatByAppRequest request);

    /**
     * @param request the request parameters of QueryPushStatByMsg  QueryPushStatByMsgRequest
     * @return QueryPushStatByMsgResponse
     */
    CompletableFuture<QueryPushStatByMsgResponse> queryPushStatByMsg(QueryPushStatByMsgRequest request);

    /**
     * @param request the request parameters of QueryTags  QueryTagsRequest
     * @return QueryTagsResponse
     */
    CompletableFuture<QueryTagsResponse> queryTags(QueryTagsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation returns data only at the daily granularity. You can query up to 31 days of data. Deduplicated device counts reset on the first day of each month.</p>
     * </blockquote>
     * 
     * @param request the request parameters of QueryUniqueDeviceStat  QueryUniqueDeviceStatRequest
     * @return QueryUniqueDeviceStatResponse
     */
    CompletableFuture<QueryUniqueDeviceStatResponse> queryUniqueDeviceStat(QueryUniqueDeviceStatRequest request);

    /**
     * <b>description</b> :
     * <p>Deleting a tag takes time. The time required depends on the number of tagged resources. Do not immediately recreate a tag with the same name after you delete it. Wait at least 5 minutes before you recreate a tag in the same app. If you delete multiple tags, wait at least 5 minutes for each deleted tag before you recreate them.</p>
     * 
     * @param request the request parameters of RemoveTag  RemoveTagRequest
     * @return RemoveTagResponse
     */
    CompletableFuture<RemoveTagResponse> removeTag(RemoveTagRequest request);

    /**
     * @param request the request parameters of UnbindAlias  UnbindAliasRequest
     * @return UnbindAliasResponse
     */
    CompletableFuture<UnbindAliasResponse> unbindAlias(UnbindAliasRequest request);

    /**
     * @param request the request parameters of UnbindPhone  UnbindPhoneRequest
     * @return UnbindPhoneResponse
     */
    CompletableFuture<UnbindPhoneResponse> unbindPhone(UnbindPhoneRequest request);

    /**
     * @param request the request parameters of UnbindTag  UnbindTagRequest
     * @return UnbindTagResponse
     */
    CompletableFuture<UnbindTagResponse> unbindTag(UnbindTagRequest request);

}
