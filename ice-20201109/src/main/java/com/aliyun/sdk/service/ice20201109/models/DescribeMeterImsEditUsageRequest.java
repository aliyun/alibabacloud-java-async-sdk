// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMeterImsEditUsageRequest} extends {@link RequestModel}
 *
 * <p>DescribeMeterImsEditUsageRequest</p>
 */
public class DescribeMeterImsEditUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTs;

    private DescribeMeterImsEditUsageRequest(Builder builder) {
        super(builder);
        this.endTs = builder.endTs;
        this.interval = builder.interval;
        this.region = builder.region;
        this.startTs = builder.startTs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterImsEditUsageRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeMeterImsEditUsageRequest, Builder> {
        private Long endTs; 
        private Long interval; 
        private String region; 
        private Long startTs; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMeterImsEditUsageRequest request) {
            super(request);
            this.endTs = request.endTs;
            this.interval = request.interval;
            this.region = request.region;
            this.startTs = request.startTs;
        } 

        /**
         * <p>The end of the time range to query. The value is a 10-digit timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656995036</p>
         */
        public Builder endTs(Long endTs) {
            this.putQueryParameter("EndTs", endTs);
            this.endTs = endTs;
            return this;
        }

        /**
         * <p>The time granularity of the query. Valid values: 3600 (hour) and 86400 (day).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86400</p>
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>This parameter does not take effect. By default, the usage data of all regions is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The value is a 10-digit timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1654403036</p>
         */
        public Builder startTs(Long startTs) {
            this.putQueryParameter("StartTs", startTs);
            this.startTs = startTs;
            return this;
        }

        @Override
        public DescribeMeterImsEditUsageRequest build() {
            return new DescribeMeterImsEditUsageRequest(this);
        } 

    } 

}
