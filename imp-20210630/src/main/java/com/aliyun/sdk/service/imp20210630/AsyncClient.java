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

    CompletableFuture<BanAllCommentResponse> banAllComment(BanAllCommentRequest request);

    CompletableFuture<BanCommentResponse> banComment(BanCommentRequest request);

    CompletableFuture<CancelBanAllCommentResponse> cancelBanAllComment(CancelBanAllCommentRequest request);

    CompletableFuture<CancelBanCommentResponse> cancelBanComment(CancelBanCommentRequest request);

    CompletableFuture<CancelUserAdminResponse> cancelUserAdmin(CancelUserAdminRequest request);

    CompletableFuture<CreateClassResponse> createClass(CreateClassRequest request);

    CompletableFuture<CreateLiveResponse> createLive(CreateLiveRequest request);

    CompletableFuture<CreateLiveRecordSliceFileResponse> createLiveRecordSliceFile(CreateLiveRecordSliceFileRequest request);

    CompletableFuture<CreateLiveRoomResponse> createLiveRoom(CreateLiveRoomRequest request);

    CompletableFuture<CreateRoomResponse> createRoom(CreateRoomRequest request);

    CompletableFuture<CreateSensitiveWordResponse> createSensitiveWord(CreateSensitiveWordRequest request);

    CompletableFuture<DeleteClassResponse> deleteClass(DeleteClassRequest request);

    CompletableFuture<DeleteCommentResponse> deleteComment(DeleteCommentRequest request);

    CompletableFuture<DeleteCommentByCreatorIdResponse> deleteCommentByCreatorId(DeleteCommentByCreatorIdRequest request);

    CompletableFuture<DeleteConferenceResponse> deleteConference(DeleteConferenceRequest request);

    CompletableFuture<DeleteLiveResponse> deleteLive(DeleteLiveRequest request);

    CompletableFuture<DeleteLiveRoomResponse> deleteLiveRoom(DeleteLiveRoomRequest request);

    CompletableFuture<DeleteRoomResponse> deleteRoom(DeleteRoomRequest request);

    CompletableFuture<DeleteSensitiveWordResponse> deleteSensitiveWord(DeleteSensitiveWordRequest request);

    CompletableFuture<DescribeMeterImpPlayBackTimeByLiveIdResponse> describeMeterImpPlayBackTimeByLiveId(DescribeMeterImpPlayBackTimeByLiveIdRequest request);

    CompletableFuture<DescribeMeterImpWatchLiveTimeByLiveIdResponse> describeMeterImpWatchLiveTimeByLiveId(DescribeMeterImpWatchLiveTimeByLiveIdRequest request);

    CompletableFuture<GetAuthTokenResponse> getAuthToken(GetAuthTokenRequest request);

    CompletableFuture<GetClassDetailResponse> getClassDetail(GetClassDetailRequest request);

    CompletableFuture<GetClassRecordResponse> getClassRecord(GetClassRecordRequest request);

    CompletableFuture<GetConferenceResponse> getConference(GetConferenceRequest request);

    CompletableFuture<GetLiveResponse> getLive(GetLiveRequest request);

    CompletableFuture<GetLiveRecordResponse> getLiveRecord(GetLiveRecordRequest request);

    CompletableFuture<GetLiveRoomResponse> getLiveRoom(GetLiveRoomRequest request);

    CompletableFuture<GetLiveRoomStatisticsResponse> getLiveRoomStatistics(GetLiveRoomStatisticsRequest request);

    CompletableFuture<GetLiveRoomUserStatisticsResponse> getLiveRoomUserStatistics(GetLiveRoomUserStatisticsRequest request);

    CompletableFuture<GetRoomResponse> getRoom(GetRoomRequest request);

    CompletableFuture<GetStandardRoomJumpUrlResponse> getStandardRoomJumpUrl(GetStandardRoomJumpUrlRequest request);

    CompletableFuture<KickRoomUserResponse> kickRoomUser(KickRoomUserRequest request);

    CompletableFuture<ListClassesResponse> listClasses(ListClassesRequest request);

    CompletableFuture<ListCommentsResponse> listComments(ListCommentsRequest request);

    CompletableFuture<ListConferenceUsersResponse> listConferenceUsers(ListConferenceUsersRequest request);

    CompletableFuture<ListLiveRoomsResponse> listLiveRooms(ListLiveRoomsRequest request);

    CompletableFuture<ListLiveRoomsByIdResponse> listLiveRoomsById(ListLiveRoomsByIdRequest request);

    CompletableFuture<ListRoomUsersResponse> listRoomUsers(ListRoomUsersRequest request);

    CompletableFuture<ListRoomsResponse> listRooms(ListRoomsRequest request);

    CompletableFuture<ListSensitiveWordResponse> listSensitiveWord(ListSensitiveWordRequest request);

    CompletableFuture<PublishLiveResponse> publishLive(PublishLiveRequest request);

    CompletableFuture<PublishLiveRoomResponse> publishLiveRoom(PublishLiveRoomRequest request);

    CompletableFuture<RemoveMemberResponse> removeMember(RemoveMemberRequest request);

    CompletableFuture<SendCommentResponse> sendComment(SendCommentRequest request);

    CompletableFuture<SendCustomMessageToAllResponse> sendCustomMessageToAll(SendCustomMessageToAllRequest request);

    CompletableFuture<SendCustomMessageToUsersResponse> sendCustomMessageToUsers(SendCustomMessageToUsersRequest request);

    CompletableFuture<SetUserAdminResponse> setUserAdmin(SetUserAdminRequest request);

    CompletableFuture<StopClassResponse> stopClass(StopClassRequest request);

    CompletableFuture<StopLiveResponse> stopLive(StopLiveRequest request);

    CompletableFuture<StopLiveRoomResponse> stopLiveRoom(StopLiveRoomRequest request);

    CompletableFuture<UpdateClassResponse> updateClass(UpdateClassRequest request);

    CompletableFuture<UpdateLiveResponse> updateLive(UpdateLiveRequest request);

    CompletableFuture<UpdateLiveRoomResponse> updateLiveRoom(UpdateLiveRoomRequest request);

    CompletableFuture<UpdateRoomResponse> updateRoom(UpdateRoomRequest request);

    CompletableFuture<UpdateShareScreenLayoutResponse> updateShareScreenLayout(UpdateShareScreenLayoutRequest request);

}
