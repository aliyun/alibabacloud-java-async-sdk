// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusMonitoringRequest} extends {@link RequestModel}
 *
 * <p>ListPrometheusMonitoringRequest</p>
 */
public class ListPrometheusMonitoringRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ListPrometheusMonitoringRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusMonitoringRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListPrometheusMonitoringRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListPrometheusMonitoringRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * The ID of the Prometheus instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The region ID. Default value: `cn-hangzhou`.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the monitoring configuration. Valid values for a Prometheus instance for Container Service: serviceMonitor, podMonitor, customJob, and probe. Valid values for a Prometheus instance for ECS: customJob and probe.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListPrometheusMonitoringRequest build() {
            return new ListPrometheusMonitoringRequest(this);
        } 

    } 

}
