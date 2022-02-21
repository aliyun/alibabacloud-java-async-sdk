// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.xtrace20190808.models.*;
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

    CompletableFuture<GetTagKeyResponse> getTagKey(GetTagKeyRequest request);

    CompletableFuture<GetTagValResponse> getTagVal(GetTagValRequest request);

    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    CompletableFuture<GetTraceResponse> getTrace(GetTraceRequest request);

    CompletableFuture<ListIpOrHostsResponse> listIpOrHosts(ListIpOrHostsRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<ListSpanNamesResponse> listSpanNames(ListSpanNamesRequest request);

    CompletableFuture<QueryMetricResponse> queryMetric(QueryMetricRequest request);

    CompletableFuture<SearchTracesResponse> searchTraces(SearchTracesRequest request);

}
