// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.safe20220117.models.*;
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
     * @param request the request parameters of CancelBlock  CancelBlockRequest
     * @return CancelBlockResponse
     */
    CompletableFuture<CancelBlockResponse> cancelBlock(CancelBlockRequest request);

    /**
     * @param request the request parameters of ChangeCancel  ChangeCancelRequest
     * @return ChangeCancelResponse
     */
    CompletableFuture<ChangeCancelResponse> changeCancel(ChangeCancelRequest request);

    /**
     * @param request the request parameters of ChangeCheck  ChangeCheckRequest
     * @return ChangeCheckResponse
     */
    CompletableFuture<ChangeCheckResponse> changeCheck(ChangeCheckRequest request);

    /**
     * @param request the request parameters of ChangeEnd  ChangeEndRequest
     * @return ChangeEndResponse
     */
    CompletableFuture<ChangeEndResponse> changeEnd(ChangeEndRequest request);

    /**
     * @param request the request parameters of ChangeStart  ChangeStartRequest
     * @return ChangeStartResponse
     */
    CompletableFuture<ChangeStartResponse> changeStart(ChangeStartRequest request);

    /**
     * @param request the request parameters of CreateBlock  CreateBlockRequest
     * @return CreateBlockResponse
     */
    CompletableFuture<CreateBlockResponse> createBlock(CreateBlockRequest request);

    /**
     * @param request the request parameters of CreateMaYiBlock  CreateMaYiBlockRequest
     * @return CreateMaYiBlockResponse
     */
    CompletableFuture<CreateMaYiBlockResponse> createMaYiBlock(CreateMaYiBlockRequest request);

    /**
     * @param request the request parameters of CreateOperator  CreateOperatorRequest
     * @return CreateOperatorResponse
     */
    CompletableFuture<CreateOperatorResponse> createOperator(CreateOperatorRequest request);

    /**
     * @param request the request parameters of Query  QueryRequest
     * @return QueryResponse
     */
    CompletableFuture<QueryResponse> query(QueryRequest request);

    /**
     * @param request the request parameters of QueryApproveFlow  QueryApproveFlowRequest
     * @return QueryApproveFlowResponse
     */
    CompletableFuture<QueryApproveFlowResponse> queryApproveFlow(QueryApproveFlowRequest request);

    /**
     * @param request the request parameters of QueryBlockEvent  QueryBlockEventRequest
     * @return QueryBlockEventResponse
     */
    CompletableFuture<QueryBlockEventResponse> queryBlockEvent(QueryBlockEventRequest request);

    /**
     * @param request the request parameters of QueryChangeInfo  QueryChangeInfoRequest
     * @return QueryChangeInfoResponse
     */
    CompletableFuture<QueryChangeInfoResponse> queryChangeInfo(QueryChangeInfoRequest request);

    /**
     * @param request the request parameters of QueryCheckInfo  QueryCheckInfoRequest
     * @return QueryCheckInfoResponse
     */
    CompletableFuture<QueryCheckInfoResponse> queryCheckInfo(QueryCheckInfoRequest request);

    /**
     * @param request the request parameters of QueryCustomer  QueryCustomerRequest
     * @return QueryCustomerResponse
     */
    CompletableFuture<QueryCustomerResponse> queryCustomer(QueryCustomerRequest request);

    /**
     * @param request the request parameters of QueryExecuteInfo  QueryExecuteInfoRequest
     * @return QueryExecuteInfoResponse
     */
    CompletableFuture<QueryExecuteInfoResponse> queryExecuteInfo(QueryExecuteInfoRequest request);

    /**
     * @param request the request parameters of QueryInnerProductInfo  QueryInnerProductInfoRequest
     * @return QueryInnerProductInfoResponse
     */
    CompletableFuture<QueryInnerProductInfoResponse> queryInnerProductInfo(QueryInnerProductInfoRequest request);

    /**
     * @param request the request parameters of QueryRegionAz  QueryRegionAzRequest
     * @return QueryRegionAzResponse
     */
    CompletableFuture<QueryRegionAzResponse> queryRegionAz(QueryRegionAzRequest request);

    /**
     * @param request the request parameters of SafeChangeCancel  SafeChangeCancelRequest
     * @return SafeChangeCancelResponse
     */
    CompletableFuture<SafeChangeCancelResponse> safeChangeCancel(SafeChangeCancelRequest request);

    /**
     * @param request the request parameters of SafeChangeCheck  SafeChangeCheckRequest
     * @return SafeChangeCheckResponse
     */
    CompletableFuture<SafeChangeCheckResponse> safeChangeCheck(SafeChangeCheckRequest request);

    /**
     * @param request the request parameters of SafeChangeEnd  SafeChangeEndRequest
     * @return SafeChangeEndResponse
     */
    CompletableFuture<SafeChangeEndResponse> safeChangeEnd(SafeChangeEndRequest request);

    /**
     * @param request the request parameters of SafeChangeQuery  SafeChangeQueryRequest
     * @return SafeChangeQueryResponse
     */
    CompletableFuture<SafeChangeQueryResponse> safeChangeQuery(SafeChangeQueryRequest request);

    /**
     * @param request the request parameters of SafeChangeQueryApproveFlow  SafeChangeQueryApproveFlowRequest
     * @return SafeChangeQueryApproveFlowResponse
     */
    CompletableFuture<SafeChangeQueryApproveFlowResponse> safeChangeQueryApproveFlow(SafeChangeQueryApproveFlowRequest request);

    /**
     * @param request the request parameters of SafeChangeStart  SafeChangeStartRequest
     * @return SafeChangeStartResponse
     */
    CompletableFuture<SafeChangeStartResponse> safeChangeStart(SafeChangeStartRequest request);

    /**
     * @param request the request parameters of SafeChangeStartApprove  SafeChangeStartApproveRequest
     * @return SafeChangeStartApproveResponse
     */
    CompletableFuture<SafeChangeStartApproveResponse> safeChangeStartApprove(SafeChangeStartApproveRequest request);

    /**
     * @param request the request parameters of SafeScopeData  SafeScopeDataRequest
     * @return SafeScopeDataResponse
     */
    CompletableFuture<SafeScopeDataResponse> safeScopeData(SafeScopeDataRequest request);

    /**
     * @param request the request parameters of StartApprove  StartApproveRequest
     * @return StartApproveResponse
     */
    CompletableFuture<StartApproveResponse> startApprove(StartApproveRequest request);

    /**
     * @param request the request parameters of SyncProduct  SyncProductRequest
     * @return SyncProductResponse
     */
    CompletableFuture<SyncProductResponse> syncProduct(SyncProductRequest request);

}
