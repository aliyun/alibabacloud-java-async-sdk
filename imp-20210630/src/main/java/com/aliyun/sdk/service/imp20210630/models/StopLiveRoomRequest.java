// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopLiveRoomRequest} extends {@link RequestModel}
 *
 * <p>StopLiveRoomRequest</p>
 */
public class StopLiveRoomRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("UserId")
    private String userId;

    private StopLiveRoomRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.liveId = builder.liveId;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopLiveRoomRequest create() {
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
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<StopLiveRoomRequest, Builder> {
        private String appId; 
        private String liveId; 
        private String regionId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(StopLiveRoomRequest response) {
            super(response);
            this.appId = response.appId;
            this.liveId = response.liveId;
            this.regionId = response.regionId;
            this.userId = response.userId;
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
         * 直播ID。
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
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
         * 操作人ID。
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public StopLiveRoomRequest build() {
            return new StopLiveRoomRequest(this);
        } 

    } 

}
