// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.btripopen20220520.models.*;
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
     * @param request the request parameters of AccessToken  AccessTokenRequest
     * @return AccessTokenResponse
     */
    CompletableFuture<AccessTokenResponse> accessToken(AccessTokenRequest request);

    /**
     * @param request the request parameters of AddDepartment  AddDepartmentRequest
     * @return AddDepartmentResponse
     */
    CompletableFuture<AddDepartmentResponse> addDepartment(AddDepartmentRequest request);

    /**
     * @param request the request parameters of AddEmployee  AddEmployeeRequest
     * @return AddEmployeeResponse
     */
    CompletableFuture<AddEmployeeResponse> addEmployee(AddEmployeeRequest request);

    /**
     * @param request the request parameters of AddEmployeesToCustomRole  AddEmployeesToCustomRoleRequest
     * @return AddEmployeesToCustomRoleResponse
     */
    CompletableFuture<AddEmployeesToCustomRoleResponse> addEmployeesToCustomRole(AddEmployeesToCustomRoleRequest request);

    /**
     * @param request the request parameters of AddInvoiceEntity  AddInvoiceEntityRequest
     * @return AddInvoiceEntityResponse
     */
    CompletableFuture<AddInvoiceEntityResponse> addInvoiceEntity(AddInvoiceEntityRequest request);

    /**
     * @param request the request parameters of AddressGet  AddressGetRequest
     * @return AddressGetResponse
     */
    CompletableFuture<AddressGetResponse> addressGet(AddressGetRequest request);

    /**
     * @param request the request parameters of AirportSearch  AirportSearchRequest
     * @return AirportSearchResponse
     */
    CompletableFuture<AirportSearchResponse> airportSearch(AirportSearchRequest request);

    /**
     * @param request the request parameters of AllBaseCityInfoQuery  AllBaseCityInfoQueryRequest
     * @return AllBaseCityInfoQueryResponse
     */
    CompletableFuture<AllBaseCityInfoQueryResponse> allBaseCityInfoQuery(AllBaseCityInfoQueryRequest request);

    /**
     * @param request the request parameters of ApplyAdd  ApplyAddRequest
     * @return ApplyAddResponse
     */
    CompletableFuture<ApplyAddResponse> applyAdd(ApplyAddRequest request);

    /**
     * @param request the request parameters of ApplyApprove  ApplyApproveRequest
     * @return ApplyApproveResponse
     */
    CompletableFuture<ApplyApproveResponse> applyApprove(ApplyApproveRequest request);

    /**
     * @param request the request parameters of ApplyExternalNodeStatusUpdate  ApplyExternalNodeStatusUpdateRequest
     * @return ApplyExternalNodeStatusUpdateResponse
     */
    CompletableFuture<ApplyExternalNodeStatusUpdateResponse> applyExternalNodeStatusUpdate(ApplyExternalNodeStatusUpdateRequest request);

    /**
     * @param request the request parameters of ApplyInvoiceTask  ApplyInvoiceTaskRequest
     * @return ApplyInvoiceTaskResponse
     */
    CompletableFuture<ApplyInvoiceTaskResponse> applyInvoiceTask(ApplyInvoiceTaskRequest request);

    /**
     * @param request the request parameters of ApplyListQuery  ApplyListQueryRequest
     * @return ApplyListQueryResponse
     */
    CompletableFuture<ApplyListQueryResponse> applyListQuery(ApplyListQueryRequest request);

    /**
     * @param request the request parameters of ApplyModify  ApplyModifyRequest
     * @return ApplyModifyResponse
     */
    CompletableFuture<ApplyModifyResponse> applyModify(ApplyModifyRequest request);

    /**
     * @param request the request parameters of ApplyQuery  ApplyQueryRequest
     * @return ApplyQueryResponse
     */
    CompletableFuture<ApplyQueryResponse> applyQuery(ApplyQueryRequest request);

    /**
     * @param request the request parameters of ApplyTripTaskExecute  ApplyTripTaskExecuteRequest
     * @return ApplyTripTaskExecuteResponse
     */
    CompletableFuture<ApplyTripTaskExecuteResponse> applyTripTaskExecute(ApplyTripTaskExecuteRequest request);

    /**
     * @param request the request parameters of BaseCityInfoSearch  BaseCityInfoSearchRequest
     * @return BaseCityInfoSearchResponse
     */
    CompletableFuture<BaseCityInfoSearchResponse> baseCityInfoSearch(BaseCityInfoSearchRequest request);

    /**
     * @param request the request parameters of BtripBillInfoAdjust  BtripBillInfoAdjustRequest
     * @return BtripBillInfoAdjustResponse
     */
    CompletableFuture<BtripBillInfoAdjustResponse> btripBillInfoAdjust(BtripBillInfoAdjustRequest request);

    /**
     * @param request the request parameters of CarApplyAdd  CarApplyAddRequest
     * @return CarApplyAddResponse
     */
    CompletableFuture<CarApplyAddResponse> carApplyAdd(CarApplyAddRequest request);

    /**
     * @param request the request parameters of CarApplyModify  CarApplyModifyRequest
     * @return CarApplyModifyResponse
     */
    CompletableFuture<CarApplyModifyResponse> carApplyModify(CarApplyModifyRequest request);

    /**
     * @param request the request parameters of CarApplyQuery  CarApplyQueryRequest
     * @return CarApplyQueryResponse
     */
    CompletableFuture<CarApplyQueryResponse> carApplyQuery(CarApplyQueryRequest request);

    /**
     * @param request the request parameters of CarBillSettlementQuery  CarBillSettlementQueryRequest
     * @return CarBillSettlementQueryResponse
     */
    CompletableFuture<CarBillSettlementQueryResponse> carBillSettlementQuery(CarBillSettlementQueryRequest request);

    /**
     * @param request the request parameters of CarOrderListQuery  CarOrderListQueryRequest
     * @return CarOrderListQueryResponse
     */
    CompletableFuture<CarOrderListQueryResponse> carOrderListQuery(CarOrderListQueryRequest request);

    /**
     * @param request the request parameters of CarOrderQuery  CarOrderQueryRequest
     * @return CarOrderQueryResponse
     */
    CompletableFuture<CarOrderQueryResponse> carOrderQuery(CarOrderQueryRequest request);

    /**
     * @param request the request parameters of CarSceneQuery  CarSceneQueryRequest
     * @return CarSceneQueryResponse
     */
    CompletableFuture<CarSceneQueryResponse> carSceneQuery(CarSceneQueryRequest request);

    /**
     * @param request the request parameters of ChannelCorpCreate  ChannelCorpCreateRequest
     * @return ChannelCorpCreateResponse
     */
    CompletableFuture<ChannelCorpCreateResponse> channelCorpCreate(ChannelCorpCreateRequest request);

    /**
     * @param request the request parameters of CitySearch  CitySearchRequest
     * @return CitySearchResponse
     */
    CompletableFuture<CitySearchResponse> citySearch(CitySearchRequest request);

    /**
     * @param request the request parameters of CommonApplyQuery  CommonApplyQueryRequest
     * @return CommonApplyQueryResponse
     */
    CompletableFuture<CommonApplyQueryResponse> commonApplyQuery(CommonApplyQueryRequest request);

    /**
     * @param request the request parameters of CommonApplySync  CommonApplySyncRequest
     * @return CommonApplySyncResponse
     */
    CompletableFuture<CommonApplySyncResponse> commonApplySync(CommonApplySyncRequest request);

    /**
     * @param request the request parameters of CooperatorFlightBillSettlementQuery  CooperatorFlightBillSettlementQueryRequest
     * @return CooperatorFlightBillSettlementQueryResponse
     */
    CompletableFuture<CooperatorFlightBillSettlementQueryResponse> cooperatorFlightBillSettlementQuery(CooperatorFlightBillSettlementQueryRequest request);

    /**
     * @param request the request parameters of CooperatorHotelBillSettlementQuery  CooperatorHotelBillSettlementQueryRequest
     * @return CooperatorHotelBillSettlementQueryResponse
     */
    CompletableFuture<CooperatorHotelBillSettlementQueryResponse> cooperatorHotelBillSettlementQuery(CooperatorHotelBillSettlementQueryRequest request);

    /**
     * @param request the request parameters of CooperatorHotelEventPush  CooperatorHotelEventPushRequest
     * @return CooperatorHotelEventPushResponse
     */
    CompletableFuture<CooperatorHotelEventPushResponse> cooperatorHotelEventPush(CooperatorHotelEventPushRequest request);

    /**
     * @param request the request parameters of CooperatorSyncPayStatus  CooperatorSyncPayStatusRequest
     * @return CooperatorSyncPayStatusResponse
     */
    CompletableFuture<CooperatorSyncPayStatusResponse> cooperatorSyncPayStatus(CooperatorSyncPayStatusRequest request);

    /**
     * @param request the request parameters of CorpAuthLinkInfoQuery  CorpAuthLinkInfoQueryRequest
     * @return CorpAuthLinkInfoQueryResponse
     */
    CompletableFuture<CorpAuthLinkInfoQueryResponse> corpAuthLinkInfoQuery(CorpAuthLinkInfoQueryRequest request);

    /**
     * @param request the request parameters of CorpToken  CorpTokenRequest
     * @return CorpTokenResponse
     */
    CompletableFuture<CorpTokenResponse> corpToken(CorpTokenRequest request);

    /**
     * @param request the request parameters of CostCenterDelete  CostCenterDeleteRequest
     * @return CostCenterDeleteResponse
     */
    CompletableFuture<CostCenterDeleteResponse> costCenterDelete(CostCenterDeleteRequest request);

    /**
     * @param request the request parameters of CostCenterModify  CostCenterModifyRequest
     * @return CostCenterModifyResponse
     */
    CompletableFuture<CostCenterModifyResponse> costCenterModify(CostCenterModifyRequest request);

    /**
     * @param request the request parameters of CostCenterQuery  CostCenterQueryRequest
     * @return CostCenterQueryResponse
     */
    CompletableFuture<CostCenterQueryResponse> costCenterQuery(CostCenterQueryRequest request);

    /**
     * @param request the request parameters of CostCenterSave  CostCenterSaveRequest
     * @return CostCenterSaveResponse
     */
    CompletableFuture<CostCenterSaveResponse> costCenterSave(CostCenterSaveRequest request);

    /**
     * @param request the request parameters of CreateCustomRole  CreateCustomRoleRequest
     * @return CreateCustomRoleResponse
     */
    CompletableFuture<CreateCustomRoleResponse> createCustomRole(CreateCustomRoleRequest request);

    /**
     * @param request the request parameters of CreateSubCorp  CreateSubCorpRequest
     * @return CreateSubCorpResponse
     */
    CompletableFuture<CreateSubCorpResponse> createSubCorp(CreateSubCorpRequest request);

    /**
     * @param request the request parameters of DeleteCustomRole  DeleteCustomRoleRequest
     * @return DeleteCustomRoleResponse
     */
    CompletableFuture<DeleteCustomRoleResponse> deleteCustomRole(DeleteCustomRoleRequest request);

    /**
     * @param request the request parameters of DeleteDepartment  DeleteDepartmentRequest
     * @return DeleteDepartmentResponse
     */
    CompletableFuture<DeleteDepartmentResponse> deleteDepartment(DeleteDepartmentRequest request);

    /**
     * @param request the request parameters of DeleteEmployeesFromCustomRole  DeleteEmployeesFromCustomRoleRequest
     * @return DeleteEmployeesFromCustomRoleResponse
     */
    CompletableFuture<DeleteEmployeesFromCustomRoleResponse> deleteEmployeesFromCustomRole(DeleteEmployeesFromCustomRoleRequest request);

    /**
     * @param request the request parameters of DeleteInvoiceEntity  DeleteInvoiceEntityRequest
     * @return DeleteInvoiceEntityResponse
     */
    CompletableFuture<DeleteInvoiceEntityResponse> deleteInvoiceEntity(DeleteInvoiceEntityRequest request);

    /**
     * @param request the request parameters of DepartmentSave  DepartmentSaveRequest
     * @return DepartmentSaveResponse
     */
    CompletableFuture<DepartmentSaveResponse> departmentSave(DepartmentSaveRequest request);

    /**
     * @param request the request parameters of ElectronicItineraryBatchApply  ElectronicItineraryBatchApplyRequest
     * @return ElectronicItineraryBatchApplyResponse
     */
    CompletableFuture<ElectronicItineraryBatchApplyResponse> electronicItineraryBatchApply(ElectronicItineraryBatchApplyRequest request);

    /**
     * @param request the request parameters of ElectronicItineraryGetApplyResult  ElectronicItineraryGetApplyResultRequest
     * @return ElectronicItineraryGetApplyResultResponse
     */
    CompletableFuture<ElectronicItineraryGetApplyResultResponse> electronicItineraryGetApplyResult(ElectronicItineraryGetApplyResultRequest request);

    /**
     * @param request the request parameters of EntityAdd  EntityAddRequest
     * @return EntityAddResponse
     */
    CompletableFuture<EntityAddResponse> entityAdd(EntityAddRequest request);

    /**
     * @param request the request parameters of EntityDelete  EntityDeleteRequest
     * @return EntityDeleteResponse
     */
    CompletableFuture<EntityDeleteResponse> entityDelete(EntityDeleteRequest request);

    /**
     * @param request the request parameters of EntitySet  EntitySetRequest
     * @return EntitySetResponse
     */
    CompletableFuture<EntitySetResponse> entitySet(EntitySetRequest request);

    /**
     * @param request the request parameters of EstimatedPriceQuery  EstimatedPriceQueryRequest
     * @return EstimatedPriceQueryResponse
     */
    CompletableFuture<EstimatedPriceQueryResponse> estimatedPriceQuery(EstimatedPriceQueryRequest request);

    /**
     * @param request the request parameters of ExceedApplySync  ExceedApplySyncRequest
     * @return ExceedApplySyncResponse
     */
    CompletableFuture<ExceedApplySyncResponse> exceedApplySync(ExceedApplySyncRequest request);

    /**
     * @param request the request parameters of ExternalUserAdd  ExternalUserAddRequest
     * @return ExternalUserAddResponse
     */
    CompletableFuture<ExternalUserAddResponse> externalUserAdd(ExternalUserAddRequest request);

    /**
     * @param request the request parameters of ExternalUserDelete  ExternalUserDeleteRequest
     * @return ExternalUserDeleteResponse
     */
    CompletableFuture<ExternalUserDeleteResponse> externalUserDelete(ExternalUserDeleteRequest request);

    /**
     * @param request the request parameters of ExternalUserQuery  ExternalUserQueryRequest
     * @return ExternalUserQueryResponse
     */
    CompletableFuture<ExternalUserQueryResponse> externalUserQuery(ExternalUserQueryRequest request);

    /**
     * @param request the request parameters of ExternalUserUpdate  ExternalUserUpdateRequest
     * @return ExternalUserUpdateResponse
     */
    CompletableFuture<ExternalUserUpdateResponse> externalUserUpdate(ExternalUserUpdateRequest request);

    /**
     * @param request the request parameters of FlightBillSettlementQuery  FlightBillSettlementQueryRequest
     * @return FlightBillSettlementQueryResponse
     */
    CompletableFuture<FlightBillSettlementQueryResponse> flightBillSettlementQuery(FlightBillSettlementQueryRequest request);

    /**
     * @param request the request parameters of FlightCancelOrder  FlightCancelOrderRequest
     * @return FlightCancelOrderResponse
     */
    CompletableFuture<FlightCancelOrderResponse> flightCancelOrder(FlightCancelOrderRequest request);

    /**
     * @param request the request parameters of FlightCancelOrderV2  FlightCancelOrderV2Request
     * @return FlightCancelOrderV2Response
     */
    CompletableFuture<FlightCancelOrderV2Response> flightCancelOrderV2(FlightCancelOrderV2Request request);

    /**
     * @param request the request parameters of FlightCreateOrder  FlightCreateOrderRequest
     * @return FlightCreateOrderResponse
     */
    CompletableFuture<FlightCreateOrderResponse> flightCreateOrder(FlightCreateOrderRequest request);

    /**
     * @param request the request parameters of FlightCreateOrderV2  FlightCreateOrderV2Request
     * @return FlightCreateOrderV2Response
     */
    CompletableFuture<FlightCreateOrderV2Response> flightCreateOrderV2(FlightCreateOrderV2Request request);

    /**
     * @param request the request parameters of FlightExceedApplyQuery  FlightExceedApplyQueryRequest
     * @return FlightExceedApplyQueryResponse
     */
    CompletableFuture<FlightExceedApplyQueryResponse> flightExceedApplyQuery(FlightExceedApplyQueryRequest request);

    /**
     * @param request the request parameters of FlightItineraryScanQuery  FlightItineraryScanQueryRequest
     * @return FlightItineraryScanQueryResponse
     */
    CompletableFuture<FlightItineraryScanQueryResponse> flightItineraryScanQuery(FlightItineraryScanQueryRequest request);

    /**
     * @param request the request parameters of FlightListingSearch  FlightListingSearchRequest
     * @return FlightListingSearchResponse
     */
    CompletableFuture<FlightListingSearchResponse> flightListingSearch(FlightListingSearchRequest request);

    /**
     * @param request the request parameters of FlightListingSearchV2  FlightListingSearchV2Request
     * @return FlightListingSearchV2Response
     */
    CompletableFuture<FlightListingSearchV2Response> flightListingSearchV2(FlightListingSearchV2Request request);

    /**
     * @param request the request parameters of FlightModifyApplyV2  FlightModifyApplyV2Request
     * @return FlightModifyApplyV2Response
     */
    CompletableFuture<FlightModifyApplyV2Response> flightModifyApplyV2(FlightModifyApplyV2Request request);

    /**
     * @param request the request parameters of FlightModifyCancelV2  FlightModifyCancelV2Request
     * @return FlightModifyCancelV2Response
     */
    CompletableFuture<FlightModifyCancelV2Response> flightModifyCancelV2(FlightModifyCancelV2Request request);

    /**
     * @param request the request parameters of FlightModifyListingSearchV2  FlightModifyListingSearchV2Request
     * @return FlightModifyListingSearchV2Response
     */
    CompletableFuture<FlightModifyListingSearchV2Response> flightModifyListingSearchV2(FlightModifyListingSearchV2Request request);

    /**
     * @param request the request parameters of FlightModifyOrderDetailV2  FlightModifyOrderDetailV2Request
     * @return FlightModifyOrderDetailV2Response
     */
    CompletableFuture<FlightModifyOrderDetailV2Response> flightModifyOrderDetailV2(FlightModifyOrderDetailV2Request request);

    /**
     * @param request the request parameters of FlightModifyOtaSearchV2  FlightModifyOtaSearchV2Request
     * @return FlightModifyOtaSearchV2Response
     */
    CompletableFuture<FlightModifyOtaSearchV2Response> flightModifyOtaSearchV2(FlightModifyOtaSearchV2Request request);

    /**
     * @param request the request parameters of FlightModifyPayV2  FlightModifyPayV2Request
     * @return FlightModifyPayV2Response
     */
    CompletableFuture<FlightModifyPayV2Response> flightModifyPayV2(FlightModifyPayV2Request request);

    /**
     * @param request the request parameters of FlightOrderDetailInfo  FlightOrderDetailInfoRequest
     * @return FlightOrderDetailInfoResponse
     */
    CompletableFuture<FlightOrderDetailInfoResponse> flightOrderDetailInfo(FlightOrderDetailInfoRequest request);

    /**
     * @param request the request parameters of FlightOrderDetailV2  FlightOrderDetailV2Request
     * @return FlightOrderDetailV2Response
     */
    CompletableFuture<FlightOrderDetailV2Response> flightOrderDetailV2(FlightOrderDetailV2Request request);

    /**
     * @param request the request parameters of FlightOrderListQuery  FlightOrderListQueryRequest
     * @return FlightOrderListQueryResponse
     */
    CompletableFuture<FlightOrderListQueryResponse> flightOrderListQuery(FlightOrderListQueryRequest request);

    /**
     * @param request the request parameters of FlightOrderListQueryV2  FlightOrderListQueryV2Request
     * @return FlightOrderListQueryV2Response
     */
    CompletableFuture<FlightOrderListQueryV2Response> flightOrderListQueryV2(FlightOrderListQueryV2Request request);

    /**
     * @param request the request parameters of FlightOrderQuery  FlightOrderQueryRequest
     * @return FlightOrderQueryResponse
     */
    CompletableFuture<FlightOrderQueryResponse> flightOrderQuery(FlightOrderQueryRequest request);

    /**
     * @param request the request parameters of FlightOtaItemDetail  FlightOtaItemDetailRequest
     * @return FlightOtaItemDetailResponse
     */
    CompletableFuture<FlightOtaItemDetailResponse> flightOtaItemDetail(FlightOtaItemDetailRequest request);

    /**
     * @param request the request parameters of FlightOtaSearch  FlightOtaSearchRequest
     * @return FlightOtaSearchResponse
     */
    CompletableFuture<FlightOtaSearchResponse> flightOtaSearch(FlightOtaSearchRequest request);

    /**
     * @param request the request parameters of FlightOtaSearchV2  FlightOtaSearchV2Request
     * @return FlightOtaSearchV2Response
     */
    CompletableFuture<FlightOtaSearchV2Response> flightOtaSearchV2(FlightOtaSearchV2Request request);

    /**
     * @param request the request parameters of FlightPayOrder  FlightPayOrderRequest
     * @return FlightPayOrderResponse
     */
    CompletableFuture<FlightPayOrderResponse> flightPayOrder(FlightPayOrderRequest request);

    /**
     * @param request the request parameters of FlightPayOrderV2  FlightPayOrderV2Request
     * @return FlightPayOrderV2Response
     */
    CompletableFuture<FlightPayOrderV2Response> flightPayOrderV2(FlightPayOrderV2Request request);

    /**
     * @param request the request parameters of FlightRefundApply  FlightRefundApplyRequest
     * @return FlightRefundApplyResponse
     */
    CompletableFuture<FlightRefundApplyResponse> flightRefundApply(FlightRefundApplyRequest request);

    /**
     * @param request the request parameters of FlightRefundApplyV2  FlightRefundApplyV2Request
     * @return FlightRefundApplyV2Response
     */
    CompletableFuture<FlightRefundApplyV2Response> flightRefundApplyV2(FlightRefundApplyV2Request request);

    /**
     * @param request the request parameters of FlightRefundDetail  FlightRefundDetailRequest
     * @return FlightRefundDetailResponse
     */
    CompletableFuture<FlightRefundDetailResponse> flightRefundDetail(FlightRefundDetailRequest request);

    /**
     * @param request the request parameters of FlightRefundDetailV2  FlightRefundDetailV2Request
     * @return FlightRefundDetailV2Response
     */
    CompletableFuture<FlightRefundDetailV2Response> flightRefundDetailV2(FlightRefundDetailV2Request request);

    /**
     * @param request the request parameters of FlightRefundPreCal  FlightRefundPreCalRequest
     * @return FlightRefundPreCalResponse
     */
    CompletableFuture<FlightRefundPreCalResponse> flightRefundPreCal(FlightRefundPreCalRequest request);

    /**
     * @param request the request parameters of FlightRefundPreCalV2  FlightRefundPreCalV2Request
     * @return FlightRefundPreCalV2Response
     */
    CompletableFuture<FlightRefundPreCalV2Response> flightRefundPreCalV2(FlightRefundPreCalV2Request request);

    /**
     * @param request the request parameters of FlightSearchList  FlightSearchListRequest
     * @return FlightSearchListResponse
     */
    CompletableFuture<FlightSearchListResponse> flightSearchList(FlightSearchListRequest request);

    /**
     * @param request the request parameters of FuPointBillSettlementQuery  FuPointBillSettlementQueryRequest
     * @return FuPointBillSettlementQueryResponse
     */
    CompletableFuture<FuPointBillSettlementQueryResponse> fuPointBillSettlementQuery(FuPointBillSettlementQueryRequest request);

    /**
     * @param request the request parameters of GroupCorpToken  GroupCorpTokenRequest
     * @return GroupCorpTokenResponse
     */
    CompletableFuture<GroupCorpTokenResponse> groupCorpToken(GroupCorpTokenRequest request);

    /**
     * @param request the request parameters of GroupDepartSave  GroupDepartSaveRequest
     * @return GroupDepartSaveResponse
     */
    CompletableFuture<GroupDepartSaveResponse> groupDepartSave(GroupDepartSaveRequest request);

    /**
     * @param request the request parameters of GroupUserSave  GroupUserSaveRequest
     * @return GroupUserSaveResponse
     */
    CompletableFuture<GroupUserSaveResponse> groupUserSave(GroupUserSaveRequest request);

    /**
     * @param request the request parameters of HotelAskingPrice  HotelAskingPriceRequest
     * @return HotelAskingPriceResponse
     */
    CompletableFuture<HotelAskingPriceResponse> hotelAskingPrice(HotelAskingPriceRequest request);

    /**
     * @param request the request parameters of HotelBillSettlementQuery  HotelBillSettlementQueryRequest
     * @return HotelBillSettlementQueryResponse
     */
    CompletableFuture<HotelBillSettlementQueryResponse> hotelBillSettlementQuery(HotelBillSettlementQueryRequest request);

    /**
     * @param request the request parameters of HotelCityCodeList  HotelCityCodeListRequest
     * @return HotelCityCodeListResponse
     */
    CompletableFuture<HotelCityCodeListResponse> hotelCityCodeList(HotelCityCodeListRequest request);

    /**
     * @param request the request parameters of HotelExceedApplyQuery  HotelExceedApplyQueryRequest
     * @return HotelExceedApplyQueryResponse
     */
    CompletableFuture<HotelExceedApplyQueryResponse> hotelExceedApplyQuery(HotelExceedApplyQueryRequest request);

    /**
     * @param request the request parameters of HotelGoodsQuery  HotelGoodsQueryRequest
     * @return HotelGoodsQueryResponse
     */
    CompletableFuture<HotelGoodsQueryResponse> hotelGoodsQuery(HotelGoodsQueryRequest request);

    /**
     * @param request the request parameters of HotelIndexInfo  HotelIndexInfoRequest
     * @return HotelIndexInfoResponse
     */
    CompletableFuture<HotelIndexInfoResponse> hotelIndexInfo(HotelIndexInfoRequest request);

    /**
     * @param request the request parameters of HotelOrderCancel  HotelOrderCancelRequest
     * @return HotelOrderCancelResponse
     */
    CompletableFuture<HotelOrderCancelResponse> hotelOrderCancel(HotelOrderCancelRequest request);

    /**
     * @param request the request parameters of HotelOrderChangeApply  HotelOrderChangeApplyRequest
     * @return HotelOrderChangeApplyResponse
     */
    CompletableFuture<HotelOrderChangeApplyResponse> hotelOrderChangeApply(HotelOrderChangeApplyRequest request);

    /**
     * @param request the request parameters of HotelOrderChangeDetail  HotelOrderChangeDetailRequest
     * @return HotelOrderChangeDetailResponse
     */
    CompletableFuture<HotelOrderChangeDetailResponse> hotelOrderChangeDetail(HotelOrderChangeDetailRequest request);

    /**
     * @param request the request parameters of HotelOrderCreate  HotelOrderCreateRequest
     * @return HotelOrderCreateResponse
     */
    CompletableFuture<HotelOrderCreateResponse> hotelOrderCreate(HotelOrderCreateRequest request);

    /**
     * @param request the request parameters of HotelOrderDetailInfo  HotelOrderDetailInfoRequest
     * @return HotelOrderDetailInfoResponse
     */
    CompletableFuture<HotelOrderDetailInfoResponse> hotelOrderDetailInfo(HotelOrderDetailInfoRequest request);

    /**
     * @param request the request parameters of HotelOrderInfoQuery  HotelOrderInfoQueryRequest
     * @return HotelOrderInfoQueryResponse
     */
    CompletableFuture<HotelOrderInfoQueryResponse> hotelOrderInfoQuery(HotelOrderInfoQueryRequest request);

    /**
     * @param request the request parameters of HotelOrderListQuery  HotelOrderListQueryRequest
     * @return HotelOrderListQueryResponse
     */
    CompletableFuture<HotelOrderListQueryResponse> hotelOrderListQuery(HotelOrderListQueryRequest request);

    /**
     * @param request the request parameters of HotelOrderPay  HotelOrderPayRequest
     * @return HotelOrderPayResponse
     */
    CompletableFuture<HotelOrderPayResponse> hotelOrderPay(HotelOrderPayRequest request);

    /**
     * @param request the request parameters of HotelOrderPreValidate  HotelOrderPreValidateRequest
     * @return HotelOrderPreValidateResponse
     */
    CompletableFuture<HotelOrderPreValidateResponse> hotelOrderPreValidate(HotelOrderPreValidateRequest request);

    /**
     * @param request the request parameters of HotelOrderQuery  HotelOrderQueryRequest
     * @return HotelOrderQueryResponse
     */
    CompletableFuture<HotelOrderQueryResponse> hotelOrderQuery(HotelOrderQueryRequest request);

    /**
     * @param request the request parameters of HotelPricePull  HotelPricePullRequest
     * @return HotelPricePullResponse
     */
    CompletableFuture<HotelPricePullResponse> hotelPricePull(HotelPricePullRequest request);

    /**
     * @param request the request parameters of HotelRoomInfo  HotelRoomInfoRequest
     * @return HotelRoomInfoResponse
     */
    CompletableFuture<HotelRoomInfoResponse> hotelRoomInfo(HotelRoomInfoRequest request);

    /**
     * @param request the request parameters of HotelSearch  HotelSearchRequest
     * @return HotelSearchResponse
     */
    CompletableFuture<HotelSearchResponse> hotelSearch(HotelSearchRequest request);

    /**
     * @param request the request parameters of HotelStaticInfo  HotelStaticInfoRequest
     * @return HotelStaticInfoResponse
     */
    CompletableFuture<HotelStaticInfoResponse> hotelStaticInfo(HotelStaticInfoRequest request);

    /**
     * @param request the request parameters of HotelSuggestV2  HotelSuggestV2Request
     * @return HotelSuggestV2Response
     */
    CompletableFuture<HotelSuggestV2Response> hotelSuggestV2(HotelSuggestV2Request request);

    /**
     * @param request the request parameters of IFlightOrderDetailQuery  IFlightOrderDetailQueryRequest
     * @return IFlightOrderDetailQueryResponse
     */
    CompletableFuture<IFlightOrderDetailQueryResponse> iFlightOrderDetailQuery(IFlightOrderDetailQueryRequest request);

    /**
     * @param request the request parameters of IFlightOrderListQuery  IFlightOrderListQueryRequest
     * @return IFlightOrderListQueryResponse
     */
    CompletableFuture<IFlightOrderListQueryResponse> iFlightOrderListQuery(IFlightOrderListQueryRequest request);

    /**
     * @param request the request parameters of IeFlightBillSettlementQuery  IeFlightBillSettlementQueryRequest
     * @return IeFlightBillSettlementQueryResponse
     */
    CompletableFuture<IeFlightBillSettlementQueryResponse> ieFlightBillSettlementQuery(IeFlightBillSettlementQueryRequest request);

    /**
     * @param request the request parameters of IeHotelBillSettlementQuery  IeHotelBillSettlementQueryRequest
     * @return IeHotelBillSettlementQueryResponse
     */
    CompletableFuture<IeHotelBillSettlementQueryResponse> ieHotelBillSettlementQuery(IeHotelBillSettlementQueryRequest request);

    /**
     * @param request the request parameters of InsInvoiceScanQuery  InsInvoiceScanQueryRequest
     * @return InsInvoiceScanQueryResponse
     */
    CompletableFuture<InsInvoiceScanQueryResponse> insInvoiceScanQuery(InsInvoiceScanQueryRequest request);

    /**
     * @param request the request parameters of InsureOrderApply  InsureOrderApplyRequest
     * @return InsureOrderApplyResponse
     */
    CompletableFuture<InsureOrderApplyResponse> insureOrderApply(InsureOrderApplyRequest request);

    /**
     * @param request the request parameters of InsureOrderCancel  InsureOrderCancelRequest
     * @return InsureOrderCancelResponse
     */
    CompletableFuture<InsureOrderCancelResponse> insureOrderCancel(InsureOrderCancelRequest request);

    /**
     * @param request the request parameters of InsureOrderCreate  InsureOrderCreateRequest
     * @return InsureOrderCreateResponse
     */
    CompletableFuture<InsureOrderCreateResponse> insureOrderCreate(InsureOrderCreateRequest request);

    /**
     * @param request the request parameters of InsureOrderDetail  InsureOrderDetailRequest
     * @return InsureOrderDetailResponse
     */
    CompletableFuture<InsureOrderDetailResponse> insureOrderDetail(InsureOrderDetailRequest request);

    /**
     * @param request the request parameters of InsureOrderPay  InsureOrderPayRequest
     * @return InsureOrderPayResponse
     */
    CompletableFuture<InsureOrderPayResponse> insureOrderPay(InsureOrderPayRequest request);

    /**
     * @param request the request parameters of InsureOrderRefund  InsureOrderRefundRequest
     * @return InsureOrderRefundResponse
     */
    CompletableFuture<InsureOrderRefundResponse> insureOrderRefund(InsureOrderRefundRequest request);

    /**
     * @param request the request parameters of InsureOrderUrlDetail  InsureOrderUrlDetailRequest
     * @return InsureOrderUrlDetailResponse
     */
    CompletableFuture<InsureOrderUrlDetailResponse> insureOrderUrlDetail(InsureOrderUrlDetailRequest request);

    /**
     * @param request the request parameters of InsureRefundDetail  InsureRefundDetailRequest
     * @return InsureRefundDetailResponse
     */
    CompletableFuture<InsureRefundDetailResponse> insureRefundDetail(InsureRefundDetailRequest request);

    /**
     * @param request the request parameters of IntlFlightCreateOrder  IntlFlightCreateOrderRequest
     * @return IntlFlightCreateOrderResponse
     */
    CompletableFuture<IntlFlightCreateOrderResponse> intlFlightCreateOrder(IntlFlightCreateOrderRequest request);

    /**
     * @param request the request parameters of IntlFlightInventoryPriceCheck  IntlFlightInventoryPriceCheckRequest
     * @return IntlFlightInventoryPriceCheckResponse
     */
    CompletableFuture<IntlFlightInventoryPriceCheckResponse> intlFlightInventoryPriceCheck(IntlFlightInventoryPriceCheckRequest request);

    /**
     * @param request the request parameters of IntlFlightListingSearch  IntlFlightListingSearchRequest
     * @return IntlFlightListingSearchResponse
     */
    CompletableFuture<IntlFlightListingSearchResponse> intlFlightListingSearch(IntlFlightListingSearchRequest request);

    /**
     * @param request the request parameters of IntlFlightOrderCancel  IntlFlightOrderCancelRequest
     * @return IntlFlightOrderCancelResponse
     */
    CompletableFuture<IntlFlightOrderCancelResponse> intlFlightOrderCancel(IntlFlightOrderCancelRequest request);

    /**
     * @param request the request parameters of IntlFlightOrderDetail  IntlFlightOrderDetailRequest
     * @return IntlFlightOrderDetailResponse
     */
    CompletableFuture<IntlFlightOrderDetailResponse> intlFlightOrderDetail(IntlFlightOrderDetailRequest request);

    /**
     * @param request the request parameters of IntlFlightOrderPay  IntlFlightOrderPayRequest
     * @return IntlFlightOrderPayResponse
     */
    CompletableFuture<IntlFlightOrderPayResponse> intlFlightOrderPay(IntlFlightOrderPayRequest request);

    /**
     * @param request the request parameters of IntlFlightOrderPayCheck  IntlFlightOrderPayCheckRequest
     * @return IntlFlightOrderPayCheckResponse
     */
    CompletableFuture<IntlFlightOrderPayCheckResponse> intlFlightOrderPayCheck(IntlFlightOrderPayCheckRequest request);

    /**
     * @param request the request parameters of IntlFlightOtaItemDetail  IntlFlightOtaItemDetailRequest
     * @return IntlFlightOtaItemDetailResponse
     */
    CompletableFuture<IntlFlightOtaItemDetailResponse> intlFlightOtaItemDetail(IntlFlightOtaItemDetailRequest request);

    /**
     * @param request the request parameters of IntlFlightOtaSearch  IntlFlightOtaSearchRequest
     * @return IntlFlightOtaSearchResponse
     */
    CompletableFuture<IntlFlightOtaSearchResponse> intlFlightOtaSearch(IntlFlightOtaSearchRequest request);

    /**
     * @param request the request parameters of IntlFlightSegmentAvailableCert  IntlFlightSegmentAvailableCertRequest
     * @return IntlFlightSegmentAvailableCertResponse
     */
    CompletableFuture<IntlFlightSegmentAvailableCertResponse> intlFlightSegmentAvailableCert(IntlFlightSegmentAvailableCertRequest request);

    /**
     * @param request the request parameters of InvoiceAdd  InvoiceAddRequest
     * @return InvoiceAddResponse
     */
    CompletableFuture<InvoiceAddResponse> invoiceAdd(InvoiceAddRequest request);

    /**
     * @param request the request parameters of InvoiceDelete  InvoiceDeleteRequest
     * @return InvoiceDeleteResponse
     */
    CompletableFuture<InvoiceDeleteResponse> invoiceDelete(InvoiceDeleteRequest request);

    /**
     * @param request the request parameters of InvoiceModify  InvoiceModifyRequest
     * @return InvoiceModifyResponse
     */
    CompletableFuture<InvoiceModifyResponse> invoiceModify(InvoiceModifyRequest request);

    /**
     * @param request the request parameters of InvoiceRuleAdd  InvoiceRuleAddRequest
     * @return InvoiceRuleAddResponse
     */
    CompletableFuture<InvoiceRuleAddResponse> invoiceRuleAdd(InvoiceRuleAddRequest request);

    /**
     * @param request the request parameters of InvoiceRuleDelete  InvoiceRuleDeleteRequest
     * @return InvoiceRuleDeleteResponse
     */
    CompletableFuture<InvoiceRuleDeleteResponse> invoiceRuleDelete(InvoiceRuleDeleteRequest request);

    /**
     * @param request the request parameters of InvoiceRuleSave  InvoiceRuleSaveRequest
     * @return InvoiceRuleSaveResponse
     */
    CompletableFuture<InvoiceRuleSaveResponse> invoiceRuleSave(InvoiceRuleSaveRequest request);

    /**
     * @param request the request parameters of InvoiceSearch  InvoiceSearchRequest
     * @return InvoiceSearchResponse
     */
    CompletableFuture<InvoiceSearchResponse> invoiceSearch(InvoiceSearchRequest request);

    /**
     * @param request the request parameters of IsvRuleSave  IsvRuleSaveRequest
     * @return IsvRuleSaveResponse
     */
    CompletableFuture<IsvRuleSaveResponse> isvRuleSave(IsvRuleSaveRequest request);

    /**
     * @param request the request parameters of IsvUserSave  IsvUserSaveRequest
     * @return IsvUserSaveResponse
     */
    CompletableFuture<IsvUserSaveResponse> isvUserSave(IsvUserSaveRequest request);

    /**
     * @param request the request parameters of MealBillSettlementQuery  MealBillSettlementQueryRequest
     * @return MealBillSettlementQueryResponse
     */
    CompletableFuture<MealBillSettlementQueryResponse> mealBillSettlementQuery(MealBillSettlementQueryRequest request);

    /**
     * @param request the request parameters of MealOrderDetailQuery  MealOrderDetailQueryRequest
     * @return MealOrderDetailQueryResponse
     */
    CompletableFuture<MealOrderDetailQueryResponse> mealOrderDetailQuery(MealOrderDetailQueryRequest request);

    /**
     * @param request the request parameters of MealOrderListQuery  MealOrderListQueryRequest
     * @return MealOrderListQueryResponse
     */
    CompletableFuture<MealOrderListQueryResponse> mealOrderListQuery(MealOrderListQueryRequest request);

    /**
     * @param request the request parameters of MonthBillConfirm  MonthBillConfirmRequest
     * @return MonthBillConfirmResponse
     */
    CompletableFuture<MonthBillConfirmResponse> monthBillConfirm(MonthBillConfirmRequest request);

    /**
     * @param request the request parameters of MonthBillGet  MonthBillGetRequest
     * @return MonthBillGetResponse
     */
    CompletableFuture<MonthBillGetResponse> monthBillGet(MonthBillGetRequest request);

    /**
     * @param request the request parameters of OrderRefundDetailQuery  OrderRefundDetailQueryRequest
     * @return OrderRefundDetailQueryResponse
     */
    CompletableFuture<OrderRefundDetailQueryResponse> orderRefundDetailQuery(OrderRefundDetailQueryRequest request);

    /**
     * @param request the request parameters of ProjectAdd  ProjectAddRequest
     * @return ProjectAddResponse
     */
    CompletableFuture<ProjectAddResponse> projectAdd(ProjectAddRequest request);

    /**
     * @param request the request parameters of ProjectDelete  ProjectDeleteRequest
     * @return ProjectDeleteResponse
     */
    CompletableFuture<ProjectDeleteResponse> projectDelete(ProjectDeleteRequest request);

    /**
     * @param request the request parameters of ProjectModify  ProjectModifyRequest
     * @return ProjectModifyResponse
     */
    CompletableFuture<ProjectModifyResponse> projectModify(ProjectModifyRequest request);

    /**
     * @param request the request parameters of QueryCorpDetailInfo  QueryCorpDetailInfoRequest
     * @return QueryCorpDetailInfoResponse
     */
    CompletableFuture<QueryCorpDetailInfoResponse> queryCorpDetailInfo(QueryCorpDetailInfoRequest request);

    /**
     * @param request the request parameters of QueryEmployeeDetail  QueryEmployeeDetailRequest
     * @return QueryEmployeeDetailResponse
     */
    CompletableFuture<QueryEmployeeDetailResponse> queryEmployeeDetail(QueryEmployeeDetailRequest request);

    /**
     * @param request the request parameters of QueryGroupCorpList  QueryGroupCorpListRequest
     * @return QueryGroupCorpListResponse
     */
    CompletableFuture<QueryGroupCorpListResponse> queryGroupCorpList(QueryGroupCorpListRequest request);

    /**
     * @param request the request parameters of QueryReimbursementOrder  QueryReimbursementOrderRequest
     * @return QueryReimbursementOrderResponse
     */
    CompletableFuture<QueryReimbursementOrderResponse> queryReimbursementOrder(QueryReimbursementOrderRequest request);

    /**
     * @param request the request parameters of SyncSingleUser  SyncSingleUserRequest
     * @return SyncSingleUserResponse
     */
    CompletableFuture<SyncSingleUserResponse> syncSingleUser(SyncSingleUserRequest request);

    /**
     * @param request the request parameters of SyncThirdUserMapping  SyncThirdUserMappingRequest
     * @return SyncThirdUserMappingResponse
     */
    CompletableFuture<SyncThirdUserMappingResponse> syncThirdUserMapping(SyncThirdUserMappingRequest request);

    /**
     * @param request the request parameters of TBAccountInfoQuery  TBAccountInfoQueryRequest
     * @return TBAccountInfoQueryResponse
     */
    CompletableFuture<TBAccountInfoQueryResponse> tBAccountInfoQuery(TBAccountInfoQueryRequest request);

    /**
     * @param request the request parameters of TBAccountUnbind  TBAccountUnbindRequest
     * @return TBAccountUnbindResponse
     */
    CompletableFuture<TBAccountUnbindResponse> tBAccountUnbind(TBAccountUnbindRequest request);

    /**
     * @param request the request parameters of TicketChangingApply  TicketChangingApplyRequest
     * @return TicketChangingApplyResponse
     */
    CompletableFuture<TicketChangingApplyResponse> ticketChangingApply(TicketChangingApplyRequest request);

    /**
     * @param request the request parameters of TicketChangingCancel  TicketChangingCancelRequest
     * @return TicketChangingCancelResponse
     */
    CompletableFuture<TicketChangingCancelResponse> ticketChangingCancel(TicketChangingCancelRequest request);

    /**
     * @param request the request parameters of TicketChangingDetail  TicketChangingDetailRequest
     * @return TicketChangingDetailResponse
     */
    CompletableFuture<TicketChangingDetailResponse> ticketChangingDetail(TicketChangingDetailRequest request);

    /**
     * @param request the request parameters of TicketChangingEnquiry  TicketChangingEnquiryRequest
     * @return TicketChangingEnquiryResponse
     */
    CompletableFuture<TicketChangingEnquiryResponse> ticketChangingEnquiry(TicketChangingEnquiryRequest request);

    /**
     * @param request the request parameters of TicketChangingFlightList  TicketChangingFlightListRequest
     * @return TicketChangingFlightListResponse
     */
    CompletableFuture<TicketChangingFlightListResponse> ticketChangingFlightList(TicketChangingFlightListRequest request);

    /**
     * @param request the request parameters of TicketChangingPay  TicketChangingPayRequest
     * @return TicketChangingPayResponse
     */
    CompletableFuture<TicketChangingPayResponse> ticketChangingPay(TicketChangingPayRequest request);

    /**
     * @param request the request parameters of TrainApplyChange  TrainApplyChangeRequest
     * @return TrainApplyChangeResponse
     */
    CompletableFuture<TrainApplyChangeResponse> trainApplyChange(TrainApplyChangeRequest request);

    /**
     * @param request the request parameters of TrainApplyRefund  TrainApplyRefundRequest
     * @return TrainApplyRefundResponse
     */
    CompletableFuture<TrainApplyRefundResponse> trainApplyRefund(TrainApplyRefundRequest request);

    /**
     * @param request the request parameters of TrainBillSettlementQuery  TrainBillSettlementQueryRequest
     * @return TrainBillSettlementQueryResponse
     */
    CompletableFuture<TrainBillSettlementQueryResponse> trainBillSettlementQuery(TrainBillSettlementQueryRequest request);

    /**
     * @param request the request parameters of TrainExceedApplyQuery  TrainExceedApplyQueryRequest
     * @return TrainExceedApplyQueryResponse
     */
    CompletableFuture<TrainExceedApplyQueryResponse> trainExceedApplyQuery(TrainExceedApplyQueryRequest request);

    /**
     * @param request the request parameters of TrainFeeCalculateChange  TrainFeeCalculateChangeRequest
     * @return TrainFeeCalculateChangeResponse
     */
    CompletableFuture<TrainFeeCalculateChangeResponse> trainFeeCalculateChange(TrainFeeCalculateChangeRequest request);

    /**
     * @param request the request parameters of TrainFeeCalculateRefund  TrainFeeCalculateRefundRequest
     * @return TrainFeeCalculateRefundResponse
     */
    CompletableFuture<TrainFeeCalculateRefundResponse> trainFeeCalculateRefund(TrainFeeCalculateRefundRequest request);

    /**
     * @param request the request parameters of TrainNoInfoSearch  TrainNoInfoSearchRequest
     * @return TrainNoInfoSearchResponse
     */
    CompletableFuture<TrainNoInfoSearchResponse> trainNoInfoSearch(TrainNoInfoSearchRequest request);

    /**
     * @param request the request parameters of TrainNoListSearch  TrainNoListSearchRequest
     * @return TrainNoListSearchResponse
     */
    CompletableFuture<TrainNoListSearchResponse> trainNoListSearch(TrainNoListSearchRequest request);

    /**
     * @param request the request parameters of TrainOrderCancel  TrainOrderCancelRequest
     * @return TrainOrderCancelResponse
     */
    CompletableFuture<TrainOrderCancelResponse> trainOrderCancel(TrainOrderCancelRequest request);

    /**
     * @param request the request parameters of TrainOrderChangeConfirm  TrainOrderChangeConfirmRequest
     * @return TrainOrderChangeConfirmResponse
     */
    CompletableFuture<TrainOrderChangeConfirmResponse> trainOrderChangeConfirm(TrainOrderChangeConfirmRequest request);

    /**
     * @param request the request parameters of TrainOrderCreate  TrainOrderCreateRequest
     * @return TrainOrderCreateResponse
     */
    CompletableFuture<TrainOrderCreateResponse> trainOrderCreate(TrainOrderCreateRequest request);

    /**
     * @param request the request parameters of TrainOrderDetailQuery  TrainOrderDetailQueryRequest
     * @return TrainOrderDetailQueryResponse
     */
    CompletableFuture<TrainOrderDetailQueryResponse> trainOrderDetailQuery(TrainOrderDetailQueryRequest request);

    /**
     * @param request the request parameters of TrainOrderListQuery  TrainOrderListQueryRequest
     * @return TrainOrderListQueryResponse
     */
    CompletableFuture<TrainOrderListQueryResponse> trainOrderListQuery(TrainOrderListQueryRequest request);

    /**
     * @param request the request parameters of TrainOrderPay  TrainOrderPayRequest
     * @return TrainOrderPayResponse
     */
    CompletableFuture<TrainOrderPayResponse> trainOrderPay(TrainOrderPayRequest request);

    /**
     * @param request the request parameters of TrainOrderQuery  TrainOrderQueryRequest
     * @return TrainOrderQueryResponse
     */
    CompletableFuture<TrainOrderQueryResponse> trainOrderQuery(TrainOrderQueryRequest request);

    /**
     * @param request the request parameters of TrainOrderQueryV2  TrainOrderQueryV2Request
     * @return TrainOrderQueryV2Response
     */
    CompletableFuture<TrainOrderQueryV2Response> trainOrderQueryV2(TrainOrderQueryV2Request request);

    /**
     * @param request the request parameters of TrainStationSearch  TrainStationSearchRequest
     * @return TrainStationSearchResponse
     */
    CompletableFuture<TrainStationSearchResponse> trainStationSearch(TrainStationSearchRequest request);

    /**
     * @param request the request parameters of TrainStopoverSearch  TrainStopoverSearchRequest
     * @return TrainStopoverSearchResponse
     */
    CompletableFuture<TrainStopoverSearchResponse> trainStopoverSearch(TrainStopoverSearchRequest request);

    /**
     * @param request the request parameters of TrainTicketScanQuery  TrainTicketScanQueryRequest
     * @return TrainTicketScanQueryResponse
     */
    CompletableFuture<TrainTicketScanQueryResponse> trainTicketScanQuery(TrainTicketScanQueryRequest request);

    /**
     * @param request the request parameters of TravelStandardListQuery  TravelStandardListQueryRequest
     * @return TravelStandardListQueryResponse
     */
    CompletableFuture<TravelStandardListQueryResponse> travelStandardListQuery(TravelStandardListQueryRequest request);

    /**
     * @param request the request parameters of TravelStandardQuery  TravelStandardQueryRequest
     * @return TravelStandardQueryResponse
     */
    CompletableFuture<TravelStandardQueryResponse> travelStandardQuery(TravelStandardQueryRequest request);

    /**
     * @param request the request parameters of TripBusinessInstanceQuery  TripBusinessInstanceQueryRequest
     * @return TripBusinessInstanceQueryResponse
     */
    CompletableFuture<TripBusinessInstanceQueryResponse> tripBusinessInstanceQuery(TripBusinessInstanceQueryRequest request);

    /**
     * @param request the request parameters of TripCCInfoQuery  TripCCInfoQueryRequest
     * @return TripCCInfoQueryResponse
     */
    CompletableFuture<TripCCInfoQueryResponse> tripCCInfoQuery(TripCCInfoQueryRequest request);

    /**
     * @param request the request parameters of TripTaskQuery  TripTaskQueryRequest
     * @return TripTaskQueryResponse
     */
    CompletableFuture<TripTaskQueryResponse> tripTaskQuery(TripTaskQueryRequest request);

    /**
     * @param request the request parameters of UpdateCustomRole  UpdateCustomRoleRequest
     * @return UpdateCustomRoleResponse
     */
    CompletableFuture<UpdateCustomRoleResponse> updateCustomRole(UpdateCustomRoleRequest request);

    /**
     * @param request the request parameters of UpdateDepartment  UpdateDepartmentRequest
     * @return UpdateDepartmentResponse
     */
    CompletableFuture<UpdateDepartmentResponse> updateDepartment(UpdateDepartmentRequest request);

    /**
     * @param request the request parameters of UpdateEmployee  UpdateEmployeeRequest
     * @return UpdateEmployeeResponse
     */
    CompletableFuture<UpdateEmployeeResponse> updateEmployee(UpdateEmployeeRequest request);

    /**
     * @param request the request parameters of UpdateEmployeeLeaveStatus  UpdateEmployeeLeaveStatusRequest
     * @return UpdateEmployeeLeaveStatusResponse
     */
    CompletableFuture<UpdateEmployeeLeaveStatusResponse> updateEmployeeLeaveStatus(UpdateEmployeeLeaveStatusRequest request);

    /**
     * @param request the request parameters of UserQuery  UserQueryRequest
     * @return UserQueryResponse
     */
    CompletableFuture<UserQueryResponse> userQuery(UserQueryRequest request);

    /**
     * @param request the request parameters of VatInvoiceScanQuery  VatInvoiceScanQueryRequest
     * @return VatInvoiceScanQueryResponse
     */
    CompletableFuture<VatInvoiceScanQueryResponse> vatInvoiceScanQuery(VatInvoiceScanQueryRequest request);

    /**
     * @param request the request parameters of WaitApplyInvoiceTaskDetailQuery  WaitApplyInvoiceTaskDetailQueryRequest
     * @return WaitApplyInvoiceTaskDetailQueryResponse
     */
    CompletableFuture<WaitApplyInvoiceTaskDetailQueryResponse> waitApplyInvoiceTaskDetailQuery(WaitApplyInvoiceTaskDetailQueryRequest request);

}
