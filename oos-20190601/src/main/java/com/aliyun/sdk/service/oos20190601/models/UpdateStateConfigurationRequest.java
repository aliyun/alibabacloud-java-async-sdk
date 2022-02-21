// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStateConfigurationRequest} extends {@link RequestModel}
 *
 * <p>UpdateStateConfigurationRequest</p>
 */
public class UpdateStateConfigurationRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ConfigureMode")
    private String configureMode;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ScheduleExpression")
    private String scheduleExpression;

    @Query
    @NameInMap("ScheduleType")
    private String scheduleType;

    @Query
    @NameInMap("StateConfigurationId")
    @Validation(required = true)
    private String stateConfigurationId;

    @Query
    @NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @Query
    @NameInMap("Targets")
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

        private Builder(UpdateStateConfigurationRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.configureMode = response.configureMode;
            this.description = response.description;
            this.parameters = response.parameters;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.scheduleExpression = response.scheduleExpression;
            this.scheduleType = response.scheduleType;
            this.stateConfigurationId = response.stateConfigurationId;
            this.tags = response.tags;
            this.targets = response.targets;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ConfigureMode.
         */
        public Builder configureMode(String configureMode) {
            this.putQueryParameter("ConfigureMode", configureMode);
            this.configureMode = configureMode;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ScheduleExpression.
         */
        public Builder scheduleExpression(String scheduleExpression) {
            this.putQueryParameter("ScheduleExpression", scheduleExpression);
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * ScheduleType.
         */
        public Builder scheduleType(String scheduleType) {
            this.putQueryParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * StateConfigurationId.
         */
        public Builder stateConfigurationId(String stateConfigurationId) {
            this.putQueryParameter("StateConfigurationId", stateConfigurationId);
            this.stateConfigurationId = stateConfigurationId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Targets.
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
