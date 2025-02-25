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
     * @param request the request parameters of CompleteContinuouslyPush  CompleteContinuouslyPushRequest
     * @return CompleteContinuouslyPushResponse
     */
    CompletableFuture<CompleteContinuouslyPushResponse> completeContinuouslyPush(CompleteContinuouslyPushRequest request);

    /**
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
     * @param request the request parameters of MassPush  MassPushRequest
     * @return MassPushResponse
     */
    CompletableFuture<MassPushResponse> massPush(MassPushRequest request);

    /**
     * @param request the request parameters of Push  PushRequest
     * @return PushResponse
     */
    CompletableFuture<PushResponse> push(PushRequest request);

    /**
     * @param request the request parameters of PushMessageToAndroid  PushMessageToAndroidRequest
     * @return PushMessageToAndroidResponse
     */
    CompletableFuture<PushMessageToAndroidResponse> pushMessageToAndroid(PushMessageToAndroidRequest request);

    /**
     * @param request the request parameters of PushMessageToiOS  PushMessageToiOSRequest
     * @return PushMessageToiOSResponse
     */
    CompletableFuture<PushMessageToiOSResponse> pushMessageToiOS(PushMessageToiOSRequest request);

    /**
     * @param request the request parameters of PushNoticeToAndroid  PushNoticeToAndroidRequest
     * @return PushNoticeToAndroidResponse
     */
    CompletableFuture<PushNoticeToAndroidResponse> pushNoticeToAndroid(PushNoticeToAndroidRequest request);

    /**
     * @param request the request parameters of PushNoticeToiOS  PushNoticeToiOSRequest
     * @return PushNoticeToiOSResponse
     */
    CompletableFuture<PushNoticeToiOSResponse> pushNoticeToiOS(PushNoticeToiOSRequest request);

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
     * @param request the request parameters of QueryUniqueDeviceStat  QueryUniqueDeviceStatRequest
     * @return QueryUniqueDeviceStatResponse
     */
    CompletableFuture<QueryUniqueDeviceStatResponse> queryUniqueDeviceStat(QueryUniqueDeviceStatRequest request);

    /**
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
