// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveRoomRequest} extends {@link RequestModel}
 *
 * <p>GetLiveRoomRequest</p>
 */
public class GetLiveRoomRequest extends Request {
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

    private GetLiveRoomRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.liveId = builder.liveId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveRoomRequest create() {
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

    public static final class Builder extends Request.Builder<GetLiveRoomRequest, Builder> {
        private String appId; 
        private String liveId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetLiveRoomRequest request) {
            super(request);
            this.appId = request.appId;
            this.liveId = request.liveId;
            this.regionId = request.regionId;
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

        @Override
        public GetLiveRoomRequest build() {
            return new GetLiveRoomRequest(this);
        } 

    } 

}
