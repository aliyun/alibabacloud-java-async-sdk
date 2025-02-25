// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccfa5e34a5c1f4ce6b916a40a12151d88</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>kube_pod_container_status_ready</p>
         */
        public Builder dropMetric(String dropMetric) {
            this.putQueryParameter("DropMetric", dropMetric);
            this.dropMetric = dropMetric;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
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
        public EnableMetricRequest build() {
            return new EnableMetricRequest(this);
        } 

    } 

}
