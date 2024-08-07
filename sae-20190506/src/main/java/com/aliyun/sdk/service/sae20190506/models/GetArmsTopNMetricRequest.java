// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetArmsTopNMetricRequest} extends {@link RequestModel}
 *
 * <p>GetArmsTopNMetricRequest</p>
 */
public class GetArmsTopNMetricRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppSource")
    private String appSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuStrategy")
    private String cpuStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private GetArmsTopNMetricRequest(Builder builder) {
        super(builder);
        this.appSource = builder.appSource;
        this.cpuStrategy = builder.cpuStrategy;
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.orderBy = builder.orderBy;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetArmsTopNMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appSource
     */
    public String getAppSource() {
        return this.appSource;
    }

    /**
     * @return cpuStrategy
     */
    public String getCpuStrategy() {
        return this.cpuStrategy;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetArmsTopNMetricRequest, Builder> {
        private String appSource; 
        private String cpuStrategy; 
        private Long endTime; 
        private Long limit; 
        private String orderBy; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetArmsTopNMetricRequest request) {
            super(request);
            this.appSource = request.appSource;
            this.cpuStrategy = request.cpuStrategy;
            this.endTime = request.endTime;
            this.limit = request.limit;
            this.orderBy = request.orderBy;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * The SAE application type. Valid values:
         * <p>
         * 
         * *   **micro_service**
         * *   **web**
         * *   **job**
         */
        public Builder appSource(String appSource) {
            this.putQueryParameter("AppSource", appSource);
            this.appSource = appSource;
            return this;
        }

        /**
         * The CPU allocation policy. Valid values:
         * <p>
         * 
         * *   **request**: CPU cores are allocated only when a request is initiated.
         * *   **always**: Fixed CPU cores are always allocated.
         */
        public Builder cpuStrategy(String cpuStrategy) {
            this.putQueryParameter("CpuStrategy", cpuStrategy);
            this.cpuStrategy = cpuStrategy;
            return this;
        }

        /**
         * The end of the time range to query.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The number of entries to return. Valid values: 0 to 100.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The field based on which you want to sort the returned entries.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The beginning of the time range to query.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetArmsTopNMetricRequest build() {
            return new GetArmsTopNMetricRequest(this);
        } 

    } 

}
