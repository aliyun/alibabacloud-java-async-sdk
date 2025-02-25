// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mindlive20210301.models.*;
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

    CompletableFuture<LoginDeviceResponse> loginDevice(LoginDeviceRequest request);

    CompletableFuture<LogoutDeviceResponse> logoutDevice(LogoutDeviceRequest request);

    CompletableFuture<QueryItemBackgroundsResponse> queryItemBackgrounds(QueryItemBackgroundsRequest request);

    CompletableFuture<ReportCurrentBackgroundResponse> reportCurrentBackground(ReportCurrentBackgroundRequest request);

    CompletableFuture<ReportDevConfigResponse> reportDevConfig(ReportDevConfigRequest request);

    CompletableFuture<ReportLiveStateResponse> reportLiveState(ReportLiveStateRequest request);

    CompletableFuture<ReportScreenResponse> reportScreen(ReportScreenRequest request);

    CompletableFuture<ReportUserConfigResponse> reportUserConfig(ReportUserConfigRequest request);

    CompletableFuture<RequestAuthorizationDataResponse> requestAuthorizationData(RequestAuthorizationDataRequest request);

    CompletableFuture<RequestBackgroundResponse> requestBackground(RequestBackgroundRequest request);

    CompletableFuture<RequestBindDataResponse> requestBindData(RequestBindDataRequest request);

    CompletableFuture<RequestBindingStateResponse> requestBindingState(RequestBindingStateRequest request);

    CompletableFuture<RequestDeviceInfoResponse> requestDeviceInfo(RequestDeviceInfoRequest request);

    CompletableFuture<RequestIotTriadResponse> requestIotTriad(RequestIotTriadRequest request);

    CompletableFuture<RequestLiveSellPointStateResponse> requestLiveSellPointState(RequestLiveSellPointStateRequest request);

    CompletableFuture<RequestLiveTeleprompterStateResponse> requestLiveTeleprompterState(RequestLiveTeleprompterStateRequest request);

    CompletableFuture<RequestOssStsResponse> requestOssSts(RequestOssStsRequest request);

    CompletableFuture<RequestPasterResponse> requestPaster(RequestPasterRequest request);

    CompletableFuture<RequestResetDataResponse> requestResetData(RequestResetDataRequest request);

    CompletableFuture<RequestServiceInfoResponse> requestServiceInfo(RequestServiceInfoRequest request);

    CompletableFuture<RequestUserConfigResponse> requestUserConfig(RequestUserConfigRequest request);

    CompletableFuture<RequestUserSellPointTemplateResponse> requestUserSellPointTemplate(RequestUserSellPointTemplateRequest request);

    CompletableFuture<ResetDeviceResponse> resetDevice(ResetDeviceRequest request);

    CompletableFuture<UpdateCurrentItemResponse> updateCurrentItem(UpdateCurrentItemRequest request);

    CompletableFuture<UpdateLiveSellPointStateResponse> updateLiveSellPointState(UpdateLiveSellPointStateRequest request);

    CompletableFuture<UpdateLiveTeleprompterStateResponse> updateLiveTeleprompterState(UpdateLiveTeleprompterStateRequest request);

}
