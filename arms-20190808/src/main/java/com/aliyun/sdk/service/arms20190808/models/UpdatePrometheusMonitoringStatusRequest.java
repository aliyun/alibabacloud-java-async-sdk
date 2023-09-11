// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrometheusMonitoringStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusMonitoringStatusRequest</p>
 */
public class UpdatePrometheusMonitoringStatusRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("MonitoringName")
    @Validation(required = true)
    private String monitoringName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private UpdatePrometheusMonitoringStatusRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.monitoringName = builder.monitoringName;
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusMonitoringStatusRequest create() {
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

    public static final class Builder extends Request.Builder<UpdatePrometheusMonitoringStatusRequest, Builder> {
        private String clusterId; 
        private String monitoringName; 
        private String regionId; 
        private String status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrometheusMonitoringStatusRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.monitoringName = request.monitoringName;
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
         * The status of the monitoring configuration. Valid values: run and stop.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The type of the monitoring configuration. 
         * <p>
         * Valid values for a Prometheus instance for Container Service: serviceMonitor, podMonitor, and customJob. 
         * Valid value for a Prometheus instance for ECS: customJob. 
         * The status of probe cannot be modified.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdatePrometheusMonitoringStatusRequest build() {
            return new UpdatePrometheusMonitoringStatusRequest(this);
        } 

    } 

}
