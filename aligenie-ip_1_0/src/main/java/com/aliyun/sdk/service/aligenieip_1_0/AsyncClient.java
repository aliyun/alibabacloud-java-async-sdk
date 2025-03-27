// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aligenieip_1_0.models.*;
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
     * @param request the request parameters of AddCartoon  AddCartoonRequest
     * @return AddCartoonResponse
     */
    CompletableFuture<AddCartoonResponse> addCartoon(AddCartoonRequest request);

    /**
     * @param request the request parameters of AddCustomQA  AddCustomQARequest
     * @return AddCustomQAResponse
     */
    CompletableFuture<AddCustomQAResponse> addCustomQA(AddCustomQARequest request);

    /**
     * @param request the request parameters of AddCustomQAV2  AddCustomQAV2Request
     * @return AddCustomQAV2Response
     */
    CompletableFuture<AddCustomQAV2Response> addCustomQAV2(AddCustomQAV2Request request);

    /**
     * @param request the request parameters of AddMessageTemplate  AddMessageTemplateRequest
     * @return AddMessageTemplateResponse
     */
    CompletableFuture<AddMessageTemplateResponse> addMessageTemplate(AddMessageTemplateRequest request);

    /**
     * @param request the request parameters of AddOrUpdateDisPlayModes  AddOrUpdateDisPlayModesRequest
     * @return AddOrUpdateDisPlayModesResponse
     */
    CompletableFuture<AddOrUpdateDisPlayModesResponse> addOrUpdateDisPlayModes(AddOrUpdateDisPlayModesRequest request);

    /**
     * @param request the request parameters of AddOrUpdateHotelSetting  AddOrUpdateHotelSettingRequest
     * @return AddOrUpdateHotelSettingResponse
     */
    CompletableFuture<AddOrUpdateHotelSettingResponse> addOrUpdateHotelSetting(AddOrUpdateHotelSettingRequest request);

    /**
     * @param request the request parameters of AddOrUpdateScreenSaver  AddOrUpdateScreenSaverRequest
     * @return AddOrUpdateScreenSaverResponse
     */
    CompletableFuture<AddOrUpdateScreenSaverResponse> addOrUpdateScreenSaver(AddOrUpdateScreenSaverRequest request);

    /**
     * @param request the request parameters of AddOrUpdateWelcomeText  AddOrUpdateWelcomeTextRequest
     * @return AddOrUpdateWelcomeTextResponse
     */
    CompletableFuture<AddOrUpdateWelcomeTextResponse> addOrUpdateWelcomeText(AddOrUpdateWelcomeTextRequest request);

    /**
     * @param request the request parameters of AuditHotel  AuditHotelRequest
     * @return AuditHotelResponse
     */
    CompletableFuture<AuditHotelResponse> auditHotel(AuditHotelRequest request);

    /**
     * @param request the request parameters of BatchAddHotelRoom  BatchAddHotelRoomRequest
     * @return BatchAddHotelRoomResponse
     */
    CompletableFuture<BatchAddHotelRoomResponse> batchAddHotelRoom(BatchAddHotelRoomRequest request);

    /**
     * @param request the request parameters of BatchDeleteHotelRoom  BatchDeleteHotelRoomRequest
     * @return BatchDeleteHotelRoomResponse
     */
    CompletableFuture<BatchDeleteHotelRoomResponse> batchDeleteHotelRoom(BatchDeleteHotelRoomRequest request);

    /**
     * @param request the request parameters of CheckoutWithAK  CheckoutWithAKRequest
     * @return CheckoutWithAKResponse
     */
    CompletableFuture<CheckoutWithAKResponse> checkoutWithAK(CheckoutWithAKRequest request);

    /**
     * @param request the request parameters of ChildAccountAuth  ChildAccountAuthRequest
     * @return ChildAccountAuthResponse
     */
    CompletableFuture<ChildAccountAuthResponse> childAccountAuth(ChildAccountAuthRequest request);

    /**
     * @param request the request parameters of ControlRoomDevice  ControlRoomDeviceRequest
     * @return ControlRoomDeviceResponse
     */
    CompletableFuture<ControlRoomDeviceResponse> controlRoomDevice(ControlRoomDeviceRequest request);

    /**
     * @param request the request parameters of CreateHotel  CreateHotelRequest
     * @return CreateHotelResponse
     */
    CompletableFuture<CreateHotelResponse> createHotel(CreateHotelRequest request);

    /**
     * @param request the request parameters of CreateHotelAlarm  CreateHotelAlarmRequest
     * @return CreateHotelAlarmResponse
     */
    CompletableFuture<CreateHotelAlarmResponse> createHotelAlarm(CreateHotelAlarmRequest request);

    /**
     * @param request the request parameters of CreateRcuScene  CreateRcuSceneRequest
     * @return CreateRcuSceneResponse
     */
    CompletableFuture<CreateRcuSceneResponse> createRcuScene(CreateRcuSceneRequest request);

    /**
     * @param request the request parameters of DeleteCartoon  DeleteCartoonRequest
     * @return DeleteCartoonResponse
     */
    CompletableFuture<DeleteCartoonResponse> deleteCartoon(DeleteCartoonRequest request);

    /**
     * @param request the request parameters of DeleteCustomQA  DeleteCustomQARequest
     * @return DeleteCustomQAResponse
     */
    CompletableFuture<DeleteCustomQAResponse> deleteCustomQA(DeleteCustomQARequest request);

    /**
     * @param request the request parameters of DeleteHotelAlarm  DeleteHotelAlarmRequest
     * @return DeleteHotelAlarmResponse
     */
    CompletableFuture<DeleteHotelAlarmResponse> deleteHotelAlarm(DeleteHotelAlarmRequest request);

    /**
     * @param request the request parameters of DeleteHotelSceneBookItem  DeleteHotelSceneBookItemRequest
     * @return DeleteHotelSceneBookItemResponse
     */
    CompletableFuture<DeleteHotelSceneBookItemResponse> deleteHotelSceneBookItem(DeleteHotelSceneBookItemRequest request);

    /**
     * @param request the request parameters of DeleteHotelSetting  DeleteHotelSettingRequest
     * @return DeleteHotelSettingResponse
     */
    CompletableFuture<DeleteHotelSettingResponse> deleteHotelSetting(DeleteHotelSettingRequest request);

    /**
     * @param request the request parameters of DeleteMessageTemplate  DeleteMessageTemplateRequest
     * @return DeleteMessageTemplateResponse
     */
    CompletableFuture<DeleteMessageTemplateResponse> deleteMessageTemplate(DeleteMessageTemplateRequest request);

    /**
     * @param request the request parameters of DeleteRcuScene  DeleteRcuSceneRequest
     * @return DeleteRcuSceneResponse
     */
    CompletableFuture<DeleteRcuSceneResponse> deleteRcuScene(DeleteRcuSceneRequest request);

    /**
     * @param request the request parameters of DeviceControl  DeviceControlRequest
     * @return DeviceControlResponse
     */
    CompletableFuture<DeviceControlResponse> deviceControl(DeviceControlRequest request);

    /**
     * @param request the request parameters of ExecuteScene  ExecuteSceneRequest
     * @return ExecuteSceneResponse
     */
    CompletableFuture<ExecuteSceneResponse> executeScene(ExecuteSceneRequest request);

    /**
     * @param request the request parameters of GetBasicInfoQA  GetBasicInfoQARequest
     * @return GetBasicInfoQAResponse
     */
    CompletableFuture<GetBasicInfoQAResponse> getBasicInfoQA(GetBasicInfoQARequest request);

    /**
     * @param request the request parameters of GetCartoon  GetCartoonRequest
     * @return GetCartoonResponse
     */
    CompletableFuture<GetCartoonResponse> getCartoon(GetCartoonRequest request);

    /**
     * @param request the request parameters of GetHotelContactByGenieDevice  GetHotelContactByGenieDeviceRequest
     * @return GetHotelContactByGenieDeviceResponse
     */
    CompletableFuture<GetHotelContactByGenieDeviceResponse> getHotelContactByGenieDevice(GetHotelContactByGenieDeviceRequest request);

    /**
     * @param request the request parameters of GetHotelContactByNumber  GetHotelContactByNumberRequest
     * @return GetHotelContactByNumberResponse
     */
    CompletableFuture<GetHotelContactByNumberResponse> getHotelContactByNumber(GetHotelContactByNumberRequest request);

    /**
     * @param request the request parameters of GetHotelContacts  GetHotelContactsRequest
     * @return GetHotelContactsResponse
     */
    CompletableFuture<GetHotelContactsResponse> getHotelContacts(GetHotelContactsRequest request);

    /**
     * @param request the request parameters of GetHotelHomeBackImageAndModes  GetHotelHomeBackImageAndModesRequest
     * @return GetHotelHomeBackImageAndModesResponse
     */
    CompletableFuture<GetHotelHomeBackImageAndModesResponse> getHotelHomeBackImageAndModes(GetHotelHomeBackImageAndModesRequest request);

    /**
     * @param request the request parameters of GetHotelNotice  GetHotelNoticeRequest
     * @return GetHotelNoticeResponse
     */
    CompletableFuture<GetHotelNoticeResponse> getHotelNotice(GetHotelNoticeRequest request);

    /**
     * @param request the request parameters of GetHotelNoticeV2  GetHotelNoticeV2Request
     * @return GetHotelNoticeV2Response
     */
    CompletableFuture<GetHotelNoticeV2Response> getHotelNoticeV2(GetHotelNoticeV2Request request);

    /**
     * @param request the request parameters of GetHotelOrderDetail  GetHotelOrderDetailRequest
     * @return GetHotelOrderDetailResponse
     */
    CompletableFuture<GetHotelOrderDetailResponse> getHotelOrderDetail(GetHotelOrderDetailRequest request);

    /**
     * @param request the request parameters of GetHotelRoomDevice  GetHotelRoomDeviceRequest
     * @return GetHotelRoomDeviceResponse
     */
    CompletableFuture<GetHotelRoomDeviceResponse> getHotelRoomDevice(GetHotelRoomDeviceRequest request);

    /**
     * @param request the request parameters of GetHotelSampleUtterances  GetHotelSampleUtterancesRequest
     * @return GetHotelSampleUtterancesResponse
     */
    CompletableFuture<GetHotelSampleUtterancesResponse> getHotelSampleUtterances(GetHotelSampleUtterancesRequest request);

    /**
     * @param request the request parameters of GetHotelSceneItemDetail  GetHotelSceneItemDetailRequest
     * @return GetHotelSceneItemDetailResponse
     */
    CompletableFuture<GetHotelSceneItemDetailResponse> getHotelSceneItemDetail(GetHotelSceneItemDetailRequest request);

    /**
     * @param request the request parameters of GetHotelScreenSaver  GetHotelScreenSaverRequest
     * @return GetHotelScreenSaverResponse
     */
    CompletableFuture<GetHotelScreenSaverResponse> getHotelScreenSaver(GetHotelScreenSaverRequest request);

    /**
     * @param request the request parameters of GetHotelScreenSaverStyle  GetHotelScreenSaverStyleRequest
     * @return GetHotelScreenSaverStyleResponse
     */
    CompletableFuture<GetHotelScreenSaverStyleResponse> getHotelScreenSaverStyle(GetHotelScreenSaverStyleRequest request);

    /**
     * @param request the request parameters of GetHotelSetting  GetHotelSettingRequest
     * @return GetHotelSettingResponse
     */
    CompletableFuture<GetHotelSettingResponse> getHotelSetting(GetHotelSettingRequest request);

    /**
     * @param request the request parameters of GetRelationProductList  GetRelationProductListRequest
     * @return GetRelationProductListResponse
     */
    CompletableFuture<GetRelationProductListResponse> getRelationProductList(GetRelationProductListRequest request);

    /**
     * @param request the request parameters of GetUnionId  GetUnionIdRequest
     * @return GetUnionIdResponse
     */
    CompletableFuture<GetUnionIdResponse> getUnionId(GetUnionIdRequest request);

    /**
     * @param request the request parameters of GetWelcomeTextAndMusic  GetWelcomeTextAndMusicRequest
     * @return GetWelcomeTextAndMusicResponse
     */
    CompletableFuture<GetWelcomeTextAndMusicResponse> getWelcomeTextAndMusic(GetWelcomeTextAndMusicRequest request);

    /**
     * @param request the request parameters of HotelQrBind  HotelQrBindRequest
     * @return HotelQrBindResponse
     */
    CompletableFuture<HotelQrBindResponse> hotelQrBind(HotelQrBindRequest request);

    /**
     * @param request the request parameters of ImportHotelConfig  ImportHotelConfigRequest
     * @return ImportHotelConfigResponse
     */
    CompletableFuture<ImportHotelConfigResponse> importHotelConfig(ImportHotelConfigRequest request);

    /**
     * @param request the request parameters of ImportRoomControlDevices  ImportRoomControlDevicesRequest
     * @return ImportRoomControlDevicesResponse
     */
    CompletableFuture<ImportRoomControlDevicesResponse> importRoomControlDevices(ImportRoomControlDevicesRequest request);

    /**
     * @param request the request parameters of ImportRoomGenieScenes  ImportRoomGenieScenesRequest
     * @return ImportRoomGenieScenesResponse
     */
    CompletableFuture<ImportRoomGenieScenesResponse> importRoomGenieScenes(ImportRoomGenieScenesRequest request);

    /**
     * @param request the request parameters of InsertHotelSceneBookItem  InsertHotelSceneBookItemRequest
     * @return InsertHotelSceneBookItemResponse
     */
    CompletableFuture<InsertHotelSceneBookItemResponse> insertHotelSceneBookItem(InsertHotelSceneBookItemRequest request);

    /**
     * @param request the request parameters of InvokeRobotPush  InvokeRobotPushRequest
     * @return InvokeRobotPushResponse
     */
    CompletableFuture<InvokeRobotPushResponse> invokeRobotPush(InvokeRobotPushRequest request);

    /**
     * @param request the request parameters of ListAllProvinces  ListAllProvincesRequest
     * @return ListAllProvincesResponse
     */
    CompletableFuture<ListAllProvincesResponse> listAllProvinces(ListAllProvincesRequest request);

    /**
     * @param request the request parameters of ListCitiesByProvince  ListCitiesByProvinceRequest
     * @return ListCitiesByProvinceResponse
     */
    CompletableFuture<ListCitiesByProvinceResponse> listCitiesByProvince(ListCitiesByProvinceRequest request);

    /**
     * @param request the request parameters of ListCustomQA  ListCustomQARequest
     * @return ListCustomQAResponse
     */
    CompletableFuture<ListCustomQAResponse> listCustomQA(ListCustomQARequest request);

    /**
     * @param request the request parameters of ListDialogueTemplate  ListDialogueTemplateRequest
     * @return ListDialogueTemplateResponse
     */
    CompletableFuture<ListDialogueTemplateResponse> listDialogueTemplate(ListDialogueTemplateRequest request);

    /**
     * @param request the request parameters of ListHotelAlarm  ListHotelAlarmRequest
     * @return ListHotelAlarmResponse
     */
    CompletableFuture<ListHotelAlarmResponse> listHotelAlarm(ListHotelAlarmRequest request);

    /**
     * @param request the request parameters of ListHotelControlDevice  ListHotelControlDeviceRequest
     * @return ListHotelControlDeviceResponse
     */
    CompletableFuture<ListHotelControlDeviceResponse> listHotelControlDevice(ListHotelControlDeviceRequest request);

    /**
     * @param request the request parameters of ListHotelInfo  ListHotelInfoRequest
     * @return ListHotelInfoResponse
     */
    CompletableFuture<ListHotelInfoResponse> listHotelInfo(ListHotelInfoRequest request);

    /**
     * @param request the request parameters of ListHotelMessageTemplate  ListHotelMessageTemplateRequest
     * @return ListHotelMessageTemplateResponse
     */
    CompletableFuture<ListHotelMessageTemplateResponse> listHotelMessageTemplate(ListHotelMessageTemplateRequest request);

    /**
     * @param request the request parameters of ListHotelOrder  ListHotelOrderRequest
     * @return ListHotelOrderResponse
     */
    CompletableFuture<ListHotelOrderResponse> listHotelOrder(ListHotelOrderRequest request);

    /**
     * @param request the request parameters of ListHotelRooms  ListHotelRoomsRequest
     * @return ListHotelRoomsResponse
     */
    CompletableFuture<ListHotelRoomsResponse> listHotelRooms(ListHotelRoomsRequest request);

    /**
     * @param request the request parameters of ListHotelSceneBookItems  ListHotelSceneBookItemsRequest
     * @return ListHotelSceneBookItemsResponse
     */
    CompletableFuture<ListHotelSceneBookItemsResponse> listHotelSceneBookItems(ListHotelSceneBookItemsRequest request);

    /**
     * @param request the request parameters of ListHotelSceneItem  ListHotelSceneItemRequest
     * @return ListHotelSceneItemResponse
     */
    CompletableFuture<ListHotelSceneItemResponse> listHotelSceneItem(ListHotelSceneItemRequest request);

    /**
     * @param request the request parameters of ListHotelSceneItems  ListHotelSceneItemsRequest
     * @return ListHotelSceneItemsResponse
     */
    CompletableFuture<ListHotelSceneItemsResponse> listHotelSceneItems(ListHotelSceneItemsRequest request);

    /**
     * @param request the request parameters of ListHotelServiceCategory  ListHotelServiceCategoryRequest
     * @return ListHotelServiceCategoryResponse
     */
    CompletableFuture<ListHotelServiceCategoryResponse> listHotelServiceCategory(ListHotelServiceCategoryRequest request);

    /**
     * @param request the request parameters of ListHotels  ListHotelsRequest
     * @return ListHotelsResponse
     */
    CompletableFuture<ListHotelsResponse> listHotels(ListHotelsRequest request);

    /**
     * @param request the request parameters of ListInfraredDeviceBrands  ListInfraredDeviceBrandsRequest
     * @return ListInfraredDeviceBrandsResponse
     */
    CompletableFuture<ListInfraredDeviceBrandsResponse> listInfraredDeviceBrands(ListInfraredDeviceBrandsRequest request);

    /**
     * @param request the request parameters of ListInfraredRemoteControllers  ListInfraredRemoteControllersRequest
     * @return ListInfraredRemoteControllersResponse
     */
    CompletableFuture<ListInfraredRemoteControllersResponse> listInfraredRemoteControllers(ListInfraredRemoteControllersRequest request);

    /**
     * @param request the request parameters of ListSTBServiceProviders  ListSTBServiceProvidersRequest
     * @return ListSTBServiceProvidersResponse
     */
    CompletableFuture<ListSTBServiceProvidersResponse> listSTBServiceProviders(ListSTBServiceProvidersRequest request);

    /**
     * @param request the request parameters of ListSceneCategory  ListSceneCategoryRequest
     * @return ListSceneCategoryResponse
     */
    CompletableFuture<ListSceneCategoryResponse> listSceneCategory(ListSceneCategoryRequest request);

    /**
     * @param request the request parameters of ListServiceQA  ListServiceQARequest
     * @return ListServiceQAResponse
     */
    CompletableFuture<ListServiceQAResponse> listServiceQA(ListServiceQARequest request);

    /**
     * @param request the request parameters of ListTickets  ListTicketsRequest
     * @return ListTicketsResponse
     */
    CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request);

    /**
     * @param request the request parameters of PageGetHotelRoomDevices  PageGetHotelRoomDevicesRequest
     * @return PageGetHotelRoomDevicesResponse
     */
    CompletableFuture<PageGetHotelRoomDevicesResponse> pageGetHotelRoomDevices(PageGetHotelRoomDevicesRequest request);

    /**
     * @param request the request parameters of PmsEventReport  PmsEventReportRequest
     * @return PmsEventReportResponse
     */
    CompletableFuture<PmsEventReportResponse> pmsEventReport(PmsEventReportRequest request);

    /**
     * @param request the request parameters of PushHotelMessage  PushHotelMessageRequest
     * @return PushHotelMessageResponse
     */
    CompletableFuture<PushHotelMessageResponse> pushHotelMessage(PushHotelMessageRequest request);

    /**
     * @param request the request parameters of PushVoiceBoxCommands  PushVoiceBoxCommandsRequest
     * @return PushVoiceBoxCommandsResponse
     */
    CompletableFuture<PushVoiceBoxCommandsResponse> pushVoiceBoxCommands(PushVoiceBoxCommandsRequest request);

    /**
     * @param request the request parameters of PushWelcome  PushWelcomeRequest
     * @return PushWelcomeResponse
     */
    CompletableFuture<PushWelcomeResponse> pushWelcome(PushWelcomeRequest request);

    /**
     * @param request the request parameters of PushWelcomeTextAndMusic  PushWelcomeTextAndMusicRequest
     * @return PushWelcomeTextAndMusicResponse
     */
    CompletableFuture<PushWelcomeTextAndMusicResponse> pushWelcomeTextAndMusic(PushWelcomeTextAndMusicRequest request);

    /**
     * @param request the request parameters of QueryDeviceStatus  QueryDeviceStatusRequest
     * @return QueryDeviceStatusResponse
     */
    CompletableFuture<QueryDeviceStatusResponse> queryDeviceStatus(QueryDeviceStatusRequest request);

    /**
     * @param request the request parameters of QueryHotelRoomDetail  QueryHotelRoomDetailRequest
     * @return QueryHotelRoomDetailResponse
     */
    CompletableFuture<QueryHotelRoomDetailResponse> queryHotelRoomDetail(QueryHotelRoomDetailRequest request);

    /**
     * @param request the request parameters of QueryRoomControlDevices  QueryRoomControlDevicesRequest
     * @return QueryRoomControlDevicesResponse
     */
    CompletableFuture<QueryRoomControlDevicesResponse> queryRoomControlDevices(QueryRoomControlDevicesRequest request);

    /**
     * @param request the request parameters of QueryRoomControlDevicesAndStatus  QueryRoomControlDevicesAndStatusRequest
     * @return QueryRoomControlDevicesAndStatusResponse
     */
    CompletableFuture<QueryRoomControlDevicesAndStatusResponse> queryRoomControlDevicesAndStatus(QueryRoomControlDevicesAndStatusRequest request);

    /**
     * @param request the request parameters of QueryRoomStatus  QueryRoomStatusRequest
     * @return QueryRoomStatusResponse
     */
    CompletableFuture<QueryRoomStatusResponse> queryRoomStatus(QueryRoomStatusRequest request);

    /**
     * @param request the request parameters of QuerySceneList  QuerySceneListRequest
     * @return QuerySceneListResponse
     */
    CompletableFuture<QuerySceneListResponse> querySceneList(QuerySceneListRequest request);

    /**
     * @param request the request parameters of RemoveChildAccountAuth  RemoveChildAccountAuthRequest
     * @return RemoveChildAccountAuthResponse
     */
    CompletableFuture<RemoveChildAccountAuthResponse> removeChildAccountAuth(RemoveChildAccountAuthRequest request);

    /**
     * @param request the request parameters of RemoveHotel  RemoveHotelRequest
     * @return RemoveHotelResponse
     */
    CompletableFuture<RemoveHotelResponse> removeHotel(RemoveHotelRequest request);

    /**
     * @param request the request parameters of ResetWelcomeTextAndMusic  ResetWelcomeTextAndMusicRequest
     * @return ResetWelcomeTextAndMusicResponse
     */
    CompletableFuture<ResetWelcomeTextAndMusicResponse> resetWelcomeTextAndMusic(ResetWelcomeTextAndMusicRequest request);

    /**
     * @param request the request parameters of RoomCheckOut  RoomCheckOutRequest
     * @return RoomCheckOutResponse
     */
    CompletableFuture<RoomCheckOutResponse> roomCheckOut(RoomCheckOutRequest request);

    /**
     * @param request the request parameters of SubmitHotelOrder  SubmitHotelOrderRequest
     * @return SubmitHotelOrderResponse
     */
    CompletableFuture<SubmitHotelOrderResponse> submitHotelOrder(SubmitHotelOrderRequest request);

    /**
     * @param request the request parameters of SyncDeviceStatusWithAk  SyncDeviceStatusWithAkRequest
     * @return SyncDeviceStatusWithAkResponse
     */
    CompletableFuture<SyncDeviceStatusWithAkResponse> syncDeviceStatusWithAk(SyncDeviceStatusWithAkRequest request);

    /**
     * @param request the request parameters of UpdateBasicInfoQA  UpdateBasicInfoQARequest
     * @return UpdateBasicInfoQAResponse
     */
    CompletableFuture<UpdateBasicInfoQAResponse> updateBasicInfoQA(UpdateBasicInfoQARequest request);

    /**
     * @param request the request parameters of UpdateCustomQA  UpdateCustomQARequest
     * @return UpdateCustomQAResponse
     */
    CompletableFuture<UpdateCustomQAResponse> updateCustomQA(UpdateCustomQARequest request);

    /**
     * @param request the request parameters of UpdateHotel  UpdateHotelRequest
     * @return UpdateHotelResponse
     */
    CompletableFuture<UpdateHotelResponse> updateHotel(UpdateHotelRequest request);

    /**
     * @param request the request parameters of UpdateHotelAlarm  UpdateHotelAlarmRequest
     * @return UpdateHotelAlarmResponse
     */
    CompletableFuture<UpdateHotelAlarmResponse> updateHotelAlarm(UpdateHotelAlarmRequest request);

    /**
     * @param request the request parameters of UpdateHotelSceneBookItem  UpdateHotelSceneBookItemRequest
     * @return UpdateHotelSceneBookItemResponse
     */
    CompletableFuture<UpdateHotelSceneBookItemResponse> updateHotelSceneBookItem(UpdateHotelSceneBookItemRequest request);

    /**
     * @param request the request parameters of UpdateHotelSceneItem  UpdateHotelSceneItemRequest
     * @return UpdateHotelSceneItemResponse
     */
    CompletableFuture<UpdateHotelSceneItemResponse> updateHotelSceneItem(UpdateHotelSceneItemRequest request);

    /**
     * @param request the request parameters of UpdateMessageTemplate  UpdateMessageTemplateRequest
     * @return UpdateMessageTemplateResponse
     */
    CompletableFuture<UpdateMessageTemplateResponse> updateMessageTemplate(UpdateMessageTemplateRequest request);

    /**
     * @param request the request parameters of UpdateRcuScene  UpdateRcuSceneRequest
     * @return UpdateRcuSceneResponse
     */
    CompletableFuture<UpdateRcuSceneResponse> updateRcuScene(UpdateRcuSceneRequest request);

    /**
     * @param request the request parameters of UpdateServiceQA  UpdateServiceQARequest
     * @return UpdateServiceQAResponse
     */
    CompletableFuture<UpdateServiceQAResponse> updateServiceQA(UpdateServiceQARequest request);

    /**
     * @param request the request parameters of UpdateTicket  UpdateTicketRequest
     * @return UpdateTicketResponse
     */
    CompletableFuture<UpdateTicketResponse> updateTicket(UpdateTicketRequest request);

}
