// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCommentByCreatorIdRequest} extends {@link RequestModel}
 *
 * <p>DeleteCommentByCreatorIdRequest</p>
 */
public class DeleteCommentByCreatorIdRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("CommentIdList")
    private java.util.List < String > commentIdList;

    @Body
    @NameInMap("CreatorId")
    @Validation(required = true)
    private String creatorId;

    @Body
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private DeleteCommentByCreatorIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.commentIdList = builder.commentIdList;
        this.creatorId = builder.creatorId;
        this.roomId = builder.roomId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCommentByCreatorIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
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

    public static final class Builder extends Request.Builder<DeleteCommentByCreatorIdRequest, Builder> {
        private String regionId; 
        private String appId; 
        private java.util.List < String > commentIdList; 
        private String creatorId; 
        private String roomId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCommentByCreatorIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.commentIdList = request.commentIdList;
            this.creatorId = request.creatorId;
            this.roomId = request.roomId;
            this.userId = request.userId;
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
         * 弹幕的创建者ID。
         */
        public Builder creatorId(String creatorId) {
            this.putBodyParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
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
        public DeleteCommentByCreatorIdRequest build() {
            return new DeleteCommentByCreatorIdRequest(this);
        } 

    } 

}
