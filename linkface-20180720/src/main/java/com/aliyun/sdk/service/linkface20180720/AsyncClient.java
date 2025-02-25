// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkface20180720;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkface20180720.models.*;
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
     * @param request the request parameters of CreateGroup  CreateGroupRequest
     * @return CreateGroupResponse
     */
    CompletableFuture<CreateGroupResponse> createGroup(CreateGroupRequest request);

    /**
     * @param request the request parameters of DeleteDeviceAllGroup  DeleteDeviceAllGroupRequest
     * @return DeleteDeviceAllGroupResponse
     */
    CompletableFuture<DeleteDeviceAllGroupResponse> deleteDeviceAllGroup(DeleteDeviceAllGroupRequest request);

    /**
     * @param request the request parameters of DeleteDeviceGroup  DeleteDeviceGroupRequest
     * @return DeleteDeviceGroupResponse
     */
    CompletableFuture<DeleteDeviceGroupResponse> deleteDeviceGroup(DeleteDeviceGroupRequest request);

    /**
     * @param request the request parameters of DeleteFace  DeleteFaceRequest
     * @return DeleteFaceResponse
     */
    CompletableFuture<DeleteFaceResponse> deleteFace(DeleteFaceRequest request);

    /**
     * @param request the request parameters of DeleteGroup  DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    CompletableFuture<DeleteGroupResponse> deleteGroup(DeleteGroupRequest request);

    /**
     * @param request the request parameters of LinkFace  LinkFaceRequest
     * @return LinkFaceResponse
     */
    CompletableFuture<LinkFaceResponse> linkFace(LinkFaceRequest request);

    /**
     * @param request the request parameters of QueryAddUserInfo  QueryAddUserInfoRequest
     * @return QueryAddUserInfoResponse
     */
    CompletableFuture<QueryAddUserInfoResponse> queryAddUserInfo(QueryAddUserInfoRequest request);

    /**
     * @param request the request parameters of QueryAllGroups  QueryAllGroupsRequest
     * @return QueryAllGroupsResponse
     */
    CompletableFuture<QueryAllGroupsResponse> queryAllGroups(QueryAllGroupsRequest request);

    /**
     * @param request the request parameters of QueryAuthentication  QueryAuthenticationRequest
     * @return QueryAuthenticationResponse
     */
    CompletableFuture<QueryAuthenticationResponse> queryAuthentication(QueryAuthenticationRequest request);

    /**
     * @param request the request parameters of QueryFace  QueryFaceRequest
     * @return QueryFaceResponse
     */
    CompletableFuture<QueryFaceResponse> queryFace(QueryFaceRequest request);

    /**
     * @param request the request parameters of QueryGroupUsers  QueryGroupUsersRequest
     * @return QueryGroupUsersResponse
     */
    CompletableFuture<QueryGroupUsersResponse> queryGroupUsers(QueryGroupUsersRequest request);

    /**
     * @param request the request parameters of QueryLicenses  QueryLicensesRequest
     * @return QueryLicensesResponse
     */
    CompletableFuture<QueryLicensesResponse> queryLicenses(QueryLicensesRequest request);

    /**
     * @param request the request parameters of QuerySyncPicSchedule  QuerySyncPicScheduleRequest
     * @return QuerySyncPicScheduleResponse
     */
    CompletableFuture<QuerySyncPicScheduleResponse> querySyncPicSchedule(QuerySyncPicScheduleRequest request);

    /**
     * @param request the request parameters of RegisterFace  RegisterFaceRequest
     * @return RegisterFaceResponse
     */
    CompletableFuture<RegisterFaceResponse> registerFace(RegisterFaceRequest request);

    /**
     * @param request the request parameters of SearchFace  SearchFaceRequest
     * @return SearchFaceResponse
     */
    CompletableFuture<SearchFaceResponse> searchFace(SearchFaceRequest request);

    /**
     * @param request the request parameters of SyncFacePictures  SyncFacePicturesRequest
     * @return SyncFacePicturesResponse
     */
    CompletableFuture<SyncFacePicturesResponse> syncFacePictures(SyncFacePicturesRequest request);

    /**
     * @param request the request parameters of UnlinkFace  UnlinkFaceRequest
     * @return UnlinkFaceResponse
     */
    CompletableFuture<UnlinkFaceResponse> unlinkFace(UnlinkFaceRequest request);

    /**
     * @param request the request parameters of UpdateFace  UpdateFaceRequest
     * @return UpdateFaceResponse
     */
    CompletableFuture<UpdateFaceResponse> updateFace(UpdateFaceRequest request);

}
