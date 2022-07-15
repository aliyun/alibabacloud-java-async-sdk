// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCommentRequest} extends {@link RequestModel}
 *
 * <p>DeleteCommentRequest</p>
 */
public class DeleteCommentRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("CommentIdList")
    @Validation(required = true)
    private java.util.List < String > commentIdList;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private DeleteCommentRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.commentIdList = builder.commentIdList;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCommentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return commentIdList
     */
    public java.util.List < String > getCommentIdList() {
        return this.commentIdList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteCommentRequest, Builder> {
        private String appId; 
        private java.util.List < String > commentIdList; 
        private String regionId; 
        private String roomId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCommentRequest request) {
            super(request);
            this.appId = request.appId;
            this.commentIdList = request.commentIdList;
            this.regionId = request.regionId;
            this.roomId = request.roomId;
            this.userId = request.userId;
        } 

        /**
         * 应用唯一标识，可以包含小写字母、数字，长度为6个字符。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 需要删除的弹幕id列表
         */
        public Builder commentIdList(java.util.List < String > commentIdList) {
            this.putBodyParameter("CommentIdList", commentIdList);
            this.commentIdList = commentIdList;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 直播间唯一标识，在调用CreateRoom返回。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * 删除的操作人ID。
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteCommentRequest build() {
            return new DeleteCommentRequest(this);
        } 

    } 

}
