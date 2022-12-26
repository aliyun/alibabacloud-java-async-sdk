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

}
