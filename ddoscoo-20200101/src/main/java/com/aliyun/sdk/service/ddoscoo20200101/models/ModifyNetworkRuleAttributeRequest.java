// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkRuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkRuleAttributeRequest</p>
 */
public class ModifyNetworkRuleAttributeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FrontendPort")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer frontendPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ModifyNetworkRuleAttributeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.forwardProtocol = builder.forwardProtocol;
        this.frontendPort = builder.frontendPort;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNetworkRuleAttributeRequest create() {
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
     * @return config
     */
    public String getConfig() {
        return this.config;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ModifyNetworkRuleAttributeRequest, Builder> {
        private String regionId; 
        private String config; 
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNetworkRuleAttributeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
            this.forwardProtocol = request.forwardProtocol;
            this.frontendPort = request.frontendPort;
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
         * The session persistence settings of the port forwarding rule. This parameter is a JSON string. The string contains the following fields:
         * <p>
         * 
         * *   **PersistenceTimeout**: The timeout period of session persistence. This field is required and must be of the integer type. Valid values: **30** to **3600**. Unit: seconds. Default value: **0**. A value of 0 indicates that session persistence is disabled.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
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
        public ModifyNetworkRuleAttributeRequest build() {
            return new ModifyNetworkRuleAttributeRequest(this);
        } 

    } 

}
