// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStackGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateStackGroupRequest</p>
 */
public class CreateStackGroupRequest extends Request {
    @Query
    @NameInMap("AdministrationRoleName")
    private String administrationRoleName;

    @Query
    @NameInMap("AutoDeployment")
    private AutoDeployment autoDeployment;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ExecutionRoleName")
    private String executionRoleName;

    @Query
    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @Query
    @NameInMap("PermissionModel")
    private String permissionModel;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("StackGroupName")
    @Validation(required = true)
    private String stackGroupName;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("TemplateBody")
    private String templateBody;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private CreateStackGroupRequest(Builder builder) {
        super(builder);
        this.administrationRoleName = builder.administrationRoleName;
        this.autoDeployment = builder.autoDeployment;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.executionRoleName = builder.executionRoleName;
        this.parameters = builder.parameters;
        this.permissionModel = builder.permissionModel;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.stackGroupName = builder.stackGroupName;
        this.tags = builder.tags;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStackGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return administrationRoleName
     */
    public String getAdministrationRoleName() {
        return this.administrationRoleName;
    }

    /**
     * @return autoDeployment
     */
    public AutoDeployment getAutoDeployment() {
        return this.autoDeployment;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return executionRoleName
     */
    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return permissionModel
     */
    public String getPermissionModel() {
        return this.permissionModel;
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
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<CreateStackGroupRequest, Builder> {
        private String administrationRoleName; 
        private AutoDeployment autoDeployment; 
        private String clientToken; 
        private String description; 
        private String executionRoleName; 
        private java.util.List < Parameters> parameters; 
        private String permissionModel; 
        private String regionId; 
        private String resourceGroupId; 
        private String stackGroupName; 
        private java.util.List < Tags> tags; 
        private String templateBody; 
        private String templateId; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateStackGroupRequest request) {
            super(request);
            this.administrationRoleName = request.administrationRoleName;
            this.autoDeployment = request.autoDeployment;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.executionRoleName = request.executionRoleName;
            this.parameters = request.parameters;
            this.permissionModel = request.permissionModel;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.stackGroupName = request.stackGroupName;
            this.tags = request.tags;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * AdministrationRoleName.
         */
        public Builder administrationRoleName(String administrationRoleName) {
            this.putQueryParameter("AdministrationRoleName", administrationRoleName);
            this.administrationRoleName = administrationRoleName;
            return this;
        }

        /**
         * AutoDeployment.
         */
        public Builder autoDeployment(AutoDeployment autoDeployment) {
            String autoDeploymentShrink = shrink(autoDeployment, "AutoDeployment", "json");
            this.putQueryParameter("AutoDeployment", autoDeploymentShrink);
            this.autoDeployment = autoDeployment;
            return this;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ExecutionRoleName.
         */
        public Builder executionRoleName(String executionRoleName) {
            this.putQueryParameter("ExecutionRoleName", executionRoleName);
            this.executionRoleName = executionRoleName;
            return this;
        }

        /**
         * test
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * PermissionModel.
         */
        public Builder permissionModel(String permissionModel) {
            this.putQueryParameter("PermissionModel", permissionModel);
            this.permissionModel = permissionModel;
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
         * StackGroupName.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * TemplateBody.
         */
        public Builder templateBody(String templateBody) {
            this.putQueryParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateURL.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
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
        public CreateStackGroupRequest build() {
            return new CreateStackGroupRequest(this);
        } 

    } 

    public static class AutoDeployment extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("RetainStacksOnAccountRemoval")
        private Boolean retainStacksOnAccountRemoval;

        private AutoDeployment(Builder builder) {
            this.enabled = builder.enabled;
            this.retainStacksOnAccountRemoval = builder.retainStacksOnAccountRemoval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoDeployment create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return retainStacksOnAccountRemoval
         */
        public Boolean getRetainStacksOnAccountRemoval() {
            return this.retainStacksOnAccountRemoval;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Boolean retainStacksOnAccountRemoval; 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * RetainStacksOnAccountRemoval.
             */
            public Builder retainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
                this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
                return this;
            }

            public AutoDeployment build() {
                return new AutoDeployment(this);
            } 

        } 

    }
    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        private String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * ParameterValue.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
