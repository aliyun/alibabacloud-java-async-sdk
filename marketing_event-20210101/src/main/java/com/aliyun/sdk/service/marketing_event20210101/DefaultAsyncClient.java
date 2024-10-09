// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.marketing_event20210101.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "marketing_event";
        this.version = "2021-01-01";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddSumRecordFlowPop  AddSumRecordFlowPopRequest
     * @return AddSumRecordFlowPopResponse
     */
    @Override
    public CompletableFuture<AddSumRecordFlowPopResponse> addSumRecordFlowPop(AddSumRecordFlowPopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddSumRecordFlowPop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSumRecordFlowPopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSumRecordFlowPopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindExhibitorRfidPop  BindExhibitorRfidPopRequest
     * @return BindExhibitorRfidPopResponse
     */
    @Override
    public CompletableFuture<BindExhibitorRfidPopResponse> bindExhibitorRfidPop(BindExhibitorRfidPopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindExhibitorRfidPop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindExhibitorRfidPopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindExhibitorRfidPopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindGuestRfidPop  BindGuestRfidPopRequest
     * @return BindGuestRfidPopResponse
     */
    @Override
    public CompletableFuture<BindGuestRfidPopResponse> bindGuestRfidPop(BindGuestRfidPopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindGuestRfidPop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindGuestRfidPopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindGuestRfidPopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckNFCBindPop  CheckNFCBindPopRequest
     * @return CheckNFCBindPopResponse
     */
    @Override
    public CompletableFuture<CheckNFCBindPopResponse> checkNFCBindPop(CheckNFCBindPopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckNFCBindPop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckNFCBindPopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckNFCBindPopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindGuestCredentialsRecord  FindGuestCredentialsRecordRequest
     * @return FindGuestCredentialsRecordResponse
     */
    @Override
    public CompletableFuture<FindGuestCredentialsRecordResponse> findGuestCredentialsRecord(FindGuestCredentialsRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindGuestCredentialsRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindGuestCredentialsRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindGuestCredentialsRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindGuestTicketRecord  FindGuestTicketRecordRequest
     * @return FindGuestTicketRecordResponse
     */
    @Override
    public CompletableFuture<FindGuestTicketRecordResponse> findGuestTicketRecord(FindGuestTicketRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindGuestTicketRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindGuestTicketRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindGuestTicketRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryAllActivityInfo  QueryAllActivityInfoRequest
     * @return QueryAllActivityInfoResponse
     */
    @Override
    public CompletableFuture<QueryAllActivityInfoResponse> queryAllActivityInfo(QueryAllActivityInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryAllActivityInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryAllActivityInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryAllActivityInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryOrderSessionListPop  QueryOrderSessionListPopRequest
     * @return QueryOrderSessionListPopResponse
     */
    @Override
    public CompletableFuture<QueryOrderSessionListPopResponse> queryOrderSessionListPop(QueryOrderSessionListPopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryOrderSessionListPop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryOrderSessionListPopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryOrderSessionListPopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySessionByActivityIdPop  QuerySessionByActivityIdPopRequest
     * @return QuerySessionByActivityIdPopResponse
     */
    @Override
    public CompletableFuture<QuerySessionByActivityIdPopResponse> querySessionByActivityIdPop(QuerySessionByActivityIdPopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySessionByActivityIdPop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySessionByActivityIdPopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySessionByActivityIdPopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySessionListPop  QuerySessionListPopRequest
     * @return QuerySessionListPopResponse
     */
    @Override
    public CompletableFuture<QuerySessionListPopResponse> querySessionListPop(QuerySessionListPopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySessionListPop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySessionListPopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySessionListPopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySignInRecordPop  QuerySignInRecordPopRequest
     * @return QuerySignInRecordPopResponse
     */
    @Override
    public CompletableFuture<QuerySignInRecordPopResponse> querySignInRecordPop(QuerySignInRecordPopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySignInRecordPop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySignInRecordPopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySignInRecordPopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QuerySingleActivityInfo  QuerySingleActivityInfoRequest
     * @return QuerySingleActivityInfoResponse
     */
    @Override
    public CompletableFuture<QuerySingleActivityInfoResponse> querySingleActivityInfo(QuerySingleActivityInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QuerySingleActivityInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QuerySingleActivityInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QuerySingleActivityInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncSignInInfo  SyncSignInInfoRequest
     * @return SyncSignInInfoResponse
     */
    @Override
    public CompletableFuture<SyncSignInInfoResponse> syncSignInInfo(SyncSignInInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SyncSignInInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncSignInInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncSignInInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TicketOrCredentialsSignInPop  TicketOrCredentialsSignInPopRequest
     * @return TicketOrCredentialsSignInPopResponse
     */
    @Override
    public CompletableFuture<TicketOrCredentialsSignInPopResponse> ticketOrCredentialsSignInPop(TicketOrCredentialsSignInPopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TicketOrCredentialsSignInPop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TicketOrCredentialsSignInPopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TicketOrCredentialsSignInPopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCredentialsStatusPop  UpdateCredentialsStatusPopRequest
     * @return UpdateCredentialsStatusPopResponse
     */
    @Override
    public CompletableFuture<UpdateCredentialsStatusPopResponse> updateCredentialsStatusPop(UpdateCredentialsStatusPopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCredentialsStatusPop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCredentialsStatusPopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCredentialsStatusPopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTicketRecordByticketCodePop  UpdateTicketRecordByticketCodePopRequest
     * @return UpdateTicketRecordByticketCodePopResponse
     */
    @Override
    public CompletableFuture<UpdateTicketRecordByticketCodePopResponse> updateTicketRecordByticketCodePop(UpdateTicketRecordByticketCodePopRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTicketRecordByticketCodePop").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTicketRecordByticketCodePopResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTicketRecordByticketCodePopResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
