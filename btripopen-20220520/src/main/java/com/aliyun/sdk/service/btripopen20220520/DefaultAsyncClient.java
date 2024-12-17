// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.btripopen20220520.models.*;
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
        this.product = "btripOpen";
        this.version = "2022-05-20";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AccessToken  AccessTokenRequest
     * @return AccessTokenResponse
     */
    @Override
    public CompletableFuture<AccessTokenResponse> accessToken(AccessTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AccessToken").setMethod(HttpMethod.GET).setPathRegex("/btrip-open-auth/v1/access-token/action/take").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AccessTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AccessTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddDepartment  AddDepartmentRequest
     * @return AddDepartmentResponse
     */
    @Override
    public CompletableFuture<AddDepartmentResponse> addDepartment(AddDepartmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddDepartment").setMethod(HttpMethod.POST).setPathRegex("/department/v2/add").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDepartmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDepartmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddEmployee  AddEmployeeRequest
     * @return AddEmployeeResponse
     */
    @Override
    public CompletableFuture<AddEmployeeResponse> addEmployee(AddEmployeeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddEmployee").setMethod(HttpMethod.POST).setPathRegex("/employee/v2/add").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddEmployeeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddEmployeeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddEmployeesToCustomRole  AddEmployeesToCustomRoleRequest
     * @return AddEmployeesToCustomRoleResponse
     */
    @Override
    public CompletableFuture<AddEmployeesToCustomRoleResponse> addEmployeesToCustomRole(AddEmployeesToCustomRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddEmployeesToCustomRole").setMethod(HttpMethod.POST).setPathRegex("/role/v1/customRoleEmployees/add").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddEmployeesToCustomRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddEmployeesToCustomRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddInvoiceEntity  AddInvoiceEntityRequest
     * @return AddInvoiceEntityResponse
     */
    @Override
    public CompletableFuture<AddInvoiceEntityResponse> addInvoiceEntity(AddInvoiceEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddInvoiceEntity").setMethod(HttpMethod.POST).setPathRegex("/invoice/v1/entities").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddInvoiceEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddInvoiceEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddressGet  AddressGetRequest
     * @return AddressGetResponse
     */
    @Override
    public CompletableFuture<AddressGetResponse> addressGet(AddressGetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddressGet").setMethod(HttpMethod.GET).setPathRegex("/open/v1/address").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddressGetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddressGetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AirportSearch  AirportSearchRequest
     * @return AirportSearchResponse
     */
    @Override
    public CompletableFuture<AirportSearchResponse> airportSearch(AirportSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AirportSearch").setMethod(HttpMethod.GET).setPathRegex("/city/v1/airport").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AirportSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AirportSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AllBaseCityInfoQuery  AllBaseCityInfoQueryRequest
     * @return AllBaseCityInfoQueryResponse
     */
    @Override
    public CompletableFuture<AllBaseCityInfoQueryResponse> allBaseCityInfoQuery(AllBaseCityInfoQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AllBaseCityInfoQuery").setMethod(HttpMethod.GET).setPathRegex("/city/v1/code").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllBaseCityInfoQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllBaseCityInfoQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyAdd  ApplyAddRequest
     * @return ApplyAddResponse
     */
    @Override
    public CompletableFuture<ApplyAddResponse> applyAdd(ApplyAddRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyAdd").setMethod(HttpMethod.POST).setPathRegex("/apply/v1/biz-trip").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyAddResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyAddResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyApprove  ApplyApproveRequest
     * @return ApplyApproveResponse
     */
    @Override
    public CompletableFuture<ApplyApproveResponse> applyApprove(ApplyApproveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyApprove").setMethod(HttpMethod.PUT).setPathRegex("/apply/v1/biz-trip/action/approve").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyApproveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyApproveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyExternalNodeStatusUpdate  ApplyExternalNodeStatusUpdateRequest
     * @return ApplyExternalNodeStatusUpdateResponse
     */
    @Override
    public CompletableFuture<ApplyExternalNodeStatusUpdateResponse> applyExternalNodeStatusUpdate(ApplyExternalNodeStatusUpdateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyExternalNodeStatusUpdate").setMethod(HttpMethod.PUT).setPathRegex("/apply/v1/external-nodes/action/status-update").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyExternalNodeStatusUpdateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyExternalNodeStatusUpdateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyInvoiceTask  ApplyInvoiceTaskRequest
     * @return ApplyInvoiceTaskResponse
     */
    @Override
    public CompletableFuture<ApplyInvoiceTaskResponse> applyInvoiceTask(ApplyInvoiceTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyInvoiceTask").setMethod(HttpMethod.POST).setPathRegex("/invoice/v1/apply-invoice-task").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyInvoiceTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyInvoiceTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyListQuery  ApplyListQueryRequest
     * @return ApplyListQueryResponse
     */
    @Override
    public CompletableFuture<ApplyListQueryResponse> applyListQuery(ApplyListQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyListQuery").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/biz-trips").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyListQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyListQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyModify  ApplyModifyRequest
     * @return ApplyModifyResponse
     */
    @Override
    public CompletableFuture<ApplyModifyResponse> applyModify(ApplyModifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyModify").setMethod(HttpMethod.PUT).setPathRegex("/apply/v1/biz-trip").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyModifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyModifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyQuery  ApplyQueryRequest
     * @return ApplyQueryResponse
     */
    @Override
    public CompletableFuture<ApplyQueryResponse> applyQuery(ApplyQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyQuery").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/biz-trip").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyTripTaskExecute  ApplyTripTaskExecuteRequest
     * @return ApplyTripTaskExecuteResponse
     */
    @Override
    public CompletableFuture<ApplyTripTaskExecuteResponse> applyTripTaskExecute(ApplyTripTaskExecuteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ApplyTripTaskExecute").setMethod(HttpMethod.POST).setPathRegex("/apply/v1/trip-task/action/execute").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyTripTaskExecuteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyTripTaskExecuteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BaseCityInfoSearch  BaseCityInfoSearchRequest
     * @return BaseCityInfoSearchResponse
     */
    @Override
    public CompletableFuture<BaseCityInfoSearchResponse> baseCityInfoSearch(BaseCityInfoSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BaseCityInfoSearch").setMethod(HttpMethod.GET).setPathRegex("/city/v1/cities/action/search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BaseCityInfoSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BaseCityInfoSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BtripBillInfoAdjust  BtripBillInfoAdjustRequest
     * @return BtripBillInfoAdjustResponse
     */
    @Override
    public CompletableFuture<BtripBillInfoAdjustResponse> btripBillInfoAdjust(BtripBillInfoAdjustRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("BtripBillInfoAdjust").setMethod(HttpMethod.PUT).setPathRegex("/bill/v1/info/action/adjust").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BtripBillInfoAdjustResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BtripBillInfoAdjustResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CarApplyAdd  CarApplyAddRequest
     * @return CarApplyAddResponse
     */
    @Override
    public CompletableFuture<CarApplyAddResponse> carApplyAdd(CarApplyAddRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CarApplyAdd").setMethod(HttpMethod.POST).setPathRegex("/apply/v1/car").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CarApplyAddResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CarApplyAddResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CarApplyModify  CarApplyModifyRequest
     * @return CarApplyModifyResponse
     */
    @Override
    public CompletableFuture<CarApplyModifyResponse> carApplyModify(CarApplyModifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CarApplyModify").setMethod(HttpMethod.PUT).setPathRegex("/apply/v1/car").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CarApplyModifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CarApplyModifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CarApplyQuery  CarApplyQueryRequest
     * @return CarApplyQueryResponse
     */
    @Override
    public CompletableFuture<CarApplyQueryResponse> carApplyQuery(CarApplyQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CarApplyQuery").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/car").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CarApplyQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CarApplyQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CarBillSettlementQuery  CarBillSettlementQueryRequest
     * @return CarBillSettlementQueryResponse
     */
    @Override
    public CompletableFuture<CarBillSettlementQueryResponse> carBillSettlementQuery(CarBillSettlementQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CarBillSettlementQuery").setMethod(HttpMethod.GET).setPathRegex("/car/v1/bill-settlement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CarBillSettlementQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CarBillSettlementQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CarOrderListQuery  CarOrderListQueryRequest
     * @return CarOrderListQueryResponse
     */
    @Override
    public CompletableFuture<CarOrderListQueryResponse> carOrderListQuery(CarOrderListQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CarOrderListQuery").setMethod(HttpMethod.GET).setPathRegex("/car/v1/order-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CarOrderListQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CarOrderListQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CarOrderQuery  CarOrderQueryRequest
     * @return CarOrderQueryResponse
     */
    @Override
    public CompletableFuture<CarOrderQueryResponse> carOrderQuery(CarOrderQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CarOrderQuery").setMethod(HttpMethod.GET).setPathRegex("/car/v1/order").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CarOrderQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CarOrderQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CarSceneQuery  CarSceneQueryRequest
     * @return CarSceneQueryResponse
     */
    @Override
    public CompletableFuture<CarSceneQueryResponse> carSceneQuery(CarSceneQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CarSceneQuery").setMethod(HttpMethod.GET).setPathRegex("/car/v1/scenes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CarSceneQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CarSceneQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChannelCorpCreate  ChannelCorpCreateRequest
     * @return ChannelCorpCreateResponse
     */
    @Override
    public CompletableFuture<ChannelCorpCreateResponse> channelCorpCreate(ChannelCorpCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ChannelCorpCreate").setMethod(HttpMethod.POST).setPathRegex("/corp/v1/channelCorps").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChannelCorpCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChannelCorpCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CitySearch  CitySearchRequest
     * @return CitySearchResponse
     */
    @Override
    public CompletableFuture<CitySearchResponse> citySearch(CitySearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CitySearch").setMethod(HttpMethod.GET).setPathRegex("/city/v1/city").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CitySearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CitySearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CommonApplyQuery  CommonApplyQueryRequest
     * @return CommonApplyQueryResponse
     */
    @Override
    public CompletableFuture<CommonApplyQueryResponse> commonApplyQuery(CommonApplyQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CommonApplyQuery").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/common").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CommonApplyQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CommonApplyQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CommonApplySync  CommonApplySyncRequest
     * @return CommonApplySyncResponse
     */
    @Override
    public CompletableFuture<CommonApplySyncResponse> commonApplySync(CommonApplySyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CommonApplySync").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/syn-common").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CommonApplySyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CommonApplySyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CooperatorFlightBillSettlementQuery  CooperatorFlightBillSettlementQueryRequest
     * @return CooperatorFlightBillSettlementQueryResponse
     */
    @Override
    public CompletableFuture<CooperatorFlightBillSettlementQueryResponse> cooperatorFlightBillSettlementQuery(CooperatorFlightBillSettlementQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CooperatorFlightBillSettlementQuery").setMethod(HttpMethod.GET).setPathRegex("/cooperator-flight/v1/bill-settlement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CooperatorFlightBillSettlementQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CooperatorFlightBillSettlementQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CooperatorHotelBillSettlementQuery  CooperatorHotelBillSettlementQueryRequest
     * @return CooperatorHotelBillSettlementQueryResponse
     */
    @Override
    public CompletableFuture<CooperatorHotelBillSettlementQueryResponse> cooperatorHotelBillSettlementQuery(CooperatorHotelBillSettlementQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CooperatorHotelBillSettlementQuery").setMethod(HttpMethod.GET).setPathRegex("/cooperator-hotel/v1/bill-settlement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CooperatorHotelBillSettlementQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CooperatorHotelBillSettlementQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CooperatorHotelEventPush  CooperatorHotelEventPushRequest
     * @return CooperatorHotelEventPushResponse
     */
    @Override
    public CompletableFuture<CooperatorHotelEventPushResponse> cooperatorHotelEventPush(CooperatorHotelEventPushRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CooperatorHotelEventPush").setMethod(HttpMethod.POST).setPathRegex("/coop-hotel/v1/orders/events").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CooperatorHotelEventPushResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CooperatorHotelEventPushResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CooperatorSyncPayStatus  CooperatorSyncPayStatusRequest
     * @return CooperatorSyncPayStatusResponse
     */
    @Override
    public CompletableFuture<CooperatorSyncPayStatusResponse> cooperatorSyncPayStatus(CooperatorSyncPayStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CooperatorSyncPayStatus").setMethod(HttpMethod.POST).setPathRegex("/coop-pay/v1/cashiers/status").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CooperatorSyncPayStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CooperatorSyncPayStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CorpAuthLinkInfoQuery  CorpAuthLinkInfoQueryRequest
     * @return CorpAuthLinkInfoQueryResponse
     */
    @Override
    public CompletableFuture<CorpAuthLinkInfoQueryResponse> corpAuthLinkInfoQuery(CorpAuthLinkInfoQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CorpAuthLinkInfoQuery").setMethod(HttpMethod.GET).setPathRegex("/corp-authority-link/v1/info").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CorpAuthLinkInfoQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CorpAuthLinkInfoQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CorpToken  CorpTokenRequest
     * @return CorpTokenResponse
     */
    @Override
    public CompletableFuture<CorpTokenResponse> corpToken(CorpTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CorpToken").setMethod(HttpMethod.GET).setPathRegex("/btrip-open-auth/v1/corp-token/action/take").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CorpTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CorpTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CostCenterDelete  CostCenterDeleteRequest
     * @return CostCenterDeleteResponse
     */
    @Override
    public CompletableFuture<CostCenterDeleteResponse> costCenterDelete(CostCenterDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CostCenterDelete").setMethod(HttpMethod.DELETE).setPathRegex("/costcenter/v1/delete-costcenter").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CostCenterDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CostCenterDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CostCenterModify  CostCenterModifyRequest
     * @return CostCenterModifyResponse
     */
    @Override
    public CompletableFuture<CostCenterModifyResponse> costCenterModify(CostCenterModifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CostCenterModify").setMethod(HttpMethod.PUT).setPathRegex("/costcenter/v1/modify-costcenter").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CostCenterModifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CostCenterModifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CostCenterQuery  CostCenterQueryRequest
     * @return CostCenterQueryResponse
     */
    @Override
    public CompletableFuture<CostCenterQueryResponse> costCenterQuery(CostCenterQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CostCenterQuery").setMethod(HttpMethod.GET).setPathRegex("/costcenter/v1/costcenter").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CostCenterQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CostCenterQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CostCenterSave  CostCenterSaveRequest
     * @return CostCenterSaveResponse
     */
    @Override
    public CompletableFuture<CostCenterSaveResponse> costCenterSave(CostCenterSaveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CostCenterSave").setMethod(HttpMethod.POST).setPathRegex("/costcenter/v1/save-costcenter").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CostCenterSaveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CostCenterSaveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateCustomRole  CreateCustomRoleRequest
     * @return CreateCustomRoleResponse
     */
    @Override
    public CompletableFuture<CreateCustomRoleResponse> createCustomRole(CreateCustomRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCustomRole").setMethod(HttpMethod.POST).setPathRegex("/role/v1/customRoles/create").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSubCorp  CreateSubCorpRequest
     * @return CreateSubCorpResponse
     */
    @Override
    public CompletableFuture<CreateSubCorpResponse> createSubCorp(CreateSubCorpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSubCorp").setMethod(HttpMethod.POST).setPathRegex("/sub_corps/v1/corps").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSubCorpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSubCorpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteCustomRole  DeleteCustomRoleRequest
     * @return DeleteCustomRoleResponse
     */
    @Override
    public CompletableFuture<DeleteCustomRoleResponse> deleteCustomRole(DeleteCustomRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCustomRole").setMethod(HttpMethod.POST).setPathRegex("/role/v1/customRoles/delete").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDepartment  DeleteDepartmentRequest
     * @return DeleteDepartmentResponse
     */
    @Override
    public CompletableFuture<DeleteDepartmentResponse> deleteDepartment(DeleteDepartmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteDepartment").setMethod(HttpMethod.POST).setPathRegex("/department/v2/delete").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDepartmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDepartmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteEmployeesFromCustomRole  DeleteEmployeesFromCustomRoleRequest
     * @return DeleteEmployeesFromCustomRoleResponse
     */
    @Override
    public CompletableFuture<DeleteEmployeesFromCustomRoleResponse> deleteEmployeesFromCustomRole(DeleteEmployeesFromCustomRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteEmployeesFromCustomRole").setMethod(HttpMethod.POST).setPathRegex("/role/v1/customRoleEmployees/delete").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEmployeesFromCustomRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEmployeesFromCustomRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteInvoiceEntity  DeleteInvoiceEntityRequest
     * @return DeleteInvoiceEntityResponse
     */
    @Override
    public CompletableFuture<DeleteInvoiceEntityResponse> deleteInvoiceEntity(DeleteInvoiceEntityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteInvoiceEntity").setMethod(HttpMethod.DELETE).setPathRegex("/invoice/v1/entities").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInvoiceEntityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInvoiceEntityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DepartmentSave  DepartmentSaveRequest
     * @return DepartmentSaveResponse
     */
    @Override
    public CompletableFuture<DepartmentSaveResponse> departmentSave(DepartmentSaveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DepartmentSave").setMethod(HttpMethod.POST).setPathRegex("/department/v1/department").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DepartmentSaveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DepartmentSaveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ElectronicItineraryBatchApply  ElectronicItineraryBatchApplyRequest
     * @return ElectronicItineraryBatchApplyResponse
     */
    @Override
    public CompletableFuture<ElectronicItineraryBatchApplyResponse> electronicItineraryBatchApply(ElectronicItineraryBatchApplyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ElectronicItineraryBatchApply").setMethod(HttpMethod.POST).setPathRegex("/invoice/v1/apply-itinerary-batch-task").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ElectronicItineraryBatchApplyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ElectronicItineraryBatchApplyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ElectronicItineraryGetApplyResult  ElectronicItineraryGetApplyResultRequest
     * @return ElectronicItineraryGetApplyResultResponse
     */
    @Override
    public CompletableFuture<ElectronicItineraryGetApplyResultResponse> electronicItineraryGetApplyResult(ElectronicItineraryGetApplyResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ElectronicItineraryGetApplyResult").setMethod(HttpMethod.GET).setPathRegex("/invoice/v1/get-itinerary-batch-task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ElectronicItineraryGetApplyResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ElectronicItineraryGetApplyResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EntityAdd  EntityAddRequest
     * @return EntityAddResponse
     */
    @Override
    public CompletableFuture<EntityAddResponse> entityAdd(EntityAddRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EntityAdd").setMethod(HttpMethod.POST).setPathRegex("/costcenter/v1/add-entity").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EntityAddResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EntityAddResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EntityDelete  EntityDeleteRequest
     * @return EntityDeleteResponse
     */
    @Override
    public CompletableFuture<EntityDeleteResponse> entityDelete(EntityDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EntityDelete").setMethod(HttpMethod.POST).setPathRegex("/costcenter/v1/entity/action/delete").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EntityDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EntityDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EntitySet  EntitySetRequest
     * @return EntitySetResponse
     */
    @Override
    public CompletableFuture<EntitySetResponse> entitySet(EntitySetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EntitySet").setMethod(HttpMethod.POST).setPathRegex("/costcenter/v1/set-entity").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EntitySetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EntitySetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EstimatedPriceQuery  EstimatedPriceQueryRequest
     * @return EstimatedPriceQueryResponse
     */
    @Override
    public CompletableFuture<EstimatedPriceQueryResponse> estimatedPriceQuery(EstimatedPriceQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EstimatedPriceQuery").setMethod(HttpMethod.GET).setPathRegex("/costcenter/v1/estimated-price").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EstimatedPriceQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EstimatedPriceQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExceedApplySync  ExceedApplySyncRequest
     * @return ExceedApplySyncResponse
     */
    @Override
    public CompletableFuture<ExceedApplySyncResponse> exceedApplySync(ExceedApplySyncRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExceedApplySync").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/syn-exceed").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExceedApplySyncResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExceedApplySyncResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExternalUserAdd  ExternalUserAddRequest
     * @return ExternalUserAddResponse
     */
    @Override
    public CompletableFuture<ExternalUserAddResponse> externalUserAdd(ExternalUserAddRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExternalUserAdd").setMethod(HttpMethod.POST).setPathRegex("/user/v1/externalUsers").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExternalUserAddResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExternalUserAddResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExternalUserDelete  ExternalUserDeleteRequest
     * @return ExternalUserDeleteResponse
     */
    @Override
    public CompletableFuture<ExternalUserDeleteResponse> externalUserDelete(ExternalUserDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExternalUserDelete").setMethod(HttpMethod.DELETE).setPathRegex("/user/v1/externalUsers/{external_user_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExternalUserDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExternalUserDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExternalUserQuery  ExternalUserQueryRequest
     * @return ExternalUserQueryResponse
     */
    @Override
    public CompletableFuture<ExternalUserQueryResponse> externalUserQuery(ExternalUserQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExternalUserQuery").setMethod(HttpMethod.GET).setPathRegex("/user/v1/externalUsers/{external_user_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExternalUserQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExternalUserQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ExternalUserUpdate  ExternalUserUpdateRequest
     * @return ExternalUserUpdateResponse
     */
    @Override
    public CompletableFuture<ExternalUserUpdateResponse> externalUserUpdate(ExternalUserUpdateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ExternalUserUpdate").setMethod(HttpMethod.PUT).setPathRegex("/user/v1/externalUsers/{external_user_id}").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExternalUserUpdateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExternalUserUpdateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightBillSettlementQuery  FlightBillSettlementQueryRequest
     * @return FlightBillSettlementQueryResponse
     */
    @Override
    public CompletableFuture<FlightBillSettlementQueryResponse> flightBillSettlementQuery(FlightBillSettlementQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightBillSettlementQuery").setMethod(HttpMethod.GET).setPathRegex("/flight/v1/bill-settlement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightBillSettlementQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightBillSettlementQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightCancelOrder  FlightCancelOrderRequest
     * @return FlightCancelOrderResponse
     */
    @Override
    public CompletableFuture<FlightCancelOrderResponse> flightCancelOrder(FlightCancelOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightCancelOrder").setMethod(HttpMethod.DELETE).setPathRegex("/dtb-flight/v1/order/action/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightCancelOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightCancelOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightCancelOrderV2  FlightCancelOrderV2Request
     * @return FlightCancelOrderV2Response
     */
    @Override
    public CompletableFuture<FlightCancelOrderV2Response> flightCancelOrderV2(FlightCancelOrderV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightCancelOrderV2").setMethod(HttpMethod.DELETE).setPathRegex("/dtb-flight/v2/order/action/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightCancelOrderV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightCancelOrderV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightCreateOrder  FlightCreateOrderRequest
     * @return FlightCreateOrderResponse
     */
    @Override
    public CompletableFuture<FlightCreateOrderResponse> flightCreateOrder(FlightCreateOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightCreateOrder").setMethod(HttpMethod.POST).setPathRegex("/dtb-flight/v1/order/action/create").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightCreateOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightCreateOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightCreateOrderV2  FlightCreateOrderV2Request
     * @return FlightCreateOrderV2Response
     */
    @Override
    public CompletableFuture<FlightCreateOrderV2Response> flightCreateOrderV2(FlightCreateOrderV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightCreateOrderV2").setMethod(HttpMethod.POST).setPathRegex("/dtb-flight/v2/order/action/create").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightCreateOrderV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightCreateOrderV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightExceedApplyQuery  FlightExceedApplyQueryRequest
     * @return FlightExceedApplyQueryResponse
     */
    @Override
    public CompletableFuture<FlightExceedApplyQueryResponse> flightExceedApplyQuery(FlightExceedApplyQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightExceedApplyQuery").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/flight-exceed").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightExceedApplyQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightExceedApplyQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightItineraryScanQuery  FlightItineraryScanQueryRequest
     * @return FlightItineraryScanQueryResponse
     */
    @Override
    public CompletableFuture<FlightItineraryScanQueryResponse> flightItineraryScanQuery(FlightItineraryScanQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightItineraryScanQuery").setMethod(HttpMethod.GET).setPathRegex("/scan/v1/flight-itinerary").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightItineraryScanQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightItineraryScanQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightListingSearch  FlightListingSearchRequest
     * @return FlightListingSearchResponse
     */
    @Override
    public CompletableFuture<FlightListingSearchResponse> flightListingSearch(FlightListingSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightListingSearch").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/flight/action/listing-search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightListingSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightListingSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightListingSearchV2  FlightListingSearchV2Request
     * @return FlightListingSearchV2Response
     */
    @Override
    public CompletableFuture<FlightListingSearchV2Response> flightListingSearchV2(FlightListingSearchV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightListingSearchV2").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v2/flight/action/listing-search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightListingSearchV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightListingSearchV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightModifyApplyV2  FlightModifyApplyV2Request
     * @return FlightModifyApplyV2Response
     */
    @Override
    public CompletableFuture<FlightModifyApplyV2Response> flightModifyApplyV2(FlightModifyApplyV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightModifyApplyV2").setMethod(HttpMethod.POST).setPathRegex("/dtb-flight/v2/modify/action/apply").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightModifyApplyV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightModifyApplyV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightModifyCancelV2  FlightModifyCancelV2Request
     * @return FlightModifyCancelV2Response
     */
    @Override
    public CompletableFuture<FlightModifyCancelV2Response> flightModifyCancelV2(FlightModifyCancelV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightModifyCancelV2").setMethod(HttpMethod.DELETE).setPathRegex("/dtb-flight/v2/modify/action/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightModifyCancelV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightModifyCancelV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightModifyListingSearchV2  FlightModifyListingSearchV2Request
     * @return FlightModifyListingSearchV2Response
     */
    @Override
    public CompletableFuture<FlightModifyListingSearchV2Response> flightModifyListingSearchV2(FlightModifyListingSearchV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightModifyListingSearchV2").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v2/modify/action/listing-search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightModifyListingSearchV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightModifyListingSearchV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightModifyOrderDetailV2  FlightModifyOrderDetailV2Request
     * @return FlightModifyOrderDetailV2Response
     */
    @Override
    public CompletableFuture<FlightModifyOrderDetailV2Response> flightModifyOrderDetailV2(FlightModifyOrderDetailV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightModifyOrderDetailV2").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v2/modify/action/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightModifyOrderDetailV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightModifyOrderDetailV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightModifyOtaSearchV2  FlightModifyOtaSearchV2Request
     * @return FlightModifyOtaSearchV2Response
     */
    @Override
    public CompletableFuture<FlightModifyOtaSearchV2Response> flightModifyOtaSearchV2(FlightModifyOtaSearchV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightModifyOtaSearchV2").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v2/modify/action/ota-search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightModifyOtaSearchV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightModifyOtaSearchV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightModifyPayV2  FlightModifyPayV2Request
     * @return FlightModifyPayV2Response
     */
    @Override
    public CompletableFuture<FlightModifyPayV2Response> flightModifyPayV2(FlightModifyPayV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightModifyPayV2").setMethod(HttpMethod.PUT).setPathRegex("/dtb-flight/v2/modify/action/pay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightModifyPayV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightModifyPayV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightOrderDetailInfo  FlightOrderDetailInfoRequest
     * @return FlightOrderDetailInfoResponse
     */
    @Override
    public CompletableFuture<FlightOrderDetailInfoResponse> flightOrderDetailInfo(FlightOrderDetailInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightOrderDetailInfo").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/order/action/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightOrderDetailInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightOrderDetailInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightOrderDetailV2  FlightOrderDetailV2Request
     * @return FlightOrderDetailV2Response
     */
    @Override
    public CompletableFuture<FlightOrderDetailV2Response> flightOrderDetailV2(FlightOrderDetailV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightOrderDetailV2").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v2/order/action/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightOrderDetailV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightOrderDetailV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightOrderListQuery  FlightOrderListQueryRequest
     * @return FlightOrderListQueryResponse
     */
    @Override
    public CompletableFuture<FlightOrderListQueryResponse> flightOrderListQuery(FlightOrderListQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightOrderListQuery").setMethod(HttpMethod.GET).setPathRegex("/flight/v1/order-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightOrderListQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightOrderListQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightOrderListQueryV2  FlightOrderListQueryV2Request
     * @return FlightOrderListQueryV2Response
     */
    @Override
    public CompletableFuture<FlightOrderListQueryV2Response> flightOrderListQueryV2(FlightOrderListQueryV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightOrderListQueryV2").setMethod(HttpMethod.GET).setPathRegex("/open/v2/Flight-order-list-query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightOrderListQueryV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightOrderListQueryV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightOrderQuery  FlightOrderQueryRequest
     * @return FlightOrderQueryResponse
     */
    @Override
    public CompletableFuture<FlightOrderQueryResponse> flightOrderQuery(FlightOrderQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightOrderQuery").setMethod(HttpMethod.GET).setPathRegex("/flight/v1/order").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightOrderQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightOrderQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightOtaItemDetail  FlightOtaItemDetailRequest
     * @return FlightOtaItemDetailResponse
     */
    @Override
    public CompletableFuture<FlightOtaItemDetailResponse> flightOtaItemDetail(FlightOtaItemDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightOtaItemDetail").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/flight/action/ota-item-detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightOtaItemDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightOtaItemDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightOtaSearch  FlightOtaSearchRequest
     * @return FlightOtaSearchResponse
     */
    @Override
    public CompletableFuture<FlightOtaSearchResponse> flightOtaSearch(FlightOtaSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightOtaSearch").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/flight/action/ota-search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightOtaSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightOtaSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightOtaSearchV2  FlightOtaSearchV2Request
     * @return FlightOtaSearchV2Response
     */
    @Override
    public CompletableFuture<FlightOtaSearchV2Response> flightOtaSearchV2(FlightOtaSearchV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightOtaSearchV2").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v2/flight/action/ota-search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightOtaSearchV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightOtaSearchV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightPayOrder  FlightPayOrderRequest
     * @return FlightPayOrderResponse
     */
    @Override
    public CompletableFuture<FlightPayOrderResponse> flightPayOrder(FlightPayOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightPayOrder").setMethod(HttpMethod.PUT).setPathRegex("/dtb-flight/v1/order/action/pay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightPayOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightPayOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightPayOrderV2  FlightPayOrderV2Request
     * @return FlightPayOrderV2Response
     */
    @Override
    public CompletableFuture<FlightPayOrderV2Response> flightPayOrderV2(FlightPayOrderV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightPayOrderV2").setMethod(HttpMethod.PUT).setPathRegex("/dtb-flight/v2/order/action/pay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightPayOrderV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightPayOrderV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightRefundApply  FlightRefundApplyRequest
     * @return FlightRefundApplyResponse
     */
    @Override
    public CompletableFuture<FlightRefundApplyResponse> flightRefundApply(FlightRefundApplyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightRefundApply").setMethod(HttpMethod.POST).setPathRegex("/dtb-flight/v1/refund/action/apply").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightRefundApplyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightRefundApplyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightRefundApplyV2  FlightRefundApplyV2Request
     * @return FlightRefundApplyV2Response
     */
    @Override
    public CompletableFuture<FlightRefundApplyV2Response> flightRefundApplyV2(FlightRefundApplyV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightRefundApplyV2").setMethod(HttpMethod.POST).setPathRegex("/dtb-flight/v2/refund/action/apply").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightRefundApplyV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightRefundApplyV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightRefundDetail  FlightRefundDetailRequest
     * @return FlightRefundDetailResponse
     */
    @Override
    public CompletableFuture<FlightRefundDetailResponse> flightRefundDetail(FlightRefundDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightRefundDetail").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/refund/action/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightRefundDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightRefundDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightRefundDetailV2  FlightRefundDetailV2Request
     * @return FlightRefundDetailV2Response
     */
    @Override
    public CompletableFuture<FlightRefundDetailV2Response> flightRefundDetailV2(FlightRefundDetailV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightRefundDetailV2").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v2/refund/action/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightRefundDetailV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightRefundDetailV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightRefundPreCal  FlightRefundPreCalRequest
     * @return FlightRefundPreCalResponse
     */
    @Override
    public CompletableFuture<FlightRefundPreCalResponse> flightRefundPreCal(FlightRefundPreCalRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightRefundPreCal").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/refund/action/pre-cal").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightRefundPreCalResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightRefundPreCalResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightRefundPreCalV2  FlightRefundPreCalV2Request
     * @return FlightRefundPreCalV2Response
     */
    @Override
    public CompletableFuture<FlightRefundPreCalV2Response> flightRefundPreCalV2(FlightRefundPreCalV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightRefundPreCalV2").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v2/refund/action/pre-cal").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightRefundPreCalV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightRefundPreCalV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of FlightSearchList  FlightSearchListRequest
     * @return FlightSearchListResponse
     */
    @Override
    public CompletableFuture<FlightSearchListResponse> flightSearchList(FlightSearchListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("FlightSearchList").setMethod(HttpMethod.GET).setPathRegex("/huge/dtb-flight/v1/flight/action/search-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(FlightSearchListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<FlightSearchListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GroupCorpToken  GroupCorpTokenRequest
     * @return GroupCorpTokenResponse
     */
    @Override
    public CompletableFuture<GroupCorpTokenResponse> groupCorpToken(GroupCorpTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GroupCorpToken").setMethod(HttpMethod.GET).setPathRegex("/btrip-open-auth/v1/group-corp-token/action/take").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GroupCorpTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GroupCorpTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GroupDepartSave  GroupDepartSaveRequest
     * @return GroupDepartSaveResponse
     */
    @Override
    public CompletableFuture<GroupDepartSaveResponse> groupDepartSave(GroupDepartSaveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GroupDepartSave").setMethod(HttpMethod.POST).setPathRegex("/sub_corps/v1/departs").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GroupDepartSaveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GroupDepartSaveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GroupUserSave  GroupUserSaveRequest
     * @return GroupUserSaveResponse
     */
    @Override
    public CompletableFuture<GroupUserSaveResponse> groupUserSave(GroupUserSaveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GroupUserSave").setMethod(HttpMethod.POST).setPathRegex("/sub_corps/v1/users").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GroupUserSaveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GroupUserSaveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelAskingPrice  HotelAskingPriceRequest
     * @return HotelAskingPriceResponse
     */
    @Override
    public CompletableFuture<HotelAskingPriceResponse> hotelAskingPrice(HotelAskingPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelAskingPrice").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v1/hotels/action/asking-price").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelAskingPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelAskingPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelBillSettlementQuery  HotelBillSettlementQueryRequest
     * @return HotelBillSettlementQueryResponse
     */
    @Override
    public CompletableFuture<HotelBillSettlementQueryResponse> hotelBillSettlementQuery(HotelBillSettlementQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelBillSettlementQuery").setMethod(HttpMethod.GET).setPathRegex("/hotel/v1/bill-settlement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelBillSettlementQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelBillSettlementQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelCityCodeList  HotelCityCodeListRequest
     * @return HotelCityCodeListResponse
     */
    @Override
    public CompletableFuture<HotelCityCodeListResponse> hotelCityCodeList(HotelCityCodeListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelCityCodeList").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v1/city-codes/action/search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelCityCodeListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelCityCodeListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelExceedApplyQuery  HotelExceedApplyQueryRequest
     * @return HotelExceedApplyQueryResponse
     */
    @Override
    public CompletableFuture<HotelExceedApplyQueryResponse> hotelExceedApplyQuery(HotelExceedApplyQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelExceedApplyQuery").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/hotel-exceed").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelExceedApplyQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelExceedApplyQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelGoodsQuery  HotelGoodsQueryRequest
     * @return HotelGoodsQueryResponse
     */
    @Override
    public CompletableFuture<HotelGoodsQueryResponse> hotelGoodsQuery(HotelGoodsQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelGoodsQuery").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v1/hotel-goods").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelGoodsQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelGoodsQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelIndexInfo  HotelIndexInfoRequest
     * @return HotelIndexInfoResponse
     */
    @Override
    public CompletableFuture<HotelIndexInfoResponse> hotelIndexInfo(HotelIndexInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelIndexInfo").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v1/index-infos").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelIndexInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelIndexInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelOrderCancel  HotelOrderCancelRequest
     * @return HotelOrderCancelResponse
     */
    @Override
    public CompletableFuture<HotelOrderCancelResponse> hotelOrderCancel(HotelOrderCancelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelOrderCancel").setMethod(HttpMethod.DELETE).setPathRegex("/dtb-hotel/v1/orders/action/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelOrderCancelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelOrderCancelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelOrderChangeApply  HotelOrderChangeApplyRequest
     * @return HotelOrderChangeApplyResponse
     */
    @Override
    public CompletableFuture<HotelOrderChangeApplyResponse> hotelOrderChangeApply(HotelOrderChangeApplyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelOrderChangeApply").setMethod(HttpMethod.POST).setPathRegex("/dtb-hotel/v1/orders/action/change/apply").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelOrderChangeApplyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelOrderChangeApplyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelOrderChangeDetail  HotelOrderChangeDetailRequest
     * @return HotelOrderChangeDetailResponse
     */
    @Override
    public CompletableFuture<HotelOrderChangeDetailResponse> hotelOrderChangeDetail(HotelOrderChangeDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelOrderChangeDetail").setMethod(HttpMethod.POST).setPathRegex("/dtb-hotel/v1/orders/action/change/detail").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelOrderChangeDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelOrderChangeDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelOrderCreate  HotelOrderCreateRequest
     * @return HotelOrderCreateResponse
     */
    @Override
    public CompletableFuture<HotelOrderCreateResponse> hotelOrderCreate(HotelOrderCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelOrderCreate").setMethod(HttpMethod.POST).setPathRegex("/dtb-hotel/v1/orders/action/create").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelOrderCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelOrderCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelOrderDetailInfo  HotelOrderDetailInfoRequest
     * @return HotelOrderDetailInfoResponse
     */
    @Override
    public CompletableFuture<HotelOrderDetailInfoResponse> hotelOrderDetailInfo(HotelOrderDetailInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelOrderDetailInfo").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v1/orders/action/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelOrderDetailInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelOrderDetailInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelOrderInfoQuery  HotelOrderInfoQueryRequest
     * @return HotelOrderInfoQueryResponse
     */
    @Override
    public CompletableFuture<HotelOrderInfoQueryResponse> hotelOrderInfoQuery(HotelOrderInfoQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelOrderInfoQuery").setMethod(HttpMethod.GET).setPathRegex("/order/v1/hotelOrders/{order_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelOrderInfoQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelOrderInfoQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelOrderListQuery  HotelOrderListQueryRequest
     * @return HotelOrderListQueryResponse
     */
    @Override
    public CompletableFuture<HotelOrderListQueryResponse> hotelOrderListQuery(HotelOrderListQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelOrderListQuery").setMethod(HttpMethod.GET).setPathRegex("/hotel/v1/order-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelOrderListQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelOrderListQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelOrderPay  HotelOrderPayRequest
     * @return HotelOrderPayResponse
     */
    @Override
    public CompletableFuture<HotelOrderPayResponse> hotelOrderPay(HotelOrderPayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelOrderPay").setMethod(HttpMethod.PUT).setPathRegex("/dtb-hotel/v1/orders/action/pay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelOrderPayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelOrderPayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelOrderPreValidate  HotelOrderPreValidateRequest
     * @return HotelOrderPreValidateResponse
     */
    @Override
    public CompletableFuture<HotelOrderPreValidateResponse> hotelOrderPreValidate(HotelOrderPreValidateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelOrderPreValidate").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v1/orders/action/pre-validate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelOrderPreValidateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelOrderPreValidateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelOrderQuery  HotelOrderQueryRequest
     * @return HotelOrderQueryResponse
     */
    @Override
    public CompletableFuture<HotelOrderQueryResponse> hotelOrderQuery(HotelOrderQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelOrderQuery").setMethod(HttpMethod.GET).setPathRegex("/hotel/v1/order").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelOrderQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelOrderQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelPricePull  HotelPricePullRequest
     * @return HotelPricePullResponse
     */
    @Override
    public CompletableFuture<HotelPricePullResponse> hotelPricePull(HotelPricePullRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelPricePull").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v1/prices/action/pull").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelPricePullResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelPricePullResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelRoomInfo  HotelRoomInfoRequest
     * @return HotelRoomInfoResponse
     */
    @Override
    public CompletableFuture<HotelRoomInfoResponse> hotelRoomInfo(HotelRoomInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelRoomInfo").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v1/room-infos").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelRoomInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelRoomInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelSearch  HotelSearchRequest
     * @return HotelSearchResponse
     */
    @Override
    public CompletableFuture<HotelSearchResponse> hotelSearch(HotelSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelSearch").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v1/hotels/action/search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelStaticInfo  HotelStaticInfoRequest
     * @return HotelStaticInfoResponse
     */
    @Override
    public CompletableFuture<HotelStaticInfoResponse> hotelStaticInfo(HotelStaticInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelStaticInfo").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v1/static-infos").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelStaticInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelStaticInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of HotelSuggestV2  HotelSuggestV2Request
     * @return HotelSuggestV2Response
     */
    @Override
    public CompletableFuture<HotelSuggestV2Response> hotelSuggestV2(HotelSuggestV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("HotelSuggestV2").setMethod(HttpMethod.GET).setPathRegex("/dtb-hotel/v2/suggest-infos").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(HotelSuggestV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<HotelSuggestV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IFlightOrderDetailQuery  IFlightOrderDetailQueryRequest
     * @return IFlightOrderDetailQueryResponse
     */
    @Override
    public CompletableFuture<IFlightOrderDetailQueryResponse> iFlightOrderDetailQuery(IFlightOrderDetailQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IFlightOrderDetailQuery").setMethod(HttpMethod.GET).setPathRegex("/open/v1/intlFlight-order-detail-query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IFlightOrderDetailQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IFlightOrderDetailQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IFlightOrderListQuery  IFlightOrderListQueryRequest
     * @return IFlightOrderListQueryResponse
     */
    @Override
    public CompletableFuture<IFlightOrderListQueryResponse> iFlightOrderListQuery(IFlightOrderListQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IFlightOrderListQuery").setMethod(HttpMethod.GET).setPathRegex("/open/v1/intlFlight-order-list-query").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IFlightOrderListQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IFlightOrderListQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IeFlightBillSettlementQuery  IeFlightBillSettlementQueryRequest
     * @return IeFlightBillSettlementQueryResponse
     */
    @Override
    public CompletableFuture<IeFlightBillSettlementQueryResponse> ieFlightBillSettlementQuery(IeFlightBillSettlementQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IeFlightBillSettlementQuery").setMethod(HttpMethod.GET).setPathRegex("/ie-flight/v1/bill-settlement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IeFlightBillSettlementQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IeFlightBillSettlementQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IeHotelBillSettlementQuery  IeHotelBillSettlementQueryRequest
     * @return IeHotelBillSettlementQueryResponse
     */
    @Override
    public CompletableFuture<IeHotelBillSettlementQueryResponse> ieHotelBillSettlementQuery(IeHotelBillSettlementQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IeHotelBillSettlementQuery").setMethod(HttpMethod.GET).setPathRegex("/ie-hotel/v1/bill-settlement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IeHotelBillSettlementQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IeHotelBillSettlementQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsInvoiceScanQuery  InsInvoiceScanQueryRequest
     * @return InsInvoiceScanQueryResponse
     */
    @Override
    public CompletableFuture<InsInvoiceScanQueryResponse> insInvoiceScanQuery(InsInvoiceScanQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsInvoiceScanQuery").setMethod(HttpMethod.GET).setPathRegex("/scan/v1/ins-invoice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsInvoiceScanQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsInvoiceScanQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsureOrderApply  InsureOrderApplyRequest
     * @return InsureOrderApplyResponse
     */
    @Override
    public CompletableFuture<InsureOrderApplyResponse> insureOrderApply(InsureOrderApplyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsureOrderApply").setMethod(HttpMethod.POST).setPathRegex("/dtb-flight/v1/insurances/action/apply").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsureOrderApplyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsureOrderApplyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsureOrderCancel  InsureOrderCancelRequest
     * @return InsureOrderCancelResponse
     */
    @Override
    public CompletableFuture<InsureOrderCancelResponse> insureOrderCancel(InsureOrderCancelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsureOrderCancel").setMethod(HttpMethod.DELETE).setPathRegex("/dtb-flight/v1/insurances/{ins_order_id}/action/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsureOrderCancelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsureOrderCancelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsureOrderCreate  InsureOrderCreateRequest
     * @return InsureOrderCreateResponse
     */
    @Override
    public CompletableFuture<InsureOrderCreateResponse> insureOrderCreate(InsureOrderCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsureOrderCreate").setMethod(HttpMethod.POST).setPathRegex("/dtb-flight/v1/insurances/action/create").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsureOrderCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsureOrderCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsureOrderDetail  InsureOrderDetailRequest
     * @return InsureOrderDetailResponse
     */
    @Override
    public CompletableFuture<InsureOrderDetailResponse> insureOrderDetail(InsureOrderDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsureOrderDetail").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/insurances/action/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsureOrderDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsureOrderDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsureOrderPay  InsureOrderPayRequest
     * @return InsureOrderPayResponse
     */
    @Override
    public CompletableFuture<InsureOrderPayResponse> insureOrderPay(InsureOrderPayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsureOrderPay").setMethod(HttpMethod.PUT).setPathRegex("/dtb-flight/v1/insurances/{ins_order_id}/action/pay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsureOrderPayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsureOrderPayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsureOrderRefund  InsureOrderRefundRequest
     * @return InsureOrderRefundResponse
     */
    @Override
    public CompletableFuture<InsureOrderRefundResponse> insureOrderRefund(InsureOrderRefundRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsureOrderRefund").setMethod(HttpMethod.PUT).setPathRegex("/dtb-flight/v1/insurances/{ins_order_id}/action/refund").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsureOrderRefundResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsureOrderRefundResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsureOrderUrlDetail  InsureOrderUrlDetailRequest
     * @return InsureOrderUrlDetailResponse
     */
    @Override
    public CompletableFuture<InsureOrderUrlDetailResponse> insureOrderUrlDetail(InsureOrderUrlDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsureOrderUrlDetail").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/insurances/{ins_order_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsureOrderUrlDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsureOrderUrlDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InsureRefundDetail  InsureRefundDetailRequest
     * @return InsureRefundDetailResponse
     */
    @Override
    public CompletableFuture<InsureRefundDetailResponse> insureRefundDetail(InsureRefundDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InsureRefundDetail").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/insurances/action/refund-detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InsureRefundDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InsureRefundDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IntlFlightCreateOrder  IntlFlightCreateOrderRequest
     * @return IntlFlightCreateOrderResponse
     */
    @Override
    public CompletableFuture<IntlFlightCreateOrderResponse> intlFlightCreateOrder(IntlFlightCreateOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IntlFlightCreateOrder").setMethod(HttpMethod.GET).setPathRegex("/intl-flight/v1/order/action/create").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IntlFlightCreateOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IntlFlightCreateOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IntlFlightInventoryPriceCheck  IntlFlightInventoryPriceCheckRequest
     * @return IntlFlightInventoryPriceCheckResponse
     */
    @Override
    public CompletableFuture<IntlFlightInventoryPriceCheckResponse> intlFlightInventoryPriceCheck(IntlFlightInventoryPriceCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IntlFlightInventoryPriceCheck").setMethod(HttpMethod.GET).setPathRegex("/intl-flight/v1/flights/action/inventory-price-check").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IntlFlightInventoryPriceCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IntlFlightInventoryPriceCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IntlFlightListingSearch  IntlFlightListingSearchRequest
     * @return IntlFlightListingSearchResponse
     */
    @Override
    public CompletableFuture<IntlFlightListingSearchResponse> intlFlightListingSearch(IntlFlightListingSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IntlFlightListingSearch").setMethod(HttpMethod.GET).setPathRegex("/intl-flight/v1/flights/action/listing-search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IntlFlightListingSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IntlFlightListingSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IntlFlightOrderCancel  IntlFlightOrderCancelRequest
     * @return IntlFlightOrderCancelResponse
     */
    @Override
    public CompletableFuture<IntlFlightOrderCancelResponse> intlFlightOrderCancel(IntlFlightOrderCancelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IntlFlightOrderCancel").setMethod(HttpMethod.DELETE).setPathRegex("/intl-flight/v1/order/action/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IntlFlightOrderCancelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IntlFlightOrderCancelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IntlFlightOrderDetail  IntlFlightOrderDetailRequest
     * @return IntlFlightOrderDetailResponse
     */
    @Override
    public CompletableFuture<IntlFlightOrderDetailResponse> intlFlightOrderDetail(IntlFlightOrderDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IntlFlightOrderDetail").setMethod(HttpMethod.GET).setPathRegex("/intl-flight/v1/order/action/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IntlFlightOrderDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IntlFlightOrderDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IntlFlightOrderPay  IntlFlightOrderPayRequest
     * @return IntlFlightOrderPayResponse
     */
    @Override
    public CompletableFuture<IntlFlightOrderPayResponse> intlFlightOrderPay(IntlFlightOrderPayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IntlFlightOrderPay").setMethod(HttpMethod.PUT).setPathRegex("/intl-flight/v1/order/action/pay").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IntlFlightOrderPayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IntlFlightOrderPayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IntlFlightOrderPayCheck  IntlFlightOrderPayCheckRequest
     * @return IntlFlightOrderPayCheckResponse
     */
    @Override
    public CompletableFuture<IntlFlightOrderPayCheckResponse> intlFlightOrderPayCheck(IntlFlightOrderPayCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IntlFlightOrderPayCheck").setMethod(HttpMethod.GET).setPathRegex("/intl-flight/v1/order/action/pay-check").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IntlFlightOrderPayCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IntlFlightOrderPayCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IntlFlightOtaItemDetail  IntlFlightOtaItemDetailRequest
     * @return IntlFlightOtaItemDetailResponse
     */
    @Override
    public CompletableFuture<IntlFlightOtaItemDetailResponse> intlFlightOtaItemDetail(IntlFlightOtaItemDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IntlFlightOtaItemDetail").setMethod(HttpMethod.GET).setPathRegex("/intl-flight/v1/items/{ota_item_id}/action/ota-get").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IntlFlightOtaItemDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IntlFlightOtaItemDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IntlFlightOtaSearch  IntlFlightOtaSearchRequest
     * @return IntlFlightOtaSearchResponse
     */
    @Override
    public CompletableFuture<IntlFlightOtaSearchResponse> intlFlightOtaSearch(IntlFlightOtaSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IntlFlightOtaSearch").setMethod(HttpMethod.GET).setPathRegex("/intl-flight/v1/flights/action/ota-search").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IntlFlightOtaSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IntlFlightOtaSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IntlFlightSegmentAvailableCert  IntlFlightSegmentAvailableCertRequest
     * @return IntlFlightSegmentAvailableCertResponse
     */
    @Override
    public CompletableFuture<IntlFlightSegmentAvailableCertResponse> intlFlightSegmentAvailableCert(IntlFlightSegmentAvailableCertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IntlFlightSegmentAvailableCert").setMethod(HttpMethod.GET).setPathRegex("/intl-flight/v1/items/{ota_item_id}/action/segment-available-cert").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IntlFlightSegmentAvailableCertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IntlFlightSegmentAvailableCertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvoiceAdd  InvoiceAddRequest
     * @return InvoiceAddResponse
     */
    @Override
    public CompletableFuture<InvoiceAddResponse> invoiceAdd(InvoiceAddRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvoiceAdd").setMethod(HttpMethod.POST).setPathRegex("/invoice/v1/add-invoice").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvoiceAddResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvoiceAddResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvoiceDelete  InvoiceDeleteRequest
     * @return InvoiceDeleteResponse
     */
    @Override
    public CompletableFuture<InvoiceDeleteResponse> invoiceDelete(InvoiceDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvoiceDelete").setMethod(HttpMethod.DELETE).setPathRegex("/invoice/v1/invoice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvoiceDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvoiceDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvoiceModify  InvoiceModifyRequest
     * @return InvoiceModifyResponse
     */
    @Override
    public CompletableFuture<InvoiceModifyResponse> invoiceModify(InvoiceModifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvoiceModify").setMethod(HttpMethod.PUT).setPathRegex("/invoice/v1/invoice").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvoiceModifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvoiceModifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvoiceRuleAdd  InvoiceRuleAddRequest
     * @return InvoiceRuleAddResponse
     */
    @Override
    public CompletableFuture<InvoiceRuleAddResponse> invoiceRuleAdd(InvoiceRuleAddRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvoiceRuleAdd").setMethod(HttpMethod.PUT).setPathRegex("/invoice/v1/invoice-rule").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvoiceRuleAddResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvoiceRuleAddResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvoiceRuleDelete  InvoiceRuleDeleteRequest
     * @return InvoiceRuleDeleteResponse
     */
    @Override
    public CompletableFuture<InvoiceRuleDeleteResponse> invoiceRuleDelete(InvoiceRuleDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvoiceRuleDelete").setMethod(HttpMethod.DELETE).setPathRegex("/invoice/v1/invoice-rule").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvoiceRuleDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvoiceRuleDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvoiceRuleSave  InvoiceRuleSaveRequest
     * @return InvoiceRuleSaveResponse
     */
    @Override
    public CompletableFuture<InvoiceRuleSaveResponse> invoiceRuleSave(InvoiceRuleSaveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvoiceRuleSave").setMethod(HttpMethod.POST).setPathRegex("/invoice/v1/invoice-rule").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvoiceRuleSaveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvoiceRuleSaveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvoiceSearch  InvoiceSearchRequest
     * @return InvoiceSearchResponse
     */
    @Override
    public CompletableFuture<InvoiceSearchResponse> invoiceSearch(InvoiceSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvoiceSearch").setMethod(HttpMethod.GET).setPathRegex("/invoice/v1/invoice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvoiceSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvoiceSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IsvRuleSave  IsvRuleSaveRequest
     * @return IsvRuleSaveResponse
     */
    @Override
    public CompletableFuture<IsvRuleSaveResponse> isvRuleSave(IsvRuleSaveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IsvRuleSave").setMethod(HttpMethod.POST).setPathRegex("/user/v1/rule").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IsvRuleSaveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IsvRuleSaveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of IsvUserSave  IsvUserSaveRequest
     * @return IsvUserSaveResponse
     */
    @Override
    public CompletableFuture<IsvUserSaveResponse> isvUserSave(IsvUserSaveRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("IsvUserSave").setMethod(HttpMethod.POST).setPathRegex("/isvuser/v1/isvuser").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(IsvUserSaveResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<IsvUserSaveResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MealBillSettlementQuery  MealBillSettlementQueryRequest
     * @return MealBillSettlementQueryResponse
     */
    @Override
    public CompletableFuture<MealBillSettlementQueryResponse> mealBillSettlementQuery(MealBillSettlementQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MealBillSettlementQuery").setMethod(HttpMethod.GET).setPathRegex("/meal/v1/bill-settlement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MealBillSettlementQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MealBillSettlementQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MealOrderDetailQuery  MealOrderDetailQueryRequest
     * @return MealOrderDetailQueryResponse
     */
    @Override
    public CompletableFuture<MealOrderDetailQueryResponse> mealOrderDetailQuery(MealOrderDetailQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MealOrderDetailQuery").setMethod(HttpMethod.GET).setPathRegex("/meal/v1/orders/{order_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MealOrderDetailQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MealOrderDetailQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MealOrderListQuery  MealOrderListQueryRequest
     * @return MealOrderListQueryResponse
     */
    @Override
    public CompletableFuture<MealOrderListQueryResponse> mealOrderListQuery(MealOrderListQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MealOrderListQuery").setMethod(HttpMethod.GET).setPathRegex("/meal/v1/orders").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MealOrderListQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MealOrderListQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MonthBillConfirm  MonthBillConfirmRequest
     * @return MonthBillConfirmResponse
     */
    @Override
    public CompletableFuture<MonthBillConfirmResponse> monthBillConfirm(MonthBillConfirmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MonthBillConfirm").setMethod(HttpMethod.PUT).setPathRegex("/bill/v1/status/action/confirm").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MonthBillConfirmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MonthBillConfirmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of MonthBillGet  MonthBillGetRequest
     * @return MonthBillGetResponse
     */
    @Override
    public CompletableFuture<MonthBillGetResponse> monthBillGet(MonthBillGetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("MonthBillGet").setMethod(HttpMethod.GET).setPathRegex("/open/v1/month-bill").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MonthBillGetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MonthBillGetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ProjectAdd  ProjectAddRequest
     * @return ProjectAddResponse
     */
    @Override
    public CompletableFuture<ProjectAddResponse> projectAdd(ProjectAddRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ProjectAdd").setMethod(HttpMethod.POST).setPathRegex("/cost/v1/project").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ProjectAddResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ProjectAddResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ProjectDelete  ProjectDeleteRequest
     * @return ProjectDeleteResponse
     */
    @Override
    public CompletableFuture<ProjectDeleteResponse> projectDelete(ProjectDeleteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ProjectDelete").setMethod(HttpMethod.DELETE).setPathRegex("/cost/v1/project").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ProjectDeleteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ProjectDeleteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ProjectModify  ProjectModifyRequest
     * @return ProjectModifyResponse
     */
    @Override
    public CompletableFuture<ProjectModifyResponse> projectModify(ProjectModifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ProjectModify").setMethod(HttpMethod.PUT).setPathRegex("/cost/v1/project").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ProjectModifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ProjectModifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryEmployeeDetail  QueryEmployeeDetailRequest
     * @return QueryEmployeeDetailResponse
     */
    @Override
    public CompletableFuture<QueryEmployeeDetailResponse> queryEmployeeDetail(QueryEmployeeDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryEmployeeDetail").setMethod(HttpMethod.GET).setPathRegex("/user/v1/employeeDetail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryEmployeeDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryEmployeeDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryGroupCorpList  QueryGroupCorpListRequest
     * @return QueryGroupCorpListResponse
     */
    @Override
    public CompletableFuture<QueryGroupCorpListResponse> queryGroupCorpList(QueryGroupCorpListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryGroupCorpList").setMethod(HttpMethod.POST).setPathRegex("/sub_corps/v1/corps/action/corpList").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryGroupCorpListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryGroupCorpListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryReimbursementOrder  QueryReimbursementOrderRequest
     * @return QueryReimbursementOrderResponse
     */
    @Override
    public CompletableFuture<QueryReimbursementOrderResponse> queryReimbursementOrder(QueryReimbursementOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryReimbursementOrder").setMethod(HttpMethod.GET).setPathRegex("/reimbursement/v1/order").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryReimbursementOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryReimbursementOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncSingleUser  SyncSingleUserRequest
     * @return SyncSingleUserResponse
     */
    @Override
    public CompletableFuture<SyncSingleUserResponse> syncSingleUser(SyncSingleUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncSingleUser").setMethod(HttpMethod.POST).setPathRegex("/user/v1/single-user/action/sync").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncSingleUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncSingleUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SyncThirdUserMapping  SyncThirdUserMappingRequest
     * @return SyncThirdUserMappingResponse
     */
    @Override
    public CompletableFuture<SyncThirdUserMappingResponse> syncThirdUserMapping(SyncThirdUserMappingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SyncThirdUserMapping").setMethod(HttpMethod.POST).setPathRegex("/user/v1/third-users/action/mapping").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SyncThirdUserMappingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SyncThirdUserMappingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TBAccountInfoQuery  TBAccountInfoQueryRequest
     * @return TBAccountInfoQueryResponse
     */
    @Override
    public CompletableFuture<TBAccountInfoQueryResponse> tBAccountInfoQuery(TBAccountInfoQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TBAccountInfoQuery").setMethod(HttpMethod.GET).setPathRegex("/account/v1/tb-accounts/{user_id}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TBAccountInfoQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TBAccountInfoQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TBAccountUnbind  TBAccountUnbindRequest
     * @return TBAccountUnbindResponse
     */
    @Override
    public CompletableFuture<TBAccountUnbindResponse> tBAccountUnbind(TBAccountUnbindRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TBAccountUnbind").setMethod(HttpMethod.PATCH).setPathRegex("/account/v1/tb-accounts/{user_id}/action/unbind").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TBAccountUnbindResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TBAccountUnbindResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TicketChangingApply  TicketChangingApplyRequest
     * @return TicketChangingApplyResponse
     */
    @Override
    public CompletableFuture<TicketChangingApplyResponse> ticketChangingApply(TicketChangingApplyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TicketChangingApply").setMethod(HttpMethod.POST).setPathRegex("/dtb-flight/v1/ticket-changing/action/apply").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TicketChangingApplyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TicketChangingApplyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TicketChangingCancel  TicketChangingCancelRequest
     * @return TicketChangingCancelResponse
     */
    @Override
    public CompletableFuture<TicketChangingCancelResponse> ticketChangingCancel(TicketChangingCancelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TicketChangingCancel").setMethod(HttpMethod.DELETE).setPathRegex("/dtb-flight/v1/ticket-changing/action/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TicketChangingCancelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TicketChangingCancelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TicketChangingDetail  TicketChangingDetailRequest
     * @return TicketChangingDetailResponse
     */
    @Override
    public CompletableFuture<TicketChangingDetailResponse> ticketChangingDetail(TicketChangingDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TicketChangingDetail").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/ticket-changing/action/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TicketChangingDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TicketChangingDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TicketChangingEnquiry  TicketChangingEnquiryRequest
     * @return TicketChangingEnquiryResponse
     */
    @Override
    public CompletableFuture<TicketChangingEnquiryResponse> ticketChangingEnquiry(TicketChangingEnquiryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TicketChangingEnquiry").setMethod(HttpMethod.GET).setPathRegex("/dtb-flight/v1/ticket-changing/action/enquiry").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TicketChangingEnquiryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TicketChangingEnquiryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TicketChangingFlightList  TicketChangingFlightListRequest
     * @return TicketChangingFlightListResponse
     */
    @Override
    public CompletableFuture<TicketChangingFlightListResponse> ticketChangingFlightList(TicketChangingFlightListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TicketChangingFlightList").setMethod(HttpMethod.GET).setPathRegex("/huge/dtb-flight/v1/ticket-changing-flight/action/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TicketChangingFlightListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TicketChangingFlightListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TicketChangingPay  TicketChangingPayRequest
     * @return TicketChangingPayResponse
     */
    @Override
    public CompletableFuture<TicketChangingPayResponse> ticketChangingPay(TicketChangingPayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TicketChangingPay").setMethod(HttpMethod.POST).setPathRegex("/dtb-flight/v1/ticket-changing/action/pay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TicketChangingPayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TicketChangingPayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainApplyChange  TrainApplyChangeRequest
     * @return TrainApplyChangeResponse
     */
    @Override
    public CompletableFuture<TrainApplyChangeResponse> trainApplyChange(TrainApplyChangeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainApplyChange").setMethod(HttpMethod.POST).setPathRegex("/train/v1/change/apply").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainApplyChangeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainApplyChangeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainApplyRefund  TrainApplyRefundRequest
     * @return TrainApplyRefundResponse
     */
    @Override
    public CompletableFuture<TrainApplyRefundResponse> trainApplyRefund(TrainApplyRefundRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainApplyRefund").setMethod(HttpMethod.POST).setPathRegex("/train/v1/refund/apply").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainApplyRefundResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainApplyRefundResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainBillSettlementQuery  TrainBillSettlementQueryRequest
     * @return TrainBillSettlementQueryResponse
     */
    @Override
    public CompletableFuture<TrainBillSettlementQueryResponse> trainBillSettlementQuery(TrainBillSettlementQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainBillSettlementQuery").setMethod(HttpMethod.GET).setPathRegex("/train/v1/bill-settlement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainBillSettlementQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainBillSettlementQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainExceedApplyQuery  TrainExceedApplyQueryRequest
     * @return TrainExceedApplyQueryResponse
     */
    @Override
    public CompletableFuture<TrainExceedApplyQueryResponse> trainExceedApplyQuery(TrainExceedApplyQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainExceedApplyQuery").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/train-exceed").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainExceedApplyQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainExceedApplyQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainFeeCalculateChange  TrainFeeCalculateChangeRequest
     * @return TrainFeeCalculateChangeResponse
     */
    @Override
    public CompletableFuture<TrainFeeCalculateChangeResponse> trainFeeCalculateChange(TrainFeeCalculateChangeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainFeeCalculateChange").setMethod(HttpMethod.POST).setPathRegex("/train/v1/change/fee").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainFeeCalculateChangeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainFeeCalculateChangeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainFeeCalculateRefund  TrainFeeCalculateRefundRequest
     * @return TrainFeeCalculateRefundResponse
     */
    @Override
    public CompletableFuture<TrainFeeCalculateRefundResponse> trainFeeCalculateRefund(TrainFeeCalculateRefundRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainFeeCalculateRefund").setMethod(HttpMethod.POST).setPathRegex("/train/v1/refund/fee").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainFeeCalculateRefundResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainFeeCalculateRefundResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainNoInfoSearch  TrainNoInfoSearchRequest
     * @return TrainNoInfoSearchResponse
     */
    @Override
    public CompletableFuture<TrainNoInfoSearchResponse> trainNoInfoSearch(TrainNoInfoSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainNoInfoSearch").setMethod(HttpMethod.POST).setPathRegex("/train/v1/search/info").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainNoInfoSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainNoInfoSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainNoListSearch  TrainNoListSearchRequest
     * @return TrainNoListSearchResponse
     */
    @Override
    public CompletableFuture<TrainNoListSearchResponse> trainNoListSearch(TrainNoListSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainNoListSearch").setMethod(HttpMethod.POST).setPathRegex("/train/v1/search/list").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainNoListSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainNoListSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainOrderCancel  TrainOrderCancelRequest
     * @return TrainOrderCancelResponse
     */
    @Override
    public CompletableFuture<TrainOrderCancelResponse> trainOrderCancel(TrainOrderCancelRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainOrderCancel").setMethod(HttpMethod.POST).setPathRegex("/train/v1/order/cancel").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainOrderCancelResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainOrderCancelResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainOrderChangeConfirm  TrainOrderChangeConfirmRequest
     * @return TrainOrderChangeConfirmResponse
     */
    @Override
    public CompletableFuture<TrainOrderChangeConfirmResponse> trainOrderChangeConfirm(TrainOrderChangeConfirmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainOrderChangeConfirm").setMethod(HttpMethod.POST).setPathRegex("/train/v1/change/confirm").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainOrderChangeConfirmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainOrderChangeConfirmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainOrderCreate  TrainOrderCreateRequest
     * @return TrainOrderCreateResponse
     */
    @Override
    public CompletableFuture<TrainOrderCreateResponse> trainOrderCreate(TrainOrderCreateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainOrderCreate").setMethod(HttpMethod.POST).setPathRegex("/train/v1/order/create").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainOrderCreateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainOrderCreateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainOrderDetailQuery  TrainOrderDetailQueryRequest
     * @return TrainOrderDetailQueryResponse
     */
    @Override
    public CompletableFuture<TrainOrderDetailQueryResponse> trainOrderDetailQuery(TrainOrderDetailQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainOrderDetailQuery").setMethod(HttpMethod.POST).setPathRegex("/train/v1/order/query").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainOrderDetailQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainOrderDetailQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainOrderListQuery  TrainOrderListQueryRequest
     * @return TrainOrderListQueryResponse
     */
    @Override
    public CompletableFuture<TrainOrderListQueryResponse> trainOrderListQuery(TrainOrderListQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainOrderListQuery").setMethod(HttpMethod.GET).setPathRegex("/train/v1/order-list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainOrderListQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainOrderListQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainOrderPay  TrainOrderPayRequest
     * @return TrainOrderPayResponse
     */
    @Override
    public CompletableFuture<TrainOrderPayResponse> trainOrderPay(TrainOrderPayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainOrderPay").setMethod(HttpMethod.POST).setPathRegex("/train/v1/order/pay").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainOrderPayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainOrderPayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainOrderQuery  TrainOrderQueryRequest
     * @return TrainOrderQueryResponse
     */
    @Override
    public CompletableFuture<TrainOrderQueryResponse> trainOrderQuery(TrainOrderQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainOrderQuery").setMethod(HttpMethod.GET).setPathRegex("/train/v1/order").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainOrderQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainOrderQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainOrderQueryV2  TrainOrderQueryV2Request
     * @return TrainOrderQueryV2Response
     */
    @Override
    public CompletableFuture<TrainOrderQueryV2Response> trainOrderQueryV2(TrainOrderQueryV2Request request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainOrderQueryV2").setMethod(HttpMethod.GET).setPathRegex("/train/v2/order").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainOrderQueryV2Response.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainOrderQueryV2Response> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainStationSearch  TrainStationSearchRequest
     * @return TrainStationSearchResponse
     */
    @Override
    public CompletableFuture<TrainStationSearchResponse> trainStationSearch(TrainStationSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainStationSearch").setMethod(HttpMethod.GET).setPathRegex("/city/v1/train").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainStationSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainStationSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainStopoverSearch  TrainStopoverSearchRequest
     * @return TrainStopoverSearchResponse
     */
    @Override
    public CompletableFuture<TrainStopoverSearchResponse> trainStopoverSearch(TrainStopoverSearchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainStopoverSearch").setMethod(HttpMethod.POST).setPathRegex("/train/v1/search/stopover").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainStopoverSearchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainStopoverSearchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TrainTicketScanQuery  TrainTicketScanQueryRequest
     * @return TrainTicketScanQueryResponse
     */
    @Override
    public CompletableFuture<TrainTicketScanQueryResponse> trainTicketScanQuery(TrainTicketScanQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TrainTicketScanQuery").setMethod(HttpMethod.GET).setPathRegex("/scan/v1/train-ticket").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TrainTicketScanQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TrainTicketScanQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TravelStandardListQuery  TravelStandardListQueryRequest
     * @return TravelStandardListQueryResponse
     */
    @Override
    public CompletableFuture<TravelStandardListQueryResponse> travelStandardListQuery(TravelStandardListQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TravelStandardListQuery").setMethod(HttpMethod.GET).setPathRegex("/travel-manage/v1/standards/list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TravelStandardListQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TravelStandardListQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TravelStandardQuery  TravelStandardQueryRequest
     * @return TravelStandardQueryResponse
     */
    @Override
    public CompletableFuture<TravelStandardQueryResponse> travelStandardQuery(TravelStandardQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TravelStandardQuery").setMethod(HttpMethod.GET).setPathRegex("/travel-manage/v1/standards/detail").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TravelStandardQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TravelStandardQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TripBusinessInstanceQuery  TripBusinessInstanceQueryRequest
     * @return TripBusinessInstanceQueryResponse
     */
    @Override
    public CompletableFuture<TripBusinessInstanceQueryResponse> tripBusinessInstanceQuery(TripBusinessInstanceQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TripBusinessInstanceQuery").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/business").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TripBusinessInstanceQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TripBusinessInstanceQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TripCCInfoQuery  TripCCInfoQueryRequest
     * @return TripCCInfoQueryResponse
     */
    @Override
    public CompletableFuture<TripCCInfoQueryResponse> tripCCInfoQuery(TripCCInfoQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TripCCInfoQuery").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/cc").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TripCCInfoQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TripCCInfoQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TripTaskQuery  TripTaskQueryRequest
     * @return TripTaskQueryResponse
     */
    @Override
    public CompletableFuture<TripTaskQueryResponse> tripTaskQuery(TripTaskQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TripTaskQuery").setMethod(HttpMethod.GET).setPathRegex("/apply/v1/tasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TripTaskQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TripTaskQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCustomRole  UpdateCustomRoleRequest
     * @return UpdateCustomRoleResponse
     */
    @Override
    public CompletableFuture<UpdateCustomRoleResponse> updateCustomRole(UpdateCustomRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateCustomRole").setMethod(HttpMethod.POST).setPathRegex("/role/v1/customRoles/update").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateDepartment  UpdateDepartmentRequest
     * @return UpdateDepartmentResponse
     */
    @Override
    public CompletableFuture<UpdateDepartmentResponse> updateDepartment(UpdateDepartmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateDepartment").setMethod(HttpMethod.POST).setPathRegex("/department/v2/update").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDepartmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDepartmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEmployee  UpdateEmployeeRequest
     * @return UpdateEmployeeResponse
     */
    @Override
    public CompletableFuture<UpdateEmployeeResponse> updateEmployee(UpdateEmployeeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateEmployee").setMethod(HttpMethod.POST).setPathRegex("/employee/v2/update").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEmployeeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEmployeeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEmployeeLeaveStatus  UpdateEmployeeLeaveStatusRequest
     * @return UpdateEmployeeLeaveStatusResponse
     */
    @Override
    public CompletableFuture<UpdateEmployeeLeaveStatusResponse> updateEmployeeLeaveStatus(UpdateEmployeeLeaveStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateEmployeeLeaveStatus").setMethod(HttpMethod.POST).setPathRegex("/employee/v2/updateLeaveStatus").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEmployeeLeaveStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEmployeeLeaveStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UserQuery  UserQueryRequest
     * @return UserQueryResponse
     */
    @Override
    public CompletableFuture<UserQueryResponse> userQuery(UserQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UserQuery").setMethod(HttpMethod.GET).setPathRegex("/user/v1/user").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UserQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UserQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VatInvoiceScanQuery  VatInvoiceScanQueryRequest
     * @return VatInvoiceScanQueryResponse
     */
    @Override
    public CompletableFuture<VatInvoiceScanQueryResponse> vatInvoiceScanQuery(VatInvoiceScanQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("VatInvoiceScanQuery").setMethod(HttpMethod.GET).setPathRegex("/scan/v1/vat-invoice").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VatInvoiceScanQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VatInvoiceScanQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WaitApplyInvoiceTaskDetailQuery  WaitApplyInvoiceTaskDetailQueryRequest
     * @return WaitApplyInvoiceTaskDetailQueryResponse
     */
    @Override
    public CompletableFuture<WaitApplyInvoiceTaskDetailQueryResponse> waitApplyInvoiceTaskDetailQuery(WaitApplyInvoiceTaskDetailQueryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("WaitApplyInvoiceTaskDetailQuery").setMethod(HttpMethod.GET).setPathRegex("/invoice/v1/wait-apply-task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WaitApplyInvoiceTaskDetailQueryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WaitApplyInvoiceTaskDetailQueryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
