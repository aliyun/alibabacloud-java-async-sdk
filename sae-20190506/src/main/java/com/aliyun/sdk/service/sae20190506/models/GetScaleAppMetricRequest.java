// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetScaleAppMetricRequest} extends {@link RequestModel}
 *
 * <p>GetScaleAppMetricRequest</p>
 */
public class GetScaleAppMetricRequest extends Request {
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
         * <p>The SAE application type. Valid values:</p>
         * <ul>
         * <li><strong>micro_service</strong></li>
         * <li><strong>web</strong></li>
         * <li><strong>job</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>micro_service</p>
         */
        public Builder appSource(String appSource) {
            this.putQueryParameter("AppSource", appSource);
            this.appSource = appSource;
            return this;
        }

        /**
         * <p>The CPU allocation policy. Valid values:</p>
         * <ul>
         * <li><strong>request</strong>: CPU cores are allocated only when a request is initiated.</li>
         * <li><strong>always</strong>: Fixed CPU cores are always allocated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>always</p>
         */
        public Builder cpuStrategy(String cpuStrategy) {
            this.putQueryParameter("CpuStrategy", cpuStrategy);
            this.cpuStrategy = cpuStrategy;
            return this;
        }

        /**
         * <p>The number of entries to return. Valid values: 0 to 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
