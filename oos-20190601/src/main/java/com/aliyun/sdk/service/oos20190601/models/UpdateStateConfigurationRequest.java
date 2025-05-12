// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
    private java.util.Map<String, ?> parameters;

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
    private java.util.Map<String, ?> tags;

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
    public java.util.Map<String, ?> getParameters() {
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
    public java.util.Map<String, ?> getTags() {
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
        private java.util.Map<String, ?> parameters; 
        private String regionId; 
        private String resourceGroupId; 
        private String scheduleExpression; 
        private String scheduleType; 
        private String stateConfigurationId; 
        private java.util.Map<String, ?> tags; 
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DASKJJLKADS-AHKLJHJSAKL-AJK</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The configuration mode. Valid values: ApplyOnce: The configuration is applied only once. After a configuration is updated, the new configuration is applied. ApplyAndMonitor: The configuration is applied only once. After the configuration is applied, the system only checks whether the configuration is migrated in the future. ApplyAndAutoCorrect: The configuration is always applied.</p>
         * 
         * <strong>example:</strong>
         * <p>ApplyOnce</p>
         */
        public Builder configureMode(String configureMode) {
            this.putQueryParameter("ConfigureMode", configureMode);
            this.configureMode = configureMode;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS-ECS-InventoryDataCollection</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;policy&quot;: { &quot;ACS:Application&quot;: { &quot;Collection&quot;: &quot;Enabled&quot; }, &quot;ACS:Network&quot;: { &quot;Collection&quot;: &quot;Enabled&quot; } } }</p>
         */
        public Builder parameters(java.util.Map<String, ?> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The schedule expression.</p>
         * 
         * <strong>example:</strong>
         * <p>1 hour</p>
         */
        public Builder scheduleExpression(String scheduleExpression) {
            this.putQueryParameter("ScheduleExpression", scheduleExpression);
            this.scheduleExpression = scheduleExpression;
            return this;
        }

        /**
         * <p>The schedule type.</p>
         * 
         * <strong>example:</strong>
         * <p>rate</p>
         */
        public Builder scheduleType(String scheduleType) {
            this.putQueryParameter("ScheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * <p>The ID of the desired-state configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sc-asfgdhj12345</p>
         */
        public Builder stateConfigurationId(String stateConfigurationId) {
            this.putQueryParameter("StateConfigurationId", stateConfigurationId);
            this.stateConfigurationId = stateConfigurationId;
            return this;
        }

        /**
         * <p>The tags to be added to the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Key&quot;: &quot;oos&quot;, &quot;Value&quot;: &quot;sc&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The resources to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;Filters&quot;: [ { &quot;Type&quot;: &quot;All&quot;, &quot;RegionId&quot;: &quot;cn-hangzhou&quot;, &quot;Parameters&quot;: { &quot;RegionId&quot;: &quot;cn-hangzhou&quot;, &quot;Status&quot;: &quot;Running&quot; } } ] }</p>
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
