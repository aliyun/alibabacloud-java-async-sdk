// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConferenceRequest} extends {@link RequestModel}
 *
 * <p>DeleteConferenceRequest</p>
 */
public class DeleteConferenceRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("ConferenceId")
    @Validation(required = true)
    private String conferenceId;

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

    private DeleteConferenceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.conferenceId = builder.conferenceId;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConferenceRequest create() {
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
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
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

    public static final class Builder extends Request.Builder<DeleteConferenceRequest, Builder> {
        private String appId; 
        private String conferenceId; 
        private String regionId; 
        private String roomId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConferenceRequest request) {
            super(request);
            this.appId = request.appId;
            this.conferenceId = request.conferenceId;
            this.regionId = request.regionId;
            this.roomId = request.roomId;
            this.userId = request.userId;
        } 

        /**
         * 租户名
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 会议资源的唯一标识ID
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("ConferenceId", conferenceId);
            this.conferenceId = conferenceId;
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
         * 房间ID，最大长度36位
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * 创建会议用户ID
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteConferenceRequest build() {
            return new DeleteConferenceRequest(this);
        } 

    } 

}
