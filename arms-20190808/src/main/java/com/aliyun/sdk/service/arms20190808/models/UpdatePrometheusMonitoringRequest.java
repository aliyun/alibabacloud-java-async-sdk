// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdatePrometheusMonitoringRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusMonitoringRequest</p>
 */
public class UpdatePrometheusMonitoringRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigYaml")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configYaml;

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

    private UpdatePrometheusMonitoringRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.configYaml = builder.configYaml;
        this.monitoringName = builder.monitoringName;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusMonitoringRequest create() {
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
     * @return configYaml
     */
    public String getConfigYaml() {
        return this.configYaml;
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

    public static final class Builder extends Request.Builder<UpdatePrometheusMonitoringRequest, Builder> {
        private String clusterId; 
        private String configYaml; 
        private String monitoringName; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrometheusMonitoringRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.configYaml = request.configYaml;
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
         * <p>The monitoring configuration. The value is a YAML string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: monitoring.coreos.com/v1
         * kind: ServiceMonitor
         * metadata:
         *   name: tomcat-demo
         *   namespace: default
         * spec:
         *   endpoints:
         *     - interval: 30s
         *       path: /metrics
         *       port: tomcat-monitor
         *   namespaceSelector:
         *     any: true
         *   selector:
         *     matchLabels:
         *       app: tomcat</p>
         */
        public Builder configYaml(String configYaml) {
            this.putBodyParameter("ConfigYaml", configYaml);
            this.configYaml = configYaml;
            return this;
        }

        /**
         * <p>The name of the monitoring configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>podMonitor1</p>
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
         * <p>podMonitor</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdatePrometheusMonitoringRequest build() {
            return new UpdatePrometheusMonitoringRequest(this);
        } 

    } 

}
