// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterImpPlayBackTimeByLiveIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeMeterImpPlayBackTimeByLiveIdRequest</p>
 */
public class DescribeMeterImpPlayBackTimeByLiveIdRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EndTs")
    @Validation(required = true)
    private Long endTs;

    @Query
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    @Query
    @NameInMap("StartTs")
    @Validation(required = true)
    private Long startTs;

    private DescribeMeterImpPlayBackTimeByLiveIdRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endTs = builder.endTs;
        this.liveId = builder.liveId;
        this.startTs = builder.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImpPlayBackTimeByLiveIdRequest create() {
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
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    public static final class Builder extends Request.Builder<DescribeMeterImpPlayBackTimeByLiveIdRequest, Builder> {
        private String appId; 
        private Long endTs; 
        private String liveId; 
        private Long startTs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMeterImpPlayBackTimeByLiveIdRequest request) {
            super(request);
            this.appId = request.appId;
            this.endTs = request.endTs;
            this.liveId = request.liveId;
            this.startTs = request.startTs;
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
         * EndTs.
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
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

        /**
         * StartTs.
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        @Override
        public DescribeMeterImpPlayBackTimeByLiveIdRequest build() {
            return new DescribeMeterImpPlayBackTimeByLiveIdRequest(this);
        } 

    } 

}
