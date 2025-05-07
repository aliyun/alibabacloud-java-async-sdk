// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.buss20220822;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.buss20220822.models.*;
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
        this.product = "Buss";
        this.version = "2022-08-22";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of BusinessResultService  BusinessResultServiceRequest
     * @return BusinessResultServiceResponse
     */
    @Override
    public CompletableFuture<BusinessResultServiceResponse> businessResultService(BusinessResultServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BusinessResultService").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BusinessResultServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BusinessResultServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateUserInvestigationInfoQueryTask  CreateUserInvestigationInfoQueryTaskRequest
     * @return CreateUserInvestigationInfoQueryTaskResponse
     */
    @Override
    public CompletableFuture<CreateUserInvestigationInfoQueryTaskResponse> createUserInvestigationInfoQueryTask(CreateUserInvestigationInfoQueryTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateUserInvestigationInfoQueryTask").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateUserInvestigationInfoQueryTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateUserInvestigationInfoQueryTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindInstanceInfo  FindInstanceInfoRequest
     * @return FindInstanceInfoResponse
     */
    @Override
    public CompletableFuture<FindInstanceInfoResponse> findInstanceInfo(FindInstanceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindInstanceInfo").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindInstanceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindInstanceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FindUserAvailbleResources  FindUserAvailbleResourcesRequest
     * @return FindUserAvailbleResourcesResponse
     */
    @Override
    public CompletableFuture<FindUserAvailbleResourcesResponse> findUserAvailbleResources(FindUserAvailbleResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("FindUserAvailbleResources").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FindUserAvailbleResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FindUserAvailbleResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSecurityEventDetail  GetSecurityEventDetailRequest
     * @return GetSecurityEventDetailResponse
     */
    @Override
    public CompletableFuture<GetSecurityEventDetailResponse> getSecurityEventDetail(GetSecurityEventDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSecurityEventDetail").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSecurityEventDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSecurityEventDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PunishResourceSearch  PunishResourceSearchRequest
     * @return PunishResourceSearchResponse
     */
    @Override
    public CompletableFuture<PunishResourceSearchResponse> punishResourceSearch(PunishResourceSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PunishResourceSearch").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PunishResourceSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PunishResourceSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecordClickLinkAction  RecordClickLinkActionRequest
     * @return RecordClickLinkActionResponse
     */
    @Override
    public CompletableFuture<RecordClickLinkActionResponse> recordClickLinkAction(RecordClickLinkActionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecordClickLinkAction").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecordClickLinkActionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecordClickLinkActionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RiskEventSync  RiskEventSyncRequest
     * @return RiskEventSyncResponse
     */
    @Override
    public CompletableFuture<RiskEventSyncResponse> riskEventSync(RiskEventSyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RiskEventSync").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RiskEventSyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RiskEventSyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchPunishEvents  SearchPunishEventsRequest
     * @return SearchPunishEventsResponse
     */
    @Override
    public CompletableFuture<SearchPunishEventsResponse> searchPunishEvents(SearchPunishEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchPunishEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchPunishEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchPunishEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchPunishRecords  SearchPunishRecordsRequest
     * @return SearchPunishRecordsResponse
     */
    @Override
    public CompletableFuture<SearchPunishRecordsResponse> searchPunishRecords(SearchPunishRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchPunishRecords").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchPunishRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchPunishRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SearchPunishRequest  SearchPunishRequestRequest
     * @return SearchPunishRequestResponse
     */
    @Override
    public CompletableFuture<SearchPunishRequestResponse> searchPunishRequest(SearchPunishRequestRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SearchPunishRequest").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SearchPunishRequestResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SearchPunishRequestResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSecurityEventStatus  UpdateSecurityEventStatusRequest
     * @return UpdateSecurityEventStatusResponse
     */
    @Override
    public CompletableFuture<UpdateSecurityEventStatusResponse> updateSecurityEventStatus(UpdateSecurityEventStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSecurityEventStatus").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSecurityEventStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSecurityEventStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
