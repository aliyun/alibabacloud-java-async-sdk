// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.marketing_event20210101.models.*;
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
     * @param request the request parameters of AddSumRecordFlowPop  AddSumRecordFlowPopRequest
     * @return AddSumRecordFlowPopResponse
     */
    CompletableFuture<AddSumRecordFlowPopResponse> addSumRecordFlowPop(AddSumRecordFlowPopRequest request);

    /**
     * @param request the request parameters of BindExhibitorRfidPop  BindExhibitorRfidPopRequest
     * @return BindExhibitorRfidPopResponse
     */
    CompletableFuture<BindExhibitorRfidPopResponse> bindExhibitorRfidPop(BindExhibitorRfidPopRequest request);

    /**
     * @param request the request parameters of BindGuestRfidPop  BindGuestRfidPopRequest
     * @return BindGuestRfidPopResponse
     */
    CompletableFuture<BindGuestRfidPopResponse> bindGuestRfidPop(BindGuestRfidPopRequest request);

    /**
     * @param request the request parameters of CheckNFCBindPop  CheckNFCBindPopRequest
     * @return CheckNFCBindPopResponse
     */
    CompletableFuture<CheckNFCBindPopResponse> checkNFCBindPop(CheckNFCBindPopRequest request);

    /**
     * @param request the request parameters of FindGuestCredentialsRecord  FindGuestCredentialsRecordRequest
     * @return FindGuestCredentialsRecordResponse
     */
    CompletableFuture<FindGuestCredentialsRecordResponse> findGuestCredentialsRecord(FindGuestCredentialsRecordRequest request);

    /**
     * @param request the request parameters of FindGuestTicketRecord  FindGuestTicketRecordRequest
     * @return FindGuestTicketRecordResponse
     */
    CompletableFuture<FindGuestTicketRecordResponse> findGuestTicketRecord(FindGuestTicketRecordRequest request);

    /**
     * @param request the request parameters of QueryAllActivityInfo  QueryAllActivityInfoRequest
     * @return QueryAllActivityInfoResponse
     */
    CompletableFuture<QueryAllActivityInfoResponse> queryAllActivityInfo(QueryAllActivityInfoRequest request);

    /**
     * @param request the request parameters of QueryOrderSessionListPop  QueryOrderSessionListPopRequest
     * @return QueryOrderSessionListPopResponse
     */
    CompletableFuture<QueryOrderSessionListPopResponse> queryOrderSessionListPop(QueryOrderSessionListPopRequest request);

    /**
     * @param request the request parameters of QuerySessionByActivityIdPop  QuerySessionByActivityIdPopRequest
     * @return QuerySessionByActivityIdPopResponse
     */
    CompletableFuture<QuerySessionByActivityIdPopResponse> querySessionByActivityIdPop(QuerySessionByActivityIdPopRequest request);

    /**
     * @param request the request parameters of QuerySessionListPop  QuerySessionListPopRequest
     * @return QuerySessionListPopResponse
     */
    CompletableFuture<QuerySessionListPopResponse> querySessionListPop(QuerySessionListPopRequest request);

    /**
     * @param request the request parameters of QuerySignInRecordPop  QuerySignInRecordPopRequest
     * @return QuerySignInRecordPopResponse
     */
    CompletableFuture<QuerySignInRecordPopResponse> querySignInRecordPop(QuerySignInRecordPopRequest request);

    /**
     * @param request the request parameters of QuerySingleActivityInfo  QuerySingleActivityInfoRequest
     * @return QuerySingleActivityInfoResponse
     */
    CompletableFuture<QuerySingleActivityInfoResponse> querySingleActivityInfo(QuerySingleActivityInfoRequest request);

    /**
     * @param request the request parameters of SyncSignInInfo  SyncSignInInfoRequest
     * @return SyncSignInInfoResponse
     */
    CompletableFuture<SyncSignInInfoResponse> syncSignInInfo(SyncSignInInfoRequest request);

    /**
     * @param request the request parameters of TicketOrCredentialsSignInPop  TicketOrCredentialsSignInPopRequest
     * @return TicketOrCredentialsSignInPopResponse
     */
    CompletableFuture<TicketOrCredentialsSignInPopResponse> ticketOrCredentialsSignInPop(TicketOrCredentialsSignInPopRequest request);

    /**
     * @param request the request parameters of UpdateCredentialsStatusPop  UpdateCredentialsStatusPopRequest
     * @return UpdateCredentialsStatusPopResponse
     */
    CompletableFuture<UpdateCredentialsStatusPopResponse> updateCredentialsStatusPop(UpdateCredentialsStatusPopRequest request);

    /**
     * @param request the request parameters of UpdateTicketRecordByticketCodePop  UpdateTicketRecordByticketCodePopRequest
     * @return UpdateTicketRecordByticketCodePopResponse
     */
    CompletableFuture<UpdateTicketRecordByticketCodePopResponse> updateTicketRecordByticketCodePop(UpdateTicketRecordByticketCodePopRequest request);

}
