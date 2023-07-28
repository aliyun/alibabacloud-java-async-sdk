// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStateConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateStateConfigurationRequest</p>
 */
public class CreateStateConfigurationRequest extends Request {
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
    private String parameters;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ScheduleExpression")
    @Validation(required = true)
    private String scheduleExpression;

    @Query
    @NameInMap("ScheduleType")
    @Validation(required = true)
    private String scheduleType;

    @Query
    @NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @Query
    @NameInMap("Targets")
    @Validation(required = true)
    private String targets;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private CreateStateConfigurationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configureMode = builder.configureMode;
        this.description = builder.description;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.scheduleExpression = builder.scheduleExpression;
        this.scheduleType = builder.scheduleType;
        this.tags = builder.tags;
        this.targets = builder.targets;
        this.templateName = builder.templateName;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStateConfigurationRequest create() {
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
    public String getParameters() {
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

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<CreateStateConfigurationRequest, Builder> {
        private String clientToken; 
        private String configureMode; 
        private String description; 
        private String parameters; 
        private String regionId; 
        private String resourceGroupId; 
        private String scheduleExpression; 
        private String scheduleType; 
        private java.util.Map < String, ? > tags; 
        private String targets; 
        private String templateName; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateStateConfigurationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configureMode = request.configureMode;
            this.description = request.description;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.scheduleExpression = request.scheduleExpression;
            this.scheduleType = request.scheduleType;
            this.tags = request.tags;
            this.targets = request.targets;
            this.templateName = request.templateName;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * The description of the desired-state configuration.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 收集Inventory数据
         */
        public Builder configureMode(String configureMode) {
            this.putQueryParameter("ConfigureMode", configureMode);
            this.configureMode = configureMode;
            return this;
        }

        /**
         * The configuration mode.
         * <p>
         * 
         * ApplyOnce: The configuration is applied only once. After a configuration is updated, the new configuration is applied.
         * 
         * ApplyAndMonitor: The configuration is applied only once. After the configuration is applied, the system only checks whether the configuration is migrated in the future.
         * 
         * ApplyAndAutoCorrect: The configuration is always applied.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of resource group.
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The ID of the template.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the schedule. Valid value: rate.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The description.
         */
        public Builder scheduleExpression(String scheduleExpression) {
            this.putQueryParameter("ScheduleExpression", scheduleExpression);
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * The schedule expression.
         */
        public Builder scheduleType(String scheduleType) {
            this.putQueryParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * The name of the template. The name must be 1 to 200 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * The schedule expression. The interval between two schedules must be a minimum of 30 minutes.
         */
        public Builder targets(String targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        /**
         * The version of the template.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * The required resources.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public CreateStateConfigurationRequest build() {
            return new CreateStateConfigurationRequest(this);
        } 

    } 

}
