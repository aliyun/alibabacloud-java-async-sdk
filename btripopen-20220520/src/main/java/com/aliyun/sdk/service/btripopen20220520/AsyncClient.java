// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.btripopen20220520.models.*;
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

    CompletableFuture<AccessTokenResponse> accessToken(AccessTokenRequest request);

    CompletableFuture<AddressGetResponse> addressGet(AddressGetRequest request);

    CompletableFuture<AirportSearchResponse> airportSearch(AirportSearchRequest request);

    CompletableFuture<AllBaseCityInfoQueryResponse> allBaseCityInfoQuery(AllBaseCityInfoQueryRequest request);

    CompletableFuture<ApplyAddResponse> applyAdd(ApplyAddRequest request);

    CompletableFuture<ApplyApproveResponse> applyApprove(ApplyApproveRequest request);

    CompletableFuture<ApplyListQueryResponse> applyListQuery(ApplyListQueryRequest request);

    CompletableFuture<ApplyModifyResponse> applyModify(ApplyModifyRequest request);

    CompletableFuture<ApplyQueryResponse> applyQuery(ApplyQueryRequest request);

    CompletableFuture<CarApplyAddResponse> carApplyAdd(CarApplyAddRequest request);

    CompletableFuture<CarApplyModifyResponse> carApplyModify(CarApplyModifyRequest request);

    CompletableFuture<CarApplyQueryResponse> carApplyQuery(CarApplyQueryRequest request);

    CompletableFuture<CarBillSettlementQueryResponse> carBillSettlementQuery(CarBillSettlementQueryRequest request);

    CompletableFuture<CarOrderListQueryResponse> carOrderListQuery(CarOrderListQueryRequest request);

    CompletableFuture<CarOrderQueryResponse> carOrderQuery(CarOrderQueryRequest request);

    CompletableFuture<CitySearchResponse> citySearch(CitySearchRequest request);

    CompletableFuture<CommonApplyQueryResponse> commonApplyQuery(CommonApplyQueryRequest request);

    CompletableFuture<CommonApplySyncResponse> commonApplySync(CommonApplySyncRequest request);

    CompletableFuture<CorpTokenResponse> corpToken(CorpTokenRequest request);

    CompletableFuture<CostCenterDeleteResponse> costCenterDelete(CostCenterDeleteRequest request);

    CompletableFuture<CostCenterModifyResponse> costCenterModify(CostCenterModifyRequest request);

    CompletableFuture<CostCenterQueryResponse> costCenterQuery(CostCenterQueryRequest request);

    CompletableFuture<CostCenterSaveResponse> costCenterSave(CostCenterSaveRequest request);

    CompletableFuture<DepartmentSaveResponse> departmentSave(DepartmentSaveRequest request);

    CompletableFuture<EntityAddResponse> entityAdd(EntityAddRequest request);

    CompletableFuture<EntityDeleteResponse> entityDelete(EntityDeleteRequest request);

    CompletableFuture<EntitySetResponse> entitySet(EntitySetRequest request);

    CompletableFuture<EstimatedPriceQueryResponse> estimatedPriceQuery(EstimatedPriceQueryRequest request);

    CompletableFuture<ExceedApplySyncResponse> exceedApplySync(ExceedApplySyncRequest request);

    CompletableFuture<FlightBillSettlementQueryResponse> flightBillSettlementQuery(FlightBillSettlementQueryRequest request);

    CompletableFuture<FlightExceedApplyQueryResponse> flightExceedApplyQuery(FlightExceedApplyQueryRequest request);

    CompletableFuture<FlightOrderListQueryResponse> flightOrderListQuery(FlightOrderListQueryRequest request);

    CompletableFuture<FlightOrderQueryResponse> flightOrderQuery(FlightOrderQueryRequest request);

    CompletableFuture<HotelBillSettlementQueryResponse> hotelBillSettlementQuery(HotelBillSettlementQueryRequest request);

    CompletableFuture<HotelExceedApplyQueryResponse> hotelExceedApplyQuery(HotelExceedApplyQueryRequest request);

    CompletableFuture<HotelOrderListQueryResponse> hotelOrderListQuery(HotelOrderListQueryRequest request);

    CompletableFuture<HotelOrderQueryResponse> hotelOrderQuery(HotelOrderQueryRequest request);

    CompletableFuture<IeFlightBillSettlementQueryResponse> ieFlightBillSettlementQuery(IeFlightBillSettlementQueryRequest request);

    CompletableFuture<InvoiceAddResponse> invoiceAdd(InvoiceAddRequest request);

    CompletableFuture<InvoiceDeleteResponse> invoiceDelete(InvoiceDeleteRequest request);

    CompletableFuture<InvoiceModifyResponse> invoiceModify(InvoiceModifyRequest request);

    CompletableFuture<InvoiceRuleSaveResponse> invoiceRuleSave(InvoiceRuleSaveRequest request);

    CompletableFuture<InvoiceSearchResponse> invoiceSearch(InvoiceSearchRequest request);

    CompletableFuture<IsvUserSaveResponse> isvUserSave(IsvUserSaveRequest request);

    CompletableFuture<MonthBillGetResponse> monthBillGet(MonthBillGetRequest request);

    CompletableFuture<ProjectAddResponse> projectAdd(ProjectAddRequest request);

    CompletableFuture<ProjectDeleteResponse> projectDelete(ProjectDeleteRequest request);

    CompletableFuture<ProjectModifyResponse> projectModify(ProjectModifyRequest request);

    CompletableFuture<TrainBillSettlementQueryResponse> trainBillSettlementQuery(TrainBillSettlementQueryRequest request);

    CompletableFuture<TrainExceedApplyQueryResponse> trainExceedApplyQuery(TrainExceedApplyQueryRequest request);

    CompletableFuture<TrainOrderListQueryResponse> trainOrderListQuery(TrainOrderListQueryRequest request);

    CompletableFuture<TrainOrderQueryResponse> trainOrderQuery(TrainOrderQueryRequest request);

    CompletableFuture<TrainStationSearchResponse> trainStationSearch(TrainStationSearchRequest request);

    CompletableFuture<UserQueryResponse> userQuery(UserQueryRequest request);

}
