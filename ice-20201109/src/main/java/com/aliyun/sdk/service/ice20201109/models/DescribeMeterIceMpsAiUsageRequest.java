// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterIceMpsAiUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeMeterIceMpsAiUsageRequest</p>
 */
public class DescribeMeterIceMpsAiUsageRequest extends Request {
    @Query
    @NameInMap("EndTs")
    @Validation(required = true)
    private Long endTs;

    @Query
    @NameInMap("Interval")
    @Validation(required = true)
    private Long interval;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("StartTs")
    @Validation(required = true)
    private Long startTs;

    private DescribeMeterIceMpsAiUsageRequest(Builder builder) {
        super(builder);
        this.endTs = builder.endTs;
        this.interval = builder.interval;
        this.region = builder.region;
        this.startTs = builder.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterIceMpsAiUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTs
     */
    public Long getEndTs() {
        return this.endTs;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    public static final class Builder extends Request.Builder<DescribeMeterIceMpsAiUsageRequest, Builder> {
        private Long endTs; 
        private Long interval; 
        private String region; 
        private Long startTs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMeterIceMpsAiUsageRequest request) {
            super(request);
            this.endTs = request.endTs;
            this.interval = request.interval;
            this.region = request.region;
            this.startTs = request.startTs;
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
         * Interval.
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
        public DescribeMeterIceMpsAiUsageRequest build() {
            return new DescribeMeterIceMpsAiUsageRequest(this);
        } 

    } 

}
