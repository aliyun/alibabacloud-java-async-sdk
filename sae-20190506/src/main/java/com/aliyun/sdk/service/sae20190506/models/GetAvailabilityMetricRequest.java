// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAvailabilityMetricRequest} extends {@link RequestModel}
 *
 * <p>GetAvailabilityMetricRequest</p>
 */
public class GetAvailabilityMetricRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppSource")
    private String appSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuStrategy")
    private String cpuStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetAvailabilityMetricRequest(Builder builder) {
        super(builder);
        this.appSource = builder.appSource;
        this.cpuStrategy = builder.cpuStrategy;
        this.limit = builder.limit;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvailabilityMetricRequest create() {
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
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetAvailabilityMetricRequest, Builder> {
        private String appSource; 
        private String cpuStrategy; 
        private Long limit; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAvailabilityMetricRequest request) {
            super(request);
            this.appSource = request.appSource;
            this.cpuStrategy = request.cpuStrategy;
            this.limit = request.limit;
            this.regionId = request.regionId;
        } 

        /**
         * AppSource.
         */
        public Builder appSource(String appSource) {
            this.putQueryParameter("AppSource", appSource);
            this.appSource = appSource;
            return this;
        }

        /**
         * CpuStrategy.
         */
        public Builder cpuStrategy(String cpuStrategy) {
            this.putQueryParameter("CpuStrategy", cpuStrategy);
            this.cpuStrategy = cpuStrategy;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
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

        @Override
        public GetAvailabilityMetricRequest build() {
            return new GetAvailabilityMetricRequest(this);
        } 

    } 

}
