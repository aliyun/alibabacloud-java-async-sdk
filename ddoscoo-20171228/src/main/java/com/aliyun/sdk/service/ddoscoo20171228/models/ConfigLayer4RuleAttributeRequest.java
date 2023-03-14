// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigLayer4RuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>ConfigLayer4RuleAttributeRequest</p>
 */
public class ConfigLayer4RuleAttributeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private ConfigLayer4RuleAttributeRequest(Builder builder) {
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

    public static ConfigLayer4RuleAttributeRequest create() {
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

    public static final class Builder extends Request.Builder<ConfigLayer4RuleAttributeRequest, Builder> {
        private String regionId; 
        private String config; 
        private String forwardProtocol; 
        private Integer frontendPort; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigLayer4RuleAttributeRequest request) {
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

        @Override
        public ConfigLayer4RuleAttributeRequest build() {
            return new ConfigLayer4RuleAttributeRequest(this);
        } 

    } 

}
