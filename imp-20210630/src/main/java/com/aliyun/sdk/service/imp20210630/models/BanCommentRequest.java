// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BanCommentRequest} extends {@link RequestModel}
 *
 * <p>BanCommentRequest</p>
 */
public class BanCommentRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("BanCommentTime")
    private Long banCommentTime;

    @Body
    @NameInMap("BanCommentUser")
    @Validation(required = true)
    private String banCommentUser;

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

    private BanCommentRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.banCommentTime = builder.banCommentTime;
        this.banCommentUser = builder.banCommentUser;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BanCommentRequest create() {
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
     * @return banCommentTime
     */
    public Long getBanCommentTime() {
        return this.banCommentTime;
    }

    /**
     * @return banCommentUser
     */
    public String getBanCommentUser() {
        return this.banCommentUser;
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

    public static final class Builder extends Request.Builder<BanCommentRequest, Builder> {
        private String appId; 
        private Long banCommentTime; 
        private String banCommentUser; 
        private String regionId; 
        private String roomId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(BanCommentRequest request) {
            super(request);
            this.appId = request.appId;
            this.banCommentTime = request.banCommentTime;
            this.banCommentUser = request.banCommentUser;
            this.regionId = request.regionId;
            this.roomId = request.roomId;
            this.userId = request.userId;
        } 

        /**
         * 应用唯一标识，由6位小写字母、数字组成。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 禁言时长（秒）
         */
        public Builder banCommentTime(Long banCommentTime) {
            this.putBodyParameter("BanCommentTime", banCommentTime);
            this.banCommentTime = banCommentTime;
            return this;
        }

        /**
         * 被禁言的用户在房间内的唯一标识
         */
        public Builder banCommentUser(String banCommentUser) {
            this.putBodyParameter("BanCommentUser", banCommentUser);
            this.banCommentUser = banCommentUser;
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
         * 房间唯一标识，由调用CreateRoom返回。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * 用户在房间内的唯一标识
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public BanCommentRequest build() {
            return new BanCommentRequest(this);
        } 

    } 

}
