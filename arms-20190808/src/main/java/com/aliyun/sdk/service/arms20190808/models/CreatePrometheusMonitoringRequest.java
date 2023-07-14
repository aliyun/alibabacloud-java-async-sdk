// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrometheusMonitoringRequest} extends {@link RequestModel}
 *
 * <p>CreatePrometheusMonitoringRequest</p>
 */
public class CreatePrometheusMonitoringRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Body
    @NameInMap("ConfigYaml")
    @Validation(required = true)
    private String configYaml;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreatePrometheusMonitoringRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.configYaml = builder.configYaml;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrometheusMonitoringRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreatePrometheusMonitoringRequest, Builder> {
        private String clusterId; 
        private String configYaml; 
        private String regionId; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrometheusMonitoringRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.configYaml = request.configYaml;
            this.regionId = request.regionId;
            this.status = request.status;
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
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The status of the monitoring configuration. Valid values: run and stop. 
         * <p>
         * When not transmitted, the default value: run.
         * Probe does not support status, this field set empty.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of the monitoring configuration. 
         * <p>
         * Valid values for a Prometheus instance for Container Service: ServiceMonitor, PodMonitor, CustomJob, and Probe. 
         * Valid values for a Prometheus instance for ECS: CustomJob and Probe.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreatePrometheusMonitoringRequest build() {
            return new CreatePrometheusMonitoringRequest(this);
        } 

    } 

}
