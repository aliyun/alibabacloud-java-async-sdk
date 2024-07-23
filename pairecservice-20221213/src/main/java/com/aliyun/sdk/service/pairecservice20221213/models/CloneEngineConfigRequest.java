// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneEngineConfigRequest} extends {@link RequestModel}
 *
 * <p>CloneEngineConfigRequest</p>
 */
public class CloneEngineConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("EngineConfigId")
    private String engineConfigId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private CloneEngineConfigRequest(Builder builder) {
        super(builder);
        this.engineConfigId = builder.engineConfigId;
        this.regionId = builder.regionId;
        this.configValue = builder.configValue;
        this.environment = builder.environment;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneEngineConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engineConfigId
     */
    public String getEngineConfigId() {
        return this.engineConfigId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CloneEngineConfigRequest, Builder> {
        private String engineConfigId; 
        private String regionId; 
        private String configValue; 
        private String environment; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CloneEngineConfigRequest request) {
            super(request);
            this.engineConfigId = request.engineConfigId;
            this.regionId = request.regionId;
            this.configValue = request.configValue;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
        } 

        /**
         * EngineConfigId.
         */
        public Builder engineConfigId(String engineConfigId) {
            this.putPathParameter("EngineConfigId", engineConfigId);
            this.engineConfigId = engineConfigId;
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

        /**
         * ConfigValue.
         */
        public Builder configValue(String configValue) {
            this.putBodyParameter("ConfigValue", configValue);
            this.configValue = configValue;
            return this;
        }

        /**
         * Environment.
         */
        public Builder environment(String environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CloneEngineConfigRequest build() {
            return new CloneEngineConfigRequest(this);
        } 

    } 

}
