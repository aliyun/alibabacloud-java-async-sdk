// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConferenceRequest} extends {@link RequestModel}
 *
 * <p>CreateConferenceRequest</p>
 */
public class CreateConferenceRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private CreateConferenceRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
        this.title = builder.title;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConferenceRequest create() {
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateConferenceRequest, Builder> {
        private String appId; 
        private String regionId; 
        private String roomId; 
        private String title; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConferenceRequest request) {
            super(request);
            this.appId = request.appId;
            this.regionId = request.regionId;
            this.roomId = request.roomId;
            this.title = request.title;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 房间ID，最大长度36个字符，传空值，则随机生成一个房间ID。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * 会议标题，支持中英文，最大长度256位。
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * 创建会议用户。
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateConferenceRequest build() {
            return new CreateConferenceRequest(this);
        } 

    } 

}
