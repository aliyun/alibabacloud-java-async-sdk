// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

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

    private DeleteRoomRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<DeleteRoomRequest, Builder> {
        private String appId; 
        private String regionId; 
        private String roomId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRoomRequest response) {
            super(response);
            this.appId = response.appId;
            this.regionId = response.regionId;
            this.roomId = response.roomId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 房间唯一标识，由字母、数字、符号.和-组成，最大长度36位。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        @Override
        public DeleteRoomRequest build() {
            return new DeleteRoomRequest(this);
        } 

    } 

}
