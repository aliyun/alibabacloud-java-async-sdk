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

    CompletableFuture<AddInvoiceEntityResponse> addInvoiceEntity(AddInvoiceEntityRequest request);

    CompletableFuture<AddressGetResponse> addressGet(AddressGetRequest request);

    CompletableFuture<AirportSearchResponse> airportSearch(AirportSearchRequest request);

    CompletableFuture<AllBaseCityInfoQueryResponse> allBaseCityInfoQuery(AllBaseCityInfoQueryRequest request);

    CompletableFuture<ApplyAddResponse> applyAdd(ApplyAddRequest request);

    CompletableFuture<ApplyApproveResponse> applyApprove(ApplyApproveRequest request);

    CompletableFuture<ApplyInvoiceTaskResponse> applyInvoiceTask(ApplyInvoiceTaskRequest request);

    CompletableFuture<ApplyListQueryResponse> applyListQuery(ApplyListQueryRequest request);

    CompletableFuture<ApplyModifyResponse> applyModify(ApplyModifyRequest request);

    CompletableFuture<ApplyQueryResponse> applyQuery(ApplyQueryRequest request);

    CompletableFuture<BaseCityInfoSearchResponse> baseCityInfoSearch(BaseCityInfoSearchRequest request);

    CompletableFuture<BtripBillInfoAdjustResponse> btripBillInfoAdjust(BtripBillInfoAdjustRequest request);

    CompletableFuture<CarApplyAddResponse> carApplyAdd(CarApplyAddRequest request);

    CompletableFuture<CarApplyModifyResponse> carApplyModify(CarApplyModifyRequest request);

    CompletableFuture<CarApplyQueryResponse> carApplyQuery(CarApplyQueryRequest request);

    CompletableFuture<CarBillSettlementQueryResponse> carBillSettlementQuery(CarBillSettlementQueryRequest request);

    CompletableFuture<CarOrderListQueryResponse> carOrderListQuery(CarOrderListQueryRequest request);

    CompletableFuture<CarOrderQueryResponse> carOrderQuery(CarOrderQueryRequest request);

    CompletableFuture<CarSceneQueryResponse> carSceneQuery(CarSceneQueryRequest request);

    CompletableFuture<CitySearchResponse> citySearch(CitySearchRequest request);

    CompletableFuture<CommonApplyQueryResponse> commonApplyQuery(CommonApplyQueryRequest request);

    CompletableFuture<CommonApplySyncResponse> commonApplySync(CommonApplySyncRequest request);

    CompletableFuture<CorpAuthLinkInfoQueryResponse> corpAuthLinkInfoQuery(CorpAuthLinkInfoQueryRequest request);

    CompletableFuture<CorpTokenResponse> corpToken(CorpTokenRequest request);

    CompletableFuture<CostCenterDeleteResponse> costCenterDelete(CostCenterDeleteRequest request);

    CompletableFuture<CostCenterModifyResponse> costCenterModify(CostCenterModifyRequest request);

    CompletableFuture<CostCenterQueryResponse> costCenterQuery(CostCenterQueryRequest request);

    CompletableFuture<CostCenterSaveResponse> costCenterSave(CostCenterSaveRequest request);

    CompletableFuture<CreateSubCorpResponse> createSubCorp(CreateSubCorpRequest request);

    CompletableFuture<DeleteInvoiceEntityResponse> deleteInvoiceEntity(DeleteInvoiceEntityRequest request);

    CompletableFuture<DepartmentSaveResponse> departmentSave(DepartmentSaveRequest request);

    CompletableFuture<EntityAddResponse> entityAdd(EntityAddRequest request);

    CompletableFuture<EntityDeleteResponse> entityDelete(EntityDeleteRequest request);

    CompletableFuture<EntitySetResponse> entitySet(EntitySetRequest request);

    CompletableFuture<EstimatedPriceQueryResponse> estimatedPriceQuery(EstimatedPriceQueryRequest request);

    CompletableFuture<ExceedApplySyncResponse> exceedApplySync(ExceedApplySyncRequest request);

    CompletableFuture<FlightBillSettlementQueryResponse> flightBillSettlementQuery(FlightBillSettlementQueryRequest request);

    CompletableFuture<FlightCancelOrderResponse> flightCancelOrder(FlightCancelOrderRequest request);

    CompletableFuture<FlightCancelOrderV2Response> flightCancelOrderV2(FlightCancelOrderV2Request request);

    CompletableFuture<FlightCreateOrderResponse> flightCreateOrder(FlightCreateOrderRequest request);

    CompletableFuture<FlightCreateOrderV2Response> flightCreateOrderV2(FlightCreateOrderV2Request request);

    CompletableFuture<FlightExceedApplyQueryResponse> flightExceedApplyQuery(FlightExceedApplyQueryRequest request);

    CompletableFuture<FlightItineraryScanQueryResponse> flightItineraryScanQuery(FlightItineraryScanQueryRequest request);

    CompletableFuture<FlightListingSearchResponse> flightListingSearch(FlightListingSearchRequest request);

    CompletableFuture<FlightListingSearchV2Response> flightListingSearchV2(FlightListingSearchV2Request request);

    CompletableFuture<FlightModifyApplyV2Response> flightModifyApplyV2(FlightModifyApplyV2Request request);

    CompletableFuture<FlightModifyCancelV2Response> flightModifyCancelV2(FlightModifyCancelV2Request request);

    CompletableFuture<FlightModifyListingSearchV2Response> flightModifyListingSearchV2(FlightModifyListingSearchV2Request request);

    CompletableFuture<FlightModifyOrderDetailV2Response> flightModifyOrderDetailV2(FlightModifyOrderDetailV2Request request);

    CompletableFuture<FlightModifyOtaSearchV2Response> flightModifyOtaSearchV2(FlightModifyOtaSearchV2Request request);

    CompletableFuture<FlightModifyPayV2Response> flightModifyPayV2(FlightModifyPayV2Request request);

    CompletableFuture<FlightOrderDetailInfoResponse> flightOrderDetailInfo(FlightOrderDetailInfoRequest request);

    CompletableFuture<FlightOrderDetailV2Response> flightOrderDetailV2(FlightOrderDetailV2Request request);

    CompletableFuture<FlightOrderListQueryResponse> flightOrderListQuery(FlightOrderListQueryRequest request);

    CompletableFuture<FlightOrderQueryResponse> flightOrderQuery(FlightOrderQueryRequest request);

    CompletableFuture<FlightOtaItemDetailResponse> flightOtaItemDetail(FlightOtaItemDetailRequest request);

    CompletableFuture<FlightOtaSearchResponse> flightOtaSearch(FlightOtaSearchRequest request);

    CompletableFuture<FlightOtaSearchV2Response> flightOtaSearchV2(FlightOtaSearchV2Request request);

    CompletableFuture<FlightPayOrderResponse> flightPayOrder(FlightPayOrderRequest request);

    CompletableFuture<FlightPayOrderV2Response> flightPayOrderV2(FlightPayOrderV2Request request);

    CompletableFuture<FlightRefundApplyResponse> flightRefundApply(FlightRefundApplyRequest request);

    CompletableFuture<FlightRefundApplyV2Response> flightRefundApplyV2(FlightRefundApplyV2Request request);

    CompletableFuture<FlightRefundDetailResponse> flightRefundDetail(FlightRefundDetailRequest request);

    CompletableFuture<FlightRefundDetailV2Response> flightRefundDetailV2(FlightRefundDetailV2Request request);

    CompletableFuture<FlightRefundPreCalResponse> flightRefundPreCal(FlightRefundPreCalRequest request);

    CompletableFuture<FlightRefundPreCalV2Response> flightRefundPreCalV2(FlightRefundPreCalV2Request request);

    CompletableFuture<FlightSearchListResponse> flightSearchList(FlightSearchListRequest request);

    CompletableFuture<GroupCorpTokenResponse> groupCorpToken(GroupCorpTokenRequest request);

    CompletableFuture<GroupDepartSaveResponse> groupDepartSave(GroupDepartSaveRequest request);

    CompletableFuture<GroupUserSaveResponse> groupUserSave(GroupUserSaveRequest request);

    CompletableFuture<HotelAskingPriceResponse> hotelAskingPrice(HotelAskingPriceRequest request);

    CompletableFuture<HotelBillSettlementQueryResponse> hotelBillSettlementQuery(HotelBillSettlementQueryRequest request);

    CompletableFuture<HotelCityCodeListResponse> hotelCityCodeList(HotelCityCodeListRequest request);

    CompletableFuture<HotelExceedApplyQueryResponse> hotelExceedApplyQuery(HotelExceedApplyQueryRequest request);

    CompletableFuture<HotelGoodsQueryResponse> hotelGoodsQuery(HotelGoodsQueryRequest request);

    CompletableFuture<HotelIndexInfoResponse> hotelIndexInfo(HotelIndexInfoRequest request);

    CompletableFuture<HotelOrderCancelResponse> hotelOrderCancel(HotelOrderCancelRequest request);

    CompletableFuture<HotelOrderCreateResponse> hotelOrderCreate(HotelOrderCreateRequest request);

    CompletableFuture<HotelOrderDetailInfoResponse> hotelOrderDetailInfo(HotelOrderDetailInfoRequest request);

    CompletableFuture<HotelOrderListQueryResponse> hotelOrderListQuery(HotelOrderListQueryRequest request);

    CompletableFuture<HotelOrderPayResponse> hotelOrderPay(HotelOrderPayRequest request);

    CompletableFuture<HotelOrderPreValidateResponse> hotelOrderPreValidate(HotelOrderPreValidateRequest request);

    CompletableFuture<HotelOrderQueryResponse> hotelOrderQuery(HotelOrderQueryRequest request);

    CompletableFuture<HotelPricePullResponse> hotelPricePull(HotelPricePullRequest request);

    CompletableFuture<HotelRoomInfoResponse> hotelRoomInfo(HotelRoomInfoRequest request);

    CompletableFuture<HotelSearchResponse> hotelSearch(HotelSearchRequest request);

    CompletableFuture<HotelStaticInfoResponse> hotelStaticInfo(HotelStaticInfoRequest request);

    CompletableFuture<IeFlightBillSettlementQueryResponse> ieFlightBillSettlementQuery(IeFlightBillSettlementQueryRequest request);

    CompletableFuture<IeHotelBillSettlementQueryResponse> ieHotelBillSettlementQuery(IeHotelBillSettlementQueryRequest request);

    CompletableFuture<InsInvoiceScanQueryResponse> insInvoiceScanQuery(InsInvoiceScanQueryRequest request);

    CompletableFuture<InsureOrderApplyResponse> insureOrderApply(InsureOrderApplyRequest request);

    CompletableFuture<InsureOrderCancelResponse> insureOrderCancel(InsureOrderCancelRequest request);

    CompletableFuture<InsureOrderCreateResponse> insureOrderCreate(InsureOrderCreateRequest request);

    CompletableFuture<InsureOrderDetailResponse> insureOrderDetail(InsureOrderDetailRequest request);

    CompletableFuture<InsureOrderPayResponse> insureOrderPay(InsureOrderPayRequest request);

    CompletableFuture<InsureOrderRefundResponse> insureOrderRefund(InsureOrderRefundRequest request);

    CompletableFuture<InsureOrderUrlDetailResponse> insureOrderUrlDetail(InsureOrderUrlDetailRequest request);

    CompletableFuture<InsureRefundDetailResponse> insureRefundDetail(InsureRefundDetailRequest request);

    CompletableFuture<IntlFlightListingSearchResponse> intlFlightListingSearch(IntlFlightListingSearchRequest request);

    CompletableFuture<IntlFlightOtaItemDetailResponse> intlFlightOtaItemDetail(IntlFlightOtaItemDetailRequest request);

    CompletableFuture<IntlFlightOtaSearchResponse> intlFlightOtaSearch(IntlFlightOtaSearchRequest request);

    CompletableFuture<InvoiceAddResponse> invoiceAdd(InvoiceAddRequest request);

    CompletableFuture<InvoiceDeleteResponse> invoiceDelete(InvoiceDeleteRequest request);

    CompletableFuture<InvoiceModifyResponse> invoiceModify(InvoiceModifyRequest request);

    CompletableFuture<InvoiceRuleAddResponse> invoiceRuleAdd(InvoiceRuleAddRequest request);

    CompletableFuture<InvoiceRuleDeleteResponse> invoiceRuleDelete(InvoiceRuleDeleteRequest request);

    CompletableFuture<InvoiceRuleSaveResponse> invoiceRuleSave(InvoiceRuleSaveRequest request);

    CompletableFuture<InvoiceSearchResponse> invoiceSearch(InvoiceSearchRequest request);

    CompletableFuture<IsvRuleSaveResponse> isvRuleSave(IsvRuleSaveRequest request);

    CompletableFuture<IsvUserSaveResponse> isvUserSave(IsvUserSaveRequest request);

    CompletableFuture<MonthBillConfirmResponse> monthBillConfirm(MonthBillConfirmRequest request);

    CompletableFuture<MonthBillGetResponse> monthBillGet(MonthBillGetRequest request);

    CompletableFuture<ProjectAddResponse> projectAdd(ProjectAddRequest request);

    CompletableFuture<ProjectDeleteResponse> projectDelete(ProjectDeleteRequest request);

    CompletableFuture<ProjectModifyResponse> projectModify(ProjectModifyRequest request);

    CompletableFuture<QueryReimbursementOrderResponse> queryReimbursementOrder(QueryReimbursementOrderRequest request);

    CompletableFuture<SyncSingleUserResponse> syncSingleUser(SyncSingleUserRequest request);

    CompletableFuture<SyncThirdUserMappingResponse> syncThirdUserMapping(SyncThirdUserMappingRequest request);

    CompletableFuture<TBAccountInfoQueryResponse> tBAccountInfoQuery(TBAccountInfoQueryRequest request);

    CompletableFuture<TBAccountUnbindResponse> tBAccountUnbind(TBAccountUnbindRequest request);

    CompletableFuture<TicketChangingApplyResponse> ticketChangingApply(TicketChangingApplyRequest request);

    CompletableFuture<TicketChangingCancelResponse> ticketChangingCancel(TicketChangingCancelRequest request);

    CompletableFuture<TicketChangingDetailResponse> ticketChangingDetail(TicketChangingDetailRequest request);

    CompletableFuture<TicketChangingEnquiryResponse> ticketChangingEnquiry(TicketChangingEnquiryRequest request);

    CompletableFuture<TicketChangingFlightListResponse> ticketChangingFlightList(TicketChangingFlightListRequest request);

    CompletableFuture<TicketChangingPayResponse> ticketChangingPay(TicketChangingPayRequest request);

    CompletableFuture<TrainBillSettlementQueryResponse> trainBillSettlementQuery(TrainBillSettlementQueryRequest request);

    CompletableFuture<TrainExceedApplyQueryResponse> trainExceedApplyQuery(TrainExceedApplyQueryRequest request);

    CompletableFuture<TrainOrderListQueryResponse> trainOrderListQuery(TrainOrderListQueryRequest request);

    CompletableFuture<TrainOrderQueryResponse> trainOrderQuery(TrainOrderQueryRequest request);

    CompletableFuture<TrainOrderQueryV2Response> trainOrderQueryV2(TrainOrderQueryV2Request request);

    CompletableFuture<TrainStationSearchResponse> trainStationSearch(TrainStationSearchRequest request);

    CompletableFuture<TrainTicketScanQueryResponse> trainTicketScanQuery(TrainTicketScanQueryRequest request);

    CompletableFuture<UserQueryResponse> userQuery(UserQueryRequest request);

    CompletableFuture<VatInvoiceScanQueryResponse> vatInvoiceScanQuery(VatInvoiceScanQueryRequest request);

    CompletableFuture<WaitApplyInvoiceTaskDetailQueryResponse> waitApplyInvoiceTaskDetailQuery(WaitApplyInvoiceTaskDetailQueryRequest request);

}
