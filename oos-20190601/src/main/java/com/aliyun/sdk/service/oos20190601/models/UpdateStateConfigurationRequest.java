// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStateConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateStateConfigurationRequest</p>
 */
public class UpdateStateConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigureMode")
    private String configureMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleExpression")
    private String scheduleExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleType")
    private String scheduleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StateConfigurationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stateConfigurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    private String targets;

    private UpdateStateConfigurationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configureMode = builder.configureMode;
        this.description = builder.description;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.scheduleExpression = builder.scheduleExpression;
        this.scheduleType = builder.scheduleType;
        this.stateConfigurationId = builder.stateConfigurationId;
        this.tags = builder.tags;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStateConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configureMode
     */
    public String getConfigureMode() {
        return this.configureMode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return scheduleExpression
     */
    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return stateConfigurationId
     */
    public String getStateConfigurationId() {
        return this.stateConfigurationId;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return targets
     */
    public String getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<UpdateStateConfigurationRequest, Builder> {
        private String clientToken; 
        private String configureMode; 
        private String description; 
        private java.util.Map < String, ? > parameters; 
        private String regionId; 
        private String resourceGroupId; 
        private String scheduleExpression; 
        private String scheduleType; 
        private String stateConfigurationId; 
        private java.util.Map < String, ? > tags; 
        private String targets; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStateConfigurationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configureMode = request.configureMode;
            this.description = request.description;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.scheduleExpression = request.scheduleExpression;
            this.scheduleType = request.scheduleType;
            this.stateConfigurationId = request.stateConfigurationId;
            this.tags = request.tags;
            this.targets = request.targets;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The configuration mode. Valid values: ApplyOnce: The configuration is applied only once. After a configuration is updated, the new configuration is applied. ApplyAndMonitor: The configuration is applied only once. After the configuration is applied, the system only checks whether the configuration is migrated in the future. ApplyAndAutoCorrect: The configuration is always applied.
         */
        public Builder configureMode(String configureMode) {
            this.putQueryParameter("ConfigureMode", configureMode);
            this.configureMode = configureMode;
            return this;
        }

        /**
         * The description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
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
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The schedule expression.
         */
        public Builder scheduleExpression(String scheduleExpression) {
            this.putQueryParameter("ScheduleExpression", scheduleExpression);
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * The schedule type.
         */
        public Builder scheduleType(String scheduleType) {
            this.putQueryParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * The ID of the desired-state configuration.
         */
        public Builder stateConfigurationId(String stateConfigurationId) {
            this.putQueryParameter("StateConfigurationId", stateConfigurationId);
            this.stateConfigurationId = stateConfigurationId;
            return this;
        }

        /**
         * The tags to be added to the configuration.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * The resources to be queried.
         */
        public Builder targets(String targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        @Override
        public UpdateStateConfigurationRequest build() {
            return new UpdateStateConfigurationRequest(this);
        } 

    } 

}
