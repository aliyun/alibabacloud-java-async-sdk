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

    private ModifyHealthCheckConfigRequest(Builder builder) {
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

    public static ModifyHealthCheckConfigRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyHealthCheckConfigRequest, Builder> {
        private String regionId; 
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String healthCheck; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHealthCheckConfigRequest request) {
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
         * The forwarding protocol. Valid values:
         * <p>
         * 
         * *   **tcp**
         * *   **udp**
         */
        public Builder forwardProtocol(String forwardProtocol) {
            this.putQueryParameter("ForwardProtocol", forwardProtocol);
            this.forwardProtocol = forwardProtocol;
            return this;
        }

        /**
         * The forwarding port.
         */
        public Builder frontendPort(Integer frontendPort) {
            this.putQueryParameter("FrontendPort", frontendPort);
            this.frontendPort = frontendPort;
            return this;
        }

        /**
         * The details of the health check configuration. This parameter is a JSON string. The string contains the following fields:
         * <p>
         * 
         * *   **Type**: the protocol type. This field is required and must be of the STRING type. Valid values: **tcp** (Layer 4) and **http** (Layer 7).
         * 
         * *   **Domain**: the domain name, which must be of the STRING type.
         * 
         *     **
         * 
         *     **Note**This parameter is returned only when the Layer 7 health check configuration is queried.
         * 
         * *   **Uri**: the check path, which must be of the STRING type.
         * 
         *     **
         * 
         *     **Note**This parameter is returned only when the Layer 7 health check configuration is queried.
         * 
         * *   **Timeout**: the response timeout period, which must be of the INTEGER type. Valid values: **1** to **30**. Unit: seconds.
         * 
         * *   **Port**: the port on which you want to perform the health check, which must be of the INTEGER type.
         * 
         * *   **Interval**: the health check interval, which must be of the INTEGER type. Valid values: **1** to **30**. Unit: seconds.
         * 
         * *   **Up**: the number of consecutive successful health checks that must occur before declaring a port healthy, which must be of the INTEGER type. Valid values: **1** to **10**.
         * 
         * *   **Down**: the number of consecutive failed health checks that must occur before declaring a port unhealthy, which must be of the INTEGER type. Valid values: **1** to **10**.
         */
        public Builder healthCheck(String healthCheck) {
            this.putQueryParameter("HealthCheck", healthCheck);
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ModifyHealthCheckConfigRequest build() {
            return new ModifyHealthCheckConfigRequest(this);
        } 

    } 

}
