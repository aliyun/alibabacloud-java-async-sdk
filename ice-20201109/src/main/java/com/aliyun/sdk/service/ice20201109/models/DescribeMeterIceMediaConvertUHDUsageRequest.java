// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterIceMediaConvertUHDUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeMeterIceMediaConvertUHDUsageRequest</p>
 */
public class DescribeMeterIceMediaConvertUHDUsageRequest extends Request {
    @Query
    @NameInMap("EndTs")
    @Validation(required = true)
    private Long endTs;

    @Query
    @NameInMap("Interval")
    @Validation(required = true)
    private String interval;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StartTs")
    @Validation(required = true)
    private Long startTs;

    private DescribeMeterIceMediaConvertUHDUsageRequest(Builder builder) {
        super(builder);
        this.endTs = builder.endTs;
        this.interval = builder.interval;
        this.regionId = builder.regionId;
        this.startTs = builder.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterIceMediaConvertUHDUsageRequest create() {
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
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTs
     */
    public Long getStartTs() {
        return this.startTs;
    }

    public static final class Builder extends Request.Builder<DescribeMeterIceMediaConvertUHDUsageRequest, Builder> {
        private Long endTs; 
        private String interval; 
        private String regionId; 
        private Long startTs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMeterIceMediaConvertUHDUsageRequest request) {
            super(request);
            this.endTs = request.endTs;
            this.interval = request.interval;
            this.regionId = request.regionId;
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
        public Builder interval(String interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public DescribeMeterIceMediaConvertUHDUsageRequest build() {
            return new DescribeMeterIceMediaConvertUHDUsageRequest(this);
        } 

    } 

}
