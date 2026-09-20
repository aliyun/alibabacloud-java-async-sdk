// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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
        this.description = builder.description;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
        private String description; 
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
            this.description = request.description;
            this.environment = request.environment;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The engine configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The content of the engine configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder configValue(String configValue) {
            this.putBodyParameter("ConfigValue", configValue);
            this.configValue = configValue;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The environment. Valid values:</p>
         * <ul>
         * <li><p>Daily: The daily environment.</p>
         * </li>
         * <li><p>Pre: The pre-release environment.</p>
         * </li>
         * <li><p>Prod: The production environment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Pre</p>
         */
        public Builder environment(String environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>The instance ID. To obtain an instance ID, see <a href="https://help.aliyun.com/document_detail/2411819.html">ListInstances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-********</p>
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
