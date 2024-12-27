// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.xtrace20190808.models.*;
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
     * @param request the request parameters of CheckCommercialStatus  CheckCommercialStatusRequest
     * @return CheckCommercialStatusResponse
     */
    CompletableFuture<CheckCommercialStatusResponse> checkCommercialStatus(CheckCommercialStatusRequest request);

    /**
     * @param request the request parameters of GetTagKey  GetTagKeyRequest
     * @return GetTagKeyResponse
     */
    CompletableFuture<GetTagKeyResponse> getTagKey(GetTagKeyRequest request);

    /**
     * @param request the request parameters of GetTagVal  GetTagValRequest
     * @return GetTagValResponse
     */
    CompletableFuture<GetTagValResponse> getTagVal(GetTagValRequest request);

    /**
     * @param request the request parameters of GetTrace  GetTraceRequest
     * @return GetTraceResponse
     */
    CompletableFuture<GetTraceResponse> getTrace(GetTraceRequest request);

    /**
     * @param request the request parameters of ListIpOrHosts  ListIpOrHostsRequest
     * @return ListIpOrHostsResponse
     */
    CompletableFuture<ListIpOrHostsResponse> listIpOrHosts(ListIpOrHostsRequest request);

    /**
     * @param request the request parameters of ListServices  ListServicesRequest
     * @return ListServicesResponse
     */
    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    /**
     * @param request the request parameters of ListSpanNames  ListSpanNamesRequest
     * @return ListSpanNamesResponse
     */
    CompletableFuture<ListSpanNamesResponse> listSpanNames(ListSpanNamesRequest request);

    /**
     * @param request the request parameters of OpenXtraceService  OpenXtraceServiceRequest
     * @return OpenXtraceServiceResponse
     */
    CompletableFuture<OpenXtraceServiceResponse> openXtraceService(OpenXtraceServiceRequest request);

    /**
     * @param request the request parameters of QueryMetric  QueryMetricRequest
     * @return QueryMetricResponse
     */
    CompletableFuture<QueryMetricResponse> queryMetric(QueryMetricRequest request);

    /**
     * @param request the request parameters of SearchTraces  SearchTracesRequest
     * @return SearchTracesResponse
     */
    CompletableFuture<SearchTracesResponse> searchTraces(SearchTracesRequest request);

}
