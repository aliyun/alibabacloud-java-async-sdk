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

    CompletableFuture<AddCartoonResponse> addCartoon(AddCartoonRequest request);

    CompletableFuture<AddCustomQAResponse> addCustomQA(AddCustomQARequest request);

    CompletableFuture<AddCustomQAV2Response> addCustomQAV2(AddCustomQAV2Request request);

    CompletableFuture<AddMessageTemplateResponse> addMessageTemplate(AddMessageTemplateRequest request);

    CompletableFuture<AddOrUpdateDisPlayModesResponse> addOrUpdateDisPlayModes(AddOrUpdateDisPlayModesRequest request);

    CompletableFuture<AddOrUpdateHotelSettingResponse> addOrUpdateHotelSetting(AddOrUpdateHotelSettingRequest request);

    CompletableFuture<AddOrUpdateScreenSaverResponse> addOrUpdateScreenSaver(AddOrUpdateScreenSaverRequest request);

    CompletableFuture<AddOrUpdateWelcomeTextResponse> addOrUpdateWelcomeText(AddOrUpdateWelcomeTextRequest request);

    CompletableFuture<AuditHotelResponse> auditHotel(AuditHotelRequest request);

    CompletableFuture<BatchAddHotelRoomResponse> batchAddHotelRoom(BatchAddHotelRoomRequest request);

    CompletableFuture<BatchDeleteHotelRoomResponse> batchDeleteHotelRoom(BatchDeleteHotelRoomRequest request);

    CompletableFuture<CheckoutWithAKResponse> checkoutWithAK(CheckoutWithAKRequest request);

    CompletableFuture<ChildAccountAuthResponse> childAccountAuth(ChildAccountAuthRequest request);

    CompletableFuture<ControlRoomDeviceResponse> controlRoomDevice(ControlRoomDeviceRequest request);

    CompletableFuture<CreateHotelResponse> createHotel(CreateHotelRequest request);

    CompletableFuture<CreateHotelAlarmResponse> createHotelAlarm(CreateHotelAlarmRequest request);

    CompletableFuture<CreateRcuSceneResponse> createRcuScene(CreateRcuSceneRequest request);

    CompletableFuture<DeleteCartoonResponse> deleteCartoon(DeleteCartoonRequest request);

    CompletableFuture<DeleteCustomQAResponse> deleteCustomQA(DeleteCustomQARequest request);

    CompletableFuture<DeleteHotelAlarmResponse> deleteHotelAlarm(DeleteHotelAlarmRequest request);

    CompletableFuture<DeleteHotelSceneBookItemResponse> deleteHotelSceneBookItem(DeleteHotelSceneBookItemRequest request);

    CompletableFuture<DeleteHotelSettingResponse> deleteHotelSetting(DeleteHotelSettingRequest request);

    CompletableFuture<DeleteMessageTemplateResponse> deleteMessageTemplate(DeleteMessageTemplateRequest request);

    CompletableFuture<DeleteRcuSceneResponse> deleteRcuScene(DeleteRcuSceneRequest request);

    CompletableFuture<DeviceControlResponse> deviceControl(DeviceControlRequest request);

    CompletableFuture<GetBasicInfoQAResponse> getBasicInfoQA(GetBasicInfoQARequest request);

    CompletableFuture<GetCartoonResponse> getCartoon(GetCartoonRequest request);

    CompletableFuture<GetHotelContactByGenieDeviceResponse> getHotelContactByGenieDevice(GetHotelContactByGenieDeviceRequest request);

    CompletableFuture<GetHotelContactByNumberResponse> getHotelContactByNumber(GetHotelContactByNumberRequest request);

    CompletableFuture<GetHotelContactsResponse> getHotelContacts(GetHotelContactsRequest request);

    CompletableFuture<GetHotelHomeBackImageAndModesResponse> getHotelHomeBackImageAndModes(GetHotelHomeBackImageAndModesRequest request);

    CompletableFuture<GetHotelNoticeResponse> getHotelNotice(GetHotelNoticeRequest request);

    CompletableFuture<GetHotelNoticeV2Response> getHotelNoticeV2(GetHotelNoticeV2Request request);

    CompletableFuture<GetHotelOrderDetailResponse> getHotelOrderDetail(GetHotelOrderDetailRequest request);

    CompletableFuture<GetHotelRoomDeviceResponse> getHotelRoomDevice(GetHotelRoomDeviceRequest request);

    CompletableFuture<GetHotelSampleUtterancesResponse> getHotelSampleUtterances(GetHotelSampleUtterancesRequest request);

    CompletableFuture<GetHotelSceneItemDetailResponse> getHotelSceneItemDetail(GetHotelSceneItemDetailRequest request);

    CompletableFuture<GetHotelScreenSaverResponse> getHotelScreenSaver(GetHotelScreenSaverRequest request);

    CompletableFuture<GetHotelScreenSaverStyleResponse> getHotelScreenSaverStyle(GetHotelScreenSaverStyleRequest request);

    CompletableFuture<GetHotelSettingResponse> getHotelSetting(GetHotelSettingRequest request);

    CompletableFuture<GetRelationProductListResponse> getRelationProductList(GetRelationProductListRequest request);

    CompletableFuture<GetUnionIdResponse> getUnionId(GetUnionIdRequest request);

    CompletableFuture<GetWelcomeTextAndMusicResponse> getWelcomeTextAndMusic(GetWelcomeTextAndMusicRequest request);

    CompletableFuture<HotelQrBindResponse> hotelQrBind(HotelQrBindRequest request);

    CompletableFuture<ImportHotelConfigResponse> importHotelConfig(ImportHotelConfigRequest request);

    CompletableFuture<ImportRoomControlDevicesResponse> importRoomControlDevices(ImportRoomControlDevicesRequest request);

    CompletableFuture<ImportRoomGenieScenesResponse> importRoomGenieScenes(ImportRoomGenieScenesRequest request);

    CompletableFuture<InsertHotelSceneBookItemResponse> insertHotelSceneBookItem(InsertHotelSceneBookItemRequest request);

    CompletableFuture<InvokeRobotPushResponse> invokeRobotPush(InvokeRobotPushRequest request);

    CompletableFuture<ListAllProvincesResponse> listAllProvinces(ListAllProvincesRequest request);

    CompletableFuture<ListCitiesByProvinceResponse> listCitiesByProvince(ListCitiesByProvinceRequest request);

    CompletableFuture<ListCustomQAResponse> listCustomQA(ListCustomQARequest request);

    CompletableFuture<ListDialogueTemplateResponse> listDialogueTemplate(ListDialogueTemplateRequest request);

    CompletableFuture<ListHotelAlarmResponse> listHotelAlarm(ListHotelAlarmRequest request);

    CompletableFuture<ListHotelControlDeviceResponse> listHotelControlDevice(ListHotelControlDeviceRequest request);

    CompletableFuture<ListHotelInfoResponse> listHotelInfo(ListHotelInfoRequest request);

    CompletableFuture<ListHotelMessageTemplateResponse> listHotelMessageTemplate(ListHotelMessageTemplateRequest request);

    CompletableFuture<ListHotelOrderResponse> listHotelOrder(ListHotelOrderRequest request);

    CompletableFuture<ListHotelRoomsResponse> listHotelRooms(ListHotelRoomsRequest request);

    CompletableFuture<ListHotelSceneBookItemsResponse> listHotelSceneBookItems(ListHotelSceneBookItemsRequest request);

    CompletableFuture<ListHotelSceneItemResponse> listHotelSceneItem(ListHotelSceneItemRequest request);

    CompletableFuture<ListHotelSceneItemsResponse> listHotelSceneItems(ListHotelSceneItemsRequest request);

    CompletableFuture<ListHotelServiceCategoryResponse> listHotelServiceCategory(ListHotelServiceCategoryRequest request);

    CompletableFuture<ListHotelsResponse> listHotels(ListHotelsRequest request);

    CompletableFuture<ListInfraredDeviceBrandsResponse> listInfraredDeviceBrands(ListInfraredDeviceBrandsRequest request);

    CompletableFuture<ListInfraredRemoteControllersResponse> listInfraredRemoteControllers(ListInfraredRemoteControllersRequest request);

    CompletableFuture<ListSTBServiceProvidersResponse> listSTBServiceProviders(ListSTBServiceProvidersRequest request);

    CompletableFuture<ListSceneCategoryResponse> listSceneCategory(ListSceneCategoryRequest request);

    CompletableFuture<ListServiceQAResponse> listServiceQA(ListServiceQARequest request);

    CompletableFuture<ListTicketsResponse> listTickets(ListTicketsRequest request);

    CompletableFuture<PageGetHotelRoomDevicesResponse> pageGetHotelRoomDevices(PageGetHotelRoomDevicesRequest request);

    CompletableFuture<PmsEventReportResponse> pmsEventReport(PmsEventReportRequest request);

    CompletableFuture<PushHotelMessageResponse> pushHotelMessage(PushHotelMessageRequest request);

    CompletableFuture<PushVoiceBoxCommandsResponse> pushVoiceBoxCommands(PushVoiceBoxCommandsRequest request);

    CompletableFuture<PushWelcomeResponse> pushWelcome(PushWelcomeRequest request);

    CompletableFuture<PushWelcomeTextAndMusicResponse> pushWelcomeTextAndMusic(PushWelcomeTextAndMusicRequest request);

    CompletableFuture<QueryDeviceStatusResponse> queryDeviceStatus(QueryDeviceStatusRequest request);

    CompletableFuture<QueryHotelRoomDetailResponse> queryHotelRoomDetail(QueryHotelRoomDetailRequest request);

    CompletableFuture<QueryRoomControlDevicesResponse> queryRoomControlDevices(QueryRoomControlDevicesRequest request);

    CompletableFuture<QuerySceneListResponse> querySceneList(QuerySceneListRequest request);

    CompletableFuture<RemoveChildAccountAuthResponse> removeChildAccountAuth(RemoveChildAccountAuthRequest request);

    CompletableFuture<RemoveHotelResponse> removeHotel(RemoveHotelRequest request);

    CompletableFuture<ResetWelcomeTextAndMusicResponse> resetWelcomeTextAndMusic(ResetWelcomeTextAndMusicRequest request);

    CompletableFuture<RoomCheckOutResponse> roomCheckOut(RoomCheckOutRequest request);

    CompletableFuture<SubmitHotelOrderResponse> submitHotelOrder(SubmitHotelOrderRequest request);

    CompletableFuture<SyncDeviceStatusWithAkResponse> syncDeviceStatusWithAk(SyncDeviceStatusWithAkRequest request);

    CompletableFuture<UpdateBasicInfoQAResponse> updateBasicInfoQA(UpdateBasicInfoQARequest request);

    CompletableFuture<UpdateCustomQAResponse> updateCustomQA(UpdateCustomQARequest request);

    CompletableFuture<UpdateHotelResponse> updateHotel(UpdateHotelRequest request);

    CompletableFuture<UpdateHotelAlarmResponse> updateHotelAlarm(UpdateHotelAlarmRequest request);

    CompletableFuture<UpdateHotelSceneBookItemResponse> updateHotelSceneBookItem(UpdateHotelSceneBookItemRequest request);

    CompletableFuture<UpdateHotelSceneItemResponse> updateHotelSceneItem(UpdateHotelSceneItemRequest request);

    CompletableFuture<UpdateMessageTemplateResponse> updateMessageTemplate(UpdateMessageTemplateRequest request);

    CompletableFuture<UpdateRcuSceneResponse> updateRcuScene(UpdateRcuSceneRequest request);

    CompletableFuture<UpdateServiceQAResponse> updateServiceQA(UpdateServiceQARequest request);

    CompletableFuture<UpdateTicketResponse> updateTicket(UpdateTicketRequest request);

}
