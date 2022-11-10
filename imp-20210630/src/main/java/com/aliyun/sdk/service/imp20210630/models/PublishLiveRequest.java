// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishLiveRequest} extends {@link RequestModel}
 *
 * <p>PublishLiveRequest</p>
 */
public class PublishLiveRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    @Body
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private PublishLiveRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.liveId = builder.liveId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishLiveRequest create() {
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
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<PublishLiveRequest, Builder> {
        private String regionId; 
        private String liveId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(PublishLiveRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.liveId = request.liveId;
            this.userId = request.userId;
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
         * 直播资源的唯一标识ID
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
            return this;
        }

        /**
         * 当前用户Id
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public PublishLiveRequest build() {
            return new PublishLiveRequest(this);
        } 

    } 

}
