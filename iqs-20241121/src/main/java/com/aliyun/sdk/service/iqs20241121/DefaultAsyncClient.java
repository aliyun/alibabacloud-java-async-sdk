// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.iqs20241121.models.*;
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
        this.product = "IQS";
        this.version = "2024-11-21";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ApplyFormalService  ApplyFormalServiceRequest
     * @return ApplyFormalServiceResponse
     */
    @Override
    public CompletableFuture<ApplyFormalServiceResponse> applyFormalService(ApplyFormalServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyFormalService").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-admin/console/v1/services/commands/applyFormalService").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyFormalServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyFormalServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckAccountType  CheckAccountTypeRequest
     * @return CheckAccountTypeResponse
     */
    @Override
    public CompletableFuture<CheckAccountTypeResponse> checkAccountType(CheckAccountTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckAccountType").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-admin/openService/v1/account/commands/checkAccountType").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckAccountTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckAccountTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DownloadApiCallDailyDetail  DownloadApiCallDailyDetailRequest
     * @return DownloadApiCallDailyDetailResponse
     */
    @Override
    public CompletableFuture<DownloadApiCallDailyDetailResponse> downloadApiCallDailyDetail(DownloadApiCallDailyDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DownloadApiCallDailyDetail").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/downloadApiCallDailyDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadApiCallDailyDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadApiCallDailyDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DownloadMeteringDailyDetail  DownloadMeteringDailyDetailRequest
     * @return DownloadMeteringDailyDetailResponse
     */
    @Override
    public CompletableFuture<DownloadMeteringDailyDetailResponse> downloadMeteringDailyDetail(DownloadMeteringDailyDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DownloadMeteringDailyDetail").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/downloadMeteringDailyDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadMeteringDailyDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadMeteringDailyDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExpandSearchExpiredTime  ExpandSearchExpiredTimeRequest
     * @return ExpandSearchExpiredTimeResponse
     */
    @Override
    public CompletableFuture<ExpandSearchExpiredTimeResponse> expandSearchExpiredTime(ExpandSearchExpiredTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExpandSearchExpiredTime").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-admin/openService/v1/account/commands/expendExpiredTime").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExpandSearchExpiredTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExpandSearchExpiredTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccountConfigInfo  GetAccountConfigInfoRequest
     * @return GetAccountConfigInfoResponse
     */
    @Override
    public CompletableFuture<GetAccountConfigInfoResponse> getAccountConfigInfo(GetAccountConfigInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAccountConfigInfo").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-admin/openService/v1/account/command/accountConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountConfigInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountConfigInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAccountReviewRecord  GetAccountReviewRecordRequest
     * @return GetAccountReviewRecordResponse
     */
    @Override
    public CompletableFuture<GetAccountReviewRecordResponse> getAccountReviewRecord(GetAccountReviewRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAccountReviewRecord").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-admin/console/v1/services/commands/reviewRecord").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAccountReviewRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAccountReviewRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMeteringSummary  GetMeteringSummaryRequest
     * @return GetMeteringSummaryResponse
     */
    @Override
    public CompletableFuture<GetMeteringSummaryResponse> getMeteringSummary(GetMeteringSummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMeteringSummary").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/metering/summary").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMeteringSummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMeteringSummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceConfig  GetServiceConfigRequest
     * @return GetServiceConfigResponse
     */
    @Override
    public CompletableFuture<GetServiceConfigResponse> getServiceConfig(GetServiceConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceConfig").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-admin/console/v1/services/commands/serviceConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApiCallDailyDetail  ListApiCallDailyDetailRequest
     * @return ListApiCallDailyDetailResponse
     */
    @Override
    public CompletableFuture<ListApiCallDailyDetailResponse> listApiCallDailyDetail(ListApiCallDailyDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApiCallDailyDetail").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/apiCall/dailyDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApiCallDailyDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApiCallDailyDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApiNames  ListApiNamesRequest
     * @return ListApiNamesResponse
     */
    @Override
    public CompletableFuture<ListApiNamesResponse> listApiNames(ListApiNamesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListApiNames").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/apiNames").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApiNamesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApiNamesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMeteringDailyDetail  ListMeteringDailyDetailRequest
     * @return ListMeteringDailyDetailResponse
     */
    @Override
    public CompletableFuture<ListMeteringDailyDetailResponse> listMeteringDailyDetail(ListMeteringDailyDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMeteringDailyDetail").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/metering/dailyDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMeteringDailyDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMeteringDailyDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubAccountInfo  ListSubAccountInfoRequest
     * @return ListSubAccountInfoResponse
     */
    @Override
    public CompletableFuture<ListSubAccountInfoResponse> listSubAccountInfo(ListSubAccountInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSubAccountInfo").setMethod(HttpMethod.GET).setPathRegex("/linked-retrieval/linked-retrieval-admin/console/v1/monitors/commands/subAccountInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubAccountInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubAccountInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ManageSearchAccountInfo  ManageSearchAccountInfoRequest
     * @return ManageSearchAccountInfoResponse
     */
    @Override
    public CompletableFuture<ManageSearchAccountInfoResponse> manageSearchAccountInfo(ManageSearchAccountInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ManageSearchAccountInfo").setMethod(HttpMethod.POST).setPathRegex("/linked-retrieval/linked-retrieval-admin/openService/v1/account/commands/manage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ManageSearchAccountInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ManageSearchAccountInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
