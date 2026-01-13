// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.iqs20241121.models.*;
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
     * @param request the request parameters of ApplyFormalService  ApplyFormalServiceRequest
     * @return ApplyFormalServiceResponse
     */
    CompletableFuture<ApplyFormalServiceResponse> applyFormalService(ApplyFormalServiceRequest request);

    /**
     * @param request the request parameters of CheckAccountType  CheckAccountTypeRequest
     * @return CheckAccountTypeResponse
     */
    CompletableFuture<CheckAccountTypeResponse> checkAccountType(CheckAccountTypeRequest request);

    /**
     * @param request the request parameters of DownloadApiCallDailyDetail  DownloadApiCallDailyDetailRequest
     * @return DownloadApiCallDailyDetailResponse
     */
    CompletableFuture<DownloadApiCallDailyDetailResponse> downloadApiCallDailyDetail(DownloadApiCallDailyDetailRequest request);

    /**
     * @param request the request parameters of DownloadMeteringDailyDetail  DownloadMeteringDailyDetailRequest
     * @return DownloadMeteringDailyDetailResponse
     */
    CompletableFuture<DownloadMeteringDailyDetailResponse> downloadMeteringDailyDetail(DownloadMeteringDailyDetailRequest request);

    /**
     * @param request the request parameters of ExpandSearchExpiredTime  ExpandSearchExpiredTimeRequest
     * @return ExpandSearchExpiredTimeResponse
     */
    CompletableFuture<ExpandSearchExpiredTimeResponse> expandSearchExpiredTime(ExpandSearchExpiredTimeRequest request);

    /**
     * @param request the request parameters of GetAccountConfigInfo  GetAccountConfigInfoRequest
     * @return GetAccountConfigInfoResponse
     */
    CompletableFuture<GetAccountConfigInfoResponse> getAccountConfigInfo(GetAccountConfigInfoRequest request);

    /**
     * @param request the request parameters of GetAccountReviewRecord  GetAccountReviewRecordRequest
     * @return GetAccountReviewRecordResponse
     */
    CompletableFuture<GetAccountReviewRecordResponse> getAccountReviewRecord(GetAccountReviewRecordRequest request);

    /**
     * @param request the request parameters of GetMeteringSummary  GetMeteringSummaryRequest
     * @return GetMeteringSummaryResponse
     */
    CompletableFuture<GetMeteringSummaryResponse> getMeteringSummary(GetMeteringSummaryRequest request);

    /**
     * @param request the request parameters of GetServiceConfig  GetServiceConfigRequest
     * @return GetServiceConfigResponse
     */
    CompletableFuture<GetServiceConfigResponse> getServiceConfig(GetServiceConfigRequest request);

    /**
     * @param request the request parameters of ListApiCallDailyDetail  ListApiCallDailyDetailRequest
     * @return ListApiCallDailyDetailResponse
     */
    CompletableFuture<ListApiCallDailyDetailResponse> listApiCallDailyDetail(ListApiCallDailyDetailRequest request);

    /**
     * @param request the request parameters of ListApiNames  ListApiNamesRequest
     * @return ListApiNamesResponse
     */
    CompletableFuture<ListApiNamesResponse> listApiNames(ListApiNamesRequest request);

    /**
     * @param request the request parameters of ListMeteringDailyDetail  ListMeteringDailyDetailRequest
     * @return ListMeteringDailyDetailResponse
     */
    CompletableFuture<ListMeteringDailyDetailResponse> listMeteringDailyDetail(ListMeteringDailyDetailRequest request);

    /**
     * @param request the request parameters of ListSubAccountInfo  ListSubAccountInfoRequest
     * @return ListSubAccountInfoResponse
     */
    CompletableFuture<ListSubAccountInfoResponse> listSubAccountInfo(ListSubAccountInfoRequest request);

    /**
     * @param request the request parameters of ManageSearchAccountInfo  ManageSearchAccountInfoRequest
     * @return ManageSearchAccountInfoResponse
     */
    CompletableFuture<ManageSearchAccountInfoResponse> manageSearchAccountInfo(ManageSearchAccountInfoRequest request);

}
