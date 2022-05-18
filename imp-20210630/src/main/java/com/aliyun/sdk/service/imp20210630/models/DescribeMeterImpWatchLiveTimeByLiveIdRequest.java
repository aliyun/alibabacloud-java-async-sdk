// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterImpWatchLiveTimeByLiveIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeMeterImpWatchLiveTimeByLiveIdRequest</p>
 */
public class DescribeMeterImpWatchLiveTimeByLiveIdRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    private DescribeMeterImpWatchLiveTimeByLiveIdRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.liveId = builder.liveId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImpWatchLiveTimeByLiveIdRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeMeterImpWatchLiveTimeByLiveIdRequest, Builder> {
        private String appId; 
        private String liveId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMeterImpWatchLiveTimeByLiveIdRequest request) {
            super(request);
            this.appId = request.appId;
            this.liveId = request.liveId;
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
         * LiveId.
         */
        public Builder liveId(String liveId) {
            this.putQueryParameter("LiveId", liveId);
            this.liveId = liveId;
            return this;
        }

        @Override
        public DescribeMeterImpWatchLiveTimeByLiveIdRequest build() {
            return new DescribeMeterImpWatchLiveTimeByLiveIdRequest(this);
        } 

    } 

}
