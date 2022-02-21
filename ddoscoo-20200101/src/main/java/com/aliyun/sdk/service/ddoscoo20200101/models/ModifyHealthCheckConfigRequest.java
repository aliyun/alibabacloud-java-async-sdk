// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHealthCheckConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyHealthCheckConfigRequest</p>
 */
public class ModifyHealthCheckConfigRequest extends Request {
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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyHealthCheckConfigRequest(Builder builder) {
        super(builder);
        this.forwardProtocol = builder.forwardProtocol;
        this.frontendPort = builder.frontendPort;
        this.healthCheck = builder.healthCheck;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHealthCheckConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyHealthCheckConfigRequest, Builder> {
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String healthCheck; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHealthCheckConfigRequest response) {
            super(response);
            this.forwardProtocol = response.forwardProtocol;
            this.frontendPort = response.frontendPort;
            this.healthCheck = response.healthCheck;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyHealthCheckConfigRequest build() {
            return new ModifyHealthCheckConfigRequest(this);
        } 

    } 

}
