// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigHealthCheckRequest} extends {@link RequestModel}
 *
 * <p>ConfigHealthCheckRequest</p>
 */
public class ConfigHealthCheckRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ForwardProtocol")
    @Validation(required = true)
    private String forwardProtocol;

    @Query
    @NameInMap("FrontendPort")
    @Validation(required = true)
    private Integer frontendPort;

    @Query
    @NameInMap("HealthCheck")
    @Validation(required = true)
    private String healthCheck;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ConfigHealthCheckRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.forwardProtocol = builder.forwardProtocol;
        this.frontendPort = builder.frontendPort;
        this.healthCheck = builder.healthCheck;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigHealthCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return forwardProtocol
     */
    public String getForwardProtocol() {
        return this.forwardProtocol;
    }

    /**
     * @return frontendPort
     */
    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * @return healthCheck
     */
    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ConfigHealthCheckRequest, Builder> {
        private String regionId; 
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String healthCheck; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigHealthCheckRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.forwardProtocol = request.forwardProtocol;
            this.frontendPort = request.frontendPort;
            this.healthCheck = request.healthCheck;
            this.instanceId = request.instanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ForwardProtocol.
         */
        public Builder forwardProtocol(String forwardProtocol) {
            this.putQueryParameter("ForwardProtocol", forwardProtocol);
            this.forwardProtocol = forwardProtocol;
            return this;
        }

        /**
         * FrontendPort.
         */
        public Builder frontendPort(Integer frontendPort) {
            this.putQueryParameter("FrontendPort", frontendPort);
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * HealthCheck.
         */
        public Builder healthCheck(String healthCheck) {
            this.putQueryParameter("HealthCheck", healthCheck);
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ConfigHealthCheckRequest build() {
            return new ConfigHealthCheckRequest(this);
        } 

    } 

}
