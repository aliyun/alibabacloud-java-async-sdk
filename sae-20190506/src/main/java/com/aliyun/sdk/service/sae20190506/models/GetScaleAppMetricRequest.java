// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScaleAppMetricRequest} extends {@link RequestModel}
 *
 * <p>GetScaleAppMetricRequest</p>
 */
public class GetScaleAppMetricRequest extends Request {
    @Query
    @NameInMap("AppSource")
    private String appSource;

    @Query
    @NameInMap("CpuStrategy")
    private String cpuStrategy;

    @Query
    @NameInMap("Limit")
    @Validation(required = true)
    private Long limit;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetScaleAppMetricRequest(Builder builder) {
        super(builder);
        this.appSource = builder.appSource;
        this.cpuStrategy = builder.cpuStrategy;
        this.limit = builder.limit;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScaleAppMetricRequest create() {
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

    public static final class Builder extends Request.Builder<GetScaleAppMetricRequest, Builder> {
        private String appSource; 
        private String cpuStrategy; 
        private Long limit; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetScaleAppMetricRequest request) {
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
        public GetScaleAppMetricRequest build() {
            return new GetScaleAppMetricRequest(this);
        } 

    } 

}
