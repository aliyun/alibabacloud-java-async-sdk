// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KickRoomUserRequest} extends {@link RequestModel}
 *
 * <p>KickRoomUserRequest</p>
 */
public class KickRoomUserRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("BlockTime")
    private Long blockTime;

    @Body
    @NameInMap("KickUser")
    @Validation(required = true)
    private String kickUser;

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

    private KickRoomUserRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.blockTime = builder.blockTime;
        this.kickUser = builder.kickUser;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KickRoomUserRequest create() {
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
     * @return blockTime
     */
    public Long getBlockTime() {
        return this.blockTime;
    }

    /**
     * @return kickUser
     */
    public String getKickUser() {
        return this.kickUser;
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

    public static final class Builder extends Request.Builder<KickRoomUserRequest, Builder> {
        private String appId; 
        private Long blockTime; 
        private String kickUser; 
        private String regionId; 
        private String roomId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(KickRoomUserRequest request) {
            super(request);
            this.appId = request.appId;
            this.blockTime = request.blockTime;
            this.kickUser = request.kickUser;
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
         * BlockTime.
         */
        public Builder blockTime(Long blockTime) {
            this.putBodyParameter("BlockTime", blockTime);
            this.blockTime = blockTime;
            return this;
        }

        /**
         * 被踢出房间的用户ID。
         */
        public Builder kickUser(String kickUser) {
            this.putBodyParameter("KickUser", kickUser);
            this.kickUser = kickUser;
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
         * 房间唯一标识，由字母、数字、符号.和-组成，最大长度36位，传空则随机生成一个房间id。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * 操作人的用户ID，用于表示谁执行了踢人操作。
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public KickRoomUserRequest build() {
            return new KickRoomUserRequest(this);
        } 

    } 

}
