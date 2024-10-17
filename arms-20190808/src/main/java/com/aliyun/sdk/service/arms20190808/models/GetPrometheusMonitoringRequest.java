// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPrometheusMonitoringRequest} extends {@link RequestModel}
 *
 * <p>GetPrometheusMonitoringRequest</p>
 */
public class GetPrometheusMonitoringRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitoringName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String monitoringName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetPrometheusMonitoringRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.monitoringName = builder.monitoringName;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrometheusMonitoringRequest create() {
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
     * @return monitoringName
     */
    public String getMonitoringName() {
        return this.monitoringName;
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

    public static final class Builder extends Request.Builder<GetPrometheusMonitoringRequest, Builder> {
        private String clusterId; 
        private String monitoringName; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetPrometheusMonitoringRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.monitoringName = request.monitoringName;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the Prometheus instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the monitoring configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customJob1</p>
         */
        public Builder monitoringName(String monitoringName) {
            this.putQueryParameter("MonitoringName", monitoringName);
            this.monitoringName = monitoringName;
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

        /**
         * <p>The type of the monitoring configuration. 
         * Valid values for a Prometheus instance for Container Service: serviceMonitor, podMonitor, customJob, and probe. 
         * Valid values for a Prometheus instance for ECS: customJob and probe.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customJob</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetPrometheusMonitoringRequest build() {
            return new GetPrometheusMonitoringRequest(this);
        } 

    } 

}
