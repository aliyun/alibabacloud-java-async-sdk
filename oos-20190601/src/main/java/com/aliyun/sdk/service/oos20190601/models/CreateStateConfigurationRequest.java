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

        private Builder(CreateStateConfigurationRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.configureMode = response.configureMode;
            this.description = response.description;
            this.parameters = response.parameters;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.scheduleExpression = response.scheduleExpression;
            this.scheduleType = response.scheduleType;
            this.tags = response.tags;
            this.targets = response.targets;
            this.templateName = response.templateName;
            this.templateVersion = response.templateVersion;
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
        public Builder parameters(String parameters) {
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

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateVersion.
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
