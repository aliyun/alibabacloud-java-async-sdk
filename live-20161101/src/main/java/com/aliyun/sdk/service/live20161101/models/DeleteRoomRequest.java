// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRoomRequest} extends {@link RequestModel}
 *
 * <p>DeleteRoomRequest</p>
 */
public class DeleteRoomRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    private DeleteRoomRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.ownerId = builder.ownerId;
        this.roomId = builder.roomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRoomRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    public static final class Builder extends Request.Builder<DeleteRoomRequest, Builder> {
        private String regionId; 
        private String appId; 
        private Long ownerId; 
        private String roomId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoomRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.ownerId = request.ownerId;
            this.roomId = request.roomId;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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

        @Override
        public DeleteRoomRequest build() {
            return new DeleteRoomRequest(this);
        } 

    } 

}
