// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendRoomUserNotificationRequest} extends {@link RequestModel}
 *
 * <p>SendRoomUserNotificationRequest</p>
 */
public class SendRoomUserNotificationRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("AppUid")
    @Validation(required = true)
    private String appUid;

    @Query
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Priority")
    private Integer priority;

    @Query
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    @Query
    @NameInMap("ToAppUid")
    @Validation(required = true)
    private String toAppUid;

    private SendRoomUserNotificationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appUid = builder.appUid;
        this.data = builder.data;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.roomId = builder.roomId;
        this.toAppUid = builder.toAppUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendRoomUserNotificationRequest create() {
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
     * @return appUid
     */
    public String getAppUid() {
        return this.appUid;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * @return toAppUid
     */
    public String getToAppUid() {
        return this.toAppUid;
    }

    public static final class Builder extends Request.Builder<SendRoomUserNotificationRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appUid; 
        private String data; 
        private Long ownerId; 
        private Integer priority; 
        private String roomId; 
        private String toAppUid; 

        private Builder() {
            super();
        } 

        private Builder(SendRoomUserNotificationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appUid = request.appUid;
            this.data = request.data;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.roomId = request.roomId;
            this.toAppUid = request.toAppUid;
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppUid.
         */
        public Builder appUid(String appUid) {
            this.putQueryParameter("AppUid", appUid);
            this.appUid = appUid;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RoomId.
         */
        public Builder roomId(String roomId) {
            this.putQueryParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * ToAppUid.
         */
        public Builder toAppUid(String toAppUid) {
            this.putQueryParameter("ToAppUid", toAppUid);
            this.toAppUid = toAppUid;
            return this;
        }

        @Override
        public SendRoomUserNotificationRequest build() {
            return new SendRoomUserNotificationRequest(this);
        } 

    } 

}
