// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.appstream_center20210903.models.*;
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
     * @param request the request parameters of GetConnectionTicket  GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    CompletableFuture<GetConnectionTicketResponse> getConnectionTicket(GetConnectionTicketRequest request);

    /**
     * @param request the request parameters of ListPublishedAppInfo  ListPublishedAppInfoRequest
     * @return ListPublishedAppInfoResponse
     */
    CompletableFuture<ListPublishedAppInfoResponse> listPublishedAppInfo(ListPublishedAppInfoRequest request);

    /**
     * @param request the request parameters of ListRunningApps  ListRunningAppsRequest
     * @return ListRunningAppsResponse
     */
    CompletableFuture<ListRunningAppsResponse> listRunningApps(ListRunningAppsRequest request);

    /**
     * @param request the request parameters of ResetAppResources  ResetAppResourcesRequest
     * @return ResetAppResourcesResponse
     */
    CompletableFuture<ResetAppResourcesResponse> resetAppResources(ResetAppResourcesRequest request);

    /**
     * @param request the request parameters of RestartAppResources  RestartAppResourcesRequest
     * @return RestartAppResourcesResponse
     */
    CompletableFuture<RestartAppResourcesResponse> restartAppResources(RestartAppResourcesRequest request);

    /**
     * @param request the request parameters of StartAppResources  StartAppResourcesRequest
     * @return StartAppResourcesResponse
     */
    CompletableFuture<StartAppResourcesResponse> startAppResources(StartAppResourcesRequest request);

    /**
     * @param request the request parameters of StopApp  StopAppRequest
     * @return StopAppResponse
     */
    CompletableFuture<StopAppResponse> stopApp(StopAppRequest request);

    /**
     * @param request the request parameters of StopAppResources  StopAppResourcesRequest
     * @return StopAppResourcesResponse
     */
    CompletableFuture<StopAppResourcesResponse> stopAppResources(StopAppResourcesRequest request);

    /**
     * @param request the request parameters of Unbind  UnbindRequest
     * @return UnbindResponse
     */
    CompletableFuture<UnbindResponse> unbind(UnbindRequest request);

}
