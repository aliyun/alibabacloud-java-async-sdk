// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.imp20210630.models.*;
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

    CompletableFuture<AddMemberResponse> addMember(AddMemberRequest request);

    CompletableFuture<AgreeLinkMicResponse> agreeLinkMic(AgreeLinkMicRequest request);

    CompletableFuture<ApplyLinkMicResponse> applyLinkMic(ApplyLinkMicRequest request);

    CompletableFuture<BanAllCommentResponse> banAllComment(BanAllCommentRequest request);

    CompletableFuture<BanCommentResponse> banComment(BanCommentRequest request);

    CompletableFuture<CancelApplyLinkMicResponse> cancelApplyLinkMic(CancelApplyLinkMicRequest request);

    CompletableFuture<CancelBanAllCommentResponse> cancelBanAllComment(CancelBanAllCommentRequest request);

    CompletableFuture<CancelBanCommentResponse> cancelBanComment(CancelBanCommentRequest request);

    CompletableFuture<CancelUserAdminResponse> cancelUserAdmin(CancelUserAdminRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateAppTemplateResponse> createAppTemplate(CreateAppTemplateRequest request);

    CompletableFuture<CreateClassResponse> createClass(CreateClassRequest request);

    CompletableFuture<CreateConferenceResponse> createConference(CreateConferenceRequest request);

    CompletableFuture<CreateLiveResponse> createLive(CreateLiveRequest request);

    CompletableFuture<CreateLiveRoomResponse> createLiveRoom(CreateLiveRoomRequest request);

    CompletableFuture<CreateRoomResponse> createRoom(CreateRoomRequest request);

    CompletableFuture<CreateSensitiveWordResponse> createSensitiveWord(CreateSensitiveWordRequest request);

    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    CompletableFuture<DeleteAppTemplateResponse> deleteAppTemplate(DeleteAppTemplateRequest request);

    CompletableFuture<DeleteClassResponse> deleteClass(DeleteClassRequest request);

    CompletableFuture<DeleteCommentResponse> deleteComment(DeleteCommentRequest request);

    CompletableFuture<DeleteConferenceResponse> deleteConference(DeleteConferenceRequest request);

    CompletableFuture<DeleteLiveResponse> deleteLive(DeleteLiveRequest request);

    CompletableFuture<DeleteLiveRoomResponse> deleteLiveRoom(DeleteLiveRoomRequest request);

    CompletableFuture<DeleteRoomResponse> deleteRoom(DeleteRoomRequest request);

    CompletableFuture<DeleteSensitiveWordResponse> deleteSensitiveWord(DeleteSensitiveWordRequest request);

    CompletableFuture<DescribeMeterImpPlayBackTimeByLiveIdResponse> describeMeterImpPlayBackTimeByLiveId(DescribeMeterImpPlayBackTimeByLiveIdRequest request);

    CompletableFuture<DescribeMeterImpWatchLiveTimeByLiveIdResponse> describeMeterImpWatchLiveTimeByLiveId(DescribeMeterImpWatchLiveTimeByLiveIdRequest request);

    CompletableFuture<GetAppResponse> getApp(GetAppRequest request);

    CompletableFuture<GetAppTemplateResponse> getAppTemplate(GetAppTemplateRequest request);

    CompletableFuture<GetAuthTokenResponse> getAuthToken(GetAuthTokenRequest request);

    CompletableFuture<GetClassDetailResponse> getClassDetail(GetClassDetailRequest request);

    CompletableFuture<GetClassRecordResponse> getClassRecord(GetClassRecordRequest request);

    CompletableFuture<GetConferenceResponse> getConference(GetConferenceRequest request);

    CompletableFuture<GetDomainOwnerVerifyContentResponse> getDomainOwnerVerifyContent(GetDomainOwnerVerifyContentRequest request);

    CompletableFuture<GetLiveResponse> getLive(GetLiveRequest request);

    CompletableFuture<GetLiveDomainStatusResponse> getLiveDomainStatus(GetLiveDomainStatusRequest request);

    CompletableFuture<GetLiveRecordResponse> getLiveRecord(GetLiveRecordRequest request);

    CompletableFuture<GetLiveRoomResponse> getLiveRoom(GetLiveRoomRequest request);

    CompletableFuture<GetLiveRoomStatisticsResponse> getLiveRoomStatistics(GetLiveRoomStatisticsRequest request);

    CompletableFuture<GetLiveRoomUserStatisticsResponse> getLiveRoomUserStatistics(GetLiveRoomUserStatisticsRequest request);

    CompletableFuture<GetRoomResponse> getRoom(GetRoomRequest request);

    CompletableFuture<GetStandardRoomHttpsCertificateResponse> getStandardRoomHttpsCertificate(GetStandardRoomHttpsCertificateRequest request);

    CompletableFuture<GetStandardRoomJumpUrlResponse> getStandardRoomJumpUrl(GetStandardRoomJumpUrlRequest request);

    CompletableFuture<KickRoomUserResponse> kickRoomUser(KickRoomUserRequest request);

    CompletableFuture<ListAppTemplatesResponse> listAppTemplates(ListAppTemplatesRequest request);

    CompletableFuture<ListApplyLinkMicUsersResponse> listApplyLinkMicUsers(ListApplyLinkMicUsersRequest request);

    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    CompletableFuture<ListClassesResponse> listClasses(ListClassesRequest request);

    CompletableFuture<ListCommentsResponse> listComments(ListCommentsRequest request);

    CompletableFuture<ListComponentsResponse> listComponents(ListComponentsRequest request);

    CompletableFuture<ListConferenceUsersResponse> listConferenceUsers(ListConferenceUsersRequest request);

    CompletableFuture<ListLiveRoomsResponse> listLiveRooms(ListLiveRoomsRequest request);

    CompletableFuture<ListLiveRoomsByIdResponse> listLiveRoomsById(ListLiveRoomsByIdRequest request);

    CompletableFuture<ListRoomUsersResponse> listRoomUsers(ListRoomUsersRequest request);

    CompletableFuture<ListRoomsResponse> listRooms(ListRoomsRequest request);

    CompletableFuture<ListSensitiveWordResponse> listSensitiveWord(ListSensitiveWordRequest request);

    CompletableFuture<PublishLiveResponse> publishLive(PublishLiveRequest request);

    CompletableFuture<PublishLiveRoomResponse> publishLiveRoom(PublishLiveRoomRequest request);

    CompletableFuture<RejectLinkMicResponse> rejectLinkMic(RejectLinkMicRequest request);

    CompletableFuture<RemoveMemberResponse> removeMember(RemoveMemberRequest request);

    CompletableFuture<SendCommentResponse> sendComment(SendCommentRequest request);

    CompletableFuture<SendCustomMessageToAllResponse> sendCustomMessageToAll(SendCustomMessageToAllRequest request);

    CompletableFuture<SendCustomMessageToUsersResponse> sendCustomMessageToUsers(SendCustomMessageToUsersRequest request);

    CompletableFuture<SetUserAdminResponse> setUserAdmin(SetUserAdminRequest request);

    CompletableFuture<StopClassResponse> stopClass(StopClassRequest request);

    CompletableFuture<StopLiveResponse> stopLive(StopLiveRequest request);

    CompletableFuture<StopLiveRoomResponse> stopLiveRoom(StopLiveRoomRequest request);

    CompletableFuture<UpdateAppResponse> updateApp(UpdateAppRequest request);

    CompletableFuture<UpdateAppTemplateResponse> updateAppTemplate(UpdateAppTemplateRequest request);

    CompletableFuture<UpdateAppTemplateConfigResponse> updateAppTemplateConfig(UpdateAppTemplateConfigRequest request);

    CompletableFuture<UpdateClassResponse> updateClass(UpdateClassRequest request);

    CompletableFuture<UpdateConferenceResponse> updateConference(UpdateConferenceRequest request);

    CompletableFuture<UpdateLiveResponse> updateLive(UpdateLiveRequest request);

    CompletableFuture<UpdateLiveRoomResponse> updateLiveRoom(UpdateLiveRoomRequest request);

    CompletableFuture<UpdateRoomResponse> updateRoom(UpdateRoomRequest request);

    CompletableFuture<VerifyDomainOwnerResponse> verifyDomainOwner(VerifyDomainOwnerRequest request);

}
