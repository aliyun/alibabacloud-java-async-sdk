// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.push20160801.models.*;
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

    CompletableFuture<BindAliasResponse> bindAlias(BindAliasRequest request);

    CompletableFuture<BindPhoneResponse> bindPhone(BindPhoneRequest request);

    CompletableFuture<BindTagResponse> bindTag(BindTagRequest request);

    CompletableFuture<CancelPushResponse> cancelPush(CancelPushRequest request);

    CompletableFuture<CheckCertificateResponse> checkCertificate(CheckCertificateRequest request);

    CompletableFuture<CheckDeviceResponse> checkDevice(CheckDeviceRequest request);

    CompletableFuture<CheckDevicesResponse> checkDevices(CheckDevicesRequest request);

    CompletableFuture<CompleteContinuouslyPushResponse> completeContinuouslyPush(CompleteContinuouslyPushRequest request);

    CompletableFuture<ContinuouslyPushResponse> continuouslyPush(ContinuouslyPushRequest request);

    CompletableFuture<ListSummaryAppsResponse> listSummaryApps(ListSummaryAppsRequest request);

    CompletableFuture<ListTagsResponse> listTags(ListTagsRequest request);

    CompletableFuture<MassPushResponse> massPush(MassPushRequest request);

    CompletableFuture<PushResponse> push(PushRequest request);

    CompletableFuture<PushMessageToAndroidResponse> pushMessageToAndroid(PushMessageToAndroidRequest request);

    CompletableFuture<PushMessageToiOSResponse> pushMessageToiOS(PushMessageToiOSRequest request);

    CompletableFuture<PushNoticeToAndroidResponse> pushNoticeToAndroid(PushNoticeToAndroidRequest request);

    CompletableFuture<PushNoticeToiOSResponse> pushNoticeToiOS(PushNoticeToiOSRequest request);

    CompletableFuture<QueryAliasesResponse> queryAliases(QueryAliasesRequest request);

    CompletableFuture<QueryDeviceCountResponse> queryDeviceCount(QueryDeviceCountRequest request);

    CompletableFuture<QueryDeviceInfoResponse> queryDeviceInfo(QueryDeviceInfoRequest request);

    CompletableFuture<QueryDeviceStatResponse> queryDeviceStat(QueryDeviceStatRequest request);

    CompletableFuture<QueryDevicesByAccountResponse> queryDevicesByAccount(QueryDevicesByAccountRequest request);

    CompletableFuture<QueryDevicesByAliasResponse> queryDevicesByAlias(QueryDevicesByAliasRequest request);

    CompletableFuture<QueryPushRecordsResponse> queryPushRecords(QueryPushRecordsRequest request);

    CompletableFuture<QueryPushStatByAppResponse> queryPushStatByApp(QueryPushStatByAppRequest request);

    CompletableFuture<QueryPushStatByMsgResponse> queryPushStatByMsg(QueryPushStatByMsgRequest request);

    CompletableFuture<QueryTagsResponse> queryTags(QueryTagsRequest request);

    CompletableFuture<QueryUniqueDeviceStatResponse> queryUniqueDeviceStat(QueryUniqueDeviceStatRequest request);

    CompletableFuture<RemoveTagResponse> removeTag(RemoveTagRequest request);

    CompletableFuture<UnbindAliasResponse> unbindAlias(UnbindAliasRequest request);

    CompletableFuture<UnbindPhoneResponse> unbindPhone(UnbindPhoneRequest request);

    CompletableFuture<UnbindTagResponse> unbindTag(UnbindTagRequest request);

}
