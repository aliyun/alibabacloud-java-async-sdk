// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoomRequest} extends {@link RequestModel}
 *
 * <p>GetRoomRequest</p>
 */
public class GetRoomRequest extends Request {
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

    private GetRoomRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoomRequest create() {
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

    public static final class Builder extends Request.Builder<GetRoomRequest, Builder> {
        private String appId; 
        private String regionId; 
        private String roomId; 

        private Builder() {
            super();
        } 

        private Builder(GetRoomRequest request) {
            super(request);
            this.appId = request.appId;
            this.regionId = request.regionId;
            this.roomId = request.roomId;
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
        public GetRoomRequest build() {
            return new GetRoomRequest(this);
        } 

    } 

}
