// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableMetricRequest} extends {@link RequestModel}
 *
 * <p>EnableMetricRequest</p>
 */
public class EnableMetricRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DropMetric")
    private String dropMetric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private EnableMetricRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dropMetric = builder.dropMetric;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dropMetric
     */
    public String getDropMetric() {
        return this.dropMetric;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<EnableMetricRequest, Builder> {
        private String clusterId; 
        private String dropMetric; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EnableMetricRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.dropMetric = request.dropMetric;
            this.regionId = request.regionId;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Enable metric name.
         */
        public Builder dropMetric(String dropMetric) {
            this.putQueryParameter("DropMetric", dropMetric);
            this.dropMetric = dropMetric;
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

        @Override
        public EnableMetricRequest build() {
            return new EnableMetricRequest(this);
        } 

    } 

}
