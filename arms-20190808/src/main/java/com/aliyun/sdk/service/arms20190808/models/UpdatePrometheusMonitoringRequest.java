// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrometheusMonitoringRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusMonitoringRequest</p>
 */
public class UpdatePrometheusMonitoringRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("ConfigYaml")
    @Validation(required = true)
    private String configYaml;

    @Query
    @NameInMap("MonitoringName")
    @Validation(required = true)
    private String monitoringName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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
         * The ID of the Prometheus instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The monitoring configuration. Specify a YAML string.
         */
        public Builder configYaml(String configYaml) {
            this.putBodyParameter("ConfigYaml", configYaml);
            this.configYaml = configYaml;
            return this;
        }

        /**
         * The name of the monitoring configuration.
         */
        public Builder monitoringName(String monitoringName) {
            this.putQueryParameter("MonitoringName", monitoringName);
            this.monitoringName = monitoringName;
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
         * The type of the monitoring configuration. Valid values for a Prometheus instance for Container Service: ServiceMonitor, PodMonitor, CustomJob, and Probe. Valid values for a Prometheus instance for ECS: CustomJob and Probe.
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
