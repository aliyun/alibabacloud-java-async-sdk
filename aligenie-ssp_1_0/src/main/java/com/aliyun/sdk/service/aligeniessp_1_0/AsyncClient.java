// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aligeniessp_1_0.models.*;
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
     * @param request the request parameters of AddAndRemoveFavoriteContent  AddAndRemoveFavoriteContentRequest
     * @return AddAndRemoveFavoriteContentResponse
     */
    CompletableFuture<AddAndRemoveFavoriteContentResponse> addAndRemoveFavoriteContent(AddAndRemoveFavoriteContentRequest request);

    /**
     * @param request the request parameters of AddSub  AddSubRequest
     * @return AddSubResponse
     */
    CompletableFuture<AddSubResponse> addSub(AddSubRequest request);

    /**
     * @param request the request parameters of AuthLoginWithAligenieUserInfo  AuthLoginWithAligenieUserInfoRequest
     * @return AuthLoginWithAligenieUserInfoResponse
     */
    CompletableFuture<AuthLoginWithAligenieUserInfoResponse> authLoginWithAligenieUserInfo(AuthLoginWithAligenieUserInfoRequest request);

    /**
     * @param request the request parameters of AuthLoginWithAligenieUserInfoGeneratedByPhoneNumber  AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest
     * @return AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse
     */
    CompletableFuture<AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse> authLoginWithAligenieUserInfoGeneratedByPhoneNumber(AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest request);

    /**
     * @param request the request parameters of AuthLoginWithTaobaoUserInfo  AuthLoginWithTaobaoUserInfoRequest
     * @return AuthLoginWithTaobaoUserInfoResponse
     */
    CompletableFuture<AuthLoginWithTaobaoUserInfoResponse> authLoginWithTaobaoUserInfo(AuthLoginWithTaobaoUserInfoRequest request);

    /**
     * @param request the request parameters of AuthLoginWithThirdUserInfo  AuthLoginWithThirdUserInfoRequest
     * @return AuthLoginWithThirdUserInfoResponse
     */
    CompletableFuture<AuthLoginWithThirdUserInfoResponse> authLoginWithThirdUserInfo(AuthLoginWithThirdUserInfoRequest request);

    /**
     * @param request the request parameters of CheckAndDoVoipCallForHotel  CheckAndDoVoipCallForHotelRequest
     * @return CheckAndDoVoipCallForHotelResponse
     */
    CompletableFuture<CheckAndDoVoipCallForHotelResponse> checkAndDoVoipCallForHotel(CheckAndDoVoipCallForHotelRequest request);

    /**
     * @param request the request parameters of CheckAuthCodeBindForExt  CheckAuthCodeBindForExtRequest
     * @return CheckAuthCodeBindForExtResponse
     */
    CompletableFuture<CheckAuthCodeBindForExtResponse> checkAuthCodeBindForExt(CheckAuthCodeBindForExtRequest request);

    /**
     * <b>description</b> :
     * <p>After synchronously validating the input parameters, the system asynchronously creates the playlist.</p>
     * 
     * @param request the request parameters of CloudPlayer  CloudPlayerRequest
     * @return CloudPlayerResponse
     */
    CompletableFuture<CloudPlayerResponse> cloudPlayer(CloudPlayerRequest request);

    /**
     * @param request the request parameters of CreateAlarm  CreateAlarmRequest
     * @return CreateAlarmResponse
     */
    CompletableFuture<CreateAlarmResponse> createAlarm(CreateAlarmRequest request);

    /**
     * @param request the request parameters of CreatePlayingList  CreatePlayingListRequest
     * @return CreatePlayingListResponse
     */
    CompletableFuture<CreatePlayingListResponse> createPlayingList(CreatePlayingListRequest request);

    /**
     * @param request the request parameters of CreatePlayingListOAuth2  CreatePlayingListOAuth2Request
     * @return CreatePlayingListOAuth2Response
     */
    CompletableFuture<CreatePlayingListOAuth2Response> createPlayingListOAuth2(CreatePlayingListOAuth2Request request);

    /**
     * <b>description</b> :
     * <p>Configure a triggering task for Custom instruction data in the ecosystem based on scheduling rules such as one-time, daily, or business days.</p>
     * 
     * @param request the request parameters of CreateScheduleTask  CreateScheduleTaskRequest
     * @return CreateScheduleTaskResponse
     */
    CompletableFuture<CreateScheduleTaskResponse> createScheduleTask(CreateScheduleTaskRequest request);

    /**
     * @param request the request parameters of DeleteAlarms  DeleteAlarmsRequest
     * @return DeleteAlarmsResponse
     */
    CompletableFuture<DeleteAlarmsResponse> deleteAlarms(DeleteAlarmsRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified scheduled task by its ID.</p>
     * 
     * @param request the request parameters of DeleteScheduleTask  DeleteScheduleTaskRequest
     * @return DeleteScheduleTaskResponse
     */
    CompletableFuture<DeleteScheduleTaskResponse> deleteScheduleTask(DeleteScheduleTaskRequest request);

    /**
     * @param request the request parameters of DeleteSub  DeleteSubRequest
     * @return DeleteSubResponse
     */
    CompletableFuture<DeleteSubResponse> deleteSub(DeleteSubRequest request);

    /**
     * <b>description</b> :
     * <p>Specify a device to modify property values such as volume.</p>
     * 
     * @param request the request parameters of DeviceControl  DeviceControlRequest
     * @return DeviceControlResponse
     */
    CompletableFuture<DeviceControlResponse> deviceControl(DeviceControlRequest request);

    /**
     * <b>description</b> :
     * <p>Note: When the login state expires, the integrator must reinitiate the authorization login flow to obtain a new login state (entry service API: AuthLoginWithThirdUserInfo).</p>
     * <ul>
     * <li>Invoke the service API with the login-state access credential (LoginStateAccessToken) parameter by using the Java SDK (for SDKs in other languages, consult Tmall Genie developers during integration).<br>If the API call throws a TeaException and TeaException.code is InvalidAuthentication, the login state has expired.</li>
     * <li>Invoke the service API by sending an HTTP request with the login-state access credential (LoginStateAccessToken) parameter.<br>If the HTTP response status code returned by the API call is 400, the login state has expired.</li>
     * </ul>
     * 
     * @param request the request parameters of EcologyOpennessAuthenticate  EcologyOpennessAuthenticateRequest
     * @return EcologyOpennessAuthenticateResponse
     */
    CompletableFuture<EcologyOpennessAuthenticateResponse> ecologyOpennessAuthenticate(EcologyOpennessAuthenticateRequest request);

    /**
     * @param request the request parameters of EcologyOpennessSendVerificationCode  EcologyOpennessSendVerificationCodeRequest
     * @return EcologyOpennessSendVerificationCodeResponse
     */
    CompletableFuture<EcologyOpennessSendVerificationCodeResponse> ecologyOpennessSendVerificationCode(EcologyOpennessSendVerificationCodeRequest request);

    /**
     * @param request the request parameters of FindUserlistToAuthLoginWithPhoneNumber  FindUserlistToAuthLoginWithPhoneNumberRequest
     * @return FindUserlistToAuthLoginWithPhoneNumberResponse
     */
    CompletableFuture<FindUserlistToAuthLoginWithPhoneNumberResponse> findUserlistToAuthLoginWithPhoneNumber(FindUserlistToAuthLoginWithPhoneNumberRequest request);

    /**
     * @param request the request parameters of GetAlarm  GetAlarmRequest
     * @return GetAlarmResponse
     */
    CompletableFuture<GetAlarmResponse> getAlarm(GetAlarmRequest request);

    /**
     * @param request the request parameters of GetAlbum  GetAlbumRequest
     * @return GetAlbumResponse
     */
    CompletableFuture<GetAlbumResponse> getAlbum(GetAlbumRequest request);

    /**
     * @param request the request parameters of GetAlbumDetailById  GetAlbumDetailByIdRequest
     * @return GetAlbumDetailByIdResponse
     */
    CompletableFuture<GetAlbumDetailByIdResponse> getAlbumDetailById(GetAlbumDetailByIdRequest request);

    /**
     * <b>description</b> :
     * <p>Note: When the logon state expires, the integrator must initiate the authorization logon flow again to obtain a new logon state (entry service API: AuthLoginWithThirdUserInfo).</p>
     * <ul>
     * <li>Invoke the service API with the logon state access credential (LoginStateAccessToken) parameter by using the Java software development kit (SDK). For SDKs in other languages, consult the Tmall Genie developer team during integration.<br>If the API call throws a TeaException and TeaException.code is InvalidAuthentication, the logon state has expired.</li>
     * <li>Invoke the service API by sending an HTTP request with the logon state access credential (LoginStateAccessToken) parameter.<br>If the HTTP response status code returned by the API call is 400, the logon state has expired.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAligenieUserInfo  GetAligenieUserInfoRequest
     * @return GetAligenieUserInfoResponse
     */
    CompletableFuture<GetAligenieUserInfoResponse> getAligenieUserInfo(GetAligenieUserInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Obtain the corresponding authCode by specifying the user ID.</p>
     * 
     * @param request the request parameters of GetCodeEnhance  GetCodeEnhanceRequest
     * @return GetCodeEnhanceResponse
     */
    CompletableFuture<GetCodeEnhanceResponse> getCodeEnhance(GetCodeEnhanceRequest request);

    /**
     * @param request the request parameters of GetContent  GetContentRequest
     * @return GetContentResponse
     */
    CompletableFuture<GetContentResponse> getContent(GetContentRequest request);

    /**
     * @param request the request parameters of GetCurrentPlayingItem  GetCurrentPlayingItemRequest
     * @return GetCurrentPlayingItemResponse
     */
    CompletableFuture<GetCurrentPlayingItemResponse> getCurrentPlayingItem(GetCurrentPlayingItemRequest request);

    /**
     * @param request the request parameters of GetCurrentPlayingList  GetCurrentPlayingListRequest
     * @return GetCurrentPlayingListResponse
     */
    CompletableFuture<GetCurrentPlayingListResponse> getCurrentPlayingList(GetCurrentPlayingListRequest request);

    /**
     * @param request the request parameters of GetDeviceBasicInfo  GetDeviceBasicInfoRequest
     * @return GetDeviceBasicInfoResponse
     */
    CompletableFuture<GetDeviceBasicInfoResponse> getDeviceBasicInfo(GetDeviceBasicInfoRequest request);

    /**
     * @param request the request parameters of GetDeviceIdByIdentity  GetDeviceIdByIdentityRequest
     * @return GetDeviceIdByIdentityResponse
     */
    CompletableFuture<GetDeviceIdByIdentityResponse> getDeviceIdByIdentity(GetDeviceIdByIdentityRequest request);

    /**
     * @param request the request parameters of GetDeviceSetting  GetDeviceSettingRequest
     * @return GetDeviceSettingResponse
     */
    CompletableFuture<GetDeviceSettingResponse> getDeviceSetting(GetDeviceSettingRequest request);

    /**
     * @param request the request parameters of GetDeviceStatusDetail  GetDeviceStatusDetailRequest
     * @return GetDeviceStatusDetailResponse
     */
    CompletableFuture<GetDeviceStatusDetailResponse> getDeviceStatusDetail(GetDeviceStatusDetailRequest request);

    /**
     * @param request the request parameters of GetDeviceStatusInfo  GetDeviceStatusInfoRequest
     * @return GetDeviceStatusInfoResponse
     */
    CompletableFuture<GetDeviceStatusInfoResponse> getDeviceStatusInfo(GetDeviceStatusInfoRequest request);

    /**
     * @param request the request parameters of GetDeviceTag  GetDeviceTagRequest
     * @return GetDeviceTagResponse
     */
    CompletableFuture<GetDeviceTagResponse> getDeviceTag(GetDeviceTagRequest request);

    /**
     * @param request the request parameters of GetJiangSuTelecomData  GetJiangSuTelecomDataRequest
     * @return GetJiangSuTelecomDataResponse
     */
    CompletableFuture<GetJiangSuTelecomDataResponse> getJiangSuTelecomData(GetJiangSuTelecomDataRequest request);

    /**
     * <b>description</b> :
     * <p>Query the details of a specified scheduled task by its ID.</p>
     * 
     * @param request the request parameters of GetScheduleTask  GetScheduleTaskRequest
     * @return GetScheduleTaskResponse
     */
    CompletableFuture<GetScheduleTaskResponse> getScheduleTask(GetScheduleTaskRequest request);

    /**
     * @param request the request parameters of GetUnreadMessageCount  GetUnreadMessageCountRequest
     * @return GetUnreadMessageCountResponse
     */
    CompletableFuture<GetUnreadMessageCountResponse> getUnreadMessageCount(GetUnreadMessageCountRequest request);

    /**
     * @param request the request parameters of GetUserByDeviceId  GetUserByDeviceIdRequest
     * @return GetUserByDeviceIdResponse
     */
    CompletableFuture<GetUserByDeviceIdResponse> getUserByDeviceId(GetUserByDeviceIdRequest request);

    /**
     * <b>description</b> :
     * <p>Query the weather data for the location of the device based on the Device Information obtained from system parameters.</p>
     * 
     * @param request the request parameters of GetWeather  GetWeatherRequest
     * @return GetWeatherResponse
     */
    CompletableFuture<GetWeatherResponse> getWeather(GetWeatherRequest request);

    /**
     * @param request the request parameters of IndexControlPlayingList  IndexControlPlayingListRequest
     * @return IndexControlPlayingListResponse
     */
    CompletableFuture<IndexControlPlayingListResponse> indexControlPlayingList(IndexControlPlayingListRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Modify message notification template  </p>
     * <ul>
     * <li>You need to query the templateId first, then modify other parameters based on the templateId.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of InvalidateThirdPartyAppLoginState  InvalidateThirdPartyAppLoginStateRequest
     * @return InvalidateThirdPartyAppLoginStateResponse
     */
    CompletableFuture<InvalidateThirdPartyAppLoginStateResponse> invalidateThirdPartyAppLoginState(InvalidateThirdPartyAppLoginStateRequest request);

    /**
     * @param request the request parameters of ListAlarms  ListAlarmsRequest
     * @return ListAlarmsResponse
     */
    CompletableFuture<ListAlarmsResponse> listAlarms(ListAlarmsRequest request);

    /**
     * @param request the request parameters of ListAlbumDetail  ListAlbumDetailRequest
     * @return ListAlbumDetailResponse
     */
    CompletableFuture<ListAlbumDetailResponse> listAlbumDetail(ListAlbumDetailRequest request);

    /**
     * @param request the request parameters of ListAlbumIsAdded  ListAlbumIsAddedRequest
     * @return ListAlbumIsAddedResponse
     */
    CompletableFuture<ListAlbumIsAddedResponse> listAlbumIsAdded(ListAlbumIsAddedRequest request);

    /**
     * @param request the request parameters of ListCateContent  ListCateContentRequest
     * @return ListCateContentResponse
     */
    CompletableFuture<ListCateContentResponse> listCateContent(ListCateContentRequest request);

    /**
     * @param request the request parameters of ListCateInfo  ListCateInfoRequest
     * @return ListCateInfoResponse
     */
    CompletableFuture<ListCateInfoResponse> listCateInfo(ListCateInfoRequest request);

    /**
     * @param request the request parameters of ListCommonCateFirstFloor  ListCommonCateFirstFloorRequest
     * @return ListCommonCateFirstFloorResponse
     */
    CompletableFuture<ListCommonCateFirstFloorResponse> listCommonCateFirstFloor(ListCommonCateFirstFloorRequest request);

    /**
     * @param request the request parameters of ListCommonCateSecondFloor  ListCommonCateSecondFloorRequest
     * @return ListCommonCateSecondFloorResponse
     */
    CompletableFuture<ListCommonCateSecondFloorResponse> listCommonCateSecondFloor(ListCommonCateSecondFloorRequest request);

    /**
     * @param request the request parameters of ListDeviceBasicInfo  ListDeviceBasicInfoRequest
     * @return ListDeviceBasicInfoResponse
     */
    CompletableFuture<ListDeviceBasicInfoResponse> listDeviceBasicInfo(ListDeviceBasicInfoRequest request);

    /**
     * @param request the request parameters of ListDeviceByUserId  ListDeviceByUserIdRequest
     * @return ListDeviceByUserIdResponse
     */
    CompletableFuture<ListDeviceByUserIdResponse> listDeviceByUserId(ListDeviceByUserIdRequest request);

    /**
     * @param request the request parameters of ListDeviceByUserIdAndChanel  ListDeviceByUserIdAndChanelRequest
     * @return ListDeviceByUserIdAndChanelResponse
     */
    CompletableFuture<ListDeviceByUserIdAndChanelResponse> listDeviceByUserIdAndChanel(ListDeviceByUserIdAndChanelRequest request);

    /**
     * @param request the request parameters of ListDeviceIdByIdentities  ListDeviceIdByIdentitiesRequest
     * @return ListDeviceIdByIdentitiesResponse
     */
    CompletableFuture<ListDeviceIdByIdentitiesResponse> listDeviceIdByIdentities(ListDeviceIdByIdentitiesRequest request);

    /**
     * @param request the request parameters of ListMusic  ListMusicRequest
     * @return ListMusicResponse
     */
    CompletableFuture<ListMusicResponse> listMusic(ListMusicRequest request);

    /**
     * @param request the request parameters of ListPlayHistory  ListPlayHistoryRequest
     * @return ListPlayHistoryResponse
     */
    CompletableFuture<ListPlayHistoryResponse> listPlayHistory(ListPlayHistoryRequest request);

    /**
     * @param request the request parameters of ListRecommendContent  ListRecommendContentRequest
     * @return ListRecommendContentResponse
     */
    CompletableFuture<ListRecommendContentResponse> listRecommendContent(ListRecommendContentRequest request);

    /**
     * @param request the request parameters of ListSub  ListSubRequest
     * @return ListSubResponse
     */
    CompletableFuture<ListSubResponse> listSub(ListSubRequest request);

    /**
     * @param request the request parameters of ListSubAlbum  ListSubAlbumRequest
     * @return ListSubAlbumResponse
     */
    CompletableFuture<ListSubAlbumResponse> listSubAlbum(ListSubAlbumRequest request);

    /**
     * @param request the request parameters of ListSubscriptionAlbumCategory  ListSubscriptionAlbumCategoryRequest
     * @return ListSubscriptionAlbumCategoryResponse
     */
    CompletableFuture<ListSubscriptionAlbumCategoryResponse> listSubscriptionAlbumCategory(ListSubscriptionAlbumCategoryRequest request);

    /**
     * @param request the request parameters of ListUserMessage  ListUserMessageRequest
     * @return ListUserMessageResponse
     */
    CompletableFuture<ListUserMessageResponse> listUserMessage(ListUserMessageRequest request);

    /**
     * <b>description</b> :
     * <p>Different scenarios (such as daily recommendations and popular songs) can be distinguished by the Type parameter.</p>
     * 
     * @param request the request parameters of MobileRecommend  MobileRecommendRequest
     * @return MobileRecommendResponse
     */
    CompletableFuture<MobileRecommendResponse> mobileRecommend(MobileRecommendRequest request);

    /**
     * @param request the request parameters of PlayAndPauseControl  PlayAndPauseControlRequest
     * @return PlayAndPauseControlResponse
     */
    CompletableFuture<PlayAndPauseControlResponse> playAndPauseControl(PlayAndPauseControlRequest request);

    /**
     * @param request the request parameters of PlayModeControl  PlayModeControlRequest
     * @return PlayModeControlResponse
     */
    CompletableFuture<PlayModeControlResponse> playModeControl(PlayModeControlRequest request);

    /**
     * @param request the request parameters of PreviousAndNextControl  PreviousAndNextControlRequest
     * @return PreviousAndNextControlResponse
     */
    CompletableFuture<PreviousAndNextControlResponse> previousAndNextControl(PreviousAndNextControlRequest request);

    /**
     * @param request the request parameters of ProgressControl  ProgressControlRequest
     * @return ProgressControlResponse
     */
    CompletableFuture<ProgressControlResponse> progressControl(ProgressControlRequest request);

    /**
     * @param request the request parameters of PushDeviceRenderMessage  PushDeviceRenderMessageRequest
     * @return PushDeviceRenderMessageResponse
     */
    CompletableFuture<PushDeviceRenderMessageResponse> pushDeviceRenderMessage(PushDeviceRenderMessageRequest request);

    /**
     * @param request the request parameters of PushDeviceToastMessage  PushDeviceToastMessageRequest
     * @return PushDeviceToastMessageResponse
     */
    CompletableFuture<PushDeviceToastMessageResponse> pushDeviceToastMessage(PushDeviceToastMessageRequest request);

    /**
     * @param request the request parameters of QueryMusicType  QueryMusicTypeRequest
     * @return QueryMusicTypeResponse
     */
    CompletableFuture<QueryMusicTypeResponse> queryMusicType(QueryMusicTypeRequest request);

    /**
     * @param request the request parameters of QueryUserDeviceListByTmeUserId  QueryUserDeviceListByTmeUserIdRequest
     * @return QueryUserDeviceListByTmeUserIdResponse
     */
    CompletableFuture<QueryUserDeviceListByTmeUserIdResponse> queryUserDeviceListByTmeUserId(QueryUserDeviceListByTmeUserIdRequest request);

    /**
     * @param request the request parameters of ReadMessage  ReadMessageRequest
     * @return ReadMessageResponse
     */
    CompletableFuture<ReadMessageResponse> readMessage(ReadMessageRequest request);

    /**
     * <b>description</b> :
     * <p>Perform activation and attachment by scanning the QR code related to activation and attachment displayed on the device.</p>
     * 
     * @param request the request parameters of ScanCodeBind  ScanCodeBindRequest
     * @return ScanCodeBindResponse
     */
    CompletableFuture<ScanCodeBindResponse> scanCodeBind(ScanCodeBindRequest request);

    /**
     * @param request the request parameters of ScgSearch  ScgSearchRequest
     * @return ScgSearchResponse
     */
    CompletableFuture<ScgSearchResponse> scgSearch(ScgSearchRequest request);

    /**
     * @param request the request parameters of SearchContent  SearchContentRequest
     * @return SearchContentResponse
     */
    CompletableFuture<SearchContentResponse> searchContent(SearchContentRequest request);

    /**
     * @param request the request parameters of SendMessage  SendMessageRequest
     * @return SendMessageResponse
     */
    CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request);

    /**
     * @param request the request parameters of SetDeviceSetting  SetDeviceSettingRequest
     * @return SetDeviceSettingResponse
     */
    CompletableFuture<SetDeviceSettingResponse> setDeviceSetting(SetDeviceSettingRequest request);

    /**
     * @param request the request parameters of ThirdImmediateMsgPush  ThirdImmediateMsgPushRequest
     * @return ThirdImmediateMsgPushResponse
     */
    CompletableFuture<ThirdImmediateMsgPushResponse> thirdImmediateMsgPush(ThirdImmediateMsgPushRequest request);

    /**
     * <b>description</b> :
     * <p>Note: When the logon credential expires, the integrator must initiate the authorization logon flow again to obtain a new logon credential (entry service API: AuthLoginWithThirdUserInfo).</p>
     * <ul>
     * <li>Invoke the service API with the logon credential (LoginStateAccessToken) parameter via the Java software development kit (SDK). For SDKs in other languages, consult Tmall Genie developers during integration.<br>If the API call throws a TeaException and TeaException.code is &quot;InvalidAuthentication&quot;, the logon credential has expired.</li>
     * <li>Invoke the service API by sending an HTTP request with the logon credential (LoginStateAccessToken) parameter.<br>If the HTTP response status code returned by the API call is 400, the logon credential has expired.</li>
     * </ul>
     * 
     * @param request the request parameters of UnbindAligenieUser  UnbindAligenieUserRequest
     * @return UnbindAligenieUserResponse
     */
    CompletableFuture<UnbindAligenieUserResponse> unbindAligenieUser(UnbindAligenieUserRequest request);

    /**
     * @param request the request parameters of UnbindDevice  UnbindDeviceRequest
     * @return UnbindDeviceResponse
     */
    CompletableFuture<UnbindDeviceResponse> unbindDevice(UnbindDeviceRequest request);

    /**
     * @param request the request parameters of UpdateAlarm  UpdateAlarmRequest
     * @return UpdateAlarmResponse
     */
    CompletableFuture<UpdateAlarmResponse> updateAlarm(UpdateAlarmRequest request);

}
