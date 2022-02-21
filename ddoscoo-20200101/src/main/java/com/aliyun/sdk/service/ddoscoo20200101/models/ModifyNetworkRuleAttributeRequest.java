// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkRuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyNetworkRuleAttributeRequest</p>
 */
public class ModifyNetworkRuleAttributeRequest extends Request {
    @Query
    @NameInMap("Config")
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("ForwardProtocol")
    @Validation(required = true)
    private String forwardProtocol;

    @Query
    @NameInMap("FrontendPort")
    @Validation(required = true)
    private Integer frontendPort;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ModifyNetworkRuleAttributeRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.forwardProtocol = builder.forwardProtocol;
        this.frontendPort = builder.frontendPort;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyNetworkRuleAttributeRequest, Builder> {
        private String config; 
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNetworkRuleAttributeRequest response) {
            super(response);
            this.config = response.config;
            this.forwardProtocol = response.forwardProtocol;
            this.frontendPort = response.frontendPort;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
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
        public ModifyNetworkRuleAttributeRequest build() {
            return new ModifyNetworkRuleAttributeRequest(this);
        } 

    } 

}
